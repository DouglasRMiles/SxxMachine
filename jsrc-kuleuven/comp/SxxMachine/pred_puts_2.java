// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_puts_2_consts {
    Code entry_code;
    Code univ4cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("puts");
    final static String string2 = Const.strIntern("univ");
    final static String string3 = Const.strIntern("cut");
    final static String string4 = Const.strIntern("cut");
    final static String string5 = Const.strIntern("writel");
    final static String string6 = Const.strIntern(".");
    final static String string7 = Const.strIntern("    mach.doCut(mach.getCUTB())  ;");
    final static String string8 = Const.strIntern("wr");
    final static String string9 = Const.strIntern("nl");
    final static String string10 = Const.strIntern("[]");
    final static String string11 = Const.strIntern("putforarg");
    final static Int posint0 = JpFactory.Long(0);
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_puts_2 extends Code {
    private final pred_puts_2_consts consts;

    public pred_puts_2() {
        consts = new pred_puts_2_consts();
        initAlternatives();
    }

    protected pred_puts_2(pred_puts_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_puts_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_puts_2_1(this));
        ALT.addAlternative(new pred_puts_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
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

class pred_puts_2_1 extends pred_puts_2 {
    pred_puts_2_1(pred_puts_2 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string0, var1, var2);
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
        if (!(areg0.unify(JpFactory.S(getConsts().string0, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string5, JpFactory
                .S(getConsts().string6, JpFactory.CONST(getConsts().string7), JpFactory
                        .S(getConsts().string6, JpFactory.S(getConsts().string8, JpFactory
                                .CONST(getConsts().string9)), JpFactory.CONST(getConsts().string10))), JpFactory
                                        .S(getConsts().string11, var2.dref(), getConsts().posint0, var3
                                                .dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_puts_2_2 extends pred_puts_2 {
    pred_puts_2_2(pred_puts_2 consts) {
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
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;
        local_aregs[3] = JpFactory
                .S(getConsts().string1, var4.dref(), getConsts().posint0, var2.dref(), continuation);
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
