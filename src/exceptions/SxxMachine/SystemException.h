#ifndef SYSTEMEXCEPTION
#define SYSTEMEXCEPTION

#include "PrologException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	/**
	 * System error.<br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class SystemException : public PrologException
	{
		/** A functor symbol of <code>system_error/1</code>. */
	public:
		static SymbolTerm* const  SYSTEM_ERROR;
		/** Holds a message. */
		const std::string message;
		std::string getMessage() override;
		/** Constructs a new <code>SystemException</code> with a message. */
		SystemException(const std::string& _message);
		/** Returns a term representation of this <code>SystemException</code>:
		 * <code>system_error(message)</code>.
		 */
		Term* getMessageTerm() override;
		/** Returns a string representation of this <code>SystemException</code>. */
		std::string toString() override;
	};

}


#endif	//#ifndef SYSTEMEXCEPTION
