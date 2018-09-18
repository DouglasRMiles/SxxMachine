using namespace std;

#include "IntegerTerm.h"
#include "Trail.h"
#include "Term.h"
#include "OpVisitor.h"
#include "NumberTerm.h"
#include "../../exceptions/SxxMachine/EvaluationException.h"
#include "../../exceptions/SxxMachine/IllegalTypeException.h"
#include "TermData.h"

namespace SxxMachine
{

	bool IntegerTerm::isInteger()
	{
		return true;
	}

	bool IntegerTerm::isLong()
	{
		return false;
	}

	bool IntegerTerm::unifyInt(int i, Trail *trail)
	{
	   return intValue() == i;
	}

	IntegerTerm::IntegerTerm(int i) : LongTerm(i)
	{
	}

	any IntegerTerm::value()
	{
		return this->intValue();
	}

	bool IntegerTerm::unifyImpl(Term *t, Trail *trail)
	{
		t = t->dref();
		return (t->isVar()) ? t->asVariableTerm()->bind(this, trail) : (((t->isInteger()) && this->intValue() == t->asIntegerTerm()->intValue()) || ((t->isLong()) && (this->intValue()) == t->asLongTerm()->longValue()));
	}

	bool IntegerTerm::convertible(type_info type)
	{
		return convertible(Integer::typeid, type);
	}

	wstring IntegerTerm::name()
	{
	  oopsy();
	  return "";
	}

	any IntegerTerm::toJava()
	{
		return static_cast<Integer>(this->intValue());
	}

