// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_printPredExecCode_7_consts {
    Code entry_code;
    Code is3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("printPredExecCode");
    final static String string2 = Const.strIntern("is");
    final static String string3 = Const.strIntern("-");
    final static String string4 = Const.strIntern("writel");
    final static String string5 = Const.strIntern(".");
    final static String string6 = Const.strIntern("    PrologObject local_aregs[] = mach.getAreg();");
    final static String string7 = Const.strIntern("wr");
    final static String string8 = Const.strIntern("nl");
    final static String string9 = Const.strIntern("    PrologObject continuation = local_aregs[");
    final static String string10 = Const.strIntern("] ;");
    final static String string11 = Const.strIntern("decl_deref_args");
    final static String string12 = Const.strIntern("doNumberVars");
    final static String string13 = Const.strIntern("gets");
    final static String string14 = Const.strIntern("puts");
    final static String string15 = Const.strIntern("    mach.updateCUTB();");
    final static String string16 = Const.strIntern("nullifyaregs");
    final static String string17 = Const.strIntern("    return ");
    final static String string18 = Const.strIntern("bodycont");
    final static String string19 = Const.strIntern(";");
    final static String string20 = Const.strIntern("[]");
    final static Int posint2 = JpFactory.Long(2);
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_printPredExecCode_7 extends Code {
    private final pred_printPredExecCode_7_consts consts;

    public pred_printPredExecCode_7() {
        consts = new pred_printPredExecCode_7_consts();
        initAlternatives();
    }

    protected pred_printPredExecCode_7(pred_printPredExecCode_7 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_printPredExecCode_7_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.is3cont = mach.loadPred("is", 2);
    }

    @Override
    public int arity() {
        return 7;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[7];
        Term areg6 = local_aregs[6].dref();
        Term areg5 = local_aregs[5].dref();
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
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
        if (!(areg5.unify(var6)))
            return mach.Fail0;
        if (!(areg6.unify(var7)))
            return mach.Fail0;
        local_aregs[0] = var8;
        local_aregs[1] = JpFactory.S(getConsts().string3, var1.dref(), getConsts().posint2);
        local_aregs[2] = JpFactory.S(getConsts().string2, var9, JpFactory
                .S(getConsts().string3, var1.dref(), getConsts().posint1), JpFactory
                        .S(getConsts().string4, JpFactory.S(getConsts().string5, JpFactory
                                .CONST(getConsts().string6), JpFactory.S(getConsts().string5, JpFactory
                                        .S(getConsts().string7, JpFactory.CONST(getConsts().string8)), JpFactory
                                                .S(getConsts().string5, JpFactory
                                                        .CONST(getConsts().string9), JpFactory
                                                                .S(getConsts().string5, var9.dref(), JpFactory
                                                                        .S(getConsts().string5, JpFactory
                                                                                .CONST(getConsts().string10), JpFactory
                                                                                        .S(getConsts().string5, JpFactory
                                                                                                .S(getConsts().string7, JpFactory
                                                                                                        .CONST(getConsts().string8)), JpFactory
                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                        .S(getConsts().string11, var8
                                                                                                                                .dref()), JpFactory
                                                                                                                                        .S(getConsts().string5, JpFactory
                                                                                                                                                .S(getConsts().string12, var2
                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                        .S(getConsts().string13, var3
                                                                                                                                                                                .dref(), var5
                                                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                                                        .S(getConsts().string14, var4
                                                                                                                                                                                                                .dref(), var5
                                                                                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                        .CONST(getConsts().string15), JpFactory
                                                                                                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                .CONST(getConsts().string8)), JpFactory
                                                                                                                                                                                                                                                                        .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                                                                .S(getConsts().string16, var6
                                                                                                                                                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string17), JpFactory
                                                                                                                                                                                                                                                                                                                .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                                                                                                        .S(getConsts().string18, var6
                                                                                                                                                                                                                                                                                                                                .dref(), var7
                                                                                                                                                                                                                                                                                                                                        .dref(), var1
                                                                                                                                                                                                                                                                                                                                                .dref()), JpFactory
                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string19), JpFactory
                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string5, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string8)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string20)))))))))))))))))), continuation));
        mach.updateCUTB();
        local_aregs[7] = local_aregs[6] = local_aregs[5] = local_aregs[4] = local_aregs[3] = null;
        return getConsts().is3cont;

    }
}
