using namespace std;

#include "PrologClassLoader.h"
#include "../../handcoded/SxxMachine/bootpreds.h"
#include "../../handcoded/SxxMachine/sxxtensions.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../builtin/SxxMachine/FILE_cafeteria.h"
#include "../../builtin/SxxMachine/FILE_io.h"
#include "../../builtin/SxxMachine/FILE_swi_supp.h"
#include "../../builtin/SxxMachine/FILE_system.h"
#include "Prolog.h"
#include "../../exceptions/SxxMachine/PrologException.h"
#include "Term.h"
#include "Success.h"
#include "Predicate.h"
#include "TermData.h"
#include "../../exceptions/SxxMachine/ExistenceException.h"
#include "StructureTerm.h"
#include "SymbolTerm.h"
#include "PredTable.h"
#include "ClassNotFoundException.h"

namespace SxxMachine
{

	PrologClassLoader::StaticConstructor::StaticConstructor()
	{
				bootpreds::loadFile();
				sxxtensions::loadFile();
				FILE_builtins::loadPreds();
				FILE_cafeteria::loadPreds();
				FILE_io::loadPreds();
				FILE_swi_supp::loadPreds();
				FILE_system::loadPreds();
	}

PrologClassLoader::StaticConstructor PrologClassLoader::staticConstructor;

	PrologClassLoader::NotFoundPredicate::NotFoundPredicate()
	{
	}

	Operation PrologClassLoader::NotFoundPredicate::exec(Prolog* engine) throw(PrologException)
	{
	  return nullptr;
	}

const Operation PrologClassLoader::NOT_FOUND = new NotFoundPredicate();

	PrologClassLoader::PrologClassLoader()
	{
	}

	PrologClassLoader::PrologClassLoader(ClassLoader* parent) : ClassLoader(parent)
	{
	}

	bool PrologClassLoader::definedPredicate(const wstring& pkg, const wstring& functor, const int& arity)
	{
	  try
	  {
		return findPredicate(pkg, functor, arity) != NOT_FOUND;
	  } catch(const ClassNotFoundException& cnfe)
	  {
		return false;
	  }
	}

	Operation PrologClassLoader::predicate(const wstring& pkg, const wstring& functor, vector<Term> &args)
	{
	  return predicate(pkg, functor, { Success::SUCCESS, args });
	}

	Operation PrologClassLoader::predicate(const wstring& pkg, const wstring& functor, Operation cont, vector<Term> &args)
	{
	  int arity = args->length;
	  try
	  {
		Operation constructor = findPredicate(pkg, functor, arity);
		if(constructor != NOT_FOUND)
		{
		  Predicate* pred = new TermData::StaticPred(functor, constructor, args, cont);
		  return pred;
		}
	  } catch(const runtime_error& cause)
	  {
		if(dynamic_cast<runtime_error>(cause) != nullptr)
		{
		  cause.printStackTrace();
		}
		ExistenceException* err2 = new ExistenceException("procedure", term(pkg, functor, arity), cause.what());
		err2->initCause(cause);
		throw err2;
	  }
	  throw ExistenceException("procedure", term(pkg, functor, arity), "NOT_FOUND");
	}

	StructureTerm* PrologClassLoader::term(const wstring& pkg, const wstring& functor, const int& arity)
	{
	  StructureTerm tempVar("/", SymbolTerm::create(functor), TermData::Integer(arity));
	  return new StructureTerm(":", SymbolTerm::create(pkg), &tempVar);
	}

	Operation PrologClassLoader::findPredicate(const wstring& pkg, const wstring& functor, const int& arity) throw(ClassNotFoundException)
	{
	  Key * const key = new Key(pkg, functor, arity);
	  Operation constructor = this->predicateCache[key];
	  if(constructor == nullptr)
	  {
		constructor = getConstructor(pkg, functor, arity);
		if(constructor == nullptr)
		{
			throw ClassNotFoundException("" + key);
		}
		this->predicateCache.emplace(key, constructor);
	  }
	  return constructor;
	}

	Operation PrologClassLoader::getConstructor(const wstring& pkg, const wstring& functor, const int& arity)
	{
	  return PredTable::findPredicateOp(pkg, functor, arity);
	}

	PrologClassLoader::Key::Key(const wstring& pkg, const wstring& functor, const int& arity) : pkg(pkg), functor(functor), arity(arity)
	{
	}

	int PrologClassLoader::Key::hashCode()
	{
	  int h = this->pkg.hashCode();
	  h = (h * 31) + this->functor.hashCode();
	  h = (h * 31) + this->arity;
	  return h;
	}

	bool PrologClassLoader::Key::equals(any other)
	{
	  outerInstance->if (dynamic_cast<Key*>(other) != nullptr)
	  {
		Key* b = any_cast<Key*>(other);
		return this->arity == b->arity && this->pkg == b->pkg && this->functor == b->functor;
	  }
	  return false;
	}
}
