#pragma once

#include <string>
#include <vector>
#include <iostream>
#include <stdexcept>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
}

namespace SxxMachine
{

	/**
	 * Prolog Cafe launcher.
	 * The <code>PrologMain</code> class launchs the Prolog Cafe system.<br>
	 * The usage is as follows, where 
	 * <code>package</code> is a package name, and 
	 * <code>predicate</code> is a predicate name (only atom).
	 * <pre>
	 *   % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.PrologMain package:predicate
	 *   % java -cp $PLCAFEDIR/plcafe.jar SxxMachine.PrologMain predicate
	 * </pre>
	 * Let us show a sample session for launching a small Prolog interpreter:
	 * <code>SxxMachine:cafeteria/0</code>.<br>
	 * <pre>
	 *    % java  -cp $PLCAFEDIR/plcafe.jar:$CLASSPATH SxxMachine.PrologMain SxxMachine:cafeteria
	 *    Prolog Cafe X.X.X (YYY)
	 *    Copyright(C) 1997-200X M.Banbara and N.Tamura
	 *    | ?- 
	 * </pre>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class PrologMain2
	{
		/** Version information */
	public:
		static const std::string VERSION;
		/** Copyright information */
		static const std::string COPYRIGHT;

		static void main(std::vector<std::string> &argv);

		/** Returns a term for given string representation of atom goal, or 
		 * <code>null</code> if parsing fails.
		 * @param s  a string representation of initial goal (ex. foge:main).
		 * @return a term which corresponds to a given string,
		 * or <code>null</code> if parsing fails.
		 */
	protected:
		static Term *parseAtomicGoal(const std::string &s);

		/** Shows usage */
		static void usage();
	};


}
