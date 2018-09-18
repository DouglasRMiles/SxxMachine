#ifndef SOURCELOOP
#define SOURCELOOP

#include "../../terms/SxxMachine/Source.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Source; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }

namespace SxxMachine
{


	/**
	  An Infinite Source.
	  If based on a finite Source, it moves to its the first element after reaching its last element.
	  A SourceLoop returns 'no' if the original Source is empty. 
	  In case the original Source is infinite, a SourceLoop will 
	  return the same elements as the original Source. 
	  (In particular, this happens if the original Source is also a Source loop).
	*/
	class SourceLoop : public Source
	{
	private:
		std::vector v;

	public:
		Source* s;

	private:
		int i = 0;

	public:
		virtual ~SourceLoop()
		{
			delete s;
		}

		SourceLoop(Source* s, Prog* p);

	private:
		Term* getMemoized();

	public:
		Term* getElement() override;

		void stop() override;
	};

}


#endif	//#ifndef SOURCELOOP
