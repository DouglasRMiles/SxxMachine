#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <vector>
#include <any>
#include "stringbuilder.h"

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

	/**
	 * '$builtin_member'(X, [X|_]).
	 * '$builtin_member'(X, [_|L]) :- '$builtin_member'(X, L).
	 */

	class PRED_$builtin_member_2 final : public Predicate::P2
	{

	public:
		PRED_$builtin_member_2(Term *a1, Term *a2, Operation cont);

		void toString(StringBuilder *sb) override;


		Operation exec(Prolog *engine) override final;

	private:
		static Operation retry(Prolog *engine);
	};

}
