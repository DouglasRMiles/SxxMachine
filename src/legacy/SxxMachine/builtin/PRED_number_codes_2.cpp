using namespace std;

#include "PRED_number_codes_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/SyntaxException.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/ListTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/RepresentationException.h"
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
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using RepresentationException = SxxMachine::RepresentationException;
	using SyntaxException = SxxMachine::SyntaxException;

	PRED_number_codes_2::PRED_number_codes_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_number_codes_2::exec(Prolog *engine)
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
	{ // number_codes(-Number, +CharCodeList)
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
	{ // number_codes(+Number, ?CharCodeList)
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		std::vector<char> chars = a1->toString()->toCharArray();
		Term *y = Prolog::Nil;
		for (int i = chars.size(); i > 0; i--)
		{
		IntegerTerm tempVar3(static_cast<int>(chars[i - 1]));
		y = TermData::CONS(&tempVar3, y);
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
