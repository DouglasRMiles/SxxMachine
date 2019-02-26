
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

public class pred_newprec_3 extends Code {
    static Code entry_code;
    static Code cut2cont;
    static String string0 = internS("cut");
    static String string1 = internS("newprec");
    static String string2 = internS("fy");
    static String string3 = internS("call");
    static String string4 = internS("fx");
    static String string5 = internS("cut");
    static String string6 = internS("is");
    static String string7 = internS("-");
    static NumberTerm posint1 = Integer(1);
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
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);
    }
}

class pred_newprec_3_1 extends pred_newprec_3 {
    @Override
    protected Term[] getArgs() {
        final Term var2 = new DummyVar();
        final Term var1 = new DummyVar();
        final Term arg0 = CONST(string4);
        final Term arg1 = var1;
        final Term arg2 = var2;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unify(CONST(string4))))
            return mach.Fail0;
        if (!((areg1).unify(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unify(var2.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string6, var2.dref(), S(string7, var1.dref(), posint1), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_newprec_3_2 extends pred_newprec_3 {
    @Override
    protected Term[] getArgs() {
        final Term var1 = new DummyVar();
        final Term arg0 = CONST(string2);
        final Term arg1 = var1;
        final Term arg2 = var1.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0).unify(CONST(string2))))
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
