package SxxMachine.builtin;

import java.util.Arrays;

import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.JavaException;
import SxxMachine.exceptions.PInstantiationException;
/**
 * <code>sort/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_sort_2 extends Predicate.P2 {
    public PRED_sort_2(Term a1, Term a2, Operation cont) {
	LARG[0] = a1;
	LARG[1] = a2;
	this.cont = cont;
    }

    public Operation exec(Prolog engine) {
        engine.setB0();
	Term a1, a2;
	a1 = LARG[0];
	a2 = LARG[1];
	int len;
	Term tmp, tmp2;
	Term[] list;

	a1 = a1.dref();
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if (a1.equals(Prolog.Nil)) {
	    if (! a2.unify(Prolog.Nil, engine.trail))
		return engine.fail();
	    return cont;
	} else if (!( a1 instanceof ListTerm)) {
	    throw new IllegalTypeException(this, 1, "list", a1);
	}
	len = a1.asListlTerm().length();
	list = new Term[len];
	tmp = a1;
	for (int i=0; i<len; i++) {
	    if (!( tmp instanceof ListTerm))
		throw new IllegalTypeException(this, 1, "list", a1);
	    list[i] = tmp.asListlTerm().car().dref();
	    tmp = tmp.asListlTerm().cdr().dref();
	}
	if (! tmp.equals(Prolog.Nil))
	    throw new PInstantiationException(this, 1);
	try {
	    Arrays.sort(list);
	} catch (ClassCastException e) {
	    throw new JavaException(this, 1, e);
	}
	tmp = Prolog.Nil;
	tmp2 = null;
	for (int i=list.length-1; i>=0; i--) {
	    if (! list[i].equals(tmp2))
		tmp = TermData.CONS(list[i], tmp);
	    tmp2 = list[i];
	}
	if(! a2.unify(tmp, engine.trail)) 
	    return engine.fail();
	return cont;
    }
}
