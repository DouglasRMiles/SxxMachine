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

class pred_isIndexingAllowed_1_consts {
    Code entry_code;
    Code concat_atom3cont;
    Code nb_current3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("isIndexingAllowed");
    final static String string2 = internS("call");
    final static String string3 = internS("concat_atom");
    final static String string4 = internS(".");
    final static String string5 = internS("DISABLE_INDEXING_");
    final static String string6 = internS("[]");
    final static String string7 = internS("nb_current");
    final static String string8 = internS("true");
    final static String string9 = internS("cut");
    final static String string10 = internS("fail");
    final static String string11 = internS("DISABLE_INDEXING");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_isIndexingAllowed_1 extends Code {
    private final pred_isIndexingAllowed_1_consts consts;

    public pred_isIndexingAllowed_1() {
        consts = new pred_isIndexingAllowed_1_consts();
        initAlternatives();
    }

    protected pred_isIndexingAllowed_1(pred_isIndexingAllowed_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_isIndexingAllowed_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_isIndexingAllowed_1_1(this));
        ALT.addAlternative(new pred_isIndexingAllowed_1_2(this));
        ALT.addAlternative(new pred_isIndexingAllowed_1_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.concat_atom3cont = mach.loadPred("concat_atom", 2);
        consts.nb_current3cont = mach.loadPred("nb_current", 2);
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

class pred_isIndexingAllowed_1_1 extends pred_isIndexingAllowed_1 {
    pred_isIndexingAllowed_1_1(pred_isIndexingAllowed_1 consts) {
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

        local_aregs.setAreg0((CONST(pred_isIndexingAllowed_1_consts.string11)));

        local_aregs.setAreg1((CONST(pred_isIndexingAllowed_1_consts.string8)));

        mach.setCont(local_aregs, 2, S(pred_isIndexingAllowed_1_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_isIndexingAllowed_1_consts.string10, continuation)));
        mach.updateCUTB();
        return getConsts().nb_current3cont;
    }
}

class pred_isIndexingAllowed_1_2 extends pred_isIndexingAllowed_1 {
    pred_isIndexingAllowed_1_2(pred_isIndexingAllowed_1 consts) {
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
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;

        local_aregs.setAreg0((S(pred_isIndexingAllowed_1_consts.string4, CONST(pred_isIndexingAllowed_1_consts.string5), S(pred_isIndexingAllowed_1_consts.string4, var1
                .dref(), CONST(pred_isIndexingAllowed_1_consts.string6)))));
        local_aregs.setAreg1((var2));

        local_aregs.setAreg2((S(pred_isIndexingAllowed_1_consts.string7, var2
                .dref(), CONST(pred_isIndexingAllowed_1_consts.string8), S(pred_isIndexingAllowed_1_consts.string0, new HeapChoice(
                        mach.getCUTB()), S(pred_isIndexingAllowed_1_consts.string10, continuation)))));
        mach.updateCUTB();
        return getConsts().concat_atom3cont;
    }
}

class pred_isIndexingAllowed_1_3 extends pred_isIndexingAllowed_1 {
    pred_isIndexingAllowed_1_3(pred_isIndexingAllowed_1 consts) {
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
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}
