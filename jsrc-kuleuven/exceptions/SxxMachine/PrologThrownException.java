
package SxxMachine;

/**
  * Exceptie die enkel door het throw-predikaat geworpen wordt.
  *
  *  @author  Tim Boven
  */
public class PrologThrownException extends JPrologInternalException {

    private final Term cause;

    public PrologThrownException(Term cause) {
        super(cause.toString());
        if (cause == null)
            throw new NullPointerException();
        if (cause.isVariable())
            throw new JPrologInternalException("Invalid cause, cause can not be a var");
        this.cause = cause;
    }

    @Override
    protected Term toPrologException() {
        return cause;
    }

    public Object getPrologExceptionCause() {
        Term cause = this.cause.dref();
        if (cause instanceof Const) {
            return ((Const) cause).getValue();
        }
        return cause.toString();
    }

}
