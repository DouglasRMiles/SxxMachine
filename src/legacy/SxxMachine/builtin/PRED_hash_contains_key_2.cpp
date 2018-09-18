using namespace std;

#include "PRED_hash_contains_key_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../machine/SxxMachine/HashtableOfTerm.h"
#include "../../../exceptions/SxxMachine/InternalException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using HashtableOfTerm = SxxMachine::HashtableOfTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using InternalException = SxxMachine::InternalException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_hash_contains_key_2::PRED_hash_contains_key_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_hash_contains_key_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		any hash = nullptr;

		if ((dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
		{
			hash = a1->object();
		}
		else if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
			FFIObjectTerm *t = engine->getHashManager()->get(a1);
			if (t == nullptr)
			{
				throw ExistenceException(this, 1, "hash", a1, "");
			}
			hash = t->object();
		}
		else if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			throw PInstantiationException(this, 1);
		}
		else
		{
			throw IllegalDomainException(this, 1, "hash_or_alias", a1);
		}

		if (dynamic_cast<HashtableOfTerm*>(hash) != nullptr)
		{
			if (hash.asHashtableOfTerm().containsKey(a2))
			{
				return cont;
			}
			return engine->fail();
		}
		throw InternalException(this + ": Hash is not HashtableOfTerm");
	}
}
