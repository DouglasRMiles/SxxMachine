#ifndef SUCCESS
#define SUCCESS

#include "Operation.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Operation; }
namespace SxxMachine { class Prolog; }

namespace SxxMachine
{

	/**
	 * Initial continuation goal.<br>
	 * That is to say, this <code>Success</code> will be executed 
	 * every time the Prolog Cafe system finds an answer.
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class Success : public Operation
	{
	public:
		static Success* const  SUCCESS;
	private:
		Success();
		/**
		 * Backtracks and returns a next clause
		 * after invoking the <code>PrologControl.success()</code>.
		 * @param engine Prolog engine
		 * @see PrologControl#success
		 */
	public:
		Operation exec(Prolog* engine) override;
		/** Returns a string representation of this <code>Success</code>. */
		std::string toString() override;
	};

}


#endif	//#ifndef SUCCESS
