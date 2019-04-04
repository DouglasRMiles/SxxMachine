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

    final public String fname() {
        return sym;
    }
//
//    public Funct0() {
//    }
//
//    public Funct0(String s) {
//        setSym(s);
//    }

    @Override
    public String toString() {
        return qname();
    }

//    @Override
//    public boolean bindKP(Term that, KPTrail trail) {
//        return super.bindKP(that, trail) && ((Funct0) that).sym == sym;
//    }
//
//    @Override
//    public boolean equalsTerm(Term that) {
//        return (that instanceof Funct0) && ((Funct0) that).sym == sym;
//    }
//
//    @Override
//    public String getFAKey() {
//        return qname() + "/0";
//    }
//
//    /**
//      returns an arity normally defined as 0
//      @see Term#CONST
//    */
//    @Override
//    public int type() {
//        return KPTerm.CONST;
//    }

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
    public void setSym(String s) {
        sym = s.intern();
        if (SymbolTerm.MaybeQuoted(s) != sym)
            qnamed = '\'' + s + '\'';
        else
            qnamed = sym;
    }

    @Override
    public String toUnquotedNumVars() {
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
    public boolean bindKP(Term that, KPTrail trail) {
        return getClass() == that.getClass();
    }

    @Override
    public boolean Unify_TO(Term that, KPTrail trail) {
        if (that.bindKP(this, trail))
            return true;
        else
            return that.bindKP(this, trail);
    }

    @Override
    public boolean bindJP(Term that) {
        return (that instanceof KPNonvar) && bindKP(that, (KPTrail) null);
    }

    /**
      returns a list representation of the object
    */
    public Compound listify() {
        return TermData.CONS(this, (Term) Prolog.Nil);
    }

}
