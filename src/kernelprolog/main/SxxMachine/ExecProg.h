#ifndef EXECPROG
#define EXECPROG

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine { class ISTerm; }
namespace SxxMachine { class Prog; }

namespace SxxMachine
{

	using ExecProg = std::function<int(Prog p, ISTerm thiz)>;
}


#endif	//#ifndef EXECPROG
