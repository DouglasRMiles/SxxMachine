using namespace std;

#include "NumberTerm.h"
#include "Term.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	NumberTerm* NumberTerm::toClone()
	{
		return this;
	}

	int NumberTerm::termHashCodeImpl()
	{
		return Double::hashCode(value);
	}

	bool NumberTerm::bind(Term* that, KPTrail* trail)
	{
		return Nonvar::bind(that, trail) && value == ((static_cast<NumberTerm*>(that))->value);
	}

	double NumberTerm::doubleValue()
	{
		return value; //.doubleValue();
	}

	wstring NumberTerm::pprint()
	{
		return toAtomName();
	}

	NumberTerm* NumberTerm::functor()
	{
	  return this;
	}

	void NumberTerm::toStringImpl(const int& printFlags, StringBuilder* sb)
	{
	   sb->append(toAtomName());

	}

	bool NumberTerm::isNumber()
	{
		return true;
	}

	bool NumberTerm::isNonvar()
	{
		return true;
	}

	bool NumberTerm::isImmutable()
	{
		return true;
	}
}
