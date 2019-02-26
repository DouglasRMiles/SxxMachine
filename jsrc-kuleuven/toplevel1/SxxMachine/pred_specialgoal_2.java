
package SxxMachine;

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

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(";");

    static String string2 = Const.strIntern("<");

    static String string3 = Const.strIntern("=");

    static String string4 = Const.strIntern("=:=");

    static String string5 = Const.strIntern("=<");

    static String string6 = Const.strIntern("==");

    static String string7 = Const.strIntern(">");

    static String string8 = Const.strIntern(">=");

    static String string9 = Const.strIntern("@<");

    static String string10 = Const.strIntern("@=<");

    static String string11 = Const.strIntern("@>");

    static String string12 = Const.strIntern("@>=");

    static String string13 = Const.strIntern("arithequal");

    static String string14 = Const.strIntern("cut");

    static String string15 = Const.strIntern("or");

    static String string16 = Const.strIntern("smallerorequal");

    static String string17 = Const.strIntern("smallerthan");

    static String string18 = Const.strIntern("specialgoal");

    static String string19 = Const.strIntern("termequal");

    static String string20 = Const.strIntern("termgreaterequal");

    static String string21 = Const.strIntern("termgreaterthan");

    static String string22 = Const.strIntern("termsmallerequal");

    static String string23 = Const.strIntern("termsmallerthan");

    static String string24 = Const.strIntern("unify");

    static Int posint1 = JpFactory.Long(1);

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
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_specialgoal_2_1 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string2, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string17, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_2 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string5, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string16, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_3 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string7, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string17, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_4 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl5);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string8, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string16, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_5 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl6);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string4, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string13, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_6 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl7);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string3, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string24, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_7 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl8);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string15, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_8 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl9);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string9, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string23, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_9 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl10);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string11, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string21, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_10 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl11);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string10, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string22, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_11 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl12);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string12, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string20, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_specialgoal_2_12 extends pred_specialgoal_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string6, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string19, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}
