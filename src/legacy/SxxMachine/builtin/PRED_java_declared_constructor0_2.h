#pragma once

#include "../../../machine/SxxMachine/JavaPredicate.h"
#include <vector>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Term;
	class Prolog;
}

namespace SxxMachine
{


	using JavaPredicate = SxxMachine::JavaPredicate;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	/**
	 * <code>java_declared_constructor0/2</code>
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.1
	 */
	class PRED_java_declared_constructor0_2 : public JavaPredicate
	{
		// private final Term LARG[0], LARG[1];

	public:
		PRED_java_declared_constructor0_2(Term *a1, Term *a2, Operation cont);

		Operation exec(Prolog *engine) override;

	private:
		Term *toPrologTerm(std::any obj);
	};

}
