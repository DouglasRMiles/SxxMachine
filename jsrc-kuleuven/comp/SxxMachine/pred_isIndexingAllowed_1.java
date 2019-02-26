// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_isIndexingAllowed_1_consts {
    Code entry_code;
    Code concat_atom3cont;
    Code nb_current3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("isIndexingAllowed");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern("concat_atom");
    final static String string4 = Const.strIntern(".");
    final static String string5 = Const.strIntern("DISABLE_INDEXING_");
    final static String string6 = Const.strIntern("[]");
    final static String string7 = Const.strIntern("nb_current");
    final static String string8 = Const.strIntern("true");
    final static String string9 = Const.strIntern("cut");
    final static String string10 = Const.strIntern("fail");
    final static String string11 = Const.strIntern("DISABLE_INDEXING");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_isIndexingAllowed_1 extends Code {
    private final pred_isIndexingAllowed_1_consts consts;

    public pred_isIndexingAllowed_1() {
        consts = new pred_isIndexingAllowed_1_consts();
        initAlternatives();
    }

    protected pred_isIndexingAllowed_1(pred_isIndexingAllowed_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_isIndexingAllowed_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_isIndexingAllowed_1_1(this));
        ALT.addAlternative(new pred_isIndexingAllowed_1_2(this));
        ALT.addAlternative(new pred_isIndexingAllowed_1_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.concat_atom3cont = mach.loadPred("concat_atom", 2);
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
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

class pred_isIndexingAllowed_1_1 extends pred_isIndexingAllowed_1 {
    pred_isIndexingAllowed_1_1(pred_isIndexingAllowed_1 consts) {
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
        local_aregs[0] = JpFactory.CONST(getConsts().string11);
        local_aregs[1] = JpFactory.CONST(getConsts().string8);
        local_aregs[2] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string10, continuation));
        mach.updateCUTB();
        return getConsts().nb_current3cont;
    }
}

class pred_isIndexingAllowed_1_2 extends pred_isIndexingAllowed_1 {
    pred_isIndexingAllowed_1_2(pred_isIndexingAllowed_1 consts) {
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
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string4, JpFactory.CONST(getConsts().string5), JpFactory
                .S(getConsts().string4, var1.dref(), JpFactory.CONST(getConsts().string6)));
        local_aregs[1] = var2;
        local_aregs[2] = JpFactory
                .S(getConsts().string7, var2.dref(), JpFactory.CONST(getConsts().string8), JpFactory
                        .S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                                .S(getConsts().string10, continuation)));
        mach.updateCUTB();
        return getConsts().concat_atom3cont;
    }
}

class pred_isIndexingAllowed_1_3 extends pred_isIndexingAllowed_1 {
    pred_isIndexingAllowed_1_3(pred_isIndexingAllowed_1 consts) {
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
