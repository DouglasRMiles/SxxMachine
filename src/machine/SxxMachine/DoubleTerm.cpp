using namespace std;

#include "DoubleTerm.h"
#include "Term.h"
#include "Trail.h"
#include "OpVisitor.h"
#include "../../exceptions/SxxMachine/EvaluationException.h"
#include "../../exceptions/SxxMachine/IllegalTypeException.h"
#include "LongTerm.h"
#include "TermData.h"

namespace SxxMachine
{

	int DoubleTerm::arityOrType()
	{
	  return Term::FLOAT;
	}

	bool DoubleTerm::isDouble()
	{
		return true;
	}

	DoubleTerm::DoubleTerm(double i)
	{
		this->value = i;
	}

	any DoubleTerm::value()
	{
		return this->value;
	}

	int DoubleTerm::type()
	{
	  return TYPE_DOUBLE;
	}

	bool DoubleTerm::unifyImpl(Term *t, Trail *trail)
	{
		t = t->dref();
		return (t->isVar()) ? t->unify(this, trail) : ((t->isDouble()) && this->value == t->doubleValue());
	}

	wstring DoubleTerm::name()
	{
		oopsy();
		return "Double";
	}

	bool DoubleTerm::convertible(type_info type)
	{
		return convertible(Double::typeid, type);
	}

	any DoubleTerm::toJava()
	{
		return static_cast<Double>(this->value);
	}

