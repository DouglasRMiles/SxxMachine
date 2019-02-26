
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_m1_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_m1_2_1();

    static Code cl2 = new pred_m1_2_2();

    static Code var2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("-");

    static String string2 = Const.strIntern(".");

    static String string3 = Const.strIntern("m1");

    static String string4 = Const.strIntern("var");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
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

class pred_m1_2_1 extends pred_m1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string2, JpFactory.S(string1, var1.dref(), var2), var3))))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return var2cont;
    }
}

class pred_m1_2_2 extends pred_m1_2 {
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
        if (!((areg1).unify(JpFactory.S(string2, var2, var3))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
