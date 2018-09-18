#pragma once

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
	class Prog;
}

namespace SxxMachine
{

	class ISTerm
	{
	public:
		virtual Term *ArgDeRef(int i) = 0;

		virtual Term *ArgNoDeRef(int i) = 0;

		virtual int getIntArg(int i) = 0;

		virtual int unifyArg(int i, Term *a, Prog *p) = 0;
	};
}