	wstring IntegerTerm::toAtomName()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		return Integer::toString(this->intValue());
	}

	void IntegerTerm::toStringImpl(int printFlags, StringBuilder *sb)
	{
		sb->append(this->intValue());
	}

	bool IntegerTerm::equalsTerm(Term *obj, OpVisitor *comparator)
	{
		return obj->isInteger() && this->intValue() == obj->intValue();
	}

	int IntegerTerm::termHashCodeImpl()
	{
		return this->intValue();
	}

	int IntegerTerm::compareTo(Term *anotherTerm)
	{ // anotherTerm must be dereferenced.
	if (((anotherTerm->isVar()) || anotherTerm->isDouble()))
	{
		return AFTER;
	}
	if (!(anotherTerm->isInteger()))
	{
		return BEFORE;
	}
	int v = anotherTerm->asIntegerTerm()->intValue();
	if (this->intValue() == v)
	{
		return EQUAL;
	}
	if (this->intValue() > v)
	{
		return AFTER;
	}
	return BEFORE;
	}

	int IntegerTerm::arithCompareTo(NumberTerm *t)
	{
	  if ((t->isDouble()))
	  {
		  return -(t->arithCompareTo(this));
	  }
	  if ((t->isLong()))
	  {
		return -(t->arithCompareTo(this));
	  }
	  int v = t->intValue();
	  if (this->intValue() == v)
	  {
		  return EQUAL;
	  }
	  if (this->intValue() > v)
	  {
		  return AFTER;
	  }
	  return BEFORE;
	}

	NumberTerm *IntegerTerm::abs()
	{
		return optional<int>(abs(this->intValue()));
	}

	NumberTerm *IntegerTerm::acos()
	{
		return optional<float>(acos(intValue()));
	}

	NumberTerm *IntegerTerm::add(NumberTerm *t)
	{
		return (t->isDouble()) ? t->add(this) : Integer(this->intValue() + t->intValue());
	}

	NumberTerm *IntegerTerm::and(NumberTerm *t)
	{
	must_be_int(t);
	return optional<int>(this->intValue() & t->intValue());
	}

	NumberTerm *IntegerTerm::asin()
	{
		return optional<float>(asin(intValue()));
	}

	NumberTerm *IntegerTerm::atan()
	{
		return optional<float>(atan(intValue()));
	}

	NumberTerm *IntegerTerm::ceil()
	{
		return this;
	}

	NumberTerm *IntegerTerm::cos()
	{
		return optional<float>(cos(intValue()));
	}

	NumberTerm *IntegerTerm::divide(NumberTerm *t)
	{
	if (t->doubleValue() == 0)
	{
		throw EvaluationException("zero_divisor");
	}
	return optional<float>(intValue() / t->doubleValue());
	}

	NumberTerm *IntegerTerm::exp()
	{
		return optional<float>(exp(intValue()));
	}

	NumberTerm *IntegerTerm::floatIntPart()
	{
		throw IllegalTypeException("float", this);
	}

	NumberTerm *IntegerTerm::floatFractPart()
	{
		throw IllegalTypeException("float", this);
	}

	NumberTerm *IntegerTerm::floor()
	{
		return this;
	}

	NumberTerm *IntegerTerm::intDivide(NumberTerm *t)
	{
	must_be_int(t);
	if (t->intValue() == 0)
	{
		throw EvaluationException("zero_divisor");
	}
	return optional<int>(this->intValue() / t->intValue());
	}

	NumberTerm *IntegerTerm::log()
	{
	if (this->intValue() == 0)
	{
		throw EvaluationException("undefined");
	}
	return optional<float>(log(intValue()));
	}

	NumberTerm *IntegerTerm::max(NumberTerm *t)
	{
	if ((t->isDouble()))
	{
		return t->max(this);
	}
	return optional<int>(max(this->intValue(), t->intValue()));
	}

	NumberTerm *IntegerTerm::min(NumberTerm *t)
	{
	if ((t->isDouble()))
	{
		return t->min(this);
	}
	return optional<int>(min(this->intValue(), t->intValue()));
	}

	NumberTerm *IntegerTerm::mod(NumberTerm *t)
	{
	must_be_int(t);
	if (t->intValue() == 0)
	{
		throw EvaluationException("zero_divisor");
	}
	return optional<int>(this->intValue() % t->intValue());
	}

	NumberTerm *IntegerTerm::multiply(NumberTerm *t)
	{
	if ((t->isDouble()))
	{
		return t->multiply(this);
	}
	if ((t->isLong()))
	{
		return t->multiply(this);
	}
	return optional<int>(this->intValue() * t->intValue());
	}

	NumberTerm *IntegerTerm::negate()
	{
		return optional<int>(- this->intValue());
	}

	NumberTerm *IntegerTerm::not()
	{
		return optional<int>(~this->intValue());
	}

	NumberTerm *IntegerTerm::or(NumberTerm *t)
	{
	must_be_int(t);
	return optional<int>(this->intValue() | t->intValue());
	}

	NumberTerm *IntegerTerm::pow(NumberTerm *t)
	{
		return optional<float>(pow(intValue(), t->doubleValue()));
	}

	NumberTerm *IntegerTerm::rint()
	{
		return optional<float>(intValue());
	}

	NumberTerm *IntegerTerm::round()
	{
		return this;
	}

	NumberTerm *IntegerTerm::shiftLeft(NumberTerm *t)
	{
	must_be_int(t);
	return optional<int>(this->intValue() << t->intValue());
	}

	NumberTerm *IntegerTerm::shiftRight(NumberTerm *t)
	{
	must_be_int(t);
	return optional<int>(this->intValue() >> t->intValue());
	}

	NumberTerm *IntegerTerm::signum()
	{
		return optional<int>(static_cast<int>(Math::signum(static_cast<double>(this->intValue()))));
	}

	NumberTerm *IntegerTerm::sin()
	{
		return optional<float>(sin(intValue()));
	}

	NumberTerm *IntegerTerm::sqrt()
	{
	if (this->intValue() < 0)
	{
		throw EvaluationException("undefined");
	}
	return optional<float>(sqrt(intValue()));
	}

	NumberTerm *IntegerTerm::subtract(NumberTerm *t)
	{
	if ((t->isDouble()))
	{
		return optional<float>(intValue() - t->doubleValue());
	}
	return optional<int>(this->intValue() - t->intValue());
	}

	NumberTerm *IntegerTerm::tan()
	{
		return optional<float>(tan(intValue()));
	}

	NumberTerm *IntegerTerm::toDegrees()
	{
		return optional<float>(Math::toDegrees(intValue()));
	}

	NumberTerm *IntegerTerm::toFloat()
	{
		return optional<float>(this->intValue());
	}

	NumberTerm *IntegerTerm::toRadians()
	{
		return optional<float>(Math::toRadians(intValue()));
	}

	NumberTerm *IntegerTerm::truncate()
	{
		return this;
	}

	NumberTerm *IntegerTerm::xor(NumberTerm *t)
	{
	must_be_int(t);
	return optional<int>(this->intValue() ^ t->intValue());
	}

	void IntegerTerm::must_be_int(NumberTerm *t)
	{
	  if ((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }

	}

	NumberTerm *IntegerTerm::Integer(long long n)
	{
	  return TermData::Long(n);
	}

	int IntegerTerm::type()
	{
	  return TYPE_INTEGER;
	}
}
