
package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_loop_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_loop_1_1();

    static Code cl2 = new pred_loop_1_2();

    static Code cut2cont;

    static Code is3cont;

    static String string0 = internS("cut");

    static String string1 = internS("-");

    static String string2 = internS("cut");

    static String string3 = internS("is");

    static String string4 = internS("loop");

    static NumberTerm posint0 = Integer(0);

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        is3cont = mach.loadPred("is", 2);
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

class pred_loop_1_1 extends pred_loop_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(posint0)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        return mach.getCall1();
    }
}

class pred_loop_1_2 extends pred_loop_1 {
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
        local_aregs.setAV(0,var2);
        local_aregs.setAV(1,S(string1, var1.dref(), posint1));
        mach.setCont(local_aregs, 2, S(string4, var2.dref(), continuation));
        mach.updateCUTB();
        return is3cont;
    }
}
