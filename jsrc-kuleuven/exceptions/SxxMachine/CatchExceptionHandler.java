
package SxxMachine;

public class CatchExceptionHandler extends DefaultExceptionHandler {

    private final Term exception;
    private final Term exceptionAction;
    private final Term continuation;

    public CatchExceptionHandler(Term exception, Term exceptionAction, Term cont) {
        super();
        if (exception == null || exceptionAction == null || cont == null)
            throw new NullPointerException();
        this.exception = exception;
        this.exceptionAction = exceptionAction;
        continuation = cont;
    }

    @Override
    public Code handlePrologException(JPrologInternalException exception, MiniJProlog mach)
            throws JPrologInternalException {
        if (!exception.unifyJP(this.exception))
            return super.handlePrologException(exception, mach);
        final Term[] args = mach.getAreg();
        args[0] = exceptionAction;
        args[1] = continuation;
        return mach.getMachine().Call2;
    }

}
