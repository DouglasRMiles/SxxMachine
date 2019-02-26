
package SxxMachine;

public class pred_chr_sbag_del_element_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_sbag_del_element_3_1();
    static Code cl2 = new pred_chr_sbag_del_element_3_2();
    static Code cl3 = new pred_chr_sbag_del_element_3_3();
    static Code termequal3cont;
    static Code unify3cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern(".");
    static String string2 = Const.strIntern("[]");
    static String string3 = Const.strIntern("call");
    static String string4 = Const.strIntern("chr_sbag_del_element");
    static String string5 = Const.strIntern("cut");
    static String string6 = Const.strIntern("termequal");
    static String string7 = Const.strIntern("unify");
    static Int posint1 = JpFactory.Long(1);

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
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_sbag_del_element_3_1 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unify(var1)))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_chr_sbag_del_element_3_2 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(string7, var2.dref(), var4.dref(), continuation));
        mach.updateCUTB();
        local_aregs[3] = null;
        return termequal3cont;
    }
}

class pred_chr_sbag_del_element_3_3 extends pred_chr_sbag_del_element_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        if (!((areg2).unify(var4)))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(string1, var1.dref(), var5);
        local_aregs[1] = var4.dref();
        local_aregs[2] = JpFactory.S(string4, var2.dref(), var3.dref(), var5.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = null;
        return unify3cont;
    }
}
