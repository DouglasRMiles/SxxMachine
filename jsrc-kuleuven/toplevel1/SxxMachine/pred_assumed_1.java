
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_assumed_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_assumed_1_1();

    static Code allassumed2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("allassumed");

    static String string2 = Const.strIntern("assumed");

    static String string3 = Const.strIntern("m1");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        allassumed2cont = mach.loadPred("allassumed", 1);
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

class pred_assumed_1_1 extends pred_assumed_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(string3, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        return allassumed2cont;
    }
}
