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
   <code>hash_contains_key/2</code><br>
   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
   @version 1.0
*/
public class PRED_hash_contains_key_2 extends Predicate.P2 {
	public PRED_hash_contains_key_2(Term a1, Term a2, Operation cont) {
		LARG[0] = a1;
		LARG[1] = a2;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1 = LARG[0].dref();
		Term a2 = LARG[1].dref();
		Object hash = null;
		
		if ((a1 instanceof FFIObjectTerm)) {
			hash = ((FFIObjectTerm) a1).object();
		} else if ((a1 instanceof SymbolTerm)){
			FFIObjectTerm t = (FFIObjectTerm) engine.getHashManager().get(a1);
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
