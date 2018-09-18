using namespace std;

#include "PRED_$call_closure_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/ClosureTerm.h"

namespace SxxMachine
{
	using ClosureTerm = SxxMachine::ClosureTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	PRED_$call_closure_1::PRED_$call_closure_1(Term *a1, Operation cont)
	{
	LARG[0] = a1;
	this->cont = cont;
	}

	Operation PRED_$call_closure_1::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1;
	Predicate *code;

	// a1 must be closure
	a1 = LARG[0]->dref();

	if (!(dynamic_cast<ClosureTerm*>(a1) != nullptr))
	{
		return engine->fail();
	}
	code = a1->asClosureTerm()->getCode();
	code->cont = this->cont;
	return code;
	}
}
