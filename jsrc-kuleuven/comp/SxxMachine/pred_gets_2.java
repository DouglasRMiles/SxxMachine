// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

class pred_gets_2_consts {
    Code entry_code;
    Code univ4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("gets");
    final static String string2 = internS("univ");
    final static NumberTerm posint0 = Integer(0);
}

public class pred_gets_2 extends Code {
    private final pred_gets_2_consts consts;

    public pred_gets_2() {
        consts = new pred_gets_2_consts();
        initAlternatives();
    }

    protected pred_gets_2(pred_gets_2 c) {
        consts = c.getConsts();
    }

    protected final pred_gets_2_consts getConsts() {
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
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        local_aregs.areg0 = (var1.dref());
        local_aregs.areg1 = (var3);
        local_aregs.areg2 = (var4);

        mach.setCont(local_aregs, 3, S(pred_gets_2_consts.string1, var4.dref(), pred_gets_2_consts.posint0, var2
                .dref(), continuation));
        mach.updateCUTB();
        return getConsts().univ4cont;

    }
}
