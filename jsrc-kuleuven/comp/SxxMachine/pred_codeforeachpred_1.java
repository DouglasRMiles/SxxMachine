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

class pred_codeforeachpred_1_consts {
    Code entry_code;
    Code codeforpred2cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("codeforeachpred");
    final static String string2 = internS(".");
    final static String string3 = internS("codeforpred");
    final static String string4 = internS("writel");
    final static String string5 = internS(",");
    final static String string6 = internS("wr");
    final static String string7 = internS("nl");
    final static String string8 = internS("[]");
    final static String string9 = internS("cut");
    final static String string10 = internS("call");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_codeforeachpred_1 extends Code {
    private final pred_codeforeachpred_1_consts consts;

    public pred_codeforeachpred_1() {
        consts = new pred_codeforeachpred_1_consts();
        initAlternatives();
    }

    protected pred_codeforeachpred_1(pred_codeforeachpred_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_codeforeachpred_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_codeforeachpred_1_1(this));
        ALT.addAlternative(new pred_codeforeachpred_1_2(this));
        ALT.addAlternative(new pred_codeforeachpred_1_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.codeforpred2cont = mach.loadPred("codeforpred", 1);
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

class pred_codeforeachpred_1_1 extends pred_codeforeachpred_1 {
    pred_codeforeachpred_1_1(pred_codeforeachpred_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_codeforeachpred_1_consts.string8);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs[0].dref();

        if (!(areg0.unifyJP(CONST(pred_codeforeachpred_1_consts.string8))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}

class pred_codeforeachpred_1_2 extends pred_codeforeachpred_1 {
    pred_codeforeachpred_1_2(pred_codeforeachpred_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_codeforeachpred_1_consts.string2, var1, CONST(pred_codeforeachpred_1_consts.string8));
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_codeforeachpred_1_consts.string2, var1
                .dref(), CONST(pred_codeforeachpred_1_consts.string8)))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_codeforeachpred_1_consts.string3, var1
                .dref(), S(pred_codeforeachpred_1_consts.string4, S(pred_codeforeachpred_1_consts.string2, S(pred_codeforeachpred_1_consts.string6, CONST(pred_codeforeachpred_1_consts.string7)), CONST(pred_codeforeachpred_1_consts.string8)), continuation)));
        mach.updateCUTB();
        return mach.getCall1();
    }
}

class pred_codeforeachpred_1_3 extends pred_codeforeachpred_1 {
    pred_codeforeachpred_1_3(pred_codeforeachpred_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_codeforeachpred_1_consts.string2, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_codeforeachpred_1_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        mach.setCont(local_aregs, 1, S(pred_codeforeachpred_1_consts.string4, S(pred_codeforeachpred_1_consts.string2, CONST(pred_codeforeachpred_1_consts.string5), S(pred_codeforeachpred_1_consts.string2, S(pred_codeforeachpred_1_consts.string6, CONST(pred_codeforeachpred_1_consts.string7)), CONST(pred_codeforeachpred_1_consts.string8))), S(pred_codeforeachpred_1_consts.string1, var2
                .dref(), continuation)));
        mach.updateCUTB();
        return getConsts().codeforpred2cont;
    }
}
