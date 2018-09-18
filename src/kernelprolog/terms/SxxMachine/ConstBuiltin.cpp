using namespace std;

#include "ConstBuiltin.h"
#include "../../../machine/SxxMachine/Term.h"
#include "Method.h"

namespace SxxMachine
{

	void ConstBuiltin::setMethod(Method* b)
	{
		// TODO Auto-generated method stub

	}

	wstring ConstBuiltin::getKey()
	{
		return Name + "/" + to_string(arityOrType());
	}

	ConstBuiltin::ConstBuiltin(const wstring& s)
	{
		Name = s;
	}

	bool ConstBuiltin::isBuiltin()
	{
		return true;
	}

	wstring ConstBuiltin::name()
	{
		return Name;
	}

	int ConstBuiltin::arityOrType()
	{
		return Term::CONST;
	}
}
