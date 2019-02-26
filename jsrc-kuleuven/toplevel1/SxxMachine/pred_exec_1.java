
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_exec_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_exec_1_1();

    static Code cl2 = new pred_exec_1_2();

    static Code cl3 = new pred_exec_1_3();

    static Code cl4 = new pred_exec_1_4();

    static Code cl5 = new pred_exec_1_5();

    static Code cl6 = new pred_exec_1_6();

    static Code cut2cont;

    static Code specialgoal3cont;

    static Code var2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(",");

    static String string2 = Const.strIntern("->");

    static String string3 = Const.strIntern(";");

    static String string4 = Const.strIntern("call");

    static String string5 = Const.strIntern("cut");

    static String string6 = Const.strIntern("exec");

    static String string7 = Const.strIntern("execdisj");

    static String string8 = Const.strIntern("fail");

    static String string9 = Const.strIntern("specialgoal");

    static String string10 = Const.strIntern("true");

    static String string11 = Const.strIntern("var");

    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        specialgoal3cont = mach.loadPred("specialgoal", 2);
        var2cont = mach.loadPred("var", 1);
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

class pred_exec_1_1 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory.S(string8, continuation));
        mach.updateCUTB();
        return var2cont;
    }
}

class pred_exec_1_2 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string6, var1.dref(), JpFactory.S(string6, var2.dref(), continuation));
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_exec_1_3 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string2, var1, var2))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string7, JpFactory.S(string2, var1.dref(), var2.dref()), JpFactory
                .CONST(string10), continuation);
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_exec_1_4 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl5);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string3, var1, var2))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string7, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_exec_1_5 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl6);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2;
        local_aregs[2] = JpFactory
                .S(string0, new HeapChoice(mach.getCUTB()), JpFactory.S(string6, var2.dref(), continuation));
        mach.updateCUTB();
        return specialgoal3cont;
    }
}

class pred_exec_1_6 extends pred_exec_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return mach.Call2;
    }
}
