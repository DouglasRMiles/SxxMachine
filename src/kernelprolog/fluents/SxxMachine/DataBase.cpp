using namespace std;

#include "DataBase.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "O1Queue.h"
#include "../../terms/SxxMachine/Expect.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "../../main/SxxMachine/Builtins.h"
#include "../../io/SxxMachine/IO.h"
#include "../../main/SxxMachine/Init.h"
#include "../../io/SxxMachine/Parser.h"
#include "../../terms/SxxMachine/Clause.h"
#include "HashDict.h"
#include "../../../machine/SxxMachine/TermData.h"
#include "../../terms/SxxMachine/Prog.h"

namespace SxxMachine
{

	DataBase::DataBase(unordered_map map) : BlackBoard(map)
	{
	}

SymbolTerm *DataBase::yes = Prolog::aYes;
SymbolTerm *DataBase::no = Prolog::aNo;

	Term *DataBase::cin(const wstring &k, Term *pattern)
	{
		Term *found = take(k, pattern);
		// if(found!=null) {
		// found=found.matching_copy(pattern);
		// }
		if (found == nullptr)
		{
			found = no;
		}
		else
		{
			found = StructureTerm::S("the", {found->copy()});
		}
		return found;
	}

	Term *DataBase::out(const wstring &k, Term *pattern, bool copying)
	{
		add(k, copying ? pattern->copy() : pattern);
		return yes;
	}

	Term *DataBase::out(const wstring &key, Term *pattern)
	{
		return out(key, pattern, true); // copies pattern
	}

	void DataBase::all0(int max, vector To, const wstring &k, Term *FXs)
	{
		if (0 == max)
		{
			max = -1;
		}
		O1Queue *Q = any_cast<O1Queue*>(get(k));
		if (Q == nullptr)
		{
			return;
		}
		// todo: use always the same "server's" trail
		for (Iterator *e = Q->toEnumeration(); e->hasNext();)
		{
			Term *t = static_cast<Term*>(e->next());
			if (nullptr == t)
			{
				break;
			}
			t = t->matching_copy(FXs);
			if (t != nullptr && 0 != max--)
			{
				To.push_back(t);
			}
		}
	}

	Term *DataBase::all1(int max, Term *FXs)
	{
		vector<Term*> To = vector<Term*>();
		for (Iterator *e = keySet()->begin(); e->hasNext();)
		{
			all0(max, To, static_cast<wstring>(e->next()), FXs);
		}
		any O = To.toArray(std::vector<Term*>(0));
		StructureTerm *R = StructureTerm::S("$", any_cast<std::vector<Term*>>(O));
		// IO.mes("RR"+R);
		// To.copyInto(R.args);
		return Expect::asCons(R->listify())->argz[1];
	}

	Term *DataBase::all2(int max, const wstring &k, Term *FXs)
	{
		if (k == "")
		{
			// IO.mes("expensive operation: all/2 with unknown key");
			return all1(max, FXs);
		}
		vector To = vector();
		all0(max, To, k, FXs);
		if (To.empty())
		{
			return Prolog::Nil;
		}
		StructureTerm *R = StructureTerm::S("$", static_cast<std::vector<Term*>>(To.toArray()));
		// To.copyInto(R.args);
		Term *T = Expect::asCons(R->listify())->argz[1];
		return T;
	}

	Term *DataBase::all(const wstring &k, Term *FX)
	{
		FX = all2(0, k, FX);
		return FX;
	}

	Iterator *DataBase::toEnumerationFor(const wstring &k)
	{
		Iterator E = BlackBoard::toEnumerationFor(k);
		return E;
	}

	Iterator *DataBase::toEnumerationFor(Term *first)
	{
	  return toEnumerationFor(first->getKey());
	}

