#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <string>
#include <vector>
#include <stdexcept>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Term;
	class Operation;
	class Prolog;
}

namespace SxxMachine
{

	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;

	/**
	 * <code>'$call'/2</code><br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PRED_$call_2 : public Predicate::P2
	{
	private:
		static SymbolTerm *const SYM_SLASH_2;
		static SymbolTerm *const SYM_COLON_2;

		static std::vector<Term*> const NO_ARGS;

	public:
		PRED_$call_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};



}
