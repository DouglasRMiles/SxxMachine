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
	using P2 = SxxMachine::Predicate::P2;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using PrologException = SxxMachine::PrologException;

	class PRED_line_count_2 : public P2
	{

	public:
		PRED_line_count_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
