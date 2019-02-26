
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_notmore_0 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_notmore_0_1();

    static Code cl2 = new pred_notmore_0_2();

    static Code get02cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("call");

    static String string2 = Const.strIntern("cut");

    static String string3 = Const.strIntern("fail");

    static String string4 = Const.strIntern("get0");

    static String string5 = Const.strIntern("noteq");

    static String string6 = Const.strIntern("notmore");

    static String string7 = Const.strIntern("untilend");

    static Int posint1 = JpFactory.Long(1);

    static Int posint10 = JpFactory.Long(10);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        get02cont = mach.loadPred("get0", 1);
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(1);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_notmore_0_1 extends pred_notmore_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[0];
        Term var1 = JpFactory.JVAR(mach);
        local_aregs[0] = var1;
        local_aregs[1] = JpFactory
                .S(string5, var1.dref(), posint10, JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                        .S(string7, var1.dref(), JpFactory.S(string3, continuation))));
        mach.updateCUTB();
        return get02cont;
    }
}

class pred_notmore_0_2 extends pred_notmore_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[0];
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}
