
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

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
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg2).unifyJP(CONST(string2))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}

class pred_chr_sbag_del_element_3_2 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
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
        local_aregs.setAreg0((var1.dref()));
        local_aregs.setAreg1((var3.dref()));
        mach.setCont(local_aregs, 2, S(string0, new HeapChoice(
                mach.getCUTB()), S(string7, var2.dref(), var4.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return termequal3cont;
    }
}

class pred_chr_sbag_del_element_3_3 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var5 = Jv(mach);
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
        local_aregs.setAreg0((S(string1, var1.dref(), var5)));
        local_aregs.setAreg1((var4.dref()));
        mach.setCont(local_aregs, 2, S(string4, var2.dref(), var3.dref(), var5.dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return unify3cont;
    }
}
