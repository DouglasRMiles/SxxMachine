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

class pred_escapeChars2_3_consts {
    Code entry_code;
    Code name_nil_ok3cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("escapeChars2");
    final static String string2 = internS(".");
    final static String string3 = internS("name_nil_ok");
    final static String string4 = internS("[]");
    final static String string5 = internS("changeChar");
    final static String string6 = internS("append");
    final static String string7 = internS("cut");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_escapeChars2_3 extends Code {
    private final pred_escapeChars2_3_consts consts;

    public pred_escapeChars2_3() {
        consts = new pred_escapeChars2_3_consts();
        initAlternatives();
    }

    protected pred_escapeChars2_3(pred_escapeChars2_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_escapeChars2_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_escapeChars2_3_1(this));
        ALT.addAlternative(new pred_escapeChars2_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.name_nil_ok3cont = mach.loadPred("name_nil_ok", 2);
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

class pred_escapeChars2_3_1 extends pred_escapeChars2_3 {
    pred_escapeChars2_3_1(pred_escapeChars2_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = CONST(pred_escapeChars2_3_consts.string4);
        final Term arg1 = var1;
        final Term arg2 = var1.dref();
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(CONST(pred_escapeChars2_3_consts.string4))))
            return mach.Fail0;
        if (!(areg1.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var1.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_escapeChars2_3_2 extends pred_escapeChars2_3 {
    pred_escapeChars2_3_2(pred_escapeChars2_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_escapeChars2_3_consts.string2, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_escapeChars2_3_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var4.dref())))
            return mach.Fail0;
        local_aregs[0] = var5;

        local_aregs[1] = S(pred_escapeChars2_3_consts.string2, var1.dref(), CONST(pred_escapeChars2_3_consts.string4));

        local_aregs[2] = S(pred_escapeChars2_3_consts.string5, var5
                .dref(), var6, S(pred_escapeChars2_3_consts.string3, var6
                        .dref(), var7, S(pred_escapeChars2_3_consts.string6, var3.dref(), var7
                                .dref(), var8, S(pred_escapeChars2_3_consts.string1, var2.dref(), var8.dref(), var4
                                        .dref(), continuation))));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getConsts().name_nil_ok3cont;
    }
}
