package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.exceptions.IllegalTypeException;
import com.googlecode.prolog_cafe.exceptions.PrologException;
import com.googlecode.prolog_cafe.lang.NumberTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.SymbolTerm;
import com.googlecode.prolog_cafe.lang.Term;

/**
 * atomic_concat(+Atomic1, +Atomic2, -Atom)
 * Atom represents the text after converting Atomic1 and Atomic2 to text and concatenating the result:
 *  ?- atomic_concat(name, 42, X).
 *  X = name42.
 * Created by semenov on 27.04.2017.
 * http://www.swi-prolog.org/pldoc/man?predicate=atomic_concat/3
 */
public class PRED_atomic_concat_3 extends Predicate.P3 {

	public PRED_atomic_concat_3(Term arg1, Term arg2, Term arg3, Operation cont) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		final Term a1 = arg1.dereference();
		final Term a2 = arg2.dereference();

		if (!(a1 instanceof NumberTerm) && !(a1 instanceof SymbolTerm)) {
			throw new IllegalTypeException(this, 1, "atomic", a1);
		}

		if (!(a2 instanceof NumberTerm) && !(a2 instanceof SymbolTerm)) {
			throw new IllegalTypeException(this, 2, "atomic", a2);
		}

		if (arg3.unify(SymbolTerm.create(a1.toString()+a2.toString()), engine.trail)) {
			return cont;
		}
		return engine.fail();
	}
}
