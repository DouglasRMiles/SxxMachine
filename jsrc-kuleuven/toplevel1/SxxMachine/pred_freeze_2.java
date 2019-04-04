
package SxxMachine;

// Integer;
import static SxxMachine.pterm.TermData.*;

// Generated java file - release 0.1 - do not edit !
// Copyright August 16, 1996, KUL and CUM
// Authors: Bart Demoen and Paul Tarau

public class pred_freeze_2 extends Code {
    static Code entry_code;

    static Code cl1 = new pred_freeze_2_1();

    static Code cl2 = new pred_freeze_2_2();

    static Code exec2cont;

    static Code var2cont;

    static String cut = internS("cut");

    static String exec = internS("exec");

    static String freeze = internS("freeze");

    static String freeze_internal = internS("freeze_internal");

    static String var = internS("var");

    static NumberTerm posint1 = Integer(1);

    @Override
    public void init(PredikatenPrologMachine mach) {
        entry_code = this;
        exec2cont = mach.loadPred("exec", 1);
        var2cont = mach.loadPred("var", 1);
    }

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        // store relevant machine registers in new choice point
        final Term aregs[] = mach.createAregCopy(3); // first argument
        // second argument
        // continuation
        mach.createChoicePoint(aregs);
        // continue with first clause
        return cl1.exec(mach);
    }
}

class pred_freeze_2_1 extends pred_freeze_2 {
    @Override
    public Code exec(PrologMachine mach) {
        System.out.println("Freezing...");
        // set retry (second clause)
        mach.fillAlternative(cl2);
        // fetch machine registers once
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term variable = Jv(mach);
        final Term goal = Jv(mach);
        // why these?
        if (!((areg0).unifyJP(variable)))
            return mach.Fail0;
        if (!((areg1).unifyJP(goal)))
            return mach.Fail0;
        local_aregs[0] = variable.dref();
        mach.setCont(local_aregs, 1, S(cut, new HeapChoice(
                mach.getCUTB()), S(freeze_internal, variable.dref(), goal.dref(), continuation)));
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return var2cont;
    }
}

class pred_freeze_2_2 extends pred_freeze_2 {
    @Override
    public Code exec(PrologMachine mach) {
        System.out.println("...freeze clause 2");
        mach.removeChoice();
        final Term local_aregs[] = mach.getAreg();
        final Term continuation = mach.getCont(local_aregs, 2);
        final Term areg1 = local_aregs[1].dref();
        final Term areg0 = local_aregs[0].dref();
        final Term goal = Jv(mach);
        final Term variable = Jv(mach);
        if (!((areg0).unifyJP(variable)))
            return mach.Fail0;
        if (!((areg1).unifyJP(goal)))
            return mach.Fail0;
        local_aregs[0] = goal.dref();
        mach.setCont(local_aregs, 1, continuation);
        mach.updateCUTB();
        mach.setARegENull(local_aregs, 2);
        return exec2cont;
    }
}
