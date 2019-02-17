package SxxMachine;

public interface Atomic extends Nonvar {

    int type();

    int arityOrType();

    /**
     * Adds a string representation of this <code>SystemObject</code> to given
     * StringBuilder instance
     */
    void toStringImpl(int printFlags, StringBuilder sb);

    boolean isImmutable();

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

    boolean equalsTerm(Term obj, OpVisitor comparator);

    String pprint() throws PrologException;

}