
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

public class pred_infix_3 extends Code {
    static Code entry_code;
    static String string0 = internS("cut");
    static String string1 = internS("infix");
    static String string2 = internS("xfy");
    static String string3 = internS("^");
    static String string4 = internS("call");
    static String string5 = internS("xfx");
    static String string6 = internS("mod");
    static String string7 = internS("yfx");
    static String string8 = internS(">>");
    static String string9 = internS("<<");
    static String string10 = internS("//");
    static String string11 = internS("/");
    static String string12 = internS("*");
    static String string13 = internS("#");
    static String string14 = internS("-");
    static String string15 = internS("+");
    static String string16 = internS(":");
    static String string17 = internS(">=");
    static String string18 = internS(">");
    static String string19 = internS("=<");
    static String string20 = internS("<");
    static String string21 = internS("@>=");
    static String string22 = internS("@=<");
    static String string23 = internS("@>");
    static String string24 = internS("@<");
    static String string25 = internS("==");
    static String string26 = internS("=..");
    static String string27 = internS("is");
    static String string28 = internS("=");
    static String string29 = internS("->");
    static String string30 = internS(";");
    static String string31 = internS(",");
    static String string32 = internS(":-");
    static String string33 = internS("=:=");
    static NumberTerm posint200 = Integer(200);
    static NumberTerm posint300 = Integer(300);
    static NumberTerm posint400 = Integer(400);
    static NumberTerm posint500 = Integer(500);
    static NumberTerm posint550 = Integer(550);
    static NumberTerm posint700 = Integer(700);
    static NumberTerm posint1050 = Integer(1050);
    static NumberTerm posint1100 = Integer(1100);
    static NumberTerm posint1000 = Integer(1000);
    static NumberTerm posint1200 = Integer(1200);
    private final static Alternatives ALT = new Alternatives();
    static {
        ALT.addAlternative(new pred_infix_3_1());
        ALT.addAlternative(new pred_infix_3_2());
        ALT.addAlternative(new pred_infix_3_3());
        ALT.addAlternative(new pred_infix_3_4());
        ALT.addAlternative(new pred_infix_3_5());
        ALT.addAlternative(new pred_infix_3_6());
        ALT.addAlternative(new pred_infix_3_7());
        ALT.addAlternative(new pred_infix_3_8());
        ALT.addAlternative(new pred_infix_3_8b());
        ALT.addAlternative(new pred_infix_3_9());
        ALT.addAlternative(new pred_infix_3_10());
        ALT.addAlternative(new pred_infix_3_11());
        ALT.addAlternative(new pred_infix_3_12());
        ALT.addAlternative(new pred_infix_3_13());
        ALT.addAlternative(new pred_infix_3_14());
        ALT.addAlternative(new pred_infix_3_15());
        ALT.addAlternative(new pred_infix_3_16());
        ALT.addAlternative(new pred_infix_3_17());
        ALT.addAlternative(new pred_infix_3_18());
        ALT.addAlternative(new pred_infix_3_19());
        ALT.addAlternative(new pred_infix_3_20());
        ALT.addAlternative(new pred_infix_3_21());
        ALT.addAlternative(new pred_infix_3_22());
        ALT.addAlternative(new pred_infix_3_23());
        ALT.addAlternative(new pred_infix_3_24());
        ALT.addAlternative(new pred_infix_3_25());
        ALT.addAlternative(new pred_infix_3_26());
        ALT.addAlternative(new pred_infix_3_27());
        ALT.addAlternative(new pred_infix_3_28());

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

class pred_infix_3_1 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint1200;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string32);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1200)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string32))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_2 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint1000;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string31);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1000)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string31))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_3 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint1100;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string30);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1100)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string30))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_4 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint1050;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string29);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1050)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string29))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_5 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string28);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string28))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_6 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string27);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string27))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_7 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string26);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string26))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_8 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string25);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string25))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_8b extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string33);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string33))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_9 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string24);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string24))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_10 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string23);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string23))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_11 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string22);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string22))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_12 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string21);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string21))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_13 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string17);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string17))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_14 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string20);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string20))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_15 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string19);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string19))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_16 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string18);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string18))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_17 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint700;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string17);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string17))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_18 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint550;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string16);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint550)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string16))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_19 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint500;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string15);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint500)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string15))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_20 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint500;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string14);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint500)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string14))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_21 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint500;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string13);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint500)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string13))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_22 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint400;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string12);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string12))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_23 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint400;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string11);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string11))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_24 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint400;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string10);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string10))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_25 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint400;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string9);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string9))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_26 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint400;
        final Term arg1 = CONST(string7);
        final Term arg2 = CONST(string8);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string8))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_27 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint300;
        final Term arg1 = CONST(string5);
        final Term arg2 = CONST(string6);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint300)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string6))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_infix_3_28 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        final Term arg0 = posint200;
        final Term arg1 = CONST(string2);
        final Term arg2 = CONST(string3);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint200)))
            return mach.Fail0;
        if (!((areg1).unify(CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(CONST(string3))))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
