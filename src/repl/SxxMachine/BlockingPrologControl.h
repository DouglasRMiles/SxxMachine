#pragma once

#include "../../machine/SxxMachine/PrologControl.h"
#include <string>
#include <vector>
#include <stdexcept>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prolog;
	class PrologMachineCopy;
	class Term;
	class Predicate;
	class stop;
}

namespace SxxMachine
{

	/**
	 * Prolog thread.<br>
	 * The <code>BlockingPrologControl</code> class is an implementation of
	 * <em>Prolog Box Control Flow Model</em>.<br>
	 * This <code>BlockingPrologControl</code> provides methods
	 * for both sequential and parallel execution.
	 *
	 * <pre>
	 * // An example of sequential execution
	 * // calls a goal <code>father(abraham, X)</code> and get all solutions.
	 * PrologControl p = new PrologControl();
	 * Predicate code = new PRED_father_2();
	 * Term a1 = SymbolTerm.makeSymbol("abraham");
	 * Term a2 = new VariableTerm();
	 * Term[] args = {a1, a2};
	 * p.setPredicate(code, args);
	 * for (boolean r = p.call(); r; r = p.redo()) {
	 *     System.out.println(a2.toString());
	 * }
	 * </pre>
	 *
	 * <pre>
	 * // To get only one solution.
	 * PrologControl p = new PrologControl();
	 * Predicate code = new PRED_father_2();
	 * Term a1 = SymbolTerm.makeSymbol("abraham");
	 * Term a2 = new VariableTerm();
	 * Term[] args = {a1, a2};
	 * if (p.execute(code, args))
	 *     System.out.println(a2.toString());
	 * else
	 *     System.out.println("fail");
	 * </pre>
	 *
	 * <pre>
	 * // An example of parallel execution
	 * // calls <code>queens(4,X)</code> and <code>queens(8,Y)</code> in parallel.
	 * // Usage:
	 * //   % plcafe -cp queens.jar T
	 * //
	 * import SxxMachine.*;
	 * public class T {
	 *     public static void main(String args[]) {
	 *     long t = System.currentTimeMillis();
	 *     boolean r1 = true;
	 *     boolean r2 = true;
	 *     Term a1[] = {new IntegerTerm(4), new VariableTerm()};
	 *     Term a2[] = {new IntegerTerm(8), new VariableTerm()};
	 *
	 *     PrologControl e1 = new PrologControl();
	 *     PrologControl e2 = new PrologControl();
	 *     Term v1 = new VariableTerm();
	 *     Term v2 = new VariableTerm();
	 *     e1.setPredicate(new PRED_queens_2(), a1);
	 *     e2.setPredicate(new PRED_queens_2(), a2);
	 *     System.out.println("Start");
	 *     e1.start();
	 *     e2.start();
	 *     while (r1 || r2) {
	 *      try {
	 *      Thread.sleep(10);
	 *      } catch (InterruptedException e) {}
	 *      if (r1 && e1.ready()) {
	 *      r1 = e1.next();
	 *      if (r1) {
	 *          System.out.println("Success1 = " + a1[1]);
	 *          e1.cont();
	 *      } else {
	 *          System.out.println("Fail1");
	 *      }
	 *      } else if (r2 && e2.ready()) {
	 *      r2 = e2.next();
	 *      if (r2) {
	 *          System.out.println("Success2 = " + a2[1]);
	 *          e2.cont();
	 *      } else {
	 *          System.out.println("Fail2");
	 *      }
	 *      } else {
	 *      System.out.println("Waiting");
	 *      try {
	 *          Thread.sleep(100);
	 *      } catch (InterruptedException e) {}
	 *      }
	 *  }
	 *  System.out.println("End");
	 *  long t1 = System.currentTimeMillis();
	 *  long t2 = t1 - t;
	 *  System.out.println("time = " + t2 + "msec.");
	 *    }
	 * }
	 * </pre>
	 *
	 * @author Shawn Pearce (sop@google.com)
	 */
	class BlockingPrologControl : public PrologControl, public Runnable
	{

	  /** A volatile instance variable holding a thread. */
  private:
//JAVA TO C++ CONVERTER TODO TASK: 'volatile' has a different meaning in C++:
//ORIGINAL LINE: private volatile Thread thread;
	  Thread *thread;

	  /** A flag that indicates whether the result of goal is <code>true</code> or <code>false</code>. */
   public:
	   bool result = false;
	  /** A flag that indicates whether the result of goal is ready or not. */
	   bool resultReady = false;
	  /** Constructs a new <code>BlockingPrologControl</code>. */
	  virtual ~BlockingPrologControl()
	  {
		  delete thread;
	  }

	  BlockingPrologControl();
	   BlockingPrologControl(Prolog *p);
	  /** Constructs a new <code>BlockingPrologControl</code>. */
	  BlockingPrologControl(PrologMachineCopy *pmc);

