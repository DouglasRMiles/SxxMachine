
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_readall_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_readall_2_1();

    static Code cl2 = new pred_readall_2_2();

    static Code cl3 = new pred_readall_2_3();

    static Code cut2cont;

    static Code nexttoken2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(".");

    static String string2 = Const.strIntern("[]");

    static String string3 = Const.strIntern("cut");

    static String string4 = Const.strIntern("end_of_clause");

    static String string5 = Const.strIntern("end_of_file");

    static String string7 = Const.strIntern("nexttoken");

    static String string8 = Const.strIntern("readall");

    static String string9 = Const.strIntern("unify");

    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        nexttoken2cont = mach.loadPred("nexttoken", 1);
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

class pred_readall_2_1 extends pred_readall_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        //PrologObject areg1 = local_aregs[1].Deref();
        Term areg0 = local_aregs[0].dref();
        //PrologObject var1 = new Var(mach);
        if (!((areg0).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        //System.out.println("end_of_file at readall: (" + System.currentTimeMillis() + ") " + continuation);
        //if (!((areg1).Unify(var1)))
        //  return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_readall_2_2 extends pred_readall_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string4))))
            return mach.Fail0;
        if (!((areg1).unify(var1)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string9, JpFactory.CONST(string2), var1.dref(), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_readall_2_3 extends pred_readall_2 {
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
        if (!((areg1).unify(JpFactory.S(string1, var1.dref(), var2))))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory.S(string8, var3.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return nexttoken2cont;
    }
}
