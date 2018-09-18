#ifndef EXISTENCEEXCEPTION
#define EXISTENCEEXCEPTION

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Operation; }

namespace SxxMachine
{

	/**
	 * Existence error.<br>
	 * There will be an existence error when the object
	 * on which an operation is to be performed does not exist.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class ExistenceException : public BuiltinException
	{
		/** A functor symbol of <code>existence_error/5</code>. */
	public:
		static SymbolTerm* const  EXISTENCE_ERROR;
		/* objType ::= procedure | source_sink | stream | hash */
		/** Holds a string representation of object type. */
		const std::string objType;
		/** Holds the argument or one of its components which caused the error. */
		Term* const  culprit;
		/** Holds a string representation of detail message. */
		const std::string message;
		/** Constructs a new <code>ExistenceException</code>
		 * with a object type, its culprit, and message. */
		virtual ~ExistenceException()
		{
			delete culprit;
		}

		ExistenceException(const std::string& _objType, Term* _culprit, const std::string& _message);
		/** Constructs a new <code>ExistenceException</code> 
		 * with the given arguments. */
		ExistenceException(Operation _goal, const int& _argNo, const std::string& _objType, Term* _culprit, const std::string& _message);

		std::string getMessage() override;
		/** Returns a term representation of this <code>ExistenceException</code>:
		 * <code>existence_error(goal,argNo,objType,culprit,message)</code>.
		 */
		Term* getMessageTerm() override;
		/** Returns a string representation of this <code>ExistenceException</code>. */
		std::string toString() override;
	};

}


#endif	//#ifndef EXISTENCEEXCEPTION
