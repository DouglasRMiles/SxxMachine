#pragma once

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class ISTerm;
	class Prog;
}

namespace SxxMachine
{

	/**
	  Always succeeds
	*/
	class true_
	{

	public:
		static int st_exec(Prog *p, ISTerm *thiz);
	};

}
