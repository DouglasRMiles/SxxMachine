using namespace std;

#include "Failure.h"
#include "Prolog.h"
#include "../../exceptions/SxxMachine/PrologException.h"

namespace SxxMachine
{

Failure* const  Failure::FAILURE = new Failure();

	Failure::Failure()
	{
	}

	Operation Failure::exec(Prolog* engine)
	{
	engine->control->fail();
	engine->halt = 1; // halt(0)
	return nullptr;
	}

	wstring Failure::toString()
	{
		return "Failure";
	}

const Operation Failure::fail_0 = new PRED_fail_0();

	Operation Failure::PRED_fail_0::exec(Prolog* engine) throw(PrologException)
	{
	  engine->setB0();
	  return engine->fail();
	}
}
