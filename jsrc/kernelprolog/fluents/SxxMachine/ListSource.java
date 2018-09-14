package prolog.fluents;

import SxxMachine.Nonvar;
import prolog.terms.Copier;
import prolog.terms.Prog;

/**
  Builds an iterator from a list
*/
public class ListSource extends JavaSource {
	public ListSource(Nonvar xs, Prog p) {
		super(Copier.ConsToVector(xs), p);
	}
}
