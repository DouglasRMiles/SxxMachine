package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.builtin.FILE_cafeteria.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_zebra  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
	final static SymbolTerm ATOM_red = SYM("red");
	final static SymbolTerm ATOM_english = SYM("english");
	final static SymbolTerm ATOM_spanish = SYM("spanish");
	final static SymbolTerm ATOM_dog = SYM("dog");
	final static SymbolTerm ATOM_green = SYM("green");
	final static SymbolTerm ATOM_coffee = SYM("coffee");
	final static SymbolTerm ATOM_ukrainian = SYM("ukrainian");
	final static SymbolTerm ATOM_tea = SYM("tea");
	final static SymbolTerm ATOM_ivory = SYM("ivory");
	final static SymbolTerm ATOM_snails = SYM("snails");
	final static SymbolTerm ATOM_winstons = SYM("winstons");
	final static SymbolTerm ATOM_yellow = SYM("yellow");
	final static SymbolTerm ATOM_kools = SYM("kools");
	final static SymbolTerm ATOM_milk = SYM("milk");
	final static SymbolTerm ATOM_norwegian = SYM("norwegian");
	final static SymbolTerm ATOM_chesterfields = SYM("chesterfields");
	final static SymbolTerm ATOM_fox = SYM("fox");
	final static SymbolTerm ATOM_horse = SYM("horse");
	final static SymbolTerm ATOM_orange_juice = SYM("orange_juice");
	final static SymbolTerm ATOM_lucky_strikes = SYM("lucky_strikes");
	final static SymbolTerm ATOM_japanese = SYM("japanese");
	final static SymbolTerm ATOM_parliaments = SYM("parliaments");
	final static SymbolTerm ATOM_blue = SYM("blue");
	final static SymbolTerm ATOM_zebra = SYM("zebra");
	final static SymbolTerm ATOM_water = SYM("water");

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-houses(A),member(house(red,english,B,C,D),A),member(house(E,spanish,dog,F,G),A),member(house(green,H,I,coffee,J),A),member(house(K,ukrainian,L,tea,M),A),right_of(house(green,N,O,P,Q),house(ivory,R,S,T,U),A),member(house(V,W,snails,X,winstons),A),member(house(yellow,Y,Z,A1,kools),A),A=[B1,C1,house(D1,E1,F1,milk,G1),H1,I1],A=[house(J1,norwegian,K1,L1,M1)|N1],next_to(house(O1,P1,Q1,R1,chesterfields),house(S1,T1,fox,U1,V1),A),next_to(house(W1,X1,Y1,Z1,kools),house(A2,B2,horse,C2,D2),A),member(house(E2,F2,G2,orange_juice,lucky_strikes),A),member(house(H2,japanese,I2,J2,parliaments),A),next_to(house(K2,norwegian,L2,M2,N2),house(blue,O2,P2,Q2,R2),A),member(house(S2,T2,zebra,U2,V2),A),member(house(W2,X2,Y2,water,Z2),A)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27;
		// top:-[houses(A),member(house(red,english,B,C,D),A),member(house(E,spanish,dog,F,G),A),member(house(green,H,I,coffee,J),A),member(house(K,ukrainian,L,tea,M),A),right_of(house(green,N,O,P,Q),house(ivory,R,S,T,U),A),member(house(V,W,snails,X,winstons),A),member(house(yellow,Y,Z,A1,kools),A),'$unify'(A,[B1,C1,house(D1,E1,F1,milk,G1),H1,I1]),'$unify'(A,[house(J1,norwegian,K1,L1,M1)|N1]),next_to(house(O1,P1,Q1,R1,chesterfields),house(S1,T1,fox,U1,V1),A),next_to(house(W1,X1,Y1,Z1,kools),house(A2,B2,horse,C2,D2),A),member(house(E2,F2,G2,orange_juice,lucky_strikes),A),member(house(H2,japanese,I2,J2,parliaments),A),next_to(house(K2,norwegian,L2,M2,N2),house(blue,O2,P2,Q2,R2),A),member(house(S2,T2,zebra,U2,V2),A),member(house(W2,X2,Y2,water,Z2),A)]
		a1 = V(m);
		Term[] y1 = VA(ATOM_red, ATOM_english, V(m), V(m), V(m));
		a2 = S("house", y1);
		Term[] y2 = VA(V(m), ATOM_spanish, ATOM_dog, V(m), V(m));
		a3 = S("house", y2);
		Term[] y3 = VA(ATOM_green, V(m), V(m), ATOM_coffee, V(m));
		a4 = S("house", y3);
		Term[] y4 = VA(V(m), ATOM_ukrainian, V(m), ATOM_tea, V(m));
		a5 = S("house", y4);
		Term[] y5 = VA(ATOM_green, V(m), V(m), V(m), V(m));
		a6 = S("house", y5);
		Term[] y6 = VA(ATOM_ivory, V(m), V(m), V(m), V(m));
		a7 = S("house", y6);
		Term[] y7 = VA(V(m), V(m), ATOM_snails, V(m), ATOM_winstons);
		a8 = S("house", y7);
		Term[] y8 = VA(ATOM_yellow, V(m), V(m), V(m), ATOM_kools);
		a9 = S("house", y8);
		Term[] y9 = VA(V(m), V(m), V(m), ATOM_milk, V(m));
		a10 = S("house", y9);
		a11 = CONS(V(m), Prolog.Nil);
		a12 = CONS(V(m), a11);
		a13 = CONS(a10, a12);
		a14 = CONS(V(m), a13);
		a15 = CONS(V(m), a14);
		Term[] y10 = VA(V(m), ATOM_norwegian, V(m), V(m), V(m));
		a16 = S("house", y10);
		a17 = CONS(a16, V(m));
		Term[] y11 = VA(V(m), V(m), V(m), V(m), ATOM_chesterfields);
		a18 = S("house", y11);
		Term[] y12 = VA(V(m), V(m), ATOM_fox, V(m), V(m));
		a19 = S("house", y12);
		Term[] y13 = VA(V(m), V(m), V(m), V(m), ATOM_kools);
		a20 = S("house", y13);
		Term[] y14 = VA(V(m), V(m), ATOM_horse, V(m), V(m));
		a21 = S("house", y14);
		Term[] y15 = VA(V(m), V(m), V(m), ATOM_orange_juice, ATOM_lucky_strikes);
		a22 = S("house", y15);
		Term[] y16 = VA(V(m), ATOM_japanese, V(m), V(m), ATOM_parliaments);
		a23 = S("house", y16);
		Term[] y17 = VA(V(m), ATOM_norwegian, V(m), V(m), V(m));
		a24 = S("house", y17);
		Term[] y18 = VA(ATOM_blue, V(m), V(m), V(m), V(m));
		a25 = S("house", y18);
		Term[] y19 = VA(V(m), V(m), ATOM_zebra, V(m), V(m));
		a26 = S("house", y19);
		Term[] y20 = VA(V(m), V(m), V(m), ATOM_water, V(m));
		a27 = S("house", y20);
		return //
		Op((Prolog e) -> PRED_houses_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a2, a1), //
						Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a3, a1), //
								Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a4, a1), //
										Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a5, a1), //
												Op((Prolog e) -> PRED_right_of_3_static_exec(e), VA(a6, a7, a1), //
														Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a8, a1), //
																Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a9, a1), //
																		Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a1, a15), //
																				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a1, a17), //
																						Op((Prolog e) -> PRED_next_to_3_static_exec(e), VA(a18, a19, a1), //
																								Op((Prolog e) -> PRED_next_to_3_static_exec(e), VA(a20, a21, a1), //
																										Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a22, a1), //
																												Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a23, a1), //
																														Op((Prolog e) -> PRED_next_to_3_static_exec(e), VA(a24, a25, a1), //
																																Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a26, a1), //
																																		Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a27, a1), cont)))))))))))))))));
	}

	/** PREDICATE: houses/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/

	public static Operation PRED_houses_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// houses([house(A,B,C,D,E),house(F,G,H,I,J),house(K,L,M,N,O),house(P,Q,R,S,T),house(U,V,W,X,Y)]):-true
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		a1 = LARG[0];
		// houses([house(A,B,C,D,E),house(F,G,H,I,J),house(K,L,M,N,O),house(P,Q,R,S,T),house(U,V,W,X,Y)]):-[]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a2 = argz[0];
			a3 = argz[1];
		} else if (a1.isVar()) {
			a2 = V(m);
			a3 = V(m);
			a1.bind(CONS(a2, a3), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (!a2.unify(C("house", V(m), V(m), V(m), V(m), V(m)), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a4 = argz[0];
			a5 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a5 = V(m);
			a3.bind(CONS(a4, a5), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (!a4.unify(C("house", V(m), V(m), V(m), V(m), V(m)), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a6 = argz[0];
			a7 = argz[1];
		} else if (a5.isVar()) {
			a6 = V(m);
			a7 = V(m);
			a5.bind(CONS(a6, a7), m.trail);
		} else {
			return m.fail();
		}
		a6 = a6.dref();
		if (!a6.unify(C("house", V(m), V(m), V(m), V(m), V(m)), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		if (a7.isCons()) {
			Term[] argz = VA(a7.car(), a7.cdr());
			a8 = argz[0];
			a9 = argz[1];
		} else if (a7.isVar()) {
			a8 = V(m);
			a9 = V(m);
			a7.bind(CONS(a8, a9), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C("house", V(m), V(m), V(m), V(m), V(m)), m.trail)) {
			return m.fail();
		}
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			a10 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a9.isVar()) {
			a10 = V(m);
			a9.bind(CONS(a10, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (!a10.unify(C("house", V(m), V(m), V(m), V(m), V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: right_of/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/

	public static Operation PRED_right_of_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return right_of_3_top(m);
	}

	private final static Operation right_of_3_top(Prolog m) {
		m.setB0();
		m.jtry3(null, FILE_zebra::right_of_3_sub_1);
		return right_of_3_1(m);
	}

	private final static Operation right_of_3_sub_1(Prolog m) {
		m.trust(null);
		return right_of_3_2(m);
	}

	private final static Operation right_of_3_1(Prolog m) {
		// right_of(A,B,[B,A|C]):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// right_of(A,B,[B,A|C]):-[]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(a2, a4), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a1, V(m)), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation right_of_3_2(Prolog m) {
		// right_of(A,B,[C|D]):-right_of(A,B,D)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// right_of(A,B,[C|D]):-[right_of(A,B,D)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(V(m), a4), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a1;
		m.AREGS[1] = a2;
		m.AREGS[2] = a4;
		m.cont = cont;
		return right_of_3_top(m);
	}

	/** PREDICATE: next_to/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/

	public static Operation PRED_next_to_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return next_to_3_top(m);
	}

	private final static Operation next_to_3_top(Prolog m) {
		m.setB0();
		m.jtry3(null, FILE_zebra::next_to_3_sub_1);
		return next_to_3_1(m);
	}

	private final static Operation next_to_3_sub_1(Prolog m) {
		m.retry(null, FILE_zebra::next_to_3_sub_2);
		return next_to_3_2(m);
	}

	private final static Operation next_to_3_sub_2(Prolog m) {
		m.trust(null);
		return next_to_3_3(m);
	}

	private final static Operation next_to_3_1(Prolog m) {
		// next_to(A,B,[A,B|C]):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// next_to(A,B,[A,B|C]):-[]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a2, V(m)), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation next_to_3_2(Prolog m) {
		// next_to(A,B,[B,A|C]):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// next_to(A,B,[B,A|C]):-[]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(a2, a4), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a1, V(m)), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation next_to_3_3(Prolog m) {
		// next_to(A,B,[C|D]):-next_to(A,B,D)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// next_to(A,B,[C|D]):-[next_to(A,B,D)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a4 = argz[1];
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(V(m), a4), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a1;
		m.AREGS[1] = a2;
		m.AREGS[2] = a4;
		m.cont = cont;
		return next_to_3_top(m);
	}

	/** PREDICATE: member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/

	public static Operation PRED_member_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return member_2_top(m);
	}

	private final static Operation member_2_top(Prolog m) {
		m.setB0();
		m.jtry2(null, FILE_zebra::member_2_sub_1);
		return member_2_1(m);
	}

	private final static Operation member_2_sub_1(Prolog m) {
		m.trust(null);
		return member_2_2(m);
	}

	private final static Operation member_2_1(Prolog m) {
		// member(A,[A|B]):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// member(A,[A|B]):-[]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a2.bind(CONS(a1, V(m)), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation member_2_2(Prolog m) {
		// member(A,[B|C]):-member(A,C)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// member(A,[B|C]):-[member(A,C)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a3 = argz[1];
		} else if (a2.isVar()) {
			a3 = V(m);
			a2.bind(CONS(V(m), a3), m.trail);
		} else {
			return m.fail();
		}
		m.AREGS[0] = a1;
		m.AREGS[1] = a3;
		m.cont = cont;
		return member_2_top(m);
	}

	/** PREDICATE: print_houses/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/zebra.pl
	*/
	private static final SymbolTerm PRED_print_houses_1_s1 = SYM("[]");

	public static Operation PRED_print_houses_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_zebra::print_houses_1_var, fail_0, fail_0, FILE_zebra::print_houses_1_2, fail_0, FILE_zebra::print_houses_1_1);
	}

	private final static Operation print_houses_1_var(Prolog m) {
		m.jtry1(null, FILE_zebra::print_houses_1_var_1);
		return print_houses_1_1(m);
	}

	private final static Operation print_houses_1_var_1(Prolog m) {
		m.trust(null);
		return print_houses_1_2(m);
	}

	private final static Operation print_houses_1_1(Prolog m) {
		// print_houses([A|B]):-!,write(A),nl,print_houses(B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// print_houses([A|B]):-['$neck_cut',write(A),nl,print_houses(B)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a2 = argz[0];
			a3 = argz[1];
		} else if (a1.isVar()) {
			a2 = V(m);
			a3 = V(m);
			a1.bind(CONS(a2, a3), m.trail);
		} else {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_write_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_nl_0_static_exec(e), VA(), //
						Op((Prolog e) -> PRED_print_houses_1_static_exec(e), VA(a3), cont)));
	}

	private final static Operation print_houses_1_2(Prolog m) {
		// print_houses([]):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// print_houses([]):-[]
		if (!PRED_print_houses_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_zebra::PRED_top_0_static_exec);
		PredTable.registerBuiltin("houses", 1, FILE_zebra::PRED_houses_1_static_exec);
		PredTable.registerBuiltin("right_of", 3, FILE_zebra::PRED_right_of_3_static_exec);
		PredTable.registerBuiltin("next_to", 3, FILE_zebra::PRED_next_to_3_static_exec);
		PredTable.registerBuiltin("member", 2, FILE_zebra::PRED_member_2_static_exec);
		PredTable.registerBuiltin("print_houses", 1, FILE_zebra::PRED_print_houses_1_static_exec);
	}
}
