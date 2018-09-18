#ifndef STRINGSINK
#define STRINGSINK

#include "../../terms/SxxMachine/Sink.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }
namespace SxxMachine { class collect; }
class StringBuilder;

namespace SxxMachine
{

	/**
	  Builds  Fluents from Java
	  Streams
	*/
	class StringSink : public Sink
	{
	protected:
		StringBuilder* buffer;

	public:
		virtual ~StringSink()
		{
			delete buffer;
		}

		StringSink(Prog* p);

		int putElement(Term* t) override;

		void stop() override;

		Term* collect() override;
	};

}


#endif	//#ifndef STRINGSINK
