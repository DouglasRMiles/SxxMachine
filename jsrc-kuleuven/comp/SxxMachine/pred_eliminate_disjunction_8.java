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

class pred_eliminate_disjunction_8_consts {
    Code entry_code;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("eliminate_disjunction");
    final static String string2 = internS("call");
    final static String string3 = internS(";");
    final static String string4 = internS("cut");
    final static String string5 = internS("term_variables");
    final static String string6 = internS("intersect_eq");
    final static String string7 = internS("make_disj_pred");
    final static String string8 = internS("copy_term");
    final static String string9 = internS(":-");
    final static String string10 = internS("eliminate_disjunction_clause");
    final static String string11 = internS("->");
    final static String string12 = internS(",");
    final static String string13 = internS("!");
    final static String string14 = internS("+");
    final static NumberTerm posint1 = Integer(1);
}

public class pred_eliminate_disjunction_8 extends Code {
    private final pred_eliminate_disjunction_8_consts consts;

    public pred_eliminate_disjunction_8() {
        consts = new pred_eliminate_disjunction_8_consts();
        initAlternatives();
    }

    protected pred_eliminate_disjunction_8(pred_eliminate_disjunction_8 c) {
        consts = c.getConsts();
        ALT = null;
    }

    protected final pred_eliminate_disjunction_8_consts getConsts() {
        return consts;
    }

    private Alternatives ALT = new Alternatives();

    private void initAlternatives() {
        ALT.disable();
        ALT.addAlternative(new pred_eliminate_disjunction_8_1(this));
        ALT.addAlternative(new pred_eliminate_disjunction_8_2(this));
        ALT.addAlternative(new pred_eliminate_disjunction_8_3(this));
        ALT.addAlternative(new pred_eliminate_disjunction_8_4(this));

    }

    @Override
    public void init(PredikatenPrologMachine mach) {
        consts.entry_code = this;
    }

    @Override
    public int arity() {
        return 8;
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(9);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
        mach.fillAlternatives(todo);
        return todo.next().exec(mach);

    }
}

class pred_eliminate_disjunction_8_1 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_1(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var10 = new DummyVar();

        final Term var9 = new DummyVar();

        final Term var8 = new DummyVar();

        final Term var7 = new DummyVar();

        final Term var6 = new DummyVar();

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_eliminate_disjunction_8_consts.string12, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        final Term arg3 = var5;
        final Term arg4 = var6;

        final Term arg5 = S(pred_eliminate_disjunction_8_consts.string12, var7, var8);
        final Term arg6 = var9;
        final Term arg7 = var10;
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 8);
        final Term areg7 = local_aregs[7].dref();
        final Term areg6 = local_aregs[6].dref();
        final Term areg5 = local_aregs[5].dref();
        final Term areg4 = local_aregs[4].dref();
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var14 = Jv(mach);
        final Term var13 = Jv(mach);
        final Term var12 = Jv(mach);
        final Term var11 = Jv(mach);
        final Term var10 = Jv(mach);
        final Term var9 = Jv(mach);
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_eliminate_disjunction_8_consts.string12, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unifyJP(var5.dref())))
            return mach.Fail0;
        if (!(areg4.unifyJP(var6.dref())))
            return mach.Fail0;

        if (!(areg5.unifyJP(S(pred_eliminate_disjunction_8_consts.string12, var7.dref(), var8.dref()))))
            return mach.Fail0;
        if (!(areg6.unifyJP(var9.dref())))
            return mach.Fail0;
        if (!(areg7.unifyJP(var10.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_eliminate_disjunction_8_consts.string5, S(pred_eliminate_disjunction_8_consts.string14, var4
                .dref(), var2.dref()), var11, S(pred_eliminate_disjunction_8_consts.string1, var1.dref(), var3
                        .dref(), var11.dref(), var5.dref(), var12, var7.dref(), var9
                                .dref(), var13, S(pred_eliminate_disjunction_8_consts.string5, S(pred_eliminate_disjunction_8_consts.string14, var4
                                        .dref(), var1
                                                .dref()), var14, S(pred_eliminate_disjunction_8_consts.string1, var2
                                                        .dref(), var3.dref(), var14.dref(), var12.dref(), var6
                                                                .dref(), var8.dref(), var13
                                                                        .dref(), var10.dref(), continuation)))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 8, 2);
        return mach.getCall1();
    }
}

