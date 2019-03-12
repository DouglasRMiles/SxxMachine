
package SxxMachine;

// Jv;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_time_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_time_1_1();

    static Code cputime2cont;

    static String string0 = internS("cut");

    static String string1 = internS("-");

    static String string2 = internS("cputime");

    static String string3 = internS("exec");

    static String string4 = internS("is");

    static String string5 = internS("nl");

    static String string6 = internS("time");

    static String string7 = internS("write");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        cputime2cont = mach.loadPred("cputime", 1);
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

class pred_time_1_1 extends pred_time_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = S(string3, var1.dref(), S(string2, var3, S(string4, var4, S(string1, var3.dref(), var2
                .dref()), S(string7, var4.dref(), S(string5, continuation)))));
        mach.updateCUTB();
        return cputime2cont;
    }
}
