// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_changeIllegalTerms_2_consts {
    Code entry_code;
    Code not2cont;
    Code cut2cont;
    Code var2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("changeIllegalTerms");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern("not");
    final static String string4 = Const.strIntern("var");
    final static String string5 = Const.strIntern("name_nil_ok");
    final static String string6 = Const.strIntern(".");
    final static String string7 = Const.strIntern("t");
    final static String string8 = Const.strIntern("[]");
    final static String string9 = Const.strIntern("cut");
    final static String string10 = Const.strIntern("continuation");
    final static String string11 = Const.strIntern("tcontinuation____term");
    final static String string12 = Const.strIntern("cut");
    final static String string13 = Const.strIntern("tcut____term");
    final static String string14 = Const.strIntern("varnr");
    final static String string15 = Const.strIntern("tvarnr____term");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_changeIllegalTerms_2 extends Code {
    private final pred_changeIllegalTerms_2_consts consts;

    public pred_changeIllegalTerms_2() {
        consts = new pred_changeIllegalTerms_2_consts();
        initAlternatives();
    }

    protected pred_changeIllegalTerms_2(pred_changeIllegalTerms_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_changeIllegalTerms_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_changeIllegalTerms_2_1(this));
        ALT.addAlternative(new pred_changeIllegalTerms_2_2(this));
        ALT.addAlternative(new pred_changeIllegalTerms_2_3(this));
        ALT.addAlternative(new pred_changeIllegalTerms_2_4(this));
        ALT.addAlternative(new pred_changeIllegalTerms_2_5(this));
        ALT.addAlternative(new pred_changeIllegalTerms_2_6(this));
        ALT.addAlternative(new pred_changeIllegalTerms_2_7(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.not2cont = mach.loadPred("not", 1);
        consts.var2cont = mach.loadPred("var", 1);
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

class pred_changeIllegalTerms_2_1 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_1(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var1.dref();
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().var2cont;
    }
}

class pred_changeIllegalTerms_2_2 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_2(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string14);
        Term arg1 = JpFactory.CONST(getConsts().string15);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string14))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.CONST(getConsts().string15))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_changeIllegalTerms_2_3 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_3(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string0);
        Term arg1 = JpFactory.CONST(getConsts().string13);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string0))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.CONST(getConsts().string13))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_changeIllegalTerms_2_4 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_4(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string10);
        Term arg1 = JpFactory.CONST(getConsts().string11);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string10))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.CONST(getConsts().string11))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_changeIllegalTerms_2_5 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_5(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string4, var1.dref());
        local_aregs[1] = JpFactory.S(getConsts().string5, JpFactory.CONST(getConsts().string7), JpFactory
                .S(getConsts().string6, var3, JpFactory.CONST(getConsts().string8)), JpFactory
                        .S(getConsts().string5, var1.dref(), JpFactory
                                .S(getConsts().string6, var3.dref(), var4), JpFactory
                                        .S(getConsts().string5, var2.dref(), JpFactory
                                                .S(getConsts().string6, var3.dref(), JpFactory
                                                        .S(getConsts().string6, var3.dref(), var4.dref())), JpFactory
                                                                .S(getConsts().string0, new HeapChoice(
                                                                        mach.getCUTB()), continuation))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().not2cont;
    }
}

class pred_changeIllegalTerms_2_6 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_6(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string4, var2.dref());
        local_aregs[1] = JpFactory.S(getConsts().string5, var2.dref(), JpFactory
                .S(getConsts().string6, var3, JpFactory.S(getConsts().string6, var3.dref(), var4)), JpFactory
                        .S(getConsts().string5, JpFactory.CONST(getConsts().string7), JpFactory
                                .S(getConsts().string6, var3.dref(), JpFactory
                                        .CONST(getConsts().string8)), JpFactory
                                                .S(getConsts().string5, var1.dref(), JpFactory
                                                        .S(getConsts().string6, var3.dref(), var4.dref()), JpFactory
                                                                .S(getConsts().string0, new HeapChoice(
                                                                        mach.getCUTB()), continuation))));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().not2cont;
    }
}

class pred_changeIllegalTerms_2_7 extends pred_changeIllegalTerms_2 {
    pred_changeIllegalTerms_2_7(pred_changeIllegalTerms_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var1.dref();
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
