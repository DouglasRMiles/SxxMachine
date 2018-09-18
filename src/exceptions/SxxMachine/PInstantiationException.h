#ifndef PINSTANTIATIONEXCEPTION
#define PINSTANTIATIONEXCEPTION

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	/**
	 * Instantiation error.<br>
	 * There will be an instantiation error 
	 * when an argument of one of its components is a variable,
	 * and an instantiated argument or component is required.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PInstantiationException : public BuiltinException
	{
		/** A functor symbol of <code>instantiation/2</code>. */
	public:
		static SymbolTerm* const  INSTANTIATION_ERROR;
		/** Constructs a new <code>PInstantiationException</code>. */
		PInstantiationException();
		/** Constructs a new <code>PInstantiationException</code>
		 * with the given arguments. */
		PInstantiationException(Operation _goal, const int& _argNo);
		/** Returns a term representation of this <code>PInstantiationException</code>:
		 * <code>instantiation_error(goal,argNo)</code>.
		 */
		Term* getMessageTerm() override;
		/** Returns a string representation of this <code>PInstantiationException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}


#endif	//#ifndef PINSTANTIATIONEXCEPTION
