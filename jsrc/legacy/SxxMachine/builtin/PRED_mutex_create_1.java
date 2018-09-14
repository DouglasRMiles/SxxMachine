package SxxMachine.builtin;

import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PrologException;
import SxxMachine.JavaObjectTerm;
import SxxMachine.Mutex;
import SxxMachine.Operation;
import SxxMachine.Predicate.P1;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.VariableTerm;
/**

<p>mutex_create(?MutexId)
  <p>Create  a mutex.  If MutexId  is an atom, a named mutex  is created.
  If  it is  a variable,  an  anonymous mutex  reference is  returned.
  There is no limit to the number of mutexes that can be created.
<p>description is copied from swi prolog documentation
* @author semenov
*
*/
public class PRED_mutex_create_1 extends P1 {

	public PRED_mutex_create_1(Term arg1, Operation cont) {
		this.arg1 = arg1;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		Term a1 = arg1.dereference();
		
		if ((a1 instanceof SymbolTerm)){
			Mutex.getInstance(a1.name());
		} else if ((a1 instanceof VariableTerm)){
			if (!a1.unify(new JavaObjectTerm(Mutex.getInstance()), engine.trail)){
				return engine.fail();
			}
		} else {
			throw new IllegalTypeException(this, 1, "atom or variable", a1);
		}
		return cont;
	}

}
