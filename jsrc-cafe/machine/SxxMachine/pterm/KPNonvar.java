package SxxMachine.pterm;

import SxxMachine.*;
import SxxMachine.pterm.ANonvar;
import SxxMachine.pterm.PTerm;
import SxxMachine.pterm.SystemObject;

/**
  Part of the Prolog ITerm hierarchy
  @see Term
*/
abstract public class KPNonvar extends SystemObject {

    public void setSym(String s) {
        sym = s.intern();
        if (SymbolTerm.MaybeQuoted(s) != sym)
            qnamed = '\'' + s + '\'';
        else
            qnamed = sym;
    }

    @Override
    public String toUnquoted() {
        return sym;
    }

    //    long ordinal;
    public String sym;
    public String qnamed;

    //    @Override
    //    public String fname() throws Exception {
    //        return sym;
    //    }

    @Override
    public String getFAKey() {
        return sym;
    }

    @Override
    public String qname() {
        return qnamed;
    }

    @Override
    public boolean bind(Term that, Trail trail) {
        return getClass() == that.getClass();
    }

    @Override
    public boolean Unify_TO(Term that, Trail trail) {
        if (that.bind(this, trail))
            return true;
        else
            return that.bind(this, trail);
    }

    @Override
    public boolean bind(Term that) {
        return (that instanceof KPNonvar) && bind(that, (Trail) null);
    }

    /**
      returns a list representation of the object
    */
    public Compound listify() {
        return TermData.CONS(this, (Term) Prolog.Nil);
    }

}
