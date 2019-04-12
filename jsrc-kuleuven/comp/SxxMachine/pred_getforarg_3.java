// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

class pred_getforarg_3_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("getforarg");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("    if (!(areg");
    final static String string5 = internS(".unify(");
    final static String string6 = internS("constructterm");
    final static String string7 = internS("))) return mach.Fail0 ;");
    final static String string8 = internS("wr");
    final static String string9 = internS("nl");
    final static String string10 = internS("[]");
}

public class pred_getforarg_3 extends Code {
    private final pred_getforarg_3_consts consts;

    public pred_getforarg_3() {
        consts = new pred_getforarg_3_consts();
        initAlternatives();
    }

    protected pred_getforarg_3(pred_getforarg_3 c) {
        consts = c.getConsts();
    }

    protected final pred_getforarg_3_consts getConsts() {
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
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3)))
            return mach.Fail0;

        local_aregs.setAV(0,S(pred_getforarg_3_consts.string3, CONST(pred_getforarg_3_consts.string4), S(pred_getforarg_3_consts.string3, var2
                .dref(), S(pred_getforarg_3_consts.string3, CONST(pred_getforarg_3_consts.string5), S(pred_getforarg_3_consts.string3, S(pred_getforarg_3_consts.string6, var1
                        .dref(), var3
                                .dref()), S(pred_getforarg_3_consts.string3, CONST(pred_getforarg_3_consts.string7), S(pred_getforarg_3_consts.string3, S(pred_getforarg_3_consts.string8, CONST(pred_getforarg_3_consts.string9)), CONST(pred_getforarg_3_consts.string10))))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().writel2cont;

    }
}
