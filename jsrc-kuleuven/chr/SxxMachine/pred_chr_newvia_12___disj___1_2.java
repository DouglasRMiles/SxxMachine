
package SxxMachine;

public class pred_chr_newvia_12___disj___1_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_12___disj___1_2_1();
    static Code cl2 = new pred_chr_newvia_12___disj___1_2_2();
    static Code chr_nonground3cont;
    static Code var2cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("chr_newvia_12___disj___1");
    static String string2 = Const.strIntern("chr_nonground");
    static String string3 = Const.strIntern("cut");
    static String string4 = Const.strIntern("unify");
    static String string5 = Const.strIntern("var");
    static Int posint1 = JpFactory.Long(1);

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
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_newvia_12___disj___1_2_1 extends pred_chr_newvia_12___disj___1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(string4, var2.dref(), var1.dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return var2cont;
    }
}

class pred_chr_newvia_12___disj___1_2_2 extends pred_chr_newvia_12___disj___1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
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
