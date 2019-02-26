
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_top_0 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_top_0_1();

    static Code cl2 = new pred_top_0_2();

    static Code write2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("?- ");

    static String string2 = Const.strIntern("Yes");

    static String string3 = Const.strIntern("cut");

    static String string4 = Const.strIntern("exec");

    static String string5 = Const.strIntern("fail");

    static String string6 = Const.strIntern("nl");

    static String string7 = Const.strIntern("notmore");

    static String string8 = Const.strIntern("top");

    static String string9 = Const.strIntern("vread");

    static String string10 = Const.strIntern("write");

    static String string11 = Const.strIntern("writevars");

    static Int posint1 = JpFactory.Long(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        write2cont = mach.loadPred("write", 1);
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

class pred_top_0_1 extends pred_top_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[0];
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        local_aregs[0] = JpFactory.CONST(string1);
        local_aregs[1] = JpFactory.S(string9, var1, var2, JpFactory
                .S(string4, var1.dref(), JpFactory.S(string11, var2.dref(), JpFactory
                        .S(string10, JpFactory.CONST(string2), JpFactory.S(string6, JpFactory
                                .S(string7, JpFactory.S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                                        .S(string5, continuation))))))));
        mach.updateCUTB();
        return write2cont;
    }
}

class pred_top_0_2 extends pred_top_0 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[0];
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return entry_code;
    }
}
