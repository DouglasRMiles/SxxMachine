using namespace std;

#include "FrozenData.h"
#include "Term.h"

namespace SxxMachine
{

	FrozenData::FrozenData()
	{
	}

	Term* FrozenData::getGoals()
	{
	  return this->goals;
	}

	Term* FrozenData::setGoals(Term* goals)
	{
	  return this->goals = goals;
	}

	Term* FrozenData::getAttrs()
	{
	  return this->attrs;
	}

	void FrozenData::setAttrs(Term* attrs)
	{
	  this->attrs = attrs;
	}
}
