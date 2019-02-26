// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_printMethodForIndexing_4_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("printMethodForIndexing");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("  @Override");
    final static String string5 = Const.strIntern("wr");
    final static String string6 = Const.strIntern("nl");
    final static String string7 = Const.strIntern("  @SuppressWarnings(\"static-access\")");
    final static String string8 = Const.strIntern("  protected PrologObject[] getArgs() {");
    final static String string9 = Const.strIntern("createDummyVars");
    final static String string10 = Const.strIntern("createArgs");
    final static String string11 = Const.strIntern("bundleArgs");
    final static String string12 = Const.strIntern("  }");
    final static String string13 = Const.strIntern("[]");
}

public class pred_printMethodForIndexing_4 extends Code {
    private final pred_printMethodForIndexing_4_consts consts;

    public pred_printMethodForIndexing_4() {
        consts = new pred_printMethodForIndexing_4_consts();
        initAlternatives();
    }

    protected pred_printMethodForIndexing_4(pred_printMethodForIndexing_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_printMethodForIndexing_4_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
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
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        if (!(areg2.unify(var3)))
            return mach.Fail0;
        if (!(areg3.unify(var4)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, JpFactory
                        .S(getConsts().string5, JpFactory.CONST(getConsts().string6)), JpFactory
                                .S(getConsts().string3, JpFactory.CONST(getConsts().string7), JpFactory
                                        .S(getConsts().string3, JpFactory.S(getConsts().string5, JpFactory
                                                .CONST(getConsts().string6)), JpFactory
                                                        .S(getConsts().string3, JpFactory
                                                                .CONST(getConsts().string8), JpFactory
                                                                        .S(getConsts().string3, JpFactory
                                                                                .S(getConsts().string5, JpFactory
                                                                                        .CONST(getConsts().string6)), JpFactory
                                                                                                .S(getConsts().string3, JpFactory
                                                                                                        .S(getConsts().string9, var1
                                                                                                                .dref()), JpFactory
                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                .S(getConsts().string10, var2
                                                                                                                                        .dref(), var3
                                                                                                                                                .dref()), JpFactory
                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                .S(getConsts().string11, var4
                                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                        .S(getConsts().string5, JpFactory
                                                                                                                                                                                                .CONST(getConsts().string6)), JpFactory
                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                .CONST(getConsts().string12), JpFactory
                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                        .CONST(getConsts().string6)), JpFactory
                                                                                                                                                                                                                                                .CONST(getConsts().string13)))))))))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return getConsts().writel2cont;

    }
}
