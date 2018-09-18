#pragma once

#include "ConstBuiltin.h"
#include <string>

namespace SxxMachine
{

	/**
	* Template for builtins of arity >0
	*/

	class FunBuiltin : public ConstBuiltin
	{
		//public StructureTerm thiz = this;

	public:
		int arity = 0;
		FunBuiltin(const std::string &f, int i);
	//	@Override
	//	public int exec(Prog p) {s
	//		// TODO Auto-generated method stub
	//		return 0;
	//	}
	//	//abstract public int exec(Prog p);
	//
		bool isBuiltin() override;

		int arityOrType() override;

	};

}
