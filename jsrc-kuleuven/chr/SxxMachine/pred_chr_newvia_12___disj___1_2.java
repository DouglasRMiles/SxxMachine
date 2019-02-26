
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_chr_newvia_12___disj___1_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_12___disj___1_2_1();
    static Code cl2 = new pred_chr_newvia_12___disj___1_2_2();
    static Code chr_nonground3cont;
    static Code var2cont;
    static String string0 = internS("cut");
    static String string1 = internS("chr_newvia_12___disj___1");
    static String string2 = internS("chr_nonground");
    static String string3 = internS("cut");
    static String string4 = internS("unify");
    static String string5 = internS("var");
    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        chr_nonground3cont = mach.loadPred("chr_nonground", 2);
        var2cont = mach.loadPred("var", 1);
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

class pred_chr_newvia_12___disj___1_2_1 extends pred_chr_newvia_12___disj___1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = S(string0, new HeapChoice(mach.getCUTB()), S(string4, var2.dref(), var1.dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return var2cont;
    }
}

class pred_chr_newvia_12___disj___1_2_2 extends pred_chr_newvia_12___disj___1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return chr_nonground3cont;
    }
}
