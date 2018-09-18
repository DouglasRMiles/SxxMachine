using namespace std;

#include "Compiler.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/BufferingPrologControl.h"
#include "../../machine/SxxMachine/PrologClassLoader.h"
#include "../../exceptions/SxxMachine/CompileException.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/TermData.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../exceptions/SxxMachine/PrologException.h"

namespace SxxMachine
{

Option Option::eliminateDisjunctions("eliminateDisjunctions", InnerEnum::eliminateDisjunctions, "ed", true);
Option Option::arithmeticCompilation("arithmeticCompilation", InnerEnum::arithmeticCompilation, "ac", true);
Option Option::inlineExpansion("inlineExpansion", InnerEnum::inlineExpansion, "ie", true);
Option Option::optimiseRecursiveCall("optimiseRecursiveCall", InnerEnum::optimiseRecursiveCall, "rc", true);
Option Option::switchOnHash("switchOnHash", InnerEnum::switchOnHash, "idx", true);
Option Option::generateClosure("generateClosure", InnerEnum::generateClosure, "clo", false);

vector<Option> Option::valueList;

Option::StaticConstructor::StaticConstructor()
{
	valueList.push_back(eliminateDisjunctions);
	valueList.push_back(arithmeticCompilation);
	valueList.push_back(inlineExpansion);
	valueList.push_back(optimiseRecursiveCall);
	valueList.push_back(switchOnHash);
	valueList.push_back(generateClosure);
}

Option::StaticConstructor Option::staticConstructor;
int Option::nextOrdinal = 0;

	Compiler::Option::Option(const wstring &name, InnerEnum innerEnum, Compiler *outerInstance, const wstring &symbol, bool onByDefault) : nameValue(name), ordinalValue(nextOrdinal++), innerEnumValue(innerEnum)
	{
			this->outerInstance = outerInstance;
	  this->symbol = SymbolTerm::intern(symbol);
	  this->onByDefault = onByDefault;
	}

bool Option::operator == (const Option &other)
{
	return this->ordinalValue == other.ordinalValue;
}

bool Option::operator != (const Option &other)
{
	return this->ordinalValue != other.ordinalValue;
}

vector<Option> Option::values()
{
	return valueList;
}

int Option::ordinal()
{
	return ordinalValue;
}

wstring Option::toString()
{
	return nameValue;
}

Option Option::valueOf(const wstring &name)
{
	for (auto enumInstance : Option::valueList)
	{
		if (enumInstance.nameValue == name)
		{
			return enumInstance;
		}
	}
}

	Compiler::Compiler() : pcl(new BufferingPrologControl()), options(EnumSet::noneOf(Option::typeid))
	{
	  PrologClassLoader tempVar(Compiler::typeid->getClassLoader());
	  this->pcl->setPrologClassLoader(&tempVar);
	  enableDefaultOptions();
	}

	void Compiler::prologToWAM(const wstring &_prolog, const wstring &_wam) throw(CompileException)
	{
		if (!fileExists(_prolog))
		{
		  throw CompileException(FileNotFoundException(_prolog));
		}
		// Create arguments
		Term *prolog = SymbolTerm::create(_prolog);
		Term *wam = SymbolTerm::create(_wam);
		Term *op = Prolog::Nil;
		for (auto opt : this->options)
		{
		  op = TermData::CONS(opt.symbol, op);
		}
		ListTerm *args = TermData::LIST(prolog, {wam, op});
		try
		{
		  if (!this->pcl->execute("SxxMachine.compiler.pl2am", "pl2am", {args}))
		  {
			throw CompileException("Unknown Error");
		  }
		}
		catch (const PrologException &err)
		{
		  throw CompileException("Error compiling " + _prolog, err);
		}
	}

	void Compiler::wamToJavaSource(const wstring &_wam, const wstring &_dir) throw(CompileException)
	{
		if (!fileExists(_wam))
		{
		  throw CompileException(FileNotFoundException(_wam));
		}
	   if (!fileExists(_dir) && !FileSystem::createDirectory(_dir))
	   {
		 throw CompileException(FileNotFoundException(_dir));
	   }
		// Create arguments
		Term *wam = SymbolTerm::create(_wam);
		Term *dir = SymbolTerm::create(_dir);
		ListTerm *args = TermData::LIST(wam, {dir});
		try
		{
		  if (!this->pcl->execute("SxxMachine.compiler.am2j", "am2j", {args}))
		  {
			throw CompileException("Unknown Error");
		  }
		}
		catch (const PrologException &err)
		{
		   throw CompileException("Error converting " + _wam, err);
		}
	}

	void Compiler::prologToJavaSource(const wstring &prolog, const wstring &dir) throw(CompileException)
	{
	  File *tmp;
	  try
	  {
		tmp = File::createTempFile("PrologCafe_", ".am");
	  }
	  catch (const IOException &e)
	  {
		throw CompileException("Cannot create temporary file", e);
	  }
	  try
	  {
		prologToWAM(prolog, tmp->getPath());
		wamToJavaSource(tmp->getPath(), dir);
	  }
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to the exception 'finally' clause:
	  finally
	  {
		if (!tmp->delete() && tmp->exists())
		{
		  tmp->deleteOnExit();
		}
	  }
	}

