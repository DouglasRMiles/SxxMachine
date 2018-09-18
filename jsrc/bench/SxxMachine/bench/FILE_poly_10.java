package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_poly_10  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-poly_10
		m.setB0();
		// top:-[poly_10]
		return //
		Op((Prolog e) -> PRED_poly_10_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: poly_10/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final /**/ IntegerTerm PRED_poly_10_0_s1 = Integer(10);

	public static Operation PRED_poly_10_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// poly_10:-test_poly(A),poly_exp(10,A,B)
		m.setB0();
		Term a1;
		// poly_10:-[test_poly(A),poly_exp(10,A,B)]
		a1 = V(m);
		return //
		Op((Prolog e) -> PRED_test_poly_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_poly_exp_3_static_exec(e), VA(PRED_poly_10_0_s1, a1, V(m)), cont));
	}

	/** PREDICATE: test_poly/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	final static SymbolTerm ATOM_x = SYM("x");
	final static IntegerTerm int_0 = Integer(0);
	final static IntegerTerm int_1 = Integer(1);
	private static final StructureTerm PRED_test_poly_1_s7 = S("term", int_0, int_1);
	private static final StructureTerm PRED_test_poly_1_s9 = S("term", int_1, int_1);
	private static final ListTerm PRED_test_poly_1_s11 = CONS(PRED_test_poly_1_s9, Prolog.Nil);
	private static final ListTerm PRED_test_poly_1_s12 = CONS(PRED_test_poly_1_s7, PRED_test_poly_1_s11);
	private static final StructureTerm PRED_test_poly_1_s14 = S("poly", ATOM_x, PRED_test_poly_1_s12);
	final static SymbolTerm ATOM_y = SYM("y");
	private static final StructureTerm PRED_test_poly_1_s17 = S("poly", ATOM_y, PRED_test_poly_1_s11);
	final static SymbolTerm ATOM_z = SYM("z");
	private static final StructureTerm PRED_test_poly_1_s20 = S("poly", ATOM_z, PRED_test_poly_1_s11);

	public static Operation PRED_test_poly_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// test_poly(A):-poly_add(poly(x,[term(0,1),term(1,1)]),poly(y,[term(1,1)]),B),poly_add(poly(z,[term(1,1)]),B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// test_poly(A):-[poly_add(poly(x,[term(0,1),term(1,1)]),poly(y,[term(1,1)]),B),poly_add(poly(z,[term(1,1)]),B,A)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_poly_add_3_static_exec(e), VA(PRED_test_poly_1_s14, PRED_test_poly_1_s17, a2), //
				Op((Prolog e) -> PRED_poly_add_3_static_exec(e), VA(PRED_test_poly_1_s20, a2, a1), cont));
	}

	/** PREDICATE: (less_than)/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final SymbolTerm PRED_less_than_2_s1 = SYM("x");

	public static Operation PRED_less_than_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::less_than_2_var, fail_0, fail_0, FILE_poly_10::less_than_2_var, fail_0, fail_0);
	}

	private final static Operation less_than_2_var(Prolog m) {
		m.jtry2(null, FILE_poly_10::less_than_2_var_1);
		return less_than_2_1(m);
	}

	private final static Operation less_than_2_var_1(Prolog m) {
		m.retry(null, FILE_poly_10::less_than_2_var_2);
		return less_than_2_2(m);
	}

	private final static Operation less_than_2_var_2(Prolog m) {
		m.trust(null);
		return less_than_2_3(m);
	}

	private final static Operation less_than_2_1(Prolog m) {
		// x less_than y:-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// x less_than y:-[]
		if (!PRED_less_than_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_y.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation less_than_2_2(Prolog m) {
		// y less_than z:-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// y less_than z:-[]
		if (!ATOM_y.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_z.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation less_than_2_3(Prolog m) {
		// x less_than z:-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// x less_than z:-[]
		if (!PRED_less_than_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_z.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: poly_add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/

	public static Operation PRED_poly_add_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::poly_add_3_var, FILE_poly_10::poly_add_3_int, FILE_poly_10::poly_add_3_int, FILE_poly_10::poly_add_3_int, FILE_poly_10::poly_add_3_var, FILE_poly_10::poly_add_3_int);
	}

	private final static Operation poly_add_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::poly_add_3_var_1);
		return poly_add_3_1(m);
	}

	private final static Operation poly_add_3_var_1(Prolog m) {
		m.retry(null, FILE_poly_10::poly_add_3_var_2);
		return poly_add_3_2(m);
	}

	private final static Operation poly_add_3_var_2(Prolog m) {
		m.retry(null, FILE_poly_10::poly_add_3_var_3);
		return poly_add_3_3(m);
	}

	private final static Operation poly_add_3_var_3(Prolog m) {
		m.retry(null, FILE_poly_10::poly_add_3_var_4);
		return poly_add_3_4(m);
	}

	private final static Operation poly_add_3_var_4(Prolog m) {
		m.trust(null);
		return poly_add_3_5(m);
	}

	private final static Operation poly_add_3_int(Prolog m) {
		m.jtry3(null, FILE_poly_10::poly_add_3_int_1);
		return poly_add_3_3(m);
	}

	private final static Operation poly_add_3_int_1(Prolog m) {
		m.trust(null);
		return poly_add_3_5(m);
	}

	private final static Operation poly_add_3_1(Prolog m) {
		// poly_add(poly(A,B),poly(A,C),poly(A,D)):-!,term_add(B,C,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_add(poly(A,B),poly(A,C),poly(A,D)):-['$neck_cut',term_add(B,C,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		if (!a2.unify(C("poly", a4, a6), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a7 = V(m);
		if (!a3.unify(C("poly", a4, a7), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_term_add_3_static_exec(e), VA(a5, a6, a7), cont);
	}

	private final static Operation poly_add_3_2(Prolog m) {
		// poly_add(poly(A,B),poly(C,D),poly(A,E)):-A less_than C,!,add_to_order_zero_term(B,poly(C,D),E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_add(poly(A,B),poly(C,D),poly(A,E)):-['$get_level'(F),A less_than C,'$cut'(F),add_to_order_zero_term(B,poly(C,D),E)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a2.unify(C("poly", a6, a7), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a8 = V(m);
		if (!a3.unify(C("poly", a4, a8), m.trail)) {
			return m.fail();
		}
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a6, a7);
		a10 = S("poly", y1);
		return //
		Op((Prolog e) -> PRED_less_than_2_static_exec(e), VA(a4, a6), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a9), //
						Op((Prolog e) -> PRED_add_to_order_zero_term_3_static_exec(e), VA(a5, a10, a8), cont)));
	}

	private final static Operation poly_add_3_3(Prolog m) {
		// poly_add(A,poly(B,C),poly(B,D)):-!,add_to_order_zero_term(C,A,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_add(A,poly(B,C),poly(B,D)):-['$neck_cut',add_to_order_zero_term(C,A,D)]
		a2 = a2.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a2.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		if (!a3.unify(C("poly", a4, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_add_to_order_zero_term_3_static_exec(e), VA(a5, a1, a6), cont);
	}

	private final static Operation poly_add_3_4(Prolog m) {
		// poly_add(poly(A,B),C,poly(A,D)):-!,add_to_order_zero_term(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_add(poly(A,B),C,poly(A,D)):-['$neck_cut',add_to_order_zero_term(B,C,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		if (!a3.unify(C("poly", a4, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_add_to_order_zero_term_3_static_exec(e), VA(a5, a2, a6), cont);
	}

	private final static Operation poly_add_3_5(Prolog m) {
		// poly_add(A,B,C):-C is A+B
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_add(A,B,C):-[C is A+B]
		Term[] y1 = VA(a1, a2);
		a4 = S("+", y1);
		//START inline expansion of a(3)is a(4)
		if (!a3.unify(Arithmetic.evaluate(a4), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: term_add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final SymbolTerm PRED_term_add_3_s1 = SYM("[]");

	public static Operation PRED_term_add_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return term_add_3_top(m);
	}

	private final static Operation term_add_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_poly_10::term_add_3_var, FILE_poly_10::term_add_3_int, FILE_poly_10::term_add_3_int, FILE_poly_10::term_add_3_con, FILE_poly_10::term_add_3_int, FILE_poly_10::term_add_3_lis);
	}

	private final static Operation term_add_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_add_3_var_1);
		return term_add_3_1(m);
	}

	private final static Operation term_add_3_var_1(Prolog m) {
		m.retry(null, FILE_poly_10::term_add_3_var_2);
		return term_add_3_2(m);
	}

	private final static Operation term_add_3_var_2(Prolog m) {
		m.retry(null, FILE_poly_10::term_add_3_var_3);
		return term_add_3_3(m);
	}

	private final static Operation term_add_3_var_3(Prolog m) {
		m.retry(null, FILE_poly_10::term_add_3_var_4);
		return term_add_3_4(m);
	}

	private final static Operation term_add_3_var_4(Prolog m) {
		m.trust(null);
		return term_add_3_5(m);
	}

	private final static Operation term_add_3_int(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_add_3_int_1);
		return term_add_3_2(m);
	}

	private final static Operation term_add_3_int_1(Prolog m) {
		m.trust(null);
		return term_add_3_5(m);
	}

	private final static Operation term_add_3_con(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_add_3_con_1);
		return term_add_3_1(m);
	}

	private final static Operation term_add_3_con_1(Prolog m) {
		m.retry(null, FILE_poly_10::term_add_3_con_2);
		return term_add_3_2(m);
	}

	private final static Operation term_add_3_con_2(Prolog m) {
		m.trust(null);
		return term_add_3_5(m);
	}

	private final static Operation term_add_3_lis(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_add_3_lis_1);
		return term_add_3_2(m);
	}

	private final static Operation term_add_3_lis_1(Prolog m) {
		m.retry(null, FILE_poly_10::term_add_3_lis_2);
		return term_add_3_3(m);
	}

	private final static Operation term_add_3_lis_2(Prolog m) {
		m.retry(null, FILE_poly_10::term_add_3_lis_3);
		return term_add_3_4(m);
	}

	private final static Operation term_add_3_lis_3(Prolog m) {
		m.trust(null);
		return term_add_3_5(m);
	}

	private final static Operation term_add_3_1(Prolog m) {
		// term_add([],A,A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_add([],A,A):-['$neck_cut']
		if (!PRED_term_add_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation term_add_3_2(Prolog m) {
		// term_add(A,[],A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_add(A,[],A):-['$neck_cut']
		if (!PRED_term_add_3_s1.unify(a2, m.trail))
			return m.fail();
		if (!a1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation term_add_3_3(Prolog m) {
		// term_add([term(A,B)|C],[term(A,D)|E],[term(A,F)|G]):-!,poly_add(B,D,F),term_add(C,E,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_add([term(A,B)|C],[term(A,D)|E],[term(A,F)|G]):-['$neck_cut',poly_add(B,D,F),term_add(C,E,G)]
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
		a4 = a4.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a4.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a8 = argz[0];
			a9 = argz[1];
		} else if (a2.isVar()) {
			a8 = V(m);
			a9 = V(m);
			a2.bind(CONS(a8, a9), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		if (!a8.unify(C("term", a6, a10), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a11 = argz[0];
			a12 = argz[1];
		} else if (a3.isVar()) {
			a11 = V(m);
			a12 = V(m);
			a3.bind(CONS(a11, a12), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		a13 = V(m);
		if (!a11.unify(C("term", a6, a13), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_poly_add_3_static_exec(e), VA(a7, a10, a13), //
				Op((Prolog e) -> PRED_term_add_3_static_exec(e), VA(a5, a9, a12), cont));
	}

	private final static Operation term_add_3_4(Prolog m) {
		// term_add([term(A,B)|C],[term(D,E)|F],[term(A,B)|G]):-A<D,!,term_add(C,[term(D,E)|F],G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_add([term(A,B)|C],[term(D,E)|F],[term(A,B)|G]):-['$get_level'(H),'$less_than'(A,D),'$cut'(H),term_add(C,[term(D,E)|F],G)]
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
		a4 = a4.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a4.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a8 = argz[0];
			a9 = argz[1];
		} else if (a2.isVar()) {
			a8 = V(m);
			a9 = V(m);
			a2.bind(CONS(a8, a9), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		a11 = V(m);
		if (!a8.unify(C("term", a10, a11), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a12 = argz[0];
			a13 = argz[1];
		} else if (a3.isVar()) {
			a12 = V(m);
			a13 = V(m);
			a3.bind(CONS(a12, a13), m.trail);
		} else {
			return m.fail();
		}
		a12 = a12.dref();
		if (!a12.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		a14 = V(m);
		//START inline expansion of $get_level(a(14))
		if (!a14.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_than(a(6),a(10))
		if (Arithmetic.evaluate(a6).arithCompareTo(Arithmetic.evaluate(a10)) >= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(14))
		a14 = a14.dref();
		m.cut(a14.intValue());
		//END inline expansion
		Term[] y1 = VA(a10, a11);
		a15 = S("term", y1);
		a16 = CONS(a15, a9);
		m.AREGS[0] = a5;
		m.AREGS[1] = a16;
		m.AREGS[2] = a13;
		m.cont = cont;
		return term_add_3_top(m);
	}

	private final static Operation term_add_3_5(Prolog m) {
		// term_add(A,[term(B,C)|D],[term(B,C)|E]):-term_add(A,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_add(A,[term(B,C)|D],[term(B,C)|E]):-[term_add(A,D,E)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a2.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a4.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a8 = argz[0];
			a9 = argz[1];
		} else if (a3.isVar()) {
			a8 = V(m);
			a9 = V(m);
			a3.bind(CONS(a8, a9), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		m.AREGS[0] = a1;
		m.AREGS[1] = a5;
		m.AREGS[2] = a9;
		m.cont = cont;
		return term_add_3_top(m);
	}

	/** PREDICATE: add_to_order_zero_term/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/

	public static Operation PRED_add_to_order_zero_term_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::add_to_order_zero_term_3_var, FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_2,
				FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_var);
	}

	private final static Operation add_to_order_zero_term_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::add_to_order_zero_term_3_var_1);
		return add_to_order_zero_term_3_1(m);
	}

	private final static Operation add_to_order_zero_term_3_var_1(Prolog m) {
		m.trust(null);
		return add_to_order_zero_term_3_2(m);
	}

	private final static Operation add_to_order_zero_term_3_1(Prolog m) {
		// add_to_order_zero_term([term(0,A)|B],C,[term(0,D)|B]):-!,poly_add(A,C,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// add_to_order_zero_term([term(0,A)|B],C,[term(0,D)|B]):-['$neck_cut',poly_add(A,C,D)]
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
		a4 = a4.dref();
		a6 = V(m);
		if (!a4.unify(C("term", int_0, a6), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a7 = argz[0];
			if (!a5.unify(argz[1], m.trail))
				return m.fail();
		} else if (a3.isVar()) {
			a7 = V(m);
			a3.bind(CONS(a7, a5), m.trail);
		} else {
			return m.fail();
		}
		a7 = a7.dref();
		a8 = V(m);
		if (!a7.unify(C("term", int_0, a8), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_poly_add_3_static_exec(e), VA(a6, a2, a8), cont);
	}

	private final static Operation add_to_order_zero_term_3_2(Prolog m) {
		// add_to_order_zero_term(A,B,[term(0,B)|A]):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// add_to_order_zero_term(A,B,[term(0,B)|A]):-[]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a4 = argz[0];
			if (!a1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(a4, a1), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (!a4.unify(C("term", int_0, a2), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: poly_exp/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final /**/ IntegerTerm PRED_poly_exp_3_s1 = Integer(0);

	public static Operation PRED_poly_exp_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return poly_exp_3_top(m);
	}

	private final static Operation poly_exp_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_poly_10::poly_exp_3_var, FILE_poly_10::poly_exp_3_var, FILE_poly_10::poly_exp_3_flo, FILE_poly_10::poly_exp_3_flo, FILE_poly_10::poly_exp_3_flo, FILE_poly_10::poly_exp_3_flo);
	}

	private final static Operation poly_exp_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::poly_exp_3_var_1);
		return poly_exp_3_1(m);
	}

	private final static Operation poly_exp_3_var_1(Prolog m) {
		m.retry(null, FILE_poly_10::poly_exp_3_var_2);
		return poly_exp_3_2(m);
	}

	private final static Operation poly_exp_3_var_2(Prolog m) {
		m.trust(null);
		return poly_exp_3_3(m);
	}

	private final static Operation poly_exp_3_flo(Prolog m) {
		m.jtry3(null, FILE_poly_10::poly_exp_3_flo_1);
		return poly_exp_3_2(m);
	}

	private final static Operation poly_exp_3_flo_1(Prolog m) {
		m.trust(null);
		return poly_exp_3_3(m);
	}

	private final static Operation poly_exp_3_1(Prolog m) {
		// poly_exp(0,A,1):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_exp(0,A,1):-['$neck_cut']
		if (!PRED_poly_exp_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!int_1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation poly_exp_3_2(Prolog m) {
		// poly_exp(A,B,C):-D is A>>1,A is D<<1,!,poly_exp(D,B,E),poly_mul(E,E,C)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_exp(A,B,C):-['$get_level'(D),E is A>>1,A is E<<1,'$cut'(D),poly_exp(E,B,F),poly_mul(F,F,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		Term[] y1 = VA(a1, int_1);
		a6 = S(">>", y1);
		//START inline expansion of a(5)is a(6)
		if (!a5.unify(Arithmetic.evaluate(a6), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y2 = VA(a5, int_1);
		a7 = S("<<", y2);
		//START inline expansion of a(1)is a(7)
		if (!a1.unify(Arithmetic.evaluate(a7), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		a8 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_poly_mul_3_static_exec(e), VA(a8, a8, a3), cont);
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a8;
		m.cont = p1;
		return poly_exp_3_top(m);
	}

	private final static Operation poly_exp_3_3(Prolog m) {
		// poly_exp(A,B,C):-D is A-1,poly_exp(D,B,E),poly_mul(B,E,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_exp(A,B,C):-[D is A-1,poly_exp(D,B,E),poly_mul(B,E,C)]
		a4 = V(m);
		Term[] y1 = VA(a1, int_1);
		a5 = S("-", y1);
		//START inline expansion of a(4)is a(5)
		if (!a4.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_poly_mul_3_static_exec(e), VA(a2, a6, a3), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = p1;
		return poly_exp_3_top(m);
	}

	/** PREDICATE: poly_mul/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/

	public static Operation PRED_poly_mul_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::poly_mul_3_var, FILE_poly_10::poly_mul_3_int, FILE_poly_10::poly_mul_3_int, FILE_poly_10::poly_mul_3_int, FILE_poly_10::poly_mul_3_var, FILE_poly_10::poly_mul_3_int);
	}

	private final static Operation poly_mul_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::poly_mul_3_var_1);
		return poly_mul_3_1(m);
	}

	private final static Operation poly_mul_3_var_1(Prolog m) {
		m.retry(null, FILE_poly_10::poly_mul_3_var_2);
		return poly_mul_3_2(m);
	}

	private final static Operation poly_mul_3_var_2(Prolog m) {
		m.retry(null, FILE_poly_10::poly_mul_3_var_3);
		return poly_mul_3_3(m);
	}

	private final static Operation poly_mul_3_var_3(Prolog m) {
		m.retry(null, FILE_poly_10::poly_mul_3_var_4);
		return poly_mul_3_4(m);
	}

	private final static Operation poly_mul_3_var_4(Prolog m) {
		m.trust(null);
		return poly_mul_3_5(m);
	}

	private final static Operation poly_mul_3_int(Prolog m) {
		m.jtry3(null, FILE_poly_10::poly_mul_3_int_1);
		return poly_mul_3_3(m);
	}

	private final static Operation poly_mul_3_int_1(Prolog m) {
		m.trust(null);
		return poly_mul_3_5(m);
	}

	private final static Operation poly_mul_3_1(Prolog m) {
		// poly_mul(poly(A,B),poly(A,C),poly(A,D)):-!,term_mul(B,C,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_mul(poly(A,B),poly(A,C),poly(A,D)):-['$neck_cut',term_mul(B,C,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		if (!a2.unify(C("poly", a4, a6), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a7 = V(m);
		if (!a3.unify(C("poly", a4, a7), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_term_mul_3_static_exec(e), VA(a5, a6, a7), cont);
	}

	private final static Operation poly_mul_3_2(Prolog m) {
		// poly_mul(poly(A,B),poly(C,D),poly(A,E)):-A less_than C,!,mul_through(B,poly(C,D),E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_mul(poly(A,B),poly(C,D),poly(A,E)):-['$get_level'(F),A less_than C,'$cut'(F),mul_through(B,poly(C,D),E)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a2.unify(C("poly", a6, a7), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a8 = V(m);
		if (!a3.unify(C("poly", a4, a8), m.trail)) {
			return m.fail();
		}
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a6, a7);
		a10 = S("poly", y1);
		return //
		Op((Prolog e) -> PRED_less_than_2_static_exec(e), VA(a4, a6), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a9), //
						Op((Prolog e) -> PRED_mul_through_3_static_exec(e), VA(a5, a10, a8), cont)));
	}

	private final static Operation poly_mul_3_3(Prolog m) {
		// poly_mul(A,poly(B,C),poly(B,D)):-!,mul_through(C,A,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_mul(A,poly(B,C),poly(B,D)):-['$neck_cut',mul_through(C,A,D)]
		a2 = a2.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a2.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		if (!a3.unify(C("poly", a4, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_mul_through_3_static_exec(e), VA(a5, a1, a6), cont);
	}

	private final static Operation poly_mul_3_4(Prolog m) {
		// poly_mul(poly(A,B),C,poly(A,D)):-!,mul_through(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_mul(poly(A,B),C,poly(A,D)):-['$neck_cut',mul_through(B,C,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("poly", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		if (!a3.unify(C("poly", a4, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_mul_through_3_static_exec(e), VA(a5, a2, a6), cont);
	}

	private final static Operation poly_mul_3_5(Prolog m) {
		// poly_mul(A,B,C):-C is A*B
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// poly_mul(A,B,C):-[C is A*B]
		Term[] y1 = VA(a1, a2);
		a4 = S("*", y1);
		//START inline expansion of a(3)is a(4)
		if (!a3.unify(Arithmetic.evaluate(a4), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: term_mul/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final SymbolTerm PRED_term_mul_3_s1 = SYM("[]");

	public static Operation PRED_term_mul_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::term_mul_3_var, FILE_poly_10::term_mul_3_2, FILE_poly_10::term_mul_3_2, FILE_poly_10::term_mul_3_con, FILE_poly_10::term_mul_3_2, FILE_poly_10::term_mul_3_lis);
	}

	private final static Operation term_mul_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_mul_3_var_1);
		return term_mul_3_1(m);
	}

	private final static Operation term_mul_3_var_1(Prolog m) {
		m.retry(null, FILE_poly_10::term_mul_3_var_2);
		return term_mul_3_2(m);
	}

	private final static Operation term_mul_3_var_2(Prolog m) {
		m.trust(null);
		return term_mul_3_3(m);
	}

	private final static Operation term_mul_3_con(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_mul_3_con_1);
		return term_mul_3_1(m);
	}

	private final static Operation term_mul_3_con_1(Prolog m) {
		m.trust(null);
		return term_mul_3_2(m);
	}

	private final static Operation term_mul_3_lis(Prolog m) {
		m.jtry3(null, FILE_poly_10::term_mul_3_lis_1);
		return term_mul_3_2(m);
	}

	private final static Operation term_mul_3_lis_1(Prolog m) {
		m.trust(null);
		return term_mul_3_3(m);
	}

	private final static Operation term_mul_3_1(Prolog m) {
		// term_mul([],A,[]):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_mul([],A,[]):-['$neck_cut']
		if (!PRED_term_mul_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_term_mul_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation term_mul_3_2(Prolog m) {
		// term_mul(A,[],[]):-!
		Term a2, a3;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_mul(A,[],[]):-['$neck_cut']
		if (!PRED_term_mul_3_s1.unify(a2, m.trail))
			return m.fail();
		if (!PRED_term_mul_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation term_mul_3_3(Prolog m) {
		// term_mul([A|B],C,D):-single_term_mul(C,A,E),term_mul(B,C,F),term_add(E,F,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// term_mul([A|B],C,D):-[single_term_mul(C,A,E),term_mul(B,C,F),term_add(E,F,D)]
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
		a7 = V(m);
		return //
		Op((Prolog e) -> PRED_single_term_mul_3_static_exec(e), VA(a2, a4, a6), //
				Op((Prolog e) -> PRED_term_mul_3_static_exec(e), VA(a5, a2, a7), //
						Op((Prolog e) -> PRED_term_add_3_static_exec(e), VA(a6, a7, a3), cont)));
	}

	/** PREDICATE: single_term_mul/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final SymbolTerm PRED_single_term_mul_3_s1 = SYM("[]");

	public static Operation PRED_single_term_mul_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::single_term_mul_3_var, fail_0, fail_0, FILE_poly_10::single_term_mul_3_1, fail_0, FILE_poly_10::single_term_mul_3_2);
	}

	private final static Operation single_term_mul_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::single_term_mul_3_var_1);
		return single_term_mul_3_1(m);
	}

	private final static Operation single_term_mul_3_var_1(Prolog m) {
		m.trust(null);
		return single_term_mul_3_2(m);
	}

	private final static Operation single_term_mul_3_1(Prolog m) {
		// single_term_mul([],A,[]):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// single_term_mul([],A,[]):-['$neck_cut']
		if (!PRED_single_term_mul_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_single_term_mul_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation single_term_mul_3_2(Prolog m) {
		// single_term_mul([term(A,B)|C],term(D,E),[term(F,G)|H]):-F is A+D,poly_mul(B,E,G),single_term_mul(C,term(D,E),H)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// single_term_mul([term(A,B)|C],term(D,E),[term(F,G)|H]):-[F is A+D,poly_mul(B,E,G),single_term_mul(C,term(D,E),H)]
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
		a4 = a4.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a4.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a8 = V(m);
		a9 = V(m);
		if (!a2.unify(C("term", a8, a9), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a3.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a3.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		a12 = V(m);
		a13 = V(m);
		if (!a10.unify(C("term", a12, a13), m.trail)) {
			return m.fail();
		}
		Term[] y1 = VA(a6, a8);
		a14 = S("+", y1);
		//START inline expansion of a(12)is a(14)
		if (!a12.unify(Arithmetic.evaluate(a14), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y2 = VA(a8, a9);
		a15 = S("term", y2);
		return //
		Op((Prolog e) -> PRED_poly_mul_3_static_exec(e), VA(a7, a9, a13), //
				Op((Prolog e) -> PRED_single_term_mul_3_static_exec(e), VA(a5, a15, a11), cont));
	}

	/** PREDICATE: mul_through/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/poly_10.pl
	*/
	private static final SymbolTerm PRED_mul_through_3_s1 = SYM("[]");

	public static Operation PRED_mul_through_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_poly_10::mul_through_3_var, fail_0, fail_0, FILE_poly_10::mul_through_3_1, fail_0, FILE_poly_10::mul_through_3_2);
	}

	private final static Operation mul_through_3_var(Prolog m) {
		m.jtry3(null, FILE_poly_10::mul_through_3_var_1);
		return mul_through_3_1(m);
	}

	private final static Operation mul_through_3_var_1(Prolog m) {
		m.trust(null);
		return mul_through_3_2(m);
	}

	private final static Operation mul_through_3_1(Prolog m) {
		// mul_through([],A,[]):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// mul_through([],A,[]):-['$neck_cut']
		if (!PRED_mul_through_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_mul_through_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation mul_through_3_2(Prolog m) {
		// mul_through([term(A,B)|C],D,[term(A,E)|F]):-poly_mul(B,D,E),mul_through(C,D,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// mul_through([term(A,B)|C],D,[term(A,E)|F]):-[poly_mul(B,D,E),mul_through(C,D,F)]
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
		a4 = a4.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a4.unify(C("term", a6, a7), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a8 = argz[0];
			a9 = argz[1];
		} else if (a3.isVar()) {
			a8 = V(m);
			a9 = V(m);
			a3.bind(CONS(a8, a9), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		if (!a8.unify(C("term", a6, a10), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_poly_mul_3_static_exec(e), VA(a7, a2, a10), //
				Op((Prolog e) -> PRED_mul_through_3_static_exec(e), VA(a5, a2, a9), cont));
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_poly_10::PRED_top_0_static_exec);
		PredTable.registerBuiltin("poly_10", 0, FILE_poly_10::PRED_poly_10_0_static_exec);
		PredTable.registerBuiltin("test_poly", 1, FILE_poly_10::PRED_test_poly_1_static_exec);
		PredTable.registerBuiltin("less_than", 2, FILE_poly_10::PRED_less_than_2_static_exec);
		PredTable.registerBuiltin("poly_add", 3, FILE_poly_10::PRED_poly_add_3_static_exec);
		PredTable.registerBuiltin("term_add", 3, FILE_poly_10::PRED_term_add_3_static_exec);
		PredTable.registerBuiltin("add_to_order_zero_term", 3, FILE_poly_10::PRED_add_to_order_zero_term_3_static_exec);
		PredTable.registerBuiltin("poly_exp", 3, FILE_poly_10::PRED_poly_exp_3_static_exec);
		PredTable.registerBuiltin("poly_mul", 3, FILE_poly_10::PRED_poly_mul_3_static_exec);
		PredTable.registerBuiltin("term_mul", 3, FILE_poly_10::PRED_term_mul_3_static_exec);
		PredTable.registerBuiltin("single_term_mul", 3, FILE_poly_10::PRED_single_term_mul_3_static_exec);
		PredTable.registerBuiltin("mul_through", 3, FILE_poly_10::PRED_mul_through_3_static_exec);
	}
}