	wstring DoubleTerm::toAtomName()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		return Double::toString(this->value);
	}

	void DoubleTerm::toStringImpl(int printFlags, StringBuilder *sb)
	{
		sb->append(this->value);
	}

	bool DoubleTerm::equalsTerm(Term *obj, OpVisitor *comparator)
	{
		return obj->isDouble() && Double::doubleToLongBits(this->value) == Double::doubleToLongBits((obj)->doubleValue());
	}

	int DoubleTerm::termHashCodeImpl()
	{
	long long bits = Double::doubleToLongBits(this->value);
	return static_cast<int>(bits ^ (static_cast<long long>(static_cast<unsigned long long>(bits) >> 32)));
	}

	int DoubleTerm::compareTo(Term *anotherTerm)
	{ // anotherTerm must be dereferenced
	if ((anotherTerm->isVar()))
	{
		return AFTER;
	}
	if (!(anotherTerm->isDouble()))
	{
		return BEFORE;
	}
	return Double::compare(this->value, anotherTerm->doubleValue());
	}

	int DoubleTerm::intValue()
	{
		return static_cast<int>(this->value);
	}

	long long DoubleTerm::longValue()
	{
		return static_cast<long long>(this->value);
	}

	int DoubleTerm::arithCompareTo(NumberTerm *t)
	{
	return Double::compare(this->value, t->doubleValue());
	}

	NumberTerm *DoubleTerm::abs()
	{
		return optional<float>(abs(this->value));
	}

	NumberTerm *DoubleTerm::acos()
	{
		return optional<float>(acos(this->value));
	}

	NumberTerm *DoubleTerm::add(NumberTerm *t)
	{
		return optional<float>(this->value + t->doubleValue());
	}

	NumberTerm *DoubleTerm::and(NumberTerm *t)
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::asin()
	{
		return optional<float>(asin(this->value));
	}

	NumberTerm *DoubleTerm::atan()
	{
		return optional<float>(atan(this->value));
	}

	NumberTerm *DoubleTerm::ceil()
	{
		return optional<int>(static_cast<long long>(ceil(this->value)));
	}

	NumberTerm *DoubleTerm::cos()
	{
		return optional<float>(cos(this->value));
	}

	NumberTerm *DoubleTerm::divide(NumberTerm *t)
	{
	if (t->doubleValue() == 0)
	{
		throw EvaluationException("zero_divisor");
	}
	return optional<float>(this->value / t->doubleValue());
	}

	NumberTerm *DoubleTerm::exp()
	{
		return optional<float>(exp(this->value));
	}

	NumberTerm *DoubleTerm::floatIntPart()
	{
	return optional<float>(Math::signum(this->value) * floor(abs(this->value)));
	}

	NumberTerm *DoubleTerm::floatFractPart()
	{
	return optional<float>(this->value - Math::signum(this->value) * floor(abs(this->value)));
	}

	NumberTerm *DoubleTerm::floor()
	{
		return optional<int>(static_cast<long long>(floor(this->value)));
	}

	NumberTerm *DoubleTerm::intDivide(NumberTerm *t)
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::log()
	{
	if (this->value == 0)
	{
		throw EvaluationException("undefined");
	}
	return optional<float>(log(this->value));
	}

	NumberTerm *DoubleTerm::max(NumberTerm *t)
	{
		return optional<float>(max(this->value, t->doubleValue()));
	}

	NumberTerm *DoubleTerm::min(NumberTerm *t)
	{
		return optional<float>(min(this->value, t->doubleValue()));
	}

	NumberTerm *DoubleTerm::mod(NumberTerm *t)
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::multiply(NumberTerm *t)
	{
		return optional<float>(this->value * t->doubleValue());
	}

	NumberTerm *DoubleTerm::negate()
	{
		return optional<float>(- this->value);
	}

	NumberTerm *DoubleTerm::not()
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::or(NumberTerm *t)
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::pow(NumberTerm *t)
	{
		return optional<float>(pow(this->value, t->doubleValue()));
	}

	NumberTerm *DoubleTerm::rint()
	{
		return optional<float>(Math::rint(this->value));
	}

	NumberTerm *DoubleTerm::round()
	{
		return optional<int>(round(this->value));
	}

	NumberTerm *DoubleTerm::shiftLeft(NumberTerm *t)
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::shiftRight(NumberTerm *t)
	{
		throw mustInt();
	}

	NumberTerm *DoubleTerm::signum()
	{
		return optional<float>(Math::signum(this->value));
	}

	NumberTerm *DoubleTerm::sin()
	{
		return optional<float>(sin(this->value));
	}

	NumberTerm *DoubleTerm::sqrt()
	{
	if (this->value < 0)
	{
		throw EvaluationException("undefined");
	}
	return optional<float>(sqrt(this->value));
	}

	NumberTerm *DoubleTerm::subtract(NumberTerm *t)
	{
		return optional<float>(this->value - t->doubleValue());
	}

	NumberTerm *DoubleTerm::tan()
	{
		return optional<float>(tan(this->value));
	}

	NumberTerm *DoubleTerm::toDegrees()
	{
		return optional<float>(Math::toDegrees(this->value));
	}

	NumberTerm *DoubleTerm::toFloat()
	{
		return this;
	}

	NumberTerm *DoubleTerm::toRadians()
	{
		return optional<float>(Math::toRadians(this->value));
	}

	DoubleTerm *DoubleTerm::Float(long long n)
	{
	  return new DoubleTerm(n);
	}

	NumberTerm *DoubleTerm::truncate()
	{
	if (this->value >= 0)
	{
		return optional<int>(static_cast<long long>(floor(this->value)));
	}
	else
	{
		return optional<int>(static_cast<long long>(-1 * floor(abs(this->value))));
	}
	}

	NumberTerm *DoubleTerm::xor(NumberTerm *t)
	{
		throw mustInt();
	}

	IllegalTypeException *DoubleTerm::mustInt()
	{
	  return new IllegalTypeException("integer", this);
	}

	LongTerm *DoubleTerm::Integer(long long round)
	{
	   int i = static_cast<int>(round);
	   if ((static_cast<long long>(i)) == round)
	   {
		 return TermData::Integer(i);
	   }
	  return TermData::Long(round);
	}

	bool DoubleTerm::isFloat()
	{
		return true;
	}
}
