
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_getargs_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_getargs_2_1();

    static Code cl2 = new pred_getargs_2_2();

    static Code ap4cont;

    static String string0 = internS("cut");

    static String string1 = internS(")");

    static String string2 = internS(",");

    static String string3 = internS(".");

    static String string4 = internS("[]");

    static String string5 = internS("ap");

    static String string6 = internS("const");

    static String string7 = internS("getargs");

    static String string8 = internS("maketerm");

    static String string9 = internS("unify");

    static NumberTerm posint900 = Integer(900);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        ap4cont = mach.loadPred("ap", 3);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(3);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_getargs_2_1 extends pred_getargs_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var4 = Jv(mach);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs.areg0 = (var3);
        local_aregs.areg1 = (S(string3, S(string6, CONST(string1)), CONST(string4)));
        local_aregs.areg2 = (var1.dref());
        local_aregs.areg3 = (S(string8, var3
                .dref(), var4, posint900, S(string9, S(string3, var4.dref(), CONST(string4)), var2
                        .dref(), continuation)));
        mach.updateCUTB();
        return ap4cont;
    }
}

class pred_getargs_2_2 extends pred_getargs_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
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
        local_aregs.areg0 = (var3);
        local_aregs.areg1 = (S(string3, S(string6, CONST(string2)), var4));
        local_aregs.areg2 = (var1.dref());
        mach.setCont(local_aregs, 3, S(string8, var3
                .dref(), var5, posint900, S(string9, S(string3, var5.dref(), var6), var2
                        .dref(), S(string7, var4.dref(), var6.dref(), continuation))));
        mach.updateCUTB();
        return ap4cont;
    }
}
