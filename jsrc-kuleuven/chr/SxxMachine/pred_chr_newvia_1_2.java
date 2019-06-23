
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

public class pred_chr_newvia_1_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_1_2_1();
    static Code chr_newvia_12___disj___13cont;
    static String string0 = internS("cut");
    static String string1 = internS("chr_newvia_1");
    static String string2 = internS("chr_newvia_12___disj___1");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        chr_newvia_12___disj___13cont = mach.loadPred("chr_newvia_12___disj___1", 2);
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

class pred_chr_newvia_1_2_1 extends pred_chr_newvia_1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.setAreg0((var1.dref()));
        local_aregs.setAreg1((var2.dref()));
        mach.setCont(local_aregs, 2, continuation);
        mach.updateCUTB();
        return chr_newvia_12___disj___13cont;
    }
}
