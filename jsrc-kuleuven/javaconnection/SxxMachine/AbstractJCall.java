
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

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
        final TermArray local_aregs = mach.getAreg();
        final Term classObject = local_aregs.getTermDRef(0);
        final Term methodInvocation = local_aregs.getTermDRef(1);
        final Term res = local_aregs.getTermDRef(2);
        final Term exception = local_aregs.getTermDRef(3);
        final Term cont = local_aregs.getPlainArg(4);
        if (!(classObject.isAtomOrObject()))
            return mach.Fail0;
        Class<?> callClass;
        try {
            callClass = getClass((Const) classObject);
        } catch (final IllegalArgumentException ex) {
            log.debug("Error getting class-object: ", ex);
            return mach.Fail0;
        }
        String methodName;
        Object[] methodArgs;
        if (methodInvocation.isAtomOrObject()) {
            methodName = methodInvocation.fname();
            methodArgs = new Object[0];
        } else {
            if (!(methodInvocation.isCompound()))
                return mach.Fail0;
            final AFunct f = (AFunct) methodInvocation;
            methodName = f.fname();
            methodArgs = new Object[f.arity()];
            for (int i = 0; i < methodArgs.length; i++) {
                try {
                    methodArgs[i] = PrimaryConversion.convert2java(f.getPlainArg(i));
                } catch (final JPrologScriptException e) {
                    throw new JPrologInternalException("Error converting methode args", e, this);
                }
            }
        }
        return doInvoke(mach, local_aregs, classObject, res, exception, cont, callClass, methodName, methodArgs);
    }

    private Code doInvoke(PrologMachine mach, TermArray local_aregs, Term classObject, Term res, Term exception,
            Term cont, Class<?> callClass, String methodName, Object[] methodArgs) {
        Method m;
        try {
            m = findMethod(callClass, methodName, methodArgs);
        } catch (final IllegalArgumentException ex) {
            log.debug(ex);
            return mach.Fail0;
        }
        try {
            if (!res.unifyJP(CONST(m.invoke(((Const) classObject).getValue(), methodArgs))))
                return mach.Fail0;
            if (!(exception.unifyJP(Const.javaNull())))
                return mach.Fail0;
        } catch (final Throwable ex) {
            log.debug(ex);
            if (!exception.unifyJP(CONST(ex)))
                return mach.Fail0;
        }
        local_aregs.setAreg1(( local_aregs.setAreg2(( local_aregs.setAreg3(( local_aregs.setAreg4(( null))))))));
        mach.setCont(local_aregs, 0, cont);
        return mach.getCall1();
    }

    private Method findMethod(Class<?> c, String name, Object[] args) throws IllegalStateException {
        try {
            return findMethod(false, c, name, args);
        } catch (final IllegalStateException ex) {
            return findMethod(true, c, name, args);
        }
    }

    private Method findMethod(boolean useAutoConvert, Class<?> c, String name, Object[] args)
            throws IllegalStateException {
        final Method[] mets = c.getMethods();
        for (final Method m : mets)
            if (m.getName().equals(name) && (m.isAccessible() || Modifier.isPublic(m.getModifiers()))) {
                if (isValidMethod(useAutoConvert, m, args))
                    return m;
            }
        throw new IllegalStateException("Not a valid method found for " + name + " args: " + Arrays.toString(args));
    }

    private boolean isValidMethod(boolean useExtraConvert, Method m, Object[] args) {
        if (m.getParameterTypes().length != args.length)
            return false;
        final Object[] arCopy = args.clone();
        for (int i = 0; i < args.length; i++) {
            final Class<?> type = m.getParameterTypes()[i];
            if (args[i] != null) {
                final Class<?> paramType = args[i].getClass();
                if (!type.isAssignableFrom(paramType)) {
                    if (!useExtraConvert)
                        return false;
                    //Poging doen voor een speciale convertie
                    try {
                        arCopy[i] = RuleManager.getInstance().tryToConvert(type, args[i]);
                    } catch (final NoSuchConvertionException ex) {
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
