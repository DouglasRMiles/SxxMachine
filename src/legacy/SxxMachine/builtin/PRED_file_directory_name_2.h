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

	/** {@code file_directory_name(+File, -Directory)} */
	class PRED_file_directory_name_2 : public Predicate::P2
	{
  public:
	  PRED_file_directory_name_2(Term *a1, Term *a2, Operation next);

	  Operation exec(Prolog *engine) throw(PrologException) override;
	};

}
