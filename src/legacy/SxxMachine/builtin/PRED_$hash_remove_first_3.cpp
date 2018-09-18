using namespace std;

#include "PRED_$hash_remove_first_3.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../exceptions/SxxMachine/ExistenceException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalDomainException.h"
#include "../../../machine/SxxMachine/HashtableOfTerm.h"
#include "../../../exceptions/SxxMachine/InternalException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using HashtableOfTerm = SxxMachine::HashtableOfTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using ExistenceException = SxxMachine::ExistenceException;
	using IllegalDomainException = SxxMachine::IllegalDomainException;
	using InternalException = SxxMachine::InternalException;
	using PInstantiationException = SxxMachine::PInstantiationException;
SxxMachine::SymbolTerm *const PRED_$hash_remove_first_3::SYM_NIL = SxxMachine::Prolog::Nil;

	PRED_$hash_remove_first_3::PRED_$hash_remove_first_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		LARG[2] = a3;
		this->cont = cont;
	}

	Operation PRED_$hash_remove_first_3::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];

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
		Term *elem = hash.asHashtableOfTerm()->get(a2);
		if (elem == nullptr || elem->isNil())
		{
			return cont;
		}
		a3 = a3->dref();

		Deque<Term*> *stack = new ArrayDeque<Term*>();
		Term *t = elem->dref();
		while (dynamic_cast<ListTerm*>(t) != nullptr)
		{
			ListTerm *lt = static_cast<ListTerm*>(t);
			Term *y = lt->car()->dref();
			t = lt->cdr();
			if (y->equals(a3))
			{
				break;
			}
			stack->push(y);
		}
		while (!stack->isEmpty())
		{
			t = TermData::CONS(stack->pop(), t);
		}
		elem = t;

		if (elem->isNil() && (dynamic_cast<IntegerTerm*>(a2) != nullptr))
		{
			hash.asHashtableOfTerm()->remove(a2);
			// System.out.println("################ key " + a2 + " is removed");
		}
		else
		{
			hash.asHashtableOfTerm().put(a2, elem);
		}
		return cont;
	}
}
