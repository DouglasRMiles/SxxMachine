#pragma once

#include "../../../machine/SxxMachine/BlockPredicate.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
}

namespace SxxMachine
{

	using BlockPredicate = SxxMachine::BlockPredicate;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <code>'$begin_exception'/1</code><br>
	 * 
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2
	 */
	class PRED_$begin_exception_1 : public BlockPredicate
	{
		// private final Term LARG[0];

	public:
		PRED_$begin_exception_1(Term *a1, Operation cont);

		Operation exec(Prolog *const engine) override;
	};

}
