
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_statistics_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_statistics_2_1();

    static Code cputime2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(".");

    static String string2 = Const.strIntern("[]");

    static String string3 = Const.strIntern("cputime");

    static String string4 = Const.strIntern("runtime");

    static String string5 = Const.strIntern("statistics");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        cputime2cont = mach.loadPred("cputime", 1);
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

class pred_statistics_2_1 extends pred_statistics_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string4))))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.S(string1, var1, JpFactory.S(string1, var2, JpFactory.CONST(string2))))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return cputime2cont;
    }
}
