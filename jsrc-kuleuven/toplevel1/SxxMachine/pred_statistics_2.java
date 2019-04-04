
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_statistics_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_statistics_2_1();

    static Code cputime2cont;

    static String string0 = internS("cut");

    static String string1 = internS(".");

    static String string2 = internS("[]");

    static String string3 = internS("cputime");

    static String string4 = internS("runtime");

    static String string5 = internS("statistics");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        cputime2cont = mach.loadPred("cputime", 1);
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

class pred_statistics_2_1 extends pred_statistics_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string4))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string1, var1, S(string1, var2, CONST(string2))))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return cputime2cont;
    }
}
