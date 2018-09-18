using namespace std;

#include "PRED_number_chars_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/SyntaxException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../machine/SxxMachine/DoubleTerm.h"
#include "../../../machine/SxxMachine/NumberTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using DoubleTerm = SxxMachine::DoubleTerm;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using ListTerm = SxxMachine::ListTerm;
	using NumberTerm = SxxMachine::NumberTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using SyntaxException = SxxMachine::SyntaxException;

	PRED_number_chars_2::PRED_number_chars_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_number_chars_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];

	a1 = a1->dref();
	a2 = a2->dref();
	if (a2->isNil())
	{
		throw SyntaxException(this, 2, "character_code_list", a2, "");
	}
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{ // number_chars(-Number, +CharList)
		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
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
		try
		{
		IntegerTerm tempVar(static_cast<Integer>(sb->toString()));
		if (!a1->unify(&tempVar, engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		catch (const NumberFormatException &e)
		{
		}
		try
		{
		DoubleTerm tempVar2(static_cast<Double>(sb->toString()));
		if (!a1->unify(&tempVar2, engine->trail))
		{
			return engine->fail();
		}
		return cont;
		}
		catch (const NumberFormatException &e)
		{
		throw SyntaxException(this, 2, "character_code_list", a2, "");
		}
	}
	else if ((dynamic_cast<NumberTerm*>(a1) != nullptr))
	{ // number_chars(+Number, ?CharList)
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		wstring s = a1->toString();
		Term *y = Prolog::Nil;
		for (int i = s.length() - 1; i >= 0; i--)
		{
			y = TermData::CONS(SymbolTerm::create(s[i]), y);
		}
		if (!a2->unify(y, engine->trail))
		{
		return engine->fail();
		}
		return cont;
	}
	else
	{
		throw IllegalTypeException(this, 1, "number", a1);
	}
	}
}
