#pragma once

#include "CharWriter.h"
#include <string>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prog;
	class Term;
}

namespace SxxMachine
{

	/**
	 * Writer
	 */
	class ClauseWriter : public CharWriter
	{
	public:
		ClauseWriter(const std::string &f, Prog *p);

		ClauseWriter(Prog *p);

		int putElement(Term *t) override;
	};

}
