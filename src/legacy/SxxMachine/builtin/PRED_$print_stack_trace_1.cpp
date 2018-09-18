using namespace std;

#include "PRED_$print_stack_trace_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/VariableTerm.h"
#include "../../../exceptions/SxxMachine/PInstantiationException.h"
#include "../../../machine/SxxMachine/FFIObjectTerm.h"
#include "../../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../../exceptions/SxxMachine/JavaInterruptedException.h"

namespace SxxMachine
{
	using FFIObjectTerm = SxxMachine::FFIObjectTerm;
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;
	using VariableTerm = SxxMachine::VariableTerm;
	using IllegalTypeException = SxxMachine::IllegalTypeException;
	using JavaInterruptedException = SxxMachine::JavaInterruptedException;
	using PInstantiationException = SxxMachine::PInstantiationException;

	PRED_$print_stack_trace_1::PRED_$print_stack_trace_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation PRED_$print_stack_trace_1::exec(Prolog *engine)
	{
		engine->setB0();
		Term *a1;
		a1 = LARG[0];

	a1 = a1->dref();
	if ((dynamic_cast<VariableTerm*>(a1) != nullptr))
	{
		throw PInstantiationException(this, 1);
	}
	if (!(dynamic_cast<FFIObjectTerm*>(a1) != nullptr))
	{
		throw IllegalTypeException(this, 1, "java", a1);
	}
	any obj = a1->object();
	if (dynamic_cast<InterruptedException*>(obj) != nullptr)
	{
		throw JavaInterruptedException(any_cast<InterruptedException*>(obj));
	}
	if (engine->getPrintStackTrace() == "on")
	{
		engine->control->printStackTrace(any_cast<runtime_error>(obj));
	}
		return cont;
	}
}