	void Compiler::main(std::vector<wstring> &argv) throw(runtime_error)
	{
	  Compiler *comp = new Compiler();
	  wstring out = ".";
	  wstring amdir = "";
	  bool stackTrace = false;
	  bool suppressBanner = false;
	  list<wstring> plsrc = list<wstring>();
	  int argi = 0;
	  for (; argi < argv.size(); argi++)
	  {
		wstring a = argv[argi];
		if (a == "--")
		{
		  argi++;
		  break;
		}
		if (a == "-q")
		{
		  suppressBanner = true;
		}
		else if (a == "-O")
		{
		  comp->enableDefaultOptions();
		}
		else if (a == "-O:none")
		{
		  comp->options->clear();
		}
		else if (StringHelper::startsWith(a, "-O:"))
		{
		  wstring optname = a.substr((wstring("-O:")).length());
		  Option opt = findOptionByName(optname);
		  if (opt != nullptr)
		  {
			comp->enable(opt);
		  }
		}
		else if (a == "-s")
		{
		  if (++argi == argv.size())
		  {
			usage();
		  }
		  out = argv[argi];
		}
		else if (a == "-am")
		{
		  if (++argi == argv.size())
		  {
			usage();
		  }
		  amdir = argv[argi];
		}
		else if (a == "-h" || a == "--help" || a == "-help")
		{
		  usage();
		}
		else if (a == "--show-stack-trace")
		{
		  stackTrace = true;
		}
		else if (StringHelper::startsWith(a, "-"))
		{
		  System::err::println("error: Unsupported flag '" + a + "'");
		  usage();
		}
		else
		{
		  plsrc.push_back(a);
		}
	  }
	  if (argi < argv.size())
	  {
		plsrc.addAll(Arrays::asList(argv).subList(argi, argv.size()));
	  }
	  if (plsrc.empty())
	  {
		usage();
	  }
	  if (!suppressBanner)
	  {
		banner();
	  }
	  for (auto pl : plsrc)
	  {
		System::err::println("Translating " + pl);
		try
		{
		  if (amdir != "")
		  {
			wstring base;
			if (pl.endsWith(".pl"))
			{
			  base = pl.substr(0, pl.length() - 3);
			}
			else
			{
			  base = pl;
			}
			File tempVar(amdir);
			File *am = new File(&tempVar, base + ".am");
			am->getParentFile().mkdirs();
			comp->prologToWAM(pl, am->getPath());
			comp->wamToJavaSource(am->getPath(), out);
		  }
		  else
		  {
			comp->prologToJavaSource(pl, out);
		  }
		}
		catch (const CompileException &err)
		{
		  if (stackTrace)
		  {
			err->printStackTrace();
		  }
		  else
		  {
			System::err::println("error: " + err->what());
		  }
		  exit(1);
		}
	  }
	}

	Compiler::Option Compiler::findOptionByName(const wstring &optname)
	{
	  for (Option opt : Option::values())
	  {
		if (opt.toString()->equalsIgnoreCase(optname))
		{
		  return opt;
		}
		if (opt.symbol::name().equalsIgnoreCase(optname))
		{
		  return opt;
		}
	  }
	  System::err::println("error: Unsupported option '" + optname + "'");
	  exit(1);
	  throw runtime_error("System.exit(1)");
	}

	void Compiler::usage()
	{
	  System::err::print("usage: ");
	  System::err::print("java ");
	  System::err::print(Compiler::typeid->getName());
	  System::err::print(" [options]");
	  System::err::print(" prolog_source...");
	  System::err::println();
	  banner();
	  wstring optfmt = "  %-20s %s";
	  System::err::format(optfmt, "-s <directory>", "where to place generated source files");
	  System::err::println();
	  System::err::format(optfmt, "-am <directory>", "save WAM intermediate files");
	  System::err::println();
	  System::err::format(optfmt, "-O", "enable all optimizations");
	  System::err::println();
	  System::err::format(optfmt, "-O:none", "disable all optimizations");
	  System::err::println();
	  // Special options not related to building Prolog programs.
	  System::err::println();
	  System::err::format(optfmt, "-h, --help", "display this message");
	  System::err::println();
	  System::err::format(optfmt, "--show-stack-trace", "show Java stack trace on failure");
	  System::err::println();
	  exit(1);
	}

	void Compiler::banner()
	{
	  System::err::println("Prolog Cafe");
	  System::err::println("Copyright(C) 1997-2009 M.Banbara and N.Tamura");
	  System::err::println();
	}

	bool Compiler::fileExists(const wstring &_file)
	{
	try
	{
		return FileSystem::pathExists(_file);
	}
	catch (const SecurityException &e)
	{
	}
	return false;
	}

	bool Compiler::isEnabled(Option opt)
	{
		return this->options->contains(opt);
	}

	void Compiler::enable(Option opt)
	{
		this->options->add(opt);
	}

	void Compiler::disable(Option opt)
	{
		this->options->remove(opt);
	}

	void Compiler::setEnabled(Option opt, bool on)
	{
	  if (on)
	  {
		enable(opt);
	  }
	  else
	  {
		disable(opt);
	  }
	}

	void Compiler::enableDefaultOptions()
	{
	  for (Option opt : Option::values())
	  {
		if (opt.onByDefault)
		{
		  this->options->add(opt);
		}
	  }
	}
}
