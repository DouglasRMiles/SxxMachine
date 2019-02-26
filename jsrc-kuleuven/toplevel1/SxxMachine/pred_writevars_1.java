
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_writevars_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_writevars_1_1();

    static Code cl2 = new pred_writevars_1_2();

    static Code cl3 = new pred_writevars_1_3();

    static Code write2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(" = ");

    static String string2 = Const.strIntern(".");

    static String string3 = Const.strIntern("=");

    static String string4 = Const.strIntern("[]");

    static String string5 = Const.strIntern("call");

    static String string6 = Const.strIntern("fail");

    static String string7 = Const.strIntern("nl");

    static String string8 = Const.strIntern("write");

    static String string9 = Const.strIntern("writevars");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        write2cont = mach.loadPred("write", 1);
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

class pred_writevars_1_1 extends pred_writevars_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(JpFactory.CONST(string4))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_writevars_1_2 extends pred_writevars_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string2, JpFactory.S(string3, var1, var2), var3))))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = JpFactory.S(string8, JpFactory.CONST(string1), JpFactory
                .S(string8, var1.dref(), JpFactory.S(string7, JpFactory.S(string6, continuation))));
        mach.updateCUTB();
        return write2cont;
    }
}

class pred_writevars_1_3 extends pred_writevars_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.S(string2, var1, var2))))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
