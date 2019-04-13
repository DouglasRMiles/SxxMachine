
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_copy_term_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_copy_term_2_1();

    static Code findall4cont;

    static String string0 = internS("cut");

    static String string1 = internS(".");

    static String string2 = internS("=");

    static String string3 = internS("[]");

    static String string4 = internS("copy_term");

    static String string5 = internS("findall");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        findall4cont = mach.loadPred("findall", 3);
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

class pred_copy_term_2_1 extends pred_copy_term_2 {
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
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAreg0((var3));
        local_aregs.setAreg1((S(string2, var3.dref(), var1.dref())));
        local_aregs.setAreg2((S(string1, var2.dref(), CONST(string3))));
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return findall4cont;
    }
}
