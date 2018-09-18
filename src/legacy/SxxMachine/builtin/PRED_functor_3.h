#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <vector>

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
	 * <code>functor/3</code><br>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PRED_functor_3 : public Predicate::P3
	{
	private:
		static SymbolTerm *const SYM_DOT;

	public:
		PRED_functor_3(Term *a1, Term *a2, Term *a3, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
