#ifndef ISTERM
#define ISTERM

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }
namespace SxxMachine { class Prog; }

namespace SxxMachine
{

	class ISTerm
	{
	public:
		virtual Term* ArgDeRef(const int& i) = 0;

		virtual Term* ArgNoDeRef(const int& i) = 0;

		virtual int getIntArg(const int& i) = 0;

		virtual int unifyArg(const int& i, Term* a, Prog* p) = 0;
	};
}


#endif	//#ifndef ISTERM
