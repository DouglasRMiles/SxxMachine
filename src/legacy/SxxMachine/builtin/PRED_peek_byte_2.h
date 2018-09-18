#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class IntegerTerm;
	class Operation;
	class Term;
	class Prolog;
}

namespace SxxMachine
{


	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	/**
	   <code>peek_byte/2</code><br>
	   @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	   @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	   @version 1.1
	   @since 1.1
	*/
	class PRED_peek_byte_2 : public Predicate::P2
	{
	private:
		static IntegerTerm *const INT_EOF;

	public:
		PRED_peek_byte_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;
	};

}
