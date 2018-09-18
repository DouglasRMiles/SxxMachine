using namespace std;

#include "ObjectStack.h"
#include "../../../machine/SxxMachine/Term.h"

namespace SxxMachine
{

	void ObjectStack::push(Term *var)
	{
		add(var);
	}

	Term *ObjectStack::pop()
	{
		return any_cast<Term*>(remove(size() - 1));
	}

	any ObjectStack::remove(int i)
	{
		return stack.erase(stack.begin() + i);
	}

	bool ObjectStack::isEmpty()
	{
		return stack.empty();
	}

	int ObjectStack::size()
	{
		return stack.size();
	}

	void ObjectStack::add(Term *x)
	{
		stack.push_back(x);
	}
}
