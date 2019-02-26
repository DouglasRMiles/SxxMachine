// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_prelude_0_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("prelude");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("// Generated java file - release 0.2 - do not edit !");
    final static String string5 = Const.strIntern("wr");
    final static String string6 = Const.strIntern("nl");
    final static String string7 = Const.strIntern("// Copyright August 16, 1996, KUL and CUM");
    final static String string8 = Const.strIntern("// Authors: Bart Demoen and Paul Tarau");
    final static String string9 = Const.strIntern("[]");
}

public class pred_prelude_0 extends Code {
    private final pred_prelude_0_consts consts;

    public pred_prelude_0() {
        consts = new pred_prelude_0_consts();
        initAlternatives();
    }

    protected pred_prelude_0(pred_prelude_0 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_prelude_0_consts getConsts() {
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
        return 0;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[0];
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
                                                                                                        .S(getConsts().string5, JpFactory
                                                                                                                .CONST(getConsts().string6)), JpFactory
                                                                                                                        .CONST(getConsts().string9))))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return getConsts().writel2cont;

    }
}
