#pragma once

#include "BuiltinException.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Operation;
	class Term;
}

namespace SxxMachine
{

	/**
	 * Representation error.<br>
	 * There will be a representation error when an implementation
	 * defined limit has been breached.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class RepresentationException : public BuiltinException
	{
		/** A functor symbol of <code>representation_error/3</code>. */
	public:
		static SymbolTerm *const REPRESENTATION_ERROR;
		/*
		  flag ::= character | character_code | in_character_code | 
		           max_arity | max_integer | min_integer
		*/
		/** Holds a string representation of flag. */
		const std::string flag;
		/** Constructs a new <code>RepresentationException</code> with a flag. */
		RepresentationException(const std::string &_flag);
		/** Constructs a new <code>RepresentationException</code> with the given arguments. */
		RepresentationException(Operation _goal, int _argNo, const std::string &_flag);
		/** Returns a term representation of this <code>RepresentationException</code>:
		 * <code>representation_error(goal,argNo,flag)</code>.
		 */
		Term *getMessageTerm() override;
		/** Returns a string representation of this <code>RepresentationException</code>. */
		std::string toString() override;
		std::string getMessage() override;

	};

}
