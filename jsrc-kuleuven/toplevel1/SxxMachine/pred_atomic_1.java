
package SxxMachine;

// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_atomic_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_atomic_1_1();

    static Code type_of3cont;

    static String string0 = internS("cut");

    static String string1 = internS("atomic");

    static String string2 = internS("atomic2");

    static String string3 = internS("type_of");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        type_of3cont = mach.loadPred("type_of", 2);
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

class pred_atomic_1_1 extends pred_atomic_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs.areg0 = (var1.dref());
        local_aregs.areg1 = (var2);
        mach.setCont(local_aregs, 2, S(string2, var2.dref(), continuation));
        mach.updateCUTB();
        return type_of3cont;
    }
}
