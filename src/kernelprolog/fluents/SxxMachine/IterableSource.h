#ifndef ITERABLESOURCE
#define ITERABLESOURCE

#include "../../terms/SxxMachine/Source.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Prog; }
namespace SxxMachine { class Term; }
namespace SxxMachine { class stop; }

namespace SxxMachine
{


	/**
	  Builds Prolog Iterators from Java
	  Sequences and Iterator type classes
	*/
	class IterableSource : public Source
	{
	private:
		Iterator* e;

	public:
		virtual ~IterableSource()
		{
			delete e;
		}

		IterableSource(Prog* p);

		IterableSource(Iterator* iterator, Prog* p);

		IterableSource(std::vector V, Prog* p);

		Term* getElement() override;

		void stop() override;
	};

}


#endif	//#ifndef ITERABLESOURCE
