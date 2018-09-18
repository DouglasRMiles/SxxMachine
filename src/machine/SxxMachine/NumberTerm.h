#pragma once

#include "Nonvar.h"
#include <string>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class KPTrail;
}

namespace SxxMachine
{

	/**
	 * The superclass of classes for integers and floating point numbers.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class NumberTerm : public Nonvar
	{

	public:
		NumberTerm *toClone() override;
		int termHashCodeImpl() override;

		bool isFloat() = 0 override;

		double value = 0;

		std::string name() = 0 override;

		bool bind(Term *that, KPTrail *trail) override;

		int arityOrType() = 0 override;

		double doubleValue() override;

		std::string pprint() override;
	  NumberTerm *functor() override;

	  std::string toAtomName() = 0 override;
  protected:
	  void toStringImpl(int printFlags, StringBuilder *sb) override;

	public:
		bool isNumber() override;
		bool isNonvar() override;
		/** Returns the numeric value represented by this object after conversion to type <code>int</code>. */
		int intValue() = 0 override;
		/** Returns the numeric value represented by this object after conversion to type <code>long</code>. */
		long long longValue() = 0; override override;
		/** Returns the numeric value represented by this object after conversion to type <code>double</code>. */
		//abstract public double doubleValue();
		/** 
		 * Compares two <code>NumberTerm</code> objects numerically.
		 * @param t the <code>NumberTerm</code> to compare with.
		 * @return the value <code>0</code>
		 * if this object is numerically equal to the argument <code>NumberTerm</code>;
		 * a value less than <code>0</code>
		 * if this object is numerically less than the argument <code>NumberTerm</code>; and
		 * a value greater than <code>0</code>
		 * if this object is numerically greater than the argument <code>NumberTerm</code>.
		 */
		virtual int arithCompareTo(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>abs(this)</code>. */
		virtual NumberTerm *abs() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>acos(this)</code>. */
		virtual NumberTerm *acos() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this + t)</code>. */
		virtual NumberTerm *add(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this &amp; t)</code>. */
		virtual NumberTerm *and(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>asin(this)</code>. */
		virtual NumberTerm *asin() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>tan(this)</code>. */
		virtual NumberTerm *atan() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>ceil(this)</code>. */
		virtual NumberTerm *ceil() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>cos(this)</code>. */
		virtual NumberTerm *cos() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this / t)</code>. */
		virtual NumberTerm *divide(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>exp(this)</code>. */
		virtual NumberTerm *exp() = 0;
		/** Returns a <code>NumberTerm</code> whose value is the float-integer-part of <code>this</code>. */
		virtual NumberTerm *floatIntPart() = 0;
		/** Returns a <code>NumberTerm</code> whose value is the float-fractional-part of <code>this</code>. */
		virtual NumberTerm *floatFractPart() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>floor(this)</code>. */
		virtual NumberTerm *floor() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(int)(this / t)</code>. */
		virtual NumberTerm *intDivide(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>log(this)</code>. */
		virtual NumberTerm *log() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>max(this, t)</code>. */
		virtual NumberTerm *max(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>min(this, t)</code>. */
		virtual NumberTerm *min(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this mod t)</code>. */
		virtual NumberTerm *mod(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this * t)</code>. */
		virtual NumberTerm *multiply(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(- this)</code>. */
		virtual NumberTerm *negate() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(~ this)</code>. */
		virtual NumberTerm *not() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this | t)</code>. */
		virtual NumberTerm *or(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this<sup>t</sup>)</code>. */
		virtual NumberTerm *pow(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>rint(this)</code>. */
		virtual NumberTerm *rint() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>round(this)</code>. */
		virtual NumberTerm *round() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this &lt;&lt; t)</code>. */
		virtual NumberTerm *shiftLeft(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this &gt;&gt; t)</code>. */
		virtual NumberTerm *shiftRight(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>signum(this)</code>. */
		virtual NumberTerm *signum() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>sin(this)</code>. */
		virtual NumberTerm *sin() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>sqrt(this)</code>. */
		virtual NumberTerm *sqrt() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this - t)</code>. */
		virtual NumberTerm *subtract(NumberTerm *t) = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>tan(this)</code>. */
		virtual NumberTerm *tan() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>toDegrees(this)</code>. */
		virtual NumberTerm *toDegrees() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(double)(this)</code>. */
		virtual NumberTerm *toFloat() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>toRadians(this)</code>. */
		virtual NumberTerm *toRadians() = 0;
		/** Returns a <code>NumberTerm</code> whose value is the truncate of <code>this</code>. */
		virtual NumberTerm *truncate() = 0;
		/** Returns a <code>NumberTerm</code> whose value is <code>(this ^ t)</code>. */
		virtual NumberTerm *xor(NumberTerm *t) = 0;
		bool isImmutable() override final;
	};

}
