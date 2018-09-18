#pragma once

#include "../../terms/SxxMachine/Sink.h"
#include "stringbuilder.h"

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Prog;
	class Term;
	class stop;
	class collect;
}

namespace SxxMachine
{

	/**
	  Builds  Fluents from Java
	  Streams
	*/
	class StringSink : public Sink
	{
	protected:
		StringBuilder *buffer;

	public:
		virtual ~StringSink()
		{
			delete buffer;
		}

		StringSink(Prog *p);

		int putElement(Term *t) override;

		void stop() override;

		Term *collect() override;
	};

}
