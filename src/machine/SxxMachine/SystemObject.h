#pragma once

#include "Nonvar.h"
#include <string>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Trail;
	class Term;
	class OpVisitor;
}

namespace SxxMachine
{

	/**
	 * A SystemObject is a Nonvar with system assigned name
	 * 
	 */
	class SystemObject : public Nonvar
	{
  public:
	  int type() override;

	  bool unifyImpl(Term *t, Trail *trail) override;


	  /** Adds a string representation of this <code>SystemObject</code> to given StringBuilder instance */
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

	  bool isImmutable() override;

	  /**
	   * Checks <em>term equality</em> of two terms.
	   * The result is <code>true</code> if and only if the argument is an instance of
	   * <code>SystemObject</code>, and 
	   * the pairs of goals in the two closures are <em>equal</em>.
	   * @param obj the object to compare with. This must be dereferenced.
	   * @return <code>true</code> if the given object represents a closure
	   * equivalent to this <code>SystemObject</code>, false otherwise.
	   * @see #compareTo
	   */

	  bool equalsTerm(Term *obj, OpVisitor *comparator) override;

		Term *toClone() override;

		int termHashCodeImpl() override;

		bool isSystemObject() override;

		static long long ctrSO;

	private:
		long long ordinal = 0;

	public:
		SystemObject();

		std::string name() override;

		virtual std::string qname();

		virtual bool bind(Term *that, Trail *trail);

		std::string pprint() override;

		int arityOrType() final override;
	};

}
