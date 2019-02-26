
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

public class pred_length_n2_disj_2_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length_n2_disj_2_2_1();
    static Code cl2 = new pred_length_n2_disj_2_2_2();
    static Code is3cont;
    static Code unify3cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("-");
    static String string2 = Const.strIntern(".");
    static String string3 = Const.strIntern("[]");
    static String string4 = Const.strIntern("cut");
    static String string5 = Const.strIntern("is");
    static String string6 = Const.strIntern("length_n");
    static String string7 = Const.strIntern("length_n2_disj_2");
    static String string8 = Const.strIntern("unify");
    static Int posint0 = JpFactory.Long(0);
    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        is3cont = mach.loadPred("is", 2);
        unify3cont = mach.loadPred("unify", 2);
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

class pred_length_n2_disj_2_2_1 extends pred_length_n2_disj_2_2 {
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
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = posint0;
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(string8, JpFactory.CONST(string3), var2.dref(), continuation));
        mach.updateCUTB();
        return unify3cont;
    }
}

class pred_length_n2_disj_2_2_2 extends pred_length_n2_disj_2_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory.S(string1, var1.dref(), posint1);
        local_aregs[2] = JpFactory.S(string8, JpFactory.S(string2, var4, var5), var2.dref(), JpFactory
                .S(string6, var5.dref(), var3.dref(), continuation));
        mach.updateCUTB();
        return is3cont;
    }
}
