// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_nullifyaregs_1_consts {
    Code entry_code;
    Code functor4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("nullifyaregs");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern(":-");
    final static String string4 = Const.strIntern("functor");
    final static String string5 = Const.strIntern("is");
    final static String string6 = Const.strIntern("-");
    final static String string7 = Const.strIntern("smallerthan");
    final static String string8 = Const.strIntern("nullify");
    final static Int posint0 = JpFactory.Long(0);
}

public class pred_nullifyaregs_1 extends Code {
    private final pred_nullifyaregs_1_consts consts;

    public pred_nullifyaregs_1() {
        consts = new pred_nullifyaregs_1_consts();
        initAlternatives();
    }

    protected pred_nullifyaregs_1(pred_nullifyaregs_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_nullifyaregs_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_nullifyaregs_1_1(this));
        ALT.addAlternative(new pred_nullifyaregs_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_nullifyaregs_1_1 extends pred_nullifyaregs_1 {
    pred_nullifyaregs_1_1(pred_nullifyaregs_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term arg0 = JpFactory.S(getConsts().string3, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string3, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;
        local_aregs[3] = JpFactory
                .S(getConsts().string4, var2.dref(), var5, var6, JpFactory.S(getConsts().string5, var7, JpFactory
                        .S(getConsts().string6, var4.dref(), var6.dref()), JpFactory
                                .S(getConsts().string7, getConsts().posint0, var7.dref(), JpFactory
                                        .S(getConsts().string8, var7.dref(), var4.dref(), continuation))));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_nullifyaregs_1_2 extends pred_nullifyaregs_1 {
    pred_nullifyaregs_1_2(pred_nullifyaregs_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[1] = null;
        return mach.Call1;
    }
}
