// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_getnameindex_4_consts {
    Code entry_code;
    Code inc3cont;
    Code escapeFunctor3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("getnameindex");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("inc");
    final static String string4 = Const.strIntern("escapeFunctor");
    final static String string5 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_getnameindex_4 extends Code {
    private final pred_getnameindex_4_consts consts;

    public pred_getnameindex_4() {
        consts = new pred_getnameindex_4_consts();
        initAlternatives();
    }

    protected pred_getnameindex_4(pred_getnameindex_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_getnameindex_4_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_getnameindex_4_1(this));
        ALT.addAlternative(new pred_getnameindex_4_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.inc3cont = mach.loadPred("inc", 2);
        consts.escapeFunctor3cont = mach.loadPred("escapeFunctor", 2);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_getnameindex_4_1 extends pred_getnameindex_4 {
    pred_getnameindex_4_1(pred_getnameindex_4 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
        Term arg3 = var4.dref();
        return new Term[] { arg0, arg1, arg2, arg3 };
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
        if (!(areg3.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var3.dref();
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = null;
        return getConsts().escapeFunctor3cont;
    }
}

class pred_getnameindex_4_2 extends pred_getnameindex_4 {
    pred_getnameindex_4_2(pred_getnameindex_4 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
        Term arg3 = var5;
        return new Term[] { arg0, arg1, arg2, arg3 };
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
        if (!(areg3.unify(var5.dref())))
            return mach.Fail0;
        local_aregs[0] = var6;
        local_aregs[1] = var4.dref();
        local_aregs[2] = JpFactory
                .S(getConsts().string1, var2.dref(), var3.dref(), var6.dref(), var5.dref(), continuation);
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = null;
        return getConsts().inc3cont;
    }
}
