package SxxMachine;

import java.util.ArrayList;
import java.util.Iterator;

import SxxMachine.Term;
import SxxMachine.Prog;
import SxxMachine.Source;

/**
  Builds Prolog Iterators from Java
  Sequences and Iterator type classes
*/
public class JavaSource extends Source {
	private Iterator e;

	public JavaSource(Prog p) {
		super(p);
		e = null;
	}

	public JavaSource(Iterator iterator, Prog p) {
		super(p);
		this.e = iterator;
	}

	public JavaSource(ArrayList V, Prog p) {
		super(p);
		this.e = V.iterator();
	}

	public Term getElement() {
		if (null == e || !e.hasNext())
			return null;
		else
			return (Term) e.next();
	}

	public void stop() {
		e = null;
	}
}
