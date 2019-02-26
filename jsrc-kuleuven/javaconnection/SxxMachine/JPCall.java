
package SxxMachine;

public class JPCall extends AbstractJCall {

    @Override
    protected Class<?> getClass(Const c) throws IllegalArgumentException {
        if (c.getValue() == null)
            throw new IllegalArgumentException("null not a valid object");
        return c.getValue().getClass();
    }

}
