package SxxMachine.builtin;

import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.InternalException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.HashtableOfTerm;
import SxxMachine.JavaObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
/**
   <code>hash_contains_key/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
public class PRED_hash_contains_key_2 extends Predicate.P2 {
	public PRED_hash_contains_key_2(Term a1, Term a2, Operation cont) {
		arg1 = a1;
		arg2 = a2;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1 = arg1.dereference();
		Term a2 = arg2.dereference();
		Object hash = null;
		
		if ((a1 instanceof JavaObjectTerm)) {
			hash = ((JavaObjectTerm) a1).object();
		} else if ((a1 instanceof SymbolTerm)){
			JavaObjectTerm t = (JavaObjectTerm) engine.getHashManager().get(a1);
			if (t==null){
				throw new ExistenceException(this, 1, "hash", a1, "");
			}
			hash = t.object();
		} else if ((a1 instanceof VariableTerm)) {
			throw new PInstantiationException(this, 1);
		} else {
			throw new IllegalDomainException(this, 1, "hash_or_alias", a1);
		}
		
		if (hash instanceof HashtableOfTerm) {
			if (((HashtableOfTerm) hash).containsKey(a2)){
				return cont;
			}
			return engine.fail();
		}
		throw new InternalException(this + ": Hash is not HashtableOfTerm");
	}
}
