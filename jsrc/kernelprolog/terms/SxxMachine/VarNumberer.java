package prolog.terms;

import SxxMachine.SystemObject;
import SxxMachine.Term;
import prolog.fluents.HashDict;

/**
  Used in implementing uniform replacement of
  variables with new constants. useful for printing
  out with nicer variable names.

  @see Var
  @see Clause
*/
public class VarNumberer extends SystemObject {
	HashDict dict;

	int ctr;

	public VarNumberer() {
		dict = new HashDict();
		ctr = 0;
	}

	public Term action(Term place) {
		place = place.dref();
		// IO.trace(">>action: "+place);
		if (place.isVar()) {
			Const root = (Const) dict.get(place);
			if (null == root) {
				root = new PseudoVar(ctr++);
				root.name = root.name + place.name();
				dict.put(place, root);
			}
			place = root;
		}
		// IO.trace("<<action: "+place);
		return place;
	}

}
