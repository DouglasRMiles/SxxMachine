#pragma once

#include "../../../machine/SxxMachine/Predicate.h"

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
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <p><b>log_level(package:level)</b> - gets or sets logging level for given package.
	 * <p><i>package</i> is expected to be atom. (Variable will cause errors).
	 * If package is absent, then current package is automatically added by prolog compiler.
	 * So call log_level('INFO') is valid.
	 * <p><i>level</i> can be either variable or atom. If it is a variable, it will be bound to current logging level of given package.
	 * If it is an atom, the current logging level of given package will be set to its value.  
	 * Value can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
	 * Also lower case variants without quotes are accepted. So log_level(info) is valid.
	 * 
	 * <p>If <i>level</i> is bound to atom value, the predicate finds {@link Logger} instance, 
	 * corresponding to given package, and calls its {@link Logger#setLevel(Level)} method with given <i>level</i> value.
	 * <p>If level is free variable, the predicate finds {@link Logger} instance, 
	 * corresponding to given package, calls its {@link Logger#getLevel()} method to find out it is level
	 * and binds the value to the <i>level</i> argument
	 * 
	 * @author semenov
	 *
	 */
	class PRED_log_level_1 : public P1
	{

	public:
		PRED_log_level_1(Term *a0, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
