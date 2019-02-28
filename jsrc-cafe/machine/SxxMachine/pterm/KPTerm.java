package SxxMachine.pterm;

import static SxxMachine.pterm.TermData.CONS;
import static SxxMachine.pterm.TermData.Long;

import java.util.Iterator;
import java.util.Map;

import SxxMachine.Compound;
import SxxMachine.Copier;
import SxxMachine.Functor;
import SxxMachine.IllegalTypeException;
import SxxMachine.KPTrail;
import SxxMachine.Trail;
import SxxMachine.Nonvar;
import SxxMachine.NumberTerm;
import SxxMachine.OpVisitor;
import SxxMachine.Prog;
import SxxMachine.Prolog;
import SxxMachine.RunningPrologMachine;
import SxxMachine.Term;
import SxxMachine.Trail;
import SxxMachine.Var;

/**
 * Top element of the Prolog term hierarchy. Describes a simple or compound ter
 * like: X,a,13,f(X,s(X)),[a,s(X),b,c], a:-b,c(X,X),d, etc.
 */
public abstract class KPTerm implements Term {

    public Term listify() {
        // TODO Auto-generated method stub
        oopsy("listify");
        return null;
    }

    public void oopsy(Object why) {
        String problem = "oopsy! " + why + " this=" + this;
        new Exception(problem).printStackTrace();
        Prolog.Break(problem);
    }

    abstract // @Override
    public Term toClone() throws CloneNotSupportedException;

    @Override
    public int hashCode() {
        return termHashCode();
    }
    //
    //    @Override
    //    public boolean equals(Object o) {
    //        return o == this;
    //    }

    @Override
    public String toString() {
        return pprint();
    }

    public abstract int termHashCode();

    /**
     * returns or fakes an arity for all subtypes
     */
    abstract public int arityOrType();

    /**
     * Dereferences if necessary. If multi-threaded, this should be synchronized
     * otherwise vicious non-reentrancy problems may occur in the presence of GC and
     * heavy multi-threading!!!
     */
    public Term dref() { // synchronized !!!
        return (Term) this;
    }

    public abstract boolean bind(Term that, Trail trail);

    /** Unify dereferenced */
    public abstract boolean Unify_TO(Term that, Trail trail);

    /** Dereference and unify_to */
    public final boolean DO_Unify(Term that, Trail trail) {
        if (that == this)
            return true;
        Term thisd = dref();
        Term thatd = that.dref();
        if (thatd == thisd)
            return true;
        return thisd.Unify_TO(thatd, trail);
    }

    // public abstract boolean eq(Term that);

    public Term carTokenOrSelf() {
        return (Term) this;
    }

    public Term toTerm() {
        return (Term) this;
    }

    public HornClause toClause() {
        return new HornClause((Term) this, Prolog.True);
    }

    public boolean isClause() {
        return false;
    }

    public static Term fromString(String s) {
        return HornClause.clauseFromString(s).toTerm();
    }

    /**
     * Tests if this term unifies with that. Bindings are trailed and undone after
     * the test. This should be used with the shared term as this and the new term
     * as that. Synchronization makes sure that side effects on the shared term are
     * not interfering, i.e as in: SHARED.matches(NONSHARED,trail).
     *
     */
    // synchronized
    public boolean matches(Term that) {
        return matches(that, new KPTrail());
    }

    public boolean matches(Term that, Trail trail) {
        int oldtop = trail.top();
        boolean ok = DO_Unify(that, trail);
        trail.unwind(oldtop);
        return ok;
    }

    /**
     * Returns a copy of the result if the unification of this and that. Side
     * effects on this and that are undone using trailing of bindings..
     * Synchronization happens over this, not over that. Make sure it is used as
     * SHARED.matching_copy(NONSHARED,trail).
     */
    // synchronized

    public Term matching_copy(Term that) {
        KPTrail trail = new KPTrail();
        int oldtop = trail.top();
        boolean ok = DO_Unify(that, trail);
        // if(ok) that=that.copy();
        if (ok)
            that = copy();
        trail.unwind(oldtop);
        return (ok) ? that : null;
    }

