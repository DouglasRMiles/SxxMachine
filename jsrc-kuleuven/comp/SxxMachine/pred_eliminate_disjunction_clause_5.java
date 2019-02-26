// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_eliminate_disjunction_clause_5_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("eliminate_disjunction_clause");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("call");
    final static String string4 = Const.strIntern(":-");
    final static String string5 = Const.strIntern("cut");
    final static String string6 = Const.strIntern("functor");
    final static String string7 = Const.strIntern("term_variables");
    final static String string8 = Const.strIntern("eliminate_disjunction");
    final static String string9 = Const.strIntern("/");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_eliminate_disjunction_clause_5 extends Code {
    private final pred_eliminate_disjunction_clause_5_consts consts;

    public pred_eliminate_disjunction_clause_5() {
        consts = new pred_eliminate_disjunction_clause_5_consts();
        initAlternatives();
    }

    protected pred_eliminate_disjunction_clause_5(pred_eliminate_disjunction_clause_5 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_eliminate_disjunction_clause_5_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_eliminate_disjunction_clause_5_1(this));
        ALT.addAlternative(new pred_eliminate_disjunction_clause_5_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
    }

    @Override
    public int arity() {
        return 5;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(6);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_eliminate_disjunction_clause_5_1 extends pred_eliminate_disjunction_clause_5 {
    pred_eliminate_disjunction_clause_5_1(pred_eliminate_disjunction_clause_5 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string4, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
        Term arg3 = JpFactory.S(getConsts().string2, JpFactory.S(getConsts().string4, var1.dref(), var5), var6);
        Term arg4 = var7;
        return new Term[] { arg0, arg1, arg2, arg3, arg4 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[5];
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
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
        if (!(areg0.unify(JpFactory.S(getConsts().string4, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unify(JpFactory
                .S(getConsts().string2, JpFactory.S(getConsts().string4, var1.dref(), var5.dref()), var6.dref()))))
            return mach.Fail0;
        if (!(areg4.unify(var7.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string6, var1.dref(), var8, var9, JpFactory
                .S(getConsts().string7, var1.dref(), var10, JpFactory
                        .S(getConsts().string8, var2.dref(), JpFactory
                                .S(getConsts().string9, var8.dref(), var9.dref()), var10.dref(), var3
                                        .dref(), var4.dref(), var5.dref(), var6.dref(), var7.dref(), continuation)));
        mach.updateCUTB();
        local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_eliminate_disjunction_clause_5_2 extends pred_eliminate_disjunction_clause_5 {
    pred_eliminate_disjunction_clause_5_2(pred_eliminate_disjunction_clause_5 consts) {
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
        Term arg0 = var1;
        Term arg1 = var2;
        Term arg2 = var2.dref();
        Term arg3 = JpFactory.S(getConsts().string2, var1.dref(), var3);
        Term arg4 = var3.dref();
        return new Term[] { arg0, arg1, arg2, arg3, arg4 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[5];
        Term areg4 = local_aregs[4].dref();
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg3.unify(JpFactory.S(getConsts().string2, var1.dref(), var3.dref()))))
            return mach.Fail0;
        if (!(areg4.unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[5] = local_aregs[4] = local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
