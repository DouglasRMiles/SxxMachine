#pragma once

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Term;
	class Operation;
}

namespace SxxMachine
{

	/**
	 * Syntax error.<br>
	 * There will be a syntax error when a sequence of characters
	 * which are being input as read-term do not conform to the syntax.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class SyntaxException : public BuiltinException
	{
		/** A functor symbol of <code>syntax_error/5</code>. */
	public:
		static SymbolTerm *const SYNTAX_ERROR;
		/** Holds a string representation of valid type. */
		const std::string type;
		/** Holds the argument or one of its components which caused the error. */
		Term *const culprit;
		/** Holds a string representation of detail message. */
		const std::string message;
		/** Constructs a new <code>SyntaxException</code> 
		 * with a valid type, its culprit, and message. */
		virtual ~SyntaxException()
		{
			delete culprit;
		}

		std::string getMessage() override;
		SyntaxException(const std::string &_type, Term *_culprit, const std::string &_message);
		/** Constructs a new <code>SyntaxException</code> with the given arguments. */
		SyntaxException(Operation _goal, int _argNo, const std::string &_type, Term *_culprit, const std::string &_message);
		/** Returns a term representation of this <code>SyntaxException</code>:
		 * <code>syntax_error(goal,argNo,type,culprit,message)</code>.
		 */
		Term *getMessageTerm() override;
		/** Returns a string representation of this <code>SyntaxException</code>. */
		std::string toString() override;
	};

}
