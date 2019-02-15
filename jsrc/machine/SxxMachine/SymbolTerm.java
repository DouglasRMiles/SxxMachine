package SxxMachine;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Atom.<br>
 * The <code>SymbolTerm</code> class represents a Prolog atom.<br>
 *
 * <pre>
 * Term t = SymbolTerm.makeSymbol("kobe");
 * String name = t.asSymbolTerm().name();
 * </pre>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings({ "unused", "rawtypes" })
public abstract class SymbolTerm extends AtomicConst implements NameArity, ISTerm {

    @Override
    public int exec(Prog p) {
        try {
            if (st_exec == null) {
                Init.builtinDict.asBuiltin(this);
            }
            if (st_exec == null) {
                return -1;
            }
            return (int) st_exec.invoke(null, p, this);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public boolean isConst() {
        return true;
    }

    public String name;

    @Override
    public boolean isTrueProc() {
        // TODO Auto-generated method stub
        return fname() == "true";
    }

    public String qname() {
        return MaybeQuoted(this.name);
    }

    static public String MaybeQuoted(String sym) {
        if (true) {
            return Token.toQuotedString(sym);
        }
        if (0 == sym.length())
            return "''";
        if (!sym.contains("\n")) {
            return Token.toQuotedString(sym);
        }
        for (int i = 0; i < sym.length(); i++) {
            if (!Character.isLowerCase(sym.charAt(i)))
                return '\'' + sym + '\'';
        }
        return sym;
    }

    @Override
    public SymbolTerm toClone() throws CloneNotSupportedException {
        return this;
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        if (!super.bind(that, trail))
            return false;
        if (name != null) {
            // name = name.intern();
            String thatn = Expect.asConst(that).fname();
            if (thatn == name)
                return true;
        }
        Term thizf = functor();
        Term thatf = that.functor();
        return thizf == thatf;
    }

    @Override
    public String getKey() {
        return fname() + "/" + arityOrType();
    }

    /**
     * returns an arity normally defined as 0
     * 
     * @see Term#CONST
     */
    @Override
    public int arityOrType() {
        return Term.CONST;
    }

    /**
     * creates a ConstBuiltin from a Const known to be registered as being a builtin
     * while returning its argument unchanged if it is just a plain Prolog constant
     * with no builtin code attached to it
     */

    @Override
    public String toUnquoted() {
        return fname();
    }

    @Override
    public int getIntArg(int i) {
        // TODO Auto-generated method stub
        oopsy();
        return super.getIntArg(i);
    }

    @Override
    public int unifyArg(int i, Term a, Prog p) {
        oopsy();
        return super.unifyArg(i, a, p);
    }

    @Override
    public Term ArgNoDeRef(int i) {
        oopsy();
        return super.ArgNoDeRef(i);
    }

    ExecProg exp;

    public int exec(Prog p, ISTerm thiz) {
        return exp.exec(p, this);
    }

    private Method st_exec;

    @Override
    public void setMethod(Method b) {
        st_exec = b;
    }

    @Override
    public int type() {
        return TYPE_SYMBOL;
    }

    @Override
    public boolean isAtomString() {
        return true;
    }

    /** Symbol table. */
    private static final ConcurrentHashMap<Key, InternRef> SYMBOL_TABLE = new ConcurrentHashMap<Key, InternRef>();

    private static final ReferenceQueue<Interned> DEAD = new ReferenceQueue<Interned>();

    private static final class Key {
        final String name;
        final int arity;

        Key(String n, int a) {
            this.name = n;
            this.arity = a;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode();
        }

        @Override
        public boolean equals(Object other) {
            Key k = (Key) other;
            return this.arity == k.arity && this.name.equals(k.name);
        }
    }

    private static final class InternRef extends WeakReference<Interned> {
        final Key key;

        InternRef(Key key, Interned sym) {
            super(sym, DEAD);
            this.key = key;
        }
    }

    public static class Dynamic extends SymbolTerm {
        protected Dynamic(String name, int arity) {
            super(name, arity);
        }

        protected Dynamic(String name) {
            super(name, -1);
        }

        @Override
        public String toString() {
            int arity = arity();
            return "/*D*/" + fname() + "/" + arity;
        }
    }

    public static final class Interned extends SymbolTerm {
        Interned(String name, int arity) {
            super(name, arity);
        }

        @Override
        public String toString() {
            int arity = arity();
            if (arity == 0)
                return fname();
            return fname() + "/" + arity;
        }
    }

    public static final class Partial extends SymbolTerm {
        private int hash = 0;

        Partial(String name, int arity, int start, int finish) {
            super(name, arity, start, finish);
        }

        @Override
        public String toString() {
            int arity = arity();
            return "/*P" + start + ":" + finish + "*/" + fname() + "/" + arity;
        }

        @Override
        public boolean equalsTerm(Term obj, OpVisitor comparator) {
            if (this == obj) {
                return true;
            } else if (obj.isAtomString()) {
                SymbolTerm that = obj.asSymbolTerm();
                int thisLength = this.finish - this.start;
                int thatLength = that.finish - that.start;
                return this.arity == that.arity && (thisLength == thatLength)
                        && this.name.regionMatches(this.start, that.name, that.start, thisLength);
            }
            return false;
        }

        @Override
        public boolean unifyImpl(Term t, Trail trail) {
            t = t.dref();
            OpVisitor comparator = Term.Unifiable;
            return (t.isVar()) ? (t).bind(this, trail) : equalsTerm(t, comparator);
        }

        @Override
        public int termHashCodeImpl() {
            int h = this.hash;
            if (h == 0 && this.finish - this.start > 0) {
                h = this.name.substring(this.start, this.finish).hashCode(); // use the same hashCode function as in
                                                                             // SymbolTerm
                this.hash = h;
            }
            return h;
        }

        @Override
        public final String fname() {
            return this.name.substring(this.start, this.finish);
        }

        @Override
        public Object toJava() {
            return fname();
        }

        @Override
        public void toStringImpl(int printingFlags, StringBuilder sb) {
            String name = this.fname();
            if (TermData.isQuoted(printingFlags))
                Token.toQuotedString(name, sb);
            else
                sb.append(name);
        }
    }

    private static final SymbolTerm colon2 = intern(":", 2);
    public static final Term GOALS = intern("$goals");

    /** Returns a Prolog atom for the given character. */
    public static SymbolTerm create(char c) {
        if (0 <= c && c <= 127)
            return intern(Character.toString(c), 0);
        else
            return create(Character.toString(c));
    }

    /** Returns a Prolog atom for the given name. */
    public static SymbolTerm create(String _name) {
        return new Dynamic(_name.intern(), 0);
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
        if (_name == null) {
            soopsy();
        }
        _name = _name.intern();
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

    /**
     * Holds a string representation of this <code>SymbolTerm</code>. The string can
     * be shared (partially) with other <code>SymbolTerm</code> instances
     */
    // protected final String name;
    protected final String quoted;
    /** Holds the arity of this <code>SymbolTerm</code>. */
    protected final int arity;
    /** Holds start index in name */
    protected final int start;
    /** Holds end Index in name */
    protected final int finish;

    /**
     * Constructs a new Prolog atom (or functor) with the given symbol name and
     * arity.
     */
    protected SymbolTerm(String _name, int _arity) {

        if (_name != null && _name != "." && _name != ":-") {
            String is = _name.intern();
            if (_name.contains("(") && _name.length() != 1) {
                Prolog.Break(_name);
            }
            if (is != _name) {
                Prolog.Break(_name);
                throw new RuntimeException("const got uninterned string");
            }
        }
        name = _name;

        quoted = Token.toQuotedString(fname());
        this.arity = _arity;
        this.start = 0;
        this.finish = this.name.length();
    }

    /**
     * Constructs a new Prolog atom (or functor) with the given symbol name, arity
     * and start/finish.
     */
    protected SymbolTerm(String _name, int _arity, int start, int finish) {
        // super(_name);
        name = _name;
        quoted = Token.toQuotedString(fname());
        this.arity = _arity;
        this.start = start;
        this.finish = finish;
    }

    /**
     * Returns the arity of this <code>SymbolTerm</code>.
     * 
     * @return the value of <code>arity</code>.
     * @see #arity
     */
    @Override
    public final int arity() {
        return this.arity;
    }

    /**
     * Returns the string representation of this <code>SymbolTerm</code>.
     * 
     * @return the value of <code>name</code>.
     * @see #name
     */
    @Override
    public String fname() {
        return this.name;
    }

    public final int start() {
        return this.start;
    }

    public final int finish() {
        return this.finish;
    }

    public final String base() {
        return this.name;
    }

    /**
     * Creates and return new {@link SymbolTerm} instance that shares the name
     * string with this instance, but name of new instance is a substring of this
     * name starting from given beginIndex.
     * 
     * @param beginIndex
     * @return
     */
    public SymbolTerm subsymbol(int beginIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        int subLen = this.finish - this.start - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return (beginIndex == 0) ? this : new Partial(this.name, this.arity, this.start + beginIndex, this.finish);
    }

    /**
     * Creates and return new {@link SymbolTerm} instance that shares the name
     * string with this instance, but name of new instance is a substring of this
     * name starting from given beginIndex and ending before endIndex.
     * 
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public SymbolTerm subsymbol(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > this.finish - this.start) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((beginIndex == 0) && (endIndex == this.finish - this.start)) ? this
                : new Partial(this.name, this.arity, this.start + beginIndex, this.start + endIndex);
    }

    public SymbolTerm concat(SymbolTerm that) {
        StringBuilder sb = new StringBuilder(this.finish - this.start + that.finish - that.start());
        sb.append(this.name, this.start, this.finish);
        sb.append(that.name, that.start, that.finish);
        return SymbolTerm.create(sb.toString());
    }

    /**
     * Returns the name length
     * 
     * @return
     */
    @Override
    public int length() {
        return this.finish - this.start;
    }

    // TODO startsWith(), endsWith(), indexOf()
    /* Term */
    @Override
    public boolean unifyImpl(Term t, Trail trail) {
        t = t.dref(); // fast dereference
        return (t.isVar()) ? t.bind(this, trail)
                : ((t instanceof Partial) ? t.unify(this, trail)
                        : ((t.isAtomString()) && (this.arity == (t.asSymbolTerm()).arity)
                                && this.name.equals(t.asSymbolTerm().name)));
    }

    @Override
    public int termHashCodeImpl() {
        return this.name.hashCode();
    }

    @Override
    public boolean equalsTerm(Term obj, OpVisitor comparator) {
        return (obj instanceof Partial) ? ((Partial) obj).equalsTerm(this, comparator)
                : ((obj.isAtomString()) && (this.arity == obj.asSymbolTerm().arity)
                        && this.name.equals(obj.asSymbolTerm().name));
    }

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
    @Override
    public boolean convertible(Class type) {
        return convertible(String.class, type);
    }

    /**
     * Returns a <code>java.lang.String</code> corresponds to this
     * <code>SymbolTerm</code> according to <em>Prolog Cafe interoperability with
     * Java</em>.
     * 
     * @return a <code>java.lang.String</code> object equivalent to this
     *         <code>SymbolTerm</code>.
     */
    @Override
    public Object toJava() {
        return this.name;
    }

    @Override
    public void toStringImpl(int printingFlags, StringBuilder sb) {
        String name = this.name;
        if (super.isQuoted(printingFlags)) {
            sb.append(quoted);
        } else {
            sb.append(name);
        }
    }

    @Override
    public String pprint() throws PrologException {
        return fname();
    }

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
    @Override
    public int compareTo(Term anotherTerm) { // anotherTerm must be dereferenced.
        if ((anotherTerm.isVar()) || (anotherTerm.isNumber()))
            return AFTER;
        if (!(anotherTerm.isAtomString()))
            return BEFORE;
        if (this == anotherTerm)
            return EQUAL;
        int x = fname().compareTo(anotherTerm.asSymbolTerm().fname());
        if (x != 0)
            return x;
        int y = this.arity - anotherTerm.asSymbolTerm().arity();
        // if (y != 0)
        return y;
        // throw new InternalException("SymbolTerm is not unique");
    }

    @Override
    public final boolean isImmutable() {
        return true;
    }

    @Override
    public boolean isNil() {
        if (Prolog.Nil == this)
            return true;
        if (this.fname().equals("[]")) {
            // throw
        }
        return false;
    }

    public static SymbolTerm internToken(String _name) {
        SymbolTerm tok = intern(_name);
        return tok;
    }

    @Override
    public SymbolTerm functor() {
        return this;
    }

}
