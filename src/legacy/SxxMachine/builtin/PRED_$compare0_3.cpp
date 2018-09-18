using namespace std;

#include "PRED_$compare0_3.h"
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
	using Term = SxxMachine::Term;

	PRED_$compare0_3::PRED_$compare0_3(Term *a1, Term *a2, Term *a3, Operation cont)
	{
		this->LARG[0] = a1;
		this->LARG[1] = a2;
		this->LARG[2] = a3;
		this->cont = cont;
	}

	Operation PRED_$compare0_3::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a2 = LARG[1]->dref();
		Term *a3 = LARG[2]->dref();
		IntegerTerm tempVar(a2->compareTo(a3));
		if (!LARG[0]->unify(&tempVar, engine->trail))
		{
		  return engine->fail();
		}
		return cont;
	}
}
