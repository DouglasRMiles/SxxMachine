package SxxMachine.bench;

import static SxxMachine.Failure.fail_0;

import SxxMachine.Arithmetic;
import SxxMachine.IntegerTerm;
import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;

public class FILE_queens_8  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
	private static final /**/ IntegerTerm PRED_top_0_s1 = Integer(8);

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry0(null, FILE_queens_8::top_0_sub_1);
		return top_0_1(m);
	}

	private final static Operation top_0_sub_1(Prolog m) {
		m.trust(null);
		return top_0_2(m);
	}

	private final static Operation top_0_1(Prolog m) {
		Operation cont;
		cont = m.cont;
		// top:-[queens(8,A),fail]
		return //
		Op((Prolog e) -> PRED_queens_2_static_exec(e), VA(PRED_top_0_s1, V(m)), //
				Op(fail_0, VA(), cont));
	}

	private final static Operation top_0_2(Prolog m) {
		// top:-true
		Operation cont;
		cont = m.cont;
		// top:-[]
		return cont;
	}

	/** PREDICATE: queens/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
	private static final /**/ IntegerTerm PRED_queens_2_s1 = Integer(1);

	public static Operation PRED_queens_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// queens(A,B):-range(1,A,C),queens(C,[],B)
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// queens(A,B):-[range(1,A,C),queens(C,[],B)]
		a3 = V(m);
		return //
		Op((Prolog e) -> PRED_range_3_static_exec(e), VA(PRED_queens_2_s1, a1, a3), //
				Op((Prolog e) -> PRED_queens_3_static_exec(e), VA(a3, Prolog.Nil, a2), cont));
	}

	/** PREDICATE: queens/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
	private static final SymbolTerm PRED_queens_3_s1 = SYM("[]");

	public static Operation PRED_queens_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_queens_8::queens_3_var, FILE_queens_8::queens_3_2, FILE_queens_8::queens_3_2, FILE_queens_8::queens_3_var, FILE_queens_8::queens_3_2, FILE_queens_8::queens_3_2);
	}

	private final static Operation queens_3_var(Prolog m) {
		m.jtry3(null, FILE_queens_8::queens_3_var_1);
		return queens_3_1(m);
	}

	private final static Operation queens_3_var_1(Prolog m) {
		m.trust(null);
		return queens_3_2(m);
	}

	private final static Operation queens_3_1(Prolog m) {
		// queens([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// queens([],A,A):-[]
		if (!PRED_queens_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation queens_3_2(Prolog m) {
		// queens(A,B,C):-select(A,D,E),not_attack(B,E),queens(D,[E|B],C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// queens(A,B,C):-[select(A,D,E),not_attack(B,E),queens(D,[E|B],C)]
		a4 = V(m);
		a5 = V(m);
		a6 = CONS(a5, a2);
		return //
		Op((Prolog e) -> PRED_select_3_static_exec(e), VA(a1, a4, a5), //
				Op((Prolog e) -> PRED_not_attack_2_static_exec(e), VA(a2, a5), //
						Op((Prolog e) -> PRED_queens_3_static_exec(e), VA(a4, a6, a3), cont)));
	}

	/** PREDICATE: not_attack/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
	private static final /**/ IntegerTerm PRED_not_attack_2_s1 = Integer(1);

	public static Operation PRED_not_attack_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// not_attack(A,B):-not_attack(A,B,1)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// not_attack(A,B):-[not_attack(A,B,1)]
		return //
		Op((Prolog e) -> PRED_not_attack_3_static_exec(e), VA(a1, a2, PRED_not_attack_2_s1), cont);
	}

	/** PREDICATE: not_attack/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
	private static final SymbolTerm PRED_not_attack_3_s1 = SYM("[]");
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_not_attack_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return not_attack_3_top(m);
	}

	private final static Operation not_attack_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_queens_8::not_attack_3_var, fail_0, fail_0, FILE_queens_8::not_attack_3_1, fail_0, FILE_queens_8::not_attack_3_2);
	}

	private final static Operation not_attack_3_var(Prolog m) {
		m.jtry3(null, FILE_queens_8::not_attack_3_var_1);
		return not_attack_3_1(m);
	}

	private final static Operation not_attack_3_var_1(Prolog m) {
		m.trust(null);
		return not_attack_3_2(m);
	}

	private final static Operation not_attack_3_1(Prolog m) {
		// not_attack([],A,B):-!
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// not_attack([],A,B):-['$neck_cut']
		if (!PRED_not_attack_3_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation not_attack_3_2(Prolog m) {
		// not_attack([A|B],C,D):-C=\=A+D,C=\=A-D,E is D+1,not_attack(B,C,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// not_attack([A|B],C,D):-[E is A+D,'$arith_not_equal'(C,E),F is A-D,'$arith_not_equal'(C,F),G is D+1,not_attack(B,C,G)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a1.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a1.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		a6 = V(m);
		Term[] y1 = VA(a4, a3);
		a7 = S("+", y1);
		//START inline expansion of a(6)is a(7)
		if (!a6.unify(Arithmetic.evaluate(a7), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $arith_not_equal(a(2),a(6))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a6)) == 0) {
			return m.fail();
		}
		//END inline expansion
		a8 = V(m);
		Term[] y2 = VA(a4, a3);
		a9 = S("-", y2);
		//START inline expansion of a(8)is a(9)
		if (!a8.unify(Arithmetic.evaluate(a9), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $arith_not_equal(a(2),a(8))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a8)) == 0) {
			return m.fail();
		}
		//END inline expansion
		a10 = V(m);
		Term[] y3 = VA(a3, int_1);
		a11 = S("+", y3);
		//START inline expansion of a(10)is a(11)
		if (!a10.unify(Arithmetic.evaluate(a11), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a10;
		m.cont = cont;
		return not_attack_3_top(m);
	}

	/** PREDICATE: select/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/

	public static Operation PRED_select_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return select_3_top(m);
	}

	private final static Operation select_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_queens_8::select_3_var, fail_0, fail_0, fail_0, fail_0, FILE_queens_8::select_3_var);
	}

	private final static Operation select_3_var(Prolog m) {
		m.jtry3(null, FILE_queens_8::select_3_var_1);
		return select_3_1(m);
	}

	private final static Operation select_3_var_1(Prolog m) {
		m.trust(null);
		return select_3_2(m);
	}

	private final static Operation select_3_1(Prolog m) {
		// select([A|B],B,A):-true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// select([A|B],B,A):-[]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a1.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a1.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		if (!a5.unify(a2, m.trail))
			return m.fail();
		if (!a4.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation select_3_2(Prolog m) {
		// select([A|B],[A|C],D):-select(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// select([A|B],[A|C],D):-[select(B,C,D)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a1.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a1.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a6 = argz[1];
		} else if (a2.isVar()) {
			a6 = V(m);
			a2.bind(CONS(a4, a6), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a5;
		m.AREGS[1] = a6;
		m.AREGS[2] = a3;
		m.cont = cont;
		return select_3_top(m);
	}

	/** PREDICATE: range/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/queens_8.pl
	*/
	private static final SymbolTerm PRED_range_3_s1 = SYM("[]");

	public static Operation PRED_range_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return range_3_top(m);
	}

	private final static Operation range_3_top(Prolog m) {
		m.setB0();
		m.jtry3(null, FILE_queens_8::range_3_sub_1);
		return range_3_1(m);
	}

	private final static Operation range_3_sub_1(Prolog m) {
		m.trust(null);
		return range_3_2(m);
	}

	private final static Operation range_3_1(Prolog m) {
		// range(A,A,[A]):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// range(A,A,[A]):-['$neck_cut']
		if (!a1.unify(a2, m.trail))
			return m.fail();
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_range_3_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a3.isVar()) {
			a3.bind(CONS(a1, PRED_range_3_s1), m.trail);
		} else {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation range_3_2(Prolog m) {
		// range(A,B,[A|C]):-A<B,D is A+1,range(D,B,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// range(A,B,[A|C]):-['$less_than'(A,B),D is A+1,range(D,B,C)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(a1, a4), m.trail);
		} else {
			return m.fail();
		}
		//START inline expansion of $less_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		Term[] y1 = VA(a1, int_1);
		a6 = S("+", y1);
		//START inline expansion of a(5)is a(6)
		if (!a5.unify(Arithmetic.evaluate(a6), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a4;
		m.cont = cont;
		return range_3_top(m);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_queens_8::PRED_top_0_static_exec);
		PredTable.registerBuiltin("queens", 2, FILE_queens_8::PRED_queens_2_static_exec);
		PredTable.registerBuiltin("queens", 3, FILE_queens_8::PRED_queens_3_static_exec);
		PredTable.registerBuiltin("not_attack", 2, FILE_queens_8::PRED_not_attack_2_static_exec);
		PredTable.registerBuiltin("not_attack", 3, FILE_queens_8::PRED_not_attack_3_static_exec);
		PredTable.registerBuiltin("select", 3, FILE_queens_8::PRED_select_3_static_exec);
		PredTable.registerBuiltin("range", 3, FILE_queens_8::PRED_range_3_static_exec);
	}
}
