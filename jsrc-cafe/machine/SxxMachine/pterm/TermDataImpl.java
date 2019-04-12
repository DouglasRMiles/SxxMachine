package SxxMachine.pterm;

import java.math.BigInteger;

import SxxMachine.CharReader;
import SxxMachine.Compound;
import SxxMachine.Const;
import SxxMachine.Functor;
import SxxMachine.JpVar;
import SxxMachine.Nonvar;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.PrologFlags;
import SxxMachine.RunningPrologMachine;
import SxxMachine.Term;

abstract public class TermDataImpl {

    public Compound S(String string, Term... s3) {
        return (Compound) new StructureTerm(string, s3);
    }

    public Compound S(SxxMachine.Functor f, Term... s3) {
        return new StructureTerm(f, s3);
    }

    public Compound CONS(Term _car, Term _cdr) {
        // if(false) return Cons(_car, _cdr);
        return S(Prolog.FUNCTOR_LIST_2, _car, _cdr);
    }

    /** Returns a Prolog atom for the given name. */
    public SxxMachine.Functor SYM(String _name) {
        return SymbolTerm.intern(_name.intern(), 0);
    }

    /** Returns a Prolog functor for the given name and arity. */
    public SxxMachine.Functor F(String s, int i) {
        return SymbolTerm.intern(s, i);
    }

    public VariableTerm V(Prolog engine) {
        return new VariableTerm(engine);
    }

    public VariableTerm V() {
        return new VariableTerm(Prolog.M);
    }

    public Predicate Op(Operation object, Term[] LARG, Operation cont) {
        return new StaticPred(null, object, LARG, cont);
    }

    public Predicate Op(String str, Operation object, Term[] LARG, Operation cont) {
        return new StaticPred(str, object, LARG, cont);
    }

    public LongTerm Long(String s) {
        return new LongTerm(new BigInteger(s));
    }

    public LongTerm Long(long t) {
        int i = (int) t;
        if ((i) == t) {
            return Integer(i);
        }
        return new LongTerm(t);
    }

    public Term Long(char t) {
        return CHAR(t);
    }

    final int POS_INT_CACHE = 1024;
    final int NEG_INT_CACHE = 1024;
    IntegerTerm[] posInts = new IntegerTerm[POS_INT_CACHE];
    IntegerTerm[] negInts = new IntegerTerm[NEG_INT_CACHE];

    public IntegerTerm Integer(int i) {
        if (i < POS_INT_CACHE) {
            if (i < 0) {
                if (i >= -NEG_INT_CACHE) {
                    int idx = -i;
                    if (negInts != null) {
                        synchronized (negInts) {
                            IntegerTerm ret = negInts[idx];
                            if (ret == null) {
                                negInts[idx] = ret = new IntegerTerm(i);
                            }
                            return ret;
                        }
                    }
                }
            } else {
                if (posInts != null) {
                    synchronized (posInts) {
                        IntegerTerm ret = posInts[i];
                        if (ret == null) {
                            posInts[i] = ret = new IntegerTerm(i);
                        }
                        return ret;
                    }
                }
            }
        }
        return new IntegerTerm(i);
    }

    public Term[] VA(Term... array) {
        return array;
    }

    public Term Closure(Operation _op) {
        return new ClosureTerm((Predicate) _op);
    }

    public JavaObjectTerm FFIObject(Object _obj) {
        return createJavaObjectTerm(_obj, null);
    }

    public ErrorTerm createErrorTerm(Throwable error, Term _functor, Term... _args) {
        return new ErrorTerm(error, _functor, _args);
    }

    public Compound LIST(Term a1, Term... items) {
        int len = items.length;
        if (len == 0) {
            return CONS(a1, Prolog.Nil);
        }
        Compound t = CONS(items[len - 1], Prolog.Nil);
        for (int i = len - 2; i >= 0; i--) {
            t = CONS(items[i], t);
        }
        return t;
    }

    public boolean isQuoted(int printingFlags) {
        return (printingFlags & 1) != 0;
    }

    public Term AND(Term a1, Term a2) {
        return StructureTerm.createCons(Prolog.FUNCTOR_CONJ_2.fname(), a1, a2);
    }

    /**
     * @param r
     * @return
     */
    public NumberTerm NarrowDouble(double r) {
        NumberTerm T;
        if (Math.floor(r) == r)
            T = Long((long) r);
        else
            T = Float(r);
        return T;
    }

    public HashtableOfTerm asHashtableOfTerm(Object hash) {
        return (HashtableOfTerm) hash;
    }

    public ErrorTerm asErrorTerm(Term a2) {
        return (ErrorTerm) a2;
    }