class pred_eliminate_disjunction_8_2 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_2(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var10 = new DummyVar();

        final Term var9 = new DummyVar();

        final Term var8 = new DummyVar();

        final Term var7 = new DummyVar();

        final Term var6 = new DummyVar();

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_eliminate_disjunction_8_consts.string3, S(pred_eliminate_disjunction_8_consts.string11, var1, var2), var3);
        final Term arg1 = var4;
        final Term arg2 = var5;
        final Term arg3 = var6;
        final Term arg4 = var7;
        final Term arg5 = var8;
        final Term arg6 = var9;
        final Term arg7 = var10;
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 8);
        final Term areg7 = local_aregs[7].dref();
        final Term areg6 = local_aregs[6].dref();
        final Term areg5 = local_aregs[5].dref();
        final Term areg4 = local_aregs[4].dref();
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var17 = Jv(mach);
        final Term var16 = Jv(mach);
        final Term var15 = Jv(mach);
        final Term var14 = Jv(mach);
        final Term var13 = Jv(mach);
        final Term var12 = Jv(mach);
        final Term var11 = Jv(mach);
        final Term var10 = Jv(mach);
        final Term var9 = Jv(mach);
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0
                .unifyJP(S(pred_eliminate_disjunction_8_consts.string3, S(pred_eliminate_disjunction_8_consts.string11, var1
                        .dref(), var2.dref()), var3.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var5.dref())))
            return mach.Fail0;
        if (!(areg3.unifyJP(var6.dref())))
            return mach.Fail0;
        if (!(areg4.unifyJP(var7.dref())))
            return mach.Fail0;
        if (!(areg5.unifyJP(var8.dref())))
            return mach.Fail0;
        if (!(areg6.unifyJP(var9.dref())))
            return mach.Fail0;
        if (!(areg7.unifyJP(var10.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 0, S(pred_eliminate_disjunction_8_consts.string5, S(pred_eliminate_disjunction_8_consts.string3, S(pred_eliminate_disjunction_8_consts.string11, var1
                .dref(), var2.dref()), var3.dref()), var11, S(pred_eliminate_disjunction_8_consts.string6, var11
                        .dref(), var5.dref(), var12, S(pred_eliminate_disjunction_8_consts.string7, var4.dref(), var12
                                .dref(), var6.dref(), var13, var8
                                        .dref(), S(pred_eliminate_disjunction_8_consts.string8, S(pred_eliminate_disjunction_8_consts.string9, var8
                                                .dref(), S(pred_eliminate_disjunction_8_consts.string12, var1
                                                        .dref(), S(pred_eliminate_disjunction_8_consts.string12, CONST(pred_eliminate_disjunction_8_consts.string13), var2
                                                                .dref()))), var14, S(pred_eliminate_disjunction_8_consts.string10, var14
                                                                        .dref(), var13.dref(), var15, var9
                                                                                .dref(), var16, S(pred_eliminate_disjunction_8_consts.string8, S(pred_eliminate_disjunction_8_consts.string9, var8
                                                                                        .dref(), var3
                                                                                                .dref()), var17, S(pred_eliminate_disjunction_8_consts.string10, var17
                                                                                                        .dref(), var15
                                                                                                                .dref(), var7
                                                                                                                        .dref(), var16
                                                                                                                                .dref(), var10
                                                                                                                                        .dref(), continuation))))))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 8, 2);
        return mach.getCall1();
    }
}

class pred_eliminate_disjunction_8_3 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_3(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var9 = new DummyVar();

        final Term var8 = new DummyVar();

        final Term var7 = new DummyVar();

        final Term var6 = new DummyVar();

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_eliminate_disjunction_8_consts.string3, var1, var2);
        final Term arg1 = var3;
        final Term arg2 = var4;
        final Term arg3 = var5;
        final Term arg4 = var6;
        final Term arg5 = var7;
        final Term arg6 = var8;
        final Term arg7 = var9;
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 8);
        final Term areg7 = local_aregs[7].dref();
        final Term areg6 = local_aregs[6].dref();
        final Term areg5 = local_aregs[5].dref();
        final Term areg4 = local_aregs[4].dref();
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var16 = Jv(mach);
        final Term var15 = Jv(mach);
        final Term var14 = Jv(mach);
        final Term var13 = Jv(mach);
        final Term var12 = Jv(mach);
        final Term var11 = Jv(mach);
        final Term var10 = Jv(mach);
        final Term var9 = Jv(mach);
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);

        if (!(areg0.unifyJP(S(pred_eliminate_disjunction_8_consts.string3, var1.dref(), var2.dref()))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var3.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg3.unifyJP(var5.dref())))
            return mach.Fail0;
        if (!(areg4.unifyJP(var6.dref())))
            return mach.Fail0;
        if (!(areg5.unifyJP(var7.dref())))
            return mach.Fail0;
        if (!(areg6.unifyJP(var8.dref())))
            return mach.Fail0;
        if (!(areg7.unifyJP(var9.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs,0, S(pred_eliminate_disjunction_8_consts.string5, S(pred_eliminate_disjunction_8_consts.string3, var1
                .dref(), var2.dref()), var10, S(pred_eliminate_disjunction_8_consts.string6, var10.dref(), var4
                        .dref(), var11, S(pred_eliminate_disjunction_8_consts.string7, var3.dref(), var11.dref(), var5
                                .dref(), var12, var7
                                        .dref(), S(pred_eliminate_disjunction_8_consts.string8, S(pred_eliminate_disjunction_8_consts.string9, var7
                                                .dref(), var1
                                                        .dref()), var13, S(pred_eliminate_disjunction_8_consts.string10, var13
                                                                .dref(), var12.dref(), var14, var8
                                                                        .dref(), var15, S(pred_eliminate_disjunction_8_consts.string8, S(pred_eliminate_disjunction_8_consts.string9, var7
                                                                                .dref(), var2
                                                                                        .dref()), var16, S(pred_eliminate_disjunction_8_consts.string10, var16
                                                                                                .dref(), var14
                                                                                                        .dref(), var6
                                                                                                                .dref(), var15
                                                                                                                        .dref(), var9
                                                                                                                                .dref(), continuation))))))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 8, 2);
        return mach.getCall1();
    }
}

class pred_eliminate_disjunction_8_4 extends pred_eliminate_disjunction_8 {
    pred_eliminate_disjunction_8_4(pred_eliminate_disjunction_8 consts) {
        super(consts);
    }

    @Override
    @SuppressWarnings("static-access")
    protected Term[] getArgs() {

        final Term var5 = new DummyVar();

        final Term var4 = new DummyVar();

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();
        final Term arg0 = var1;
        final Term arg1 = var2;
        final Term arg2 = var3;
        final Term arg3 = var4;
        final Term arg4 = var4.dref();
        final Term arg5 = var1.dref();
        final Term arg6 = var5;
        final Term arg7 = var5.dref();
        return new Term[] { arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7 };
    }

    @Override
    @SuppressWarnings("static-access")
    public Code exec(PrologMachine mach) {
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 8);
        final Term areg7 = local_aregs[7].dref();
        final Term areg6 = local_aregs[6].dref();
        final Term areg5 = local_aregs[5].dref();
        final Term areg4 = local_aregs[4].dref();
        final Term areg3 = local_aregs[3].dref();
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
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
        if (!(areg3.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg4.unifyJP(var4.dref())))
            return mach.Fail0;
        if (!(areg5.unifyJP(var1.dref())))
            return mach.Fail0;
        if (!(areg6.unifyJP(var5.dref())))
            return mach.Fail0;
        if (!(areg7.unifyJP(var5.dref())))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 8, 1);
        return mach.getCall1();
    }
}
