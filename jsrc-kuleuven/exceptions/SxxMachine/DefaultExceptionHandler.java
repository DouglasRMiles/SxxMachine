
package SxxMachine;

public class DefaultExceptionHandler implements ExceptionHandlerIF {

    private static transient ExceptionHandlerIF instance;

    DefaultExceptionHandler() {
        super();
    }

    public static synchronized ExceptionHandlerIF getInstance() {
        if (instance == null)
            instance = new DefaultExceptionHandler();
        return instance;
    }

    @Override
    public Code handlePrologException(JPrologInternalException exception, RunStackItem mach)
            throws JPrologInternalException {
        mach.removeChoice();
        if (mach.getCurrentChoice() >= 0) {
            mach.unTrail();
        }
        throw exception;
    }

}
