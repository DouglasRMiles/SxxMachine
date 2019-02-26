// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_nullify_2_consts {
    Code entry_code;
    Code is3cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("nullify");
    final static String string2 = Const.strIntern("is");
    final static String string3 = Const.strIntern("-");
    final static String string4 = Const.strIntern("writel");
    final static String string5 = Const.strIntern(".");
    final static String string6 = Const.strIntern("local_aregs[");
    final static String string7 = Const.strIntern("] = ");
    final static String string8 = Const.strIntern("[]");
    final static String string9 = Const.strIntern("cut");
    final static String string10 = Const.strIntern("write");
    final static String string11 = Const.strIntern("null ;");
    final static String string12 = Const.strIntern("nl");
    final static String string13 = Const.strIntern("fail");
    final static Int posint1 = JpFactory.Long(1);
    final static Int posint0 = JpFactory.Long(0);
}

public class pred_nullify_2 extends Code {
    private final pred_nullify_2_consts consts;

    public pred_nullify_2() {
        consts = new pred_nullify_2_consts();
        initAlternatives();
    }

    protected pred_nullify_2(pred_nullify_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_nullify_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_nullify_2_1(this));
        ALT.addAlternative(new pred_nullify_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.is3cont = mach.loadPred("is", 2);
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

class pred_nullify_2_1 extends pred_nullify_2 {
    pred_nullify_2_1(pred_nullify_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = getConsts().posint0;
        Term arg1 = var1;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(getConsts().posint0)))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string10, JpFactory.CONST(getConsts().string11), JpFactory
                .S(getConsts().string12, JpFactory.S(getConsts().string13, continuation)));
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_nullify_2_2 extends pred_nullify_2 {
    pred_nullify_2_2(pred_nullify_2 consts) {
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var3;
        local_aregs[1] = JpFactory.S(getConsts().string3, var2.dref(), getConsts().posint1);
        local_aregs[2] = JpFactory.S(getConsts().string4, JpFactory
                .S(getConsts().string5, JpFactory.CONST(getConsts().string6), JpFactory
                        .S(getConsts().string5, var3.dref(), JpFactory.S(getConsts().string5, JpFactory
                                .CONST(getConsts().string7), JpFactory.CONST(getConsts().string8)))), JpFactory
                                        .S(getConsts().string2, var4, JpFactory
                                                .S(getConsts().string3, var1.dref(), getConsts().posint1), JpFactory
                                                        .S(getConsts().string1, var4.dref(), var3
                                                                .dref(), continuation)));
        mach.updateCUTB();
        return getConsts().is3cont;
    }
}
