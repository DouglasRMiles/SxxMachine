// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

class pred_getData_4_consts {
    Code entry_code;
    Code createSet4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("getData");
    final static String string2 = Const.strIntern("createSet");
    final static String string3 = Const.strIntern("continuationof");
    final static String string4 = Const.strIntern("stringof");
    final static String string5 = Const.strIntern("intof");
    final static String string6 = Const.strIntern("fixClauses");
    final static String string7 = Const.strIntern("escapeStrings");
    final static String string8 = Const.strIntern("unify");
    final static String string9 = Const.strIntern(".");
    final static String string10 = Const.strIntern("cut");
}

public class pred_getData_4 extends Code {
    private final pred_getData_4_consts consts;

    public pred_getData_4() {
        consts = new pred_getData_4_consts();
        initAlternatives();
    }

    protected pred_getData_4(pred_getData_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_getData_4_consts getConsts() {
        return consts;
    }

    private static Alternatives ALT = null;

    private void initAlternatives() {
    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.createSet4cont = mach.loadPred("createSet", 3);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var8 = JpFactory.JVAR(mach);
        Term var7 = JpFactory.JVAR(mach);
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
        if (!(areg3.unify(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = JpFactory.S(getConsts().string3, var1.dref(), var5.dref());
        local_aregs[2] = var2.dref();
        local_aregs[3] = JpFactory.S(getConsts().string2, var5.dref(), JpFactory
                .S(getConsts().string4, var1.dref(), var5.dref()), var6, JpFactory.S(getConsts().string2, var5
                        .dref(), JpFactory.S(getConsts().string5, var1.dref(), var5.dref()), var4
                                .dref(), JpFactory.S(getConsts().string6, var7, var6.dref(), JpFactory
                                        .S(getConsts().string7, var7.dref(), var8, JpFactory
                                                .S(getConsts().string8, JpFactory.S(getConsts().string9, JpFactory
                                                        .CONST(getConsts().string0), var8.dref()), var3
                                                                .dref(), continuation)))));
        mach.updateCUTB();
        local_aregs[4] = null;
        return getConsts().createSet4cont;

    }
}
