
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_vread_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_vread_2_1();

    static Code nexttoken2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("[]");

    static String string2 = Const.strIntern("collectvars");

    static String string3 = Const.strIntern("cut");

    static String string4 = Const.strIntern("maketerm");

    static String string5 = Const.strIntern("nexttoken");

    static String string6 = Const.strIntern("readall");

    static String string7 = Const.strIntern("vread");

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

class pred_vread_2_1 extends pred_vread_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1)))
            return mach.Fail0;
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory
                .S(string6, var3.dref(), var4, JpFactory.S(string4, var4.dref(), var1.dref(), JpFactory
                        .S(string0, new HeapChoice(mach.getCUTB()), JpFactory
                                .S(string2, var4.dref(), JpFactory.CONST(string1), var2.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return nexttoken2cont;
    }
}
