package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalTypeException;
/**
   <code>'$insert'/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.1
*/
class PRED_$insert_2 extends Predicate.P2 {
    public PRED_$insert_2(Term a1, Term a2, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
	int idx;

	a2 = a2.dref();
	if (! (a2 instanceof VariableTerm))
	    throw new IllegalTypeException(this, 2, "variable", a2);
	a1 = a1.dref();
	idx = engine.internalDB.insert(a1);
	if (! a2.unify(new IntegerTerm(idx), engine.trail))
	    return engine.fail();
	return cont;
    }
}
