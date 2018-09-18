using namespace std;

#include "PRED_atom_length_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_atom_length_2::PRED_atom_length_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_atom_length_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	int length;

	a1 = a1->dref();
	a2 = a2->dref();

	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "atom", a1);
	}
	length = a1->asSymbolTerm()->name().length();
	if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
	{
		IntegerTerm tempVar(length);
		if (!a2->unify(&tempVar, engine->trail))
		{
		return engine->fail();
		}
	}
	else if ((dynamic_cast<IntegerTerm*>(a2) != nullptr))
	{
		int n = a2->asIntegerlTerm().intValue();
		if (n < 0)
		{
		throw IllegalDomainException(this, 2, "not_less_than_zero", a2);
		}
		if (length != n)
		{
		return engine->fail();
		}
	}
	else
	{
		throw IllegalTypeException(this, 1, "integer", a2);
	}
		return cont;
	}
}
