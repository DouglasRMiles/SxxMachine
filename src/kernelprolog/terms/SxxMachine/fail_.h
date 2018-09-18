#ifndef FAIL_
#define FAIL_

#include "ConstBuiltin.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class ISTerm; }

namespace SxxMachine
{

	/**
	  Always fails
	*/
	class fail_ : public ConstBuiltin
	{
	public:
		fail_();

		virtual int exec(Prog* p);

		static int st_exec(Prog* p, ISTerm* thiz);
	};
}


#endif	//#ifndef FAIL_
