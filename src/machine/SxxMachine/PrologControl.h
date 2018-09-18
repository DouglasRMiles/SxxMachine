#pragma once

#include "Operation.h"
#include "Prolog.h"
#include <string>
#include <vector>
#include <stdexcept>
#include <any>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prolog;
	class PrologMachineCopy;
	class PrologClassLoader;
	class Operation;
	class Term;
	class PrologException;
	class JavaInterruptedException;
	class PrologLogger;
}

namespace SxxMachine
{



	/**
	 * Tracks current evaluation goal and results.
	 * <p>
	 * On success/1 or fail/1 the corresponding methods in this class are invoked,
	 * allowing the implementation to message the results to the application. During
	 * any reduction loops the {@link #isEngineStopped()} method is consulted to
	 * determine if the loop should terminate.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.2
	 */
	class PrologControl
	{
	  /** Holds a Prolog engine. */
  protected:
	  Prolog *const engine;
	  /** Holds a Prolog goal to be executed. */
	  Operation code;

	  /** How many operations can be executed before exceeding cost limit. */
  private:
	  long long reductionLimit = 1 << 20;
	  long long reductionsUsed = 0;

	  InputStream *userInput = System::in;
	  PrintStream *userOuput = System::out;

	  PrintStream *userError = System::err;

	  /** Constructs a new <code>PrologControl</code>. */
  public:
	  virtual ~PrologControl()
	  {
		  delete engine;
		  delete userInput;
		  delete userOuput;
		  delete userError;
	  }

	  PrologControl();

	  /** Constructs a new <code>PrologControl</code>. */
	  PrologControl(PrologMachineCopy *pmc);
	  PrologControl(Prolog *pmc);

	  virtual bool isEnabled(Prolog::Feature f);

	  virtual void setEnabled(Prolog::Feature f, bool on);

	  virtual void setEnabled(Set<Prolog::Feature> *f, bool on);

	  /** @param err stack trace to print (or log). */
	  virtual void printStackTrace(std::runtime_error err);

	  virtual void setUserInput(InputStream *userInput);

	  virtual void setUserOuput(PrintStream *userOuput);

	  virtual int getMaxDatabaseSize();

	  virtual void setMaxDatabaseSize(int size);

	  virtual PrologClassLoader *getPrologClassLoader();

	  virtual void setPrologClassLoader(PrologClassLoader *cl);

	  virtual int getMaxArity();

	  virtual void setMaxArity(int max);

	  /**
	   * Registers {@code user_input}, {@code user_output}, and {@code user_error}
	   * streams.
	   */
	  virtual void configureUserIO(InputStream *in_Renamed, OutputStream *out, OutputStream *err);

	  /**
	   * Sets a goal and its arguments to this Prolog thread. An initial
	   * continuation goal (a <code>Success</code> object) is set to the
	   * <code>cont</code> field of goal <code>p</code> as continuation.
	   */
	  virtual void setPredicate(Operation operation);

	  /**
	   * Sets a goal <code>call(t)</code> to this Prolog thread. An initial
	   * continuation goal (a <code>Success</code> object) is set to the
	   * <code>cont</code> field of goal <code>p</code> as continuation.
	   */
	  virtual void setPredicate(const std::string &pkg, const std::string &functor, std::vector<Term> &args);


	  /**
	   * Sets a goal <code>call(t)</code> to this Prolog thread. An initial
	   * continuation goal (a <code>Success</code> object) is set to the
	   * <code>cont</code> field of <code>call(t)</code> as continuation.
	   */
	  virtual void setPredicate(Term *t);

	  /**
	   * Is invoked when the system succeeds to find a solution.<br>
	   *
	   * This method is invoked from the initial continuation goal (a
	   * <code>Success</code> object).
	   */
  protected:
	  virtual void success() = 0;

	  /** Is invoked after failure of all trials. */
	  virtual void fail() = 0;

	  /**
	   * Check if evaluation should continue.
	   * <p>
	   * This method gets invoked on every predicate reduction. If the control class
	   * wants to halt execution (for example sufficient results were obtained, or a
	   * limit on running time or reduction count has been reached) the method must
	   * return true to stop execution.
	   *
	   * @return true if the engine is no longer supposed to execute; false if
	   *         another predicate reduction can take place.
	   */
  public:
	  virtual bool isEngineStopped() = 0;

	  /**
	   * Execute the predicate on the current thread.
	   * <p>
	   * This method does not return until {@link #isEngineStopped()} returns true.
	   * Implementors of the class are expected to invoke this method to perform
	   * evaluation, and terminate out of the loop at the proper time based on an
	   * invocation to {@link #success()} or {@link #fail()}.
	   *
	   * @throws PrologException
	   * @throws JavaInterruptedException
	   */
  protected:
	  virtual void executePredicate();
	  //@SuppressWarnings("null")
  public:
	  virtual void executePredicate(bool isOutter) throw(PrologException, JavaInterruptedException);

	  virtual bool execute(const std::string &pkg, const std::string &functor, std::vector<Term> &args) = 0;

  private:
	  Operation insertPendingGoals(Operation after);

	  Operation insertCode(Term *pendingGoals, Operation after);

  protected:
	  virtual void executePredicate_goog() throw(PrologException);

	  /** @return number of reductions used by execution. */
  public:
	  virtual long long getReductions();

	  /** Applies an upper limit on number of reductions. */
	  virtual void setReductionLimit(long long limit);

	  virtual void setUserError(PrintStream *userError);

	  virtual std::any getExternalData(const std::string &key);

	  virtual void setExternalData(const std::string &key, std::any value);
	   virtual PrologLogger *getLogger();
	};

}
