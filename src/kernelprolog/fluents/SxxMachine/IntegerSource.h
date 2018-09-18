#pragma once

#include "../../terms/SxxMachine/Source.h"
#include <string>
#include <optional>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prog;
	class Term;
	class stop;
}

namespace SxxMachine
{

	/**
	 * creates a source of integers based on x=a*x+b formula
	 */
	class IntegerSource : public Source
	{

	public:
		IntegerSource(long long fuel, long long a, long long x, long long b, Prog *p);

	private:
		long long fuel = 0;

		long long a = 0;

		long long b = 0;

		long long x = 0;

	public:
		Term *getElement() override;

		void stop() override;

		std::string pprint() override;

	};
}