	  /**
	   * Returns <code>true</code> if the system succeeds to find a first solution
	   * of the given goal, <code>false</code> otherwise.<br>
	   *
	   * This method is useful to find only one solution.<br>
	   *
	   * This method first initilizes the Prolog engine by invoking <code>engine.init()</code>,
	   * allocates a new <code>Thread</code> object, and start the execution of the given goal.
	   * And then it stops the thread and returns <code>true</code>
	   * if the goal succeeds, <code>false</code> otherwise.
	   * @see #run
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  bool execute(const std::string &pkg, const std::string &functor, std::vector<Term> &args) override;

	  /**
	   * Returns <code>true</code> if the system succeeds to find a first solution
	   * of the given goal, <code>false</code> otherwise.<br>
	   *
	   * This method is useful to find only one solution.<br>
	   *
	   * This method first initilizes the Prolog engine by invoking <code>engine.init()</code>,
	   * allocates a new <code>Thread</code> object, and start the execution of the given goal.
	   * And then it stops the thread and returns <code>true</code>
	   * if the goal succeeds, <code>false</code> otherwise.
	   * @see #run
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool execute(Predicate *p);

	  /**
	   * Returns <code>true</code> if the system succeeds to find a first solution
	   * of the goal, <code>false</code> otherwise.<br>
	   *
	   * This method first invokes the <code>start()</code> method that
	   * initilizes the Prolog engine, allocates a new <code>Thread</code> object,
	   * and start the execution.
	   * And then it returns the <code>boolean</code> whose value is <code>next()</code>.
	   * @see #start
	   * @see #next
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool call();

	  /**
	   * Returns <code>true</code> if the system succeeds to find a next solution
	   * of the goal, <code>false</code> otherwise.<br>
	   *
	   * This method first invokes the <code>cont()</code> method that
	   * sets the <code>resultReady</code> to <code>false</code>
	   * and wakes up all threads that are waiting on this object's monitor.
	   * And then it returns the <code>boolean</code> whose value is <code>next()</code>.
	   * @see #cont
	   * @see #next
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool redo();

	  /**
	   * Is invoked when the system succeeds to find a solution.<br>
	   *
	   * This method is invoked from the initial continuation goal
	   * (a <code>Success</code> object).<br>
	   *
	   * This method first sets the <code>resultReady</code> and <code>result</code> to <code>true</code>.
	   * And then it wakes up all threads that are waiting by <code>notifyAll()</code>.
	   * Finally, while the <code>thread</code> is not <code>null</code> and
	   * the <code>resultReady</code> is <code>true</code>,
	   * it waits until another thread invokes the <code>notify()</code> method
	   * or the <code>notifyAll()</code> method for this object.
	   * @see #resultReady
	   * @see #result
	   * @see #thread
	   */
  protected:
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  void success() override;

	  /**
	   * Is invoked after failure of all trials.<br>
	   *
	   * This method is invoked from the <code>run</code> method.<br>
	   *
	   * This method first sets the <code>resultReady</code> and <code>result</code>
	   * to <code>true</code> and <code>false</code> respectively.
	   * And then it wakes up all threads that are waiting by <code>notifyAll()</code>.
	   * Finally, while the <code>thread</code> is not <code>null</code> and
	   * the <code>resultReady</code> is <code>true</code>,
	   * it waits until another thread invokes the <code>notify()</code> method
	   * or the <code>notifyAll()</code> method for this object.
	   * @see #resultReady
	   * @see #result
	   * @see #thread
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  void fail() override;

	  /** @return true if the engine is no longer supposed to execute. */
  public:
	  bool isEngineStopped() override;

	  /** Waits for this thread to die. */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual void join();

	  /**
	   * Forces the thread to stop.<br>
	   *
	   * This method first sets the <code>resultReady</code> and <code>thread</code>
	   * to <code>false</code> and <code>null</code> respectively.
	   * And then it wakes up all threads that are waiting by <code>notifyAll()</code>.
	   * @see #resultReady
	   * @see #thread
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual void stop();

	  /**
	   * Forces the thread to start the execution.<br>
	   *
	   * This method initilizes the Prolog engine by invoking <code>engine.init()</code>,
	   * allocates a new <code>Thread</code> object, and start the execution.
	   * The Java Virtual Machine calls the <code>run</code> method of this thread.
	   * @see #run
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual void start();

	  /**
	   * Forces the thread to continue the execution.<br>
	   *
	   * This method sets the <code>resultReady</code> to <code>false</code>,
	   * and then wakes up all threads that are waiting by <code>notifyAll()</code>.
	   * @see #resultReady
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual void cont();

	  /**
	   * Returns <code>true</code> if the result of goal is ready,
	   * <code>false</code> otherwise.
	   * @return a <code>boolean</code> whose value is <code>resultReady</code>.
	   * @see #resultReady
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool ready();

	  /**
	   * Returns <code>true</code> if the result of goal is ready and true, otherwise <code>false</code>.
	   * @return a <code>boolean</code> whose value is <code>(ready() &amp;&amp; result)</code>.
	   * @see #ready
	   * @see #result
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool in_success();

	  /**
	   * Returns <code>true</code> if the result of goal is ready and false, otherwise <code>false</code>.
	   * @return a <code>boolean</code> whose value is <code>(ready() &amp;&amp; !result)</code>.
	   * @see #ready
	   * @see #result
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool in_failure();

	  /**
	   * Wait until the system finds a next solution,
	   * and then returns the result as <code>boolean</code>.<br>
	   *
	   * This method first waits until another thread invokes the <code>notify()</code>
	   * method or the <code>notifyAll()</code> method for this object,
	   * while the <code>thread</code> is not <code>null</code> and
	   * the <code>resultReady</code> is <code>false</code>.
	   * And then invokes the <code>stop()</code> if the <code>result</code> is <code>false</code>.
	   * Finally, returns the <code>result</code>.
	   * @see #resultReady
	   * @see #result
	   * @see #thread
	   */
//JAVA TO C++ CONVERTER WARNING: The following method was originally marked 'synchronized':
	  virtual bool next();

	  /**
	   * Executes the goal.<br>
	   *
	   * Every time finding a solution, the <code>success</code> method is invoked.
	   * And then the <code>fail</code> method is invoked after failure of all trials.
	   * Finally, the <code>stop</code> method is invoked at the end of this <code>run</code>.
	   * @see #success
	   * @see #fail
	   * @see #stop
	   */
	  void run() override;
	};

}
