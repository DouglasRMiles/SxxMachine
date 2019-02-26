// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_operator_goal_2_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("operator_goal");
    final static String string2 = Const.strIntern("chr sbag_del_element");
    final static String string3 = Const.strIntern("chr_sbag_del_element");
    final static String string4 = Const.strIntern("cut");
    final static String string5 = Const.strIntern("chr sbag_member");
    final static String string6 = Const.strIntern("chr_sbag_member");
    final static String string7 = Const.strIntern("chr gen_id");
    final static String string8 = Const.strIntern("chr_gen_id");
    final static String string9 = Const.strIntern("chr none_locked");
    final static String string10 = Const.strIntern("chr_none_locked");
    final static String string11 = Const.strIntern("chr not_locked");
    final static String string12 = Const.strIntern("chr_not_locked");
    final static String string13 = Const.strIntern("chr newvia_2");
    final static String string14 = Const.strIntern("chr_newvia_2");
    final static String string15 = Const.strIntern("chr newvia_1");
    final static String string16 = Const.strIntern("chr_newvia_1");
    final static String string17 = Const.strIntern("chr newvia");
    final static String string18 = Const.strIntern("chr_newvia");
    final static String string19 = Const.strIntern(":");
    final static String string20 = Const.strIntern("hprolog");
    final static String string21 = Const.strIntern("put_ds");
    final static String string22 = Const.strIntern("chr_put_history");
    final static String string23 = Const.strIntern("get_ds");
    final static String string24 = Const.strIntern("chr_get_history");
    final static String string25 = Const.strIntern("del_attr");
    final static String string26 = Const.strIntern("put_attr");
    final static String string27 = Const.strIntern("get_attr");
    final static String string28 = Const.strIntern("nb_setval");
    final static String string29 = Const.strIntern("b_setval");
    final static String string30 = Const.strIntern("nb_getval");
    final static String string31 = Const.strIntern("b_getval");
    final static String string32 = Const.strIntern("is");
    final static String string33 = Const.strIntern("+");
    final static String string34 = Const.strIntern("inc");
    final static String string35 = Const.strIntern("=..");
    final static String string36 = Const.strIntern(".");
    final static String string37 = Const.strIntern("univ");
    final static String string38 = Const.strIntern("\\+");
    final static String string39 = Const.strIntern("not");
    final static String string40 = Const.strIntern("->");
    final static String string41 = Const.strIntern("if");
    final static String string42 = Const.strIntern("==");
    final static String string43 = Const.strIntern("termequal");
    final static String string44 = Const.strIntern("@>=");
    final static String string45 = Const.strIntern("termgreaterequal");
    final static String string46 = Const.strIntern("@=<");
    final static String string47 = Const.strIntern("termsmallerequal");
    final static String string48 = Const.strIntern("@>");
    final static String string49 = Const.strIntern("termgreaterthan");
    final static String string50 = Const.strIntern("@<");
    final static String string51 = Const.strIntern("termsmallerthan");
    final static String string52 = Const.strIntern(";");
    final static String string53 = Const.strIntern("or");
    final static String string54 = Const.strIntern("=");
    final static String string55 = Const.strIntern("unify");
    final static String string56 = Const.strIntern("=:=");
    final static String string57 = Const.strIntern("arithequal");
    final static String string58 = Const.strIntern(">=");
    final static String string59 = Const.strIntern("smallerorequal");
    final static String string60 = Const.strIntern(">");
    final static String string61 = Const.strIntern("smallerthan");
    final static String string62 = Const.strIntern("=<");
    final static String string63 = Const.strIntern("<");
    final static Int posint1 = JpFactory.Long(1);
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
        Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string63, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string61, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string63, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string61, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string62, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string59, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string62, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string59, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string60, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string61, var2.dref(), var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string60, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string61, var2.dref(), var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string58, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string59, var2.dref(), var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string58, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string59, var2.dref(), var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string56, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string57, var2.dref(), var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string56, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string57, var2.dref(), var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string54, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string55, var2.dref(), var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string54, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string55, var2.dref(), var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string52, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string53, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string52, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string53, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string50, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string51, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string50, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string51, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string48, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string49, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string48, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string49, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string46, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string47, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string46, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string47, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string44, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string45, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string44, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string45, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string42, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string43, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string42, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string43, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string40, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string41, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string40, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string41, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string38, var1);
        Term arg1 = JpFactory.S(getConsts().string39, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string38, var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string39, var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string35, var1, JpFactory.S(getConsts().string36, var2, var3));
        Term arg1 = JpFactory.S(getConsts().string37, var1.dref(), var2.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory
                .S(getConsts().string35, var1.dref(), JpFactory.S(getConsts().string36, var2.dref(), var3.dref())))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string37, var1.dref(), var2.dref(), var3.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory
                .S(getConsts().string32, var1, JpFactory.S(getConsts().string33, var2, getConsts().posint1));
        Term arg1 = JpFactory.S(getConsts().string34, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string32, var1.dref(), JpFactory
                .S(getConsts().string33, var2.dref(), getConsts().posint1)))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string34, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string30, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string31, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string30, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string31, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string28, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string29, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string28, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string29, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string27, var1, var2, var3);
        Term arg1 = JpFactory.S(getConsts().string27, var1.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string27, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string27, var1.dref(), var3.dref()))))
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
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string26, var1, var2, var3);
        Term arg1 = JpFactory.S(getConsts().string26, var1.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string26, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string26, var1.dref(), var3.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string25, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string25, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string25, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string25, var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string19, JpFactory.CONST(getConsts().string20), JpFactory
                .S(getConsts().string23, var1, var2, var3));
        Term arg1 = JpFactory.S(getConsts().string24, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string19, JpFactory.CONST(getConsts().string20), JpFactory
                .S(getConsts().string23, var1.dref(), var2.dref(), var3.dref())))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string24, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string19, JpFactory.CONST(getConsts().string20), JpFactory
                .S(getConsts().string21, var1, var2, var3, var4));
        Term arg1 = JpFactory.S(getConsts().string22, var1.dref(), var2.dref(), var4.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string19, JpFactory.CONST(getConsts().string20), JpFactory
                .S(getConsts().string21, var1.dref(), var2.dref(), var3.dref(), var4.dref())))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string22, var1.dref(), var2.dref(), var4.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string17, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string18, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string17, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string18, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string15, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string16, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string15, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string16, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string13, var1, var2, var3);
        Term arg1 = JpFactory.S(getConsts().string14, var1.dref(), var2.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string13, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string14, var1.dref(), var2.dref(), var3.dref()))))
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
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string11, var1);
        Term arg1 = JpFactory.S(getConsts().string12, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string11, var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string12, var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string9, var1);
        Term arg1 = JpFactory.S(getConsts().string10, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string9, var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string10, var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string7, var1);
        Term arg1 = JpFactory.S(getConsts().string8, var1.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string7, var1.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string8, var1.dref()))))
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
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string5, var1, var2);
        Term arg1 = JpFactory.S(getConsts().string6, var1.dref(), var2.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string5, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string6, var1.dref(), var2.dref()))))
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
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string2, var1, var2, var3);
        Term arg1 = JpFactory.S(getConsts().string3, var1.dref(), var2.dref(), var3.dref());
        return new Term[] { arg0, arg1 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[2];
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string2, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unify(JpFactory.S(getConsts().string3, var1.dref(), var2.dref(), var3.dref()))))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[2] = null;
        return mach.Call1;
    }
}
