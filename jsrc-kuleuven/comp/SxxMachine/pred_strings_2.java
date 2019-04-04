// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_strings_2_consts {
    Code entry_code;
    Code univ4cont;
    Code functor4cont;
    Code atomic2cont;
    Code atom2cont;
    Code var2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("strings");
    final static String string2 = internS("univ");
    final static String string3 = internS("stringsl");
    final static String string4 = internS("functor");
    final static String string5 = internS("unify");
    final static String string6 = internS("atomic");
    final static String string7 = internS("cut");
    final static String string8 = internS("fail");
    final static String string9 = internS("atom");
    final static String string10 = internS("var");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_strings_2 extends Code {
    private final pred_strings_2_consts consts;

    public pred_strings_2() {
        consts = new pred_strings_2_consts();
        initAlternatives();
    }

    protected pred_strings_2(pred_strings_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_strings_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_strings_2_1(this));
        ALT.addAlternative(new pred_strings_2_2(this));
        ALT.addAlternative(new pred_strings_2_3(this));
        ALT.addAlternative(new pred_strings_2_4(this));
        ALT.addAlternative(new pred_strings_2_5(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
        consts.functor4cont = mach.loadPred("functor", 3);
        consts.atomic2cont = mach.loadPred("atomic", 1);
        consts.atom2cont = mach.loadPred("atom", 1);
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

class pred_strings_2_1 extends pred_strings_2 {
    pred_strings_2_1(pred_strings_2 consts) {
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
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        mach.setCont(local_aregs, 1, S(pred_strings_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_strings_2_consts.string8, continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().var2cont;
    }
}

class pred_strings_2_2 extends pred_strings_2 {
    pred_strings_2_2(pred_strings_2 consts) {
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
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        mach.setCont(local_aregs, 1, S(pred_strings_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_strings_2_consts.string5, var1.dref(), var2.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().atom2cont;
    }
}

class pred_strings_2_3 extends pred_strings_2 {
    pred_strings_2_3(pred_strings_2 consts) {
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
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();

        mach.setCont(local_aregs, 1, S(pred_strings_2_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_strings_2_consts.string8, continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().atomic2cont;
    }
}

class pred_strings_2_4 extends pred_strings_2 {
    pred_strings_2_4(pred_strings_2 consts) {
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
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;

        mach.setCont(local_aregs, 3, S(pred_strings_2_consts.string5, var3.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        return getConsts().functor4cont;
    }
}

class pred_strings_2_5 extends pred_strings_2 {
    pred_strings_2_5(pred_strings_2 consts) {
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
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!(areg0.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var3;
        local_aregs[2] = var4;

        mach.setCont(local_aregs, 3, S(pred_strings_2_consts.string3, var4.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