    /**
     * Defines the reaction to an agent recursing over the structure of a term.
     * <b>This</b> is passed to the agent and the result of the action is returned.
     * Through overriding, for instance, a Fun term will provide the recursion over
     * its arguments, by applying the action to each of them.
     *
     * @see Term
     */
    public Term reaction(Term agent) {
        Term T = agent.action((Term) this);
        return T;
    }

    /**
     * Identity action.
     */
    public Term action(Term that) {
        return that;
    }

    /**
     * Returns a copy of a term with variables standardized apart (`fresh
     * variables').
     */
    // synchronized
    public Term copy() {
        return reaction((Term) new Copier());
    }

    /**
     * Returns '[]'(V1,V2,..Vn) where Vi is a variable occuring in this Term
     */
    public Term varsOf() {
        return (new Copier()).getMyVars((Term) this);
    }

    /**
     * Replaces variables with uppercase constants named `V1', 'V2', etc. to be read
     * back as variables.
     */
    public Term numbervars() {
        return copy().reaction(new VarNumberer());
    }

    /**
     * Prints out a term to a String with variables named in order V1, V2,....
     */
    public String toUnquoted() {
        Term t = numbervars();
        if (t == this)
            return pprint();
        return t.pprint();
    }

    /*
     * Returns an unquoted version of toString()
     */
    abstract public String pprint();

    /**
     * Returns a string key used based on the string name of the term. Note that the
     * key for a clause AL-B,C. is the key insted of ':-'.
     */
    public String getFAKey() {
        return toUnquoted();
    }

    /**
     * Java Object wrapper. In particular, it is used to wrap a Thread to hide it
     * inside a Prolog data object.
     */
    public Object toObject() {
        return dref();
    }

    /*
     * Just to catch the frequent error when the arg is forgotten while definig a
     * builtin. Being final, it will generate a compile time error if this happens
     */
    final int exec() {

        return -1;
    }

    /**
     * Executed when a builtin is called. Needs to be overriden. Returns a run-time
     * warning if this is forgotten.
     */

    public int exec(Prog p) {
        // IO.println("this should be overriden, prog="+p);
        return -1;
    }

    static final Nonvar stringToChars(String s) {
        if (0 == s.length())
            return (Nonvar) Prolog.Nil;
        Compound l = CONS(TermData.Long((s.charAt(0))), Prolog.Nil);
        Term curr = l;
        for (int i = 1; i < s.length(); i++) {
            Compound tail = CONS(Long((s.charAt(i))), Prolog.Nil);
            curr.setArg(1, tail);
            curr = tail;
        }
        return (Nonvar) l;
    }

    public Nonvar toChars() {
        return stringToChars(toUnquoted());
    }

    public boolean isCons() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isNil() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isBuiltin() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isConj() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isLong() {
        // TODO Auto-generated method stub
        return ((Term) this).isInteger();
    }

    public int intValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isConst() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isCompound() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isTrueProc() {
        return false;
    }

    public boolean isNumber() {
        // TODO Auto-generated method stub
        return false;
    }

    abstract public String getString() throws IllegalTypeException;

    public boolean isFloat() {
        return false;
    }

    public boolean isSystemObject() {
        return false;
    }

    public boolean isFluent() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isObject() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isVar() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isCharReader() {
        // TODO Auto-generated method stub
        return false;
    }

    public Term toValue() {
        return dref();
    }

    public double doubleValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    abstract public boolean equalsTerm(Term aneof);

    public Functor asConst() {
        // TODO Auto-generated method stub
        return (Functor) this;
    }

    public Var toVar() {
        // TODO Auto-generated method stub
        return (Var) this;
    }

    public Term getDrefArg(int i) {
        return TermData.asStruct((Term) this).getDrefArg(i);
    }

    public boolean isFunctor(String string) throws IllegalTypeException {
        oopsy("to fuinctor");
        String fname = getString();
        return fname.equals(string);
    }

    public SourceFluentTerm asSource() {
        // TODO Auto-generated method stub
        return (SourceFluentTerm) this;
    }

