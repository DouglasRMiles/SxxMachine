#pragma once

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class SymbolTerm;
	class Term;
	class LongTerm;
	class StructureTerm;
	class CharReader;
	class NumberTerm;
	class Nonvar;
}

namespace SxxMachine
{

	class Expect
	{

	public:
		static SymbolTerm *asConst(Term *i);

		static LongTerm *asInt(Term *i);

		static StructureTerm *asCons(Term *i);

		static StructureTerm *asStruct(Term *i);

		static StructureTerm *asConj(Term *i);

		static CharReader *asCharReader(Term *i);

		static NumberTerm *asNum(Term *i);

		static Nonvar *the(Term *X);

	};

}
