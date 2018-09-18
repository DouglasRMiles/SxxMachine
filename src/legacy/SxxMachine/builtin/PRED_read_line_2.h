#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <string>
#include <vector>
#include <any>
#include "exceptionhelper.h"

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
	 * <code>read_line/2</code><br>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PRED_read_line_2 : public Predicate::P2
	{
	public:
		PRED_read_line_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