    abstract protected void toStringImpl(int printFlags, StringBuilder sb);

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Term o) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Comparable<Term>.compareTo");
        return 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#arg0(int)
     */
    @Override
    public Term getPlainArg(int i) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.arg0");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#equalsTerm(SxxMachine.Term, SxxMachine.OpVisitor)
     */
    @Override
    public boolean equalsTerm(Term name, OpVisitor strictequals2) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.equalsTerm");
        return false;
    }


    /* (non-Javadoc)
     * @see SxxMachine.Term#isAttvar()
     */
    @Override
    public boolean isAttvar() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isAttvar");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#frozenGoals()
     */
    @Override
    public Term frozenGoals() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.frozenGoals");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#cdr()
     */
    @Override
    public Term cdr() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.cdr");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#copy(java.util.Map, int)
     */
    @Override
    public Term copy(Map<Object, Term> copyHash, int deeply) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.copy");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asSymbolTerm()
     */
    @Override
    public Functor asSymbolTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asSymbolTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#car()
     */
    @Override
    public Term car() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.car");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asLongTerm()
     */
    @Override
    public NumberTerm asLongTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asLongTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asIntegerTerm()
     */
    @Override
    public NumberTerm asIntegerTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asIntegerTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isImmutable()
     */
    @Override
    public boolean isImmutable() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isImmutable");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#containsTerm(SxxMachine.Term, SxxMachine.OpVisitor)
     */
    @Override
    public int containsTerm(Term variableTerm, OpVisitor strictequals2) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.containsTerm");
        return 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#freeze(SxxMachine.Trail, SxxMachine.Term)
     */
    @Override
    public Term freeze(Trail trail, Term newval) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.freeze");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#findOrAttrValue(SxxMachine.Trail, boolean, SxxMachine.Term)
     */
    @Override
    public Term findOrAttrValue(Trail trail, boolean b, Term a2) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.findOrAttrValue");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#unify(SxxMachine.Term, SxxMachine.Trail)
     */
    @Override
    public boolean unify(Term arg0, Trail trail) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.unify");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#unify(SxxMachine.Compound, SxxMachine.Trail)
     */
    @Override
    public boolean unify(Compound arg0, Trail trail) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.unify");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#getAttrs()
     */
    @Override
    public Term getAttrs() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.getAttrs");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#setAttrs(SxxMachine.Term)
     */
    @Override
    public void setAttrs(Term newval) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.setAttrs");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#getGoals()
     */
    @Override
    public Term getGoals() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.getGoals");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#setGoals(SxxMachine.Term)
     */
    @Override
    public Term setGoals(Term newval) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.setGoals");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#functor()
     */
    @Override
    public Term functor() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.functor");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#arity()
     */
    @Override
    public int arity() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.arity");
        return 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asClosureTerm()
     */
    @Override
    public ClosureTerm asClosureTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asClosureTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#convertible(java.lang.Class)
     */
    @Override
    public boolean convertible(Class type) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.convertible");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isDouble()
     */
    @Override
    public boolean isDouble() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isDouble");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asVariableTerm()
     */
    @Override
    public Var asVariableTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asVariableTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isJavaObject()
     */
    @Override
    public boolean isJavaObject() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isJavaObject");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#args()
     */
    @Override
    public Term[] args() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.args");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isFVar()
     */
    @Override
    public boolean isFVar() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isFVar");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isGround()
     */
    @Override
    public boolean isGround() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isGround");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#type()
     */
    @Override
    public int type() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.type");
        return 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#unifyS(SxxMachine.Functor, SxxMachine.Trail, SxxMachine.Term[])
     */
    @Override
    public boolean unifyS(Functor functorPrime1, Trail trail, Term... a3) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.unifyS");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#unifyInt(int, SxxMachine.Trail)
     */
    @Override
    public boolean unifyInt(int b0, Trail trail) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.unifyInt");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isMap()
     */
    @Override
    public boolean isMap() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isMap");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#toJava()
     */
    @Override
    public Object toJava() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.toJava");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#toQuotedString(int, java.lang.StringBuilder)
     */
    @Override
    public void toQuotedString(int i, StringBuilder sb) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.toQuotedString");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#object()
     */
    @Override
    public Object object() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.object");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#getIntendedClass()
     */
    @Override
    public Class getIntendedClass() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.getIntendedClass");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isVariable()
     */
    @Override
    public boolean isVariable() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isVariable");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isInteger()
     */
    @Override
    public boolean isInteger() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isInteger");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isClosure()
     */
    @Override
    public boolean isClosure() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isClosure");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#append(SxxMachine.Term)
     */
    @Override
    public Compound append(Term goal) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.append");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#longValue()
     */
    @Override
    public long longValue() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.longValue");
        return 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#setGoals(SxxMachine.Trail, SxxMachine.Term)
     */
    @Override
    public void setGoals(Trail trail, Term newval) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.setGoals");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isAtom()
     */
    @Override
    public boolean isAtom() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isAtom");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isAtomicValue()
     */
    @Override
    public boolean isAtomicValue() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isAtomicValue");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asListTerm()
     */
    @Override
    public Compound asListTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asListTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asNumberTerm()
     */
    @Override
    public NumberTerm asNumberTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asNumberTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#setarg0Maybe_trail(SxxMachine.Trail, int, SxxMachine.Term)
     */
    @Override
    public void setarg0Maybe_trail(Trail trail, int i0, Term value) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.setarg0Maybe_trail");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#add(SxxMachine.Term)
     */
    @Override
    public Compound add(Term term) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.add");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isNonvar()
     */
    @Override
    public boolean isNonvar() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isNonvar");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isFrozen()
     */
    @Override
    public boolean isFrozen() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isFrozen");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#length()
     */
    @Override
    public int length() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.length");
        return 0;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asStructureTerm()
     */
    @Override
    public Term asStructureTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asStructureTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#putAttrValue(SxxMachine.Trail, SxxMachine.Term, SxxMachine.Term)
     */
    @Override
    public void putAttrValue(Trail trail, Term name, Term val) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.putAttrValue");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#setArg(int, SxxMachine.Term)
     */
    @Override
    public void setArg(int i, Term tail) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.setArg");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#setAttrs(SxxMachine.Trail, SxxMachine.Term)
     */
    @Override
    public void setAttrs(Trail trail, Term dref) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.setAttrs");

    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#toQuotedString()
     */
    @Override
    public String toQuotedString() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.toQuotedString");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#join(SxxMachine.Term)
     */
    @Override
    public MapTerm join(Term term) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.join");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#asMapTerm()
     */
    @Override
    public MapTerm asMapTerm() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.asMapTerm");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#drefAttrs()
     */
    @Override
    public Term drefAttrs() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.drefAttrs");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isAlias()
     */
    @Override
    public boolean isAlias() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isAlias");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#pbind(SxxMachine.Term, SxxMachine.Trail)
     */
    @Override
    public boolean pbind(Term variableTerm, Trail trail) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.pbind");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#iterator(boolean)
     */
    @Override
    public Iterator<Term> iterator(boolean includeSyntax) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.iterator");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#isSymbol()
     */
    @Override
    public boolean isSymbol() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.isSymbol");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#fname()
     */
    @Override
    public String fname() {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.fname");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#unify(SxxMachine.Term)
     */
    @Override
    public boolean unify(Term that) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.unify");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#bind(SxxMachine.Term)
     */
    @Override
    public boolean bind(Term that) {
        return that.bind(this,(Trail) null);
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#toStringImpl(int)
     */
    @Override
    public String toStringImpl(int depth) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.toStringImpl");
        return null;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#couldUnify(SxxMachine.Term)
     */
    @Override
    public boolean couldUnify(Term object) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.couldUnify");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#couldUnifyInverse(SxxMachine.Term)
     */
    @Override
    public boolean couldUnifyInverse(Term object) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.couldUnifyInverse");
        return false;
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#toJpString()
     */
    @Override
    public String toJpString() {
        return getString();
    }

    /* (non-Javadoc)
     * @see SxxMachine.Term#copy(SxxMachine.RunningPrologMachine, long)
     */
    @Override
    public Term copy(RunningPrologMachine m, long t) {
        // TODO Auto-generated method stub
        if (true)
            throw new AbstractMethodError("Term.copy");
        return null;
    }
}
