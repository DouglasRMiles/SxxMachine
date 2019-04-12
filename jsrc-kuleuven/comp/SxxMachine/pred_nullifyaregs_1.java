// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_nullifyaregs_1_consts {
    Code entry_code;
    Code functor4cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("nullifyaregs");
    final static String string2 = internS("call");
    final static String string3 = internS(":-");
    final static String string4 = internS("functor");
    final static String string5 = internS("is");
    final static String string6 = internS("-");
    final static String string7 = internS("smallerthan");
    final static String string8 = internS("nullify");
    final static NumberTerm posint0 = Integer(0);
}

public class pred_nullifyaregs_1 extends Code {
    private final pred_nullifyaregs_1_consts consts;

    public pred_nullifyaregs_1() {
        consts = new pred_nullifyaregs_1_consts();
        initAlternatives();
    }

    protected pred_nullifyaregs_1(pred_nullifyaregs_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_nullifyaregs_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_nullifyaregs_1_1(this));
        ALT.addAlternative(new pred_nullifyaregs_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.functor4cont = mach.loadPred("functor", 3);
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

class pred_nullifyaregs_1_1 extends pred_nullifyaregs_1 {
    pred_nullifyaregs_1_1(pred_nullifyaregs_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_nullifyaregs_1_consts.string3, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_nullifyaregs_1_consts.string3, var1.dref(), var2.dref()))))
            return mach.Fail0;
        local_aregs.setAV(0,var1.dref());
        local_aregs.setAV(1,var3);
        local_aregs.setAV(2,var4);

        mach.setCont(local_aregs, 3, S(pred_nullifyaregs_1_consts.string4, var2
                .dref(), var5, var6, S(pred_nullifyaregs_1_consts.string5, var7, S(pred_nullifyaregs_1_consts.string6, var4
                        .dref(), var6
                                .dref()), S(pred_nullifyaregs_1_consts.string7, pred_nullifyaregs_1_consts.posint0, var7
                                        .dref(), S(pred_nullifyaregs_1_consts.string8, var7.dref(), var4
                                                .dref(), continuation)))));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_nullifyaregs_1_2 extends pred_nullifyaregs_1 {
    pred_nullifyaregs_1_2(pred_nullifyaregs_1 consts) {
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
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}
