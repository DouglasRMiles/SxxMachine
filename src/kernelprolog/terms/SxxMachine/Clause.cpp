using namespace std;

#include "Clause.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../fluents/SxxMachine/HashDict.h"
#include "../../io/SxxMachine/Parser.h"
#include "../../io/SxxMachine/IO.h"
#include "../../../machine/SxxMachine/Prolog.h"
#include "Expect.h"
#include "../../main/SxxMachine/Builtins.h"
#include "../../main/SxxMachine/KPTrail.h"
#include "Var.h"
#include "PseudoVar.h"

namespace SxxMachine
{

	Clause::Clause(Term *s, std::vector<Term*> &args, HashDict *dict, bool ground, const wstring &fname, int begins_at, int ends_at) : StructureTerm(s,args)
	{
		this->dict = dict;
		this->ground = ground;
		this->fname = fname;
		this->begins_at = begins_at;
		this->ends_at = ends_at;
	}

	Clause *Clause::toClone()
	{
		//
	   try
	   {
	  return static_cast<Clause*>(clone());
	   }
	catch (const CloneNotSupportedException &e)
	{
	  // TODO Auto-generated catch block
	  e->printStackTrace();
	  return new Clause(functor_Renamed,argz, dict, ground, fname, begins_at, ends_at);
	}
	}

	Clause::Clause(Term *head, Term *body) : StructureTerm(Prolog::SYM_NECK, head, body)
	{
	}

	Clause::Clause(const wstring &s) : StructureTerm(":-")
	{
		Clause *C = clauseFromString(s);
		// IO.mes("CLAUSE:"+C.pprint()+"\nDICT:"+C.dict);
		this->argz = C->argz;
		this->dict = C->dict;
		this->ground = C->ground;
	}

	Clause *Clause::clauseFromString(const wstring &s)
	{
		return Parser::clsFromString(s);
	}

	Clause *Clause::toGoal()
	{
		Clause *G = new Clause(varsOf(), getHead());
		G->dict = dict;
		G->checkIfGround();
		IO::trace("conversion from clause to goal ignores body of: " + pprint());
		return G;
	}

	Clause *Clause::goalFromString(const wstring &line)
	{
		IO::trace("read string: <" + line + ">");

		if ("" == line)
		{
			line = Prolog::anEof->name();
		}
		else if (0 == line.length())
		{
			return nullptr;
		}

		Clause *C = clauseFromString(line);
		if (nullptr == C)
		{
			IO::errmes("warning (null Clause):" + line);
			return nullptr;
		}

		// IO.trace("got goal:\n"+C.toGoal()); //OK
		return C->toGoal();
	}

	void Clause::checkIfGround()
	{
		ground = varsOf()->arityOrType() == 0;
	}

	void Clause::setFile(const wstring &fname, int begins_at, int ends_at)
	{
		this->fname = fname.intern();
		this->begins_at = begins_at;
		this->ends_at = ends_at;
	}

	bool Clause::provenGround()
	{
		return ground;
	}

	wstring Clause::Clause2String(Clause *c)
	{
		Term *h = c->getHead();
		Term *t = c->getBody();
		if (t->isConj())
		{
			return h + ":-" + Expect::asConj(t)->conjToString();
		}
		return h->pprint() + ":-" + t->pprint();
	}

	wstring Clause::pprint()
	{
		return pprint(false);
	}

	wstring Clause::pprint(bool replaceAnonymous)
	{
		wstring s = Clause2String(this->cnumbervars(replaceAnonymous));
		// if(fname!=null) s="%% "+fname+":"+begins_at+"-"+ends_at+"\n"+s;
		return s;
	}

	Clause *Clause::toClause()
	{ // overrides toClause in Term
		return this;
	}

	Clause *Clause::cnumbervars(bool replaceAnonymous)
	{
		if (dict == nullptr)
		{
			return static_cast<Clause*>(numbervars());
		}
		if (provenGround())
		{
			return this;
		}
		KPTrail *trail = new KPTrail();
		Iterator e = dict->keySet()->begin();

		while (e->hasNext())
		{
			any X = e->next();
			if (dynamic_cast<wstring>(X) != nullptr)
			{
				Var *V = any_cast<Var*>(dict->get(X));
				long long occNb = Expect::asInt(any_cast<Term*>(dict->get(V)))->longValue();
				wstring s = (occNb < 2 && replaceAnonymous) ? "_" : any_cast<wstring>(X);
				// bug: occNb not accurate when adding artif. '[]' head
				PseudoVar tempVar(s);
				V->DO_Unify(&tempVar, trail);
			}
			e++;
		}
		Clause *NewC = static_cast<Clause*>(numbervars());
		trail->unwind(0);
		return NewC;
	}

	Term *Clause::toTerm()
	{
		if (getBody()->isTrueProc())
		{
			return getHead();
		}
		return this;
	}

	Clause *Clause::ccopy()
	{
		if (ground)
		{
			return this;
		}
		Clause *C = static_cast<Clause*>(copy());
		C->dict = nullptr;
		C->ground = ground;
		return C;
	}

	Term *Clause::getHead()
	{
		return argz[0]->dref();
	}

	Term *Clause::getBody()
	{
		return argz[1]->dref();
	}

	Term *Clause::getFirst()
	{
		Term *body = getBody();
		if (body->isConj())
		{
			return Expect::asConj(body)->argz[0]->dref();
		}
		else if (body->isTrueProc())
		{
			return nullptr;
		}
		else
		{
			return body;
		}
	}

	Term *Clause::getRest()
	{
		Term *body = getBody();
		if (body->isConj())
		{
			return Expect::asConj(body)->argz[1]->dref();
		}
		else
		{
			return Prolog::True;
		}
	}

	Term *Clause::appendConj(Term *x, Term *y)
	{
		y = y->dref();
		if (x->isTrueProc())
		{
			return y;
		}
		if (y->isTrueProc())
		{
			return x; // comment out if using getState
		}
		if (x->isConj())
		{
			Term *curr = Expect::asConj(x)->argz[0]->dref();
			Term *cont = appendConj(Expect::asConj(x)->argz[1], y);
			// curr.getState(this,cont);
			return AND(curr, cont);
		}
		else
		{
			return AND(x, y);
		}
	}

	Clause *Clause::unfold(Clause *const that, KPTrail *trail)
	{
		Clause *result = nullptr;
		Term *first = getFirst();
		Term *thatHead = that->getHead();
		if (first != nullptr && thatHead->matches(first, trail))
		{

			Clause * const that2 = that->ccopy();

			Term * const hthat2 = that2->getHead();
			bool did = hthat2->DO_Unify(first, trail);
			assert(did);

			Term *conj = appendConj(that2->getBody(), getRest());
			result = new Clause(getHead(), conj);
		}
		return result;
	}

	Clause *Clause::unfold_with_goal(Clause *goal, KPTrail *trail)
	{
		return goal->unfold(this, trail);
	}

	wstring Clause::getKey()
	{
		return getHead()->getKey();
	}

	bool Clause::isClause()
	{
		return true;
	}
}
