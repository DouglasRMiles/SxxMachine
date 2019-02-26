
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_maketerm_3 extends Code {

    static Code entry_code;

    final static Code cl1 = new pred_maketerm_3_1();

    final static Code cl2 = new pred_maketerm_3_2();

    final static Code cl3 = new pred_maketerm_3_3();

    final static Code cl3b = new pred_maketerm_3_3b();

    final static Code cl4 = new pred_maketerm_3_4();

    //  static Code cl5 = new pred_maketerm_3_5();
    //
    //  static Code cl6 = new pred_maketerm_3_6();
    //
    //  static Code cl7 = new pred_maketerm_3_7();
    //
    //  static Code cl8 = new pred_maketerm_3_8();
    //
    //  static Code cl9 = new pred_maketerm_3_9();
    //
    //  static Code cl10 = new pred_maketerm_3_10();
    //
    //  static Code cl11 = new pred_maketerm_3_11();

    final static Code cl5 = new pred_maketerm_3_6();

    final static Code cl6 = new pred_maketerm_3_7();

    final static Code cl7 = new pred_maketerm_3_8();

    final static Code cl8 = new pred_maketerm_3_9();

    final static Code cl9 = new pred_maketerm_3_10();

    final static Code cl10 = new pred_maketerm_3_11();

    final static Code cl11 = new pred_maketerm_3_5();

    static Code ap4cont;

    static Code cut2cont;

    static Code getargs3cont;

    static Code prefix4cont;

    static Code unify3cont;

    final static String string0 = Const.strIntern("cut");

    final static String string1 = Const.strIntern("(");

    final static String string2 = Const.strIntern(")");

    final static String string3 = Const.strIntern(",");

    final static String string4 = Const.strIntern(".");

    final static String string5 = Const.strIntern("[");

    final static String string6 = Const.strIntern("[]");

    final static String string7 = Const.strIntern("]");

    final static String string8 = Const.strIntern("ap");

    final static String string9 = Const.strIntern("call");

    final static String string10 = Const.strIntern("const");
    static final String String23 = Const.strIntern("constant");
    final static String string11 = Const.strIntern("cut");

    final static String string12 = Const.strIntern("getargs");

    final static String string13 = Const.strIntern("infix");

    final static String string14 = Const.strIntern("int");

    final static String string15 = Const.strIntern("maketerm");

    final static String string16 = Const.strIntern("newprec");

    final static String string17 = Const.strIntern("prefix");

    final static String string18 = Const.strIntern("smallerorequal");

    final static String string19 = Const.strIntern("unify");

    final static String string20 = Const.strIntern("univ");

    final static String string21 = Const.strIntern("var");

    final static String string22 = Const.strIntern("|");

    final static Int posint1 = JpFactory.Long(1);

    final static Int posint900 = JpFactory.Long(900);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        ap4cont = mach.loadPred("ap", 3);
        getargs3cont = mach.loadPred("getargs", 2);
        prefix4cont = mach.loadPred("prefix", 3);
        unify3cont = mach.loadPred("unify", 2);
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

    protected boolean endsWith(Term areg0, String token) {
        areg0 = areg0.dref();
        if (!areg0.isCons())
            return false;
        StructureTerm list = (StructureTerm) areg0;
        while (list.args()[1].dref().isCons())
            list = (StructureTerm) list.args()[1].dref();
        if (!list.args()[0].dref().equalsTerm(JpFactory.S("const", JpFactory.CONST(token))))
            return false;
        return true;
    }
}

class pred_maketerm_3_1 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory
                .S(string4, JpFactory.S(string21, var1, var2, var3), JpFactory.CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unify(var4)))
            return mach.Fail0;
        if (!((areg2).unify(var5)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var4.dref();
        local_aregs[2] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        local_aregs[3] = null;
        return unify3cont;
    }
}

class pred_maketerm_3_2 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string14, var1), JpFactory.CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string19, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maketerm_3_3b extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(String23, var1), JpFactory.CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string19, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maketerm_3_3 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3b);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, var1), JpFactory.CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string19, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maketerm_3_4 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl5);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, var1), JpFactory
                .S(string4, JpFactory.S(string10, JpFactory.CONST(string1)), var2)))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        //areg0 moet eindigen op ')' anders al niet correct
        if (!endsWith(areg0, ")"))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var5;
        local_aregs[2] = JpFactory.S(string20, var3.dref(), var1.dref(), var5.dref(), JpFactory
                .S(string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getargs3cont;
    }
}

