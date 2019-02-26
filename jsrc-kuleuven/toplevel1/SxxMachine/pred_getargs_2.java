
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_getargs_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_getargs_2_1();

    static Code cl2 = new pred_getargs_2_2();

    static Code ap4cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(")");

    static String string2 = Const.strIntern(",");

    static String string3 = Const.strIntern(".");

    static String string4 = Const.strIntern("[]");

    static String string5 = Const.strIntern("ap");

    static String string6 = Const.strIntern("const");

    static String string7 = Const.strIntern("getargs");

    static String string8 = Const.strIntern("maketerm");

    static String string9 = Const.strIntern("unify");

    static Int posint900 = JpFactory.Long(900);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        ap4cont = mach.loadPred("ap", 3);
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

class pred_getargs_2_1 extends pred_getargs_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
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
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory
                .S(string3, JpFactory.S(string6, JpFactory.CONST(string1)), JpFactory.CONST(string4));
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string8, var3.dref(), var4, posint900, JpFactory.S(string9, JpFactory
                .S(string3, var4.dref(), JpFactory.CONST(string4)), var2.dref(), continuation));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_getargs_2_2 extends pred_getargs_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory.S(string3, JpFactory.S(string6, JpFactory.CONST(string2)), var4);
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string8, var3.dref(), var5, posint900, JpFactory
                .S(string9, JpFactory.S(string3, var5.dref(), var6), var2.dref(), JpFactory
                        .S(string7, var4.dref(), var6.dref(), continuation)));
        mach.updateCUTB();
        return ap4cont;
    }
}
