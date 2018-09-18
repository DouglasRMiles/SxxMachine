#pragma once

#include "../../../machine/SxxMachine/Predicate.h"
#include <unordered_map>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class Operation;
	class Prolog;
	class PrologException;
}

namespace SxxMachine
{


	using PrologException = SxxMachine::PrologException;
	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	/**
	 * <p><b>loggable(package:level)</b> - succeed if given level is loggable for given package.
	 * If package is absent, then current package is automatically added by prolog compiler.
	 * So call loggable('INFO') is valid. Both package and level are expected to be atoms. (Variables will cause errors).
	 * Level can be one of 'OFF','SEVERE','WARNING','INFO','CONFIG','FINE','FINER','FINEST','ALL' (from highest to lowest).
	 * Also lower case variants without quotes are accepted.  
	 *
	 * <p>The predicate finds {@link Logger} instance, corresponding to given package, and calls its {@link Logger#isLoggable(Level)}
	 * method with given level.
	 * 	  
	 * @author semenov
	 *
	 */
	class PRED_loggable_1 : public P1
	{

	public:
		static const std::unordered_map<Term*, Level*> LEVELS;
		private:
			class StaticConstructor
			{
			public:
				StaticConstructor();
			};

		private:
			static PRED_loggable_1::StaticConstructor staticConstructor;


	public:
		PRED_loggable_1(Term *a0, Operation cont);

		Operation exec(Prolog *engine) throw(PrologException) override;

	};

}
