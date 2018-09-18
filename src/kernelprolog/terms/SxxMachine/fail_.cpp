using namespace std;

#include "fail_.h"
#include "Prog.h"
#include "../../main/SxxMachine/ISTerm.h"

namespace SxxMachine
{

	fail_::fail_() : ConstBuiltin("fail")
	{
	}

	int fail_::exec(Prog* p)
	{
		return 0;
	}

	int fail_::st_exec(Prog* p, ISTerm* thiz)
	{
		return 0;
	}
}
