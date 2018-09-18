using namespace std;

#include "PRED_$get_prolog_impl_flag_2.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::TRUE = SxxMachine::SymbolTerm::intern("true");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::FALSE = SxxMachine::SymbolTerm::intern("false");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::BOUNDED = SxxMachine::SymbolTerm::intern("bounded");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::MAX_INTEGER = SxxMachine::SymbolTerm::intern("max_integer");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::MIN_INTEGER = SxxMachine::SymbolTerm::intern("min_integer");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::INTEGER_ROUNDING_FUNCTION = SxxMachine::SymbolTerm::intern("integer_rounding_function");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::CHAR_CONVERSION = SxxMachine::SymbolTerm::intern("char_conversion");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::DEBUG = SxxMachine::SymbolTerm::intern("debug");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::MAX_ARITY = SxxMachine::SymbolTerm::intern("max_arity");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::UNKNOWN = SxxMachine::SymbolTerm::intern("unknown");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::DOUBLE_QUOTES = SxxMachine::SymbolTerm::intern("double_quotes");
SxxMachine::SymbolTerm *const PRED_$get_prolog_impl_flag_2::PRINT_STACK_TRACE = SxxMachine::SymbolTerm::intern("print_stack_trace");

	PRED_$get_prolog_impl_flag_2::PRED_$get_prolog_impl_flag_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_$get_prolog_impl_flag_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	a1 = a1->dref();
	a2 = a2->dref();

	if (a1->equals(BOUNDED))
	{
		if (engine->isBounded())
		{
		if (!a2->unify(TRUE, engine->trail))
		{
			return engine->fail();
		}
		}
		else
		{
		if (!a2->unify(FALSE, engine->trail))
		{
			return engine->fail();
		}
		}
	}
	else if (a1->equals(MAX_INTEGER))
	{
		IntegerTerm tempVar(engine->getMaxInteger());
		if (!a2->unify(&tempVar, engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(MIN_INTEGER))
	{
		IntegerTerm tempVar2(engine->getMinInteger());
		if (!a2->unify(&tempVar2, engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(INTEGER_ROUNDING_FUNCTION))
	{
		if (!a2->unify(SymbolTerm::intern(engine->getIntegerRoundingFunction()), engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(CHAR_CONVERSION))
	{
		if (!a2->unify(SymbolTerm::intern(engine->getCharConversion()), engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(DEBUG))
	{
		if (!a2->unify(SymbolTerm::intern(engine->getDebug()), engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(MAX_ARITY))
	{
		IntegerTerm tempVar3(engine->getMaxArity());
		if (!a2->unify(&tempVar3, engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(UNKNOWN))
	{
		if (!a2->unify(SymbolTerm::intern(engine->getUnknown()), engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(DOUBLE_QUOTES))
	{
		if (!a2->unify(SymbolTerm::intern(engine->getDoubleQuotes()), engine->trail))
		{
		return engine->fail();
		}
	}
	else if (a1->equals(PRINT_STACK_TRACE))
	{
		if (!a2->unify(SymbolTerm::intern(engine->getPrintStackTrace()), engine->trail))
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
