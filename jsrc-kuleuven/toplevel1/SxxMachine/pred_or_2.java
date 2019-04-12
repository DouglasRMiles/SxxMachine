
package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_or_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_or_2_1();

    static Code cl2 = new pred_or_2_2();

    static Code exec2cont;

    static String string0 = internS("cut");

    static String string1 = internS("exec");

    static String string2 = internS("or");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        exec2cont = mach.loadPred("exec", 1);
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

class pred_or_2_1 extends pred_or_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return exec2cont;
    }
}

class pred_or_2_2 extends pred_or_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return exec2cont;
    }
}
