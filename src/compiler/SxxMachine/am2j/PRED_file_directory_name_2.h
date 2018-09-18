#ifndef PRED_FILE_DIRECTORY_NAME_2
#define PRED_FILE_DIRECTORY_NAME_2

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

	/** {@code file_directory_name(+File, -Directory)} */
	class PRED_file_directory_name_2 : public Predicate::P2
	{
  public:
	  PRED_file_directory_name_2(Term* a1, Term* a2, Operation next);

	  Operation exec(Prolog* engine) throw(PrologException) override;
	};

}


#endif	//#ifndef PRED_FILE_DIRECTORY_NAME_2
