// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_constructterm_2_consts {
    Code entry_code;
    Code functor4cont;
    Code atom2cont;
    Code integer2cont;
    Code cut2cont;
    Code var2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("constructterm");
    final static String string2 = Const.strIntern("functor");
    final static String string3 = Const.strIntern("univ");
    final static String string4 = Const.strIntern("changeIllegalTerms");
    final static String string5 = Const.strIntern("getnameindex");
    final static String string6 = Const.strIntern("writel");
    final static String string7 = Const.strIntern(".");
    final static String string8 = Const.strIntern("new StructureTerm(getConsts().string");
    final static String string9 = Const.strIntern(",");
    final static String string10 = Const.strIntern("newargs");
    final static String string11 = Const.strIntern(")");
    final static String string12 = Const.strIntern("[]");
    final static String string13 = Const.strIntern("atom");
    final static String string14 = Const.strIntern("cut");
    final static String string15 = Const.strIntern("new Const(getConsts().string");
    final static String string16 = Const.strIntern("integer");
    final static String string17 = Const.strIntern("write");
    final static String string18 = Const.strIntern("getConsts().");
    final static String string19 = Const.strIntern("posneg");
    final static String string20 = Const.strIntern("cut");
    final static String string21 = Const.strIntern(", new HeapChoice(mach.getCUTB()),");
    final static String string22 = Const.strIntern("varnr");
    final static String string23 = Const.strIntern("var");
    final static String string24 = Const.strIntern(".dref()");
    final static String string25 = Const.strIntern("unify");
    final static String string26 = Const.strIntern("continuation");
    final static Int posint0 = JpFactory.Long(0);
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_constructterm_2 extends Code {
    private final pred_constructterm_2_consts consts;

    public pred_constructterm_2() {
        consts = new pred_constructterm_2_consts();
        initAlternatives();
    }

    protected pred_constructterm_2(pred_constructterm_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_constructterm_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_constructterm_2_1(this));
        ALT.addAlternative(new pred_constructterm_2_2(this));
        ALT.addAlternative(new pred_constructterm_2_3(this));
        ALT.addAlternative(new pred_constructterm_2_4(this));
        ALT.addAlternative(new pred_constructterm_2_5(this));
        ALT.addAlternative(new pred_constructterm_2_6(this));
        ALT.addAlternative(new pred_constructterm_2_7(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
        consts.atom2cont = mach.loadPred("atom", 1);
        consts.integer2cont = mach.loadPred("integer", 1);
        consts.var2cont = mach.loadPred("var", 1);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_constructterm_2_1 extends pred_constructterm_2 {
    pred_constructterm_2_1(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string26, var1);
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string26, var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string6, JpFactory.S(getConsts().string7, JpFactory
                .CONST(getConsts().string26), JpFactory.CONST(getConsts().string12)), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_constructterm_2_2 extends pred_constructterm_2 {
    pred_constructterm_2_2(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string22, var1, var2);
        Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string22, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string6, JpFactory.S(getConsts().string7, JpFactory
                        .CONST(getConsts().string23), JpFactory.S(getConsts().string7, var1.dref(), JpFactory
                                .CONST(getConsts().string12))), JpFactory
                                        .S(getConsts().string25, getConsts().posint1, var2.dref(), continuation)));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().var2cont;
    }
}

class pred_constructterm_2_3 extends pred_constructterm_2 {
    pred_constructterm_2_3(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string22, var1, var2);
        Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string22, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string6, JpFactory
                .S(getConsts().string7, JpFactory.CONST(getConsts().string23), JpFactory
                        .S(getConsts().string7, var1.dref(), JpFactory
                                .S(getConsts().string7, JpFactory.CONST(getConsts().string24), JpFactory
                                        .CONST(getConsts().string12)))), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_constructterm_2_4 extends pred_constructterm_2 {
    pred_constructterm_2_4(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string0, var1, var2);
        Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string0, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string5, var3.dref(), JpFactory
                .CONST(getConsts().string0), getConsts().posint0, var4, JpFactory.S(getConsts().string6, JpFactory
                        .S(getConsts().string7, JpFactory.CONST(getConsts().string8), JpFactory
                                .S(getConsts().string7, var4.dref(), JpFactory.S(getConsts().string7, JpFactory
                                        .CONST(getConsts().string21), JpFactory.S(getConsts().string7, JpFactory
                                                .S(getConsts().string1, var2.dref(), var3.dref()), JpFactory
                                                        .S(getConsts().string7, JpFactory
                                                                .CONST(getConsts().string11), JpFactory
                                                                        .CONST(getConsts().string12)))))), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_constructterm_2_5 extends pred_constructterm_2 {
    pred_constructterm_2_5(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string17, JpFactory.CONST(getConsts().string18), JpFactory
                        .S(getConsts().string19, var1.dref(), continuation)));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().integer2cont;
    }
}

class pred_constructterm_2_6 extends pred_constructterm_2 {
    pred_constructterm_2_6(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string4, var3, var1.dref(), JpFactory.S(getConsts().string5, var2.dref(), var3
                        .dref(), getConsts().posint0, var4, JpFactory.S(getConsts().string6, JpFactory
                                .S(getConsts().string7, JpFactory.CONST(getConsts().string15), JpFactory
                                        .S(getConsts().string7, var4.dref(), JpFactory
                                                .S(getConsts().string7, JpFactory
                                                        .CONST(getConsts().string11), JpFactory
                                                                .CONST(getConsts().string12)))), continuation))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().atom2cont;
    }
}

class pred_constructterm_2_7 extends pred_constructterm_2 {
    pred_constructterm_2_7(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var8 = new DummyVar();
        @SuppressWarnings("unused")
        Term var7 = new DummyVar();
        @SuppressWarnings("unused")
        Term var6 = new DummyVar();
        @SuppressWarnings("unused")
        Term var5 = new DummyVar();
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;
        local_aregs[3] = JpFactory.S(getConsts().string3, var1.dref(), var5, var6, JpFactory
                .S(getConsts().string4, var7, var3.dref(), JpFactory.S(getConsts().string5, var2.dref(), var7
                        .dref(), getConsts().posint0, var8, JpFactory.S(getConsts().string6, JpFactory
                                .S(getConsts().string7, JpFactory.CONST(getConsts().string8), JpFactory
                                        .S(getConsts().string7, var8.dref(), JpFactory
                                                .S(getConsts().string7, JpFactory
                                                        .CONST(getConsts().string9), JpFactory
                                                                .S(getConsts().string7, JpFactory
                                                                        .S(getConsts().string10, var6
                                                                                .dref(), getConsts().posint1, var2
                                                                                        .dref()), JpFactory
                                                                                                .S(getConsts().string7, JpFactory
                                                                                                        .CONST(getConsts().string11), JpFactory
                                                                                                                .CONST(getConsts().string12)))))), continuation))));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}
