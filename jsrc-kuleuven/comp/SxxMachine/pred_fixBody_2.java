// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_fixBody_2_consts {
    Code entry_code;
    Code fixClauses3cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("fixBody");
    final static String string2 = Const.strIntern("fixClauses");
    final static String string3 = Const.strIntern(",");
    final static String string4 = Const.strIntern("cut");
    final static String string5 = Const.strIntern("[]");
    final static String string6 = Const.strIntern("call");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_fixBody_2 extends Code {
    private final pred_fixBody_2_consts consts;

    public pred_fixBody_2() {
        consts = new pred_fixBody_2_consts();
        initAlternatives();
    }

    protected pred_fixBody_2(pred_fixBody_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_fixBody_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_fixBody_2_1(this));
        ALT.addAlternative(new pred_fixBody_2_2(this));
        ALT.addAlternative(new pred_fixBody_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.fixClauses3cont = mach.loadPred("fixClauses", 2);
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

class pred_fixBody_2_1 extends pred_fixBody_2 {
    pred_fixBody_2_1(pred_fixBody_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string5);
        Term arg1 = JpFactory.CONST(getConsts().string5);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string5))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.CONST(getConsts().string5))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_fixBody_2_2 extends pred_fixBody_2 {
    pred_fixBody_2_2(pred_fixBody_2 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string3, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string3, var3, var4);
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
        if (!(areg0.unify(JpFactory.S(getConsts().string3, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string3, var3.dref(), var4.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string2, var1.dref(), var3.dref(), JpFactory
                .S(getConsts().string1, var2.dref(), var4.dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_fixBody_2_3 extends pred_fixBody_2 {
    pred_fixBody_2_3(pred_fixBody_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return getConsts().fixClauses3cont;
    }
}
