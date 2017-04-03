package com.googlecode.prolog_cafe.lang;

import java.util.ArrayDeque;
import java.util.Deque;

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
public final class Trail {
	/** list of already filled buffers */
	private final Deque<Undoable[]> buffersList;

	private final int pageSize;
	/** An array of <code>Undoable</code> entries. */
	private Undoable[] buffer;

	/** the top index of this <code>Trail</code>. */
	private int top;

	private int base;

	/** Current timestamp of the top of {@link ChoicePointStack}. */
	long timeStamp;

	/** Constructs a new trail stack. */
	public Trail() {
		this(2048);
	}

	/** Constructs a new trail stack with the given page size. */
	public Trail(int pageSize) {
		this.pageSize = pageSize;
		buffersList = new ArrayDeque<Undoable[]>(1000);
		buffer = new Undoable[pageSize];
		top = -1;
		base = 0;
	}

	/** Constructs a new trail stack with the given page size and initial number of pages. */
	public Trail(int pageSize, int pages) {
		this.pageSize = pageSize;
		buffersList = new ArrayDeque<Undoable[]>(pages);
		buffer = new Undoable[pageSize];
		top = -1;
		base = 0;
	}

	/** Discards all entries. */
	public void init() { deleteAll(); }

	/** Pushs an entry to this <code>Trail</code>. */
	public void push(Undoable t) {
		if (++top >= pageSize) {
			buffersList.addLast(buffer);
			buffer = new Undoable[pageSize];
			top = 0;
			base+=pageSize;
		}
		buffer[top] = t;
	}

	/** Pops an entry from this <code>Trail</code>. */
	public Undoable pop() {
		Undoable t = buffer[top];
		buffer[top--] = null;
		if (top<0 && base>0){
			buffer = buffersList.pollLast();
			top = buffer.length-1;
			base -= pageSize;
		}
		return t;
	}

	/** Discards all entries. */
	private void deleteAll() {
		buffersList.clear();
		buffer = new Undoable[buffer.length];
		top = -1;
		base = 0;
	}

	/** Tests if this stack has no entry. */
	public boolean empty() {
		return base==0 && top == -1;
	}

	/** Current allocation of the trail storage array.  */
	public int max() { return base+pageSize; }

	/** Returns the value of <code>top</code>.
	 * @see #top
	 */
	public int top() { return base + top; }

	/** Unwinds all entries after the value of <code>i</code>. */
	public void unwind(int i) {
		while (base + top > i) {
			Undoable t = buffer[top];
			buffer[top--] = null;
			if (top<0 && base>0){
				buffer = buffersList.pollLast();
				top = pageSize-1;
				base -= pageSize;
			}
			t.undo();
		}
	}

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
}

