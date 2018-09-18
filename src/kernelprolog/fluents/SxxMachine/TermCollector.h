#ifndef TERMCOLLECTOR
#define TERMCOLLECTOR

#include "../../terms/SxxMachine/Sink.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }
namespace SxxMachine { class collect; }

namespace SxxMachine
{


	/**
	  Builds  Fluents from Java
	  Streams
	*/
	class TermCollector : public Sink
	{
	protected:
		std::vector buffer;

	private:
		Prog* p;

	public:
		virtual ~TermCollector()
		{
			delete p;
		}

		TermCollector(Prog* p);

		int putElement(Term* T) override;

		void stop() override;

		Term* collect() override;
	};

}


#endif	//#ifndef TERMCOLLECTOR
