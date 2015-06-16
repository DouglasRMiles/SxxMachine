package com.googlecode.prolog_cafe.lang;
/**
 * Java error.<br>
 * There will be a Java error when 
 * a Java exception is threw during interoperating with Java in Prolog Cafe.
 * The class <code>JavaException</code> wraps a subclass of <code>java.lang.Exception</code>.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class JavaException extends BuiltinException {

	private static final long serialVersionUID = -7510890457700984457L;

	/** A functor symbol of <code>java_error/3</code>. */
    public static final SymbolTerm JAVA_ERROR = SymbolTerm.intern("java_error", 3);

    /** Holds a Java exception. */
    public Exception e;

    /** Constructs a new <code>JavaException</code> with a Java exception. */
    public JavaException(Exception _e) {
    	initCause(_e);
    	e = _e;
    }

    /** Constructs a new <code>JavaException</code> with the given arguments. */
    public JavaException(Operation _goal, int _argNo, Exception _e) {
    	this(_e);
    	this.goal    = _goal;
    	this.argNo   = _argNo;
    }

    /** Returns a term representation of this <code>JavaException</code>:
     * <code>java_error(goal,argNo,exception)</code>.
     */
    public Term getMessageTerm() {
		Term[] args = {
			(goal==null)?SymbolTerm.create("<Goal unknown>"):new JavaObjectTerm(goal), 
		    new IntegerTerm(argNo),
		    new JavaObjectTerm(e)};
		return new StructureTerm(JAVA_ERROR, args);
    }

    /** Returns a underlying Java exception. */
    public Exception getException() {
    	return e;
    }

    /** Returns a string representation of this <code>JavaException</code>. */
    public String toString() {
		StringBuilder sb = new StringBuilder("{JAVA ERROR: ");
		sb.append(goal);
		if (argNo>0){
			sb.append(" - arg ").append(argNo);
		}
		sb.append(", occurs ").append(e);
		sb.append("}");
		return sb.toString();
    }
}
