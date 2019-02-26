
package SxxMachine;

class pred_savecp_1 extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        Term point = args[0].dref();
        Term cont = args[1].dref();
        if (!point.unify(JpFactory.Long(mach.getCurrentStackItem().getCurrentChoiceTimeStamp())))
            return mach.Fail0;
        args[0] = cont;
        args[1] = null;
        return mach.Call1;
    }

}

class pred_cutto extends Code {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) throws JPrologInternalException {
        Term[] args = mach.getAreg();
        Term point = args[0].dref();
        Term cont = args[1].dref();
        if (!(point instanceof Int))
            throw new JPrologInternalException("Parameter is not a valid stackpoint! " + point);
        int stack = (int) ((Int) point).longValue();
        mach.doCut(stack);
        args[0] = cont;
        args[1] = null;
        return mach.Call1;
    }

}
