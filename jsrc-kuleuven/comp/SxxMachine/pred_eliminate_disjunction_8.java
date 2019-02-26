// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_eliminate_disjunction_8_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("eliminate_disjunction");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern(";");
    final static String string4 = Const.strIntern("cut");
    final static String string5 = Const.strIntern("term_variables");
    final static String string6 = Const.strIntern("intersect_eq");
    final static String string7 = Const.strIntern("make_disj_pred");
    final static String string8 = Const.strIntern("copy_term");
    final static String string9 = Const.strIntern(":-");
    final static String string10 = Const.strIntern("eliminate_disjunction_clause");
    final static String string11 = Const.strIntern("->");
    final static String string12 = Const.strIntern(",");
    final static String string13 = Const.strIntern("!");
    final static String string14 = Const.strIntern("+");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_eliminate_disjunction_8 extends Code {
    private final pred_eliminate_disjunction_8_consts consts;

    public pred_eliminate_disjunction_8() {
        consts = new pred_eliminate_disjunction_8_consts();
        initAlternatives();
    }

    protected pred_eliminate_disjunction_8(pred_eliminate_disjunction_8 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_eliminate_disjunction_8_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_eliminate_disjunction_8_1(this));
        ALT.addAlternative(new pred_eliminate_disjunction_8_2(this));
        ALT.addAlternative(new pred_eliminate_disjunction_8_3(this));
        ALT.addAlternative(new pred_eliminate_disjunction_8_4(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
    }

    @Override
    public int arity() {
        return 8;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(9);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_eliminate_disjunction_8_1 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_1(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var14 = new DummyVar();
        @SuppressWarnings("unused")
        Term var13 = new DummyVar();
        @SuppressWarnings("unused")
        Term var12 = new DummyVar();
        @SuppressWarnings("unused")
        Term var11 = new DummyVar();
        @SuppressWarnings("unused")
        Term var10 = new DummyVar();
        @SuppressWarnings("unused")
        Term var9 = new DummyVar();
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
        Term arg0 = JpFactory.S(getConsts().string12, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
        Term arg3 = var5;
        Term arg4 = var6;
        Term arg5 = JpFactory.S(getConsts().string12, var7, var8);
        Term arg6 = var9;
        Term arg7 = var10;
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[8];
        Term areg7 = local_aregs[7].dref();
        Term areg6 = local_aregs[6].dref();
        Term areg5 = local_aregs[5].dref();
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var14 = JpFactory.JVAR(mach);
        Term var13 = JpFactory.JVAR(mach);
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
        if (!(areg0.unify(JpFactory.S(getConsts().string12, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var5.dref())))
            return mach.Fail0;
        if (!(areg4.unify(var6.dref())))
            return mach.Fail0;
        if (!(areg5.unify(JpFactory.S(getConsts().string12, var7.dref(), var8.dref()))))
            return mach.Fail0;
        if (!(areg6.unify(var9.dref())))
            return mach.Fail0;
        if (!(areg7.unify(var10.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string5, JpFactory
                .S(getConsts().string14, var4.dref(), var2.dref()), var11, JpFactory
                        .S(getConsts().string1, var1.dref(), var3.dref(), var11.dref(), var5.dref(), var12, var7
                                .dref(), var9.dref(), var13, JpFactory.S(getConsts().string5, JpFactory
                                        .S(getConsts().string14, var4.dref(), var1.dref()), var14, JpFactory
                                                .S(getConsts().string1, var2.dref(), var3.dref(), var14.dref(), var12
                                                        .dref(), var6.dref(), var8
                                                                .dref(), var13.dref(), var10.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[8] = local_aregs[7] = local_aregs[6] = local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_eliminate_disjunction_8_2 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_2(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var17 = new DummyVar();
        @SuppressWarnings("unused")
        Term var16 = new DummyVar();
        @SuppressWarnings("unused")
        Term var15 = new DummyVar();
        @SuppressWarnings("unused")
        Term var14 = new DummyVar();
        @SuppressWarnings("unused")
        Term var13 = new DummyVar();
        @SuppressWarnings("unused")
        Term var12 = new DummyVar();
        @SuppressWarnings("unused")
        Term var11 = new DummyVar();
        @SuppressWarnings("unused")
        Term var10 = new DummyVar();
        @SuppressWarnings("unused")
        Term var9 = new DummyVar();
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
        Term arg0 = JpFactory.S(getConsts().string3, JpFactory.S(getConsts().string11, var1, var2), var3);
        Term arg1 = var4;
        Term arg2 = var5;
        Term arg3 = var6;
        Term arg4 = var7;
        Term arg5 = var8;
        Term arg6 = var9;
        Term arg7 = var10;
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[8];
        Term areg7 = local_aregs[7].dref();
        Term areg6 = local_aregs[6].dref();
        Term areg5 = local_aregs[5].dref();
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var17 = JpFactory.JVAR(mach);
        Term var16 = JpFactory.JVAR(mach);
        Term var15 = JpFactory.JVAR(mach);
        Term var14 = JpFactory.JVAR(mach);
        Term var13 = JpFactory.JVAR(mach);
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
        if (!(areg0.unify(JpFactory
                .S(getConsts().string3, JpFactory.S(getConsts().string11, var1.dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var5.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var6.dref())))
            return mach.Fail0;
        if (!(areg4.unify(var7.dref())))
            return mach.Fail0;
        if (!(areg5.unify(var8.dref())))
            return mach.Fail0;
        if (!(areg6.unify(var9.dref())))
            return mach.Fail0;
        if (!(areg7.unify(var10.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string5, JpFactory.S(getConsts().string3, JpFactory
                .S(getConsts().string11, var1.dref(), var2.dref()), var3.dref()), var11, JpFactory
                        .S(getConsts().string6, var11.dref(), var5.dref(), var12, JpFactory
                                .S(getConsts().string7, var4.dref(), var12.dref(), var6.dref(), var13, var8
                                        .dref(), JpFactory.S(getConsts().string8, JpFactory
                                                .S(getConsts().string9, var8.dref(), JpFactory
                                                        .S(getConsts().string12, var1.dref(), JpFactory
                                                                .S(getConsts().string12, JpFactory
                                                                        .CONST(getConsts().string13), var2
                                                                                .dref()))), var14, JpFactory
                                                                                        .S(getConsts().string10, var14
                                                                                                .dref(), var13
                                                                                                        .dref(), var15, var9
                                                                                                                .dref(), var16, JpFactory
                                                                                                                        .S(getConsts().string8, JpFactory
                                                                                                                                .S(getConsts().string9, var8
                                                                                                                                        .dref(), var3
                                                                                                                                                .dref()), var17, JpFactory
                                                                                                                                                        .S(getConsts().string10, var17
                                                                                                                                                                .dref(), var15
                                                                                                                                                                        .dref(), var7
                                                                                                                                                                                .dref(), var16
                                                                                                                                                                                        .dref(), var10
                                                                                                                                                                                                .dref(), continuation)))))));
        mach.updateCUTB();
        local_aregs[8] = local_aregs[7] = local_aregs[6] = local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_eliminate_disjunction_8_3 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_3(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var16 = new DummyVar();
        @SuppressWarnings("unused")
        Term var15 = new DummyVar();
        @SuppressWarnings("unused")
        Term var14 = new DummyVar();
        @SuppressWarnings("unused")
        Term var13 = new DummyVar();
        @SuppressWarnings("unused")
        Term var12 = new DummyVar();
        @SuppressWarnings("unused")
        Term var11 = new DummyVar();
        @SuppressWarnings("unused")
        Term var10 = new DummyVar();
        @SuppressWarnings("unused")
        Term var9 = new DummyVar();
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
        Term arg0 = JpFactory.S(getConsts().string3, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
        Term arg3 = var5;
        Term arg4 = var6;
        Term arg5 = var7;
        Term arg6 = var8;
        Term arg7 = var9;
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[8];
        Term areg7 = local_aregs[7].dref();
        Term areg6 = local_aregs[6].dref();
        Term areg5 = local_aregs[5].dref();
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var16 = JpFactory.JVAR(mach);
        Term var15 = JpFactory.JVAR(mach);
        Term var14 = JpFactory.JVAR(mach);
        Term var13 = JpFactory.JVAR(mach);
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
        if (!(areg0.unify(JpFactory.S(getConsts().string3, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var5.dref())))
            return mach.Fail0;
        if (!(areg4.unify(var6.dref())))
            return mach.Fail0;
        if (!(areg5.unify(var7.dref())))
            return mach.Fail0;
        if (!(areg6.unify(var8.dref())))
            return mach.Fail0;
        if (!(areg7.unify(var9.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string5, JpFactory
                .S(getConsts().string3, var1.dref(), var2.dref()), var10, JpFactory.S(getConsts().string6, var10
                        .dref(), var4.dref(), var11, JpFactory.S(getConsts().string7, var3.dref(), var11.dref(), var5
                                .dref(), var12, var7.dref(), JpFactory.S(getConsts().string8, JpFactory
                                        .S(getConsts().string9, var7.dref(), var1.dref()), var13, JpFactory
                                                .S(getConsts().string10, var13.dref(), var12.dref(), var14, var8
                                                        .dref(), var15, JpFactory.S(getConsts().string8, JpFactory
                                                                .S(getConsts().string9, var7.dref(), var2
                                                                        .dref()), var16, JpFactory
                                                                                .S(getConsts().string10, var16
                                                                                        .dref(), var14.dref(), var6
                                                                                                .dref(), var15
                                                                                                        .dref(), var9
                                                                                                                .dref(), continuation)))))));
        mach.updateCUTB();
        local_aregs[8] = local_aregs[7] = local_aregs[6] = local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_eliminate_disjunction_8_4 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_4(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term arg2 = var3;
        Term arg3 = var4;
        Term arg4 = var4.dref();
        Term arg5 = var1.dref();
        Term arg6 = var5;
        Term arg7 = var5.dref();
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[8];
        Term areg7 = local_aregs[7].dref();
        Term areg6 = local_aregs[6].dref();
        Term areg5 = local_aregs[5].dref();
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg4.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg5.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg6.unify(var5.dref())))
            return mach.Fail0;
        if (!(areg7.unify(var5.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[8] = local_aregs[7] = local_aregs[6] = local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
