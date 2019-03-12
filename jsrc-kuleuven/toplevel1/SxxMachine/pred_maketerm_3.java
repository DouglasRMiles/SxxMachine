
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

import SxxMachine.pterm.StructureTerm;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_maketerm_3 extends Code {

    static Code entry_code;

    final static Code cl1 = new pred_maketerm_3_1();

    final static Code cl2 = new pred_maketerm_3_2();

    final static Code cl3 = new pred_maketerm_3_3();

    final static Code cl3b = new pred_maketerm_3_3b();

    final static Code cl4 = new pred_maketerm_3_4();

    //  static Code cl5 = new pred_maketerm_3_5();
    //
    //  static Code cl6 = new pred_maketerm_3_6();
    //
    //  static Code cl7 = new pred_maketerm_3_7();
    //
    //  static Code cl8 = new pred_maketerm_3_8();
    //
    //  static Code cl9 = new pred_maketerm_3_9();
    //
    //  static Code cl10 = new pred_maketerm_3_10();
    //
    //  static Code cl11 = new pred_maketerm_3_11();

    final static Code cl5 = new pred_maketerm_3_6();

    final static Code cl6 = new pred_maketerm_3_7();

    final static Code cl7 = new pred_maketerm_3_8();

    final static Code cl8 = new pred_maketerm_3_9();

    final static Code cl9 = new pred_maketerm_3_10();

    final static Code cl10 = new pred_maketerm_3_11();

    final static Code cl11 = new pred_maketerm_3_5();

    static Code ap4cont;

    static Code cut2cont;

    static Code getargs3cont;

    static Code prefix4cont;

    static Code unify3cont;

    final static String string0 = internS("cut");

    final static String string1 = internS("(");

    final static String string2 = internS(")");

    final static String string3 = internS(",");

    final static String string4 = internS(".");

    final static String string5 = internS("[");

    final static String string6 = internS("[]");

    final static String string7 = internS("]");

    final static String string8 = internS("ap");

    final static String string9 = internS("call");

    final static String string10 = internS("const");
    static final String String23 = internS("constant");
    final static String string11 = internS("cut");

    final static String string12 = internS("getargs");

    final static String string13 = internS("infix");

    final static String string14 = internS("int");

    final static String string15 = internS("maketerm");

    final static String string16 = internS("newprec");

    final static String string17 = internS("prefix");

    final static String string18 = internS("smallerorequal");

    final static String string19 = internS("unify");

    final static String string20 = internS("univ");

    final static String string21 = internS("var");

    final static String string22 = internS("|");

    final static NumberTerm posint1 = Integer(1);

    final static NumberTerm posint900 = Integer(900);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        ap4cont = mach.loadPred("ap", 3);
        getargs3cont = mach.loadPred("getargs", 2);
        prefix4cont = mach.loadPred("prefix", 3);
        unify3cont = mach.loadPred("unify", 2);
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(4);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }

    protected boolean endsWith(Term areg0, String token) {
        areg0 = areg0.dref();
        if (!areg0.isCons())
            return false;
        StructureTerm list = (StructureTerm) areg0;
        while (list.getPlainArg(1).dref().isCons())
            list = (StructureTerm) list.getPlainArg(1).dref();
        if (!list.getPlainArg(0).dref().equalsTerm(S("const", CONST(token))))
            return false;
        return true;
    }
}

class pred_maketerm_3_1 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string21, var1, var2, var3), CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var4)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var5)))
            return mach.Fail0;
        local_aregs[0] = var1.dref();
        local_aregs[1] = var4.dref();
        local_aregs[2] = S(string0, new HeapChoice(mach.getCUTB()), continuation);
        mach.updateCUTB();
        local_aregs[3] = null;
        return unify3cont;
    }
}

class pred_maketerm_3_2 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string14, var1), CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string19, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maketerm_3_3b extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl4);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(String23, var1), CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string19, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maketerm_3_3 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3b);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, var1), CONST(string6)))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        local_aregs[0] = S(string19, var1.dref(), var2.dref(), continuation);
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = null;
        return mach.Call1;
    }
}

class pred_maketerm_3_4 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl5);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, var1), S(string4, S(string10, CONST(string1)), var2)))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var3)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var4)))
            return mach.Fail0;
        //areg0 moet eindigen op ')' anders al niet correct
        if (!endsWith(areg0, ")"))
            return mach.Fail0;
        local_aregs[0] = var2.dref();
        local_aregs[1] = var5;
        local_aregs[2] = S(string20, var3.dref(), var1.dref(), var5
                .dref(), S(string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        local_aregs[3] = null;
        return getargs3cont;
    }
}

