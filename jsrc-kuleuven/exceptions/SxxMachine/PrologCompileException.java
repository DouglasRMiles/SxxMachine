
package SxxMachine;

/**
  * Error die geworpen wordt als een gegeven prolog-invoer
  * niet kan gecompileerd worden.
  *
  *  @author  Tim Boven
  */
public class PrologCompileException extends JPrologScriptException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PrologCompileException(Exception e) {
        super(e);
    }

    public PrologCompileException(String msg) {
        super(msg);
    }

}
