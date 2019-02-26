
package SxxMachine;

/**
  *  @author  toms
  *
  */
public abstract class AFunct extends JpATerm {

    @Override
    public AFunct asTerm() {
        return this;
    }

    public AFunct() {
        super();
    }

    public abstract Term[] args();

    @Override
    public abstract String fname();

    static protected boolean isConsFunctorRev(int i, String name) {
        if (i != 2)
            return false;
        return ".".equals(name);
    }

    @Override
    public boolean isCons() {
        return isConsFunctorRev(this.arity(), this.fname());
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    public int arity() {
        return args().length;
    }

    private String listify(Term T, int depth) {
        if (depth == 0)
            return "|...";
        if (T.isCons()) {
            Term A1, A2;
            A1 = ((AFunct) T).args()[0];
            A2 = ((AFunct) T).args()[1];
            A1 = A1.dref();
            A2 = A2.dref();
            return "," + A1.toStringImpl(depth - 1) + listify(A2, depth - 1);
        } else if ((T instanceof Const) && ("[]".equals(T.fname())))
            return "";
        return " | " + T.toStringImpl(depth - 1);
    }

    @Override
    public String toStringImpl(int depth) {
        final Term[] arguments = args();
        if (arguments == null)
            throw new IllegalStateException("No arguments set!");
        if (depth == 0)
            return "...";
        int i = arity();
        if (i == 0) {
            return fname();
        }
        if (isConsFunctorRev(i, fname())) {
            return "[" + (arguments[0].dref()).toStringImpl(depth - 1) + listify(arguments[1].dref(), depth - 1) + "]";
        }
        String s = ")";
        Term p;
        while (--i > 0) {
            Term argument = arguments[i];
            if (argument != null) {
                p = argument.dref();
                s = "," + p.toStringImpl(depth - 1) + s;
            } else {
                s = ",null" + s;
            }
        }
        if (arguments[0] == null)
            p = null;
        else
            p = arguments[0].dref();
        if (p == null)
            s = "null" + s;
        else
            s = p.toStringImpl(depth - 1) + s;
        return fname() + "(" + s;
    }

    @Override
    public boolean bind(Term that) {
        if (that instanceof Const) {
            //Kan wel
            if (arity() != 0)
                return false;
            return fname().equals(((Const) that).fname());
        }
        return false;
    }

    @Override
    public boolean unify(Term that) {
        if (getClass() != that.getClass()) {
            if (bind(that))
                return true;
            return that.bind(this);
        }
        // if (!((this.Name).equals(that.GetName()))) return false ;
        if (!(this.fname()).equals(that.fname()))
            return false;

        AFunct tmpfunct = (AFunct) that; // cast perhaps to be avoided
        int i = arity();
        int j = tmpfunct.arity();
        if (i != j)
            return false;
        Term[] arg1 = args();
        Term[] arg2 = tmpfunct.args();
        while (i > 0) {
            Term obj1 = arg1[--i].dref();
            Term obj2 = arg2[i].dref();
            if (!obj1.unify(obj2))
                return false;
        }
        return true;
    }

    public static Term listFromArray(Term[] array) {
        Term list = Const.NIL;
        for (int i = array.length - 1; i >= 0; i--) {
            list = JpFactory.cons(array[i], list);
        }
        return list;
    }

}
