package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_simple_analyzer  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-main(A)
		m.setB0();
		// top:-[main(A)]
		return //
		Op((Prolog e) -> PRED_main_1_static_exec(e), VA(V(m)), cont);
	}

	/** PREDICATE: main/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	final static SymbolTerm ATOM_main = SYM("main");
	final static IntegerTerm int_0 = Integer(0);
	private static final StructureTerm PRED_main_1_s6 = S("/", ATOM_main, int_0);
	final static IntegerTerm int_1 = Integer(1);
	final static IntegerTerm int_2 = Integer(2);
	private static final ListTerm PRED_main_1_s14 = CONS(int_2, Prolog.Nil);
	private static final ListTerm PRED_main_1_s15 = CONS(int_1, PRED_main_1_s14);
	final static SymbolTerm ATOM_fail = SYM("fail");
	private static final StructureTerm PRED_main_1_s19 = S(":-", ATOM_main, Prolog.True);
	final static SymbolTerm ATOM_qsort = SYM("qsort");
	final static IntegerTerm int_3 = Integer(3);
	private static final StructureTerm PRED_main_1_s23 = S("/", ATOM_qsort, int_3);
	final static SymbolTerm ATOM_part = SYM("part");
	final static IntegerTerm int_4 = Integer(4);
	private static final StructureTerm PRED_main_1_s29 = S("/", ATOM_part, int_4);
	final static SymbolTerm ATOM_$0024cut_part$002F41 = SYM("$cut_part/4_1");
	final static IntegerTerm int_5 = Integer(5);
	private static final StructureTerm PRED_main_1_s35 = S("/", ATOM_$0024cut_part$002F41, int_5);
	final static SymbolTerm ATOM_$0024fac_$0024cut_part$002F4_1$002F52 = SYM("$fac_$cut_part/4_1/5_2");
	final static IntegerTerm int_6 = Integer(6);
	private static final StructureTerm PRED_main_1_s40 = S("/", ATOM_$0024fac_$0024cut_part$002F4_1$002F52, int_6);

	public static Operation PRED_main_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// main(A):-analyze_strees([stree(main/0,(main:-qsort([1,2],B,[]),true;fail),(main:-true),[],1),stree(qsort/3,(qsort(C,D,E):-C=[F|G],part(G,F,H,I),qsort(I,J,E),qsort(H,D,[F|J]),true;C=[],E=D,true;fail),(qsort(K,L,M):-true),[],1),stree(part/4,(part(N,O,P,Q):-'$cut_load'(R),'$cut_part/4_1'(N,O,P,Q,R),true;fail),(part(S,T,U,V):-true),[stree('$cut_part/4_1'/5,('$cut_part/4_1'(W,X,Y,Z,A1):-W=[B1|C1],'$fac_$cut_part/4_1/5_2'(C1,X,Y,Z,A1,B1),true;W=[],Y=[],Z=[],true;fail),('$cut_part/4_1'(D1,E1,F1,G1,H1):-true),[stree('$fac_$cut_part/4_1/5_2'/6,('$fac_$cut_part/4_1/5_2'(I1,J1,K1,L1,M1,N1):-K1=[N1|O1],N1=<J1,'$cut_shallow'(M1),part(I1,J1,O1,L1),true;L1=[N1|P1],part(I1,J1,K1,P1),true;fail),('$fac_$cut_part/4_1/5_2'(Q1,R1,S1,T1,U1,V1):-true),[],1)],1)],1)],A)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43,
				a44, a45, a46, a47, a48, a49, a50, a51, a52, a53, a54, a55, a56, a57, a58, a59, a60, a61, a62, a63, a64, a65, a66, a67, a68, a69, a70, a71, a72, a73, a74, a75, a76, a77, a78, a79, a80, a81, a82, a83, a84,
				a85, a86, a87, a88, a89, a90, a91, a92, a93, a94, a95, a96, a97, a98, a99, a100, a101, a102, a103, a104, a105, a106, a107, a108, a109;
		a1 = LARG[0];
		// main(A):-[analyze_strees([stree(main/0,(main:-qsort([1,2],B,[]),true;fail),(main:-true),[],1),stree(qsort/3,(qsort(C,D,E):-C=[F|G],part(G,F,H,I),qsort(I,J,E),qsort(H,D,[F|J]),true;C=[],E=D,true;fail),(qsort(K,L,M):-true),[],1),stree(part/4,(part(N,O,P,Q):-'$cut_load'(R),'$cut_part/4_1'(N,O,P,Q,R),true;fail),(part(S,T,U,V):-true),[stree('$cut_part/4_1'/5,('$cut_part/4_1'(W,X,Y,Z,A1):-W=[B1|C1],'$fac_$cut_part/4_1/5_2'(C1,X,Y,Z,A1,B1),true;W=[],Y=[],Z=[],true;fail),('$cut_part/4_1'(D1,E1,F1,G1,H1):-true),[stree('$fac_$cut_part/4_1/5_2'/6,('$fac_$cut_part/4_1/5_2'(I1,J1,K1,L1,M1,N1):-K1=[N1|O1],N1=<J1,'$cut_shallow'(M1),part(I1,J1,O1,L1),true;L1=[N1|P1],part(I1,J1,K1,P1),true;fail),('$fac_$cut_part/4_1/5_2'(Q1,R1,S1,T1,U1,V1):-true),[],1)],1)],1)],A)]
		Term[] y1 = VA(PRED_main_1_s15, V(m), Prolog.Nil);
		a2 = S("qsort", y1);
		Term[] y2 = VA(a2, Prolog.True);
		a3 = S(",", y2);
		Term[] y3 = VA(a3, ATOM_fail);
		a4 = S(";", y3);
		Term[] y4 = VA(ATOM_main, a4);
		a5 = S(":-", y4);
		Term[] y5 = VA(PRED_main_1_s6, a5, PRED_main_1_s19, Prolog.Nil, int_1);
		a6 = S("stree", y5);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		Term[] y6 = VA(a7, a8, a9);
		a10 = S("qsort", y6);
		a11 = V(m);
		a12 = V(m);
		a13 = CONS(a11, a12);
		Term[] y7 = VA(a7, a13);
		a14 = S("=", y7);
		a15 = V(m);
		a16 = V(m);
		Term[] y8 = VA(a12, a11, a15, a16);
		a17 = S("part", y8);
		a18 = V(m);
		Term[] y9 = VA(a16, a18, a9);
		a19 = S("qsort", y9);
		a20 = CONS(a11, a18);
		Term[] y10 = VA(a15, a8, a20);
		a21 = S("qsort", y10);
		Term[] y11 = VA(a21, Prolog.True);
		a22 = S(",", y11);
		Term[] y12 = VA(a19, a22);
		a23 = S(",", y12);
		Term[] y13 = VA(a17, a23);
		a24 = S(",", y13);
		Term[] y14 = VA(a14, a24);
		a25 = S(",", y14);
		Term[] y15 = VA(a7, Prolog.Nil);
		a26 = S("=", y15);
		Term[] y16 = VA(a9, a8);
		a27 = S("=", y16);
		Term[] y17 = VA(a27, Prolog.True);
		a28 = S(",", y17);
		Term[] y18 = VA(a26, a28);
		a29 = S(",", y18);
		Term[] y19 = VA(a29, ATOM_fail);
		a30 = S(";", y19);
		Term[] y20 = VA(a25, a30);
		a31 = S(";", y20);
		Term[] y21 = VA(a10, a31);
		a32 = S(":-", y21);
		Term[] y22 = VA(V(m), V(m), V(m));
		a33 = S("qsort", y22);
		Term[] y23 = VA(a33, Prolog.True);
		a34 = S(":-", y23);
		Term[] y24 = VA(PRED_main_1_s23, a32, a34, Prolog.Nil, int_1);
		a35 = S("stree", y24);
		a36 = V(m);
		a37 = V(m);
		a38 = V(m);
		a39 = V(m);
		Term[] y25 = VA(a36, a37, a38, a39);
		a40 = S("part", y25);
		a41 = V(m);
		Term[] y26 = VA(a41);
		a42 = S("$cut_load", y26);
		Term[] y27 = VA(a36, a37, a38, a39, a41);
		a43 = S("$cut_part/4_1", y27);
		Term[] y28 = VA(a43, Prolog.True);
		a44 = S(",", y28);
		Term[] y29 = VA(a42, a44);
		a45 = S(",", y29);
		Term[] y30 = VA(a45, ATOM_fail);
		a46 = S(";", y30);
		Term[] y31 = VA(a40, a46);
		a47 = S(":-", y31);
		Term[] y32 = VA(V(m), V(m), V(m), V(m));
		a48 = S("part", y32);
		Term[] y33 = VA(a48, Prolog.True);
		a49 = S(":-", y33);
		a50 = V(m);
		a51 = V(m);
		a52 = V(m);
		a53 = V(m);
		a54 = V(m);
		Term[] y34 = VA(a50, a51, a52, a53, a54);
		a55 = S("$cut_part/4_1", y34);
		a56 = V(m);
		a57 = V(m);
		a58 = CONS(a56, a57);
		Term[] y35 = VA(a50, a58);
		a59 = S("=", y35);
		Term[] y36 = VA(a57, a51, a52, a53, a54, a56);
		a60 = S("$fac_$cut_part/4_1/5_2", y36);
		Term[] y37 = VA(a60, Prolog.True);
		a61 = S(",", y37);
		Term[] y38 = VA(a59, a61);
		a62 = S(",", y38);
		Term[] y39 = VA(a50, Prolog.Nil);
		a63 = S("=", y39);
		Term[] y40 = VA(a52, Prolog.Nil);
		a64 = S("=", y40);
		Term[] y41 = VA(a53, Prolog.Nil);
		a65 = S("=", y41);
		Term[] y42 = VA(a65, Prolog.True);
		a66 = S(",", y42);
		Term[] y43 = VA(a64, a66);
		a67 = S(",", y43);
		Term[] y44 = VA(a63, a67);
		a68 = S(",", y44);
		Term[] y45 = VA(a68, ATOM_fail);
		a69 = S(";", y45);
		Term[] y46 = VA(a62, a69);
		a70 = S(";", y46);
		Term[] y47 = VA(a55, a70);
		a71 = S(":-", y47);
		Term[] y48 = VA(V(m), V(m), V(m), V(m), V(m));
		a72 = S("$cut_part/4_1", y48);
		Term[] y49 = VA(a72, Prolog.True);
		a73 = S(":-", y49);
		a74 = V(m);
		a75 = V(m);
		a76 = V(m);
		a77 = V(m);
		a78 = V(m);
		a79 = V(m);
		Term[] y50 = VA(a74, a75, a76, a77, a78, a79);
		a80 = S("$fac_$cut_part/4_1/5_2", y50);
		a81 = V(m);
		a82 = CONS(a79, a81);
		Term[] y51 = VA(a76, a82);
		a83 = S("=", y51);
		Term[] y52 = VA(a79, a75);
		a84 = S("=<", y52);
		Term[] y53 = VA(a78);
		a85 = S("$cut_shallow", y53);
		Term[] y54 = VA(a74, a75, a81, a77);
		a86 = S("part", y54);
		Term[] y55 = VA(a86, Prolog.True);
		a87 = S(",", y55);
		Term[] y56 = VA(a85, a87);
		a88 = S(",", y56);
		Term[] y57 = VA(a84, a88);
		a89 = S(",", y57);
		Term[] y58 = VA(a83, a89);
		a90 = S(",", y58);
		a91 = V(m);
		a92 = CONS(a79, a91);
		Term[] y59 = VA(a77, a92);
		a93 = S("=", y59);
		Term[] y60 = VA(a74, a75, a76, a91);
		a94 = S("part", y60);
		Term[] y61 = VA(a94, Prolog.True);
		a95 = S(",", y61);
		Term[] y62 = VA(a93, a95);
		a96 = S(",", y62);
		Term[] y63 = VA(a96, ATOM_fail);
		a97 = S(";", y63);
		Term[] y64 = VA(a90, a97);
		a98 = S(";", y64);
		Term[] y65 = VA(a80, a98);
		a99 = S(":-", y65);
		Term[] y66 = VA(V(m), V(m), V(m), V(m), V(m), V(m));
		a100 = S("$fac_$cut_part/4_1/5_2", y66);
		Term[] y67 = VA(a100, Prolog.True);
		a101 = S(":-", y67);
		Term[] y68 = VA(PRED_main_1_s40, a99, a101, Prolog.Nil, int_1);
		a102 = S("stree", y68);
		a103 = CONS(a102, Prolog.Nil);
		Term[] y69 = VA(PRED_main_1_s35, a71, a73, a103, int_1);
		a104 = S("stree", y69);
		a105 = CONS(a104, Prolog.Nil);
		Term[] y70 = VA(PRED_main_1_s29, a47, a49, a105, int_1);
		a106 = S("stree", y70);
		a107 = CONS(a106, Prolog.Nil);
		a108 = CONS(a35, a107);
		a109 = CONS(a6, a108);
		return //
		Op((Prolog e) -> PRED_analyze_strees_2_static_exec(e), VA(a109, a1), cont);
	}

	/** PREDICATE: analyze_strees/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_analyze_strees_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// analyze_strees(A,B):-init_strees(A,C,D),seal(D),analyze_closure(A,D,B)
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// analyze_strees(A,B):-[init_strees(A,C,D),seal(D),analyze_closure(A,D,B)]
		a3 = V(m);
		return //
		Op((Prolog e) -> PRED_init_strees_3_static_exec(e), VA(a1, V(m), a3), //
				Op((Prolog e) -> PRED_seal_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_analyze_closure_3_static_exec(e), VA(a1, a3, a2), cont)));
	}

	/** PREDICATE: analyze_closure/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final /**/ IntegerTerm PRED_analyze_closure_3_s1 = Integer(0);

	public static Operation PRED_analyze_closure_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// analyze_closure(A,B,C):-traverse_strees(A,B,D,0,E),analyze_closure(A,D,C,E)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// analyze_closure(A,B,C):-[traverse_strees(A,B,D,0,E),analyze_closure(A,D,C,E)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_traverse_strees_5_static_exec(e), VA(a1, a2, a4, PRED_analyze_closure_3_s1, a5), //
				Op((Prolog e) -> PRED_analyze_closure_4_static_exec(e), VA(a1, a4, a3, a5), cont));
	}

	/** PREDICATE: analyze_closure/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final /**/ IntegerTerm PRED_analyze_closure_4_s1 = Integer(0);

	public static Operation PRED_analyze_closure_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry4(null, FILE_simple_analyzer::analyze_closure_4_sub_1);
		return analyze_closure_4_1(m);
	}

	private final static Operation analyze_closure_4_sub_1(Prolog m) {
		m.trust(null);
		return analyze_closure_4_2(m);
	}

	private final static Operation analyze_closure_4_1(Prolog m) {
		// analyze_closure(A,B,B,C):-C=<0,!
		Term a2, a3, a4, a5, a6;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// analyze_closure(A,B,B,C):-['$get_level'(D),E is 0,'$less_or_equal'(C,E),'$cut'(D)]
		if (!a2.unify(a3, m.trail))
			return m.fail();
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		//START inline expansion of a(6)is si(1)
		if (!a6.unify(PRED_analyze_closure_4_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(4),a(6))
		if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation analyze_closure_4_2(Prolog m) {
		// analyze_closure(A,B,C,D):-D>0,!,analyze_closure(A,B,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// analyze_closure(A,B,C,D):-['$get_level'(E),F is 0,'$greater_than'(D,F),'$cut'(E),analyze_closure(A,B,C)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		//START inline expansion of a(6)is si(1)
		if (!a6.unify(PRED_analyze_closure_4_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(4),a(6))
		if (Arithmetic.evaluate(a4).arithCompareTo(Arithmetic.evaluate(a6)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_analyze_closure_3_static_exec(e), VA(a1, a2, a3), cont);
	}

	/** PREDICATE: init_strees/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_init_strees_3_s1 = SYM("[]");

	public static Operation PRED_init_strees_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::init_strees_3_var, fail_0, fail_0, FILE_simple_analyzer::init_strees_3_1, fail_0, FILE_simple_analyzer::init_strees_3_2);
	}

	private final static Operation init_strees_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::init_strees_3_var_1);
		return init_strees_3_1(m);
	}

	private final static Operation init_strees_3_var_1(Prolog m) {
		m.trust(null);
		return init_strees_3_2(m);
	}

	private final static Operation init_strees_3_1(Prolog m) {
		// init_strees([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_strees([],A,A):-[]
		if (!PRED_init_strees_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation init_strees_3_2(Prolog m) {
		// init_strees([A|B],C,D):-A=stree(E,(F:-G),H,I,J),bottom_call(E,K),table_command(get(E,K),C,L),init_disj(G,L,M),init_strees(I,M,N),init_strees(B,N,D),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_strees([A|B],C,D):-['$unify'(A,stree(E,(F:-G),H,I,J)),bottom_call(E,K),table_command(get(E,K),C,L),init_disj(G,L,M),init_strees(I,M,N),init_strees(B,N,D)]
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
		Term[] y1 = VA(V(m), a7);
		a8 = S(":-", y1);
		a9 = V(m);
		Term[] y2 = VA(a6, a8, V(m), a9, V(m));
		a10 = S("stree", y2);
		//START inline expansion of $unify(a(4),a(10))
		if (!a4.unify(a10, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a11 = V(m);
		Term[] y3 = VA(a6, a11);
		a12 = S("get", y3);
		a13 = V(m);
		a14 = V(m);
		a15 = V(m);
		return //
		Op((Prolog e) -> PRED_bottom_call_2_static_exec(e), VA(a6, a11), //
				Op((Prolog e) -> PRED_table_command_3_static_exec(e), VA(a12, a2, a13), //
						Op((Prolog e) -> PRED_init_disj_3_static_exec(e), VA(a7, a13, a14), //
								Op((Prolog e) -> PRED_init_strees_3_static_exec(e), VA(a9, a14, a15), //
										Op((Prolog e) -> PRED_init_strees_3_static_exec(e), VA(a5, a15, a3), cont)))));
	}

	/** PREDICATE: init_conj/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_init_conj_3_s1 = SYM("true");

	public static Operation PRED_init_conj_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::init_conj_3_var, fail_0, fail_0, FILE_simple_analyzer::init_conj_3_1, FILE_simple_analyzer::init_conj_3_2, fail_0);
	}

	private final static Operation init_conj_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::init_conj_3_var_1);
		return init_conj_3_1(m);
	}

	private final static Operation init_conj_3_var_1(Prolog m) {
		m.trust(null);
		return init_conj_3_2(m);
	}

	private final static Operation init_conj_3_1(Prolog m) {
		// init_conj(true,A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_conj(true,A,A):-[]
		if (!PRED_init_conj_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation init_conj_3_2(Prolog m) {
		// init_conj((A,B),C,D):-init_goal(A,C,E),init_conj(B,E,D),true
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_conj((A,B),C,D):-[init_goal(A,C,E),init_conj(B,E,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C(",", a4, a5), m.trail)) {
			return m.fail();
		}
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_init_goal_3_static_exec(e), VA(a4, a2, a6), //
				Op((Prolog e) -> PRED_init_conj_3_static_exec(e), VA(a5, a6, a3), cont));
	}

	/** PREDICATE: init_disj/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_init_disj_3_s1 = SYM("fail");

	public static Operation PRED_init_disj_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::init_disj_3_var, fail_0, fail_0, FILE_simple_analyzer::init_disj_3_1, FILE_simple_analyzer::init_disj_3_2, fail_0);
	}

	private final static Operation init_disj_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::init_disj_3_var_1);
		return init_disj_3_1(m);
	}

	private final static Operation init_disj_3_var_1(Prolog m) {
		m.trust(null);
		return init_disj_3_2(m);
	}

	private final static Operation init_disj_3_1(Prolog m) {
		// init_disj(fail,A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_disj(fail,A,A):-[]
		if (!PRED_init_disj_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation init_disj_3_2(Prolog m) {
		// init_disj((A;B),C,D):-init_conj(A,C,E),init_disj(B,E,D),true
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_disj((A;B),C,D):-[init_conj(A,C,E),init_disj(B,E,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C(";", a4, a5), m.trail)) {
			return m.fail();
		}
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_init_conj_3_static_exec(e), VA(a4, a2, a6), //
				Op((Prolog e) -> PRED_init_disj_3_static_exec(e), VA(a5, a6, a3), cont));
	}

	/** PREDICATE: init_goal/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_init_goal_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_simple_analyzer::init_goal_3_sub_1);
		return init_goal_3_1(m);
	}

	private final static Operation init_goal_3_sub_1(Prolog m) {
		m.trust(null);
		return init_goal_3_2(m);
	}

	private final static Operation init_goal_3_1(Prolog m) {
		// init_goal(A,B,C):-call_p(A),!,functor(A,D,E),bottom_call(D/E,F),table_command(get(D/E,F),B,C),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_goal(A,B,C):-['$get_level'(D),call_p(A),'$cut'(D),functor(A,E,F),bottom_call(E/F,G),table_command(get(E/F,G),B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		a6 = V(m);
		Term[] y1 = VA(a5, a6);
		a7 = S("/", y1);
		a8 = V(m);
		Term[] y2 = VA(a5, a6);
		a9 = S("/", y2);
		Term[] y3 = VA(a9, a8);
		a10 = S("get", y3);
		return //
		Op((Prolog e) -> PRED_call_p_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
						Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a5, a6), //
								Op((Prolog e) -> PRED_bottom_call_2_static_exec(e), VA(a7, a8), //
										Op((Prolog e) -> PRED_table_command_3_static_exec(e), VA(a10, a2, a3), cont)))));
	}

	private final static Operation init_goal_3_2(Prolog m) {
		// init_goal(A,B,B):-unify_p(A),!,true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// init_goal(A,B,B):-['$get_level'(C),unify_p(A),'$cut'(C)]
		if (!a2.unify(a3, m.trail))
			return m.fail();
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_unify_p_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), cont));
	}

	/** PREDICATE: traverse_strees/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_traverse_strees_5_s1 = SYM("[]");

	// private final Term arg5;

	public static Operation PRED_traverse_strees_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::traverse_strees_5_var, fail_0, fail_0, FILE_simple_analyzer::traverse_strees_5_1, fail_0, FILE_simple_analyzer::traverse_strees_5_2);
	}

	private final static Operation traverse_strees_5_var(Prolog m) {
		m.jtry5(null, FILE_simple_analyzer::traverse_strees_5_var_1);
		return traverse_strees_5_1(m);
	}

	private final static Operation traverse_strees_5_var_1(Prolog m) {
		m.trust(null);
		return traverse_strees_5_2(m);
	}

	private final static Operation traverse_strees_5_1(Prolog m) {
		// traverse_strees([],A,A,B,B):-true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// traverse_strees([],A,A,B,B):-[]
		if (!PRED_traverse_strees_5_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		if (!a4.unify(a5, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation traverse_strees_5_2(Prolog m) {
		// traverse_strees([A|B],C,D,E,F):-A=stree(G,(H:-I),J,K,L),traverse_disj(H,I,C,M,E,N),traverse_strees(K,M,O,N,P),traverse_strees(B,O,D,P,F),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// traverse_strees([A|B],C,D,E,F):-['$unify'(A,stree(G,(H:-I),J,K,L)),traverse_disj(H,I,C,M,E,N),traverse_strees(K,M,O,N,P),traverse_strees(B,O,D,P,F)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a6 = argz[0];
			a7 = argz[1];
		} else if (a1.isVar()) {
			a6 = V(m);
			a7 = V(m);
			a1.bind(CONS(a6, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = V(m);
		a9 = V(m);
		Term[] y1 = VA(a8, a9);
		a10 = S(":-", y1);
		a11 = V(m);
		Term[] y2 = VA(V(m), a10, V(m), a11, V(m));
		a12 = S("stree", y2);
		//START inline expansion of $unify(a(6),a(12))
		if (!a6.unify(a12, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a13 = V(m);
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		return //
		Op((Prolog e) -> PRED_traverse_disj_6_static_exec(e), VA(a8, a9, a2, a13, a4, a14), //
				Op((Prolog e) -> PRED_traverse_strees_5_static_exec(e), VA(a11, a13, a15, a14, a16), //
						Op((Prolog e) -> PRED_traverse_strees_5_static_exec(e), VA(a7, a15, a3, a16, a5), cont)));
	}

	/** PREDICATE: traverse_disj/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_traverse_disj_6_s1 = SYM("fail");

	// private final Term arg5, arg6;

	public static Operation PRED_traverse_disj_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry6(null, FILE_simple_analyzer::traverse_disj_6_sub_1);
		return traverse_disj_6_1(m);
	}

	private final static Operation traverse_disj_6_sub_1(Prolog m) {
		m.trust(null);
		return traverse_disj_6_2(m);
	}

	private final static Operation traverse_disj_6_1(Prolog m) {
		// traverse_disj(A,fail,B,B,C,C):-true
		Term a2, a3, a4, a5, a6;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// traverse_disj(A,fail,B,B,C,C):-[]
		if (!PRED_traverse_disj_6_s1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation traverse_disj_6_2(Prolog m) {
		// traverse_disj(A,(B;C),D,E,F,G):-traverse_conj(A,B,D,H,F,I),traverse_disj(A,C,H,E,I,G),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// traverse_disj(A,(B;C),D,E,F,G):-[traverse_conj(A,B,D,H,F,I),traverse_disj(A,C,H,E,I,G)]
		a2 = a2.dref();
		a7 = V(m);
		a8 = V(m);
		if (!a2.unify(C(";", a7, a8), m.trail)) {
			return m.fail();
		}
		a9 = V(m);
		a10 = V(m);
		return //
		Op((Prolog e) -> PRED_traverse_conj_6_static_exec(e), VA(a1, a7, a3, a9, a5, a10), //
				Op((Prolog e) -> PRED_traverse_disj_6_static_exec(e), VA(a1, a8, a9, a4, a10, a6), cont));
	}

	/** PREDICATE: traverse_conj/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	final static SymbolTerm ATOM_uninit = SYM("uninit");
	final static SymbolTerm ATOM_ground = SYM("ground");

	// private final Term arg5, arg6;

	public static Operation PRED_traverse_conj_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// traverse_conj(A,B,C,D,E,F):-varset(A,G),functor(A,H,I),table_command(get(H/I,J),C,K),get_entry_modes(uninit,A,J,L),get_entry_modes(ground,A,J,M),traverse_conj(B,K,D,E,F,M,N,L,O,G,P),true
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		a5 = LARG[4];
		a6 = LARG[5];
		// traverse_conj(A,B,C,D,E,F):-[varset(A,G),functor(A,H,I),table_command(get(H/I,J),C,K),get_entry_modes(uninit,A,J,L),get_entry_modes(ground,A,J,M),traverse_conj(B,K,D,E,F,M,N,L,O,G,P)]
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		Term[] y1 = VA(a8, a9);
		a10 = S("/", y1);
		a11 = V(m);
		Term[] y2 = VA(a10, a11);
		a12 = S("get", y2);
		a13 = V(m);
		a14 = V(m);
		a15 = V(m);
		return //
		Op((Prolog e) -> PRED_varset_2_static_exec(e), VA(a1, a7), //
				Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a8, a9), //
						Op((Prolog e) -> PRED_table_command_3_static_exec(e), VA(a12, a3, a13), //
								Op((Prolog e) -> PRED_get_entry_modes_4_static_exec(e), VA(ATOM_uninit, a1, a11, a14), //
										Op((Prolog e) -> PRED_get_entry_modes_4_static_exec(e), VA(ATOM_ground, a1, a11, a15), //
												Op((Prolog e) -> PRED_traverse_conj_11_static_exec(e), VA(a2, a13, a4, a5, a6, a15, V(m), a14, V(m), a7, V(m)), cont))))));
	}

	/** PREDICATE: traverse_conj/11
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_traverse_conj_11_s1 = SYM("true");

	// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11;

	public static Operation PRED_traverse_conj_11_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::traverse_conj_11_var, fail_0, fail_0, FILE_simple_analyzer::traverse_conj_11_1, FILE_simple_analyzer::traverse_conj_11_2, fail_0);
	}

	private final static Operation traverse_conj_11_var(Prolog m) {
		m.jtry(11, null, FILE_simple_analyzer::traverse_conj_11_var_1);
		return traverse_conj_11_1(m);
	}

	private final static Operation traverse_conj_11_var_1(Prolog m) {
		m.trust(null);
		return traverse_conj_11_2(m);
	}

	private final static Operation traverse_conj_11_1(Prolog m) {
		// traverse_conj(true,A,A,B,B,C,C,D,D,E,E):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
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
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		cont = m.cont;
		// traverse_conj(true,A,A,B,B,C,C,D,D,E,E):-[]
		if (!PRED_traverse_conj_11_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		if (!a4.unify(a5, m.trail))
			return m.fail();
		if (!a6.unify(a7, m.trail))
			return m.fail();
		if (!a8.unify(a9, m.trail))
			return m.fail();
		if (!a10.unify(a11, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation traverse_conj_11_2(Prolog m) {
		// traverse_conj((A,B),C,D,E,F,G,H,I,J,K,L):-varset(A,M),update_goal(A,M,C,N,E,O,G,P,I,Q,K,R),unionv(M,R,S),traverse_conj(B,N,D,O,F,P,H,Q,J,S,L),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
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
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		cont = m.cont;
		// traverse_conj((A,B),C,D,E,F,G,H,I,J,K,L):-[varset(A,M),update_goal(A,M,C,N,E,O,G,P,I,Q,K,R),unionv(M,R,S),traverse_conj(B,N,D,O,F,P,H,Q,J,S,L)]
		a1 = a1.dref();
		a12 = V(m);
		a13 = V(m);
		if (!a1.unify(C(",", a12, a13), m.trail)) {
			return m.fail();
		}
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		a17 = V(m);
		a18 = V(m);
		a19 = V(m);
		a20 = V(m);
		return //
		Op((Prolog e) -> PRED_varset_2_static_exec(e), VA(a12, a14), //
				Op((Prolog e) -> PRED_update_goal_12_static_exec(e), VA(a12, a14, a2, a15, a4, a16, a6, a17, a8, a18, a10, a19), //
						Op((Prolog e) -> PRED_unionv_3_static_exec(e), VA(a14, a19, a20), //
								Op((Prolog e) -> PRED_traverse_conj_11_static_exec(e), VA(a13, a15, a3, a16, a5, a17, a7, a18, a9, a20, a11), cont))));
	}

	/** PREDICATE: update_goal/12
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12;

	public static Operation PRED_update_goal_12_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry(12, null, FILE_simple_analyzer::update_goal_12_sub_1);
		return update_goal_12_1(m);
	}

	private final static Operation update_goal_12_sub_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::update_goal_12_sub_2);
		return update_goal_12_2(m);
	}

	private final static Operation update_goal_12_sub_2(Prolog m) {
		m.retry(null, FILE_simple_analyzer::update_goal_12_sub_3);
		return update_goal_12_3(m);
	}

	private final static Operation update_goal_12_sub_3(Prolog m) {
		m.retry(null, FILE_simple_analyzer::update_goal_12_sub_4);
		return update_goal_12_4(m);
	}

	private final static Operation update_goal_12_sub_4(Prolog m) {
		m.trust(null);
		return update_goal_12_5(m);
	}

	private final static Operation update_goal_12_1(Prolog m) {
		// update_goal(A,B,C,C,D,D,E,F,G,H,I,I):-split_unify(A,J,K),var(J),nonvar(K),varset(K,L),subsetv(L,E),!,set_command(add(J),E,F),set_command(sub(J),G,H),true
		Term a1, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a8 = m.AREGS[7];
		a9 = m.AREGS[8];
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		a12 = m.AREGS[11];
		cont = m.cont;
		// update_goal(A,B,C,C,D,D,E,F,G,H,I,I):-['$get_level'(J),split_unify(A,K,L),var(K),nonvar(L),varset(L,M),subsetv(M,E),'$cut'(J),set_command(add(K),E,F),set_command(sub(K),G,H)]
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		if (!a11.unify(a12, m.trail))
			return m.fail();
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		Term[] y1 = VA(a14);
		a17 = S("add", y1);
		Term[] y2 = VA(a14);
		a18 = S("sub", y2);
		return //
		Op((Prolog e) -> PRED_split_unify_3_static_exec(e), VA(a1, a14, a15), //
				Op((Prolog e) -> PRED_var_1_static_exec(e), VA(a14), //
						Op((Prolog e) -> PRED_nonvar_1_static_exec(e), VA(a15), //
								Op((Prolog e) -> PRED_varset_2_static_exec(e), VA(a15, a16), //
										Op((Prolog e) -> PRED_subsetv_2_static_exec(e), VA(a16, a7), //
												Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a13), //
														Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a17, a7, a8), //
																Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a18, a9, a10), cont))))))));
	}

	private final static Operation update_goal_12_2(Prolog m) {
		// update_goal(A,B,C,C,D,D,E,E,F,G,H,H):-split_unify(A,I,J),var(I),nonvar(J),inv(I,F),!,diffv(B,H,K),diffv(K,E,L),set_command(add_set(L),F,M),set_command(sub(I),M,N),intersectv(B,H,O),set_command(sub_set(O),N,G),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23;
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
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		a12 = m.AREGS[11];
		cont = m.cont;
		// update_goal(A,B,C,C,D,D,E,E,F,G,H,H):-['$get_level'(I),split_unify(A,J,K),var(J),nonvar(K),inv(J,F),'$cut'(I),diffv(B,H,L),diffv(L,E,M),set_command(add_set(M),F,N),set_command(sub(J),N,O),intersectv(B,H,P),set_command(sub_set(P),O,G)]
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		if (!a7.unify(a8, m.trail))
			return m.fail();
		if (!a11.unify(a12, m.trail))
			return m.fail();
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		a17 = V(m);
		Term[] y1 = VA(a17);
		a18 = S("add_set", y1);
		a19 = V(m);
		Term[] y2 = VA(a14);
		a20 = S("sub", y2);
		a21 = V(m);
		a22 = V(m);
		Term[] y3 = VA(a22);
		a23 = S("sub_set", y3);
		return //
		Op((Prolog e) -> PRED_split_unify_3_static_exec(e), VA(a1, a14, a15), //
				Op((Prolog e) -> PRED_var_1_static_exec(e), VA(a14), //
						Op((Prolog e) -> PRED_nonvar_1_static_exec(e), VA(a15), //
								Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a14, a9), //
										Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a13), //
												Op((Prolog e) -> PRED_diffv_3_static_exec(e), VA(a2, a11, a16), //
														Op((Prolog e) -> PRED_diffv_3_static_exec(e), VA(a16, a7, a17), //
																Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a18, a9, a19), //
																		Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a20, a19, a21), //
																				Op((Prolog e) -> PRED_intersectv_3_static_exec(e), VA(a2, a11, a22), //
																						Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a23, a21, a10), cont)))))))))));
	}

	private final static Operation update_goal_12_3(Prolog m) {
		// update_goal(A,B,C,C,D,D,E,F,G,H,I,I):-split_unify(A,J,K),var(J),inv(J,E),!,set_command(add_set(B),E,F),set_command(sub_set(B),G,H),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
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
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		a12 = m.AREGS[11];
		cont = m.cont;
		// update_goal(A,B,C,C,D,D,E,F,G,H,I,I):-['$get_level'(J),split_unify(A,K,L),var(K),inv(K,E),'$cut'(J),set_command(add_set(B),E,F),set_command(sub_set(B),G,H)]
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		if (!a11.unify(a12, m.trail))
			return m.fail();
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		Term[] y1 = VA(a2);
		a15 = S("add_set", y1);
		Term[] y2 = VA(a2);
		a16 = S("sub_set", y2);
		return //
		Op((Prolog e) -> PRED_split_unify_3_static_exec(e), VA(a1, a14, V(m)), //
				Op((Prolog e) -> PRED_var_1_static_exec(e), VA(a14), //
						Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a14, a7), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a13), //
										Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a15, a7, a8), //
												Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a16, a9, a10), cont))))));
	}

	private final static Operation update_goal_12_4(Prolog m) {
		// update_goal(A,B,C,C,D,D,E,E,F,G,H,H):-unify_p(A),!,set_command(sub_set(B),F,G),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
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
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		a12 = m.AREGS[11];
		cont = m.cont;
		// update_goal(A,B,C,C,D,D,E,E,F,G,H,H):-['$get_level'(I),unify_p(A),'$cut'(I),set_command(sub_set(B),F,G)]
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		if (!a7.unify(a8, m.trail))
			return m.fail();
		if (!a11.unify(a12, m.trail))
			return m.fail();
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a2);
		a14 = S("sub_set", y1);
		return //
		Op((Prolog e) -> PRED_unify_p_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a13), //
						Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a14, a9, a10), cont)));
	}

	private final static Operation update_goal_12_5(Prolog m) {
		// update_goal(A,B,C,D,E,F,G,G,H,I,J,J):-call_p(A),!,goal_dupset(A,K),var_args(A,L),functor(A,M,N),functor(O,M,N),create_new_call(1,N,G,L,K,H,J,A,O),update_table(M/N,O,C,D,E,F),set_command(sub_set(B),H,I),true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
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
		a10 = m.AREGS[9];
		a11 = m.AREGS[10];
		a12 = m.AREGS[11];
		cont = m.cont;
		// update_goal(A,B,C,D,E,F,G,G,H,I,J,J):-['$get_level'(K),call_p(A),'$cut'(K),goal_dupset(A,L),var_args(A,M),functor(A,N,O),functor(P,N,O),create_new_call(1,O,G,M,L,H,J,A,P),update_table(N/O,P,C,D,E,F),set_command(sub_set(B),H,I)]
		if (!a7.unify(a8, m.trail))
			return m.fail();
		if (!a11.unify(a12, m.trail))
			return m.fail();
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		a17 = V(m);
		a18 = V(m);
		Term[] y1 = VA(a16, a17);
		a19 = S("/", y1);
		Term[] y2 = VA(a2);
		a20 = S("sub_set", y2);
		return //
		Op((Prolog e) -> PRED_call_p_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a13), //
						Op((Prolog e) -> PRED_goal_dupset_2_static_exec(e), VA(a1, a14), //
								Op((Prolog e) -> PRED_var_args_2_static_exec(e), VA(a1, a15), //
										Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a16, a17), //
												Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a18, a16, a17), //
														Op((Prolog e) -> PRED_create_new_call_9_static_exec(e), VA(int_1, a17, a7, a15, a14, a9, a11, a1, a18), //
																Op((Prolog e) -> PRED_update_table_6_static_exec(e), VA(a19, a18, a3, a4, a5, a6), //
																		Op((Prolog e) -> PRED_set_command_3_static_exec(e), VA(a20, a9, a10), cont)))))))));
	}

	/** PREDICATE: update_table/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5, arg6;

	public static Operation PRED_update_table_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::update_table_6_var, fail_0, fail_0, fail_0, FILE_simple_analyzer::update_table_6_var, fail_0);
	}

	private final static Operation update_table_6_var(Prolog m) {
		m.jtry6(null, FILE_simple_analyzer::update_table_6_var_1);
		return update_table_6_1(m);
	}

	private final static Operation update_table_6_var_1(Prolog m) {
		m.trust(null);
		return update_table_6_2(m);
	}

	private final static Operation update_table_6_1(Prolog m) {
		// update_table(A/B,C,D,E,F,G):-table_command(get(A/B,H),D,I),lub_call(H,C,J),H\==J,!,table_command(set(A/B,J),I,E),G is F+1,true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// update_table(A/B,C,D,E,F,G):-['$get_level'(H),table_command(get(A/B,I),D,J),lub_call(I,C,K),'$inequality_of_term'(I,K),'$cut'(H),table_command(set(A/B,K),J,E),G is F+1]
		a1 = a1.dref();
		a7 = V(m);
		a8 = V(m);
		if (!a1.unify(C("/", a7, a8), m.trail)) {
			return m.fail();
		}
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a7, a8);
		a10 = S("/", y1);
		a11 = V(m);
		Term[] y2 = VA(a10, a11);
		a12 = S("get", y2);
		a13 = V(m);
		a14 = V(m);
		Term[] y3 = VA(a7, a8);
		a15 = S("/", y3);
		Term[] y4 = VA(a15, a14);
		a16 = S("set", y4);
		Term[] y5 = VA(a5, int_1);
		a17 = S("+", y5);
		return //
		Op((Prolog e) -> PRED_table_command_3_static_exec(e), VA(a12, a3, a13), //
				Op((Prolog e) -> PRED_lub_call_3_static_exec(e), VA(a11, a2, a14), //
						Op((Prolog e) -> PRED_$inequality_of_term_2_static_exec(e), VA(a11, a14), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a9), //
										Op((Prolog e) -> PRED_table_command_3_static_exec(e), VA(a16, a13, a4), //
												Op(FILE_builtins::PRED_is_2_static_exec, VA(a6, a17), cont))))));
	}

	private final static Operation update_table_6_2(Prolog m) {
		// update_table(A/B,C,D,D,E,E):-true
		Term a1, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// update_table(A/B,C,D,D,E,E):-[]
		a1 = a1.dref();
		if (!a1.unify(C("/", V(m), V(m)), m.trail)) {
			return m.fail();
		}
		if (!a3.unify(a4, m.trail))
			return m.fail();
		if (!a5.unify(a6, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: create_new_call/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5, arg6, arg7, arg8, arg9;

	public static Operation PRED_create_new_call_9_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry(9, null, FILE_simple_analyzer::create_new_call_9_sub_1);
		return create_new_call_9_1(m);
	}

	private final static Operation create_new_call_9_sub_1(Prolog m) {
		m.trust(null);
		return create_new_call_9_2(m);
	}

	private final static Operation create_new_call_9_1(Prolog m) {
		// create_new_call(A,B,C,D,E,F,G,H,I):-A>B,!
		Term a1, a2, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// create_new_call(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$greater_than'(A,B),'$cut'(J)]
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(10))
		a10 = a10.dref();
		m.cut(a10.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation create_new_call_9_2(Prolog m) {
		// create_new_call(A,B,C,D,E,F,G,H,I):-A=<B,!,arg(A,H,J),arg(A,I,K),ground_flag(J,C,L),membership_flag(J,D,M),membership_flag(J,E,N),membership_flag(J,F,O),membership_flag(J,G,P),create_argument(L,M,N,O,P,K),Q is A+1,create_new_call(Q,B,C,D,E,F,G,H,I)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19;
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
		// create_new_call(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$less_or_equal'(A,B),'$cut'(J),arg(A,H,K),arg(A,I,L),ground_flag(K,C,M),membership_flag(K,D,N),membership_flag(K,E,O),membership_flag(K,F,P),membership_flag(K,G,Q),create_argument(M,N,O,P,Q,L),R is A+1,create_new_call(R,B,C,D,E,F,G,H,I)]
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(10))
		a10 = a10.dref();
		m.cut(a10.intValue());
		//END inline expansion
		a11 = V(m);
		a12 = V(m);
		a13 = V(m);
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		a17 = V(m);
		a18 = V(m);
		Term[] y1 = VA(a1, int_1);
		a19 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a8, a11), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a9, a12), //
						Op((Prolog e) -> PRED_ground_flag_3_static_exec(e), VA(a11, a3, a13), //
								Op((Prolog e) -> PRED_membership_flag_3_static_exec(e), VA(a11, a4, a14), //
										Op((Prolog e) -> PRED_membership_flag_3_static_exec(e), VA(a11, a5, a15), //
												Op((Prolog e) -> PRED_membership_flag_3_static_exec(e), VA(a11, a6, a16), //
														Op((Prolog e) -> PRED_membership_flag_3_static_exec(e), VA(a11, a7, a17), //
																Op((Prolog e) -> PRED_create_argument_6_static_exec(e), VA(a13, a14, a15, a16, a17, a12), //
																		Op(FILE_builtins::PRED_is_2_static_exec, VA(a18, a19), //
																				Op((Prolog e) -> PRED_create_new_call_9_static_exec(e), VA(a18, a2, a3, a4, a5, a6, a7, a8, a9), cont))))))))));
	}

	/** PREDICATE: lub/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_lub_3_s1 = SYM("unknown");
	final static SymbolTerm ATOM_any = SYM("any");

	public static Operation PRED_lub_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::lub_3_var, FILE_simple_analyzer::lub_3_int, FILE_simple_analyzer::lub_3_int, FILE_simple_analyzer::lub_3_var, FILE_simple_analyzer::lub_3_int,
				FILE_simple_analyzer::lub_3_int);
	}

	private final static Operation lub_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::lub_3_var_1);
		return lub_3_1(m);
	}

	private final static Operation lub_3_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lub_3_var_2);
		return lub_3_2(m);
	}

	private final static Operation lub_3_var_2(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lub_3_var_3);
		return lub_3_3(m);
	}

	private final static Operation lub_3_var_3(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lub_3_var_4);
		return lub_3_4(m);
	}

	private final static Operation lub_3_var_4(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lub_3_var_5);
		return lub_3_5(m);
	}

	private final static Operation lub_3_var_5(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lub_3_var_6);
		return lub_3_6(m);
	}

	private final static Operation lub_3_var_6(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lub_3_var_7);
		return lub_3_7(m);
	}

	private final static Operation lub_3_var_7(Prolog m) {
		m.trust(null);
		return lub_3_8(m);
	}

	private final static Operation lub_3_int(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::lub_3_int_1);
		return lub_3_2(m);
	}

	private final static Operation lub_3_int_1(Prolog m) {
		m.trust(null);
		return lub_3_4(m);
	}

	private final static Operation lub_3_1(Prolog m) {
		// lub(unknown,A,A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(unknown,A,A):-['$neck_cut']
		if (!PRED_lub_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_2(Prolog m) {
		// lub(A,unknown,A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(A,unknown,A):-['$neck_cut']
		if (!PRED_lub_3_s1.unify(a2, m.trail))
			return m.fail();
		if (!a1.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_3(Prolog m) {
		// lub(any,A,any):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(any,A,any):-['$neck_cut']
		if (!ATOM_any.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_4(Prolog m) {
		// lub(A,any,any):-!
		Term a2, a3;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(A,any,any):-['$neck_cut']
		if (!ATOM_any.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_5(Prolog m) {
		// lub(uninit,uninit,uninit):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(uninit,uninit,uninit):-['$neck_cut']
		if (!ATOM_uninit.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_uninit.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_uninit.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_6(Prolog m) {
		// lub(ground,ground,ground):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(ground,ground,ground):-['$neck_cut']
		if (!ATOM_ground.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_ground.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_ground.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_7(Prolog m) {
		// lub(uninit,ground,any):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(uninit,ground,any):-['$neck_cut']
		if (!ATOM_uninit.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_ground.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lub_3_8(Prolog m) {
		// lub(ground,uninit,any):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// lub(ground,uninit,any):-['$neck_cut']
		if (!ATOM_ground.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_uninit.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	/** PREDICATE: bottom/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_bottom_1_s1 = SYM("unknown");

	public static Operation PRED_bottom_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// bottom(unknown):-true
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// bottom(unknown):-[]
		if (!PRED_bottom_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: create_argument/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_create_argument_6_s1 = SYM("yes");
	final static SymbolTerm ATOM_no = SYM("no");

	// private final Term arg5, arg6;

	public static Operation PRED_create_argument_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::create_argument_6_var, fail_0, fail_0, FILE_simple_analyzer::create_argument_6_var, fail_0, fail_0);
	}

	private final static Operation create_argument_6_var(Prolog m) {
		m.jtry6(null, FILE_simple_analyzer::create_argument_6_var_1);
		return create_argument_6_1(m);
	}

	private final static Operation create_argument_6_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::create_argument_6_var_2);
		return create_argument_6_2(m);
	}

	private final static Operation create_argument_6_var_2(Prolog m) {
		m.retry(null, FILE_simple_analyzer::create_argument_6_var_3);
		return create_argument_6_3(m);
	}

	private final static Operation create_argument_6_var_3(Prolog m) {
		m.retry(null, FILE_simple_analyzer::create_argument_6_var_4);
		return create_argument_6_4(m);
	}

	private final static Operation create_argument_6_var_4(Prolog m) {
		m.retry(null, FILE_simple_analyzer::create_argument_6_var_5);
		return create_argument_6_5(m);
	}

	private final static Operation create_argument_6_var_5(Prolog m) {
		m.trust(null);
		return create_argument_6_6(m);
	}

	private final static Operation create_argument_6_1(Prolog m) {
		// create_argument(yes,A,B,C,D,ground):-!
		Term a1, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a6 = m.AREGS[5];
		cont = m.cont;
		// create_argument(yes,A,B,C,D,ground):-['$neck_cut']
		if (!PRED_create_argument_6_s1.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_ground.unify(a6, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation create_argument_6_2(Prolog m) {
		// create_argument(no,yes,no,yes,A,uninit):-!
		Term a1, a2, a3, a4, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a6 = m.AREGS[5];
		cont = m.cont;
		// create_argument(no,yes,no,yes,A,uninit):-['$neck_cut']
		if (!ATOM_no.unify(a1, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_no.unify(a3, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a4, m.trail))
			return m.fail();
		if (!ATOM_uninit.unify(a6, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation create_argument_6_3(Prolog m) {
		// create_argument(no,yes,no,A,no,uninit):-!
		Term a1, a2, a3, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// create_argument(no,yes,no,A,no,uninit):-['$neck_cut']
		if (!ATOM_no.unify(a1, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_no.unify(a3, m.trail))
			return m.fail();
		if (!ATOM_no.unify(a5, m.trail))
			return m.fail();
		if (!ATOM_uninit.unify(a6, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation create_argument_6_4(Prolog m) {
		// create_argument(no,yes,A,no,yes,any):-!
		Term a1, a2, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// create_argument(no,yes,A,no,yes,any):-['$neck_cut']
		if (!ATOM_no.unify(a1, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_no.unify(a4, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a5, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a6, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation create_argument_6_5(Prolog m) {
		// create_argument(no,yes,yes,A,B,any):-!
		Term a1, a2, a3, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		cont = m.cont;
		// create_argument(no,yes,yes,A,B,any):-['$neck_cut']
		if (!ATOM_no.unify(a1, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a2, m.trail))
			return m.fail();
		if (!PRED_create_argument_6_s1.unify(a3, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a6, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation create_argument_6_6(Prolog m) {
		// create_argument(no,no,A,B,C,any):-!
		Term a1, a2, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a6 = m.AREGS[5];
		cont = m.cont;
		// create_argument(no,no,A,B,C,any):-['$neck_cut']
		if (!ATOM_no.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_no.unify(a2, m.trail))
			return m.fail();
		if (!ATOM_any.unify(a6, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	/** PREDICATE: lub_call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final /**/ IntegerTerm PRED_lub_call_3_s1 = Integer(1);

	public static Operation PRED_lub_call_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// lub_call(A,B,C):-functor(A,D,E),functor(B,D,E),functor(C,D,E),lub_call(1,E,A,B,C)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// lub_call(A,B,C):-[functor(A,D,E),functor(B,D,E),functor(C,D,E),lub_call(1,E,A,B,C)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a4, a5), //
				Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a2, a4, a5), //
						Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a3, a4, a5), //
								Op((Prolog e) -> PRED_lub_call_5_static_exec(e), VA(PRED_lub_call_3_s1, a5, a1, a2, a3), cont))));
	}

	/** PREDICATE: lub_call/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5;

	public static Operation PRED_lub_call_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_simple_analyzer::lub_call_5_sub_1);
		return lub_call_5_1(m);
	}

	private final static Operation lub_call_5_sub_1(Prolog m) {
		m.trust(null);
		return lub_call_5_2(m);
	}

	private final static Operation lub_call_5_1(Prolog m) {
		// lub_call(A,B,C,D,E):-A>B,!
		Term a1, a2, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// lub_call(A,B,C,D,E):-['$get_level'(F),'$greater_than'(A,B),'$cut'(F)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation lub_call_5_2(Prolog m) {
		// lub_call(A,B,C,D,E):-A=<B,!,arg(A,C,F),arg(A,D,G),arg(A,E,H),lub(F,G,H),I is A+1,lub_call(I,B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// lub_call(A,B,C,D,E):-['$get_level'(F),'$less_or_equal'(A,B),'$cut'(F),arg(A,C,G),arg(A,D,H),arg(A,E,I),lub(G,H,I),J is A+1,lub_call(J,B,C,D,E)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
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
		a10 = V(m);
		Term[] y1 = VA(a1, int_1);
		a11 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a3, a7), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a4, a8), //
						Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a5, a9), //
								Op((Prolog e) -> PRED_lub_3_static_exec(e), VA(a7, a8, a9), //
										Op(FILE_builtins::PRED_is_2_static_exec, VA(a10, a11), //
												Op((Prolog e) -> PRED_lub_call_5_static_exec(e), VA(a10, a2, a3, a4, a5), cont))))));
	}

	/** PREDICATE: bottom_call/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_bottom_call_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// bottom_call(A/B,C):-functor(C,A,B),bottom_call(1,B,C)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// bottom_call(A/B,C):-[functor(C,A,B),bottom_call(1,B,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("/", a3, a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a2, a3, a4), //
				Op((Prolog e) -> PRED_bottom_call_3_static_exec(e), VA(int_1, a4, a2), cont));
	}

	/** PREDICATE: bottom_call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_bottom_call_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_simple_analyzer::bottom_call_3_sub_1);
		return bottom_call_3_1(m);
	}

	private final static Operation bottom_call_3_sub_1(Prolog m) {
		m.trust(null);
		return bottom_call_3_2(m);
	}

	private final static Operation bottom_call_3_1(Prolog m) {
		// bottom_call(A,B,C):-A>B,!
		Term a1, a2, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// bottom_call(A,B,C):-['$get_level'(D),'$greater_than'(A,B),'$cut'(D)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation bottom_call_3_2(Prolog m) {
		// bottom_call(A,B,C):-A=<B,!,bottom(D),arg(A,C,D),E is A+1,bottom_call(E,B,C)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// bottom_call(A,B,C):-['$get_level'(D),'$less_or_equal'(A,B),'$cut'(D),bottom(E),arg(A,C,E),F is A+1,bottom_call(F,B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		a5 = V(m);
		a6 = V(m);
		Term[] y1 = VA(a1, int_1);
		a7 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_bottom_1_static_exec(e), VA(a5), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a3, a5), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a6, a7), //
								Op((Prolog e) -> PRED_bottom_call_3_static_exec(e), VA(a6, a2, a3), cont))));
	}

	/** PREDICATE: lattice_modes_call/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_lattice_modes_call_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// lattice_modes_call(A/B,C,(D:-E)):-functor(D,A,B),get(C,A/B,F),lattice_modes_call(1,B,F,D,E,true)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// lattice_modes_call(A/B,C,(D:-E)):-[functor(D,A,B),get(C,A/B,F),lattice_modes_call(1,B,F,D,E,true)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("/", a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a6 = V(m);
		a7 = V(m);
		if (!a3.unify(C(":-", a6, a7), m.trail)) {
			return m.fail();
		}
		Term[] y1 = VA(a4, a5);
		a8 = S("/", y1);
		a9 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a6, a4, a5), //
				Op((Prolog e) -> PRED_get_3_static_exec(e), VA(a2, a8, a9), //
						Op((Prolog e) -> PRED_lattice_modes_call_6_static_exec(e), VA(int_1, a5, a9, a6, a7, Prolog.True), cont)));
	}

	/** PREDICATE: lattice_modes_call/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5, arg6;

	public static Operation PRED_lattice_modes_call_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry6(null, FILE_simple_analyzer::lattice_modes_call_6_sub_1);
		return lattice_modes_call_6_1(m);
	}

	private final static Operation lattice_modes_call_6_sub_1(Prolog m) {
		m.trust(null);
		return lattice_modes_call_6_2(m);
	}

	private final static Operation lattice_modes_call_6_1(Prolog m) {
		// lattice_modes_call(A,B,C,D,E,E):-A>B,!
		Term a1, a2, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// lattice_modes_call(A,B,C,D,E,E):-['$get_level'(F),'$greater_than'(A,B),'$cut'(F)]
		if (!a5.unify(a6, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation lattice_modes_call_6_2(Prolog m) {
		// lattice_modes_call(A,B,C,D,E,F):-A=<B,!,arg(A,C,G),arg(A,D,H),lattice_modes_arg(G,H,E,I),J is A+1,lattice_modes_call(J,B,C,D,I,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// lattice_modes_call(A,B,C,D,E,F):-['$get_level'(G),'$less_or_equal'(A,B),'$cut'(G),arg(A,C,H),arg(A,D,I),lattice_modes_arg(H,I,E,J),K is A+1,lattice_modes_call(K,B,C,D,J,F)]
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		a8 = V(m);
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		Term[] y1 = VA(a1, int_1);
		a12 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a3, a8), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a4, a9), //
						Op((Prolog e) -> PRED_lattice_modes_arg_4_static_exec(e), VA(a8, a9, a5, a10), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a11, a12), //
										Op((Prolog e) -> PRED_lattice_modes_call_6_static_exec(e), VA(a11, a2, a3, a4, a10, a6), cont)))));
	}

	/** PREDICATE: lattice_modes_arg/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_lattice_modes_arg_4_s1 = SYM("uninit");

	public static Operation PRED_lattice_modes_arg_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::lattice_modes_arg_4_var, FILE_simple_analyzer::lattice_modes_arg_4_3, FILE_simple_analyzer::lattice_modes_arg_4_3, FILE_simple_analyzer::lattice_modes_arg_4_var,
				FILE_simple_analyzer::lattice_modes_arg_4_3, FILE_simple_analyzer::lattice_modes_arg_4_3);
	}

	private final static Operation lattice_modes_arg_4_var(Prolog m) {
		m.jtry4(null, FILE_simple_analyzer::lattice_modes_arg_4_var_1);
		return lattice_modes_arg_4_1(m);
	}

	private final static Operation lattice_modes_arg_4_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::lattice_modes_arg_4_var_2);
		return lattice_modes_arg_4_2(m);
	}

	private final static Operation lattice_modes_arg_4_var_2(Prolog m) {
		m.trust(null);
		return lattice_modes_arg_4_3(m);
	}

	private final static Operation lattice_modes_arg_4_1(Prolog m) {
		// lattice_modes_arg(uninit,A,(uninit(A),B),B):-!
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// lattice_modes_arg(uninit,A,(uninit(A),B),B):-['$neck_cut']
		if (!PRED_lattice_modes_arg_4_s1.unify(a1, m.trail))
			return m.fail();
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C(",", a5, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (!a5.unify(C("uninit", a2), m.trail)) {
			return m.fail();
		}
		if (!a6.unify(a4, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lattice_modes_arg_4_2(Prolog m) {
		// lattice_modes_arg(ground,A,(ground(A),B),B):-!
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// lattice_modes_arg(ground,A,(ground(A),B),B):-['$neck_cut']
		if (!ATOM_ground.unify(a1, m.trail))
			return m.fail();
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C(",", a5, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (!a5.unify(C("ground", a2), m.trail)) {
			return m.fail();
		}
		if (!a6.unify(a4, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation lattice_modes_arg_4_3(Prolog m) {
		// lattice_modes_arg(A,B,C,C):-true
		Term a3, a4;
		Operation cont;
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// lattice_modes_arg(A,B,C,C):-[]
		if (!a3.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: get/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_get_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get(node(A,B,C,D),E,F):-get(A,B,C,D,E,F)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// get(node(A,B,C,D),E,F):-[get(A,B,C,D,E,F)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		if (!a1.unify(C("node", a4, a5, a6, a7), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_get_6_static_exec(e), VA(a4, a5, a6, a7, a2, a3), cont);
	}

	/** PREDICATE: get/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5, arg6;

	public static Operation PRED_get_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry6(null, FILE_simple_analyzer::get_6_sub_1);
		return get_6_1(m);
	}

	private final static Operation get_6_sub_1(Prolog m) {
		m.trust(null);
		return get_6_2(m);
	}

	private final static Operation get_6_1(Prolog m) {
		// get(A,B,C,D,E,B):-E=A,!
		Term a1, a2, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// get(A,B,C,D,E,B):-['$get_level'(F),'$unify'(E,A),'$cut'(F)]
		if (!a2.unify(a6, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(5),a(1))
		if (!a5.unify(a1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation get_6_2(Prolog m) {
		// get(A,B,C,D,E,F):-compare(G,E,A),get(G,E,F,C,D)
		Term a1, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// get(A,B,C,D,E,F):-[compare(G,E,A),get(G,E,F,C,D)]
		a7 = V(m);
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a7, a5, a1), //
				Op((Prolog e) -> PRED_get_5_static_exec(e), VA(a7, a5, a6, a3, a4), cont));
	}

	/** PREDICATE: get/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_get_5_s1 = SYM("<");
	final static SymbolTerm ATOM_greaterthan = SYM(">");

	// private final Term arg5;

	public static Operation PRED_get_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::get_5_var, fail_0, fail_0, FILE_simple_analyzer::get_5_var, fail_0, fail_0);
	}

	private final static Operation get_5_var(Prolog m) {
		m.jtry5(null, FILE_simple_analyzer::get_5_var_1);
		return get_5_1(m);
	}

	private final static Operation get_5_var_1(Prolog m) {
		m.trust(null);
		return get_5_2(m);
	}

	private final static Operation get_5_1(Prolog m) {
		// get(<,A,B,C,D):-get(C,A,B)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// get(<,A,B,C,D):-[get(C,A,B)]
		if (!PRED_get_5_s1.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_get_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	private final static Operation get_5_2(Prolog m) {
		// get(>,A,B,C,D):-get(D,A,B)
		Term a1, a2, a3, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		cont = m.cont;
		// get(>,A,B,C,D):-[get(D,A,B)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_get_3_static_exec(e), VA(a5, a2, a3), cont);
	}

	/** PREDICATE: set/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_set_4_s1 = SYM("leaf");

	public static Operation PRED_set_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::set_4_var, fail_0, fail_0, FILE_simple_analyzer::set_4_1, FILE_simple_analyzer::set_4_2, fail_0);
	}

	private final static Operation set_4_var(Prolog m) {
		m.jtry4(null, FILE_simple_analyzer::set_4_var_1);
		return set_4_1(m);
	}

	private final static Operation set_4_var_1(Prolog m) {
		m.trust(null);
		return set_4_2(m);
	}

	private final static Operation set_4_1(Prolog m) {
		// set(leaf,A,B,node(A,B,leaf,leaf)):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// set(leaf,A,B,node(A,B,leaf,leaf)):-[]
		if (!PRED_set_4_s1.unify(a1, m.trail))
			return m.fail();
		a4 = a4.dref();
		if (!a4.unify(C("node", a2, a3, PRED_set_4_s1, PRED_set_4_s1), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation set_4_2(Prolog m) {
		// set(node(A,B,C,D),E,F,node(A,G,H,I)):-compare(J,E,A),set_2(J,E,F,B,C,D,G,H,I)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// set(node(A,B,C,D),E,F,node(A,G,H,I)):-[compare(J,E,A),set_2(J,E,F,B,C,D,G,H,I)]
		a1 = a1.dref();
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		if (!a1.unify(C("node", a5, a6, a7, a8), m.trail)) {
			return m.fail();
		}
		a4 = a4.dref();
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		if (!a4.unify(C("node", a5, a9, a10, a11), m.trail)) {
			return m.fail();
		}
		a12 = V(m);
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a12, a2, a5), //
				Op((Prolog e) -> PRED_set_2_9_static_exec(e), VA(a12, a2, a3, a6, a7, a8, a9, a10, a11), cont));
	}

	/** PREDICATE: set_2/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_set_2_9_s1 = SYM("<");
	final static SymbolTerm ATOM_unify = SYM("=");

	// private final Term arg5, arg6, arg7, arg8, arg9;

	public static Operation PRED_set_2_9_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::set_2_9_var, fail_0, fail_0, FILE_simple_analyzer::set_2_9_var, fail_0, fail_0);
	}

	private final static Operation set_2_9_var(Prolog m) {
		m.jtry(9, null, FILE_simple_analyzer::set_2_9_var_1);
		return set_2_9_1(m);
	}

	private final static Operation set_2_9_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::set_2_9_var_2);
		return set_2_9_2(m);
	}

	private final static Operation set_2_9_var_2(Prolog m) {
		m.trust(null);
		return set_2_9_3(m);
	}

	private final static Operation set_2_9_1(Prolog m) {
		// set_2(<,A,B,C,D,E,C,F,E):-set(D,A,B,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
		// set_2(<,A,B,C,D,E,C,F,E):-[set(D,A,B,F)]
		if (!PRED_set_2_9_s1.unify(a1, m.trail))
			return m.fail();
		if (!a4.unify(a7, m.trail))
			return m.fail();
		if (!a6.unify(a9, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_set_4_static_exec(e), VA(a5, a2, a3, a8), cont);
	}

	private final static Operation set_2_9_2(Prolog m) {
		// set_2(=,A,B,C,D,E,B,D,E):-true
		Term a1, a3, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a8 = m.AREGS[7];
		a9 = m.AREGS[8];
		cont = m.cont;
		// set_2(=,A,B,C,D,E,B,D,E):-[]
		if (!ATOM_unify.unify(a1, m.trail))
			return m.fail();
		if (!a3.unify(a7, m.trail))
			return m.fail();
		if (!a5.unify(a8, m.trail))
			return m.fail();
		if (!a6.unify(a9, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation set_2_9_3(Prolog m) {
		// set_2(>,A,B,C,D,E,C,D,F):-set(E,A,B,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
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
		// set_2(>,A,B,C,D,E,C,D,F):-[set(E,A,B,F)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		if (!a4.unify(a7, m.trail))
			return m.fail();
		if (!a5.unify(a8, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_set_4_static_exec(e), VA(a6, a2, a3, a9), cont);
	}

	/** PREDICATE: seal/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_seal_1_s1 = SYM("leaf");

	public static Operation PRED_seal_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return seal_1_top(m);
	}

	private final static Operation seal_1_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::seal_1_var, fail_0, fail_0, FILE_simple_analyzer::seal_1_1, FILE_simple_analyzer::seal_1_2, fail_0);
	}

	private final static Operation seal_1_var(Prolog m) {
		m.jtry1(null, FILE_simple_analyzer::seal_1_var_1);
		return seal_1_1(m);
	}

	private final static Operation seal_1_var_1(Prolog m) {
		m.trust(null);
		return seal_1_2(m);
	}

	private final static Operation seal_1_1(Prolog m) {
		// seal(leaf):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// seal(leaf):-[]
		if (!PRED_seal_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation seal_1_2(Prolog m) {
		// seal(node(A,B,C,D)):-seal(C),seal(D)
		Term a1, a2, a3;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// seal(node(A,B,C,D)):-[seal(C),seal(D)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C("node", V(m), V(m), a2, a3), m.trail)) {
			return m.fail();
		}
		p1 = //
				Op((Prolog e) -> PRED_seal_1_static_exec(e), VA(a3), cont);
		m.AREGS[0] = a2;
		m.cont = p1;
		return seal_1_top(m);
	}

	/** PREDICATE: membership_flag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_membership_flag_3_s1 = SYM("yes");

	public static Operation PRED_membership_flag_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_simple_analyzer::membership_flag_3_sub_1);
		return membership_flag_3_1(m);
	}

	private final static Operation membership_flag_3_sub_1(Prolog m) {
		m.trust(null);
		return membership_flag_3_2(m);
	}

	private final static Operation membership_flag_3_1(Prolog m) {
		// membership_flag(A,B,yes):-inv(A,B),!
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// membership_flag(A,B,yes):-['$get_level'(C),inv(A,B),'$cut'(C)]
		if (!PRED_membership_flag_3_s1.unify(a3, m.trail))
			return m.fail();
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a1, a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), cont));
	}

	private final static Operation membership_flag_3_2(Prolog m) {
		// membership_flag(A,B,no):-true
		Term a3;
		Operation cont;
		a3 = m.AREGS[2];
		cont = m.cont;
		// membership_flag(A,B,no):-[]
		if (!ATOM_no.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: ground_flag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_ground_flag_3_s1 = SYM("yes");

	public static Operation PRED_ground_flag_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_simple_analyzer::ground_flag_3_sub_1);
		return ground_flag_3_1(m);
	}

	private final static Operation ground_flag_3_sub_1(Prolog m) {
		m.trust(null);
		return ground_flag_3_2(m);
	}

	private final static Operation ground_flag_3_1(Prolog m) {
		// ground_flag(A,B,yes):-varset(A,C),subsetv(C,B),!
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// ground_flag(A,B,yes):-['$get_level'(C),varset(A,D),subsetv(D,B),'$cut'(C)]
		if (!PRED_ground_flag_3_s1.unify(a3, m.trail))
			return m.fail();
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_varset_2_static_exec(e), VA(a1, a5), //
				Op((Prolog e) -> PRED_subsetv_2_static_exec(e), VA(a5, a2), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), cont)));
	}

	private final static Operation ground_flag_3_2(Prolog m) {
		// ground_flag(A,B,no):-true
		Term a3;
		Operation cont;
		a3 = m.AREGS[2];
		cont = m.cont;
		// ground_flag(A,B,no):-[]
		if (!ATOM_no.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: get_entry_modes/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final /**/ IntegerTerm PRED_get_entry_modes_4_s1 = Integer(1);

	public static Operation PRED_get_entry_modes_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get_entry_modes(A,B,C,D):-functor(B,E,F),get_entry_modes(A,1,F,B,C,G),sort(G,D)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// get_entry_modes(A,B,C,D):-[functor(B,E,F),get_entry_modes(A,1,F,B,C,G),sort(G,D)]
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a2, V(m), a5), //
				Op((Prolog e) -> PRED_get_entry_modes_6_static_exec(e), VA(a1, PRED_get_entry_modes_4_s1, a5, a2, a3, a6), //
						Op((Prolog e) -> PRED_sort_2_static_exec(e), VA(a6, a4), cont)));
	}

	/** PREDICATE: get_entry_modes/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_get_entry_modes_6_s1 = SYM("[]");

	// private final Term arg5, arg6;

	public static Operation PRED_get_entry_modes_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return get_entry_modes_6_top(m);
	}

	private final static Operation get_entry_modes_6_top(Prolog m) {
		m.setB0();
		m.jtry6(null, FILE_simple_analyzer::get_entry_modes_6_sub_1);
		return get_entry_modes_6_1(m);
	}

	private final static Operation get_entry_modes_6_sub_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::get_entry_modes_6_sub_2);
		return get_entry_modes_6_2(m);
	}

	private final static Operation get_entry_modes_6_sub_2(Prolog m) {
		m.trust(null);
		return get_entry_modes_6_3(m);
	}

	private final static Operation get_entry_modes_6_1(Prolog m) {
		// get_entry_modes(A,B,C,D,E,[]):-B>C,!
		Term a2, a3, a6, a7;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		cont = m.cont;
		// get_entry_modes(A,B,C,D,E,[]):-['$get_level'(F),'$greater_than'(B,C),'$cut'(F)]
		if (!PRED_get_entry_modes_6_s1.unify(a6, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation get_entry_modes_6_2(Prolog m) {
		// get_entry_modes(A,B,C,D,E,[F|G]):-B=<C,arg(B,E,A),!,arg(B,D,F),H is B+1,get_entry_modes(A,H,C,D,E,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// get_entry_modes(A,B,C,D,E,[F|G]):-['$get_level'(H),'$less_or_equal'(B,C),arg(B,E,A),'$cut'(H),arg(B,D,F),I is B+1,get_entry_modes(A,I,C,D,E,G)]
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
		//START inline expansion of $get_level(a(9))
		if (!a9.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
			return m.fail();
		}
		//END inline expansion
		a10 = V(m);
		Term[] y1 = VA(a2, int_1);
		a11 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a2, a5, a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a9), //
						Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a2, a4, a7), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a10, a11), //
										Op((Prolog e) -> PRED_get_entry_modes_6_static_exec(e), VA(a1, a10, a3, a4, a5, a8), cont)))));
	}

	private final static Operation get_entry_modes_6_3(Prolog m) {
		// get_entry_modes(A,B,C,D,E,F):-B=<C,!,G is B+1,get_entry_modes(A,G,C,D,E,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// get_entry_modes(A,B,C,D,E,F):-['$get_level'(G),'$less_or_equal'(B,C),'$cut'(G),H is B+1,get_entry_modes(A,H,C,D,E,F)]
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7.dref();
		m.cut(a7.intValue());
		//END inline expansion
		a8 = V(m);
		Term[] y1 = VA(a2, int_1);
		a9 = S("+", y1);
		//START inline expansion of a(8)is a(9)
		if (!a8.unify(Arithmetic.evaluate(a9), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a1;
		m.AREGS[1] = a8;
		m.AREGS[2] = a3;
		m.AREGS[3] = a4;
		m.AREGS[4] = a5;
		m.AREGS[5] = a6;
		m.cont = cont;
		return get_entry_modes_6_top(m);
	}

	/** PREDICATE: var_args/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_var_args_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// var_args(A,B):-functor(A,C,D),filter_vars(D,A,E),sort(E,B)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// var_args(A,B):-[functor(A,C,D),filter_vars(D,A,E),sort(E,B)]
		a3 = V(m);
		a4 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, V(m), a3), //
				Op((Prolog e) -> PRED_filter_vars_3_static_exec(e), VA(a3, a1, a4), //
						Op((Prolog e) -> PRED_sort_2_static_exec(e), VA(a4, a2), cont)));
	}

	/** PREDICATE: filter_vars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_filter_vars_3_s1 = SYM("[]");

	public static Operation PRED_filter_vars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// filter_vars(A,B,C):-filter_vars(A,B,C,[])
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// filter_vars(A,B,C):-[filter_vars(A,B,C,[])]
		return //
		Op((Prolog e) -> PRED_filter_vars_4_static_exec(e), VA(a1, a2, a3, PRED_filter_vars_3_s1), cont);
	}

	/** PREDICATE: filter_vars/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final /**/ IntegerTerm PRED_filter_vars_4_s1 = Integer(0);

	public static Operation PRED_filter_vars_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry4(null, FILE_simple_analyzer::filter_vars_4_sub_1);
		return filter_vars_4_1(m);
	}

	private final static Operation filter_vars_4_sub_1(Prolog m) {
		m.trust(null);
		return filter_vars_4_2(m);
	}

	private final static Operation filter_vars_4_1(Prolog m) {
		// filter_vars(A,B,C,D):-(A=<0,E=C),!,D=E
		Term a1, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// filter_vars(A,B,C,D):-['$get_level'(E),F is 0,'$less_or_equal'(A,F),'$unify'(G,C),'$cut'(E),'$unify'(D,G)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		//START inline expansion of a(6)is si(1)
		if (!a6.unify(PRED_filter_vars_4_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(1),a(6))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a6)) > 0) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		//START inline expansion of $unify(a(7),a(3))
		if (!a7.unify(a3, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(4),a(7))
		if (!a4.unify(a7, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation filter_vars_4_2(Prolog m) {
		// filter_vars(A,B,C,D):-(A>0,E=C),(!,F=E),(arg(A,B,G),H=F),filter_vars_arg(A,B,G,H,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// filter_vars(A,B,C,D):-['$get_level'(E),F is 0,'$greater_than'(A,F),'$unify'(G,C),'$cut'(E),'$unify'(H,G),arg(A,B,I),'$unify'(J,H),filter_vars_arg(A,B,I,J,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		//START inline expansion of a(6)is si(1)
		if (!a6.unify(PRED_filter_vars_4_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(6))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a6)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		//START inline expansion of $unify(a(7),a(3))
		if (!a7.unify(a3, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		a8 = V(m);
		//START inline expansion of $unify(a(8),a(7))
		if (!a8.unify(a7, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a9 = V(m);
		a10 = V(m);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a2, a9), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a10, a8), //
						Op((Prolog e) -> PRED_filter_vars_arg_5_static_exec(e), VA(a1, a2, a9, a10, a4), cont)));
	}

	/** PREDICATE: filter_vars_arg/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5;

	public static Operation PRED_filter_vars_arg_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_simple_analyzer::filter_vars_arg_5_sub_1);
		return filter_vars_arg_5_1(m);
	}

	private final static Operation filter_vars_arg_5_sub_1(Prolog m) {
		m.trust(null);
		return filter_vars_arg_5_2(m);
	}

	private final static Operation filter_vars_arg_5_1(Prolog m) {
		// filter_vars_arg(A,B,C,D,E):-(var(C),F=D),(!,G=F),G=[C|H],(I is A-1,J=H),filter_vars(I,B,J,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// filter_vars_arg(A,B,C,D,E):-['$get_level'(F),var(C),'$unify'(G,D),'$cut'(F),'$unify'(H,G),'$unify'(H,[C|I]),J is A-1,'$unify'(K,I),filter_vars(J,B,K,E)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(3))
		a3 = a3.dref();
		if (!(a3.isVariable())) {
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
		a10 = CONS(a3, a9);
		//START inline expansion of $unify(a(8),a(10))
		if (!a8.unify(a10, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a11 = V(m);
		Term[] y1 = VA(a1, int_1);
		a12 = S("-", y1);
		//START inline expansion of a(11)is a(12)
		if (!a11.unify(Arithmetic.evaluate(a12), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a13 = V(m);
		//START inline expansion of $unify(a(13),a(9))
		if (!a13.unify(a9, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_filter_vars_4_static_exec(e), VA(a11, a2, a13, a5), cont);
	}

	private final static Operation filter_vars_arg_5_2(Prolog m) {
		// filter_vars_arg(A,B,C,D,E):-(nonvar(C),F=D),(!,G=F),(H is A-1,I=G),filter_vars(H,B,I,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// filter_vars_arg(A,B,C,D,E):-['$get_level'(F),nonvar(C),'$unify'(G,D),'$cut'(F),'$unify'(H,G),I is A-1,'$unify'(J,H),filter_vars(I,B,J,E)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(3))
		a3 = a3.dref();
		if ((a3.isVariable())) {
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
		Term[] y1 = VA(a1, int_1);
		a10 = S("-", y1);
		//START inline expansion of a(9)is a(10)
		if (!a9.unify(Arithmetic.evaluate(a10), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a11 = V(m);
		//START inline expansion of $unify(a(11),a(8))
		if (!a11.unify(a8, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_filter_vars_4_static_exec(e), VA(a9, a2, a11, a5), cont);
	}

	/** PREDICATE: goal_dupset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_goal_dupset_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// goal_dupset(A,B):-goal_dupset_varbag(A,B,C)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// goal_dupset(A,B):-[goal_dupset_varbag(A,B,C)]
		return //
		Op((Prolog e) -> PRED_goal_dupset_varbag_3_static_exec(e), VA(a1, a2, V(m)), cont);
	}

	/** PREDICATE: goal_dupset_varset/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_goal_dupset_varset_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// goal_dupset_varset(A,B,C):-goal_dupset_varbag(A,B,D),sort(D,C)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// goal_dupset_varset(A,B,C):-[goal_dupset_varbag(A,B,D),sort(D,C)]
		a4 = V(m);
		return //
		Op((Prolog e) -> PRED_goal_dupset_varbag_3_static_exec(e), VA(a1, a2, a4), //
				Op((Prolog e) -> PRED_sort_2_static_exec(e), VA(a4, a3), cont));
	}

	/** PREDICATE: goal_dupset_varbag/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_goal_dupset_varbag_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// goal_dupset_varbag(A,B,C):-varbag(A,C),make_key(C,D),keysort(D,E),filter_dups(E,B)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// goal_dupset_varbag(A,B,C):-[varbag(A,C),make_key(C,D),keysort(D,E),filter_dups(E,B)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_varbag_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_make_key_2_static_exec(e), VA(a3, a4), //
						Op((Prolog e) -> PRED_keysort_2_static_exec(e), VA(a4, a5), //
								Op((Prolog e) -> PRED_filter_dups_2_static_exec(e), VA(a5, a2), cont))));
	}

	/** PREDICATE: make_key/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_make_key_2_s1 = SYM("[]");
	final static SymbolTerm ATOM_dummy = SYM("dummy");

	public static Operation PRED_make_key_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return make_key_2_top(m);
	}

	private final static Operation make_key_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::make_key_2_var, fail_0, fail_0, FILE_simple_analyzer::make_key_2_1, fail_0, FILE_simple_analyzer::make_key_2_2);
	}

	private final static Operation make_key_2_var(Prolog m) {
		m.jtry2(null, FILE_simple_analyzer::make_key_2_var_1);
		return make_key_2_1(m);
	}

	private final static Operation make_key_2_var_1(Prolog m) {
		m.trust(null);
		return make_key_2_2(m);
	}

	private final static Operation make_key_2_1(Prolog m) {
		// make_key([],[]):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// make_key([],[]):-[]
		if (!PRED_make_key_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_make_key_2_s1.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation make_key_2_2(Prolog m) {
		// make_key([A|B],[A-dummy|C]):-make_key(B,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// make_key([A|B],[A-dummy|C]):-[make_key(B,C)]
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
		if (!a5.unify(C("-", a3, ATOM_dummy), m.trail)) {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a6;
		m.cont = cont;
		return make_key_2_top(m);
	}

	/** PREDICATE: filter_dups/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_filter_dups_2_s1 = SYM("[]");

	public static Operation PRED_filter_dups_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// filter_dups(A,B):-filter_dups(A,B,[])
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// filter_dups(A,B):-[filter_dups(A,B,[])]
		return //
		Op((Prolog e) -> PRED_filter_dups_3_static_exec(e), VA(a1, a2, PRED_filter_dups_2_s1), cont);
	}

	/** PREDICATE: filter_dups/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_filter_dups_3_s1 = SYM("[]");

	public static Operation PRED_filter_dups_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return filter_dups_3_top(m);
	}

	private final static Operation filter_dups_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::filter_dups_3_var, fail_0, fail_0, FILE_simple_analyzer::filter_dups_3_1, fail_0, FILE_simple_analyzer::filter_dups_3_lis);
	}

	private final static Operation filter_dups_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::filter_dups_3_var_1);
		return filter_dups_3_1(m);
	}

	private final static Operation filter_dups_3_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::filter_dups_3_var_2);
		return filter_dups_3_2(m);
	}

	private final static Operation filter_dups_3_var_2(Prolog m) {
		m.retry(null, FILE_simple_analyzer::filter_dups_3_var_3);
		return filter_dups_3_3(m);
	}

	private final static Operation filter_dups_3_var_3(Prolog m) {
		m.trust(null);
		return filter_dups_3_4(m);
	}

	private final static Operation filter_dups_3_lis(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::filter_dups_3_lis_1);
		return filter_dups_3_2(m);
	}

	private final static Operation filter_dups_3_lis_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::filter_dups_3_lis_2);
		return filter_dups_3_3(m);
	}

	private final static Operation filter_dups_3_lis_2(Prolog m) {
		m.trust(null);
		return filter_dups_3_4(m);
	}

	private final static Operation filter_dups_3_1(Prolog m) {
		// filter_dups([],A,B):-!,B=A
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// filter_dups([],A,B):-['$neck_cut','$unify'(B,A)]
		if (!PRED_filter_dups_3_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		//START inline expansion of $unify(a(3),a(2))
		if (!a3.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation filter_dups_3_2(Prolog m) {
		// filter_dups([A-B,C-D,E-F|G],H,I):-((A==C,C==E),J=H),(!,K=J),filter_dups([C-L,E-M|G],K,I)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// filter_dups([A-B,C-D,E-F|G],H,I):-['$get_level'(J),'$equality_of_term'(A,C),'$equality_of_term'(C,E),'$unify'(K,H),'$cut'(J),'$unify'(L,K),filter_dups([C-M,E-N|G],L,I)]
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
		if (!a4.unify(C("-", a6, V(m)), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a7 = argz[0];
			a8 = argz[1];
		} else if (a5.isVar()) {
			a7 = V(m);
			a8 = V(m);
			a5.bind(CONS(a7, a8), m.trail);
		} else {
			return m.fail();
		}
		a7 = a7.dref();
		a9 = V(m);
		if (!a7.unify(C("-", a9, V(m)), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a8.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a8.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		a12 = V(m);
		if (!a10.unify(C("-", a12, V(m)), m.trail)) {
			return m.fail();
		}
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(6),a(9))
		a6 = a6.dref();
		a9 = a9.dref();
		if (!a6.equalsTerm(a9)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(9),a(12))
		a9 = a9.dref();
		a12 = a12.dref();
		if (!a9.equalsTerm(a12)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		//START inline expansion of $unify(a(14),a(2))
		if (!a14.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(13))
		a13 = a13.dref();
		m.cut(a13.intValue());
		//END inline expansion
		a15 = V(m);
		//START inline expansion of $unify(a(15),a(14))
		if (!a15.unify(a14, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a9, V(m));
		a16 = S("-", y1);
		Term[] y2 = VA(a12, V(m));
		a17 = S("-", y2);
		a18 = CONS(a17, a11);
		a19 = CONS(a16, a18);
		m.AREGS[0] = a19;
		m.AREGS[1] = a15;
		m.AREGS[2] = a3;
		m.cont = cont;
		return filter_dups_3_top(m);
	}

	private final static Operation filter_dups_3_3(Prolog m) {
		// filter_dups([A-B,C-D|E],F,G):-(A==C,H=F),(!,I=H),I=[A|J],filter_dups(E,J,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// filter_dups([A-B,C-D|E],F,G):-['$get_level'(H),'$equality_of_term'(A,C),'$unify'(I,F),'$cut'(H),'$unify'(J,I),'$unify'(J,[A|K]),filter_dups(E,K,G)]
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
		if (!a4.unify(C("-", a6, V(m)), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a7 = argz[0];
			a8 = argz[1];
		} else if (a5.isVar()) {
			a7 = V(m);
			a8 = V(m);
			a5.bind(CONS(a7, a8), m.trail);
		} else {
			return m.fail();
		}
		a7 = a7.dref();
		a9 = V(m);
		if (!a7.unify(C("-", a9, V(m)), m.trail)) {
			return m.fail();
		}
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(6),a(9))
		a6 = a6.dref();
		a9 = a9.dref();
		if (!a6.equalsTerm(a9)) {
			return m.fail();
		}
		//END inline expansion
		a11 = V(m);
		//START inline expansion of $unify(a(11),a(2))
		if (!a11.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(10))
		a10 = a10.dref();
		m.cut(a10.intValue());
		//END inline expansion
		a12 = V(m);
		//START inline expansion of $unify(a(12),a(11))
		if (!a12.unify(a11, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a13 = V(m);
		a14 = CONS(a6, a13);
		//START inline expansion of $unify(a(12),a(14))
		if (!a12.unify(a14, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a8;
		m.AREGS[1] = a13;
		m.AREGS[2] = a3;
		m.cont = cont;
		return filter_dups_3_top(m);
	}

	private final static Operation filter_dups_3_4(Prolog m) {
		// filter_dups([A-B|C],D,E):-(!,F=D),filter_dups(C,F,E)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// filter_dups([A-B|C],D,E):-['$neck_cut','$unify'(F,D),filter_dups(C,F,E)]
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
		if (!a4.unify(C("-", V(m), V(m)), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		a6 = V(m);
		//START inline expansion of $unify(a(6),a(2))
		if (!a6.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a5;
		m.AREGS[1] = a6;
		m.AREGS[2] = a3;
		m.cont = cont;
		return filter_dups_3_top(m);
	}

	/** PREDICATE: set_command/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_set_command_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::set_command_3_var, fail_0, fail_0, fail_0, FILE_simple_analyzer::set_command_3_var, fail_0);
	}

	private final static Operation set_command_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::set_command_3_var_1);
		return set_command_3_1(m);
	}

	private final static Operation set_command_3_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::set_command_3_var_2);
		return set_command_3_2(m);
	}

	private final static Operation set_command_3_var_2(Prolog m) {
		m.retry(null, FILE_simple_analyzer::set_command_3_var_3);
		return set_command_3_3(m);
	}

	private final static Operation set_command_3_var_3(Prolog m) {
		m.trust(null);
		return set_command_3_4(m);
	}

	private final static Operation set_command_3_1(Prolog m) {
		// set_command(sub(A),B,C):-diffv(B,[A],C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// set_command(sub(A),B,C):-[diffv(B,[A],C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("sub", a4), m.trail)) {
			return m.fail();
		}
		a5 = CONS(a4, Prolog.Nil);
		return //
		Op((Prolog e) -> PRED_diffv_3_static_exec(e), VA(a2, a5, a3), cont);
	}

	private final static Operation set_command_3_2(Prolog m) {
		// set_command(add(A),B,C):-includev(A,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// set_command(add(A),B,C):-[includev(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("add", a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_includev_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	private final static Operation set_command_3_3(Prolog m) {
		// set_command(sub_set(A),B,C):-diffv(B,A,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// set_command(sub_set(A),B,C):-[diffv(B,A,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("sub_set", a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_diffv_3_static_exec(e), VA(a2, a4, a3), cont);
	}

	private final static Operation set_command_3_4(Prolog m) {
		// set_command(add_set(A),B,C):-unionv(A,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// set_command(add_set(A),B,C):-[unionv(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("add_set", a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_unionv_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	/** PREDICATE: table_command/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_table_command_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::table_command_3_var, fail_0, fail_0, fail_0, FILE_simple_analyzer::table_command_3_var, fail_0);
	}

	private final static Operation table_command_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::table_command_3_var_1);
		return table_command_3_1(m);
	}

	private final static Operation table_command_3_var_1(Prolog m) {
		m.trust(null);
		return table_command_3_2(m);
	}

	private final static Operation table_command_3_1(Prolog m) {
		// table_command(get(A,B),C,C):-get(C,A,B)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// table_command(get(A,B),C,C):-[get(C,A,B)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("get", a4, a5), m.trail)) {
			return m.fail();
		}
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_get_3_static_exec(e), VA(a2, a4, a5), cont);
	}

	private final static Operation table_command_3_2(Prolog m) {
		// table_command(set(A,B),C,D):-set(C,A,B,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// table_command(set(A,B),C,D):-[set(C,A,B,D)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("set", a4, a5), m.trail)) {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_set_4_static_exec(e), VA(a2, a4, a5, a3), cont);
	}

	/** PREDICATE: inv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_inv_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// inv(A,[B|C]):-compare(D,A,B),inv_2(D,A,C)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		// inv(A,[B|C]):-[compare(D,A,B),inv_2(D,A,C)]
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
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a5, a1, a3), //
				Op((Prolog e) -> PRED_inv_2_3_static_exec(e), VA(a5, a1, a4), cont));
	}

	/** PREDICATE: inv_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_inv_2_3_s1 = SYM("=");

	public static Operation PRED_inv_2_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::inv_2_3_var, fail_0, fail_0, FILE_simple_analyzer::inv_2_3_var, fail_0, fail_0);
	}

	private final static Operation inv_2_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::inv_2_3_var_1);
		return inv_2_3_1(m);
	}

	private final static Operation inv_2_3_var_1(Prolog m) {
		m.trust(null);
		return inv_2_3_2(m);
	}

	private final static Operation inv_2_3_1(Prolog m) {
		// inv_2(=,A,B):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// inv_2(=,A,B):-[]
		if (!PRED_inv_2_3_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation inv_2_3_2(Prolog m) {
		// inv_2(>,A,B):-inv(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// inv_2(>,A,B):-[inv(A,B)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a2, a3), cont);
	}

	/** PREDICATE: intersectv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_intersectv_3_s1 = SYM("[]");

	public static Operation PRED_intersectv_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::intersectv_3_var, fail_0, fail_0, FILE_simple_analyzer::intersectv_3_1, fail_0, FILE_simple_analyzer::intersectv_3_2);
	}

	private final static Operation intersectv_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::intersectv_3_var_1);
		return intersectv_3_1(m);
	}

	private final static Operation intersectv_3_var_1(Prolog m) {
		m.trust(null);
		return intersectv_3_2(m);
	}

	private final static Operation intersectv_3_1(Prolog m) {
		// intersectv([],A,[]):-true
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersectv([],A,[]):-[]
		if (!PRED_intersectv_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_intersectv_3_s1.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation intersectv_3_2(Prolog m) {
		// intersectv([A|B],C,D):-intersectv_2(C,A,B,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersectv([A|B],C,D):-[intersectv_2(C,A,B,D)]
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
		return //
		Op((Prolog e) -> PRED_intersectv_2_4_static_exec(e), VA(a2, a4, a5, a3), cont);
	}

	/** PREDICATE: intersectv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_intersectv_2_4_s1 = SYM("[]");

	public static Operation PRED_intersectv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::intersectv_2_4_var, fail_0, fail_0, FILE_simple_analyzer::intersectv_2_4_1, fail_0, FILE_simple_analyzer::intersectv_2_4_2);
	}

	private final static Operation intersectv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_simple_analyzer::intersectv_2_4_var_1);
		return intersectv_2_4_1(m);
	}

	private final static Operation intersectv_2_4_var_1(Prolog m) {
		m.trust(null);
		return intersectv_2_4_2(m);
	}

	private final static Operation intersectv_2_4_1(Prolog m) {
		// intersectv_2([],A,B,[]):-true
		Term a1, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a4 = m.AREGS[3];
		cont = m.cont;
		// intersectv_2([],A,B,[]):-[]
		if (!PRED_intersectv_2_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_intersectv_2_4_s1.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation intersectv_2_4_2(Prolog m) {
		// intersectv_2([A|B],C,D,E):-compare(F,C,A),intersectv_3(F,C,D,A,B,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// intersectv_2([A|B],C,D,E):-[compare(F,C,A),intersectv_3(F,C,D,A,B,E)]
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
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a7, a2, a5), //
				Op((Prolog e) -> PRED_intersectv_3_6_static_exec(e), VA(a7, a2, a3, a5, a6, a4), cont));
	}

	/** PREDICATE: intersectv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_intersectv_3_6_s1 = SYM("<");

	// private final Term arg5, arg6;

	public static Operation PRED_intersectv_3_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::intersectv_3_6_var, fail_0, fail_0, FILE_simple_analyzer::intersectv_3_6_var, fail_0, fail_0);
	}

	private final static Operation intersectv_3_6_var(Prolog m) {
		m.jtry6(null, FILE_simple_analyzer::intersectv_3_6_var_1);
		return intersectv_3_6_1(m);
	}

	private final static Operation intersectv_3_6_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::intersectv_3_6_var_2);
		return intersectv_3_6_2(m);
	}

	private final static Operation intersectv_3_6_var_2(Prolog m) {
		m.trust(null);
		return intersectv_3_6_3(m);
	}

	private final static Operation intersectv_3_6_1(Prolog m) {
		// intersectv_3(<,A,B,C,D,E):-intersectv_2(B,C,D,E)
		Term a1, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// intersectv_3(<,A,B,C,D,E):-[intersectv_2(B,C,D,E)]
		if (!PRED_intersectv_3_6_s1.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_intersectv_2_4_static_exec(e), VA(a3, a4, a5, a6), cont);
	}

	private final static Operation intersectv_3_6_2(Prolog m) {
		// intersectv_3(=,A,B,C,D,[A|E]):-intersectv(B,D,E)
		Term a1, a2, a3, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// intersectv_3(=,A,B,C,D,[A|E]):-[intersectv(B,D,E)]
		if (!ATOM_unify.unify(a1, m.trail))
			return m.fail();
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a2, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_intersectv_3_static_exec(e), VA(a3, a5, a7), cont);
	}

	private final static Operation intersectv_3_6_3(Prolog m) {
		// intersectv_3(>,A,B,C,D,E):-intersectv_2(D,A,B,E)
		Term a1, a2, a3, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// intersectv_3(>,A,B,C,D,E):-[intersectv_2(D,A,B,E)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_intersectv_2_4_static_exec(e), VA(a5, a2, a3, a6), cont);
	}

	/** PREDICATE: diffv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_diffv_3_s1 = SYM("[]");

	public static Operation PRED_diffv_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::diffv_3_var, fail_0, fail_0, FILE_simple_analyzer::diffv_3_1, fail_0, FILE_simple_analyzer::diffv_3_2);
	}

	private final static Operation diffv_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::diffv_3_var_1);
		return diffv_3_1(m);
	}

	private final static Operation diffv_3_var_1(Prolog m) {
		m.trust(null);
		return diffv_3_2(m);
	}

	private final static Operation diffv_3_1(Prolog m) {
		// diffv([],A,[]):-true
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// diffv([],A,[]):-[]
		if (!PRED_diffv_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_diffv_3_s1.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation diffv_3_2(Prolog m) {
		// diffv([A|B],C,D):-diffv_2(C,A,B,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// diffv([A|B],C,D):-[diffv_2(C,A,B,D)]
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
		return //
		Op((Prolog e) -> PRED_diffv_2_4_static_exec(e), VA(a2, a4, a5, a3), cont);
	}

	/** PREDICATE: diffv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_diffv_2_4_s1 = SYM("[]");

	public static Operation PRED_diffv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::diffv_2_4_var, fail_0, fail_0, FILE_simple_analyzer::diffv_2_4_1, fail_0, FILE_simple_analyzer::diffv_2_4_2);
	}

	private final static Operation diffv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_simple_analyzer::diffv_2_4_var_1);
		return diffv_2_4_1(m);
	}

	private final static Operation diffv_2_4_var_1(Prolog m) {
		m.trust(null);
		return diffv_2_4_2(m);
	}

	private final static Operation diffv_2_4_1(Prolog m) {
		// diffv_2([],A,B,[A]):-true
		Term a1, a2, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		cont = m.cont;
		// diffv_2([],A,B,[A]):-[]
		if (!PRED_diffv_2_4_s1.unify(a1, m.trail))
			return m.fail();
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_diffv_2_4_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a2, PRED_diffv_2_4_s1), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation diffv_2_4_2(Prolog m) {
		// diffv_2([A|B],C,D,E):-compare(F,C,A),diffv_3(F,C,D,A,B,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// diffv_2([A|B],C,D,E):-[compare(F,C,A),diffv_3(F,C,D,A,B,E)]
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
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a7, a2, a5), //
				Op((Prolog e) -> PRED_diffv_3_6_static_exec(e), VA(a7, a2, a3, a5, a6, a4), cont));
	}

	/** PREDICATE: diffv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_diffv_3_6_s1 = SYM("<");

	// private final Term arg5, arg6;

	public static Operation PRED_diffv_3_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::diffv_3_6_var, fail_0, fail_0, FILE_simple_analyzer::diffv_3_6_var, fail_0, fail_0);
	}

	private final static Operation diffv_3_6_var(Prolog m) {
		m.jtry6(null, FILE_simple_analyzer::diffv_3_6_var_1);
		return diffv_3_6_1(m);
	}

	private final static Operation diffv_3_6_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::diffv_3_6_var_2);
		return diffv_3_6_2(m);
	}

	private final static Operation diffv_3_6_var_2(Prolog m) {
		m.trust(null);
		return diffv_3_6_3(m);
	}

	private final static Operation diffv_3_6_1(Prolog m) {
		// diffv_3(<,A,B,C,D,[A|E]):-diffv(B,[C|D],E)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// diffv_3(<,A,B,C,D,[A|E]):-[diffv(B,[C|D],E)]
		if (!PRED_diffv_3_6_s1.unify(a1, m.trail))
			return m.fail();
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a2, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = CONS(a4, a5);
		return //
		Op((Prolog e) -> PRED_diffv_3_static_exec(e), VA(a3, a8, a7), cont);
	}

	private final static Operation diffv_3_6_2(Prolog m) {
		// diffv_3(=,A,B,C,D,E):-diffv(B,D,E)
		Term a1, a3, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// diffv_3(=,A,B,C,D,E):-[diffv(B,D,E)]
		if (!ATOM_unify.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_diffv_3_static_exec(e), VA(a3, a5, a6), cont);
	}

	private final static Operation diffv_3_6_3(Prolog m) {
		// diffv_3(>,A,B,C,D,E):-diffv_2(D,A,B,E)
		Term a1, a2, a3, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// diffv_3(>,A,B,C,D,E):-[diffv_2(D,A,B,E)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_diffv_2_4_static_exec(e), VA(a5, a2, a3, a6), cont);
	}

	/** PREDICATE: unionv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_unionv_3_s1 = SYM("[]");

	public static Operation PRED_unionv_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::unionv_3_var, fail_0, fail_0, FILE_simple_analyzer::unionv_3_1, fail_0, FILE_simple_analyzer::unionv_3_2);
	}

	private final static Operation unionv_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::unionv_3_var_1);
		return unionv_3_1(m);
	}

	private final static Operation unionv_3_var_1(Prolog m) {
		m.trust(null);
		return unionv_3_2(m);
	}

	private final static Operation unionv_3_1(Prolog m) {
		// unionv([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// unionv([],A,A):-[]
		if (!PRED_unionv_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation unionv_3_2(Prolog m) {
		// unionv([A|B],C,D):-unionv_2(C,A,B,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// unionv([A|B],C,D):-[unionv_2(C,A,B,D)]
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
		return //
		Op((Prolog e) -> PRED_unionv_2_4_static_exec(e), VA(a2, a4, a5, a3), cont);
	}

	/** PREDICATE: unionv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_unionv_2_4_s1 = SYM("[]");

	public static Operation PRED_unionv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::unionv_2_4_var, fail_0, fail_0, FILE_simple_analyzer::unionv_2_4_1, fail_0, FILE_simple_analyzer::unionv_2_4_2);
	}

	private final static Operation unionv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_simple_analyzer::unionv_2_4_var_1);
		return unionv_2_4_1(m);
	}

	private final static Operation unionv_2_4_var_1(Prolog m) {
		m.trust(null);
		return unionv_2_4_2(m);
	}

	private final static Operation unionv_2_4_1(Prolog m) {
		// unionv_2([],A,B,[A|B]):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// unionv_2([],A,B,[A|B]):-[]
		if (!PRED_unionv_2_4_s1.unify(a1, m.trail))
			return m.fail();
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!a3.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a2, a3), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation unionv_2_4_2(Prolog m) {
		// unionv_2([A|B],C,D,E):-compare(F,C,A),unionv_3(F,C,D,A,B,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// unionv_2([A|B],C,D,E):-[compare(F,C,A),unionv_3(F,C,D,A,B,E)]
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
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a7, a2, a5), //
				Op((Prolog e) -> PRED_unionv_3_6_static_exec(e), VA(a7, a2, a3, a5, a6, a4), cont));
	}

	/** PREDICATE: unionv_3/6
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_unionv_3_6_s1 = SYM("<");

	// private final Term arg5, arg6;

	public static Operation PRED_unionv_3_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::unionv_3_6_var, fail_0, fail_0, FILE_simple_analyzer::unionv_3_6_var, fail_0, fail_0);
	}

	private final static Operation unionv_3_6_var(Prolog m) {
		m.jtry6(null, FILE_simple_analyzer::unionv_3_6_var_1);
		return unionv_3_6_1(m);
	}

	private final static Operation unionv_3_6_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::unionv_3_6_var_2);
		return unionv_3_6_2(m);
	}

	private final static Operation unionv_3_6_var_2(Prolog m) {
		m.trust(null);
		return unionv_3_6_3(m);
	}

	private final static Operation unionv_3_6_1(Prolog m) {
		// unionv_3(<,A,B,C,D,[A|E]):-unionv_2(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// unionv_3(<,A,B,C,D,[A|E]):-[unionv_2(B,C,D,E)]
		if (!PRED_unionv_3_6_s1.unify(a1, m.trail))
			return m.fail();
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a2, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_unionv_2_4_static_exec(e), VA(a3, a4, a5, a7), cont);
	}

	private final static Operation unionv_3_6_2(Prolog m) {
		// unionv_3(=,A,B,C,D,[A|E]):-unionv(B,D,E)
		Term a1, a2, a3, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// unionv_3(=,A,B,C,D,[A|E]):-[unionv(B,D,E)]
		if (!ATOM_unify.unify(a1, m.trail))
			return m.fail();
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a2, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_unionv_3_static_exec(e), VA(a3, a5, a7), cont);
	}

	private final static Operation unionv_3_6_3(Prolog m) {
		// unionv_3(>,A,B,C,D,[C|E]):-unionv_2(D,A,B,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		cont = m.cont;
		// unionv_3(>,A,B,C,D,[C|E]):-[unionv_2(D,A,B,E)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a4, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_unionv_2_4_static_exec(e), VA(a5, a2, a3, a7), cont);
	}

	/** PREDICATE: includev/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_includev_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// includev(A,B,C):-includev_2(B,A,C)
		m.setB0();
		Term a1, a2, a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// includev(A,B,C):-[includev_2(B,A,C)]
		return //
		Op((Prolog e) -> PRED_includev_2_3_static_exec(e), VA(a2, a1, a3), cont);
	}

	/** PREDICATE: includev_2/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_includev_2_3_s1 = SYM("[]");

	public static Operation PRED_includev_2_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::includev_2_3_var, fail_0, fail_0, FILE_simple_analyzer::includev_2_3_1, fail_0, FILE_simple_analyzer::includev_2_3_2);
	}

	private final static Operation includev_2_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::includev_2_3_var_1);
		return includev_2_3_1(m);
	}

	private final static Operation includev_2_3_var_1(Prolog m) {
		m.trust(null);
		return includev_2_3_2(m);
	}

	private final static Operation includev_2_3_1(Prolog m) {
		// includev_2([],A,[A]):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// includev_2([],A,[A]):-[]
		if (!PRED_includev_2_3_s1.unify(a1, m.trail))
			return m.fail();
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_includev_2_3_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a3.isVar()) {
			a3.bind(CONS(a2, PRED_includev_2_3_s1), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation includev_2_3_2(Prolog m) {
		// includev_2([A|B],C,D):-compare(E,C,A),includev_3(E,C,A,B,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// includev_2([A|B],C,D):-[compare(E,C,A),includev_3(E,C,A,B,D)]
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
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a6, a2, a4), //
				Op((Prolog e) -> PRED_includev_3_5_static_exec(e), VA(a6, a2, a4, a5, a3), cont));
	}

	/** PREDICATE: includev_3/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_includev_3_5_s1 = SYM("<");

	// private final Term arg5;

	public static Operation PRED_includev_3_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::includev_3_5_var, fail_0, fail_0, FILE_simple_analyzer::includev_3_5_var, fail_0, fail_0);
	}

	private final static Operation includev_3_5_var(Prolog m) {
		m.jtry5(null, FILE_simple_analyzer::includev_3_5_var_1);
		return includev_3_5_1(m);
	}

	private final static Operation includev_3_5_var_1(Prolog m) {
		m.retry(null, FILE_simple_analyzer::includev_3_5_var_2);
		return includev_3_5_2(m);
	}

	private final static Operation includev_3_5_var_2(Prolog m) {
		m.trust(null);
		return includev_3_5_3(m);
	}

	private final static Operation includev_3_5_1(Prolog m) {
		// includev_3(<,A,B,C,[A,B|C]):-true
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// includev_3(<,A,B,C,[A,B|C]):-[]
		if (!PRED_includev_3_5_s1.unify(a1, m.trail))
			return m.fail();
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a6 = argz[1];
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a2, a6), m.trail);
		} else {
			return m.fail();
		}
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a4.unify(argz[1], m.trail))
				return m.fail();
		} else if (a6.isVar()) {
			a6.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation includev_3_5_2(Prolog m) {
		// includev_3(=,A,B,C,[B|C]):-true
		Term a1, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// includev_3(=,A,B,C,[B|C]):-[]
		if (!ATOM_unify.unify(a1, m.trail))
			return m.fail();
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a4.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a5.bind(CONS(a3, a4), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation includev_3_5_3(Prolog m) {
		// includev_3(>,A,B,C,[B|D]):-includev_2(C,A,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// includev_3(>,A,B,C,[B|D]):-[includev_2(C,A,D)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			a6 = argz[1];
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a3, a6), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_includev_2_3_static_exec(e), VA(a4, a2, a6), cont);
	}

	/** PREDICATE: subsetv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_subsetv_2_s1 = SYM("[]");

	public static Operation PRED_subsetv_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::subsetv_2_var, fail_0, fail_0, FILE_simple_analyzer::subsetv_2_1, fail_0, FILE_simple_analyzer::subsetv_2_2);
	}

	private final static Operation subsetv_2_var(Prolog m) {
		m.jtry2(null, FILE_simple_analyzer::subsetv_2_var_1);
		return subsetv_2_1(m);
	}

	private final static Operation subsetv_2_var_1(Prolog m) {
		m.trust(null);
		return subsetv_2_2(m);
	}

	private final static Operation subsetv_2_1(Prolog m) {
		// subsetv([],A):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// subsetv([],A):-[]
		if (!PRED_subsetv_2_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation subsetv_2_2(Prolog m) {
		// subsetv([A|B],[C|D]):-compare(E,A,C),subsetv_2(E,A,B,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// subsetv([A|B],[C|D]):-[compare(E,A,C),subsetv_2(E,A,B,D)]
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
		return //
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a7, a3, a5), //
				Op((Prolog e) -> PRED_subsetv_2_4_static_exec(e), VA(a7, a3, a4, a6), cont));
	}

	/** PREDICATE: subsetv_2/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final SymbolTerm PRED_subsetv_2_4_s1 = SYM("=");

	public static Operation PRED_subsetv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::subsetv_2_4_var, fail_0, fail_0, FILE_simple_analyzer::subsetv_2_4_var, fail_0, fail_0);
	}

	private final static Operation subsetv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_simple_analyzer::subsetv_2_4_var_1);
		return subsetv_2_4_1(m);
	}

	private final static Operation subsetv_2_4_var_1(Prolog m) {
		m.trust(null);
		return subsetv_2_4_2(m);
	}

	private final static Operation subsetv_2_4_1(Prolog m) {
		// subsetv_2(=,A,B,C):-subsetv(B,C)
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// subsetv_2(=,A,B,C):-[subsetv(B,C)]
		if (!PRED_subsetv_2_4_s1.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_subsetv_2_static_exec(e), VA(a3, a4), cont);
	}

	private final static Operation subsetv_2_4_2(Prolog m) {
		// subsetv_2(>,A,B,C):-subsetv([A|B],C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// subsetv_2(>,A,B,C):-[subsetv([A|B],C)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		a5 = CONS(a2, a3);
		return //
		Op((Prolog e) -> PRED_subsetv_2_static_exec(e), VA(a5, a4), cont);
	}

	/** PREDICATE: varset/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/
	private static final /**/ IntegerTerm PRED_varbag_3_s1 = Integer(1);

	public static Operation PRED_varbag_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_simple_analyzer::varbag_3_sub_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	// private final Term arg5;

	public static Operation PRED_varbag_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_simple_analyzer::varbag_5_sub_1);
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

	/** PREDICATE: unify_p/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_unify_p_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// unify_p(A=B):-true
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// unify_p(A=B):-[]
		a1 = a1.dref();
		if (!a1.unify(C("=", V(m), V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_simple_analyzer::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl'(A):-unify_p(A),!,fail
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl'(A):-['$get_level'(B),unify_p(A),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_unify_p_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a2), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl'(A):-[]
		return cont;
	}

	/** PREDICATE: call_p/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_call_p_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// call_p(A):-'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl'(A)
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// call_p(A):-['$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl'(A)]
		return //
		Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_static_exec(e), VA(a1), cont);
	}

	/** PREDICATE: split_unify/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl
	*/

	public static Operation PRED_split_unify_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_simple_analyzer::split_unify_3_var, fail_0, fail_0, fail_0, FILE_simple_analyzer::split_unify_3_var, fail_0);
	}

	private final static Operation split_unify_3_var(Prolog m) {
		m.jtry3(null, FILE_simple_analyzer::split_unify_3_var_1);
		return split_unify_3_1(m);
	}

	private final static Operation split_unify_3_var_1(Prolog m) {
		m.trust(null);
		return split_unify_3_2(m);
	}

	private final static Operation split_unify_3_1(Prolog m) {
		// split_unify(A=B,A,B):-true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// split_unify(A=B,A,B):-[]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("=", a4, a5), m.trail)) {
			return m.fail();
		}
		if (!a4.unify(a2, m.trail))
			return m.fail();
		if (!a5.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation split_unify_3_2(Prolog m) {
		// split_unify(A=B,B,A):-true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// split_unify(A=B,B,A):-[]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("=", a4, a5), m.trail)) {
			return m.fail();
		}
		if (!a5.unify(a2, m.trail))
			return m.fail();
		if (!a4.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_simple_analyzer::PRED_top_0_static_exec);
		PredTable.registerBuiltin("main", 1, FILE_simple_analyzer::PRED_main_1_static_exec);
		PredTable.registerBuiltin("analyze_strees", 2, FILE_simple_analyzer::PRED_analyze_strees_2_static_exec);
		PredTable.registerBuiltin("analyze_closure", 3, FILE_simple_analyzer::PRED_analyze_closure_3_static_exec);
		PredTable.registerBuiltin("analyze_closure", 4, FILE_simple_analyzer::PRED_analyze_closure_4_static_exec);
		PredTable.registerBuiltin("init_strees", 3, FILE_simple_analyzer::PRED_init_strees_3_static_exec);
		PredTable.registerBuiltin("init_conj", 3, FILE_simple_analyzer::PRED_init_conj_3_static_exec);
		PredTable.registerBuiltin("init_disj", 3, FILE_simple_analyzer::PRED_init_disj_3_static_exec);
		PredTable.registerBuiltin("init_goal", 3, FILE_simple_analyzer::PRED_init_goal_3_static_exec);
		PredTable.registerBuiltin("traverse_strees", 5, FILE_simple_analyzer::PRED_traverse_strees_5_static_exec);
		PredTable.registerBuiltin("traverse_disj", 6, FILE_simple_analyzer::PRED_traverse_disj_6_static_exec);
		PredTable.registerBuiltin("traverse_conj", 6, FILE_simple_analyzer::PRED_traverse_conj_6_static_exec);
		PredTable.registerBuiltin("traverse_conj", 11, FILE_simple_analyzer::PRED_traverse_conj_11_static_exec);
		PredTable.registerBuiltin("update_goal", 12, FILE_simple_analyzer::PRED_update_goal_12_static_exec);
		PredTable.registerBuiltin("update_table", 6, FILE_simple_analyzer::PRED_update_table_6_static_exec);
		PredTable.registerBuiltin("create_new_call", 9, FILE_simple_analyzer::PRED_create_new_call_9_static_exec);
		PredTable.registerBuiltin("lub", 3, FILE_simple_analyzer::PRED_lub_3_static_exec);
		PredTable.registerBuiltin("bottom", 1, FILE_simple_analyzer::PRED_bottom_1_static_exec);
		PredTable.registerBuiltin("create_argument", 6, FILE_simple_analyzer::PRED_create_argument_6_static_exec);
		PredTable.registerBuiltin("lub_call", 3, FILE_simple_analyzer::PRED_lub_call_3_static_exec);
		PredTable.registerBuiltin("lub_call", 5, FILE_simple_analyzer::PRED_lub_call_5_static_exec);
		PredTable.registerBuiltin("bottom_call", 2, FILE_simple_analyzer::PRED_bottom_call_2_static_exec);
		PredTable.registerBuiltin("bottom_call", 3, FILE_simple_analyzer::PRED_bottom_call_3_static_exec);
		PredTable.registerBuiltin("lattice_modes_call", 3, FILE_simple_analyzer::PRED_lattice_modes_call_3_static_exec);
		PredTable.registerBuiltin("lattice_modes_call", 6, FILE_simple_analyzer::PRED_lattice_modes_call_6_static_exec);
		PredTable.registerBuiltin("lattice_modes_arg", 4, FILE_simple_analyzer::PRED_lattice_modes_arg_4_static_exec);
		PredTable.registerBuiltin("get", 3, FILE_simple_analyzer::PRED_get_3_static_exec);
		PredTable.registerBuiltin("get", 6, FILE_simple_analyzer::PRED_get_6_static_exec);
		PredTable.registerBuiltin("get", 5, FILE_simple_analyzer::PRED_get_5_static_exec);
		PredTable.registerBuiltin("set", 4, FILE_simple_analyzer::PRED_set_4_static_exec);
		PredTable.registerBuiltin("set_2", 9, FILE_simple_analyzer::PRED_set_2_9_static_exec);
		PredTable.registerBuiltin("seal", 1, FILE_simple_analyzer::PRED_seal_1_static_exec);
		PredTable.registerBuiltin("membership_flag", 3, FILE_simple_analyzer::PRED_membership_flag_3_static_exec);
		PredTable.registerBuiltin("ground_flag", 3, FILE_simple_analyzer::PRED_ground_flag_3_static_exec);
		PredTable.registerBuiltin("get_entry_modes", 4, FILE_simple_analyzer::PRED_get_entry_modes_4_static_exec);
		PredTable.registerBuiltin("get_entry_modes", 6, FILE_simple_analyzer::PRED_get_entry_modes_6_static_exec);
		PredTable.registerBuiltin("var_args", 2, FILE_simple_analyzer::PRED_var_args_2_static_exec);
		PredTable.registerBuiltin("filter_vars", 3, FILE_simple_analyzer::PRED_filter_vars_3_static_exec);
		PredTable.registerBuiltin("filter_vars", 4, FILE_simple_analyzer::PRED_filter_vars_4_static_exec);
		PredTable.registerBuiltin("filter_vars_arg", 5, FILE_simple_analyzer::PRED_filter_vars_arg_5_static_exec);
		PredTable.registerBuiltin("goal_dupset", 2, FILE_simple_analyzer::PRED_goal_dupset_2_static_exec);
		PredTable.registerBuiltin("goal_dupset_varset", 3, FILE_simple_analyzer::PRED_goal_dupset_varset_3_static_exec);
		PredTable.registerBuiltin("goal_dupset_varbag", 3, FILE_simple_analyzer::PRED_goal_dupset_varbag_3_static_exec);
		PredTable.registerBuiltin("make_key", 2, FILE_simple_analyzer::PRED_make_key_2_static_exec);
		PredTable.registerBuiltin("filter_dups", 2, FILE_simple_analyzer::PRED_filter_dups_2_static_exec);
		PredTable.registerBuiltin("filter_dups", 3, FILE_simple_analyzer::PRED_filter_dups_3_static_exec);
		PredTable.registerBuiltin("set_command", 3, FILE_simple_analyzer::PRED_set_command_3_static_exec);
		PredTable.registerBuiltin("table_command", 3, FILE_simple_analyzer::PRED_table_command_3_static_exec);
		PredTable.registerBuiltin("inv", 2, FILE_simple_analyzer::PRED_inv_2_static_exec);
		PredTable.registerBuiltin("inv_2", 3, FILE_simple_analyzer::PRED_inv_2_3_static_exec);
		PredTable.registerBuiltin("intersectv", 3, FILE_simple_analyzer::PRED_intersectv_3_static_exec);
		PredTable.registerBuiltin("intersectv_2", 4, FILE_simple_analyzer::PRED_intersectv_2_4_static_exec);
		PredTable.registerBuiltin("intersectv_3", 6, FILE_simple_analyzer::PRED_intersectv_3_6_static_exec);
		PredTable.registerBuiltin("diffv", 3, FILE_simple_analyzer::PRED_diffv_3_static_exec);
		PredTable.registerBuiltin("diffv_2", 4, FILE_simple_analyzer::PRED_diffv_2_4_static_exec);
		PredTable.registerBuiltin("diffv_3", 6, FILE_simple_analyzer::PRED_diffv_3_6_static_exec);
		PredTable.registerBuiltin("unionv", 3, FILE_simple_analyzer::PRED_unionv_3_static_exec);
		PredTable.registerBuiltin("unionv_2", 4, FILE_simple_analyzer::PRED_unionv_2_4_static_exec);
		PredTable.registerBuiltin("unionv_3", 6, FILE_simple_analyzer::PRED_unionv_3_6_static_exec);
		PredTable.registerBuiltin("includev", 3, FILE_simple_analyzer::PRED_includev_3_static_exec);
		PredTable.registerBuiltin("includev_2", 3, FILE_simple_analyzer::PRED_includev_2_3_static_exec);
		PredTable.registerBuiltin("includev_3", 5, FILE_simple_analyzer::PRED_includev_3_5_static_exec);
		PredTable.registerBuiltin("subsetv", 2, FILE_simple_analyzer::PRED_subsetv_2_static_exec);
		PredTable.registerBuiltin("subsetv_2", 4, FILE_simple_analyzer::PRED_subsetv_2_4_static_exec);
		PredTable.registerBuiltin("varset", 2, FILE_simple_analyzer::PRED_varset_2_static_exec);
		PredTable.registerBuiltin("varbag", 2, FILE_simple_analyzer::PRED_varbag_2_static_exec);
		PredTable.registerBuiltin("varbag", 3, FILE_simple_analyzer::PRED_varbag_3_static_exec);
		PredTable.registerBuiltin("varbag", 5, FILE_simple_analyzer::PRED_varbag_5_static_exec);
		PredTable.registerBuiltin("unify_p", 1, FILE_simple_analyzer::PRED_unify_p_1_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/simple_analyzer.pl",
				"$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl", 1,
				FILE_simple_analyzer::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsimple_analyzer$002Epl_1_static_exec);
		PredTable.registerBuiltin("call_p", 1, FILE_simple_analyzer::PRED_call_p_1_static_exec);
		PredTable.registerBuiltin("split_unify", 3, FILE_simple_analyzer::PRED_split_unify_3_static_exec);
	}
}
