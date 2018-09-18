#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

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
	
	<p>mutex_create(?MutexId)
	  <p>Create  a mutex.  If MutexId  is an atom, a named mutex  is created.
	  If  it is  a variable,  an  anonymous mutex  reference is  returned.
	  There is no limit to the number of mutexes that can be created.
	<p>description is copied from swi prolog documentation
	* @author semenov
	*
	*/
	class PRED_mutex_create_1 : public P1
	{

	public:
		PRED_mutex_create_1(Term *a0, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
