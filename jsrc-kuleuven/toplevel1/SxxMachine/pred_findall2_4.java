
package SxxMachine;

// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_findall2_4 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_findall2_4_1();

    static Code cl2 = new pred_findall2_4_2();

    static Code exec2cont;

    static Code retrievefindall3cont;

    static String string0 = internS("cut");

    static String string1 = internS("addfindall");

    static String string2 = internS("exec");

    static String string3 = internS("fail");

    static String string4 = internS("findall2");

    static String string5 = internS("retrievefindall");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        exec2cont = mach.loadPred("exec", 1);
        retrievefindall3cont = mach.loadPred("retrievefindall", 2);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_findall2_4_1 extends pred_findall2_4 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        if (!((areg3).unifyJP(var4)))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());
        mach.setCont(local_aregs, 1, S(string1, var1.dref(), var4.dref(), S(string3, continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 2);
        return exec2cont;
    }
}

class pred_findall2_4_2 extends pred_findall2_4 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        if (!((areg3).unifyJP(var4)))
            return mach.Fail0;
        local_aregs.setAV(0,var3.dref());
        local_aregs.setAV(1,var4.dref());
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 3);
        return retrievefindall3cont;
    }
}
