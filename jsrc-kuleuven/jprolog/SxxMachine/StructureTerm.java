
package SxxMachine;

import java.util.ArrayList;
import java.util.List;

public class StructureTerm extends AFunct {

    final static String LIST = Const.strIntern(".");

    private final Term[] argz;

    private final String name;

    @Override
    public Term copy(RunningPrologMachine m, long t) {
        int a = arity();
        AFunct f = new StructureTerm(fname(), a);
        Term arg;
        while (a-- > 0) {
            arg = args()[a].dref();
            f.args()[a] = arg.copy(m, t);
        }
        return f;
    }

    public List<Term> toList() {
        if (!isCons())
            return null;
        List<Term> l = new ArrayList<Term>();
        Term o = this;
        while (o.isCons()) {
            StructureTerm f = (StructureTerm) o;
            l.add(f.args()[0].dref());
            o = f.args()[1].dref();
        }
        return l;
    }

    public Term makeList(Iterable<Term> c, PrologMachine m) {
        JpVar v = JpFactory.JVAR(m);
        Term start = v;
        for (Term obj : c) {
            JpVar next = JpFactory.JVAR(m);
            v.unify(JpFactory.S(LIST, obj, next));
            v = next;
        }
        v.unify(Const.NIL);
        return start;
    }

    protected StructureTerm(String naam, int arity) {
        if (naam == null)
            throw new NullPointerException();
        name = naam;
        argz = new Term[arity];
    }

    StructureTerm(String naam, Term... args) {
        if (naam == null)
            throw new NullPointerException();
        name = naam;
        argz = args;
    }

    @Override
    public long longValue() {
        int arity = arity();
        long i1, i2;
        String operator = fname();
        if (arity == 1) {
            i1 = (args()[0].dref()).longValue();
            if ("-".equals(operator))
                return -i1;
            if ("+".equals(operator))
                return i1;
            return 0;
        }
        if (arity != 2)
            return 0;
        i1 = args()[0].dref().longValue();
        i2 = args()[1].dref().longValue();

        if ("-".equals(operator))
            return i1 - i2;
        if ("+".equals(operator))
            return i1 + i2;
        if ("*".equals(operator))
            return i1 * i2;
        if ("/".equals(operator))
            return i1 / i2;
        if ("/\\".equals(operator))
            return i1 & i2;
        if ("\\/".equals(operator))
            return i1 | i2;
        if ("mod".equalsIgnoreCase(operator)) {
            return i1 % i2;
        }
        return 0;
    }

    @Override
    public boolean couldUnifyInverse(Term object) {
        if (object instanceof Const) {
            //speciaal geval
            Const c = (Const) object;
            return fname().equals(c.fname()) && arity() == 0;
        } else if (object instanceof AFunct) {
            AFunct f = (AFunct) object;
            if (!fname().equals(f.fname()))
                return false;
            if (arity() != f.arity())
                return false;
            //nu moeten ook alle args passen
            Term[] args = args();
            Term[] args2 = f.args();
            for (int i = 0; i < args.length; i++) {
                if (!args[i].couldUnify(args2[i]))
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean couldUnify(Term object) {
        if (object instanceof StructureTerm)
            return couldUnifyInverse(object);
        return object.couldUnify(this);
    }

    @Override
    public boolean equalsTerm(Term that) {
        AFunct tmpfunct;
        Term arg1[], obj1;
        Term arg2[], obj2;

        if (!fname().equals(that.fname()))
            return false;
        if (!getClass().equals(that.getClass())) {
            //Kan nog gelijk zijn aan een constante zonder parameters
            if (that instanceof Const) {
                return arity() == 0;
            }
            return false;
        }

        tmpfunct = (AFunct) that; // cast perhaps to be avoided
        int length = arity();
        if (length != tmpfunct.arity())
            return false;
        arg1 = this.args();
        arg2 = tmpfunct.args();
        for (int i = 0; i < length; i++) {
            obj1 = arg1[i].dref();
            obj2 = arg2[i].dref();
            if (!(obj1.equalsTerm(obj2)))
                return false;
        }
        return true;
    }

    @Override
    public String fname() {
        return name;
    }

    @Override
    public Term[] args() {
        return argz;
    }

}
