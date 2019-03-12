
package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;

import SxxMachine.pterm.TermData;

final class FrozenVar extends AbstractVar implements UnTrailOperation {

    private Term Refers;
    //private long timestamp;
    private final PrologMachine mach;
    private final Term goals;

    public FrozenVar(PrologMachine machin, Term action) {
        Refers = null;
        //timestamp = machin.getTimestamp();
        mach = machin;
        goals = action;
    }

    public FrozenVar(PrologMachine machin, long t, Term action) {
        Refers = null;
        //timestamp = t;
        mach = machin;
        goals = action;
    }

    @Override
    public Term getGoals() {
        return goals;
    }

    @Override
    public Term copyJP(RunningPrologMachine m, long t) {
        return Prolog.Nil; // might decide to copy frozenvars
        // later
    }

    @Override
    public Term dref() {
        if (Refers == null)
            return this;
        return Refers.dref();
    }

    @Override
    public void unTrailSelf() {
        Refers = null;
    }

    @Override
    public String toStringImpl(int depth) {
        return "_" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean bindJP(Term that) {
        System.out.println("FrozenVar.Bind");
        if (that instanceof FrozenVar) {
            final FrozenVar thatv = (FrozenVar) that;
            final AFunct newgoals = (AFunct) TermData.AND(goals, thatv.goals);
            final FrozenVar newfrv = new FrozenVar(mach, mach.getCurrentChoice(), newgoals);
            Refers = thatv.Refers = newfrv;
            mach.trailEntry(this);
            mach.trailEntry(thatv);
        } else if (that instanceof JpVar) {
            return that.bindJP(this);
        } else {
            Refers = that;
            mach.trailEntry(this);
            mach.trailEntry(new PopPendingGoals(mach, mach.getPendinggoals()));
            mach.setPendinggoals(CONS(goals, mach.getPendinggoals()));
            mach.setExceptionState(ErrorStatus.CHANGEDPENDINGGOALS);
        }
        return true;
    }

    @Override
    public boolean unifyJP(Term that) {
        return bindJP(that);
    }

    @Override
    public boolean equalsTerm(Term that) {
        if (!(that instanceof FrozenVar)) {
            return false;
        }
        return this == that;
    }

    @Override
    public String fname() {
        return portrayTerm();
    }

    @Override
    public boolean isVariable() {
        return true;
    }
}
