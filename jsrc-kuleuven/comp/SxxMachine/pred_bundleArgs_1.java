// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_bundleArgs_1_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("bundleArgs");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("    return new PrologObject[]{");
    final static String string5 = Const.strIntern("};");
    final static String string6 = Const.strIntern("[]");
    final static Int posint0 = JpFactory.Long(0);
}

public class pred_bundleArgs_1 extends Code {
    private final pred_bundleArgs_1_consts consts;

    public pred_bundleArgs_1() {
        consts = new pred_bundleArgs_1_consts();
        initAlternatives();
    }

    protected pred_bundleArgs_1(pred_bundleArgs_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_bundleArgs_1_consts getConsts() {
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
                .S(getConsts().string3, JpFactory
                        .S(getConsts().string1, getConsts().posint0, var1.dref()), JpFactory
                                .S(getConsts().string3, JpFactory.CONST(getConsts().string5), JpFactory
                                        .CONST(getConsts().string6))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return getConsts().writel2cont;

    }
}
