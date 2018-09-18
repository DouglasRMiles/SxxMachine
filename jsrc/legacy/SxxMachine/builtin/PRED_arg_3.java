package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalDomainException;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;
/**
 * <code>arg/3</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_arg_3 extends Predicate.P3 {
    public PRED_arg_3(Term a1, Term a2, Term a3, Operation cont) {
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2, a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	Term[] args;
	int arity, argNo;

	a1 = a1.dref();
	if((a1 instanceof VariableTerm))
	    throw new PInstantiationException(this, 1);
	else if(! (a1 instanceof IntegerTerm))
	    throw new IllegalTypeException(this, 1, "integer", a1);
	a2 = a2.dref();
	if ((a2 instanceof ListTerm)) {
	    args = new Term[2];
	    args[0] = a2.asListlTerm().car();
	    args[1] = a2.asListlTerm().cdr();
	    arity = 2;
	} else if ((a2 instanceof StructureTerm)) {
	    args =  (a2).args();
	    arity = (a2).arity();
	} else if ((a2 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 2);
	} else {
	    throw new IllegalTypeException(this, 2, "compound", a2);
	}
	argNo = a1.asIntegerlTerm().intValue();
	if (argNo < 0)
	    throw new IllegalDomainException(this, 1, "not_less_than_zero", a1);
	if (argNo > arity || argNo < 1)
	    return engine.fail();
	if (! a3.unify(args[argNo-1], engine.trail)) 
	    return engine.fail();
	return cont;
    }
}
