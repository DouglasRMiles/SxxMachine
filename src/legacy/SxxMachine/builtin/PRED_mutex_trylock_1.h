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


	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using PrologException = SxxMachine::PrologException;
	/**
	
	<p>mutex_trylock(+MutexId)
	    As  mutex_lock/1,  but if the mutex  is held by another thread,  this
	    predicates fails immediately.
	    
	  <p>description is copied from swi prolog documentation
	 * @author semenov
	 *
	 */
	class PRED_mutex_trylock_1 : public P1
	{

	public:
		PRED_mutex_trylock_1(Term *arg1, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;
	};

}
