
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.lang.reflect.Constructor;

public class JPNew extends Code {

    @Override
    public int arity() {
        return 4;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final TermArray local_aregs = mach.getAreg();
        final Term classType = local_aregs.getTermDRef(0);
        final Term classArgs = local_aregs.getTermDRef(1);
        final Term res = local_aregs.getTermDRef(2);
        final Term exception = local_aregs.getTermDRef(3);
        final Term cont = local_aregs.getPlainArg(4);
        final Class<?> targetClass = getTargetClass(mach, classType);
        if (targetClass == null)
            return mach.Fail0;
        if (!classArgs.isCons() && !classArgs.isNil())
            return mach.Fail0;
        final Object[] java_args = ArrayConverter.convert2java(classArgs, Object.class);
        if (java_args == null)
            return mach.Fail0;
        try {
            if (!res.unifyJP(CONST(createClass(targetClass, java_args))))
                return mach.Fail0;
            if (!exception.unifyJP(Const.javaNull()))
                return mach.Fail0;
        } catch (final Throwable ex) {
            if (!exception.unifyJP(CONST(ex)))
                return mach.Fail0;
        }
        local_aregs.setAreg1((local_aregs.setAreg2((local_aregs.setAreg3((local_aregs.setAreg4((null))))))));
        mach.setCont(local_aregs, 0, cont);
        return mach.getCall1();
    }

    private Class<?> getTargetClass(PrologMachine mach, Term classType) {
        if (!(classType.isAtomOrObject()) || !(((Const) classType).getValue() instanceof Class)) {
            final JpVar v = Jv(mach);
            if (!ClassPred.find(v, classType))
                return null;
            return (Class<?>) ((Const) v.dref()).getValue();
        } else
            return (Class<?>) ((Const) classType).getValue();
    }

    private <T> T createClass(Class<T> c, Object... args) throws Throwable {
        final Class<?>[] argClasses = new Class<?>[args.length];
        for (int i = 0; i < argClasses.length; i++)
            if (args[i] != null)
                argClasses[i] = args[i].getClass();
        final Constructor<T> con = findConstructor(c, argClasses);
        return con.newInstance(args);
    }

    @SuppressWarnings("unchecked")
    private <T> Constructor<T> findConstructor(Class<T> c, Class<?>... args) {
        final Constructor<T>[] cons = (Constructor<T>[]) c.getConstructors();
        for (final Constructor<T> con : cons) {
            if (isValidConstructor(con, args))
                return con;
        }
        throw new IllegalStateException("No valid constructor found");
    }

    private boolean isValidConstructor(Constructor<?> con, Class<?>... args) {
        final Class<?>[] constructorArgs = con.getParameterTypes();
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
