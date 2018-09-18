package SxxMachine.builtin;

import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.RepresentationException;
/**
   <code>'$get_instances'/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.1
*/
class PRED_$get_instances_2 extends Predicate.P2 {
    private static final SymbolTerm COMMA = SymbolTerm.intern(",", 2);

    public PRED_$get_instances_2(Term a1, Term a2, Operation cont) {
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

	a1 = a1.dref();
	if (a1.isNil())
	    return engine.fail();
	if (!( a1 instanceof ListTerm))
	    throw new IllegalTypeException(this, 1, "list", a1);
	Term x = Prolog.Nil;
	Term tmp = a1;
	while(! tmp.isNil()) {
	    if (!( tmp instanceof ListTerm))
		throw new IllegalTypeException(this, 1, "list", a1);
	    Term car = tmp.asListlTerm().car().dref();
	    if ((car instanceof VariableTerm))
		throw new PInstantiationException(this, 1);
	    if (! (car instanceof IntegerTerm))
		throw new RepresentationException(this, 1, "integer");
	    // car is an integer
	    int i = car.asIntegerlTerm().intValue();
	    Term e = engine.internalDB.get(i);
	    if (e != null) {
		x = TermData.CONS(new StructureTerm(COMMA, e, car), x);
	    }
	    tmp = tmp.asListlTerm().cdr().dref();
	}
	if (! a2.unify(x, engine.trail))
	    return engine.fail();
	return cont;
    }
}
