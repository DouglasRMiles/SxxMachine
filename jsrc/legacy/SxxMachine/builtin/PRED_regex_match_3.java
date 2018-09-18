package SxxMachine.builtin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import SxxMachine.FFIObjectTerm;
import SxxMachine.Operation;
import SxxMachine.Predicate;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;
import SxxMachine.VariableTerm;
import SxxMachine.exceptions.IllegalTypeException;
import SxxMachine.exceptions.PInstantiationException;

/**
 * <code>regex_match/3</code><br>
 * <p>
 * <pre>
 *   'regex_match'(+Pattern object, +Chars, -Matches)
 * </pre>
 */
public class PRED_regex_match_3 extends Predicate.P3 {

	public PRED_regex_match_3(Term a1, Term a2, Term a3, Operation cont) {
		LARG[0] = a1;
		LARG[1] = a2;
		LARG[2] = a3;
		this.cont = cont;
	}

	public Operation exec(Prolog engine) {
		engine.setB0();
		engine.cont = cont;
		Term a1 = LARG[0].dref();
		Term a2 = LARG[1].dref();

		if ((a1 instanceof VariableTerm)) {
			throw new PInstantiationException(this, 1);
		}
		Pattern pattern = (Pattern) a1.object();

		if ((a2 instanceof VariableTerm)) {
			throw new PInstantiationException(this, 1);
		}
		if (!(a2 instanceof SymbolTerm)) {
			throw new IllegalTypeException(this, 1, "atom", a2);
		}
		Matcher matcher = pattern.matcher(a2.name());

		if (!matcher.find()) {
			return engine.fail();
		}

		engine.AREGS[0] = new FFIObjectTerm(matcher);
		engine.AREGS[1] = LARG[2];
		return engine.jtry2(PRED_regex_match_3::regex_check, PRED_regex_match_3::regex_next);
	}

	private static Operation regex_check(Prolog engine) {
		Term a1 = engine.AREGS[0];
		Term result = engine.AREGS[1];
		Matcher matcher = (Matcher) a1.object();

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
		Term a1 = engine.AREGS[0];
		Matcher matcher = (Matcher) a1.object();
		if (!matcher.find()) {
			return engine.fail();
		}

		return engine.jtry2(PRED_regex_match_3::regex_check, PRED_regex_match_3::regex_next);
	}


	private static Term getMatches(Matcher matcher) {
		Term list = Prolog.Nil;
		for (int i = matcher.groupCount(); i >= 0; i--) {
			SymbolTerm match = SymbolTerm.create(matcher.group(i));
			list = TermData.CONS(match, list);
		}
		return list;
	}
}