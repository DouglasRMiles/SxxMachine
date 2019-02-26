package SxxMachine.pterm;

import SxxMachine.*;

abstract public class Funct0 extends KPNonvar implements Term {

    final public String fname() {
        return sym;
    }

    public Funct0() {
    }

    public Funct0(String s) {
        setSym(s);
    }

    @Override
    public String toString() {
        return qname();
    }

    @Override
    public boolean bind(Term that, KPTrail trail) {
        return super.bind(that, trail) && ((Funct0) that).sym == sym;
    }

    @Override
    public boolean equalsTerm(Term that) {
        return (that instanceof Funct0) && ((Funct0) that).sym == sym;
    }

    @Override
    public String getFAKey() {
        return qname() + "/0";
    }

    /**
      returns an arity normally defined as 0
      @see Term#CONST
    */
    @Override
    public int type() {
        return KPTerm.CONST;
    }

    //    /**
    //      creates a AtomProceedure from a Atom known to be registered as
    //      being a builtin while returning its argument unchanged if it
    //      is just a plain Prolog constant with no builtin code attached to it
    //    */
    //    public Funct0 toProceedure(IProceedureMap bb) {
    //        final String name = fname();
    //        if (name.equals(Prolog.aNil.fname()))
    //            return Prolog.aNil;
    //        if (name.equals(Prolog.aNo.fname()))
    //            return Prolog.aNo;
    //        if (name.equals(Prolog.aYes.fname()))
    //            return Prolog.aYes;
    //
    //        Object B = bb.getProceedure(this);
    //        if (B instanceof O1Queue)
    //            return this;
    //        if (null == B) {
    //            //IO.mes("not a builtin:"+this);
    //            return this;
    //        }
    //        return (Funct0) B;
    //    }

}
