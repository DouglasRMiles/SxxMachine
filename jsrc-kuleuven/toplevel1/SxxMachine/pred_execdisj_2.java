
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_execdisj_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_execdisj_2_1();

    static Code cl2 = new pred_execdisj_2_2();

    static Code cl3 = new pred_execdisj_2_3();

    static Code cl4 = new pred_execdisj_2_4();

    static Code cut2cont;

    static Code exec2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("->");

    static String string2 = Const.strIntern("cut");

    static String string3 = Const.strIntern("exec");

    static String string4 = Const.strIntern("execdisj");

    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        exec2cont = mach.loadPred("exec", 1);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_execdisj_2_1 extends pred_execdisj_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory
                .S(string0, new HeapChoice(mach.getCUTB()), JpFactory.S(string3, var2.dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return exec2cont;
    }
}

class pred_execdisj_2_2 extends pred_execdisj_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string3, var3.dref(), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_execdisj_2_3 extends pred_execdisj_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return exec2cont;
    }
}

class pred_execdisj_2_4 extends pred_execdisj_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return exec2cont;
    }
}
