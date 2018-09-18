package SxxMachine;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Failure;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.Term;
import SxxMachine.Trail;

/**
 * '$builtin_member'(X, [X|_]).
 * '$builtin_member'(X, [_|L]) :- '$builtin_member'(X, L).
 */

final class PRED_$builtin_member_2 extends Predicate.P2 {

	public PRED_$builtin_member_2(Term a1, Term a2, Operation cont) {
		this.LARG[0] = a1;
		this.LARG[1] = a2;
		this.cont = cont;
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append("$builtin_member(");
		LARG[0].toString(sb);
		sb.append(", ");
		LARG[1].toString(sb);
		sb.append(")");
	}


	@Override
	public final Operation exec(Prolog engine) {
		final Term a1 = LARG[0].dref();
		final Term a2 = LARG[1].dref();
		if (!(a2 instanceof ListTerm)){
			return engine.fail();
		}

		final Term value = a2.asListTerm().car();
		final Term next = a2.asListTerm().cdr().dref();

		if (!next.equals(Prolog.Nil)){
			engine.setB0();
			engine.AREGS[0] = LARG[0];
			engine.AREGS[1] = new FFIObjectTerm(new Term[]{next});
			engine.cont = cont;
			engine.jtry2(null, PRED_$builtin_member_2::retry); // push new frame with retry as next
		}
		return (a1.unify(value, engine.trail)) ? cont : engine.fail();
	}

	private static Operation retry(Prolog engine) {
		engine.retry(null, PRED_$builtin_member_2::retry); // restore engine.areg1, AREGS[1], cont
		final Term[] p = (Term[]) engine.AREGS[1].toJava();
		final Trail trail = engine.trail;
		final int top = trail.top();
		Term a2 = p[0];
		while (a2 instanceof ListTerm){
			final Term value = a2.asListTerm().car().dref();
			a2 = a2.asListTerm().cdr().dref();
			if (engine.AREGS[0].unify(value, engine.trail)) {
				p[0] = a2;
				return engine.cont;
			}
			trail.unwind(top);
		}
		return engine.trust(Failure.FAIL_0);
	}
}
