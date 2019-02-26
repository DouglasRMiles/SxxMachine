// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_declvars_1_consts {
    Code entry_code;
    Code is3cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("declvars");
    final static String string2 = Const.strIntern("is");
    final static String string3 = Const.strIntern("-");
    final static String string4 = Const.strIntern("writel");
    final static String string5 = Const.strIntern(".");
    final static String string6 = Const.strIntern("PrologObject var");
    final static String string7 = Const.strIntern(" = new Var(mach) ;");
    final static String string8 = Const.strIntern("wr");
    final static String string9 = Const.strIntern("nl");
    final static String string10 = Const.strIntern("[]");
    final static String string11 = Const.strIntern("cut");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_declvars_1 extends Code {
    private final pred_declvars_1_consts consts;

    public pred_declvars_1() {
        consts = new pred_declvars_1_consts();
        initAlternatives();
    }

    protected pred_declvars_1(pred_declvars_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_declvars_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_declvars_1_1(this));
        ALT.addAlternative(new pred_declvars_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.is3cont = mach.loadPred("is", 2);
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

class pred_declvars_1_1 extends pred_declvars_1 {
    pred_declvars_1_1(pred_declvars_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        Term arg0 = getConsts().posint1;
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[1];
        Term areg0 = local_aregs[0].dref();
        if (!(areg0.unify(getConsts().posint1)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        return mach.Call1;
    }
}

class pred_declvars_1_2 extends pred_declvars_1 {
    pred_declvars_1_2(pred_declvars_1 consts) {
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
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = var2;
        local_aregs[1] = JpFactory.S(getConsts().string3, var1.dref(), getConsts().posint1);
        local_aregs[2] = JpFactory.S(getConsts().string4, JpFactory.S(getConsts().string5, JpFactory
                .CONST(getConsts().string6), JpFactory.S(getConsts().string5, var2.dref(), JpFactory
                        .S(getConsts().string5, JpFactory.CONST(getConsts().string7), JpFactory
                                .S(getConsts().string5, JpFactory
                                        .S(getConsts().string8, JpFactory.CONST(getConsts().string9)), JpFactory
                                                .CONST(getConsts().string10))))), JpFactory
                                                        .S(getConsts().string1, var2.dref(), continuation));
        mach.updateCUTB();
        return getConsts().is3cont;
    }
}
