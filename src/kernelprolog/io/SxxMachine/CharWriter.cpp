using namespace std;

#include "CharWriter.h"
#include "../../terms/SxxMachine/Prog.h"
#include "IO.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../terms/SxxMachine/Expect.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	CharWriter::CharWriter(const wstring &f, Prog *p) : Sink(p)
	{
		this->writer = IO::toFileWriter(f);
	}

	CharWriter::CharWriter(Prog *p) : Sink(p)
	{
		this->writer = IO::output;
	}

	int CharWriter::putElement(Term *t)
	{
		if (nullptr == writer)
		{
			return 0;
		}
		try
		{
			char c = static_cast<char>(Expect::asInt(t)->intValue());
			writer->write(c);
		}
		catch (const IOException &e)
		{
			return 0;
		}
		return 1;
	}

	void CharWriter::stop()
	{
		if (nullptr != writer && IO::output != writer)
		{
			try
			{
				writer->close();
			}
			catch (const IOException &e)
			{
			}
			writer = nullptr;
		}
	}
}
