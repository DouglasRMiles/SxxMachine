
package SxxMachine;

// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_findall_3 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_findall_3_1();

    static Code initfindall2cont;

    static String string0 = internS("cut");

    static String string1 = internS("findall");

    static String string2 = internS("findall2");

    static String string3 = internS("initfindall");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        initfindall2cont = mach.loadPred("initfindall", 1);
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

class pred_findall_3_1 extends pred_findall_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
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
        local_aregs.setAreg0((var4));
        mach.setCont(local_aregs, 1, S(string2, var1.dref(), var2.dref(), var3.dref(), var4.dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return initfindall2cont;
    }
}
