#pragma once

#include "Undoable.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class BlockPredicate;
}

namespace SxxMachine
{

	/**
	 * A trail entry for out-of-loop flag.<br>
	 * This <code>OutOfLoop</code> class is used in 
	 * subclasses of <code>BlockPredicate</code>.<br>
	 * <font color="red">This document is under construction.</font>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class OutOfLoop : public Undoable
	{
	public:
		BlockPredicate *const p;
		virtual ~OutOfLoop()
		{
			delete p;
		}

		OutOfLoop(BlockPredicate *_p);
		void undo() override;
	};

}
