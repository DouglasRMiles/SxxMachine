#ifndef MAPTERM
#define MAPTERM

#include "SystemObject.h"
#include <string>
#include <vector>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class Trail; }
class StringBuilder;

namespace SxxMachine
{

	/**
	 * List.<br>
	 * The class <code>ListTerm</code> represents a list structure.<br>
	 * 
	 * <pre>
	 *  % [1,2]
	 *  Term Nil = SymbolTerm.makeSymbol("[]");
	 *  Term  n1 = IntegerTerm(1);
	 *  Term  n2 = IntegerTerm(2);
	 *  Term   t = TermData.CONS(n1, TermData.CONS(n2, Nil));
	 *  
	 *  Term car = ( t).car();
	 *  Term cdr = ( t).cdr();
	 * </pre>
	 *
	 * Here is sample program for creating a list from <code>1</code> to <code>n</code>.
	 * <pre>
	 * public static Term makeList(int n) {
	 *   Term t = SymbolTerm.makeSymbol("[]");
	 *   for (int i=n; i>0; i--) {
	 *     t = TermData.CONS(new IntegerTerm(i), t);
	 *   }
	 *   return t;
	 * }
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({"rawtypes","unused"}) public class MapTerm extends SystemObject
	class MapTerm : public SystemObject
	{
		/** A functor <code>'.' /2</code>. */
	protected:
		static SymbolTerm* const  SYM_DOT;

	private:
		bool immutable = false;
	public:
		bool isMap() override;
		bool isAtomicValue() override;

	  int containsTermImpl(Term* variableTerm, Comparator* comparison) override;

		/** Holds the first element of this <code>ListTerm</code>. */
		//private Term car;
		/**
		 * Holds the list consisting of all the rest of the elements of 
		 * this <code>ListTerm</code> but the first one.
		 */
		//private Term cdr;
		/**
		 * Constructs a new Prolog list structure
		 * such that <code>_car</code> is the first element of this list, and 
		 * <code>_cdr</code> is the list consisting of all the rest of the 
		 * elements of this list but the first one.
		 */
		MapTerm(Term* _car, Term* _cdr);
		/** Returns the value of <code>car</code>.
		 * @see #car
		 */
		Term* car() override final;
		Term* cdr() override;
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("unused") @Override public final boolean unifyImpl(Term t, Trail trail)
		bool unifyImpl(Term* t, Trail* trail) override final;


		/** Sets the value to <code>car</code>.
		 * @see #car
		 */
		virtual void setCar(Term* t);

		/** Sets the value to <code>cdr</code>.
		 * @see #cdr
		 */
		virtual void setCdr(Term* t);

		int type() override;

		/** 
		 * @return the <code>boolean</code> whose value is
		 * <code>convertible(List.class, type)</code>.
		 * @see Term#convertible(Class, Class)
		 */
		bool convertible(std::type_info type) override;
	protected:
		Term* copyImpl(IdentityHashMap<std::any, Term*>* copyHash, const int& deeply) override;
	public:
		bool isGround() override;

		int arity() override;
		std::vector<Term*> args() override;

		SymbolTerm* functor() override;

		std::string name() override final;
		Term* arg0(const int& nth) override;
		/** Returns the length of this <code>ListTerm</code>. */
		int length() override;
		/** 
		 * Returns a {@code java.util.List} corresponds to this <code>ListTerm</code>
		 * according to <em>Prolog Cafe interoperability with Java</em>.
		 * @return a {@link java.util.List} object equivalent to
		 * this <code>IntegerTerm</code>.
		 */
		std::vector toJava() override;

		/** Adds a string representation of this <code>ListTerm</code> to given StringBuilder instance.
		 * Non recursive implementation */
		virtual void toQuotedString_old(const int& printFlags, StringBuilder* sb);

	  void toStringImpl(const int& printingFlags, StringBuilder* sb) override;

		/* Object */
		/**
		 * Checks <em>term equality</em> of two terms.
		 * The result is <code>true</code> if and only if the argument is an instance of
		 * <code>ListTerm</code>, and 
		 * all corresponding pairs of elements in the two lists are <em>term-equal</em>.
		 * @param obj the object to compare with. This must be dereferenced.
		 * @return <code>true</code> if the given object represents a Prolog list
		 * equivalent to this <code>ListTerm</code>, false otherwise.
		 * @see #compareTo
		 */
		bool equalsTerm(Term* obj, Comparator* comparator) override;



		std::vector<Term*> const  argz;
		int termHashCodeImpl() override;

		Iterator<Term*>* iterator(const bool& includeSyntax) override;

		/**
		 * Iterator over terms that make up this ListTerm.
		 */
	private:
		class ListTermIterator : public Iterator<Term*>
		{
		private:
			static SymbolTerm* const  LEFT_BRACKET;
			static SymbolTerm* const  SEPARATOR;
			static SymbolTerm* const  RIGHT_BRACKET;
			static SymbolTerm* const  COMMA;


			Term* current;
			int index = 0;
			std::vector<Term*> tail;
			bool comma = false;
			bool first = true;
		  bool includeSyntax = false;


		public:
			virtual ~ListTermIterator()
			{
				delete current;
			}

			ListTermIterator(Term* start, const bool& includeSyntax);
			bool hasNext() override;
			Term* next() override;
		};
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
	public:
		int compareTo(Term* anotherTerm) override;
		bool isImmutable() override final;
		/**
		 * joins given term to the end of the list.
		 * Default implementation recreates the whole list and returns reference to new list,
		 * because the original list can be immutable.
		 * */ 
		MapTerm* join(Term* term) override;

		virtual MapTerm* joinToCopy(Term* term);


		virtual MapTerm* joinTo(Term* term);
		static MapTerm* MAP(Term* _car, Term* _cdr);
	};

}


#endif	//#ifndef MAPTERM
