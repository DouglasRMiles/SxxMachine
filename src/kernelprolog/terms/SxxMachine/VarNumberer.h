#pragma once

#include "../../../machine/SxxMachine/SystemObject.h"
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class HashDict;
	class Term;
}

namespace SxxMachine
{

	/**
	  Used in implementing uniform replacement of
	  variables with new constants. useful for printing
	  out with nicer variable names.
	
	  @see Var
	  @see Clause
	*/
	class VarNumberer : public SystemObject
	{
	public:
		HashDict *dict;

		int ctr = 0;

		virtual ~VarNumberer()
		{
			delete dict;
		}

		VarNumberer();

		Term *action(Term *place) override;

	};

}
