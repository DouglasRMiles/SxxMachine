
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

public class pred_length_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length_2_1();
    static Code length2_disj_13cont;
    static String string0 = internS("cut");
    static String string1 = internS("length");
    static String string2 = internS("length2_disj_1");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        length2_disj_13cont = mach.loadPred("length2_disj_1", 2);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_length_2_1 extends pred_length_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var1.dref();
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return length2_disj_13cont;
    }
}
