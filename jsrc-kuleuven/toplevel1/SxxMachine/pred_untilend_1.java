
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_untilend_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_untilend_1_1();

    static Code cl2 = new pred_untilend_1_2();

    static Code cut2cont;

    static Code get02cont;

    static String string0 = internS("cut");

    static String string1 = internS("cut");

    static String string2 = internS("get0");

    static String string3 = internS("untilend");

    static NumberTerm posint1 = Integer(1);

    static NumberTerm posint10 = Integer(10);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        get02cont = mach.loadPred("get0", 1);
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

class pred_untilend_1_1 extends pred_untilend_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint10)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_untilend_1_2 extends pred_untilend_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = S(string3, var2.dref(), continuation);
        mach.updateCUTB();
        return get02cont;
    }
}
