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

class pred_makename_2_consts {
    Code entry_code;
    Code atomic2cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("makename");
    final static String string2 = internS(".");
    final static String string3 = internS("name_nil_ok");
    final static String string4 = internS("append");
    final static String string5 = internS("atomic");
    final static String string6 = internS("cut");
    final static String string7 = internS("[]");
    final static String string8 = internS("");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_makename_2 extends Code {
    private final pred_makename_2_consts consts;

    public pred_makename_2() {
        consts = new pred_makename_2_consts();
        initAlternatives();
    }

    protected pred_makename_2(pred_makename_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_makename_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_makename_2_1(this));
        ALT.addAlternative(new pred_makename_2_2(this));
        ALT.addAlternative(new pred_makename_2_3(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
        consts.atomic2cont = mach.loadPred("atomic", 1);
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

class pred_makename_2_1 extends pred_makename_2 {
    pred_makename_2_1(pred_makename_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term arg0 = CONST(pred_makename_2_consts.string7);

        final Term arg1 = CONST(pred_makename_2_consts.string8);
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);

        if (!(areg0.unifyJP(CONST(pred_makename_2_consts.string7))))
            return mach.Fail0;

        if (!(areg1.unifyJP(CONST(pred_makename_2_consts.string8))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_makename_2_2 extends pred_makename_2 {
    pred_makename_2_2(pred_makename_2 consts) {
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
        local_aregs.setAreg0((var1.dref()));

        mach.setCont(local_aregs, 1, S(pred_makename_2_consts.string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return getConsts().atomic2cont;
    }
}

class pred_makename_2_3 extends pred_makename_2 {
    pred_makename_2_3(pred_makename_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_makename_2_consts.string2, var1, var2);
        final Term arg1 = var3;
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_makename_2_consts.string2, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        local_aregs.setAreg0((var2.dref()));
        local_aregs.setAreg1((var4));

        mach.setCont(local_aregs, 2, S(pred_makename_2_consts.string3, var4
                .dref(), var5, S(pred_makename_2_consts.string3, var1
                        .dref(), var6, S(pred_makename_2_consts.string4, var6.dref(), var5
                                .dref(), var7, S(pred_makename_2_consts.string3, var3.dref(), var7
                                        .dref(), continuation)))));
        mach.updateCUTB();
        return getConsts().entry_code;
    }
}
