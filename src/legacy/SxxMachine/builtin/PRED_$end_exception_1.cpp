using namespace std;

#include "PRED_$end_exception_1.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;
	using Term = SxxMachine::Term;

	PRED_$end_exception_1::PRED_$end_exception_1(Term *a1, Operation cont)
	{
		LARG[0] = a1;
		this->cont = cont;
	}

	Operation PRED_$end_exception_1::exec(Prolog *const engine)
	{
		engine->setB0();
		constexpr int B = engine->popCatcherB();
		engine->trail->push([&] ()
		{
		engine->pushCatcherB(B);
		});
		return cont;
	}
}
