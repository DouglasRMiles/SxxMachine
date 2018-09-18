using namespace std;

#include "PrologMain.h"
#include "BlockingPrologControl.h"
#include "../../machine/SxxMachine/InternalDatabase.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../kernelprolog/main/SxxMachine/Builtins.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/TermData.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../exceptions/SxxMachine/HaltException.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine
{
//	import static SxxMachine.TermData.CONS;
const wstring PrologMain::VERSION = "Prolog Cafe 1.2.5 (mantis)";
const wstring PrologMain::COPYRIGHT = "Copyright(C) 1997-2009 M.Banbara and N.Tamura";
const wstring PrologMain::HEADER = "Prolog Cafe (" + COPYRIGHT + ")";

	void PrologMain::main(std::vector<wstring> &argv)
	{
	try
	{
	  System::err::println(HEADER);

	  BlockingPrologControl *p = new BlockingPrologControl();
	  p->configureUserIO(System::in, System::out, System::err);
	  p->setMaxDatabaseSize(InternalDatabase::DEFAULT_SIZE);

	  vector<File*> toLoad = vector<File*>(4);
	  long long reductionLimit = numeric_limits<long long>::max();
	  Term *goal = nullptr;
	  for (int i = 0; i < argv.size(); i++)
	  {
		wstring arg = argv[i];
		if (arg == "--enable-io")
		{
		  p->setEnabled(Prolog::Feature::IO, true);
		}
		else if (arg == "--enable-statistics")
		{
		  p->setEnabled(Prolog::Feature::STATISTICS_RUNTIME, true);
		}
		else if (StringHelper::startsWith(arg, "--max-database-size="))
		{
		  wstring v = arg.substr((int)arg.find('=') + 1);
//JAVA TO C++ CONVERTER TODO TASK: Only single-argument parse and valueOf methods are converted:
//ORIGINAL LINE: p.setMaxDatabaseSize(Integer.parseInt(v, 10));
		  p->setMaxDatabaseSize(Integer::valueOf(v, 10));
		}
		else if (StringHelper::startsWith(arg, "--reduction-limit="))
		{
		  wstring v = arg.substr((int)arg.find('=') + 1);
//JAVA TO C++ CONVERTER TODO TASK: Only single-argument parse and valueOf methods are converted:
//ORIGINAL LINE: reductionLimit = Long.parseLong(v, 10);
		  reductionLimit = long long::valueOf(v, 10);
		}
		else if (arg == "-f" && i + 1 < argv.size())
		{
		  File tempVar(argv[++i]);
		  toLoad.push_back(&tempVar);
		}
		else if (StringHelper::startsWith(arg, "-"))
		{
		usage();
		  exit(1);
		}
		else if (i == argv.size() - 1)
		{
		  goal = parseAtomicGoal(arg);
		}
		else
		{
		usage();
		  goal = nullptr; // "cafeteria";
		  //exit(1);
		}
	  }

	  initializePackages(p, goal);
	  for (auto file : toLoad)
	  {
//JAVA TO C++ CONVERTER NOTE: The following 'try with resources' block is replaced by its C++ equivalent:
//ORIGINAL LINE: try (java.io.FileReader src = new java.io.FileReader(file); java.io.BufferedReader buf = new java.io.BufferedReader(src); java.io.PushbackReader in = new java.io.PushbackReader(buf, Prolog.PUSHBACK_SIZE))
		{
			java::io::FileReader src = java::io::FileReader(file);
			java::io::BufferedReader buf = java::io::BufferedReader(src);
			java::io::PushbackReader in_Renamed = java::io::PushbackReader(buf, Prolog::PUSHBACK_SIZE);
		  Term *path = SymbolTerm::create(file->getPath());
		  if (!p->execute(Prolog::BUILTIN, "consult_stream", {path, TermData::FFIObject(in_Renamed)}))
		  {
			System::err::println();
			System::err::flush();
		exit(1);
		  }
		}
		System::err::println();
		System::err::flush();
	  }

	  if (goal == nullptr)
	  {
		System::err::println();
		System::err::flush();
		goal = new StructureTerm(SymbolTerm::intern(":", 2), std::vector<Term*>{SymbolTerm::intern(Prolog::BUILTIN), SymbolTerm::create("cafeteria")});
	  }

	  p->setReductionLimit(reductionLimit);
	  p->execute(Prolog::BUILTIN, "call", {goal});
	}
	catch (const HaltException &e)
	{
		exit(e->getStatus());
	}
	catch (const runtime_error &e)
	{
		e.printStackTrace();
		exit(1);
	}
	catch (const runtime_error &e)
	{
		e.printStackTrace();
		exit(2);
	}
	}

	void PrologMain::exit(int i)
	{
		exit(i);
	}

	Term *PrologMain::parseAtomicGoal(const wstring &s)
	{
	StringTokenizer *st = new StringTokenizer(s, ":");
	int i = st->countTokens();
	if (i == 1)
	{
		std::vector<Term*> args = {SymbolTerm::intern("user"), SymbolTerm::create(st->nextToken())};
		return new StructureTerm(SymbolTerm::intern(":", 2), args);
	}
	else if (i == 2)
	{
		std::vector<Term*> args = {SymbolTerm::create(st->nextToken()), SymbolTerm::create(st->nextToken())};
		return new StructureTerm(SymbolTerm::intern(":", 2), args);
	}
	else
	{
		return nullptr;
	}
	}

	void PrologMain::initializePackages(BlockingPrologControl *p, Term *goal)
	{
	  LinkedHashSet<wstring> *set = new LinkedHashSet<wstring>(3);
	  set->add(Prolog::BUILTIN);
	  set->add("user");
	  if (goal != nullptr)
	  {
		set->add(goal->arg0(1)->name());
	  }

	  vector<wstring> list = vector<wstring>(set);
	  Term *done = SymbolTerm::intern("true");
	  Term *head = Prolog::Nil;
	  for (int i = list.size() - 1; 0 <= i; i--)
	  {
		head = CONS(SymbolTerm::intern(list[i]), head);
	  }
	  p->execute(Prolog::BUILTIN, "initialization", {head, done});
	  PredTable::runInits(p->engine);
	}

	void PrologMain::usage()
	{
	  PrintStream *e = System::err;
	  e->println("usage:  java -jar cafeteria.jar [options] [goal]");
	  e->println();
	  e->println("  --enable-io           : enable file system access");
	  e->println("  --enable-statistics   : enable statistics/2");
	  e->println("  --max-database-size=N : maximum entries in dynamic database");
	  e->println("  --reduction-limit=N   : max reductions during execution");
	  e->println();
	  e->println("   -f source.pl         : load file.pl  (may be repeated)");
	  e->println();
	  e->println("  goal :          predicate or package:predicate");
	  e->println("                  (if not specified, runs interactive loop)");
	}
}
