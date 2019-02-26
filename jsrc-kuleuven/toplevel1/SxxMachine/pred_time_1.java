
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_time_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_time_1_1();

    static Code cputime2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("-");

    static String string2 = Const.strIntern("cputime");

    static String string3 = Const.strIntern("exec");

    static String string4 = Const.strIntern("is");

    static String string5 = Const.strIntern("nl");

    static String string6 = Const.strIntern("time");

    static String string7 = Const.strIntern("write");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        cputime2cont = mach.loadPred("cputime", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_time_1_1 extends pred_time_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(string3, var1.dref(), JpFactory.S(string2, var3, JpFactory
                .S(string4, var4, JpFactory.S(string1, var3.dref(), var2.dref()), JpFactory
                        .S(string7, var4.dref(), JpFactory.S(string5, continuation)))));
        mach.updateCUTB();
        return cputime2cont;
    }
}
