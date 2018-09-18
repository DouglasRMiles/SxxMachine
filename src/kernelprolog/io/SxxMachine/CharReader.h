#pragma once

#include "../../terms/SxxMachine/Source.h"
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
	  Builds  Fluents from Java
	  Streams
	*/
	class CharReader : public Source
	{

	public:
		virtual ~CharReader()
		{
			delete reader;
		}

		bool isCharReader() override;

		Reader *reader;

		CharReader(Reader *reader, Prog *p);

		CharReader(const std::string &f, Prog *p);

		CharReader(Term *t, Prog *p);

		CharReader(Prog *p);

	protected:
		virtual void makeReader(const std::string &f);

	public:
		Term *getElement() override;

		void stop() override;


	};

}
