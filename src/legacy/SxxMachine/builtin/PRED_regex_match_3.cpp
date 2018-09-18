using namespace std;

#include "PRED_regex_match_3.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_regex_match_3::PRED_regex_match_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		LARG[2] = a3;
		this->cont = cont;
	}

	Operation PRED_regex_match_3::exec(Prolog *engine)
	{
		engine->setB0();
		engine->cont = cont;
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();

		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			throw PInstantiationException(this, 1);
		}
		Pattern *pattern = any_cast<Pattern*>(a1->object());

		if ((dynamic_cast<VariableTerm*>(a2) != nullptr))
		{
			throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
			throw IllegalTypeException(this, 1, "atom", a2);
		}
		Matcher *matcher = pattern->matcher(a2->name());

		if (!matcher->find())
		{
			return engine->fail();
		}

		engine->AREGS[0] = new FFIObjectTerm(matcher);
		engine->AREGS[1] = LARG[2];
		return engine->jtry2(PRED_regex_match_3::regex_check, PRED_regex_match_3::regex_next);
	}

	Operation PRED_regex_match_3::regex_check(Prolog *engine)
	{
		Term *a1 = engine->AREGS[0];
		Term *result = engine->AREGS[1];
		Matcher *matcher = any_cast<Matcher*>(a1->object());

		Term *matches = getMatches(matcher);

		if (matches == Prolog::Nil || !result->unify(matches, engine->trail))
		{
			return engine->fail();
		}
		return engine->cont;
	}

	Operation PRED_regex_match_3::regex_next(Prolog *engine)
	{
		return engine->trust(PRED_regex_match_3::regex_empty);
	}

	Operation PRED_regex_match_3::regex_empty(Prolog *engine)
	{
		Term *a1 = engine->AREGS[0];
		Matcher *matcher = any_cast<Matcher*>(a1->object());
		if (!matcher->find())
		{
			return engine->fail();
		}

		return engine->jtry2(PRED_regex_match_3::regex_check, PRED_regex_match_3::regex_next);
	}

	Term *PRED_regex_match_3::getMatches(Matcher *matcher)
	{
		Term *list = Prolog::Nil;
		for (int i = matcher->groupCount(); i >= 0; i--)
		{
			SymbolTerm *match = SymbolTerm::create(matcher->group(i));
			list = TermData::CONS(match, list);
		}
		return list;
	}
}
