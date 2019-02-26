
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

public class pred_jp_get_3 extends Code {
    static Code entry_code;
    static Code univ4cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("jp_get");
    static String string2 = Const.strIntern("univ");
    static String string3 = Const.strIntern("[]");
    static String string4 = Const.strIntern("jp_call");
    static String string5 = Const.strIntern("not");
    static String string6 = Const.strIntern("jp_exception");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        univ4cont = mach.loadPred("univ", 3);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg1).unify(var2.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = var4;
        local_aregs[1] = var2.dref();
        local_aregs[2] = JpFactory.CONST(string3);
        local_aregs[3] = JpFactory.S(string4, var1.dref(), var4.dref(), var3.dref(), var5, JpFactory
                .S(string5, JpFactory.S(string6, var5.dref(), var6, var7), continuation));
        mach.updateCUTB();
        return univ4cont;
    }
}
