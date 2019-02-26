
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_max_3 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_max_3_1();

    static Code cl2 = new pred_max_3_2();

    static Code cl3 = new pred_max_3_3();

    static Code smallerthan3cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("call");

    static String string2 = Const.strIntern("max");

    static String string3 = Const.strIntern("smallerthan");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        smallerthan3cont = mach.loadPred("smallerthan", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_max_3_1 extends pred_max_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        local_aregs[3] = null;
        return smallerthan3cont;
    }
}

class pred_max_3_2 extends pred_max_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var1.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        local_aregs[3] = null;
        return smallerthan3cont;
    }
}

class pred_max_3_3 extends pred_max_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
