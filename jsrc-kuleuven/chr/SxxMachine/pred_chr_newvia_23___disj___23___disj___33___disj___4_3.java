
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class pred_chr_newvia_23___disj___23___disj___33___disj___4_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_23___disj___23___disj___33___disj___4_3_1();
    static Code cl2 = new pred_chr_newvia_23___disj___23___disj___33___disj___4_3_2();
    static Code compound2cont;
    static String string0 = internS("cut");
    static String string1 = internS("call");
    static String string2 = internS("chr_newvia_23___disj___23___disj___33___disj___4");
    static String string3 = internS("chr_nonground");
    static String string4 = internS("compound");
    static String string5 = internS("cut");
    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        compound2cont = mach.loadPred("compound", 1);
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

class pred_chr_newvia_23___disj___23___disj___33___disj___4_3_1
        extends pred_chr_newvia_23___disj___23___disj___33___disj___4_3 {
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
        local_aregs.setAreg0((var1.dref()));
        mach.setCont(local_aregs, 1, S(string3, var1.dref(), var2
                .dref(), S(string0, new HeapChoice(mach.getCUTB()), S(string1, continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return compound2cont;
    }
}

class pred_chr_newvia_23___disj___23___disj___33___disj___4_3_2
        extends pred_chr_newvia_23___disj___23___disj___33___disj___4_3 {
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
        local_aregs.setAreg0((var3.dref()));
        mach.setCont(local_aregs, 1, S(string3, var3.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return compound2cont;
    }
}
