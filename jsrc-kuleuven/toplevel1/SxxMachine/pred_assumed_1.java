
package SxxMachine;

// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_assumed_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_assumed_1_1();

    static Code allassumed2cont;

    static String string0 = internS("cut");

    static String string1 = internS("allassumed");

    static String string2 = internS("assumed");

    static String string3 = internS("m1");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        allassumed2cont = mach.loadPred("allassumed", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_assumed_1_1 extends pred_assumed_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs.setAV(0,var2);
        mach.setCont(local_aregs, 1, S(string3, var1.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        return allassumed2cont;
    }
}
