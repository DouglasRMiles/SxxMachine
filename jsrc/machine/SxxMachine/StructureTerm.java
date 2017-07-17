package com.googlecode.prolog_cafe.lang;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

import com.googlecode.prolog_cafe.lang.Term.TermTreeIterator;

/**
 * Compound term. <br>
 * The <code>StructureTerm</code> class represents a compound term but list.<br>
 *
 * <pre>
 *  % father(abraham, X)
 *  Term a1 = SymbolTerm.makeSymbol("abraham");
 *  Term a2 = new VariableTerm();
 *  Term[] a3 = {a1, a2};
 *  Term a4 = SymbolTerm.makeSymbol("father", 2);
 *  Term  t = new StructureTerm(a4, a3);
 *  
 *  Term functor = ((StructureTerm)t).functor();
 *  Term[]  args = ((StructureTerm)t).args();
 *  int    arity = ((StructureTerm)t).arity();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class StructureTerm extends Term {
    /** Holds the functor symbol of this <code>StructureTerm</code>. */
	private final String name;

    /** Holds the argument terms of this <code>StructureTerm</code>. */
    private final Term[] args;

    private final boolean immutable;

    /**
     * Constructs a new Prolog compound term
     * such that <code>name</code> is the functor symbol, and
     * <code>args</code> is the argument terms respectively.
     */
    public StructureTerm(String name, Term... _args){
    	this.name = name;
		args = _args;
		int i = args.length-1;
		while(i>=0 && args[i].isImmutable()){
			i--;
		}
		immutable = i<0;
    }

    /**
     * Constructs a new Prolog compound term
     * such that <code>_functor</code> is the functor symbol, and 
     * <code>_args</code> is the argument terms respectively.
     */
	public StructureTerm(SymbolTerm _functor, Term... _args) {
		if (_functor.arity() != _args.length)
			throw new InternalException("Invalid argument length in StructureTerm");
		name = _functor.name();
		args = _args;
		int i=args.length-1;
		while(i>=0 && args[i].isImmutable()){
			i--;
		}
		immutable = i<0;
	}

    /** Returns the functor symbol of this <code>StructureTerm</code>.
     * @return the value of <code>functor</code>.
     * @see #functor
     */
    public final SymbolTerm functor(){ return SymbolTerm.intern(name, args.length); }

    /** Returns the arity of this <code>StructureTerm</code>.
     * @return the value of <code>arity</code>.
     * @see #arity
     */
    public final int arity(){ return args.length; }

    /** Returns the argument terms of this <code>StructureTerm</code>.
     * @return the value of <code>args</code>.
     * @see #args
     */
    public final Term[] args(){ return args; }

    /** Returns the string representation of functor symbol of this <code>StructureTerm</code>.
     * @return a <code>String</code> whose value is <code>functor.name()</code>.
     * @see #functor
     * @see SymbolTerm#name
     */
    public final String name(){ return name; }

    public final Term arg(int nth) { return args[nth]; }

	public final boolean unify(Term t, Trail trail) {
		t = t.val; // fast dereference //t = t.dereference();
		if (t instanceof VariableTerm) {
			return ((VariableTerm) t).bind(this, trail);
		}
		if (!(t instanceof StructureTerm)){
			return false;
		}
			
		StructureTerm st = (StructureTerm) t;
		if (args.length!=st.args.length || !name.equals(st.name)){
			return false;
		}
    	for(int i=0; i<args.length; i++) {
    		if (!args[i].unify(st.args[i], trail)){
    			return false;
    		}
		}
    	return true;
	}

	protected Term copy(IdentityHashMap<VariableTerm,VariableTerm> copyHash) {
		if (immutable){
			return this;
		}
		Term[] a = new Term[args.length];
		int len = args.length;
		for (int i = 0; i < len; i++) {
			a[i] = args[i].copy(copyHash);
		}
		return new StructureTerm(name, a);
	}

	@Override
	public final boolean isImmutable(){
		return immutable;
	}

    public final boolean isGround() {
    	for (Term t: args){
    		if (!t.isGround()){
    			return false;
    		}
    	}
    	return true;
    }
    /** Adds a quoted string representation of this <code>StructureTerm</code> to given StringBuilder instance 
     * Non recursive implementation
     * */
	@Override
    public void toQuotedString(StringBuilder sb){
		TermTreeIterator it = new TermTreeIterator(this);
		while(it.hasNext()){
			it.next().toQuotedString(sb);
		}
    }

    /* Object */
    /**
     * Checks <em>term equality</em> of two terms.
     * The result is <code>true</code> if and only if the argument is an instance of
     * <code>StructureTerm</code>, has the same functor symbol and arity, and
     * all corresponding pairs of arguments in the two compound terms are <em>term-equal</em>.
     * @param obj the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog compound term
     * equivalent to this <code>StructureTerm</code>, false otherwise.
     * @see #compareTo
     */
	public boolean equals(Object obj) {
		if (!(obj instanceof StructureTerm))
			return false;
		StructureTerm st = (StructureTerm) obj;
		if (!name.equals(st.name) || args.length!=st.args.length)
			return false;
		for (int i = 0; i < args.length; i++) {
			if (!args[i].equals(st.args[i].dereference()))
				return false;
		}
		return true;
	}

	public int hashCode() {
		int h = 1;
		h = 31 * h + name.hashCode();
		for (Term arg : args) {
			h = 31 * h + arg.dereference().hashCode();
		}
		return h;
	}

    /** Adds a string representation of this <code>StructureTerm</code> to given StringBuilder instance. 
     * Non recursive implementation
     * */
	@Override
    public void toString(StringBuilder sb){
		TermTreeIterator it = new TermTreeIterator(this);
		while(it.hasNext()){
			it.next().toString(sb);
		}
    }

	@Override
	public Iterator<Term> iterator() {
		return new StructureTermIterator(functor(), args);
	}

	private static class StructureTermIterator implements Iterator<Term>{
		private static final SymbolTerm COMMA = SymbolTerm.intern(",");
		private static final SymbolTerm RIGHT_BRACKET = SymbolTerm.intern(")");
		private static final SymbolTerm LEFT_BRACKET = SymbolTerm.intern("(");
		private int index = -2;
		private final Term functor;
		private final Term[] args;
		private final int length;
		private boolean comma = false;
		
		StructureTermIterator(Term functor, Term[] args) {
			this.functor = functor;
			this.args = args;
			length = args.length;
		}

		@Override
		public boolean hasNext() {
			return index<=length;
		}

		@Override
		public Term next() {
			Term result;
			if (index==-2){
				result = functor;
			} else if (index==-1){
				result = LEFT_BRACKET;
			} else if (comma){
				comma = false;
				return COMMA;
			} else if (index<length){
				result = args[index];
				comma = (index!=length-1);
			} else {
				result = RIGHT_BRACKET;
			}
			index++;
			return result;
		}		
	}
	

    /* Comparable */
    /** 
     * Compares two terms in <em>Prolog standard order of terms</em>.<br>
     * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
     * <code>boolean</code> value as <code>t1.equals(t2)</code>.
     * @param anotherTerm the term to compared with. It must be dereferenced.
     * @return the value <code>0</code> if two terms are identical; 
     * a value less than <code>0</code> if this term is <em>before</em> the <code>anotherTerm</code>;
     * and a value greater than <code>0</code> if this term is <em>after</em> the <code>anotherTerm</code>.
     */
	public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
		SymbolTerm functor, functor2;
		Term[] args2;
		int arity2, rc;

		if ((anotherTerm instanceof VariableTerm) || (anotherTerm instanceof NumberTerm) || (anotherTerm instanceof SymbolTerm))
			return AFTER;
		if ((anotherTerm instanceof ListTerm)) {
			ListTerm t = (ListTerm) anotherTerm;
			functor2 = ListTerm.SYM_DOT;
			args2 = new Term[2];
			args2[0] = t.car();
			args2[1] = t.cdr();
			arity2 = 2;
		} else if ((anotherTerm instanceof StructureTerm)) {
			StructureTerm s = (StructureTerm) anotherTerm;
			functor2 = s.functor();
			args2 = s.args();
			arity2 = s.arity();
		} else {
			return BEFORE;
		}
		if (args.length != arity2)
			return (args.length - arity2);
		functor = functor();
		if (!functor.equals(functor2))
			return functor.compareTo(functor2);
		for (int i = 0; i < args.length; i++) {
			rc = args[i].compareTo(args2[i].dereference());
			if (rc != EQUAL)
				return rc;
		}
		return EQUAL;
	}
}
