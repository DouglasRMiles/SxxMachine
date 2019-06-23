/**
 *
 */
package SxxMachine.pterm;

import SxxMachine.CharReader;
import SxxMachine.Compound;
import SxxMachine.Const;
import SxxMachine.JpVar;
import SxxMachine.Nonvar;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.RunningPrologMachine;
import SxxMachine.Term;
import SxxMachine.TermArray;

/**
 * @author Administrator
 *
 */
public interface ITermFactory {

	Compound S(String string, Term... s3);

	Compound S(SxxMachine.Functor f, Term... s3);

	Compound CONS(Term _car, Term _cdr);

	/** Returns a Prolog atom for the given name. */
	SxxMachine.Functor SYM(String _name);

	/** Returns a Prolog functor for the given name and arity. */
	SxxMachine.Functor F(String s, int i);

	VariableTerm V(Prolog engine);

	VariableTerm V();

	Predicate Op(Operation object, Term[] LARG, Operation cont);

	Predicate Op(String str, Operation object, Term[] LARG, Operation cont);

	LongTerm Long(String s);

	LongTerm Long(long t);

	Term Long(char t);

	IntegerTerm Integer(int i);

	Term[] VA();

	Term[] VA(Term... array);

	Term Closure(Operation _op);

	JavaObjectTerm FFIObject(Object _obj);

	ErrorTerm createErrorTerm(Throwable error, Term _functor, Term... _args);

	Compound LIST(Term a1, Term... items);

	boolean isQuoted(int printingFlags);

	Term AND(Term a1, Term a2);

	/**
	 * @param r
	 * @return
	 */
	NumberTerm NarrowDouble(double r);

	HashtableOfTerm asHashtableOfTerm(Object hash);

	ErrorTerm asErrorTerm(Term a2);

	DoubleTerm Float(double i);

	IntegerTerm Number(int n);

	LongTerm Number(long n);

	DoubleTerm Number(double n);

	JavaObjectTerm createJavaObjectTerm(Object _obj, Class c);

	/** Checks whether a given object is an instance of Prolog term. */
	boolean instanceOfTerm(Object obj0);

	/**
	 * Converts a list of character codes to a String.
	 */
	String charsToString(Term Cs);

	/**
	 * @param s
	 * @return
	 */
	Term DoubleQuotes(String s);

	void soopsy();

	/** Returns a Prolog atom for the given character. */
	Term CHAR(int c);

	/** Returns a Prolog atom for the given name. */
	Term createAtomic(String _name);

	/** Returns a Prolog atom for the given name. */
	Term BLOB(String _type, String _name);

	/** Returns a Prolog atom for the given name. */
	SxxMachine.Functor createF(String _name, int arity);

	SxxMachine.Functor internToken(String _name);

	void gc();

	NumberTerm asInt(Term i);

	Nonvar asConst(Term i);

	Compound asConj(Term i);

	Compound asCons(Term i);

	NumberTerm asNum(Term i);

	Compound asStruct(Term i);

	Nonvar the(Term X);

	CharReader asCharReader(Term i);

	Term createStructureTerm(String name, int arity);

	Const CONST(String o);

	JavaObjectTerm CONST(Class o);

	Const CONST(Object o);

	StructureTerm S(String naam, int arity);

	Compound S(String naam, Term arg0, Term arg1);

	String internS(String string);

	NumberTerm Integer(long i);

	JpVar Jv(RunningPrologMachine machine);

	/**
	 * @param f
	 * @param s3
	 * @return
	 */
	Compound S(String f, TermArray s3);

	/**
	 * @param engine
	 * @param why
	 * @return
	 */
	VariableTerm V(Prolog engine, String why);


}