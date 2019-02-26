
package SxxMachine;

import java.util.Comparator;

public class pred_compare_3 extends Code {

    private final static Logger log = Logger.getLogger(pred_compare_3.class);

    private static Comparator<Term> comparator = null;

    public static Comparator<Term> getComparator() {
        if (comparator == null) {
            comparator = new Comparator<Term>() {
                @Override
                public int compare(Term t, Term s) {
                    return compare(t, s);
                }
            };
        }
        return comparator;
    }

    // Int < Const < Funct < Var

    @SuppressWarnings("unchecked")
    public static int compare(Term t, Term s) {
        if (t == s)
            return 0;
        if (t instanceof Int) {
            if (!(s instanceof Int))
                return -1;
            long i1 = ((Int) t).longValue();
            long i2 = ((Int) s).longValue();
            if (i1 < i2)
                return -1;
            if (i1 == i2)
                return 0;
            return 1;
        }

        if (t instanceof Const) {
            if (s instanceof Int)
                return 1;
            if (!(s instanceof Const))
                return -1;
            Const ct = (Const) t;
            Const cs = (Const) s;
            Object value = ct.getValue();
            if (value != null && value instanceof Comparable) {
                Comparable cv = (Comparable) value;
                Object value2 = cs.getValue();
                if (value2 != null && value.getClass().equals(value2.getClass())) {
                    try {
                        return cv.compareTo(value2);
                    } catch (ClassCastException ex) {
                        log.warn("Error casting objects", ex);
                        throw new IllegalStateException("Illegal code in compareTo", ex);
                    }
                }
            }
            String s1 = ct.fname();
            String s2 = cs.fname();
            return s1.compareTo(s2);
        }

        if (t instanceof AFunct) {
            if (s.isVariable())
                return -1;
            if (!(s instanceof AFunct))
                return 1;
            AFunct f1 = (AFunct) t;
            AFunct f2 = (AFunct) s;
            String s1 = f1.fname();
            String s2 = f2.fname();
            int v = s1.compareTo(s2);
            if (v != 0)
                return v;

            int arity1 = f1.arity();
            int arity2 = f2.arity();
            if (arity1 < arity2)
                return -1;
            if (arity1 > arity2)
                return 1;
            for (int i = 0; i < arity1; i++) {
                Term ti = (f1.args()[i]).dref();
                Term si = (f2.args()[i]).dref();
                v = compare(ti, si);
                if (v != 0)
                    return v;
            }
            return 0;
        }

        if (t.isVariable()) {
            if (!(s.isVariable()))
                return 1;
            return t.toString().compareTo(s.toString());
        }

        return 1; // to keep the compiler happy
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        Term[] areg = mach.getAreg();
        Term arg1 = areg[0].dref();
        Term arg2 = areg[1].dref();
        Term arg3 = areg[2].dref();
        int val = compare(arg2, arg3);
        String s;
        if (val < 0)
            s = Const.strIntern("<");
        else if (val == 0)
            s = Const.strIntern("=");
        else
            s = Const.strIntern(">");

        if (!(arg1.unify(JpFactory.CONST(s))))
            return mach.Fail0;
        areg[0] = areg[3]; // install the continuation
        areg[1] = areg[2] = areg[3] = null;
        return mach.Call1;
    }
}
