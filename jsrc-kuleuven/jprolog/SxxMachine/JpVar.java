
package SxxMachine;

public final class JpVar extends AbstractVar implements UnTrailOperation {

    public Term Refers;

    long timestamp;

    private RunStackItem mach;
    private final RunningPrologMachine machin;

    JpVar(RunningPrologMachine machine) {
        machin = machine;
        Refers = this;
        timestamp = machin.getTimestamp();
    }

    //    public JpVar(RunStackItem machin) {
    //        this.machin = null;
    //        Refers = this;
    //        timestamp = machin.getTimestamp();
    //        mach = machin;
    //    }

    private JpVar(RunStackItem machin, long t) {
        this.machin = null;
        Refers = this;
        timestamp = t;
        mach = machin;
    }

    private RunStackItem getStack() {
        if (mach == null)
            mach = machin.getCurrentStackItem();
        return mach;
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        JpVar newv = new JpVar(m.getCurrentStackItem(), t);
        VarDict newdict = new VarDict(this, newv);
        Refers = newdict;
        getStack().trailEntry(this);
        return newv;
    }

    @Override
    public Term dref() {
        if (Refers == this)
            return this;
        return Refers.dref();
    }

    @Override
    public void unTrailSelf() {
        Refers = this;
    }

    @Override
    public boolean bind(Term that) {
        if (this == that) {
            return true;
        }
        JpVar v2;
        if (that instanceof JpVar) {
            JpVar v1 = (JpVar) that;
            if (timestamp < v1.timestamp) {
                v1.Refers = this;
                v2 = v1;
            } else {
                Refers = that;
                v2 = this;
            }
        } else {
            this.Refers = that;
            v2 = this;
        }
        //if (v2.timestamp < mach.getCurrentChoiceTimeStamp()) {
        getStack().trailEntry(v2);
        //}
        return true;
    }

}
