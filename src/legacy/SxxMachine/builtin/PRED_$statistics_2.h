#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

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
	/**
	   <code>'$statistics'/2</code><br>
	   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	   @version 1.0
	*/
	class PRED_$statistics_2 : public Predicate::P2
	{
	private:
		static SymbolTerm *const Nil;
		static SymbolTerm *const SYM_RUNTIME;
		static SymbolTerm *const SYM_TRAIL;
		static SymbolTerm *const SYM_CHOICE;

	public:
		PRED_$statistics_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
