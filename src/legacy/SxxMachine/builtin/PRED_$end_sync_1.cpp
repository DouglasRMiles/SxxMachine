using namespace std;

#include "PRED_$end_sync_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "PRED_$begin_sync_2.h"
#include "../../../exceptions/SxxMachine/SystemException.h"
#include "../../../machine/SxxMachine/OutOfScope.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using OutOfScope = SxxMachine::OutOfScope;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using SystemException = SxxMachine::SystemException;

	PRED_$end_sync_1::PRED_$end_sync_1(Term *a1, Operation cont)
	{
	LARG[0] = a1;
	this->cont = cont;
	}

	Operation PRED_$end_sync_1::exec(Prolog *engine)
	{
		engine->setB0();
	Term *a1;
	a1 = LARG[0];

	a1 = a1->dref();
	if (!(dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "java", a1);
	}
	any obj = (a1)->object();
	if (!(dynamic_cast<PRED_$begin_sync_2*>(obj) != nullptr))
	{
		throw SystemException("a1 must be an object of PRED_$begin_sync_2: " + this);
	}
	PRED_$begin_sync_2 *p = (any_cast<PRED_$begin_sync_2*>(obj));
	p->outOfScope = true;
	OutOfScope tempVar(p);
	engine->trail->push(&tempVar);
	return cont;
	}
}
