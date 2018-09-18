using namespace std;

#include "PRED_$get_current_B_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	PRED_$get_current_B_1::PRED_$get_current_B_1(Term *a1, Operation cont)
	{
	LARG[0] = a1;
	this->cont = cont;
	}

	Operation PRED_$get_current_B_1::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1;
	a1 = LARG[0];
	IntegerTerm tempVar(engine->stack->top());
	if (!a1->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
