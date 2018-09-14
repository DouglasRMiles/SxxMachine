package SxxMachine.builtin;

import java.util.ArrayDeque;
import java.util.Deque;

import SxxMachine.exceptions.ExistenceException;
import SxxMachine.exceptions.IllegalDomainException;
import SxxMachine.exceptions.InternalException;
import SxxMachine.exceptions.PInstantiationException;
import SxxMachine.HashtableOfTerm;
import SxxMachine.IntegerTerm;
import SxxMachine.JavaObjectTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;

/**
 * <code>'$hash_remove_first'/3</code><br>
 * 
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class PRED_$hash_remove_first_3 extends Predicate.P3 {
	private static final SymbolTerm SYM_NIL = Prolog.Nil;

	public PRED_$hash_remove_first_3(Term a1, Term a2, Term a3, Operation cont) {
		arg1 = a1;
		arg2 = a2;
		arg3 = a3;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1, a2, a3;
		a1 = arg1;
		a2 = arg2;
		a3 = arg3;

		Object hash = null;

		a1 = a1.dereference();
		if ((a1 instanceof VariableTerm)) {
			throw new PInstantiationException(this, 1);
		} else if ((a1 instanceof SymbolTerm)) {
			if (!engine.getHashManager().containsKey(a1))
				throw new ExistenceException(this, 1, "hash", a1, "");
			hash = ((JavaObjectTerm) engine.getHashManager().get(a1)).object();
		} else if ((a1 instanceof JavaObjectTerm)) {
			hash = ((JavaObjectTerm) a1).object();
		} else {
			throw new IllegalDomainException(this, 1, "hash_or_alias", a1);
		}
		if (!(hash instanceof HashtableOfTerm))
			throw new InternalException(this + ": Hash is not HashtableOfTerm");
		a2 = a2.dereference();
		Term elem = ((HashtableOfTerm) hash).get(a2);
		if (elem == null || elem.isNil())
			return cont;
		a3 = a3.dereference();
		
		Deque<Term> stack = new ArrayDeque<Term>();
		Term t = elem.dereference();
		while (t instanceof ListTerm){
			ListTerm lt = (ListTerm) t;
			Term y = lt.car().dereference();
			t = lt.cdr();
			if (y.equals(a3)){
				break;
			}
			stack.push(y);
		}
		while(!stack.isEmpty()){
			t = new ListTerm(stack.pop(), t);
		}
		elem = t;

		if (elem.isNil() && (a2 instanceof IntegerTerm)) {
			((HashtableOfTerm) hash).remove(a2);
			// System.out.println("################ key " + a2 + " is removed");
		} else {
			((HashtableOfTerm) hash).put(a2, elem);
		}
		return cont;
	}
}
