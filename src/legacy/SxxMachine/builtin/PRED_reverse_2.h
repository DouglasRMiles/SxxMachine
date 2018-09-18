#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Term;
	class Prolog;
}

namespace SxxMachine
{

	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;


	class PRED_reverse_2 final : public Predicate::P2
	{
	private:
		static SymbolTerm *const s1;

	public:
		PRED_reverse_2(Term *a1, Term *a2, Operation cont);

		void toString(StringBuilder *sb) override;


		Operation exec(Prolog *engine) override;
	};

}
