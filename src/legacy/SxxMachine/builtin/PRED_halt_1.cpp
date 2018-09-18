using namespace std;

#include "PRED_halt_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_halt_1::PRED_halt_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation PRED_halt_1::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1 = LARG[0];

		a1 = a1->dref();
		if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			throw PInstantiationException(this, 1);
		}
		if (!(dynamic_cast<IntegerTerm*>(a1) != nullptr))
		{
			throw IllegalTypeException(this, 1, "integer", a1);
		}
		engine->halt = 1 + a1->asIntegerTerm()->intValue();
		return nullptr;
	}
}
