using namespace std;

#include "PrologException.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/TermData.h"
#include "StringBuilder.h"

namespace SxxMachine
{
	using StaticPred = SxxMachine::TermData::StaticPred;

	PrologException::PrologException()
	{
	}

	PrologException::PrologException(const wstring& s) : RuntimeException(s)
	{
	}

	std::vector<Operation> PrologException::getPrologStackTrace()
	{
	  return this->prologStackElement.empty() ? nullptr : this->prologStackElement.clone();
	}

	void PrologException::setPrologStackTrace(std::vector<Operation>& stack)
	{
	  this->prologStackElement = stack;
	}

	bool PrologException::hasPrologStackTrace()
	{
	  return this->prologStackElement.size() > 0;
	}

	void PrologException::printStackTrace(PrintStream* s)
	{
	  RuntimeException::printStackTrace(s);
	  if(this->prologStackElement.size() > 0 && this->prologStackElement.size() > 0)
	  {
		s->println("Prolog stack trace:");
		for(auto o : this->prologStackElement)
		{
		  s->println(printOp(o));
		}
	  }
	}

	StringBuilder* PrologException::printOp(Operation o)
	{
	  StringBuilder* sb = new StringBuilder("\tat ");
	  if(o->getClass() == StaticPred::typeid)
	  {
		StaticPred* o2 = static_cast<StaticPred*>(o);
//JAVA TO C++ CONVERTER TODO TASK: There is no native C++ equivalent to 'toString':
		o2->toString(sb);
		return sb;
	  }
	  sb->append(o->getClass().getName());
	  int i = sb->rfind(".");
	  if(i >= 0)
	  {
		sb->setCharAt(i, ':');
	  }
	  return sb;
	}

	void PrologException::printStackTrace(PrintWriter* s)
	{
	  RuntimeException::printStackTrace(s);
	  if(this->prologStackElement.size() > 0 && this->prologStackElement.size() > 0)
	  {
		s->println("Prolog stack trace:");
		for(auto o : this->prologStackElement)
		{
		  s->println(printOp(o));
		}
	  }
	}
}
