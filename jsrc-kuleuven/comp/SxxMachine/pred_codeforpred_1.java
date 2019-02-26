// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_codeforpred_1_consts {
    Code entry_code;
    Code unify3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("codeforpred");
    final static String string2 = Const.strIntern("unify");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern(":-");
    final static String string5 = Const.strIntern("functor");
    final static String string6 = Const.strIntern("is");
    final static String string7 = Const.strIntern("-");
    final static String string8 = Const.strIntern("makename");
    final static String string9 = Const.strIntern("pred_");
    final static String string10 = Const.strIntern("_");
    final static String string11 = Const.strIntern("[]");
    final static String string12 = Const.strIntern("writel");
    final static String string13 = Const.strIntern("new ");
    final static String string14 = Const.strIntern("()");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_codeforpred_1 extends Code {
    private final pred_codeforpred_1_consts consts;

    public pred_codeforpred_1() {
        consts = new pred_codeforpred_1_consts();
        initAlternatives();
    }

    protected pred_codeforpred_1(pred_codeforpred_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_codeforpred_1_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.unify3cont = mach.loadPred("unify", 2);
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
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.S(getConsts().string4, var2, var3), var4);
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory
                .S(getConsts().string5, var2.dref(), var5, var6, JpFactory.S(getConsts().string6, var7, JpFactory
                        .S(getConsts().string7, var6.dref(), getConsts().posint1), JpFactory
                                .S(getConsts().string8, JpFactory.S(getConsts().string3, JpFactory
                                        .CONST(getConsts().string9), JpFactory.S(getConsts().string3, var5
                                                .dref(), JpFactory.S(getConsts().string3, JpFactory
                                                        .CONST(getConsts().string10), JpFactory
                                                                .S(getConsts().string3, var7.dref(), JpFactory
                                                                        .CONST(getConsts().string11))))), var8, JpFactory
                                                                                .S(getConsts().string12, JpFactory
                                                                                        .S(getConsts().string3, JpFactory
                                                                                                .CONST(getConsts().string13), JpFactory
                                                                                                        .S(getConsts().string3, var8
                                                                                                                .dref(), JpFactory
                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                .CONST(getConsts().string14), JpFactory
                                                                                                                                        .CONST(getConsts().string11)))), continuation))));
        mach.updateCUTB();
        return getConsts().unify3cont;

    }
}
