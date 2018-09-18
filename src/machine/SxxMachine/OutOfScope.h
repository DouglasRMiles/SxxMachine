#ifndef OUTOFSCOPE
#define OUTOFSCOPE

#include "Undoable.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class BlockPredicate; }

namespace SxxMachine
{

	/**
	 * A trail entry for out-of-scope flag.<br>
	 * This <code>OutOfScope</code> class is used in 
	 * subclasses of <code>BlockPredicate</code>.<br>
	 * <font color="red">This document is under construction.</font>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class OutOfScope : public Undoable
	{
	public:
		BlockPredicate* const  p;
		virtual ~OutOfScope()
		{
			delete p;
		}

		OutOfScope(BlockPredicate* _p);

		void undo() override;
	};

}


#endif	//#ifndef OUTOFSCOPE