class pred_maketerm_3_5 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl6);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var12 = JpFactory.JVAR(mach);
        Term var11 = JpFactory.JVAR(mach);
        Term var10 = JpFactory.JVAR(mach);
        Term var9 = JpFactory.JVAR(mach);
        Term var8 = JpFactory.JVAR(mach);
        Term var7 = JpFactory.JVAR(mach);
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
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        var4.unify(JpFactory.S(".", JpFactory.JVAR(mach), JpFactory.JVAR(mach)));
        local_aregs[0] = var4;
        local_aregs[1] = JpFactory.S(string4, JpFactory.S(string10, var5), var6);
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string13, var7, var8, var5.dref(), JpFactory.S(string18, var7.dref(), var3
                .dref(), JpFactory.S(string16, var8.dref(), var7.dref(), var9, var10, JpFactory
                        .S(string15, var4.dref(), var11, var9.dref(), JpFactory.S(string15, var6.dref(), var12, var10
                                .dref(), JpFactory.S(string20, var2.dref(), var5.dref(), JpFactory
                                        .S(string4, var11.dref(), JpFactory
                                                .S(string4, var12.dref(), JpFactory.CONST(string6))), JpFactory
                                                        .S(string0, new HeapChoice(mach.getCUTB()), continuation)))))));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_6 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl7);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var8 = JpFactory.JVAR(mach);
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, var1), var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = var6;
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string18, var5.dref(), var4.dref(), JpFactory
                .S(string16, var6.dref(), var5.dref(), var7, JpFactory
                        .S(string15, var2.dref(), var8, var7.dref(), JpFactory
                                .S(string20, var3.dref(), var1.dref(), JpFactory
                                        .S(string4, var8.dref(), JpFactory.CONST(string6)), JpFactory
                                                .S(string0, new HeapChoice(mach.getCUTB()), continuation)))));
        mach.updateCUTB();
        return prefix4cont;
    }
}

class pred_maketerm_3_7 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl8);
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
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string5)), var1))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string4, var2, var3))))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string3)), var6);
        if (!endsWith(var1, "]"))
            return mach.Fail0;
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory
                .S(string15, var5.dref(), var2.dref(), posint900, JpFactory.S(string15, JpFactory
                        .S(string4, JpFactory.S(string10, JpFactory.CONST(string5)), var6.dref()), var3
                                .dref(), posint900, JpFactory
                                        .S(string0, new HeapChoice(mach.getCUTB()), continuation)));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_8 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl9);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string5)), var1))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string4, var2, var3))))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string22)), var6);
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string8, var7, JpFactory
                .S(string4, JpFactory.S(string10, JpFactory.CONST(string7)), JpFactory.CONST(string6)), var6
                        .dref(), JpFactory.S(string15, var5.dref(), var2.dref(), posint900, JpFactory
                                .S(string15, var7.dref(), var3.dref(), posint900, JpFactory
                                        .S(string0, new HeapChoice(mach.getCUTB()), continuation))));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_9 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl10);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string1)), var1))))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var4;
        local_aregs[1] = JpFactory
                .S(string4, JpFactory.S(string10, JpFactory.CONST(string2)), JpFactory.CONST(string6));
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(string15, var4.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_10 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl11);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string5)), var1))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string4, var2, JpFactory.CONST(string6)))))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var4;
        local_aregs[1] = JpFactory
                .S(string4, JpFactory.S(string10, JpFactory.CONST(string7)), JpFactory.CONST(string6));
        local_aregs[2] = var1.dref();
        local_aregs[3] = JpFactory.S(string15, var4.dref(), var2.dref(), posint900, JpFactory
                .S(string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_11 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, JpFactory.S(string10, JpFactory.CONST(string5)), JpFactory
                .S(string4, JpFactory.S(string10, JpFactory.CONST(string7)), JpFactory.CONST(string6))))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string6))))
            return mach.Fail0;
        if (!((areg2).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
