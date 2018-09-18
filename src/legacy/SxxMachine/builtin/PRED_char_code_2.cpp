using namespace std;

#include "PRED_char_code_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/RepresentationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using RepresentationException = SxxMachine::RepresentationException;

	PRED_char_code_2::PRED_char_code_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_char_code_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1->dref();
	a2 = a2->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{ // char_code(-Char, +CharCode)
		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
		throw PInstantiationException(this, 2);
		}
		else if (!(dynamic_cast<IntegerTerm*>(a2) != nullptr))
		{
		throw IllegalTypeException(this, 2, "integer", a2);
		}
		int i = a2->asIntegerlTerm().intValue();
		if (!Character::isDefined(i))
		{
		throw RepresentationException(this, 2, "character_code");
		}
		if (!a1->unify(SymbolTerm::create(static_cast<char>(i)), engine->trail))
		{
		return engine->fail();
		}
	}
	else if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{ // char_code(+Char, ?CharCode)
		wstring s = a1->asSymbolTerm()->name();
		if (s.length() != 1)
		{
		throw IllegalTypeException(this, 1, "character", a1);
		}
		IntegerTerm tempVar(static_cast<int>(s[0]));
		if (!a2->unify(&tempVar, engine->trail))
		{
		return engine->fail();
		}
	}
	else
	{
		return engine->fail();
	}
	return cont;
	}
}
