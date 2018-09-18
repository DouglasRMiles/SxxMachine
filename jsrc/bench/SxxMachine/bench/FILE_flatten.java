package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_flatten  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry0(null, FILE_flatten::top_0_sub_1);
		return top_0_1(m);
	}

	private final static Operation top_0_sub_1(Prolog m) {
		m.trust(null);
		return top_0_2(m);
	}

	private final static Operation top_0_1(Prolog m) {
		// top:-eliminate_disjunctions([(a(A,B,C):-b(A);c(C))],D,E,[]),inst_vars((D,E))
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		cont = m.cont;
		// top:-[eliminate_disjunctions([(a(A,B,C):-b(A);c(C))],D,E,[]),inst_vars((D,E))]
		a1 = V(m);
		a2 = V(m);
		Term[] y1 = VA(a1, V(m), a2);
		a3 = S("a", y1);
		Term[] y2 = VA(a1);
		a4 = S("b", y2);
		Term[] y3 = VA(a2);
		a5 = S("c", y3);
		Term[] y4 = VA(a4, a5);
		a6 = S(";", y4);
		Term[] y5 = VA(a3, a6);
		a7 = S(":-", y5);
		a8 = CONS(a7, Prolog.Nil);
		a9 = V(m);
		a10 = V(m);
		Term[] y6 = VA(a9, a10);
		a11 = S(",", y6);
		return //
		Op((Prolog e) -> PRED_eliminate_disjunctions_4_static_exec(e), VA(a8, a9, a10, Prolog.Nil), //
				Op((Prolog e) -> PRED_inst_vars_1_static_exec(e), VA(a11), cont));
	}

	private final static Operation top_0_2(Prolog m) {
		// top:-true
		Operation cont;
		cont = m.cont;
		// top:-[]
		return cont;
	}

	/** PREDICATE: eliminate_disjunctions/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_eliminate_disjunctions_4_s1 = SYM("[]");

	public static Operation PRED_eliminate_disjunctions_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// eliminate_disjunctions(A,B,C,D):-gather_disj(A,B,E,[]),treat_disj(E,C,D)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// eliminate_disjunctions(A,B,C,D):-[gather_disj(A,B,E,[]),treat_disj(E,C,D)]
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_gather_disj_4_static_exec(e), VA(a1, a2, a5, PRED_eliminate_disjunctions_4_s1), //
				Op((Prolog e) -> PRED_treat_disj_3_static_exec(e), VA(a5, a3, a4), cont));
	}

	/** PREDICATE: gather_disj/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_gather_disj_4_s1 = SYM("[]");

	public static Operation PRED_gather_disj_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_flatten::gather_disj_4_var, fail_0, fail_0, FILE_flatten::gather_disj_4_1, fail_0, FILE_flatten::gather_disj_4_2);
	}

	private final static Operation gather_disj_4_var(Prolog m) {
		m.jtry4(null, FILE_flatten::gather_disj_4_var_1);
		return gather_disj_4_1(m);
	}

	private final static Operation gather_disj_4_var_1(Prolog m) {
		m.trust(null);
		return gather_disj_4_2(m);
	}

	private final static Operation gather_disj_4_1(Prolog m) {
		// gather_disj([],[],A,A):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// gather_disj([],[],A,A):-[]
		if (!PRED_gather_disj_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_gather_disj_4_s1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation gather_disj_4_2(Prolog m) {
		// gather_disj([A|B],C,D,E):-extract_disj(A,F,D,G),C=[F|H],gather_disj(B,H,G,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// gather_disj([A|B],C,D,E):-[extract_disj(A,F,D,G),'$unify'(C,[F|H]),gather_disj(B,H,G,E)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a1.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a1.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		a10 = CONS(a7, a9);
		return //
		Op((Prolog e) -> PRED_extract_disj_4_static_exec(e), VA(a5, a7, a3, a8), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, a10), //
						Op((Prolog e) -> PRED_gather_disj_4_static_exec(e), VA(a6, a9, a8, a4), cont)));
	}

	/** PREDICATE: extract_disj/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	final static IntegerTerm int_0 = Integer(0);

	public static Operation PRED_extract_disj_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry4(null, FILE_flatten::extract_disj_4_sub_1);
		return extract_disj_4_1(m);
	}

	private final static Operation extract_disj_4_sub_1(Prolog m) {
		m.trust(null);
		return extract_disj_4_2(m);
	}

	private final static Operation extract_disj_4_1(Prolog m) {
		// extract_disj(A,(B:-C),D,E):-A=(B:-F),!,G=0,extract_disj(F,C,D,E,A,G,H)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// extract_disj(A,(B:-C),D,E):-['$get_level'(F),'$unify'(A,(B:-G)),'$cut'(F),'$unify'(H,0),extract_disj(G,C,D,E,A,H,I)]
		a2 = a2.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a2.unify(C(":-", a5, a6), m.trail)) {
			return m.fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a8 = V(m);
		Term[] y1 = VA(a5, a8);
		a9 = S(":-", y1);
		//START inline expansion of $unify(a(1),a(9))
		if (!a1.unify(a9, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		a10 = V(m);
		//START inline expansion of $unify(a(10),@(int_0))
		if (!a10.unify(int_0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_extract_disj_7_static_exec(e), VA(a8, a6, a3, a4, a1, a10, V(m)), cont);
	}

	private final static Operation extract_disj_4_2(Prolog m) {
		// extract_disj(A,A,B,B):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// extract_disj(A,A,B,B):-[]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: extract_disj/7
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	final static IntegerTerm int_1 = Integer(1);

	// private final Term arg5, arg6, arg7;

	public static Operation PRED_extract_disj_7_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return extract_disj_7_top(m);
	}

	private final static Operation extract_disj_7_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_flatten::extract_disj_7_var, FILE_flatten::extract_disj_7_int, FILE_flatten::extract_disj_7_int, FILE_flatten::extract_disj_7_int, FILE_flatten::extract_disj_7_var,
				FILE_flatten::extract_disj_7_int);
	}

	private final static Operation extract_disj_7_var(Prolog m) {
		m.jtry7(null, FILE_flatten::extract_disj_7_var_1);
		return extract_disj_7_1(m);
	}

	private final static Operation extract_disj_7_var_1(Prolog m) {
		m.retry(null, FILE_flatten::extract_disj_7_var_2);
		return extract_disj_7_2(m);
	}

	private final static Operation extract_disj_7_var_2(Prolog m) {
		m.trust(null);
		return extract_disj_7_3(m);
	}

	private final static Operation extract_disj_7_int(Prolog m) {
		m.jtry7(null, FILE_flatten::extract_disj_7_int_1);
		return extract_disj_7_2(m);
	}

	private final static Operation extract_disj_7_int_1(Prolog m) {
		m.trust(null);
		return extract_disj_7_3(m);
	}

	private final static Operation extract_disj_7_1(Prolog m) {
		// extract_disj((A,B),(C,D),E,F,G,H,I):-extract_disj(A,C,E,J,G,H,K),extract_disj(B,D,J,F,G,K,I)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		cont = m.cont;
		// extract_disj((A,B),(C,D),E,F,G,H,I):-[extract_disj(A,C,E,J,G,H,K),extract_disj(B,D,J,F,G,K,I)]
		a1 = a1.dref();
		a8 = V(m);
		a9 = V(m);
		if (!a1.unify(C(",", a8, a9), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a10 = V(m);
		a11 = V(m);
		if (!a2.unify(C(",", a10, a11), m.trail)) {
			return m.fail();
		}
		a12 = V(m);
		a13 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_extract_disj_7_static_exec(e), VA(a9, a11, a12, a4, a5, a13, a7), cont);
		m.AREGS[0] = a8;
		m.AREGS[1] = a10;
		m.AREGS[2] = a3;
		m.AREGS[3] = a12;
		m.AREGS[4] = a5;
		m.AREGS[5] = a6;
		m.AREGS[6] = a13;
		m.cont = p1;
		return extract_disj_7_top(m);
	}

	private final static Operation extract_disj_7_2(Prolog m) {
		// extract_disj(A,B,C,D,E,F,G):-is_disj(A,H),!,C=[disj(H,F,B,E)|D],G is F+1
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		cont = m.cont;
		// extract_disj(A,B,C,D,E,F,G):-['$get_level'(H),is_disj(A,I),'$cut'(H),'$unify'(C,[disj(I,F,B,E)|D]),G is F+1]
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if (!a8.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a9 = V(m);
		Term[] y1 = VA(a9, a6, a2, a5);
		a10 = S("disj", y1);
		a11 = CONS(a10, a4);
		Term[] y2 = VA(a6, int_1);
		a12 = S("+", y2);
		return //
		Op((Prolog e) -> PRED_is_disj_2_static_exec(e), VA(a1, a9), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a8), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a11), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a7, a12), cont))));
	}

	private final static Operation extract_disj_7_3(Prolog m) {
		// extract_disj(A,A,B,B,C,D,D):-true
		Term a1, a2, a3, a4, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		cont = m.cont;
		// extract_disj(A,A,B,B,C,D,D):-[]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a6.unify(a7, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: is_disj/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	final static SymbolTerm ATOM_$0021 = SYM("!");
	final static SymbolTerm ATOM_fail = SYM("fail");
	private static final StructureTerm PRED_is_disj_2_s9 = S(",", ATOM_$0021, ATOM_fail);

	public static Operation PRED_is_disj_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_flatten::is_disj_2_var, fail_0, fail_0, fail_0, FILE_flatten::is_disj_2_var, fail_0);
	}

	private final static Operation is_disj_2_var(Prolog m) {
		m.jtry2(null, FILE_flatten::is_disj_2_var_1);
		return is_disj_2_1(m);
	}

	private final static Operation is_disj_2_var_1(Prolog m) {
		m.retry(null, FILE_flatten::is_disj_2_var_2);
		return is_disj_2_2(m);
	}

	private final static Operation is_disj_2_var_2(Prolog m) {
		m.retry(null, FILE_flatten::is_disj_2_var_3);
		return is_disj_2_3(m);
	}

	private final static Operation is_disj_2_var_3(Prolog m) {
		m.retry(null, FILE_flatten::is_disj_2_var_4);
		return is_disj_2_4(m);
	}

	private final static Operation is_disj_2_var_4(Prolog m) {
		m.trust(null);
		return is_disj_2_5(m);
	}

	private final static Operation is_disj_2_1(Prolog m) {
		// is_disj((A->B;C),(A,!,B;C)):-!
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// is_disj((A->B;C),(A,!,B;C)):-['$neck_cut']
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(";", a3, a4), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C("->", a5, a6), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a7 = V(m);
		if (!a2.unify(C(";", a7, a4), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		a8 = V(m);
		if (!a7.unify(C(",", a5, a8), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C(",", ATOM_$0021, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation is_disj_2_2(Prolog m) {
		// is_disj((A;B),(A;B)):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// is_disj((A;B),(A;B)):-[]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(";", a3, a4), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (!a2.unify(C(";", a3, a4), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation is_disj_2_3(Prolog m) {
		// is_disj(not(A),(A,!,fail;true)):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// is_disj(not(A),(A,!,fail;true)):-[]
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("not", a3), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a4 = V(m);
		if (!a2.unify(C(";", a4, Prolog.True), m.trail)) {
			return m.fail();
		}
		a4 = a4.dref();
		if (!a4.unify(C(",", a3, PRED_is_disj_2_s9), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation is_disj_2_4(Prolog m) {
		// is_disj(\+A,(A,!,fail;true)):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// is_disj(\+A,(A,!,fail;true)):-[]
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("\\+", a3), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a4 = V(m);
		if (!a2.unify(C(";", a4, Prolog.True), m.trail)) {
			return m.fail();
		}
		a4 = a4.dref();
		if (!a4.unify(C(",", a3, PRED_is_disj_2_s9), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation is_disj_2_5(Prolog m) {
		// is_disj(A\=B,(A=B,!,fail;true)):-true
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// is_disj(A\=B,(A=B,!,fail;true)):-[]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("\\=", a3, a4), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a5 = V(m);
		if (!a2.unify(C(";", a5, Prolog.True), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		a6 = V(m);
		if (!a5.unify(C(",", a6, PRED_is_disj_2_s9), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		if (!a6.unify(C("=", a3, a4), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: treat_disj/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_treat_disj_3_s1 = SYM("[]");

	public static Operation PRED_treat_disj_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_flatten::treat_disj_3_var, fail_0, fail_0, FILE_flatten::treat_disj_3_1, fail_0, FILE_flatten::treat_disj_3_2);
	}

	private final static Operation treat_disj_3_var(Prolog m) {
		m.jtry3(null, FILE_flatten::treat_disj_3_var_1);
		return treat_disj_3_1(m);
	}

	private final static Operation treat_disj_3_var_1(Prolog m) {
		m.trust(null);
		return treat_disj_3_2(m);
	}

	private final static Operation treat_disj_3_1(Prolog m) {
		// treat_disj([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// treat_disj([],A,A):-[]
		if (!PRED_treat_disj_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation treat_disj_3_2(Prolog m) {
		// treat_disj([disj((A;B),C,D,E)|F],G,H):-find_vars((A;B),I),find_vars(E,J),intersect_vars(I,J,K),make_dummy_name(C,L),D=..[L|K],make_dummy_clauses((A;B),D,G,M),treat_disj(F,M,H)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// treat_disj([disj((A;B),C,D,E)|F],G,H):-[find_vars((A;B),I),find_vars(E,J),intersect_vars(I,J,K),make_dummy_name(C,L),'$univ'(D,[L|K]),make_dummy_clauses((A;B),D,G,M),treat_disj(F,M,H)]
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
		a8 = V(m);
		a9 = V(m);
		if (!a4.unify(C("disj", a6, a7, a8, a9), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a10 = V(m);
		a11 = V(m);
		if (!a6.unify(C(";", a10, a11), m.trail)) {
			return m.fail();
		}
		Term[] y1 = VA(a10, a11);
		a12 = S(";", y1);
		a13 = V(m);
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		a17 = CONS(a16, a15);
		Term[] y2 = VA(a10, a11);
		a18 = S(";", y2);
		a19 = V(m);
		return //
		Op((Prolog e) -> PRED_find_vars_2_static_exec(e), VA(a12, a13), //
				Op((Prolog e) -> PRED_find_vars_2_static_exec(e), VA(a9, a14), //
						Op((Prolog e) -> PRED_intersect_vars_3_static_exec(e), VA(a13, a14, a15), //
								Op((Prolog e) -> PRED_make_dummy_name_2_static_exec(e), VA(a7, a16), //
										Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a8, a17), //
												Op((Prolog e) -> PRED_make_dummy_clauses_4_static_exec(e), VA(a18, a8, a2, a19), //
														Op((Prolog e) -> PRED_treat_disj_3_static_exec(e), VA(a5, a19, a3), cont)))))));
	}

	/** PREDICATE: make_dummy_clauses/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_make_dummy_clauses_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_flatten::make_dummy_clauses_4_var, FILE_flatten::make_dummy_clauses_4_2, FILE_flatten::make_dummy_clauses_4_2, FILE_flatten::make_dummy_clauses_4_2,
				FILE_flatten::make_dummy_clauses_4_var, FILE_flatten::make_dummy_clauses_4_2);
	}

	private final static Operation make_dummy_clauses_4_var(Prolog m) {
		m.jtry4(null, FILE_flatten::make_dummy_clauses_4_var_1);
		return make_dummy_clauses_4_1(m);
	}

	private final static Operation make_dummy_clauses_4_var_1(Prolog m) {
		m.trust(null);
		return make_dummy_clauses_4_2(m);
	}

	private final static Operation make_dummy_clauses_4_1(Prolog m) {
		// make_dummy_clauses((A;B),C,[D|E],F):-!,copy((C:-A),D),make_dummy_clauses(B,C,E,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// make_dummy_clauses((A;B),C,[D|E],F):-['$neck_cut',copy((C:-A),D),make_dummy_clauses(B,C,E,F)]
		a1 = a1.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a1.unify(C(";", a5, a6), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a7 = argz[0];
			a8 = argz[1];
		} else if (a3.isVar()) {
			a7 = V(m);
			a8 = V(m);
			a3.bind(CONS(a7, a8), m.trail);
		} else {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		Term[] y1 = VA(a2, a5);
		a9 = S(":-", y1);
		return //
		Op((Prolog e) -> PRED_copy_2_static_exec(e), VA(a9, a7), //
				Op((Prolog e) -> PRED_make_dummy_clauses_4_static_exec(e), VA(a6, a2, a8, a4), cont));
	}

	private final static Operation make_dummy_clauses_4_2(Prolog m) {
		// make_dummy_clauses(A,B,[C|D],D):-copy((B:-A),C)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// make_dummy_clauses(A,B,[C|D],D):-[copy((B:-A),C)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a3.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a3.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		if (!a6.unify(a4, m.trail))
			return m.fail();
		Term[] y1 = VA(a2, a1);
		a7 = S(":-", y1);
		return //
		Op((Prolog e) -> PRED_copy_2_static_exec(e), VA(a7, a5), cont);
	}

	/** PREDICATE: find_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_find_vars_2_s1 = SYM("[]");

	public static Operation PRED_find_vars_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// find_vars(A,B):-find_vars(A,B,C),C=[]
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// find_vars(A,B):-[find_vars(A,B,C),'$unify'(C,[])]
		a3 = V(m);
		return //
		Op((Prolog e) -> PRED_find_vars_3_static_exec(e), VA(a1, a2, a3), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, PRED_find_vars_2_s1), cont));
	}

	/** PREDICATE: find_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_find_vars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return find_vars_3_top(m);
	}

	private final static Operation find_vars_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_flatten::find_vars_3_var, FILE_flatten::find_vars_3_int, FILE_flatten::find_vars_3_int, FILE_flatten::find_vars_3_int, FILE_flatten::find_vars_3_int, FILE_flatten::find_vars_3_var);
	}

	private final static Operation find_vars_3_var(Prolog m) {
		m.jtry3(null, FILE_flatten::find_vars_3_var_1);
		return find_vars_3_1(m);
	}

	private final static Operation find_vars_3_var_1(Prolog m) {
		m.retry(null, FILE_flatten::find_vars_3_var_2);
		return find_vars_3_2(m);
	}

	private final static Operation find_vars_3_var_2(Prolog m) {
		m.retry(null, FILE_flatten::find_vars_3_var_3);
		return find_vars_3_3(m);
	}

	private final static Operation find_vars_3_var_3(Prolog m) {
		m.trust(null);
		return find_vars_3_4(m);
	}

	private final static Operation find_vars_3_int(Prolog m) {
		m.jtry3(null, FILE_flatten::find_vars_3_int_1);
		return find_vars_3_1(m);
	}

	private final static Operation find_vars_3_int_1(Prolog m) {
		m.retry(null, FILE_flatten::find_vars_3_int_2);
		return find_vars_3_2(m);
	}

	private final static Operation find_vars_3_int_2(Prolog m) {
		m.trust(null);
		return find_vars_3_4(m);
	}

	private final static Operation find_vars_3_1(Prolog m) {
		// find_vars(A,[A|B],B):-var(A),!
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// find_vars(A,[A|B],B):-['$get_level'(C),var(A),'$cut'(C)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a1, a4), m.trail);
		} else {
			return m.fail();
		}
		if (!a4.unify(a3, m.trail))
			return m.fail();
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation find_vars_3_2(Prolog m) {
		// find_vars(A,B,B):-atomic(A),!
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// find_vars(A,B,B):-['$get_level'(C),atomic(A),'$cut'(C)]
		if (!a2.unify(a3, m.trail))
			return m.fail();
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation find_vars_3_3(Prolog m) {
		// find_vars([A|B],C,D):-!,find_vars(A,C,E),find_vars(B,E,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// find_vars([A|B],C,D):-['$neck_cut',find_vars(A,C,E),find_vars(B,E,D)]
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
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		a6 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_find_vars_3_static_exec(e), VA(a5, a6, a3), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = p1;
		return find_vars_3_top(m);
	}

	private final static Operation find_vars_3_4(Prolog m) {
		// find_vars(A,B,C):-A=..[D|E],find_vars(E,B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// find_vars(A,B,C):-['$univ'(A,[D|E]),find_vars(E,B,C)]
		a4 = V(m);
		a5 = CONS(V(m), a4);
		return //
		Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a1, a5), //
				Op((Prolog e) -> PRED_find_vars_3_static_exec(e), VA(a4, a2, a3), cont));
	}

	/** PREDICATE: intersect_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_intersect_vars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// intersect_vars(A,B,C):-sort_vars(A,D),sort_vars(B,E),intersect_sorted_vars(D,E,C)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// intersect_vars(A,B,C):-[sort_vars(A,D),sort_vars(B,E),intersect_sorted_vars(D,E,C)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_sort_vars_2_static_exec(e), VA(a1, a4), //
				Op((Prolog e) -> PRED_sort_vars_2_static_exec(e), VA(a2, a5), //
						Op((Prolog e) -> PRED_intersect_sorted_vars_3_static_exec(e), VA(a4, a5, a3), cont)));
	}

	/** PREDICATE: make_dummy_name/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_make_dummy_name_2_s1 = SYM("_dummy_");

	public static Operation PRED_make_dummy_name_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// make_dummy_name(A,B):-name('_dummy_',C),name(A,D),append(C,D,E),name(B,E)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		// make_dummy_name(A,B):-[name('_dummy_',C),name(A,D),append(C,D,E),name(B,E)]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_name_2_static_exec(e), VA(PRED_make_dummy_name_2_s1, a3), //
				Op((Prolog e) -> PRED_name_2_static_exec(e), VA(a1, a4), //
						Op((Prolog e) -> PRED_append_3_static_exec(e), VA(a3, a4, a5), //
								Op((Prolog e) -> PRED_name_2_static_exec(e), VA(a2, a5), cont))));
	}

	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_append_3_s1 = SYM("[]");

	public static Operation PRED_append_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return append_3_top(m);
	}

	private final static Operation append_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_flatten::append_3_var, fail_0, fail_0, FILE_flatten::append_3_1, fail_0, FILE_flatten::append_3_2);
	}

	private final static Operation append_3_var(Prolog m) {
		m.jtry3(null, FILE_flatten::append_3_var_1);
		return append_3_1(m);
	}

	private final static Operation append_3_var_1(Prolog m) {
		m.trust(null);
		return append_3_2(m);
	}

	private final static Operation append_3_1(Prolog m) {
		// append([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// append([],A,A):-[]
		if (!PRED_append_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation append_3_2(Prolog m) {
		// append([A|B],C,[A|D]):-append(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// append([A|B],C,[A|D]):-[append(B,C,D)]
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
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a6 = argz[1];
		} else if (a3.isVar()) {
			a6 = V(m);
			a3.bind(CONS(a4, a6), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = cont;
		return append_3_top(m);
	}

	/** PREDICATE: copy/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_copy_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// copy(A,B):-varset(A,C),make_sym(C,D),copy2(A,B,D),!
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		// copy(A,B):-['$get_level'(C),varset(A,D),make_sym(D,E),copy2(A,B,E),'$cut'(C)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_varset_2_static_exec(e), VA(a1, a4), //
				Op((Prolog e) -> PRED_make_sym_2_static_exec(e), VA(a4, a5), //
						Op((Prolog e) -> PRED_copy2_3_static_exec(e), VA(a1, a2, a5), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont))));
	}

	/** PREDICATE: copy2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final /**/ IntegerTerm PRED_copy2_3_s1 = Integer(1);

	public static Operation PRED_copy2_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_flatten::copy2_3_sub_1);
		return copy2_3_1(m);
	}

	private final static Operation copy2_3_sub_1(Prolog m) {
		m.trust(null);
		return copy2_3_2(m);
	}

	private final static Operation copy2_3_1(Prolog m) {
		// copy2(A,B,C):-var(A),!,retrieve_sym(A,C,B)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// copy2(A,B,C):-['$get_level'(D),var(A),'$cut'(D),retrieve_sym(A,C,B)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_retrieve_sym_3_static_exec(e), VA(a1, a3, a2), cont);
	}

	private final static Operation copy2_3_2(Prolog m) {
		// copy2(A,B,C):-nonvar(A),!,functor(A,D,E),functor(B,D,E),copy2(A,B,C,1,E)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// copy2(A,B,C):-['$get_level'(D),nonvar(A),'$cut'(D),functor(A,E,F),functor(B,E,F),copy2(A,B,C,1,F)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(1))
		a1 = a1.dref();
		if ((a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a5, a6), //
				Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a2, a5, a6), //
						Op((Prolog e) -> PRED_copy2_5_static_exec(e), VA(a1, a2, a3, PRED_copy2_3_s1, a6), cont)));
	}

	/** PREDICATE: copy2/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	// private final Term arg5;

	public static Operation PRED_copy2_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_flatten::copy2_5_sub_1);
		return copy2_5_1(m);
	}

	private final static Operation copy2_5_sub_1(Prolog m) {
		m.trust(null);
		return copy2_5_2(m);
	}

	private final static Operation copy2_5_1(Prolog m) {
		// copy2(A,B,C,D,E):-D>E,!
		Term a4, a5, a6;
		Operation cont;
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// copy2(A,B,C,D,E):-['$get_level'(F),'$greater_than'(D,E),'$cut'(F)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(4),a(5))
		if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a5)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation copy2_5_2(Prolog m) {
		// copy2(A,B,C,D,E):-D=<E,!,arg(D,A,F),arg(D,B,G),copy2(F,G,C),H is D+1,copy2(A,B,C,H,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// copy2(A,B,C,D,E):-['$get_level'(F),'$less_or_equal'(D,E),'$cut'(F),arg(D,A,G),arg(D,B,H),copy2(G,H,C),I is D+1,copy2(A,B,C,I,E)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(4),a(5))
		if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a5)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		Term[] y1 = VA(a4, int_1);
		a10 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a4, a1, a7), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a4, a2, a8), //
						Op((Prolog e) -> PRED_copy2_3_static_exec(e), VA(a7, a8, a3), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a9, a10), //
										Op((Prolog e) -> PRED_copy2_5_static_exec(e), VA(a1, a2, a3, a9, a5), cont)))));
	}

	/** PREDICATE: retrieve_sym/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_retrieve_sym_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return retrieve_sym_3_top(m);
	}

	private final static Operation retrieve_sym_3_top(Prolog m) {
		m.setB0();
		m.jtry3(null, FILE_flatten::retrieve_sym_3_sub_1);
		return retrieve_sym_3_1(m);
	}

	private final static Operation retrieve_sym_3_sub_1(Prolog m) {
		m.trust(null);
		return retrieve_sym_3_2(m);
	}

	private final static Operation retrieve_sym_3_1(Prolog m) {
		// retrieve_sym(A,[p(B,C)|D],C):-A==B,!
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// retrieve_sym(A,[p(B,C)|D],C):-['$get_level'(E),'$equality_of_term'(A,B),'$cut'(E)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a4 = argz[0];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a4, V(m)), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a4.unify(C("p", a5, a6), m.trail)) {
			return m.fail();
		}
		if (!a6.unify(a3, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(5))
		a1 = a1.dref();
		a5 = a5.dref();
		if (!a1.equalsTerm(a5)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation retrieve_sym_3_2(Prolog m) {
		// retrieve_sym(A,[B|C],D):-retrieve_sym(A,C,D)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// retrieve_sym(A,[B|C],D):-[retrieve_sym(A,C,D)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a4 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(V(m), a4), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a1;
		m.AREGS[1] = a4;
		m.AREGS[2] = a3;
		m.cont = cont;
		return retrieve_sym_3_top(m);
	}

	/** PREDICATE: make_sym/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_make_sym_2_s1 = SYM("[]");

	public static Operation PRED_make_sym_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return make_sym_2_top(m);
	}

	private final static Operation make_sym_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_flatten::make_sym_2_var, fail_0, fail_0, FILE_flatten::make_sym_2_1, fail_0, FILE_flatten::make_sym_2_2);
	}

	private final static Operation make_sym_2_var(Prolog m) {
		m.jtry2(null, FILE_flatten::make_sym_2_var_1);
		return make_sym_2_1(m);
	}

	private final static Operation make_sym_2_var_1(Prolog m) {
		m.trust(null);
		return make_sym_2_2(m);
	}

	private final static Operation make_sym_2_1(Prolog m) {
		// make_sym([],[]):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// make_sym([],[]):-[]
		if (!PRED_make_sym_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_make_sym_2_s1.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation make_sym_2_2(Prolog m) {
		// make_sym([A|B],[p(A,C)|D]):-make_sym(B,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// make_sym([A|B],[p(A,C)|D]):-[make_sym(B,D)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			a4 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a4 = V(m);
			a1.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a2.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a2.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a5 = a5.dref();
		if (!a5.unify(C("p", a3, V(m)), m.trail)) {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a6;
		m.cont = cont;
		return make_sym_2_top(m);
	}

	/** PREDICATE: varset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	public static Operation PRED_varset_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// varset(A,B):-varbag(A,C),sort(C,B)
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// varset(A,B):-[varbag(A,C),sort(C,B)]
		a3 = V(m);
		return //
		Op((Prolog e) -> PRED_varbag_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_sort_2_static_exec(e), VA(a3, a2), cont));
	}

	/** PREDICATE: varbag/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_varbag_2_s1 = SYM("[]");

	public static Operation PRED_varbag_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// varbag(A,B):-varbag(A,B,[])
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// varbag(A,B):-[varbag(A,B,[])]
		return //
		Op((Prolog e) -> PRED_varbag_3_static_exec(e), VA(a1, a2, PRED_varbag_2_s1), cont);
	}

	/** PREDICATE: varbag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final /**/ IntegerTerm PRED_varbag_3_s1 = Integer(1);

	public static Operation PRED_varbag_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_flatten::varbag_3_sub_1);
		return varbag_3_1(m);
	}

	private final static Operation varbag_3_sub_1(Prolog m) {
		m.trust(null);
		return varbag_3_2(m);
	}

	private final static Operation varbag_3_1(Prolog m) {
		// varbag(A,B,C):-(var(A),D=B),(!,E=D),E=[A|C]
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// varbag(A,B,C):-['$get_level'(D),var(A),'$unify'(E,B),'$cut'(D),'$unify'(F,E),'$unify'(F,[A|C])]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		//START inline expansion of $unify(a(5),a(2))
		if (!a5.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		a6 = V(m);
		//START inline expansion of $unify(a(6),a(5))
		if (!a6.unify(a5, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a7 = CONS(a1, a3);
		//START inline expansion of $unify(a(6),a(7))
		if (!a6.unify(a7, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation varbag_3_2(Prolog m) {
		// varbag(A,B,C):-((nonvar(A),!,functor(A,D,E)),F=B),varbag(A,1,E,F,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// varbag(A,B,C):-['$get_level'(D),nonvar(A),'$cut'(D),functor(A,E,F),'$unify'(G,B),varbag(A,1,F,G,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(1))
		a1 = a1.dref();
		if ((a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, V(m), a5), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a6, a2), //
						Op((Prolog e) -> PRED_varbag_5_static_exec(e), VA(a1, PRED_varbag_3_s1, a5, a6, a3), cont)));
	}

	/** PREDICATE: varbag/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/

	// private final Term arg5;

	public static Operation PRED_varbag_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_flatten::varbag_5_sub_1);
		return varbag_5_1(m);
	}

	private final static Operation varbag_5_sub_1(Prolog m) {
		m.trust(null);
		return varbag_5_2(m);
	}

	private final static Operation varbag_5_1(Prolog m) {
		// varbag(A,B,C,D,E):-(B>C,F=D),!,E=F
		Term a2, a3, a4, a5, a6, a7;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// varbag(A,B,C,D,E):-['$get_level'(F),'$greater_than'(B,C),'$unify'(G,D),'$cut'(F),'$unify'(E,G)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		//START inline expansion of $unify(a(7),a(4))
		if (!a7.unify(a4, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(5),a(7))
		if (!a5.unify(a7, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation varbag_5_2(Prolog m) {
		// varbag(A,B,C,D,E):-(B=<C,F=D),(!,G=F),(arg(B,A,H),I=G),varbag(H,I,J),(K is B+1,L=J),varbag(A,K,C,L,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// varbag(A,B,C,D,E):-['$get_level'(F),'$less_or_equal'(B,C),'$unify'(G,D),'$cut'(F),'$unify'(H,G),arg(B,A,I),'$unify'(J,H),varbag(I,J,K),L is B+1,'$unify'(M,K),varbag(A,L,C,M,E)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		//START inline expansion of $unify(a(7),a(4))
		if (!a7.unify(a4, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		a8 = V(m);
		//START inline expansion of $unify(a(8),a(7))
		if (!a8.unify(a7, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		a12 = V(m);
		Term[] y1 = VA(a2, int_1);
		a13 = S("+", y1);
		a14 = V(m);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a2, a1, a9), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a10, a8), //
						Op((Prolog e) -> PRED_varbag_3_static_exec(e), VA(a9, a10, a11), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a12, a13), //
										Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a14, a11), //
												Op((Prolog e) -> PRED_varbag_5_static_exec(e), VA(a1, a12, a3, a14, a5), cont))))));
	}

	/** PREDICATE: inst_vars/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_inst_vars_1_s1 = SYM("[]");
	final static IntegerTerm int_65 = Integer(65);
	private static final ListTerm PRED_inst_vars_1_s3 = CONS(int_65, PRED_inst_vars_1_s1);

	public static Operation PRED_inst_vars_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// inst_vars(A):-varset(A,B),[C]=[65],inst_vars_list(B,C)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		// inst_vars(A):-[varset(A,B),'$unify'([C],[65]),inst_vars_list(B,C)]
		a2 = V(m);
		a3 = V(m);
		a4 = CONS(a3, PRED_inst_vars_1_s1);
		return //
		Op((Prolog e) -> PRED_varset_2_static_exec(e), VA(a1, a2), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a4, PRED_inst_vars_1_s3), //
						Op((Prolog e) -> PRED_inst_vars_list_2_static_exec(e), VA(a2, a3), cont)));
	}

	/** PREDICATE: inst_vars_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_inst_vars_list_2_s1 = SYM("[]");

	public static Operation PRED_inst_vars_list_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_flatten::inst_vars_list_2_var, fail_0, fail_0, FILE_flatten::inst_vars_list_2_1, fail_0, FILE_flatten::inst_vars_list_2_2);
	}

	private final static Operation inst_vars_list_2_var(Prolog m) {
		m.jtry2(null, FILE_flatten::inst_vars_list_2_var_1);
		return inst_vars_list_2_1(m);
	}

	private final static Operation inst_vars_list_2_var_1(Prolog m) {
		m.trust(null);
		return inst_vars_list_2_2(m);
	}

	private final static Operation inst_vars_list_2_1(Prolog m) {
		// inst_vars_list([],A):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// inst_vars_list([],A):-[]
		if (!PRED_inst_vars_list_2_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation inst_vars_list_2_2(Prolog m) {
		// inst_vars_list([A|B],C):-name(A,[C]),D is C+1,inst_vars_list(B,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// inst_vars_list([A|B],C):-[name(A,[C]),D is C+1,inst_vars_list(B,D)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			a4 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a4 = V(m);
			a1.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		a5 = CONS(a2, PRED_inst_vars_list_2_s1);
		a6 = V(m);
		Term[] y1 = VA(a2, int_1);
		a7 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_name_2_static_exec(e), VA(a3, a5), //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a6, a7), //
						Op((Prolog e) -> PRED_inst_vars_list_2_static_exec(e), VA(a4, a6), cont)));
	}

	/** PREDICATE: sort_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_sort_vars_2_s1 = SYM("[]");

	public static Operation PRED_sort_vars_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// sort_vars(A,B):-sort_vars(A,B,[])
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// sort_vars(A,B):-[sort_vars(A,B,[])]
		return //
		Op((Prolog e) -> PRED_sort_vars_3_static_exec(e), VA(a1, a2, PRED_sort_vars_2_s1), cont);
	}

	/** PREDICATE: sort_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_sort_vars_3_s1 = SYM("[]");

	public static Operation PRED_sort_vars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_flatten::sort_vars_3_var, fail_0, fail_0, FILE_flatten::sort_vars_3_1, fail_0, FILE_flatten::sort_vars_3_2);
	}

	private final static Operation sort_vars_3_var(Prolog m) {
		m.jtry3(null, FILE_flatten::sort_vars_3_var_1);
		return sort_vars_3_1(m);
	}

	private final static Operation sort_vars_3_var_1(Prolog m) {
		m.trust(null);
		return sort_vars_3_2(m);
	}

	private final static Operation sort_vars_3_1(Prolog m) {
		// sort_vars([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// sort_vars([],A,A):-[]
		if (!PRED_sort_vars_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation sort_vars_3_2(Prolog m) {
		// sort_vars([A|B],C,D):-split_vars(B,A,E,F),sort_vars(E,C,[A|G]),sort_vars(F,G,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// sort_vars([A|B],C,D):-[split_vars(B,A,E,F),sort_vars(E,C,[A|G]),sort_vars(F,G,D)]
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
		a8 = V(m);
		a9 = CONS(a4, a8);
		return //
		Op((Prolog e) -> PRED_split_vars_4_static_exec(e), VA(a5, a4, a6, a7), //
				Op((Prolog e) -> PRED_sort_vars_3_static_exec(e), VA(a6, a2, a9), //
						Op((Prolog e) -> PRED_sort_vars_3_static_exec(e), VA(a7, a8, a3), cont)));
	}

	/** PREDICATE: intersect_sorted_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_intersect_sorted_vars_3_s1 = SYM("[]");

	public static Operation PRED_intersect_sorted_vars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return intersect_sorted_vars_3_top(m);
	}

	private final static Operation intersect_sorted_vars_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_flatten::intersect_sorted_vars_3_var, FILE_flatten::intersect_sorted_vars_3_2, FILE_flatten::intersect_sorted_vars_3_2, FILE_flatten::intersect_sorted_vars_3_con,
				FILE_flatten::intersect_sorted_vars_3_2, FILE_flatten::intersect_sorted_vars_3_lis);
	}

	private final static Operation intersect_sorted_vars_3_var(Prolog m) {
		m.jtry3(null, FILE_flatten::intersect_sorted_vars_3_var_1);
		return intersect_sorted_vars_3_1(m);
	}

	private final static Operation intersect_sorted_vars_3_var_1(Prolog m) {
		m.retry(null, FILE_flatten::intersect_sorted_vars_3_var_2);
		return intersect_sorted_vars_3_2(m);
	}

	private final static Operation intersect_sorted_vars_3_var_2(Prolog m) {
		m.retry(null, FILE_flatten::intersect_sorted_vars_3_var_3);
		return intersect_sorted_vars_3_3(m);
	}

	private final static Operation intersect_sorted_vars_3_var_3(Prolog m) {
		m.retry(null, FILE_flatten::intersect_sorted_vars_3_var_4);
		return intersect_sorted_vars_3_4(m);
	}

	private final static Operation intersect_sorted_vars_3_var_4(Prolog m) {
		m.trust(null);
		return intersect_sorted_vars_3_5(m);
	}

	private final static Operation intersect_sorted_vars_3_con(Prolog m) {
		m.jtry3(null, FILE_flatten::intersect_sorted_vars_3_con_1);
		return intersect_sorted_vars_3_1(m);
	}

	private final static Operation intersect_sorted_vars_3_con_1(Prolog m) {
		m.trust(null);
		return intersect_sorted_vars_3_2(m);
	}

	private final static Operation intersect_sorted_vars_3_lis(Prolog m) {
		m.jtry3(null, FILE_flatten::intersect_sorted_vars_3_lis_1);
		return intersect_sorted_vars_3_2(m);
	}

	private final static Operation intersect_sorted_vars_3_lis_1(Prolog m) {
		m.retry(null, FILE_flatten::intersect_sorted_vars_3_lis_2);
		return intersect_sorted_vars_3_3(m);
	}

	private final static Operation intersect_sorted_vars_3_lis_2(Prolog m) {
		m.retry(null, FILE_flatten::intersect_sorted_vars_3_lis_3);
		return intersect_sorted_vars_3_4(m);
	}

	private final static Operation intersect_sorted_vars_3_lis_3(Prolog m) {
		m.trust(null);
		return intersect_sorted_vars_3_5(m);
	}

	private final static Operation intersect_sorted_vars_3_1(Prolog m) {
		// intersect_sorted_vars([],A,[]):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersect_sorted_vars([],A,[]):-['$neck_cut']
		if (!PRED_intersect_sorted_vars_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_intersect_sorted_vars_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation intersect_sorted_vars_3_2(Prolog m) {
		// intersect_sorted_vars(A,[],[]):-true
		Term a2, a3;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersect_sorted_vars(A,[],[]):-[]
		if (!PRED_intersect_sorted_vars_3_s1.unify(a2, m.trail))
			return m.fail();
		if (!PRED_intersect_sorted_vars_3_s1.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation intersect_sorted_vars_3_3(Prolog m) {
		// intersect_sorted_vars([A|B],[C|D],[A|E]):-A==C,!,intersect_sorted_vars(B,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersect_sorted_vars([A|B],[C|D],[A|E]):-['$get_level'(F),'$equality_of_term'(A,C),'$cut'(F),intersect_sorted_vars(B,D,E)]
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
			a6 = argz[0];
			a7 = argz[1];
		} else if (a2.isVar()) {
			a6 = V(m);
			a7 = V(m);
			a2.bind(CONS(a6, a7), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a8 = argz[1];
		} else if (a3.isVar()) {
			a8 = V(m);
			a3.bind(CONS(a4, a8), m.trail);
		} else {
			return m.fail();
		}
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(4),a(6))
		a4 = a4.dref();
		a6 = a6.dref();
		if (!a4.equalsTerm(a6)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(9))
		a9 = a9.dref();
		m.cut(a9.intValue());
		//END inline expansion
		m.AREGS[0] = a5;
		m.AREGS[1] = a7;
		m.AREGS[2] = a8;
		m.cont = cont;
		return intersect_sorted_vars_3_top(m);
	}

	private final static Operation intersect_sorted_vars_3_4(Prolog m) {
		// intersect_sorted_vars([A|B],[C|D],E):-A@<C,!,intersect_sorted_vars(B,[C|D],E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersect_sorted_vars([A|B],[C|D],E):-['$get_level'(F),'$before'(A,C),'$cut'(F),intersect_sorted_vars(B,[C|D],E)]
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
			a6 = argz[0];
			a7 = argz[1];
		} else if (a2.isVar()) {
			a6 = V(m);
			a7 = V(m);
			a2.bind(CONS(a6, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if (!a8.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $before(a(4),a(6))
		a4 = a4.dref();
		a6 = a6.dref();
		if (a4.compareTo(a6) >= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8.dref();
		m.cut(a8.intValue());
		//END inline expansion
		a9 = CONS(a6, a7);
		m.AREGS[0] = a5;
		m.AREGS[1] = a9;
		m.AREGS[2] = a3;
		m.cont = cont;
		return intersect_sorted_vars_3_top(m);
	}

	private final static Operation intersect_sorted_vars_3_5(Prolog m) {
		// intersect_sorted_vars([A|B],[C|D],E):-A@>C,!,intersect_sorted_vars([A|B],D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersect_sorted_vars([A|B],[C|D],E):-['$get_level'(F),'$after'(A,C),'$cut'(F),intersect_sorted_vars([A|B],D,E)]
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
			a6 = argz[0];
			a7 = argz[1];
		} else if (a2.isVar()) {
			a6 = V(m);
			a7 = V(m);
			a2.bind(CONS(a6, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if (!a8.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $after(a(4),a(6))
		a4 = a4.dref();
		a6 = a6.dref();
		if (a4.compareTo(a6) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8.dref();
		m.cut(a8.intValue());
		//END inline expansion
		a9 = CONS(a4, a5);
		m.AREGS[0] = a9;
		m.AREGS[1] = a7;
		m.AREGS[2] = a3;
		m.cont = cont;
		return intersect_sorted_vars_3_top(m);
	}

	/** PREDICATE: split_vars/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/flatten.pl
	*/
	private static final SymbolTerm PRED_split_vars_4_s1 = SYM("[]");

	public static Operation PRED_split_vars_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return split_vars_4_top(m);
	}

	private final static Operation split_vars_4_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_flatten::split_vars_4_var, fail_0, fail_0, FILE_flatten::split_vars_4_1, fail_0, FILE_flatten::split_vars_4_lis);
	}

	private final static Operation split_vars_4_var(Prolog m) {
		m.jtry4(null, FILE_flatten::split_vars_4_var_1);
		return split_vars_4_1(m);
	}

	private final static Operation split_vars_4_var_1(Prolog m) {
		m.retry(null, FILE_flatten::split_vars_4_var_2);
		return split_vars_4_2(m);
	}

	private final static Operation split_vars_4_var_2(Prolog m) {
		m.retry(null, FILE_flatten::split_vars_4_var_3);
		return split_vars_4_3(m);
	}

	private final static Operation split_vars_4_var_3(Prolog m) {
		m.trust(null);
		return split_vars_4_4(m);
	}

	private final static Operation split_vars_4_lis(Prolog m) {
		m.jtry4(null, FILE_flatten::split_vars_4_lis_1);
		return split_vars_4_2(m);
	}

	private final static Operation split_vars_4_lis_1(Prolog m) {
		m.retry(null, FILE_flatten::split_vars_4_lis_2);
		return split_vars_4_3(m);
	}

	private final static Operation split_vars_4_lis_2(Prolog m) {
		m.trust(null);
		return split_vars_4_4(m);
	}

	private final static Operation split_vars_4_1(Prolog m) {
		// split_vars([],A,[],[]):-true
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split_vars([],A,[],[]):-[]
		if (!PRED_split_vars_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_split_vars_4_s1.unify(a3, m.trail))
			return m.fail();
		if (!PRED_split_vars_4_s1.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation split_vars_4_2(Prolog m) {
		// split_vars([A|B],C,[A|D],E):-A@<C,!,split_vars(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split_vars([A|B],C,[A|D],E):-['$get_level'(F),'$before'(A,C),'$cut'(F),split_vars(B,C,D,E)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a1.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a1.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a5.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a3.isVar()) {
			a7 = V(m);
			a3.bind(CONS(a5, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if (!a8.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $before(a(5),a(2))
		a5 = a5.dref();
		a2 = a2.dref();
		if (a5.compareTo(a2) >= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8.dref();
		m.cut(a8.intValue());
		//END inline expansion
		m.AREGS[0] = a6;
		m.AREGS[1] = a2;
		m.AREGS[2] = a7;
		m.AREGS[3] = a4;
		m.cont = cont;
		return split_vars_4_top(m);
	}

	private final static Operation split_vars_4_3(Prolog m) {
		// split_vars([A|B],C,D,E):-A==C,!,split_vars(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split_vars([A|B],C,D,E):-['$get_level'(F),'$equality_of_term'(A,C),'$cut'(F),split_vars(B,C,D,E)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a1.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a1.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(5),a(2))
		a5 = a5.dref();
		a2 = a2.dref();
		if (!a5.equalsTerm(a2)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		m.AREGS[0] = a6;
		m.AREGS[1] = a2;
		m.AREGS[2] = a3;
		m.AREGS[3] = a4;
		m.cont = cont;
		return split_vars_4_top(m);
	}

	private final static Operation split_vars_4_4(Prolog m) {
		// split_vars([A|B],C,D,[A|E]):-A@>C,!,split_vars(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split_vars([A|B],C,D,[A|E]):-['$get_level'(F),'$after'(A,C),'$cut'(F),split_vars(B,C,D,E)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a1.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a1.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a5.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a4.isVar()) {
			a7 = V(m);
			a4.bind(CONS(a5, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if (!a8.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $after(a(5),a(2))
		a5 = a5.dref();
		a2 = a2.dref();
		if (a5.compareTo(a2) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8.dref();
		m.cut(a8.intValue());
		//END inline expansion
		m.AREGS[0] = a6;
		m.AREGS[1] = a2;
		m.AREGS[2] = a3;
		m.AREGS[3] = a7;
		m.cont = cont;
		return split_vars_4_top(m);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_flatten::PRED_top_0_static_exec);
		PredTable.registerBuiltin("eliminate_disjunctions", 4, FILE_flatten::PRED_eliminate_disjunctions_4_static_exec);
		PredTable.registerBuiltin("gather_disj", 4, FILE_flatten::PRED_gather_disj_4_static_exec);
		PredTable.registerBuiltin("extract_disj", 4, FILE_flatten::PRED_extract_disj_4_static_exec);
		PredTable.registerBuiltin("extract_disj", 7, FILE_flatten::PRED_extract_disj_7_static_exec);
		PredTable.registerBuiltin("is_disj", 2, FILE_flatten::PRED_is_disj_2_static_exec);
		PredTable.registerBuiltin("treat_disj", 3, FILE_flatten::PRED_treat_disj_3_static_exec);
		PredTable.registerBuiltin("make_dummy_clauses", 4, FILE_flatten::PRED_make_dummy_clauses_4_static_exec);
		PredTable.registerBuiltin("find_vars", 2, FILE_flatten::PRED_find_vars_2_static_exec);
		PredTable.registerBuiltin("find_vars", 3, FILE_flatten::PRED_find_vars_3_static_exec);
		PredTable.registerBuiltin("intersect_vars", 3, FILE_flatten::PRED_intersect_vars_3_static_exec);
		PredTable.registerBuiltin("make_dummy_name", 2, FILE_flatten::PRED_make_dummy_name_2_static_exec);
		PredTable.registerBuiltin("append", 3, FILE_flatten::PRED_append_3_static_exec);
		PredTable.registerBuiltin("copy", 2, FILE_flatten::PRED_copy_2_static_exec);
		PredTable.registerBuiltin("copy2", 3, FILE_flatten::PRED_copy2_3_static_exec);
		PredTable.registerBuiltin("copy2", 5, FILE_flatten::PRED_copy2_5_static_exec);
		PredTable.registerBuiltin("retrieve_sym", 3, FILE_flatten::PRED_retrieve_sym_3_static_exec);
		PredTable.registerBuiltin("make_sym", 2, FILE_flatten::PRED_make_sym_2_static_exec);
		PredTable.registerBuiltin("varset", 2, FILE_flatten::PRED_varset_2_static_exec);
		PredTable.registerBuiltin("varbag", 2, FILE_flatten::PRED_varbag_2_static_exec);
		PredTable.registerBuiltin("varbag", 3, FILE_flatten::PRED_varbag_3_static_exec);
		PredTable.registerBuiltin("varbag", 5, FILE_flatten::PRED_varbag_5_static_exec);
		PredTable.registerBuiltin("inst_vars", 1, FILE_flatten::PRED_inst_vars_1_static_exec);
		PredTable.registerBuiltin("inst_vars_list", 2, FILE_flatten::PRED_inst_vars_list_2_static_exec);
		PredTable.registerBuiltin("sort_vars", 2, FILE_flatten::PRED_sort_vars_2_static_exec);
		PredTable.registerBuiltin("sort_vars", 3, FILE_flatten::PRED_sort_vars_3_static_exec);
		PredTable.registerBuiltin("intersect_sorted_vars", 3, FILE_flatten::PRED_intersect_sorted_vars_3_static_exec);
		PredTable.registerBuiltin("split_vars", 4, FILE_flatten::PRED_split_vars_4_static_exec);
	}
}
