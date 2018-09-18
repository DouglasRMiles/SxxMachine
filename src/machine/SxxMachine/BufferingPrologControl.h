#pragma once

#include "PrologControl.h"
#include <string>
#include <vector>
#include <limits>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class PrologMachineCopy;
	class arg;
}

namespace SxxMachine
{

	/**
	 * Executes Prolog on the current thread, buffering all solutions.
	 * <p>
	 * Whenever a solution is found for the predicate the arguments are deep-copied
	 * and buffered in a result collection.
	 */
//JAVA TO C++ CONVERTER TODO TASK: Most Java annotations will not have direct C++ equivalents:
//ORIGINAL LINE: @SuppressWarnings({"rawtypes","unchecked"}) public class BufferingPrologControl extends PrologControl
	class BufferingPrologControl : public PrologControl
	{
  private:
	  int resLimit = 0;
	  std::vector resBuffer;
	  bool engineStopped = false;
	  bool resSingle = false;
	  std::vector<Term*> resTemplate;
  public:
	  BufferingPrologControl();
	  BufferingPrologControl(PrologMachineCopy *pmc);
	  /**
	   * Initialize one or more packages in the interpreter.
	   *
	   * @param pkgs list of package names to initialize.
	   * @return true if initialization was successful.
	   */
	  virtual bool initialize(std::vector<std::string> &pkgs);
	  /**
	   * Determine if the predicate completes successfully.
	   *
	   * @param pkg package the functor is declared in. Typically "user".
	   * @param functor a prolog predicate to execute.
	   * @param args arguments to pass.
	   * @return true if the function has at least one solution; false otherwise.
	   */
	  bool execute(const std::string &pkg, const std::string &functor, std::vector<Term> &args) override;
	  /**
	   * Execute a function and return one solution.
	   *
	   * @param pkg package the functor is declared in. Typically "user".
	   * @param functor a prolog predicate to execute.
	   * @param arg argument to pass in, and template to return the result with. If
	   *        this is an {@link VariableTerm} the value will be saved and returned
	   *        on success. If this is a structure or list containing variables, the
	   *        variables will be materialized in the result.
	   * @return a deep copy of {@code arg} for the first solution; null on failure.
	   */
	  virtual Term *once(const std::string &pkg, const std::string &functor, Term *arg);
	  /**
	   * Execute a function and return one solution.
	   *
	   * @param pkg package the functor is declared in. Typically "user".
	   * @param functor a prolog predicate to execute.
	   * @param args argument to pass in, and template to return the result with. If
	   *        this is an {@link VariableTerm} the value will be saved and returned
	   *        on success. If this is a structure or list containing variables, the
	   *        variables will be materialized in the result.
	   * @return a deep copy of {@code args} for the first solution; null on
	   *         failure.
	   */
	  virtual std::vector<Term*> once(const std::string &pkg, const std::string &functor, std::vector<Term> &args);
	  /**
	   * Execute a function and return all solutions.
	   *
	   * @param pkg package the functor is declared in. Typically "user".
	   * @param functor a prolog predicate to execute.
	   * @param arg argument to pass in, and template to return the result with. If
	   *        this is an {@link VariableTerm} the value will be saved and returned
	   *        on success. If this is a structure or list containing variables, the
	   *        variables will be materialized in the result.
	   * @return a deep copy of {@code arg} for each solution found. Empty list if
	   *         there are no solutions.
	   */
	  virtual std::vector<Term*> all(const std::string &pkg, const std::string &functor, Term *arg);
	  /**
	   * Execute a function and return all solutions.
	   *
	   * @param pkg package the functor is declared in. Typically "user".
	   * @param functor a prolog predicate to execute.
	   * @param args argument to pass in, and template to return the result with. If
	   *        this is an {@link VariableTerm} the value will be saved and returned
	   *        on success. If this is a structure or list containing variables, the
	   *        variables will be materialized in the result.
	   * @return a deep copy of {@code args} for each solution found. Empty list if
	   *         there are no solutions.
	   */

	  virtual std::vector<std::vector<Term*>> all(const std::string &pkg, const std::string &functor, std::vector<Term> &args);
  private:
	  void setResultTemplate(Term *t);
	  void setResultTemplate(std::vector<Term*> &t);
	  /**
	   * Execute until the limit is reached.
	   *
	   * @param newLimit maximum number of results. Set to 1 if only a single
	   *        attempt is required.
	   * @return true if at least one result was discovered; false if there are no
	   *         solutions to the predicate.
	   */
	  bool run(int newLimit);
  public:
	  bool isEngineStopped() override;
  protected:
	  void success() override;
	  void fail() override;
	};

}
