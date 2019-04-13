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

class pred_fixClauses_2_consts {
    Code entry_code;
    Code not2cont;
    Code cut2cont;
    Code var2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("fixClauses");
    final static String string2 = internS("call");
    final static String string3 = internS("not");
    final static String string4 = internS("var");
    final static String string5 = internS("cut");
    final static String string6 = internS("fixNotVar");
    final static String string7 = internS(".");
    final static String string8 = internS("[]");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_fixClauses_2 extends Code {
    private final pred_fixClauses_2_consts consts;

    public pred_fixClauses_2() {
        consts = new pred_fixClauses_2_consts();
        initAlternatives();
    }

    protected pred_fixClauses_2(pred_fixClauses_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_fixClauses_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_fixClauses_2_1(this));
        ALT.addAlternative(new pred_fixClauses_2_2(this));
        ALT.addAlternative(new pred_fixClauses_2_3(this));
        ALT.addAlternative(new pred_fixClauses_2_4(this));
        ALT.addAlternative(new pred_fixClauses_2_5(this));
        ALT.addAlternative(new pred_fixClauses_2_6(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.not2cont = mach.loadPred("not", 1);
        consts.var2cont = mach.loadPred("var", 1);
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

class pred_fixClauses_2_1 extends pred_fixClauses_2 {
    pred_fixClauses_2_1(pred_fixClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var1.dref();
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        local_aregs.setAreg0((var1.dref()));

        mach.setCont(local_aregs, 1, S(pred_fixClauses_2_consts.string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().var2cont;
    }
}

class pred_fixClauses_2_2 extends pred_fixClauses_2 {
    pred_fixClauses_2_2(pred_fixClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_fixClauses_2_consts.string8);

        final Term arg1 = CONST(pred_fixClauses_2_consts.string8);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_fixClauses_2_consts.string8))))
            return mach.Fail0;

        if (!(areg1.unifyJP(CONST(pred_fixClauses_2_consts.string8))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_fixClauses_2_3 extends pred_fixClauses_2 {
    pred_fixClauses_2_3(pred_fixClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_fixClauses_2_consts.string7, var1, var2);

        final Term arg1 = S(pred_fixClauses_2_consts.string7, var3, var4);
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

        if (!(areg0.unifyJP(S(pred_fixClauses_2_consts.string7, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unifyJP(S(pred_fixClauses_2_consts.string7, var3.dref(), var4.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_fixClauses_2_consts.string1, var1.dref(), var3
                .dref(), S(pred_fixClauses_2_consts.string1, var2.dref(), var4.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_fixClauses_2_4 extends pred_fixClauses_2 {
    pred_fixClauses_2_4(pred_fixClauses_2 consts) {
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
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;

        local_aregs.setAreg0((S(pred_fixClauses_2_consts.string4, var1.dref())));

        mach.setCont(local_aregs, 1, S(pred_fixClauses_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_fixClauses_2_consts.string6, var1.dref(), var2.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().not2cont;
    }
}

class pred_fixClauses_2_5 extends pred_fixClauses_2 {
    pred_fixClauses_2_5(pred_fixClauses_2 consts) {
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
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;

        local_aregs.setAreg0((S(pred_fixClauses_2_consts.string4, var2.dref())));

        mach.setCont(local_aregs, 1, S(pred_fixClauses_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_fixClauses_2_consts.string6, var1.dref(), var2.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().not2cont;
    }
}

class pred_fixClauses_2_6 extends pred_fixClauses_2 {
    pred_fixClauses_2_6(pred_fixClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var1.dref();
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2, 1);
        return mach.getCall1();
    }
}
