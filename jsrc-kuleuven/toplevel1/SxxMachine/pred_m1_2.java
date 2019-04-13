
package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_m1_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_m1_2_1();

    static Code cl2 = new pred_m1_2_2();

    static Code var2cont;

    static String string0 = internS("cut");

    static String string1 = internS("-");

    static String string2 = internS(".");

    static String string3 = internS("m1");

    static String string4 = internS("var");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        var2cont = mach.loadPred("var", 1);
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

class pred_m1_2_1 extends pred_m1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string2, S(string1, var1.dref(), var2), var3))))
            return mach.Fail0;
        local_aregs.setAreg0((var2.dref()));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return var2cont;
    }
}

class pred_m1_2_2 extends pred_m1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string2, var2, var3))))
            return mach.Fail0;
        local_aregs.setAreg0((var1.dref()));
        local_aregs.setAreg1((var3.dref()));
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return entry_code;
    }
}
