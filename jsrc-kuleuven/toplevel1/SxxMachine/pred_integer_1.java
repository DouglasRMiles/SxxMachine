
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_integer_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_integer_1_1();

    static Code type_of3cont;

    static String string0 = internS("cut");

    static String string1 = internS("integer");

    static String string2 = internS("type_of");

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

class pred_integer_1_1 extends pred_integer_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = CONST(string1);
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return type_of3cont;
    }
}
