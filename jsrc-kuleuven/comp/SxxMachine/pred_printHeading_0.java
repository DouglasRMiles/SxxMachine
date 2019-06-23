// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

class pred_printHeading_0_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("printHeading");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("wr");
    final static String string5 = internS("package");
    final static String string6 = internS("printImport");
    final static String string7 = internS("SxxMachine");
    final static String string8 = internS("java.util");
    final static String string9 = internS("[]");
}

public class pred_printHeading_0 extends Code {
    private final pred_printHeading_0_consts consts;

    public pred_printHeading_0() {
        consts = new pred_printHeading_0_consts();
        initAlternatives();
    }

    protected pred_printHeading_0(pred_printHeading_0 c) {
        consts = c.getConsts();
    }

    protected final pred_printHeading_0_consts getConsts() {
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
        return 0;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 0);

        local_aregs.setAreg0((S(pred_printHeading_0_consts.string3, S(pred_printHeading_0_consts.string4, CONST(pred_printHeading_0_consts.string5)), S(pred_printHeading_0_consts.string3, S(pred_printHeading_0_consts.string6, CONST(pred_printHeading_0_consts.string7)), S(pred_printHeading_0_consts.string3, S(pred_printHeading_0_consts.string6, CONST(pred_printHeading_0_consts.string8)), CONST(pred_printHeading_0_consts.string9))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return getConsts().writel2cont;

    }
}
