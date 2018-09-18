using namespace std;

#include "PRED_atomic_concat_3.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/NumberTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using NumberTerm = SxxMachine::NumberTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;

	PRED_atomic_concat_3::PRED_atomic_concat_3(Term *a0, Term *a1, Term *a2, Operation cont)
	{
		this->LARG[0] = a0;
		this->LARG[1] = a1;
		this->LARG[2] = a2;
		this->cont = cont;
	}

	Operation PRED_atomic_concat_3::exec(Prolog *engine) throw(PrologException)
	{
		Term * const a1 = LARG[0]->dref();
		Term * const a2 = LARG[1]->dref();

		if (!(dynamic_cast<NumberTerm*>(a1) != nullptr) && !(dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
			throw IllegalTypeException(this, 1, "atomic", a1);
		}

		if (!(dynamic_cast<NumberTerm*>(a2) != nullptr) && !(dynamic_cast<SymbolTerm*>(a2) != nullptr))
		{
			throw IllegalTypeException(this, 2, "atomic", a2);
		}

//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		if (LARG[2]->unify(SymbolTerm::create(a1->toString() + a2->toString()), engine->trail))
		{
			return cont;
		}
		return engine->fail();
	}
}
