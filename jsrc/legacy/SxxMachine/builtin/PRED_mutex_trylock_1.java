package SxxMachine;

import java.util.concurrent.locks.Lock;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Mutex;
import SxxMachine.Operation;
import SxxMachine.Predicate.P1;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.IllegalTypeException;
import SxxMachine.PrologException;
/**

<p>mutex_trylock(+MutexId)
    As  mutex_lock/1,  but if the mutex  is held by another thread,  this
    predicates fails immediately.
    
  <p>description is copied from swi prolog documentation
 * @author semenov
 *
 */
public class PRED_mutex_trylock_1 extends P1 {

	public PRED_mutex_trylock_1(Term arg1, Operation cont) {
		this.LARG[0] = arg1;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		Term a1 = LARG[0].dref();

		Lock lock;
		if ((a1 instanceof SymbolTerm)){
			lock = Mutex.getInstance(a1.name());
		} else if ((a1 instanceof FFIObjectTerm) && (a1.toJava() instanceof Lock)) {
			lock = (Lock) a1.toJava();
		} else {
			throw new IllegalTypeException(this, 1, "atom or FFIObjectTerm(Lock)", a1);
		}
		if (!lock.tryLock()){
			return engine.fail();
		}
		return cont;
	}
}
