using namespace std;

#include "ClauseReader.h"
#include "Parser.h"
#include "../../terms/SxxMachine/Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "IO.h"
#include "../../terms/SxxMachine/Clause.h"
#include "../../main/SxxMachine/Builtins.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../../machine/SxxMachine/StructureTerm.h"

namespace SxxMachine
{

	ClauseReader::ClauseReader(Reader* reader, Prog* p) : CharReader(reader, p)
	{
		make_parser("from shared reader");
	}

	ClauseReader::ClauseReader(const wstring& f, Prog* p) : CharReader(f, p)
	{
		make_parser(f);
	}

	ClauseReader::ClauseReader(Prog* p) : CharReader(p)
	{
		make_parser("standard input");
	}

	ClauseReader::ClauseReader(Term* t, Prog* p) : CharReader(t, p)
	{
		make_parser("string parser");
	}

	void ClauseReader::make_parser(const wstring& f)
	{
		if(nullptr != reader)
		{
			try
			{
				this->parser = new Parser(reader);
			} catch(const IOException& e)
			{
				IO::errmes("unable to build parser for: " + f);
			}
		} else
		{
			this->parser = nullptr;
		}
	}

	Term* ClauseReader::getElement()
	{
		Clause* C = nullptr;
		if(reader->equals(IO::input))
		{
			wstring s = IO::promptln(">:");
			if("" == s || 0 == s.length())
			{
				C = nullptr;
			} else
			{
				C = new Clause(s);
			}
		} else if(nullptr != parser)
		{
			if(parser->atEOF())
			{
				C = nullptr;
				stop();
			} else
			{
				C = parser->readClause();
			}
			if(C != nullptr && C->getHead()->equalsTerm(Prolog::anEof))
			{
				C = nullptr;
				stop();
			}
		}
		return extract_info(C);
	}

	StructureTerm* ClauseReader::extract_info(Clause* C)
	{
		if(nullptr == C)
		{
			return nullptr;
		}
		Term* Vs = C->varsOf();
		Clause* SuperC = new Clause(Vs, C);
		SuperC->dict = C->dict;
		Clause* NamedSuperC = SuperC->cnumbervars(false);
		Term* Ns = NamedSuperC->getHead();
		Term* NamedC = NamedSuperC->getBody();
		return StructureTerm::S("clause", C, Vs, NamedC, Ns);
	}

	void ClauseReader::stop()
	{
		CharReader::stop();
		parser = nullptr;
	}
}
