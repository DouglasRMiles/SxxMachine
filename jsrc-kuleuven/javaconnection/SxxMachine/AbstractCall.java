
package SxxMachine;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import SxxMachine.specialConvertionRules2Java.NoSuchConvertionException;
import SxxMachine.specialConvertionRules2Java.RuleManager;

abstract class AbstractJCall extends Code {

    private final static Logger log = Logger.getLogger(AbstractCall.class);

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] args = mach.getAreg();
        Term classObject = args[0].dref();
        Term methodInvocation = args[1].dref();
        Term res = args[2].dref();
        Term exception = args[3].dref();
        Term cont = args[4];
        if (!(classObject instanceof Const))
            return mach.Fail0;
        Class<?> callClass;
        try {
            callClass = getClass((Const) classObject);
        } catch (IllegalArgumentException ex) {
            log.debug("Error getting class-object: ", ex);
            return mach.Fail0;
        }
        String methodName;
        Object[] methodArgs;
        if (methodInvocation instanceof Const) {
            methodName = ((Const) methodInvocation).fname();
            methodArgs = new Object[0];
        } else {
            if (!(methodInvocation instanceof AFunct))
                return mach.Fail0;
            AFunct f = (AFunct) methodInvocation;
            methodName = f.fname();
            methodArgs = new Object[f.arity()];
            for (int i = 0; i < methodArgs.length; i++) {
                try {
                    methodArgs[i] = PrimaryConversion.convert2java(f.args()[i]);
                } catch (JPrologScriptException e) {
                    throw new JPrologInternalException("Error converting methode args", e, this);
                }
            }
        }
        return doInvoke(mach, args, classObject, res, exception, cont, callClass, methodName, methodArgs);
    }

    private Code doInvoke(PrologMachine mach, Term[] args, Term classObject, Term res, Term exception, Term cont,
            Class<?> callClass, String methodName, Object[] methodArgs) {
        Method m;
        try {
            m = findMethod(callClass, methodName, methodArgs);
        } catch (IllegalArgumentException ex) {
            log.debug(ex);
            return mach.Fail0;
        }
        try {
            if (!res.unify(JpFactory.CONST(m.invoke(((Const) classObject).getValue(), methodArgs))))
                return mach.Fail0;
            if (!(exception.unify(Const.javaNull())))
                return mach.Fail0;
        } catch (Throwable ex) {
            log.debug(ex);
            if (!exception.unify(JpFactory.CONST(ex)))
                return mach.Fail0;
        }
        args[1] = args[2] = args[3] = args[4] = null;
        args[0] = cont;
        return mach.Call1;
    }

    private Method findMethod(Class<?> c, String name, Object[] args) throws IllegalStateException {
        try {
            return findMethod(false, c, name, args);
        } catch (IllegalStateException ex) {
            return findMethod(true, c, name, args);
        }
    }

    private Method findMethod(boolean useAutoConvert, Class<?> c, String name, Object[] args)
            throws IllegalStateException {
        Method[] mets = c.getMethods();
        for (Method m : mets)
            if (m.getName().equals(name) && (m.isAccessible() || Modifier.isPublic(m.getModifiers()))) {
                if (isValidMethod(useAutoConvert, m, args))
                    return m;
            }
        throw new IllegalStateException("Not a valid method found for " + name + " args: " + Arrays.toString(args));
    }

    private boolean isValidMethod(boolean useExtraConvert, Method m, Object[] args) {
        if (m.getParameterTypes().length != args.length)
            return false;
        Object[] arCopy = args.clone();
        for (int i = 0; i < args.length; i++) {
            Class<?> type = m.getParameterTypes()[i];
            if (args[i] != null) {
                Class<?> paramType = args[i].getClass();
                if (!type.isAssignableFrom(paramType)) {
                    if (!useExtraConvert)
                        return false;
                    //Poging doen voor een speciale convertie
                    try {
                        arCopy[i] = RuleManager.getInstance().tryToConvert(type, args[i]);
                    } catch (NoSuchConvertionException ex) {
                        log.debug("convertionexception", ex);
                        return false;
                    }
                }
            } else if (type.isPrimitive())
                return false;
        }
        System.arraycopy(arCopy, 0, args, 0, args.length);
        return true;
    }

    protected abstract Class<?> getClass(Const c) throws IllegalArgumentException;

}
