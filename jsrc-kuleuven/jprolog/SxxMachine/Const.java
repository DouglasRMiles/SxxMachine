
package SxxMachine;

import static SxxMachine.pterm.TermData.CONST;

import java.util.Arrays;

import SxxMachine.pterm.ANonvar;
import SxxMachine.pterm.TermData;

public abstract class Const extends ANonvar {

    //  public final static String NIL_STR = internS("[]");
    private final static Const NULL = TermData.createJavaObjectTerm(null, Object.class);
    private final static String NULL_STR = "Null";

    public final Object obj;

    public static Const javaNull() {
        return NULL;
    }

    protected Const(Object o) {
        /* Code voor verschil 'null' en null weg te werken maar verschil is belangrijk
        if (o != null && o instanceof String) {
          if (NULL_STR.equalsIgnoreCase((String)o)) o = null;
        } */
        obj = o;
    }

    @Override
    public Term copyJP(RunningPrologMachine m, long t) {
        return CONST(obj);
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    public String toStringImpl(int depth) {
        if (obj == null)
            return NULL_STR;
        return obj.toString();
    }

    @Override
    public boolean unifyJP(Term that) {
        if (this.getClass() == that.getClass())
            return equalsTerm(that);
        return that.bindJP(this);
    }

    //    public Object getValue() {
    //        return value;
    //    }

    @Override
    public boolean couldUnify(Term object) {
        return equalsTerm(object.dref()) || object.couldUnifyInverse(this);
    }

    @Override
    public boolean equalsTerm(Term that, OpVisitor comparator) {
        if (that == this)
            return true;
        if (that .isAtomOrObject()) {
            final Const t = (Const) that;
            if (obj == null)
                return t.getValue() == null;
            if (t.getValue() == null)
                return false;
            if (obj.getClass().isArray()) {
                if (!t.getValue().getClass().isArray())
                    return false;
                return Arrays.deepEquals((Object[]) obj, (Object[]) t.javaInstance());
            }
            return obj.equals(t.getValue());
        }
        if (that .isCompound()) {
            return that.equalsTerm(this);
        }
        return false;
    }
    //
    //    @Override
    //    public int termHashCode() {
    //        if (value == null)
    //            return 0;
    //        if (value.getClass().isArray())
    //            return Arrays.deepHashCode((Object[]) value);
    //        return value.hashCode();
    //    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public String fname() {
        if (obj == null)
            return NULL_STR;
        if (obj instanceof String)
            return (String) obj;
        return obj.toString();
    }
    //
    //    @Override
    //    public boolean isNil() {
    //        return obj != null && obj.equals(NIL_STR);
    //    }

}
