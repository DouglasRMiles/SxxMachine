
package SxxMachine;

import static SxxMachine.pterm.TermData.CONS;

import SxxMachine.pterm.ANonvar;

/**
  *  @author  toms
  *
  */
public abstract class AFunct extends ANonvar {

    public AFunct() {
        super();
    }

    @Override
    public abstract Term[] args();

    @Override
    public abstract String fname();

    static boolean isCons(int i, String name) {
        if (i != 2)
            return false;
        return ".".equals(name);
    }

    @Override
    public boolean isCons() {
        return isCons(arity(), fname());
    }

    @Override
    public Term dref() {
        return this;
    }

    @Override
    abstract public int arity();

    private String listify(Term T, int depth) {
        if (depth == 0)
            return "|...";
        if (T.isCons()) {
            Term A1, A2;
            A1 = (T).getPlainArg(0);
            A2 = (T).getPlainArg(1);
            A1 = A1.dref();
            A2 = A2.dref();
            return "," + A1.toStringImpl(5) + listify(A2, depth - 1);
        } else if ((T .isConst()) && ("[]".equals(T.fname())))
            return "";
        return " | " + T.toStringImpl(5);
    }

    @Override
    public String toStringImpl(int depth) {
        if (args() == null)
            throw new IllegalStateException("No arguments set!");
        if (depth == 0)
            return "...";
        int i = arity();
        if (i == 0) {
            return fname();
        }
        final Term arg0 = getPlainArg(0);
        if (isCons(i, fname())) {
            return "[" + (arg0.dref()).toStringImpl(5) + listify(getPlainArg(1).dref(), depth - 1) + "]";
        }
        String s = ")";
        Term p;
        while (--i > 0) {
            final Term argument = getPlainArg(i);
            if (argument != null) {
                p = argument.dref();
                s = "," + p.toStringImpl(5) + s;
            } else {
                s = ",null" + s;
            }
        }
        if (arg0 == null)
            p = null;
        else
            p = arg0.dref();
        if (p == null)
            s = "null" + s;
        else
            s = p.toStringImpl(5) + s;
        return fname() + "(" + s;
    }

    @Override
    public abstract Term getPlainArg(int i);

    @Override
    public boolean bind(Term that) {
        if (that .isConst()) {
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
        if (!(fname()).equals(that.fname()))
            return false;

        final AFunct tmpfunct = (AFunct) that; // cast perhaps to be avoided
        int i = arity();
        final int j = tmpfunct.arity();
        if (i != j)
            return false;
        final Term[] arg1 = args();
        final Term[] arg2 = tmpfunct.args();
        while (i > 0) {
            final Term obj1 = arg1[--i].dref();
            final Term obj2 = arg2[i].dref();
            if (!obj1.unify(obj2))
                return false;
        }
        return true;
    }

    public static Term listFromArray(Term[] array) {
        Term list = Prolog.Nil;
        for (int i = array.length - 1; i >= 0; i--) {
            list = CONS(array[i], list);
        }
        return list;
    }

}
