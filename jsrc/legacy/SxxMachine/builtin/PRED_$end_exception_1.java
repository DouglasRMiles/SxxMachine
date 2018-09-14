package SxxMachine.builtin;

import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;

/**
 * <code>'$end_exception'/1<code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class PRED_$end_exception_1 extends Predicate.P1 {
	public PRED_$end_exception_1(Term a1, Operation cont) {
		arg1 = a1;
		this.cont = cont;
	}

	public Operation exec(final Prolog engine) {
		engine.setB0();
		final int B = engine.popCatcherB();
		engine.trail.push(()->engine.pushCatcherB(B));
		return cont;
	}
}
