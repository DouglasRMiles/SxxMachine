// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_make_disj_pred_5_consts {
    Code entry_code;
    Code inc3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("make_disj_pred");
    final static String string2 = Const.strIntern("/");
    final static String string3 = Const.strIntern("inc");
    final static String string4 = Const.strIntern("concat_atom");
    final static String string5 = Const.strIntern(".");
    final static String string6 = Const.strIntern("_disj_");
    final static String string7 = Const.strIntern("[]");
    final static String string8 = Const.strIntern("univ");
}

public class pred_make_disj_pred_5 extends Code {
    private final pred_make_disj_pred_5_consts consts;

    public pred_make_disj_pred_5() {
        consts = new pred_make_disj_pred_5_consts();
        initAlternatives();
    }

    protected pred_make_disj_pred_5(pred_make_disj_pred_5 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_make_disj_pred_5_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.inc3cont = mach.loadPred("inc", 2);
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
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1, var2))))
            return mach.Fail0;
        if (!(areg1.unify(var3)))
            return mach.Fail0;
        if (!(areg2.unify(var4)))
            return mach.Fail0;
        if (!(areg3.unify(var5)))
            return mach.Fail0;
        if (!(areg4.unify(var6)))
            return mach.Fail0;
        local_aregs[0] = var5.dref();
        local_aregs[1] = var4.dref();
        local_aregs[2] = JpFactory.S(getConsts().string4, JpFactory
                .S(getConsts().string5, var1.dref(), JpFactory.S(getConsts().string5, var2.dref(), JpFactory
                        .S(getConsts().string5, JpFactory.CONST(getConsts().string6), JpFactory
                                .S(getConsts().string5, var4.dref(), JpFactory
                                        .CONST(getConsts().string7))))), var7, JpFactory
                                                .S(getConsts().string8, var6.dref(), var7.dref(), var3
                                                        .dref(), continuation));
        mach.updateCUTB();
        local_aregs[5] = local_aregs[4] = local_aregs[3] = null;
        return getConsts().inc3cont;

    }
}
