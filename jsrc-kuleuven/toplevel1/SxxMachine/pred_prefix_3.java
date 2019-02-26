
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

public class pred_prefix_3 extends Code {
    static Code entry_code;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("prefix");
    static String string2 = Const.strIntern("fx");
    static String string3 = Const.strIntern("-");
    static String string4 = Const.strIntern("call");
    static String string5 = Const.strIntern("+");
    static String string6 = Const.strIntern("?-");
    static String string7 = Const.strIntern(":-");
    static Int posint500 = JpFactory.Long(500);
    static Int posint1200 = JpFactory.Long(1200);
    private final static Alternatives ALT = new Alternatives();
    static {
        ALT.addAlternative(new pred_prefix_3_1());
        ALT.addAlternative(new pred_prefix_3_2());
        ALT.addAlternative(new pred_prefix_3_3());
        ALT.addAlternative(new pred_prefix_3_4());

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

class pred_prefix_3_1 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        Term arg0 = posint1200;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string7);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1200)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_prefix_3_2 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        Term arg0 = posint1200;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string6);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1200)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string6))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_prefix_3_3 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        Term arg0 = posint500;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string5);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint500)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_prefix_3_4 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        Term arg0 = posint500;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string3);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint500)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string3))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
