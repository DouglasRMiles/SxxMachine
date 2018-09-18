#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
	class PrologException;
}

namespace SxxMachine
{


	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
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
	class PRED_mutex_lock_bt_1 : public P1
	{

	public:
		PRED_mutex_lock_bt_1(Term *a0, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;
	};

}
