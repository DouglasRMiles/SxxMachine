#ifndef PRED_MAKE_DIRECTORY_1
#define PRED_MAKE_DIRECTORY_1

#include "../../../machine/SxxMachine/Predicate.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class PrologException; }

namespace SxxMachine::am2j
{


	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using PrologException = SxxMachine::PrologException;
	using Term = SxxMachine::Term;

	/** {@code make_directory(+Dir)} */
	class PRED_make_directory_1 : public Predicate::P1
	{
  public:
	  PRED_make_directory_1(Term* a1, Operation next);

	  Operation exec(Prolog* engine) throw(PrologException) override;
	};

}


#endif	//#ifndef PRED_MAKE_DIRECTORY_1
