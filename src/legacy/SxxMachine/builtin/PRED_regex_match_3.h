#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
}

namespace SxxMachine
{


	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <code>regex_match/3</code><br>
	 * <p>
	 * <pre>
	 *   'regex_match'(+Pattern object, +Chars, -Matches)
	 * </pre>
	 */
	class PRED_regex_match_3 : public Predicate::P3
	{

	public:
		PRED_regex_match_3(Term *a1, Term *a2, Term *a3, Operation cont);

		Operation exec(Prolog *engine) override;

	private:
		static Operation regex_check(Prolog *engine);


		static Operation regex_next(Prolog *engine);


		static Operation regex_empty(Prolog *engine);


		static Term *getMatches(Matcher *matcher);
	};
}
