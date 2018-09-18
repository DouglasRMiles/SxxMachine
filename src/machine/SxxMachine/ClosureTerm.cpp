using namespace std;

#include "ClosureTerm.h"
#include "Predicate.h"
#include "Trail.h"
#include "Term.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	bool ClosureTerm::isClosure()
	{
		return true;
	}

	ClosureTerm::ClosureTerm(Predicate* _code) : code(_code)
	{
	}

	Predicate* ClosureTerm::getCode()
	{
		return this->code;
	}

	int ClosureTerm::type()
	{
	  return TYPE_CLOSURE;
	}

	bool ClosureTerm::unifyImpl(Term* t, Trail* trail)
	{
		t = t->dref();
		if((t->isVar()))
		{
			return t->asVariableTerm()->unify(this, trail);
		}
		return (t->isClosure()) && this->code->equals(t->asClosureTerm()->code);
	}

	wstring ClosureTerm::name()
	{
		return "";
	}

	bool ClosureTerm::equalsTerm(Term* obj, Comparator* comparator)
	{ // obj must be dereferenced
		return obj->isClosure() && this->code->equals(obj->asClosureTerm()->code);
	}

	int ClosureTerm::termHashCodeImpl()
	{
	return this->code->hashCode();
	}

	void ClosureTerm::toStringImpl(const int& printFlags, StringBuilder* sb)
	{
		sb->append("closure[");
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		this->code->toString(sb);
		sb->append("]");
	}

	int ClosureTerm::compareTo(Term* anotherTerm)
	{ // anotherTerm must be dereferenced
	if(!(anotherTerm->isClosure()))
	{
		return AFTER;
	}
	if(this->code->equals(anotherTerm->asClosureTerm()->code))
	{
		return EQUAL;
	}
	return this->code->hashCode() - anotherTerm->asClosureTerm()->code->hashCode(); //???
	}

	bool ClosureTerm::isImmutable()
	{
		return true;
	}
}
