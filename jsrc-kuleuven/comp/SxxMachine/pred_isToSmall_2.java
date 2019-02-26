// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_isToSmall_2_consts {
    Code entry_code;
    Code maxClauses3cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("isToSmall");
    final static String string2 = Const.strIntern("maxClauses");
    final static String string3 = Const.strIntern("call");
    final static Int posint5 = JpFactory.Long(5);
    final static Int posint0 = JpFactory.Long(0);
}

public class pred_isToSmall_2 extends Code {
    private final pred_isToSmall_2_consts consts;

    public pred_isToSmall_2() {
        consts = new pred_isToSmall_2_consts();
        initAlternatives();
    }

    protected pred_isToSmall_2(pred_isToSmall_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_isToSmall_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_isToSmall_2_1(this));
        ALT.addAlternative(new pred_isToSmall_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.maxClauses3cont = mach.loadPred("maxClauses", 2);
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

class pred_isToSmall_2_1 extends pred_isToSmall_2 {
    pred_isToSmall_2_1(pred_isToSmall_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = var1;
        Term arg1 = getConsts().posint0;
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
        if (!(areg1.unify(getConsts().posint0)))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_isToSmall_2_2 extends pred_isToSmall_2 {
    pred_isToSmall_2_2(pred_isToSmall_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
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
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = getConsts().posint5;
        local_aregs[2] = continuation;
        mach.updateCUTB();
        return getConsts().maxClauses3cont;
    }
}
