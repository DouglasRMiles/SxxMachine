package SxxMachine.pterm;

import java.math.BigInteger;

import SxxMachine.CharReader;
import SxxMachine.Compound;
import SxxMachine.Const;
import SxxMachine.JpVar;
import SxxMachine.Nonvar;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.PrologFlags;
import SxxMachine.RunningPrologMachine;
import SxxMachine.Term;
import SxxMachine.TermArray;

@SuppressWarnings("cast")
public class SxxTermDataImpl implements ITermFactory {

    @Override
	public Compound S(String string, Term... s3) {
        return new StructureTerm(string, s3);
    }

    @Override
	public Compound S(SxxMachine.Functor f, Term... s3) {
        return new StructureTerm(f, s3);
    }

    @Override
	public Compound CONS(Term _car, Term _cdr) {
        // if(false) return Cons(_car, _cdr);
        return S(Prolog.FUNCTOR_LIST_2, _car, _cdr);
    }

    /** Returns a Prolog atom for the given name. */
    @Override
	public SxxMachine.Functor SYM(String _name) {
        return SymbolTerm.intern(_name.intern(), 0);
    }

    /** Returns a Prolog functor for the given name and arity. */
    @Override
	public SxxMachine.Functor F(String s, int i) {
        return SymbolTerm.intern(s, i);
    }

    @Override
	public VariableTerm V(Prolog engine) {
        return new VariableTerm(engine);
    }
	@Override
	public VariableTerm V(Prolog engine, String why) {
        return new VariableTerm(engine, why);
	}


    @Override
	public VariableTerm V() {
        return new VariableTerm(Prolog.M);
    }

    @Override
	public Predicate Op(Operation object, Term[] LARG, Operation cont) {
        return new StaticPred(null, object, LARG, cont);
    }

    @Override
	public Predicate Op(String str, Operation object, Term[] LARG, Operation cont) {
        return new StaticPred(str, object, LARG, cont);
    }

    @Override
	public LongTerm Long(String s) {
        return new LongTerm(new BigInteger(s));
    }

    @Override
	public LongTerm Long(long t) {
        int i = (int) t;
        if (((long)i) == t) {
            return Integer(i);
        }
        return new LongTerm(t);
    }

    @Override
	public Term Long(char t) {
        return CHAR(t);
    }

    final int POS_INT_CACHE = 1024;
    final int NEG_INT_CACHE = 1024;
    IntegerTerm[] posInts = new IntegerTerm[POS_INT_CACHE];
    IntegerTerm[] negInts = new IntegerTerm[NEG_INT_CACHE];

    @Override
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

    @Override
	public Term[] VA() {
        return ZERO_TERM;
    }
    final static Term[] ZERO_TERM = new Term[0];
    @Override
	public Term[] VA(Term... array) {
        return array.clone();
    }

    @Override
	public Term Closure(Operation _op) {
        return new ClosureTerm((Predicate) _op);
    }

    @Override
	public JavaObjectTerm FFIObject(Object _obj) {
        return createJavaObjectTerm(_obj, null);
    }

    @Override
	public ErrorTerm createErrorTerm(Throwable error, Term _functor, Term... _args) {
        return new ErrorTerm(error, _functor, _args);
    }

    @Override
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

    @Override
	public boolean isQuoted(int printingFlags) {
        return (printingFlags & 1) != 0;
    }

    @Override
	public Term AND(Term a1, Term a2) {
        return StructureTerm.createCons(Prolog.FUNCTOR_CONJ_2.fname(), a1, a2);
    }

    /**
     * @param r
     * @return
     */
    @Override
	public NumberTerm NarrowDouble(double r) {
        NumberTerm T;
        if (Math.floor(r) == r)
            T = Long((long) r);
        else
            T = Float(r);
        return T;
    }

    @Override
	public HashtableOfTerm asHashtableOfTerm(Object hash) {
        return (HashtableOfTerm) hash;
    }

    @Override
	public ErrorTerm asErrorTerm(Term a2) {
        return (ErrorTerm) a2;
    }

