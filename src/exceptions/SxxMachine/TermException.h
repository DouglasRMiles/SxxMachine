#pragma once

#include "PrologException.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
}

namespace SxxMachine
{

	/**
	 * User-defined exception.<br>
	 *
	 * This <code>TermException</code> is used to implement
	 * built-in predicate <code>throw/1</code>.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class TermException : public PrologException
	{
		/** Message as term. */
   public:
	   Term *messageTerm;
		/** Constructs a new <code>TermException</code>. */
		virtual ~TermException()
		{
			delete messageTerm;
		}

		TermException();
		/** Constructs a new <code>TermException</code> with a given message term. */
		TermException(Term *_message);
		Term *getMessageTerm() override;
		std::string getMessage() override;
	};

}
