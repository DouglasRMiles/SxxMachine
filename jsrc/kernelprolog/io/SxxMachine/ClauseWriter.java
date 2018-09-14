package prolog.io;

import SxxMachine.Term;
import prolog.terms.Const;
import prolog.terms.Expect;
import prolog.terms.Prog;

/**
 * Writer
 */
public class ClauseWriter extends CharWriter {
	public ClauseWriter(String f, Prog p) {
		super(f, p);
	}

	public ClauseWriter(Prog p) {
		super(p);
	}

	public int putElement(Term t) {
		if (null == writer)
			return 0;
		String s = null;
		if ((t.isStructure()) && "$string".equals(Expect.asStruct(t).name())) {
			Const Xs = Expect.asConst(Expect.asStruct(t).ArgDeRef(0));
			s = Term.charsToString(Xs);
		} else {
			s = t.pprint();
		}
		IO.print(writer, s);
		return 1;
	}
}
