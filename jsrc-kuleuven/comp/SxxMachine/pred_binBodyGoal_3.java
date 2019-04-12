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

class pred_binBodyGoal_3_consts {
    Code entry_code;
    Code makebinbody4cont;
    Code nonvar2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("binBodyGoal");
    final static String string2 = internS("makebinbody");
    final static String string3 = internS("nonvar");
    final static String string4 = internS("unify");
    final static String string5 = internS("call");
    final static String string6 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_binBodyGoal_3 extends Code {
    private final pred_binBodyGoal_3_consts consts;

    public pred_binBodyGoal_3() {
        consts = new pred_binBodyGoal_3_consts();
        initAlternatives();
    }

    protected pred_binBodyGoal_3(pred_binBodyGoal_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_binBodyGoal_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_binBodyGoal_3_1(this));
        ALT.addAlternative(new pred_binBodyGoal_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.makebinbody4cont = mach.loadPred("makebinbody", 3);
        consts.nonvar2cont = mach.loadPred("nonvar", 1);
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

class pred_binBodyGoal_3_1 extends pred_binBodyGoal_3 {
    pred_binBodyGoal_3_1(pred_binBodyGoal_3 consts) {
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
        final Term arg2 = var3;
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
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());

        mach.setCont(local_aregs, 1, S(pred_binBodyGoal_3_consts.string4, S(pred_binBodyGoal_3_consts.string5, var4), var2
                .dref(), S(pred_binBodyGoal_3_consts.string0, new HeapChoice(mach.getCUTB()), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().nonvar2cont;
    }
}

class pred_binBodyGoal_3_2 extends pred_binBodyGoal_3 {
    pred_binBodyGoal_3_2(pred_binBodyGoal_3 consts) {
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
        final Term arg2 = var3;
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
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var2.dref());
        local_aregs.setAV(2,var3.dref());
        mach.setCont(local_aregs, 3, continuation);
        mach.updateCUTB();
        return getConsts().makebinbody4cont;
    }
}
