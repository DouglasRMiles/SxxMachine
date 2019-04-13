// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_genmodule_1_consts {
    Code entry_code;
    Code modulename2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("genmodule");
    final static String string2 = internS("modulename");
    final static String string3 = internS("modulefile");
    final static String string4 = internS("tell");
    final static String string5 = internS("prelude");
    final static String string6 = internS("writel");
    final static String string7 = internS(".");
    final static String string8 = internS("wr");
    final static String string9 = internS("package");
    final static String string10 = internS("import SxxMachine.*;");
    final static String string11 = internS("nl");
    final static String string12 = internS("public class ");
    final static String string13 = internS(" extends Module {");
    final static String string14 = internS("{ this.codes = new Code[] {");
    final static String string15 = internS("codeforeachpred");
    final static String string16 = internS("};");
    final static String string17 = internS("  this.functors = new String[]{");
    final static String string18 = internS("functorforeachpred");
    final static String string19 = internS("}");
    final static String string20 = internS("[]");
    final static String string21 = internS("told");
}

public class pred_genmodule_1 extends Code {
    private final pred_genmodule_1_consts consts;

    public pred_genmodule_1() {
        consts = new pred_genmodule_1_consts();
        initAlternatives();
    }

    protected pred_genmodule_1(pred_genmodule_1 c) {
        consts = c.getConsts();
    }

    protected final pred_genmodule_1_consts getConsts() {
        return consts;
    }

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
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        local_aregs.setAreg0((var2));

        local_aregs.setAreg1((S(pred_genmodule_1_consts.string3, var3, S(pred_genmodule_1_consts.string4, var3
                .dref(), S(pred_genmodule_1_consts.string5, S(pred_genmodule_1_consts.string6, S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string9)), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string10), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string12), S(pred_genmodule_1_consts.string7, var2
                        .dref(), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string13), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string14), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string15, var1
                                .dref()), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string16), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string17), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string18, var1
                                        .dref()), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string16), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string19), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), S(pred_genmodule_1_consts.string7, CONST(pred_genmodule_1_consts.string19), S(pred_genmodule_1_consts.string7, S(pred_genmodule_1_consts.string8, CONST(pred_genmodule_1_consts.string11)), CONST(pred_genmodule_1_consts.string20))))))))))))))))))))))), S(pred_genmodule_1_consts.string21, continuation)))))));
        mach.updateCUTB();
        return getConsts().modulename2cont;

    }
}
