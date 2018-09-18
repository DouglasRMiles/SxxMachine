package SxxMachine.builtin;

import java.util.concurrent.locks.Lock;

import SxxMachine.IllegalTypeException;
import SxxMachine.PrologException;
import SxxMachine.FFIObjectTerm;
import SxxMachine.Mutex;
import SxxMachine.Operation;
import SxxMachine.Predicate.P1;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
/**

<p>mutex_lock_bt(+MutexId)
    <p>Lock the mutex.   Prolog mutexes are recursive mutexes:  they can be
    locked  multiple times by the same thread.  Only after  unlocking it
    as  many times as it is  locked does the mutex become available  for
    locking  by other threads.   If another thread has locked the  mutex
    the calling thread is suspended until the mutex is unlocked.

    <p>If  MutexId is  an atom,  and there  is no current  mutex with  that
    name,  the  mutex  is  created automatically  using  mutex_create/1.
    This implies named mutexes need not be declared explicitly.

    <p>Please  note that  locking and  unlocking mutexes  should be  paired
    carefully.     Especially  make  sure  to  unlock  mutexes  even  if
    the  protected  code  fails  or  raises an  exception.     For  most
    common  cases,  use with_mutex/2,  which provides  a  safer way  for
    handling  Prolog-level mutexes.   The predicate setup_call_cleanup/3
    is  another  way  to guarantee  that  the  mutex is  unlocked  while
    retaining non-determinism.

  <p>description is copied from swi prolog documentation
 * @author semenov
 *
 */
public class PRED_mutex_lock_1 extends P1 {

	public PRED_mutex_lock_1(Term a0, Operation cont) {
		this.LARG[0] = a0; //0];
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
		lock.lock();
		return cont;
	}
}
