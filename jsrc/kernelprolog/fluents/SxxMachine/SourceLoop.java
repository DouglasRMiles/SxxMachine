package prolog.fluents;

import java.util.ArrayList;

import SxxMachine.Term;
import prolog.terms.Prog;
import prolog.terms.Source;

/**
  An Infinite Source.
  If based on a finite Source, it moves to its the first element after reaching its last element.
  A SourceLoop returns 'no' if the original Source is empty. 
  In case the original Source is infinite, a SourceLoop will 
  return the same elements as the original Source. 
  (In particular, this happens if the original Source is also a Source loop).
*/
public class SourceLoop extends Source {
	private ArrayList v;

	Source s;

	private int i;

	public SourceLoop(Source s, Prog p) {
		super(p);
		this.s = s;
		this.v = new ArrayList();
		this.i = 0;
	}

	private final Term getMemoized() {
		if (null == v || v.size() <= 0)
			return null;
		Term T = (Term) v.get(i);
		i = (i + 1) % v.size();
		return T;
	}

	public Term getElement() {
		Term T = null;
		if (null != s) { // s is alive
			T = s.getElement();
			if (null != T)
				v.add(T);
			else {
				s = null;
			}
		}
		if (null == s)
			T = getMemoized();
		return T;
	}

	public void stop() {
		v = null;
		s = null;
	}
}
