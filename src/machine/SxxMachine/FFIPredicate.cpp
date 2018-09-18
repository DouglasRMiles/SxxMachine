using namespace std;

#include "FFIPredicate.h"
#include "Term.h"

namespace SxxMachine
{

	bool FFIPredicate::checkParameterTypes(std::vector<type_info>& paraTypes, std::vector<Term*>& args)
	{
		  int arity;
		  arity = paraTypes.size();
		  if(arity != args.size())
		  {
			  return false;
		  }
		  for(int i = 0; i < arity; i++)
		  {
			  if(!args[i]->convertible(paraTypes[i]))
			  {
				  return false;
			  }
		  }
		  return true;
	}
}
