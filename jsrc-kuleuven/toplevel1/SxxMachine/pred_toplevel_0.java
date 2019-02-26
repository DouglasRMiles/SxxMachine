
package SxxMachine;

import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_toplevel_0 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_toplevel_0_1();

    static Code cl2 = new pred_toplevel_0_2();

    static Code top1cont;

    static String string0 = internS("cut");

    static String string1 = internS("fail");

    static String string2 = internS("top");

    static String string3 = internS("toplevel");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        top1cont = mach.loadPred("top", 0);
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(1);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_toplevel_0_1 extends pred_toplevel_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[0];
        local_aregs[0] = S(string1, continuation);
        mach.updateCUTB();
        return top1cont;
    }
}

class pred_toplevel_0_2 extends pred_toplevel_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[0];
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
