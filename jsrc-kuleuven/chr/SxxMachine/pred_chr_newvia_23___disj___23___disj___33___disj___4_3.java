
package SxxMachine;

public class pred_chr_newvia_23___disj___23___disj___33___disj___4_3 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_chr_newvia_23___disj___23___disj___33___disj___4_3_1();
    static Code cl2 = new pred_chr_newvia_23___disj___23___disj___33___disj___4_3_2();
    static Code compound2cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("call");
    static String string2 = Const.strIntern("chr_newvia_23___disj___23___disj___33___disj___4");
    static String string3 = Const.strIntern("chr_nonground");
    static String string4 = Const.strIntern("compound");
    static String string5 = Const.strIntern("cut");
    static Int posint1 = JpFactory.Long(1);

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
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_chr_newvia_23___disj___23___disj___33___disj___4_3_1
        extends pred_chr_newvia_23___disj___23___disj___33___disj___4_3 {
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
        local_aregs[1] = JpFactory.S(string3, var1.dref(), var2.dref(), JpFactory
                .S(string0, new HeapChoice(mach.getCUTB()), JpFactory.S(string1, continuation)));
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return compound2cont;
    }
}

class pred_chr_newvia_23___disj___23___disj___33___disj___4_3_2
        extends pred_chr_newvia_23___disj___23___disj___33___disj___4_3 {
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
        local_aregs[1] = JpFactory.S(string3, var3.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return compound2cont;
    }
}
