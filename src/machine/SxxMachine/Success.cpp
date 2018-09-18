using namespace std;

#include "Success.h"
#include "Prolog.h"

namespace SxxMachine
{

Success *const Success::SUCCESS = new Success();

	Success::Success()
	{
	}

	Operation Success::exec(Prolog *engine)
	{
	engine->control->success();
	return engine->fail();
	}

	wstring Success::toString()
	{
		return "Success";
	}
}
