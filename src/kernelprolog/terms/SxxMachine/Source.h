#pragma once

#include "../../../machine/SxxMachine/Undoable.h"
#include "Fluent.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prog;
	class Term;
	class Nonvar;
}

namespace SxxMachine
{


	class Source : public Fluent, public Undoable
	{

	public:
		Source(Prog *p);

		static bool isSource();

		virtual Term *getElement() = 0;

		virtual Nonvar *toList();

		virtual Term *toFun();
	};

}
