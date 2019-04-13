// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_eliminate_disjunction_clause_5_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("eliminate_disjunction_clause");
    final static String string2 = internS(".");
    final static String string3 = internS("call");
    final static String string4 = internS(":-");
    final static String string5 = internS("cut");
    final static String string6 = internS("functor");
    final static String string7 = internS("term_variables");
    final static String string8 = internS("eliminate_disjunction");
    final static String string9 = internS("/");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_eliminate_disjunction_clause_5 extends Code {
    private final pred_eliminate_disjunction_clause_5_consts consts;

    public pred_eliminate_disjunction_clause_5() {
        consts = new pred_eliminate_disjunction_clause_5_consts();
        initAlternatives();
    }

    protected pred_eliminate_disjunction_clause_5(pred_eliminate_disjunction_clause_5 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_eliminate_disjunction_clause_5_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_eliminate_disjunction_clause_5_1(this));
        ALT.addAlternative(new pred_eliminate_disjunction_clause_5_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
    }

    @Override
    public int arity() {
        return 5;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(6);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_eliminate_disjunction_clause_5_1 extends pred_eliminate_disjunction_clause_5 {
    pred_eliminate_disjunction_clause_5_1(pred_eliminate_disjunction_clause_5 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var7 = new DummyVar();

        final Term var6 = new DummyVar();

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_eliminate_disjunction_clause_5_consts.string4, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;

        final Term arg3 = S(pred_eliminate_disjunction_clause_5_consts.string2, S(pred_eliminate_disjunction_clause_5_consts.string4, var1
                .dref(), var5), var6);
        final Term arg4 = var7;
        return new Term[] { arg0, arg1, arg2, arg3, arg4 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 5);
        final Term areg4 = local_aregs.getTermDRef(4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var10 = Jv(mach);
        final Term var9 = Jv(mach);
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_eliminate_disjunction_clause_5_consts.string4, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;

        if (!(areg3
                .unifyJP(S(pred_eliminate_disjunction_clause_5_consts.string2, S(pred_eliminate_disjunction_clause_5_consts.string4, var1
                        .dref(), var5.dref()), var6.dref()))))
            return mach.Fail0;
        if (!(areg4.unifyJP(var7.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        local_aregs.setAreg0((S(pred_eliminate_disjunction_clause_5_consts.string6, var1
                .dref(), var8, var9, S(pred_eliminate_disjunction_clause_5_consts.string7, var1
                        .dref(), var10, S(pred_eliminate_disjunction_clause_5_consts.string8, var2
                                .dref(), S(pred_eliminate_disjunction_clause_5_consts.string9, var8.dref(), var9
                                        .dref()), var10.dref(), var3.dref(), var4
                                                .dref(), var5.dref(), var6.dref(), var7.dref(), continuation)))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 5, 2);
        return mach.getCall1();
    }
}

class pred_eliminate_disjunction_clause_5_2 extends pred_eliminate_disjunction_clause_5 {
    pred_eliminate_disjunction_clause_5_2(pred_eliminate_disjunction_clause_5 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        final Term arg2 = var2.dref();

        final Term arg3 = S(pred_eliminate_disjunction_clause_5_consts.string2, var1.dref(), var3);
        final Term arg4 = var3.dref();
        return new Term[] { arg0, arg1, arg2, arg3, arg4 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 5);
        final Term areg4 = local_aregs.getTermDRef(4);
        final Term areg3 = local_aregs.getTermDRef(3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var2.dref())))
            return mach.Fail0;

        if (!(areg3.unifyJP(S(pred_eliminate_disjunction_clause_5_consts.string2, var1.dref(), var3.dref()))))
            return mach.Fail0;
        if (!(areg4.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 5, 1);
        return mach.getCall1();
    }
}
