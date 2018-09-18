#pragma once

#include "../../../machine/SxxMachine/TermData.h"
#include "../../main/SxxMachine/NameArity.h"
#include <string>

namespace SxxMachine
{


	/**
	* Template for builtins of arity 0
	*/

	class ConstBuiltin : public TermData, public NameArity
	{

	public:
		void setMethod(Method *b) override;
		std::string getKey() override;

		std::string Name;

		ConstBuiltin(const std::string &s);

		//abstract public int exec(Prog p);

		virtual bool isBuiltin();

		std::string name() override;

		int arityOrType() override;

	};

}
