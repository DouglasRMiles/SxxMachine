using namespace std;

#include "FunBuiltin.h"

namespace SxxMachine
{

	FunBuiltin::FunBuiltin(const wstring& f, const int& i) : ConstBuiltin(f)
	{
		arity = i;
	}

	bool FunBuiltin::isBuiltin()
	{
		return true;
	}

	int FunBuiltin::arityOrType()
	{
		return arity;
	}
}
