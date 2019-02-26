
package SxxMachine;

public final class PopPendingGoals implements UnTrailOperation {
    private final RunningPrologMachine mach;
    private final Term old;

    public PopPendingGoals(RunningPrologMachine m, Term o) {
        mach = m;
        old = o;
    }

    @Override
    public void unTrailSelf() {
        mach.setPendinggoals(old);
    }

}
