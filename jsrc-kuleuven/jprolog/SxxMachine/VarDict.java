
package SxxMachine;

final class VarDict extends JPrologObject implements UnTrailOperation {
    JpVar old, newer;

    VarDict(JpVar changed, JpVar copy) {
        old = changed;
        newer = copy;
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    public void unTrailSelf() {
        old.Refers = old;
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        return newer;
    }
}
