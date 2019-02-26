
package SxxMachine;

import static SxxMachine.pterm.TermData.S;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.script.AbstractScriptEngine;
import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptException;

public class PrologEngine extends AbstractScriptEngine implements Invocable {

    private final static Logger log = Logger.getLogger(PrologEngine.class);

    private final PrologScriptEngineFactory factory;
    private final PrologMachine pMachine;
    private InterfaceInvocationHandler handler;

    protected PrologEngine(PrologScriptEngineFactory fac) {
        if (fac == null)
            throw new NullPointerException();
        factory = fac;
        setContext(new JPrologContext());
        pMachine = new PrologMachine(new ContextStreamProvider(this));
        loadDefaultModules();
    }

    protected void loadDefaultModules() {
        new ContextGlobalVarsModule(this).load(pMachine);
        testOrLoadDefaultModule(ReflectionModule.class);
        testOrLoadDefaultModule(ConvertModule.class);
        testOrLoadDefaultModule(BuiltinsModule.class);
    }

    private void testOrLoadDefaultModule(Class<? extends JpModule> mod) {
        if (!pMachine.isModuleRegistered(mod)) {
            try {
                mod.newInstance().load(pMachine);
            } catch (final InstantiationException e) {
                throw new JPrologInternalException("Invalid exception", e);
            } catch (final IllegalAccessException e) {
                throw new JPrologInternalException("Invalid exception", e);
            }
        }
    }

    @Override
    public Bindings createBindings() {
        return new JPrologBindings();
    }

    @Override
    public Object eval(String script, ScriptContext context) throws ScriptException {
        return eval(new StringReader(script), context);
    }

    @Override
    public Object eval(Reader reader, ScriptContext context) throws ScriptException {
        try {
            if (!CompilerConnection.compileCompletly(reader, pMachine)) {
                throw new ScriptException("Could not compile script");
            }
            return true;
        } catch (final IOException e) {
            throw new ScriptException(e);
        }
    }

    @Override
    public PrologScriptEngineFactory getFactory() {
        return factory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getInterface(Class<T> clasz) {
        if (clasz == null)
            throw new IllegalArgumentException("given class is null");
        if (!clasz.isInterface())
            throw new IllegalArgumentException("given class is not an interface");
        if (!hasAllMethods(clasz.getMethods()))
            return null;
        return (T) Proxy
                .newProxyInstance(PrologEngine.class.getClassLoader(), new Class[] { clasz }, getInterfaceHandler());
    }

    @Override
    public <T> T getInterface(Object thiz, Class<T> clasz) {
        throw new UnsupportedOperationException("Prolog is not OO");
    }

    @Override
    public Object invokeFunction(String name, Object... args) throws ScriptException, NoSuchMethodException {
        return invokeFunction(name, args, Boolean.class);
    }

    private boolean hasAllMethods(Method... mets) {
        for (final Method m : mets) {
            final int paramCount = m.getParameterTypes().length + extraArg(m);
            try {
                pMachine.loadPredikaat(m.getName(), paramCount);
            } catch (final Exception ex) {
                if (Boolean.class.equals(m.getReturnType()) || Boolean.TYPE.equals(m.getReturnType())) {
                    try {
                        pMachine.loadPredikaat(m.getName(), paramCount - 1);
                        return true;
                    } catch (final Exception ex2) {
                        log.warn("Fallback failed", ex2);
                    }
                }
                log.warn("Error locating method " + m, ex);
                return false;
            }
        }
        return true;
    }

    private int extraArg(Method m) {
        if (Void.class.equals(m.getReturnType()) || Void.TYPE.equals(m.getReturnType()))
            return 0;
        return 1;
    }

    Object invokeFunction(String name, Object[] args, Class<?> returnType)
            throws ScriptException, NoSuchMethodException {
        if (name == null)
            throw new NullPointerException();
        if (args == null)
            args = new Object[0];
        if (Void.class.equals(returnType) || Void.TYPE.equals(returnType) || returnType == null) {
            if (!hasFunction(name, args.length))
                throw new NoSuchMethodException();
            if (runFunction(name, args) == null)
                throw new ScriptException("Could not reach end of script");
            return true;
        }
        if (Boolean.class.equals(returnType) || Boolean.TYPE.equals(returnType)) {
            if (hasFunction(name, args.length)) {
                return runFunction(name, args) != null;
            } else if (hasFunction(name, args.length + 1)) {
                final Object[] res = runFunction(name, merge(args, new Object()));
                if (res == null)
                    throw new ScriptException("Could not reach end of script");
                return Boolean.valueOf(res[res.length - 1].toString());
            }
        }
        if (returnType.isArray() && Object.class.equals(returnType.getComponentType())
                && hasFunction(name, args.length)) {
            return runFunction(name, args);
        }
        if (hasFunction(name, args.length + 1)) {
            final Object[] res = runFunction(name, merge(args, new Object()));
            if (res == null)
                throw new ScriptException("Could not reach end of script");
            return res[res.length - 1];
        }
        throw new NoSuchMethodException();
    }

    private Object[] merge(Object[] ar1, Object ar2) {
        final Object[] res = new Object[ar1.length + 1];
        System.arraycopy(ar1, 0, res, 0, ar1.length);
        res[ar1.length] = ar2;
        return res;
    }

    @Override
    public Object invokeMethod(Object thiz, String name, Object... args) throws NoSuchMethodException {
        throw new UnsupportedOperationException("Prolog is not OO, try invokeFunction");
    }

    private synchronized InterfaceInvocationHandler getInterfaceHandler() {
        if (handler == null)
            handler = new InterfaceInvocationHandler(this);
        return handler;
    }

    protected boolean hasFunction(String name, int arity) {
        return pMachine.couldLoadPredikaat(name, arity);
    }

    protected ParameterConverter getParameterConverter() {
        return ParameterConverter.getConverterForEngine(pMachine);
    }

    private Object[] runFunction(String name, Object[] args) throws JPrologScriptException {
        final ParameterConverter conv = getParameterConverter();
        final ConvertieData ar = conv.makeParams(args);
        synchronized (pMachine) {
            if (pMachine.solveGoalOnce(S(name, ar.getPrologParams())) != ErrorStatus.NORMALEXIT)
                return null;
        }
        return conv.getParamRes(ar, ar.getPrologParams());
    }

    protected PrologMachine getPrologMachine() {
        return pMachine;
    }

    @Override
    public void setContext(ScriptContext ctxt) {
        if (!(ctxt instanceof JPrologContext)) {
            log.info("Invalid context given, should be a JPrologContext - converting");
            super.setContext(new JPrologContext(ctxt));
        } else
            super.setContext(ctxt);
    }

    @Override
    public JPrologContext getContext() {
        return (JPrologContext) super.getContext();
    }

}
