package com.googlecode.prolog_cafe.lang;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Variable.<br>
 * The <code>VariableTerm</code> class represents a logical variable.<br>
 * For example,
 * <pre>
 *   Term t = new VariableTerm();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class VariableTerm extends Term implements Undoable {
    /** A CPF time stamp when this object is newly constructed. */
    private long timeStamp;
    /** Variable terms, that reference to (use value of) this one */  
    private List<VariableTerm> upRef = null;
    /** Opposite reference to upRef */
    private VariableTerm downRef = null;

    /** Constructs a new logical variable so that
     * the <code>timeStamp</code> field is set to <code>Long.MIN_VALUE</code>.
     */
	public VariableTerm() {
		val = this;
		timeStamp = Long.MIN_VALUE;
	}

    /** Constructs a new logical variable so that
     * the <code>timeStamp</code> field is set to the current value of
     * <code>CPFTimeStamp</code> of the specified Prolog engine.
     * @param engine Current Prolog engine.
     * @see Prolog#getCPFTimeStamp
     */
	public VariableTerm(Prolog engine) {
		val = this;
		timeStamp = engine.getCPFTimeStamp();
	}

    /** Returns a string representation of this object.*/
    private final String variableName() { return "_" + Integer.toHexString(hashCode()).toUpperCase(); }

    /* Term */
    /** 
     * Checks whether the argument term is unified with this one.
     * If this is an unbound variable, the <code>unify</code> method binds this to 
     * the dereferenced value of argument term: <code>bind(t.dereference(), trail)</code>,
     * and returns <code>true</code>.
     * Otherwise, it returns a <code>boolean</code> whose value is <code>val.unify(t, trail)</code>.
     * @param t the term to be unified with.
     * @param trail Trail Stack.
     * @return <code>true</code> if succeeds, otherwise <code>false</code>.
     * @see #val
     * @see #bind(Term,Trail)
     * @see Trail
     */
	public final boolean unify(Term t, Trail trail) {
		return (val instanceof VariableTerm) ? ((VariableTerm) val).bind(t.dereference(), trail) : val.unify(t, trail);
	}
	
	private final void updateUpRef(Term value) {
		if (upRef==null || upRef.isEmpty()){ // short cut
			val = value;
			return;
		}
		Deque<VariableTerm> queue = new ArrayDeque<VariableTerm>();
		queue.add(this);
		while (!queue.isEmpty()){
			VariableTerm v = queue.poll();			
			v.val = value;
			if (v.upRef!=null) {
				for (VariableTerm u: v.upRef){
					if (u.val!=value){ // queue only not visited variable terms
						queue.add(u);
					}
				}
			}
		}		
	}
	
	private final void bindUpRef(VariableTerm upVariable){
		if (this.upRef==null){
			this.upRef = new ArrayList<VariableTerm>(4);
		}
		this.upRef.add(upVariable);
		upVariable.downRef = this;
		upVariable.updateUpRef(this.val);
	}
	
    /** 
     * Binds this variable to a given term. 
     * And pushs this variable to trail stack if necessary. 
     * @param p a term to be bound.
     * @param trail Trail Stack
     * @see Trail
     */
	public final boolean bind(Term p, Trail trail) {
		if (p instanceof VariableTerm){
			VariableTerm v = (VariableTerm) p, t = this;
			if (v.timeStamp >= this.timeStamp){
				t = v;
				v = this;
			}
			v.bindUpRef(t);
			if (t.timeStamp < trail.timeStamp){
				trail.push(t);
			}
			return true;
		}
		// update upRefs to use value t
		updateUpRef(p);
		downRef = null;
		if (timeStamp < trail.timeStamp){
			trail.push(this);
		}
		return true;
	}

    /** 
     * Checks whether this object is convertible with the given Java class type 
     * if this variable is unbound.
     * Otherwise, returns the value of <code>val.convertible(type)</code>.
     * @param type the Java class type to compare with.
     * @return <code>true</code> if this (or dereferenced term) is 
     * convertible with <code>type</code>. Otherwise <code>false</code>.
     * @see #val
     */
	public final boolean convertible(Class type) {
		return (val != this)?val.convertible(type):convertible(this.getClass(), type);
	}

    /** 
     * Returns a copy of this object if unbound variable.
     * Otherwise, returns the value of <code>val.copy(engine)</code>.
     * @see #val
     */
	protected Term copy(IdentityHashMap<VariableTerm,VariableTerm> copyHash) {
		if (val instanceof VariableTerm) {
			VariableTerm co = copyHash.get(val);
			if (co == null) {
				co = new VariableTerm();
				copyHash.put((VariableTerm) val, co);
			}
			return co;
		} else {
			return val.copy(copyHash);
		}
	}

	public final boolean isGround() {
		return (val != this) ? val.isGround() : false;
	}

	public final String name() {
		return (val == this) ? "" : val.dereference().name();
	}

    /** 
     * Returns <code>this</code> if this variable is unbound.
     * Otherwise, returns a Java object that corresponds to the dereferenced term:
     * <code>val.toJava()</code>.
     * @return a Java object defined in <em>Prolog Cafe interoperability with Java</em>.
     * @see #val
     */
	public Object toJava() {
		return (val != this) ? val.toJava() : this;
	}

    /**
     * Returns a quoted string representation of this term if unbound.
     * Otherwise, returns the value of dereferenced term:
     * <code>val.toQuotedString()</code>
     * @see #val
     */
    @Override
    public String toQuotedString() {
    	return (val instanceof VariableTerm) ? variableName() : val.toQuotedString();
    }
    /**
     * Adds a quoted string representation of this term if unbound.
     * Otherwise, adds the value of dereferenced term:
     * <code>val.toQuotedString(sb)</code>
     * @see #val
     */
    @Override
    public void toQuotedString(StringBuilder sb) {
		if (val instanceof VariableTerm) {
			sb.append(variableName());
		} else {
			val.toQuotedString(sb);
		} 
    }
    /* Object */
    /**
     * Checks <em>term equality</em> of two terms.
     * This method returns a <code>boolean</code> whose value is
     * (<code>this == obj</code>) if this variable is unbound.
     * Otherwise, it returns the value of <code>val.equals(obj)</code>.
     * @param obj the object to compare with. This must be dereferenced.
     * @return <code>true</code> if this (or dereferenced term) is the same as the argument;
     * <code>false</code> otherwise.
     * @see #val
     * @see #compareTo
    */
	public boolean equals(Object obj) {
		return (val != this) ? val.equals(obj) : this == obj;
	}

    /**
     * Returns a string representation of this term if unbound.
     * Otherwise, returns the value of dereferenced term:
     * <code>val.toString()</code>
     * @see #val
     */
    @Override
    public String toString() {
    	return (val instanceof VariableTerm) ? variableName() : val.toString();
    }
    /**
     * Adds a string representation of this term if unbound.
     * Otherwise, adds the value of dereferenced term:
     * <code>val.toString()</code>
     * @see #val
     */
    @Override
    public void toString(StringBuilder sb) {
		if (val instanceof VariableTerm) {
			sb.append(variableName());
		} else {
			val.toString(sb);
		} 
    }
    
    /**
     * If unbound returns empty iterator, otherwise returns the value's iterator.
     */
    @Override
    public Iterator<Term> iterator(){
    	return (val instanceof VariableTerm) ? Collections.<Term>emptyIterator() : val.iterator();
    }

    /* Undoable */
    public void undo() { 
    	// remove self from references of bound variable
    	if (downRef!=null){
    		// do not use downRef.upRef.remove(this), because it uses equals() which is overriden and is not equivalent to ==
    		Iterator<VariableTerm> it = downRef.upRef.iterator();
    		while(it.hasNext()){
    			if (it.next()==this){
    				it.remove();
    				break;
    			}
    		}
    		downRef = null;
    	}
    	// update references 
    	updateUpRef(this);    	
    }

    /* Comparable */
    /** 
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     * @param anotherTerm the term to compare with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; 
     * a value less than <code>0</code> if this term is <em>before</em> the <code>anotherTerm</code>;
     * and a value greater than <code>0</code> if this term is <em>after</em> the <code>anotherTerm</code>.
     */
	public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
		if (val != this)
			return val.compareTo(anotherTerm);
		if (!anotherTerm.isVariable())
			return BEFORE;
		if (this == anotherTerm)
			return EQUAL;
		int x = this.hashCode() - ((VariableTerm) anotherTerm).hashCode();
		if (x != 0)
			return x;
		throw new InternalException("VariableTerm is not unique");
	}

	@Override
	public final boolean isImmutable() {
		return false;
	}
}
