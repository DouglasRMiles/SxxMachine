using namespace std;

#include "PRED_atom_chars_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using ListTerm = SxxMachine::ListTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_atom_chars_2::PRED_atom_chars_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_atom_chars_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1->dref();
	a2 = a2->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{ // atom_chars(-Atom, +CharList)
		if (a2->isNil())
		{
		if (!a1->unify(SymbolTerm::intern(""), engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		else if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		else if (!(dynamic_cast<ListTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "list", a2);
		}
		StringBuilder *sb = new StringBuilder();
		Term *x = a2;
		while (!x->isNil())
		{
		if ((dynamic_cast<VariableTerm*>(x) != nullptr))
		{
			throw PInstantiationException(this, 2);
		}
		if (!(dynamic_cast<ListTerm*>(x) != nullptr))
		{
			throw IllegalTypeException(this, 2, "list", a2);
		}
		Term *car = x->asListlTerm().car().dref();
		if ((dynamic_cast<VariableTerm*>(car) != nullptr))
		{
			throw PInstantiationException(this, 2);
		}
		if (!(dynamic_cast<SymbolTerm*>(car) != nullptr) || car->asSymbolTerm()->name().length() != 1)
		{
			throw IllegalTypeException(this, 2, "character", a2);
		}
		sb->append(car->asSymbolTerm()->name());
		x = x->asListlTerm().cdr().dref();
		}
		if (!a1->unify(SymbolTerm::create(sb->toString()), engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	else if (a2->isNil() || (dynamic_cast<VariableTerm*>(a2) != nullptr) || (dynamic_cast<ListTerm*>(a2) != nullptr))
	{ // atom_chars(+Atom, ?CharList)
		if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
		throw IllegalTypeException(this, 1, "atom", a1);
		}
		wstring s = a1->asSymbolTerm()->name();
		Term *x = Prolog::Nil;
		for (int i = s.length(); i > 0; i--)
		{
		x = TermData::CONS(SymbolTerm::create(s.substr(i - 1, i - (i - 1))), x);
		}
		if (!a2->unify(x, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	else
	{
		return engine->fail();
	}
	}
}
