
package SxxMachine;

import java.lang.reflect.Constructor;

public class JPNew extends Code {

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] args = mach.getAreg();
        Term classType = args[0].dref();
        Term classArgs = args[1].dref();
        Term res = args[2].dref();
        Term exception = args[3].dref();
        Term cont = args[4].dref();
        Class<?> targetClass = getTargetClass(mach, classType);
        if (targetClass == null)
            return mach.Fail0;
        if (!classArgs.isCons() && !classArgs.isNil())
            return mach.Fail0;
        Object[] java_args = ArrayConverter.convert2java(classArgs, Object.class);
        if (java_args == null)
            return mach.Fail0;
        try {
            if (!res.unify(JpFactory.CONST(createClass(targetClass, java_args))))
                return mach.Fail0;
            if (!exception.unify(Const.javaNull()))
                return mach.Fail0;
        } catch (Throwable ex) {
            if (!exception.unify(JpFactory.CONST(ex)))
                return mach.Fail0;
        }
        args[1] = args[2] = args[3] = args[4] = null;
        args[0] = cont;
        return mach.Call1;
    }

    private Class<?> getTargetClass(PrologMachine mach, Term classType) {
        if (!(classType instanceof Const) || !(((Const) classType).getValue() instanceof Class)) {
            JpVar v = JpFactory.JVAR(mach);
            if (!ClassPred.find(v, classType))
                return null;
            return (Class<?>) ((Const) v.dref()).getValue();
        } else
            return (Class<?>) ((Const) classType).getValue();
    }

    private <T> T createClass(Class<T> c, Object... args) throws Throwable {
        Class<?>[] argClasses = new Class<?>[args.length];
        for (int i = 0; i < argClasses.length; i++)
            if (args[i] != null)
                argClasses[i] = args[i].getClass();
        Constructor<T> con = findConstructor(c, argClasses);
        return con.newInstance(args);
    }

    @SuppressWarnings("unchecked")
    private <T> Constructor<T> findConstructor(Class<T> c, Class<?>... args) {
        Constructor<T>[] cons = (Constructor<T>[]) c.getConstructors();
        for (Constructor<T> con : cons) {
            if (isValidConstructor(con, args))
                return con;
        }
        throw new IllegalStateException("No valid constructor found");
    }

    private boolean isValidConstructor(Constructor<?> con, Class<?>... args) {
        Class<?>[] constructorArgs = con.getParameterTypes();
        if (constructorArgs.length == args.length) {
            for (int i = 0; i < args.length; i++) {
                if (!((args[i] != null && constructorArgs[i].isAssignableFrom(args[i])) || (args[i] == null)))
                    return false;
            }
            return true;
        }
        return false;
    }

}
