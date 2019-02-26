
package SxxMachine;

public class SkipExceptionHandler implements ExceptionHandlerIF {

    private final long startChoiceStack;

    public SkipExceptionHandler(long startChoiceStack) {
        super();
        if (startChoiceStack < 0)
            throw new IllegalArgumentException(startChoiceStack + " < 0");
        this.startChoiceStack = startChoiceStack;
    }

    @Override
    public Code handlePrologException(JPrologInternalException exception, RunStackItem mach)
            throws JPrologInternalException {
        while (mach.getCurrentChoice() > startChoiceStack) {
            mach.removeChoice();
        }
        mach.unTrail();
        throw exception;
    }

}
