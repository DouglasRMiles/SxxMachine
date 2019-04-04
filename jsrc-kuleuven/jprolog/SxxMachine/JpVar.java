
package SxxMachine;

public final class JpVar extends AbstractVar {

    public Term Refers;

    long timestamp;

    private MiniJProlog mach;
    private final RunningPrologMachine machin;

    JpVar(RunningPrologMachine machine) {
        machin = machine;
        Refers = this;
        timestamp = machin.getTimestamp();
    }

    public JpVar(MiniJProlog machin) {
        this.machin = null;
        Refers = this;
        timestamp = machin.getTimestamp();
        mach = machin;
    }

    private JpVar(MiniJProlog machin, long t) {
        this.machin = null;
        Refers = this;
        timestamp = t;
        mach = machin;
    }

    private MiniJProlog getStack() {
        if (mach == null)
            mach = machin.getCurrentStackItem();
        return mach;
    }

    @Override
    public Term copyJP(RunningPrologMachine m, long t) {
        final JpVar newv = new JpVar(m.getCurrentStackItem(), t);
        final VarDict newdict = new VarDict(this, newv);
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
    public boolean bindJP(Term that) {
        if (this == that) {
            return true;
        }
        JpVar v2;
        if (that instanceof JpVar) {
            final JpVar v1 = (JpVar) that;
            if (timestamp < v1.timestamp) {
                v1.Refers = this;
                v2 = v1;
            } else {
                Refers = that;
                v2 = this;
            }
        } else {
            Refers = that;
            v2 = this;
        }
        //if (v2.timestamp < mach.getCurrentChoiceTimeStamp()) {
        getStack().trailEntry(v2);
        //}
        return true;
    }

}
