
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_length_n2_disj_2_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length_n2_disj_2_2_1();
    static Code cl2 = new pred_length_n2_disj_2_2_2();
    static Code is3cont;
    static Code unify3cont;
    static String string0 = internS("cut");
    static String string1 = internS("-");
    static String string2 = internS(".");
    static String string3 = internS("[]");
    static String string4 = internS("cut");
    static String string5 = internS("is");
    static String string6 = internS("length_n");
    static String string7 = internS("length_n2_disj_2");
    static String string8 = internS("unify");
    static NumberTerm posint0 = Integer(0);
    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        is3cont = mach.loadPred("is", 2);
        unify3cont = mach.loadPred("unify", 2);
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

class pred_length_n2_disj_2_2_1 extends pred_length_n2_disj_2_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs[0] = posint0;
        local_aregs[1] = var1.dref();
        local_aregs[2] = S(string0, new HeapChoice(
                mach.getCUTB()), S(string8, CONST(string3), var2.dref(), continuation));
        mach.updateCUTB();
        return unify3cont;
    }
}

class pred_length_n2_disj_2_2_2 extends pred_length_n2_disj_2_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = S(string1, var1.dref(), posint1);
        local_aregs[2] = S(string8, S(string2, var4, var5), var2
                .dref(), S(string6, var5.dref(), var3.dref(), continuation));
        mach.updateCUTB();
        return is3cont;
    }
}
