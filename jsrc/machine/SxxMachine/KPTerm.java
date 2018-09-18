package SxxMachine;

/**
 * Top element of the Prolog term hierarchy. Describes a simple or compound ter
 * like: X,a,13,f(X,s(X)),[a,s(X),b,c], a:-b,c(X,X),d, etc.
 */
public abstract class KPTerm extends TermData implements Undoable {

	public void oopsy() {
		new Exception().printStackTrace();
	}
	public static void soopsy() {
		new Exception().printStackTrace();
	}

	abstract // @Override
	public Term toClone() throws CloneNotSupportedException;
	
	@Override
	public int hashCode() {
		return termHashCode();		
	}
	
	public boolean equals(Object o) {
		return o==this;
	}
	
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

	public abstract boolean bind(Term that, KPTrail trail);

	/** Unify dereferenced */
	public abstract boolean Unify_TO(Term that, KPTrail trail);

	/** Dereference and unify_to */
	public final boolean DO_Unify(Term that, KPTrail trail) {
	  if(that==this) return true;
	  Term thisd = dref();
	  Term thatd = that.dref();
	  if(thatd==thisd) return true;
		return thisd.Unify_TO(thatd, trail);
	}

	public void undo() { // does nothing
	}

	// public abstract boolean eq(Term that);

	public Term carTokenOrSelf() {
		return (Term) this;
	}

	Term toTerm() {
		return (Term) this;
	}

	public Clause toClause() {
		return new Clause((Term) this, Prolog.True);
	}

	public boolean isClause() {
		return false;
	}

	public static Term fromString(String s) {
		return Clause.clauseFromString(s).toTerm();
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

	public boolean matches(Term that, KPTrail trail) {
		int oldtop = trail.size();
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
		boolean ok = DO_Unify(that, trail);
		// if(ok) that=that.copy();
		if (ok)
			that = copy();
		trail.unwind(0);
		return (ok) ? that : null;
	}

	/**
	 * Defines the reaction to an agent recursing over the structure of a term.
	 * <b>This</b> is passed to the agent and the result of the action is returned.
	 * Through overriding, for instance, a Fun term will provide the recursion over
	 * its arguments, by applying the action to each of them.
	 * 
	 * @see StructureTerm
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
		return reaction(new Copier());
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
		return copy().reaction((Term) new VarNumberer());
	}

	/**
	 * Prints out a term to a String with variables named in order V1, V2,....
	 */
	public String toUnquoted() {
		Term t = numbervars();
		if(t==this) return pprint();
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
	public String getKey() {
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
			return Prolog.Nil;
		ListTerm l = CONS(TermData.Long((s.charAt(0))), Prolog.Nil);
		Term curr =  l;
		for (int i = 1; i < s.length(); i++) {
			StructureTerm tail = StructureTerm.createCons(Long((s.charAt(i))), Prolog.Nil);
			curr.setArg(1, tail);
			curr = tail;
		}
		return l;
	}

	public Nonvar toChars() {
		return stringToChars(toUnquoted());
	}

	/**
	 * Converts a list of character codes to a String.
	 */
	public static String charsToString(Nonvar Cs) {
		StringBuffer s = new StringBuffer("");

		while (!(Cs.isNil())) {
			if (!(Cs.isCons()))
				return null;
			Nonvar head = (Nonvar) Expect.asCons(Cs).ArgDeRef(0);
			
			if (!(head.isNumber()))
				return null;
			char c = (char) Expect.asInt(head).longValue();
			s.append(c);
			Cs = (Nonvar) Expect.asCons(Cs).ArgDeRef(1);
		}

		return s.toString();
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
		return ((Term)this).isInteger();
	}

	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isConst() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isStructure() {
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

	abstract public String name();

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
		// TODO Auto-generated method stub
		return (Term) this;
	}

	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0; 
	}

	abstract public boolean equalsTerm(Term aneof) ;

	final public SymbolTerm asConst() {
		// TODO Auto-generated method stub
		return (SymbolTerm)this;
	}

	public Var toVar() {
		// TODO Auto-generated method stub
		return (Var)this;
	}

	public Term ArgDeRef(int i) {
		return Expect.asStruct((Term)this).ArgDeRef(i);
	}

	public boolean isFunctor(String string) {
		// TODO Auto-generated method stub
		return name().equals(string);
	}
	public Source asSource() {
		// TODO Auto-generated method stub
		return (Source)this;
	}
}
