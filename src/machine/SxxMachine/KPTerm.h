#ifndef KPTERM
#define KPTERM

#include "Undoable.h"
#include "TermData.h"
#include <string>
#include <stdexcept>
#include <any>
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class KPTrail; }
namespace SxxMachine { class Clause; }
namespace SxxMachine { class numbervars; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Nonvar; }
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Var; }
namespace SxxMachine { class Source; }
class StringBuilder;

namespace SxxMachine
{

	/**
	 * Top element of the Prolog term hierarchy. Describes a simple or compound ter
	 * like: X,a,13,f(X,s(X)),[a,s(X),b,c], a:-b,c(X,X),d, etc.
	 */
	class KPTerm : public TermData, public Undoable
	{

	public:
		virtual void oopsy();

		static void soopsy();

		virtual Term* toClone() = 0;

		int hashCode() override;

		virtual bool equals(std::any o);

		std::string toString() override;

		virtual int termHashCode() = 0;

		/**
		 * returns or fakes an arity for all subtypes
		 */
		virtual int arityOrType() = 0;

		/**
		 * Dereferences if necessary. If multi-threaded, this should be synchronized
		 * otherwise vicious non-reentrancy problems may occur in the presence of GC and
		 * heavy multi-threading!!!
		 */
		virtual Term* dref();

		virtual bool bind(Term* that, KPTrail* trail) = 0;

		/** Unify dereferenced */
		virtual bool Unify_TO(Term* that, KPTrail* trail) = 0;

		/** Dereference and unify_to */
		bool DO_Unify(Term* that, KPTrail* trail);

		void undo() override;

		// public abstract boolean eq(Term that);

		virtual Term* carTokenOrSelf();

		virtual Term* toTerm();

		virtual Clause* toClause();

		virtual bool isClause();

		static Term* fromString(const std::string& s);

		/**
		 * Tests if this term unifies with that. Bindings are trailed and undone after
		 * the test. This should be used with the shared term as this and the new term
		 * as that. Synchronization makes sure that side effects on the shared term are
		 * not interfering, i.e as in: SHARED.matches(NONSHARED,trail).
		 * 
		 */
		// synchronized
		virtual bool matches(Term* that);

		virtual bool matches(Term* that, KPTrail* trail);

		/**
		 * Returns a copy of the result if the unification of this and that. Side
		 * effects on this and that are undone using trailing of bindings..
		 * Synchronization happens over this, not over that. Make sure it is used as
		 * SHARED.matching_copy(NONSHARED,trail).
		 */
		// synchronized

		virtual Term* matching_copy(Term* that);

		/**
		 * Defines the reaction to an agent recursing over the structure of a term.
		 * <b>This</b> is passed to the agent and the result of the action is returned.
		 * Through overriding, for instance, a Fun term will provide the recursion over
		 * its arguments, by applying the action to each of them.
		 * 
		 * @see StructureTerm
		 */
		virtual Term* reaction(Term* agent);

		/**
		 * Identity action.
		 */
		virtual Term* action(Term* that);

		/**
		 * Returns a copy of a term with variables standardized apart (`fresh
		 * variables').
		 */
		// synchronized
		virtual Term* copy();

		/**
		 * Returns '[]'(V1,V2,..Vn) where Vi is a variable occuring in this Term
		 */
		virtual Term* varsOf();

		/**
		 * Replaces variables with uppercase constants named `V1', 'V2', etc. to be read
		 * back as variables.
		 */
		virtual Term* numbervars();

		/**
		 * Prints out a term to a String with variables named in order V1, V2,....
		 */
		virtual std::string toUnquoted();

		/*
		 * Returns an unquoted version of toString()
		 */
		virtual std::string pprint() = 0;

		/**
		 * Returns a string key used based on the string name of the term. Note that the
		 * key for a clause AL-B,C. is the key insted of ':-'.
		 */
		virtual std::string getKey();

		/**
		 * Java Object wrapper. In particular, it is used to wrap a Thread to hide it
		 * inside a Prolog data object.
		 */
		virtual std::any toObject();

		/*
		 * Just to catch the frequent error when the arg is forgotten while definig a
		 * builtin. Being final, it will generate a compile time error if this happens
		 */
		int exec();

		/**
		 * Executed when a builtin is called. Needs to be overriden. Returns a run-time
		 * warning if this is forgotten.
		 */

		virtual int exec(Prog* p);

		static Nonvar* stringToChars(const std::string& s);

		virtual Nonvar* toChars();

		/**
		 * Converts a list of character codes to a String.
		 */
		static std::string charsToString(Nonvar* Cs);

		virtual bool isCons();

		virtual bool isNil();

		virtual bool isBuiltin();

		virtual bool isConj();

		virtual bool isLong();

		virtual int intValue();

		virtual bool isConst();

		virtual bool isStructure();

		virtual bool isTrueProc();

		virtual bool isNumber();

		virtual std::string name() = 0;

		virtual bool isFloat();

		virtual bool isSystemObject();

		virtual bool isFluent();

		virtual bool isObject();

		virtual bool isVar();

		virtual bool isCharReader();

		virtual Term* toValue();

		virtual double doubleValue();

		virtual bool equalsTerm(Term* aneof) = 0;

		SymbolTerm* asConst();

		virtual Var* toVar();

		virtual Term* ArgDeRef(const int& i);

		virtual bool isFunctor(const std::string& string);

		virtual Source* asSource();

	protected:
		virtual void toStringImpl(const int& printFlags, StringBuilder* sb) = 0;
	};

}


#endif	//#ifndef KPTERM
