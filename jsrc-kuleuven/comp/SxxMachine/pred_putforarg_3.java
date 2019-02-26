// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_putforarg_3_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("putforarg");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("local_aregs[");
    final static String string5 = Const.strIntern("] = ");
    final static String string6 = Const.strIntern("constructterm");
    final static String string7 = Const.strIntern(" ;");
    final static String string8 = Const.strIntern("wr");
    final static String string9 = Const.strIntern("nl");
    final static String string10 = Const.strIntern("[]");
}

public class pred_putforarg_3 extends Code {
    private final pred_putforarg_3_consts consts;

    public pred_putforarg_3() {
        consts = new pred_putforarg_3_consts();
        initAlternatives();
    }

    protected pred_putforarg_3(pred_putforarg_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_putforarg_3_consts getConsts() {
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
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        if (!(areg2.unify(var3)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, var2.dref(), JpFactory.S(getConsts().string3, JpFactory
                        .CONST(getConsts().string5), JpFactory.S(getConsts().string3, JpFactory
                                .S(getConsts().string6, var1.dref(), var3.dref()), JpFactory
                                        .S(getConsts().string3, JpFactory.CONST(getConsts().string7), JpFactory
                                                .S(getConsts().string3, JpFactory.S(getConsts().string8, JpFactory
                                                        .CONST(getConsts().string9)), JpFactory
                                                                .CONST(getConsts().string10)))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return getConsts().writel2cont;

    }
}
