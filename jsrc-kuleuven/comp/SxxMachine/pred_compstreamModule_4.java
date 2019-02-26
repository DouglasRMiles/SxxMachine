// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_compstreamModule_4_consts {
    Code entry_code;
    Code b_setval3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("compstreamModule");
    final static String string2 = Const.strIntern("b_setval");
    final static String string3 = Const.strIntern("package");
    final static String string4 = Const.strIntern("module");
    final static String string5 = Const.strIntern("useInputStream");
    final static String string6 = Const.strIntern("input");
    final static String string7 = Const.strIntern("doCompiler");
    final static String string8 = Const.strIntern("genmodule");
}

public class pred_compstreamModule_4 extends Code {
    private final pred_compstreamModule_4_consts consts;

    public pred_compstreamModule_4() {
        consts = new pred_compstreamModule_4_consts();
        initAlternatives();
    }

    protected pred_compstreamModule_4(pred_compstreamModule_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_compstreamModule_4_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.b_setval3cont = mach.loadPred("b_setval", 2);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
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
        local_aregs[0] = JpFactory.CONST(getConsts().string3);
        local_aregs[1] = var3.dref();
        local_aregs[2] = JpFactory
                .S(getConsts().string2, JpFactory.CONST(getConsts().string4), var4.dref(), JpFactory
                        .S(getConsts().string5, JpFactory.CONST(getConsts().string6), var1.dref(), JpFactory
                                .S(getConsts().string7, var2.dref(), var5, JpFactory
                                        .S(getConsts().string8, var5.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = null;
        return getConsts().b_setval3cont;

    }
}
