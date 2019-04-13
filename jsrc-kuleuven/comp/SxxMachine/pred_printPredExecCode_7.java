// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_printPredExecCode_7_consts {
    Code entry_code;
    Code is3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("printPredExecCode");
    final static String string2 = internS("is");
    final static String string3 = internS("-");
    final static String string4 = internS("writel");
    final static String string5 = internS(".");
    final static String string6 = internS("    PrologObject local_aregs[] = mach.getAreg();");
    final static String string7 = internS("wr");
    final static String string8 = internS("nl");
    final static String string9 = internS("    PrologObject continuation = local_aregs[");
    final static String string10 = internS("] ;");
    final static String string11 = internS("decl_deref_args");
    final static String string12 = internS("doNumberVars");
    final static String string13 = internS("gets");
    final static String string14 = internS("puts");
    final static String string15 = internS("    mach.updateCUTB();");
    final static String string16 = internS("nullifyaregs");
    final static String string17 = internS("    return ");
    final static String string18 = internS("bodycont");
    final static String string19 = internS(";");
    final static String string20 = internS("[]");
    final static NumberTerm posint2 = Integer(2);
    final static NumberTerm posint1 = Integer(1);
}

public class pred_printPredExecCode_7 extends Code {
    private final pred_printPredExecCode_7_consts consts;

    public pred_printPredExecCode_7() {
        consts = new pred_printPredExecCode_7_consts();
        initAlternatives();
    }

    protected pred_printPredExecCode_7(pred_printPredExecCode_7 c) {
        consts = c.getConsts();
    }

    protected final pred_printPredExecCode_7_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.is3cont = mach.loadPred("is", 2);
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
        final Term var9 = Jv(mach);
        final Term var8 = Jv(mach);
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
        local_aregs.setAreg0((var8));

        local_aregs.setAreg1((S(pred_printPredExecCode_7_consts.string3, var1
                .dref(), pred_printPredExecCode_7_consts.posint2)));

        local_aregs.setAreg2((S(pred_printPredExecCode_7_consts.string2, var9, S(pred_printPredExecCode_7_consts.string3, var1
                .dref(), pred_printPredExecCode_7_consts.posint1), S(pred_printPredExecCode_7_consts.string4, S(pred_printPredExecCode_7_consts.string5, CONST(pred_printPredExecCode_7_consts.string6), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string7, CONST(pred_printPredExecCode_7_consts.string8)), S(pred_printPredExecCode_7_consts.string5, CONST(pred_printPredExecCode_7_consts.string9), S(pred_printPredExecCode_7_consts.string5, var9
                        .dref(), S(pred_printPredExecCode_7_consts.string5, CONST(pred_printPredExecCode_7_consts.string10), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string7, CONST(pred_printPredExecCode_7_consts.string8)), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string11, var8
                                .dref()), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string12, var2
                                        .dref()), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string13, var3
                                                .dref(), var5
                                                        .dref()), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string14, var4
                                                                .dref(), var5
                                                                        .dref()), S(pred_printPredExecCode_7_consts.string5, CONST(pred_printPredExecCode_7_consts.string15), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string7, CONST(pred_printPredExecCode_7_consts.string8)), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string16, var6
                                                                                .dref()), S(pred_printPredExecCode_7_consts.string5, CONST(pred_printPredExecCode_7_consts.string17), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string18, var6
                                                                                        .dref(), var7.dref(), var1
                                                                                                .dref()), S(pred_printPredExecCode_7_consts.string5, CONST(pred_printPredExecCode_7_consts.string19), S(pred_printPredExecCode_7_consts.string5, S(pred_printPredExecCode_7_consts.string7, CONST(pred_printPredExecCode_7_consts.string8)), CONST(pred_printPredExecCode_7_consts.string20)))))))))))))))))), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 7, 3);
        return getConsts().is3cont;

    }
}
