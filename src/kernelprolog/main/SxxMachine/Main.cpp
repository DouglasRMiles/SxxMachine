using namespace std;

#include "Main.h"
#include "Init.h"
#include "Builtins.h"

namespace SxxMachine
{

	int Main::init()
	{
		if(!Init::startProlog())
		{
			return 0;
		}
		Init::builtinDict = new Builtins();
		Init::askProlog("reconsult('" + Init::default_lib + "')");
		return 1;
	}

	void Main::main(std::vector<wstring>& args)
	{
		if(0 == init())
		{
			return;
		}
		if(!Init::run(args))
		{
			return;
		}
		Init::standardTop(); // interactive
	}
}
