// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_makename_2_consts {
    Code entry_code;
    Code atomic2cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("makename");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("name_nil_ok");
    final static String string4 = Const.strIntern("append");
    final static String string5 = Const.strIntern("atomic");
    final static String string6 = Const.strIntern("cut");
    final static String string7 = Const.strIntern("[]");
    final static String string8 = Const.strIntern("");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_makename_2 extends Code {
    private final pred_makename_2_consts consts;

    public pred_makename_2() {
        consts = new pred_makename_2_consts();
        initAlternatives();
    }

    protected pred_makename_2(pred_makename_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_makename_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_makename_2_1(this));
        ALT.addAlternative(new pred_makename_2_2(this));
        ALT.addAlternative(new pred_makename_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.atomic2cont = mach.loadPred("atomic", 1);
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

class pred_makename_2_1 extends pred_makename_2 {
    pred_makename_2_1(pred_makename_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string7);
        Term arg1 = JpFactory.CONST(getConsts().string8);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string7))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.CONST(getConsts().string8))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_makename_2_2 extends pred_makename_2 {
    pred_makename_2_2(pred_makename_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = var1.dref();
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().atomic2cont;
    }
}

class pred_makename_2_3 extends pred_makename_2 {
    pred_makename_2_3(pred_makename_2 consts) {
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
        Term var7 = JpFactory.JVAR(mach);
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
        local_aregs[0] = var2.dref();
        local_aregs[1] = var4;
        local_aregs[2] = JpFactory.S(getConsts().string3, var4.dref(), var5, JpFactory
                .S(getConsts().string3, var1.dref(), var6, JpFactory.S(getConsts().string4, var6.dref(), var5
                        .dref(), var7, JpFactory.S(getConsts().string3, var3.dref(), var7.dref(), continuation))));
        mach.updateCUTB();
        return getConsts().entry_code;
    }
}
