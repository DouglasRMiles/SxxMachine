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
	   <code>'$get_prolog_impl_flag'/2</code><br>
	   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	   @version 1.0
	*/
	class PRED_$get_prolog_impl_flag_2 : public Predicate::P2
	{
	private:
		static SymbolTerm *const TRUE;
		static SymbolTerm *const FALSE;
		static SymbolTerm *const BOUNDED;
		static SymbolTerm *const MAX_INTEGER;
		static SymbolTerm *const MIN_INTEGER;
		static SymbolTerm *const INTEGER_ROUNDING_FUNCTION;
		static SymbolTerm *const CHAR_CONVERSION;
		static SymbolTerm *const DEBUG;
		static SymbolTerm *const MAX_ARITY;
		static SymbolTerm *const UNKNOWN;
		static SymbolTerm *const DOUBLE_QUOTES;
		static SymbolTerm *const PRINT_STACK_TRACE;

	public:
		PRED_$get_prolog_impl_flag_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
