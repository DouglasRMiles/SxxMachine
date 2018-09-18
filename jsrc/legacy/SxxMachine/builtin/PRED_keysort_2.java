package SxxMachine;

import java.util.Arrays;

import SxxMachine.BuiltinException;
import SxxMachine.IllegalTypeException;
import SxxMachine.JavaException;
import SxxMachine.PInstantiationException;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
/**
 * <code>keysort/2</code><br>
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PRED_keysort_2 extends Predicate.P2 {
    private static final SymbolTerm SYM_HYPHEN_2 = SymbolTerm.intern("-", 2);

    public PRED_keysort_2(Term a1, Term a2, Operation cont) {
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
	    if (list[i] instanceof VariableTerm)
		throw new PInstantiationException(this, 1);
	    if (!( list[i] instanceof StructureTerm))
		throw new IllegalTypeException(this, 1, "key_value_pair", a1);
	    if (! ( list[i]).functor().equals(SYM_HYPHEN_2))
		throw new IllegalTypeException(this, 1, "key_value_pair", a1);
	    tmp = tmp.asListlTerm().cdr().dref();
	}
	if (! tmp.equals(Prolog.Nil))
	    throw new PInstantiationException(this, 1);
	try {
	    Arrays.sort(list, new KeySortComparator());
	} catch (BuiltinException e) {
	    e.goal = this; e.argNo = 1; throw e;
	} catch (ClassCastException e1) {
	    throw new JavaException(this, 1, e1);
	}
	tmp = Prolog.Nil;
	for (int i=list.length-1; i>=0; i--) {
	    tmp = TermData.CONS(list[i], tmp);
	}
	if(! a2.unify(tmp, engine.trail)) 
	    return engine.fail();
	return cont;
    }
}

class KeySortComparator implements java.util.Comparator<Term> {
    public int compare(Term t1, Term t2) {
	Term a1 = (t1).args()[0].dref();
	Term a2 = (t2).args()[0].dref();
	return a1.compareTo(a2);
    }
}
