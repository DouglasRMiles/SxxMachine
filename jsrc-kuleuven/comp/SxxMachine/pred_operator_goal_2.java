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

class pred_operator_goal_2_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("operator_goal");
    final static String string2 = internS("chr sbag_del_element");
    final static String string3 = internS("chr_sbag_del_element");
    final static String string4 = internS("cut");
    final static String string5 = internS("chr sbag_member");
    final static String string6 = internS("chr_sbag_member");
    final static String string7 = internS("chr gen_id");
    final static String string8 = internS("chr_gen_id");
    final static String string9 = internS("chr none_locked");
    final static String string10 = internS("chr_none_locked");
    final static String string11 = internS("chr not_locked");
    final static String string12 = internS("chr_not_locked");
    final static String string13 = internS("chr newvia_2");
    final static String string14 = internS("chr_newvia_2");
    final static String string15 = internS("chr newvia_1");
    final static String string16 = internS("chr_newvia_1");
    final static String string17 = internS("chr newvia");
    final static String string18 = internS("chr_newvia");
    final static String string19 = internS(":");
    final static String string20 = internS("hprolog");
    final static String string21 = internS("put_ds");
    final static String string22 = internS("chr_put_history");
    final static String string23 = internS("get_ds");
    final static String string24 = internS("chr_get_history");
    final static String string25 = internS("del_attr");
    final static String string26 = internS("put_attr");
    final static String string27 = internS("get_attr");
    final static String string28 = internS("nb_setval");
    final static String string29 = internS("b_setval");
    final static String string30 = internS("nb_getval");
    final static String string31 = internS("b_getval");
    final static String string32 = internS("is");
    final static String string33 = internS("+");
    final static String string34 = internS("inc");
    final static String string35 = internS("=..");
    final static String string36 = internS(".");
    final static String string37 = internS("univ");
    final static String string38 = internS("\\+");
    final static String string39 = internS("not");
    final static String string40 = internS("->");
    final static String string41 = internS("if");
    final static String string42 = internS("==");
    final static String string43 = internS("termequal");
    final static String string44 = internS("@>=");
    final static String string45 = internS("termgreaterequal");
    final static String string46 = internS("@=<");
    final static String string47 = internS("termsmallerequal");
    final static String string48 = internS("@>");
    final static String string49 = internS("termgreaterthan");
    final static String string50 = internS("@<");
    final static String string51 = internS("termsmallerthan");
    final static String string52 = internS(";");
    final static String string53 = internS("or");
    final static String string54 = internS("=");
    final static String string55 = internS("unify");
    final static String string56 = internS("=:=");
    final static String string57 = internS("arithequal");
    final static String string58 = internS(">=");
    final static String string59 = internS("smallerorequal");
    final static String string60 = internS(">");
    final static String string61 = internS("smallerthan");
    final static String string62 = internS("=<");
    final static String string63 = internS("<");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_operator_goal_2 extends Code {
    private final pred_operator_goal_2_consts consts;

    public pred_operator_goal_2() {
        consts = new pred_operator_goal_2_consts();
        initAlternatives();
    }

    protected pred_operator_goal_2(pred_operator_goal_2 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_operator_goal_2_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.addAlternative(new pred_operator_goal_2_1(this));
        ALT.addAlternative(new pred_operator_goal_2_2(this));
        ALT.addAlternative(new pred_operator_goal_2_3(this));
        ALT.addAlternative(new pred_operator_goal_2_4(this));
        ALT.addAlternative(new pred_operator_goal_2_5(this));
        ALT.addAlternative(new pred_operator_goal_2_6(this));
        ALT.addAlternative(new pred_operator_goal_2_7(this));
        ALT.addAlternative(new pred_operator_goal_2_8(this));
        ALT.addAlternative(new pred_operator_goal_2_9(this));
        ALT.addAlternative(new pred_operator_goal_2_10(this));
        ALT.addAlternative(new pred_operator_goal_2_11(this));
        ALT.addAlternative(new pred_operator_goal_2_12(this));
        ALT.addAlternative(new pred_operator_goal_2_13(this));
        ALT.addAlternative(new pred_operator_goal_2_14(this));
        ALT.addAlternative(new pred_operator_goal_2_15(this));
        ALT.addAlternative(new pred_operator_goal_2_16(this));
        ALT.addAlternative(new pred_operator_goal_2_17(this));
        ALT.addAlternative(new pred_operator_goal_2_18(this));
        ALT.addAlternative(new pred_operator_goal_2_19(this));
        ALT.addAlternative(new pred_operator_goal_2_20(this));
        ALT.addAlternative(new pred_operator_goal_2_21(this));
        ALT.addAlternative(new pred_operator_goal_2_22(this));
        ALT.addAlternative(new pred_operator_goal_2_23(this));
        ALT.addAlternative(new pred_operator_goal_2_24(this));
        ALT.addAlternative(new pred_operator_goal_2_25(this));
        ALT.addAlternative(new pred_operator_goal_2_26(this));
        ALT.addAlternative(new pred_operator_goal_2_27(this));
        ALT.addAlternative(new pred_operator_goal_2_28(this));
        ALT.addAlternative(new pred_operator_goal_2_29(this));
        ALT.addAlternative(new pred_operator_goal_2_30(this));
        ALT.addAlternative(new pred_operator_goal_2_31(this));

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

class pred_operator_goal_2_1 extends pred_operator_goal_2 {
    pred_operator_goal_2_1(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string63, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string61, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string63, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string61, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_2 extends pred_operator_goal_2 {
    pred_operator_goal_2_2(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string62, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string59, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string62, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string59, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_3 extends pred_operator_goal_2 {
    pred_operator_goal_2_3(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string60, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string61, var2.dref(), var1.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string60, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string61, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_4 extends pred_operator_goal_2 {
    pred_operator_goal_2_4(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string58, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string59, var2.dref(), var1.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string58, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string59, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_5 extends pred_operator_goal_2 {
    pred_operator_goal_2_5(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string56, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string57, var2.dref(), var1.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string56, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string57, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_6 extends pred_operator_goal_2 {
    pred_operator_goal_2_6(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string54, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string55, var2.dref(), var1.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string54, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string55, var2.dref(), var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_7 extends pred_operator_goal_2 {
    pred_operator_goal_2_7(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string52, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string53, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string52, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string53, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_8 extends pred_operator_goal_2 {
    pred_operator_goal_2_8(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string50, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string51, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string50, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string51, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_9 extends pred_operator_goal_2 {
    pred_operator_goal_2_9(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string48, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string49, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string48, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string49, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_10 extends pred_operator_goal_2 {
    pred_operator_goal_2_10(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string46, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string47, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string46, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string47, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_11 extends pred_operator_goal_2 {
    pred_operator_goal_2_11(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string44, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string45, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string44, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string45, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_12 extends pred_operator_goal_2 {
    pred_operator_goal_2_12(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string42, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string43, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string42, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string43, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_13 extends pred_operator_goal_2 {
    pred_operator_goal_2_13(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string40, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string41, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string40, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string41, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_14 extends pred_operator_goal_2 {
    pred_operator_goal_2_14(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string38, var1);

        final Term arg1 = S(pred_operator_goal_2_consts.string39, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string38, var1.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string39, var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_15 extends pred_operator_goal_2 {
    pred_operator_goal_2_15(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string35, var1, S(pred_operator_goal_2_consts.string36, var2, var3));

        final Term arg1 = S(pred_operator_goal_2_consts.string37, var1.dref(), var2.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string35, var1
                .dref(), S(pred_operator_goal_2_consts.string36, var2.dref(), var3.dref())))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string37, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_16 extends pred_operator_goal_2 {
    pred_operator_goal_2_16(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string32, var1, S(pred_operator_goal_2_consts.string33, var2, pred_operator_goal_2_consts.posint1));

        final Term arg1 = S(pred_operator_goal_2_consts.string34, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string32, var1
                .dref(), S(pred_operator_goal_2_consts.string33, var2.dref(), pred_operator_goal_2_consts.posint1)))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string34, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_17 extends pred_operator_goal_2 {
    pred_operator_goal_2_17(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string30, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string31, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string30, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string31, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_18 extends pred_operator_goal_2 {
    pred_operator_goal_2_18(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string28, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string29, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string28, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string29, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_19 extends pred_operator_goal_2 {
    pred_operator_goal_2_19(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string27, var1, var2, var3);

        final Term arg1 = S(pred_operator_goal_2_consts.string27, var1.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string27, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string27, var1.dref(), var3.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_20 extends pred_operator_goal_2 {
    pred_operator_goal_2_20(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string26, var1, var2, var3);

        final Term arg1 = S(pred_operator_goal_2_consts.string26, var1.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string26, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string26, var1.dref(), var3.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_21 extends pred_operator_goal_2 {
    pred_operator_goal_2_21(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string25, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string25, var1.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string25, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string25, var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_22 extends pred_operator_goal_2 {
    pred_operator_goal_2_22(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string19, CONST(pred_operator_goal_2_consts.string20), S(pred_operator_goal_2_consts.string23, var1, var2, var3));

        final Term arg1 = S(pred_operator_goal_2_consts.string24, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0
                .unify(S(pred_operator_goal_2_consts.string19, CONST(pred_operator_goal_2_consts.string20), S(pred_operator_goal_2_consts.string23, var1
                        .dref(), var2.dref(), var3.dref())))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string24, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_23 extends pred_operator_goal_2 {
    pred_operator_goal_2_23(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string19, CONST(pred_operator_goal_2_consts.string20), S(pred_operator_goal_2_consts.string21, var1, var2, var3, var4));

        final Term arg1 = S(pred_operator_goal_2_consts.string22, var1.dref(), var2.dref(), var4.dref());
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

        if (!(areg0
                .unify(S(pred_operator_goal_2_consts.string19, CONST(pred_operator_goal_2_consts.string20), S(pred_operator_goal_2_consts.string21, var1
                        .dref(), var2.dref(), var3.dref(), var4.dref())))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string22, var1.dref(), var2.dref(), var4.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_24 extends pred_operator_goal_2 {
    pred_operator_goal_2_24(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string17, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string18, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string17, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string18, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_25 extends pred_operator_goal_2 {
    pred_operator_goal_2_25(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string15, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string16, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string15, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string16, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_26 extends pred_operator_goal_2 {
    pred_operator_goal_2_26(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string13, var1, var2, var3);

        final Term arg1 = S(pred_operator_goal_2_consts.string14, var1.dref(), var2.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string13, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string14, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_27 extends pred_operator_goal_2 {
    pred_operator_goal_2_27(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string11, var1);

        final Term arg1 = S(pred_operator_goal_2_consts.string12, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string11, var1.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string12, var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_28 extends pred_operator_goal_2 {
    pred_operator_goal_2_28(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string9, var1);

        final Term arg1 = S(pred_operator_goal_2_consts.string10, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string9, var1.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string10, var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_29 extends pred_operator_goal_2 {
    pred_operator_goal_2_29(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string7, var1);

        final Term arg1 = S(pred_operator_goal_2_consts.string8, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string7, var1.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string8, var1.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_30 extends pred_operator_goal_2 {
    pred_operator_goal_2_30(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string5, var1, var2);

        final Term arg1 = S(pred_operator_goal_2_consts.string6, var1.dref(), var2.dref());
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

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string5, var1.dref(), var2.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string6, var1.dref(), var2.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_operator_goal_2_31 extends pred_operator_goal_2 {
    pred_operator_goal_2_31(pred_operator_goal_2 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_operator_goal_2_consts.string2, var1, var2, var3);

        final Term arg1 = S(pred_operator_goal_2_consts.string3, var1.dref(), var2.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[2];
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unify(S(pred_operator_goal_2_consts.string2, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;

        if (!(areg1.unify(S(pred_operator_goal_2_consts.string3, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}
