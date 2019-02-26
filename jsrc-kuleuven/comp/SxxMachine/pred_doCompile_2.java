// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_doCompile_2_consts {
    Code entry_code;
    Code use_module2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("doCompile");
    final static String string2 = Const.strIntern("use_module");
    final static String string3 = Const.strIntern("SxxMachine.BuiltinsModule");
    final static String string4 = Const.strIntern("globalvars.GlobalVarsModule");
    final static String string5 = Const.strIntern("b_setval");
    final static String string6 = Const.strIntern("targetfolder");
    final static String string7 = Const.strIntern("readprogram");
    final static String string8 = Const.strIntern("seen");
    final static String string9 = Const.strIntern("eliminate_disjuctions_in_clauses");
    final static String string10 = Const.strIntern("fixClauses");
    final static String string11 = Const.strIntern("unify");
    final static String string12 = Const.strIntern("[]");
    final static String string13 = Const.strIntern("binarize_clauses");
    final static String string14 = Const.strIntern("genjava");
}

public class pred_doCompile_2 extends Code {
    private final pred_doCompile_2_consts consts;

    public pred_doCompile_2() {
        consts = new pred_doCompile_2_consts();
        initAlternatives();
    }

    protected pred_doCompile_2(pred_doCompile_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_doCompile_2_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.use_module2cont = mach.loadPred("use_module", 1);
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
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.CONST(getConsts().string3);
        local_aregs[1] = JpFactory.S(getConsts().string2, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string5, JpFactory.CONST(getConsts().string6), var1.dref(), JpFactory
                        .S(getConsts().string7, var3, JpFactory.S(getConsts().string8, JpFactory
                                .S(getConsts().string9, var3.dref(), var4, JpFactory.S(getConsts().string10, var3
                                        .dref(), var5, JpFactory.S(getConsts().string11, JpFactory
                                                .CONST(getConsts().string12), var6, JpFactory
                                                        .S(getConsts().string13, var5.dref(), var6.dref(), var2
                                                                .dref(), JpFactory.S(getConsts().string14, var2
                                                                        .dref(), continuation)))))))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().use_module2cont;

    }
}
