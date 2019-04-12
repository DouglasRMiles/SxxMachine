// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

import java.util.Iterator;

class pred_mynumbervars_3_consts {
    Code entry_code;
    Code univ4cont;
    Code atomic2cont;
    Code cut2cont;
    Code var2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("mynumbervars");
    final static String string2 = internS("univ");
    final static String string3 = internS("mynumbervarslist");
    final static String string4 = internS("atomic");
    final static String string5 = internS("cut");
    final static String string6 = internS("unify");
    final static String string7 = internS("varnr");
    final static String string8 = internS("var");
    final static String string9 = internS("inc");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_mynumbervars_3 extends Code {
    private final pred_mynumbervars_3_consts consts;

    public pred_mynumbervars_3() {
        consts = new pred_mynumbervars_3_consts();
        initAlternatives();
    }

    protected pred_mynumbervars_3(pred_mynumbervars_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_mynumbervars_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_mynumbervars_3_1(this));
        ALT.addAlternative(new pred_mynumbervars_3_2(this));
        ALT.addAlternative(new pred_mynumbervars_3_3(this));
        ALT.addAlternative(new pred_mynumbervars_3_4(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.univ4cont = mach.loadPred("univ", 3);
        consts.atomic2cont = mach.loadPred("atomic", 1);
        consts.var2cont = mach.loadPred("var", 1);
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

class pred_mynumbervars_3_1 extends pred_mynumbervars_3 {
    pred_mynumbervars_3_1(pred_mynumbervars_3 consts) {
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
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
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
        local_aregs.areg0 = (var1.dref());

        mach.setCont(local_aregs, 1, S(pred_mynumbervars_3_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_mynumbervars_3_consts.string6, S(pred_mynumbervars_3_consts.string7, var2
                        .dref(), var4), var1
                                .dref(), S(pred_mynumbervars_3_consts.string9, var3.dref(), var2
                                        .dref(), continuation))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().var2cont;
    }
}

class pred_mynumbervars_3_2 extends pred_mynumbervars_3 {
    pred_mynumbervars_3_2(pred_mynumbervars_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_mynumbervars_3_consts.string7, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 3);
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_mynumbervars_3_consts.string7, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_mynumbervars_3_consts.string6, var4.dref(), var3.dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return mach.getCall1();
    }
}

class pred_mynumbervars_3_3 extends pred_mynumbervars_3 {
    pred_mynumbervars_3_3(pred_mynumbervars_3 consts) {
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
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.areg0 = (var1.dref());

        mach.setCont(local_aregs, 1, S(pred_mynumbervars_3_consts.string0, new HeapChoice(
                mach.getCUTB()), S(pred_mynumbervars_3_consts.string6, var3.dref(), var2.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().atomic2cont;
    }
}

class pred_mynumbervars_3_4 extends pred_mynumbervars_3 {
    pred_mynumbervars_3_4(pred_mynumbervars_3 consts) {
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
        final Term areg2 = local_aregs.getTermDRef(2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var5 = Jv(mach);
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
        local_aregs.areg0 = (var1.dref());
        local_aregs.areg1 = (var4);
        local_aregs.areg2 = (var5);

        mach.setCont(local_aregs, 3, S(pred_mynumbervars_3_consts.string3, var5.dref(), var2.dref(), var3
                .dref(), continuation));
        mach.updateCUTB();
        return getConsts().univ4cont;
    }
}
