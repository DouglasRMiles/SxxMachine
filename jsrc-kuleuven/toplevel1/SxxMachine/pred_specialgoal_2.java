
package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_specialgoal_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_specialgoal_2_1();

    static Code cl2 = new pred_specialgoal_2_2();

    static Code cl3 = new pred_specialgoal_2_3();

    static Code cl4 = new pred_specialgoal_2_4();

    static Code cl5 = new pred_specialgoal_2_5();

    static Code cl6 = new pred_specialgoal_2_6();

    static Code cl7 = new pred_specialgoal_2_7();

    static Code cl8 = new pred_specialgoal_2_8();

    static Code cl9 = new pred_specialgoal_2_9();

    static Code cl10 = new pred_specialgoal_2_10();

    static Code cl11 = new pred_specialgoal_2_11();

    static Code cl12 = new pred_specialgoal_2_12();

    static Code cut2cont;

    static String string0 = internS("cut");

    static String string1 = internS(";");

    static String string2 = internS("<");

    static String string3 = internS("=");

    static String string4 = internS("=:=");

    static String string5 = internS("=<");

    static String string6 = internS("==");

    static String string7 = internS(">");

    static String string8 = internS(">=");

    static String string9 = internS("@<");

    static String string10 = internS("@=<");

    static String string11 = internS("@>");

    static String string12 = internS("@>=");

    static String string13 = internS("arithequal");

    static String string14 = internS("cut");

    static String string15 = internS("or");

    static String string16 = internS("smallerorequal");

    static String string17 = internS("smallerthan");

    static String string18 = internS("specialgoal");

    static String string19 = internS("termequal");

    static String string20 = internS("termgreaterequal");

    static String string21 = internS("termgreaterthan");

    static String string22 = internS("termsmallerequal");

    static String string23 = internS("termsmallerthan");

    static String string24 = internS("unify");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
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

class pred_specialgoal_2_1 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string2, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string17, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_2 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string5, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string16, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_3 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string7, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string17, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_4 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl5);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string8, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string16, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_5 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl6);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string13, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_6 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl7);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string3, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string24, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_7 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl8);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string15, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_8 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl9);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string9, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string23, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_9 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl10);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string11, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string21, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_10 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl11);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string10, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string22, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_11 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl12);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string12, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string20, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_specialgoal_2_12 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string6, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string19, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}
