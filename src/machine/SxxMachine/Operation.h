#pragma once

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prolog;
}

namespace SxxMachine
{

	/**
	 * Superclass any single step operation in the Prolog interpreter.
	 * <p>
	 * Most implementations should sublass {@link Predicate} instead to gain the
	 * common {@link Predicate#cont} field to store the next step of the program.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	using Operation = std::function<SxxMachine::Operation(Prolog engine)>;

}
