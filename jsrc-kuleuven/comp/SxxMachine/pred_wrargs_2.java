// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

class pred_wrargs_2_consts {
    //Code entry_code;
    Code wrargs4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("wrargs");
}

public class pred_wrargs_2 extends Code {
    static final pred_wrargs_2_consts consts = new pred_wrargs_2_consts();

    protected pred_wrargs_2(pred_wrargs_2 c) {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.wrargs4cont = mach.loadPred("wrargs", 3);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2.dref();
        local_aregs[2] = var3;
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return consts.wrargs4cont;

    }
}
