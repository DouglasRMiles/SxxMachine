#ifndef SINK
#define SINK

#include "../../../machine/SxxMachine/Undoable.h"
#include "Fluent.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class collect; }

namespace SxxMachine
{

	class Sink : public Fluent, public Undoable
	{

	public:
		Sink(Prog* p);

		virtual int putElement(Term* T) = 0;

		virtual Term* collect();
	};

}


#endif	//#ifndef SINK
