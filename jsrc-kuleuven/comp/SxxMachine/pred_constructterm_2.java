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

class pred_constructterm_2_consts {
    Code entry_code;
    Code functor4cont;
    Code atom2cont;
    Code integer2cont;
    Code cut2cont;
    Code var2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("constructterm");
    final static String string2 = internS("functor");
    final static String string3 = internS("univ");
    final static String string4 = internS("changeIllegalTerms");
    final static String string5 = internS("getnameindex");
    final static String string6 = internS("writel");
    final static String string7 = internS(".");
    final static String string8 = internS("new StructureTerm(getConsts().string");
    final static String string9 = internS(",");
    final static String string10 = internS("newargs");
    final static String string11 = internS(")");
    final static String string12 = internS("[]");
    final static String string13 = internS("atom");
    final static String string14 = internS("cut");
    final static String string15 = internS("new Const(getConsts().string");
    final static String string16 = internS("integer");
    final static String string17 = internS("write");
    final static String string18 = internS("getConsts().");
    final static String string19 = internS("posneg");
    final static String string20 = internS("cut");
    final static String string21 = internS(", new HeapChoice(mach.getCUTB()),");
    final static String string22 = internS("varnr");
    final static String string23 = internS("var");
    final static String string24 = internS(".dref()");
    final static String string25 = internS("unify");
    final static String string26 = internS("continuation");
    final static NumberTerm posint0 = Integer(0);
    final static NumberTerm posint1 = Integer(1);
}

public class pred_constructterm_2 extends Code {
    private final pred_constructterm_2_consts consts;

    public pred_constructterm_2() {
        consts = new pred_constructterm_2_consts();
        initAlternatives();
    }

    protected pred_constructterm_2(pred_constructterm_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_constructterm_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_constructterm_2_1(this));
        ALT.addAlternative(new pred_constructterm_2_2(this));
        ALT.addAlternative(new pred_constructterm_2_3(this));
        ALT.addAlternative(new pred_constructterm_2_4(this));
        ALT.addAlternative(new pred_constructterm_2_5(this));
        ALT.addAlternative(new pred_constructterm_2_6(this));
        ALT.addAlternative(new pred_constructterm_2_7(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
        consts.atom2cont = mach.loadPred("atom", 1);
        consts.integer2cont = mach.loadPred("integer", 1);
        consts.var2cont = mach.loadPred("var", 1);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_constructterm_2_1 extends pred_constructterm_2 {
    pred_constructterm_2_1(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_constructterm_2_consts.string26, var1);
        final Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_constructterm_2_consts.string26, var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_constructterm_2_consts.string6, S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string26), CONST(pred_constructterm_2_consts.string12)), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_constructterm_2_2 extends pred_constructterm_2 {
    pred_constructterm_2_2(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_constructterm_2_consts.string22, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_constructterm_2_consts.string22, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = var2.dref();

        mach.setCont(local_aregs, 1, S(pred_constructterm_2_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_constructterm_2_consts.string6, S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string23), S(pred_constructterm_2_consts.string7, var1
                        .dref(), CONST(pred_constructterm_2_consts.string12))), S(pred_constructterm_2_consts.string25, pred_constructterm_2_consts.posint1, var2
                                .dref(), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().var2cont;
    }
}

class pred_constructterm_2_3 extends pred_constructterm_2 {
    pred_constructterm_2_3(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_constructterm_2_consts.string22, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_constructterm_2_consts.string22, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_constructterm_2_consts.string6, S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string23), S(pred_constructterm_2_consts.string7, var1
                .dref(), S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string24), CONST(pred_constructterm_2_consts.string12)))), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_constructterm_2_4 extends pred_constructterm_2 {
    pred_constructterm_2_4(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_constructterm_2_consts.string0, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_constructterm_2_consts.string0, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        local_aregs[0] = S(pred_constructterm_2_consts.string5, var3
                .dref(), CONST(pred_constructterm_2_consts.string0), pred_constructterm_2_consts.posint0, var4, S(pred_constructterm_2_consts.string6, S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string8), S(pred_constructterm_2_consts.string7, var4
                        .dref(), S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string21), S(pred_constructterm_2_consts.string7, S(pred_constructterm_2_consts.string1, var2
                                .dref(), var3
                                        .dref()), S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string11), CONST(pred_constructterm_2_consts.string12)))))), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_constructterm_2_5 extends pred_constructterm_2 {
    pred_constructterm_2_5(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        mach.setCont(local_aregs, 1, S(pred_constructterm_2_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_constructterm_2_consts.string17, CONST(pred_constructterm_2_consts.string18), S(pred_constructterm_2_consts.string19, var1
                        .dref(), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().integer2cont;
    }
}

class pred_constructterm_2_6 extends pred_constructterm_2 {
    pred_constructterm_2_6(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        local_aregs[1] = S(pred_constructterm_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_constructterm_2_consts.string4, var3, var1
                        .dref(), S(pred_constructterm_2_consts.string5, var2.dref(), var3
                                .dref(), pred_constructterm_2_consts.posint0, var4, S(pred_constructterm_2_consts.string6, S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string15), S(pred_constructterm_2_consts.string7, var4
                                        .dref(), S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string11), CONST(pred_constructterm_2_consts.string12)))), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().atom2cont;
    }
}

class pred_constructterm_2_7 extends pred_constructterm_2 {
    pred_constructterm_2_7(pred_constructterm_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;

        local_aregs[3] = S(pred_constructterm_2_consts.string3, var1
                .dref(), var5, var6, S(pred_constructterm_2_consts.string4, var7, var3
                        .dref(), S(pred_constructterm_2_consts.string5, var2.dref(), var7
                                .dref(), pred_constructterm_2_consts.posint0, var8, S(pred_constructterm_2_consts.string6, S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string8), S(pred_constructterm_2_consts.string7, var8
                                        .dref(), S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string9), S(pred_constructterm_2_consts.string7, S(pred_constructterm_2_consts.string10, var6
                                                .dref(), pred_constructterm_2_consts.posint1, var2
                                                        .dref()), S(pred_constructterm_2_consts.string7, CONST(pred_constructterm_2_consts.string11), CONST(pred_constructterm_2_consts.string12)))))), continuation))));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}
