// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_declforeachcontinuation_3_consts {
    Code entry_code;
    Code writel2cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("declforeachcontinuation");
    final static String string2 = internS(".");
    final static String string3 = internS("/");
    final static String string4 = internS("writel");
    final static String string5 = internS("     Code ");
    final static String string6 = internS("cont ;");
    final static String string7 = internS("wr");
    final static String string8 = internS("nl");
    final static String string9 = internS("[]");
    final static String string10 = internS("call");
    final static String string11 = internS("cut");
    final static NumberTerm posint2 = Integer(2);
    final static NumberTerm posint1 = Integer(1);
}

public class pred_declforeachcontinuation_3 extends Code {
    private final pred_declforeachcontinuation_3_consts consts;

    public pred_declforeachcontinuation_3() {
        consts = new pred_declforeachcontinuation_3_consts();
        initAlternatives();
    }

    protected pred_declforeachcontinuation_3(pred_declforeachcontinuation_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_declforeachcontinuation_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_declforeachcontinuation_3_1(this));
        ALT.addAlternative(new pred_declforeachcontinuation_3_2(this));
        ALT.addAlternative(new pred_declforeachcontinuation_3_3(this));
        ALT.addAlternative(new pred_declforeachcontinuation_3_4(this));
        ALT.addAlternative(new pred_declforeachcontinuation_3_5(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_declforeachcontinuation_3_1 extends pred_declforeachcontinuation_3 {
    pred_declforeachcontinuation_3_1(pred_declforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = CONST(pred_declforeachcontinuation_3_consts.string9);
        final Term arg1 = var1;
        final Term arg2 = var2;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(CONST(pred_declforeachcontinuation_3_consts.string9))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var2.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}

class pred_declforeachcontinuation_3_2 extends pred_declforeachcontinuation_3 {
    pred_declforeachcontinuation_3_2(pred_declforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, var1, var2), var3);
        final Term arg1 = var1.dref();
        final Term arg2 = var2.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0
                .unifyJP(S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, var1
                        .dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var2.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_declforeachcontinuation_3_consts.string1, var3.dref(), var1.dref(), var2
                .dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return mach.getCall1();
    }
}

class pred_declforeachcontinuation_3_3 extends pred_declforeachcontinuation_3 {
    pred_declforeachcontinuation_3_3(pred_declforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, CONST(pred_declforeachcontinuation_3_consts.string10), pred_declforeachcontinuation_3_consts.posint1), var1);
        final Term arg1 = var2;
        final Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0
                .unifyJP(S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, CONST(pred_declforeachcontinuation_3_consts.string10), pred_declforeachcontinuation_3_consts.posint1), var1
                        .dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_declforeachcontinuation_3_consts.string1, var1.dref(), var2.dref(), var3
                .dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return mach.getCall1();
    }
}

class pred_declforeachcontinuation_3_4 extends pred_declforeachcontinuation_3 {
    pred_declforeachcontinuation_3_4(pred_declforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, CONST(pred_declforeachcontinuation_3_consts.string10), pred_declforeachcontinuation_3_consts.posint2), var1);
        final Term arg1 = var2;
        final Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0
                .unifyJP(S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, CONST(pred_declforeachcontinuation_3_consts.string10), pred_declforeachcontinuation_3_consts.posint2), var1
                        .dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_declforeachcontinuation_3_consts.string1, var1.dref(), var2.dref(), var3
                .dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return mach.getCall1();
    }
}

class pred_declforeachcontinuation_3_5 extends pred_declforeachcontinuation_3 {
    pred_declforeachcontinuation_3_5(pred_declforeachcontinuation_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, var1, var2), var3);
        final Term arg1 = var4;
        final Term arg2 = var5;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0
                .unifyJP(S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string3, var1
                        .dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var5.dref())))
            return mach.Fail0;

        local_aregs.setAV(0,S(pred_declforeachcontinuation_3_consts.string2, CONST(pred_declforeachcontinuation_3_consts.string5), S(pred_declforeachcontinuation_3_consts.string2, var1
                .dref(), S(pred_declforeachcontinuation_3_consts.string2, var2
                        .dref(), S(pred_declforeachcontinuation_3_consts.string2, CONST(pred_declforeachcontinuation_3_consts.string6), S(pred_declforeachcontinuation_3_consts.string2, S(pred_declforeachcontinuation_3_consts.string7, CONST(pred_declforeachcontinuation_3_consts.string8)), CONST(pred_declforeachcontinuation_3_consts.string9)))))));

        mach.setCont(local_aregs, 1, S(pred_declforeachcontinuation_3_consts.string1, var3.dref(), var4.dref(), var5
                .dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().writel2cont;
    }
}
