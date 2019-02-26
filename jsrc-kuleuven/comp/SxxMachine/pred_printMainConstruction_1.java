// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_printMainConstruction_1_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("printMainConstruction");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("private final ");
    final static String string5 = Const.strIntern("_consts consts;");
    final static String string6 = Const.strIntern("wr");
    final static String string7 = Const.strIntern("nl");
    final static String string8 = Const.strIntern("public ");
    final static String string9 = Const.strIntern("(){");
    final static String string10 = Const.strIntern("  consts = new ");
    final static String string11 = Const.strIntern("_consts();");
    final static String string12 = Const.strIntern("  initAlternatives();");
    final static String string13 = Const.strIntern("}");
    final static String string14 = Const.strIntern("protected ");
    final static String string15 = Const.strIntern("(");
    final static String string16 = Const.strIntern(" c){");
    final static String string17 = Const.strIntern("  consts = c.getConsts();");
    final static String string18 = Const.strIntern("  ALT = null;");
    final static String string19 = Const.strIntern("protected final ");
    final static String string20 = Const.strIntern("_consts getConsts() { return consts; }");
    final static String string21 = Const.strIntern("[]");
}

public class pred_printMainConstruction_1 extends Code {
    private final pred_printMainConstruction_1_consts consts;

    public pred_printMainConstruction_1() {
        consts = new pred_printMainConstruction_1_consts();
        initAlternatives();
    }

    protected pred_printMainConstruction_1(pred_printMainConstruction_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_printMainConstruction_1_consts getConsts() {
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
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, var1.dref(), JpFactory.S(getConsts().string3, JpFactory
                        .CONST(getConsts().string5), JpFactory.S(getConsts().string3, JpFactory
                                .S(getConsts().string6, JpFactory.CONST(getConsts().string7)), JpFactory
                                        .S(getConsts().string3, JpFactory.CONST(getConsts().string8), JpFactory
                                                .S(getConsts().string3, var1.dref(), JpFactory
                                                        .S(getConsts().string3, JpFactory
                                                                .CONST(getConsts().string9), JpFactory
                                                                        .S(getConsts().string3, JpFactory
                                                                                .S(getConsts().string6, JpFactory
                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                .S(getConsts().string3, JpFactory
                                                                                                        .CONST(getConsts().string10), JpFactory
                                                                                                                .S(getConsts().string3, var1
                                                                                                                        .dref(), JpFactory
                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                        .CONST(getConsts().string11), JpFactory
                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                        .S(getConsts().string6, JpFactory
                                                                                                                                                                .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                .CONST(getConsts().string12), JpFactory
                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                .S(getConsts().string6, JpFactory
                                                                                                                                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                        .CONST(getConsts().string13), JpFactory
                                                                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                        .S(getConsts().string6, JpFactory
                                                                                                                                                                                                                                                .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                .CONST(getConsts().string14), JpFactory
                                                                                                                                                                                                                                                                        .S(getConsts().string3, var1
                                                                                                                                                                                                                                                                                .dref(), JpFactory
                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                .CONST(getConsts().string15), JpFactory
                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, var1
                                                                                                                                                                                                                                                                                                                .dref(), JpFactory
                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string16), JpFactory
                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string6, JpFactory
                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string17), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string6, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string18), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string6, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string13), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string6, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string19), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, var1
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .dref(), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string20), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string6, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string21)))))))))))))))))))))))))))))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return getConsts().writel2cont;

    }
}
