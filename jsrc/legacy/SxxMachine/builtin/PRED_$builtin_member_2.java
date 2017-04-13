package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.ListTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.Predicate;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.PrologException;
import com.googlecode.prolog_cafe.lang.Term;
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
		engine.areg1 = arg1;
		engine.areg2 = arg2;
		engine.cont = cont;
		engine.setB0();
		return PRED_$builtin_member_2::check;
	}

	private static Operation check(Prolog engine) throws PrologException {
		Term a2 = engine.areg2.dereference();
		if (a2 instanceof ListTerm) {
			engine.areg2 = a2;
			return engine.jtry2(PRED_$builtin_member_2::get, PRED_$builtin_member_2::next);
		}
		return engine.fail();
	}

	private static Operation get(Prolog engine) throws PrologException {
		Term a2 = engine.areg2;
		if (engine.areg1.unify(((ListTerm) a2).car(), engine.trail)) {
			return engine.cont;
		}
		return engine.fail();
	}

	private static Operation next(Prolog engine) throws PrologException {
		Operation next = engine.trust(PRED_$builtin_member_2::check);
		engine.areg2 = ((ListTerm) engine.areg2).cdr();
		return next;
	}

}
