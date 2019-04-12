
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@SuppressWarnings("rawtypes")
public class ArrayConverter extends Code {

    private final static Logger log = Logger.getLogger(ArrayConverter.class);

    @Override
    public int arity() {
        return 2;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] local_aregs = mach.getAreg();
        final Term prolog = local_aregs[0].dref();
        final Term java = local_aregs[1].dref();
        final Term javaType = local_aregs[2].dref();
        final Term cont = local_aregs[3].dref();
        if (prolog.isVariable() && java.isVariable()) {
            log.fatal("one of the first 2 vars need to have a value");
            return mach.Fail0;
        }
        if (!java.isVariable()) {
            if (!(java.isAtomOrObject()))
                return mach.Fail0;
            final Object o = ((Const) java).getValue();
            if (o != null && o.getClass().isArray()) {
                //Van array naar prologlijst
                final Object[] array = (Object[]) o;
                if (!prolog.unifyJP(convert2prolog(array)))
                    return mach.Fail0;
                if (!javaType.unifyJP(CONST(array.getClass().getComponentType())))
                    return mach.Fail0;
            } else
                return mach.Fail0;
        } else {
            //van prolog naar java
            final Object res = convert2java(prolog, javaType);
            if (res == null)
                return mach.Fail0;
            if (!java.unifyJP(CONST(res)))
                return mach.Fail0;
        }
        local_aregs[1] = local_aregs[2] = null;
        mach.setCont(local_aregs, 0, cont);
        return mach.getCall1();
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] convert2java(Term list, Term javaType) {
        if (!(javaType.isAtomOrObject()))
            return null;
        final Const javaTypeC = (Const) javaType;
        if (!(javaTypeC.getValue() instanceof Class))
            return null;
        final Class<T> javaClassType = (Class<T>) javaTypeC.getValue();
        return convert2java(list, javaClassType);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] convert2java(Term list, Class javaClassType) {
        List<T> l;
        try {
            l = (List<T>) ListConverter.convert2java(list);
        } catch (final JPrologScriptException ex) {
            log.fatal("Error converting to java", ex);
            return null;
        }
        final T[] result = (T[]) Array.newInstance(javaClassType, l.size());
        l.toArray(result);
        return result;
    }

    public static <T> Term convert2prolog(final T[] array) {
        return ListConverter.convert2prolog(new Iterator<Object>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public T next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return array[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        });
    }

}
