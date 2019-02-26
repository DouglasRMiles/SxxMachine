
package SxxMachine;

public class pred_chr_newvia_2_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_2_3_1();
    static Code chr_newvia_23___disj___24cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("chr_newvia_2");
    static String string2 = Const.strIntern("chr_newvia_23___disj___2");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        chr_newvia_23___disj___24cont = mach.loadPred("chr_newvia_23___disj___2", 3);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_newvia_2_3_1 extends pred_chr_newvia_2_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = var2.dref();
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return chr_newvia_23___disj___24cont;
    }
}
