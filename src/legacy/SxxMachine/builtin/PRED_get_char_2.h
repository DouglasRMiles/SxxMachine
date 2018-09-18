#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <any>
#include "exceptionhelper.h"

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
	 * <code>get_char/2</code><br>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	*/
	class PRED_get_char_2 : public Predicate::P2
	{
	private:
		static SymbolTerm *const SYM_EOF;

	public:
		PRED_get_char_2(Term *a1, Term *a2, Operation cont);

		virtual bool inCharacter(Term *t);

		Operation exec(Prolog *engine) override;
	};

}
