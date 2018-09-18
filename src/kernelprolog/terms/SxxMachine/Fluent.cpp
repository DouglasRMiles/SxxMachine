using namespace std;

#include "Fluent.h"
#include "Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	Fluent::Fluent(Prog* p)
	{
		trailMe(p);
	}

	Term* Fluent::toClone()
	{
		oopsy();
		return this;
	}

	bool Fluent::isFluent()
	{
		return true;
	}

	void Fluent::setPersistent(const bool& persistent)
	{
		this->persistent = persistent;
	}

	bool Fluent::getPersistent()
	{
		return this->persistent;
	}

	void Fluent::trailMe(Prog* p)
	{
		if(nullptr != p)
		{
			p->getTrail()->push(this);
		}
	}

	void Fluent::stop()
	{
	}

	void Fluent::undo()
	{
		if(!persistent)
		{
			stop();
		}
	}
}
