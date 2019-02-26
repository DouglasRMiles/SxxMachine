
package SxxMachine;

public class pred_chr_newvia_23___disj___2_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_23___disj___2_3_1();
    static Code cl2 = new pred_chr_newvia_23___disj___2_3_2();
    static Code chr_newvia_23___disj___23___disj___34cont;
    static Code var2cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("chr_newvia_23___disj___2");
    static String string2 = Const.strIntern("chr_newvia_23___disj___23___disj___3");
    static String string3 = Const.strIntern("cut");
    static String string4 = Const.strIntern("unify");
    static String string5 = Const.strIntern("var");
    static Int posint1 = JpFactory.Long(1);

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
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_newvia_23___disj___2_3_1 extends pred_chr_newvia_23___disj___2_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
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
        local_aregs[1] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(string4, var2.dref(), var1.dref(), continuation));
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return var2cont;
    }
}

class pred_chr_newvia_23___disj___2_3_2 extends pred_chr_newvia_23___disj___2_3 {
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
        local_aregs[0] = var3.dref();
        local_aregs[1] = var2.dref();
        local_aregs[2] = var1.dref();
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return chr_newvia_23___disj___23___disj___34cont;
    }
}
