
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_collectvars_3 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_collectvars_3_1();

    static Code cl2 = new pred_collectvars_3_2();

    static Code cl3 = new pred_collectvars_3_3();

    static Code cut2cont;

    static Code noteq3cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(".");

    static String string2 = Const.strIntern("=");

    static String string3 = Const.strIntern("[]");

    static String string4 = Const.strIntern("_");

    static String string5 = Const.strIntern("collectvars");

    static String string6 = Const.strIntern("cut");

    static String string7 = Const.strIntern("noteq");

    static String string8 = Const.strIntern("notvmember");

    static String string9 = Const.strIntern("var");

    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        noteq3cont = mach.loadPred("noteq", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        ;
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_collectvars_3_1 extends pred_collectvars_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string3))))
            return mach.Fail0;
        if (!((areg1).unify(var1)))
            return mach.Fail0;
        if (!((areg2).unify(var1.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_collectvars_3_2 extends pred_collectvars_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, JpFactory.S(string9, var1, var2, var3), var4))))
            return mach.Fail0;
        if (!((areg1).unify(var5)))
            return mach.Fail0;
        if (!((areg2).unify(var6)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = JpFactory.CONST(string4);
        local_aregs[2] = JpFactory.S(string8, var2.dref(), var5.dref(), JpFactory
                .S(string0, new HeapChoice(mach.getCUTB()), JpFactory.S(string5, var4.dref(), JpFactory
                        .S(string1, JpFactory.S(string2, var1.dref(), var2.dref()), var5.dref()), var6
                                .dref(), continuation)));
        mach.updateCUTB();
        local_aregs[3] = null;
        return noteq3cont;
    }
}

class pred_collectvars_3_3 extends pred_collectvars_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = var4.dref();
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
