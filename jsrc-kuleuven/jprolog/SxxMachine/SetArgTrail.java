
package SxxMachine;

public final class SetArgTrail implements UnTrailOperation {
    private final Term oldValue;
    private final JpVar which;
    private final PrologMachine mach;

    SetArgTrail(Term old, JpVar changed, PrologMachine m) {
        oldValue = old;
        which = changed;
        mach = m;
    }

    @Override
    public void unTrailSelf() {
        which.Refers = oldValue;
        which.timestampJP = mach.getTimestamp();
    }

}
