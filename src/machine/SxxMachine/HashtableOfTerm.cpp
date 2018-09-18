using namespace std;

#include "HashtableOfTerm.h"
#include "Term.h"
#include "TermData.h"

namespace SxxMachine
{

	HashtableOfTerm::HashtableOfTerm() : termMap(unordered_map<Term*, Term*>())
	{
	}

	HashtableOfTerm::HashtableOfTerm(int initialCapacity) : termMap(unordered_map<Term*, Term*>(initialCapacity))
	{
	}

	bool HashtableOfTerm::isHashtableOfTerm(any hash)
	{
	  return dynamic_cast<HashtableOfTerm*>(hash) != nullptr;
	}

	bool HashtableOfTerm::containsKey(Term *key)
	{
	  return termMap.find(key) != termMap.end();
	}

	void HashtableOfTerm::clear()
	{
	  termMap.clear();
	}

	Term *HashtableOfTerm::get(Term *key)
	{
	  return termMap[key];
	}

	Term *HashtableOfTerm::put(Term *key, Term *value)
	{
	  return termMap.emplace(key, value);
	}

	void HashtableOfTerm::remove(Term *key)
	{
	  termMap.erase(key);
	}

	int HashtableOfTerm::size()
	{
	  return termMap.size();
	}

	Set<Term*> *HashtableOfTerm::keySet()
	{
	  return termMap.keySet();
	}

	bool HashtableOfTerm::isEmpty()
	{
	  return termMap.empty();
	}

	Set<unordered_map::Entry<Term*, Term*>*> *HashtableOfTerm::entrySet()
	{
	  return termMap.entrySet();
	}

	HashtableOfTerm *HashtableOfTerm::copyDeep(IdentityHashMap<any, Term*> *copyHash)
	{
	  return copyDeep(this, copyHash);
	}

	HashtableOfTerm *HashtableOfTerm::copyDeep(HashtableOfTerm *src, IdentityHashMap<any, Term*> *copyHash)
	{
	  int deeply = Term::COPY_DEEPLY;
	  HashtableOfTerm *hm = new HashtableOfTerm();
	  for (auto e : src)
	  {
		Term *val = e.second::copy(copyHash, deeply);
		if ((val->isFFIObject()))
		{
		  Term *o = val;
		  any oobj = o->toJava();
		  if (HashtableOfTerm::isHashtableOfTerm(oobj))
		  {
			val = TermData::FFIObject(copyDeep(any_cast<HashtableOfTerm*>(oobj), copyHash));

		  }
		}
		hm->put(e.first::copy(copyHash, deeply), val);
	  }
	  return hm;
	}

	HashtableOfTerm *HashtableOfTerm::copyShallow(HashtableOfTerm *src)
	{
	  HashtableOfTerm *hm = new HashtableOfTerm();
	  for (auto e : src)
	  {
		Term *val = e.second;
		if ((val->isFFIObject()))
		{
		  Term *o = val;
		  any oobj = o->toJava();
		  if (HashtableOfTerm::isHashtableOfTerm(oobj))
		  {
			val = TermData::FFIObject(copyShallow(any_cast<HashtableOfTerm*>(oobj)));
		  }
		}
		hm->put(e.first, val);
	  }
	  return hm;
	}

	HashtableOfTerm *HashtableOfTerm::copyShallow()
	{
	  return copyShallow(this);
	}
}
