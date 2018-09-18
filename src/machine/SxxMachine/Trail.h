#pragma once

#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Undoable;
	class Prolog;
}

namespace SxxMachine
{

	/**
	 * Trail stack.<br>
	 * The class <code>Trail</code> represents a trail stack.<br>
	 * Entries pushed to this trail stack must implement
	 * the <code>Undoable</code> interface.
	 * @see Undoable
	 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
	 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
	 * @version 1.0
	 */
	class Trail final
	{
		/** list of already filled buffers */
	private:
		Deque<std::vector<Undoable*>> *const buffersList;
		const int pageSize;
		/** An array of <code>Undoable</code> entries. */
		std::vector<Undoable*> buffer;
		/** the top index of this <code>Trail</code>. */
//JAVA TO C++ CONVERTER NOTE: Fields cannot have the same name as methods:
		int top_Renamed = 0;
		int base = 0;
		/** Current timestamp of the top of {@link ChoicePointStack}. */
	public:
		long long timeStamp = 0;
		Prolog *const mach;
		/** Constructs a new trail stack. */
		virtual ~Trail()
		{
			delete buffersList;
			delete mach;
		}

		Trail(Prolog *m);
		/** Constructs a new trail stack with the given page size. */
		Trail(Prolog *m, int pageSize);
		/** Constructs a new trail stack with the given page size and initial number of pages. */
		Trail(Prolog *m, int pageSize, int pages);
		/** Discards all entries. */
		void init();
		/** Pushs an entry to this <code>Trail</code>. */
		void push(Undoable *t);
		/** Pops an entry from this <code>Trail</code>. */
		Undoable *pop();
		/** Discards all entries. */
	private:
		void deleteAll();
		/** Tests if this stack has no entry. */
	public:
		bool empty();
		/** Current allocation of the trail storage array.  */
		int max();
		/** Returns the value of <code>top</code>.
		 * @see #top
		 */
		int top();
		/** Unwinds all entries after the value of <code>i</code>. */
		void unwind(int i);
	//    /** Shows the contents of this <code>Trail</code>. */
	//    public void show() {
	//	if (empty()) {
	//	    System.out.println("{trail stack is empty!}");
	//	    return;
	//	}
	//	for (int i=0; i<=top; i++) {
	//	    System.out.print("trail[" + i + "]: ");
	//	    System.out.println(buffer[i]);
	//	}
	//    }
		Prolog *getProlog();
	};

}
