
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_notmore_0 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_notmore_0_1();

    static Code cl2 = new pred_notmore_0_2();

    static Code get02cont;

    static String string0 = internS("cut");

    static String string1 = internS("call");

    static String string2 = internS("cut");

    static String string3 = internS("fail");

    static String string4 = internS("get0");

    static String string5 = internS("noteq");

    static String string6 = internS("notmore");

    static String string7 = internS("untilend");

    static NumberTerm posint1 = Integer(1);

    static NumberTerm posint10 = Integer(10);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        get02cont = mach.loadPred("get0", 1);
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

class pred_notmore_0_1 extends pred_notmore_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[0];
        final Term var1 = Jv(mach);
        local_aregs[0] = var1;
        local_aregs[1] = S(string5, var1.dref(), posint10, S(string0, new HeapChoice(
                mach.getCUTB()), S(string7, var1.dref(), S(string3, continuation))));
        mach.updateCUTB();
        return get02cont;
    }
}

class pred_notmore_0_2 extends pred_notmore_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[0];
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}
