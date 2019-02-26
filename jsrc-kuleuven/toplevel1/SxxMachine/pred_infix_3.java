
// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

public class pred_infix_3 extends Code {
    static Code entry_code;
    static String string0 = Const.strIntern("cut");
    static String string1 = Const.strIntern("infix");
    static String string2 = Const.strIntern("xfy");
    static String string3 = Const.strIntern("^");
    static String string4 = Const.strIntern("call");
    static String string5 = Const.strIntern("xfx");
    static String string6 = Const.strIntern("mod");
    static String string7 = Const.strIntern("yfx");
    static String string8 = Const.strIntern(">>");
    static String string9 = Const.strIntern("<<");
    static String string10 = Const.strIntern("//");
    static String string11 = Const.strIntern("/");
    static String string12 = Const.strIntern("*");
    static String string13 = Const.strIntern("#");
    static String string14 = Const.strIntern("-");
    static String string15 = Const.strIntern("+");
    static String string16 = Const.strIntern(":");
    static String string17 = Const.strIntern(">=");
    static String string18 = Const.strIntern(">");
    static String string19 = Const.strIntern("=<");
    static String string20 = Const.strIntern("<");
    static String string21 = Const.strIntern("@>=");
    static String string22 = Const.strIntern("@=<");
    static String string23 = Const.strIntern("@>");
    static String string24 = Const.strIntern("@<");
    static String string25 = Const.strIntern("==");
    static String string26 = Const.strIntern("=..");
    static String string27 = Const.strIntern("is");
    static String string28 = Const.strIntern("=");
    static String string29 = Const.strIntern("->");
    static String string30 = Const.strIntern(";");
    static String string31 = Const.strIntern(",");
    static String string32 = Const.strIntern(":-");
    static String string33 = Const.strIntern("=:=");
    static Int posint200 = JpFactory.Long(200);
    static Int posint300 = JpFactory.Long(300);
    static Int posint400 = JpFactory.Long(400);
    static Int posint500 = JpFactory.Long(500);
    static Int posint550 = JpFactory.Long(550);
    static Int posint700 = JpFactory.Long(700);
    static Int posint1050 = JpFactory.Long(1050);
    static Int posint1100 = JpFactory.Long(1100);
    static Int posint1000 = JpFactory.Long(1000);
    static Int posint1200 = JpFactory.Long(1200);
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
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);
    }
}

class pred_infix_3_1 extends pred_infix_3 {
    @Override
    protected Term[] getArgs() {
        Term arg0 = posint1200;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string32);
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
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string32))))
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
        Term arg0 = posint1000;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string31);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1000)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string31))))
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
        Term arg0 = posint1100;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string30);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1100)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string30))))
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
        Term arg0 = posint1050;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string29);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint1050)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string29))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string28);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string28))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string27);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string27))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string26);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string26))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string25);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string25))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string33);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string33))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string24);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string24))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string23);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string23))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string22);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string22))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string21);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string21))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string17);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string17))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string20);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string20))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string19);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string19))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string18);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string18))))
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
        Term arg0 = posint700;
        Term arg1 = JpFactory.CONST(string5);
        Term arg2 = JpFactory.CONST(string17);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint700)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string17))))
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
        Term arg0 = posint550;
        Term arg1 = JpFactory.CONST(string2);
        Term arg2 = JpFactory.CONST(string16);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint550)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string2))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string16))))
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
        Term arg0 = posint500;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string15);
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
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string15))))
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
        Term arg0 = posint500;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string14);
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
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string14))))
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
        Term arg0 = posint500;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string13);
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
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string13))))
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
        Term arg0 = posint400;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string12);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string12))))
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
        Term arg0 = posint400;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string11);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string11))))
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
        Term arg0 = posint400;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string10);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string10))))
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
        Term arg0 = posint400;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string9);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string9))))
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
        Term arg0 = posint400;
        Term arg1 = JpFactory.CONST(string7);
        Term arg2 = JpFactory.CONST(string8);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        if (!((areg0).unify(posint400)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string7))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string8))))
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
        Term arg0 = posint300;
        Term arg1 = JpFactory.CONST(string5);
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
        if (!((areg0).unify(posint300)))
            return mach.Fail0;
        if (!((areg1).unify(JpFactory.CONST(string5))))
            return mach.Fail0;
        if (!((areg2).unify(JpFactory.CONST(string6))))
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
        Term arg0 = posint200;
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
        if (!((areg0).unify(posint200)))
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
