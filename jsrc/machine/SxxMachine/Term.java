package com.googlecode.prolog_cafe.lang;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The superclass of classes for term structures.
 * The subclasses of <code>Term</code> must override
 * the <code>unify</code> method.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public abstract class Term implements Comparable<Term> {

    /** Holds an integer value <code>0</code>. */
    public static final int EQUAL  =  0;
    /** Holds an integer value <code>1</code>. */
    public static final int AFTER  =  1;
    /** Holds an integer value <code>-1</code>. */
    public static final int BEFORE = -1;

    /**
     * Checks whether the argument term is unified with this one.
     * @param t the term to be unified with.
     * @param trail Trail Stack.
     * @return <code>true</code> if succeeds, otherwise <code>false</code>.
     */
    abstract public boolean unify(Term t, Trail trail);
    /** 
     * 
     * @return true if this term is immutable, i.e. can not be changed
     */
    public abstract boolean isImmutable();

    /**
     * Check whether this term is a logical variable.
     * @return <code>true</code> if <code>this instanceof VariableTerm</code>,
     * otherwise <code>false</code>.
     * @see VariableTerm
     */
    public final boolean isVariable() { return this instanceof VariableTerm; }

    /**
     * Check whether this term is an integer.
     * @return <code>true</code> if <code>this instanceof IntegerTerm</code>,
     * otherwise <code>false</code>.
     * @see IntegerTerm
     */
    public final boolean isInteger() { return this instanceof IntegerTerm; }

    /**
     * Check whether this term is a float.
     * @return <code>true</code> if <code>this instanceof DoubleTerm</code>,
     * otherwise <code>false</code>.
     * @see DoubleTerm
     */
    public final boolean isDouble() { return this instanceof DoubleTerm; }

    /**
     * Check whether this term is a long.
     * @return <code>true</code> if <code>this instanceof LongTerm</code>,
     * otherwise <code>false</code>.
     * @see LongTerm
     */
    public final boolean isLong() { return this instanceof LongTerm; }

    /**
     * Check whether this term is a number.
     * @return <code>true</code> if <code>this instanceof IntegerTerm || this instanceof DoubleTerm</code>,
     * otherwise <code>false</code>.
     * @see IntegerTerm
     * @see DoubleTerm
     */
    public final boolean isNumber() {
    	return ((this instanceof IntegerTerm) || (this instanceof LongTerm) ||(this instanceof DoubleTerm));
    }

    /**
     * Check whether this term is an atom.
     * @return <code>true</code> if <code>this instanceof SymbolTerm</code>,
     * otherwise <code>false</code>.
     * @see SymbolTerm
     */
    public final boolean isSymbol() { return this instanceof SymbolTerm; }

    /** Check whether this term is an empty list. */
    public final boolean isNil() { return Prolog.Nil.equals(this); }

    /**
     * Check whether this term is a list structure.
     * @return <code>true</code> if <code>this instanceof ListTerm</code>,
     * otherwise <code>false</code>.
     * @see ListTerm
     */
    public final boolean isList() { return this instanceof ListTerm; }

    /**
     * Check whether this term is a compound term.
     * @return <code>true</code> if <code>this instanceof StructureTerm</code>,
     * otherwise <code>false</code>.
     * @see StructureTerm
     */
    public final boolean isStructure() { return this instanceof StructureTerm; }

    /**
     * Check whether this term is a java term.
     * @return <code>true</code> if <code>this instanceof JavaObjectTerm</code>,
     * otherwise <code>false</code>.
     * @see JavaObjectTerm
     */
    public final boolean isJavaObject() { return this instanceof JavaObjectTerm; }

    /**
     * Check whether this term is a closure term.
     * @return <code>true</code> if <code>this instanceof ClosureTerm</code>,
     * otherwise <code>false</code>.
     * @see ClosureTerm
     */
    public final boolean isClosure() { return this instanceof ClosureTerm; }

    /** @return the name of this Term, if {@link #isStructure()}. */
    public abstract String name();

    /** @return the arity of this Term, if {@link #isStructure()}. */
	public int arity() { return 0; }

    /** @return get the nth argument of {@link #isStructure()} or {@link #isList()}. */
    public Term arg(int nth) { throw new ArrayIndexOutOfBoundsException(nth); }

    /**
     * Check whether this object is convertible with the given Java class type.
     * @param type the Java class type to compare with.
     * @return <code>true</code> if this is convertible with
     * <code>type</code>. Otherwise <code>false</code>.
     * @see #convertible(Class, Class)
     */
    public boolean convertible(Class type) { return convertible(getClass(), type); }

    /** Returns a copy of this object. */
    protected Term copy(Prolog engine) { return this; }

    /** Returns the dereference value of this term. */
    public Term    dereference() { return this; }

    /**
     * Check whether this term is a ground term.
     * @return <code>true</code> if ground, otherwise <code>false</code>.
     */
    public boolean isGround() { return true; }

    /**
     * Returns a Java object that corresponds to this term
     * if defined in <em>Prolog Cafe interoperability with Java</em>.
     * Otherwise, returns <code>this</code>.
     * @return a Java object if defined in <em>Prolog Cafe interoperability with Java</em>,
     * otherwise <code>this</code>.
     */
    public Object  toJava() {
	return this;
    }

    /**
     * Check whether there is a widening conversion from <code>from</code> to <code>to</code>.
     */
    protected static boolean convertible(Class from, Class<?> to) {
	if (from == null)
	    return ! to.isPrimitive();
	if (to.isAssignableFrom(from)) {
	    return true;
	} else if (to.isPrimitive()) {
	    if (from.equals(Boolean.class)) {
		return to.equals(Boolean.TYPE);
	    } else if (from.equals(Byte.class)) {
		return to.equals(Byte.TYPE)
		    || to.equals(Short.TYPE)
		    || to.equals(Integer.TYPE)
		    || to.equals(Long.TYPE)
		    || to.equals(Float.TYPE)
		    || to.equals(Double.TYPE);
	    } else if (from.equals(Short.class)) {
		return to.equals(Short.TYPE)
		    || to.equals(Integer.TYPE)
		    || to.equals(Long.TYPE)
		    || to.equals(Float.TYPE)
		    || to.equals(Double.TYPE);
	    } else if (from.equals(Character.class)) {
		return to.equals(Character.TYPE)
		    || to.equals(Integer.TYPE)
		    || to.equals(Long.TYPE)
		    || to.equals(Float.TYPE)
		    || to.equals(Double.TYPE);
	    } else if (from.equals(Integer.class)) {
		return to.equals(Integer.TYPE)
		    || to.equals(Long.TYPE)
		    || to.equals(Float.TYPE)
		    || to.equals(Double.TYPE);
	    } else if (from.equals(Long.class)) {
		return to.equals(Long.TYPE)
		    || to.equals(Float.TYPE)
		    || to.equals(Double.TYPE);
	    } else if (from.equals(Float.class)) {
		return to.equals(Float.TYPE)
		    || to.equals(Double.TYPE);
	    } else if (from.equals(Double.class)) {
		return to.equals(Double.TYPE);
	    }
	}
	return false;
    }

    /** Checks whether a given object is an instance of Prolog term. */
    public static boolean instanceOfTerm(Object obj) {
	return obj instanceof VariableTerm ||
	    obj instanceof IntegerTerm ||
	    obj instanceof LongTerm ||
	    obj instanceof DoubleTerm ||
	    obj instanceof SymbolTerm ||
	    obj instanceof ListTerm ||
	    obj instanceof StructureTerm ||
	    obj instanceof JavaObjectTerm ||
	    obj instanceof ClosureTerm;
    }
    /** 
     * <p>Returns Iterator over terms that make up this term. 
     * Should return empty iterator if this term is not compound, 
     * i.e SymbolTerm, NumberTerm, etc.
     * <p>The method is used in non-recursive implementation of {@link #toString()}
     *  */
    public Iterator<Term> iterator() {
    	return Collections.<Term>emptyIterator();
    }
    
    /** Adds a string representation of this term to given StringBuilder instance. */
    public abstract void toString(StringBuilder sb);

    /** Adds a quoted string representation of this term to given StringBuilder instance. */    
    public abstract void toQuotedString(StringBuilder sb);
    
    /** Returns a string representation of this term. */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		TermTreeIterator it = new TermTreeIterator(this);
		while(it.hasNext()){
			it.next().toString(sb);
		}
		return sb.toString();
    }
	
	/** Returns a quoted string representation of this term. */
	public String toQuotedString() {
		StringBuilder sb = new StringBuilder();
		TermTreeIterator it = new TermTreeIterator(this);
		while(it.hasNext()){
			it.next().toQuotedString(sb);
		}
		return sb.toString();
    }
	
	/**
	 * Iterator over all terms that make up this term. 
	 * Uses DFS to iterate over terms tree. 
	 */
	public static class TermTreeIterator implements Iterator<Term> {
		private final Deque<Iterator<Term>> stack = new ArrayDeque<Iterator<Term>>();
		public TermTreeIterator(Term start){
			stack.push(Collections.singleton(start).iterator());
		}
		
		@Override
		public boolean hasNext() {
			while (!stack.isEmpty() && !stack.peek().hasNext()){
    			stack.pop();
			}
			return !stack.isEmpty();
		}

		@Override
		public Term next() {
	    	while (!stack.isEmpty()){
	    		Iterator<Term> i = stack.peek();
	    		if (i.hasNext()){
	    			Term t = i.next();
	    			Iterator<Term> it = t.iterator();
	    			if (it.hasNext()){
	    				stack.push(it);
	    			} else {
	    				return t;
	    			}    			
	    		} else {
	    			stack.pop();
	    		}    	
	    	}
	    	throw new NoSuchElementException();
		}
	}
}
