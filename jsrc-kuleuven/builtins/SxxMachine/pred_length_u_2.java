
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

public class pred_length_u_2 extends Code {
    static Code entry_code;
    static Code cl1 = new pred_length_u_2_1();
    static Code cl2 = new pred_length_u_2_2();
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern(".");
    static String string2 = Const.strIntern("[]");
    static String string3 = Const.strIntern("call");
    static String string4 = Const.strIntern("inc");
    static String string5 = Const.strIntern("length_u");
    static Int posint0 = JpFactory.Long(0);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
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

class pred_length_u_2_1 extends pred_length_u_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unify(posint0)))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_length_u_2_2 extends pred_length_u_2 {
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
        if (!((areg0).unify(JpFactory.S(string1, var1, var2))))
            return mach.Fail0;
        if (!((areg1).unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var4;
        local_aregs[2] = JpFactory.S(string4, var3.dref(), var4.dref(), continuation);
        mach.updateCUTB();
        return entry_code;
    }
}
