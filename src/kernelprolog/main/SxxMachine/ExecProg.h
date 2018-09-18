#pragma once

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class ISTerm;
	class Prog;
}

namespace SxxMachine
{

	using ExecProg = std::function<int(Prog p, ISTerm thiz)>;
}
