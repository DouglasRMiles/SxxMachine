#ifndef LONGTERM
#define LONGTERM

#include "DoubleTerm.h"
#include <string>
#include <cmath>
#include <any>
#include <typeinfo>
#include <optional>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class KPTrail; }
namespace SxxMachine { class NumberTerm; }
namespace SxxMachine { class Trail; }
class StringBuilder;

namespace SxxMachine
{


	class LongTerm : public DoubleTerm
	{
  public:
	  bool isLong() override;

	  bool isFloat() override;
	  bool isDouble() override;

	  // protected final long value;
	  LongTerm(long long value);

	  LongTerm(BigInteger* bigInteger);

	std::any value() override;

	  bool bind(Term* that, KPTrail* trail) override;

	  int arityOrType() final override;

	  int compareTo(Term* anotherTerm) override;

	  int intValue() override;

	  long long longValue() override;

	  double doubleValue() override;

	  int arithCompareTo(NumberTerm* t) override;

	  NumberTerm* abs() override;

	  NumberTerm* acos() override;

	  NumberTerm* add(NumberTerm* t) override;

	  NumberTerm* and(NumberTerm* t) override;

	  NumberTerm* asin() override;

	  NumberTerm* atan() override;

	  NumberTerm* ceil() override;

	  NumberTerm* cos() override;

	  NumberTerm* divide(NumberTerm* t) override;

	  NumberTerm* exp() override;

	  NumberTerm* floatIntPart() override;

	  NumberTerm* floatFractPart() override;

	  NumberTerm* floor() override;

	  NumberTerm* intDivide(NumberTerm* t) override;

	  NumberTerm* log() override;

	  NumberTerm* max(NumberTerm* t) override;

	  NumberTerm* min(NumberTerm* t) override;

	  NumberTerm* mod(NumberTerm* t) override;

	  NumberTerm* multiply(NumberTerm* t) override;

	  NumberTerm* negate() override;

	  NumberTerm* not() override;

	  NumberTerm* or(NumberTerm* t) override;

	  NumberTerm* pow(NumberTerm* t) override;

	  NumberTerm* rint() override;

	  NumberTerm* round() override;

	  NumberTerm* shiftLeft(NumberTerm* t) override;

	  NumberTerm* shiftRight(NumberTerm* t) override;

	  NumberTerm* signum() override;

	  NumberTerm* sin() override;

	  NumberTerm* sqrt() override;

	  NumberTerm* subtract(NumberTerm* t) override;

	  NumberTerm* tan() override;

	  NumberTerm* toDegrees() override;

	  NumberTerm* toFloat() override;

	  NumberTerm* toRadians() override;

	  NumberTerm* truncate() override;

	  NumberTerm* xor(NumberTerm* t) override;

	  bool unifyImpl(Term* t, Trail* trail) override;

	  std::string name() override;

	  bool convertible(std::type_info type) override;

	  std::any toJava() override;

	  std::string toAtomName() override;

	  void toStringImpl(const int& printingFlags, StringBuilder* sb) override;

	  bool equalsTerm(Term* obj, Comparator* comparator) override;

	  int termHashCodeImpl() override;

	  int type() override;
	};

}


#endif	//#ifndef LONGTERM
