// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_initforeachcontinuation_3_consts {
    Code entry_code;
    Code is3cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("initforeachcontinuation");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("/");
    final static String string4 = Const.strIntern("is");
    final static String string5 = Const.strIntern("-");
    final static String string6 = Const.strIntern("changeIllegalTerms");
    final static String string7 = Const.strIntern("writel");
    final static String string8 = Const.strIntern("consts.");
    final static String string9 = Const.strIntern("cont = mach.loadPred(\"");
    final static String string10 = Const.strIntern("\",");
    final static String string11 = Const.strIntern(") ;");
    final static String string12 = Const.strIntern("wr");
    final static String string13 = Const.strIntern("nl");
    final static String string14 = Const.strIntern("[]");
    final static String string15 = Const.strIntern("cut");
    final static String string16 = Const.strIntern("cut");
    final static String string17 = Const.strIntern("call");
    final static Int posint1 = JpFactory.Long(1);
    final static Int posint2 = JpFactory.Long(2);
}

public class pred_initforeachcontinuation_3 extends Code {
    private final pred_initforeachcontinuation_3_consts consts;

    public pred_initforeachcontinuation_3() {
        consts = new pred_initforeachcontinuation_3_consts();
        initAlternatives();
    }

    protected pred_initforeachcontinuation_3(pred_initforeachcontinuation_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_initforeachcontinuation_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_initforeachcontinuation_3_1(this));
        ALT.addAlternative(new pred_initforeachcontinuation_3_2(this));
        ALT.addAlternative(new pred_initforeachcontinuation_3_3(this));
        ALT.addAlternative(new pred_initforeachcontinuation_3_4(this));
        ALT.addAlternative(new pred_initforeachcontinuation_3_5(this));
        ALT.addAlternative(new pred_initforeachcontinuation_3_6(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.is3cont = mach.loadPred("is", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_initforeachcontinuation_3_1 extends pred_initforeachcontinuation_3 {
    pred_initforeachcontinuation_3_1(pred_initforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(getConsts().string14);
        Term arg1 = var1;
        Term arg2 = var2;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.CONST(getConsts().string14))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_initforeachcontinuation_3_2 extends pred_initforeachcontinuation_3 {
    pred_initforeachcontinuation_3_2(pred_initforeachcontinuation_3 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, JpFactory.S(getConsts().string3, var1, var2), var3);
        Term arg1 = var1.dref();
        Term arg2 = var2.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory
                .S(getConsts().string2, JpFactory.S(getConsts().string3, var1.dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var2.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string1, var3.dref(), var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_initforeachcontinuation_3_3 extends pred_initforeachcontinuation_3 {
    pred_initforeachcontinuation_3_3(pred_initforeachcontinuation_3 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string17), getConsts().posint1), var1);
        Term arg1 = var2;
        Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string17), getConsts().posint1), var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string1, var1.dref(), var2.dref(), var3.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_initforeachcontinuation_3_4 extends pred_initforeachcontinuation_3 {
    pred_initforeachcontinuation_3_4(pred_initforeachcontinuation_3 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string17), getConsts().posint2), var1);
        Term arg1 = var2;
        Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string17), getConsts().posint2), var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string1, var1.dref(), var2.dref(), var3.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_initforeachcontinuation_3_5 extends pred_initforeachcontinuation_3 {
    pred_initforeachcontinuation_3_5(pred_initforeachcontinuation_3 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string0), getConsts().posint2), var1);
        Term arg1 = var2;
        Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string0), getConsts().posint2), var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string1, var1.dref(), var2.dref(), var3.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_initforeachcontinuation_3_6 extends pred_initforeachcontinuation_3 {
    pred_initforeachcontinuation_3_6(pred_initforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term arg0 = JpFactory.S(getConsts().string2, JpFactory.S(getConsts().string3, var1, var2), var3);
        Term arg1 = var4;
        Term arg2 = var5;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
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
        if (!(areg0.unify(JpFactory
                .S(getConsts().string2, JpFactory.S(getConsts().string3, var1.dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var5.dref())))
            return mach.Fail0;
        local_aregs[0] = var6;
        local_aregs[1] = JpFactory.S(getConsts().string5, var2.dref(), getConsts().posint1);
        local_aregs[2] = JpFactory.S(getConsts().string6, var7, var1.dref(), JpFactory
                .S(getConsts().string7, JpFactory.S(getConsts().string2, JpFactory
                        .CONST(getConsts().string8), JpFactory.S(getConsts().string2, var1.dref(), JpFactory
                                .S(getConsts().string2, var2.dref(), JpFactory.S(getConsts().string2, JpFactory
                                        .CONST(getConsts().string9), JpFactory.S(getConsts().string2, var7
                                                .dref(), JpFactory.S(getConsts().string2, JpFactory
                                                        .CONST(getConsts().string10), JpFactory
                                                                .S(getConsts().string2, var6.dref(), JpFactory
                                                                        .S(getConsts().string2, JpFactory
                                                                                .CONST(getConsts().string11), JpFactory
                                                                                        .S(getConsts().string2, JpFactory
                                                                                                .S(getConsts().string12, JpFactory
                                                                                                        .CONST(getConsts().string13)), JpFactory
                                                                                                                .CONST(getConsts().string14)))))))))), JpFactory
                                                                                                                        .S(getConsts().string1, var3
                                                                                                                                .dref(), var4
                                                                                                                                        .dref(), var5
                                                                                                                                                .dref(), continuation)));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().is3cont;
    }
}
