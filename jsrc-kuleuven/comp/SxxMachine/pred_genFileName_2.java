// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_genFileName_2_consts {
    Code entry_code;
    Code nb_current3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("genFileName");
    final static String string2 = Const.strIntern("nb_current");
    final static String string3 = Const.strIntern("targetfolder");
    final static String string4 = Const.strIntern("makename");
    final static String string5 = Const.strIntern(".");
    final static String string6 = Const.strIntern("/");
    final static String string7 = Const.strIntern(".java");
    final static String string8 = Const.strIntern("[]");
}

public class pred_genFileName_2 extends Code {
    private final pred_genFileName_2_consts consts;

    public pred_genFileName_2() {
        consts = new pred_genFileName_2_consts();
        initAlternatives();
    }

    protected pred_genFileName_2(pred_genFileName_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_genFileName_2_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
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
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.CONST(getConsts().string3);
        local_aregs[1] = var3;
        local_aregs[2] = JpFactory
                .S(getConsts().string4, JpFactory.S(getConsts().string5, var3.dref(), JpFactory
                        .S(getConsts().string5, JpFactory.CONST(getConsts().string6), JpFactory
                                .S(getConsts().string5, var1.dref(), JpFactory.S(getConsts().string5, JpFactory
                                        .CONST(getConsts().string7), JpFactory.CONST(getConsts().string8))))), var2
                                                .dref(), continuation);
        mach.updateCUTB();
        return getConsts().nb_current3cont;

    }
}
