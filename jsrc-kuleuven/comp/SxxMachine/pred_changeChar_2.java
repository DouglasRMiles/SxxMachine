// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_changeChar_2_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("changeChar");
    final static String string2 = internS("call");
    final static String string3 = internS("\\");
    final static String string4 = internS("\\\\");
    final static String string5 = internS("cut");
    final static String string6 = internS("\"");
    final static String string7 = internS("\\\"");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_changeChar_2 extends Code {
    private final pred_changeChar_2_consts consts;

    public pred_changeChar_2() {
        consts = new pred_changeChar_2_consts();
        initAlternatives();
    }

    protected pred_changeChar_2(pred_changeChar_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_changeChar_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_changeChar_2_1(this));
        ALT.addAlternative(new pred_changeChar_2_2(this));
        ALT.addAlternative(new pred_changeChar_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
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

class pred_changeChar_2_1 extends pred_changeChar_2 {
    pred_changeChar_2_1(pred_changeChar_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_changeChar_2_consts.string6);

        final Term arg1 = CONST(pred_changeChar_2_consts.string7);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_changeChar_2_consts.string6))))
            return mach.Fail0;

        if (!(areg1.unifyJP(CONST(pred_changeChar_2_consts.string7))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_changeChar_2_2 extends pred_changeChar_2 {
    pred_changeChar_2_2(pred_changeChar_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_changeChar_2_consts.string3);

        final Term arg1 = CONST(pred_changeChar_2_consts.string4);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_changeChar_2_consts.string3))))
            return mach.Fail0;

        if (!(areg1.unifyJP(CONST(pred_changeChar_2_consts.string4))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_changeChar_2_3 extends pred_changeChar_2 {
    pred_changeChar_2_3(pred_changeChar_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var1.dref();
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var1.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2, 1);
        return mach.getCall1();
    }
}
