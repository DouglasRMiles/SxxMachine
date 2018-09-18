using namespace std;

#include "PRED_current_engine_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	PRED_current_engine_1::PRED_current_engine_1(Term *a1, Operation cont)
	{
	LARG[0] = a1;
	this->cont = cont;
	}

	Operation PRED_current_engine_1::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1;
	a1 = LARG[0];

	a1 = a1->dref();
	FFIObjectTerm tempVar(engine);
	if (!a1->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
