// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_continuationof_2_consts {
    Code entry_code;
    Code functor4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("continuationof");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern(":-");
    final static String string4 = Const.strIntern("/");
    final static String string5 = Const.strIntern("functor");
}

public class pred_continuationof_2 extends Code {
    private final pred_continuationof_2_consts consts;

    public pred_continuationof_2() {
        consts = new pred_continuationof_2_consts();
        initAlternatives();
    }

    protected pred_continuationof_2(pred_continuationof_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_continuationof_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_continuationof_2_1(this));
        ALT.addAlternative(new pred_continuationof_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
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

class pred_continuationof_2_1 extends pred_continuationof_2 {
    pred_continuationof_2_1(pred_continuationof_2 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, JpFactory.S(getConsts().string3, var1, var2), var3);
        Term arg1 = JpFactory.S(getConsts().string4, var4, var5);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory
                .S(getConsts().string2, JpFactory.S(getConsts().string3, var1.dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string4, var4.dref(), var5.dref()))))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var4.dref();
        local_aregs[2] = var5.dref();
        local_aregs[3] = continuation;
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_continuationof_2_2 extends pred_continuationof_2 {
    pred_continuationof_2_2(pred_continuationof_2 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2);
        Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return getConsts().entry_code;
    }
}
