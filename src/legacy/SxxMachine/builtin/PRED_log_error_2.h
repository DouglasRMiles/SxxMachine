#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <stdexcept>
#include <any>

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
	using P2 = SxxMachine::Predicate::P2;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <b>log_error(package:level, error)</b> - logs given <i>error</i> to the logger, corresponding to <i>package</i>, 
	 * under the given <i>level</i>. If possible, java and prolog stack traces are also written.
	 * <p><i>package</i> is expected to be atom. (Variable will cause errors).
	 * If package is absent, then current package is automatically added by prolog compiler.
	 * So call log('INFO','message') is valid.
	 * <p><i>level</i> can be either variable or atom. If it is a variable, it will be bound to current logging level of given package.
	 * If it is an atom, the current logging level of given package will be set to its value.  
	 * Value can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
	 * Also lower case variants without quotes are accepted. So log(info,'message') is valid. 
	 * <p><i>error</i> can be any term, including free variable. 
	 * 
	 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its method {@link Logger#log(Level, String)}
	 * with level and message as arguments.
	 *  
	 * @author semenov
	 *
	 */
	class PRED_log_error_2 : public P2
	{

	public:
		PRED_log_error_2(Term *a0, Term *a1, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
