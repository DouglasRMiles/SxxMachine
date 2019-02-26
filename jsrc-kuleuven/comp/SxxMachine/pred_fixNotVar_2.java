// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_fixNotVar_2_consts {
    Code entry_code;
    Code univ4cont;
    Code not2cont;
    Code unify3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("fixNotVar");
    final static String string2 = Const.strIntern("univ");
    final static String string3 = Const.strIntern("fixClauses");
    final static String string4 = Const.strIntern("changeIllegalTerms");
    final static String string5 = Const.strIntern("not");
    final static String string6 = Const.strIntern("var");
    final static String string7 = Const.strIntern("unify");
    final static String string8 = Const.strIntern(":-");
    final static String string9 = Const.strIntern("cut");
    final static String string10 = Const.strIntern("fixBody");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_fixNotVar_2 extends Code {
    private final pred_fixNotVar_2_consts consts;

    public pred_fixNotVar_2() {
        consts = new pred_fixNotVar_2_consts();
        initAlternatives();
    }

    protected pred_fixNotVar_2(pred_fixNotVar_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_fixNotVar_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_fixNotVar_2_1(this));
        ALT.addAlternative(new pred_fixNotVar_2_2(this));
        ALT.addAlternative(new pred_fixNotVar_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
        consts.not2cont = mach.loadPred("not", 1);
        consts.unify3cont = mach.loadPred("unify", 2);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_fixNotVar_2_1 extends pred_fixNotVar_2 {
    pred_fixNotVar_2_1(pred_fixNotVar_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var10 = new DummyVar();
        @SuppressWarnings("unused")
        Term var9 = new DummyVar();
        @SuppressWarnings("unused")
        Term var8 = new DummyVar();
        @SuppressWarnings("unused")
        Term var7 = new DummyVar();
        @SuppressWarnings("unused")
        Term var6 = new DummyVar();
        @SuppressWarnings("unused")
        Term var5 = new DummyVar();
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var10 = JpFactory.JVAR(mach);
        Term var9 = JpFactory.JVAR(mach);
        Term var8 = JpFactory.JVAR(mach);
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string8, var3, var4);
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory.S(getConsts().string5, JpFactory
                .S(getConsts().string6, var3.dref()), JpFactory.S(getConsts().string0, new HeapChoice(
                        mach.getCUTB()), JpFactory.S(getConsts().string2, var3.dref(), var5, var6, JpFactory
                                .S(getConsts().string4, var5.dref(), var7, JpFactory.S(getConsts().string3, var6
                                        .dref(), var8, JpFactory.S(getConsts().string2, var9, var7.dref(), var8
                                                .dref(), JpFactory.S(getConsts().string10, var4
                                                        .dref(), var10, JpFactory.S(getConsts().string7, JpFactory
                                                                .S(getConsts().string8, var9.dref(), var10.dref()), var2
                                                                        .dref(), continuation))))))));
        mach.updateCUTB();
        return getConsts().unify3cont;
    }
}

class pred_fixNotVar_2_2 extends pred_fixNotVar_2 {
    pred_fixNotVar_2_2(pred_fixNotVar_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var6 = new DummyVar();
        @SuppressWarnings("unused")
        Term var5 = new DummyVar();
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string6, var1.dref());
        local_aregs[1] = JpFactory.S(getConsts().string2, var1.dref(), var3, var4, JpFactory
                .S(getConsts().string4, var3.dref(), var5, JpFactory
                        .S(getConsts().string3, var4.dref(), var6, JpFactory
                                .S(getConsts().string2, var2.dref(), var5.dref(), var6.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().not2cont;
    }
}

class pred_fixNotVar_2_3 extends pred_fixNotVar_2 {
    pred_fixNotVar_2_3(pred_fixNotVar_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var6 = new DummyVar();
        @SuppressWarnings("unused")
        Term var5 = new DummyVar();
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;
        local_aregs[3] = JpFactory.S(getConsts().string3, var5, var4.dref(), JpFactory
                .S(getConsts().string4, var6, var3.dref(), JpFactory
                        .S(getConsts().string2, var1.dref(), var6.dref(), var5.dref(), continuation)));
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
