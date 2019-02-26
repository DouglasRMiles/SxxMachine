
package SxxMachine;

public class pred_chr_nonground_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_nonground_2_1();
    static Code term_variables3cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern(".");
    static String string2 = Const.strIntern("chr_nonground");
    static String string3 = Const.strIntern("term_variables");
    static String string4 = Const.strIntern("unify");

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
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_nonground_2_1 extends pred_chr_nonground_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = JpFactory.S(string4, JpFactory.S(string1, var2.dref(), var4), var3.dref(), continuation);
        mach.updateCUTB();
        return term_variables3cont;
    }
}
