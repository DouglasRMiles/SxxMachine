#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <string>

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
	using P3 = SxxMachine::Predicate::P3;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <b>log(package:level, format, LARG[0])</b> - logs message, specified by <i>format</i> and <i>LARG[0]</i>, to the logger, 
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
	 * 
	 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its method {@link Logger#log(Level, String)}
	 * with level and the result of {@link String#format(String, Object...)} call with format and LARG[0] as arguments.
	 *  
	 * @author semenov
	 *
	 */
	class PRED_log_3 : public P3
	{

	public:
		PRED_log_3(Term *a0, Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
