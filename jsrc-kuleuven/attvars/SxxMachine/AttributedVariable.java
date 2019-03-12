
package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;

import SxxMachine.pterm.TermData;
import SxxMachine.pterm.VariableTerm;

/**
  *  @author  toms
  *
  */
public final class AttributedVariable extends VariableTerm implements UnTrailOperation {

    private Term val = null;
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
        val = o;
    }

    @Override
    public Term copyJP(RunningPrologMachine m, long t) {
        return new AttributedVariable(m, t, attribute.copyJP(m, t));
    }

    @Override
    public Term dref() {
        if (val == null) {
            return this;
        } else {
            return val.dref();
        }
    }

    @Override
    public void unTrailSelf() {
        val = null;
    }

    @Override
    public String toStringImpl(int depth) {
        return "_" + Integer.toHexString(hashCode()) + "{...}";
    }

    @Override
    public boolean bindJP(Term that) {
        System.out.println("AttributedVariable.Bind");
        if (equals(that))
            return true;
        if (that instanceof JpVar) {
            return that.bindJP(this);
        } else {
            System.out.println("bind('" + this + "','" + that + "').");
            val = that;
            mach.trailEntry(this);
            mach.trailEntry(new PopPendingGoals(mach, mach.getPendinggoals()));
            // Goals <- [attr_unify_hook(Attribute,That)|Goals]
            mach.setPendinggoals(CONS(TermData.S(("attr_unify_hook"), attribute, that), mach.getPendinggoals()));
            mach.setExceptionState(ErrorStatus.CHANGEDPENDINGGOALS);
            System.out.println("<TRIGGER>");
        }
        return true;
    }

    @Override
    public boolean unifyJP(Term that) {
        System.out.println("Unify: " + this + " = " + that);
        return dref().bindJP(that.dref());
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
        return portrayTerm();
    }

    @Override
    public boolean isVariable() {
        return true;
    }

}
