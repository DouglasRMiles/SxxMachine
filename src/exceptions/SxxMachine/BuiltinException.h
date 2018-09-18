#ifndef BUILTINEXCEPTION
#define BUILTINEXCEPTION

#include "PrologException.h"
#include "../../machine/SxxMachine/Operation.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	/**
	 * Builtin exception.<br>
	 *
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class BuiltinException : public PrologException
	{
	public:
		Term* messageTerm;
		/** Holds the goal in which this exception occurs. */
		Operation goal = nullptr;
		/** Holds the arity of goal in which this exception occurs. */
		int argNo = 0;
		/** Constructs a new <code>BuiltinException</code>. */
		virtual ~BuiltinException()
		{
			delete messageTerm;
		}

		BuiltinException();
		/** Constructs a new <code>BuiltinException</code> with a given message term. */
		BuiltinException(Term* _message);
		Term* getMessageTerm() override;
	};

}


#endif	//#ifndef BUILTINEXCEPTION
