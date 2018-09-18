#ifndef TRUE_
#define TRUE_

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class ISTerm; }
namespace SxxMachine { class Prog; }

namespace SxxMachine
{

	/**
	  Always succeeds
	*/
	class true_
	{

	public:
		static int st_exec(Prog* p, ISTerm* thiz);
	};

}


#endif	//#ifndef TRUE_
