// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_make_disj_pred_5_consts {
    Code entry_code;
    Code inc3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("make_disj_pred");
    final static String string2 = internS("/");
    final static String string3 = internS("inc");
    final static String string4 = internS("concat_atom");
    final static String string5 = internS(".");
    final static String string6 = internS("_disj_");
    final static String string7 = internS("[]");
    final static String string8 = internS("univ");
}

public class pred_make_disj_pred_5 extends Code {
    private final pred_make_disj_pred_5_consts consts;

    public pred_make_disj_pred_5() {
        consts = new pred_make_disj_pred_5_consts();
        initAlternatives();
    }

    protected pred_make_disj_pred_5(pred_make_disj_pred_5 c) {
        consts = c.getConsts();
    }

    protected final pred_make_disj_pred_5_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.inc3cont = mach.loadPred("inc", 2);
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
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_make_disj_pred_5_consts.string2, var1, var2))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3)))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4)))
            return mach.Fail0;
        if (!(areg3.unifyJP(var5)))
            return mach.Fail0;
        if (!(areg4.unifyJP(var6)))
            return mach.Fail0;
        local_aregs[0] = var5.dref();
        local_aregs[1] = var4.dref();

        local_aregs[2] = S(pred_make_disj_pred_5_consts.string4, S(pred_make_disj_pred_5_consts.string5, var1
                .dref(), S(pred_make_disj_pred_5_consts.string5, var2
                        .dref(), S(pred_make_disj_pred_5_consts.string5, CONST(pred_make_disj_pred_5_consts.string6), S(pred_make_disj_pred_5_consts.string5, var4
                                .dref(), CONST(pred_make_disj_pred_5_consts.string7))))), var7, S(pred_make_disj_pred_5_consts.string8, var6
                                        .dref(), var7.dref(), var3.dref(), continuation));
        mach.updateCUTB();
        local_aregs[5] = local_aregs[4] = local_aregs[3] = null;
        return getConsts().inc3cont;

    }
}
