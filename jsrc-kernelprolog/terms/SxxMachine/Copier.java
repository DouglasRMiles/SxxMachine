package SxxMachine;

// V;
import static SxxMachine.pterm.TermData.*;

import java.util.ArrayList;
import java.util.Iterator;

//!depends
/**
 * Term Copier agent. Has its own Variable dictionnary. Uses a generic action
 * propagator which recurses over Terms.
 */
public class Copier extends JPrologObject {
    private HashDict dict;

    /**
     * creates a new Copier together with its related HashDict for variables
     */
    public Copier() {
        dict = new HashDict();
    }

    /**
     * This action only defines what happens here (at this <b> place </b>). Ageneric
     * mechanism will be used to recurse over Terms in a (truly:-)) OO style (well,
     * looks more like some Haskell stuff, but who cares).
     */
    @Override
    public Term action(Term place) {

        if (place.isVar()) {
            Var root = (Var) dict.get(place);
            if (null == root) {
                root = V();
                dict.put(place, root);
            }
            place = root;
        }

        return place;
    }

    Term copyMe(Term that) {
        return that.reaction(this);
    }

    /**
     * Reifies an Iterator as a ArrayList. ArrayList.iterator() can give back the
     * ArrayList.iterator() can give back the iterator if needed.
     *
     * @see Copier
     */
    static ArrayList EnumerationToVector(Iterator e) {
        ArrayList V = new ArrayList();
        while (e.hasNext()) {
            V.add(e.next());
        }
        return V;
    }

    public static ArrayList TermToVector(Term Xs) {
        if (Xs.isCons()) {
            return ConsToVector((Nonvar) Xs);
        }
        ArrayList V = new ArrayList();
        Term t = Xs;
        if (t.isCompound()) {
            V.add(t.functor());
            final int arity = t.arity();
            for (int i = 0; i < arity; i++) {
                V.add(t.getDrefArg(i));
            }
        } else {
            V.add(t);
        }
        // IO.mes("V="+V);
        return V;

    }

    public static ArrayList ConsToVector(Nonvar Xs) {
        ArrayList V = new ArrayList();
        Term t = Xs;
        for (;;) {
            if (t.isNil()) {
                break;
            } else if (t.isCons()) {
                Term c = asCons(t);
                V.add(c.getDrefArg(0));
                t = c.getDrefArg(1);
            } else if (t.isAtomOrObject()) {
                V.add(t);
                break;
            } else {
                V = null;
                IO.errmes("bad Cons in ConsToVector: " + t);
                break;
            }
        }
        // IO.mes("V="+V);
        return V;
    }

    /**
     * Converts a reified Iterator to functor based on name of Const c and Arguments
     * being the elements of the Iterator.
     */

    static Term toFun(Atomic c, Iterator e) {
        ArrayList V = EnumerationToVector(e);
        int arity = V.size();
        if (arity == 0)
            return c;
        Term f = createStructureTerm(c.fname(), arity);
        for (int i = 0; i < arity; i++) {
            f.setArg(i, (Term) V.get(i));
        }
        return f;
    }

    /**
     * Represents a list [f,a1...,an] as f(a1,...,an)
     */

    public static Term VectorToFun(ArrayList V) {
        Functor f = (Functor) V.get(0);
        int arity = V.size() - 1;
        Term T = createStructureTerm(f.fname(), arity);
        for (int i = 0; i < arity; i++) {
            T.setArg(i, (Term) V.get(i + 1));
        }
        return T;
    }

    /**
     * Extracts the free variables of a Term, using a care of recursing over its
     * structure. It can be speeded up through specialization.
     */
    final static Atomic anAnswer = SYM("answer");

    public Term getMyVars(Term that) {
        /* Term */that.reaction(this);
        return toFun(anAnswer, dict.keySet().iterator());
    }

}
