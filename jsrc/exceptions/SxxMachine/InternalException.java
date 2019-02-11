package SxxMachine;

/**
 * Internal error.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
@SuppressWarnings("serial")
public class InternalException extends PrologException {
	/** A functor symbol of <code>internal_error/1</code>. */
	public static final SymbolTerm INTERNAL_ERROR = SymbolTerm.intern("internal_error", 1);
	/** Holds a message. */
	public final String message;

	/** Constructs a new <code>InternalException</code> with a message. */
	public InternalException(String _message) {
		this.message = _message;
	}

	/**
	 * Returns a term representation of this <code>InternalException</code>:
	 * <code>internal_error(message)</code>.
	 */
	@Override
	public Term getMessageTerm() {
		Term[] args = { SymbolTerm.create(this.message) };
		return TermData.createErrorTerm(this, INTERNAL_ERROR, args);
	}

	/** Returns a string representation of this <code>InternalException</code>. */
	@Override
	public String toString() {
		String s = "{INTERNAL ERROR: " + this.message;
		s += "}";
		return s;
	}

	@Override
	public String getMessage() {
		return toString();
	}

}
