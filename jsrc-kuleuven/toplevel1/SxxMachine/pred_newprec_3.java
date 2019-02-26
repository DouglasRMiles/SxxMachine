
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

public class pred_newprec_3 extends Code {
    static Code entry_code;
    static Code cut2cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("newprec");
    static String string2 = Const.strIntern("fy");
    static String string3 = Const.strIntern("call");
    static String string4 = Const.strIntern("fx");
    static String string5 = Const.strIntern("cut");
    static String string6 = Const.strIntern("is");
    static String string7 = Const.strIntern("-");
    static Int posint1 = JpFactory.Long(1);
    private final static Alternatives ALT = new Alternatives();
    static {
        ALT.addAlternative(new pred_newprec_3_1());
        ALT.addAlternative(new pred_newprec_3_2());

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);
    }
}

class pred_newprec_3_1 extends pred_newprec_3 {
    @Override
    protected Term[] getArgs() {
        Term var2 = new DummyVar();
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(string4);
        Term arg1 = var1;
        Term arg2 = var2;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string4))))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var2.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory
                .S(string6, var2.dref(), JpFactory.S(string7, var1.dref(), posint1), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_newprec_3_2 extends pred_newprec_3 {
    @Override
    protected Term[] getArgs() {
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(string2);
        Term arg1 = var1;
        Term arg2 = var1.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
