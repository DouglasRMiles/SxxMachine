package SxxMachine.pterm;

import SxxMachine.OpVisitor;
import SxxMachine.PrologException;
import SxxMachine.Term;

abstract class AtomicConst extends Nonvar {
    @Override
    abstract public int type();

    @Override
    public int arityOrType() {
        return type();
    }

    /**
     * Adds a string representation of this <code>SystemObject</code> to given
     * StringBuilder instance
     */
    @Override
    public void toStringImpl(int printFlags, StringBuilder sb) {
        sb.append(pprint());
    }

    @Override
    public boolean isImmutable() {
        return true;
    }

    /**
     * Checks <em>term equality</em> of two terms. The result is <code>true</code>
     * if and only if the argument is an instance of <code>SystemObject</code>, and
     * the pairs of goals in the two closures are <em>equal</em>.
     * 
     * @param obj
     *            the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a closure equivalent
     *         to this <code>SystemObject</code>, false otherwise.
     * @see #compareTo
     */

    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return equalsIdentical(obj);
    }

    @Override
    public String pprint() throws PrologException {
        return fname();
    }

}
