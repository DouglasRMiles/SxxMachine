using namespace std;

#include "PRED_keysort_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../exceptions/SxxMachine/BuiltinException.h"
#include "../../../exceptions/SxxMachine/JavaException.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using BuiltinException = SxxMachine::BuiltinException;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using JavaException = SxxMachine::JavaException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
SxxMachine::SymbolTerm *const PRED_keysort_2::SYM_HYPHEN_2 = SxxMachine::SymbolTerm::intern("-", 2);

	PRED_keysort_2::PRED_keysort_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_keysort_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];
	int len;
	Term *tmp, *tmp2;
	std::vector<Term*> list;

	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	else if (a1->equals(Prolog::Nil))
	{
		if (!a2->unify(Prolog::Nil, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	else if (!(dynamic_cast<ListTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "list", a1);
	}
	len = a1->asListlTerm()->length();
	list = std::vector<Term*>(len);
	tmp = a1;
	for (int i = 0; i < len; i++)
	{
		if (!(dynamic_cast<ListTerm*>(tmp) != nullptr))
		{
		throw IllegalTypeException(this, 1, "list", a1);
		}
		list[i] = tmp->asListlTerm().car().dref();
		if (dynamic_cast<VariableTerm*>(list[i]) != nullptr)
		{
		throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<StructureTerm*>(list[i]) != nullptr))
		{
		throw IllegalTypeException(this, 1, "key_value_pair", a1);
		}
		if (!(list[i])->functor()->equals(SYM_HYPHEN_2))
		{
		throw IllegalTypeException(this, 1, "key_value_pair", a1);
		}
		tmp = tmp->asListlTerm().cdr().dref();
	}
	if (!tmp->equals(Prolog::Nil))
	{
		throw PInstantiationException(this, 1);
	}
	try
	{
		KeySortComparator tempVar();
		Arrays::sort(list, &tempVar);
	}
	catch (const BuiltinException &e)
	{
		e->goal = this;
		e->argNo = 1;
		throw e;
	}
	catch (const ClassCastException &e1)
	{
		throw JavaException(this, 1, e1);
	}
	tmp = Prolog::Nil;
	for (int i = list.size() - 1; i >= 0; i--)
	{
		tmp = TermData::CONS(list[i], tmp);
	}
	if (!a2->unify(tmp, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}

	int KeySortComparator::compare(Term *t1, Term *t2)
	{
	Term *a1 = (t1)->args()[0]->dref();
	Term *a2 = (t2)->args()[0]->dref();
	return a1->compareTo(a2);
	}
}
