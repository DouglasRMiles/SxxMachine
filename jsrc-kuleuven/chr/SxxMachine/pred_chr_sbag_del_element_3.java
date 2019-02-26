
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_chr_sbag_del_element_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_sbag_del_element_3_1();
    static Code cl2 = new pred_chr_sbag_del_element_3_2();
    static Code cl3 = new pred_chr_sbag_del_element_3_3();
    static Code termequal3cont;
    static Code unify3cont;
    static String string0 = internS("cut");
    static String string1 = internS(".");
    static String string2 = internS("[]");
    static String string3 = internS("call");
    static String string4 = internS("chr_sbag_del_element");
    static String string5 = internS("cut");
    static String string6 = internS("termequal");
    static String string7 = internS("unify");
    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        termequal3cont = mach.loadPred("termequal", 2);
        unify3cont = mach.loadPred("unify", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_sbag_del_element_3_1 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0).unify(CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unify(var1)))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string2))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_chr_sbag_del_element_3_2 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = S(string0, new HeapChoice(mach.getCUTB()), S(string7, var2.dref(), var4.dref(), continuation));
        mach.updateCUTB();
        local_aregs[3] = null;
        return termequal3cont;
    }
}

class pred_chr_sbag_del_element_3_3 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = S(string1, var1.dref(), var5);
        local_aregs[1] = var4.dref();
        local_aregs[2] = S(string4, var2.dref(), var3.dref(), var5.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = null;
        return unify3cont;
    }
}
