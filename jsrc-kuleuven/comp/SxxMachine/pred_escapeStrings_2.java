// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_escapeStrings_2_consts {
    Code entry_code;
    Code escapeFunctor3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("escapeStrings");
    final static String string2 = internS(".");
    final static String string3 = internS("escapeFunctor");
    final static String string4 = internS("[]");
    final static String string5 = internS("call");
}

public class pred_escapeStrings_2 extends Code {
    private final pred_escapeStrings_2_consts consts;

    public pred_escapeStrings_2() {
        consts = new pred_escapeStrings_2_consts();
        initAlternatives();
    }

    protected pred_escapeStrings_2(pred_escapeStrings_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_escapeStrings_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_escapeStrings_2_1(this));
        ALT.addAlternative(new pred_escapeStrings_2_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.escapeFunctor3cont = mach.loadPred("escapeFunctor", 2);
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

class pred_escapeStrings_2_1 extends pred_escapeStrings_2 {
    pred_escapeStrings_2_1(pred_escapeStrings_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_escapeStrings_2_consts.string4);

        final Term arg1 = CONST(pred_escapeStrings_2_consts.string4);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_escapeStrings_2_consts.string4))))
            return mach.Fail0;

        if (!(areg1.unifyJP(CONST(pred_escapeStrings_2_consts.string4))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2, 1);
        return mach.getCall1();
    }
}

class pred_escapeStrings_2_2 extends pred_escapeStrings_2 {
    pred_escapeStrings_2_2(pred_escapeStrings_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_escapeStrings_2_consts.string2, var1, var2);

        final Term arg1 = S(pred_escapeStrings_2_consts.string2, var3, var4);
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

        if (!(areg0.unifyJP(S(pred_escapeStrings_2_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unifyJP(S(pred_escapeStrings_2_consts.string2, var3.dref(), var4.dref()))))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var3.dref());

        mach.setCont(local_aregs, 2, S(pred_escapeStrings_2_consts.string1, var2.dref(), var4.dref(), continuation));
        mach.updateCUTB();
        return getConsts().escapeFunctor3cont;
    }
}
