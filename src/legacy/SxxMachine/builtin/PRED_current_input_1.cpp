using namespace std;

#include "PRED_current_input_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalDomainException = SxxMachine::IllegalDomainException;

	PRED_current_input_1::PRED_current_input_1(Term *a1, Operation cont)
	{
	LARG[0] = a1;
	this->cont = cont;
	}

	Operation PRED_current_input_1::exec(Prolog *engine)
	{
		engine->requireFeature(Prolog::Feature::IO, this, LARG[0]);
		engine->setB0();
	Term *a1;
	a1 = LARG[0];
	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		FFIObjectTerm tempVar(engine->getCurrentInput());
		a1->asVariablelTerm().bind(&tempVar, engine->trail);
	}
	else if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
	{
		FFIObjectTerm tempVar2(engine->getCurrentInput());
		if (!a1->unify(&tempVar2, engine->trail))
		{
		return engine->fail();
		}
	}
	else
	{
		throw IllegalDomainException(this,1,"stream",a1);
	}
	return cont;
	}
}
