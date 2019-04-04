
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;

class pred_savecp_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        final Term point = args[0].dref();
        final Term cont = args[1].dref();
        if (!point.unifyJP(Integer(mach.getCurrentStackItem().getCurrentChoiceTimeStamp())))
            return mach.Fail0;
        mach.setCont(args, 0, cont);
        args[1] = null;
        return mach.getCall1();
    }

}

class pred_cutto extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final Term[] args = mach.getAreg();
        final Term point = args[0].dref();
        final Term cont = args[1].dref();
        if (!(point instanceof NumberTerm))
            throw new JPrologInternalException("Parameter is not a valid stackpoint! " + point);
        final int stack = (int) ((NumberTerm) point).longValue();
        mach.doCut(stack);
        mach.setCont(args, 0, cont);
        args[1] = null;
        return mach.getCall1();
    }

}
