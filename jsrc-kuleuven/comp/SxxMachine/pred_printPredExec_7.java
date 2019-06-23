// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

class pred_printPredExec_7_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("printPredExec");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("  @Override");
    final static String string5 = internS("wr");
    final static String string6 = internS("nl");
    final static String string7 = internS("  @SuppressWarnings(\"static-access\")");
    final static String string8 = internS("  public Code exec(PrologMachine mach) {");
    final static String string9 = internS("printPredExecCode");
    final static String string10 = internS("  }");
    final static String string11 = internS("[]");
}

public class pred_printPredExec_7 extends Code {
    private final pred_printPredExec_7_consts consts;

    public pred_printPredExec_7() {
        consts = new pred_printPredExec_7_consts();
        initAlternatives();
    }

    protected pred_printPredExec_7(pred_printPredExec_7 c) {
        consts = c.getConsts();
    }

    protected final pred_printPredExec_7_consts getConsts() {
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
        return 7;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 7);
        final Term areg6 = local_aregs.getTermDRef(6);
        final Term areg5 = local_aregs.getTermDRef(5);
        final Term areg4 = local_aregs.getTermDRef(4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3)))
            return mach.Fail0;
        if (!(areg3.unifyJP(var4)))
            return mach.Fail0;
        if (!(areg4.unifyJP(var5)))
            return mach.Fail0;
        if (!(areg5.unifyJP(var6)))
            return mach.Fail0;
        if (!(areg6.unifyJP(var7)))
            return mach.Fail0;

        local_aregs.setAreg0((S(pred_printPredExec_7_consts.string3, CONST(pred_printPredExec_7_consts.string4), S(pred_printPredExec_7_consts.string3, S(pred_printPredExec_7_consts.string5, CONST(pred_printPredExec_7_consts.string6)), S(pred_printPredExec_7_consts.string3, CONST(pred_printPredExec_7_consts.string7), S(pred_printPredExec_7_consts.string3, S(pred_printPredExec_7_consts.string5, CONST(pred_printPredExec_7_consts.string6)), S(pred_printPredExec_7_consts.string3, CONST(pred_printPredExec_7_consts.string8), S(pred_printPredExec_7_consts.string3, S(pred_printPredExec_7_consts.string5, CONST(pred_printPredExec_7_consts.string6)), S(pred_printPredExec_7_consts.string3, S(pred_printPredExec_7_consts.string9, var1
                .dref(), var2.dref(), var3.dref(), var4.dref(), var5.dref(), var6.dref(), var7
                        .dref()), S(pred_printPredExec_7_consts.string3, CONST(pred_printPredExec_7_consts.string10), S(pred_printPredExec_7_consts.string3, S(pred_printPredExec_7_consts.string5, CONST(pred_printPredExec_7_consts.string6)), CONST(pred_printPredExec_7_consts.string11))))))))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 7, 2);
        return getConsts().writel2cont;

    }
}
