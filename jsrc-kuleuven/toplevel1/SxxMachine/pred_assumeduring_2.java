
package SxxMachine;

// Integer;
// Jv;
// S;
// internS;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_assumeduring_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_assumeduring_2_1();

    static Code assume2cont;

    static String string0 = internS("cut");

    static String string1 = internS("-");

    static String string2 = internS("assume");

    static String string3 = internS("assumeduring");

    static String string4 = internS("exec");

    static String string5 = internS("unify");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        assume2cont = mach.loadPred("assume", 1);
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

class pred_assumeduring_2_1 extends pred_assumeduring_2 {
    @Override
    public Code exec(PrologMachine mach) {
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term var3 = Jv(mach);
        final Term var2 = Jv(mach);
        final Term var1 = Jv(mach);
        if (!((areg0).unifyJP(var1)))
            return mach.Fail0;
        if (!((areg1).unifyJP(var2)))
            return mach.Fail0;
        local_aregs[0] = S(string1, var2.dref(), var3);
        mach.setCont(local_aregs, 1, S(string4, var1.dref(), S(string5, posint1, var3.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return assume2cont;
    }
}
