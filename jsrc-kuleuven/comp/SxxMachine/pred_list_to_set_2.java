// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

class pred_list_to_set_2_consts {
    Code entry_code;
    Code list_to_set4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("list_to_set");
    final static String string2 = internS("[]");
}

public class pred_list_to_set_2 extends Code {
    private final pred_list_to_set_2_consts consts;

    public pred_list_to_set_2() {
        consts = new pred_list_to_set_2_consts();
        initAlternatives();
    }

    protected pred_list_to_set_2(pred_list_to_set_2 c) {
        consts = c.getConsts();
    }

    protected final pred_list_to_set_2_consts getConsts() {
        return consts;
    }

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.list_to_set4cont = mach.loadPred("list_to_set", 3);
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
        local_aregs.setAreg0((var1.dref()));
        local_aregs.setAreg1((var2.dref()));

        local_aregs.setAreg2((CONST(pred_list_to_set_2_consts.string2)));
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().list_to_set4cont;

    }
}
