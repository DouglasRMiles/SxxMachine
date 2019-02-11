package SxxMachine;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The superclass of classes for term structures. The subclasses of
 * <code>Term</code> must override the <code>unify</code> method.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings({ "unused", "rawtypes" })
public abstract class Term extends KPTerm implements Comparable<Term> {
	/** Holds an integer value <code>0</code>. */
	public static final int EQUAL = 0;
	/** Holds an integer value <code>1</code>. */
	public static final int AFTER = 1;
	/** Holds an integer value <code>-1</code>. */
	public static final int BEFORE = -1;

	public final static int JAVA = -4;
	public final static int FLOAT = -3;
	public final static int INT = -2;
	public final static int VAR = -1;
	public final static int CONST = 0;

	public static final int TYPE_CLOSURE = -6;
	public static final int TYPE_JAVA_OBJECT = -4;
	public static final int TYPE_DOUBLE = -3;
	public static final int TYPE_INTEGER = -2;
	public static final int TYPE_VARIABLE = -1;
	public static final int TYPE_SYMBOL = 0;
	public static final int TYPE_STRUCTURE = 1;
	public static final int TYPE_LIST = 2;

	public static final int COPY_ALL = 0;
	public static final int COPY_DEEPLY = 1;
	public static final int COPY_NO_ATTRS = 2;
	public static final int COPY_SAVE_ATTRS_COPY = 4;

	public static final OpVisitor StrictEquals = new OpVisitor();
	public static final OpVisitor Unifiable = null;
	public static final OpVisitor Subsumes = null;

	protected int containsTermImpl(Term variableTerm, OpVisitor comparison) {
		return 0;
	}

	int loopContainsTerm = 0;

	final public int containsTerm(Term variableTerm, OpVisitor equalsidentical) {
		if (loopContainsTerm > 0) {
			return loopContainsTerm;
		}
		try {
			loopContainsTerm++;
			return containsTermImpl(variableTerm, equalsidentical);
		} finally {
			loopContainsTerm--;
		}
	}

	/** One of the {@code TYPE_*} constants from {@code Term}. */
	public abstract int type();

	@Override
	final public int hashCode() {
		return termHashCode();
	}

	int loopedHashCodeTerm = 0;

	@Override
	final public int termHashCode() {
		if (loopedHashCodeTerm > 0)
			return 1;
		try {
			loopedHashCodeTerm++;
			return termHashCodeImpl();
		} catch (Throwable e) {
			e.printStackTrace();
			return System.identityHashCode(this);
		} finally {
			loopedHashCodeTerm--;
		}
	}

	abstract public int termHashCodeImpl() throws Throwable;

	/**
	 * Holds a term to which this variable is bound. Initial value is
	 * <code>this</code> (self-reference). Moved from VariableTerm here in order to
	 * force inlining of method {@link #drefAttrs()}
	 */
	// public Term val = this;
	/**
	 * Checks whether the argument term is unified with this one.
	 * 
	 * @param t
	 *            the term to be unified with.
	 * @param trail
	 *            Trail Stack.
	 * @return <code>true</code> if succeeds, otherwise <code>false</code>.
	 */
	int loopedUnifyTerm = 0;

	final public boolean unify(Term t, Trail trail) {
		Term dref = drefAttrs();
		if (dref != this) {
			return dref.unify(t, trail);
		}
		if (loopedUnifyTerm > 0)
			return true;
		try {
			loopedUnifyTerm++;
			return unifyImpl(t, trail);
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		} finally {
			loopedUnifyTerm--;
		}
	}

	abstract public boolean unifyImpl(Term t, Trail trail);

	/**
	 * 
	 * @return true if this term is immutable, i.e. can not be changed
	 */
	public abstract boolean isImmutable();

	/**
	 * Check whether this term is a logical variable.
	 * 
	 * @return <code>true</code> if <code>this .isVariable()</code>, otherwise
	 *         <code>false</code>.
	 * @see VariableTerm
	 */
	@Override
	public boolean isVar() {
		return false;
	}

	/**
	 * Check whether this term is an integer.
	 * 
	 * @return <code>true</code> if <code>this .isInteger()</code>, otherwise
	 *         <code>false</code>.
	 * @see IntegerTerm
	 */
	public boolean isInteger() {
		return false;
	}

