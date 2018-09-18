#ifndef MAIN
#define MAIN

#include <string>
#include <vector>

namespace SxxMachine
{

	/**
	   Minimal command line only Prolog main entry point
	*/
	class Main
	{
	public:
		static int init();

		static void main(std::vector<std::string>& args);
	};

}


#endif	//#ifndef MAIN
