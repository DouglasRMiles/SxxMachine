using namespace std;

#include "Source.h"
#include "Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "Copier.h"

namespace SxxMachine
{

	Source::Source(Prog *p) : Fluent(p)
	{
	}

	bool Source::isSource()
	{
		return true;
	}

	Nonvar *Source::toList()
	{
		Term *head = getElement();
		if (nullptr == head)
		{
			return Prolog::Nil;
		}
		StructureTerm *l = StructureTerm::createCons(head, Prolog::Nil);
		StructureTerm *curr = l;
		for (;;)
		{
			head = getElement();
			if (nullptr == head)
			{
				break;
			}
			StructureTerm *tail = StructureTerm::createCons(head, Prolog::Nil);
			curr->setArg(1, tail);
			curr = tail;
		}
		return l;
	}

	Term *Source::toFun()
	{
		vector V = vector();
		Term *X;
		while (nullptr != (X = getElement()))
		{
			V.push_back(X);
		}
		return Copier::VectorToFun(V);
	}
}
