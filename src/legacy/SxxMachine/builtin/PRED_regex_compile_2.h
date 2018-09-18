#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

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
	 * <code>regex_compile/2</code><br>
	 *
	 * <pre>
	 *   'regex_compile'(+regex string, -Pattern object)
	 * </pre>
	 */
	class PRED_regex_compile_2 : public Predicate::P2
	{

  public:
	  PRED_regex_compile_2(Term *a1, Term *a2, Operation cont);

	  Operation exec(Prolog *engine) override;
	};
}
