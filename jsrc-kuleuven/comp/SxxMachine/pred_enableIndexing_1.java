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

class pred_enableIndexing_1_consts {
    Code entry_code;
    Code writel2cont;
    Code isIndexingAllowed2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("enableIndexing");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("  ALT.disable();");
    final static String string5 = internS("wr");
    final static String string6 = internS("nl");
    final static String string7 = internS("[]");
    final static String string8 = internS("isIndexingAllowed");
    final static String string9 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_enableIndexing_1 extends Code {
    private final pred_enableIndexing_1_consts consts;

    public pred_enableIndexing_1() {
        consts = new pred_enableIndexing_1_consts();
        initAlternatives();
    }

    protected pred_enableIndexing_1(pred_enableIndexing_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_enableIndexing_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_enableIndexing_1_1(this));
        ALT.addAlternative(new pred_enableIndexing_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
        consts.isIndexingAllowed2cont = mach.loadPred("isIndexingAllowed", 1);
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

class pred_enableIndexing_1_1 extends pred_enableIndexing_1 {
    pred_enableIndexing_1_1(pred_enableIndexing_1 consts) {
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        mach.setCont(local_aregs, 1, S(pred_enableIndexing_1_consts.string0, new HeapChoice(
                mach.getCUTB()), continuation));
        mach.updateCUTB();
        return getConsts().isIndexingAllowed2cont;
    }
}

class pred_enableIndexing_1_2 extends pred_enableIndexing_1 {
    pred_enableIndexing_1_2(pred_enableIndexing_1 consts) {
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;

        local_aregs[0] = S(pred_enableIndexing_1_consts.string3, CONST(pred_enableIndexing_1_consts.string4), S(pred_enableIndexing_1_consts.string3, S(pred_enableIndexing_1_consts.string5, CONST(pred_enableIndexing_1_consts.string6)), CONST(pred_enableIndexing_1_consts.string7)));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return getConsts().writel2cont;
    }
}
