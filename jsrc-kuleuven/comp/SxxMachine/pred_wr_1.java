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

class pred_wr_1_consts {
    Code entry_code;
    Code writel2cont;
    Code cut2cont;
    Code atomic2cont;
    Code getPackageName2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("wr");
    final static String string2 = internS("call");
    final static String string3 = internS(".");
    final static String string4 = internS("writel");
    final static String string5 = internS("[]");
    final static String string6 = internS("cut");
    final static String string7 = internS("varnr");
    final static String string8 = internS("write");
    final static String string9 = internS("atomic");
    final static String string10 = internS("nl");
    final static String string11 = internS("package");
    final static String string12 = internS("getPackageName");
    final static String string13 = internS("package ");
    final static String string14 = internS(";");
    final static String string15 = internS("");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_wr_1 extends Code {
    private final pred_wr_1_consts consts;

    public pred_wr_1() {
        consts = new pred_wr_1_consts();
        initAlternatives();
    }

    protected pred_wr_1(pred_wr_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_wr_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_wr_1_1(this));
        ALT.addAlternative(new pred_wr_1_2(this));
        ALT.addAlternative(new pred_wr_1_3(this));
        ALT.addAlternative(new pred_wr_1_4(this));
        ALT.addAlternative(new pred_wr_1_5(this));
        ALT.addAlternative(new pred_wr_1_6(this));
        ALT.addAlternative(new pred_wr_1_7(this));
        ALT.addAlternative(new pred_wr_1_8(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
        consts.atomic2cont = mach.loadPred("atomic", 1);
        consts.getPackageName2cont = mach.loadPred("getPackageName", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_wr_1_1 extends pred_wr_1 {
    pred_wr_1_1(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = S(pred_wr_1_consts.string1, CONST(pred_wr_1_consts.string11));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(S(pred_wr_1_consts.string1, CONST(pred_wr_1_consts.string11)))))
            return mach.Fail0;

        local_aregs.areg0 = (CONST(pred_wr_1_consts.string15));

        mach.setCont(local_aregs, 1, S(pred_wr_1_consts.string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        return getConsts().getPackageName2cont;
    }
}

class pred_wr_1_2 extends pred_wr_1 {
    pred_wr_1_2(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = S(pred_wr_1_consts.string1, CONST(pred_wr_1_consts.string11));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_wr_1_consts.string1, CONST(pred_wr_1_consts.string11)))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_wr_1_consts.string12, var1, S(pred_wr_1_consts.string8, CONST(pred_wr_1_consts.string13), S(pred_wr_1_consts.string8, var1
                .dref(), S(pred_wr_1_consts.string8, CONST(pred_wr_1_consts.string14), S(pred_wr_1_consts.string10, continuation))))));
        mach.updateCUTB();
        return mach.getCall1();
    }
}

class pred_wr_1_3 extends pred_wr_1 {
    pred_wr_1_3(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = S(pred_wr_1_consts.string1, CONST(pred_wr_1_consts.string10));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(S(pred_wr_1_consts.string1, CONST(pred_wr_1_consts.string10)))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_wr_1_consts.string10, continuation));
        mach.updateCUTB();
        return mach.getCall1();
    }
}

class pred_wr_1_4 extends pred_wr_1 {
    pred_wr_1_4(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        local_aregs.areg0 = (var1.dref());

        mach.setCont(local_aregs, 1, S(pred_wr_1_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_wr_1_consts.string8, var1.dref(), continuation)));
        mach.updateCUTB();
        return getConsts().atomic2cont;
    }
}

class pred_wr_1_5 extends pred_wr_1 {
    pred_wr_1_5(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_wr_1_consts.string7, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_wr_1_consts.string7, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_wr_1_consts.string8, S(pred_wr_1_consts.string7, var1.dref(), var2
                .dref()), continuation));
        mach.updateCUTB();
        return mach.getCall1();
    }
}

class pred_wr_1_6 extends pred_wr_1 {
    pred_wr_1_6(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_wr_1_consts.string5);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_wr_1_consts.string5))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        return mach.getCall1();
    }
}

class pred_wr_1_7 extends pred_wr_1 {
    pred_wr_1_7(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_wr_1_consts.string3, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_wr_1_consts.string3, var1.dref(), var2.dref()))))
            return mach.Fail0;

        local_aregs.areg0 = (S(pred_wr_1_consts.string3, var1.dref(), var2.dref()));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return getConsts().writel2cont;
    }
}

class pred_wr_1_8 extends pred_wr_1 {
    pred_wr_1_8(pred_wr_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        local_aregs.areg0 = (var1.dref());
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return mach.getCall2();
    }
}
