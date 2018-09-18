package SxxMachine;

import java.util.ArrayList;

import SxxMachine.Nonvar;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.Term;

abstract public class Source extends Fluent implements Undoable {

	public Source(Prog p) {
		super(p);
	}

	public static boolean isSource() {
		return true;
	}

	abstract public Term getElement();

	public Nonvar toList() {
		Term head = getElement();
		if (null == head)
			return Prolog.Nil;
		StructureTerm l = StructureTerm.createCons(head, Prolog.Nil);
		StructureTerm curr = l;
		for (;;) {
			head = getElement();
			if (null == head)
				break;
			StructureTerm tail = StructureTerm.createCons(head, Prolog.Nil);
			curr.setArg(1, tail);
			curr = tail;
		}
		return l;
	}

	public Term toFun() {
		ArrayList V = new ArrayList();
		Term X;
		while (null != (X = getElement())) {
			V.add(X);
		}
		return Copier.VectorToFun(V);
	}
}
