using namespace std;

#include "KPTerm.h"
#include "Term.h"
#include "../../kernelprolog/main/SxxMachine/KPTrail.h"
#include "../../kernelprolog/terms/SxxMachine/Clause.h"
#include "Prolog.h"
#include "../../kernelprolog/terms/SxxMachine/Copier.h"
#include "../../kernelprolog/main/SxxMachine/Builtins.h"
#include "../../kernelprolog/terms/SxxMachine/VarNumberer.h"
#include "../../kernelprolog/terms/SxxMachine/Prog.h"
#include "Nonvar.h"
#include "ListTerm.h"
#include "StructureTerm.h"
#include "../../kernelprolog/terms/SxxMachine/Expect.h"
#include "SymbolTerm.h"
#include "../../kernelprolog/terms/SxxMachine/Var.h"
#include "../../kernelprolog/terms/SxxMachine/Source.h"
#include "StringBuilder.h"

namespace SxxMachine
{

	void KPTerm::oopsy()
	{
//JAVA TO C++ CONVERTER TODO TASK: This exception's constructor requires an argument:
//ORIGINAL LINE: new Exception().printStackTrace();
		(runtime_error())->printStackTrace();
	}

	void KPTerm::soopsy()
	{
//JAVA TO C++ CONVERTER TODO TASK: This exception's constructor requires an argument:
//ORIGINAL LINE: new Exception().printStackTrace();
		(runtime_error())->printStackTrace();
	}

	int KPTerm::hashCode()
	{
		return termHashCode();
	}

	bool KPTerm::equals(any o)
	{
		return o == this;
	}

	wstring KPTerm::toString()
	{
		return pprint();
	}

	Term* KPTerm::dref()
	{ // synchronized !!!
		return static_cast<Term*>(this);
	}

	bool KPTerm::DO_Unify(Term* that, KPTrail* trail)
	{
		if(that == this)
		{
			return true;
		}
		Term* thisd = dref();
		Term* thatd = that->dref();
		if(thatd == thisd)
		{
			return true;
		}
		return thisd->Unify_TO(thatd, trail);
	}

	void KPTerm::undo()
	{ // does nothing
	}

	Term* KPTerm::carTokenOrSelf()
	{
		return static_cast<Term*>(this);
	}

	Term* KPTerm::toTerm()
	{
		return static_cast<Term*>(this);
	}

	Clause* KPTerm::toClause()
	{
		return new Clause(static_cast<Term*>(this), Prolog::True);
	}

	bool KPTerm::isClause()
	{
		return false;
	}

	Term* KPTerm::fromString(const wstring& s)
	{
		return Clause::clauseFromString(s)->toTerm();
	}

	bool KPTerm::matches(Term* that)
	{
		KPTrail tempVar();
		return matches(that, &tempVar);
	}

	bool KPTerm::matches(Term* that, KPTrail* trail)
	{
		int oldtop = trail->size();
		bool ok = DO_Unify(that, trail);
		trail->unwind(oldtop);
		return ok;
	}

	Term* KPTerm::matching_copy(Term* that)
	{
		KPTrail* trail = new KPTrail();
		bool ok = DO_Unify(that, trail);
		// if(ok) that=that.copy();
		if(ok)
		{
			that = copy();
		}
		trail->unwind(0);
		return (ok) ? that : nullptr;
	}

	Term* KPTerm::reaction(Term* agent)
	{
		Term* T = agent->action(static_cast<Term*>(this));
		return T;
	}

	Term* KPTerm::action(Term* that)
	{
		return that;
	}

	Term* KPTerm::copy()
	{
		Copier tempVar();
		return reaction(&tempVar);
	}

	Term* KPTerm::varsOf()
	{
		Copier tempVar();
		return (&tempVar)->getMyVars(static_cast<Term*>(this));
	}

	Term* KPTerm::numbervars()
	{
		VarNumberer tempVar();
		return copy()->reaction(static_cast<Term*>(&tempVar));
	}

	wstring KPTerm::toUnquoted()
	{
		Term* t = numbervars();
		if(t == this)
		{
			return pprint();
		}
		return t->pprint();
	}

	wstring KPTerm::getKey()
	{
		return toUnquoted();
	}

	any KPTerm::toObject()
	{
		return dref();
	}

	int KPTerm::exec()
	{

		return -1;
	}

	int KPTerm::exec(Prog* p)
	{
		// IO.println("this should be overriden, prog="+p);
		return -1;
	}

	Nonvar* KPTerm::stringToChars(const wstring& s)
	{
		if(0 == s.length())
		{
			return Prolog::Nil;
		}
		ListTerm* l = CONS(TermData::Long((s[0])), Prolog::Nil);
		Term* curr = l;
		for(int i = 1; i < s.length(); i++)
		{
			StructureTerm* tail = StructureTerm::createCons(Long((s[i])), Prolog::Nil);
			curr->setArg(1, tail);
			curr = tail;
		}
		return l;
	}

	Nonvar* KPTerm::toChars()
	{
		return stringToChars(toUnquoted());
	}

	wstring KPTerm::charsToString(Nonvar* Cs)
	{
		StringBuilder* s = new StringBuilder("");

		while(!(Cs->isNil()))
		{
			if(!(Cs->isCons()))
			{
				return "";
			}
			Nonvar* head = static_cast<Nonvar*>(Expect::asCons(Cs)->ArgDeRef(0));

			if(!(head->isNumber()))
			{
				return "";
			}
			char c = static_cast<char>(Expect::asInt(head)->longValue());
			s->append(c);
			Cs = static_cast<Nonvar*>(Expect::asCons(Cs)->ArgDeRef(1));
		}

		return s->toString();
	}

	bool KPTerm::isCons()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isNil()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isBuiltin()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isConj()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isLong()
	{
		// TODO Auto-generated method stub
		return (static_cast<Term*>(this))->isInteger();
	}

	int KPTerm::intValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	bool KPTerm::isConst()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isStructure()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isTrueProc()
	{
		return false;
	}

	bool KPTerm::isNumber()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isFloat()
	{
		return false;
	}

	bool KPTerm::isSystemObject()
	{
		return false;
	}

	bool KPTerm::isFluent()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isObject()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isVar()
	{
		// TODO Auto-generated method stub
		return false;
	}

	bool KPTerm::isCharReader()
	{
		// TODO Auto-generated method stub
		return false;
	}

	Term* KPTerm::toValue()
	{
		// TODO Auto-generated method stub
		return static_cast<Term*>(this);
	}

	double KPTerm::doubleValue()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	SymbolTerm* KPTerm::asConst()
	{
		// TODO Auto-generated method stub
		return static_cast<SymbolTerm*>(this);
	}

	Var* KPTerm::toVar()
	{
		// TODO Auto-generated method stub
		return static_cast<Var*>(this);
	}

	Term* KPTerm::ArgDeRef(const int& i)
	{
		return Expect::asStruct(static_cast<Term*>(this))->ArgDeRef(i);
	}

	bool KPTerm::isFunctor(const wstring& string)
	{
		// TODO Auto-generated method stub
		return name() == string;
	}

	Source* KPTerm::asSource()
	{
		// TODO Auto-generated method stub
		return static_cast<Source*>(this);
	}
}
