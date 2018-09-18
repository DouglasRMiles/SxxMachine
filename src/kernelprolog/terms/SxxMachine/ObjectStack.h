#ifndef OBJECTSTACK
#define OBJECTSTACK

#include <vector>
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class Term; }

namespace SxxMachine
{


	class ObjectStack
	{
	public:
		void push(Term* var);

		Term* pop();

		std::vector<Term*> stack = std::vector<Term*>();

	private:
		std::any remove(const int& i);

	public:
		virtual bool isEmpty();

		virtual int size();

	private:
		void add(Term* x);
	};

}


#endif	//#ifndef OBJECTSTACK
