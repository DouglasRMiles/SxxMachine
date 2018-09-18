using namespace std;

#include "PRED_$compiled_predicate_or_builtin_3.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;

	PRED_$compiled_predicate_or_builtin_3::PRED_$compiled_predicate_or_builtin_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
		this->LARG[0] = a1;
		this->LARG[1] = a2;
		this->LARG[2] = a3;
		this->cont = cont;
	}

	Operation PRED_$compiled_predicate_or_builtin_3::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1 = LARG[0]->dref();
		Term *a2 = LARG[1]->dref();
		Term *a3 = LARG[2]->dref();
		if (!engine->pcl->definedPredicate(a1->asSymbolTerm()->name(), a2->asSymbolTerm()->name(), a3->asIntegerlTerm().intValue()) && !engine->pcl->definedPredicate(Prolog::BUILTIN, a2->asSymbolTerm()->name(), a3->asIntegerlTerm().intValue()))
		{
		  return engine->fail();
		}
		return cont;
	}
}
