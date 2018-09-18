package SxxMachine;

import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;
import SxxMachine.RepresentationException;
/**
 * <code>atom_codes/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_atom_codes_2 extends Predicate.P2 {
    public PRED_atom_codes_2(Term a1, Term a2, Operation cont) {
	LARG[0] = a1;
	LARG[1] = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1.dref();
	a2 = a2.dref();
	if ((a1 instanceof VariableTerm)) { // atom_codes(-Atom, +CharCodeList)
	    StringBuilder sb = new StringBuilder();
	    Term x = a2;
	    while(! x.isNil()) {
		if ((x instanceof VariableTerm))
		    throw new PInstantiationException(this, 2);
		if (!( x instanceof ListTerm))
		    throw new IllegalTypeException(this, 2, "list", a2);
		Term car = x.asListlTerm().car().dref();
		if ((car instanceof VariableTerm))
		    throw new PInstantiationException(this, 2);
		if (! (car instanceof IntegerTerm))
		    throw new RepresentationException(this, 2, "character_code");
		// car is an integer
		int i = car.asIntegerlTerm().intValue();
		if (! Character.isDefined((char)i))
		    throw new RepresentationException(this, 2, "character_code");
		sb.append((char)i);
		x = x.asListlTerm().cdr().dref();
	    }
	    if (! a1.unify(SymbolTerm.create(sb.toString()), engine.trail))
		return engine.fail();
	    return cont;
	} else { // atom_codes(+Atom, ?CharCodeList)
	    if (! (a1 instanceof SymbolTerm))
		throw new IllegalTypeException(this, 1, "atom", a1);
	    char[] chars = a1.asSymbolTerm().name().toCharArray();
	    Term x = Prolog.Nil;
	    for (int i=chars.length; i>0; i--) {
		x = TermData.CONS(new IntegerTerm((int)chars[i-1]), x);
	    }
	    if(! a2.unify(x, engine.trail)) 
		return engine.fail();
	    return cont;
	}
    }
}
