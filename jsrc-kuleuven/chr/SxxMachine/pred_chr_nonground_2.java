
package SxxMachine;

import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_chr_nonground_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_nonground_2_1();
    static Code term_variables3cont;
    static String string0 = internS("cut");
    static String string1 = internS(".");
    static String string2 = internS("chr_nonground");
    static String string3 = internS("term_variables");
    static String string4 = internS("unify");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        term_variables3cont = mach.loadPred("term_variables", 2);
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

class pred_chr_nonground_2_1 extends pred_chr_nonground_2 {
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
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = S(string4, S(string1, var2.dref(), var4), var3.dref(), continuation);
        mach.updateCUTB();
        return term_variables3cont;
    }
}
