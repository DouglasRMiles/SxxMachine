
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_execpendinggoals_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_execpendinggoals_1_1();

    static Code cl2 = new pred_execpendinggoals_1_2();

    static Code exec2cont;

    static Code execcontinuation1cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(".");

    static String string2 = Const.strIntern("[]");

    static String string3 = Const.strIntern("exec");

    static String string4 = Const.strIntern("execcontinuation");

    static String string5 = Const.strIntern("execpendinggoals");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        exec2cont = mach.loadPred("exec", 1);
        execcontinuation1cont = mach.loadPred("execcontinuation", 0);
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

class pred_execpendinggoals_1_1 extends pred_execpendinggoals_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[1] = null;
        return execcontinuation1cont;
    }
}

class pred_execpendinggoals_1_2 extends pred_execpendinggoals_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(string5, var2.dref(), continuation);
        mach.updateCUTB();
        return exec2cont;
    }
}
