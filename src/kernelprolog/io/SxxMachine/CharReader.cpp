using namespace std;

#include "CharReader.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "IO.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	bool CharReader::isCharReader()
	{
		return true;
	}

	CharReader::CharReader(Reader *reader, Prog *p) : Source(p)
	{
		this->reader = reader;
	}

	CharReader::CharReader(const wstring &f, Prog *p) : Source(p)
	{
		makeReader(f);
	}

	CharReader::CharReader(Term *t, Prog *p) : Source(p)
	{
		this->reader = new StringReader(t->toUnquoted());
	}

	CharReader::CharReader(Prog *p) : CharReader(IO::input, p)
	{
	}

	void CharReader::makeReader(const wstring &f)
	{
		this->reader = IO::url_or_file(f);
	}

	Term *CharReader::getElement()
	{
		if (IO::input == reader)
		{
			wstring s = IO::promptln(">:");
			if ("" == s || s.length() == 0)
			{
				return nullptr;
			}
			return TermData::SYM(s);
		}

		if (nullptr == reader)
		{
			return nullptr;
		}
		int c = -1;
		try
		{
			c = reader->read();
		}
		catch (const IOException &e)
		{
		}
		if (-1 == c)
		{
			stop();
			return nullptr;
		}
		else
		{
			return TermData::Long(c);
		}
	}

	void CharReader::stop()
	{
		if (nullptr != reader && IO::input != reader)
		{
			try
			{
				reader->close();
			}
			catch (const IOException &e)
			{
			}
			reader = nullptr;
		}
	}
}
