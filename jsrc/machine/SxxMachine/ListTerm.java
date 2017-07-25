package com.googlecode.prolog_cafe.lang;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import com.googlecode.prolog_cafe.lang.Term.TermTreeIterator;
/**
 * List.<br>
 * The class <code>ListTerm</code> represents a list structure.<br>
 * 
 * <pre>
 *  % [1,2]
 *  Term Nil = SymbolTerm.makeSymbol("[]");
 *  Term  n1 = IntegerTerm(1);
 *  Term  n2 = IntegerTerm(2);
 *  Term   t = new ListTerm(n1, new ListTerm(n2, Nil));
 *  
 *  Term car = ((ListTerm)t).car();
 *  Term cdr = ((ListTerm)t).cdr();
 * </pre>
 *
 * Here is sample program for creating a list from <code>1</code> to <code>n</code>.
 * <pre>
 * public static Term makeList(int n) {
 *   Term t = SymbolTerm.makeSymbol("[]");
 *   for (int i=n; i>0; i--) {
 *     t = new ListTerm(new IntegerTerm(i), t);
 *   }
 *   return t;
 * }
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class ListTerm extends Term {
    /** A functor <code>'.' /2</code>. */
    protected static final SymbolTerm SYM_DOT = SymbolTerm.intern(".", 2);

    private final boolean immutable;

    /** Holds the first element of this <code>ListTerm</code>. */
    private final Term car;

    /**
     * Holds the list consisting of all the rest of the elements of 
     * this <code>ListTerm</code> but the first one.
     */
    private final Term cdr;

    /**
     * Constructs a new Prolog list structure
     * such that <code>_car</code> is the first element of this list, and 
     * <code>_cdr</code> is the list consisting of all the rest of the 
     * elements of this list but the first one.
     */
    public ListTerm(Term _car, Term _cdr) { 
		// TODO assert _car!=null;
    	// TODO assert _cdr!=null;
    	car = _car;
		cdr = _cdr;
		immutable = car.isImmutable() && cdr.isImmutable();
    }

    /** Returns the value of <code>car</code>.
     * @see #car
     */
    public final Term car() { return car; }

    /** Returns the value of <code>cdr</code>.
     * @see #cdr
     */
    public Term cdr() { return cdr; }

    /* Term */
    public final boolean unify(Term t, Trail trail) {
		Term p = this;
		t = t.dereference();
		while ((t instanceof ListTerm) && (p instanceof ListTerm)
				&& ((ListTerm) p).car.unify(((ListTerm) t).car, trail)) {
			p = ((ListTerm) p).cdr().dereference();
			t = ((ListTerm) t).cdr().dereference();
		}
		if (t instanceof VariableTerm) {
			return ((VariableTerm) t).bind(p, trail);
		}
		if (p instanceof VariableTerm) {
			return ((VariableTerm) p).bind(t, trail);
		}
		return !(t instanceof ListTerm) && !(p instanceof ListTerm) && p.unify(t, trail);
	}
    
    
    /** 
     * @return the <code>boolean</code> whose value is
     * <code>convertible(List.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    public boolean convertible(Class type) { 
    	return convertible(List.class, type); 
    }

    protected Term copy(IdentityHashMap<VariableTerm,VariableTerm> copyHash) { 
    	if (immutable){
    		return this;
    	}
    	Deque<ListTerm> stack = new ArrayDeque<ListTerm>();
    	Term p = this;
    	while (p instanceof ListTerm && !((ListTerm)p).immutable){
    		ListTerm lt = (ListTerm) p;
    		stack.push(lt);
    		p = lt.cdr().dereference();
    	}
    	p = p.copy(copyHash);
    	while (!stack.isEmpty()){
    		ListTerm lt = stack.pop();
			p = new ListTerm(lt.car.copy(copyHash), p);
    	}
    	return p;
    }

    public boolean isGround() {
		return car.isGround() && cdr().isGround();
    }

    public final String name() { return SYM_DOT.name(); }

    public Term arg(int nth) {
      Term t = this;
      int old_nth = nth;
      while ((t instanceof ListTerm) && 0 < nth) {
        nth--;
        t = ((ListTerm)t).cdr().dereference();
      }
      if ((t instanceof ListTerm))
        return ((ListTerm)t).car;
      throw new ArrayIndexOutOfBoundsException(old_nth);
    }

    /** Returns the length of this <code>ListTerm</code>. */
    public int length() {
	int count = 0;
	Term t = this;
	while((t instanceof ListTerm)) {
	    count++;
	    t = ((ListTerm)t).cdr().dereference();
	}
	return count;
    }

    /** 
     * Returns a {@code java.util.List} corresponds to this <code>ListTerm</code>
     * according to <em>Prolog Cafe interoperability with Java</em>.
     * @return a {@link java.util.List} object equivalent to
     * this <code>IntegerTerm</code>.
     */
    public List toJava() { 
		List<Object> vec = new ArrayList<Object>();
		Term t = this;
		while((t instanceof ListTerm)) {
		    vec.add(((ListTerm)t).car.dereference().toJava());
		    t = ((ListTerm)t).cdr().dereference();
		}
		if (!t.isNil()){
			vec.add(t);
		}
		return vec;	
    }

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
     * <code>ListTerm</code>, and 
     * all corresponding pairs of elements in the two lists are <em>term-equal</em>.
     * @param obj the object to compare with. This must be dereferenced.
     * @return <code>true</code> if the given object represents a Prolog list
     * equivalent to this <code>ListTerm</code>, false otherwise.
     * @see #compareTo
     */
    public boolean equals(Object obj) {
		return obj instanceof ListTerm && car.equals(((ListTerm) obj).car().dereference()) && cdr().equals(((ListTerm) obj).cdr().dereference());
	}

    public int hashCode() {
	int h = 1;
	h = 31*h + SYM_DOT.hashCode();
	h = 31*h + car.dereference().hashCode();
	h = 31*h + cdr().dereference().hashCode();
	return h;
    }

    /** Adds a string representation of this <code>ListTerm</code> to given StringBuilder instance.
     * Non recursive implementation */
    public void toString(StringBuilder sb){
		TermTreeIterator it = new TermTreeIterator(this);
		while(it.hasNext()){
			it.next().toString(sb);
		}
    }

    @Override
    public Iterator<Term> iterator() {
    	return new ListTermIterator(this);
    }
    
    /**
     * Iterator over terms that make up this ListTerm.
     */
    private static class ListTermIterator implements Iterator<Term> {    	
    	private static final SymbolTerm LEFT_BRACKET = SymbolTerm.intern("[");
		private static final SymbolTerm SEPARATOR = SymbolTerm.intern("|");
		private static final SymbolTerm RIGHT_BRACKET = SymbolTerm.intern("]");
		private static final SymbolTerm COMMA = SymbolTerm.intern(",");
		
		
		private Term current;
    	private int index = 0; 
    	private Term[] tail = null;
    	private boolean comma = false;
    	private boolean first = true;
    	
    	
		public ListTermIterator(Term start) {
			this.current = start;
		}

		@Override
		public boolean hasNext() {
			return current!=null && (tail==null || index<tail.length);
		}

		@Override
		public Term next() {
			Term result;
			if (first) {
				first = false;
				return LEFT_BRACKET;
			} else if (comma){
				comma = false;
				return COMMA;
			} else if (current instanceof ListTerm) {
				result = ((ListTerm)current).car;
				current = ((ListTerm)current).cdr().dereference();
				comma = (current instanceof ListTerm);
			} else if (current.isNil()){
				result = RIGHT_BRACKET;
				current = null;
			} else if (tail==null){
				tail = new Term[]{
					current,
					RIGHT_BRACKET
				};
				result = SEPARATOR;
				index = 0;
			} else if (index<tail.length){
				result = tail[index];
				index++;
			} else {
				throw new NoSuchElementException();
			}
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
	if ((anotherTerm instanceof VariableTerm) || (anotherTerm instanceof NumberTerm) || (anotherTerm instanceof SymbolTerm))
	    return AFTER;
	if ((anotherTerm instanceof StructureTerm)) {
	    int arity = anotherTerm.arity();
	    if (2 != arity)
		return (2 - arity);
	    SymbolTerm functor = ((StructureTerm)anotherTerm).functor();
	    if (! SYM_DOT.equals(functor))
		return SYM_DOT.compareTo(functor);
	}
	Term[] args = new Term[2];
	if ((anotherTerm instanceof ListTerm)) {
	    args[0] = ((ListTerm)anotherTerm).car();
	    args[1] = ((ListTerm)anotherTerm).cdr();
	} else if ((anotherTerm instanceof StructureTerm)) {
	    args = ((StructureTerm)anotherTerm).args();
	} else {
	    return BEFORE;
	}
	Term tmp = car;
	int rc;
	for (int i=0; i<2; i++) {
	    rc = tmp.compareTo(args[i].dereference());
	    if (rc != EQUAL) 
		return rc;
	    tmp = cdr();
	}
	return EQUAL;
    }

	@Override
	public final boolean isImmutable() {
		return immutable;
	}

	/**
	 * adds given term to the end of the list.
	 * Default implementation recreates the whole list and returns reference to new list,
	 * because the original list can be immutable.
	 * */
	public ListTerm add(Term term) {
		Deque<Term> stack = new ArrayDeque<Term>();
		Term t = this;
		while (t instanceof ListTerm){
			ListTerm lt = (ListTerm) t;
			stack.push(lt.car.dereference());
			t = lt.cdr().dereference();
		}
		t = new ListTerm(term, Prolog.Nil);
		while (!stack.isEmpty()){
			t = new ListTerm(stack.pop(), t);
		}
		return (ListTerm) t;
	}

}
