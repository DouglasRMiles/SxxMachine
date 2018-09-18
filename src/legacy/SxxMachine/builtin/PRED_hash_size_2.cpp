using namespace std;

#include "PRED_hash_size_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../machine/SxxMachine/HashtableOfTerm.h"
#include "../../../exceptions/SxxMachine/InternalException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using HashtableOfTerm = SxxMachine::HashtableOfTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using InternalException = SxxMachine::InternalException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_hash_size_2::PRED_hash_size_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_hash_size_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];

	any hash = nullptr;

	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	else if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		if (!engine->getHashManager()->containsKey(a1))
		{
		throw ExistenceException(this, 1, "hash", a1, "");
		}
		hash = (engine->getHashManager()->get(a1)).object();
	}
	else if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
	{
		hash = a1->object();
	}
	else
	{
		throw IllegalDomainException(this, 1, "hash_or_alias", a1);
	}
	if (!(dynamic_cast<HashtableOfTerm*>(hash) != nullptr))
	{
		throw InternalException(this + ": Hash is not HashtableOfTerm");
	}
	a2 = a2->dref();
	if (!(dynamic_cast<VariableTerm*>(a2) != nullptr) && !(dynamic_cast<IntegerTerm*>(a2) != nullptr))
	{
		throw IllegalTypeException(this, 1, "integer", a2);
	}
	IntegerTerm tempVar(hash.asHashtableOflTerm()->size());
	if (!a2->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
		return cont;
	}
}
