#ifndef LISTSOURCE
#define LISTSOURCE

#include "IterableSource.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Nonvar; }
namespace SxxMachine { class Prog; }

namespace SxxMachine
{

	/**
	  Builds an iterator from a list
	*/
	class ListSource : public IterableSource
	{
	public:
		ListSource(Nonvar* xs, Prog* p);
	};

}


#endif	//#ifndef LISTSOURCE
