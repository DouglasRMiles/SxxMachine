using namespace std;

#include "LongTerm.h"
#include "Term.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"
#include "../../kernelprolog/terms/SxxMachine/Expect.h"
#include "NumberTerm.h"
#include "../../exceptions/SxxMachine/IllegalTypeException.h"
#include "../../exceptions/SxxMachine/EvaluationException.h"
#include "TermData.h"
#include "Trail.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	bool LongTerm::isLong()
	{
	  return true;
	}

	bool LongTerm::isFloat()
	{
		  // TODO Auto-generated method stub
		  return false;
	}

	bool LongTerm::isDouble()
	{
	  return false;
	}

	LongTerm::LongTerm(long long value) : DoubleTerm(value)
	{
	  // longValue() = value;
	}

	LongTerm::LongTerm(BigInteger* bigInteger) : DoubleTerm(bigInteger->doubleValue())
	{
	}

	any LongTerm::value()
	{
		return longValue();
	}

	bool LongTerm::bind(Term* that, KPTrail* trail)
	{
	  return DoubleTerm::bind(that, trail) && (static_cast<double>(longValue()) == static_cast<double>(Expect::asInt(that)->longValue()));
	  // unbelievable but true: converting
	  // to double is the only way to convince
	  // Microsoft's jview that 1==1
	  // $$ casting to double to be removed
	  // once they get it right
	}

	int LongTerm::arityOrType()
	{
	  return Term::INT;
	}

	int LongTerm::compareTo(Term* anotherTerm)
	{
	  if(((anotherTerm->isVar()) || anotherTerm->isDouble()))
	  {
		  return AFTER;
	  }
	  if(!(anotherTerm->isLong()))
	  {
		  return BEFORE;
	  }
	  long long v = anotherTerm->longValue();
	  if(longValue() == v)
	  {
		  return EQUAL;
	  }
	  if(longValue() > v)
	  {
		  return AFTER;
	  }
	  return BEFORE;
	}

	int LongTerm::intValue()
	{
	  return static_cast<int>(DoubleTerm::longValue());
	}

	long long LongTerm::longValue()
	{
	  return static_cast<long long>(value);
	}

	double LongTerm::doubleValue()
	{
	  return longValue();
	}

	int LongTerm::arithCompareTo(NumberTerm* t)
	{
	  return Long::compare(longValue(), t->longValue());
	}

	NumberTerm* LongTerm::abs()
	{
	  return optional<long long>(abs(longValue()));
	}

	NumberTerm* LongTerm::acos()
	{
	  return optional<float>(acos(value));
	}

	NumberTerm* LongTerm::add(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		return t->add(this);
	  }
	  return optional<long long>(longValue() + t->longValue());
	}

	NumberTerm* LongTerm::and(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  return optional<long long>(longValue() & t->longValue());
	}

	NumberTerm* LongTerm::asin()
	{
	  return optional<float>(asin(value));
	}

	NumberTerm* LongTerm::atan()
	{
	  return optional<float>(atan(value));
	}

	NumberTerm* LongTerm::ceil()
	{
	  return this;
	}

	NumberTerm* LongTerm::cos()
	{
	  return optional<float>(cos(value));
	}

	NumberTerm* LongTerm::divide(NumberTerm* t)
	{
	  if(t->doubleValue() == 0)
	  {
		  throw EvaluationException("zero_divisor");
	  }
	  return optional<float>(value / t->doubleValue());
	}

	NumberTerm* LongTerm::exp()
	{
	  return optional<float>(exp(value));
	}

	NumberTerm* LongTerm::floatIntPart()
	{
	  throw IllegalTypeException("float", this);
	}

	NumberTerm* LongTerm::floatFractPart()
	{
	  throw IllegalTypeException("float", this);
	}

	NumberTerm* LongTerm::floor()
	{
	  return this;
	}

	NumberTerm* LongTerm::intDivide(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  if(t->intValue() == 0)
	  {
		  throw EvaluationException("zero_divisor");
	  }
	  return optional<long long>((longValue() / t->longValue()));
	}

	NumberTerm* LongTerm::log()
	{
	  if(longValue() == 0LL)
	  {
		  throw EvaluationException("undefined");
	  }
	  return optional<float>(log(value));
	}

	NumberTerm* LongTerm::max(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  return t->max(this);
	  }
	  return optional<long long>(max(longValue(), t->longValue()));
	}

	NumberTerm* LongTerm::min(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  return t->min(this);
	  }
	  return optional<long long>(min(longValue(), t->longValue()));
	}

	NumberTerm* LongTerm::mod(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  if(t->intValue() == 0)
	  {
		  throw EvaluationException("zero_divisor");
	  }
	  return optional<long long>(longValue() % t->longValue());
	}

	NumberTerm* LongTerm::multiply(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  return t->multiply(this);
	  }
	  return optional<long long>(longValue() * t->longValue());
	}

	NumberTerm* LongTerm::negate()
	{
	  return optional<long long>(-longValue());
	}

	NumberTerm* LongTerm::not()
	{
	  return optional<long long>(~longValue());
	}

	NumberTerm* LongTerm::or(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  return optional<long long>(longValue() | t->longValue());
	}

	NumberTerm* LongTerm::pow(NumberTerm* t)
	{
	  return optional<float>(pow(value, t->doubleValue()));
	}

	NumberTerm* LongTerm::rint()
	{
	  return optional<float>(value);
	}

	NumberTerm* LongTerm::round()
	{
	  return this;
	}

	NumberTerm* LongTerm::shiftLeft(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  return optional<long long>(longValue() << t->intValue());
	}

	NumberTerm* LongTerm::shiftRight(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  return optional<long long>(longValue() >> t->intValue());
	}

	NumberTerm* LongTerm::signum()
	{
	  return TermData::Integer(static_cast<int>(Math::signum(static_cast<double>(longValue()))));
	}

	NumberTerm* LongTerm::sin()
	{
	  return optional<float>(sin(value));
	}

	NumberTerm* LongTerm::sqrt()
	{
	  if(longValue() < 0)
	  {
		  throw EvaluationException("undefined");
	  }
	  return optional<float>(sqrt(value));
	}

	NumberTerm* LongTerm::subtract(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		return optional<float>(value - t->value);
	  }
	  return optional<long long>(longValue() - t->longValue());
	}

	NumberTerm* LongTerm::tan()
	{
	  return optional<float>(tan(value));
	}

	NumberTerm* LongTerm::toDegrees()
	{
	  return optional<float>(Math::toDegrees(value));
	}

	NumberTerm* LongTerm::toFloat()
	{
	  return optional<float>(longValue());
	}

	NumberTerm* LongTerm::toRadians()
	{
	  return optional<float>(Math::toRadians(value));
	}

	NumberTerm* LongTerm::truncate()
	{
	  return this;
	}

	NumberTerm* LongTerm::xor(NumberTerm* t)
	{
	  if((t->isDouble()))
	  {
		  throw IllegalTypeException("integer", t);
	  }
	  return optional<long long>(longValue() ^ t->longValue());
	}

	bool LongTerm::unifyImpl(Term* t, Trail* trail)
	{
	  t = t->dref();
	  return (t->isVar()) ? t->asVariableTerm()->bind(this, trail) : (((t->isLong()) && longValue() == t->asLongTerm()->value) || ((t->isInteger()) && longValue() == t->asIntegerTerm()->longValue()));
	}

	wstring LongTerm::name()
	{
	  oopsy();
	  return "";
	}

	bool LongTerm::convertible(type_info type)
	{
	  return convertible(Long::typeid, type);
	}

	any LongTerm::toJava()
	{
	  return static_cast<long long>(longValue());
	}

	wstring LongTerm::toAtomName()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	  return Long::toString(longValue());
	}

	void LongTerm::toStringImpl(const int& printingFlags, StringBuilder* sb)
	{
	  sb->append(longValue());
	}

	bool LongTerm::equalsTerm(Term* obj, Comparator* comparator)
	{
	  if(!(obj->isLong()))
	  {
		  return false;
	  }
	  return longValue() == obj->asLongTerm()->longValue();
	}

	int LongTerm::termHashCodeImpl()
	{
	  long long n = static_cast<long long>(value);
	  return static_cast<int>(n ^ static_cast<long long>(static_cast<unsigned long long>(n) >> 32));
	  // return Long.hashCode(longValue());
	}

	int LongTerm::type()
	{
	  return TYPE_INTEGER;
	}
}
