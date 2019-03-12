
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_collectvars_3 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_collectvars_3_1();

    static Code cl2 = new pred_collectvars_3_2();

    static Code cl3 = new pred_collectvars_3_3();

    static Code cut2cont;

    static Code noteq3cont;

    static String string0 = internS("cut");

    static String string1 = internS(".");

    static String string2 = internS("=");

    static String string3 = internS("[]");

    static String string4 = internS("_");

    static String string5 = internS("collectvars");

    static String string6 = internS("cut");

    static String string7 = internS("noteq");

    static String string8 = internS("notvmember");

    static String string9 = internS("var");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        noteq3cont = mach.loadPred("noteq", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        ;
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_collectvars_3_1 extends pred_collectvars_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string3))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var1.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_collectvars_3_2 extends pred_collectvars_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string1, S(string9, var1, var2, var3), var4))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var5)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var6)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = CONST(string4);
        local_aregs[2] = S(string8, var2.dref(), var5.dref(), S(string0, new HeapChoice(mach.getCUTB()), S(string5, var4
                .dref(), S(string1, S(string2, var1.dref(), var2.dref()), var5.dref()), var6.dref(), continuation)));
        mach.updateCUTB();
        local_aregs[3] = null;
        return noteq3cont;
    }
}

class pred_collectvars_3_3 extends pred_collectvars_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var3)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var4)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = var4.dref();
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
