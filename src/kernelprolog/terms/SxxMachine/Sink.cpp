using namespace std;

#include "Sink.h"
#include "Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	Sink::Sink(Prog* p) : Fluent(p)
	{
	}

	Term* Sink::collect()
	{
		return nullptr;
	}
}
