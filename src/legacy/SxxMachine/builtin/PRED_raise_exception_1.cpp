using namespace std;

#include "PRED_raise_exception_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../exceptions/SxxMachine/TermException.h"

namespace SxxMachine
{
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using PInstantiationException = SxxMachine::PInstantiationException;
	using TermException = SxxMachine::TermException;

	PRED_raise_exception_1::PRED_raise_exception_1(Term *a1, Operation cont)
	{
	LARG[0] = a1;
	this->cont = cont;
	}

	Operation PRED_raise_exception_1::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1;
	a1 = LARG[0];

	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	throw TermException(a1);
	}
}
