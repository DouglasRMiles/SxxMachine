
package SxxMachine;

import static SxxMachine.pterm.TermData.*;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import SxxMachine.pterm.StructureTerm;

class ParameterConverter2Prolog {

    private Object[] getArray(Object o) {
        if (o == null)
            throw new NullPointerException();
        if (!o.getClass().isArray())
            throw new IllegalStateException();
        if (o.getClass().getComponentType().isPrimitive()) {
            //Speciale behandeling nodig,
            //int[] a = {...}
            //Object[] b = a; //gaat namelijk niet
            final Object[] ar = new Object[Array.getLength(o)];
            for (int i = 0; i < ar.length; i++)
                ar[i] = Array.get(o, i);
            return ar;
        }
        return (Object[]) o;
    }

    private Term makeParam(Object o, Map<Object, JpVar> obj2Var, PrologMachine pMachine) {
        if (o != null && Object.class.equals(o.getClass())) {
            JpVar v = obj2Var.get(o);
            if (v == null) {
                v = Jv(pMachine);
                obj2Var.put(o, v);
            }
            return v;
        } else if (o != null && o.getClass().isArray()) {
            final Object[] ar = getArray(o);

            if (ar.length == 0)
                return Prolog.Nil;
            final StructureTerm head = S(".", 2);
            StructureTerm tail = head;
            boolean add = false;
            for (final Object obj : ar) {
                if (add) {
                    final StructureTerm f = S(".", 2);
                    tail.setarg0(1, f);
                    tail = f;
                }
                tail.setarg0(0, makeParam(obj, obj2Var, pMachine));
                add = true;
            }
            tail.setarg0(1, Prolog.Nil);
            return head;
        }
        return PrimaryConversion.convert2Prolog(o);
    }

    ConvertieData makeParams(Object[] args, PrologMachine pMachine) {
        final Term[] res = new Term[args.length];
        final Map<Object, JpVar> obj2Var = new HashMap<Object, JpVar>();
        for (int i = 0; i < args.length; i++) {
            res[i] = makeParam(args[i], obj2Var, pMachine);
        }
        return new ConvertieData(res, obj2Var);
    }

}
