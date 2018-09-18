using namespace std;

#include "PRED_regex_compile_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_regex_compile_2::PRED_regex_compile_2(Term *a1, Term *a2, Operation cont)
	{
		  LARG[0] = a1;
		  LARG[1] = a2;
		  this->cont = cont;
	}

	Operation PRED_regex_compile_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();

		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
		  throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
		  throw IllegalTypeException(this, 1, "atom", a1);
		}
		Pattern *pattern = Pattern::compile(a1->name(), Pattern::MULTILINE);

		FFIObjectTerm tempVar(pattern);
		if (!a2->unify(&tempVar, engine->trail))
		{
		  return engine->fail();
		}
		return cont;
	}
}
