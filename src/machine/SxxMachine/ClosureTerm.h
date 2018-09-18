#pragma once

#include "SystemObject.h"
#include <string>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Predicate;
	class Trail;
	class Term;
	class OpVisitor;
}

namespace SxxMachine
{

	/**
	 * Closure.<br>
	 * The class <code>ClosureTerm</code> represents a closure structure.<br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class ClosureTerm : public SystemObject
	{
		/** Holds a <code>Predicate</code> object that represents a Prolog goal. */
	protected:
		Predicate *const code;
	public:
		virtual ~ClosureTerm()
		{
			delete code;
		}

		bool isClosure() override;
		/** Constructs a new closure structure for the given Prolog goal. */
		ClosureTerm(Predicate *_code);
		/** Returns the Prolog goal of this <code>ClosureTerm</code>. */
		virtual Predicate *getCode();

		int type() override;

		bool unifyImpl(Term *t, Trail *trail) override;

		std::string name() override;
		bool equalsTerm(Term *obj, OpVisitor *comparator) override;
		int termHashCodeImpl() override;

		/** Adds a string representation of this <code>ClosureTerm</code> to given StringBuilder instance */
		void toStringImpl(int printFlags, StringBuilder *sb) override;
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
		int compareTo(Term *anotherTerm) override;
		bool isImmutable() override final;
	};

}
