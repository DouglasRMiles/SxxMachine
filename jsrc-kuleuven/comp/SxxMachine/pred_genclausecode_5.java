// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_genclausecode_5_consts {
    Code entry_code;
    Code getPredHeader4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("genclausecode");
    final static String string2 = internS("getPredHeader");
    final static String string3 = internS("functor");
    final static String string4 = internS("is");
    final static String string5 = internS("-");
    final static String string6 = internS("arg");
    final static String string7 = internS("continuation");
    final static String string8 = internS("unify");
    final static String string9 = internS("mynumbervars");
    final static String string10 = internS("writel");
    final static String string11 = internS(".");
    final static String string12 = internS("class ");
    final static String string13 = internS("_");
    final static String string14 = internS(" extends ");
    final static String string15 = internS(" {");
    final static String string16 = internS("wr");
    final static String string17 = internS("nl");
    final static String string18 = internS("printClauseConstructor");
    final static String string19 = internS("printMethodForIndexing");
    final static String string20 = internS("printPredExec");
    final static String string21 = internS("}");
    final static String string22 = internS("[]");
    final static String string23 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_genclausecode_5 extends Code {
    private final pred_genclausecode_5_consts consts;

    public pred_genclausecode_5() {
        consts = new pred_genclausecode_5_consts();
        initAlternatives();
    }

    protected pred_genclausecode_5(pred_genclausecode_5 c) {
        consts = c.getConsts();
    }

    protected final pred_genclausecode_5_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.getPredHeader4cont = mach.loadPred("getPredHeader", 3);
    }

    @Override
    public int arity() {
        return 5;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[5];
        final Term areg4 = local_aregs[4].dref();
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
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
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        if (!(areg2.unify(var3)))
            return mach.Fail0;
        if (!(areg3.unify(var4)))
            return mach.Fail0;
        if (!(areg4.unify(var5)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var6;
        local_aregs[2] = var7;

        local_aregs[3] = S(pred_genclausecode_5_consts.string3, var6
                .dref(), var8, var9, S(pred_genclausecode_5_consts.string4, var10, S(pred_genclausecode_5_consts.string5, var9
                        .dref(), pred_genclausecode_5_consts.posint1), S(pred_genclausecode_5_consts.string6, var9
                                .dref(), var6.dref(), S(pred_genclausecode_5_consts.string7, var9
                                        .dref()), S(pred_genclausecode_5_consts.string8, var1
                                                .dref(), var11, S(pred_genclausecode_5_consts.string2, var11
                                                        .dref(), var12, var13, S(pred_genclausecode_5_consts.string9, var11
                                                                .dref(), pred_genclausecode_5_consts.posint1, var14, S(pred_genclausecode_5_consts.string10, S(pred_genclausecode_5_consts.string11, CONST(pred_genclausecode_5_consts.string12), S(pred_genclausecode_5_consts.string11, var3
                                                                        .dref(), S(pred_genclausecode_5_consts.string11, CONST(pred_genclausecode_5_consts.string13), S(pred_genclausecode_5_consts.string11, var4
                                                                                .dref(), S(pred_genclausecode_5_consts.string11, CONST(pred_genclausecode_5_consts.string14), S(pred_genclausecode_5_consts.string11, var3
                                                                                        .dref(), S(pred_genclausecode_5_consts.string11, CONST(pred_genclausecode_5_consts.string15), S(pred_genclausecode_5_consts.string11, S(pred_genclausecode_5_consts.string16, CONST(pred_genclausecode_5_consts.string17)), S(pred_genclausecode_5_consts.string11, S(pred_genclausecode_5_consts.string18, var3
                                                                                                .dref(), var4
                                                                                                        .dref()), S(pred_genclausecode_5_consts.string11, S(pred_genclausecode_5_consts.string19, var14
                                                                                                                .dref(), var12
                                                                                                                        .dref(), var5
                                                                                                                                .dref(), var10
                                                                                                                                        .dref()), S(pred_genclausecode_5_consts.string11, S(pred_genclausecode_5_consts.string20, var9
                                                                                                                                                .dref(), var14
                                                                                                                                                        .dref(), var12
                                                                                                                                                                .dref(), var13
                                                                                                                                                                        .dref(), var5
                                                                                                                                                                                .dref(), var1
                                                                                                                                                                                        .dref(), var8
                                                                                                                                                                                                .dref()), S(pred_genclausecode_5_consts.string11, CONST(pred_genclausecode_5_consts.string21), S(pred_genclausecode_5_consts.string11, S(pred_genclausecode_5_consts.string16, CONST(pred_genclausecode_5_consts.string17)), S(pred_genclausecode_5_consts.string11, S(pred_genclausecode_5_consts.string16, CONST(pred_genclausecode_5_consts.string17)), CONST(pred_genclausecode_5_consts.string22))))))))))))))), S(pred_genclausecode_5_consts.string0, new HeapChoice(
                                                                                                                                                                                                        mach.getCUTB()), continuation))))))));
        mach.updateCUTB();
        local_aregs[5] = local_aregs[4] = null;
        return getConsts().getPredHeader4cont;

    }
}
