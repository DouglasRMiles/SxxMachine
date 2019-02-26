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

class pred_maxClauses_2_consts {
    Code entry_code;
    Code is3cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("maxClauses");
    final static String string2 = internS(".");
    final static String string3 = internS("is");
    final static String string4 = internS("-");
    final static String string5 = internS("cut");
    final static String string6 = internS("fail");
    final static String string7 = internS("[]");
    final static String string8 = internS("call");
    final static NumberTerm posint1 = Integer(1);
    final static NumberTerm posint0 = Integer(0);
}

public class pred_maxClauses_2 extends Code {
    private final pred_maxClauses_2_consts consts;

    public pred_maxClauses_2() {
        consts = new pred_maxClauses_2_consts();
        initAlternatives();
    }

    protected pred_maxClauses_2(pred_maxClauses_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_maxClauses_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_maxClauses_2_1(this));
        ALT.addAlternative(new pred_maxClauses_2_2(this));
        ALT.addAlternative(new pred_maxClauses_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.is3cont = mach.loadPred("is", 2);
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

class pred_maxClauses_2_1 extends pred_maxClauses_2 {
    pred_maxClauses_2_1(pred_maxClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = CONST(pred_maxClauses_2_consts.string7);
        final Term arg1 = var1;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(CONST(pred_maxClauses_2_consts.string7))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_maxClauses_2_2 extends pred_maxClauses_2 {
    pred_maxClauses_2_2(pred_maxClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_maxClauses_2_consts.string2, var1, var2);

        final Term arg1 = pred_maxClauses_2_consts.posint0;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_maxClauses_2_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(pred_maxClauses_2_consts.posint0)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        local_aregs[0] = S(pred_maxClauses_2_consts.string6, continuation);
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maxClauses_2_3 extends pred_maxClauses_2 {
    pred_maxClauses_2_3(pred_maxClauses_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_maxClauses_2_consts.string2, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_maxClauses_2_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = var4;

        local_aregs[1] = S(pred_maxClauses_2_consts.string4, var3.dref(), pred_maxClauses_2_consts.posint1);

        local_aregs[2] = S(pred_maxClauses_2_consts.string1, var2.dref(), var4.dref(), continuation);
        mach.updateCUTB();
        return getConsts().is3cont;
    }
}
