// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_genclausecode_5_consts {
    Code entry_code;
    Code getPredHeader4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("genclausecode");
    final static String string2 = Const.strIntern("getPredHeader");
    final static String string3 = Const.strIntern("functor");
    final static String string4 = Const.strIntern("is");
    final static String string5 = Const.strIntern("-");
    final static String string6 = Const.strIntern("arg");
    final static String string7 = Const.strIntern("continuation");
    final static String string8 = Const.strIntern("unify");
    final static String string9 = Const.strIntern("mynumbervars");
    final static String string10 = Const.strIntern("writel");
    final static String string11 = Const.strIntern(".");
    final static String string12 = Const.strIntern("class ");
    final static String string13 = Const.strIntern("_");
    final static String string14 = Const.strIntern(" extends ");
    final static String string15 = Const.strIntern(" {");
    final static String string16 = Const.strIntern("wr");
    final static String string17 = Const.strIntern("nl");
    final static String string18 = Const.strIntern("printClauseConstructor");
    final static String string19 = Const.strIntern("printMethodForIndexing");
    final static String string20 = Const.strIntern("printPredExec");
    final static String string21 = Const.strIntern("}");
    final static String string22 = Const.strIntern("[]");
    final static String string23 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_genclausecode_5 extends Code {
    private final pred_genclausecode_5_consts consts;

    public pred_genclausecode_5() {
        consts = new pred_genclausecode_5_consts();
        initAlternatives();
    }

    protected pred_genclausecode_5(pred_genclausecode_5 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_genclausecode_5_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.getPredHeader4cont = mach.loadPred("getPredHeader", 3);
    }

    @Override
    public int arity() {
        return 5;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[5];
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
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        if (!(areg2.unify(var3)))
            return mach.Fail0;
        if (!(areg3.unify(var4)))
            return mach.Fail0;
        if (!(areg4.unify(var5)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var6;
        local_aregs[2] = var7;
        local_aregs[3] = JpFactory
                .S(getConsts().string3, var6.dref(), var8, var9, JpFactory.S(getConsts().string4, var10, JpFactory
                        .S(getConsts().string5, var9.dref(), getConsts().posint1), JpFactory
                                .S(getConsts().string6, var9.dref(), var6.dref(), JpFactory
                                        .S(getConsts().string7, var9.dref()), JpFactory.S(getConsts().string8, var1
                                                .dref(), var11, JpFactory.S(getConsts().string2, var11
                                                        .dref(), var12, var13, JpFactory.S(getConsts().string9, var11
                                                                .dref(), getConsts().posint1, var14, JpFactory
                                                                        .S(getConsts().string10, JpFactory
                                                                                .S(getConsts().string11, JpFactory
                                                                                        .CONST(getConsts().string12), JpFactory
                                                                                                .S(getConsts().string11, var3
                                                                                                        .dref(), JpFactory
                                                                                                                .S(getConsts().string11, JpFactory
                                                                                                                        .CONST(getConsts().string13), JpFactory
                                                                                                                                .S(getConsts().string11, var4
                                                                                                                                        .dref(), JpFactory
                                                                                                                                                .S(getConsts().string11, JpFactory
                                                                                                                                                        .CONST(getConsts().string14), JpFactory
                                                                                                                                                                .S(getConsts().string11, var3
                                                                                                                                                                        .dref(), JpFactory
                                                                                                                                                                                .S(getConsts().string11, JpFactory
                                                                                                                                                                                        .CONST(getConsts().string15), JpFactory
                                                                                                                                                                                                .S(getConsts().string11, JpFactory
                                                                                                                                                                                                        .S(getConsts().string16, JpFactory
                                                                                                                                                                                                                .CONST(getConsts().string17)), JpFactory
                                                                                                                                                                                                                        .S(getConsts().string11, JpFactory
                                                                                                                                                                                                                                .S(getConsts().string18, var3
                                                                                                                                                                                                                                        .dref(), var4
                                                                                                                                                                                                                                                .dref()), JpFactory
                                                                                                                                                                                                                                                        .S(getConsts().string11, JpFactory
                                                                                                                                                                                                                                                                .S(getConsts().string19, var14
                                                                                                                                                                                                                                                                        .dref(), var12
                                                                                                                                                                                                                                                                                .dref(), var5
                                                                                                                                                                                                                                                                                        .dref(), var10
                                                                                                                                                                                                                                                                                                .dref()), JpFactory
                                                                                                                                                                                                                                                                                                        .S(getConsts().string11, JpFactory
                                                                                                                                                                                                                                                                                                                .S(getConsts().string20, var9
                                                                                                                                                                                                                                                                                                                        .dref(), var14
                                                                                                                                                                                                                                                                                                                                .dref(), var12
                                                                                                                                                                                                                                                                                                                                        .dref(), var13
                                                                                                                                                                                                                                                                                                                                                .dref(), var5
                                                                                                                                                                                                                                                                                                                                                        .dref(), var1
                                                                                                                                                                                                                                                                                                                                                                .dref(), var8
                                                                                                                                                                                                                                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string11, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string21), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string11, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string16, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string17)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string11, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string16, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string17)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string22))))))))))))))), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string0, new HeapChoice(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                mach.getCUTB()), continuation))))))));
        mach.updateCUTB();
        local_aregs[5] = local_aregs[4] = null;
        return getConsts().getPredHeader4cont;

    }
}
