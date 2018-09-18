using namespace std;

#include "BlackBoard.h"
#include "../../../machine/SxxMachine/Term.h"
#include "O1Queue.h"
#include "../../io/SxxMachine/IO.h"

namespace SxxMachine
{

	BlackBoard::BlackBoard(unordered_map map) : HashDict(map)
	{
	}

	BlackBoard *BlackBoard::toClone()
	{
		unordered_map map2 = unordered_map();
		BlackBoard *other = new BlackBoard(map2);
		map.putAll(map2);
		return other;
	}

	Term *BlackBoard::pick(const wstring &k)
	{
		if (k == "")
		{
			Iterator e = this->keySet()->begin();
			if (!e->hasNext())
			{
				return nullptr;
			}
			k = static_cast<wstring>(e->next());
			// IO.trace("$$Got key:"+k+this);
		}
		O1Queue *Q = any_cast<O1Queue*>(get(k));
		if (Q == nullptr)
		{
			return nullptr;
		}
		Term *T = any_cast<Term*>(Q->deq());
		if (Q->isEmpty())
		{
			remove(k);
			// IO.trace("$$Removed key:"+k+this);
		}
		return T;
	}

	void BlackBoard::addBack(const wstring &k, vector V)
	{
		for (vector::const_iterator e = V.begin(); e != V.end(); ++e)
		{
			// cannot be here if k==null
			add(k, (Term) *e);
		}
	}

	Term *BlackBoard::take(const wstring &k, Term *pattern)
	{
		vector V = vector();
		Term *t;
		while (true)
		{
			t = pick(k);
			if (nullptr == t)
			{
				break;
			}
			// IO.trace("$$After pick: t="+t+this);
			if (t->matches(pattern))
			{
				break;
			}
			else
			{
				V.push_back(t);
			}
		}
		addBack(k, V);
		return t;
	}

	void BlackBoard::add(const wstring &k, Term *value)
	{
		O1Queue *Q = any_cast<O1Queue*>(get(k));
		if (Q == nullptr)
		{
			Q = new O1Queue();
			put(k, Q);
		}
		if (!Q->enq(value))
		{
			IO::errmes("O1Queue full, key:" + k);
		}
		// IO.trace("$$Added key/Ref:"+k+"/"+value+"=>"+this);
	}

	Iterator *BlackBoard::toEnumerationFor(const wstring &k)
	{
		O1Queue *Q = any_cast<O1Queue*>(get(k));
		vector V = (Q == nullptr) ? vector() : Q->toVector();
		return V.begin();
	}

	Iterator *BlackBoard::toEnumeration()
	{
		return new BBoardEnumerator(this->keySet()->begin());
	}

	BBoardEnumerator::BBoardEnumerator(Iterator *EH)
	{
		EQ = nullptr;
		this->EH = EH; // elements();
	}

	bool BBoardEnumerator::hasNext()
	{
		if ((EQ == nullptr || !EQ->hasNext()) && EH->hasNext())
		{
			EQ = (static_cast<O1Queue*>(EH->next()))->toEnumeration();
		}
		return (EQ != nullptr && EQ->hasNext());
	}

	any BBoardEnumerator::next()
	{
		if (hasNext())
		{
			return EQ->next();
		}
		throw NoSuchElementException("BBoardEnumerator");
	}

	void BBoardEnumerator::remove()
	{
	}
}
