#ifndef DOUBLETERM
#define DOUBLETERM

#include "NumberTerm.h"
#include <string>
#include <cmath>
#include <any>
#include <typeinfo>
#include <optional>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Trail; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class NumberTerm; }
namespace SxxMachine { class IllegalTypeException; }
namespace SxxMachine { class LongTerm; }
class StringBuilder;

namespace SxxMachine
{


	/**
	 * Floating point number.
	 * The class <code>DoubleTerm</code> wraps a value of 
	 * primitive type <code>double</code>.
	 *
	 * <pre>
	 * Term t = Float(3.3333);
	 * double d = (t).doubleValue();
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	*/
	class DoubleTerm : public NumberTerm
	{

  public:
	  int arityOrType() override;

		bool isDouble() override;
		/** Holds a <code>double</code> value that this <code>DoubleTerm</code> represents. */
	   // protected final double value;
		/**
		 * Constructs a new Prolog floating point number 
		 * that represents the specified <code>double</code> value.
		 */
		DoubleTerm(const double& i);
		/**
		 * Returns the value of <code>value</code>.
		 * @see #value
		 */
		virtual std::any value();

		int type() override;

		bool unifyImpl(Term* t, Trail* trail) override;

		std::string name() override;
		bool convertible(std::type_info type) override;
		std::any toJava() override;
		std::string toAtomName() override;
		void toStringImpl(const int& printFlags, StringBuilder* sb) override;
		/**
		 * Checks <em>term equality</em> of two terms.
		 * The result is <code>true</code> if and only if the argument is an instance of
		 * <code>DoubleTerm</code> and has the same <code>double</code> value as this object.
		 * @param obj the object to compare with. This must be dereferenced.
		 * @return <code>true</code> if the given object represents a Prolog floating
		 * point number equivalent to this <code>DoubleTerm</code>, false otherwise.
		 * @see #compareTo
		*/
		bool equalsTerm(Term* obj, Comparator* comparator) override;
		int termHashCodeImpl() override;
		/* Comparable */
		/** 
		 * Compares two terms in <em>Prolog standard order of terms</em>.<br>
		 * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
		 * <code>boolean</code> value as <code>t1.equals(t2)</code>.
		 * @param anotherTerm the term to compared with. It must be dereferenced.
		 * @return the value <code>0</code> if two terms are identical; 
		 * a value less than <code>0</code> if this term is <em>before</em> the <code>anotherTerm</code>;
		 * and a value greater than <code>0</code> if this term is <em>after</em> the <code>anotherTerm</code>.
		 */
		int compareTo(Term* anotherTerm) override;
		/* NumberTerm */
		int intValue() override;
		long long longValue() override;
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

	//    public NumberTerm Float(double n) {
	//      return new DoubleTerm(n);
	//    }
		virtual DoubleTerm* Float(long long n);

		NumberTerm* truncate() override;
		/** 
		 * Throws a <code>type_error</code>.
		 * @exception IllegalTypeException
		 */
		NumberTerm* xor(NumberTerm* t) override;

	private:
		IllegalTypeException* mustInt();
		LongTerm* Integer(long long round);

	public:
		bool isFloat() override;
	};

}


#endif	//#ifndef DOUBLETERM
