
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import SxxMachine.pterm.StructureTerm;

public class pred_catch_3 extends Code {

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final TermArray local_aregs = mach.getAreg();
        final Term goal = local_aregs.getTermDRef(0);
        final Term exception = local_aregs.getTermDRef(1);
        final Term exceptionCode = local_aregs.getTermDRef(2);
        final Term cont = local_aregs.getTermDRef(3);
        //Niet van beland om args op te slaan, wel van belang dat er een apart choicepoint is
        mach.createChoicePoint(RunningPrologMachine.NO_ARGS);
        //goal aanpassen voor continuation toe te voegen
        // in dit geval skippen exceptionhandler voor code die volgt
        mach.setPrologExceptionHandler(new CatchExceptionHandler(exception, exceptionCode, cont));
        mach.setCont(local_aregs, 0, addContinuation(mach, goal, S("endCatch", Integer(mach
                .getCurrentChoice()), cont)));
        local_aregs.setAreg1((local_aregs.setAreg2((local_aregs.setAreg3((null))))));
        return mach.getCall1();
    }

    private StructureTerm addContinuation(PrologMachine mach, Term o, Term cont) {
        if (o.isAtomOrObject()) {
            return (StructureTerm) S(o.fname(), cont);
        }
        if (o.isCompound()) {
            final AFunct f = (AFunct) o;
            final StructureTerm newF = new StructureTerm(f.fname(), f.arity() + 1);
            for (int i = 0; i < f.arity(); i++) {
                newF.setarg0(i, f.getPlainArg(i));
            }
            mach.setCont(TermArray.newTermArray(newF.args()), f.arity(), cont);
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
        final TermArray local_aregs = mach.getAreg();
        final Term choice = local_aregs.getTermDRef(0);
        final Term cont = local_aregs.getTermDRef(1);
        if (!(choice instanceof NumberTerm))
            return mach.Fail0;
        final long choicePoint = choice.longValue() - 1;
        //zorgen dat bij exceptionhandler er pas wordt verder gezocht vanaf choicePoint
        mach.setPrologExceptionHandler(new SkipExceptionHandler(choicePoint));
        local_aregs.setAreg1((null));
        mach.setCont(local_aregs, 0, cont);
        return mach.getCall1();
    }

}
