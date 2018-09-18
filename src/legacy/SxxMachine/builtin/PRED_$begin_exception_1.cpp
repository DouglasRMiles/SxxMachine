using namespace std;

#include "PRED_$begin_exception_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{
	using BlockPredicate = SxxMachine::BlockPredicate;
	using Operation = SxxMachine::Operation;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	PRED_$begin_exception_1::PRED_$begin_exception_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation PRED_$begin_exception_1::exec(Prolog *const engine)
	{
		engine->setB0();
		engine->pushCatcherB(engine->B0);
		engine->trail->push([&] ()
		{
		engine->popCatcherB();
		});
		return cont;
	}
}
