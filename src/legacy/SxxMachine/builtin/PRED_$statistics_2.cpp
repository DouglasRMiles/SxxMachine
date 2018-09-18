using namespace std;

#include "PRED_$statistics_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../machine/SxxMachine/TermData.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;
SxxMachine::SymbolTerm *const PRED_$statistics_2::Nil = SxxMachine::Prolog::Nil;
SxxMachine::SymbolTerm *const PRED_$statistics_2::SYM_RUNTIME = SxxMachine::SymbolTerm::intern("runtime");
SxxMachine::SymbolTerm *const PRED_$statistics_2::SYM_TRAIL = SxxMachine::SymbolTerm::intern("trail");
SxxMachine::SymbolTerm *const PRED_$statistics_2::SYM_CHOICE = SxxMachine::SymbolTerm::intern("choice");

	PRED_$statistics_2::PRED_$statistics_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_$statistics_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
	a1 = LARG[0];
	a2 = LARG[1];
	Term *result = nullptr;

	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	else if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "atom", a1);
	}
	else if (a1->equals(SYM_RUNTIME))
	{
		engine->requireFeature(Prolog::Feature::STATISTICS_RUNTIME, this, a1);
		long long val1, val2;
		Term *start, *previous;
		val1 = System::currentTimeMillis() - engine->getStartRuntime();
		val2 = val1 - engine->getPreviousRuntime();
		engine->setPreviousRuntime(val1);
		start = new IntegerTerm(static_cast<int>(val1));
		previous = new IntegerTerm(static_cast<int>(val2));
		result = TermData::CONS(start, TermData::CONS(previous, Nil));
	}
	else if (a1->equals(SYM_TRAIL))
	{
		int top, max;
		Term *free, *used;
		top = engine->trail->top();
		max = engine->trail->max();
		used = new IntegerTerm(top);
		free = new IntegerTerm(max - top);
		result = TermData::CONS(used, TermData::CONS(free, Nil));
	}
	else if (a1->equals(SYM_CHOICE))
	{
		int top, max;
		Term *free, *used;
		top = engine->stack->top();
		max = engine->stack->max();
		used = new IntegerTerm(top);
		free = new IntegerTerm(max - top);
		result = TermData::CONS(used, TermData::CONS(free, Nil));
	}
	else
	{
		return engine->fail();
	}
	if (!a2->unify(result, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
