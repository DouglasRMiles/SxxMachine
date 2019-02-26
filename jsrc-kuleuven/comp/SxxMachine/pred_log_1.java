// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_log_1_consts {
    Code entry_code;
    Code nb_current3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("log");
    final static String string2 = Const.strIntern("call");
    final static String string3 = Const.strIntern("nb_current");
    final static String string4 = Const.strIntern("VERBOSE");
    final static String string5 = Const.strIntern("true");
    final static String string6 = Const.strIntern("cut");
    final static String string7 = Const.strIntern("writel");
    final static String string8 = Const.strIntern("nl");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_log_1 extends Code {
    private final pred_log_1_consts consts;

    public pred_log_1() {
        consts = new pred_log_1_consts();
        initAlternatives();
    }

    protected pred_log_1(pred_log_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_log_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_log_1_1(this));
        ALT.addAlternative(new pred_log_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
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

class pred_log_1_1 extends pred_log_1 {
    pred_log_1_1(pred_log_1 consts) {
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
        local_aregs[0] = JpFactory.CONST(getConsts().string4);
        local_aregs[1] = JpFactory.CONST(getConsts().string5);
        local_aregs[2] = JpFactory.S(getConsts().string0, new HeapChoice(mach.getCUTB()), JpFactory
                .S(getConsts().string7, var1.dref(), JpFactory.S(getConsts().string8, continuation)));
        mach.updateCUTB();
        return getConsts().nb_current3cont;
    }
}

class pred_log_1_2 extends pred_log_1 {
    pred_log_1_2(pred_log_1 consts) {
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