class pred_maketerm_3_5 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl6);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
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
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        var4.unifyJP(S(".", Jv(mach), Jv(mach)));
        local_aregs[0] = var4;
        local_aregs[1] = S(string4, S(string10, var5), var6);
        local_aregs[2] = var1.dref();
        local_aregs[3] = S(string13, var7, var8, var5.dref(), S(string18, var7.dref(), var3
                .dref(), S(string16, var8.dref(), var7.dref(), var9, var10, S(string15, var4.dref(), var11, var9
                        .dref(), S(string15, var6.dref(), var12, var10
                                .dref(), S(string20, var2.dref(), var5.dref(), S(string4, var11
                                        .dref(), S(string4, var12.dref(), CONST(string6))), S(string0, new HeapChoice(
                                                mach.getCUTB()), continuation)))))));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_6 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl7);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var8 = Jv(mach);
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, var1), var2))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var3)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = var6;
        local_aregs[2] = var1.dref();
        local_aregs[3] = S(string18, var5.dref(), var4
                .dref(), S(string16, var6.dref(), var5.dref(), var7, S(string15, var2.dref(), var8, var7
                        .dref(), S(string20, var3.dref(), var1.dref(), S(string4, var8
                                .dref(), CONST(string6)), S(string0, new HeapChoice(mach.getCUTB()), continuation)))));
        mach.updateCUTB();
        return prefix4cont;
    }
}

class pred_maketerm_3_7 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl8);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, CONST(string5)), var1))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string4, var2, var3))))
            return mach.Fail0;
        if (!((areg2).unifyJP(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = S(string4, S(string10, CONST(string3)), var6);
        if (!endsWith(var1, "]"))
            return mach.Fail0;
        local_aregs[2] = var1.dref();
        local_aregs[3] = S(string15, var5.dref(), var2
                .dref(), posint900, S(string15, S(string4, S(string10, CONST(string5)), var6.dref()), var3
                        .dref(), posint900, S(string0, new HeapChoice(mach.getCUTB()), continuation)));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_8 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl9);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var7 = Jv(mach);
        final Term var6 = Jv(mach);
        final Term var5 = Jv(mach);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, CONST(string5)), var1))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string4, var2, var3))))
            return mach.Fail0;
        if (!((areg2).unifyJP(var4)))
            return mach.Fail0;
        local_aregs[0] = var5;
        local_aregs[1] = S(string4, S(string10, CONST(string22)), var6);
        local_aregs[2] = var1.dref();
        local_aregs[3] = S(string8, var7, S(string4, S(string10, CONST(string7)), CONST(string6)), var6
                .dref(), S(string15, var5.dref(), var2.dref(), posint900, S(string15, var7.dref(), var3
                        .dref(), posint900, S(string0, new HeapChoice(mach.getCUTB()), continuation))));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_9 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl10);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, CONST(string1)), var1))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        local_aregs[0] = var4;
        local_aregs[1] = S(string4, S(string10, CONST(string2)), CONST(string6));
        local_aregs[2] = var1.dref();
        local_aregs[3] = S(string0, new HeapChoice(
                mach.getCUTB()), S(string15, var4.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_10 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl11);
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string4, S(string10, CONST(string5)), var1))))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string4, var2, CONST(string6)))))
            return mach.Fail0;
        if (!((areg2).unifyJP(var3)))
            return mach.Fail0;
        local_aregs[0] = var4;
        local_aregs[1] = S(string4, S(string10, CONST(string7)), CONST(string6));
        local_aregs[2] = var1.dref();
        local_aregs[3] = S(string15, var4.dref(), var2
                .dref(), posint900, S(string0, new HeapChoice(mach.getCUTB()), continuation));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_maketerm_3_11 extends pred_maketerm_3 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = local_aregs[3];
        final Term areg2 = local_aregs[2].dref();
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var1 = Jv(mach);
        if (!((areg0)
                .unifyJP(S(string4, S(string10, CONST(string5)), S(string4, S(string10, CONST(string7)), CONST(string6))))))
            return mach.Fail0;
        if (!((areg1).unifyJP(CONST(string6))))
            return mach.Fail0;
        if (!((areg2).unifyJP(var1)))
            return mach.Fail0;
        local_aregs[0] = continuation;
        mach.updateCUTB();
        local_aregs[3] = local_aregs[2] = local_aregs[1] = null;
        return mach.Call1;
    }
}
