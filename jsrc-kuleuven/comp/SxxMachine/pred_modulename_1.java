// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

class pred_modulename_1_consts {
    Code entry_code;
    Code nb_current3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("modulename");
    final static String string2 = internS("nb_current");
    final static String string3 = internS("module");
}

public class pred_modulename_1 extends Code {
    private final pred_modulename_1_consts consts;

    public pred_modulename_1() {
        consts = new pred_modulename_1_consts();
        initAlternatives();
    }

    protected pred_modulename_1(pred_modulename_1 c) {
        consts = c.getConsts();
    }

    protected final pred_modulename_1_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
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

        local_aregs.setAreg0((CONST(pred_modulename_1_consts.string3)));
        local_aregs.setAreg1((var1.dref()));
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return getConsts().nb_current3cont;

    }
}
