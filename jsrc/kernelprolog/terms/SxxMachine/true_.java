package prolog.terms;

import prolog.builtins.Builtins.ISTerm;

/**
  Always succeeds
*/
public class true_  {

	static public int st_exec(Prog p, ISTerm thiz) {
		return 1;
	}
}
