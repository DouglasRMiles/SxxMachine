// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_genmodule_1_consts {
    Code entry_code;
    Code modulename2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("genmodule");
    final static String string2 = Const.strIntern("modulename");
    final static String string3 = Const.strIntern("modulefile");
    final static String string4 = Const.strIntern("tell");
    final static String string5 = Const.strIntern("prelude");
    final static String string6 = Const.strIntern("writel");
    final static String string7 = Const.strIntern(".");
    final static String string8 = Const.strIntern("wr");
    final static String string9 = Const.strIntern("package");
    final static String string10 = Const.strIntern("import SxxMachine.*;");
    final static String string11 = Const.strIntern("nl");
    final static String string12 = Const.strIntern("public class ");
    final static String string13 = Const.strIntern(" extends Module {");
    final static String string14 = Const.strIntern("{ this.codes = new Code[] {");
    final static String string15 = Const.strIntern("codeforeachpred");
    final static String string16 = Const.strIntern("};");
    final static String string17 = Const.strIntern("  this.functors = new String[]{");
    final static String string18 = Const.strIntern("functorforeachpred");
    final static String string19 = Const.strIntern("}");
    final static String string20 = Const.strIntern("[]");
    final static String string21 = Const.strIntern("told");
}

public class pred_genmodule_1 extends Code {
    private final pred_genmodule_1_consts consts;

    public pred_genmodule_1() {
        consts = new pred_genmodule_1_consts();
        initAlternatives();
    }

    protected pred_genmodule_1(pred_genmodule_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_genmodule_1_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.modulename2cont = mach.loadPred("modulename", 1);
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
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(getConsts().string3, var3, JpFactory
                .S(getConsts().string4, var3.dref(), JpFactory.S(getConsts().string5, JpFactory
                        .S(getConsts().string6, JpFactory.S(getConsts().string7, JpFactory
                                .S(getConsts().string8, JpFactory.CONST(getConsts().string9)), JpFactory
                                        .S(getConsts().string7, JpFactory.CONST(getConsts().string10), JpFactory
                                                .S(getConsts().string7, JpFactory.S(getConsts().string8, JpFactory
                                                        .CONST(getConsts().string11)), JpFactory
                                                                .S(getConsts().string7, JpFactory
                                                                        .S(getConsts().string8, JpFactory
                                                                                .CONST(getConsts().string11)), JpFactory
                                                                                        .S(getConsts().string7, JpFactory
                                                                                                .CONST(getConsts().string12), JpFactory
                                                                                                        .S(getConsts().string7, var2
                                                                                                                .dref(), JpFactory
                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                .CONST(getConsts().string13), JpFactory
                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                .S(getConsts().string8, JpFactory
                                                                                                                                                        .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                        .CONST(getConsts().string14), JpFactory
                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                        .S(getConsts().string8, JpFactory
                                                                                                                                                                                                .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                .S(getConsts().string15, var1
                                                                                                                                                                                                                        .dref()), JpFactory
                                                                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                        .CONST(getConsts().string16), JpFactory
                                                                                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                        .S(getConsts().string8, JpFactory
                                                                                                                                                                                                                                                                .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                .CONST(getConsts().string17), JpFactory
                                                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                .S(getConsts().string8, JpFactory
                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                        .S(getConsts().string18, var1
                                                                                                                                                                                                                                                                                                                                .dref()), JpFactory
                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string16), JpFactory
                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string8, JpFactory
                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string19), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string8, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string19), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string7, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                .S(getConsts().string8, JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                        .CONST(getConsts().string11)), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                .CONST(getConsts().string20))))))))))))))))))))))), JpFactory
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        .S(getConsts().string21, continuation)))));
        mach.updateCUTB();
        return getConsts().modulename2cont;

    }
}
