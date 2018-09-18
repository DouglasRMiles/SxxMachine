#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
}

namespace SxxMachine
{

	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	class PRED_$compare0_3 final : public Predicate::P3
	{
	public:
		PRED_$compare0_3(Term *a1, Term *a2, Term *a3, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
