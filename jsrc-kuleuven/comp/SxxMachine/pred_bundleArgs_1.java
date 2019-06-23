// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

class pred_bundleArgs_1_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("bundleArgs");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("    return new PrologObject[]{");
    final static String string5 = internS("};");
    final static String string6 = internS("[]");
    final static NumberTerm posint0 = Integer(0);
}

public class pred_bundleArgs_1 extends Code {
    private final pred_bundleArgs_1_consts consts;

    public pred_bundleArgs_1() {
        consts = new pred_bundleArgs_1_consts();
        initAlternatives();
    }

    protected pred_bundleArgs_1(pred_bundleArgs_1 c) {
        consts = c.getConsts();
    }

    protected final pred_bundleArgs_1_consts getConsts() {
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

        local_aregs.setAreg0((S(pred_bundleArgs_1_consts.string3, CONST(pred_bundleArgs_1_consts.string4), S(pred_bundleArgs_1_consts.string3, S(pred_bundleArgs_1_consts.string1, pred_bundleArgs_1_consts.posint0, var1
                .dref()), S(pred_bundleArgs_1_consts.string3, CONST(pred_bundleArgs_1_consts.string5), CONST(pred_bundleArgs_1_consts.string6))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return getConsts().writel2cont;

    }
}
