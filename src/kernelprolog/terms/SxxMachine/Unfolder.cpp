using namespace std;

#include "Unfolder.h"
#include "Clause.h"
#include "Prog.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Init.h"
#include "../../io/SxxMachine/IO.h"
#include "../../main/SxxMachine/Builtins.h"

namespace SxxMachine
{

	Unfolder::Unfolder(const int& oldtop, Iterator* e, Clause* goal, Prog* prog) : Source(nullptr)
	{
		this->oldtop = oldtop;
		this->e = e;
		this->goal = goal;
		this->prog = prog;
	}

	Unfolder* Unfolder::toClone()
	{
		return new Unfolder(oldtop, e, goal, prog);
	}

	Unfolder::Unfolder(Clause* g, Prog* p) : Source(p)
	{
		this->goal = g;
		this->prog = p;
		this->e = nullptr;
		trace_goal(g);
		reduceBuiltins();
		if(nullptr != goal)
		{
			Term* first = goal->getFirst();
			if(nullptr != first)
			{
				oldtop = prog->getTrail()->size();
				this->e = Init::default_db->toEnumerationFor(first);
				if(!e->hasNext())
				{
					trace_nomatch(first);
				}
			}
		} else
		{
			trace_failing(g);
		}
	}

	void Unfolder::trailMe(Prog* p)
	{
		// IO.mes("not trailing"+this);
	};

	Clause* Unfolder::getAnswer()
	{
		if(nullptr != goal && goal->getBody()->isTrueProc())
		{
			return goal->ccopy();
		} else
		{
			return nullptr;
		}
	}

	bool Unfolder::notLastClause()
	{
		return (nullptr != e) && e->hasNext();
	}

	void Unfolder::reduceBuiltins()
	{
		for(;;)
		{
			Term* first = goal->getFirst();
			if(nullptr == first)
			{
				break; // cannot reduce further
			}
			if(first->isConj())
			{ // advances to next (possibly) inline builtin
				goal = new Clause(goal->getHead(), Clause::appendConj(first, goal->getRest()));
				first = goal->getFirst();
			}

			int ok = first->exec(prog); // (possibly) executes builtin

			switch(ok)
			{

			case -1: // nothing to do, this is not a builtin
				break;

			case 1: // builtin suceeds
				// IO.mes("advancing: "+goal);
				goal = new Clause(goal->getHead(), goal->getRest());
				continue; // advance

			case 0: // builtin fails
				goal = nullptr;
				break; // get out

			default: // unexpected code: programming error
				IO::errmes("Bad return code:" + to_string(ok) + ") in builtin: " + first);
				goal = nullptr;
				break;
			}
			// IO.mes("leaving reduceBuiltins: "+goal);
			break; // leaves loop
		}
	}

	Clause* Unfolder::getElement()
	{
		if(nullptr == e)
		{
			return nullptr;
		}
		Clause* unfolded_goal = nullptr;
		while(e->hasNext())
		{
			Term* T = static_cast<Term*>(e->next());
			if(!(T->isClause()))
			{
				continue;
			}
			// resolution step, over goal/resolvent of the form:
			// Answer:-G1,G2,...,Gn.
			prog->getTrail()->unwind(oldtop);
			// unify() happens here !!!
			unfolded_goal = T->toClause()->unfold_with_goal(goal, prog->getTrail());
			if(nullptr != unfolded_goal)
			{
				break;
			}
			e++;
		}
		return unfolded_goal;
	}

	void Unfolder::stop()
	{
		e = nullptr;
	}

	void Unfolder::trace_goal(Clause* g)
	{
		switch(Prog::tracing)
		{
		case 2:
			IO::println(">>>: " + g->getFirst());
			break;
		case 3:
			IO::println(">>>: " + g->pprint());
			break;
		}
	}

	void Unfolder::trace_failing(Clause* g)
	{
		switch(Prog::tracing)
		{
		case 2:
			IO::println("FAILING CALL IN<<<: " + g->getFirst());
			break;
		case 3:
			IO::println("FAILING CALL IN<<<: " + g->pprint());
			break;
		}
	}

	void Unfolder::trace_nomatch(Term* first)
	{
		if(Prog::tracing > 0)
		{
			IO::println("*** UNDEFINED CALL: " + first->pprint());
		}
	}

	wstring Unfolder::pprint()
	{
		return (nullptr == goal) ? "{Unfolder}" : "{Unfolder=> " + goal->pprint() + "}";
	}
}
