
package SxxMachine;

/**
  * Error die geworpen wordt als een gegeven prolog-invoer
  * niet kan gecompileerd worden.
  *
  *  @author  Tim Boven
  */
public class PrologCompileException extends JPrologScriptException {

    public PrologCompileException(Exception e) {
        super(e);
    }

    public PrologCompileException(String msg) {
        super(msg);
    }

}
