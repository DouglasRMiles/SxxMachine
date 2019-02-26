// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_mynumbervarslist_3_consts {
    Code entry_code;
    Code mynumbervars4cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("mynumbervarslist");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("mynumbervars");
    final static String string4 = Const.strIntern("[]");
    final static String string5 = Const.strIntern("call");
}

public class pred_mynumbervarslist_3 extends Code {
    private final pred_mynumbervarslist_3_consts consts;

    public pred_mynumbervarslist_3() {
        consts = new pred_mynumbervarslist_3_consts();
        initAlternatives();
    }

    protected pred_mynumbervarslist_3(pred_mynumbervarslist_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_mynumbervarslist_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_mynumbervarslist_3_1(this));
        ALT.addAlternative(new pred_mynumbervarslist_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.mynumbervars4cont = mach.loadPred("mynumbervars", 3);
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

class pred_mynumbervarslist_3_1 extends pred_mynumbervarslist_3 {
    pred_mynumbervarslist_3_1(pred_mynumbervarslist_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(getConsts().string4);
        Term arg1 = var1;
        Term arg2 = var1.dref();
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
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.CONST(getConsts().string4))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_mynumbervarslist_3_2 extends pred_mynumbervarslist_3 {
    pred_mynumbervarslist_3_2(pred_mynumbervarslist_3 consts) {
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
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2);
        Term arg1 = var3;
        Term arg2 = var4;
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
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = var5;
        local_aregs[3] = JpFactory.S(getConsts().string1, var2.dref(), var5.dref(), var4.dref(), continuation);
        mach.updateCUTB();
        return getConsts().mynumbervars4cont;
    }
}
