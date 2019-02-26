// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_wr_1_consts {
    Code entry_code;
    Code writel2cont;
    Code cut2cont;
    Code atomic2cont;
    Code getPackageName2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("wr");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("writel");
    final static String string5 = Const.strIntern("[]");
    final static String string6 = Const.strIntern("cut");
    final static String string7 = Const.strIntern("varnr");
    final static String string8 = Const.strIntern("write");
    final static String string9 = Const.strIntern("atomic");
    final static String string10 = Const.strIntern("nl");
    final static String string11 = Const.strIntern("package");
    final static String string12 = Const.strIntern("getPackageName");
    final static String string13 = Const.strIntern("package ");
    final static String string14 = Const.strIntern(";");
    final static String string15 = Const.strIntern("");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_wr_1 extends Code {
    private final pred_wr_1_consts consts;

    public pred_wr_1() {
        consts = new pred_wr_1_consts();
        initAlternatives();
    }

    protected pred_wr_1(pred_wr_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_wr_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_wr_1_1(this));
        ALT.addAlternative(new pred_wr_1_2(this));
        ALT.addAlternative(new pred_wr_1_3(this));
        ALT.addAlternative(new pred_wr_1_4(this));
        ALT.addAlternative(new pred_wr_1_5(this));
        ALT.addAlternative(new pred_wr_1_6(this));
        ALT.addAlternative(new pred_wr_1_7(this));
        ALT.addAlternative(new pred_wr_1_8(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
        consts.atomic2cont = mach.loadPred("atomic", 1);
        consts.getPackageName2cont = mach.loadPred("getPackageName", 1);
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

class pred_wr_1_1 extends pred_wr_1 {
    pred_wr_1_1(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.S(getConsts().string1, JpFactory.CONST(getConsts().string11));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.S(getConsts().string1, JpFactory.CONST(getConsts().string11)))))
            return mach.Fail0;
        local_aregs[0] = JpFactory.CONST(getConsts().string15);
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        return getConsts().getPackageName2cont;
    }
}

class pred_wr_1_2 extends pred_wr_1 {
    pred_wr_1_2(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string1, JpFactory.CONST(getConsts().string11));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string1, JpFactory.CONST(getConsts().string11)))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string12, var1, JpFactory
                .S(getConsts().string8, JpFactory.CONST(getConsts().string13), JpFactory
                        .S(getConsts().string8, var1.dref(), JpFactory.S(getConsts().string8, JpFactory
                                .CONST(getConsts().string14), JpFactory.S(getConsts().string10, continuation)))));
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_wr_1_3 extends pred_wr_1 {
    pred_wr_1_3(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.S(getConsts().string1, JpFactory.CONST(getConsts().string10));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.S(getConsts().string1, JpFactory.CONST(getConsts().string10)))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string10, continuation);
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_wr_1_4 extends pred_wr_1 {
    pred_wr_1_4(pred_wr_1 consts) {
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
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string8, var1.dref(), continuation));
        mach.updateCUTB();
        return getConsts().atomic2cont;
    }
}

class pred_wr_1_5 extends pred_wr_1 {
    pred_wr_1_5(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string7, var1, var2);
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
        if (!(areg0.unify(JpFactory.S(getConsts().string7, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory
                .S(getConsts().string8, JpFactory.S(getConsts().string7, var1.dref(), var2.dref()), continuation);
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_wr_1_6 extends pred_wr_1 {
    pred_wr_1_6(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string5);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string5))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_wr_1_7 extends pred_wr_1 {
    pred_wr_1_7(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string3, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, var1.dref(), var2.dref());
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return getConsts().writel2cont;
    }
}

class pred_wr_1_8 extends pred_wr_1 {
    pred_wr_1_8(pred_wr_1 consts) {
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
        local_aregs[0] = var1.dref();
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return mach.Call2;
    }
}
