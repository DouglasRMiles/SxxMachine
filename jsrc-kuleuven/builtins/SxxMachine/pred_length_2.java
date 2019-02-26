
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

public class pred_length_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length_2_1();
    static Code length2_disj_13cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("length");
    static String string2 = Const.strIntern("length2_disj_1");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        length2_disj_13cont = mach.loadPred("length2_disj_1", 2);
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

class pred_length_2_1 extends pred_length_2 {
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
        return length2_disj_13cont;
    }
}
