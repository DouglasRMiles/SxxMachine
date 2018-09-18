using namespace std;

#include "PrologMain2.h"
#include "BlockingPrologControl.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/TermData.h"
#include "../../exceptions/SxxMachine/HaltException.h"
#include "../../machine/SxxMachine/StructureTerm.h"

namespace SxxMachine
{

const wstring PrologMain2::VERSION = "Prolog Cafe 1.2.5 (mantis)";
const wstring PrologMain2::COPYRIGHT = "Copyright(C) 1997-2009 M.Banbara and N.Tamura";

	void PrologMain2::main(std::vector<wstring>& argv)
	{
	BlockingPrologControl* p;
	wstring goal;
	try
	{
		System::err::println("\n" + VERSION);
		System::err::println(COPYRIGHT);
		if(argv.size() != 1)
		{
		usage();
		//exit(999);
		 argv = std::vector<wstring> { "cafeteria" };
		}
		Term* arg1 = Prolog::Nil;
		arg1 = TermData::CONS(SymbolTerm::intern("user"), arg1);
		arg1 = TermData::CONS(SymbolTerm::intern(Prolog::BUILTIN), arg1);
		Term* arg2 = parseAtomicGoal(argv[0]);
		if(arg2 == nullptr)
		{
		usage();
		exit(1);
		}
		p = new BlockingPrologControl();
		p->setPredicate(Prolog::BUILTIN, "initialization", { arg1, arg2 });
		for(bool r = p->call(); r; r = p->redo())
		{
		}
		exit(0);
	} catch(const HaltException& e)
	{
		exit(e->getStatus());
	} catch(const runtime_error& e)
	{
		e.printStackTrace();
		exit(1);
	}
	}

	Term* PrologMain2::parseAtomicGoal(const wstring& s)
	{
	StringTokenizer* st = new StringTokenizer(s, ":");
	int i = st->countTokens();
	if(i == 1)
	{
		std::vector<Term*> args = { SymbolTerm::intern("user"), SymbolTerm::create(st->nextToken()) };
		return new StructureTerm(SymbolTerm::intern(":", 2), args);
	} else if(i == 2)
	{
		std::vector<Term*> args = { SymbolTerm::create(st->nextToken()), SymbolTerm::create(st->nextToken()) };
		return new StructureTerm(SymbolTerm::intern(":", 2), args);
	} else
	{
		return nullptr;
	}
	}

	void PrologMain2::usage()
	{
	wstring s = "Usage:\n";
	s += "java -cp $PLCAFEDIR/plcafe.jar";
	s += " SxxMachine.PrologMain package:predicate\n";
	s += "java -cp $PLCAFEDIR/plcafe.jar";
	s += " SxxMachine.PrologMain predicate\n";
	s += "    package:        package name\n";
	s += "    predicate:      predicate name (only atom)";
	cout << s << endl;
	}
}
