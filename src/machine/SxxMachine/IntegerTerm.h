#ifndef INTEGERTERM
#define INTEGERTERM

#include "LongTerm.h"
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
class StringBuilder;

namespace SxxMachine
{


	/**
	 * Integer.<br>
	 * The class <code>IntegerTerm</code> wraps a value of primitive type 
	 * <code>int</code>. 
	 * <pre>
	 *   Term t = new IntegerTerm(100);
	 *   int i = t.asIntegerlTerm().intValue();
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class IntegerTerm : public LongTerm
	{
		/** Holds an <code>int</code> value that this <code>IntegerTerm</code> represents. */
	  //  protected final int intValue();
	public:
		bool isInteger() override;
		bool isLong() override;

		  bool unifyInt(const int& i, Trail* trail) override;


		/** Constructs a new Prolog integer that represents the specified <code>int</code> value. */
		IntegerTerm(const int& i);
		/**
		 * Returns the value of <code>intValue()</code>.
		 * @see #intValue()
		 */
		std::any value() override;
		/* Term */
		bool unifyImpl(Term* t, Trail* trail) override;
		/** 
		 * @return the <code>boolean</code> whose value is
		 * <code>convertible(Integer.class, type)</code>.
		 * @see Term#convertible(Class, Class)
		 */
		bool convertible(std::type_info type) override;
		std::string name() override;
		/** 
		 * Returns a <code>java.lang.Integer</code> corresponds to this <code>IntegerTerm</code>
		 * according to <em>Prolog Cafe interoperability with Java</em>.
		 * @return a <code>java.lang.Integer</code> object equivalent to
		 * this <code>IntegerTerm</code>.
		 */
		std::any toJava() override;
		std::string toAtomName() override;
		void toStringImpl(const int& printFlags, StringBuilder* sb) override;
		/**
		 * Checks <em>term equality</em> of two terms.
		 * The result is <code>true</code> if and only if the argument is an instance of
		 * <code>IntegerTerm</code> and has the same <code>int</code> value as this object.
		 * @param obj the object to compare with. This must be dereferenced.
		 * @return <code>true</code> if the given object represents a Prolog integer 
		 * equivalent to this <code>IntegerTerm</code>, false otherwise.
		 * @see #compareTo
		*/
		bool equalsTerm(Term* obj, Comparator* comparator) override;
		int termHashCodeImpl() override;
		int compareTo(Term* anotherTerm) override;
		/* NumberTerm */
		//@Override
		//public int intValue() { return this.intValue(); }
		//@Override
		//public long longValue() { return (this.intValue()); }
		//@Override
	  //  public double doubleValue() { return (this.intValue()); }
	   // @Override
	  int arithCompareTo(NumberTerm* t) override;
		NumberTerm* abs() override;
		NumberTerm* acos() override;
		NumberTerm* add(NumberTerm* t) override;
		/** 
		 * @exception IllegalTypeException if the given argument
		 * <code>NumberTerm</code> is a floating point number.
		 */
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
		/** 
		 * @exception EvaluationException if this object represents <coe>0</code>.
		 */
		NumberTerm* log() override;
		NumberTerm* max(NumberTerm* t) override;
		NumberTerm* min(NumberTerm* t) override;
		/** 
		 * @exception IllegalTypeException if the given argument
		 * <code>NumberTerm</code> is a floating point number.
		 * @exception EvaluationException if the given argument
		 * <code>NumberTerm</code> represents <coe>0</code>.
		 */
		NumberTerm* mod(NumberTerm* t) override;
		NumberTerm* multiply(NumberTerm* t) override;
		NumberTerm* negate() override;
		NumberTerm* not() override;
		NumberTerm* or(NumberTerm* t) override;
		NumberTerm* pow(NumberTerm* t) override;
		NumberTerm* rint() override;
		NumberTerm* round() override;
		NumberTerm* shiftLeft(NumberTerm* t) override;
		/** 
		 * @exception IllegalTypeException if the given argument
		 * <code>NumberTerm</code> is a floating point number.
		 */
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
	private:
		void must_be_int(NumberTerm* t);
	//    public NumberTerm Float(double n) {
	//      return new DoubleTerm(n);
	//    }
	public:
		virtual NumberTerm* Integer(long long n);
		int type() override;
	};

}


#endif	//#ifndef INTEGERTERM
