#ifndef FAILURE
#define FAILURE

#include "Operation.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }
namespace SxxMachine { class PrologException; }

namespace SxxMachine
{

	/**
	 * Initial backtrak point.<br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2
	 */
	class Failure : public Operation
	{
	public:
		static Failure* const  FAILURE;
	private:
		Failure();

	public:
		Operation exec(Prolog* engine) override;
		/** Returns a string representation of this <code>Failure</code>. */
		std::string toString() override;
		static const Operation fail_0;
	private:
		class PRED_fail_0 final : public Operation
		{
	  public:
		  Operation exec(Prolog* engine) throw(PrologException) override;
		};
	};

}


#endif	//#ifndef FAILURE
