using namespace std;

#include "SourceMerger.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../terms/SxxMachine/Copier.h"
#include "O1Queue.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../terms/SxxMachine/Source.h"

namespace SxxMachine
{

	SourceMerger::SourceMerger(Nonvar *Xs, Prog *p) : IterableSource(p)
	{
		this->Q = new O1Queue(Copier::ConsToVector(Xs));
	}

	Term *SourceMerger::getElement()
	{
		if (nullptr == Q)
		{
			return nullptr;
		}
		while (!Q->isEmpty())
		{
			Source *current = any_cast<Source*>(Q->deq());
			if (nullptr == current)
			{
				continue;
			}
			Term *T = current->getElement();
			if (nullptr == T)
			{
				continue;
			}
			Q->enq(current);
			return T;
		}
		return nullptr;
	}
}
