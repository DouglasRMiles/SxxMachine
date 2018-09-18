#ifndef CLAUSE
#define CLAUSE

#include "../../../machine/SxxMachine/StructureTerm.h"
#include <string>
#include <vector>
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class HashDict; }
namespace SxxMachine { class KPTrail; }
class CloneNotSupportedException;

namespace SxxMachine
{


	//!depends
	/**
	 * Datatype for a Prolog clause (H:-B) having a head H and a body b
	 */
	class Clause : public StructureTerm
	{
	public:
		virtual ~Clause()
		{
			delete dict;
		}

		Clause(Term* s, std::vector<Term*>& args, HashDict* dict, const bool& ground, const std::string& fname, const int& begins_at, const int& ends_at);
		Clause* toClone() override;
		/**
		 * Builds a clause given its head and its body
		 */
		Clause(Term* head, Term* body);

		/**
		 * Constructs a clause by parsing its string representation. Note the building
		 * of a dictionary of variables, allowing listing of the clause with its
		 * original variable names.
		 */
		Clause(const std::string& s);

		/**
		 * Extracts a clause from its String representation.
		 */

		static Clause* clauseFromString(const std::string& s);

		/**
		 * Reads a goal as a clause containing a dummy header with all variables in it
		 */

		virtual Clause* toGoal();

		static Clause* goalFromString(const std::string& line);

		/**
		 * Detects that a clause is ground (i.e. has no variables)
		 */
		void checkIfGround();

		/**
		 * Variable dictionary
		 */
		HashDict* dict = nullptr;

		/**
		 * Remembers if a clause is ground.
		 */
		bool ground = false;

		/**
		 * File name and line where sources start and end (if applicable)
		 */

		std::string fname = "";

		int begins_at = 0;

		int ends_at = 0;

		virtual void setFile(const std::string& fname, const int& begins_at, const int& ends_at);

		/**
		 * Checks if a Clause has been proven ground after beeing read in or created.
		 */
		bool provenGround();

		/**
		 * Prints out a clause as Head:-Body
		 */
	private:
		std::string Clause2String(Clause* c);

		// uncomment if you want this to be the default toString
		// procedure - it might create read-back problems, though
		// public String toString() {
		// return Clause2String(this);
		// }

		/**
		 * Pretty prints a clause after replacing ugly variable names
		 */
	public:
		std::string pprint() override;

		/**
		 * Pretty prints a clause after replacing ugly variable names
		 */
		virtual std::string pprint(const bool& replaceAnonymous);

		/**
		 * Clause to Term converter: the joy of strong typing:-)
		 */
		Clause* toClause() override;

		/**
		 * Replaces varibles with nice looking upper case constants for printing
		 * purposes
		 */
		// synchronized
		virtual Clause* cnumbervars(const bool& replaceAnonymous);

		/**
		 * Converts a clause to a term. Note that Head:-true will convert to the term
		 * Head.
		 */
		Term* toTerm() final override;

		/**
		 * Creates a copy of the clause with variables standardized apart, i.e.
		 * something like f(s(X),Y,X) becomes f(s(X1),Y1,X1)) with X1,Y1 variables
		 * garantted not to occurring in the the current resolvant.
		 */
		Clause* ccopy();

		/**
		 * Extracts the head of a clause (a Term).
		 */
		Term* getHead();

		/**
		 * Extracts the body of a clause
		 */
		Term* getBody();

		/**
		 * Gets the leftmost (first) goal in the body of a clause, i.e. from
		 * H:-B1,B2,...,Bn it will extract B1.
		 */
		Term* getFirst();

		/**
		 * Gets all but the leftmost goal in the body of a clause, i.e. from
		 * H:-B1,B2,...,Bn it will extract B2,...,Bn. Note that the returned Term is
		 * either Conj or True, the last one meaning an empty body.
		 * 
		 * @see True
		 * @see Conj
		 */
		Term* getRest();

		/**
		 * Concatenates 2 Conjunctions
		 * 
		 * @see Clause#unfold
		 */
		static Term* appendConj(Term* x, Term* y);

		/**
		 * Algebraic composition operation of 2 Clauses, doing the basic resolution step
		 * Prolog is based on. From A0:-A1,A2...An and B0:-B1...Bm it builds
		 * (A0:-B1,..Bm,A2,...An) mgu(A1,B0). Note that it returns null if A1 and B0 do
		 * not unify.
		 * 
		 * @see Term#unify()
		 * 
		 */
	private:
		Clause* unfold(Clause* const that, KPTrail* trail);

		// synchronized
	public:
		Clause* unfold_with_goal(Clause* goal, KPTrail* trail);

		/*
		 * // synchronized final Clause unfoldedCopy(Clause that,Trail trail) { int
		 * oldtop=trail.size(); Clause result=unfold(that,trail); if(result==null)
		 * return null; result=result.ccopy(); trail.unwind(oldtop); return result; }
		 */

		/**
		 * Returns a key based on the principal functor of the head of the clause and
		 * its arity.
		 */
		std::string getKey() final override;

		bool isClause() final override;
	};

}


#endif	//#ifndef CLAUSE
