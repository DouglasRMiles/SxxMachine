
package SxxMachine;

public interface ExceptionHandlerIF {

    public Code handlePrologException(JPrologInternalException exception, RunStackItem mach)
            throws JPrologInternalException;

}
