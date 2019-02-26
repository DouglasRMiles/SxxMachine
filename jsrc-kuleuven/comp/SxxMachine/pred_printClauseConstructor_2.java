// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_printClauseConstructor_2_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("printClauseConstructor");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("_");
    final static String string5 = Const.strIntern("(");
    final static String string6 = Const.strIntern(" consts){");
    final static String string7 = Const.strIntern("wr");
    final static String string8 = Const.strIntern("nl");
    final static String string9 = Const.strIntern("  super(consts);");
    final static String string10 = Const.strIntern("}");
    final static String string11 = Const.strIntern("[]");
}

public class pred_printClauseConstructor_2 extends Code {
    private final pred_printClauseConstructor_2_consts consts;

    public pred_printClauseConstructor_2() {
        consts = new pred_printClauseConstructor_2_consts();
        initAlternatives();
    }

    protected pred_printClauseConstructor_2(pred_printClauseConstructor_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_printClauseConstructor_2_consts getConsts() {
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
        return 2;
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
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, var1.dref(), JpFactory
                .S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                        .S(getConsts().string3, var2.dref(), JpFactory.S(getConsts().string3, JpFactory
                                .CONST(getConsts().string5), JpFactory.S(getConsts().string3, var1
                                        .dref(), JpFactory.S(getConsts().string3, JpFactory
                                                .CONST(getConsts().string6), JpFactory
                                                        .S(getConsts().string3, JpFactory
                                                                .S(getConsts().string7, JpFactory
                                                                        .CONST(getConsts().string8)), JpFactory
                                                                                .S(getConsts().string3, JpFactory
                                                                                        .CONST(getConsts().string9), JpFactory
                                                                                                .S(getConsts().string3, JpFactory
                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                .CONST(getConsts().string8)), JpFactory
                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                .CONST(getConsts().string10), JpFactory
                                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                        .CONST(getConsts().string8)), JpFactory
                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                .CONST(getConsts().string8)), JpFactory
                                                                                                                                                                                        .CONST(getConsts().string11)))))))))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().writel2cont;

    }
}
