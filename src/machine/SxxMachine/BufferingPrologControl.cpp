

#include "BufferingPrologControl.h"
#include "Term.h"
#include "PrologMachineCopy.h"
#include "SymbolTerm.h"
#include "Prolog.h"
#include "TermData.h"
#include "../../kernelprolog/main/SxxMachine/Builtins.h"
#include "../../exceptions/SxxMachine/StopEngineException.h"

namespace SxxMachine
{
using namespace std;

	BufferingPrologControl::BufferingPrologControl()
	{
	}

	BufferingPrologControl::BufferingPrologControl(PrologMachineCopy *pmc) : PrologControl(pmc)
	{
	}

	bool BufferingPrologControl::initialize(vector<wstring> &pkgs)
	{
	  Term *goal = SymbolTerm::intern("true");
	  Term *head = Prolog::Nil;
	  for (int i = pkgs->length - 1; 0 <= i; i--)
	  {
		head = TermData::CONS(SymbolTerm::intern(pkgs[i]), head);
	  }
	  return execute(Prolog::BUILTIN, "initialization", {head, goal});
	}

	bool BufferingPrologControl::execute(const wstring &pkg, const std::wstring &functor, std::vector<Term> &args)
	{
	  return once(pkg, functor, {args})->size() > 0;
	}

	Term *BufferingPrologControl::once(const std::wstring &pkg, const std::wstring &functor, Term *arg)
	{
	  setPredicate(pkg, functor, {arg});
	  setResultTemplate(arg);
	  return static_cast<Term*>(run(1) ? this->resBuffer[0] : nullptr);
	}

	std::vector<Term*> BufferingPrologControl::once(const wstring &pkg, const wstring &functor, vector<Term> &args)
	{
	  setPredicate(pkg, functor, {args});
	  setResultTemplate(args);
	  return static_cast<std::vector<Term*>>(run(1) ? this->resBuffer[0] : nullptr);
	}

	vector<Term*> BufferingPrologControl::all(const wstring &pkg, const wstring &functor, Term *arg)
	{
	  setPredicate(pkg, functor, {arg});
	  setResultTemplate(arg);
	  run(numeric_limits<int>::max());
	  return this->resBuffer;
	}

	vector<std::vector<Term*>> BufferingPrologControl::all(const wstring &pkg, const wstring &functor, vector<Term> &args)
	{
	  setPredicate(pkg, functor, {args});
	  setResultTemplate(args);
	  run(numeric_limits<int>::max());
	  return this->resBuffer;
	}

	void BufferingPrologControl::setResultTemplate(Term *t)
	{
	  this->resTemplate = std::vector<Term*> {t};
	  this->resSingle = true;
	}

	void BufferingPrologControl::setResultTemplate(std::vector<Term*> &t)
	{
	  this->resTemplate = t;
	  this->resSingle = false;
	}

	bool BufferingPrologControl::run(int newLimit)
	{
	  this->resLimit = newLimit;
	  this->resBuffer = vector(min(newLimit, 16));
	  this->engineStopped = (this->resLimit <= this->resBuffer.size());
	  executePredicate();
	  return 0 < this->resBuffer.size();
	}

	bool BufferingPrologControl::isEngineStopped()
	{
	  return this->engineStopped || this->resLimit <= this->resBuffer.size();
	}

	void BufferingPrologControl::success()
	{
	  std::vector<Term*> r(this->resTemplate.size());
	  for (int i = 0; i < this->resTemplate.size(); i++)
	  {
		r[i] = this->engine->copy(this->resTemplate[i]);
	  }
	  this->resBuffer.push_back(this->resSingle ? r[0] : r);
	  this->engineStopped = (this->resLimit <= this->resBuffer.size());
	  if (this->engineStopped)
	  {
		throw StopEngineException("success");
	  }
	}

	void BufferingPrologControl::fail()
	{
	  this->resLimit = 0;
	  this->engineStopped = (this->resLimit <= this->resBuffer.size());
	  if (this->engineStopped)
	  {
		throw StopEngineException("failure");
	  }
	}
}
