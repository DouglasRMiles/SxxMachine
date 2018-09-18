using namespace std;

#include "PRED_sort_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/JavaException.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using JavaException = SxxMachine::JavaException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_sort_2::PRED_sort_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_sort_2::exec(Prolog *engine)
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
		tmp = tmp->asListlTerm().cdr().dref();
	}
	if (!tmp->equals(Prolog::Nil))
	{
		throw PInstantiationException(this, 1);
	}
	try
	{
		Arrays::sort(list);
	}
	catch (const ClassCastException &e)
	{
		throw JavaException(this, 1, e);
	}
	tmp = Prolog::Nil;
	tmp2 = nullptr;
	for (int i = list.size() - 1; i >= 0; i--)
	{
		if (!list[i]->equals(tmp2))
		{
		tmp = TermData::CONS(list[i], tmp);
		}
		tmp2 = list[i];
	}
	if (!a2->unify(tmp, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
