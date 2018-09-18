#ifndef UNFOLDER
#define UNFOLDER

#include "Source.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Clause; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class stop; }
namespace SxxMachine { class Term; }

namespace SxxMachine
{


	//!depends

	/**
	 * For a given clause g= A0:-<Guard>,A1,A2...,An, used as resolvent iterates
	 * over its possible unfoldings (LD-resolution steps) with clauses of the form
	 * B0:-B1,...,Bm in the default database. For each such step, a new clause
	 * (A0:-B1,...,Bm,A2...,An)mgu(A1,B0) is built and returned by the Unfolder's
	 * getElement method. Before the actual unfolding operations, builtins in Guard
	 * are executed, possibly providing bindings for some variables or failing. In
	 * case of failure of Guard or of unification, getElement() returns null.
	 */
	class Unfolder : public Source
	{
	public:
		virtual ~Unfolder()
		{
			delete e;
			delete goal;
			delete prog;
		}

		Unfolder(const int& oldtop, Iterator* e, Clause* goal, Prog* prog);
		Unfolder* toClone() override;

	private:
		int oldtop = 0;

//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings("rawtypes") private java.util.Iterator e;
		Iterator* e;

		Clause* goal;

		Prog* prog;

		/**
		 * Creates an Unfolder based on goal clause g for resolution step in program p.
		 * Iterator e is set to range over matching clauses in the database of program
		 * p.
		 */
	public:
		Unfolder(Clause* g, Prog* p);

		/**
		 * Overrides default trailing by empty action
		 */
	protected:
		void trailMe(Prog* p) override;

		/**
		 * Extracts an answer at the end of an AND-derivation
		 */
	public:
		virtual Clause* getAnswer();

		/**
		 * Checks if this clause is the last one, allowing LCO
		 */
		bool notLastClause();

		/**
		 * Reduces builtin functions after the neck of a clause, before a "real" atom is
		 * unfolded
		 */
		void reduceBuiltins();

		/**
		 * Returns a new clause by unfolding the goal with a matching clause in the
		 * database, or null if no such clause exists.
		 */
		Clause* getElement() override;

		/**
		 * Stops production of more alternatives by setting the clause enumerator to
		 * null
		 */
		void stop() override;

		/**
		 * Tracer on entering g
		 */
		void trace_goal(Clause* g);

		/**
		 * Tracer on exiting g
		 */
		void trace_failing(Clause* g);

		/**
		 * Tracer for undefined predicates
		 */
		void trace_nomatch(Term* first);

		/**
		 * Returns a string representation of this unfolder, based on the original
		 * clause it is based on.
		 */
		std::string pprint() override;

	};

}


#endif	//#ifndef UNFOLDER
