using namespace std;

#include "TermSource.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../terms/SxxMachine/Expect.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	TermSource::TermSource(Nonvar *val, Prog *p) : Source(p)
	{
		this->val = val;
		pos = 0;
	}

	Term *TermSource::getElement()
	{
		Term *X;
		if (nullptr == val)
		{
			X = nullptr;
		}
		else if (!(val->isStructure()))
		{
			X = val;
			val = nullptr;
		}
		else if (0 == pos)
		{
			X = TermData::SYM(val->name());
		}
		else if (pos <= Expect::asStruct(val)->arityOrType())
		{
			X = Expect::asStruct(val)->ArgDeRef(pos - 1);
		}
		else
		{
			X = nullptr;
			val = nullptr;
		}
		pos++;
		return X;
	}

	void TermSource::stop()
	{
		val = nullptr;
	}
}
