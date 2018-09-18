#ifndef NAMEARITY
#define NAMEARITY

#include <string>

namespace SxxMachine
{


	class NameArity
	{

	public:
		virtual std::string name() = 0;

		virtual int arityOrType() = 0;

		virtual std::string getKey() = 0;

		virtual void setMethod(Method* b) = 0;

	};
}


#endif	//#ifndef NAMEARITY
