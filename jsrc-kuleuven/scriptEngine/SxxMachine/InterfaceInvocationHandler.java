
package SxxMachine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.script.ScriptException;

class InterfaceInvocationHandler implements InvocationHandler {

    private final PrologEngine engine;

    InterfaceInvocationHandler(PrologEngine engine) {
        if (engine == null)
            throw new NullPointerException();
        this.engine = engine;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            Object o;
            try {
                o = engine.invokeFunction(method.getName(), args, method.getReturnType());
            } catch (final ScriptException ex) {
                throw new JPrologInternalException("Error invoking method", ex);
            }
            if (o != null && (Long.class.equals(o.getClass()) || Long.TYPE.equals(o.getClass()))) {
                final long l = (Long) o;
                if (Integer.class.equals(method.getReturnType()) || Integer.TYPE.equals(method.getReturnType()))
                    return (int) l;
            }
            return o;
        } catch (final NoSuchMethodException ex) {
            if (Object.class.equals(method.getDeclaringClass())) {
                if ("equals".equals(method.getName()) && args.length == 1) {
                    return proxy == args[0];
                }
                return method.invoke(this, args);
            }
            throw ex;
        }
    }

}
