package SxxMachine.builtin;

import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.ExistenceException;
import SxxMachine.IllegalTypeException;
import SxxMachine.SystemException;

/**
 * <code>'$call'/2</code><br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
class PRED_$call_2 extends Predicate.P2 {
	private static final SymbolTerm SYM_SLASH_2 = SymbolTerm.intern("/", 2);
	private static final SymbolTerm SYM_COLON_2 = SymbolTerm.intern(":", 2);

	private final static Term[] NO_ARGS = new Term[0];

	public PRED_$call_2(Term a1, Term a2, Operation cont) {
		LARG[0] = a1;
		LARG[1] = a2;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		Term a1, a2;
		a1 = LARG[0].dref(); // a1 must be atom of package name
		a2 = LARG[1].dref(); // a2 must be callable name

		String functor;
		int arity;
		Term[] args;
//	Class clazz;
//	Constructor constr;
//	Operation pred;

		try {
			if (!(a1 instanceof SymbolTerm))
				throw new IllegalTypeException(this, 1, "atom", a1);
			if ((a2 instanceof SymbolTerm)) {
				functor = a2.name();
				args = NO_ARGS; //new Term[]{};
				arity = 0;
			} else if ((a2 instanceof StructureTerm)) {
				functor = a2.name();
				args = ( a2).args();
				arity = a2.arity();
			} else {
				throw new IllegalTypeException(this, 2, "callable", a2);
			}
			try {
				return engine.pcl.predicate(a1.name(), functor, cont, args);
			} catch (ExistenceException e) {
				try {
					return engine.pcl.predicate(Prolog.BUILTIN, functor, cont, args);
				} catch (ExistenceException e2) {
					if ((engine.getUnknown()).equals("fail"))
						return engine.fail();

					Term what = new StructureTerm(SYM_COLON_2,
							a1,
							new StructureTerm(SYM_SLASH_2,
									SymbolTerm.create(functor),
									new IntegerTerm(arity)));
					ExistenceException err = new ExistenceException(this, 0, "procedure", what, e.getMessage());
					err.initCause(e);
					throw err;
				}
			}
		} catch (IllegalArgumentException e) {
			throw new SystemException(e.toString() + " in " + this.toString());
		}
	}
}


