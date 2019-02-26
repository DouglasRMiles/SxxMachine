
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_vread_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_vread_2_1();

    static Code nexttoken2cont;

    static String string0 = internS("cut");

    static String string1 = internS("[]");

    static String string2 = internS("collectvars");

    static String string3 = internS("cut");

    static String string4 = internS("maketerm");

    static String string5 = internS("nexttoken");

    static String string6 = internS("readall");

    static String string7 = internS("vread");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        nexttoken2cont = mach.loadPred("nexttoken", 1);
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

class pred_vread_2_1 extends pred_vread_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = S(string6, var3.dref(), var4, S(string4, var4.dref(), var1.dref(), S(string0, new HeapChoice(
                mach.getCUTB()), S(string2, var4.dref(), CONST(string1), var2.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return nexttoken2cont;
    }
}
