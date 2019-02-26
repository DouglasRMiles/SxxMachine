
package SxxMachine;

public class JPCallStatic extends AbstractJCall {

    @Override
    protected Class<?> getClass(Const c) throws IllegalArgumentException {
        if (!(c.getValue() instanceof Class))
            throw new IllegalArgumentException("Not a class-object");
        return (Class<?>) c.getValue();
    }

}
