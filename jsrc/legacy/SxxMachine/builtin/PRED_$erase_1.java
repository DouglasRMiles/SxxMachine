package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.IllegalTypeException;
/**
 * <code>'$erase'/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
class PRED_$erase_1 extends Predicate.P1 {
    public PRED_$erase_1(Term a1, Operation cont) {
	LARG[0] = a1;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1 = LARG[0];
	int idx;

	a1 = a1.dref();
	if (! (a1 instanceof IntegerTerm))
	    throw new IllegalTypeException(this, 1, "integer", a1);
	idx = a1.asIntegerlTerm().intValue();
	engine.internalDB.erase(idx);
	return cont;
    }
}
