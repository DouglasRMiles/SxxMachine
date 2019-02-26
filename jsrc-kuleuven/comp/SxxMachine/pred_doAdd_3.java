// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_doAdd_3_consts {
    Code entry_code;
    Code univ4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("doAdd");
    final static String string2 = Const.strIntern("univ");
    final static String string3 = Const.strIntern("append");
    final static String string4 = Const.strIntern(".");
    final static String string5 = Const.strIntern("[]");
}

public class pred_doAdd_3 extends Code {
    private final pred_doAdd_3_consts consts;

    public pred_doAdd_3() {
        consts = new pred_doAdd_3_consts();
        initAlternatives();
    }

    protected pred_doAdd_3(pred_doAdd_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_doAdd_3_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1)))
            return mach.Fail0;
        if (!(areg1.unify(var2)))
            return mach.Fail0;
        if (!(areg2.unify(var3)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var4;
        local_aregs[2] = var5;
        local_aregs[3] = JpFactory.S(getConsts().string3, var5.dref(), JpFactory
                .S(getConsts().string4, var2.dref(), JpFactory.CONST(getConsts().string5)), var6, JpFactory
                        .S(getConsts().string2, var3.dref(), var4.dref(), var6.dref(), continuation));
        mach.updateCUTB();
        return getConsts().univ4cont;

    }
}
