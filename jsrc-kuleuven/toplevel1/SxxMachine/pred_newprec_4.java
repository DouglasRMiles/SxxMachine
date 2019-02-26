
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

public class pred_newprec_4 extends Code {
    static Code entry_code;
    static Code cut2cont;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("newprec");
    static String string2 = Const.strIntern("yfx");
    static String string3 = Const.strIntern("cut");
    static String string4 = Const.strIntern("is");
    static String string5 = Const.strIntern("-");
    static String string6 = Const.strIntern("unify");
    static String string7 = Const.strIntern("xfy");
    static String string8 = Const.strIntern("xfx");
    static Int posint1 = JpFactory.Long(1);
    private final static Alternatives ALT = new Alternatives();
    static {
        ALT.addAlternative(new pred_newprec_4_1());
        ALT.addAlternative(new pred_newprec_4_2());
        ALT.addAlternative(new pred_newprec_4_3());

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);
    }
}

class pred_newprec_4_1 extends pred_newprec_4 {
    @Override
    protected Term[] getArgs() {
        Term var3 = new DummyVar();
        Term var2 = new DummyVar();
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(string8);
        Term arg1 = var1;
        Term arg2 = var2;
        Term arg3 = var3;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string8))))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var2.dref())))
            return mach.Fail0;
        if (!((areg3).unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory
                .S(string4, var2.dref(), JpFactory.S(string5, var1.dref(), posint1), JpFactory
                        .S(string4, var3.dref(), JpFactory.S(string5, var1.dref(), posint1), continuation));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_newprec_4_2 extends pred_newprec_4 {
    @Override
    protected Term[] getArgs() {
        Term var3 = new DummyVar();
        Term var2 = new DummyVar();
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(string7);
        Term arg1 = var1;
        Term arg2 = var2;
        Term arg3 = var3;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var2.dref())))
            return mach.Fail0;
        if (!((areg3).unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string4, var2.dref(), JpFactory
                .S(string5, var1.dref(), posint1), JpFactory.S(string6, var1.dref(), var3.dref(), continuation));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_newprec_4_3 extends pred_newprec_4 {
    @Override
    protected Term[] getArgs() {
        Term var3 = new DummyVar();
        Term var2 = new DummyVar();
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.CONST(string2);
        Term arg1 = var1;
        Term arg2 = var2;
        Term arg3 = var3;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[4];
        Term areg3 = local_aregs[3].dref();
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!((areg0).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var2.dref())))
            return mach.Fail0;
        if (!((areg3).unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(string4, var3.dref(), JpFactory
                .S(string5, var1.dref(), posint1), JpFactory.S(string6, var1.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}
