// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_shouldDisableIndexing_4_consts {
    Code entry_code;
    Code isIndexingAllowed2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("shouldDisableIndexing");
    final static String string2 = internS("call");
    final static String string3 = internS("isIndexingAllowed");
    final static String string4 = internS("isToSmall");
    final static String string5 = internS("disableIndexing");
    final static String string6 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_shouldDisableIndexing_4 extends Code {
    private final pred_shouldDisableIndexing_4_consts consts;

    public pred_shouldDisableIndexing_4() {
        consts = new pred_shouldDisableIndexing_4_consts();
        initAlternatives();
    }

    protected pred_shouldDisableIndexing_4(pred_shouldDisableIndexing_4 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_shouldDisableIndexing_4_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_shouldDisableIndexing_4_1(this));
        ALT.addAlternative(new pred_shouldDisableIndexing_4_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.isIndexingAllowed2cont = mach.loadPred("isIndexingAllowed", 1);
    }

    @Override
    public int arity() {
        return 4;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(5);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_shouldDisableIndexing_4_1 extends pred_shouldDisableIndexing_4 {
    pred_shouldDisableIndexing_4_1(pred_shouldDisableIndexing_4 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        final Term arg2 = var3;
        final Term arg3 = var4;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[4];
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        local_aregs[1] = S(pred_shouldDisableIndexing_4_consts.string4, var4.dref(), var3
                .dref(), S(pred_shouldDisableIndexing_4_consts.string5, var1
                        .dref(), S(pred_shouldDisableIndexing_4_consts.string0, new HeapChoice(
                                mach.getCUTB()), continuation)));
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = null;
        return getConsts().isIndexingAllowed2cont;
    }
}

class pred_shouldDisableIndexing_4_2 extends pred_shouldDisableIndexing_4 {
    pred_shouldDisableIndexing_4_2(pred_shouldDisableIndexing_4 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        final Term arg2 = var3;
        final Term arg3 = var4;
        return new Term[] { arg0, arg1, arg2, arg3 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[4];
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg3.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[4] = local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
