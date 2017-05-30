package com.googlecode.prolog_cafe.lang;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Atom.<br>
 * The <code>SymbolTerm</code> class represents a Prolog atom.<br>
 *
 * <pre>
 *   Term t = SymbolTerm.makeSymbol("kobe");
 *   String name = ((SymbolTerm)t).name();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public abstract class SymbolTerm extends Term {
    /** Symbol table. */
    private static final ConcurrentHashMap<Key, InternRef> SYMBOL_TABLE =
      new ConcurrentHashMap<Key, InternRef>();

    private static final ReferenceQueue<Interned> DEAD = new ReferenceQueue<Interned>();

    private static final class Key {
      final String name;
      final int arity;

      Key(String n, int a) {
        name = n;
        arity = a;
      }

      @Override
      public int hashCode() {
        return name.hashCode();
      }

      @Override
      public boolean equals(Object other) {
        Key k = (Key) other;
        return arity == k.arity && name.equals(k.name);
      }
    }

    private static final class InternRef extends WeakReference<Interned> {
      final Key key;

      InternRef(Key key, Interned sym) {
        super(sym, DEAD);
        this.key = key;
      }
    }

    private static final class Dynamic extends SymbolTerm {
      Dynamic(String name, int arity) {
        super(name, arity);
      }
    }

    private static final class Interned extends SymbolTerm {
      Interned(String name, int arity) {
        super(name, arity);
      }
    }
    
    private static final class Partial extends SymbolTerm {
        private int hash = 0;
    	
    	Partial(String name, int arity, int start, int finish){
    		super(name, arity, start, finish);
    	}
    	
        @Override
        public boolean equals(Object obj) {
        	if (this==obj){
        		return true;
        	} else if (obj instanceof SymbolTerm){
        		SymbolTerm that = (SymbolTerm) obj;
        		int thisLength = finish - start;
        		int thatLength = that.finish - that.start; 		
        		return this.arity==that.arity && (thisLength==thatLength) &&    				
        				this.name.regionMatches(start, that.name, that.start, thisLength);
        	}
        	return false;        	
        }
        
        @Override
        public boolean unify(Term t, Trail trail) {
            t = t.dereference();
            return (t instanceof VariableTerm) ? ((VariableTerm) t).bind(this, trail) : equals(t);
        }
        
        @Override
        public int hashCode() {
            int h = hash;
			if (h == 0 && finish-start > 0) {
				h = name.substring(start, finish).hashCode(); // use the same hashCode function as in SymbolTerm
				hash = h;
			}
            return h;
        }
        
        @Override
        public final String name() {
        	return name.substring(start, finish);
        }
        
        @Override
        public String toString() { return name(); }
        
        public Object toJava() { return name(); }
        
        @Override // Overridden for performance
        public String toQuotedString() { return Token.toQuotedString(name()); }
        
        @Override
        public void toString(StringBuilder sb){
        	sb.append(name());
        }
        @Override
        public void toQuotedString(StringBuilder sb){
        	Token.toQuotedString(name(), sb);
        }
    }

    private static final SymbolTerm colon2 = intern(":", 2);

    /** Returns a Prolog atom for the given character. */
    public static SymbolTerm create(char c) {
      if (0 <= c && c <= 127)
        return intern(Character.toString(c), 0);
      else
        return create(Character.toString(c));
    }

    /** Returns a Prolog atom for the given name. */
    public static SymbolTerm create(String _name) {
      return new Dynamic(_name, 0);
    }

    /** Returns a Prolog atom for the given name. */
    public static SymbolTerm create(String _name, int arity) {
      // For a non-zero arity try to reuse the term, its probable this is a
      // structure term and those are more commonly declared in code
      // to be a type of object the code manipulates, therefore also very
      // likely to already be in the cache.
      if (arity != 0)
        return softReuse(_name, arity);

      return new Dynamic(_name, 0);
    }

    /** Returns a Prolog functor for the given name and arity. */
    public static StructureTerm create(String pkg, String name, int arity) {
      // This is likely a specific function that exists in code, so try to reuse
      // the symbols that are involved in the term.
      return new StructureTerm(colon2, softReuse(pkg, 0), softReuse(name, arity));
    }

    /** Returns a Prolog atom for the given name. */
    public static SymbolTerm intern(String _name) {
    	return intern(_name, 0);
    }

    /** Returns a Prolog functor for the given name and arity. */
    public static SymbolTerm intern(String _name, int _arity) {
//      _name = _name.intern();
      Key key = new Key(_name, _arity);

      Reference<? extends Interned> ref = SYMBOL_TABLE.get(key);
      if (ref != null) {
        Interned sym = ref.get();
        if (sym != null)
          return sym;
        SYMBOL_TABLE.remove(key, ref);
        ref.enqueue();
      }

      gc();

      Interned sym = new Interned(_name, _arity);
      InternRef nref = new InternRef(key, sym);
      InternRef oref = SYMBOL_TABLE.putIfAbsent(key, nref);
      if (oref != null) {
        SymbolTerm osym = oref.get();
        if (osym != null)
          return osym;
      }
      return sym;
    }

    static void gc() {
      Reference<? extends Interned> ref;
      while ((ref = DEAD.poll()) != null) {
        SYMBOL_TABLE.remove(((InternRef) ref).key, ref);
      }
    }

    private static SymbolTerm softReuse(String _name, int _arity) {
      Key key = new Key(_name, _arity);
      Reference<? extends Interned> ref = SYMBOL_TABLE.get(key);
      if (ref != null) {
        Interned sym = ref.get();
        if (sym != null)
          return sym;
        SYMBOL_TABLE.remove(key, ref);
        ref.enqueue();
      }

      // If reuse wasn't possible, construct the term dynamically.
      return new Dynamic(_name, _arity);
    }

    /** Holds a string representation of this <code>SymbolTerm</code>.
     *  The string can be shared (partially) with other <code>SymbolTerm</code> instances */
    protected final String name;

    /** Holds the arity of this <code>SymbolTerm</code>. */
    protected final int arity;
    /** Holds start index in name */
    protected final int start;
    /** Holds end Index in name */
    protected final int finish;

    /** Constructs a new Prolog atom (or functor) with the given symbol name and arity. */
    protected SymbolTerm(String _name, int _arity) {
		name  = _name==null?"":_name;
		arity = _arity;
		start = 0;
		finish = name.length();
    }

    /** Constructs a new Prolog atom (or functor) with the given symbol name, arity and start/finish. */
    protected SymbolTerm(String _name, int _arity, int start, int finish) {
		name  = _name==null?"":_name;
		arity = _arity;
		this.start = start;
		this.finish = finish;
    }

    /** Returns the arity of this <code>SymbolTerm</code>.
     * @return the value of <code>arity</code>.
     * @see #arity
     */
    public final int arity() { return arity; }

    /** Returns the string representation of this <code>SymbolTerm</code>.
     * @return the value of <code>name</code>.
     * @see #name
     */
    public String name() {
    	return name;
    }

    public final int start() { return start; }

    public final int finish() {return finish; }

    public final String base() { return name; }

    /**
     * Creates and return new {@link SymbolTerm} instance that shares the name string with this instance,
     * but name of new instance is a substring of this name starting from given beginIndex.
     * @param beginIndex
     * @return
     */
    public SymbolTerm subsymbol(int beginIndex) {
    	if (beginIndex<0){
    		throw new StringIndexOutOfBoundsException(beginIndex);
    	}
    	int subLen = finish-start-beginIndex;
    	if (subLen<0){
    		throw new StringIndexOutOfBoundsException(subLen);
    	}

    	return (beginIndex == 0) ? this : new Partial(name, arity, start+beginIndex, finish);
    }
    /**
     * Creates and return new {@link SymbolTerm} instance that shares the name string with this instance,
     * but name of new instance is a substring of this name starting from given beginIndex and ending before endIndex.
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public SymbolTerm subsymbol(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > finish-start) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((beginIndex == 0) && (endIndex == finish-start)) ? this
                : new Partial(name, arity, start+beginIndex, start+endIndex);
    }

    public SymbolTerm concat(SymbolTerm that){
    	StringBuilder sb = new StringBuilder(this.finish-this.start+that.finish-that.start());
    	sb.append(this.name, this.start, this.finish);
    	sb.append(that.name, that.start, that.finish);
    	return SymbolTerm.create(sb.toString());
    }

    /**
     * Returns the name length
     * @return
     */
    public int length() {
    	return finish - start;
    }

    // TODO startsWith(), endsWith(), indexOf()

    /* Term */
    public boolean unify(Term t, Trail trail) {
      t = t.val; // fast dereference
      return (t instanceof VariableTerm) ? ((VariableTerm) t).bind(this, trail) : 
    	  ((t instanceof Partial) ? t.unify(this, trail) : 
    		  ((t instanceof SymbolTerm) && (arity==((SymbolTerm)t).arity) && name.equals(((SymbolTerm)t).name)));
    }

    @Override
    public int hashCode() {
    	return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
    	return (obj instanceof Partial) ? ((Partial)obj).equals(this) :
    		((obj instanceof SymbolTerm) && (arity==((SymbolTerm)obj).arity) && name.equals(((SymbolTerm)obj).name));
    }

//    private static boolean eq(SymbolTerm a, Term b0) {
//      if (a == b0) {
//        return true;
//      } else if (b0 instanceof SymbolTerm && (a instanceof Dynamic || b0 instanceof Dynamic)) {
//        SymbolTerm b = (SymbolTerm) b0;
//        return a.arity == b.arity && a.name.equals(b.name);
//      } else {
//        return false;
//      }
//    }

    /**
     * @return the <code>boolean</code> whose value is
     * <code>convertible(String.class, type)</code>.
     * @see Term#convertible(Class, Class)
     */
    public boolean convertible(Class type) { return convertible(String.class, type); }

    /**
     * Returns a <code>java.lang.String</code> corresponds to this <code>SymbolTerm</code>
     * according to <em>Prolog Cafe interoperability with Java</em>.
     * @return a <code>java.lang.String</code> object equivalent to
     * this <code>SymbolTerm</code>.
     */
    public Object toJava() { return name; }

    @Override // Overridden for performance
    public String toQuotedString() { return Token.toQuotedString(name); }

    /** Returns a string representation of this <code>SymbolTerm</code>. */
    @Override // Overridden for performance
    public String toString() { return name; }

    @Override
    public void toString(StringBuilder sb){
    	sb.append(name);
    }
    @Override
    public void toQuotedString(StringBuilder sb){
    	Token.toQuotedString(name, sb);
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
	if ((anotherTerm instanceof VariableTerm) || (anotherTerm instanceof NumberTerm))
	    return AFTER;
	if (! (anotherTerm instanceof SymbolTerm))
	    return BEFORE;
	if (this == anotherTerm)
	    return EQUAL;
	int x = name().compareTo(((SymbolTerm)anotherTerm).name());
	if (x != 0)
	    return x;
	int y = this.arity - ((SymbolTerm)anotherTerm).arity();
//	if (y != 0)
	    return y;
//		throw new InternalException("SymbolTerm is not unique");
    }

    @Override
    public final boolean isImmutable() {
    	return true;
    }
}
