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
import SxxMachine.TermArray;

abstract public class TermData {

    static public TermDataImpl factory = new TermDataImpl() {
    };

    static public Term AND(Term a1, Term a2) {
        return factory.AND(a1, a2);
    }

    static public CharReader asCharReader(Term i) {
        return factory.asCharReader(i);
    }

    static public Compound asConj(Term i) {
        return factory.asConj(i);
    }

    static public Compound asCons(Term i) {
        return factory.asCons(i);
    }

    static public Nonvar asConst(Term i) {
        // TODO Auto-generated method stub
        return factory.asConst(i);
    }

    static public ErrorTerm asErrorTerm(Term a2) {
        return factory.asErrorTerm(a2);
    }

    static public HashtableOfTerm asHashtableOfTerm(Object hash) {
        return factory.asHashtableOfTerm(hash);
    }

    static public NumberTerm asInt(Term i) {
        return factory.asInt(i);
    }

    static public NumberTerm asNum(Term i) {
        return factory.asNum(i);
    }

    static public Compound asStruct(Term i) {
        return factory.asStruct(i);
    }

    /** Returns a Prolog atom for the given name. */
    static public Term BLOB(String _type, String _name) {
        return factory.BLOB(_type, _name);
    }

    /** Returns a Prolog atom for the given character. */
    static public Term CHAR(char c) {
        return factory.CHAR(c);
    }

    /**
     * Converts a list of character codes to a String.
     */
    static public String charsToString(Term Cs) {
        return factory.charsToString(Cs);
    }

    static public Term Closure(Operation _op) {
        return factory.Closure(_op);
    }

    static public Compound CONS(Term _car, Term _cdr) {
        return factory.CONS(_car, _cdr);
    }

    static public JavaObjectTerm CONST(Class o) {
        return factory.CONST(o);
    }

    static public Const CONST(Object o) {
        return factory.CONST(o);
    }

    static public Const CONST(String o) {
        return factory.CONST(o);
    }

    /** Returns a Prolog atom for the given name. */
    static public Term createAtomic(String _name) {
        return factory.createAtomic(_name);
    }

    static public ErrorTerm createErrorTerm(Throwable error, Term _functor, Term... _args) {
        return factory.createErrorTerm(error, _functor, _args);
    }

    /** Returns a Prolog atom for the given name. */
    static public SxxMachine.Functor createF(String _name, int arity) {
        return factory.createF(_name, arity);
    }

    static public JavaObjectTerm createJavaObjectTerm(Object _obj, Class c) {
        return factory.createJavaObjectTerm(_obj, c);
    }

    static public Term createStructureTerm(String name, int arity) {
        return factory.createStructureTerm(name, arity);
    }

    static public Term DoubleQuotes(String s) {
        return factory.DoubleQuotes(s);
    }

    /** Returns a Prolog functor for the given name and arity. */
    static public SxxMachine.Functor F(String s, int i) {
        return factory.F(s, i);
    }

    static public JavaObjectTerm FFIObject(Object _obj) {
        return factory.FFIObject(_obj);
    }

    static public DoubleTerm Float(double i) {
        return factory.Float(i);
    }

    static public Term Float(String string) {
        return Float(Double.parseDouble(string));
    }

    static public void gc() {
        factory.gc();
    }

    /** Checks whether a given object is an instance of Prolog term. */
    static public boolean instanceOfTerm(Object obj0) {
        return factory.instanceOfTerm(obj0);
    }

    static public IntegerTerm Integer(int i) {
        return factory.Integer(i);
    }

    static public NumberTerm Integer(long i) {
        return factory.Long(i);
    }

    static public String internS(String string) {
        return factory.internS(string);
    }

    static public SxxMachine.Functor internToken(String _name) {
        return factory.internToken(_name);
    }

    static public boolean isQuoted(int printingFlags) {
        return factory.isQuoted(printingFlags);
    }

    static public JpVar Jv(RunningPrologMachine machine) {
        if (true)
            return factory.Jv(machine);
        return machine.mkvar0();
    }

    static public Compound LIST(Term a1, Term... items) {
        return factory.LIST(a1, items);
    }

    static public Term Long(char t) {
        return factory.Long(t);
    }

    static public LongTerm Long(long t) {
        return factory.Long(t);
    }

    static public LongTerm Long(String s) {
        return factory.Long(s);
    }

    /**
     * @param r
     * @return
     */
    static public NumberTerm NarrowDouble(double r) {
        return factory.NarrowDouble(r);
    }

    static public DoubleTerm Number(double n) {
        return factory.Number(n);
    }

    static public IntegerTerm Number(int n) {
        return factory.Number(n);
    }

    static public LongTerm Number(long n) {
        return factory.Number(n);
    }

    //
    //    static public Predicate Op(Operation object, Term[] LARG, Operation cont) {
    //        return factory.Op(object, LARG, cont);
    //    }

    static public Predicate Op(String str, Operation object, Term[] args, Operation cont) {
        return factory.Op(str, object, args, cont);
    }

    static public StructureTerm S(String naam, int arity) {
        return factory.S(naam, arity);
    }

    static public Compound S(String f, TermArray s3) {
        return factory.S(f, s3);
    }

    static public Compound S(String f, Term... s3) {
        return factory.S(f, s3);
    }

    static public Compound S(String naam, Term arg0, Term arg1) {
        return factory.S(naam, arg0, arg1);
    }

    static public Compound S(SxxMachine.Functor f, Term... s3) {
        return factory.S(f, s3);
    }

    static public void soopsy() {
        new Exception().printStackTrace();
        Prolog.Break("soopsy!");
    }

    /** Returns a Prolog atom for the given name. */
    static public SxxMachine.Functor SYM(String _name) {
        return factory.SYM(_name);
    }

    static public final Nonvar the(Term X) {
        return factory.the(X);
    }

    static public VariableTerm V() {
        return V(Prolog.M);
    }

    static public VariableTerm V(Prolog engine) {
        return factory.V(engine);
    }

    static public Term[] VA(Term... array) {
        return factory.VA(array);
    }

}
