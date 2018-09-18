package SxxMachine.bench;

import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
import static SxxMachine.bootpreds.PRED_arg_3_static_exec;
import static SxxMachine.bootpreds.PRED_functor_3_static_exec;

import SxxMachine.Arithmetic;
import SxxMachine.FILE_builtins;
import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.StructureTerm;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;

public class FILE_browse  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final /**/ IntegerTerm PRED_top_0_s1 = Integer(100);
	final static IntegerTerm int_10 = Integer(10);
	final static IntegerTerm int_4 = Integer(4);
	final static SymbolTerm ATOM_a = SYM("a");
	final static SymbolTerm ATOM_b = SYM("b");
	private static final ListTerm PRED_top_0_s7 = CONS(ATOM_a, Prolog.Nil);
	private static final ListTerm PRED_top_0_s8 = CONS(ATOM_a, PRED_top_0_s7);
	private static final ListTerm PRED_top_0_s9 = CONS(ATOM_a, PRED_top_0_s8);
	private static final ListTerm PRED_top_0_s10 = CONS(ATOM_b, PRED_top_0_s9);
	private static final ListTerm PRED_top_0_s11 = CONS(ATOM_b, PRED_top_0_s10);
	private static final ListTerm PRED_top_0_s12 = CONS(ATOM_a, PRED_top_0_s11);
	private static final ListTerm PRED_top_0_s13 = CONS(ATOM_a, PRED_top_0_s12);
	private static final ListTerm PRED_top_0_s14 = CONS(ATOM_a, PRED_top_0_s13);
	private static final ListTerm PRED_top_0_s15 = CONS(ATOM_a, PRED_top_0_s14);
	private static final ListTerm PRED_top_0_s16 = CONS(ATOM_a, PRED_top_0_s15);
	private static final ListTerm PRED_top_0_s17 = CONS(ATOM_b, PRED_top_0_s16);
	private static final ListTerm PRED_top_0_s18 = CONS(ATOM_b, PRED_top_0_s17);
	private static final ListTerm PRED_top_0_s19 = CONS(ATOM_b, PRED_top_0_s18);
	private static final ListTerm PRED_top_0_s20 = CONS(ATOM_b, PRED_top_0_s19);
	private static final ListTerm PRED_top_0_s21 = CONS(ATOM_a, PRED_top_0_s20);
	private static final ListTerm PRED_top_0_s22 = CONS(ATOM_a, PRED_top_0_s21);
	private static final ListTerm PRED_top_0_s23 = CONS(ATOM_a, PRED_top_0_s22);
	private static final ListTerm PRED_top_0_s24 = CONS(ATOM_b, Prolog.Nil);
	private static final ListTerm PRED_top_0_s25 = CONS(ATOM_b, PRED_top_0_s24);
	private static final ListTerm PRED_top_0_s26 = CONS(PRED_top_0_s25, Prolog.Nil);
	private static final ListTerm PRED_top_0_s27 = CONS(PRED_top_0_s8, PRED_top_0_s26);
	private static final ListTerm PRED_top_0_s28 = CONS(ATOM_a, PRED_top_0_s27);
	private static final ListTerm PRED_top_0_s29 = CONS(ATOM_a, PRED_top_0_s28);
	private static final ListTerm PRED_top_0_s30 = CONS(ATOM_b, PRED_top_0_s29);
	private static final ListTerm PRED_top_0_s31 = CONS(ATOM_b, PRED_top_0_s30);
	private static final ListTerm PRED_top_0_s32 = CONS(ATOM_b, PRED_top_0_s31);
	private static final ListTerm PRED_top_0_s33 = CONS(ATOM_b, PRED_top_0_s32);
	private static final ListTerm PRED_top_0_s34 = CONS(ATOM_a, PRED_top_0_s33);
	private static final ListTerm PRED_top_0_s35 = CONS(ATOM_a, PRED_top_0_s34);
	private static final ListTerm PRED_top_0_s36 = CONS(ATOM_b, PRED_top_0_s7);
	private static final ListTerm PRED_top_0_s37 = CONS(ATOM_a, PRED_top_0_s36);
	private static final ListTerm PRED_top_0_s38 = CONS(ATOM_b, PRED_top_0_s37);
	private static final ListTerm PRED_top_0_s39 = CONS(PRED_top_0_s36, PRED_top_0_s38);
	private static final ListTerm PRED_top_0_s40 = CONS(ATOM_b, PRED_top_0_s39);
	private static final ListTerm PRED_top_0_s41 = CONS(ATOM_a, PRED_top_0_s40);
	private static final ListTerm PRED_top_0_s42 = CONS(ATOM_a, PRED_top_0_s41);
	private static final ListTerm PRED_top_0_s43 = CONS(ATOM_a, PRED_top_0_s42);
	private static final ListTerm PRED_top_0_s44 = CONS(PRED_top_0_s43, Prolog.Nil);
	private static final ListTerm PRED_top_0_s45 = CONS(PRED_top_0_s35, PRED_top_0_s44);
	private static final ListTerm PRED_top_0_s46 = CONS(PRED_top_0_s23, PRED_top_0_s45);
	final static IntegerTerm int_21 = Integer(21);

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-init(100,10,4,[[a,a,a,b,b,b,b,a,a,a,a,a,b,b,a,a,a],[a,a,b,b,b,b,a,a,[a,a],[b,b]],[a,a,a,b,[b,a],b,a,b,a]],A),randomize(A,B,21),!,investigate(B,[[star(C),D,star(E),D,a,star(C),a,star(E),star(C)],[star(C),star(E),star(E),star(C),[star(C)],[star(E)]],[F,G,star(H),[b,a],star(I),J,K]])
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43,
				a44, a45, a46;
		// top:-['$get_level'(A),init(100,10,4,[[a,a,a,b,b,b,b,a,a,a,a,a,b,b,a,a,a],[a,a,b,b,b,b,a,a,[a,a],[b,b]],[a,a,a,b,[b,a],b,a,b,a]],B),randomize(B,C,21),'$cut'(A),investigate(C,[[star(D),E,star(F),E,a,star(D),a,star(F),star(D)],[star(D),star(F),star(F),star(D),[star(D)],[star(F)]],[G,H,star(I),[b,a],star(J),K,L]])]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a2 = V(m);
		a3 = V(m);
		a4 = V(m);
		Term[] y1 = VA(a4);
		a5 = S("star", y1);
		a6 = V(m);
		a7 = V(m);
		Term[] y2 = VA(a7);
		a8 = S("star", y2);
		Term[] y3 = VA(a4);
		a9 = S("star", y3);
		Term[] y4 = VA(a7);
		a10 = S("star", y4);
		Term[] y5 = VA(a4);
		a11 = S("star", y5);
		a12 = CONS(a11, Prolog.Nil);
		a13 = CONS(a10, a12);
		a14 = CONS(ATOM_a, a13);
		a15 = CONS(a9, a14);
		a16 = CONS(ATOM_a, a15);
		a17 = CONS(a6, a16);
		a18 = CONS(a8, a17);
		a19 = CONS(a6, a18);
		a20 = CONS(a5, a19);
		Term[] y6 = VA(a4);
		a21 = S("star", y6);
		Term[] y7 = VA(a7);
		a22 = S("star", y7);
		Term[] y8 = VA(a7);
		a23 = S("star", y8);
		Term[] y9 = VA(a4);
		a24 = S("star", y9);
		Term[] y10 = VA(a4);
		a25 = S("star", y10);
		a26 = CONS(a25, Prolog.Nil);
		Term[] y11 = VA(a7);
		a27 = S("star", y11);
		a28 = CONS(a27, Prolog.Nil);
		a29 = CONS(a28, Prolog.Nil);
		a30 = CONS(a26, a29);
		a31 = CONS(a24, a30);
		a32 = CONS(a23, a31);
		a33 = CONS(a22, a32);
		a34 = CONS(a21, a33);
		Term[] y12 = VA(V(m));
		a35 = S("star", y12);
		Term[] y13 = VA(V(m));
		a36 = S("star", y13);
		a37 = CONS(V(m), Prolog.Nil);
		a38 = CONS(V(m), a37);
		a39 = CONS(a36, a38);
		a40 = CONS(PRED_top_0_s36, a39);
		a41 = CONS(a35, a40);
		a42 = CONS(V(m), a41);
		a43 = CONS(V(m), a42);
		a44 = CONS(a43, Prolog.Nil);
		a45 = CONS(a34, a44);
		a46 = CONS(a20, a45);
		return //
		Op((Prolog e) -> PRED_init_5_static_exec(e), VA(PRED_top_0_s1, int_10, int_4, PRED_top_0_s46, a2), //
				Op((Prolog e) -> PRED_randomize_3_static_exec(e), VA(a2, a3, int_21), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a1), //
								Op((Prolog e) -> PRED_investigate_2_static_exec(e), VA(a3, a46), cont))));
	}

	/** PREDICATE: init/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/

	// private final Term arg5;

	public static Operation PRED_init_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// init(A,B,C,D,E):-init(A,B,B,C,D,E)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		a5 = LARG[4];
		// init(A,B,C,D,E):-[init(A,B,B,C,D,E)]
		return //
		Op((Prolog e) -> PRED_init_6_static_exec(e), VA(a1, a2, a2, a3, a4, a5), cont);
	}

	/** PREDICATE: init/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final /**/ IntegerTerm PRED_init_6_s1 = Integer(0);
	final static IntegerTerm int_1 = Integer(1);

	// private final Term arg5, arg6;

	public static Operation PRED_init_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_browse::init_6_var, FILE_browse::init_6_var, FILE_browse::init_6_2, FILE_browse::init_6_2, FILE_browse::init_6_2, FILE_browse::init_6_2);
	}

	private final static Operation init_6_var(Prolog m) {
		m.jtry6(null, FILE_browse::init_6_var_1);
		return init_6_1(m);
	}

	private final static Operation init_6_var_1(Prolog m) {
		m.trust(null);
		return init_6_2(m);
	}

	private final static Operation init_6_1(Prolog m) {
		// init(0,A,B,C,D,E):-!
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// init(0,A,B,C,D,E):-['$neck_cut']
		if (!PRED_init_6_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation init_6_2(Prolog m) {
		// init(A,B,C,D,E,[F|G]):-fill(B,[],H),get_pats(D,E,I),J is C-B,fill(J,[pattern(I)|H],F),K is A-1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(B,C,L),init(K,L,C,D,E,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// init(A,B,C,D,E,[F|G]):-[fill(B,[],H),get_pats(D,E,I),J is C-B,fill(J,[pattern(I)|H],F),K is A-1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(B,C,L),init(K,L,C,D,E,G)]
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			a7 = argz[0];
			a8 = argz[1];
		} else if (a6.isVar()) {
			a7 = V(m);
			a8 = V(m);
			a6.bind(CONS(a7, a8), m.trail);
		} else {
			return m.fail();
		}
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		Term[] y1 = VA(a3, a2);
		a12 = S("-", y1);
		Term[] y2 = VA(a10);
		a13 = S("pattern", y2);
		a14 = CONS(a13, a9);
		a15 = V(m);
		Term[] y3 = VA(a1, int_1);
		a16 = S("-", y3);
		a17 = V(m);
		return //
		Op((Prolog e) -> PRED_fill_3_static_exec(e), VA(a2, Prolog.Nil, a9), //
				Op((Prolog e) -> PRED_get_pats_3_static_exec(e), VA(a4, a5, a10), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a11, a12), //
								Op((Prolog e) -> PRED_fill_3_static_exec(e), VA(a11, a14, a7), //
										Op(FILE_builtins::PRED_is_2_static_exec, VA(a15, a16), //
												Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_static_exec(e), VA(a2, a3, a17), //
														Op((Prolog e) -> PRED_init_6_static_exec(e), VA(a15, a17, a3, a4, a5, a8), cont)))))));
	}

	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final /**/ IntegerTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_s1 = Integer(0);

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_browse::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-A=:=0,!,C is B
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-['$get_level'(D),E is 0,'$arith_equal'(A,E),'$cut'(D),C is B]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		//START inline expansion of a(5)is si(1)
		if (!a5.unify(PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $arith_equal(a(1),a(5))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a5)) != 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		//START inline expansion of a(3)is a(2)
		if (!a3.unify(Arithmetic.evaluate(a2), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_2(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-C is A-1
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-[C is A-1]
		Term[] y1 = VA(a1, int_1);
		a4 = S("-", y1);
		//START inline expansion of a(3)is a(4)
		if (!a3.unify(Arithmetic.evaluate(a4), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: fill/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final /**/ IntegerTerm PRED_fill_3_s1 = Integer(0);
	private static final StructureTerm PRED_fill_3_s5 = S("dummy", Prolog.Nil);

	public static Operation PRED_fill_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return fill_3_top(m);
	}

	private final static Operation fill_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_browse::fill_3_var, FILE_browse::fill_3_var, FILE_browse::fill_3_2, FILE_browse::fill_3_2, FILE_browse::fill_3_2, FILE_browse::fill_3_2);
	}

	private final static Operation fill_3_var(Prolog m) {
		m.jtry3(null, FILE_browse::fill_3_var_1);
		return fill_3_1(m);
	}

	private final static Operation fill_3_var_1(Prolog m) {
		m.trust(null);
		return fill_3_2(m);
	}

	private final static Operation fill_3_1(Prolog m) {
		// fill(0,A,A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// fill(0,A,A):-['$neck_cut']
		if (!PRED_fill_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation fill_3_2(Prolog m) {
		// fill(A,B,[dummy([])|C]):-D is A-1,fill(D,B,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// fill(A,B,[dummy([])|C]):-[D is A-1,fill(D,B,C)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!PRED_fill_3_s5.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(PRED_fill_3_s5, a4), m.trail);
		} else {
			return m.fail();
		}
		a5 = V(m);
		Term[] y1 = VA(a1, int_1);
		a6 = S("-", y1);
		//START inline expansion of a(5)is a(6)
		if (!a5.unify(Arithmetic.evaluate(a6), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a4;
		m.cont = cont;
		return fill_3_top(m);
	}

	/** PREDICATE: randomize/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_randomize_3_s1 = SYM("[]");
	final static IntegerTerm int_17 = Integer(17);
	final static IntegerTerm int_251 = Integer(251);

	public static Operation PRED_randomize_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_browse::randomize_3_var, FILE_browse::randomize_3_2, FILE_browse::randomize_3_2, FILE_browse::randomize_3_var, FILE_browse::randomize_3_2, FILE_browse::randomize_3_2);
	}

	private final static Operation randomize_3_var(Prolog m) {
		m.jtry3(null, FILE_browse::randomize_3_var_1);
		return randomize_3_1(m);
	}

	private final static Operation randomize_3_var_1(Prolog m) {
		m.trust(null);
		return randomize_3_2(m);
	}

	private final static Operation randomize_3_1(Prolog m) {
		// randomize([],[],A):-!
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// randomize([],[],A):-['$neck_cut']
		if (!PRED_randomize_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_randomize_3_s1.unify(a2, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation randomize_3_2(Prolog m) {
		// randomize(A,[B|C],D):-length(A,E),F is D*17 mod 251,G is F mod E,split(G,A,B,H),randomize(H,C,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// randomize(A,[B|C],D):-[length(A,E),F is D*17 mod 251,G is F mod E,split(G,A,B,H),randomize(H,C,F)]
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
		a6 = V(m);
		a7 = V(m);
		Term[] y1 = VA(a3, int_17);
		a8 = S("*", y1);
		Term[] y2 = VA(a8, int_251);
		a9 = S("mod", y2);
		a10 = V(m);
		Term[] y3 = VA(a7, a6);
		a11 = S("mod", y3);
		a12 = V(m);
		return //
		Op((Prolog e) -> PRED_length_2_static_exec(e), VA(a1, a6), //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a7, a9), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a10, a11), //
								Op((Prolog e) -> PRED_split_4_static_exec(e), VA(a10, a1, a4, a12), //
										Op((Prolog e) -> PRED_randomize_3_static_exec(e), VA(a12, a5, a7), cont)))));
	}

	/** PREDICATE: split/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final /**/ IntegerTerm PRED_split_4_s1 = Integer(0);

	public static Operation PRED_split_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return split_4_top(m);
	}

	private final static Operation split_4_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_browse::split_4_var, FILE_browse::split_4_var, FILE_browse::split_4_2, FILE_browse::split_4_2, FILE_browse::split_4_2, FILE_browse::split_4_2);
	}

	private final static Operation split_4_var(Prolog m) {
		m.jtry4(null, FILE_browse::split_4_var_1);
		return split_4_1(m);
	}

	private final static Operation split_4_var_1(Prolog m) {
		m.trust(null);
		return split_4_2(m);
	}

	private final static Operation split_4_1(Prolog m) {
		// split(0,[A|B],A,B):-!
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split(0,[A|B],A,B):-['$neck_cut']
		if (!PRED_split_4_s1.unify(a1, m.trail))
			return m.fail();
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
		if (!a5.unify(a3, m.trail))
			return m.fail();
		if (!a6.unify(a4, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation split_4_2(Prolog m) {
		// split(A,[B|C],D,[B|E]):-F is A-1,split(F,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split(A,[B|C],D,[B|E]):-[F is A-1,split(F,C,D,E)]
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
		Term[] y1 = VA(a1, int_1);
		a9 = S("-", y1);
		//START inline expansion of a(8)is a(9)
		if (!a8.unify(Arithmetic.evaluate(a9), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a8;
		m.AREGS[1] = a6;
		m.AREGS[2] = a3;
		m.AREGS[3] = a7;
		m.cont = cont;
		return split_4_top(m);
	}

	/** PREDICATE: investigate/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_investigate_2_s1 = SYM("[]");
	final static SymbolTerm ATOM_pattern = SYM("pattern");

	public static Operation PRED_investigate_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_browse::investigate_2_var, fail_0, fail_0, FILE_browse::investigate_2_1, fail_0, FILE_browse::investigate_2_2);
	}

	private final static Operation investigate_2_var(Prolog m) {
		m.jtry2(null, FILE_browse::investigate_2_var_1);
		return investigate_2_1(m);
	}

	private final static Operation investigate_2_var_1(Prolog m) {
		m.trust(null);
		return investigate_2_2(m);
	}

	private final static Operation investigate_2_1(Prolog m) {
		// investigate([],A):-!
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// investigate([],A):-['$neck_cut']
		if (!PRED_investigate_2_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation investigate_2_2(Prolog m) {
		// investigate([A|B],C):-property(A,pattern,D),p_investigate(D,C),investigate(B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// investigate([A|B],C):-[property(A,pattern,D),p_investigate(D,C),investigate(B,C)]
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
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_property_3_static_exec(e), VA(a3, ATOM_pattern, a5), //
				Op((Prolog e) -> PRED_p_investigate_2_static_exec(e), VA(a5, a2), //
						Op((Prolog e) -> PRED_investigate_2_static_exec(e), VA(a4, a2), cont)));
	}

	/** PREDICATE: get_pats/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/

	public static Operation PRED_get_pats_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get_pats(A,B,C):-get_pats(A,B,C,B)
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// get_pats(A,B,C):-[get_pats(A,B,C,B)]
		return //
		Op((Prolog e) -> PRED_get_pats_4_static_exec(e), VA(a1, a2, a3, a2), cont);
	}

	/** PREDICATE: get_pats/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final /**/ IntegerTerm PRED_get_pats_4_s1 = Integer(0);

	public static Operation PRED_get_pats_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return get_pats_4_top(m);
	}

	private final static Operation get_pats_4_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_browse::get_pats_4_var, FILE_browse::get_pats_4_var, FILE_browse::get_pats_4_flo, FILE_browse::get_pats_4_flo, FILE_browse::get_pats_4_flo, FILE_browse::get_pats_4_flo);
	}

	private final static Operation get_pats_4_var(Prolog m) {
		m.jtry4(null, FILE_browse::get_pats_4_var_1);
		return get_pats_4_1(m);
	}

	private final static Operation get_pats_4_var_1(Prolog m) {
		m.retry(null, FILE_browse::get_pats_4_var_2);
		return get_pats_4_2(m);
	}

	private final static Operation get_pats_4_var_2(Prolog m) {
		m.trust(null);
		return get_pats_4_3(m);
	}

	private final static Operation get_pats_4_flo(Prolog m) {
		m.jtry4(null, FILE_browse::get_pats_4_flo_1);
		return get_pats_4_2(m);
	}

	private final static Operation get_pats_4_flo_1(Prolog m) {
		m.trust(null);
		return get_pats_4_3(m);
	}

	private final static Operation get_pats_4_1(Prolog m) {
		// get_pats(0,A,[],B):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// get_pats(0,A,[],B):-['$neck_cut']
		if (!PRED_get_pats_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!Prolog.Nil.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation get_pats_4_2(Prolog m) {
		// get_pats(A,[B|C],[B|D],E):-F is A-1,get_pats(F,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// get_pats(A,[B|C],[B|D],E):-[F is A-1,get_pats(F,C,D,E)]
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
		Term[] y1 = VA(a1, int_1);
		a9 = S("-", y1);
		//START inline expansion of a(8)is a(9)
		if (!a8.unify(Arithmetic.evaluate(a9), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a8;
		m.AREGS[1] = a6;
		m.AREGS[2] = a7;
		m.AREGS[3] = a4;
		m.cont = cont;
		return get_pats_4_top(m);
	}

	private final static Operation get_pats_4_3(Prolog m) {
		// get_pats(A,[],B,C):-get_pats(A,C,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// get_pats(A,[],B,C):-[get_pats(A,C,B,C)]
		if (!Prolog.Nil.unify(a2, m.trail))
			return m.fail();
		m.AREGS[0] = a1;
		m.AREGS[1] = a4;
		m.AREGS[2] = a3;
		m.AREGS[3] = a4;
		m.cont = cont;
		return get_pats_4_top(m);
	}

	/** PREDICATE: property/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_property_3_s1 = SYM("[]");

	public static Operation PRED_property_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return property_3_top(m);
	}

	private final static Operation property_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_browse::property_3_var, fail_0, fail_0, FILE_browse::property_3_1, fail_0, FILE_browse::property_3_lis);
	}

	private final static Operation property_3_var(Prolog m) {
		m.jtry3(null, FILE_browse::property_3_var_1);
		return property_3_1(m);
	}

	private final static Operation property_3_var_1(Prolog m) {
		m.retry(null, FILE_browse::property_3_var_2);
		return property_3_2(m);
	}

	private final static Operation property_3_var_2(Prolog m) {
		m.trust(null);
		return property_3_3(m);
	}

	private final static Operation property_3_lis(Prolog m) {
		m.jtry3(null, FILE_browse::property_3_lis_1);
		return property_3_2(m);
	}

	private final static Operation property_3_lis_1(Prolog m) {
		m.trust(null);
		return property_3_3(m);
	}

	private final static Operation property_3_1(Prolog m) {
		// property([],A,B):-fail
		Term a1;
		a1 = m.AREGS[0];
		// property([],A,B):-[fail]
		if (!PRED_property_3_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of fail
		return m.fail();
		//END inline expansion
	}

	private final static Operation property_3_2(Prolog m) {
		// property([A|B],C,D):-functor(A,C,E),!,arg(1,A,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// property([A|B],C,D):-['$get_level'(E),functor(A,C,F),'$cut'(E),arg(1,A,D)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[0];
		} else if (a1.isVar()) {
			a4 = V(m);
			a1.bind(CONS(a4, V(m)), m.trail);
		} else {
			return m.fail();
		}
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a4, a2, V(m)), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a5), //
						Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(int_1, a4, a3), cont)));
	}

	private final static Operation property_3_3(Prolog m) {
		// property([A|B],C,D):-property(B,C,D)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// property([A|B],C,D):-[property(B,C,D)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[1];
		} else if (a1.isVar()) {
			a4 = V(m);
			a1.bind(CONS(V(m), a4), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a3;
		m.cont = cont;
		return property_3_top(m);
	}

	/** PREDICATE: p_investigate/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_p_investigate_2_s1 = SYM("[]");

	public static Operation PRED_p_investigate_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_browse::p_investigate_2_var, fail_0, fail_0, FILE_browse::p_investigate_2_1, fail_0, FILE_browse::p_investigate_2_2);
	}

	private final static Operation p_investigate_2_var(Prolog m) {
		m.jtry2(null, FILE_browse::p_investigate_2_var_1);
		return p_investigate_2_1(m);
	}

	private final static Operation p_investigate_2_var_1(Prolog m) {
		m.trust(null);
		return p_investigate_2_2(m);
	}

	private final static Operation p_investigate_2_1(Prolog m) {
		// p_investigate([],A):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// p_investigate([],A):-[]
		if (!PRED_p_investigate_2_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation p_investigate_2_2(Prolog m) {
		// p_investigate([A|B],C):-p_match(C,A),p_investigate(B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// p_investigate([A|B],C):-[p_match(C,A),p_investigate(B,C)]
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
		return //
		Op((Prolog e) -> PRED_p_match_2_static_exec(e), VA(a2, a3), //
				Op((Prolog e) -> PRED_p_investigate_2_static_exec(e), VA(a4, a2), cont));
	}

	/** PREDICATE: p_match/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_p_match_2_s1 = SYM("[]");

	public static Operation PRED_p_match_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_browse::p_match_2_var, fail_0, fail_0, FILE_browse::p_match_2_1, fail_0, FILE_browse::p_match_2_2);
	}

	private final static Operation p_match_2_var(Prolog m) {
		m.jtry2(null, FILE_browse::p_match_2_var_1);
		return p_match_2_1(m);
	}

	private final static Operation p_match_2_var_1(Prolog m) {
		m.trust(null);
		return p_match_2_2(m);
	}

	private final static Operation p_match_2_1(Prolog m) {
		// p_match([],A):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// p_match([],A):-[]
		if (!PRED_p_match_2_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation p_match_2_2(Prolog m) {
		// p_match([A|B],C):-'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),p_match(B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// p_match([A|B],C):-['$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),p_match(B,C)]
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
		return //
		Op((Prolog e) -> PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(e), VA(a3, a2), //
				Op((Prolog e) -> PRED_p_match_2_static_exec(e), VA(a4, a2), cont));
	}

	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/

	public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_browse::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-match(B,A),fail
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-[match(B,A),fail]
		return //
		Op((Prolog e) -> PRED_match_2_static_exec(e), VA(a2, a1), //
				Op(fail_0, VA(), cont));
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-[]
		return cont;
	}

	/** PREDICATE: match/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_match_2_s1 = SYM("[]");

	public static Operation PRED_match_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return match_2_top(m);
	}

	private final static Operation match_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_browse::match_2_var, FILE_browse::match_2_3, FILE_browse::match_2_3, FILE_browse::match_2_con, FILE_browse::match_2_3, FILE_browse::match_2_lis);
	}

	private final static Operation match_2_var(Prolog m) {
		m.jtry2(null, FILE_browse::match_2_var_1);
		return match_2_1(m);
	}

	private final static Operation match_2_var_1(Prolog m) {
		m.retry(null, FILE_browse::match_2_var_2);
		return match_2_2(m);
	}

	private final static Operation match_2_var_2(Prolog m) {
		m.retry(null, FILE_browse::match_2_var_3);
		return match_2_3(m);
	}

	private final static Operation match_2_var_3(Prolog m) {
		m.trust(null);
		return match_2_4(m);
	}

	private final static Operation match_2_con(Prolog m) {
		m.jtry2(null, FILE_browse::match_2_con_1);
		return match_2_1(m);
	}

	private final static Operation match_2_con_1(Prolog m) {
		m.trust(null);
		return match_2_3(m);
	}

	private final static Operation match_2_lis(Prolog m) {
		m.jtry2(null, FILE_browse::match_2_lis_1);
		return match_2_2(m);
	}

	private final static Operation match_2_lis_1(Prolog m) {
		m.retry(null, FILE_browse::match_2_lis_2);
		return match_2_3(m);
	}

	private final static Operation match_2_lis_2(Prolog m) {
		m.trust(null);
		return match_2_4(m);
	}

	private final static Operation match_2_1(Prolog m) {
		// match([],[]):-!
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// match([],[]):-['$neck_cut']
		if (!PRED_match_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_match_2_s1.unify(a2, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation match_2_2(Prolog m) {
		// match([A|B],[C|D]):-var(C),!,A=C,match(B,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// match([A|B],[C|D]):-['$get_level'(E),var(C),'$cut'(E),'$unify'(A,C),match(B,D)]
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
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(5))
		a5 = a5.dref();
		if (!(a5.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(3),a(5))
		if (!a3.unify(a5, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a4;
		m.AREGS[1] = a6;
		m.cont = cont;
		return match_2_top(m);
	}

	private final static Operation match_2_3(Prolog m) {
		// match(A,[B|C]):-nonvar(B),B=star(D),!,'$concat'(D,E,A),match(E,C)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// match(A,[B|C]):-['$get_level'(D),nonvar(B),'$unify'(B,star(E)),'$cut'(D),'$concat'(E,F,A),match(F,C)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a3 = argz[0];
			a4 = argz[1];
		} else if (a2.isVar()) {
			a3 = V(m);
			a4 = V(m);
			a2.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(3))
		a3 = a3.dref();
		if ((a3.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		Term[] y1 = VA(a6);
		a7 = S("star", y1);
		//START inline expansion of $unify(a(3),a(7))
		if (!a3.unify(a7, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_$concat_3_static_exec(e), VA(a6, a8, a1), //
				Op((Prolog e) -> PRED_match_2_static_exec(e), VA(a8, a4), cont));
	}

	private final static Operation match_2_4(Prolog m) {
		// match([A|B],[C|D]):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),match(B,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// match([A|B],[C|D]):-['$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),match(B,D)]
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
		return //
		Op((Prolog e) -> PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(e), VA(a3, a5), //
				Op((Prolog e) -> PRED_match_2_static_exec(e), VA(a4, a6), cont));
	}

	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/

	public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_browse::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-atom(A),!,A=B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-['$get_level'(C),atom(A),'$cut'(C),'$unify'(A,B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(1))
		a1 = a1.dref();
		if (!(a1.isSymbol())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(1),a(2))
		if (!a1.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-match(A,B)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-[match(A,B)]
		return //
		Op((Prolog e) -> PRED_match_2_static_exec(e), VA(a1, a2), cont);
	}

	/** PREDICATE: $concat/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl
	*/
	private static final SymbolTerm PRED_$concat_3_s1 = SYM("[]");

	public static Operation PRED_$concat_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return $concat_3_top(m);
	}

	private final static Operation $concat_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_browse::$concat_3_var, fail_0, fail_0, FILE_browse::$concat_3_1, fail_0, FILE_browse::$concat_3_2);
	}

	private final static Operation $concat_3_var(Prolog m) {
		m.jtry3(null, FILE_browse::$concat_3_var_1);
		return $concat_3_1(m);
	}

	private final static Operation $concat_3_var_1(Prolog m) {
		m.trust(null);
		return $concat_3_2(m);
	}

	private final static Operation $concat_3_1(Prolog m) {
		// '$concat'([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$concat'([],A,A):-[]
		if (!PRED_$concat_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation $concat_3_2(Prolog m) {
		// '$concat'([A|B],C,[A|D]):-'$concat'(B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$concat'([A|B],C,[A|D]):-['$concat'(B,C,D)]
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
		return $concat_3_top(m);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_browse::PRED_top_0_static_exec);
		PredTable.registerBuiltin("init", 5, FILE_browse::PRED_init_5_static_exec);
		PredTable.registerBuiltin("init", 6, FILE_browse::PRED_init_6_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl", "$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl", 3,
				FILE_browse::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_static_exec);
		PredTable.registerBuiltin("fill", 3, FILE_browse::PRED_fill_3_static_exec);
		PredTable.registerBuiltin("randomize", 3, FILE_browse::PRED_randomize_3_static_exec);
		PredTable.registerBuiltin("split", 4, FILE_browse::PRED_split_4_static_exec);
		PredTable.registerBuiltin("investigate", 2, FILE_browse::PRED_investigate_2_static_exec);
		PredTable.registerBuiltin("get_pats", 3, FILE_browse::PRED_get_pats_3_static_exec);
		PredTable.registerBuiltin("get_pats", 4, FILE_browse::PRED_get_pats_4_static_exec);
		PredTable.registerBuiltin("property", 3, FILE_browse::PRED_property_3_static_exec);
		PredTable.registerBuiltin("p_investigate", 2, FILE_browse::PRED_p_investigate_2_static_exec);
		PredTable.registerBuiltin("p_match", 2, FILE_browse::PRED_p_match_2_static_exec);
		PredTable.registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl", "$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl", 2,
				FILE_browse::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec);
		PredTable.registerBuiltin("match", 2, FILE_browse::PRED_match_2_static_exec);
		PredTable.registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl", "$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl", 2,
				FILE_browse::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec);
		PredTable.registerBuiltin("$concat", 3, FILE_browse::PRED_$concat_3_static_exec);
	}
}
