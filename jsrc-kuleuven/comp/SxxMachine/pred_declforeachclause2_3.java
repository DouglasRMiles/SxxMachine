// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_declforeachclause2_3_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("declforeachclause2");
    final static String string2 = internS(".");
    final static String string3 = internS("writel");
    final static String string4 = internS("ALT.addAlternative(");
    final static String string5 = internS("new ");
    final static String string6 = internS("_");
    final static String string7 = internS("(this));");
    final static String string8 = internS("wr");
    final static String string9 = internS("nl");
    final static String string10 = internS("[]");
    final static String string11 = internS("inc");
    final static String string12 = internS("call");
}

public class pred_declforeachclause2_3 extends Code {
    private final pred_declforeachclause2_3_consts consts;

    public pred_declforeachclause2_3() {
        consts = new pred_declforeachclause2_3_consts();
        initAlternatives();
    }

    protected pred_declforeachclause2_3(pred_declforeachclause2_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_declforeachclause2_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_declforeachclause2_3_1(this));
        ALT.addAlternative(new pred_declforeachclause2_3_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
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

class pred_declforeachclause2_3_1 extends pred_declforeachclause2_3 {
    pred_declforeachclause2_3_1(pred_declforeachclause2_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = CONST(pred_declforeachclause2_3_consts.string10);
        final Term arg1 = var1;
        final Term arg2 = var2;
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
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(CONST(pred_declforeachclause2_3_consts.string10))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}

class pred_declforeachclause2_3_2 extends pred_declforeachclause2_3 {
    pred_declforeachclause2_3_2(pred_declforeachclause2_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_declforeachclause2_3_consts.string2, var1, var2);
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
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_declforeachclause2_3_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;

        local_aregs[0] = S(pred_declforeachclause2_3_consts.string2, CONST(pred_declforeachclause2_3_consts.string4), S(pred_declforeachclause2_3_consts.string2, CONST(pred_declforeachclause2_3_consts.string5), S(pred_declforeachclause2_3_consts.string2, var4
                .dref(), S(pred_declforeachclause2_3_consts.string2, CONST(pred_declforeachclause2_3_consts.string6), S(pred_declforeachclause2_3_consts.string2, var3
                        .dref(), S(pred_declforeachclause2_3_consts.string2, CONST(pred_declforeachclause2_3_consts.string7), S(pred_declforeachclause2_3_consts.string2, S(pred_declforeachclause2_3_consts.string8, CONST(pred_declforeachclause2_3_consts.string9)), CONST(pred_declforeachclause2_3_consts.string10))))))));

        local_aregs[1] = S(pred_declforeachclause2_3_consts.string11, var5, var3
                .dref(), S(pred_declforeachclause2_3_consts.string1, var2.dref(), var5.dref(), var4
                        .dref(), continuation));
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return getConsts().writel2cont;
    }
}
