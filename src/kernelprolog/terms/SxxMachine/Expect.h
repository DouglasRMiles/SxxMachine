#ifndef EXPECT
#define EXPECT

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class SymbolTerm; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class LongTerm; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class CharReader; }
namespace SxxMachine { class NumberTerm; }
namespace SxxMachine { class Nonvar; }

namespace SxxMachine
{

	class Expect
	{

	public:
		static SymbolTerm* asConst(Term* i);

		static LongTerm* asInt(Term* i);

		static StructureTerm* asCons(Term* i);

		static StructureTerm* asStruct(Term* i);

		static StructureTerm* asConj(Term* i);

		static CharReader* asCharReader(Term* i);

		static NumberTerm* asNum(Term* i);

		static Nonvar* the(Term* X);

	};

}


#endif	//#ifndef EXPECT
