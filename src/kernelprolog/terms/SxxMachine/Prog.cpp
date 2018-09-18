using namespace std;

#include "Prog.h"
#include "../../main/SxxMachine/KPTrail.h"
#include "ObjectStack.h"
#include "Clause.h"
#include "Unfolder.h"
#include "../../../machine/SxxMachine/Term.h"
#include "../../main/SxxMachine/Builtins.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "../../../machine/SxxMachine/Prolog.h"

namespace SxxMachine
{

	Prog *Prog::toClone()
	{
		return new Prog(trail, orStack, parent);
	}

	Prog::Prog(KPTrail *trail, ObjectStack *orStack, Prog *parent) : Source(nullptr)
	{
		this->trail = trail;
		this->orStack = orStack;
		this->parent = parent;
	}

	Prog::Prog(Clause *goal, Prog *parent) : Source(parent)
	{
		this->parent = parent;
		goal = goal->ccopy();
		this->trail = new KPTrail();
		this->orStack = new ObjectStack();
		if (nullptr != goal)
		{
			Unfolder tempVar(goal, this);
			orStack->push(&tempVar);
		}

	}

	KPTrail *Prog::getTrail()
	{
		return trail;
	}

	Prog *Prog::getParent()
	{
		return parent;
	}

int Prog::tracing = 1;

	Term *Prog::getElement()
	{
		if (nullptr == orStack)
		{
			return nullptr;
		}
		Clause *answer = nullptr;
		while (!orStack->isEmpty())
		{
			Unfolder *I = static_cast<Unfolder*>(orStack->pop());
			answer = I->getAnswer();
			if (nullptr != answer)
			{
				break;
			}
			Clause *nextgoal = I->getElement();
			if (nullptr != nextgoal)
			{
				if (I->notLastClause())
				{
					orStack->push(I);
				}
				else
				{
					I->stop();
				}
				if (nullptr == answer)
				{
					Unfolder tempVar(nextgoal, this);
					orStack->push(&tempVar);
				}
			}
		}
		Term *head;
		if (nullptr == answer)
		{
			head = nullptr;
			stop();
		}
		else
		{
			head = answer->getHead();
		}
		return head;
	}

	void Prog::stop()
	{
		if (nullptr != trail)
		{
			trail->unwind(0);
			trail = nullptr;
		}
		orStack = nullptr;
	}

	Term *Prog::firstSolution(Term *X, Term *G)
	{
		Prog *p = new_engine(X, G);
		Term *A = ask_engine(p);
		if (A != nullptr)
		{
			A = StructureTerm::S("the", {A});
			p->stop();
		}
		else
		{
			A = Prolog::aNo;
		}
		return A;
	}

	Prog *Prog::new_engine(Term *X, Term *G)
	{
		Clause *C = new Clause(X, G);
		Prog *p = new Prog(C, nullptr);
		return p;
	}

	Term *Prog::ask_engine(Prog *p)
	{
		return p->getElement();
	}

	void Prog::run()
	{
		for (;;)
		{
			Term *Answer = getElement();
			if (nullptr == Answer)
			{
				break;
			}
		}
	}
}
