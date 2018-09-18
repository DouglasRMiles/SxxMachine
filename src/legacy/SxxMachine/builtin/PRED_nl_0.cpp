using namespace std;

#include "PRED_nl_0.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;

	PRED_nl_0::PRED_nl_0(Operation cont)
	{
	this->cont = cont;
	}

	Operation PRED_nl_0::exec(Prolog *engine)
	{
		engine->setB0();
	engine->getCurrentOutput()->println();
	return cont;
	}
}
