
package SxxMachine;

/**
  * Exceptie die enkel door het throw-predikaat geworpen wordt.
  *
  *  @author  Tim Boven
  */
public class PrologThrownException extends JPrologInternalException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final Term cause;

    public PrologThrownException(Term cause) {
        this(cause.portrayTerm(), cause);
    }

    public PrologThrownException(String str, Term cause) {
        super(str);
        if (cause == null) {
            throw new NullPointerException();
        }
        if (cause.isVariable())
            throw new JPrologInternalException("Invalid cause, cause can not be a var");
        this.cause = cause;
    }

    @Override
    protected Term toPrologException() {
        return cause;
    }

    public Object getPrologExceptionCause() {
        final Term cause = this.cause.dref();
        if (cause.isAtomOrObject()) {
            return ((Const) cause).getValue();
        }
        return cause.portrayTerm();
    }

}
