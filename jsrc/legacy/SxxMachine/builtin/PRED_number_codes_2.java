package SxxMachine;

import SxxMachine.DoubleTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;
import SxxMachine.RepresentationException;
import SxxMachine.SyntaxException;
/**
 * <code>number_codes/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_number_codes_2 extends Predicate.P2 {
    public PRED_number_codes_2(Term a1, Term a2, Operation cont) {
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
	if (a2.isNil())
	    throw new SyntaxException(this, 2, "character_code_list", a2, "");
	if ((a1 instanceof VariableTerm)) { // number_codes(-Number, +CharCodeList)
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
	    try {
		if (! a1.unify(new IntegerTerm(Integer.parseInt(sb.toString())), engine.trail))
		    return engine.fail();
		return cont;
	    } catch (NumberFormatException e) {}
	    try {
		if(! a1.unify(new DoubleTerm(Double.parseDouble(sb.toString())), engine.trail))
		    return engine.fail();
		return cont;
	    } catch (NumberFormatException e) {
		throw new SyntaxException(this, 2, "character_code_list", a2, "");
	    }
	} else if ((a1 instanceof NumberTerm)) { // number_codes(+Number, ?CharCodeList)
	    char[] chars = a1.toString().toCharArray();
	    Term y = Prolog.Nil;
	    for (int i=chars.length; i>0; i--) {
		y = TermData.CONS(new IntegerTerm((int)chars[i-1]), y);
	    }
	    if (! a2.unify(y, engine.trail) ) 
		return engine.fail();
	    return cont;
	} else {
	    throw new IllegalTypeException(this, 1, "number", a1);
	}
    }
}
