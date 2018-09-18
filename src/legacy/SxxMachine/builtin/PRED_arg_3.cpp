using namespace std;

#include "PRED_arg_3.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_arg_3::PRED_arg_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this->cont = cont;
	}

	Operation PRED_arg_3::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2, *a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	std::vector<Term*> args;
	int arity, argNo;

	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	else if (!(dynamic_cast<IntegerTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "integer", a1);
	}
	a2 = a2->dref();
	if ((dynamic_cast<ListTerm*>(a2) != nullptr))
	{
		args = std::vector<Term*>(2);
		args[0] = a2->asListlTerm().car();
		args[1] = a2->asListlTerm().cdr();
		arity = 2;
	}
	else if ((dynamic_cast<StructureTerm*>(a2) != nullptr))
	{
		args = (a2)->args();
		arity = (a2)->arity();
	}
	else if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
	{
		throw PInstantiationException(this, 2);
	}
	else
	{
		throw IllegalTypeException(this, 2, "compound", a2);
	}
	argNo = a1->asIntegerlTerm().intValue();
	if (argNo < 0)
	{
		throw IllegalDomainException(this, 1, "not_less_than_zero", a1);
	}
	if (argNo > arity || argNo < 1)
	{
		return engine->fail();
	}
	if (!a3->unify(args[argNo - 1], engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
