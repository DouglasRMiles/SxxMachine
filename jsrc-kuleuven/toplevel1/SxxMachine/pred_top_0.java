
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_top_0 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_top_0_1();

    static Code cl2 = new pred_top_0_2();

    static Code write2cont;

    static String string0 = internS("cut");

    static String string1 = internS("?- ");

    static String string2 = internS("Yes");

    static String string3 = internS("cut");

    static String string4 = internS("exec");

    static String string5 = internS("fail");

    static String string6 = internS("nl");

    static String string7 = internS("notmore");

    static String string8 = internS("top");

    static String string9 = internS("vread");

    static String string10 = internS("write");

    static String string11 = internS("writevars");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        write2cont = mach.loadPred("write", 1);
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(1);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_top_0_1 extends pred_top_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        local_aregs.areg0 = (CONST(string1));
        local_aregs.areg1 = (S(string9, var1, var2, S(string4, var1.dref(), S(string11, var2
                .dref(), S(string10, CONST(string2), S(string6, S(string7, S(string0, new HeapChoice(
                        mach.getCUTB()), S(string5, continuation)))))))));
        mach.updateCUTB();
        return write2cont;
    }
}

class pred_top_0_2 extends pred_top_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 0);
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        return entry_code;
    }
}
