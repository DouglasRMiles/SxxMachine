// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_createArgs_3_consts {
    Code entry_code;
    Code inc3cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("createArgs");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("inc");
    final static String string4 = Const.strIntern("writel");
    final static String string5 = Const.strIntern("    PrologObject arg");
    final static String string6 = Const.strIntern(" = ");
    final static String string7 = Const.strIntern("constructterm");
    final static String string8 = Const.strIntern(";");
    final static String string9 = Const.strIntern("wr");
    final static String string10 = Const.strIntern("nl");
    final static String string11 = Const.strIntern("[]");
    final static String string12 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_createArgs_3 extends Code {
    private final pred_createArgs_3_consts consts;

    public pred_createArgs_3() {
        consts = new pred_createArgs_3_consts();
        initAlternatives();
    }

    protected pred_createArgs_3(pred_createArgs_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_createArgs_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_createArgs_3_1(this));
        ALT.addAlternative(new pred_createArgs_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.inc3cont = mach.loadPred("inc", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_createArgs_3_1 extends pred_createArgs_3 {
    pred_createArgs_3_1(pred_createArgs_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string2, var1, JpFactory.CONST(getConsts().string11));
        Term arg1 = var2;
        Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1.dref(), JpFactory.CONST(getConsts().string11)))))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_createArgs_3_2 extends pred_createArgs_3 {
    pred_createArgs_3_2(pred_createArgs_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = var3.dref();
        local_aregs[2] = JpFactory.S(getConsts().string4, JpFactory.S(getConsts().string2, JpFactory
                .CONST(getConsts().string5), JpFactory.S(getConsts().string2, var3.dref(), JpFactory
                        .S(getConsts().string2, JpFactory.CONST(getConsts().string6), JpFactory
                                .S(getConsts().string2, JpFactory
                                        .S(getConsts().string7, var1.dref(), var4.dref()), JpFactory
                                                .S(getConsts().string2, JpFactory
                                                        .CONST(getConsts().string8), JpFactory
                                                                .S(getConsts().string2, JpFactory
                                                                        .S(getConsts().string9, JpFactory
                                                                                .CONST(getConsts().string10)), JpFactory
                                                                                        .CONST(getConsts().string11))))))), JpFactory
                                                                                                .S(getConsts().string1, var2
                                                                                                        .dref(), var5
                                                                                                                .dref(), var4
                                                                                                                        .dref(), continuation));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().inc3cont;
    }
}
