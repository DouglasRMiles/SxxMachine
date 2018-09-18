using namespace std;

#include "PRED_mutex_create_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../exceptions/SxxMachine/PrologException.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Mutex.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"

namespace SxxMachine
{
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using PrologException = SxxMachine::PrologException;
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Mutex = SxxMachine::Mutex;
	using Operation = SxxMachine::Operation;
	using P1 = SxxMachine::Predicate::P1;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;

	PRED_mutex_create_1::PRED_mutex_create_1(Term *a0, Operation cont)
	{
		this->LARG[0] = a0; //0];
		this->cont = cont;
	}

	Operation PRED_mutex_create_1::exec(Prolog *engine) throw(PrologException)
	{
		Term *a1 = LARG[0]->dref();

		if ((dynamic_cast<SymbolTerm*>(a1) != nullptr))
		{
			Mutex::getInstance(a1->name());
		}
		else if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
		{
			FFIObjectTerm tempVar(Mutex::getInstance());
			if (!a1->unify(&tempVar, engine->trail))
			{
				return engine->fail();
			}
		}
		else
		{
			throw IllegalTypeException(this, 1, "atom or variable", a1);
		}
		return cont;
	}
}
