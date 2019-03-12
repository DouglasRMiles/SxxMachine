
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.S;

import SxxMachine.pterm.StructureTerm;

public class pred_catch_3 extends Code {

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        final Term goal = args[0].dref();
        final Term exception = args[1].dref();
        final Term exceptionCode = args[2].dref();
        final Term cont = args[3].dref();
        //Niet van beland om args op te slaan, wel van belang dat er een apart choicepoint is
        mach.createChoicePoint(RunningPrologMachine.NO_ARGS);
        //goal aanpassen voor continuation toe te voegen
        // in dit geval skippen exceptionhandler voor code die volgt
        mach.setPrologExceptionHandler(new CatchExceptionHandler(exception, exceptionCode, cont));
        args[0] = addContinuation(goal, S("endCatch", Integer(mach.getCurrentChoice()), cont));
        args[1] = args[2] = args[3] = null;
        return (Code) (Object) mach.Call1;
    }

    private StructureTerm addContinuation(Term o, Term cont) {
        if (o .isAtomOrObject()) {
            return (StructureTerm) S(o.fname(), cont);
        }
        if (o .isCompound()) {
            final AFunct f = (AFunct) o;
            final StructureTerm newF = new StructureTerm(f.fname(), f.arity() + 1);
            for (int i = 0; i < f.arity(); i++) {
                newF.setarg0(i, f.getPlainArg(i));
            }
            newF.args()[f.arity()] = cont;
            return newF;
        }
        throw new JPrologInternalException("Invalid params");
    }

}

class pred_endCatch_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        final Term choice = args[0].dref();
        final Term cont = args[1].dref();
        if (!(choice instanceof NumberTerm))
            return mach.Fail0;
        final long choicePoint = ((NumberTerm) choice).longValue() - 1;
        //zorgen dat bij exceptionhandler er pas wordt verder gezocht vanaf choicePoint
        mach.setPrologExceptionHandler(new SkipExceptionHandler(choicePoint));
        args[1] = null;
        args[0] = cont;
        return mach.Call1;
    }

}
