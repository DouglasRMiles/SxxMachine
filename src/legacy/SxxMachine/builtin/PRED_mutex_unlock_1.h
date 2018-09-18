#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <any>

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
	
	<p>mutex_unlock(+MutexId)
	    <p>Unlock  the mutex.  This can only be called if the mutex  is held by
	    the  calling thread.   If this is  not the case,  a permission_error
	    exception is raised.
	
	  <p>description is copied from swi prolog documentation
	 * @author semenov
	 *
	 */
	class PRED_mutex_unlock_1 : public P1
	{

	public:
		PRED_mutex_unlock_1(Term *a0, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;
	};

}
