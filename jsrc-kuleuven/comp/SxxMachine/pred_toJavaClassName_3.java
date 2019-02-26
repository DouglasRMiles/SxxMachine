// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_toJavaClassName_3_consts {
    Code entry_code;
    Code makename3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("toJavaClassName");
    final static String string2 = Const.strIntern("makename");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("pred_");
    final static String string5 = Const.strIntern("_");
    final static String string6 = Const.strIntern("[]");
    final static String string7 = Const.strIntern("?-");
    final static String string8 = Const.strIntern("query");
    final static String string9 = Const.strIntern("call");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_toJavaClassName_3 extends Code {
    private final pred_toJavaClassName_3_consts consts;

    public pred_toJavaClassName_3() {
        consts = new pred_toJavaClassName_3_consts();
        initAlternatives();
    }

    protected pred_toJavaClassName_3(pred_toJavaClassName_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_toJavaClassName_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_toJavaClassName_3_1(this));
        ALT.addAlternative(new pred_toJavaClassName_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.makename3cont = mach.loadPred("makename", 2);
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

class pred_toJavaClassName_3_1 extends pred_toJavaClassName_3 {
    pred_toJavaClassName_3_1(pred_toJavaClassName_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string7);
        Term arg1 = getConsts().posint1;
        Term arg2 = JpFactory.CONST(getConsts().string8);
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
        if (!(areg0.unify(JpFactory.CONST(getConsts().string7))))
            return mach.Fail0;
        if (!(areg1.unify(getConsts().posint1)))
            return mach.Fail0;
        if (!(areg2.unify(JpFactory.CONST(getConsts().string8))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_toJavaClassName_3_2 extends pred_toJavaClassName_3 {
    pred_toJavaClassName_3_2(pred_toJavaClassName_3 consts) {
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
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, var1.dref(), JpFactory
                        .S(getConsts().string3, JpFactory.CONST(getConsts().string5), JpFactory
                                .S(getConsts().string3, var2.dref(), JpFactory.CONST(getConsts().string6)))));
        local_aregs[1] = var3.dref();
        local_aregs[2] = continuation;
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().makename3cont;
    }
}
