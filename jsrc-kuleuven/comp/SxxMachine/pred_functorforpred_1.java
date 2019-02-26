// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_functorforpred_1_consts {
    Code entry_code;
    Code unify3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("functorforpred");
    final static String string2 = Const.strIntern("unify");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern(":-");
    final static String string5 = Const.strIntern("functor");
    final static String string6 = Const.strIntern("escapeFunctor");
    final static String string7 = Const.strIntern("writel");
    final static String string8 = Const.strIntern("\"");
    final static String string9 = Const.strIntern("\".intern()");
    final static String string10 = Const.strIntern("[]");
}

public class pred_functorforpred_1 extends Code {
    private final pred_functorforpred_1_consts consts;

    public pred_functorforpred_1() {
        consts = new pred_functorforpred_1_consts();
        initAlternatives();
    }

    protected pred_functorforpred_1(pred_functorforpred_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_functorforpred_1_consts getConsts() {
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
        local_aregs[2] = JpFactory.S(getConsts().string5, var2.dref(), var5, var6, JpFactory
                .S(getConsts().string6, var5.dref(), var7, JpFactory.S(getConsts().string7, JpFactory
                        .S(getConsts().string3, JpFactory.CONST(getConsts().string8), JpFactory
                                .S(getConsts().string3, var7.dref(), JpFactory
                                        .S(getConsts().string3, JpFactory.CONST(getConsts().string9), JpFactory
                                                .CONST(getConsts().string10)))), continuation)));
        mach.updateCUTB();
        return getConsts().unify3cont;

    }
}
