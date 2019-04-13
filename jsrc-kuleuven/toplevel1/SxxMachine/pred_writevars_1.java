
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.Jv;
import static SxxMachine.pterm.TermData.S;
import static SxxMachine.pterm.TermData.internS;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_writevars_1 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_writevars_1_1();

    static Code cl2 = new pred_writevars_1_2();

    static Code cl3 = new pred_writevars_1_3();

    static Code write2cont;

    static String string0 = internS("cut");

    static String string1 = internS(" = ");

    static String string2 = internS(".");

    static String string3 = internS("=");

    static String string4 = internS("[]");

    static String string5 = internS("call");

    static String string6 = internS("fail");

    static String string7 = internS("nl");

    static String string8 = internS("write");

    static String string9 = internS("writevars");

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        write2cont = mach.loadPred("write", 1);
    }

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term aregs[] = mach.createAregCopy(2);
        mach.createChoicePoint(aregs);
        return cl1.exec(mach);
    }
}

class pred_writevars_1_1 extends pred_writevars_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl2);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        if (!((areg0).unifyJP(CONST(string4))))
            return mach.Fail0;
        mach.setCont(local_aregs, 0, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 1);
        return mach.getCall1();
    }
}

class pred_writevars_1_2 extends pred_writevars_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.fillAlternative(cl3);
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string2, S(string3, var1, var2), var3))))
            return mach.Fail0;
        local_aregs.setAreg0((var2.dref()));
        mach.setCont(local_aregs, 1, S(string8, CONST(string1), S(string8, var1
                .dref(), S(string7, S(string6, continuation)))));
        mach.updateCUTB();
        return write2cont;
    }
}

class pred_writevars_1_3 extends pred_writevars_1 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final TermArray local_aregs = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 1);
        final Term areg0 = local_aregs.getTermDRef(0);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(S(string2, var1, var2))))
            return mach.Fail0;
        local_aregs.setAreg0((var2.dref()));
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        return entry_code;
    }
}
