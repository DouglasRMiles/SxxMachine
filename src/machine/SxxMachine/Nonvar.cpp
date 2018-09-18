using namespace std;

#include "Nonvar.h"
#include "../../kernelprolog/terms/SxxMachine/Prog.h"
#include "../../kernelprolog/terms/SxxMachine/Expect.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"
#include "Prolog.h"

namespace SxxMachine
{

	bool Nonvar::isNonvar()
	{
		return true;
	}

	Term *Nonvar::ArgDeRef(int i)
	{
		return ArgNoDeRef(i)->dref();
	}

	Term *Nonvar::ArgNoDeRef(int i)
	{
		return arg0(i);
	}

	int Nonvar::unifyArg(int i, Term *a, Prog *p)
	{
		a = a->dref();
		return ArgDeRef(i)->Unify_TO(a->dref(), p->getTrail()) ? 1 : 0;
	}

	int Nonvar::getIntArg(int i)
	{
		return static_cast<int>(Expect::asInt(ArgDeRef(i))->doubleValue());
	}

	bool Nonvar::bind(Term *that, KPTrail *trail)
	{
		if (getClass() == that->getClass())
		{
			return true;
		}
		//oopsy();
		return false;
	}

	bool Nonvar::Unify_TO(Term *that, KPTrail *trail)
	{
		if (bind(that, trail))
		{
			return true;
		}
		else
		{
			return that->bind(this, trail);
		}
	}

	Nonvar *Nonvar::listify()
	{
		return CONS(this, Prolog::Nil);
	}
}
