// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_escapeChars2_3_consts {
    Code entry_code;
    Code name_nil_ok3cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("escapeChars2");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("name_nil_ok");
    final static String string4 = Const.strIntern("[]");
    final static String string5 = Const.strIntern("changeChar");
    final static String string6 = Const.strIntern("append");
    final static String string7 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_escapeChars2_3 extends Code {
    private final pred_escapeChars2_3_consts consts;

    public pred_escapeChars2_3() {
        consts = new pred_escapeChars2_3_consts();
        initAlternatives();
    }

    protected pred_escapeChars2_3(pred_escapeChars2_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_escapeChars2_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_escapeChars2_3_1(this));
        ALT.addAlternative(new pred_escapeChars2_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.name_nil_ok3cont = mach.loadPred("name_nil_ok", 2);
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

class pred_escapeChars2_3_1 extends pred_escapeChars2_3 {
    pred_escapeChars2_3_1(pred_escapeChars2_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(getConsts().string4);
        Term arg1 = var1;
        Term arg2 = var1.dref();
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
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.CONST(getConsts().string4))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var1.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_escapeChars2_3_2 extends pred_escapeChars2_3 {
    pred_escapeChars2_3_2(pred_escapeChars2_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term var8 = JpFactory.JVAR(mach);
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
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
        local_aregs[1] = JpFactory.S(getConsts().string2, var1.dref(), JpFactory.CONST(getConsts().string4));
        local_aregs[2] = JpFactory.S(getConsts().string5, var5.dref(), var6, JpFactory
                .S(getConsts().string3, var6.dref(), var7, JpFactory
                        .S(getConsts().string6, var3.dref(), var7.dref(), var8, JpFactory
                                .S(getConsts().string1, var2.dref(), var8.dref(), var4.dref(), continuation))));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().name_nil_ok3cont;
    }
}
