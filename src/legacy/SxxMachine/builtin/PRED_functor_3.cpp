using namespace std;

#include "PRED_functor_3.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/NumberTerm.h"
#include "../../../machine/SxxMachine/ClosureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/ListTerm.h"

namespace SxxMachine
{
	using ClosureTerm = SxxMachine::ClosureTerm;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using NumberTerm = SxxMachine::NumberTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
SxxMachine::SymbolTerm *const PRED_functor_3::SYM_DOT = SxxMachine::SymbolTerm::intern(".");

	PRED_functor_3::PRED_functor_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	LARG[2] = a3;
	this->cont = cont;
	}

	Operation PRED_functor_3::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2, *a3;
	a1 = LARG[0];
	a2 = LARG[1];
	a3 = LARG[2];

	// functor(?X,+Y,+Z)
	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		a2 = a2->dref();
		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr) && !(dynamic_cast<NumberTerm*>(a2) != nullptr) && !(dynamic_cast<FFIObjectTerm*>(a2) != nullptr) && !(dynamic_cast<ClosureTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "atomic", a2);
		}
		a3 = a3->dref();
		if ((dynamic_cast<VariableTerm*>(a3) != nullptr))
		{
		throw PInstantiationException(this, 3);
		}
		if (!(dynamic_cast<IntegerTerm*>(a3) != nullptr))
		{
		throw IllegalTypeException(this, 3, "integer", a3);
		}
		int n = a3->asIntegerlTerm().intValue();
		if (n < 0)
		{
		throw IllegalDomainException(this, 3, "not_less_than_zero", a3);
		}
		if (n == 0)
		{
		if (!a1->unify(a2, engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "atom", a2);
		}
		if (n == 2 && a2->equals(SYM_DOT))
		{
		VariableTerm tempVar(engine);
		VariableTerm tempVar2(engine);
		Term *t = TermData::CONS(&tempVar, &tempVar2);
		if (!a1->unify(t, engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		std::vector<Term*> args(n);
		for (int i = 0; i < n; i++)
		{
		args[i] = new VariableTerm(engine);
		}
		SymbolTerm *sym = SymbolTerm::create(a2->asSymbolTerm()->name(), n);
		StructureTerm tempVar3(sym, args);
		if (!a1->unify(&tempVar3, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	// functor(+X,?Y,?Z)
	Term *functor;
	IntegerTerm *arity;
	if ((dynamic_cast<SymbolTerm*>(a1) != nullptr) || (dynamic_cast<NumberTerm*>(a1) != nullptr) || (dynamic_cast<FFIObjectTerm*>(a1) != nullptr) || (dynamic_cast<ClosureTerm*>(a1) != nullptr))
	{
		functor = a1;
		arity = new IntegerTerm(0);
	}
	else if ((dynamic_cast<ListTerm*>(a1) != nullptr))
	{
		functor = SYM_DOT;
		arity = new IntegerTerm(2);
	}
	else if ((dynamic_cast<StructureTerm*>(a1) != nullptr))
	{
		functor = SymbolTerm::create((a1)->name());
		arity = new IntegerTerm((a1)->arity());
	}
	else
	{
		return engine->fail();
	}
	if (!a2->unify(functor, engine->trail))
	{
		return engine->fail();
	}
	if (!a3->unify(arity, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
