// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_comp_3_consts {
    Code entry_code;
    Code b_setval3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("comp");
    final static String string2 = Const.strIntern("b_setval");
    final static String string3 = Const.strIntern("package");
    final static String string4 = Const.strIntern("module");
    final static String string5 = Const.strIntern("see");
    final static String string6 = Const.strIntern("doCompile");
    final static String string7 = Const.strIntern(".");
}

public class pred_comp_3 extends Code {
    private final pred_comp_3_consts consts;

    public pred_comp_3() {
        consts = new pred_comp_3_consts();
        initAlternatives();
    }

    protected pred_comp_3(pred_comp_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_comp_3_consts getConsts() {
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
        local_aregs[0] = JpFactory.CONST(getConsts().string3);
        local_aregs[1] = var2.dref();
        local_aregs[2] = JpFactory
                .S(getConsts().string2, JpFactory.CONST(getConsts().string4), var3.dref(), JpFactory
                        .S(getConsts().string5, var1.dref(), JpFactory
                                .S(getConsts().string6, JpFactory.CONST(getConsts().string7), var4, continuation)));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().b_setval3cont;

    }
}
