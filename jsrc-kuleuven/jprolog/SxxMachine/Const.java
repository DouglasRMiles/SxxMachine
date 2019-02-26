
package SxxMachine;

import java.util.Arrays;

public final class Const extends JpATerm {

    private final static String NIL_STR = Const.strIntern("[]");
    public final static Const NIL = JpFactory.CONST(NIL_STR);
    private final static Const NULL = JpFactory.CONST((Object) null);
    private final static String NULL_STR = "Null";

    private final Object value;

    public static Const javaNull() {
        return NULL;
    }

    @Override
    public long longValue() {
        return 0;
    }

    Const(Object o) {
        /* Code voor verschil 'null' en null weg te werken maar verschil is belangrijk
        if (o != null && o instanceof String) {
          if (NULL_STR.equalsIgnoreCase((String)o)) o = null;
        } */
        value = o;
    }

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        return JpFactory.CONST(value);
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    public String toStringImpl(int depth) {
        if (value == null)
            return NULL_STR;
        return value.toString();
    }

    @Override
    public boolean unify(Term that) {
        if (this.getClass() == that.getClass())
            return equalsTerm(that);
        return that.bind(this);
    }

    public Object getValue() {
        return value;
    }

    @Override
    public boolean couldUnify(Term object) {
        return equalsTerm(object.dref()) || object.couldUnifyInverse(this);
    }

    @Override
    public boolean equalsTerm(Term that) {
        if (that instanceof Const) {
            Const t = (Const) that;
            if (value == null)
                return t.getValue() == null;
            if (t.getValue() == null)
                return false;
            if (value.getClass().isArray()) {
                if (!t.getValue().getClass().isArray())
                    return false;
                return Arrays.deepEquals((Object[]) value, (Object[]) t.getValue());
            }
            return value.equals(t.getValue());
        }
        if (that instanceof AFunct) {
            return that.equalsTerm(this);
        }
        return false;
    }

    @Override
    public int termHashCode() {
        if (value == null)
            return 0;
        if (value.getClass().isArray())
            return Arrays.deepHashCode((Object[]) value);
        return value.hashCode();
    }

    @Override
    public int arity() {
        return 0;
    }

    @Override
    public String fname() {
        if (value == null)
            return NULL_STR;
        if (value instanceof String)
            return (String) value;
        return value.toString();
    }

    @Override
    public boolean isNil() {
        return value != null && value.equals(NIL_STR);
    }

    @Override
    public Const asTerm() {
        return this;
    }

    public static String strIntern(String string) {
        return string.intern();
    }

}
