using namespace std;

#include "PRED_new_hash_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/HashtableOfTerm.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../exceptions/SxxMachine/PermissionException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using HashtableOfTerm = SxxMachine::HashtableOfTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using PermissionException = SxxMachine::PermissionException;
SxxMachine::SymbolTerm *const PRED_new_hash_2::SYM_ALIAS_1 = SxxMachine::SymbolTerm::intern("alias", 1);

	PRED_new_hash_2::PRED_new_hash_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_new_hash_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];

	a1 = a1->dref();
	if (!(dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "variable", a1);
	}
	HashtableOfTerm tempVar();
	Term *newHash = new FFIObjectTerm(&tempVar);
	a2 = a2->dref();
	if (a2->isNil())
	{
		if (!a1->unify(newHash, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	else if (!(dynamic_cast<ListTerm*>(a2) != nullptr))
	{
		throw IllegalTypeException(this, 2, "list", a2);
	}
	// a2 is list
	Term *tmp = a2;
	while (!tmp->isNil())
	{
		if ((dynamic_cast<VariableTerm*>(tmp) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		if (!(dynamic_cast<ListTerm*>(tmp) != nullptr))
		{
		throw IllegalTypeException(this, 2, "list", a2);
		}
		Term *car = tmp->asListTerm()->car()->dref();
		if ((dynamic_cast<VariableTerm*>(car) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		if ((dynamic_cast<StructureTerm*>(car) != nullptr))
		{
		Term *functor = (car)->functor();
		std::vector<Term*> args = (car)->args();
		if (functor->equals(SYM_ALIAS_1))
		{
			Term *alias = args[0]->dref();
			if (!(dynamic_cast<SymbolTerm*>(alias) != nullptr))
			{
			throw IllegalDomainException(this, 2, "hash_option", car);
			}
			else
			{
			if (engine->getHashManager()->containsKey(alias))
			{
				throw PermissionException(this, "new", "hash", car, "");
			}
			engine->getHashManager()->put(alias, newHash);
			}
		}
		else
		{
			throw IllegalDomainException(this, 2, "hash_option", car);
		}
		}
		else
		{
		throw IllegalDomainException(this, 2, "hash_option", car);
		}
		tmp = tmp->asListTerm()->cdr()->dref();
	}
	if (!a1->unify(newHash, engine->trail))
	{
		return engine->fail();
	}
		return cont;
	}
}
