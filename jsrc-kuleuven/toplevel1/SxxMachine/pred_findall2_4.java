
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_findall2_4 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_findall2_4_1();

    static Code cl2 = new pred_findall2_4_2();

    static Code exec2cont;

    static Code retrievefindall3cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("addfindall");

    static String string2 = Const.strIntern("exec");

    static String string3 = Const.strIntern("fail");

    static String string4 = Const.strIntern("findall2");

    static String string5 = Const.strIntern("retrievefindall");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        exec2cont = mach.loadPred("exec", 1);
        retrievefindall3cont = mach.loadPred("retrievefindall", 2);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_findall2_4_1 extends pred_findall2_4 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        if (!((areg3).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = JpFactory.S(string1, var1.dref(), var4.dref(), JpFactory.S(string3, continuation));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return exec2cont;
    }
}

class pred_findall2_4_2 extends pred_findall2_4 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        if (!((areg3).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var3.dref();
        local_aregs[1] = var4.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = null;
        return retrievefindall3cont;
    }
}
