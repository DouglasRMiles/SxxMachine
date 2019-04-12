// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_writel_1_consts {
    Code entry_code;
    Code wr2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("writel");
    final static String string2 = internS(".");
    final static String string3 = internS("wr");
    final static String string4 = internS("[]");
    final static String string5 = internS("call");
}

public class pred_writel_1 extends Code {
    private final pred_writel_1_consts consts;

    public pred_writel_1() {
        consts = new pred_writel_1_consts();
        initAlternatives();
    }

    protected pred_writel_1(pred_writel_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_writel_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_writel_1_1(this));
        ALT.addAlternative(new pred_writel_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.wr2cont = mach.loadPred("wr", 1);
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

class pred_writel_1_1 extends pred_writel_1 {
    pred_writel_1_1(pred_writel_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_writel_1_consts.string4);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.a(0).getVVV();

        if (!(areg0.unifyJP(CONST(pred_writel_1_consts.string4))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}

class pred_writel_1_2 extends pred_writel_1 {
    pred_writel_1_2(pred_writel_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_writel_1_consts.string2, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_writel_1_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());

        mach.setCont(local_aregs, 1, S(pred_writel_1_consts.string1, var2.dref(), continuation));
        mach.updateCUTB();
        return getConsts().wr2cont;
    }
}
