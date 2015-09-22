package com.googlecode.prolog_cafe.builtin;

import java.util.concurrent.locks.Lock;

import com.googlecode.prolog_cafe.lang.IllegalTypeException;
import com.googlecode.prolog_cafe.lang.Mutex;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Undoable;
import com.googlecode.prolog_cafe.lang.Predicate.P1;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.Term;
/**

<p>mutex_lock(+MutexId)
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

    <p>the returned mutex is automatically unlocked on backtracking 

  <p>description is copied from swi prolog documentation
 * @author semenov
 *
 */
public class PRED_mutex_lock_bt_1 extends P1 {

	public PRED_mutex_lock_bt_1(Term arg1, Operation cont) {
		this.arg1 = arg1;
		this.cont = cont;
	}

	@Override
	public Operation exec(Prolog engine) throws PrologException {
		Term a1 = arg1.dereference();

		final Lock lock;
		if (a1.isSymbol()){
			lock = Mutex.getInstance(a1.name());
		} else if (a1.isJavaObject() && (a1.toJava() instanceof Lock)) {
			lock = (Lock) a1.toJava();
		} else {
			throw new IllegalTypeException(this, 1, "atom or JavaObjectTerm(Lock)", a1);
		}
		lock.lock();
		engine.trail.push(new Undoable() {
			@Override
			public void undo() {
				try {
					lock.unlock();
				} catch (IllegalMonitorStateException e){
					// ignore, because the lock is already unlocked explicitly
				}
			}
		});
		return cont;
	}
}
