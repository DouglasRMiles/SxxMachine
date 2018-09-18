using namespace std;

#include "PRED_$term_hash_2.h"
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

	PRED_$term_hash_2::PRED_$term_hash_2(Term *a1, Term *a2, Operation cont)
	{
	LARG[0] = a1;
	LARG[1] = a2;
	this->cont = cont;
	}

	Operation PRED_$term_hash_2::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];

	a1 = a1->dref();
	IntegerTerm tempVar(a1->hashCode());
	if (!a2->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
