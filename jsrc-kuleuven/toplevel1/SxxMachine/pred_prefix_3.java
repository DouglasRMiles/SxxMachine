
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

public class pred_prefix_3 extends Code {
    static Code entry_code;
    static String string0 = internS("cut");
    static String string1 = internS("prefix");
    static String string2 = internS("fx");
    static String string3 = internS("-");
    static String string4 = internS("call");
    static String string5 = internS("+");
    static String string6 = internS("?-");
    static String string7 = internS(":-");
    static NumberTerm posint500 = Integer(500);
    static NumberTerm posint1200 = Integer(1200);
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
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);
    }
}

class pred_prefix_3_1 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint1200;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string7);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(posint1200)))
            return mach.Fail0;
        if (!((areg1).unifyJP(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unifyJP(CONST(string7))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}

class pred_prefix_3_2 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint1200;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string6);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(posint1200)))
            return mach.Fail0;
        if (!((areg1).unifyJP(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unifyJP(CONST(string6))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}

class pred_prefix_3_3 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint500;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string5);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(posint500)))
            return mach.Fail0;
        if (!((areg1).unifyJP(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unifyJP(CONST(string5))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}

class pred_prefix_3_4 extends pred_prefix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint500;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string3);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(posint500)))
            return mach.Fail0;
        if (!((areg1).unifyJP(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unifyJP(CONST(string3))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}
