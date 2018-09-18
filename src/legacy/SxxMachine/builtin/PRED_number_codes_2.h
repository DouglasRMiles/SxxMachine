#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <vector>
#include "exceptionhelper.h"
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
	 * <code>number_codes/2</code><br>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.1
	 */
	class PRED_number_codes_2 : public Predicate::P2
	{
	public:
		PRED_number_codes_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
