#ifndef PROG
#define PROG

#include "Source.h"
#include "Runnable.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class KPTrail; }
namespace SxxMachine { class ObjectStack; }
namespace SxxMachine { class Clause; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }

namespace SxxMachine
{

	/**
	  Basic toplevel Prolog Engine. Loads and executes Prolog
	  programs and can be extended to spawn threads executing on new Prolog Engine
	  objects as well as networking threads and 
	  synced local and remote Linda transactions
	*/
	class Prog : public Source, public Runnable
	{
		// CONSTRUCTORS

	public:
		virtual ~Prog()
		{
			delete trail;
			delete orStack;
			delete parent;
		}

		Prog* toClone() override;

		Prog(KPTrail* trail, ObjectStack* orStack, Prog* parent);

		/**
		Creates a Prog starting execution with argument "goal" 
		*/
		Prog(Clause* goal, Prog* parent);

		// INSTANCE FIELDS

	private:
		KPTrail* trail;

		/**
		 * Contains Unfolders that may produce answers.
		 */
		ObjectStack* orStack;

		Prog* parent;

	public:
		KPTrail* getTrail();

		Prog* getParent();

		// CLASS FIELDS

		static int tracing;

		// INSTANCE METHODS

		/**
		 * Here is where actual LD-resolution computation happens.
		 * It consists of a chain of "unfolding" steps, possibly
		 * involving backtracking, which is managed by the OrStack.
		 */
		Term* getElement() override;

		void stop() override;

		/** 
		Computes a copy of the first solution X of Goal G.
		*/

		static Term* firstSolution(Term* X, Term* G);

		/**
		 * creates a new logic engine
		 */
		static Prog* new_engine(Term* X, Term* G);

		/** asks a logic engine to return a solution
		 */

		static Term* ask_engine(Prog* p);

		/** 
		 * usable for launching on a separate thread
		 */
		virtual void run();

	};
}


#endif	//#ifndef PROG
