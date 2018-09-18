using namespace std;

#include "PRED_$get_instances_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/RepresentationException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using RepresentationException = SxxMachine::RepresentationException;
SxxMachine::SymbolTerm *const PRED_$get_instances_2::COMMA = SxxMachine::SymbolTerm::intern(",", 2);

	PRED_$get_instances_2::PRED_$get_instances_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_$get_instances_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	int idx;

	a1 = a1->dref();
	if (a1->isNil())
	{
		return engine->fail();
	}
	if (!(dynamic_cast<ListTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "list", a1);
	}
	Term *x = Prolog::Nil;
	Term *tmp = a1;
	while (!tmp->isNil())
	{
		if (!(dynamic_cast<ListTerm*>(tmp) != nullptr))
		{
		throw IllegalTypeException(this, 1, "list", a1);
		}
		Term *car = tmp->asListlTerm().car().dref();
		if ((dynamic_cast<VariableTerm*>(car) != nullptr))
		{
		throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<IntegerTerm*>(car) != nullptr))
		{
		throw RepresentationException(this, 1, "integer");
		}
		// car is an integer
		int i = car->asIntegerlTerm().intValue();
		Term *e = engine->internalDB->get(i);
		if (e != nullptr)
		{
		StructureTerm tempVar(COMMA, e, car);
		x = TermData::CONS(&tempVar, x);
		}
		tmp = tmp->asListlTerm().cdr().dref();
	}
	if (!a2->unify(x, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
