#pragma once

namespace SxxMachine
{

	/**
	 * Implementing this interface allows an object to be pushed to trail stack.<br>
	 * @see Trail
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class Undoable
	{
		/** 
		 * Undoes this object.<br> 
		 * @see Trail#unwind(int) 
		*/
	public:
		virtual void undo() = 0;
	};



}
