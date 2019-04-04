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

class pred_addclausetoprogram_3_consts {
    Code entry_code;
    Code samepred3cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("addclausetoprogram");
    final static String string2 = internS(".");
    final static String string3 = internS("samepred");
    final static String string4 = internS("cut");
    final static String string5 = internS("[]");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_addclausetoprogram_3 extends Code {
    private final pred_addclausetoprogram_3_consts consts;

    public pred_addclausetoprogram_3() {
        consts = new pred_addclausetoprogram_3_consts();
        initAlternatives();
    }

    protected pred_addclausetoprogram_3(pred_addclausetoprogram_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_addclausetoprogram_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_addclausetoprogram_3_1(this));
        ALT.addAlternative(new pred_addclausetoprogram_3_2(this));
        ALT.addAlternative(new pred_addclausetoprogram_3_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.samepred3cont = mach.loadPred("samepred", 2);
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

class pred_addclausetoprogram_3_1 extends pred_addclausetoprogram_3 {
    pred_addclausetoprogram_3_1(pred_addclausetoprogram_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;

        final Term arg1 = CONST(pred_addclausetoprogram_3_consts.string5);

        final Term arg2 = S(pred_addclausetoprogram_3_consts.string2, S(pred_addclausetoprogram_3_consts.string2, var1
                .dref(), CONST(pred_addclausetoprogram_3_consts.string5)), CONST(pred_addclausetoprogram_3_consts.string5));
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;

        if (!(areg1.unifyJP(CONST(pred_addclausetoprogram_3_consts.string5))))
            return mach.Fail0;

        if (!(areg2.unifyJP(S(pred_addclausetoprogram_3_consts.string2, S(pred_addclausetoprogram_3_consts.string2, var1
                .dref(), CONST(pred_addclausetoprogram_3_consts.string5)), CONST(pred_addclausetoprogram_3_consts.string5)))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return mach.getCall1();
    }
}

class pred_addclausetoprogram_3_2 extends pred_addclausetoprogram_3 {
    pred_addclausetoprogram_3_2(pred_addclausetoprogram_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;

        final Term arg1 = S(pred_addclausetoprogram_3_consts.string2, var2, var3);

        final Term arg2 = S(pred_addclausetoprogram_3_consts.string2, S(pred_addclausetoprogram_3_consts.string2, var1
                .dref(), var2.dref()), var3.dref());
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;

        if (!(areg1.unifyJP(S(pred_addclausetoprogram_3_consts.string2, var2.dref(), var3.dref()))))
            return mach.Fail0;

        if (!(areg2.unifyJP(S(pred_addclausetoprogram_3_consts.string2, S(pred_addclausetoprogram_3_consts.string2, var1
                .dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var2.dref();

        mach.setCont(local_aregs, 2, S(pred_addclausetoprogram_3_consts.string0, new HeapChoice(
                mach.getCUTB()), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return getConsts().samepred3cont;
    }
}

class pred_addclausetoprogram_3_3 extends pred_addclausetoprogram_3 {
    pred_addclausetoprogram_3_3(pred_addclausetoprogram_3 consts) {
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

        final Term arg1 = S(pred_addclausetoprogram_3_consts.string2, var2, var3);

        final Term arg2 = S(pred_addclausetoprogram_3_consts.string2, var2.dref(), var4);
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;

        if (!(areg1.unifyJP(S(pred_addclausetoprogram_3_consts.string2, var2.dref(), var3.dref()))))
            return mach.Fail0;

        if (!(areg2.unifyJP(S(pred_addclausetoprogram_3_consts.string2, var2.dref(), var4.dref()))))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3.dref();
        local_aregs[2] = var4.dref();
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().entry_code;
    }
}