	/**
	 * Check whether this term is a float.
	 * 
	 * @return <code>true</code> if <code>this .isDouble()</code>, otherwise
	 *         <code>false</code>.
	 * @see DoubleTerm
	 */
	public boolean isDouble() {
		return false;
	}

	/**
	 * Check whether this term is a long.
	 * 
	 * @return <code>true</code> if <code>this .isLong()</code>, otherwise
	 *         <code>false</code>.
	 * @see LongTerm
	 */
	@Override
	public boolean isLong() {
		return false;
	}

	/**
	 * Check whether this term is a number.
	 * 
	 * @return <code>true</code> if
	 *         <code>this .isInteger() || this .isDouble()</code>, otherwise
	 *         <code>false</code>.
	 * @see IntegerTerm
	 * @see DoubleTerm
	 */
	@Override
	public boolean isNumber() {
		return false;
	}

	public boolean isAtomicValue() {
		return true;
	}

	/**
	 * Check whether this term is an atom.
	 * 
	 * @return <code>true</code> if <code>this .isSymbol()</code>, otherwise
	 *         <code>false</code>.
	 * @see SymbolTerm
	 */
	public boolean isSymbol() {
		return false;
	}

	/** Check whether this term is an empty list. */
	@Override
	public boolean isNil() {
		return Prolog.Nil.equalsTerm(this, StrictEquals);
	}

	/**
	 * Check whether this term is a list structure.
	 * 
	 * @return <code>true</code> if <code>this .isList()</code>, otherwise
	 *         <code>false</code>. []/0 == false;
	 * @see ListTerm
	 */
	@Override
	public boolean isCons() {
		return false;
	}

	/**
	 * Check whether this term is a compound term.
	 * 
	 * @return <code>true</code> if <code>this .isStructure()</code>, otherwise
	 *         <code>false</code>.
	 * @see StructureTerm
	 */
	@Override
	public boolean isStructure() {
		return false;
	}

	/**
	 * Check whether this term is a java term.
	 * 
	 * @return <code>true</code> if <code>this .isJavaObject()</code>, otherwise
	 *         <code>false</code>.
	 * @see FFIObjectTerm
	 */
	public boolean isFFIObject() {
		return false;
	}

	/**
	 * Check whether this term is a closure term.
	 * 
	 * @return <code>true</code> if <code>this .isClosure()</code>, otherwise
	 *         <code>false</code>.
	 * @see ClosureTerm
	 */
	public boolean isClosure() {
		return false;
	}

	/** @return the name of this Term, if {@link #isStructure()}. */
	@Override
	public abstract String name();

	/** @return the arity of this Term, if {@link #isStructure()}. */
	public int arity() {
		return 0;
	}

	public Term[] args() {
		throw new ArrayIndexOutOfBoundsException(666);
	}

	public Term arg0(int nth) {
		throw new ArrayIndexOutOfBoundsException(nth);
	}

	/**
	 * @return get the nth argument of {@link #isStructure()} or {@link #isCons()}.
	 */
	public Term nth0(int nth) {
		throw new ArrayIndexOutOfBoundsException(nth);
	}

	public Term car() {
		throw new ArrayIndexOutOfBoundsException(-1);
	}

	public Term cdr() {
		throw new ArrayIndexOutOfBoundsException(-2);
	}

	public int length() {
		throw new ArrayIndexOutOfBoundsException(-3);
	}

	public ListTerm add(Term t) {
		throw new ArrayIndexOutOfBoundsException(-5);
	}

	public ListTerm append(Term t) {
		throw new ArrayIndexOutOfBoundsException(-5);
	}

	/**
	 * Check whether this object is convertible with the given Java class type.
	 * 
	 * @param type
	 *            the Java class type to compare with.
	 * @return <code>true</code> if this is convertible with <code>type</code>.
	 *         Otherwise <code>false</code>.
	 * @see #convertible(Class, Class)
	 */

	public boolean convertible(Class type) {
		return convertible(getClass(), type);
	}

	/**
	 * Returns a copy of this object.
	 * 
	 * @param deeply
	 *            TODO
	 */
	protected Term copyImpl(Map<Object, Term> copyHash, int deeply) {
		return this;
	}

	int loopingCopyTerm = 0;

