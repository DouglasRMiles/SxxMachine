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

class pred_printMainExec_3_consts {
    Code entry_code;
    Code writel2cont;
    Code cut2cont;
    final static String string0 = internS("cut");
    final static String string1 = internS("printMainExec");
    final static String string2 = internS("writel");
    final static String string3 = internS(".");
    final static String string4 = internS("     PrologObject aregs[] = mach.createAregCopy(");
    final static String string5 = internS(");");
    final static String string6 = internS("wr");
    final static String string7 = internS("nl");
    final static String string8 = internS("     mach.createChoicePoint(aregs) ;");
    final static String string9 = internS("     Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);");
    final static String string10 = internS("     mach.fillAlternatives(todo);");
    final static String string11 = internS("     return todo.next().exec(mach);");
    final static String string12 = internS("[]");
    final static String string13 = internS("cut");
    final static String string14 = internS("getPredHeader");
    final static String string15 = internS("functor");
    final static String string16 = internS("arg");
    final static String string17 = internS("continuation");
    final static String string18 = internS("unify");
    final static String string19 = internS("mynumbervars");
    final static String string20 = internS("printPredExecCode");
    final static NumberTerm posint1 = Integer(1);
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
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        final Iterator<Code> todo = ALT.getIndexedAlternatives(aregs);
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

        final Term var3 = new DummyVar();

        final Term var2 = new DummyVar();

        final Term var1 = new DummyVar();

        final Term arg0 = S(pred_printMainExec_3_consts.string3, var1, CONST(pred_printMainExec_3_consts.string12));
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

        if (!(areg0.unifyJP(S(pred_printMainExec_3_consts.string3, var1
                .dref(), CONST(pred_printMainExec_3_consts.string12)))))
            return mach.Fail0;
        if (!(areg1.unifyJP(var2.dref())))
            return mach.Fail0;
        if (!(areg2.unifyJP(var3.dref())))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());

        mach.setCont(local_aregs, 1, S(pred_printMainExec_3_consts.string14, var1
                .dref(), var4, var5, S(pred_printMainExec_3_consts.string15, var4.dref(), var6, var2
                        .dref(), S(pred_printMainExec_3_consts.string16, var2.dref(), var4
                                .dref(), S(pred_printMainExec_3_consts.string17, var2
                                        .dref()), S(pred_printMainExec_3_consts.string18, var1
                                                .dref(), var7, S(pred_printMainExec_3_consts.string14, var7
                                                        .dref(), var8, var9, S(pred_printMainExec_3_consts.string19, var7
                                                                .dref(), pred_printMainExec_3_consts.posint1, var10, S(pred_printMainExec_3_consts.string20, var2
                                                                        .dref(), var10.dref(), var8.dref(), var9
                                                                                .dref(), var3.dref(), var1.dref(), var6
                                                                                        .dref(), continuation))))))));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return mach.getCall1();
    }
}

class pred_printMainExec_3_2 extends pred_printMainExec_3 {
    pred_printMainExec_3_2(pred_printMainExec_3 consts) {
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

        local_aregs.setAV(0,S(pred_printMainExec_3_consts.string3, CONST(pred_printMainExec_3_consts.string4), S(pred_printMainExec_3_consts.string3, var2
                .dref(), S(pred_printMainExec_3_consts.string3, CONST(pred_printMainExec_3_consts.string5), S(pred_printMainExec_3_consts.string3, S(pred_printMainExec_3_consts.string6, CONST(pred_printMainExec_3_consts.string7)), S(pred_printMainExec_3_consts.string3, CONST(pred_printMainExec_3_consts.string8), S(pred_printMainExec_3_consts.string3, S(pred_printMainExec_3_consts.string6, CONST(pred_printMainExec_3_consts.string7)), S(pred_printMainExec_3_consts.string3, CONST(pred_printMainExec_3_consts.string9), S(pred_printMainExec_3_consts.string3, S(pred_printMainExec_3_consts.string6, CONST(pred_printMainExec_3_consts.string7)), S(pred_printMainExec_3_consts.string3, CONST(pred_printMainExec_3_consts.string10), S(pred_printMainExec_3_consts.string3, S(pred_printMainExec_3_consts.string6, CONST(pred_printMainExec_3_consts.string7)), S(pred_printMainExec_3_consts.string3, CONST(pred_printMainExec_3_consts.string11), S(pred_printMainExec_3_consts.string3, S(pred_printMainExec_3_consts.string6, CONST(pred_printMainExec_3_consts.string7)), CONST(pred_printMainExec_3_consts.string12))))))))))))));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 3, 2);
        return getConsts().writel2cont;
    }
}
