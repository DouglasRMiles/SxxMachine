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
		Term a1 = arg1.dereference();
		Term a2 = arg2.dereference();
		if (!(a2 instanceof ListTerm)){
			return engine.fail();
		}

		Term value = ((ListTerm) a2).car();
		if (((ListTerm) a2).cdr().dereference().equals(Prolog.Nil)){
			return (a1.unify(value, engine.trail)) ? cont : engine.fail();
		}

		engine.areg1 = arg1;
		engine.areg2 = new JavaObjectTerm(new Term[]{a2});
		engine.cont = cont;
		engine.setB0();
		return engine.jtry2(PRED_$builtin_member_2::get, PRED_$builtin_member_2::retry);
	}

	private static Operation retry(Prolog engine) {
		engine.retry(PRED_$builtin_member_2::get, PRED_$builtin_member_2::retry); // restore engine.areg1, areg2, cont
		Term[] p = (Term[]) engine.areg2.toJava();
		Trail trail = engine.trail;
		int top = trail.top();
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

	private static Operation get(Prolog engine) {
		Term[] p = (Term[]) engine.areg2.toJava();
		final ListTerm a2 = (ListTerm) p[0];
		final Term value = a2.car();
		p[0] = a2.cdr().dereference();
		if (engine.areg1.unify(value, engine.trail)) {
			return engine.cont;
		}
		return engine.fail();
	}
}
