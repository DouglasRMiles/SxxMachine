
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

public class pred_length2_disj_1_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length2_disj_1_2_1();
    static Code cl2 = new pred_length2_disj_1_2_2();
    static Code length_u3cont;
    static Code nonvar2cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("cut");
    static String string2 = Const.strIntern("length2_disj_1");
    static String string3 = Const.strIntern("length_n");
    static String string4 = Const.strIntern("length_u");
    static String string5 = Const.strIntern("nonvar");
    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        length_u3cont = mach.loadPred("length_u", 2);
        nonvar2cont = mach.loadPred("nonvar", 1);
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

class pred_length2_disj_1_2_1 extends pred_length2_disj_1_2 {
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
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(string3, var2.dref(), var1.dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return nonvar2cont;
    }
}

class pred_length2_disj_1_2_2 extends pred_length2_disj_1_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
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
        local_aregs[0] = var2.dref();
        local_aregs[1] = var1.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return length_u3cont;
    }
}
