package SxxMachine.builtin;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
/**
 * <code>atom_lengt/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
*/
public class PRED_atom_length_2 extends Predicate.P2 {
    public PRED_atom_length_2(Term a1, Term a2, Operation cont) {
        LARG[0] = a1;
        LARG[1] = a2;
        this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
        Term a1, a2;
        a1 = LARG[0];
        a2 = LARG[1];
	int length;

	a1 = a1.dref();
	a2 = a2.dref();

	if ((a1 instanceof VariableTerm))
	    throw new PInstantiationException(this, 1);
	if (! (a1 instanceof SymbolTerm))
	    throw new IllegalTypeException(this, 1, "atom", a1);
	length = a1.asSymbolTerm().name().length();
	if ((a2 instanceof VariableTerm)) {
	    if (! a2.unify(new IntegerTerm(length), engine.trail))
		return engine.fail();
	} else if ((a2 instanceof IntegerTerm)) {
	    int n = a2.asIntegerlTerm().intValue();
	    if (n < 0)
		throw new IllegalDomainException(this, 2, "not_less_than_zero", a2);
	    if (length != n)
		return engine.fail();
	} else {
	    throw new IllegalTypeException(this, 1, "integer", a2);
	}
        return cont;
    }
}
