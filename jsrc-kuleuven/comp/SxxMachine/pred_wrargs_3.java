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

class pred_wrargs_3_consts {
    Code entry_code;
    Code processKomma2cont;
    Code unify3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("wrargs");
    final static String string2 = internS("processKomma");
    final static String string3 = internS("writel");
    final static String string4 = internS(".");
    final static String string5 = internS("a");
    final static String string6 = internS("[]");
    final static String string7 = internS("is");
    final static String string8 = internS("-");
    final static String string9 = internS("unify");
    final static String string10 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
    final static NumberTerm posint0 = Integer(0);
}

public class pred_wrargs_3 extends Code {
    private final pred_wrargs_3_consts consts;

    public pred_wrargs_3() {
        consts = new pred_wrargs_3_consts();
        initAlternatives();
    }

    protected pred_wrargs_3(pred_wrargs_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_wrargs_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_wrargs_3_1(this));
        ALT.addAlternative(new pred_wrargs_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.processKomma2cont = mach.loadPred("processKomma", 1);
        consts.unify3cont = mach.loadPred("unify", 2);
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

class pred_wrargs_3_1 extends pred_wrargs_3 {
    pred_wrargs_3_1(pred_wrargs_3 consts) {
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
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;

        local_aregs.areg0 = (pred_wrargs_3_consts.posint0);
        local_aregs.areg1 = (var1.dref());

        mach.setCont(local_aregs, 2, S(pred_wrargs_3_consts.string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return getConsts().unify3cont;
    }
}

class pred_wrargs_3_2 extends pred_wrargs_3 {
    pred_wrargs_3_2(pred_wrargs_3 consts) {
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
        final Term areg2 = local_aregs.getTermDRef(2);
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
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.areg0 = (var3.dref());

        mach.setCont(local_aregs, 1, S(pred_wrargs_3_consts.string3, S(pred_wrargs_3_consts.string4, var2
                .dref(), S(pred_wrargs_3_consts.string4, CONST(pred_wrargs_3_consts.string5), S(pred_wrargs_3_consts.string4, var1
                        .dref(), CONST(pred_wrargs_3_consts.string6)))), S(pred_wrargs_3_consts.string7, var4, S(pred_wrargs_3_consts.string8, var1
                                .dref(), pred_wrargs_3_consts.posint1), S(pred_wrargs_3_consts.string1, var4
                                        .dref(), var2.dref(), var3.dref(), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().processKomma2cont;
    }
}
