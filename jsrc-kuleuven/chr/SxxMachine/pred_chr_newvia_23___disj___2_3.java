
package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

public class pred_chr_newvia_23___disj___2_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_23___disj___2_3_1();
    static Code cl2 = new pred_chr_newvia_23___disj___2_3_2();
    static Code chr_newvia_23___disj___23___disj___34cont;
    static Code var2cont;
    static String string0 = internS("cut");
    static String string1 = internS("chr_newvia_23___disj___2");
    static String string2 = internS("chr_newvia_23___disj___23___disj___3");
    static String string3 = internS("cut");
    static String string4 = internS("unify");
    static String string5 = internS("var");
    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        chr_newvia_23___disj___23___disj___34cont = mach.loadPred("chr_newvia_23___disj___23___disj___3", 3);
        var2cont = mach.loadPred("var", 1);
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

class pred_chr_newvia_23___disj___2_3_1 extends pred_chr_newvia_23___disj___2_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        mach.setCont(local_aregs, 1, S(string0, new HeapChoice(
                mach.getCUTB()), S(string4, var2.dref(), var1.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return var2cont;
    }
}

class pred_chr_newvia_23___disj___2_3_2 extends pred_chr_newvia_23___disj___2_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        local_aregs.setAV(0,var3.dref());
        local_aregs.setAV(1,var2.dref());
        local_aregs.setAV(2,var1.dref());
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return chr_newvia_23___disj___23___disj___34cont;
    }
}
