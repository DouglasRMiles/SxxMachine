
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_exec_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_exec_1_1();

    static Code cl2 = new pred_exec_1_2();

    static Code cl3 = new pred_exec_1_3();

    static Code cl4 = new pred_exec_1_4();

    static Code cl5 = new pred_exec_1_5();

    static Code cl6 = new pred_exec_1_6();

    static Code cut2cont;

    static Code specialgoal3cont;

    static Code var2cont;

    static String string0 = internS("cut");

    static String string1 = internS(",");

    static String string2 = internS("->");

    static String string3 = internS(";");

    static String string4 = internS("call");

    static String string5 = internS("cut");

    static String string6 = internS("exec");

    static String string7 = internS("execdisj");

    static String string8 = internS("fail");

    static String string9 = internS("specialgoal");

    static String string10 = internS("true");

    static String string11 = internS("var");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        specialgoal3cont = mach.loadPred("specialgoal", 2);
        var2cont = mach.loadPred("var", 1);
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

class pred_exec_1_1 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = S(string0, new HeapChoice(mach.getCUTB()), S(string8, continuation));
        mach.updateCUTB();
        return var2cont;
    }
}

class pred_exec_1_2 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string1, var1, var2))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string6, var1.dref(), S(string6, var2.dref(), continuation));
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_exec_1_3 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string2, var1, var2))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string7, S(string2, var1.dref(), var2.dref()), CONST(string10), continuation);
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_exec_1_4 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl5);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string3, var1, var2))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string7, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_exec_1_5 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl6);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2;
        local_aregs[2] = S(string0, new HeapChoice(mach.getCUTB()), S(string6, var2.dref(), continuation));
        mach.updateCUTB();
        return specialgoal3cont;
    }
}

class pred_exec_1_6 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[1];
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return mach.Call2;
    }
}
