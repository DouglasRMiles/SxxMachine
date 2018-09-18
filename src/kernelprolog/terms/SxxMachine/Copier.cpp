using namespace std;

#include "Copier.h"
#include "../../fluents/SxxMachine/HashDict.h"
#include "../../../machine/SxxMachine/Term.h"
#include "Var.h"
#include "../../../machine/SxxMachine/Nonvar.h"
#include "../../../machine/SxxMachine/StructureTerm.h"
#include "Expect.h"
#include "../../io/SxxMachine/IO.h"
#include "../../../machine/SxxMachine/SymbolTerm.h"

namespace SxxMachine
{

	Copier::Copier()
	{
		dict = new HashDict();
	}

	Term* Copier::action(Term* place)
	{

		if(place->isVar())
		{
			Var* root = any_cast<Var*>(dict->get(place));
			if(nullptr == root)
			{
				root = V();
				dict->put(place, root);
			}
			place = root;
		}

		return place;
	}

	Term* Copier::copyMe(Term* that)
	{
		return that->reaction(this);
	}

	vector Copier::EnumerationToVector(Iterator* e)
	{
		vector V = vector();
		while(e->hasNext())
		{
			V.push_back(e->next());
			e++;
		}
		return V;
	}

	vector Copier::ConsToVector(Nonvar* Xs)
	{
		vector V = vector();
		Term* t = Xs;
		for(;;)
		{
			if(t->isNil())
			{
				break;
			} else if(t->isCons())
			{
				StructureTerm* c = Expect::asCons(t);
				V.push_back(c->ArgDeRef(0));
				t = c->ArgDeRef(1);
			} else if(t->isConst())
			{
				V.push_back(t);
				break;
			} else
			{
				V.clear();
				IO::errmes("bad Cons in ConsToVector: " + t);
				break;
			}
		}
		// IO.mes("V="+V);
		return V;
	}

	Term* Copier::toFun(SymbolTerm* c, Iterator* e)
	{
		vector V = EnumerationToVector(e);
		int arity = V.size();
		if(arity == 0)
		{
			return c;
		}
		StructureTerm* f = StructureTerm::S(c->name(), arity);
		for(int i = 0; i < arity; i++)
		{
			f->setArg(i, static_cast<Term*>(V[i]));
		}
		return f;
	}

	StructureTerm* Copier::VectorToFun(vector V)
	{
		SymbolTerm* f = static_cast<SymbolTerm*>(V[0]);
		int arity = V.size() - 1;
		StructureTerm* T = StructureTerm::S(f->name(), arity);
		for(int i = 0; i < arity; i++)
		{
			T->setArg(i, static_cast<Term*>(V[i + 1]));
		}
		return T;
	}

SymbolTerm* const  Copier::anAnswer = TermData::SYM("answer");

	Term* Copier::getMyVars(Term* that)
	{
		/* Term */
		that->reaction(this);
		return toFun(anAnswer, dict->keySet()->begin());
	}
}
