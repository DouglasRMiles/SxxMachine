// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

class pred_comp_2_consts {
    Code entry_code;
    Code comp4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("comp");
    final static String string2 = internS("NewModule");
}

public class pred_comp_2 extends Code {
    private final pred_comp_2_consts consts;

    public pred_comp_2() {
        consts = new pred_comp_2_consts();
        initAlternatives();
    }

    protected pred_comp_2(pred_comp_2 c) {
        consts = c.getConsts();
    }

    protected final pred_comp_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.comp4cont = mach.loadPred("comp", 3);
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
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1)))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var2.dref());

        local_aregs.setAV(2,CONST(pred_comp_2_consts.string2));
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().comp4cont;

    }
}
