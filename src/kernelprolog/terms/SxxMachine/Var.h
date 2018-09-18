#ifndef VAR
#define VAR

#include "../../../machine/SxxMachine/Undoable.h"
#include "../../../machine/SxxMachine/Term.h"

namespace SxxMachine
{

	/**
	 * Part of the Term hierarchy implmenting logical variables. They are subject to
	 * reset by application of and undo action keep on the trail stack.
	 */
	class Var : public Term, public Undoable
	{

  public:
	  virtual bool unbound() = 0;

	};
}


#endif	//#ifndef VAR
