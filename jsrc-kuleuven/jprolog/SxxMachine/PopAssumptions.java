
package SxxMachine;

public final class PopAssumptions implements UnTrailOperation {

    private final PrologMachine mach;
    private final Term old;

    PopAssumptions(PrologMachine m, Term o) {
        mach = m;
        old = o;
    }

    @Override
    public void unTrailSelf() {
        mach.setAssumptions(old);
    }

}
