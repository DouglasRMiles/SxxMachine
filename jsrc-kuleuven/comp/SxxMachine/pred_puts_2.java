// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_puts_2_consts {
    Code entry_code;
    Code univ4cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("puts");
    final static String string2 = internS("univ");
    final static String string3 = internS("cut");
    final static String string4 = internS("cut");
    final static String string5 = internS("writel");
    final static String string6 = internS(".");
    final static String string7 = internS("    mach.doCut(mach.getCUTB())  ;");
    final static String string8 = internS("wr");
    final static String string9 = internS("nl");
    final static String string10 = internS("[]");
    final static String string11 = internS("putforarg");
    final static NumberTerm posint0 = Integer(0);
    final static NumberTerm posint1 = Integer(1);
}

public class pred_puts_2 extends Code {
    private final pred_puts_2_consts consts;

    public pred_puts_2() {
        consts = new pred_puts_2_consts();
        initAlternatives();
    }

    protected pred_puts_2(pred_puts_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_puts_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_puts_2_1(this));
        ALT.addAlternative(new pred_puts_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
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

class pred_puts_2_1 extends pred_puts_2 {
    pred_puts_2_1(pred_puts_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_puts_2_consts.string0, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_puts_2_consts.string0, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_puts_2_consts.string5, S(pred_puts_2_consts.string6, CONST(pred_puts_2_consts.string7), S(pred_puts_2_consts.string6, S(pred_puts_2_consts.string8, CONST(pred_puts_2_consts.string9)), CONST(pred_puts_2_consts.string10))), S(pred_puts_2_consts.string11, var2
                .dref(), pred_puts_2_consts.posint0, var3.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_puts_2_2 extends pred_puts_2 {
    pred_puts_2_2(pred_puts_2 consts) {
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
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs.setAreg0((var1.dref()));
        local_aregs.setAreg1((var3));
        local_aregs.setAreg2((var4));

        mach.setCont(local_aregs, 3, S(pred_puts_2_consts.string1, var4.dref(), pred_puts_2_consts.posint0, var2
                .dref(), continuation));
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
