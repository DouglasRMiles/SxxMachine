// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_enableIndexing_1_consts {
    Code entry_code;
    Code writel2cont;
    Code isIndexingAllowed2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("enableIndexing");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("  ALT.disable();");
    final static String string5 = Const.strIntern("wr");
    final static String string6 = Const.strIntern("nl");
    final static String string7 = Const.strIntern("[]");
    final static String string8 = Const.strIntern("isIndexingAllowed");
    final static String string9 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_enableIndexing_1 extends Code {
    private final pred_enableIndexing_1_consts consts;

    public pred_enableIndexing_1() {
        consts = new pred_enableIndexing_1_consts();
        initAlternatives();
    }

    protected pred_enableIndexing_1(pred_enableIndexing_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_enableIndexing_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_enableIndexing_1_1(this));
        ALT.addAlternative(new pred_enableIndexing_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
        consts.isIndexingAllowed2cont = mach.loadPred("isIndexingAllowed", 1);
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

class pred_enableIndexing_1_1 extends pred_enableIndexing_1 {
    pred_enableIndexing_1_1(pred_enableIndexing_1 consts) {
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
        local_aregs[1] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        return getConsts().isIndexingAllowed2cont;
    }
}

class pred_enableIndexing_1_2 extends pred_enableIndexing_1 {
    pred_enableIndexing_1_2(pred_enableIndexing_1 consts) {
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
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, JpFactory.S(getConsts().string5, JpFactory
                        .CONST(getConsts().string6)), JpFactory.CONST(getConsts().string7)));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        return getConsts().writel2cont;
    }
}
