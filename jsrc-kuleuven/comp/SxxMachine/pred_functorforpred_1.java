// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

class pred_functorforpred_1_consts {
    Code entry_code;
    Code unify3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("functorforpred");
    final static String string2 = internS("unify");
    final static String string3 = internS(".");
    final static String string4 = internS(":-");
    final static String string5 = internS("functor");
    final static String string6 = internS("escapeFunctor");
    final static String string7 = internS("writel");
    final static String string8 = internS("\"");
    final static String string9 = internS("\".intern()");
    final static String string10 = internS("[]");
}

public class pred_functorforpred_1 extends Code {
    private final pred_functorforpred_1_consts consts;

    public pred_functorforpred_1() {
        consts = new pred_functorforpred_1_consts();
        initAlternatives();
    }

    protected pred_functorforpred_1(pred_functorforpred_1 c) {
        consts = c.getConsts();
    }

    protected final pred_functorforpred_1_consts getConsts() {
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
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;

        local_aregs.setAreg0((S(pred_functorforpred_1_consts.string3, S(pred_functorforpred_1_consts.string4, var2, var3), var4)));
        local_aregs.setAreg1((var1.dref()));

        local_aregs.setAreg2((S(pred_functorforpred_1_consts.string5, var2
                .dref(), var5, var6, S(pred_functorforpred_1_consts.string6, var5
                        .dref(), var7, S(pred_functorforpred_1_consts.string7, S(pred_functorforpred_1_consts.string3, CONST(pred_functorforpred_1_consts.string8), S(pred_functorforpred_1_consts.string3, var7
                                .dref(), S(pred_functorforpred_1_consts.string3, CONST(pred_functorforpred_1_consts.string9), CONST(pred_functorforpred_1_consts.string10)))), continuation)))));
        mach.updateCUTB();
        return getConsts().unify3cont;

    }
}
