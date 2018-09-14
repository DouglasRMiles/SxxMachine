package SxxMachine.builtin;

import java.util.concurrent.locks.Lock;

import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PrologException;
import SxxMachine.JavaObjectTerm;
import SxxMachine.Mutex;
import SxxMachine.Operation;
import SxxMachine.Predicate.P1;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
/**

<p>mutex_unlock(+MutexId)
    <p>Unlock  the mutex.  This can only be called if the mutex  is held by
    the  calling thread.   If this is  not the case,  a permission_error
    exception is raised.

  <p>description is copied from swi prolog documentation
 * @author semenov
 *
 */
public class PRED_mutex_unlock_1 extends P1 {

	public PRED_mutex_unlock_1(Term arg1, Operation cont) {
		this.arg1 = arg1;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		Term a1 = arg1.dereference();

		Lock lock;
		if ((a1 instanceof SymbolTerm)){
			lock = Mutex.getInstance(a1.name());
		} else if ((a1 instanceof JavaObjectTerm) && (a1.toJava() instanceof Lock)) {
			lock = (Lock) a1.toJava();
		} else {
			throw new IllegalTypeException(this, 1, "atom or JavaObjectTerm(Lock)", a1);
		}
		lock.unlock();
		return cont;
	}
}
