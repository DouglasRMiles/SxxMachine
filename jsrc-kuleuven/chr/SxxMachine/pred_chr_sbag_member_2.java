
package SxxMachine;

public class pred_chr_sbag_member_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_sbag_member_2_1();

    static Code cl2 = new pred_sbag_member_2_2();

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(".");

    static String string2 = Const.strIntern("call");

    static String string3 = Const.strIntern("sbag_member");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
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

class pred_sbag_member_2_1 extends pred_chr_sbag_member_2 {
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
        if (!((areg1).unify(JpFactory.S(string1, var1.dref(), var2))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_sbag_member_2_2 extends pred_chr_sbag_member_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string1, var2, var3))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
