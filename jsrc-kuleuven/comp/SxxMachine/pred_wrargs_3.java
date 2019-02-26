// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_wrargs_3_consts {
    Code entry_code;
    Code processKomma2cont;
    Code unify3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("wrargs");
    final static String string2 = Const.strIntern("processKomma");
    final static String string3 = Const.strIntern("writel");
    final static String string4 = Const.strIntern(".");
    final static String string5 = Const.strIntern("a");
    final static String string6 = Const.strIntern("[]");
    final static String string7 = Const.strIntern("is");
    final static String string8 = Const.strIntern("-");
    final static String string9 = Const.strIntern("unify");
    final static String string10 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
    final static Int posint0 = JpFactory.Long(0);
}

public class pred_wrargs_3 extends Code {
    private final pred_wrargs_3_consts consts;

    public pred_wrargs_3() {
        consts = new pred_wrargs_3_consts();
        initAlternatives();
    }

    protected pred_wrargs_3(pred_wrargs_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_wrargs_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_wrargs_3_1(this));
        ALT.addAlternative(new pred_wrargs_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.processKomma2cont = mach.loadPred("processKomma", 1);
        consts.unify3cont = mach.loadPred("unify", 2);
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

class pred_wrargs_3_1 extends pred_wrargs_3 {
    pred_wrargs_3_1(pred_wrargs_3 consts) {
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = getConsts().posint0;
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().unify3cont;
    }
}

class pred_wrargs_3_2 extends pred_wrargs_3 {
    pred_wrargs_3_2(pred_wrargs_3 consts) {
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
        local_aregs[0] = var3.dref();
        local_aregs[1] = JpFactory.S(getConsts().string3, JpFactory.S(getConsts().string4, var2
                .dref(), JpFactory.S(getConsts().string4, JpFactory.CONST(getConsts().string5), JpFactory
                        .S(getConsts().string4, var1.dref(), JpFactory.CONST(getConsts().string6)))), JpFactory
                                .S(getConsts().string7, var4, JpFactory
                                        .S(getConsts().string8, var1.dref(), getConsts().posint1), JpFactory
                                                .S(getConsts().string1, var4.dref(), var2.dref(), var3
                                                        .dref(), continuation)));
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return getConsts().processKomma2cont;
    }
}