    @Override
	public DoubleTerm Float(double i) {
        return new DoubleTerm(i);
    }

    @Override
	public IntegerTerm Number(int n) {
        return Integer(n);
    }

    @Override
	public LongTerm Number(long n) {
        return Long(n);
    }

    @Override
	public DoubleTerm Number(double n) {
        return Float(n);
    }

    @Override
	public JavaObjectTerm createJavaObjectTerm(Object _obj, Class c) {
        return new JavaObjectTerm(_obj, c);
    }

    /** Checks whether a given object is an instance of Prolog term. */
    @Override
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
    @Override
    public String charsToString(Term Cs) {
        StringBuffer s = new StringBuffer();

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
    @Override
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

    @Override
	public void soopsy() {
        new Exception().printStackTrace();
        Prolog.Break("soopsy!");
    }

    /** Returns a Prolog atom for the given character. */
    @Override
	public Term CHAR(int c) {
        if (PrologFlags.useDoubleQuotes().contentEquals("codes")) {
            return Integer(c);
        }
        if (0 <= c && c <= 127)
            return SYM(Character.toString((char)c));
        else
            return SYM(Character.toString((char)c));
    }

    /** Returns a Prolog atom for the given name. */
    @Override
	public Term createAtomic(String _name) {
        return SymbolTerm.screateDynamic(_name.intern());
    }

    /** Returns a Prolog atom for the given name. */
    @Override
	public Term BLOB(String _type, String _name) {
        return SymbolTerm.screateDynamic(_name.intern());
    }

    /** Returns a Prolog atom for the given name. */
    @Override
	public SxxMachine.Functor createF(String _name, int arity) {
        return SymbolTerm.screateF(_name, arity);
    }

    @Override
	public SxxMachine.Functor internToken(String _name) {
        SxxMachine.Functor tok = SYM(_name);
        return tok;
    }

    @Override
	public void gc() {
        SymbolTerm.atom_gc();
    }

    @Override
	public NumberTerm asInt(Term i) {

        return i.asLongTerm();
    }

    @Override
	public Nonvar asConst(Term i) {

        return i.asConst();
    }

    @Override
	public Compound asConj(Term i) {

        return (StructureTerm) i.asStructureTerm();
    }

    @Override
	public Compound asCons(Term i) {

        return i.asListTerm();
    }

    @Override
	public NumberTerm asNum(Term i) {

        return i.asNumberTerm();
    }

    @Override
	public Compound asStruct(Term i) {

        return (StructureTerm) i.asStructureTerm();
    }

    @Override
	public final Nonvar the(Term X) {
        return (null == X) ? (Nonvar) Prolog.aNo : S("the", X);
    }

    @Override
	public CharReader asCharReader(Term i) {

        return (CharReader) i.toValueTalueTerm();
    }

    @Override
	public Term createStructureTerm(String name, int arity) {

        return new StructureTerm(name, arity);
    }

    @Override
	public Const CONST(String o) {
        return (Const) SYM(o);
    }

    @Override
	public JavaObjectTerm CONST(Class o) {
        return FFIObject(o);
    }

    @Override
	public Const CONST(Object o) {
        if (o instanceof String) {
            return (Const) SYM((String) o);
        }
        return FFIObject(o);
    }

    @Override
	public StructureTerm S(String naam, int arity) {
        return new StructureTerm(naam, arity);
    }

    @Override
	public Compound S(String naam, Term arg0, Term arg1) {
        return new StructureTerm(naam, arg0, arg1);
    }

    @Override
	public String internS(String string) {
        return string.intern();
    }

    @Override
	public NumberTerm Integer(long i) {
        return Long(i);
    }

    @Override
	public JpVar Jv(RunningPrologMachine machine) {
        return machine.mkvar0();
    }

    /**
     * @param f
     * @param s3
     * @return
     */
    @Override
	public Compound S(String f, TermArray s3) {
        return S(f, s3.getBackingCopy(s3.length));
    }

}
