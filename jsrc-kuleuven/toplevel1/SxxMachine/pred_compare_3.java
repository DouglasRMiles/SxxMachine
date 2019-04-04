
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;
import static SxxMachine.pterm.TermData.internS;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class pred_compare_3 extends Code {

    private final static Logger log = Logger.getLogger(pred_compare_3.class);

    private static Comparator<Term> comparator = null;

    public static Comparator<Term> getComparator() {
        if (comparator == null) {
            comparator = (t, s) -> compare(t, s);
        }
        return comparator;
    }

    // Int < Const < Funct < Var

    @SuppressWarnings("unchecked")
    public static int compare(Term t, Term s) {
        if (t == s)
            return 0;
        if (t instanceof NumberTerm) {
            if (!(s instanceof NumberTerm))
                return -1;
            final long i1 = ((NumberTerm) t).longValue();
            final long i2 = ((NumberTerm) s).longValue();
            if (i1 < i2)
                return -1;
            if (i1 == i2)
                return 0;
            return 1;
        }

        if (t.isAtomOrObject()) {
            if (s instanceof NumberTerm)
                return 1;
            if (!(s.isAtomOrObject()))
                return -1;
            final Const ct = (Const) t;
            final Const cs = (Const) s;
            final Object value = ct.getValue();
            if (value != null && value instanceof Comparable) {
                final Comparable cv = (Comparable) value;
                final Object value2 = cs.getValue();
                if (value2 != null && value.getClass().equals(value2.getClass())) {
                    try {
                        return cv.compareTo(value2);
                    } catch (final ClassCastException ex) {
                        log.warn("Error casting objects", ex);
                        throw new IllegalStateException("Illegal code in compareTo", ex);
                    }
                }
            }
            final String s1 = ct.fname();
            final String s2 = cs.fname();
            return s1.compareTo(s2);
        }

        if (t.isCompound()) {
            if (s.isVariable())
                return -1;
            if (!(s.isCompound()))
                return 1;
            final AFunct f1 = (AFunct) t;
            final AFunct f2 = (AFunct) s;
            final String s1 = f1.fname();
            final String s2 = f2.fname();
            int v = s1.compareTo(s2);
            if (v != 0)
                return v;

            final int arity1 = f1.arity();
            final int arity2 = f2.arity();
            if (arity1 < arity2)
                return -1;
            if (arity1 > arity2)
                return 1;
            for (int i = 0; i < arity1; i++) {
                final Term ti = (f1.getPlainArg(i)).dref();
                final Term si = (f2.getPlainArg(i)).dref();
                v = compare(ti, si);
                if (v != 0)
                    return v;
            }
            return 0;
        }

        if (t.isVariable()) {
            if (!(s.isVariable()))
                return 1;
            return t.portrayTerm().compareTo(s.portrayTerm());
        }

        return 1; // to keep the compiler happy
    }

    @Override
    public int arity() {
        return 3;
    }

    @Override
    public Code exec(PrologMachine mach) {
        final Term[] areg = mach.getAreg();
        final Term arg1 = areg[0].dref();
        final Term arg2 = areg[1].dref();
        final Term arg3 = areg[2].dref();
        final int val = compare(arg2, arg3);
        String s;
        if (val < 0)
            s = internS("<");
        else if (val == 0)
            s = internS("=");
        else
            s = internS(">");

        if (!(arg1.unifyJP(CONST(s))))
            return mach.Fail0;
        areg[0] = areg[3]; // install the continuation
        areg[1] = areg[2] = areg[3] = null;
        return mach.Call1;
    }
}
