// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_genjava_1_consts {
    Code entry_code;
    Code genjavaforpred2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("genjava");
    final static String string2 = Const.strIntern(".");
    final static String string3 = Const.strIntern("genjavaforpred");
    final static String string4 = Const.strIntern("[]");
    final static String string5 = Const.strIntern("call");
}

public class pred_genjava_1 extends Code {
    private final pred_genjava_1_consts consts;

    public pred_genjava_1() {
        consts = new pred_genjava_1_consts();
        initAlternatives();
    }

    protected pred_genjava_1(pred_genjava_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_genjava_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_genjava_1_1(this));
        ALT.addAlternative(new pred_genjava_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.genjavaforpred2cont = mach.loadPred("genjavaforpred", 1);
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

class pred_genjava_1_1 extends pred_genjava_1 {
    pred_genjava_1_1(pred_genjava_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = JpFactory.CONST(getConsts().string4);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(JpFactory.CONST(getConsts().string4))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_genjava_1_2 extends pred_genjava_1 {
    pred_genjava_1_2(pred_genjava_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2);
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
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = JpFactory.S(getConsts().string1, var2.dref(), continuation);
        mach.updateCUTB();
        return getConsts().genjavaforpred2cont;
    }
}
