package SxxMachine.pterm;

import java.util.Map;

import SxxMachine.Compound;
import SxxMachine.Functor;
import SxxMachine.IllegalTypeException;
import SxxMachine.OpVisitor;
import SxxMachine.Prolog;
import SxxMachine.PrologException;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * The superclass of classes for term structures. The subclasses of
 * <code>Term</code> must override the <code>unify</code> method.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
abstract class AliasTerm extends PTerm implements Comparable<Term> {

    private Term value;

    protected boolean useAlias() {
        return (value != this && value != null);
    }

    /**
     *
     * @return value //true if this term is immutable, i.e. can not be changed
     */
    @Override
    public boolean isImmutable() {
        return (useAlias() ? getTrueRef().isImmutable() : false /* super.isImmutable() */);
    }

    /**
     * @return the value
     */
    public Term getTrueRef() {
        return value;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(Term value) {
        if (value instanceof AliasTerm) {
            value = ((AliasTerm) value).getTrueRef();
        }
        this.value = value;
    }

    /** One of the {@code TYPE_*} constants from {@code Term}. */
    @Override
    public int type() {
        return (useAlias() ? getTrueRef().type() : TYPE_VARIABLE);
    }

    @Override
    public int termHashCodeImpl() {
        return (useAlias() ? getTrueRef().termHashCode() : System.identityHashCode(getTrueRef()));
    }

    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        if (this == obj)
            return true;

        if (useAlias())
            return getTrueRef().equalsTerm(obj, comparator);
        if (!obj.isAlias())
            return obj.equalsTerm(this, comparator);
        return false;
    }

    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        return (useAlias() ? getTrueRef().unify(t, trail) : t.unify(this, trail));
    }

    @Override
    public int compareTo(Term o) {
        return (useAlias() ? getTrueRef().compareTo(o) : o.compareTo(this));
    }

    /**
     * Adds a string representation of this term to given StringBuilder instance.
     */
    @Override
    public abstract void toStringImpl(int printFlags, StringBuilder sb);

    /** @return value //the name of this Term, if {@link #isCompound()}.
     * @throws Exception
     * @throws PrologException
     * @throws IllegalTypeException */
    @Override
    public String getJavaString() throws IllegalTypeException {
        return (useAlias() ? getTrueRef().getJavaString() : super.toUnquotedNumVars());
    }

    /**
     * Check whether this term is a logical variable.
     *
     * @return value //<code>true</code> if <code>this .isVariable()</code>,
     *         otherwise <code>false</code>.
     * @see VariableTerm
     */
    @Override
    public boolean isVar() {
        return (useAlias() ? getTrueRef().isVar() : super.isVar());
    }

    /**
     * Check whether this term is an integer.
     *
     * @return value //<code>true</code> if <code>this .isInteger()</code>,
     *         otherwise <code>false</code>.
     * @see IntegerTerm
     */
    @Override
    public boolean isInteger() {
        return (useAlias() ? getTrueRef().isInteger() : super.isInteger());
    }

    /**
     * Check whether this term is a float.
     *
     * @return value //<code>true</code> if <code>this .isDouble()</code>, otherwise
     *         <code>false</code>.
     * @see DoubleTerm
     */
    @Override
    public boolean isDouble() {
        return (useAlias() ? getTrueRef().isDouble() : super.isDouble());
    }

    /**
     * Check whether this term is a long.
     *
     * @return value //<code>true</code> if <code>this .isLong()</code>, otherwise
     *         <code>false</code>.
     * @see LongTerm
     */
    @Override
    public boolean isLong() {

        return (useAlias() ? getTrueRef().isLong() : super.isLong());
    }

    /**
     * Check whether this term is a number.
     *
     * @return value //<code>true</code> if
     *         <code>this .isInteger() || this .isDouble()</code>, otherwise
     *         <code>false</code>.
     * @see IntegerTerm
     * @see DoubleTerm
     */
    @Override
    public boolean isNumber() {

        return (useAlias() ? getTrueRef().isNumber() : super.isNumber());
    }

    @Override
    public boolean isAtomicValue() {

        return (useAlias() ? getTrueRef().isAtomicValue() : super.isAtomicValue());
    }

    /**
     * Check whether this term is an atom.
     *
     * @return value //<code>true</code> if <code>this .isSymbol()</code>, otherwise
     *         <code>false</code>.
     * @see Functor
     */
    @Override
    public boolean isAtomSymbol() {

        return (useAlias() ? getTrueRef().isAtomSymbol() : super.isAtomSymbol());
    }

    /**
     * Check whether this term is a list structure.
     *
     * @return value //<code>true</code> if <code>this .isList()</code>, otherwise
     *         <code>false</code>. []/0 == false;
     * @see Compound
     */
    @Override
    public boolean isCons() {

        return (useAlias() ? getTrueRef().isCons() : super.isCons());
    }

    /**
     * Check whether this term is a compound term.
     *
     * @return value //<code>true</code> if <code>this .isStructure()</code>,
     *         otherwise <code>false</code>.
     * @see Term
     */
    @Override
    public boolean isCompound() {

        return (useAlias() ? getTrueRef().isCompound() : super.isCompound());
    }

    /**
     * Check whether this term is a java term.
     *
     * @return value //<code>true</code> if <code>this .isJavaObject()</code>,
     *         otherwise <code>false</code>.
     * @see JavaObjectTerm
     */
    @Override
    public boolean isJavaObject() {

        return (useAlias() ? getTrueRef().isJavaObject() : super.isJavaObject());
    }

    /**
     * Check whether this term is a closure term.
     *
     * @return value //<code>true</code> if <code>this .isClosure()</code>,
     *         otherwise <code>false</code>.
     * @see ClosureTerm
     */
    @Override
    public boolean isClosure() {

        return (useAlias() ? getTrueRef().isClosure() : super.isClosure());
    }

    /** @return value //the arity of this Term, if {@link #isCompound()}. */
    @Override
    public int arity() {
        return (useAlias() ? getTrueRef().arity() : super.arity());
    }

    @Override
    public Term[] args() {

        return (useAlias() ? getTrueRef().args() : super.args());
    }

    /**
     * @return value //get the nth argument of {@link #isCompound()} or
     *         {@link #isCons()}.
     */
    @Override
    public Term getPlainArg(int nth) {

        return (useAlias() ? getTrueRef().getPlainArg(nth) : super.getPlainArg(nth));
    }

    @Override
    public Term car() {

        return (useAlias() ? getTrueRef().car() : super.car());
    }

    @Override
    public Term cdr() {

        return (useAlias() ? getTrueRef().cdr() : super.cdr());
    }

    @Override
    public int termLength() {

        return (useAlias() ? getTrueRef().termLength() : super.termLength());
    }

    @Override
    public Compound addPlToList(Term t) {

        return (useAlias() ? getTrueRef().addPlToList(t) : super.addPlToList(t));
    }

    @Override
    public Compound appendCons(Term t) {

        return (useAlias() ? getTrueRef().appendCons(t) : super.appendCons(t));
    }

    @Override
    public boolean convertible(Class type) {

        return (useAlias() ? getTrueRef().convertible(type) : super.convertible(type));
    }

    /** Returns a copy of this object. */
    @Override
    protected Term cafe_copyImpl(Map<Object, Term> copyHash, int deeply) {

        return (useAlias() ? getTrueRef().copy(copyHash, deeply) : super.copy(copyHash, deeply));
    }

    /** Returns the dereference value of this term. */
    @Override
    public Term dref() {

        return (useAlias() ? getTrueRef().dref() : super.dref());
    }

    /**
     * Check whether this term is a ground term.
     *
     * @return value //<code>true</code> if ground, otherwise <code>false</code>.
     */
    @Override
    public boolean isGround() {

        return (useAlias() ? getTrueRef().isGround() : super.isGround());
    }

    /**
     * Returns a Java object that corresponds to this term if defined in <em>Prolog
     * Cafe interoperability with Java</em>. Otherwise, returns <code>this</code>.
     *
     * @return value //a Java object if defined in <em>Prolog Cafe interoperability
     *         with Java</em>, otherwise <code>this</code>.
     */
    @Override
    public Object javaInstance() {

        return (useAlias() ? getTrueRef().javaInstance() : super.javaInstance());
    }

    @Override
    public boolean equals(Object obj) {
        if (getTrueRef() == obj)
            return false; // ???
        if (this == obj)
            return true;
        return (useAlias() ? getTrueRef().equals(obj) : super.equals(obj));
    }

    @Override
    public boolean isVariable() {

        return (useAlias() ? getTrueRef().isVariable() : super.isVariable());
    }

    @Override
    public boolean isNonvar() {

        return (useAlias() ? getTrueRef().isNonvar() : super.isNonvar());
    }

    @Override
    public boolean bind(Term partial, Trail trail) {

        return (useAlias() ? getTrueRef().bind(partial, trail) : super.bind(partial, trail));
    }

    @Override
    public Term findOrAttrValue(Trail trail, boolean createIfMissing, Term name) {

        return (useAlias() ? getTrueRef().findOrAttrValue(trail, createIfMissing, name)
                : super.findOrAttrValue(trail, createIfMissing, name));
    }

    @Override
    public Term freeze(Trail trail, Term newval) {

        return (useAlias() ? getTrueRef().freeze(trail, newval) : super.freeze(trail, newval));
    }

    @Override
    public Term frozenGoals() {

        return (useAlias() ? getTrueRef().frozenGoals() : super.frozenGoals());
    }

    @Override
    public boolean isAttvar() {

        return (useAlias() ? getTrueRef().isAttvar() : super.isAttvar());
    }

    @Override
    public boolean isFrozen() {

        return (useAlias() ? getTrueRef().isFrozen() : super.isFrozen());
    }

    /** Check whether this term is an empty list. */
    @Override
    public boolean isNil() {
        return Prolog.Nil.equalsTerm(getTrueRef(), StrictEquals);

        //return (useAlias() ? getValue_int().isNil() : super.isNil());
    }

    @Override
    public long longValue() {

        return (useAlias() ? getTrueRef().longValue() : super.longValue());
    }

    @Override
    public void putAttrValue(Trail trail, Term name, Term val) {

        if (useAlias())
            getTrueRef().putAttrValue(trail, name, val);
        else
            super.putAttrValue(trail, name, val);
    }

    @Override
    public void setarg0Maybe_trail(Trail trail, int i0, Term value) {
        value.setarg0Maybe_trail(trail, i0, value);
    }

    @Override
    public void setAttrs(Trail trail, Term newval) {

        if (useAlias())
            getTrueRef().setAttrs(trail, newval);
        else
            super.setAttrs(trail, newval);
    }

    @Override
    public void setGoals(Trail trail, Term newval) {

        if (useAlias())
            getTrueRef().setGoals(trail, newval);
        else
            super.setGoals(trail, newval);
    }

    @Override
    public boolean isFVar() {

        return (useAlias() ? getTrueRef().isFVar() : super.isFVar());
    }

    @Override
    public int intValue() {

        return (useAlias() ? getTrueRef().intValue() : super.intValue());
    }

    @Override
    public boolean unifyInt(int i, Trail trail) {

        return (useAlias() ? getTrueRef().unifyInt(i, trail) : super.unifyInt(i, trail));
    }

    @Override
    public Functor asSymbolTerm() {

        return (useAlias() ? getTrueRef().asSymbolTerm() : super.asSymbolTerm());
    }

    @Override
    public boolean isAlias() {
        return true;
    }
}
