// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

class pred_createArgs_2_consts {
    Code entry_code;
    Code univ4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("createArgs");
    final static String string2 = internS("univ");
    final static NumberTerm posint0 = Integer(0);
}

public class pred_createArgs_2 extends Code {
    private final pred_createArgs_2_consts consts;

    public pred_createArgs_2() {
        consts = new pred_createArgs_2_consts();
        initAlternatives();
    }

    protected pred_createArgs_2(pred_createArgs_2 c) {
        consts = c.getConsts();
    }

    protected final pred_createArgs_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var3);
        local_aregs.setAV(2,var4);

        mach.setCont(local_aregs, 3, S(pred_createArgs_2_consts.string1, var4
                .dref(), pred_createArgs_2_consts.posint0, var2.dref(), continuation));
        mach.updateCUTB();
        return getConsts().univ4cont;

    }
}
