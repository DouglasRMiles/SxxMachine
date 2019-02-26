// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_newargsKomma_1_consts {
    Code entry_code;
    Code smallerthan3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("newargsKomma");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern("smallerthan");
    final static String string4 = Const.strIntern("cut");
    final static String string5 = Const.strIntern("write");
    final static String string6 = Const.strIntern(",");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_newargsKomma_1 extends Code {
    private final pred_newargsKomma_1_consts consts;

    public pred_newargsKomma_1() {
        consts = new pred_newargsKomma_1_consts();
        initAlternatives();
    }

    protected pred_newargsKomma_1(pred_newargsKomma_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_newargsKomma_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_newargsKomma_1_1(this));
        ALT.addAlternative(new pred_newargsKomma_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.smallerthan3cont = mach.loadPred("smallerthan", 2);
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

class pred_newargsKomma_1_1 extends pred_newargsKomma_1 {
    pred_newargsKomma_1_1(pred_newargsKomma_1 consts) {
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
        local_aregs[0] = getConsts().posint1;
        local_aregs[1] = var1.dref();
        local_aregs[2] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string5, JpFactory.CONST(getConsts().string6), continuation));
        mach.updateCUTB();
        return getConsts().smallerthan3cont;
    }
}

class pred_newargsKomma_1_2 extends pred_newargsKomma_1 {
    pred_newargsKomma_1_2(pred_newargsKomma_1 consts) {
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
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[1] = null;
        return mach.Call1;
    }
}
