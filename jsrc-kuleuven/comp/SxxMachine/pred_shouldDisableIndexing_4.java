// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_shouldDisableIndexing_4_consts {
    Code entry_code;
    Code isIndexingAllowed2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("shouldDisableIndexing");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern("isIndexingAllowed");
    final static String string4 = Const.strIntern("isToSmall");
    final static String string5 = Const.strIntern("disableIndexing");
    final static String string6 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_shouldDisableIndexing_4 extends Code {
    private final pred_shouldDisableIndexing_4_consts consts;

    public pred_shouldDisableIndexing_4() {
        consts = new pred_shouldDisableIndexing_4_consts();
        initAlternatives();
    }

    protected pred_shouldDisableIndexing_4(pred_shouldDisableIndexing_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_shouldDisableIndexing_4_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_shouldDisableIndexing_4_1(this));
        ALT.addAlternative(new pred_shouldDisableIndexing_4_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.isIndexingAllowed2cont = mach.loadPred("isIndexingAllowed", 1);
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

class pred_shouldDisableIndexing_4_1 extends pred_shouldDisableIndexing_4 {
    pred_shouldDisableIndexing_4_1(pred_shouldDisableIndexing_4 consts) {
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
        Term arg2 = var3;
        Term arg3 = var4;
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory
                .S(getConsts().string4, var4.dref(), var3.dref(), JpFactory.S(getConsts().string5, var1
                        .dref(), JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation)));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return getConsts().isIndexingAllowed2cont;
    }
}

class pred_shouldDisableIndexing_4_2 extends pred_shouldDisableIndexing_4 {
    pred_shouldDisableIndexing_4_2(pred_shouldDisableIndexing_4 consts) {
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
        Term arg2 = var3;
        Term arg3 = var4;
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
