#ifndef SOURCEMERGER
#define SOURCEMERGER

#include "IterableSource.h"
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Nonvar; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class O1Queue; }
namespace SxxMachine { class Term; }

namespace SxxMachine
{

	/**
	  Merges a List of Sources into a new Source which
	  (fairly) iterates over them breadth first.
	*/
	class SourceMerger : public IterableSource
	{

	public:
		virtual ~SourceMerger()
		{
			delete Q;
		}

		SourceMerger(Nonvar* Xs, Prog* p);

	private:
		O1Queue* Q;

	public:
		Term* getElement() override;
	};

}


#endif	//#ifndef SOURCEMERGER
