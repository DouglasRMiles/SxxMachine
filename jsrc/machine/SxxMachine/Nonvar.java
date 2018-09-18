package SxxMachine;

/**
 * Part of the Prolog Term hierarchy
 * 
 * @see Term
 */
public abstract class Nonvar extends Term {

	//	public boolean equalsTerm(Term ano2) {
	//		return this==ano2;
	//	}
	public boolean isNonvar() {
		return true;
	}

	public Term ArgDeRef(int i) {
		return ArgNoDeRef(i).dref();
	}

	@Override
	public Term ArgNoDeRef(int i) {
		return arg0(i);
	}

	public int unifyArg(int i, Term a, Prog p) {
		a = a.dref();
		return ArgDeRef(i).Unify_TO(a.dref(), p.getTrail()) ? 1 : 0;
	}

	public int getIntArg(int i) {
		return (int) Expect.asInt(ArgDeRef(i)).doubleValue();
	}

	public abstract String name();

	public boolean bind(Term that, KPTrail trail) {
		if (getClass() == that.getClass())
			return true;
		//oopsy();
		return false;
	}

	public boolean Unify_TO(Term that, KPTrail trail) {
		if (bind(that, trail))
			return true;
		else
			return that.bind(this, trail);
	}

	/**
	 * returns a list representation of the object
	 */
	Nonvar listify() {
		return CONS(this, Prolog.Nil);
	}
}
