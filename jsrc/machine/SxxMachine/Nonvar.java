package SxxMachine;

import SxxMachine.*;


import SxxMachine.KPTrail;

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

	public abstract String name();

	public boolean bind(Term that, KPTrail trail) {
		if( getClass() == that.getClass()) return true;
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
