
package SxxMachine;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_findall_3 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_findall_3_1();

    static Code initfindall2cont;

    static String string0 = Const.strIntern("cut");

    static String string1 = Const.strIntern("findall");

    static String string2 = Const.strIntern("findall2");

    static String string3 = Const.strIntern("initfindall");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        initfindall2cont = mach.loadPred("initfindall", 1);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_findall_3_1 extends pred_findall_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
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
        if (!((areg2).unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var4;
        local_aregs[1] = JpFactory.S(string2, var1.dref(), var2.dref(), var3.dref(), var4.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return initfindall2cont;
    }
}
