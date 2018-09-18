#pragma once

#include <vector>
#include <list>
#include <iostream>
#include <stdexcept>
#include <any>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Term;
}

namespace SxxMachine
{

	/**
	 * Internal database for dynamic predicates.<br>
	 *
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.1
	 */
	class InternalDatabase
	{

  protected:
	  static constexpr int DEFAULT_SIZE = 1000000;

	  /** Maximum size of enties. Initial size is <code>1000000</code>. */
		int maxContents = 0;
		/** An array of <code>Term</code> entries. */
		std::vector<Term*> buffer;
		/* For GC */
		/** A list of reusable entry indices. */
		const std::list<int> reusableIndices;
		/** the top index of this <code>InternalDatabase</code>. */
		int top = 0;
		/** Constructs a new internal dababase. */
	public:
		InternalDatabase();
		/** Constructs a new internal dababase with the given size. */
		InternalDatabase(int n);

	   virtual InternalDatabase *copyInternalDatabase(bool deepCopy, IdentityHashMap<std::any, Term*> *copyHash);

	private:
		InternalDatabase(InternalDatabase *src, bool deepCopy, IdentityHashMap<std::any, Term*> *copyHash);
		/** Inserts an entry to this <code>InternalDatabase</code>. */
	public:
		virtual int insert(Term *t);
		/** Returns an entry with the given index from this <code>InternalDatabase</code>. */
		virtual Term *get(int i);
		/** Erases an entry with the given index from this <code>InternalDatabase</code>. */
		virtual Term *erase(int i);
		/** Tests if this has no entry. */
	private:
		bool empty();

		/** Shows the contents of this <code>InternalDatabase</code>. */
	public:
		virtual void show();
	};

}
