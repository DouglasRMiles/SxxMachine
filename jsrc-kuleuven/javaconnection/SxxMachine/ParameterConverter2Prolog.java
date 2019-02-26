
package SxxMachine;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

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
            Object[] ar = new Object[Array.getLength(o)];
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
                v = JpFactory.JVAR(pMachine);
                obj2Var.put(o, v);
            }
            return v;
        } else if (o != null && o.getClass().isArray()) {
            Object[] ar = getArray(o);

            if (ar.length == 0)
                return Const.NIL;
            StructureTerm head = new StructureTerm(".", 2);
            StructureTerm tail = head;
            boolean add = false;
            for (Object obj : ar) {
                if (add) {
                    StructureTerm f = new StructureTerm(".", 2);
                    tail.args()[1] = f;
                    tail = f;
                }
                tail.args()[0] = makeParam(obj, obj2Var, pMachine);
                add = true;
            }
            tail.args()[1] = Const.NIL;
            return head;
        }
        return PrimaryConversion.convert2Prolog(o);
    }

    ConvertieData makeParams(Object[] args, PrologMachine pMachine) {
        Term[] res = new Term[args.length];
        Map<Object, JpVar> obj2Var = new HashMap<Object, JpVar>();
        for (int i = 0; i < args.length; i++) {
            res[i] = makeParam(args[i], obj2Var, pMachine);
        }
        return new ConvertieData(res, obj2Var);
    }

}
