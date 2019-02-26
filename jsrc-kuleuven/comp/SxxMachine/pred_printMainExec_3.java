// Generated java file - release 0.2 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

package SxxMachine;

import java.util.Iterator;

class pred_printMainExec_3_consts {
    Code entry_code;
    Code writel2cont;
    Code cut2cont;
    final static String string0 = Const.strIntern("cut");
    final static String string1 = Const.strIntern("printMainExec");
    final static String string2 = Const.strIntern("writel");
    final static String string3 = Const.strIntern(".");
    final static String string4 = Const.strIntern("     PrologObject aregs[] = mach.createAregCopy(");
    final static String string5 = Const.strIntern(");");
    final static String string6 = Const.strIntern("wr");
    final static String string7 = Const.strIntern("nl");
    final static String string8 = Const.strIntern("     mach.createChoicePoint(aregs) ;");
    final static String string9 = Const.strIntern("     Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);");
    final static String string10 = Const.strIntern("     mach.fillAlternatives(todo);");
    final static String string11 = Const.strIntern("     return todo.next().exec(mach);");
    final static String string12 = Const.strIntern("[]");
    final static String string13 = Const.strIntern("cut");
    final static String string14 = Const.strIntern("getPredHeader");
    final static String string15 = Const.strIntern("functor");
    final static String string16 = Const.strIntern("arg");
    final static String string17 = Const.strIntern("continuation");
    final static String string18 = Const.strIntern("unify");
    final static String string19 = Const.strIntern("mynumbervars");
    final static String string20 = Const.strIntern("printPredExecCode");
    final static Int posint1 = JpFactory.Long(1);
}

public class pred_printMainExec_3 extends Code {
    private final pred_printMainExec_3_consts consts;

    public pred_printMainExec_3() {
        consts = new pred_printMainExec_3_consts();
        initAlternatives();
    }

    protected pred_printMainExec_3(pred_printMainExec_3 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_printMainExec_3_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_printMainExec_3_1(this));
        ALT.addAlternative(new pred_printMainExec_3_2(this));

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
        Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_printMainExec_3_1 extends pred_printMainExec_3 {
    pred_printMainExec_3_1(pred_printMainExec_3 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {
        @SuppressWarnings("unused")
        Term var10 = new DummyVar();
        @SuppressWarnings("unused")
        Term var9 = new DummyVar();
        @SuppressWarnings("unused")
        Term var8 = new DummyVar();
        @SuppressWarnings("unused")
        Term var7 = new DummyVar();
        @SuppressWarnings("unused")
        Term var6 = new DummyVar();
        @SuppressWarnings("unused")
        Term var5 = new DummyVar();
        @SuppressWarnings("unused")
        Term var4 = new DummyVar();
        @SuppressWarnings("unused")
        Term var3 = new DummyVar();
        @SuppressWarnings("unused")
        Term var2 = new DummyVar();
        @SuppressWarnings("unused")
        Term var1 = new DummyVar();
        Term arg0 = JpFactory.S(getConsts().string3, var1, JpFactory.CONST(getConsts().string12));
        Term arg1 = var2;
        Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var10 = JpFactory.JVAR(mach);
        Term var9 = JpFactory.JVAR(mach);
        Term var8 = JpFactory.JVAR(mach);
        Term var7 = JpFactory.JVAR(mach);
        Term var6 = JpFactory.JVAR(mach);
        Term var5 = JpFactory.JVAR(mach);
        Term var4 = JpFactory.JVAR(mach);
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(JpFactory.S(getConsts().string3, var1.dref(), JpFactory.CONST(getConsts().string12)))))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = JpFactory.S(getConsts().string14, var1.dref(), var4, var5, JpFactory
                .S(getConsts().string15, var4.dref(), var6, var2.dref(), JpFactory.S(getConsts().string16, var2
                        .dref(), var4.dref(), JpFactory.S(getConsts().string17, var2.dref()), JpFactory
                                .S(getConsts().string18, var1.dref(), var7, JpFactory.S(getConsts().string14, var7
                                        .dref(), var8, var9, JpFactory.S(getConsts().string19, var7
                                                .dref(), getConsts().posint1, var10, JpFactory
                                                        .S(getConsts().string20, var2.dref(), var10.dref(), var8
                                                                .dref(), var9.dref(), var3.dref(), var1
                                                                        .dref(), var6.dref(), continuation)))))));
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_printMainExec_3_2 extends pred_printMainExec_3 {
    pred_printMainExec_3_2(pred_printMainExec_3 consts) {
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
        Term arg0 = var1;
        Term arg1 = var2;
        Term arg2 = var3;
        return new Term[] { arg0, arg1, arg2 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        Term local_aregs[] = mach.getAreg();
        Term continuation = local_aregs[3];
        Term areg2 = local_aregs[2].dref();
        Term areg1 = local_aregs[1].dref();
        Term areg0 = local_aregs[0].dref();
        Term var3 = JpFactory.JVAR(mach);
        Term var2 = JpFactory.JVAR(mach);
        Term var1 = JpFactory.JVAR(mach);
        if (!(areg0.unify(var1.dref())))
            return mach.Fail0;
        if (!(areg1.unify(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unify(var3.dref())))
            return mach.Fail0;
        local_aregs[0] = JpFactory.S(getConsts().string3, JpFactory.CONST(getConsts().string4), JpFactory
                .S(getConsts().string3, var2.dref(), JpFactory.S(getConsts().string3, JpFactory
                        .CONST(getConsts().string5), JpFactory.S(getConsts().string3, JpFactory
                                .S(getConsts().string6, JpFactory.CONST(getConsts().string7)), JpFactory
                                        .S(getConsts().string3, JpFactory.CONST(getConsts().string8), JpFactory
                                                .S(getConsts().string3, JpFactory.S(getConsts().string6, JpFactory
                                                        .CONST(getConsts().string7)), JpFactory
                                                                .S(getConsts().string3, JpFactory
                                                                        .CONST(getConsts().string9), JpFactory
                                                                                .S(getConsts().string3, JpFactory
                                                                                        .S(getConsts().string6, JpFactory
                                                                                                .CONST(getConsts().string7)), JpFactory
                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                .CONST(getConsts().string10), JpFactory
                                                                                                                        .S(getConsts().string3, JpFactory
                                                                                                                                .S(getConsts().string6, JpFactory
                                                                                                                                        .CONST(getConsts().string7)), JpFactory
                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                        .CONST(getConsts().string11), JpFactory
                                                                                                                                                                .S(getConsts().string3, JpFactory
                                                                                                                                                                        .S(getConsts().string6, JpFactory
                                                                                                                                                                                .CONST(getConsts().string7)), JpFactory
                                                                                                                                                                                        .CONST(getConsts().string12)))))))))))));
        local_aregs[1] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return getConsts().writel2cont;
    }
}
