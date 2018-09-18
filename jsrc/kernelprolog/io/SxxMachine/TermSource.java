package SxxMachine;

/**
 * Maps a Term to an Source for iterating over its arguments
 */
public class TermSource extends Source {
	public TermSource(Nonvar val, Prog p) {
		super(p);
		this.val = val;
		pos = 0;
	}

	private Nonvar val;

	private int pos;

	public Term getElement() {
		Term X;
		if (null == val)
			X = null;
		else if (!(val.isStructure())) {
			X = val;
			val = null;
		} else if (0 == pos)
			X = TermData.SYM(val.name());
		else if (pos <= Expect.asStruct(val).arityOrType())
			X = Expect.asStruct(val).ArgDeRef(pos - 1);
		else {
			X = null;
			val = null;
		}
		pos++;
		return X;
	}

	public void stop() {
		val = null;
	}
}
