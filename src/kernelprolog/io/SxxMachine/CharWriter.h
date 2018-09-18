#pragma once

#include "../../terms/SxxMachine/Sink.h"
#include <string>
#include "exceptionhelper.h"

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
	  Writer
	*/
	class CharWriter : public Sink
	{
	protected:
		Writer *writer;

	public:
		virtual ~CharWriter()
		{
			delete writer;
		}

		CharWriter(const std::string &f, Prog *p);

		CharWriter(Prog *p);

		int putElement(Term *t) override;

		void stop() override;

	};

}
