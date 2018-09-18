using namespace std;

#include "PRED_$set_prolog_impl_flag_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
SxxMachine::SymbolTerm *const PRED_$set_prolog_impl_flag_2::CHAR_CONVERSION = SxxMachine::SymbolTerm::intern("char_conversion");
SxxMachine::SymbolTerm *const PRED_$set_prolog_impl_flag_2::DEBUG = SxxMachine::SymbolTerm::intern("debug");
SxxMachine::SymbolTerm *const PRED_$set_prolog_impl_flag_2::UNKNOWN = SxxMachine::SymbolTerm::intern("unknown");
SxxMachine::SymbolTerm *const PRED_$set_prolog_impl_flag_2::DOUBLE_QUOTES = SxxMachine::SymbolTerm::intern("double_quotes");
SxxMachine::SymbolTerm *const PRED_$set_prolog_impl_flag_2::PRINT_STACK_TRACE = SxxMachine::SymbolTerm::intern("print_stack_trace");

	PRED_$set_prolog_impl_flag_2::PRED_$set_prolog_impl_flag_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_$set_prolog_impl_flag_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	a1 = a1->dref();
	a2 = a2->dref();

	if (a1->equals(CHAR_CONVERSION))
	{
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		return engine->fail();
		}
		engine->setCharConversion(a2->asSymbolTerm()->name());
	}
	else if (a1->equals(DEBUG))
	{
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		return engine->fail();
		}
		engine->setDebug(a2->asSymbolTerm()->name());
	}
	else if (a1->equals(UNKNOWN))
	{
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		return engine->fail();
		}
		engine->setUnknown(a2->asSymbolTerm()->name());
	}
	else if (a1->equals(DOUBLE_QUOTES))
	{
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		return engine->fail();
		}
		engine->setDoubleQuotes(a2->asSymbolTerm()->name());
	}
	else if (a1->equals(PRINT_STACK_TRACE))
	{
		if (!(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
		return engine->fail();
		}
		engine->setPrintStackTrace(a2->asSymbolTerm()->name());
	}
	else
	{
		return engine->fail();
	}
		return cont;
	}
}
