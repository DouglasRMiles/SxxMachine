package SxxMachine.bench;

import static SxxMachine.bootpreds.*;
import static SxxMachine.FILE_builtins.*;
import static SxxMachine.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.*;

public class FILE_prover  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-prover
		m.setB0();
		// top:-[prover]
		return //
		Op((Prolog e) -> PRED_prover_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: prover/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/

	public static Operation PRED_prover_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry0(null, FILE_prover::prover_0_sub_1);
		return prover_0_1(m);
	}

	private final static Operation prover_0_sub_1(Prolog m) {
		m.trust(null);
		return prover_0_2(m);
	}

	private final static Operation prover_0_1(Prolog m) {
		// prover:-problem(A,B,C),implies(B,C),fail
		Term a1, a2;
		Operation cont;
		cont = m.cont;
		// prover:-[problem(A,B,C),implies(B,C),fail]
		a1 = V(m);
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_problem_3_static_exec(e), VA(V(m), a1, a2), //
				Op((Prolog e) -> PRED_implies_2_static_exec(e), VA(a1, a2), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation prover_0_2(Prolog m) {
		// prover:-true
		Operation cont;
		cont = m.cont;
		// prover:-[]
		return cont;
	}

	/** PREDICATE: problem/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
	private static final /**/ IntegerTerm PRED_problem_3_s1 = Integer(1);
	final static SymbolTerm ATOM_a = SYM("a");
	private static final StructureTerm PRED_problem_3_s5 = S("-", ATOM_a);
	private static final StructureTerm PRED_problem_3_s7 = S("+", ATOM_a);
	final static IntegerTerm int_2 = Integer(2);
	private static final StructureTerm PRED_problem_3_s11 = S("&", PRED_problem_3_s5, PRED_problem_3_s5);
	final static IntegerTerm int_3 = Integer(3);
	final static SymbolTerm ATOM_to_be = SYM("to_be");
	private static final StructureTerm PRED_problem_3_s16 = S("+", ATOM_to_be);
	private static final StructureTerm PRED_problem_3_s17 = S("-", ATOM_to_be);
	private static final StructureTerm PRED_problem_3_s19 = S("#", PRED_problem_3_s16, PRED_problem_3_s17);
	final static IntegerTerm int_4 = Integer(4);
	final static IntegerTerm int_5 = Integer(5);
	final static SymbolTerm ATOM_b = SYM("b");
	private static final StructureTerm PRED_problem_3_s24 = S("+", ATOM_b);
	private static final StructureTerm PRED_problem_3_s26 = S("#", PRED_problem_3_s24, PRED_problem_3_s5);
	final static IntegerTerm int_6 = Integer(6);
	private static final StructureTerm PRED_problem_3_s28 = S("-", ATOM_b);
	private static final StructureTerm PRED_problem_3_s30 = S("&", PRED_problem_3_s5, PRED_problem_3_s28);
	private static final StructureTerm PRED_problem_3_s32 = S("&", PRED_problem_3_s28, PRED_problem_3_s5);
	final static IntegerTerm int_7 = Integer(7);
	private static final StructureTerm PRED_problem_3_s34 = S("&", PRED_problem_3_s24, PRED_problem_3_s5);
	private static final StructureTerm PRED_problem_3_s36 = S("#", PRED_problem_3_s28, PRED_problem_3_s34);
	final static IntegerTerm int_8 = Integer(8);
	final static SymbolTerm ATOM_c = SYM("c");
	private static final StructureTerm PRED_problem_3_s40 = S("+", ATOM_c);
	private static final StructureTerm PRED_problem_3_s42 = S("#", PRED_problem_3_s28, PRED_problem_3_s40);
	private static final StructureTerm PRED_problem_3_s44 = S("#", PRED_problem_3_s5, PRED_problem_3_s42);
	private static final StructureTerm PRED_problem_3_s46 = S("#", PRED_problem_3_s5, PRED_problem_3_s40);
	private static final StructureTerm PRED_problem_3_s48 = S("#", PRED_problem_3_s28, PRED_problem_3_s46);
	final static IntegerTerm int_9 = Integer(9);
	private static final StructureTerm PRED_problem_3_s51 = S("#", PRED_problem_3_s5, PRED_problem_3_s24);
	private static final StructureTerm PRED_problem_3_s52 = S("-", ATOM_c);
	private static final StructureTerm PRED_problem_3_s54 = S("&", PRED_problem_3_s24, PRED_problem_3_s52);
	private static final StructureTerm PRED_problem_3_s56 = S("#", PRED_problem_3_s54, PRED_problem_3_s46);
	final static IntegerTerm int_10 = Integer(10);
	private static final StructureTerm PRED_problem_3_s59 = S("&", PRED_problem_3_s46, PRED_problem_3_s42);
	private static final StructureTerm PRED_problem_3_s61 = S("#", PRED_problem_3_s30, PRED_problem_3_s40);

	public static Operation PRED_problem_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prover::problem_3_var, FILE_prover::problem_3_var, fail_0, fail_0, fail_0, fail_0);
	}

	private final static Operation problem_3_var(Prolog m) {
		m.jtry3(null, FILE_prover::problem_3_var_1);
		return problem_3_1(m);
	}

	private final static Operation problem_3_var_1(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_2);
		return problem_3_2(m);
	}

	private final static Operation problem_3_var_2(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_3);
		return problem_3_3(m);
	}

	private final static Operation problem_3_var_3(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_4);
		return problem_3_4(m);
	}

	private final static Operation problem_3_var_4(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_5);
		return problem_3_5(m);
	}

	private final static Operation problem_3_var_5(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_6);
		return problem_3_6(m);
	}

	private final static Operation problem_3_var_6(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_7);
		return problem_3_7(m);
	}

	private final static Operation problem_3_var_7(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_8);
		return problem_3_8(m);
	}

	private final static Operation problem_3_var_8(Prolog m) {
		m.retry(null, FILE_prover::problem_3_var_9);
		return problem_3_9(m);
	}

	private final static Operation problem_3_var_9(Prolog m) {
		m.trust(null);
		return problem_3_10(m);
	}

	private final static Operation problem_3_1(Prolog m) {
		// problem(1,-a,+a):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(1,-a,+a):-[]
		if (!PRED_problem_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s5.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s7.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_2(Prolog m) {
		// problem(2,+a,-a& -a):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(2,+a,-a& -a):-[]
		if (!int_2.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s7.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s11.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_3(Prolog m) {
		// problem(3,-a,+to_be# -to_be):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(3,-a,+to_be# -to_be):-[]
		if (!int_3.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s5.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s19.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_4(Prolog m) {
		// problem(4,-a& -a,-a):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(4,-a& -a,-a):-[]
		if (!int_4.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s11.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s5.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_5(Prolog m) {
		// problem(5,-a,+b# -a):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(5,-a,+b# -a):-[]
		if (!int_5.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s5.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s26.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_6(Prolog m) {
		// problem(6,-a& -b,-b& -a):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(6,-a& -b,-b& -a):-[]
		if (!int_6.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s30.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s32.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_7(Prolog m) {
		// problem(7,-a,-b# +b& -a):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(7,-a,-b# +b& -a):-[]
		if (!int_7.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s5.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s36.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_8(Prolog m) {
		// problem(8,-a# -b# +c,-b# -a# +c):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(8,-a# -b# +c,-b# -a# +c):-[]
		if (!int_8.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s44.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s48.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_9(Prolog m) {
		// problem(9,-a# +b,+b& -c# -a# +c):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(9,-a# +b,+b& -c# -a# +c):-[]
		if (!int_9.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s51.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s56.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation problem_3_10(Prolog m) {
		// problem(10,(-a# +c)&(-b# +c),-a& -b# +c):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// problem(10,(-a# +c)&(-b# +c),-a& -b# +c):-[]
		if (!int_10.unify(a1, m.trail))
			return m.fail();
		if (!PRED_problem_3_s59.unify(a2, m.trail))
			return m.fail();
		if (!PRED_problem_3_s61.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: implies/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
	private static final StructureTerm PRED_implies_2_s4 = S("fs", Prolog.Nil, Prolog.Nil, Prolog.Nil, Prolog.Nil);

	public static Operation PRED_implies_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// implies(A,B):-opposite(B,C),add_conjunction(A,C,fs([],[],[],[]))
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// implies(A,B):-[opposite(B,C),add_conjunction(A,C,fs([],[],[],[]))]
		a3 = V(m);
		return //
		Op((Prolog e) -> PRED_opposite_2_static_exec(e), VA(a2, a3), //
				Op((Prolog e) -> PRED_add_conjunction_3_static_exec(e), VA(a1, a3, PRED_implies_2_s4), cont));
	}

	/** PREDICATE: opposite/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/

	public static Operation PRED_opposite_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return opposite_2_top(m);
	}

	private final static Operation opposite_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_prover::opposite_2_var, fail_0, fail_0, fail_0, FILE_prover::opposite_2_var, fail_0);
	}

	private final static Operation opposite_2_var(Prolog m) {
		m.jtry2(null, FILE_prover::opposite_2_var_1);
		return opposite_2_1(m);
	}

	private final static Operation opposite_2_var_1(Prolog m) {
		m.retry(null, FILE_prover::opposite_2_var_2);
		return opposite_2_2(m);
	}

	private final static Operation opposite_2_var_2(Prolog m) {
		m.retry(null, FILE_prover::opposite_2_var_3);
		return opposite_2_3(m);
	}

	private final static Operation opposite_2_var_3(Prolog m) {
		m.trust(null);
		return opposite_2_4(m);
	}

	private final static Operation opposite_2_1(Prolog m) {
		// opposite(A&B,C#D):-!,opposite(A,C),opposite(B,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// opposite(A&B,C#D):-['$neck_cut',opposite(A,C),opposite(B,D)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("&", a3, a4), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a2.unify(C("#", a5, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_opposite_2_static_exec(e), VA(a4, a6), cont);
		m.AREGS[0] = a3;
		m.AREGS[1] = a5;
		m.cont = p1;
		return opposite_2_top(m);
	}

	private final static Operation opposite_2_2(Prolog m) {
		// opposite(A#B,C&D):-!,opposite(A,C),opposite(B,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// opposite(A#B,C&D):-['$neck_cut',opposite(A,C),opposite(B,D)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("#", a3, a4), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a2.unify(C("&", a5, a6), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_opposite_2_static_exec(e), VA(a4, a6), cont);
		m.AREGS[0] = a3;
		m.AREGS[1] = a5;
		m.cont = p1;
		return opposite_2_top(m);
	}

	private final static Operation opposite_2_3(Prolog m) {
		// opposite(+A,-A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// opposite(+A,-A):-['$neck_cut']
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("+", a3), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (!a2.unify(C("-", a3), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation opposite_2_4(Prolog m) {
		// opposite(-A,+A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// opposite(-A,+A):-[]
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("-", a3), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (!a2.unify(C("+", a3), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: add_conjunction/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/

	public static Operation PRED_add_conjunction_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// add_conjunction(A,B,C):-expand(A,C,D),expand(B,D,E),refute(E)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// add_conjunction(A,B,C):-[expand(A,C,D),expand(B,D,E),refute(E)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_expand_3_static_exec(e), VA(a1, a3, a4), //
				Op((Prolog e) -> PRED_expand_3_static_exec(e), VA(a2, a4, a5), //
						Op((Prolog e) -> PRED_refute_1_static_exec(e), VA(a5), cont)));
	}

	/** PREDICATE: expand/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
	private static final SymbolTerm PRED_expand_3_s1 = SYM("refuted");

	public static Operation PRED_expand_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return expand_3_top(m);
	}

	private final static Operation expand_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_prover::expand_3_var, FILE_prover::expand_3_1, FILE_prover::expand_3_1, FILE_prover::expand_3_1, FILE_prover::expand_3_var, FILE_prover::expand_3_1);
	}

	private final static Operation expand_3_var(Prolog m) {
		m.jtry3(null, FILE_prover::expand_3_var_1);
		return expand_3_1(m);
	}

	private final static Operation expand_3_var_1(Prolog m) {
		m.retry(null, FILE_prover::expand_3_var_2);
		return expand_3_2(m);
	}

	private final static Operation expand_3_var_2(Prolog m) {
		m.retry(null, FILE_prover::expand_3_var_3);
		return expand_3_3(m);
	}

	private final static Operation expand_3_var_3(Prolog m) {
		m.retry(null, FILE_prover::expand_3_var_4);
		return expand_3_4(m);
	}

	private final static Operation expand_3_var_4(Prolog m) {
		m.retry(null, FILE_prover::expand_3_var_5);
		return expand_3_5(m);
	}

	private final static Operation expand_3_var_5(Prolog m) {
		m.retry(null, FILE_prover::expand_3_var_6);
		return expand_3_6(m);
	}

	private final static Operation expand_3_var_6(Prolog m) {
		m.trust(null);
		return expand_3_7(m);
	}

	private final static Operation expand_3_1(Prolog m) {
		// expand(A,refuted,refuted):-!
		Term a2, a3;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(A,refuted,refuted):-['$neck_cut']
		if (!PRED_expand_3_s1.unify(a2, m.trail))
			return m.fail();
		if (!PRED_expand_3_s1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation expand_3_2(Prolog m) {
		// expand(A&B,fs(C,D,E,F),refuted):-includes(C,A&B),!
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(A&B,fs(C,D,E,F),refuted):-['$get_level'(G),includes(C,A&B),'$cut'(G)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("&", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		if (!a2.unify(C("fs", a6, V(m), V(m), V(m)), m.trail)) {
			return m.fail();
		}
		if (!PRED_expand_3_s1.unify(a3, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a4, a5);
		a8 = S("&", y1);
		return //
		Op((Prolog e) -> PRED_includes_2_static_exec(e), VA(a6, a8), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a7), cont));
	}

	private final static Operation expand_3_3(Prolog m) {
		// expand(A&B,fs(C,D,E,F),fs(C,D,E,F)):-includes(D,A&B),!
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(A&B,fs(C,D,E,F),fs(C,D,E,F)):-['$get_level'(G),includes(D,A&B),'$cut'(G)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("&", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		if (!a2.unify(C("fs", a6, a7, a8, a9), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (!a3.unify(C("fs", a6, a7, a8, a9), m.trail)) {
			return m.fail();
		}
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a4, a5);
		a11 = S("&", y1);
		return //
		Op((Prolog e) -> PRED_includes_2_static_exec(e), VA(a7, a11), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a10), cont));
	}

	private final static Operation expand_3_4(Prolog m) {
		// expand(A&B,fs(C,D,E,F),G):-!,expand(A,fs(C,[A&B|D],E,F),H),expand(B,H,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(A&B,fs(C,D,E,F),G):-['$neck_cut',expand(A,fs(C,[A&B|D],E,F),H),expand(B,H,G)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("&", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		if (!a2.unify(C("fs", a6, a7, a8, a9), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		Term[] y1 = VA(a4, a5);
		a10 = S("&", y1);
		a11 = CONS(a10, a7);
		Term[] y2 = VA(a6, a11, a8, a9);
		a12 = S("fs", y2);
		a13 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_expand_3_static_exec(e), VA(a5, a13, a3), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a12;
		m.AREGS[2] = a13;
		m.cont = p1;
		return expand_3_top(m);
	}

	private final static Operation expand_3_5(Prolog m) {
		// expand(A#B,fs(C,D,E,F),G):-!,opposite(A#B,H),extend(H,C,D,I,fs(I,D,E,F),G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(A#B,fs(C,D,E,F),G):-['$neck_cut',opposite(A#B,H),extend(H,C,D,I,fs(I,D,E,F),G)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("#", a4, a5), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		if (!a2.unify(C("fs", a6, a7, a8, a9), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		Term[] y1 = VA(a4, a5);
		a10 = S("#", y1);
		a11 = V(m);
		a12 = V(m);
		Term[] y2 = VA(a12, a7, a8, a9);
		a13 = S("fs", y2);
		return //
		Op((Prolog e) -> PRED_opposite_2_static_exec(e), VA(a10, a11), //
				Op((Prolog e) -> PRED_extend_6_static_exec(e), VA(a11, a6, a7, a12, a13, a3), cont));
	}

	private final static Operation expand_3_6(Prolog m) {
		// expand(+A,fs(B,C,D,E),F):-!,extend(A,D,E,G,fs(B,C,G,E),F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(+A,fs(B,C,D,E),F):-['$neck_cut',extend(A,D,E,G,fs(B,C,G,E),F)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("+", a4), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		if (!a2.unify(C("fs", a5, a6, a7, a8), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		a9 = V(m);
		Term[] y1 = VA(a5, a6, a9, a8);
		a10 = S("fs", y1);
		return //
		Op((Prolog e) -> PRED_extend_6_static_exec(e), VA(a4, a7, a8, a9, a10, a3), cont);
	}

	private final static Operation expand_3_7(Prolog m) {
		// expand(-A,fs(B,C,D,E),F):-extend(A,E,D,G,fs(B,C,D,G),F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// expand(-A,fs(B,C,D,E),F):-[extend(A,E,D,G,fs(B,C,D,G),F)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("-", a4), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		if (!a2.unify(C("fs", a5, a6, a7, a8), m.trail)) {
			return m.fail();
		}
		a9 = V(m);
		Term[] y1 = VA(a5, a6, a7, a9);
		a10 = S("fs", y1);
		return //
		Op((Prolog e) -> PRED_extend_6_static_exec(e), VA(a4, a8, a7, a9, a10, a3), cont);
	}

	/** PREDICATE: includes/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/

	public static Operation PRED_includes_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return includes_2_top(m);
	}

	private final static Operation includes_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_prover::includes_2_var, fail_0, fail_0, fail_0, fail_0, FILE_prover::includes_2_var);
	}

	private final static Operation includes_2_var(Prolog m) {
		m.jtry2(null, FILE_prover::includes_2_var_1);
		return includes_2_1(m);
	}

	private final static Operation includes_2_var_1(Prolog m) {
		m.trust(null);
		return includes_2_2(m);
	}

	private final static Operation includes_2_1(Prolog m) {
		// includes([A|B],A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// includes([A|B],A):-['$neck_cut']
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, V(m)), m.trail);
		} else {
			return m.fail();
		}
		if (!a3.unify(a2, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation includes_2_2(Prolog m) {
		// includes([A|B],C):-includes(B,C)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// includes([A|B],C):-[includes(B,C)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[1];
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(V(m), a3), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a3;
		m.AREGS[1] = a2;
		m.cont = cont;
		return includes_2_top(m);
	}

	/** PREDICATE: extend/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
	private static final SymbolTerm PRED_extend_6_s1 = SYM("refuted");

	// private final Term arg5, arg6;

	public static Operation PRED_extend_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry6(null, FILE_prover::extend_6_sub_1);
		return extend_6_1(m);
	}

	private final static Operation extend_6_sub_1(Prolog m) {
		m.retry(null, FILE_prover::extend_6_sub_2);
		return extend_6_2(m);
	}

	private final static Operation extend_6_sub_2(Prolog m) {
		m.trust(null);
		return extend_6_3(m);
	}

	private final static Operation extend_6_1(Prolog m) {
		// extend(A,B,C,D,E,refuted):-includes(C,A),!
		Term a1, a3, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		cont = m.cont;
		// extend(A,B,C,D,E,refuted):-['$get_level'(F),includes(C,A),'$cut'(F)]
		if (!PRED_extend_6_s1.unify(a6, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_includes_2_static_exec(e), VA(a3, a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a7), cont));
	}

	private final static Operation extend_6_2(Prolog m) {
		// extend(A,B,C,B,D,D):-includes(B,A),!
		Term a1, a2, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// extend(A,B,C,B,D,D):-['$get_level'(E),includes(B,A),'$cut'(E)]
		if (!a2.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_includes_2_static_exec(e), VA(a2, a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a7), cont));
	}

	private final static Operation extend_6_3(Prolog m) {
		// extend(A,B,C,[A|B],D,D):-true
		Term a1, a2, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// extend(A,B,C,[A|B],D,D):-[]
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			if (!a2.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a1, a2), m.trail);
		} else {
			return m.fail();
		}
		if (!a5.unify(a6, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: refute/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/prover.pl
	*/
	private static final SymbolTerm PRED_refute_1_s1 = SYM("refuted");

	public static Operation PRED_refute_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prover::refute_1_var, fail_0, fail_0, FILE_prover::refute_1_1, FILE_prover::refute_1_2, fail_0);
	}

	private final static Operation refute_1_var(Prolog m) {
		m.jtry1(null, FILE_prover::refute_1_var_1);
		return refute_1_1(m);
	}

	private final static Operation refute_1_var_1(Prolog m) {
		m.trust(null);
		return refute_1_2(m);
	}

	private final static Operation refute_1_1(Prolog m) {
		// refute(refuted):-!
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// refute(refuted):-['$neck_cut']
		if (!PRED_refute_1_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation refute_1_2(Prolog m) {
		// refute(fs([A&B|C],D,E,F)):-opposite(A,G),opposite(B,H),I=fs(C,D,E,F),add_conjunction(G,B,I),add_conjunction(G,H,I),add_conjunction(A,H,I)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// refute(fs([A&B|C],D,E,F)):-[opposite(A,G),opposite(B,H),'$unify'(I,fs(C,D,E,F)),add_conjunction(G,B,I),add_conjunction(G,H,I),add_conjunction(A,H,I)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("fs", a2, a3, a4, a5), m.trail)) {
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
		a6 = a6.dref();
		a8 = V(m);
		a9 = V(m);
		if (!a6.unify(C("&", a8, a9), m.trail)) {
			return m.fail();
		}
		a10 = V(m);
		a11 = V(m);
		a12 = V(m);
		Term[] y1 = VA(a7, a3, a4, a5);
		a13 = S("fs", y1);
		return //
		Op((Prolog e) -> PRED_opposite_2_static_exec(e), VA(a8, a10), //
				Op((Prolog e) -> PRED_opposite_2_static_exec(e), VA(a9, a11), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a12, a13), //
								Op((Prolog e) -> PRED_add_conjunction_3_static_exec(e), VA(a10, a9, a12), //
										Op((Prolog e) -> PRED_add_conjunction_3_static_exec(e), VA(a10, a11, a12), //
												Op((Prolog e) -> PRED_add_conjunction_3_static_exec(e), VA(a8, a11, a12), cont))))));
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_prover::PRED_top_0_static_exec);
		PredTable.registerBuiltin("prover", 0, FILE_prover::PRED_prover_0_static_exec);
		PredTable.registerBuiltin("problem", 3, FILE_prover::PRED_problem_3_static_exec);
		PredTable.registerBuiltin("implies", 2, FILE_prover::PRED_implies_2_static_exec);
		PredTable.registerBuiltin("opposite", 2, FILE_prover::PRED_opposite_2_static_exec);
		PredTable.registerBuiltin("add_conjunction", 3, FILE_prover::PRED_add_conjunction_3_static_exec);
		PredTable.registerBuiltin("expand", 3, FILE_prover::PRED_expand_3_static_exec);
		PredTable.registerBuiltin("includes", 2, FILE_prover::PRED_includes_2_static_exec);
		PredTable.registerBuiltin("extend", 6, FILE_prover::PRED_extend_6_static_exec);
		PredTable.registerBuiltin("refute", 1, FILE_prover::PRED_refute_1_static_exec);
	}
}
