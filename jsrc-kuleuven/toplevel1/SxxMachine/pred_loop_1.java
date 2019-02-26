
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_loop_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_loop_1_1();

    static Code cl2 = new pred_loop_1_2();

    static Code cut2cont;

    static Code is3cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("-");

    static String string2 = Const.strIntern("cut");

    static String string3 = Const.strIntern("is");

    static String string4 = Const.strIntern("loop");

    static Int posint0 = JpFactory.Long(0);

    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        is3cont = mach.loadPred("is", 2);
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

class pred_loop_1_1 extends pred_loop_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint0)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_loop_1_2 extends pred_loop_1 {
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
        local_aregs[1] = JpFactory.S(string1, var1.dref(), posint1);
        local_aregs[2] = JpFactory.S(string4, var2.dref(), continuation);
        mach.updateCUTB();
        return is3cont;
    }
}
