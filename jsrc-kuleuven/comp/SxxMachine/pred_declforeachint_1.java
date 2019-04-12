// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_declforeachint_1_consts {
    Code entry_code;
    Code writel2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("declforeachint");
    final static String string2 = internS(".");
    final static String string3 = internS("writel");
    final static String string4 = internS("final static Int ");
    final static String string5 = internS("posneg");
    final static String string6 = internS(" = new Int(");
    final static String string7 = internS(") ;");
    final static String string8 = internS("wr");
    final static String string9 = internS("nl");
    final static String string10 = internS("[]");
    final static String string11 = internS("call");
}

public class pred_declforeachint_1 extends Code {
    private final pred_declforeachint_1_consts consts;

    public pred_declforeachint_1() {
        consts = new pred_declforeachint_1_consts();
        initAlternatives();
    }

    protected pred_declforeachint_1(pred_declforeachint_1 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_declforeachint_1_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_declforeachint_1_1(this));
        ALT.addAlternative(new pred_declforeachint_1_2(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.writel2cont = mach.loadPred("writel", 1);
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

class pred_declforeachint_1_1 extends pred_declforeachint_1 {
    pred_declforeachint_1_1(pred_declforeachint_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_declforeachint_1_consts.string10);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_declforeachint_1_consts.string10))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}

class pred_declforeachint_1_2 extends pred_declforeachint_1 {
    pred_declforeachint_1_2(pred_declforeachint_1 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_declforeachint_1_consts.string2, var1, var2);
        return new Term[] { arg0 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_declforeachint_1_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;

        local_aregs.areg0 = (S(pred_declforeachint_1_consts.string2, CONST(pred_declforeachint_1_consts.string4), S(pred_declforeachint_1_consts.string2, S(pred_declforeachint_1_consts.string5, var1
                .dref()), S(pred_declforeachint_1_consts.string2, CONST(pred_declforeachint_1_consts.string6), S(pred_declforeachint_1_consts.string2, var1
                        .dref(), S(pred_declforeachint_1_consts.string2, CONST(pred_declforeachint_1_consts.string7), S(pred_declforeachint_1_consts.string2, S(pred_declforeachint_1_consts.string8, CONST(pred_declforeachint_1_consts.string9)), CONST(pred_declforeachint_1_consts.string10))))))));

        mach.setCont(local_aregs, 1, S(pred_declforeachint_1_consts.string1, var2.dref(), continuation));
        mach.updateCUTB();
        return getConsts().writel2cont;
    }
}
