#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <vector>
#include <stdexcept>
#include <any>
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
	 * <code>'$read_token0'/3</code><br>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 * @since 0.7
	 */
	class PRED_$read_token0_3 : public Predicate::P3
	{
	public:
		PRED_$read_token0_3(Term *a1, Term *a2, Term *a3, Operation cont);

		/* The a1 must be user, user_input, and
		   java.io.PushbackReader, otherwise fails. */
		Operation exec(Prolog *engine) override;
	};


}