    public DoubleTerm Float(double i) {
        return new DoubleTerm(i);
    }

    public IntegerTerm Number(int n) {
        return Integer(n);
    }

    public LongTerm Number(long n) {
        return Long(n);
    }

    public DoubleTerm Number(double n) {
        return Float(n);
    }

    public JavaObjectTerm createJavaObjectTerm(Object _obj, Class c) {
        return new JavaObjectTerm(_obj, c);
    }

    /** Checks whether a given object is an instance of Prolog term. */
    public boolean instanceOfTerm(Object obj0) {
        if (!(obj0 instanceof Term))
            return false;
        Term obj = (Term) obj0;
        return obj.isVar() || obj.isInteger() || obj.isLong() || obj.isDouble() || obj.isAtomSymbol() || obj.isCons()
                || obj.isCompound() || obj.isJavaObject() || obj.isClosure();
    }

    /**
     * Converts a list of character codes to a String.
     */
    public String charsToString(Term Cs) {
        StringBuffer s = new StringBuffer("");

        while (!(Cs.isNil())) {
            if (!(Cs.isCons()))
                return null;
            Term head = Cs.getDrefArg(0);
            char c = asChar(head);
            s.append(c);
            Cs = Cs.getDrefArg(1);
        }

        return s.toString();
    }

    /**
     * @param s
     * @return
     */
    public Term DoubleQuotes(String s) {
        char[] chars = s.toCharArray();
        Term token = Prolog.Nil;
        for (int i = chars.length; i > 0; i--) {
            token = CONS(CHAR(chars[i - 1]), token);
        }
        return token;
    }

    private char asChar(Term head) {
        if (head.isNumber())
            return (char) head.longValue();
        final String fname = head.getJavaString();
        return fname.charAt(fname.length() - 1);
    }

    public void soopsy() {
        new Exception().printStackTrace();
        Prolog.Break("soopsy!");
    }

    /** Returns a Prolog atom for the given character. */
    public Term CHAR(char c) {
        if (PrologFlags.useDoubleQuotes().contentEquals("codes")) {
            return Integer(c);
        }
        if (0 <= c && c <= 127)
            return SYM(Character.toString(c));
        else
            return SYM(Character.toString(c));
    }

    /** Returns a Prolog atom for the given name. */
    public Term createAtomic(String _name) {
        return SymbolTerm.screateDynamic(_name.intern());
    }

    /** Returns a Prolog atom for the given name. */
    public Term BLOB(String _type, String _name) {
        return SymbolTerm.screateDynamic(_name.intern());
    }

    /** Returns a Prolog atom for the given name. */
    public SxxMachine.Functor createF(String _name, int arity) {
        return SymbolTerm.screateF(_name, arity);
    }

    public SxxMachine.Functor internToken(String _name) {
        SxxMachine.Functor tok = SYM(_name);
        return tok;
    }

    public void gc() {
        SymbolTerm.atom_gc();
    }

    public NumberTerm asInt(Term i) {

        return i.asLongTerm();
    }

    public Nonvar asConst(Term i) {

        return i.asConst();
    }

    public Compound asConj(Term i) {

        return (StructureTerm) i.asStructureTerm();
    }

    public Compound asCons(Term i) {

        return (StructureTerm) i.asListTerm();
    }

    public NumberTerm asNum(Term i) {

        return i.asNumberTerm();
    }

    public Compound asStruct(Term i) {

        return (StructureTerm) i.asStructureTerm();
    }

    public final Nonvar the(Term X) {
        return (null == X) ? (Nonvar) Prolog.aNo : S("the", X);
    }

    public CharReader asCharReader(Term i) {

        return (CharReader) i.toValueTalueTerm();
    }

    public Term createStructureTerm(String name, int arity) {

        return new StructureTerm(name, arity);
    }

    public Const CONST(String o) {
        return (Const) SYM(o);
    }

    public JavaObjectTerm CONST(Class o) {
        return FFIObject(o);
    }

    public Const CONST(Object o) {
        if (o instanceof String) {
            return (Const) SYM((String) o);
        }
        return FFIObject(o);
    }

    public StructureTerm S(String naam, int arity) {
        return new StructureTerm(naam, arity);
    }

    public Compound S(String naam, Term arg0, Term arg1) {
        return new StructureTerm(naam, arg0, arg1);
    }

    public String internS(String string) {
        return string.intern();
    }

    public NumberTerm Integer(long i) {
        return Long(i);
    }

    public JpVar Jv(RunningPrologMachine machine) {
        return machine.mkvar0();
    }

}
