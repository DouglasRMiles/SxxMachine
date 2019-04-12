// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_printMainConstruction_1_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("printMainConstruction");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("private final ");
    final static String string5 = internS("_consts consts;");
    final static String string6 = internS("wr");
    final static String string7 = internS("nl");
    final static String string8 = internS("public ");
    final static String string9 = internS("(){");
    final static String string10 = internS("  consts = new ");
    final static String string11 = internS("_consts();");
    final static String string12 = internS("  initAlternatives();");
    final static String string13 = internS("}");
    final static String string14 = internS("protected ");
    final static String string15 = internS("(");
    final static String string16 = internS(" c){");
    final static String string17 = internS("  consts = c.getConsts();");
    final static String string18 = internS("  ALT = null;");
    final static String string19 = internS("protected final ");
    final static String string20 = internS("_consts getConsts() { return consts; }");
    final static String string21 = internS("[]");
}

public class pred_printMainConstruction_1 extends Code {
    private final pred_printMainConstruction_1_consts consts;

    public pred_printMainConstruction_1() {
        consts = new pred_printMainConstruction_1_consts();
        initAlternatives();
    }

    protected pred_printMainConstruction_1(pred_printMainConstruction_1 c) {
        consts = c.getConsts();
    }

    protected final pred_printMainConstruction_1_consts getConsts() {
        return consts;
    }

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
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;

        local_aregs.setAV(0,S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string4), S(pred_printMainConstruction_1_consts.string3, var1
                .dref(), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string5), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string8), S(pred_printMainConstruction_1_consts.string3, var1
                        .dref(), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string9), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string10), S(pred_printMainConstruction_1_consts.string3, var1
                                .dref(), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string11), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string12), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string13), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string14), S(pred_printMainConstruction_1_consts.string3, var1
                                        .dref(), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string15), S(pred_printMainConstruction_1_consts.string3, var1
                                                .dref(), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string16), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string17), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string18), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string13), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string19), S(pred_printMainConstruction_1_consts.string3, var1
                                                        .dref(), S(pred_printMainConstruction_1_consts.string3, CONST(pred_printMainConstruction_1_consts.string20), S(pred_printMainConstruction_1_consts.string3, S(pred_printMainConstruction_1_consts.string6, CONST(pred_printMainConstruction_1_consts.string7)), CONST(pred_printMainConstruction_1_consts.string21))))))))))))))))))))))))))))))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return getConsts().writel2cont;

    }
}
