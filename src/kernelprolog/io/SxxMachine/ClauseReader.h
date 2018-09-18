#ifndef CLAUSEREADER
#define CLAUSEREADER

#include "CharReader.h"
#include <string>
#include "exceptionhelper.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Parser; }
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class StructureTerm; }
namespace SxxMachine { class Clause; }
namespace SxxMachine { class stop; }

namespace SxxMachine
{


	/**
	  Builds  Fluents from Java
	  Streams
	*/
	class ClauseReader : public CharReader
	{
	protected:
		Parser* parser;

	public:
		virtual ~ClauseReader()
		{
			delete parser;
		}

		ClauseReader(Reader* reader, Prog* p);

		ClauseReader(const std::string& f, Prog* p);

		ClauseReader(Prog* p);

		/**
		 * parses from a string representation of a term
		 */
		ClauseReader(Term* t, Prog* p);

		virtual void make_parser(const std::string& f);

		Term* getElement() override;

		static StructureTerm* extract_info(Clause* C);

		void stop() override;
	};

}


#endif	//#ifndef CLAUSEREADER
