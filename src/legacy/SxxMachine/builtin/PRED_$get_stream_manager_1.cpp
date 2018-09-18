using namespace std;

#include "PRED_$get_stream_manager_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;

	PRED_$get_stream_manager_1::PRED_$get_stream_manager_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation PRED_$get_stream_manager_1::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1;
		a1 = LARG[0];

	a1 = a1->dref();
	if (!(dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "variable", a1);
	}
	FFIObjectTerm tempVar(engine->getStreamManager());
	if (!a1->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
		return cont;
	}
}
