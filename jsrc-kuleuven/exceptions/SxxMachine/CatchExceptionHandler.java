
package SxxMachine;

public class CatchExceptionHandler extends DefaultExceptionHandler {

    private final Term exception;
    private final Term exceptionAction;
    private final Term continuation;

    public CatchExceptionHandler(Term exception, Term exceptionAction, Term cnt) {
        super();
        if (exception == null || exceptionAction == null || cnt == null)
            throw new NullPointerException();
        this.exception = exception;
        this.exceptionAction = exceptionAction;
        continuation = cnt;
    }

    @Override
    public Code handlePrologException(JPrologInternalException exception, MiniJProlog mach)
            throws JPrologInternalException {
        if (!exception.unifyJP(this.exception))
            return super.handlePrologException(exception, mach);
        final Term[] args = mach.getAreg();
        args[0] = exceptionAction;
        mach.setCont(args, 1, continuation);
        return mach.getMachine().getCall2();
    }

}
