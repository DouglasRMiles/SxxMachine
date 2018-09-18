using namespace std;

#include "PRED_atom_codes_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/RepresentationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
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
	using RepresentationException = SxxMachine::RepresentationException;

	PRED_atom_codes_2::PRED_atom_codes_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_atom_codes_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1->dref();
	a2 = a2->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{ // atom_codes(-Atom, +CharCodeList)
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
		if (!(dynamic_cast<IntegerTerm*>(car) != nullptr))
		{
			throw RepresentationException(this, 2, "character_code");
		}
		// car is an integer
		int i = car->asIntegerlTerm().intValue();
		if (!Character::isDefined(static_cast<char>(i)))
		{
			throw RepresentationException(this, 2, "character_code");
		}
		sb->append(static_cast<char>(i));
		x = x->asListlTerm().cdr().dref();
		}
		if (!a1->unify(SymbolTerm::create(sb->toString()), engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	else
	{ // atom_codes(+Atom, ?CharCodeList)
		if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
		throw IllegalTypeException(this, 1, "atom", a1);
		}
		std::vector<char> chars = a1->asSymbolTerm()->name().toCharArray();
		Term *x = Prolog::Nil;
		for (int i = chars.size(); i > 0; i--)
		{
		IntegerTerm tempVar(static_cast<int>(chars[i - 1]));
		x = TermData::CONS(&tempVar, x);
		}
		if (!a2->unify(x, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	}
}
