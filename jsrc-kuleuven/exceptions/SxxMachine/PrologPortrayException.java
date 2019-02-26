
package SxxMachine;

/**
  * Fout die enkel in PrologEngine en PrologMachine kan geworpen
  * worden om aan te geven dat er een fout optrad die niet
  * intern kon opgevangen worden.
  *
  *  @author  Tim Boven
  */
public class PrologPortrayException extends JPrologInternalException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param o
     * @param msg
     */
    public PrologPortrayException(Object o, String msg) {
        super(o, msg);

    }

}
