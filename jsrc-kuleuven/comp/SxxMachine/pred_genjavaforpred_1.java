// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_genjavaforpred_1_consts {
    Code entry_code;
    Code unify3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("genjavaforpred");
    final static String string2 = internS("unify");
    final static String string3 = internS(".");
    final static String string4 = internS("getPredHeader");
    final static String string5 = internS("functor");
    final static String string6 = internS("is");
    final static String string7 = internS("-");
    final static String string8 = internS("changeIllegalTerms");
    final static String string9 = internS("toJavaClassName");
    final static String string10 = internS("genFileName");
    final static String string11 = internS("getData");
    final static String string12 = internS("cut");
    final static String string13 = internS("shouldDisableIndexing");
    final static String string14 = internS("tell");
    final static String string15 = internS("prelude");
    final static String string16 = internS("printHeading");
    final static String string17 = internS("writel");
    final static String string18 = internS("printDataClass");
    final static String string19 = internS("public class ");
    final static String string20 = internS(" extends Code {");
    final static String string21 = internS("wr");
    final static String string22 = internS("nl");
    final static String string23 = internS("printMainConstruction");
    final static String string24 = internS("declforeachclause");
    final static String string25 = internS("  public void init(PredikatenPrologMachine mach) {");
    final static String string26 = internS("    consts.entry_code = this;");
    final static String string27 = internS("initforeachcontinuation");
    final static String string28 = internS("}");
    final static String string29 = internS("  @Override public int arity() { return ");
    final static String string30 = internS(" ; }");
    final static String string31 = internS("  @Override");
    final static String string32 = internS("  @SuppressWarnings(\"static-access\")");
    final static String string33 = internS("  public Code exec(PrologMachine mach) {");
    final static String string34 = internS("printMainExec");
    final static String string35 = internS("[]");
    final static String string36 = internS("checkClauses");
    final static String string37 = internS("told");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_genjavaforpred_1 extends Code {
    private final pred_genjavaforpred_1_consts consts;

    public pred_genjavaforpred_1() {
        consts = new pred_genjavaforpred_1_consts();
        initAlternatives();
    }

    protected pred_genjavaforpred_1(pred_genjavaforpred_1 c) {
        consts = c.getConsts();
    }

    protected final pred_genjavaforpred_1_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.unify3cont = mach.loadPred("unify", 2);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var14 = Jv(mach);
        final Term var13 = Jv(mach);
        final Term var12 = Jv(mach);
        final Term var11 = Jv(mach);
        final Term var10 = Jv(mach);
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

        local_aregs[0] = S(pred_genjavaforpred_1_consts.string3, var2, var3);
        local_aregs[1] = var1.dref();

        local_aregs[2] = S(pred_genjavaforpred_1_consts.string4, var2
                .dref(), var4, var5, S(pred_genjavaforpred_1_consts.string5, var4
                        .dref(), var6, var7, S(pred_genjavaforpred_1_consts.string6, var8, S(pred_genjavaforpred_1_consts.string7, var7
                                .dref(), pred_genjavaforpred_1_consts.posint1), S(pred_genjavaforpred_1_consts.string8, var9, var6
                                        .dref(), S(pred_genjavaforpred_1_consts.string9, var9.dref(), var8
                                                .dref(), var10, S(pred_genjavaforpred_1_consts.string10, var10
                                                        .dref(), var11, S(pred_genjavaforpred_1_consts.string11, var1
                                                                .dref(), var12, var13, var14, S(pred_genjavaforpred_1_consts.string0, new HeapChoice(
                                                                        mach.getCUTB()), S(pred_genjavaforpred_1_consts.string13, var10
                                                                                .dref(), var6.dref(), var8.dref(), var1
                                                                                        .dref(), S(pred_genjavaforpred_1_consts.string14, var11
                                                                                                .dref(), S(pred_genjavaforpred_1_consts.string15, S(pred_genjavaforpred_1_consts.string0, new HeapChoice(
                                                                                                        mach.getCUTB()), S(pred_genjavaforpred_1_consts.string16, S(pred_genjavaforpred_1_consts.string17, S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string18, var10
                                                                                                                .dref(), var12
                                                                                                                        .dref(), var9
                                                                                                                                .dref(), var7
                                                                                                                                        .dref(), var13
                                                                                                                                                .dref(), var14
                                                                                                                                                        .dref()), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string19), S(pred_genjavaforpred_1_consts.string3, var10
                                                                                                                                                                .dref(), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string20), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string23, var10
                                                                                                                                                                        .dref()), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string24, var1
                                                                                                                                                                                .dref(), pred_genjavaforpred_1_consts.posint1, var10
                                                                                                                                                                                        .dref()), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string25), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string26), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string27, var12
                                                                                                                                                                                                .dref(), var9
                                                                                                                                                                                                        .dref(), var7
                                                                                                                                                                                                                .dref()), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string28), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string29), S(pred_genjavaforpred_1_consts.string3, var8
                                                                                                                                                                                                                        .dref(), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string30), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string31), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string32), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string33), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string34, var1
                                                                                                                                                                                                                                .dref(), var7
                                                                                                                                                                                                                                        .dref(), var13
                                                                                                                                                                                                                                                .dref()), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string28), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, CONST(pred_genjavaforpred_1_consts.string28), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), S(pred_genjavaforpred_1_consts.string3, S(pred_genjavaforpred_1_consts.string21, CONST(pred_genjavaforpred_1_consts.string22)), CONST(pred_genjavaforpred_1_consts.string35))))))))))))))))))))))))))))))))), S(pred_genjavaforpred_1_consts.string36, var1
                                                                                                                                                                                                                                                        .dref(), var10
                                                                                                                                                                                                                                                                .dref(), var13
                                                                                                                                                                                                                                                                        .dref(), S(pred_genjavaforpred_1_consts.string37, S(pred_genjavaforpred_1_consts.string0, new HeapChoice(
                                                                                                                                                                                                                                                                                mach.getCUTB()), continuation)))))))))))))))));
        mach.updateCUTB();
        return getConsts().unify3cont;

    }
}