	wstring DataBase::pprint()
	{
		StringBuilder *s = new StringBuilder(name());
		Iterator e = keySet()->begin();
		while (e->hasNext())
		{
			s->append(pred_to_string(static_cast<wstring>(e->next())));
			s->append("\n");
			e++;
		}
		return s->toString();
	}

	wstring DataBase::pred_to_string(const wstring &key)
	{
		O1Queue *Q = any_cast<O1Queue*>(get(key));
		if (nullptr == Q)
		{
			return "";
		}
		Iterator e = Q->toEnumeration();
		StringBuilder *s = new StringBuilder("% " + key + "\n\n");
		while (e->hasNext())
		{
			s->append((static_cast<Term*>(e->next()))->pprint());
			s->append(".\n");
			e++;
		}
		s->append("\n");
		return s->toString();
	}

	bool DataBase::fromFile(const wstring &f, bool overwrite)
	{
		IO::trace("last consulted file was: " + lastFile);
		bool ok = fileToProg(f, overwrite);
		if (ok)
		{
			IO::trace("last consulted file set to: " + f);
			lastFile = f;
		}
		else
		{
			IO::errmes("error in consulting file: " + f);
		}
		return ok;
	}

	bool DataBase::fromFile(const wstring &f)
	{
		return fromFile(f, true);
	}

wstring DataBase::lastFile = Init::default_lib;

	bool DataBase::fromFile()
	{
		IO::println("begin('" + lastFile + "')");
		bool ok = fromFile(lastFile);
		if (ok)
		{
			IO::println("end('" + lastFile + "')");
		}
		return ok;
	}

	bool DataBase::fileToProg(const wstring &fname, bool overwrite)
	{
		Reader *sname = IO::toFileReader(fname);
		if (nullptr == sname)
		{
			return false;
		}
		return streamToProg(fname, sname, overwrite);
	}

	bool DataBase::streamToProg(Reader *sname, bool overwrite)
	{
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		return streamToProg(sname->toString(), sname, overwrite);
	}

	DataBase *DataBase::toClone()
	{
		unordered_map map2 = unordered_map();
		DataBase *other = new DataBase(map2);
		map.putAll(map2);
		return other;
	}

	bool DataBase::streamToProg(const wstring &fname, Reader *sname, bool overwrite)
	{
		try
		{
			BlackBoard *ktable = overwrite ? static_cast<BlackBoard*>(Init::default_db->toClone()): nullptr;
			// Clause Err=new Clause(new Const("error"),new Var());
			Parser *p = new Parser(sname);
			apply_parser(p, fname, ktable);
		}
		catch (const runtime_error &e)
		{ // already catched by readClause
			IO::errmes("unexpected error in streamToProg", e);
			return false;
		}
		return true;
	}

	void DataBase::apply_parser(Parser *p, const wstring &fname, BlackBoard *ktable)
	{
		for (;;)
		{
			if (p->atEOF())
			{
				return;
			}
			int begins_at = p->lineno();
			Clause *C = p->readClause();
			if (nullptr == C)
			{
				return;
			}
			if (Parser::isError(C))
			{
				Parser::showError(C);
			}
			else
			{
				// IO.mes("ADDING= "+C.pprint());
				processClause(C, ktable);
				C->setFile(fname, begins_at, p->lineno());
			}
		}
	}

	void DataBase::addClause(Clause *C, HashDict *ktable)
	{
		wstring k = C->getKey();
		// overwrites previous definitions
		if (nullptr != ktable && nullptr != ktable->get(k))
		{
			ktable->remove(k);
			Init::default_db->remove(k);
		}
		Init::default_db->out(k, C, false);
	}

	void DataBase::processClause(Clause *C, HashDict *ktable)
	{
		if (C->getHead()->matches(TermData::SYM("init")))
		{
			// IO.mes("init: "+C.getBody());
			Prog::firstSolution(C->getHead(), C->getBody());
		}
		else
		{
			// IO.mes("ADDING= "+C.pprint());
			addClause(C, ktable);
		}
	}
}