	final public Term copy(Map<Object, Term> copyHash, int deeply) {
		Term copy = copyHash.get(this);
		if (copy != null)
			return copy;
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this) {
			if (drefAttrs.type() == this.type()) {
				return drefAttrs.copy(copyHash, deeply);
			} else {
				// oopsy();
				/// return drefAttrs.copy(copyHash, deeply);
			}
		}
		if (loopingCopyTerm == 1) {
			VariableTerm vt = new VariableTerm(Prolog.M);
			Term cp = vt.copyImpl(copyHash, deeply);
			// copyHash.put(vt, cp);
			vt.val = this;
			copyHash.put(this, cp);
			return cp;
		}
		// if(loopingCopyTerm==2) return copyHash.get(this);
		try {
			loopingCopyTerm++;
			copy = copyImpl(copyHash, deeply);
			copyHash.put(this, copy);
			if ((deeply & COPY_SAVE_ATTRS_COPY) != 0) {
				Term GoalsKey = SymbolTerm.GOALS;
				if (this.isFVar()) {
					Term goals1 = frozenGoals().copy(copyHash, deeply);
					Term sofar = copyHash.get(GoalsKey);
					Term newsofar = sxxtensions.appendGoals(sofar, goals1);
					copyHash.put(GoalsKey, newsofar);
				}
				if (isAttvar()) {
					Term attrs = getAttrs().copy(copyHash, deeply);
					Term goals1 = sxxtensions.get_attribute_goals(copy, attrs);
					Term sofar = copyHash.get(GoalsKey);
					Term newsofar = sxxtensions.appendGoals(sofar, goals1);
					copyHash.put(GoalsKey, newsofar);
				}
			} else if ((deeply & COPY_NO_ATTRS) == 0) {
				if (this.isFVar()) {
					Term frozen = frozenGoals();
					Term newfroze = frozen.copy(copyHash, deeply);
					copy.setGoals(newfroze);
					assert copy.isFVar();
				}
				if (isAttvar()) {
					copy.setAttrs(getAttrs().copy(copyHash, deeply));
				}
			}
			return copy;
		} finally {
			loopingCopyTerm--;
			// TODO: handle finally clause
		}
	}

	@Override
	public void oopsy() {
		new Exception().printStackTrace();
	}

	/** Returns the dereference value of this term. */
	@Override
	public Term dref() {
		return this;
	}

	/**
	 * Check whether this term is a ground term.
	 * 
	 * @return <code>true</code> if ground, otherwise <code>false</code>.
	 */
	public boolean isGround() {
		return true;
	}

	/**
	 * Returns a Java object that corresponds to this term if defined in <em>Prolog
	 * Cafe interoperability with Java</em>. Otherwise, returns <code>this</code>.
	 * 
	 * @return a Java object if defined in <em>Prolog Cafe interoperability with
	 *         Java</em>, otherwise <code>this</code>.
	 */
	public Object toJava() {
		return this;
	}

	/**
	 * Check whether there is a widening conversion from <code>from</code> to
	 * <code>to</code>.
	 */
	protected static boolean convertible(Class from, Class<?> to) {
		if (from == null)
			return !to.isPrimitive();
		if (to.isAssignableFrom(from)) {
			return true;
		} else if (to.isPrimitive()) {
			if (from.equals(Boolean.class)) {
				return to.equals(Boolean.TYPE);
			} else if (from.equals(Byte.class)) {
				return to.equals(Byte.TYPE) || to.equals(Short.TYPE) || to.equals(Integer.TYPE) || to.equals(Long.TYPE)
						|| to.equals(Float.TYPE) || to.equals(Double.TYPE);
			} else if (from.equals(Short.class)) {
				return to.equals(Short.TYPE) || to.equals(Integer.TYPE) || to.equals(Long.TYPE) || to.equals(Float.TYPE)
						|| to.equals(Double.TYPE);
			} else if (from.equals(Character.class)) {
				return to.equals(Character.TYPE) || to.equals(Integer.TYPE) || to.equals(Long.TYPE)
						|| to.equals(Float.TYPE) || to.equals(Double.TYPE);
			} else if (from.equals(Integer.class)) {
				return to.equals(Integer.TYPE) || to.equals(Long.TYPE) || to.equals(Float.TYPE)
						|| to.equals(Double.TYPE);
			} else if (from.equals(Long.class)) {
				return to.equals(Long.TYPE) || to.equals(Float.TYPE) || to.equals(Double.TYPE);
			} else if (from.equals(Float.class)) {
				return to.equals(Float.TYPE) || to.equals(Double.TYPE);
			} else if (from.equals(Double.class)) {
				return to.equals(Double.TYPE);
			}
		}
		return false;
	}

	/** Checks whether a given object is an instance of Prolog term. */
	public static boolean instanceOfTerm(Object obj0) {
		if (!(obj0 instanceof Term))
			return false;
		Term obj = (Term) obj0;
		return obj.isVar() || obj.isInteger() || obj.isLong() || obj.isDouble() || obj.isSymbol() || obj.isCons()
				|| obj.isStructure() || obj.isFFIObject() || obj.isClosure();
	}

	/**
	 * <p>
	 * Returns Iterator over terms that make up this term. Should return empty
	 * iterator if this term is not compound, i.e SymbolTerm, NumberTerm, etc.
	 * <p>
	 * The method is used in non-recursive implementation of {@link #toString()}
	 */
	public Iterator<Term> iterator(boolean includeSyntax) {
		return Collections.<Term>emptyIterator();
	}

	/**
	 * Adds a string representation of this term to given StringBuilder instance.
	 * 
	 * @param printFlags
	 *            && 1 = quoted
	 */
	public String toQuotedString() throws PrologException {
		if (loopPrintingTerm > 0) {
			return "/*looped " + this.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(this))
					+ "*/";
		}
		StringBuilder sb = new StringBuilder();
		loopPrintingTerm++;
		try {
			toStringImpl(1, sb);
		} finally {
			loopPrintingTerm--;
		}
		return sb.toString();
	}

	protected int loopPrintingTerm = 0;

	/** Returns a string representation of this term. */
	@Override
	public String toString() {
		try {
			return toQuotedString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				return toAtomName();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return e.toString();
		}
	}

	@Override
	protected abstract void toStringImpl(int printFlags, StringBuilder sb);

	/** Returns a string representation of this term. */
	final public void toQuotedString(int printFlags, StringBuilder sb) {
		if (loopPrintingTerm > 0) {
			sb.append("/*looped*/");
			return;
		}
		loopPrintingTerm++;
		try {
			toStringImpl(printFlags, sb);
		} finally {
			loopPrintingTerm--;
		}
	}

	final public void toQuotedString_OLD(int printFlags, StringBuilder sb) {
		TermTreeIterator it = new TermTreeIterator(this, true);
		while (it.hasNext()) {
			it.next().toQuotedString(printFlags, sb);
		}
	}

	/** Returns a unquoted string representation of this term. */
	public String toAtomName() throws PrologException {
		StringBuilder sb = new StringBuilder();
		toStringImpl(0, sb);
		return sb.toString();
	}

	/**
     * Iterator over all terms that make up this term.
     * Uses DFS to iterate over terms tree.
	 */
	public static class TermTreeIterator implements Iterator<Term> {
		private final Deque<Iterator<Term>> stack = new ArrayDeque<Iterator<Term>>();
		boolean includeSyntax;

		public TermTreeIterator(Term start, boolean includeSyntax) {
			this.includeSyntax = includeSyntax;
			this.stack.push(Collections.singleton(start).iterator());
		}

		@Override
		public boolean hasNext() {
			while (!this.stack.isEmpty() && !this.stack.peek().hasNext()) {
				this.stack.pop();
			}
			return !this.stack.isEmpty();
		}

		@Override
		public Term next() {
			while (!this.stack.isEmpty()) {
				Iterator<Term> i = this.stack.peek();
				if (i.hasNext()) {
					Term t = i.next();
					Iterator<Term> it = t.iterator(includeSyntax);
					if (it.hasNext()) {
						this.stack.push(it);
					} else {
						return t;
					}
				} else {
					this.stack.pop();
				}
			}
			throw new NoSuchElementException();
		}
	}

	@Override
	public boolean equalsTerm(Term head) {
		if (head == this)
			return true;
		return equalsTerm(head, StrictEquals);
	}

	abstract public boolean equalsTerm(Term obj, OpVisitor comparator);

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Term) {
			return equalsTerm((Term) obj, StrictEquals);
		}
		return false;
	}

	public boolean isVariable() {
		return isVar();
	}

	public boolean isNonvar() {
		return true;
	}

	public boolean bind(Term partial, Trail trail) {
		if (partial == this)
			return true;
		throw new NoSuchElementException("no bind on genral terms");
	}

	public boolean equalsIdentical(Term t) {
		return equalsTerm(t, StrictEquals);
	}

	static final class UndoAttributeReplacement implements Undoable {
		private final Term wasAttrs;
		private final Term Termthis;

		UndoAttributeReplacement(Term thiz, Term wasAttrs) {
			this.Termthis = thiz;
			this.wasAttrs = wasAttrs;
		}

		@Override
		public void undo() {
			this.Termthis.setAttrs(this.wasAttrs);
		}
	}

	public Term drefAttrs() {
		// TODO Auto-generated method stub
		if (fdata != null)
			return this;
		Term attterm = dref();
		if (attterm == this)
			return attterm;
		return attterm.drefAttrs();
	}

	public Term ArgNoDeRef(int i) {
		return this.arg0(i);
	}

	public Term findOrAttrValue(Trail trail, boolean createIfMissing, Term name) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.findOrAttrValue(trail, createIfMissing, name);
		if (sxxtensions.isNoGoal(this.getAttrs())) {
			if (!createIfMissing)
				return Prolog.Nil;
			Term wasAttrs = this.getAttrs();
			StructureTerm newatts = null;
			this.setAttrs(Prolog.Nil);
			newatts = C("att", name, null, Prolog.Nil);
			if (trail != null) {
				trail.push(new UndoAttributeReplacement(this, wasAttrs));
			}
			return newatts;
		} else {
			Term next = this.getAttrs();
			do {
				if (next.arg0(0).equalsTerm(name, StrictEquals)) {
					return next;
				}
				Term nnext = next.arg0(2);
				if (!nnext.name().equals("att")) {
					break;
				}
				next = nnext;
			} while (true);
			if (!createIfMissing)
				return Prolog.Nil;
			next.setarg0(trail, 2, C("att", name, null, Prolog.Nil));
			return next;
		}
	}

	public Term freeze(Trail trail, Term newval) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.freeze(trail, newval);
		Term prev = this.frozenGoals();
		Term newgoals = sxxtensions.appendGoals(newval, prev);
		trail.push(new Undoable() {
			@Override
			public void undo() {
				Term.this.setGoals(prev);
			}
		});
		return this.setGoals(newgoals);
	}

	public Term frozenGoals() {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.frozenGoals();
		return nullIs(this.getGoals(), Prolog.True);
	}

	public boolean isAttvar() {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.isAttvar();
		if (fdata == null)
			return false;
		return this.getAttrs() != null && this.getAttrs() != Prolog.Nil;
	}

	public boolean isFrozen() {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.isFrozen();
		if (fdata == null)
			return false;
		return this.frozenGoals() != Prolog.True;
	}

	boolean IsList() {
		return false;
	}

	boolean IsNil() {
		return false;
	}

	long longValue() {
		Term deref = this.drefAttrs();
		if (deref != this)
			return deref.longValue();
		System.out.println("general LongValue on terms not available");
		return -1;
	}

	static Term nullIs(Term attrs2, Term valeu) {
		return attrs2 == null ? valeu : attrs2;
	}

	public void putAttrValue(Trail trail, Term name, Term val) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this) {
			putAttrValue(trail, name, val);
			return;
		}

		Term wasAttrs = this.getAttrs();
		if (wasAttrs == null || wasAttrs == Prolog.Nil) {
			Term newatts = null;
			newatts = C("att", name, val, Prolog.Nil);
			if (trail != null) {
				trail.push(new Undoable() {
					@Override
					public void undo() {
						Term.this.setAttrs(wasAttrs);
					}
				});
			}
			this.setAttrs(newatts);
			return;
		} else {
			Term next = wasAttrs;
			do {
				if (wasAttrs.arg0(0).equalsTerm(name, StrictEquals)) {
					(wasAttrs).setarg0(trail, 1, val);
					return;
				}
				Term nnext = next.arg0(2);
				if (!nnext.name().equals("att")) {
					break;
				}
				next = nnext;
			} while (true);
			next.setarg0(trail, 2, C("att", name, val, Prolog.Nil));
		}
	}

	public void setAttrs(Trail trail, Term newval) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this) {
			setAttrs(trail, newval);
			return;
		}

		Term prev = nullIs(this.getAttrs(), Prolog.Nil);
		trail.push(new Undoable() {
			@Override
			public void undo() {
				Term.this.setAttrs(prev);
			}
		});
		this.setAttrs(newval);
	}

	public void setGoals(Trail trail, Term newval) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this) {
			drefAttrs.setGoals(trail, newval);
			return;
		}
		final Term prev = nullIs(this.getGoals(), Prolog.True);
		trail.push(new Undoable() {
			@Override
			public void undo() {
				Term.this.setGoals(prev);
			}
		});
		this.setGoals(newval);
	}

	public void setarg0(Trail trail, int i0, Term value) {
		System.out.println("general SetArg on terms not available");
	}

	public Term setGoals(Term newval) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.setGoals(newval);
		return getFdata().setGoals(newval);
	}

	private Term getGoals() {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.getGoals();
		if (fdata == null)
			return Prolog.True;
		return getFdata().getGoals();
	}

	public void setAttrs(Term newval) {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this) {
			drefAttrs.setAttrs(newval);
			return;
		}
		getFdata().setAttrs(newval);
	}

	public Term getAttrs() {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.getAttrs();
		if (fdata == null)
			return Prolog.Nil;
		return getFdata().getAttrs();
	}

	public boolean isFVar() {
		Term drefAttrs = drefAttrs();
		if (drefAttrs != this)
			return drefAttrs.isFVar();
		return isVariable() && isFrozen();
	}

	@Override
	public int intValue() {
		return (int) longValue();
	}

	public boolean unifyInt(int i, Trail trail) {
		return intValue() == i;
	}

	public SymbolTerm asSymbolTerm() {
		return (SymbolTerm) this;
	}

	/**
	 * @return the value
	 */
	public Term getValue() {
		return this;
	}

	/**
	 * @return the fdata
	 */
	public FrozenData getFdata() {
		if (fdata == null)
			fdata = new FrozenData();
		return fdata;
	}

	private FrozenData fdata = null;

	/**
	 * @param fdata
	 *            the fdata to set
	 */
	// public void setFdata(FrozenData fdata) {
	// this.fdata = fdata;
	// }
	public boolean isAlias() {
		return false;
	}

	@Override
	public double doubleValue() {
		return longValue();
	}

	public Term functor() {
		// TODO Auto-generated method stub
		System.out.println("general functor on terms not available");
		return null;
	}

	Term zowner;

	public MapTerm join(Term term) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isMap() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean pbind(Term variableTerm, Trail trail) {
		// TODO Auto-generated method stub
		oopsy();
		return false;
	}

	public void toString(StringBuilder sb) {
		toStringImpl(1, sb);
	}

	public Object object() {
		// TODO Auto-generated method stub
		return this;
	}

	public Class getClazz() {
		return object().getClass();
	}

	public StructureTerm asStructureTerm() {
		// TODO Auto-generated method stub
		return (StructureTerm) this;
	}

	public void setArg(int i, Term value) {
		setarg0(null, i, value);
	}
	//

	public ListTerm asListTerm() {
		// TODO Auto-generated method stub
		return (ListTerm) object();
	}

	public LongTerm asIntegerTerm() {
		// TODO Auto-generated method stub
		return (LongTerm) object();
	}

	public ClosureTerm asClosureTerm() {
		// TODO Auto-generated method stub
		return (ClosureTerm) object();
	}

	public VariableTerm asVariableTerm() {
		// TODO Auto-generated method stub
		return (VariableTerm) object();
	}

	public LongTerm asLongTerm() {
		// TODO Auto-generated method stub
		return (LongTerm) object();
	}

	public HashtableOfTerm asHashtableOfTerm() {
		// TODO Auto-generated method stub
		return (HashtableOfTerm) object();
	}

	public NumberTerm asNumberTerm() {
		// TODO Auto-generated method stub
		return (NumberTerm) object();
	}

	public MapTerm asMapTerm() {
		// TODO Auto-generated method stub
		return (MapTerm) object();
	}

    public boolean unifyS(SymbolTerm f, Trail trail, Term... va) {
        // TODO Auto-generated method stub
        return unify(S(f,va), trail);
    }
}
