package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;

import SxxMachine.Compound;
import SxxMachine.IllegalTypeException;
import SxxMachine.KPTrail;
import SxxMachine.Nonvar;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.Term;

/**
 * Part of the Prolog Term hierarchy
 *
 * @see Term
 */
public abstract class ANonvar extends PTerm implements Nonvar {

    public boolean isFunctor(String string) throws IllegalTypeException {
        String fname = fname();
        return fname.equals(string);
    }

    // public boolean equalsTerm(Term ano2) {
    // return this==ano2;
    // }
    /* (non-Javadoc)
     * @see SxxMachine.pterm.INonVar#isNonvar()
     */
    @Override
    public boolean isNonvar() {
        return true;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Nonvar#getHead()
     */
    @Override
    public Term getHead() {
        return car().dref();
    }
    
    /* (non-Javadoc)
     * @see SxxMachine.Nonvar#getTail()
     */
    @Override
    public Term getTail() {
        return cdr().dref();
    }
    
    @Override
    final public Term getDrefArg(int i) {
        return getPlainArg(i).dref();
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.Functor#ArgNoDeRef(int)
     */
    @Override
    public Term getPlainArg(int i) {
        oopsy("not for ANonvar");
        return getPlainArg(i);
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.INonVar#unifyArg(int, SxxMachine.Term, SxxMachine.Prog)
     */
    @Override
    public int unifyArg(int i, Term a, Prog p) {
        a = a.dref();
        return getDrefArg(i).Unify_TO(a.dref(), p.getTrail()) ? 1 : 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.pterm.INonVar#getIntArg(int)
     */
    @Override
    public int getIntArg(int i) {
        return (int) TermData.asInt(getDrefArg(i)).doubleValue();
    }

    @Override
    public String fname() {
        oopsy("unknown fname");
        return null;
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        if (getClass() == that.getClass())
            return true;
        // oopsy();
        return false;
    }

    @Override
    public boolean Unify_TO(Term that, KPTrail trail) {
        if (bind(that, trail))
            return true;
        else
            return that.bind(this, trail);
    }

    /**
     * returns a list representation of the object
     */
    @Override
    public Compound listify() {
        return CONS(this, Prolog.Nil);
    }
}
