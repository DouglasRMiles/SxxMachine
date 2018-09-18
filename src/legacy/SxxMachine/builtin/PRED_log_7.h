#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <string>
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
	class PrologException;
}

namespace SxxMachine
{

//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.PRED_loggable_1.LEVELS;


	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <b>log(package:level, format, LARG[0],... argN)</b> - logs message, specified by <i>format</i> and <i>LARG[0]</i>...<i>argN</i> to the logger, 
	 * corresponding to <i>package</i>, under the given <i>level</i>.
	 * <p><i>package</i> is expected to be atom. (Variable will cause errors).
	 * If package is absent, then current package is automatically added by prolog compiler.
	 * So call log('INFO','%s','message') is valid.
	 * <p><i>level</i> can be either variable or atom. If it is a variable, it will be bound to current logging level of given package.
	 * If it is an atom, the current logging level of given package will be set to its value.  
	 * Value can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
	 * Also lower case variants without quotes are accepted. So log(info,'%s','message') is valid. 
	 * <p><i>format</i> - is expected to be an atom, holding format string, that will be supplied to method {@link String#format(String, Object...)}. 
	 * Variable will cause error.
	 * <p><i>LARG[0]</i> - can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
	 * <p>...
	 * <p><i>argN</i> - can be any term, including free variable. It will be converted to string using method {@link Object#toString()}
	 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its method {@link Logger#log(Level, String)}
	 * with level and the result of {@link String#format(String, Object...)} call with <i>format</i> and <i>LARG[0]</i>...<i>argN</i> as arguments.
	 *  
	 * @author semenov
	 *
	 */

	class PRED_log_7 : public Predicate
	{
		// private final Term LARG[0], LARG[1], LARG[2], LARG[3], arg5, arg6, arg7;

	public:
		PRED_log_7(Term *a0, Term *a1, Term *a2, std::vector<Term*> &LARG, Term *arg5, Term *arg6, Term *arg7, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
