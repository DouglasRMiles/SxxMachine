package SxxMachine.builtin;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalDomainException;
/**
 * <code>current_output/1</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_current_output_1 extends Predicate.P1 {
    public PRED_current_output_1(Term a1, Operation cont) {
	LARG[0] = a1;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.requireFeature(Prolog.Feature.IO, this, LARG[0]);
        engine.setB0();
	Term a1;
	a1 = LARG[0];
	a1 = a1.dref();
	if ((a1 instanceof VariableTerm)) {
	    ((VariableTerm)a1).bind(new FFIObjectTerm(engine.getCurrentOutput()), engine.trail);
	} else if ((a1 instanceof FFIObjectTerm)) {
	    if (! a1.unify(new FFIObjectTerm(engine.getCurrentOutput()), engine.trail)) 
		return engine.fail();
	} else {
	    throw new IllegalDomainException(this,1,"stream",a1);
	}
	return cont;
    }
}
