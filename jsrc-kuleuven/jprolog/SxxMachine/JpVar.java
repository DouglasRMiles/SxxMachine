
package SxxMachine;

public final class JpVar extends AbstractVar implements Term {

    protected final RunningPrologMachine machin;
    //public Term Refers;

    JpVar(RunningPrologMachine machine) {
        machin = machine;
        Refers = this;
        timestampJP = machin.getTimestamp();
    }

    public JpVar(MiniJProlog machin) {
        this.machin = null;
        Refers = this;
        timestampJP = machin.getTimestamp();
        mach = machin;
    }

    private JpVar(MiniJProlog machin, long t) {
        this.machin = null;
        Refers = this;
        timestampJP = t;
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
            if (timestampJP < v1.timestampJP) {
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
