
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

import java.lang.reflect.Constructor;

public class JPException extends Code {

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] args = mach.getAreg();
        args[4] = args[3];
        args[3] = Const.javaNull();
        return mach.loadPred("jp_exception", 4).exec(mach);
    }

}

class JPException4 extends Code {

    private final static Logger log = Logger.getLogger(JPException4.class);

    @Override
    public int arity() {
        return 4;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Code exec(PrologMachine mach) {
        final Term[] args = mach.getAreg();
        final Term exception = args[0].dref();
        final Term exceptionClass = args[1].dref();
        final Term exceptionMsg = args[2].dref();
        final Term exceptionCause = args[3].dref();
        if (!exception.isVariable()) {
            if (!(exception .isConst()))
                return mach.Fail0;
            final Const c = (Const) exception;
            if (!(c.getValue() instanceof Throwable))
                return mach.Fail0;
            final Throwable throwable = (Throwable) c.getValue();
            if (!exceptionClass.unify(CONST(throwable.getClass())))
                return mach.Fail0;
            if (!exceptionMsg.unify(CONST(throwable.getMessage())))
                return mach.Fail0;
            if (!exceptionCause.unify(CONST(throwable.getCause())))
                return mach.Fail0;
        } else {
            Class<Throwable> throwableClass;
            String errMsg;
            Throwable cause;
            try {
                throwableClass = (Class<Throwable>) ((Const) exceptionClass).getValue();
                if (exceptionMsg .isCompound()) {
                    final AFunct f = (AFunct) exceptionMsg;
                    if (f.arity() == 0)
                        errMsg = f.fname();
                    else
                        return mach.Fail0;
                } else
                    errMsg = (String) ((Const) exceptionMsg).getValue();
                cause = (Throwable) ((Const) exceptionCause).getValue();
            } catch (final ClassCastException ex) {
                log.debug(ex);
                return mach.Fail0;
            }
            Throwable error;
            try {
                if (cause == null)
                    error = throwableClass.getConstructor(String.class).newInstance(errMsg);
                else
                    error = findConstructor(throwableClass, cause.getClass()).newInstance(errMsg, cause);
            } catch (final Exception e) {
                log.warn("Error creating exception", e);
                return mach.Fail0;
            }
            if (!exception.unify(CONST(error)))
                return mach.Fail0;
        }
        args[0] = args[4];
        args[1] = args[2] = args[3] = args[4] = null;
        return mach.Call1;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private <Throw extends Throwable> Constructor<Throw> findConstructor(Class<Throw> c,
            Class<? extends Throwable> errType) {
        for (final Constructor con : c.getConstructors()) {
            final Class<?>[] params = con.getParameterTypes();
            if (params.length == 2 && String.class.equals(params[0])) {
                if (params[1].isAssignableFrom(errType))
                    return con;
            }
        }
        throw new IllegalStateException("No valid constructor found for " + c);
    }

}
