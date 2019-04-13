
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Integer;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_readall_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_readall_2_1();

    static Code cl2 = new pred_readall_2_2();

    static Code cl3 = new pred_readall_2_3();

    static Code cut2cont;

    static Code nexttoken2cont;

    static String string0 = internS("cut");

    static String string1 = internS(".");

    static String string2 = internS("[]");

    static String string3 = internS("cut");

    static String string4 = internS("end_of_clause");

    static String string5 = internS("end_of_file");

    static String string7 = internS("nexttoken");

    static String string8 = internS("readall");

    static String string9 = internS("unify");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        nexttoken2cont = mach.loadPred("nexttoken", 1);
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

class pred_readall_2_1 extends pred_readall_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        //PrologObject areg1 = local_aregs.a(1).v.Deref();
        final Term areg0 = local_aregs.getTermDRef(0);
        //PrologObject var1 = new Var(mach);
        if (!((areg0).unifyJP(CONST(string5))))
            return mach.Fail0;
        //System.out.println("end_of_file at readall: (" + System.currentTimeMillis() + ") " + continuation);
        //if (!((areg1).Unify(var1)))
        //  return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_readall_2_2 extends pred_readall_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(CONST(string4))))
            return mach.Fail0;
        if (!((areg1).unifyJP(var1)))
            return mach.Fail0;
        mach.doCut(mach.getCUTB());
        mach.setCont(local_aregs, 0, S(string9, CONST(string2), var1.dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return mach.getCall1();
    }
}

class pred_readall_2_3 extends pred_readall_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs.getTermDRef(1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(S(string1, var1.dref(), var2))))
            return mach.Fail0;
        local_aregs.setAreg0((var3));
        mach.setCont(local_aregs, 1, S(string8, var3.dref(), var2.dref(), continuation));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return nexttoken2cont;
    }
}
