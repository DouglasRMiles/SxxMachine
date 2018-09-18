package SxxMachine.bench;

import static SxxMachine.bootpreds.*;
import static SxxMachine.FILE_builtins.*;
import static SxxMachine.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.*;

public class FILE_fast_mu  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final SymbolTerm PRED_top_0_s1 = SYM("m");
	final static SymbolTerm ATOM_u = SYM("u");
	final static SymbolTerm ATOM_i = SYM("i");
	private static final ListTerm PRED_top_0_s5 = CONS(ATOM_u, Prolog.Nil);
	private static final ListTerm PRED_top_0_s6 = CONS(ATOM_i, PRED_top_0_s5);
	private static final ListTerm PRED_top_0_s7 = CONS(ATOM_i, PRED_top_0_s6);
	private static final ListTerm PRED_top_0_s8 = CONS(ATOM_u, PRED_top_0_s7);
	private static final ListTerm PRED_top_0_s9 = CONS(PRED_top_0_s1, PRED_top_0_s8);

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-theorem([m,u,i,i,u])
		m.setB0();
		// top:-[theorem([m,u,i,i,u])]
		return //
		Op((Prolog e) -> PRED_theorem_1_static_exec(e), VA(PRED_top_0_s9), cont);
	}

	/** PREDICATE: theorem/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	final static IntegerTerm int_1 = Integer(1);
	final static SymbolTerm ATOM_m = SYM("m");
	private static final ListTerm PRED_theorem_1_s6 = CONS(ATOM_i, Prolog.Nil);
	private static final ListTerm PRED_theorem_1_s7 = CONS(ATOM_m, PRED_theorem_1_s6);
	final static IntegerTerm int_0 = Integer(0);

	public static Operation PRED_theorem_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// theorem(A):-length(A,B),C is B-1,derive([m,i],A,1,C,D,0)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		// theorem(A):-[length(A,B),C is B-1,derive([m,i],A,1,C,D,0)]
		a2 = V(m);
		a3 = V(m);
		Term[] y1 = VA(a2, int_1);
		a4 = S("-", y1);
		return //
		Op((Prolog e) -> PRED_length_2_static_exec(e), VA(a1, a2), //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a3, a4), //
						Op((Prolog e) -> PRED_derive_6_static_exec(e), VA(PRED_theorem_1_s7, a1, int_1, a3, V(m), int_0), cont)));
	}

	/** PREDICATE: derive/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final /**/ IntegerTerm PRED_derive_6_s1 = Integer(1);

	// private final Term arg5, arg6;

	public static Operation PRED_derive_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return derive_6_top(m);
	}

	private final static Operation derive_6_top(Prolog m) {
		m.setB0();
		m.jtry6(null, FILE_fast_mu::derive_6_sub_1);
		return derive_6_1(m);
	}

	private final static Operation derive_6_sub_1(Prolog m) {
		m.trust(null);
		return derive_6_2(m);
	}

	private final static Operation derive_6_1(Prolog m) {
		// derive(A,B,C,D,E,F):-derive2(A,B,C,D,1,E,F)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// derive(A,B,C,D,E,F):-[derive2(A,B,C,D,1,E,F)]
		return //
		Op((Prolog e) -> PRED_derive2_7_static_exec(e), VA(a1, a2, a3, a4, PRED_derive_6_s1, a5, a6), cont);
	}

	private final static Operation derive_6_2(Prolog m) {
		// derive(A,B,C,D,E,F):-G is F+1,derive(A,B,C,D,E,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// derive(A,B,C,D,E,F):-[G is F+1,derive(A,B,C,D,E,G)]
		a7 = V(m);
		Term[] y1 = VA(a6, PRED_derive_6_s1);
		a8 = S("+", y1);
		//START inline expansion of a(7)is a(8)
		if (!a7.unify(Arithmetic.evaluate(a8), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a1;
		m.AREGS[1] = a2;
		m.AREGS[2] = a3;
		m.AREGS[3] = a4;
		m.AREGS[4] = a5;
		m.AREGS[5] = a7;
		m.cont = cont;
		return derive_6_top(m);
	}

	/** PREDICATE: derive2/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final SymbolTerm PRED_derive2_7_s1 = SYM("[]");

	// private final Term arg5, arg6, arg7;

	public static Operation PRED_derive2_7_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry7(null, FILE_fast_mu::derive2_7_sub_1);
		return derive2_7_1(m);
	}

	private final static Operation derive2_7_sub_1(Prolog m) {
		m.trust(null);
		return derive2_7_2(m);
	}

	private final static Operation derive2_7_1(Prolog m) {
		// derive2(A,A,B,B,C,[],D):-true
		Term a1, a2, a3, a4, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a6 = m.AREGS[5];
		cont = m.cont;
		// derive2(A,A,B,B,C,[],D):-[]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!PRED_derive2_7_s1.unify(a6, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation derive2_7_2(Prolog m) {
		// derive2(A,B,C,D,E,[rule(F,G)|H],I):-lower_bound(C,D,J),I>=J,K is I-1,rule(A,G,C,L,E,M,F),derive2(G,B,L,D,M,H,K)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		cont = m.cont;
		// derive2(A,B,C,D,E,[rule(F,G)|H],I):-[lower_bound(C,D,J),'$greater_or_equal'(I,J),K is I-1,rule(A,G,C,L,E,M,F),derive2(G,B,L,D,M,H,K)]
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			a8 = argz[0];
			a9 = argz[1];
		} else if (a6.isVar()) {
			a8 = V(m);
			a9 = V(m);
			a6.bind(CONS(a8, a9), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		a11 = V(m);
		if (!a8.unify(C("rule", a10, a11), m.trail)) {
			return m.fail();
		}
		a12 = V(m);
		a13 = V(m);
		Term[] y1 = VA(a7, int_1);
		a14 = S("-", y1);
		a15 = V(m);
		a16 = V(m);
		return //
		Op((Prolog e) -> PRED_lower_bound_3_static_exec(e), VA(a3, a4, a12), //
				Op((Prolog e) -> PRED_$greater_or_equal_2_static_exec(e), VA(a7, a12), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a13, a14), //
								Op((Prolog e) -> PRED_rule_7_static_exec(e), VA(a1, a11, a3, a15, a5, a16, a10), //
										Op((Prolog e) -> PRED_derive2_7_static_exec(e), VA(a11, a2, a15, a4, a16, a9, a13), cont)))));
	}

	/** PREDICATE: rule/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final SymbolTerm PRED_rule_7_s1 = SYM("m");

	// private final Term arg5, arg6, arg7;

	public static Operation PRED_rule_7_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// rule([m|A],[m|B],C,D,E,F,G):-rule(A,B,C,D,E,F,1,i,G,H,H)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		a5 = LARG[4];
		a6 = LARG[5];
		a7 = LARG[6];
		// rule([m|A],[m|B],C,D,E,F,G):-[rule(A,B,C,D,E,F,1,i,G,H,H)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			if (!PRED_rule_7_s1.unify(argz[0], m.trail))
				return m.fail();
			a8 = argz[1];
		} else if (a1.isVar()) {
			a8 = V(m);
			a1.bind(CONS(PRED_rule_7_s1, a8), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!PRED_rule_7_s1.unify(argz[0], m.trail))
				return m.fail();
			a9 = argz[1];
		} else if (a2.isVar()) {
			a9 = V(m);
			a2.bind(CONS(PRED_rule_7_s1, a9), m.trail);
		} else {
			return m.fail();
		}
		a10 = V(m);
		return //
		Op((Prolog e) -> PRED_rule_11_static_exec(e), VA(a8, a9, a3, a4, a5, a6, int_1, ATOM_i, a7, a10, a10), cont);
	}

	/** PREDICATE: rule/11
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final SymbolTerm PRED_rule_11_s1 = SYM("i");
	private static final ListTerm PRED_rule_11_s3 = CONS(PRED_rule_11_s1, Prolog.Nil);
	private static final ListTerm PRED_rule_11_s5 = CONS(ATOM_u, Prolog.Nil);
	private static final ListTerm PRED_rule_11_s6 = CONS(PRED_rule_11_s1, PRED_rule_11_s5);
	final static IntegerTerm int_2 = Integer(2);
	final static IntegerTerm int_3 = Integer(3);
	final static IntegerTerm int_4 = Integer(4);

	// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;

	public static Operation PRED_rule_11_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return rule_11_top(m);
	}

	private final static Operation rule_11_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_fast_mu::rule_11_var, fail_0, fail_0, FILE_fast_mu::rule_11_2, fail_0, FILE_fast_mu::rule_11_lis);
	}

	private final static Operation rule_11_var(Prolog m) {
		m.jtry(11, null, FILE_fast_mu::rule_11_var_1);
		return rule_11_1(m);
	}

	private final static Operation rule_11_var_1(Prolog m) {
		m.retry(null, FILE_fast_mu::rule_11_var_2);
		return rule_11_2(m);
	}

	private final static Operation rule_11_var_2(Prolog m) {
		m.retry(null, FILE_fast_mu::rule_11_var_3);
		return rule_11_3(m);
	}

	private final static Operation rule_11_var_3(Prolog m) {
		m.retry(null, FILE_fast_mu::rule_11_var_4);
		return rule_11_4(m);
	}

	private final static Operation rule_11_var_4(Prolog m) {
		m.trust(null);
		return rule_11_5(m);
	}

	private final static Operation rule_11_lis(Prolog m) {
		m.jtry(11, null, FILE_fast_mu::rule_11_lis_1);
		return rule_11_1(m);
	}

	private final static Operation rule_11_lis_1(Prolog m) {
		m.retry(null, FILE_fast_mu::rule_11_lis_2);
		return rule_11_3(m);
	}

	private final static Operation rule_11_lis_2(Prolog m) {
		m.retry(null, FILE_fast_mu::rule_11_lis_3);
		return rule_11_4(m);
	}

	private final static Operation rule_11_lis_3(Prolog m) {
		m.trust(null);
		return rule_11_5(m);
	}

	private final static Operation rule_11_1(Prolog m) {
		// rule([i],[i,u],A,B,C,D,E,F,1,G,H):-E>=C,D is E-2,B is A+1
		Term a1, a2, a3, a4, a5, a6, a7, a9, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a9 = m.AREGS[8];
		cont = m.cont;
		// rule([i],[i,u],A,B,C,D,E,F,1,G,H):-['$greater_or_equal'(E,C),D is E-2,B is A+1]
		if (!PRED_rule_11_s3.unify(a1, m.trail))
			return m.fail();
		if (!PRED_rule_11_s6.unify(a2, m.trail))
			return m.fail();
		if (!int_1.unify(a9, m.trail))
			return m.fail();
		//START inline expansion of $greater_or_equal(a(7),a(5))
		if (Arithmetic.evaluate(a7).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a7, int_2);
		a12 = S("-", y1);
		//START inline expansion of a(6)is a(12)
		if (!a6.unify(Arithmetic.evaluate(a12), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y2 = VA(a3, int_1);
		a13 = S("+", y2);
		//START inline expansion of a(4)is a(13)
		if (!a4.unify(Arithmetic.evaluate(a13), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation rule_11_2(Prolog m) {
		// rule([],A,B,C,D,1,E,F,2,A,[]):-C is B+B
		Term a1, a2, a3, a4, a6, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a6 = m.AREGS[5];
		a9 = m.AREGS[8];
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		cont = m.cont;
		// rule([],A,B,C,D,1,E,F,2,A,[]):-[C is B+B]
		if (!Prolog.Nil.unify(a1, m.trail))
			return m.fail();
		if (!int_1.unify(a6, m.trail))
			return m.fail();
		if (!int_2.unify(a9, m.trail))
			return m.fail();
		if (!a2.unify(a10, m.trail))
			return m.fail();
		if (!Prolog.Nil.unify(a11, m.trail))
			return m.fail();
		Term[] y1 = VA(a3, a3);
		a12 = S("+", y1);
		//START inline expansion of a(4)is a(12)
		if (!a4.unify(Arithmetic.evaluate(a12), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation rule_11_3(Prolog m) {
		// rule([i,i,i|A],[u|A],B,C,D,E,F,G,3,H,I):-F>=D,E is F-1,C is B-2
		Term a1, a2, a3, a4, a5, a6, a7, a9, a12, a13, a14, a15, a16;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a9 = m.AREGS[8];
		cont = m.cont;
		// rule([i,i,i|A],[u|A],B,C,D,E,F,G,3,H,I):-['$greater_or_equal'(F,D),E is F-1,C is B-2]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			if (!PRED_rule_11_s1.unify(argz[0], m.trail))
				return m.fail();
			a12 = argz[1];
		} else if (a1.isVar()) {
			a12 = V(m);
			a1.bind(CONS(PRED_rule_11_s1, a12), m.trail);
		} else {
			return m.fail();
		}
		a12 = a12.dref();
		if (a12.isCons()) {
			Term[] argz = VA(a12.car(), a12.cdr());
			if (!PRED_rule_11_s1.unify(argz[0], m.trail))
				return m.fail();
			a13 = argz[1];
		} else if (a12.isVar()) {
			a13 = V(m);
			a12.bind(CONS(PRED_rule_11_s1, a13), m.trail);
		} else {
			return m.fail();
		}
		a13 = a13.dref();
		if (a13.isCons()) {
			Term[] argz = VA(a13.car(), a13.cdr());
			if (!PRED_rule_11_s1.unify(argz[0], m.trail))
				return m.fail();
			a14 = argz[1];
		} else if (a13.isVar()) {
			a14 = V(m);
			a13.bind(CONS(PRED_rule_11_s1, a14), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!ATOM_u.unify(argz[0], m.trail))
				return m.fail();
			if (!a14.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a2.bind(CONS(ATOM_u, a14), m.trail);
		} else {
			return m.fail();
		}
		if (!int_3.unify(a9, m.trail))
			return m.fail();
		//START inline expansion of $greater_or_equal(a(7),a(5))
		if (Arithmetic.evaluate(a7).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a7, int_1);
		a15 = S("-", y1);
		//START inline expansion of a(6)is a(15)
		if (!a6.unify(Arithmetic.evaluate(a15), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y2 = VA(a3, int_2);
		a16 = S("-", y2);
		//START inline expansion of a(4)is a(16)
		if (!a4.unify(Arithmetic.evaluate(a16), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation rule_11_4(Prolog m) {
		// rule([u,u|A],A,B,C,D,E,F,i,4,G,H):-F>=D,E is F-2,C is B-2
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a12, a13, a14, a15;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a8 = m.AREGS[7];
		a9 = m.AREGS[8];
		cont = m.cont;
		// rule([u,u|A],A,B,C,D,E,F,i,4,G,H):-['$greater_or_equal'(F,D),E is F-2,C is B-2]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			if (!ATOM_u.unify(argz[0], m.trail))
				return m.fail();
			a12 = argz[1];
		} else if (a1.isVar()) {
			a12 = V(m);
			a1.bind(CONS(ATOM_u, a12), m.trail);
		} else {
			return m.fail();
		}
		a12 = a12.dref();
		if (a12.isCons()) {
			Term[] argz = VA(a12.car(), a12.cdr());
			if (!ATOM_u.unify(argz[0], m.trail))
				return m.fail();
			a13 = argz[1];
		} else if (a12.isVar()) {
			a13 = V(m);
			a12.bind(CONS(ATOM_u, a13), m.trail);
		} else {
			return m.fail();
		}
		if (!a13.unify(a2, m.trail))
			return m.fail();
		if (!PRED_rule_11_s1.unify(a8, m.trail))
			return m.fail();
		if (!int_4.unify(a9, m.trail))
			return m.fail();
		//START inline expansion of $greater_or_equal(a(7),a(5))
		if (Arithmetic.evaluate(a7).arithCompareTo(Arithmetic.evaluate(a5)) < 0) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a7, int_2);
		a14 = S("-", y1);
		//START inline expansion of a(6)is a(14)
		if (!a6.unify(Arithmetic.evaluate(a14), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y2 = VA(a3, int_2);
		a15 = S("-", y2);
		//START inline expansion of a(4)is a(15)
		if (!a4.unify(Arithmetic.evaluate(a15), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation rule_11_5(Prolog m) {
		// rule([A|B],[A|C],D,E,F,G,H,I,J,K,[A|L]):-M is H+1,rule(B,C,D,E,F,G,M,A,J,K,L)
		Term a1, a2, a3, a4, a5, a6, a7, a9, a10, a11, a12, a13, a14, a15, a16, a17;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a9 = m.AREGS[8];
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		cont = m.cont;
		// rule([A|B],[A|C],D,E,F,G,H,I,J,K,[A|L]):-[M is H+1,rule(B,C,D,E,F,G,M,A,J,K,L)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a12 = argz[0];
			a13 = argz[1];
		} else if (a1.isVar()) {
			a12 = V(m);
			a13 = V(m);
			a1.bind(CONS(a12, a13), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a12.unify(argz[0], m.trail))
				return m.fail();
			a14 = argz[1];
		} else if (a2.isVar()) {
			a14 = V(m);
			a2.bind(CONS(a12, a14), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			if (!a12.unify(argz[0], m.trail))
				return m.fail();
			a15 = argz[1];
		} else if (a11.isVar()) {
			a15 = V(m);
			a11.bind(CONS(a12, a15), m.trail);
		} else {
			return m.fail();
		}
		a16 = V(m);
		Term[] y1 = VA(a7, int_1);
		a17 = S("+", y1);
		//START inline expansion of a(16)is a(17)
		if (!a16.unify(Arithmetic.evaluate(a17), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a13;
		m.AREGS[1] = a14;
		m.AREGS[2] = a3;
		m.AREGS[3] = a4;
		m.AREGS[4] = a5;
		m.AREGS[5] = a6;
		m.AREGS[6] = a16;
		m.AREGS[7] = a12;
		m.AREGS[8] = a9;
		m.AREGS[9] = a10;
		m.AREGS[10] = a15;
		m.cont = cont;
		return rule_11_top(m);
	}

	/** PREDICATE: lower_bound/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final /**/ IntegerTerm PRED_lower_bound_3_s1 = Integer(1);

	public static Operation PRED_lower_bound_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_fast_mu::lower_bound_3_sub_1);
		return lower_bound_3_1(m);
	}

	private final static Operation lower_bound_3_sub_1(Prolog m) {
		m.retry(null, FILE_fast_mu::lower_bound_3_sub_2);
		return lower_bound_3_2(m);
	}

	private final static Operation lower_bound_3_sub_2(Prolog m) {
		m.trust(null);
		return lower_bound_3_3(m);
	}

	private final static Operation lower_bound_3_1(Prolog m) {
		// lower_bound(A,B,1):-A<B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lower_bound(A,B,1):-['$less_than'(A,B)]
		if (!PRED_lower_bound_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $less_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) >= 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation lower_bound_3_2(Prolog m) {
		// lower_bound(A,A,2):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lower_bound(A,A,2):-[]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!int_2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation lower_bound_3_3(Prolog m) {
		// lower_bound(A,B,C):-A>B,D is A-B,E is D/\1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'(C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lower_bound(A,B,C):-['$greater_than'(A,B),D is A-B,E is D/\1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'(C,D,E)]
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		a4 = V(m);
		Term[] y1 = VA(a1, a2);
		a5 = S("-", y1);
		//START inline expansion of a(4)is a(5)
		if (!a4.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		Term[] y2 = VA(a4, PRED_lower_bound_3_s1);
		a7 = S("/\\", y2);
		//START inline expansion of a(6)is a(7)
		if (!a6.unify(Arithmetic.evaluate(a7), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_static_exec(e), VA(a3, a4, a6), cont);
	}

	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl
	*/
	private static final /**/ IntegerTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_s1 = Integer(0);

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_fast_mu::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'(A,B,C):-C=:=0,!,A is B>>1
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'(A,B,C):-['$get_level'(D),E is 0,'$arith_equal'(C,E),'$cut'(D),A is B>>1]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		//START inline expansion of a(5)is si(1)
		if (!a5.unify(PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $arith_equal(a(3),a(5))
		if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a5)) != 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		Term[] y1 = VA(a2, int_1);
		a6 = S(">>", y1);
		//START inline expansion of a(1)is a(6)
		if (!a1.unify(Arithmetic.evaluate(a6), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_2(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'(A,B,C):-A is (B+1)>>1+1
		Term a1, a2, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl'(A,B,C):-[A is (B+1)>>1+1]
		Term[] y1 = VA(a2, int_1);
		a4 = S("+", y1);
		Term[] y2 = VA(a4, int_1);
		a5 = S(">>", y2);
		Term[] y3 = VA(a5, int_1);
		a6 = S("+", y3);
		//START inline expansion of a(1)is a(6)
		if (!a1.unify(Arithmetic.evaluate(a6), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_fast_mu::PRED_top_0_static_exec);
		PredTable.registerBuiltin("theorem", 1, FILE_fast_mu::PRED_theorem_1_static_exec);
		PredTable.registerBuiltin("derive", 6, FILE_fast_mu::PRED_derive_6_static_exec);
		PredTable.registerBuiltin("derive2", 7, FILE_fast_mu::PRED_derive2_7_static_exec);
		PredTable.registerBuiltin("rule", 7, FILE_fast_mu::PRED_rule_7_static_exec);
		PredTable.registerBuiltin("rule", 11, FILE_fast_mu::PRED_rule_11_static_exec);
		PredTable.registerBuiltin("lower_bound", 3, FILE_fast_mu::PRED_lower_bound_3_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/fast_mu.pl", "$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl",
				3, FILE_fast_mu::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Ffast_mu$002Epl_3_static_exec);
	}
}
