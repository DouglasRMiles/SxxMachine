using namespace std;

#include "PRED_$insert_2.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;

	PRED_$insert_2::PRED_$insert_2(Term *a1, Term *a2, Operation cont)
	{
		LARG[0] = a1;
		LARG[1] = a2;
		this->cont = cont;
	}

	Operation PRED_$insert_2::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
	int idx;

	a2 = a2->dref();
	if (!(dynamic_cast<VariableTerm*>(a2) != nullptr))
	{
		throw IllegalTypeException(this, 2, "variable", a2);
	}
	a1 = a1->dref();
	idx = engine->internalDB->insert(a1);
	IntegerTerm tempVar(idx);
	if (!a2->unify(&tempVar, engine->trail))
	{
		return engine->fail();
	}
	return cont;
	}
}
