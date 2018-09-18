package SxxMachine.builtin;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;

/**
 * <code>halt/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_halt_1 extends Predicate.P1 {
	public PRED_halt_1(Term a1, Operation cont) {
		LARG[0] = a1;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1 = LARG[0];

		a1 = a1.dref();
		if ((a1 instanceof VariableTerm))
			throw new PInstantiationException(this, 1);
		if (!(a1 instanceof IntegerTerm))
			throw new IllegalTypeException(this, 1, "integer", a1);
		engine.halt = 1 + a1.asIntegerTerm().intValue();
		return null;
	}
}
