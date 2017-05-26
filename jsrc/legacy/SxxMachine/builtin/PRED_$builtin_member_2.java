package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.*;

/**
 * '$builtin_member'(X, [X|_]).
 * '$builtin_member'(X, [_|L]) :- '$builtin_member'(X, L).
 */

final class PRED_$builtin_member_2 extends Predicate.P2 {

	public PRED_$builtin_member_2(Term a1, Term a2, Operation cont) {
		this.arg1 = a1;
		this.arg2 = a2;
		this.cont = cont;
	}

	@Override
	public void toString(StringBuilder sb) {
		sb.append("$builtin_member(");
		arg1.toString(sb);
		sb.append(", ");
		arg2.toString(sb);
		sb.append(")");
	}


	@Override
	public final Operation exec(Prolog engine) {
		final Term a1 = arg1.dereference();
		final Term a2 = arg2.dereference();
		if (!(a2 instanceof ListTerm)){
			return engine.fail();
		}

		final Term value = ((ListTerm) a2).car();
		final Term next = ((ListTerm) a2).cdr().dereference();

		if (!next.equals(Prolog.Nil)){
			engine.setB0();
			engine.areg1 = arg1;
			engine.areg2 = new JavaObjectTerm(new Term[]{next});
			engine.cont = cont;
			engine.jtry2(null, PRED_$builtin_member_2::retry); // push new frame with retry as next
		}
		return (a1.unify(value, engine.trail)) ? cont : engine.fail();
	}

	private static Operation retry(Prolog engine) {
		engine.retry(null, PRED_$builtin_member_2::retry); // restore engine.areg1, areg2, cont
		final Term[] p = (Term[]) engine.areg2.toJava();
		final Trail trail = engine.trail;
		final int top = trail.top();
		Term a2 = p[0];
		while (a2 instanceof ListTerm){
			final Term value = ((ListTerm) a2).car().dereference();
			a2 = ((ListTerm) a2).cdr().dereference();
			if (engine.areg1.unify(value, engine.trail)) {
				p[0] = a2;
				return engine.cont;
			}
			trail.unwind(top);
		}
		return engine.trust(Failure.FAIL_0);
	}
}
