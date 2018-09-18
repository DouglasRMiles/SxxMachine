using namespace std;

#include "IntegerSource.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/LongTerm.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	IntegerSource::IntegerSource(long long fuel, long long a, long long x, long long b, Prog *p) : Source(p)
	{
		this->fuel = fuel;
		this->a = a;
		this->b = b;
		this->x = x;
	}

	Term *IntegerSource::getElement()
	{
		if (fuel <= 0)
		{
			return nullptr;
		}
		LongTerm *R = optional<long long>(x);
		x = a * x + b;
		--fuel;
		return R;
	}

	void IntegerSource::stop()
	{
		fuel = 0;
	}

	wstring IntegerSource::pprint()
	{
		return "{(x->" + to_string(a) + "*x+" + to_string(b) + ")[" + to_string(fuel) + "]=" + to_string(x) + "}";
	}
}
