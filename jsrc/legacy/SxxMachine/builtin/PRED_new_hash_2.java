package SxxMachine.builtin;

import SxxMachine.FFIObjectTerm;
import SxxMachine.HashtableOfTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.IllegalDomainException;
import SxxMachine.IllegalTypeException;
import SxxMachine.PInstantiationException;
import SxxMachine.PermissionException;
/**
   <code>new_hash/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
public class PRED_new_hash_2 extends Predicate.P2 {
    private static final SymbolTerm SYM_ALIAS_1 = SymbolTerm.intern("alias", 1);

    public PRED_new_hash_2(Term a1, Term a2, Operation cont) {
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
	if (! (a1 instanceof VariableTerm))
	    throw new IllegalTypeException(this, 1, "variable", a1);
	Term newHash = new FFIObjectTerm(new HashtableOfTerm());
	a2 = a2.dref();
	if (a2.isNil()) {
	    if (! a1.unify(newHash, engine.trail))
		return engine.fail();
	    return cont;
	} else if (!( a2 instanceof ListTerm)) {
	    throw new IllegalTypeException(this, 2, "list", a2);
	}
	// a2 is list
	Term tmp = a2;
	while (! tmp.isNil()) {
	    if ((tmp instanceof VariableTerm))
		throw new PInstantiationException(this, 2);
	    if (!( tmp instanceof ListTerm))
		throw new IllegalTypeException(this, 2, "list", a2);
	    Term car = tmp.asListTerm().car().dref();
	    if ((car instanceof VariableTerm))
		throw new PInstantiationException(this, 2);
	    if ((car instanceof StructureTerm)) {
		Term functor = ( car).functor();
		Term[] args = ( car).args();
		if (functor.equals(SYM_ALIAS_1)) {
		    Term alias = args[0].dref();
		    if (! (alias instanceof SymbolTerm))
			throw new IllegalDomainException(this, 2, "hash_option", car);
		    else {
			if (engine.getHashManager().containsKey(alias))
			    throw new PermissionException(this, "new", "hash", car, "");
			engine.getHashManager().put(alias, newHash);
		    }
		} else {
		    throw new IllegalDomainException(this, 2, "hash_option", car);
		}
	    } else {
		throw new IllegalDomainException(this, 2, "hash_option", car);
	    }
	    tmp = tmp.asListTerm().cdr().dref();
	}
	if (! a1.unify(newHash, engine.trail))
	    return engine.fail();
        return cont;
    }
}
