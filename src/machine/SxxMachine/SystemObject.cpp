using namespace std;

#include "SystemObject.h"
#include "Trail.h"
#include "Term.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	int SystemObject::type()
	{
	  return TYPE_JAVA_OBJECT;
	}

	bool SystemObject::unifyImpl(Term* t, Trail* trail)
	{
		t = t->dref();
		if((t->isVar()))
		{
			return t->asVariableTerm()->unify(this, trail);
		}
		return equalsTerm(t);
	}

	void SystemObject::toStringImpl(const int& printFlags, StringBuilder* sb)
	{
		sb->append(pprint());
	}

	int SystemObject::compareTo(Term* anotherTerm)
	{ // anotherTerm must be dereferenced
	  if(this->type() != anotherTerm->type())
	  {
		return AFTER;
	  }
	  return this->termHashCode() - anotherTerm->termHashCode(); //???
	}

	bool SystemObject::isImmutable()
	{
		return true;
	}

	bool SystemObject::equalsTerm(Term* obj, Comparator* comparator)
	{
	  return equalsIdentical(obj);
	}

	Term* SystemObject::toClone()
	{
		oopsy();
		return this;
	}

	int SystemObject::termHashCodeImpl()
	{
		return static_cast<int>(ordinal);
	}

	bool SystemObject::isSystemObject()
	{
		return true;
	}

long long SystemObject::ctrSO = 0;

	SystemObject::SystemObject()
	{
		ordinal = ++ctrSO;
	}

	wstring SystemObject::name()
	{
		return "object(" + getClass().getName() + "." + to_string(ordinal) + ")";
	}

	wstring SystemObject::qname()
	{
		return "object(" + getClass().getName() + "." + to_string(ordinal) + ")";
	}

	bool SystemObject::bind(Term* that, Trail* trail)
	{
		return Nonvar::bind(that, trail) && ordinal == (static_cast<SystemObject*>(that))->ordinal;
	}

	wstring SystemObject::pprint()
	{
		return name();
	}

	int SystemObject::arityOrType()
	{
		return Term::JAVA;
	}
}
