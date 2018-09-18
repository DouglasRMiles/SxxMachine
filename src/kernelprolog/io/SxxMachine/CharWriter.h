#ifndef CHARWRITER
#define CHARWRITER

#include "../../terms/SxxMachine/Sink.h"
#include <string>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }

namespace SxxMachine
{


	/**
	  Writer
	*/
	class CharWriter : public Sink
	{
	protected:
		Writer* writer;

	public:
		virtual ~CharWriter()
		{
			delete writer;
		}

		CharWriter(const std::string& f, Prog* p);

		CharWriter(Prog* p);

		int putElement(Term* t) override;

		void stop() override;

	};

}


#endif	//#ifndef CHARWRITER
