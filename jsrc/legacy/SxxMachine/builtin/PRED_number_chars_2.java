package SxxMachine.builtin;

import SxxMachine.DoubleTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.NumberTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.exceptions.SyntaxException;
/**
 * <code>number_chars/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public class PRED_number_chars_2 extends Predicate.P2 {
    public PRED_number_chars_2(Term a1, Term a2, Operation cont) {
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
	if ((a1 instanceof VariableTerm)) { // number_chars(-Number, +CharList)
	    if ((a2 instanceof VariableTerm)) {
		throw new PInstantiationException(this, 2);
	    } else if (!( a2 instanceof ListTerm)) {
		throw new IllegalTypeException(this, 2, "list", a2);
	    }
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
		if (! (car instanceof SymbolTerm) || car.asSymbolTerm().name().length() != 1)
		    throw new IllegalTypeException(this, 2, "character", a2);
		sb.append(car.asSymbolTerm().name());
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
	} else if ((a1 instanceof NumberTerm)) { // number_chars(+Number, ?CharList)
	    String s = a1.toString();
	    Term y = Prolog.Nil;
	    for (int i=s.length()-1; i>=0; i--) {
	    	y = TermData.CONS(SymbolTerm.create(s.charAt(i)), y);
	    }
	    if (! a2.unify(y, engine.trail) ) 
		return engine.fail();
	    return cont;
	} else {
	    throw new IllegalTypeException(this, 1, "number", a1);
	}
    }
}
