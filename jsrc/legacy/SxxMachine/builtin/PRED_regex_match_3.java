package com.googlecode.prolog_cafe.builtin;

import com.googlecode.prolog_cafe.lang.IllegalTypeException;
import com.googlecode.prolog_cafe.lang.JavaObjectTerm;
import com.googlecode.prolog_cafe.lang.ListTerm;
import com.googlecode.prolog_cafe.lang.Operation;
import com.googlecode.prolog_cafe.lang.PInstantiationException;
import com.googlecode.prolog_cafe.lang.Predicate;
import com.googlecode.prolog_cafe.lang.Prolog;
import com.googlecode.prolog_cafe.lang.SymbolTerm;
import com.googlecode.prolog_cafe.lang.Term;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <code>regex_match/3</code><br>
 * <p>
 * <pre>
 *   'regex_match'(+Pattern object, +Chars, -Matches)
 * </pre>
 */
public class PRED_regex_match_3 extends Predicate.P3 {

	public PRED_regex_match_3(Term a1, Term a2, Term a3, Operation cont) {
		arg1 = a1;
		arg2 = a2;
		arg3 = a3;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		engine.cont = cont;
		Term a1 = arg1.dereference();
		Term a2 = arg2.dereference();

		if (a1.isVariable()) {
			throw new PInstantiationException(this, 1);
		}
		Pattern pattern = (Pattern) ((JavaObjectTerm) a1).object();

		if (a2.isVariable()) {
			throw new PInstantiationException(this, 1);
		}
		if (!a2.isSymbol()) {
			throw new IllegalTypeException(this, 1, "atom", a2);
		}
		Matcher matcher = pattern.matcher(a2.name());

		if (!matcher.find()) {
			return engine.fail();
		}

		engine.areg1 = new JavaObjectTerm(matcher);
		engine.areg2 = arg3;
		return engine.jtry2(PRED_regex_match_3::regex_check, PRED_regex_match_3::regex_next);
	}

	private static Operation regex_check(Prolog engine) {
		Term a1 = engine.areg1;
		Term result = engine.areg2;
		Matcher matcher = (Matcher) ((JavaObjectTerm) a1).object();

		Term matches = getMatches(matcher);

		if (matches == Prolog.Nil || !result.unify(matches, engine.trail)) {
			return engine.fail();
		}
		return engine.cont;
	}


	private static Operation regex_next(Prolog engine) {
		return engine.trust(PRED_regex_match_3::regex_empty);
	}


	private static Operation regex_empty(Prolog engine) {
		Term a1 = engine.areg1;
		Matcher matcher = (Matcher) ((JavaObjectTerm) a1).object();
		if (!matcher.find()) {
			return engine.fail();
		}

		return engine.jtry2(PRED_regex_match_3::regex_check, PRED_regex_match_3::regex_next);
	}


	private static Term getMatches(Matcher matcher) {
		Term list = Prolog.Nil;
		for (int i = matcher.groupCount(); i >= 0; i--) {
			SymbolTerm match = SymbolTerm.create(matcher.group(i));
			list = new ListTerm(match, list);
		}
		return list;
	}
}