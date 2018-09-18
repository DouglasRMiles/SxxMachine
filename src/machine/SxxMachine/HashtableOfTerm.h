#pragma once

#include <unordered_map>
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
}

namespace SxxMachine
{


	/**
	 * <code>Hashtable&lt;Term,Term&gt;</code>.<br>
	 * <font color="red">This document is under construction.</font>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class HashtableOfTerm
	{
	  //private static final long serialVersionUID = 1L;
  public:
	  const std::unordered_map<Term*, Term*> termMap;

	  HashtableOfTerm();

	  HashtableOfTerm(int initialCapacity);

	  static bool isHashtableOfTerm(std::any hash);

	  virtual bool containsKey(Term *key);

	  virtual void clear();

	  virtual Term *get(Term *key);

	  virtual Term *put(Term *key, Term *value);

	  virtual void remove(Term *key);

	  virtual int size();

	  virtual Set<Term*> *keySet();

	  virtual bool isEmpty();

  private:
	  Set<std::unordered_map::Entry<Term*, Term*>*> *entrySet();

  public:
	  virtual HashtableOfTerm *copyDeep(IdentityHashMap<std::any, Term*> *copyHash);

  private:
	  static HashtableOfTerm *copyDeep(HashtableOfTerm *src, IdentityHashMap<std::any, Term*> *copyHash);


	  static HashtableOfTerm *copyShallow(HashtableOfTerm *src);

  public:
	  virtual HashtableOfTerm *copyShallow();

	};

}
