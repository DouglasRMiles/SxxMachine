package SxxMachine;

import java.lang.reflect.Method;

public interface Functor extends NameArity, Atomic {

    int exec(Prog p);

    boolean isConst();

    boolean isTrueProc();

    String qname();

    Functor toClone() throws CloneNotSupportedException;

    boolean bind(Term that, KPTrail trail);

    String getKey();

    /**
     * returns an arity normally defined as 0
     * 
     * @see Term#CONST
     */
    int arityOrType();

    /**
     * creates a ConstBuiltin from a Const known to be registered as being a builtin
     * while returning its argument unchanged if it is just a plain Prolog constant
     * with no builtin code attached to it
     */

    String toUnquoted();

    int getIntArg(int i);

    int unifyArg(int i, Term a, Prog p);

    Term ArgNoDeRef(int i);

    int exec(Prog p, ISTerm thiz);

    void setMethod(Method b);

    int type();

    boolean isAtom();

    /**
     * Returns the arity of this <code>SymbolTerm</code>.
     * 
     * @return the value of <code>arity</code>.
     * @see #arity
     */
    int arity();

    /**
     * Returns the string representation of this <code>SymbolTerm</code>.
     * 
     * @return the value of <code>name</code>.
     * @see #name
     */
    String fname();

    int start();

    int finish();

    String base();

    /**
     * Creates and return new {@link Functor} instance that shares the name
     * string with this instance, but name of new instance is a substring of this
     * name starting from given beginIndex.
     * 
     * @param beginIndex
     * @return
     */
    Functor subsymbol(int beginIndex);

    /**
     * Creates and return new {@link Functor} instance that shares the name
     * string with this instance, but name of new instance is a substring of this
     * name starting from given beginIndex and ending before endIndex.
     * 
     * @param beginIndex
     * @param endIndex
     * @return
     */
    Functor subsymbol(int beginIndex, int endIndex);

    Term concat(Functor that);

    /**
     * Returns the name length
     * 
     * @return
     */
    int length();

    // TODO startsWith(), endsWith(), indexOf()
    /* Term */
    boolean unifyImpl(Term t, Trail trail);

    int termHashCodeImpl();

    boolean equalsTerm(Term obj, OpVisitor comparator);

    // private static boolean eq(SymbolTerm a, Term b0) {
    // if (a == b0) {
    //      return true;
    //      } else if (b0 instanceof SymbolTerm && (a instanceof Dynamic || b0 instanceof Dynamic)) {
    // SymbolTerm b = (SymbolTerm) b0;
    // return a.arity == b.arity && a.name.equals(b.name);
    // } else {
    // return false;
    // }
    // }
    /**
     * @return the <code>boolean</code> whose value is
     *         <code>convertible(String.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    boolean convertible(Class type);

    /**
     * Returns a <code>java.lang.String</code> corresponds to this
     * <code>SymbolTerm</code> according to <em>Prolog Cafe interoperability with
     * Java</em>.
     * 
     * @return a <code>java.lang.String</code> object equivalent to this
     *         <code>SymbolTerm</code>.
     */
    Object toJava();

    void toStringImpl(int printingFlags, StringBuilder sb);

    String pprint() throws PrologException;

    /* Comparable */
    /**
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     * 
     * @param anotherTerm
     *            the term to compared with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; a value less
     *         than <code>0</code> if this term is <em>before</em> the
     *         <code>anotherTerm</code>; and a value greater than <code>0</code> if
     *         this term is <em>after</em> the <code>anotherTerm</code>.
     */
    int compareTo(Term anotherTerm);

    boolean isImmutable();

    boolean isNil();

    Functor functor();

}