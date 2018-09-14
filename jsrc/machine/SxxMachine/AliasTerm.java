package SxxMachine;

import SxxMachine.exceptions.*;


import java.util.Comparator;
import java.util.IdentityHashMap;

/**
 * The superclass of classes for term structures. The subclasses of
 * <code>Term</code> must override the <code>unify</code> method.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public abstract class AliasTerm extends Term implements Comparable<Term> {

  private Term value;
  protected boolean useAlias() {
    return (value != this && value != null);
  }


  /**
   * 
   * @return value //true if this term is immutable, i.e. can not be changed
   */
  public boolean isImmutable() {
    return (useAlias() ? getValue().isImmutable()
        : false /* super.isImmutable() */);
  }

  /**
   * @return the value
   */
  public Term getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(Term value) {
    if (value instanceof AliasTerm) {
      value = value.getValue();
    }
    this.value = value;
  }

  /** One of the {@code TYPE_*} constants from {@code Term}. */
  public int type() {
    return (useAlias() ? getValue().type() : TYPE_VARIABLE);
  }

  public int termHashCodeImpl() {
    return (useAlias() ? getValue().termHashCode()
        : System.identityHashCode(getValue()));
  }

  public boolean equalsTerm(Term obj, Comparator comparator) {
    if (this == obj) return true;
    
    if (useAlias())  return getValue().equalsTerm(obj, comparator);
    if(!obj.isAlias()) return obj.equalsTerm(this, comparator);
    return false;
  }


  public boolean unifyImpl(Term t, Trail trail) {
    return (useAlias() ? getValue().unify(t, trail) : t.unify(this, trail));
  }

  @Override
  public int compareTo(Term o) {
    return (useAlias() ? getValue().compareTo(o) : o.compareTo(this));
  }

  /**
   * Adds a string representation of this term to given StringBuilder instance.
   */
  public abstract void toStringImpl(int printFlags, StringBuilder sb);

  /** @return value //the name of this Term, if {@link #isStructure()}. */
  public String name() {
    return (useAlias() ? getValue().name() : super.toQuotedString());
  }

  /**
   * Check whether this term is a logical variable.
   * 
   * @return value //<code>true</code> if <code>this .isVariable()</code>,
   *         otherwise <code>false</code>.
   * @see VariableTerm
   */
  public boolean isVar() {
    return (useAlias() ? getValue().isVar() : super.isVar());
  }

  /**
   * Check whether this term is an integer.
   * 
   * @return value //<code>true</code> if <code>this .isInteger()</code>,
   *         otherwise <code>false</code>.
   * @see IntegerTerm
   */
  public boolean isInteger() {
    return (useAlias() ? getValue().isInteger() : super.isInteger());
  }

  /**
   * Check whether this term is a float.
   * 
   * @return value //<code>true</code> if <code>this .isDouble()</code>,
   *         otherwise <code>false</code>.
   * @see DoubleTerm
   */
  public boolean isDouble() {
    return (useAlias() ? getValue().isDouble() : super.isDouble());
  }

  /**
   * Check whether this term is a long.
   * 
   * @return value //<code>true</code> if <code>this .isLong()</code>, otherwise
   *         <code>false</code>.
   * @see LongTerm
   */
  public boolean isLong() {

    return (useAlias() ? getValue().isLong() : super.isLong());
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
  public boolean isNumber() {

    return (useAlias() ? getValue().isNumber() : super.isNumber());
  }

  public boolean isAtomicValue() {

    return (useAlias() ? getValue().isAtomicValue() : super.isAtomicValue());
  }

  /**
   * Check whether this term is an atom.
   * 
   * @return value //<code>true</code> if <code>this .isSymbol()</code>,
   *         otherwise <code>false</code>.
   * @see SymbolTerm
   */
  public boolean isSymbol() {

    return (useAlias() ? getValue().isSymbol() : super.isSymbol());
  }

  /** Check whether this term is an empty list. */
  @Override
  public boolean isNil() {
    return Prolog.Nil.equalsTerm(getValue(), StrictEquals);
  }

  /**
   * Check whether this term is a list structure.
   * 
   * @return value //<code>true</code> if <code>this .isList()</code>, otherwise
   *         <code>false</code>. []/0 == false;
   * @see ListTerm
   */
  public boolean isCons() {

    return (useAlias() ? getValue().isCons() : super.isCons());
  }

  /**
   * Check whether this term is a compound term.
   * 
   * @return value //<code>true</code> if <code>this .isStructure()</code>,
   *         otherwise <code>false</code>.
   * @see StructureTerm
   */
  public boolean isStructure() {

    return (useAlias() ? getValue().isStructure() : super.isStructure());
  }

  /**
   * Check whether this term is a java term.
   * 
   * @return value //<code>true</code> if <code>this .isJavaObject()</code>,
   *         otherwise <code>false</code>.
   * @see FFIObjectTerm
   */
  public boolean isFFIObject() {

    return (useAlias() ? getValue().isFFIObject() : super.isFFIObject());
  }

  /**
   * Check whether this term is a closure term.
   * 
   * @return value //<code>true</code> if <code>this .isClosure()</code>,
   *         otherwise <code>false</code>.
   * @see ClosureTerm
   */
  public boolean isClosure() {

    return (useAlias() ? getValue().isClosure() : super.isClosure());
  }


  /** @return value //the arity of this Term, if {@link #isStructure()}. */
  public int arity() {
    return (useAlias() ? getValue().arity() : super.arity());
  }

  public Term[] args() {

    return (useAlias() ? getValue().args() : super.args());
  }

  /**
   * @return value //get the nth argument of {@link #isStructure()} or
   *         {@link #isCons()}.
   */
  public Term arg0(int nth) {

    return (useAlias() ? getValue().arg0(nth) : super.arg0(nth));
  }

  public Term car() {

    return (useAlias() ? getValue().car() : super.car());
  }

  public Term cdr() {

    return (useAlias() ? getValue().cdr() : super.cdr());
  }


  public int length() {

    return (useAlias() ? getValue().length() : super.length());
  }

  public ListTerm add(Term t) {

    return (useAlias() ? getValue().add(t) : super.add(t));
  }

  public ListTerm append(Term t) {

    return (useAlias() ? getValue().append(t) : super.append(t));
  }


  public boolean convertible(Class type) {

    return (useAlias() ? getValue().convertible(type) : super.convertible(type));
  }

  /** Returns a copy of this object. */
  @Override
  protected Term copyImpl(IdentityHashMap<Object, Term> copyHash, int deeply) {

    return (useAlias() ? getValue().copy(copyHash, deeply) : super.copy(copyHash, deeply));
  }

  /** Returns the dereference value of this term. */
  public Term dref() {

    return (useAlias() ? getValue().dref() : super.dref());
  }

  /**
   * Check whether this term is a ground term.
   * 
   * @return value //<code>true</code> if ground, otherwise <code>false</code>.
   */
  public boolean isGround() {

    return (useAlias() ? getValue().isGround() : super.isGround());
  }

  /**
   * Returns a Java object that corresponds to this term if defined in
   * <em>Prolog Cafe interoperability with Java</em>. Otherwise, returns
   * <code>this</code>.
   * 
   * @return value //a Java object if defined in <em>Prolog Cafe
   *         interoperability with Java</em>, otherwise <code>this</code>.
   */
  public Object toJava() {

    return (useAlias() ? getValue().toJava() : super.toJava());
  }

  @Override
  public boolean equals(Object obj) {
    if (getValue() == obj) return false; // ???
    if (this == obj) return true;
    return (useAlias() ? getValue().equals(obj) : super.equals(obj));
  }

  @Override
  public boolean isVariable() {

    return (useAlias() ? getValue().isVariable() : super.isVariable());
  }

  public boolean isNonvar() {

    return (useAlias() ? getValue().isNonvar() : super.isNonvar());
  }

  public boolean bind(Term partial, Trail trail) {

    return (useAlias() ? getValue().bind(partial, trail)
        : super.bind(partial, trail));
  }

  public boolean equalsIdentical(Term t) {

    return (useAlias() ? getValue().equalsIdentical(t)
        : super.equalsIdentical(t));
  }

  public Term findOrAttrValue(Trail trail, boolean createIfMissing, Term name) {

    return (useAlias() ? getValue().findOrAttrValue(trail, createIfMissing, name)
        : super.findOrAttrValue(trail, createIfMissing, name));
  }

  public Term freeze(Trail trail, Term newval) {

    return (useAlias() ? getValue().freeze(trail, newval)
        : super.freeze(trail, newval));
  }

  public Term frozenGoals() {

    return (useAlias() ? getValue().frozenGoals() : super.frozenGoals());
  }

  public boolean isAttvar() {

    return (useAlias() ? getValue().isAttvar() : super.isAttvar());
  }

  public boolean isFrozen() {

    return (useAlias() ? getValue().isFrozen() : super.isFrozen());
  }

  boolean IsList() {

    return (useAlias() ? getValue().IsList() : super.IsList());
  }

  boolean IsNil() {

    return (useAlias() ? getValue().IsNil() : super.IsNil());
  }

  long longValue() {

    return (useAlias() ? getValue().longValue() : super.longValue());
  }

  public void putAttrValue(Trail trail, Term name, Term val) {

    if (useAlias())
      getValue().putAttrValue(trail, name, val);
    else
      super.putAttrValue(trail, name, val);
  }

  public void setarg0(Trail trail, int i0, Term value) {
    value.setarg0(trail, i0, value);
  }

  public void setAttrs(Trail trail, Term newval) {

    if (useAlias())
      getValue().setAttrs(trail, newval);
    else
      super.setAttrs(trail, newval);
  }

  public void setGoals(Trail trail, Term newval) {

    if (useAlias())
      getValue().setGoals(trail, newval);
    else
      super.setGoals(trail, newval);
  }

  public boolean isFVar() {

    return (useAlias() ? getValue().isFVar() : super.isFVar());
  }

  public int intValue() {

    return (useAlias() ? getValue().intValue() : super.intValue());
  }

  public boolean unifyInt(int i, Trail trail) {

    return (useAlias() ? getValue().unifyInt(i, trail)
        : super.unifyInt(i, trail));
  }

  public SymbolTerm asSymbolTerm() {

    return (useAlias() ? getValue().asSymbolTerm() : super.asSymbolTerm());
  }
  public boolean isAlias() {
    return true;
  }
}
