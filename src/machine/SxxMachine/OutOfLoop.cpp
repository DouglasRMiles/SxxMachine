using namespace std;

#include "OutOfLoop.h"
#include "BlockPredicate.h"

namespace SxxMachine
{

	OutOfLoop::OutOfLoop(BlockPredicate* _p) : p(_p)
	{
	}

	void OutOfLoop::undo()
	{
	this->p->outOfLoop = true;
	}
}
