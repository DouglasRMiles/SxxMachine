using namespace std;

#include "SourceLoop.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	SourceLoop::SourceLoop(Source *s, Prog *p) : Source(p)
	{
		this->s = s;
		this->v = vector();
		this->i = 0;
	}

	Term *SourceLoop::getMemoized()
	{
		if (nullptr == v || v.size() <= 0)
		{
			return nullptr;
		}
		Term *T = static_cast<Term*>(v[i]);
		i = (i + 1) % v.size();
		return T;
	}

	Term *SourceLoop::getElement()
	{
		Term *T = nullptr;
		if (nullptr != s)
		{ // s is alive
			T = s->getElement();
			if (nullptr != T)
			{
				v.push_back(T);
			}
			else
			{
				s = nullptr;
			}
		}
		if (nullptr == s)
		{
			T = getMemoized();
		}
		return T;
	}

	void SourceLoop::stop()
	{
		v.clear();
		s = nullptr;
	}
}
