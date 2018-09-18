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
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * atomic_concat(+Atomic1, +Atomic2, -Atom)
	 * Atom represents the text after converting Atomic1 and Atomic2 to text and concatenating the result:
	 *  ?- atomic_concat(name, 42, X).
	 *  X = name42.
	 * Created by semenov on 27.04.2017.
	 * http://www.swi-SxxMachine.org/pldoc/man?predicate=atomic_concat/3
	 */

	class PRED_atomic_concat_3 : public Predicate::P3
	{

	public:
		PRED_atomic_concat_3(Term *a0, Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;
	};

}
