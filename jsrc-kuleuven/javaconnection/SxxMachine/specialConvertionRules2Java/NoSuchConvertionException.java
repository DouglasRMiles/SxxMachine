
package SxxMachine.specialConvertionRules2Java;

import SxxMachine.JPrologInternalException;

public class NoSuchConvertionException extends JPrologInternalException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NoSuchConvertionException(String msg) {
        super(msg);
    }

    public NoSuchConvertionException(Throwable cause) {
        super("Error using rule", cause);
    }

}
