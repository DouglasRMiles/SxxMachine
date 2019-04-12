
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;

class pred_savecp_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        final TermArray local_aregs = mach.getAreg();
        final Term point = local_aregs.getTermDRef(0);
        final Term cont = local_aregs.getTermDRef(1);
        if (!point.unifyJP(Integer(mach.getCurrentStackItem().getCurrentChoiceTimeStamp())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, cont);
        local_aregs.setAV(1,null);
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
        final TermArray local_aregs = mach.getAreg();
        final Term point = local_aregs.getTermDRef(0);
        final Term cont = local_aregs.getTermDRef(1);
        if (!(point instanceof NumberTerm))
            throw new JPrologInternalException("Parameter is not a valid stackpoint! " + point);
        final int stack = (int) ((NumberTerm) point).longValue();
        mach.doCut(stack);
        mach.setCont(local_aregs, 0, cont);
        local_aregs.setAV(1,null);
        return mach.getCall1();
    }

}
