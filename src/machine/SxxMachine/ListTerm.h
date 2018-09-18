#pragma once

#include "Nonvar.h"
#include <string>
#include <vector>
#include <stdexcept>
#include <any>
#include <typeinfo>
#include "exceptionhelper.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class Trail;
	class OpVisitor;
	class SymbolTerm;
}

namespace SxxMachine
{


//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({ "rawtypes", "unused" }) public abstract class ListTerm extends Nonvar
	class ListTerm : public Nonvar
	{
	public:
		Term *ArgNoDeRef(int i) override;

	protected:
		bool immutable = false;

	public:
		bool isCons() override;

		bool isAtomicValue() override;

		int containsTermImpl(Term *variableTerm, Comparator *comparison) override;

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
		ListTerm();

		ListTerm(Term *_car, Term *_cdr);

		/** Returns the value of <code>car</code>.
		 * @see #car
		 */
		Term *car() override;

		/** Returns the value of <code>cdr</code>.
		 * @see #cdr
		 */
		Term *cdr() override;

		/* Term */
		bool unifyImpl(Term *t, Trail *trail) override;

		/** Sets the value to <code>car</code>.
		 * @see #car
		 */
		virtual void setCar(Term *t);

		/** Sets the value to <code>cdr</code>.
		 * @see #cdr
		 */
		virtual void setCdr(Term *t);

		int type() override;

		/** 
		 * @return the <code>boolean</code> whose value is
		 * <code>convertible(List.class, type)</code>.
		 * @see Term#convertible(Class, Class)
		 */
		bool convertible(std::type_info type) override;

	protected:
		Term *copyImpl(IdentityHashMap<std::any, Term*> *copyHash, int deepCopy) override;

	public:
		bool isGround() override;

		int arity() override;

		std::vector<Term*> args() override;

		Term *functor() override;

		std::string name() override;

		Term *arg0(int nth) override;

		Term *nth0(int nth) override;

		/** Returns the length of this <code>ListTerm</code>. */
		int length() override;

		/** 
		 * Returns a {@code java.util.List} corresponds to this <code>ListTerm</code>
		 * according to <em>Prolog Cafe interoperability with Java</em>.
		 * @return a {@link java.util.List} object equivalent to
		 * this <code>IntegerTerm</code>.
		 */
		std::any toJava() override;

		/** Adds a string representation of this <code>ListTerm</code> to given StringBuilder instance.
		 * Non recursive implementation */
		virtual void toQuotedString_old(int printFlags, StringBuilder *sb);

		void toStringImpl(int printingFlags, StringBuilder *sb) override;

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
		bool equalsTerm(Term *obj, OpVisitor *comparator) override;

		std::vector<Term*> argz;

		int termHashCodeImpl() override;

		Iterator<Term*> *iterator(bool includeSyntax) override;

		/**
		 * Iterator over terms that make up this ListTerm. 
		 */
	public:
		class ListTermIterator : public Iterator<Term*>
		{
		private:
			static SymbolTerm *const LEFT_BRACKET;
			static SymbolTerm *const SEPARATOR;
			static SymbolTerm *const RIGHT_BRACKET;
			static SymbolTerm *const COMMA;

			Term *current;
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

			ListTermIterator(Term *start, bool includeSyntax);

			bool hasNext() override;

			Term *next() override;
		};

		/* Comparable */
		/** 
		 * Compares two terms in <em>Prolog standard order of terms</em>.<br>
		 * It is noted that <code>t1.compareTo(t2) == 0</code> has the same
		 * <code>boolean</code> value as <code>t1.equals(t2)</code>.
		 * @param otherterm the term to compared with. It must be dereferenced.
		 * @return the value <code>0</code> if two terms are identical; 
		 * a value less than <code>0</code> if this term is <em>before</em> the <code>otherterm</code>;
		 * and a value greater than <code>0</code> if this term is <em>after</em> the <code>otherterm</code>.
		 */
	public:
		int compareTo(Term *otherterm) override;

		bool isImmutable() override;

		/**
		 * adds given term to the end of the list.
		 * Default implementation recreates the whole list and returns reference to new list,
		 * because the original list can be immutable.
		 * */
		ListTerm *add(Term *term) override;

		virtual ListTerm *addToCopy(Term *term);

		ListTerm *append(Term *term) override;
	};

}
