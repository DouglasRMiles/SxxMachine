
package SxxMachine;

public interface ExceptionHandlerIF {

    public Code handlePrologException(JPrologInternalException exception, MiniJProlog mach)
            throws JPrologInternalException;

}
