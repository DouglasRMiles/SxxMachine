#ifndef FLUENT
#define FLUENT

#include "../../../machine/SxxMachine/SystemObject.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }

namespace SxxMachine
{

	/**
	 * A Fluent is a Prolog Object which has its own state, subject to changes over
	 * time.
	 * 
	 */
	class Fluent : public SystemObject
	{
	public:
		Fluent(Prog* p);

		Term* toClone() override;

		bool isFluent() override;

	private:
		bool persistent = false;

		/**
		 * Dynamically sets the persistence status of this Fluent. A persistent Fluent
		 * will not have its stop method outomatically called upon backtracking. A
		 * typical example would be a file or socket handle saved to the database to be
		 * reused after backtracking.
		 */
	public:
		virtual void setPersistent(const bool& persistent);

		/**
		 * returns true if this Fluent is persistent, false otherwise
		 */
		virtual bool getPersistent();

		/**
		 * Adds this Fluent to the parent Solver's trail, which will eventually call the
		 * undo method of the Fluent on backtracking.
		 */
	protected:
		virtual void trailMe(Prog* p);

	public:
		virtual void stop();

		/**
		 * applies a non-persistent Fluent's stop() method on backtracking
		 */
		void undo() override;
	};

}


#endif	//#ifndef FLUENT
