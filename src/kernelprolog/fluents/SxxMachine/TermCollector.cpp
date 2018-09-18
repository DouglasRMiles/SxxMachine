using namespace std;

#include "TermCollector.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"
#include "IterableSource.h"

namespace SxxMachine
{

	TermCollector::TermCollector(Prog *p) : Sink(p)
	{
		this->p = p;
		this->buffer = vector();
	}

	int TermCollector::putElement(Term *T)
	{
		buffer.push_back(T);
		return 1;
	}

	void TermCollector::stop()
	{
		buffer.clear();
	}

	Term *TermCollector::collect()
	{
		return new IterableSource(buffer, p);
	}
}
