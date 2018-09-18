package SxxMachine.builtin;

import SxxMachine.FFIObjectTerm;
import SxxMachine.HashtableOfTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.InternalException;
import SxxMachine.exceptions.PInstantiationException;
/**
   <code>hash_get/3</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
public class PRED_hash_get_3 extends Predicate.P3 {
    public PRED_hash_get_3(Term a1, Term a2, Term a3, Operation cont) {
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

	Object hash = null;

	a1 = a1.dref();
	if ((a1 instanceof VariableTerm)) {
	    throw new PInstantiationException(this, 1);
	} else if ((a1 instanceof SymbolTerm)) {
	    if (! engine.getHashManager().containsKey(a1))
		throw new ExistenceException(this, 1, "hash", a1, "");
	    hash = ( engine.getHashManager().get(a1)).object();
	} else if ((a1 instanceof FFIObjectTerm)) {
	    hash = a1.object();
	} else {
	    throw new IllegalDomainException(this, 1, "hash_or_alias", a1);
	}
	if (! (hash instanceof HashtableOfTerm))
	    throw new InternalException(this + ": Hash is not HashtableOfTerm");
	a2 = a2.dref();
	Term elem = hash.asHashtableOfTerm().get(a2);
	if (elem == null)
	    elem = Prolog.Nil;
	if (! a3.unify(elem, engine.trail))
	    return engine.fail();
        return cont;
    }
}
