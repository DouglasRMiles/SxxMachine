using namespace std;

#include "PRED_$cut_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/IntegerTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using IllegalTypeException = SxxMachine::IllegalTypeException;

	PRED_$cut_1::PRED_$cut_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation PRED_$cut_1::exec(Prolog *engine)
	{
	//        engine.setB0(); 
		Term *a1;
		a1 = LARG[0];
		a1 = a1->dref();
		if (!(dynamic_cast<IntegerTerm*>(a1) != nullptr))
		{
			throw IllegalTypeException("integer", a1);
		}
		else
		{
			engine->cut(a1->asIntegerTerm()->intValue());
		}
		return cont;
	}
}
