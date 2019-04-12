// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_codeforpred_1_consts {
    Code entry_code;
    Code unify3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("codeforpred");
    final static String string2 = internS("unify");
    final static String string3 = internS(".");
    final static String string4 = internS(":-");
    final static String string5 = internS("functor");
    final static String string6 = internS("is");
    final static String string7 = internS("-");
    final static String string8 = internS("makename");
    final static String string9 = internS("pred_");
    final static String string10 = internS("_");
    final static String string11 = internS("[]");
    final static String string12 = internS("writel");
    final static String string13 = internS("new ");
    final static String string14 = internS("()");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_codeforpred_1 extends Code {
    private final pred_codeforpred_1_consts consts;

    public pred_codeforpred_1() {
        consts = new pred_codeforpred_1_consts();
        initAlternatives();
    }

    protected pred_codeforpred_1(pred_codeforpred_1 c) {
        consts = c.getConsts();
    }

    protected final pred_codeforpred_1_consts getConsts() {
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
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
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

        local_aregs.areg0 = (S(pred_codeforpred_1_consts.string3, S(pred_codeforpred_1_consts.string4, var2, var3), var4));
        local_aregs.areg1 = (var1.dref());

        local_aregs.areg2 = (S(pred_codeforpred_1_consts.string5, var2
                .dref(), var5, var6, S(pred_codeforpred_1_consts.string6, var7, S(pred_codeforpred_1_consts.string7, var6
                        .dref(), pred_codeforpred_1_consts.posint1), S(pred_codeforpred_1_consts.string8, S(pred_codeforpred_1_consts.string3, CONST(pred_codeforpred_1_consts.string9), S(pred_codeforpred_1_consts.string3, var5
                                .dref(), S(pred_codeforpred_1_consts.string3, CONST(pred_codeforpred_1_consts.string10), S(pred_codeforpred_1_consts.string3, var7
                                        .dref(), CONST(pred_codeforpred_1_consts.string11))))), var8, S(pred_codeforpred_1_consts.string12, S(pred_codeforpred_1_consts.string3, CONST(pred_codeforpred_1_consts.string13), S(pred_codeforpred_1_consts.string3, var8
                                                .dref(), S(pred_codeforpred_1_consts.string3, CONST(pred_codeforpred_1_consts.string14), CONST(pred_codeforpred_1_consts.string11)))), continuation)))));
        mach.updateCUTB();
        return getConsts().unify3cont;

    }
}
