#pragma once

#include "../../../machine/SxxMachine/BlockPredicate.h"
#include <stdexcept>
#include <any>
#include <mutex>

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
	//import SxxMachine.FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <code>'$begin_sync'/2</code>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2
	 */
	class PRED_$begin_sync_2 : public BlockPredicate
	{
		// private final Term LARG[0], LARG[1];

	public:
		PRED_$begin_sync_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
