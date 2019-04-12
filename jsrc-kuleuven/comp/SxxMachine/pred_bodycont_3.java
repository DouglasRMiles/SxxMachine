// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_bodycont_3_consts {
    Code entry_code;
    Code writel2cont;
    Code functor4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("bodycont");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("mach.Call1");
    final static String string5 = internS("[]");
    final static String string6 = internS(":-");
    final static String string7 = internS("functor");
    final static String string8 = internS("cut");
    final static String string9 = internS("getConsts().");
    final static String string10 = internS("cont");
    final static String string11 = internS("cut");
    final static String string12 = internS("call");
    final static String string13 = internS("mach.Call2");
    final static String string14 = internS("entry_code");
    final static NumberTerm posint1 = Integer(1);
    final static NumberTerm posint2 = Integer(2);
}

public class pred_bodycont_3 extends Code {
    private final pred_bodycont_3_consts consts;

    public pred_bodycont_3() {
        consts = new pred_bodycont_3_consts();
        initAlternatives();
    }

    protected pred_bodycont_3(pred_bodycont_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_bodycont_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_bodycont_3_1(this));
        ALT.addAlternative(new pred_bodycont_3_2(this));
        ALT.addAlternative(new pred_bodycont_3_3(this));
        ALT.addAlternative(new pred_bodycont_3_4(this));
        ALT.addAlternative(new pred_bodycont_3_5(this));
        ALT.addAlternative(new pred_bodycont_3_6(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
        consts.functor4cont = mach.loadPred("functor", 3);
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

class pred_bodycont_3_1 extends pred_bodycont_3 {
    pred_bodycont_3_1(pred_bodycont_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_bodycont_3_consts.string6, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_bodycont_3_consts.string6, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());
        local_aregs.setAV(1,var3.dref());
        local_aregs.setAV(2,var4.dref());

        mach.setCont(local_aregs, 3, S(pred_bodycont_3_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_bodycont_3_consts.string2, CONS(CONST(pred_bodycont_3_consts.string9), CONS(CONST(pred_bodycont_3_consts.string14), CONST(pred_bodycont_3_consts.string5))), continuation)));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_bodycont_3_2 extends pred_bodycont_3 {
    pred_bodycont_3_2(pred_bodycont_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_bodycont_3_consts.string6, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_bodycont_3_consts.string6, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());

        local_aregs.setAV(1,CONST(pred_bodycont_3_consts.string12));

        local_aregs.setAV(2,pred_bodycont_3_consts.posint1);

        mach.setCont(local_aregs, 3, S(pred_bodycont_3_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_bodycont_3_consts.string2, CONS(CONST(pred_bodycont_3_consts.string4), CONST(pred_bodycont_3_consts.string5)), continuation)));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_bodycont_3_3 extends pred_bodycont_3 {
    pred_bodycont_3_3(pred_bodycont_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_bodycont_3_consts.string6, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_bodycont_3_consts.string6, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());

        local_aregs.setAV(1,CONST(pred_bodycont_3_consts.string12));

        local_aregs.setAV(2,pred_bodycont_3_consts.posint2);

        mach.setCont(local_aregs, 3, S(pred_bodycont_3_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_bodycont_3_consts.string2, CONS(CONST(pred_bodycont_3_consts.string13), CONST(pred_bodycont_3_consts.string5)), continuation)));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_bodycont_3_4 extends pred_bodycont_3 {
    pred_bodycont_3_4(pred_bodycont_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_bodycont_3_consts.string6, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_bodycont_3_consts.string6, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());

        local_aregs.setAV(1,CONST(pred_bodycont_3_consts.string0));

        local_aregs.setAV(2,pred_bodycont_3_consts.posint2);

        mach.setCont(local_aregs, 3, S(pred_bodycont_3_consts.string0, new HeapChoice(mach
                .getCUTB()), S(pred_bodycont_3_consts.string2, CONS(CONST(pred_bodycont_3_consts.string4), CONST(pred_bodycont_3_consts.string5)), continuation)));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_bodycont_3_5 extends pred_bodycont_3 {
    pred_bodycont_3_5(pred_bodycont_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_bodycont_3_consts.string6, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_bodycont_3_consts.string6, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());
        local_aregs.setAV(1,var5);
        local_aregs.setAV(2,var6);

        mach.setCont(local_aregs, 3, S(pred_bodycont_3_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_bodycont_3_consts.string2, CONS(CONST(pred_bodycont_3_consts.string9), CONS(var5
                        .dref(), CONS(var6
                                .dref(), CONS(CONST(pred_bodycont_3_consts.string10), CONST(pred_bodycont_3_consts.string5))))), continuation)));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_bodycont_3_6 extends pred_bodycont_3 {
    pred_bodycont_3_6(pred_bodycont_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        final Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;

        local_aregs.setAV(0,CONS(CONST(pred_bodycont_3_consts.string4), CONST(pred_bodycont_3_consts.string5)));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().writel2cont;
    }
}
