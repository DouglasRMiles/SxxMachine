#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <vector>
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
	 * <code>keysort/2</code><br>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.1
	 */
	class PRED_keysort_2 : public Predicate::P2
	{
	private:
		static SymbolTerm *const SYM_HYPHEN_2;

	public:
		PRED_keysort_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

	class KeySortComparator : public java::util::Comparator<Term*>
	{
	public:
		virtual int compare(Term *t1, Term *t2);
	};

}
