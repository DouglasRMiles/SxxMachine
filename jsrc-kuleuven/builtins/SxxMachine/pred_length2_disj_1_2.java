
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_length2_disj_1_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length2_disj_1_2_1();
    static Code cl2 = new pred_length2_disj_1_2_2();
    static Code length_u3cont;
    static Code nonvar2cont;
    static String string0 = internS("cut");
    static String string1 = internS("cut");
    static String string2 = internS("length2_disj_1");
    static String string3 = internS("length_n");
    static String string4 = internS("length_u");
    static String string5 = internS("nonvar");
    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        length_u3cont = mach.loadPred("length_u", 2);
        nonvar2cont = mach.loadPred("nonvar", 1);
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

class pred_length2_disj_1_2_1 extends pred_length2_disj_1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.areg0 = (var1.dref());
        mach.setCont(local_aregs, 1, S(string0, new HeapChoice(
                mach.getCUTB()), S(string3, var2.dref(), var1.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return nonvar2cont;
    }
}

class pred_length2_disj_1_2_2 extends pred_length2_disj_1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.areg0 = (var2.dref());
        local_aregs.areg1 = (var1.dref());
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return length_u3cont;
    }
}
