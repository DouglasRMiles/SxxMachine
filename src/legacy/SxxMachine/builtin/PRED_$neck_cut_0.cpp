using namespace std;

#include "PRED_$neck_cut_0.h"
#include "../../../machine/SxxMachine/Operation.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{
	using Operation = SxxMachine::Operation;
	using Predicate = SxxMachine::Predicate;
	using Prolog = SxxMachine::Prolog;

	PRED_$neck_cut_0::PRED_$neck_cut_0(Operation cont)
	{
		this->cont = cont;
	}

	Operation PRED_$neck_cut_0::exec(Prolog *engine)
	{
	//        engine.setB0(); 
		engine->neckCut();
		return cont;
	}
}
