#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
	class PrologException;
}

namespace SxxMachine
{


	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using PrologException = SxxMachine::PrologException;

	/** {@code make_directory(+Dir)} */
	class PRED_make_directory_1 : public Predicate::P1
	{
  public:
	  PRED_make_directory_1(Term *a1, Operation next);

	  Operation exec(Prolog *engine) throw(PrologException) override;
	};

}
