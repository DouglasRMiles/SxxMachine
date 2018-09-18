package SxxMachine;

import SxxMachine.Term;
import SxxMachine.SymbolTerm;
import SxxMachine.Expect;
import SxxMachine.Prog;

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
			SymbolTerm Xs = Expect.asConst(Expect.asStruct(t).ArgDeRef(0));
			s = Term.charsToString(Xs);
		} else {
			s = t.pprint();
		}
		IO.print(writer, s);
		return 1;
	}
}
