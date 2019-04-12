// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

class pred_escapeChars_2_consts {
    Code entry_code;
    Code escapeChars24cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("escapeChars");
    final static String string2 = internS("escapeChars2");
    final static String string3 = internS("[]");
}

public class pred_escapeChars_2 extends Code {
    private final pred_escapeChars_2_consts consts;

    public pred_escapeChars_2() {
        consts = new pred_escapeChars_2_consts();
        initAlternatives();
    }

    protected pred_escapeChars_2(pred_escapeChars_2 c) {
        consts = c.getConsts();
    }

    protected final pred_escapeChars_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.escapeChars24cont = mach.loadPred("escapeChars2", 3);
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
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());

        local_aregs.setAV(1,CONST(pred_escapeChars_2_consts.string3));
        local_aregs.setAV(2,var2.dref());
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().escapeChars24cont;

    }
}
