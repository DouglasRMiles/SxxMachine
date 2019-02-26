
package SxxMachine;

public final class FrozenVar extends VarTerm implements UnTrailOperation {

    private Term Refers;
    //private long timestamp;
    private final PrologMachine mach;
    private Term goals;

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

    public Term getGoals() {
        return goals;
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        return Const.NIL; // might decide to copy frozenvars
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
        return "_" + Integer.toHexString(termHashCode());
    }

    @Override
    public boolean bind(Term that) {
        System.out.println("FrozenVar.Bind");
        if (that instanceof FrozenVar) {
            FrozenVar thatv = (FrozenVar) that;
            AFunct newgoals = JpFactory.S(Const.strIntern(","), this.goals, thatv.goals);
            FrozenVar newfrv = new FrozenVar(mach, mach.getCurrentChoice(), newgoals);
            this.Refers = thatv.Refers = newfrv;
            mach.trailEntry(this);
            mach.trailEntry(thatv);
        } else if (that instanceof JpVar) {
            return that.bind(this);
        } else {
            this.Refers = that;
            mach.trailEntry(this);
            mach.trailEntry(new PopPendingGoals(mach, mach.getPendinggoals()));
            mach.setPendinggoals(JpFactory.S(Const.strIntern("."), goals, mach.getPendinggoals()));
            mach.setExceptionState(ErrorStatus.CHANGEDPENDINGGOALS);
        }
        return true;
    }

    @Override
    public boolean unify(Term that) {
        return bind(that);
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
        return toString();
    }

    @Override
    public boolean isVariable() {
        return true;
    }
}
