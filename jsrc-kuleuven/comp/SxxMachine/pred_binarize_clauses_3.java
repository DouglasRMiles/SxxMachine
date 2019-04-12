// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_binarize_clauses_3_consts {
    Code entry_code;
    Code binarize3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("binarize_clauses");
    final static String string2 = internS(".");
    final static String string3 = internS("binarize");
    final static String string4 = internS("addclausetoprogram");
    final static String string5 = internS("[]");
    final static String string6 = internS("call");
}

public class pred_binarize_clauses_3 extends Code {
    private final pred_binarize_clauses_3_consts consts;

    public pred_binarize_clauses_3() {
        consts = new pred_binarize_clauses_3_consts();
        initAlternatives();
    }

    protected pred_binarize_clauses_3(pred_binarize_clauses_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_binarize_clauses_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_binarize_clauses_3_1(this));
        ALT.addAlternative(new pred_binarize_clauses_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.binarize3cont = mach.loadPred("binarize", 2);
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

class pred_binarize_clauses_3_1 extends pred_binarize_clauses_3 {
    pred_binarize_clauses_3_1(pred_binarize_clauses_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = CONST(pred_binarize_clauses_3_consts.string5);
        final Term arg1 = var1;
        final Term arg2 = var1.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(CONST(pred_binarize_clauses_3_consts.string5))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var1.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 1);
        return mach.getCall1();
    }
}

class pred_binarize_clauses_3_2 extends pred_binarize_clauses_3 {
    pred_binarize_clauses_3_2(pred_binarize_clauses_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_binarize_clauses_3_consts.string2, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.a(2).getVVV();
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_binarize_clauses_3_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var5);

        mach.setCont(local_aregs, 2, S(pred_binarize_clauses_3_consts.string4, var5.dref(), var3
                .dref(), var6, S(pred_binarize_clauses_3_consts.string1, var2.dref(), var6.dref(), var4
                        .dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3);
        return getConsts().binarize3cont;
    }
}
