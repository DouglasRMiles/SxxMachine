using namespace std;

#include "OutOfScope.h"
#include "BlockPredicate.h"

namespace SxxMachine
{

	OutOfScope::OutOfScope(BlockPredicate* _p) : p(_p)
	{
	}

	void OutOfScope::undo()
	{
	this->p->outOfScope = false;
	}
}
