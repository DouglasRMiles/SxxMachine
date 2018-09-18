using namespace std;

#include "KPTrail.h"
#include "../../../machine/SxxMachine/Term.h"

namespace SxxMachine
{

	void KPTrail::push(Term* var)
	{
	  add(var);
	}

	Term* KPTrail::pop()
	{
	  return any_cast<Term*>(remove(size() - 1));
	}

	any KPTrail::remove(const int& i)
	{
	  return stack.erase(stack.begin() + i);
	}

	bool KPTrail::isEmpty()
	{
	  return stack.empty();
	}

	int KPTrail::size()
	{
	  return stack.size();
	}

	void KPTrail::add(Term* x)
	{
	  stack.push_back(x);
	}

//JAVA TO C++ CONVERTER TODO TASK: No base class can be determined:
	KPTrail::KPTrail()
	{
	}

	wstring KPTrail::name()
	{
	  return "trail" + hashCode() % 64;
	}

	wstring KPTrail::pprint()
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
	  return name() + "\n" + __super::toString() + "\n";
	}

	void KPTrail::unwind(const int& to)
	{
	  // IO.mes("unwind TRAIL: "+name()+": "+size()+"=>"+to);
	  // if(to>size())
	  // IO.assertion("unwind attempted from smaller to larger top");
	  for(int i = size() - to; i > 0; i--)
	  {
		Term* O = pop();
		O->undo();
	  }
	}

	wstring KPTrail::stat()
	{
	  return "Trail=" + to_string(size());
	}
}
