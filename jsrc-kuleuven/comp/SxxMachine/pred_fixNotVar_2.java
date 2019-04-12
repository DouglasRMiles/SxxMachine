// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_fixNotVar_2_consts {
    Code entry_code;
    Code univ4cont;
    Code not2cont;
    Code unify3cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("fixNotVar");
    final static String string2 = internS("univ");
    final static String string3 = internS("fixClauses");
    final static String string4 = internS("changeIllegalTerms");
    final static String string5 = internS("not");
    final static String string6 = internS("var");
    final static String string7 = internS("unify");
    final static String string8 = internS(":-");
    final static String string9 = internS("cut");
    final static String string10 = internS("fixBody");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_fixNotVar_2 extends Code {
    private final pred_fixNotVar_2_consts consts;

    public pred_fixNotVar_2() {
        consts = new pred_fixNotVar_2_consts();
        initAlternatives();
    }

    protected pred_fixNotVar_2(pred_fixNotVar_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_fixNotVar_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_fixNotVar_2_1(this));
        ALT.addAlternative(new pred_fixNotVar_2_2(this));
        ALT.addAlternative(new pred_fixNotVar_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
        consts.not2cont = mach.loadPred("not", 1);
        consts.unify3cont = mach.loadPred("unify", 2);
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

class pred_fixNotVar_2_1 extends pred_fixNotVar_2 {
    pred_fixNotVar_2_1(pred_fixNotVar_2 consts) {
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
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
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
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;

        local_aregs.setAV(0,S(pred_fixNotVar_2_consts.string8, var3, var4));
        local_aregs.setAV(1,var1.dref());

        mach.setCont(local_aregs, 2, S(pred_fixNotVar_2_consts.string5, S(pred_fixNotVar_2_consts.string6, var3
                .dref()), S(pred_fixNotVar_2_consts.string0, new HeapChoice(
                        mach.getCUTB()), S(pred_fixNotVar_2_consts.string2, var3
                                .dref(), var5, var6, S(pred_fixNotVar_2_consts.string4, var5
                                        .dref(), var7, S(pred_fixNotVar_2_consts.string3, var6
                                                .dref(), var8, S(pred_fixNotVar_2_consts.string2, var9, var7
                                                        .dref(), var8.dref(), S(pred_fixNotVar_2_consts.string10, var4
                                                                .dref(), var10, S(pred_fixNotVar_2_consts.string7, S(pred_fixNotVar_2_consts.string8, var9
                                                                        .dref(), var10.dref()), var2
                                                                                .dref(), continuation)))))))));
        mach.updateCUTB();
        return getConsts().unify3cont;
    }
}

class pred_fixNotVar_2_2 extends pred_fixNotVar_2 {
    pred_fixNotVar_2_2(pred_fixNotVar_2 consts) {
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
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;

        local_aregs.setAV(0,S(pred_fixNotVar_2_consts.string6, var1.dref()));

        mach.setCont(local_aregs, 1, S(pred_fixNotVar_2_consts.string2, var1
                .dref(), var3, var4, S(pred_fixNotVar_2_consts.string4, var3
                        .dref(), var5, S(pred_fixNotVar_2_consts.string3, var4
                                .dref(), var6, S(pred_fixNotVar_2_consts.string2, var2.dref(), var5.dref(), var6
                                        .dref(), continuation)))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().not2cont;
    }
}

class pred_fixNotVar_2_3 extends pred_fixNotVar_2 {
    pred_fixNotVar_2_3(pred_fixNotVar_2 consts) {
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
        final Term areg1 = local_aregs.a(1).getVVV();
        final Term areg0 = local_aregs.a(0).getVVV();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs.setAV(0,var2.dref());
        local_aregs.setAV(1,var3);
        local_aregs.setAV(2,var4);

        mach.setCont(local_aregs, 3, S(pred_fixNotVar_2_consts.string3, var5, var4
                .dref(), S(pred_fixNotVar_2_consts.string4, var6, var3.dref(), S(pred_fixNotVar_2_consts.string2, var1
                        .dref(), var6.dref(), var5.dref(), continuation))));
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
