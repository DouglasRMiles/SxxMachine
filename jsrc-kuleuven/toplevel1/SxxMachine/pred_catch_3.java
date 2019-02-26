
package SxxMachine;

public class pred_catch_3 extends Code {

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        Term goal = args[0].dref();
        Term exception = args[1].dref();
        Term exceptionCode = args[2].dref();
        Term cont = args[3].dref();
        //Niet van beland om args op te slaan, wel van belang dat er een apart choicepoint is
        mach.createChoicePoint(RunningPrologMachine.NO_ARGS);
        //goal aanpassen voor continuation toe te voegen
        // in dit geval skippen exceptionhandler voor code die volgt
        mach.setPrologExceptionHandler(new CatchExceptionHandler(exception, exceptionCode, cont));
        args[0] = addContinuation(goal, JpFactory.S("endCatch", JpFactory.Long(mach.getCurrentChoice()), cont));
        args[1] = args[2] = args[3] = null;
        return mach.Call1;
    }

    private StructureTerm addContinuation(Term o, Term cont) {
        if (o instanceof Const) {
            return JpFactory.S(o.fname(), cont);
        }
        if (o instanceof AFunct) {
            AFunct f = (AFunct) o;
            StructureTerm newF = new StructureTerm(f.fname(), f.arity() + 1);
            for (int i = 0; i < f.arity(); i++) {
                newF.args()[i] = f.args()[i];
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
        Term[] args = mach.getAreg();
        Term choice = args[0].dref();
        Term cont = args[1].dref();
        if (!(choice instanceof Int))
            return mach.Fail0;
        long choicePoint = ((Int) choice).longValue() - 1;
        //zorgen dat bij exceptionhandler er pas wordt verder gezocht vanaf choicePoint
        mach.setPrologExceptionHandler(new SkipExceptionHandler(choicePoint));
        args[1] = null;
        args[0] = cont;
        return mach.Call1;
    }

}
