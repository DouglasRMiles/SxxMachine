
package SxxMachine;

import javax.script.ScriptException;

/**
  * Fout die enkel in PrologEngine en PrologMachine kan geworpen
  * worden om aan te geven dat er een fout optrad die niet
  * intern kon opgevangen worden.
  *
  *  @author  Tim Boven
  */
public class JPrologScriptException extends ScriptException {

    public JPrologScriptException(Exception e) {
        super(e);
    }

    public JPrologScriptException(String msg) {
        super(msg);
    }

}
