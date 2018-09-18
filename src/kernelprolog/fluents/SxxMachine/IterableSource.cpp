using namespace std;

#include "IterableSource.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	IterableSource::IterableSource(Prog *p) : Source(p)
	{
		e = nullptr;
	}

	IterableSource::IterableSource(Iterator *iterator, Prog *p) : Source(p)
	{
		this->e = iterator;
	}

	IterableSource::IterableSource(vector V, Prog *p) : Source(p)
	{
		this->e = V.begin();
	}

	Term *IterableSource::getElement()
	{
		if (nullptr == e || !e->hasNext())
		{
			return nullptr;
		}
		else
		{
			return static_cast<Term*>(e->next());
		}
	}

	void IterableSource::stop()
	{
		e = nullptr;
	}
}
