
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_copy_term_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_copy_term_2_1();

    static Code findall4cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern(".");

    static String string2 = Const.strIntern("=");

    static String string3 = Const.strIntern("[]");

    static String string4 = Const.strIntern("copy_term");

    static String string5 = Const.strIntern("findall");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        findall4cont = mach.loadPred("findall", 3);
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

class pred_copy_term_2_1 extends pred_copy_term_2 {
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
        if (!((areg1).unify(var2)))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory.S(string2, var3.dref(), var1.dref());
        local_aregs[2] = JpFactory.S(string1, var2.dref(), JpFactory.CONST(string3));
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return findall4cont;
    }
}
