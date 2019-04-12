
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

public class pred_newprec_4 extends Code {
    static Code entry_code;
    static Code cut2cont;
    static String string0 = internS("cut");
    static String string1 = internS("newprec");
    static String string2 = internS("yfx");
    static String string3 = internS("cut");
    static String string4 = internS("is");
    static String string5 = internS("-");
    static String string6 = internS("unify");
    static String string7 = internS("xfy");
    static String string8 = internS("xfx");
    static NumberTerm posint1 = Integer(1);
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
        final Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);
    }
}

class pred_newprec_4_1 extends pred_newprec_4 {
    @Override
    protected Term[] getArgs() {
        final Term var3 = new DummyVar();
        final Term var2 = new DummyVar();
        final Term var1 = new DummyVar();
        final Term arg0 = CONST(string8);
        final Term arg1 = var1;
        final Term arg2 = var2;
        final Term arg3 = var3;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string8))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unifyJP(var2.dref())))
            return mach.Fail0;
        if (!((areg3).unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, local_aregs.setAV(0,S(string4, var2.dref(), S(string5, var1
                .dref(), posint1), S(string4, var3.dref(), S(string5, var1.dref(), posint1), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 2);
        return mach.getCall1();
    }
}

class pred_newprec_4_2 extends pred_newprec_4 {
    @Override
    protected Term[] getArgs() {
        final Term var3 = new DummyVar();
        final Term var2 = new DummyVar();
        final Term var1 = new DummyVar();
        final Term arg0 = CONST(string7);
        final Term arg1 = var1;
        final Term arg2 = var2;
        final Term arg3 = var3;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string7))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unifyJP(var2.dref())))
            return mach.Fail0;
        if (!((areg3).unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, S(string4, var2
                .dref(), S(string5, var1.dref(), posint1), S(string6, var1.dref(), var3.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 2);
        return mach.getCall1();
    }
}

class pred_newprec_4_3 extends pred_newprec_4 {
    @Override
    protected Term[] getArgs() {
        final Term var3 = new DummyVar();
        final Term var2 = new DummyVar();
        final Term var1 = new DummyVar();
        final Term arg0 = CONST(string2);
        final Term arg1 = var1;
        final Term arg2 = var2;
        final Term arg3 = var3;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1.dref())))
            return mach.Fail0;
        if (!((areg2).unifyJP(var2.dref())))
            return mach.Fail0;
        if (!((areg3).unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, S(string4, var3
                .dref(), S(string5, var1.dref(), posint1), S(string6, var1.dref(), var2.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 4, 2);
        return mach.getCall1();
    }
}
