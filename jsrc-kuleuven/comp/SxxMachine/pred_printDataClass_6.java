// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_printDataClass_6_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("printDataClass");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("class ");
    final static String string5 = Const.strIntern("_consts {");
    final static String string6 = Const.strIntern("wr");
    final static String string7 = Const.strIntern("nl");
    final static String string8 = Const.strIntern("   Code entry_code;");
    final static String string9 = Const.strIntern("declforeachcontinuation");
    final static String string10 = Const.strIntern("declforeachstring");
    final static String string11 = Const.strIntern("declforeachint");
    final static String string12 = Const.strIntern("}");
    final static String string13 = Const.strIntern("[]");
    final static Int posint0 = JpFactory.Long(0);
}

public class pred_printDataClass_6 extends Code {
    private final pred_printDataClass_6_consts consts;

    public pred_printDataClass_6() {
        consts = new pred_printDataClass_6_consts();
        initAlternatives();
    }

    protected pred_printDataClass_6(pred_printDataClass_6 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_printDataClass_6_consts getConsts() {
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
        return 6;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[6];
        Term areg5 = local_aregs[5].dref();
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
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
        if (!(areg5.unify(var6)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, var1.dref(), JpFactory.S(getConsts().string3, JpFactory
                        .CONST(getConsts().string5), JpFactory.S(getConsts().string3, JpFactory
                                .S(getConsts().string6, JpFactory.CONST(getConsts().string7)), JpFactory
                                        .S(getConsts().string3, JpFactory.CONST(getConsts().string8), JpFactory
                                                .S(getConsts().string3, JpFactory.S(getConsts().string6, JpFactory
                                                        .CONST(getConsts().string7)), JpFactory
                                                                .S(getConsts().string3, JpFactory
                                                                        .S(getConsts().string9, var2.dref(), var3
                                                                                .dref(), var4.dref()), JpFactory
                                                                                        .S(getConsts().string3, JpFactory
                                                                                                .S(getConsts().string10, var5
                                                                                                        .dref(), getConsts().posint0), JpFactory
                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                        .S(getConsts().string11, var6
                                                                                                                                .dref()), JpFactory
                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                .CONST(getConsts().string12), JpFactory
                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                .S(getConsts().string6, JpFactory
                                                                                                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                .CONST(getConsts().string13))))))))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[6] = local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return getConsts().writel2cont;

    }
}
