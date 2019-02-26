// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import java.util.Iterator;

class pred_ints_2_consts {
    Code entry_code;
    Code univ4cont;
    Code atomic2cont;
    Code integer2cont;
    Code var2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("ints");
    final static String string2 = internS("univ");
    final static String string3 = internS("intof");
    final static String string4 = internS("atomic");
    final static String string5 = internS("cut");
    final static String string6 = internS("fail");
    final static String string7 = internS("integer");
    final static String string8 = internS("unify");
    final static String string9 = internS("var");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_ints_2 extends Code {
    private final pred_ints_2_consts consts;

    public pred_ints_2() {
        consts = new pred_ints_2_consts();
        initAlternatives();
    }

    protected pred_ints_2(pred_ints_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_ints_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_ints_2_1(this));
        ALT.addAlternative(new pred_ints_2_2(this));
        ALT.addAlternative(new pred_ints_2_3(this));
        ALT.addAlternative(new pred_ints_2_4(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
        consts.atomic2cont = mach.loadPred("atomic", 1);
        consts.integer2cont = mach.loadPred("integer", 1);
        consts.var2cont = mach.loadPred("var", 1);
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

class pred_ints_2_1 extends pred_ints_2 {
    pred_ints_2_1(pred_ints_2 consts) {
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        local_aregs[1] = S(pred_ints_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_ints_2_consts.string6, continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().var2cont;
    }
}

class pred_ints_2_2 extends pred_ints_2 {
    pred_ints_2_2(pred_ints_2 consts) {
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        local_aregs[1] = S(pred_ints_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_ints_2_consts.string8, var1.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().integer2cont;
    }
}

class pred_ints_2_3 extends pred_ints_2 {
    pred_ints_2_3(pred_ints_2 consts) {
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        local_aregs[1] = S(pred_ints_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_ints_2_consts.string6, continuation));
        mach.updateCUTB();
        local_aregs[2] = null;
        return getConsts().atomic2cont;
    }
}

class pred_ints_2_4 extends pred_ints_2 {
    pred_ints_2_4(pred_ints_2 consts) {
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
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;

        local_aregs[3] = S(pred_ints_2_consts.string3, var4.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
