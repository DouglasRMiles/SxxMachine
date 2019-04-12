
package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_max_3 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_max_3_1();

    static Code cl2 = new pred_max_3_2();

    static Code cl3 = new pred_max_3_3();

    static Code smallerthan3cont;

    static String string0 = internS("cut");

    static String string1 = internS("call");

    static String string2 = internS("max");

    static String string3 = internS("smallerthan");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        smallerthan3cont = mach.loadPred("smallerthan", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_max_3_1 extends pred_max_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var2.dref());
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return smallerthan3cont;
    }
}

class pred_max_3_2 extends pred_max_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var1.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());
        local_aregs.setAV(1,var1.dref());
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return smallerthan3cont;
    }
}

class pred_max_3_3 extends pred_max_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unifyJP(var1.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}
