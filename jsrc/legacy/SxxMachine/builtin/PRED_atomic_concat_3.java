package SxxMachine.builtin;

import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PrologException;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;

/**
 * atomic_concat(+Atomic1, +Atomic2, -Atom)
 * Atom represents the text after converting Atomic1 and Atomic2 to text and concatenating the result:
 *  ?- atomic_concat(name, 42, X).
 *  X = name42.
 * Created by semenov on 27.04.2017.
 * http://www.swi-prolog.org/pldoc/man?predicate=atomic_concat/3
 */

public class PRED_atomic_concat_3 extends Predicate.P3 {

	public PRED_atomic_concat_3(Term a0, Term a1, Term a2, Operation cont) {
		this.LARG[0] = a0;
		this.LARG[1] = a1;
		this.LARG[2] = a2;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		final Term a1 = LARG[0].dref();
		final Term a2 = LARG[1].dref();

		if (!(a1 instanceof NumberTerm) && !(a1 instanceof SymbolTerm)) {
			throw new IllegalTypeException(this, 1, "atomic", a1);
		}

		if (!(a2 instanceof NumberTerm) && !(a2 instanceof SymbolTerm)) {
			throw new IllegalTypeException(this, 2, "atomic", a2);
		}

		if (LARG[2].unify(SymbolTerm.create(a1.toString()+a2.toString()), engine.trail)) {
			return cont;
		}
		return engine.fail();
	}
}
