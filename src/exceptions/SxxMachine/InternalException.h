#pragma once

#include "PrologException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Term;
}

namespace SxxMachine
{

	/**
	 * Internal error.<br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("serial") public class InternalException extends PrologException
	class InternalException : public PrologException
	{
		/** A functor symbol of <code>internal_error/1</code>. */
	public:
		static SymbolTerm *const INTERNAL_ERROR;
		/** Holds a message. */
		const std::string message;
		/** Constructs a new <code>InternalException</code> with a message. */
		InternalException(const std::string &_message);
		/** Returns a term representation of this <code>InternalException</code>:
		 * <code>internal_error(message)</code>.
		 */
		Term *getMessageTerm() override;
		/** Returns a string representation of this <code>InternalException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}
