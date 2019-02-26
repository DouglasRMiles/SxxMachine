
package SxxMachine;

/**
  *  @author  toms
  *
  */
public final class AttributedVariable extends VarTerm implements UnTrailOperation {

    private Term refers = null;
    //private long timestamp;
    private final RunningPrologMachine mach;
    private final Term attribute;

    public AttributedVariable(RunningPrologMachine machine, Term attr) {
        //timestamp = machine.getTimestamp();
        mach = machine;
        attribute = attr;
    }

    AttributedVariable(RunningPrologMachine machine, long t, Term attr) {
        //timestamp = t;
        mach = machine;
        attribute = attr;
    }

    Term getAttr() {
        return attribute;
    }

    void setRefers(Term o) {
        refers = o;
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        return new AttributedVariable(m, t, attribute.copy(m, t));
    }

    @Override
    public Term dref() {
        if (refers == null) {
            return this;
        } else {
            return refers.dref();
        }
    }

    @Override
    public void unTrailSelf() {
        refers = null;
    }

    @Override
    public String toStringImpl(int depth) {
        return "_" + Integer.toHexString(termHashCode()) + "{...}";
    }

    @Override
    public boolean bind(Term that) {
        System.out.println("AttributedVariable.Bind");
        if (this.equals(that))
            return true;
        if (that instanceof JpVar) {
            return that.bind(this);
        } else {
            System.out.println("bind('" + this + "','" + that + "').");
            this.refers = that;
            mach.trailEntry(this);
            mach.trailEntry(new PopPendingGoals(mach, mach.getPendinggoals()));
            // Goals <- [attr_unify_hook(Attribute,That)|Goals]
            mach.setPendinggoals(JpFactory.S(Const.strIntern("."), JpFactory
                    .S(Const.strIntern("attr_unify_hook"), this.attribute, that), mach.getPendinggoals()));
            mach.setExceptionState(ErrorStatus.CHANGEDPENDINGGOALS);
            System.out.println("<TRIGGER>");
        }
        return true;
    }

    @Override
    public boolean unify(Term that) {
        System.out.println("Unify: " + this + " = " + that);
        return this.dref().bind(that.dref());
    }

    @Override
    public boolean equalsTerm(Term that) {
        if (!(that instanceof AttributedVariable)) {
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
