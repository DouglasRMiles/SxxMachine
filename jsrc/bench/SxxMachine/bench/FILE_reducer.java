package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_reducer  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	final static IntegerTerm int_3 = Integer(3);
	private static final StructureTerm PRED_top_0_s4 = S("fac", int_3);
	final static IntegerTerm int_1 = Integer(1);
	final static IntegerTerm int_2 = Integer(2);
	private static final ListTerm PRED_top_0_s9 = CONS(int_2, Prolog.Nil);
	private static final ListTerm PRED_top_0_s10 = CONS(int_1, PRED_top_0_s9);
	private static final ListTerm PRED_top_0_s11 = CONS(int_3, PRED_top_0_s10);
	private static final StructureTerm PRED_top_0_s13 = S("quick", PRED_top_0_s11);

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-try(fac(3),A),try(quick([3,1,2]),B)
		m.setB0();
		// top:-[try(fac(3),A),try(quick([3,1,2]),B)]
		return //
		Op((Prolog e) -> PRED_try_2_static_exec(e), VA(PRED_top_0_s4, V(m)), //
				Op((Prolog e) -> PRED_try_2_static_exec(e), VA(PRED_top_0_s13, V(m)), cont));
	}

	/** PREDICATE: try/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_try_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// try(A,B):-listify(A,C),curry(C,D),t_reduce(D,E),make_list(E,B)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		// try(A,B):-[listify(A,C),curry(C,D),t_reduce(D,E),make_list(E,B)]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_listify_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_curry_2_static_exec(e), VA(a3, a4), //
						Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a4, a5), //
								Op((Prolog e) -> PRED_make_list_2_static_exec(e), VA(a5, a2), cont))));
	}

	/** PREDICATE: end/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_end_1_s1 = SYM("[]");

	public static Operation PRED_end_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_reducer::end_1_sub_1);
		return end_1_1(m);
	}

	private final static Operation end_1_sub_1(Prolog m) {
		m.trust(null);
		return end_1_2(m);
	}

	private final static Operation end_1_1(Prolog m) {
		// end(A):-atom(A),!
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// end(A):-['$get_level'(B),atom(A),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(1))
		a1 = a1.dref();
		if (!(a1.isSymbol())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2.dref();
		m.cut(a2.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation end_1_2(Prolog m) {
		// end(A):-A==[]
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// end(A):-['$equality_of_term'(A,[])]
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1.dref();
		if (!a1.equalsTerm(PRED_end_1_s1)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: list_functor_name/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_list_functor_name_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// list_functor_name(A):-functor([B|C],A,D)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// list_functor_name(A):-[functor([B|C],A,D)]
		a2 = CONS(V(m), V(m));
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a2, a1, V(m)), cont);
	}

	/** PREDICATE: t_def/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_def_3_s1 = SYM("fac");
	final static IntegerTerm int_0 = Integer(0);
	final static SymbolTerm ATOM_quick = SYM("quick");
	final static SymbolTerm ATOM_quick2 = SYM("quick2");
	final static SymbolTerm ATOM_split = SYM("split");
	final static SymbolTerm ATOM_inserthead = SYM("inserthead");
	final static SymbolTerm ATOM_inserttail = SYM("inserttail");
	final static SymbolTerm ATOM_append = SYM("append");

	public static Operation PRED_t_def_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::t_def_3_var, fail_0, fail_0, FILE_reducer::t_def_3_var, fail_0, fail_0);
	}

	private final static Operation t_def_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::t_def_3_var_1);
		return t_def_3_1(m);
	}

	private final static Operation t_def_3_var_1(Prolog m) {
		m.retry(null, FILE_reducer::t_def_3_var_2);
		return t_def_3_2(m);
	}

	private final static Operation t_def_3_var_2(Prolog m) {
		m.retry(null, FILE_reducer::t_def_3_var_3);
		return t_def_3_3(m);
	}

	private final static Operation t_def_3_var_3(Prolog m) {
		m.retry(null, FILE_reducer::t_def_3_var_4);
		return t_def_3_4(m);
	}

	private final static Operation t_def_3_var_4(Prolog m) {
		m.retry(null, FILE_reducer::t_def_3_var_5);
		return t_def_3_5(m);
	}

	private final static Operation t_def_3_var_5(Prolog m) {
		m.retry(null, FILE_reducer::t_def_3_var_6);
		return t_def_3_6(m);
	}

	private final static Operation t_def_3_var_6(Prolog m) {
		m.trust(null);
		return t_def_3_7(m);
	}

	private final static Operation t_def_3_1(Prolog m) {
		// t_def(fac,[A],cond(A=0,1,A*fac(A-1))):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(fac,[A],cond(A=0,1,A*fac(A-1))):-[]
		if (!PRED_t_def_3_s1.unify(a1, m.trail))
			return m.fail();
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a4 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a4, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C("cond", a5, int_1, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (!a5.unify(C("=", a4, int_0), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a7 = V(m);
		if (!a6.unify(C("*", a4, a7), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		a8 = V(m);
		if (!a7.unify(C("fac", a8), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C("-", a4, int_1), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_def_3_2(Prolog m) {
		// t_def(quick,[A],cond(A=[],[],cond(tl(A)=[],A,quick2(split(hd(A),tl(A)))))):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(quick,[A],cond(A=[],[],cond(tl(A)=[],A,quick2(split(hd(A),tl(A)))))):-[]
		if (!ATOM_quick.unify(a1, m.trail))
			return m.fail();
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a4 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a4, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C("cond", a5, Prolog.Nil, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		if (!a5.unify(C("=", a4, Prolog.Nil), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a7 = V(m);
		a8 = V(m);
		if (!a6.unify(C("cond", a7, a4, a8), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		a9 = V(m);
		if (!a7.unify(C("=", a9, Prolog.Nil), m.trail)) {
			return m.fail();
		}
		a9 = a9.dref();
		if (!a9.unify(C("tl", a4), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		if (!a8.unify(C("quick2", a10), m.trail)) {
			return m.fail();
		}
		a10 = a10.dref();
		a11 = V(m);
		a12 = V(m);
		if (!a10.unify(C("split", a11, a12), m.trail)) {
			return m.fail();
		}
		a11 = a11.dref();
		if (!a11.unify(C("hd", a4), m.trail)) {
			return m.fail();
		}
		a12 = a12.dref();
		if (!a12.unify(C("tl", a4), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_def_3_3(Prolog m) {
		// t_def(quick2,[A],append(quick(hd(A)),quick(tl(A)))):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(quick2,[A],append(quick(hd(A)),quick(tl(A)))):-[]
		if (!ATOM_quick2.unify(a1, m.trail))
			return m.fail();
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a4 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(a4, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C("append", a5, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		a7 = V(m);
		if (!a5.unify(C("quick", a7), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		if (!a7.unify(C("hd", a4), m.trail)) {
			return m.fail();
		}
		a6 = a6.dref();
		a8 = V(m);
		if (!a6.unify(C("quick", a8), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C("tl", a4), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_def_3_4(Prolog m) {
		// t_def(split,[A,B],cond(B=[],[[A]],cond(hd(B)=<A,inserthead(hd(B),split(A,tl(B))),inserttail(hd(B),split(A,tl(B)))))):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(split,[A,B],cond(B=[],[[A]],cond(hd(B)=<A,inserthead(hd(B),split(A,tl(B))),inserttail(hd(B),split(A,tl(B)))))):-[]
		if (!ATOM_split.unify(a1, m.trail))
			return m.fail();
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
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a6 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a6, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		if (!a3.unify(C("cond", a7, a8, a9), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		if (!a7.unify(C("=", a6, Prolog.Nil), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a10 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a10 = V(m);
			a8.bind(CONS(a10, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a10.bind(CONS(a4, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		a11 = V(m);
		a12 = V(m);
		a13 = V(m);
		if (!a9.unify(C("cond", a11, a12, a13), m.trail)) {
			return m.fail();
		}
		a11 = a11.dref();
		a14 = V(m);
		if (!a11.unify(C("=<", a14, a4), m.trail)) {
			return m.fail();
		}
		a14 = a14.dref();
		if (!a14.unify(C("hd", a6), m.trail)) {
			return m.fail();
		}
		a12 = a12.dref();
		a15 = V(m);
		a16 = V(m);
		if (!a12.unify(C("inserthead", a15, a16), m.trail)) {
			return m.fail();
		}
		a15 = a15.dref();
		if (!a15.unify(C("hd", a6), m.trail)) {
			return m.fail();
		}
		a16 = a16.dref();
		a17 = V(m);
		if (!a16.unify(C("split", a4, a17), m.trail)) {
			return m.fail();
		}
		a17 = a17.dref();
		if (!a17.unify(C("tl", a6), m.trail)) {
			return m.fail();
		}
		a13 = a13.dref();
		a18 = V(m);
		a19 = V(m);
		if (!a13.unify(C("inserttail", a18, a19), m.trail)) {
			return m.fail();
		}
		a18 = a18.dref();
		if (!a18.unify(C("hd", a6), m.trail)) {
			return m.fail();
		}
		a19 = a19.dref();
		a20 = V(m);
		if (!a19.unify(C("split", a4, a20), m.trail)) {
			return m.fail();
		}
		a20 = a20.dref();
		if (!a20.unify(C("tl", a6), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_def_3_5(Prolog m) {
		// t_def(inserthead,[A,B],[[A|hd(B)]|tl(B)]):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(inserthead,[A,B],[[A|hd(B)]|tl(B)]):-[]
		if (!ATOM_inserthead.unify(a1, m.trail))
			return m.fail();
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
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a6 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a6, Prolog.Nil), m.trail);
		} else {
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
		a7 = a7.dref();
		if (a7.isCons()) {
			Term[] argz = VA(a7.car(), a7.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a9 = argz[1];
		} else if (a7.isVar()) {
			a9 = V(m);
			a7.bind(CONS(a4, a9), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		if (!a9.unify(C("hd", a6), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C("tl", a6), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_def_3_6(Prolog m) {
		// t_def(inserttail,[A,B],[hd(B),A|tl(B)]):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(inserttail,[A,B],[hd(B),A|tl(B)]):-[]
		if (!ATOM_inserttail.unify(a1, m.trail))
			return m.fail();
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
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a6 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a6, Prolog.Nil), m.trail);
		} else {
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
		a7 = a7.dref();
		if (!a7.unify(C("hd", a6), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			if (!a4.unify(argz[0], m.trail))
				return m.fail();
			a9 = argz[1];
		} else if (a8.isVar()) {
			a9 = V(m);
			a8.bind(CONS(a4, a9), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		if (!a9.unify(C("tl", a6), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_def_3_7(Prolog m) {
		// t_def(append,[A,B],cond(A=[],B,[hd(A)|append(tl(A),B)])):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_def(append,[A,B],cond(A=[],B,[hd(A)|append(tl(A),B)])):-[]
		if (!ATOM_append.unify(a1, m.trail))
			return m.fail();
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
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a6 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a6, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		a7 = V(m);
		a8 = V(m);
		if (!a3.unify(C("cond", a7, a6, a8), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		if (!a7.unify(C("=", a4, Prolog.Nil), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			a10 = argz[1];
		} else if (a8.isVar()) {
			a9 = V(m);
			a10 = V(m);
			a8.bind(CONS(a9, a10), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		if (!a9.unify(C("hd", a4), m.trail)) {
			return m.fail();
		}
		a10 = a10.dref();
		a11 = V(m);
		if (!a10.unify(C("append", a11, a6), m.trail)) {
			return m.fail();
		}
		a11 = a11.dref();
		if (!a11.unify(C("tl", a4), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: t_reduce/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_t_reduce_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::t_reduce_2_var, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_int, FILE_reducer::t_reduce_2_var);
	}

	private final static Operation t_reduce_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::t_reduce_2_var_1);
		return t_reduce_2_1(m);
	}

	private final static Operation t_reduce_2_var_1(Prolog m) {
		m.retry(null, FILE_reducer::t_reduce_2_var_2);
		return t_reduce_2_2(m);
	}

	private final static Operation t_reduce_2_var_2(Prolog m) {
		m.trust(null);
		return t_reduce_2_3(m);
	}

	private final static Operation t_reduce_2_int(Prolog m) {
		m.jtry2(null, FILE_reducer::t_reduce_2_int_1);
		return t_reduce_2_1(m);
	}

	private final static Operation t_reduce_2_int_1(Prolog m) {
		m.trust(null);
		return t_reduce_2_3(m);
	}

	private final static Operation t_reduce_2_1(Prolog m) {
		// t_reduce(A,B):-atomic(A),!,B=A
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_reduce(A,B):-['$get_level'(C),atomic(A),'$cut'(C),'$unify'(B,A)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(2),a(1))
		if (!a2.unify(a1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation t_reduce_2_2(Prolog m) {
		// t_reduce([A,B|C],[D,E|C]):-list_functor_name(C),t_reduce(B,E),!,t_reduce(A,D),!
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_reduce([A,B|C],[D,E|C]):-['$get_level'(F),list_functor_name(C),t_reduce(B,E),'$cut'(F),t_reduce(A,D),'$cut'(F)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a7 = argz[0];
			a8 = argz[1];
		} else if (a2.isVar()) {
			a7 = V(m);
			a8 = V(m);
			a2.bind(CONS(a7, a8), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			if (!a6.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a9 = V(m);
			a8.bind(CONS(a9, a6), m.trail);
		} else {
			return m.fail();
		}
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_list_functor_name_1_static_exec(e), VA(a6), //
				Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a5, a9), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a10), //
								Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a7), //
										Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a10), cont)))));
	}

	private final static Operation t_reduce_2_3(Prolog m) {
		// t_reduce(A,B):-t_append(C,D,E,A),t_redex(E,D),!,t_reduce(C,B),!
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_reduce(A,B):-['$get_level'(C),t_append(D,E,F,A),t_redex(F,E),'$cut'(C),t_reduce(D,B),'$cut'(C)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_t_append_4_static_exec(e), VA(a4, a5, a6, a1), //
				Op((Prolog e) -> PRED_t_redex_2_static_exec(e), VA(a6, a5), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
								Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a4, a2), //
										Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont)))));
	}

	/** PREDICATE: t_append/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_t_append_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return t_append_4_top(m);
	}

	private final static Operation t_append_4_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_reducer::t_append_4_var, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_1, FILE_reducer::t_append_4_var);
	}

	private final static Operation t_append_4_var(Prolog m) {
		m.jtry4(null, FILE_reducer::t_append_4_var_1);
		return t_append_4_1(m);
	}

	private final static Operation t_append_4_var_1(Prolog m) {
		m.trust(null);
		return t_append_4_2(m);
	}

	private final static Operation t_append_4_1(Prolog m) {
		// t_append(A,A,B,B):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_append(A,A,B,B):-[]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation t_append_4_2(Prolog m) {
		// t_append([A|B],C,D,[A|E]):-t_append(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_append([A|B],C,D,[A|E]):-[t_append(B,C,D,E)]
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
		m.AREGS[0] = a6;
		m.AREGS[1] = a2;
		m.AREGS[2] = a3;
		m.AREGS[3] = a7;
		m.cont = cont;
		return t_append_4_top(m);
	}

	/** PREDICATE: t_redex/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_redex_2_s1 = SYM("sp");
	final static SymbolTerm ATOM_bp = SYM("bp");
	final static SymbolTerm ATOM_cp = SYM("cp");
	final static SymbolTerm ATOM_s = SYM("s");
	final static SymbolTerm ATOM_b = SYM("b");
	final static SymbolTerm ATOM_c = SYM("c");
	final static SymbolTerm ATOM_k = SYM("k");
	final static SymbolTerm ATOM_i = SYM("i");
	final static SymbolTerm ATOM_cond = SYM("cond");
	final static SymbolTerm ATOM_apply = SYM("apply");
	final static SymbolTerm ATOM_hd = SYM("hd");
	final static SymbolTerm ATOM_tl = SYM("tl");
	final static SymbolTerm ATOM_$002B = SYM("+");
	final static SymbolTerm ATOM_$002D = SYM("-");
	final static SymbolTerm ATOM_$002A = SYM("*");
	final static SymbolTerm ATOM_$002F$002F = SYM("//");
	final static SymbolTerm ATOM_mod = SYM("mod");
	private static final ListTerm PRED_t_redex_2_s20 = CONS(ATOM_mod, Prolog.Nil);
	private static final ListTerm PRED_t_redex_2_s21 = CONS(ATOM_$002F$002F, PRED_t_redex_2_s20);
	private static final ListTerm PRED_t_redex_2_s22 = CONS(ATOM_$002A, PRED_t_redex_2_s21);
	private static final ListTerm PRED_t_redex_2_s23 = CONS(ATOM_$002D, PRED_t_redex_2_s22);
	private static final ListTerm PRED_t_redex_2_s24 = CONS(ATOM_$002B, PRED_t_redex_2_s23);
	final static SymbolTerm ATOM_smallerthan = SYM("<");
	final static SymbolTerm ATOM_greaterthan = SYM(">");
	final static SymbolTerm ATOM_smallerorequal = SYM("=<");
	final static SymbolTerm ATOM_greaterorequal = SYM(">=");
	final static SymbolTerm ATOM_$003D$005C$003D = SYM("=\\=");
	final static SymbolTerm ATOM_arithequal = SYM("=:=");
	private static final ListTerm PRED_t_redex_2_s31 = CONS(ATOM_arithequal, Prolog.Nil);
	private static final ListTerm PRED_t_redex_2_s32 = CONS(ATOM_$003D$005C$003D, PRED_t_redex_2_s31);
	private static final ListTerm PRED_t_redex_2_s33 = CONS(ATOM_greaterorequal, PRED_t_redex_2_s32);
	private static final ListTerm PRED_t_redex_2_s34 = CONS(ATOM_smallerorequal, PRED_t_redex_2_s33);
	private static final ListTerm PRED_t_redex_2_s35 = CONS(ATOM_greaterthan, PRED_t_redex_2_s34);
	private static final ListTerm PRED_t_redex_2_s36 = CONS(ATOM_smallerthan, PRED_t_redex_2_s35);
	final static SymbolTerm ATOM_unify = SYM("=");
	private static final ListTerm PRED_t_redex_2_s38 = CONS(ATOM_$002D, Prolog.Nil);

	public static Operation PRED_t_redex_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::t_redex_2_var, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_18, FILE_reducer::t_redex_2_var);
	}

	private final static Operation t_redex_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::t_redex_2_var_1);
		return t_redex_2_1(m);
	}

	private final static Operation t_redex_2_var_1(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_2);
		return t_redex_2_2(m);
	}

	private final static Operation t_redex_2_var_2(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_3);
		return t_redex_2_3(m);
	}

	private final static Operation t_redex_2_var_3(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_4);
		return t_redex_2_4(m);
	}

	private final static Operation t_redex_2_var_4(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_5);
		return t_redex_2_5(m);
	}

	private final static Operation t_redex_2_var_5(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_6);
		return t_redex_2_6(m);
	}

	private final static Operation t_redex_2_var_6(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_7);
		return t_redex_2_7(m);
	}

	private final static Operation t_redex_2_var_7(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_8);
		return t_redex_2_8(m);
	}

	private final static Operation t_redex_2_var_8(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_9);
		return t_redex_2_9(m);
	}

	private final static Operation t_redex_2_var_9(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_10);
		return t_redex_2_10(m);
	}

	private final static Operation t_redex_2_var_10(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_11);
		return t_redex_2_11(m);
	}

	private final static Operation t_redex_2_var_11(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_12);
		return t_redex_2_12(m);
	}

	private final static Operation t_redex_2_var_12(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_13);
		return t_redex_2_13(m);
	}

	private final static Operation t_redex_2_var_13(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_14);
		return t_redex_2_14(m);
	}

	private final static Operation t_redex_2_var_14(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_15);
		return t_redex_2_15(m);
	}

	private final static Operation t_redex_2_var_15(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_16);
		return t_redex_2_16(m);
	}

	private final static Operation t_redex_2_var_16(Prolog m) {
		m.retry(null, FILE_reducer::t_redex_2_var_17);
		return t_redex_2_17(m);
	}

	private final static Operation t_redex_2_var_17(Prolog m) {
		m.trust(null);
		return t_redex_2_18(m);
	}

	private final static Operation t_redex_2_1(Prolog m) {
		// t_redex([A,B,C,D|sp],[[E|B],[E|C]|D]):-t_reduce(A,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C,D|sp],[[E|B],[E|C]|D]):-[t_reduce(A,E)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
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
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			if (!PRED_t_redex_2_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a9 = V(m);
			a8.bind(CONS(a9, PRED_t_redex_2_s1), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a2.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a2.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			a12 = argz[0];
			if (!a5.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a12 = V(m);
			a10.bind(CONS(a12, a5), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			a13 = argz[0];
			if (!a9.unify(argz[1], m.trail))
				return m.fail();
		} else if (a11.isVar()) {
			a13 = V(m);
			a11.bind(CONS(a13, a9), m.trail);
		} else {
			return m.fail();
		}
		a13 = a13.dref();
		if (a13.isCons()) {
			Term[] argz = VA(a13.car(), a13.cdr());
			if (!a12.unify(argz[0], m.trail))
				return m.fail();
			if (!a7.unify(argz[1], m.trail))
				return m.fail();
		} else if (a13.isVar()) {
			a13.bind(CONS(a12, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a12), cont);
	}

	private final static Operation t_redex_2_2(Prolog m) {
		// t_redex([A,B,C,D|bp],[[A|B],C|D]):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C,D|bp],[[A|B],C|D]):-[]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
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
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			if (!ATOM_bp.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a9 = V(m);
			a8.bind(CONS(a9, ATOM_bp), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a2.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a2.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a5.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a10.bind(CONS(a3, a5), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			if (!a7.unify(argz[0], m.trail))
				return m.fail();
			if (!a9.unify(argz[1], m.trail))
				return m.fail();
		} else if (a11.isVar()) {
			a11.bind(CONS(a7, a9), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_redex_2_3(Prolog m) {
		// t_redex([A,B,C,D|cp],[B,[A|C]|D]):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C,D|cp],[B,[A|C]|D]):-[]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
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
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			if (!ATOM_cp.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a9 = V(m);
			a8.bind(CONS(a9, ATOM_cp), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a5.unify(argz[0], m.trail))
				return m.fail();
			a10 = argz[1];
		} else if (a2.isVar()) {
			a10 = V(m);
			a2.bind(CONS(a5, a10), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			a11 = argz[0];
			if (!a9.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a11 = V(m);
			a10.bind(CONS(a11, a9), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a7.unify(argz[1], m.trail))
				return m.fail();
		} else if (a11.isVar()) {
			a11.bind(CONS(a3, a7), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_redex_2_4(Prolog m) {
		// t_redex([A,B,C|s],[[D|B],D|C]):-t_reduce(A,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C|s],[[D|B],D|C]):-[t_reduce(A,D)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			a7 = argz[0];
			if (!ATOM_s.unify(argz[1], m.trail))
				return m.fail();
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a7, ATOM_s), m.trail);
		} else {
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
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a10 = argz[0];
			if (!a5.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a10 = V(m);
			a8.bind(CONS(a10, a5), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			if (!a10.unify(argz[0], m.trail))
				return m.fail();
			if (!a7.unify(argz[1], m.trail))
				return m.fail();
		} else if (a9.isVar()) {
			a9.bind(CONS(a10, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a10), cont);
	}

	private final static Operation t_redex_2_5(Prolog m) {
		// t_redex([A,B,C|b],[[A|B]|C]):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C|b],[[A|B]|C]):-[]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			a7 = argz[0];
			if (!ATOM_b.unify(argz[1], m.trail))
				return m.fail();
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a7, ATOM_b), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a8 = argz[0];
			if (!a7.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a8 = V(m);
			a2.bind(CONS(a8, a7), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a5.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a8.bind(CONS(a3, a5), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_redex_2_6(Prolog m) {
		// t_redex([A,B,C|c],[B,A|C]):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C|c],[B,A|C]):-[]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			a7 = argz[0];
			if (!ATOM_c.unify(argz[1], m.trail))
				return m.fail();
		} else if (a6.isVar()) {
			a7 = V(m);
			a6.bind(CONS(a7, ATOM_c), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a5.unify(argz[0], m.trail))
				return m.fail();
			a8 = argz[1];
		} else if (a2.isVar()) {
			a8 = V(m);
			a2.bind(CONS(a5, a8), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a7.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a8.bind(CONS(a3, a7), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation t_redex_2_7(Prolog m) {
		// t_redex([A,B|k],B):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B|k],B):-[]
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
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a4 = argz[0];
			if (!ATOM_k.unify(argz[1], m.trail))
				return m.fail();
		} else if (a3.isVar()) {
			a4 = V(m);
			a3.bind(CONS(a4, ATOM_k), m.trail);
		} else {
			return m.fail();
		}
		if (!a4.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation t_redex_2_8(Prolog m) {
		// t_redex([A|i],A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A|i],A):-[]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			if (!ATOM_i.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, ATOM_i), m.trail);
		} else {
			return m.fail();
		}
		if (!a3.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation t_redex_2_9(Prolog m) {
		// t_redex([A,B,C|cond],B):-t_reduce(C,D),D=true,!
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C|cond],B):-['$get_level'(D),t_reduce(C,E),'$unify'(E,true),'$cut'(D)]
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
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			a6 = argz[0];
			if (!ATOM_cond.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a6 = V(m);
			a5.bind(CONS(a6, ATOM_cond), m.trail);
		} else {
			return m.fail();
		}
		if (!a4.unify(a2, m.trail))
			return m.fail();
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a6, a8), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a8, Prolog.True), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a7), cont)));
	}

	private final static Operation t_redex_2_10(Prolog m) {
		// t_redex([A,B,C|cond],A):-true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B,C|cond],A):-[]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a4.bind(CONS(V(m), a5), m.trail);
		} else {
			return m.fail();
		}
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			if (!ATOM_cond.unify(argz[1], m.trail))
				return m.fail();
		} else if (a5.isVar()) {
			a5.bind(CONS(V(m), ATOM_cond), m.trail);
		} else {
			return m.fail();
		}
		if (!a3.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation t_redex_2_11(Prolog m) {
		// t_redex([A|apply],B):-t_reduce(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A|apply],B):-[t_reduce(A,B)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			if (!ATOM_apply.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, ATOM_apply), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a2), cont);
	}

	private final static Operation t_redex_2_12(Prolog m) {
		// t_redex([A|hd],B):-list_functor_name(C),t_reduce(A,[D,B|C])
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A|hd],B):-[list_functor_name(C),t_reduce(A,[D,B|C])]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			if (!ATOM_hd.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, ATOM_hd), m.trail);
		} else {
			return m.fail();
		}
		a4 = V(m);
		a5 = CONS(a2, a4);
		a6 = CONS(V(m), a5);
		return //
		Op((Prolog e) -> PRED_list_functor_name_1_static_exec(e), VA(a4), //
				Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a6), cont));
	}

	private final static Operation t_redex_2_13(Prolog m) {
		// t_redex([A|tl],B):-list_functor_name(C),t_reduce(A,[B,D|C])
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A|tl],B):-[list_functor_name(C),t_reduce(A,[B,D|C])]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			if (!ATOM_tl.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, ATOM_tl), m.trail);
		} else {
			return m.fail();
		}
		a4 = V(m);
		a5 = CONS(V(m), a4);
		a6 = CONS(a2, a5);
		return //
		Op((Prolog e) -> PRED_list_functor_name_1_static_exec(e), VA(a4), //
				Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a6), cont));
	}

	private final static Operation t_redex_2_14(Prolog m) {
		// t_redex([A,B|C],D):-end(C),member(C,[+,-,*,//,mod]),t_reduce(B,E),t_reduce(A,F),number(E),number(F),eval(C,D,E,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B|C],D):-[end(C),member(C,[+,-,*,//,mod]),t_reduce(B,E),t_reduce(A,F),number(E),number(F),eval(C,D,E,F)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a7 = V(m);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_end_1_static_exec(e), VA(a6), //
				Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a6, PRED_t_redex_2_s24), //
						Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a5, a7), //
								Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a8), //
										Op((Prolog e) -> PRED_number_1_static_exec(e), VA(a7), //
												Op((Prolog e) -> PRED_number_1_static_exec(e), VA(a8), //
														Op((Prolog e) -> PRED_eval_4_static_exec(e), VA(a6, a2, a7, a8), cont)))))));
	}

	private final static Operation t_redex_2_15(Prolog m) {
		// t_redex([A,B|C],D):-end(C),member(C,[<,>,=<,>=,=\=,=:=]),t_reduce(B,E),t_reduce(A,F),number(E),number(F),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(C,D,E,F),!
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B|C],D):-['$get_level'(E),end(C),member(C,[<,>,=<,>=,=\=,=:=]),t_reduce(B,F),t_reduce(A,G),number(F),number(G),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(C,D,F,G),'$cut'(E)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a8 = V(m);
		a9 = V(m);
		return //
		Op((Prolog e) -> PRED_end_1_static_exec(e), VA(a6), //
				Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a6, PRED_t_redex_2_s36), //
						Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a5, a8), //
								Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a9), //
										Op((Prolog e) -> PRED_number_1_static_exec(e), VA(a8), //
												Op((Prolog e) -> PRED_number_1_static_exec(e), VA(a9), //
														Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_static_exec(e), VA(a6, a2, a8, a9), //
																Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a7), cont))))))));
	}

	private final static Operation t_redex_2_16(Prolog m) {
		// t_redex([A,B|=],C):-t_reduce(B,D),t_reduce(A,E),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(C,D,E),!
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex([A,B|=],C):-['$get_level'(D),t_reduce(B,E),t_reduce(A,F),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(C,E,F),'$cut'(D)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			if (!ATOM_unify.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a5 = V(m);
			a4.bind(CONS(a5, ATOM_unify), m.trail);
		} else {
			return m.fail();
		}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a5, a7), //
				Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a8), //
						Op((Prolog e) -> PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_static_exec(e), VA(a2, a7, a8), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a6), cont))));
	}

	private final static Operation t_redex_2_17(Prolog m) {
		// t_redex([A|B],C):-end(B),member(B,[-]),t_reduce(A,D),number(D),eval1(B,E,D)
		Term a1, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// t_redex([A|B],C):-[end(B),member(B,[-]),t_reduce(A,D),number(D),eval1(B,E,D)]
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
		Op((Prolog e) -> PRED_end_1_static_exec(e), VA(a4), //
				Op((Prolog e) -> PRED_member_2_static_exec(e), VA(a4, PRED_t_redex_2_s38), //
						Op((Prolog e) -> PRED_t_reduce_2_static_exec(e), VA(a3, a5), //
								Op((Prolog e) -> PRED_number_1_static_exec(e), VA(a5), //
										Op((Prolog e) -> PRED_eval1_3_static_exec(e), VA(a4, V(m), a5), cont)))));
	}

	private final static Operation t_redex_2_18(Prolog m) {
		// t_redex(A,B):-append(C,D,A),end(D),t_def(D,E,F),t(E,F,G),append(C,G,B)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_redex(A,B):-[append(C,D,A),end(D),t_def(D,E,F),t(E,F,G),append(C,G,B)]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		return //
		Op((Prolog e) -> PRED_append_3_static_exec(e), VA(a3, a4, a1), //
				Op((Prolog e) -> PRED_end_1_static_exec(e), VA(a4), //
						Op((Prolog e) -> PRED_t_def_3_static_exec(e), VA(a4, a5, a6), //
								Op((Prolog e) -> PRED_t_3_static_exec(e), VA(a5, a6, a7), //
										Op((Prolog e) -> PRED_append_3_static_exec(e), VA(a3, a7, a2), cont)))));
	}

	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_s1 = SYM("true");
	final static SymbolTerm ATOM_false = SYM("false");

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry4(null, FILE_reducer::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D):-relop(A,C,D),!,B=true
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D):-['$get_level'(E),relop(A,C,D),'$cut'(E),'$unify'(B,true)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_relop_3_static_exec(e), VA(a1, a3, a4), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a5), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_s1), cont)));
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_2(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D):-B=false
		Term a2;
		Operation cont;
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D):-['$unify'(B,false)]
		//START inline expansion of $unify(a(2),@(ATOM_false))
		if (!a2.unify(ATOM_false, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_s1 = SYM("true");

	public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_reducer::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_1(m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_2(m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_1(Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C):-B=C,!,A=true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C):-['$get_level'(D),'$unify'(B,C),'$cut'(D),'$unify'(A,true)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(2),a(3))
		if (!a2.unify(a3, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(1),s(1))
		if (!a1.unify(PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_2(Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C):-A=false
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C):-['$unify'(A,false)]
		//START inline expansion of $unify(a(1),@(ATOM_false))
		if (!a1.unify(ATOM_false, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: eval/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_eval_4_s1 = SYM("+");

	public static Operation PRED_eval_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::eval_4_var, fail_0, fail_0, FILE_reducer::eval_4_var, fail_0, fail_0);
	}

	private final static Operation eval_4_var(Prolog m) {
		m.jtry4(null, FILE_reducer::eval_4_var_1);
		return eval_4_1(m);
	}

	private final static Operation eval_4_var_1(Prolog m) {
		m.retry(null, FILE_reducer::eval_4_var_2);
		return eval_4_2(m);
	}

	private final static Operation eval_4_var_2(Prolog m) {
		m.retry(null, FILE_reducer::eval_4_var_3);
		return eval_4_3(m);
	}

	private final static Operation eval_4_var_3(Prolog m) {
		m.retry(null, FILE_reducer::eval_4_var_4);
		return eval_4_4(m);
	}

	private final static Operation eval_4_var_4(Prolog m) {
		m.trust(null);
		return eval_4_5(m);
	}

	private final static Operation eval_4_1(Prolog m) {
		// eval(+,A,B,C):-A is B+C
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// eval(+,A,B,C):-[A is B+C]
		if (!PRED_eval_4_s1.unify(a1, m.trail))
			return m.fail();
		Term[] y1 = VA(a3, a4);
		a5 = S("+", y1);
		//START inline expansion of a(2)is a(5)
		if (!a2.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation eval_4_2(Prolog m) {
		// eval(-,A,B,C):-A is B-C
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// eval(-,A,B,C):-[A is B-C]
		if (!ATOM_$002D.unify(a1, m.trail))
			return m.fail();
		Term[] y1 = VA(a3, a4);
		a5 = S("-", y1);
		//START inline expansion of a(2)is a(5)
		if (!a2.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation eval_4_3(Prolog m) {
		// eval(*,A,B,C):-A is B*C
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// eval(*,A,B,C):-[A is B*C]
		if (!ATOM_$002A.unify(a1, m.trail))
			return m.fail();
		Term[] y1 = VA(a3, a4);
		a5 = S("*", y1);
		//START inline expansion of a(2)is a(5)
		if (!a2.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation eval_4_4(Prolog m) {
		// eval(//,A,B,C):-A is B//C
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// eval(//,A,B,C):-[A is B//C]
		if (!ATOM_$002F$002F.unify(a1, m.trail))
			return m.fail();
		Term[] y1 = VA(a3, a4);
		a5 = S("//", y1);
		//START inline expansion of a(2)is a(5)
		if (!a2.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation eval_4_5(Prolog m) {
		// eval(mod,A,B,C):-A is B mod C
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// eval(mod,A,B,C):-[A is B mod C]
		if (!ATOM_mod.unify(a1, m.trail))
			return m.fail();
		Term[] y1 = VA(a3, a4);
		a5 = S("mod", y1);
		//START inline expansion of a(2)is a(5)
		if (!a2.unify(Arithmetic.evaluate(a5), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: eval1/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_eval1_3_s1 = SYM("-");

	public static Operation PRED_eval1_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// eval1(-,A,B):-A is -B
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// eval1(-,A,B):-[A is -B]
		if (!PRED_eval1_3_s1.unify(a1, m.trail))
			return m.fail();
		Term[] y1 = VA(a3);
		a4 = S("-", y1);
		//START inline expansion of a(2)is a(4)
		if (!a2.unify(Arithmetic.evaluate(a4), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: relop/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_relop_3_s1 = SYM("<");

	public static Operation PRED_relop_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::relop_3_var, fail_0, fail_0, FILE_reducer::relop_3_var, fail_0, fail_0);
	}

	private final static Operation relop_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::relop_3_var_1);
		return relop_3_1(m);
	}

	private final static Operation relop_3_var_1(Prolog m) {
		m.retry(null, FILE_reducer::relop_3_var_2);
		return relop_3_2(m);
	}

	private final static Operation relop_3_var_2(Prolog m) {
		m.retry(null, FILE_reducer::relop_3_var_3);
		return relop_3_3(m);
	}

	private final static Operation relop_3_var_3(Prolog m) {
		m.retry(null, FILE_reducer::relop_3_var_4);
		return relop_3_4(m);
	}

	private final static Operation relop_3_var_4(Prolog m) {
		m.retry(null, FILE_reducer::relop_3_var_5);
		return relop_3_5(m);
	}

	private final static Operation relop_3_var_5(Prolog m) {
		m.trust(null);
		return relop_3_6(m);
	}

	private final static Operation relop_3_1(Prolog m) {
		// relop(<,A,B):-A<B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// relop(<,A,B):-['$less_than'(A,B)]
		if (!PRED_relop_3_s1.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $less_than(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) >= 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation relop_3_2(Prolog m) {
		// relop(>,A,B):-A>B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// relop(>,A,B):-['$greater_than'(A,B)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $greater_than(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation relop_3_3(Prolog m) {
		// relop(=<,A,B):-A=<B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// relop(=<,A,B):-['$less_or_equal'(A,B)]
		if (!ATOM_smallerorequal.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $less_or_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation relop_3_4(Prolog m) {
		// relop(>=,A,B):-A>=B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// relop(>=,A,B):-['$greater_or_equal'(A,B)]
		if (!ATOM_greaterorequal.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $greater_or_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) < 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation relop_3_5(Prolog m) {
		// relop(=\=,A,B):-A=\=B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// relop(=\=,A,B):-['$arith_not_equal'(A,B)]
		if (!ATOM_$003D$005C$003D.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $arith_not_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) == 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation relop_3_6(Prolog m) {
		// relop(=:=,A,B):-A=:=B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// relop(=:=,A,B):-['$arith_equal'(A,B)]
		if (!ATOM_arithequal.unify(a1, m.trail))
			return m.fail();
		//START inline expansion of $arith_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) != 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: t/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_t_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// t(A,B,C):-listify(B,D),curry(D,E),t_argvars(A,E,C),!
		m.setB0();
		Term a1, a2, a3, a4, a5, a6;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// t(A,B,C):-['$get_level'(D),listify(B,E),curry(E,F),t_argvars(A,F,C),'$cut'(D)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_listify_2_static_exec(e), VA(a2, a5), //
				Op((Prolog e) -> PRED_curry_2_static_exec(e), VA(a5, a6), //
						Op((Prolog e) -> PRED_t_argvars_3_static_exec(e), VA(a1, a6, a3), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), cont))));
	}

	/** PREDICATE: t_argvars/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_argvars_3_s1 = SYM("[]");

	public static Operation PRED_t_argvars_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return t_argvars_3_top(m);
	}

	private final static Operation t_argvars_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_reducer::t_argvars_3_var, fail_0, fail_0, FILE_reducer::t_argvars_3_1, fail_0, FILE_reducer::t_argvars_3_2);
	}

	private final static Operation t_argvars_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::t_argvars_3_var_1);
		return t_argvars_3_1(m);
	}

	private final static Operation t_argvars_3_var_1(Prolog m) {
		m.trust(null);
		return t_argvars_3_2(m);
	}

	private final static Operation t_argvars_3_1(Prolog m) {
		// t_argvars([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_argvars([],A,A):-[]
		if (!PRED_t_argvars_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation t_argvars_3_2(Prolog m) {
		// t_argvars([A|B],C,D):-t_argvars(B,C,E),t_vars(E,F),t_trans(A,E,F,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation p2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// t_argvars([A|B],C,D):-[t_argvars(B,C,E),t_vars(E,F),t_trans(A,E,F,D)]
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
		p2 = //
				Op((Prolog e) -> PRED_t_vars_2_static_exec(e), VA(a6, a7), //
						Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a4, a6, a7, a3), cont));
		m.AREGS[0] = a5;
		m.AREGS[1] = a2;
		m.AREGS[2] = a6;
		m.cont = p2;
		return t_argvars_3_top(m);
	}

	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_reducer::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_1(m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_2(m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_1(Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-var(A)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-[var(A)]
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_2(Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-atomic(A)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-[atomic(A)]
		//START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: curry/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_curry_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::curry_2_var, FILE_reducer::curry_2_1, FILE_reducer::curry_2_1, FILE_reducer::curry_2_1, FILE_reducer::curry_2_1, FILE_reducer::curry_2_var);
	}

	private final static Operation curry_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::curry_2_var_1);
		return curry_2_1(m);
	}

	private final static Operation curry_2_var_1(Prolog m) {
		m.trust(null);
		return curry_2_2(m);
	}

	private final static Operation curry_2_1(Prolog m) {
		// curry(A,A):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A),!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// curry(A,A):-['$get_level'(B),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A),'$cut'(B)]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont));
	}

	private final static Operation curry_2_2(Prolog m) {
		// curry([A|B],C):-currylist(B,C,A)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// curry([A|B],C):-[currylist(B,C,A)]
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
		Op((Prolog e) -> PRED_currylist_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	/** PREDICATE: currylist/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_currylist_3_s1 = SYM("[]");

	public static Operation PRED_currylist_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::currylist_3_var, fail_0, fail_0, FILE_reducer::currylist_3_1, fail_0, FILE_reducer::currylist_3_2);
	}

	private final static Operation currylist_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::currylist_3_var_1);
		return currylist_3_1(m);
	}

	private final static Operation currylist_3_var_1(Prolog m) {
		m.trust(null);
		return currylist_3_2(m);
	}

	private final static Operation currylist_3_1(Prolog m) {
		// currylist([],A,A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// currylist([],A,A):-['$neck_cut']
		if (!PRED_currylist_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation currylist_3_2(Prolog m) {
		// currylist([A|B],C,D):-curry(A,E),currylist(B,C,[E|D])
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// currylist([A|B],C,D):-[curry(A,E),currylist(B,C,[E|D])]
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
		a7 = CONS(a6, a3);
		return //
		Op((Prolog e) -> PRED_curry_2_static_exec(e), VA(a4, a6), //
				Op((Prolog e) -> PRED_currylist_3_static_exec(e), VA(a5, a2, a7), cont));
	}

	/** PREDICATE: t_vars/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_vars_2_s1 = SYM("[]");
	private static final ListTerm PRED_t_vars_2_s2 = CONS(PRED_t_vars_2_s1, PRED_t_vars_2_s1);

	public static Operation PRED_t_vars_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return t_vars_2_top(m);
	}

	private final static Operation t_vars_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_reducer::t_vars_2_var, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_int, FILE_reducer::t_vars_2_var);
	}

	private final static Operation t_vars_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::t_vars_2_var_1);
		return t_vars_2_1(m);
	}

	private final static Operation t_vars_2_var_1(Prolog m) {
		m.retry(null, FILE_reducer::t_vars_2_var_2);
		return t_vars_2_2(m);
	}

	private final static Operation t_vars_2_var_2(Prolog m) {
		m.retry(null, FILE_reducer::t_vars_2_var_3);
		return t_vars_2_3(m);
	}

	private final static Operation t_vars_2_var_3(Prolog m) {
		m.trust(null);
		return t_vars_2_4(m);
	}

	private final static Operation t_vars_2_int(Prolog m) {
		m.jtry2(null, FILE_reducer::t_vars_2_int_1);
		return t_vars_2_1(m);
	}

	private final static Operation t_vars_2_int_1(Prolog m) {
		m.trust(null);
		return t_vars_2_2(m);
	}

	private final static Operation t_vars_2_1(Prolog m) {
		// t_vars(A,[[A]]):-var(A),!
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_vars(A,[[A]]):-['$get_level'(B),var(A),'$cut'(B)]
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a3 = argz[0];
			if (!PRED_t_vars_2_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a2.isVar()) {
			a3 = V(m);
			a2.bind(CONS(a3, PRED_t_vars_2_s1), m.trail);
		} else {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_t_vars_2_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a3.isVar()) {
			a3.bind(CONS(a1, PRED_t_vars_2_s1), m.trail);
		} else {
			return m.fail();
		}
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
		return cont;
	}

	private final static Operation t_vars_2_2(Prolog m) {
		// t_vars(A,[[]]):-atomic(A),!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_vars(A,[[]]):-['$get_level'(B),atomic(A),'$cut'(B)]
		if (!PRED_t_vars_2_s2.unify(a2, m.trail))
			return m.fail();
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation t_vars_2_3(Prolog m) {
		// t_vars([A],[[]]):-atomic(A),!
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_vars([A],[[]]):-['$get_level'(B),atomic(A),'$cut'(B)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			if (!PRED_t_vars_2_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, PRED_t_vars_2_s1), m.trail);
		} else {
			return m.fail();
		}
		if (!PRED_t_vars_2_s2.unify(a2, m.trail))
			return m.fail();
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(3))
		a3 = a3.dref();
		if (!a3.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation t_vars_2_4(Prolog m) {
		// t_vars([A|B],[C,[D|E],[F|G]]):-t_vars(A,[D|E]),t_vars(B,[F|G]),unionv(D,F,C)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation p2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// t_vars([A|B],[C,[D|E],[F|G]]):-[t_vars(A,[D|E]),t_vars(B,[F|G]),unionv(D,F,C)]
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
		a7 = a7.dref();
		if (a7.isCons()) {
			Term[] argz = VA(a7.car(), a7.cdr());
			a9 = argz[0];
			a10 = argz[1];
		} else if (a7.isVar()) {
			a9 = V(m);
			a10 = V(m);
			a7.bind(CONS(a9, a10), m.trail);
		} else {
			return m.fail();
		}
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a11 = argz[0];
			if (!PRED_t_vars_2_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a8.isVar()) {
			a11 = V(m);
			a8.bind(CONS(a11, PRED_t_vars_2_s1), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			a12 = argz[0];
			a13 = argz[1];
		} else if (a11.isVar()) {
			a12 = V(m);
			a13 = V(m);
			a11.bind(CONS(a12, a13), m.trail);
		} else {
			return m.fail();
		}
		a14 = CONS(a9, a10);
		a15 = CONS(a12, a13);
		p2 = //
				Op((Prolog e) -> PRED_t_vars_2_static_exec(e), VA(a4, a15), //
						Op((Prolog e) -> PRED_unionv_3_static_exec(e), VA(a9, a12, a5), cont));
		m.AREGS[0] = a3;
		m.AREGS[1] = a14;
		m.cont = p2;
		return t_vars_2_top(m);
	}

	/** PREDICATE: $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_reducer::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_sub_1);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_1(m);
	}

	private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_2(m);
	}

	private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_1(Prolog m) {
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B):-atomic(B)
		Term a2;
		Operation cont;
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B):-[atomic(B)]
		//START inline expansion of atomic(a(2))
		a2 = a2.dref();
		if (!a2.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_2(Prolog m) {
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B):-var(B),B\==A
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B):-[var(B),'$inequality_of_term'(B,A)]
		//START inline expansion of var(a(2))
		a2 = a2.dref();
		if (!(a2.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $inequality_of_term(a(2),a(1))
		a2 = a2.dref();
		a1 = a1.dref();
		if (a2.equalsTerm(a1)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: t_trans/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_trans_4_s1 = SYM("k");

	public static Operation PRED_t_trans_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry4(null, FILE_reducer::t_trans_4_sub_1);
		return t_trans_4_1(m);
	}

	private final static Operation t_trans_4_sub_1(Prolog m) {
		m.retry(null, FILE_reducer::t_trans_4_sub_2);
		return t_trans_4_2(m);
	}

	private final static Operation t_trans_4_sub_2(Prolog m) {
		m.retry(null, FILE_reducer::t_trans_4_sub_3);
		return t_trans_4_3(m);
	}

	private final static Operation t_trans_4_sub_3(Prolog m) {
		m.retry(null, FILE_reducer::t_trans_4_sub_4);
		return t_trans_4_4(m);
	}

	private final static Operation t_trans_4_sub_4(Prolog m) {
		m.trust(null);
		return t_trans_4_5(m);
	}

	private final static Operation t_trans_4_1(Prolog m) {
		// t_trans(A,B,C,[B|k]):-'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B),!
		Term a1, a2, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_trans(A,B,C,[B|k]):-['$get_level'(D),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B),'$cut'(D)]
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_t_trans_4_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a2, PRED_t_trans_4_s1), m.trail);
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
		Op((Prolog e) -> PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_static_exec(e), VA(a1, a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a5), cont));
	}

	private final static Operation t_trans_4_2(Prolog m) {
		// t_trans(A,B,C,i):-A==B,!
		Term a1, a2, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_trans(A,B,C,i):-['$get_level'(D),'$equality_of_term'(A,B),'$cut'(D)]
		if (!ATOM_i.unify(a4, m.trail))
			return m.fail();
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(2))
		a1 = a1.dref();
		a2 = a2.dref();
		if (!a1.equalsTerm(a2)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation t_trans_4_3(Prolog m) {
		// t_trans(A,B,[C|D],[B|k]):-notinv(A,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_trans(A,B,[C|D],[B|k]):-[notinv(A,C)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a5 = argz[0];
		} else if (a3.isVar()) {
			a5 = V(m);
			a3.bind(CONS(a5, V(m)), m.trail);
		} else {
			return m.fail();
		}
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_t_trans_4_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a4.isVar()) {
			a4.bind(CONS(a2, PRED_t_trans_4_s1), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_notinv_2_static_exec(e), VA(a1, a5), cont);
	}

	private final static Operation t_trans_4_4(Prolog m) {
		// t_trans(A,[B|C],[D,E,F],G):-E=[H|I],F=[J|K],'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(C,K,L,M,N),t_rule1(A,C,J,F,B,H,E,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_trans(A,[B|C],[D,E,F],G):-['$unify'(E,[H|I]),'$unify'(F,[J|K]),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(C,K,L,M,N),t_rule1(A,C,J,F,B,H,E,G)]
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
			a7 = argz[1];
		} else if (a3.isVar()) {
			a7 = V(m);
			a3.bind(CONS(V(m), a7), m.trail);
		} else {
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
		a11 = V(m);
		a12 = CONS(a11, V(m));
		//START inline expansion of $unify(a(8),a(12))
		if (!a8.unify(a12, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a13 = V(m);
		a14 = V(m);
		a15 = CONS(a13, a14);
		//START inline expansion of $unify(a(10),a(15))
		if (!a10.unify(a15, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_static_exec(e), VA(a6, a14, V(m), V(m), V(m)), //
				Op((Prolog e) -> PRED_t_rule1_8_static_exec(e), VA(a1, a6, a13, a10, a5, a11, a8, a4), cont));
	}

	private final static Operation t_trans_4_5(Prolog m) {
		// t_trans(A,[B,C|D],[E,F,G],H):-F=[I|J],G=[K,L,M],M=[N|O],L=[P|Q],t_rule2(A,D,C,P,L,B,I,F,H)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// t_trans(A,[B,C|D],[E,F,G],H):-['$unify'(F,[I|J]),'$unify'(G,[K,L,M]),'$unify'(M,[N|O]),'$unify'(L,[P|Q]),t_rule2(A,D,C,P,L,B,I,F,H)]
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
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a9 = argz[1];
		} else if (a3.isVar()) {
			a9 = V(m);
			a3.bind(CONS(V(m), a9), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a9.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a9.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			a12 = argz[0];
			if (!Prolog.Nil.unify(argz[1], m.trail))
				return m.fail();
		} else if (a11.isVar()) {
			a12 = V(m);
			a11.bind(CONS(a12, Prolog.Nil), m.trail);
		} else {
			return m.fail();
		}
		a13 = V(m);
		a14 = CONS(a13, V(m));
		//START inline expansion of $unify(a(10),a(14))
		if (!a10.unify(a14, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a15 = V(m);
		a16 = V(m);
		a17 = CONS(a16, Prolog.Nil);
		a18 = CONS(a15, a17);
		a19 = CONS(V(m), a18);
		//START inline expansion of $unify(a(12),a(19))
		if (!a12.unify(a19, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a20 = CONS(V(m), V(m));
		//START inline expansion of $unify(a(16),a(20))
		if (!a16.unify(a20, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a21 = V(m);
		a22 = CONS(a21, V(m));
		//START inline expansion of $unify(a(15),a(22))
		if (!a15.unify(a22, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_t_rule2_9_static_exec(e), VA(a1, a8, a7, a21, a15, a5, a13, a10, a4), cont);
	}

	/** PREDICATE: $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_s1 = SYM("[]");

	// private final Term arg5;

	public static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_reducer::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_sub_1);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_1(m);
	}

	private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_2(m);
	}

	private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_1(Prolog m) {
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D,E):-end(A)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D,E):-[end(A)]
		return //
		Op((Prolog e) -> PRED_end_1_static_exec(e), VA(a1), cont);
	}

	private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_2(Prolog m) {
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D,E):-B=[C,[D|E]],D\==[]
		Term a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A,B,C,D,E):-['$unify'(B,[C,[D|E]]),'$inequality_of_term'(D,[])]
		a6 = CONS(a4, a5);
		a7 = CONS(a6, PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_s1);
		a8 = CONS(a3, a7);
		//START inline expansion of $unify(a(2),a(8))
		if (!a2.unify(a8, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $inequality_of_term(a(4),s(1))
		a4 = a4.dref();
		if (a4.equalsTerm(PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_s1)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: t_rule1/8
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_rule1_8_s1 = SYM("b");

	// private final Term arg5, arg6, arg7, arg8;

	public static Operation PRED_t_rule1_8_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry8(null, FILE_reducer::t_rule1_8_sub_1);
		return t_rule1_8_1(m);
	}

	private final static Operation t_rule1_8_sub_1(Prolog m) {
		m.retry(null, FILE_reducer::t_rule1_8_sub_2);
		return t_rule1_8_2(m);
	}

	private final static Operation t_rule1_8_sub_2(Prolog m) {
		m.retry(null, FILE_reducer::t_rule1_8_sub_3);
		return t_rule1_8_3(m);
	}

	private final static Operation t_rule1_8_sub_3(Prolog m) {
		m.trust(null);
		return t_rule1_8_4(m);
	}

	private final static Operation t_rule1_8_1(Prolog m) {
		// t_rule1(A,B,C,D,E,F,G,B):-notinv(A,C),A==E,!
		Term a1, a2, a3, a5, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a8 = m.AREGS[7];
		cont = m.cont;
		// t_rule1(A,B,C,D,E,F,G,B):-['$get_level'(H),notinv(A,C),'$equality_of_term'(A,E),'$cut'(H)]
		if (!a2.unify(a8, m.trail))
			return m.fail();
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_notinv_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_$equality_of_term_2_static_exec(e), VA(a1, a5), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a9), cont)));
	}

	private final static Operation t_rule1_8_2(Prolog m) {
		// t_rule1(A,B,C,D,E,F,G,[H,B|b]):-notinv(A,C),inv(A,F),A\==E,!,t_trans(A,E,G,H)
		Term a1, a2, a3, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a8 = m.AREGS[7];
		cont = m.cont;
		// t_rule1(A,B,C,D,E,F,G,[H,B|b]):-['$get_level'(I),notinv(A,C),inv(A,F),'$inequality_of_term'(A,E),'$cut'(I),t_trans(A,E,G,H)]
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			a10 = argz[1];
		} else if (a8.isVar()) {
			a9 = V(m);
			a10 = V(m);
			a8.bind(CONS(a9, a10), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_t_rule1_8_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a10.bind(CONS(a2, PRED_t_rule1_8_s1), m.trail);
		} else {
			return m.fail();
		}
		a11 = V(m);
		//START inline expansion of $get_level(a(11))
		if (!a11.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_notinv_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a1, a6), //
						Op((Prolog e) -> PRED_$inequality_of_term_2_static_exec(e), VA(a1, a5), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a11), //
										Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a5, a7, a9), cont)))));
	}

	private final static Operation t_rule1_8_3(Prolog m) {
		// t_rule1(A,B,C,D,E,F,G,[E,H|c]):-notinv(A,F),!,t_trans(A,B,D,H)
		Term a1, a2, a4, a5, a6, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a8 = m.AREGS[7];
		cont = m.cont;
		// t_rule1(A,B,C,D,E,F,G,[E,H|c]):-['$get_level'(I),notinv(A,F),'$cut'(I),t_trans(A,B,D,H)]
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			if (!a5.unify(argz[0], m.trail))
				return m.fail();
			a9 = argz[1];
		} else if (a8.isVar()) {
			a9 = V(m);
			a8.bind(CONS(a5, a9), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			a10 = argz[0];
			if (!ATOM_c.unify(argz[1], m.trail))
				return m.fail();
		} else if (a9.isVar()) {
			a10 = V(m);
			a9.bind(CONS(a10, ATOM_c), m.trail);
		} else {
			return m.fail();
		}
		a11 = V(m);
		//START inline expansion of $get_level(a(11))
		if (!a11.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_notinv_2_static_exec(e), VA(a1, a6), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a11), //
						Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a2, a4, a10), cont)));
	}

	private final static Operation t_rule1_8_4(Prolog m) {
		// t_rule1(A,B,C,D,E,F,G,[H,I|s]):-t_trans(A,B,D,I),t_trans(A,E,G,H)
		Term a1, a2, a4, a5, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a7 = m.AREGS[6];
		a8 = m.AREGS[7];
		cont = m.cont;
		// t_rule1(A,B,C,D,E,F,G,[H,I|s]):-[t_trans(A,B,D,I),t_trans(A,E,G,H)]
		a8 = a8.dref();
		if (a8.isCons()) {
			Term[] argz = VA(a8.car(), a8.cdr());
			a9 = argz[0];
			a10 = argz[1];
		} else if (a8.isVar()) {
			a9 = V(m);
			a10 = V(m);
			a8.bind(CONS(a9, a10), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			a11 = argz[0];
			if (!ATOM_s.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a11 = V(m);
			a10.bind(CONS(a11, ATOM_s), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a2, a4, a11), //
				Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a5, a7, a9), cont));
	}

	/** PREDICATE: t_rule2/9
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_t_rule2_9_s1 = SYM("c");
	final static SymbolTerm ATOM_sp = SYM("sp");

	// private final Term arg5, arg6, arg7, arg8, arg9;

	public static Operation PRED_t_rule2_9_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry(9, null, FILE_reducer::t_rule2_9_sub_1);
		return t_rule2_9_1(m);
	}

	private final static Operation t_rule2_9_sub_1(Prolog m) {
		m.retry(null, FILE_reducer::t_rule2_9_sub_2);
		return t_rule2_9_2(m);
	}

	private final static Operation t_rule2_9_sub_2(Prolog m) {
		m.retry(null, FILE_reducer::t_rule2_9_sub_3);
		return t_rule2_9_3(m);
	}

	private final static Operation t_rule2_9_sub_3(Prolog m) {
		m.retry(null, FILE_reducer::t_rule2_9_sub_4);
		return t_rule2_9_4(m);
	}

	private final static Operation t_rule2_9_sub_4(Prolog m) {
		m.retry(null, FILE_reducer::t_rule2_9_sub_5);
		return t_rule2_9_5(m);
	}

	private final static Operation t_rule2_9_sub_5(Prolog m) {
		m.trust(null);
		return t_rule2_9_6(m);
	}

	private final static Operation t_rule2_9_1(Prolog m) {
		// t_rule2(A,B,C,D,E,F,G,H,[F,B|c]):-A==C,notinv(A,G),!
		Term a1, a2, a3, a6, a7, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		a7 = m.AREGS[6];
		a9 = m.AREGS[8];
		cont = m.cont;
		// t_rule2(A,B,C,D,E,F,G,H,[F,B|c]):-['$get_level'(I),'$equality_of_term'(A,C),notinv(A,G),'$cut'(I)]
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			if (!a6.unify(argz[0], m.trail))
				return m.fail();
			a10 = argz[1];
		} else if (a9.isVar()) {
			a10 = V(m);
			a9.bind(CONS(a6, a10), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!PRED_t_rule2_9_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a10.isVar()) {
			a10.bind(CONS(a2, PRED_t_rule2_9_s1), m.trail);
		} else {
			return m.fail();
		}
		a11 = V(m);
		//START inline expansion of $get_level(a(11))
		if (!a11.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(3))
		a1 = a1.dref();
		a3 = a3.dref();
		if (!a1.equalsTerm(a3)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_notinv_2_static_exec(e), VA(a1, a7), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a11), cont));
	}

	private final static Operation t_rule2_9_2(Prolog m) {
		// t_rule2(A,B,C,D,E,F,G,H,[I,B|s]):-A==C,!,t_trans(A,F,H,I)
		Term a1, a2, a3, a6, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		a8 = m.AREGS[7];
		a9 = m.AREGS[8];
		cont = m.cont;
		// t_rule2(A,B,C,D,E,F,G,H,[I,B|s]):-['$get_level'(J),'$equality_of_term'(A,C),'$cut'(J),t_trans(A,F,H,I)]
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a9.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a9.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!ATOM_s.unify(argz[1], m.trail))
				return m.fail();
		} else if (a11.isVar()) {
			a11.bind(CONS(a2, ATOM_s), m.trail);
		} else {
			return m.fail();
		}
		a12 = V(m);
		//START inline expansion of $get_level(a(12))
		if (!a12.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(3))
		a1 = a1.dref();
		a3 = a3.dref();
		if (!a1.equalsTerm(a3)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(12))
		a12 = a12.dref();
		m.cut(a12.intValue());
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a6, a8, a10), cont);
	}

	private final static Operation t_rule2_9_3(Prolog m) {
		// t_rule2(A,B,C,D,E,F,G,H,[F,I,B|cp]):-inv(A,D),notinv(A,G),!,t_trans(A,C,E,I)
		Term a1, a2, a3, a4, a5, a6, a7, a9, a10, a11, a12, a13;
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
		// t_rule2(A,B,C,D,E,F,G,H,[F,I,B|cp]):-['$get_level'(J),inv(A,D),notinv(A,G),'$cut'(J),t_trans(A,C,E,I)]
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			if (!a6.unify(argz[0], m.trail))
				return m.fail();
			a10 = argz[1];
		} else if (a9.isVar()) {
			a10 = V(m);
			a9.bind(CONS(a6, a10), m.trail);
		} else {
			return m.fail();
		}
		a10 = a10.dref();
		if (a10.isCons()) {
			Term[] argz = VA(a10.car(), a10.cdr());
			a11 = argz[0];
			a12 = argz[1];
		} else if (a10.isVar()) {
			a11 = V(m);
			a12 = V(m);
			a10.bind(CONS(a11, a12), m.trail);
		} else {
			return m.fail();
		}
		a12 = a12.dref();
		if (a12.isCons()) {
			Term[] argz = VA(a12.car(), a12.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!ATOM_cp.unify(argz[1], m.trail))
				return m.fail();
		} else if (a12.isVar()) {
			a12.bind(CONS(a2, ATOM_cp), m.trail);
		} else {
			return m.fail();
		}
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a1, a4), //
				Op((Prolog e) -> PRED_notinv_2_static_exec(e), VA(a1, a7), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a13), //
								Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a3, a5, a11), cont))));
	}

	private final static Operation t_rule2_9_4(Prolog m) {
		// t_rule2(A,B,C,D,E,F,G,H,[I,J,B|sp]):-inv(A,D),!,t_trans(A,C,E,J),t_trans(A,F,H,I)
		Term a1, a2, a3, a4, a5, a6, a8, a9, a10, a11, a12, a13, a14;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		a6 = m.AREGS[5];
		a8 = m.AREGS[7];
		a9 = m.AREGS[8];
		cont = m.cont;
		// t_rule2(A,B,C,D,E,F,G,H,[I,J,B|sp]):-['$get_level'(K),inv(A,D),'$cut'(K),t_trans(A,C,E,J),t_trans(A,F,H,I)]
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a9.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a9.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			a12 = argz[0];
			a13 = argz[1];
		} else if (a11.isVar()) {
			a12 = V(m);
			a13 = V(m);
			a11.bind(CONS(a12, a13), m.trail);
		} else {
			return m.fail();
		}
		a13 = a13.dref();
		if (a13.isCons()) {
			Term[] argz = VA(a13.car(), a13.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!ATOM_sp.unify(argz[1], m.trail))
				return m.fail();
		} else if (a13.isVar()) {
			a13.bind(CONS(a2, ATOM_sp), m.trail);
		} else {
			return m.fail();
		}
		a14 = V(m);
		//START inline expansion of $get_level(a(14))
		if (!a14.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a1, a4), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a14), //
						Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a3, a5, a12), //
								Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a6, a8, a10), cont))));
	}

	private final static Operation t_rule2_9_5(Prolog m) {
		// t_rule2(A,B,C,D,E,F,G,H,[C|B]):-A==F,!
		Term a1, a2, a3, a6, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		a9 = m.AREGS[8];
		cont = m.cont;
		// t_rule2(A,B,C,D,E,F,G,H,[C|B]):-['$get_level'(I),'$equality_of_term'(A,F),'$cut'(I)]
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			if (!a2.unify(argz[1], m.trail))
				return m.fail();
		} else if (a9.isVar()) {
			a9.bind(CONS(a3, a2), m.trail);
		} else {
			return m.fail();
		}
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(6))
		a1 = a1.dref();
		a6 = a6.dref();
		if (!a1.equalsTerm(a6)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(10))
		a10 = a10.dref();
		m.cut(a10.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation t_rule2_9_6(Prolog m) {
		// t_rule2(A,B,C,D,E,F,G,H,[I,C,B|bp]):-t_trans(A,F,H,I)
		Term a1, a2, a3, a6, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a6 = m.AREGS[5];
		a8 = m.AREGS[7];
		a9 = m.AREGS[8];
		cont = m.cont;
		// t_rule2(A,B,C,D,E,F,G,H,[I,C,B|bp]):-[t_trans(A,F,H,I)]
		a9 = a9.dref();
		if (a9.isCons()) {
			Term[] argz = VA(a9.car(), a9.cdr());
			a10 = argz[0];
			a11 = argz[1];
		} else if (a9.isVar()) {
			a10 = V(m);
			a11 = V(m);
			a9.bind(CONS(a10, a11), m.trail);
		} else {
			return m.fail();
		}
		a11 = a11.dref();
		if (a11.isCons()) {
			Term[] argz = VA(a11.car(), a11.cdr());
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			a12 = argz[1];
		} else if (a11.isVar()) {
			a12 = V(m);
			a11.bind(CONS(a3, a12), m.trail);
		} else {
			return m.fail();
		}
		a12 = a12.dref();
		if (a12.isCons()) {
			Term[] argz = VA(a12.car(), a12.cdr());
			if (!a2.unify(argz[0], m.trail))
				return m.fail();
			if (!ATOM_bp.unify(argz[1], m.trail))
				return m.fail();
		} else if (a12.isVar()) {
			a12.bind(CONS(a2, ATOM_bp), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_t_trans_4_static_exec(e), VA(a1, a6, a8, a10), cont);
	}

	/** PREDICATE: make_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_make_list_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::make_list_2_var, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_1, FILE_reducer::make_list_2_var);
	}

	private final static Operation make_list_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::make_list_2_var_1);
		return make_list_2_1(m);
	}

	private final static Operation make_list_2_var_1(Prolog m) {
		m.trust(null);
		return make_list_2_2(m);
	}

	private final static Operation make_list_2_1(Prolog m) {
		// make_list(A,A):-atomic(A)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// make_list(A,A):-[atomic(A)]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		//START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation make_list_2_2(Prolog m) {
		// make_list([A,B|C],[B|D]):-list_functor_name(C),make_list(A,D)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// make_list([A,B|C],[B|D]):-[list_functor_name(C),make_list(A,D)]
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
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a5.unify(argz[0], m.trail))
				return m.fail();
			a7 = argz[1];
		} else if (a2.isVar()) {
			a7 = V(m);
			a2.bind(CONS(a5, a7), m.trail);
		} else {
			return m.fail();
		}
		return //
		Op((Prolog e) -> PRED_list_functor_name_1_static_exec(e), VA(a6), //
				Op((Prolog e) -> PRED_make_list_2_static_exec(e), VA(a3, a7), cont));
	}

	/** PREDICATE: $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_reducer::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_sub_1);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_1(m);
	}

	private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_2(m);
	}

	private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_1(Prolog m) {
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-var(A)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-[var(A)]
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_2(Prolog m) {
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-atomic(A)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A):-[atomic(A)]
		//START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: listify/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final /**/ IntegerTerm PRED_listify_2_s1 = Integer(1);

	public static Operation PRED_listify_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_reducer::listify_2_sub_1);
		return listify_2_1(m);
	}

	private final static Operation listify_2_sub_1(Prolog m) {
		m.trust(null);
		return listify_2_2(m);
	}

	private final static Operation listify_2_1(Prolog m) {
		// listify(A,A):-'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A),!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// listify(A,A):-['$get_level'(B),'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl'(A),'$cut'(B)]
		if (!a1.unify(a2, m.trail))
			return m.fail();
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont));
	}

	private final static Operation listify_2_2(Prolog m) {
		// listify(A,[B|C]):-functor(A,B,D),listify_list(1,D,A,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// listify(A,[B|C]):-[functor(A,B,D),listify_list(1,D,A,C)]
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
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a3, a5), //
				Op((Prolog e) -> PRED_listify_list_4_static_exec(e), VA(PRED_listify_2_s1, a5, a1, a4), cont));
	}

	/** PREDICATE: listify_list/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_listify_list_4_s1 = SYM("[]");

	public static Operation PRED_listify_list_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry4(null, FILE_reducer::listify_list_4_sub_1);
		return listify_list_4_1(m);
	}

	private final static Operation listify_list_4_sub_1(Prolog m) {
		m.trust(null);
		return listify_list_4_2(m);
	}

	private final static Operation listify_list_4_1(Prolog m) {
		// listify_list(A,B,C,[]):-A>B,!
		Term a1, a2, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a4 = m.AREGS[3];
		cont = m.cont;
		// listify_list(A,B,C,[]):-['$get_level'(D),'$greater_than'(A,B),'$cut'(D)]
		if (!PRED_listify_list_4_s1.unify(a4, m.trail))
			return m.fail();
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) <= 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation listify_list_4_2(Prolog m) {
		// listify_list(A,B,C,[D|E]):-A=<B,!,arg(A,C,F),listify(F,D),G is A+1,listify_list(G,B,C,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// listify_list(A,B,C,[D|E]):-['$get_level'(F),'$less_or_equal'(A,B),'$cut'(F),arg(A,C,G),listify(G,D),H is A+1,listify_list(H,B,C,E)]
		a4 = a4.dref();
		if (a4.isCons()) {
			Term[] argz = VA(a4.car(), a4.cdr());
			a5 = argz[0];
			a6 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a6 = V(m);
			a4.bind(CONS(a5, a6), m.trail);
		} else {
			return m.fail();
		}
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
		Term[] y1 = VA(a1, int_1);
		a10 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a3, a8), //
				Op((Prolog e) -> PRED_listify_2_static_exec(e), VA(a8, a5), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a9, a10), //
								Op((Prolog e) -> PRED_listify_list_4_static_exec(e), VA(a9, a2, a3, a6), cont))));
	}

	/** PREDICATE: member/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_member_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return member_2_top(m);
	}

	private final static Operation member_2_top(Prolog m) {
		m.setB0();
		m.jtry2(null, FILE_reducer::member_2_sub_1);
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

	/** PREDICATE: append/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_append_3_s1 = SYM("[]");

	public static Operation PRED_append_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return append_3_top(m);
	}

	private final static Operation append_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_reducer::append_3_var, fail_0, fail_0, FILE_reducer::append_3_1, fail_0, FILE_reducer::append_3_2);
	}

	private final static Operation append_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::append_3_var_1);
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

	/** PREDICATE: intersectv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_intersectv_3_s1 = SYM("[]");

	public static Operation PRED_intersectv_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::intersectv_3_var, fail_0, fail_0, FILE_reducer::intersectv_3_1, fail_0, FILE_reducer::intersectv_3_2);
	}

	private final static Operation intersectv_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::intersectv_3_var_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_intersectv_2_4_s1 = SYM("[]");

	public static Operation PRED_intersectv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::intersectv_2_4_var, fail_0, fail_0, FILE_reducer::intersectv_2_4_1, fail_0, FILE_reducer::intersectv_2_4_2);
	}

	private final static Operation intersectv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_reducer::intersectv_2_4_var_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_intersectv_3_6_s1 = SYM("<");

	// private final Term arg5, arg6;

	public static Operation PRED_intersectv_3_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::intersectv_3_6_var, fail_0, fail_0, FILE_reducer::intersectv_3_6_var, fail_0, fail_0);
	}

	private final static Operation intersectv_3_6_var(Prolog m) {
		m.jtry6(null, FILE_reducer::intersectv_3_6_var_1);
		return intersectv_3_6_1(m);
	}

	private final static Operation intersectv_3_6_var_1(Prolog m) {
		m.retry(null, FILE_reducer::intersectv_3_6_var_2);
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

	/** PREDICATE: intersectv_list/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_intersectv_list_2_s1 = SYM("[]");

	public static Operation PRED_intersectv_list_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::intersectv_list_2_var, fail_0, fail_0, FILE_reducer::intersectv_list_2_1, fail_0, FILE_reducer::intersectv_list_2_2);
	}

	private final static Operation intersectv_list_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::intersectv_list_2_var_1);
		return intersectv_list_2_1(m);
	}

	private final static Operation intersectv_list_2_var_1(Prolog m) {
		m.trust(null);
		return intersectv_list_2_2(m);
	}

	private final static Operation intersectv_list_2_1(Prolog m) {
		// intersectv_list([],[]):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// intersectv_list([],[]):-[]
		if (!PRED_intersectv_list_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_intersectv_list_2_s1.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation intersectv_list_2_2(Prolog m) {
		// intersectv_list([A|B],C):-intersectv_list(B,A,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// intersectv_list([A|B],C):-[intersectv_list(B,A,C)]
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
		Op((Prolog e) -> PRED_intersectv_list_3_static_exec(e), VA(a4, a3, a2), cont);
	}

	/** PREDICATE: intersectv_list/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_intersectv_list_3_s1 = SYM("[]");

	public static Operation PRED_intersectv_list_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::intersectv_list_3_var, fail_0, fail_0, FILE_reducer::intersectv_list_3_1, fail_0, FILE_reducer::intersectv_list_3_2);
	}

	private final static Operation intersectv_list_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::intersectv_list_3_var_1);
		return intersectv_list_3_1(m);
	}

	private final static Operation intersectv_list_3_var_1(Prolog m) {
		m.trust(null);
		return intersectv_list_3_2(m);
	}

	private final static Operation intersectv_list_3_1(Prolog m) {
		// intersectv_list([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersectv_list([],A,A):-[]
		if (!PRED_intersectv_list_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation intersectv_list_3_2(Prolog m) {
		// intersectv_list([A|B],C,D):-intersectv(A,C,E),intersectv_list(B,E,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// intersectv_list([A|B],C,D):-[intersectv(A,C,E),intersectv_list(B,E,D)]
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
		Op((Prolog e) -> PRED_intersectv_3_static_exec(e), VA(a4, a2, a6), //
				Op((Prolog e) -> PRED_intersectv_list_3_static_exec(e), VA(a5, a6, a3), cont));
	}

	/** PREDICATE: diffv/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_diffv_3_s1 = SYM("[]");

	public static Operation PRED_diffv_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::diffv_3_var, fail_0, fail_0, FILE_reducer::diffv_3_1, fail_0, FILE_reducer::diffv_3_2);
	}

	private final static Operation diffv_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::diffv_3_var_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_diffv_2_4_s1 = SYM("[]");

	public static Operation PRED_diffv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::diffv_2_4_var, fail_0, fail_0, FILE_reducer::diffv_2_4_1, fail_0, FILE_reducer::diffv_2_4_2);
	}

	private final static Operation diffv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_reducer::diffv_2_4_var_1);
		return diffv_2_4_1(m);
	}

	private final static Operation diffv_2_4_var_1(Prolog m) {
		m.trust(null);
		return diffv_2_4_2(m);
	}

	private final static Operation diffv_2_4_1(Prolog m) {
		// diffv_2([],A,B,[A|B]):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// diffv_2([],A,B,[A|B]):-[]
		if (!PRED_diffv_2_4_s1.unify(a1, m.trail))
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_diffv_3_6_s1 = SYM("<");

	// private final Term arg5, arg6;

	public static Operation PRED_diffv_3_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::diffv_3_6_var, fail_0, fail_0, FILE_reducer::diffv_3_6_var, fail_0, fail_0);
	}

	private final static Operation diffv_3_6_var(Prolog m) {
		m.jtry6(null, FILE_reducer::diffv_3_6_var_1);
		return diffv_3_6_1(m);
	}

	private final static Operation diffv_3_6_var_1(Prolog m) {
		m.retry(null, FILE_reducer::diffv_3_6_var_2);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_unionv_3_s1 = SYM("[]");

	public static Operation PRED_unionv_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::unionv_3_var, fail_0, fail_0, FILE_reducer::unionv_3_1, fail_0, FILE_reducer::unionv_3_2);
	}

	private final static Operation unionv_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::unionv_3_var_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_unionv_2_4_s1 = SYM("[]");

	public static Operation PRED_unionv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::unionv_2_4_var, fail_0, fail_0, FILE_reducer::unionv_2_4_1, fail_0, FILE_reducer::unionv_2_4_2);
	}

	private final static Operation unionv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_reducer::unionv_2_4_var_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_unionv_3_6_s1 = SYM("<");

	// private final Term arg5, arg6;

	public static Operation PRED_unionv_3_6_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::unionv_3_6_var, fail_0, fail_0, FILE_reducer::unionv_3_6_var, fail_0, fail_0);
	}

	private final static Operation unionv_3_6_var(Prolog m) {
		m.jtry6(null, FILE_reducer::unionv_3_6_var_1);
		return unionv_3_6_1(m);
	}

	private final static Operation unionv_3_6_var_1(Prolog m) {
		m.retry(null, FILE_reducer::unionv_3_6_var_2);
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

	/** PREDICATE: subsetv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_subsetv_2_s1 = SYM("[]");

	public static Operation PRED_subsetv_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::subsetv_2_var, fail_0, fail_0, FILE_reducer::subsetv_2_1, fail_0, FILE_reducer::subsetv_2_2);
	}

	private final static Operation subsetv_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::subsetv_2_var_1);
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_subsetv_2_4_s1 = SYM("=");

	public static Operation PRED_subsetv_2_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::subsetv_2_4_var, fail_0, fail_0, FILE_reducer::subsetv_2_4_var, fail_0, fail_0);
	}

	private final static Operation subsetv_2_4_var(Prolog m) {
		m.jtry4(null, FILE_reducer::subsetv_2_4_var_1);
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

	/** PREDICATE: small_subsetv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_small_subsetv_2_s1 = SYM("[]");

	public static Operation PRED_small_subsetv_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::small_subsetv_2_var, fail_0, fail_0, FILE_reducer::small_subsetv_2_1, fail_0, FILE_reducer::small_subsetv_2_2);
	}

	private final static Operation small_subsetv_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::small_subsetv_2_var_1);
		return small_subsetv_2_1(m);
	}

	private final static Operation small_subsetv_2_var_1(Prolog m) {
		m.trust(null);
		return small_subsetv_2_2(m);
	}

	private final static Operation small_subsetv_2_1(Prolog m) {
		// small_subsetv([],A):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// small_subsetv([],A):-[]
		if (!PRED_small_subsetv_2_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation small_subsetv_2_2(Prolog m) {
		// small_subsetv([A|B],C):-inv(A,C),small_subsetv(B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// small_subsetv([A|B],C):-[inv(A,C),small_subsetv(B,C)]
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
		Op((Prolog e) -> PRED_inv_2_static_exec(e), VA(a3, a2), //
				Op((Prolog e) -> PRED_small_subsetv_2_static_exec(e), VA(a4, a2), cont));
	}

	/** PREDICATE: inv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
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
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_inv_2_3_s1 = SYM("=");

	public static Operation PRED_inv_2_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::inv_2_3_var, fail_0, fail_0, FILE_reducer::inv_2_3_var, fail_0, fail_0);
	}

	private final static Operation inv_2_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::inv_2_3_var_1);
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

	/** PREDICATE: notinv/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/

	public static Operation PRED_notinv_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// notinv(A,B):-notinv_2(B,A)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// notinv(A,B):-[notinv_2(B,A)]
		return //
		Op((Prolog e) -> PRED_notinv_2_2_static_exec(e), VA(a2, a1), cont);
	}

	/** PREDICATE: notinv_2/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_notinv_2_2_s1 = SYM("[]");

	public static Operation PRED_notinv_2_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::notinv_2_2_var, fail_0, fail_0, FILE_reducer::notinv_2_2_1, fail_0, FILE_reducer::notinv_2_2_2);
	}

	private final static Operation notinv_2_2_var(Prolog m) {
		m.jtry2(null, FILE_reducer::notinv_2_2_var_1);
		return notinv_2_2_1(m);
	}

	private final static Operation notinv_2_2_var_1(Prolog m) {
		m.trust(null);
		return notinv_2_2_2(m);
	}

	private final static Operation notinv_2_2_1(Prolog m) {
		// notinv_2([],A):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// notinv_2([],A):-[]
		if (!PRED_notinv_2_2_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation notinv_2_2_2(Prolog m) {
		// notinv_2([A|B],C):-compare(D,C,A),notinv_3(D,C,B)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// notinv_2([A|B],C):-[compare(D,C,A),notinv_3(D,C,B)]
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
		Op(FILE_builtins::PRED_compare_3_static_exec, VA(a5, a2, a3), //
				Op((Prolog e) -> PRED_notinv_3_3_static_exec(e), VA(a5, a2, a4), cont));
	}

	/** PREDICATE: notinv_3/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl
	*/
	private static final SymbolTerm PRED_notinv_3_3_s1 = SYM("<");

	public static Operation PRED_notinv_3_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_reducer::notinv_3_3_var, fail_0, fail_0, FILE_reducer::notinv_3_3_var, fail_0, fail_0);
	}

	private final static Operation notinv_3_3_var(Prolog m) {
		m.jtry3(null, FILE_reducer::notinv_3_3_var_1);
		return notinv_3_3_1(m);
	}

	private final static Operation notinv_3_3_var_1(Prolog m) {
		m.trust(null);
		return notinv_3_3_2(m);
	}

	private final static Operation notinv_3_3_1(Prolog m) {
		// notinv_3(<,A,B):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// notinv_3(<,A,B):-[]
		if (!PRED_notinv_3_3_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation notinv_3_3_2(Prolog m) {
		// notinv_3(>,A,B):-notinv_2(B,A)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// notinv_3(>,A,B):-[notinv_2(B,A)]
		if (!ATOM_greaterthan.unify(a1, m.trail))
			return m.fail();
		return //
		Op((Prolog e) -> PRED_notinv_2_2_static_exec(e), VA(a3, a2), cont);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_reducer::PRED_top_0_static_exec);
		PredTable.registerBuiltin("try", 2, FILE_reducer::PRED_try_2_static_exec);
		PredTable.registerBuiltin("end", 1, FILE_reducer::PRED_end_1_static_exec);
		PredTable.registerBuiltin("list_functor_name", 1, FILE_reducer::PRED_list_functor_name_1_static_exec);
		PredTable.registerBuiltin("t_def", 3, FILE_reducer::PRED_t_def_3_static_exec);
		PredTable.registerBuiltin("t_reduce", 2, FILE_reducer::PRED_t_reduce_2_static_exec);
		PredTable.registerBuiltin("t_append", 4, FILE_reducer::PRED_t_append_4_static_exec);
		PredTable.registerBuiltin("t_redex", 2, FILE_reducer::PRED_t_redex_2_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl", "$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl",
				4, FILE_reducer::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_4_static_exec);
		PredTable.registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl", "$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl",
				3, FILE_reducer::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_3_static_exec);
		PredTable.registerBuiltin("eval", 4, FILE_reducer::PRED_eval_4_static_exec);
		PredTable.registerBuiltin("eval1", 3, FILE_reducer::PRED_eval1_3_static_exec);
		PredTable.registerBuiltin("relop", 3, FILE_reducer::PRED_relop_3_static_exec);
		PredTable.registerBuiltin("t", 3, FILE_reducer::PRED_t_3_static_exec);
		PredTable.registerBuiltin("t_argvars", 3, FILE_reducer::PRED_t_argvars_3_static_exec);
		PredTable.registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl", "$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl",
				1, FILE_reducer::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec);
		PredTable.registerBuiltin("curry", 2, FILE_reducer::PRED_curry_2_static_exec);
		PredTable.registerBuiltin("currylist", 3, FILE_reducer::PRED_currylist_3_static_exec);
		PredTable.registerBuiltin("t_vars", 2, FILE_reducer::PRED_t_vars_2_static_exec);
		PredTable.registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl", "$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl",
				2, FILE_reducer::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_2_static_exec);
		PredTable.registerBuiltin("t_trans", 4, FILE_reducer::PRED_t_trans_4_static_exec);
		PredTable.registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl", "$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl",
				5, FILE_reducer::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_5_static_exec);
		PredTable.registerBuiltin("t_rule1", 8, FILE_reducer::PRED_t_rule1_8_static_exec);
		PredTable.registerBuiltin("t_rule2", 9, FILE_reducer::PRED_t_rule2_9_static_exec);
		PredTable.registerBuiltin("make_list", 2, FILE_reducer::PRED_make_list_2_static_exec);
		PredTable.registerBuiltin("$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/reducer.pl", "$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl",
				1, FILE_reducer::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Freducer$002Epl_1_static_exec);
		PredTable.registerBuiltin("listify", 2, FILE_reducer::PRED_listify_2_static_exec);
		PredTable.registerBuiltin("listify_list", 4, FILE_reducer::PRED_listify_list_4_static_exec);
		PredTable.registerBuiltin("member", 2, FILE_reducer::PRED_member_2_static_exec);
		PredTable.registerBuiltin("append", 3, FILE_reducer::PRED_append_3_static_exec);
		PredTable.registerBuiltin("intersectv", 3, FILE_reducer::PRED_intersectv_3_static_exec);
		PredTable.registerBuiltin("intersectv_2", 4, FILE_reducer::PRED_intersectv_2_4_static_exec);
		PredTable.registerBuiltin("intersectv_3", 6, FILE_reducer::PRED_intersectv_3_6_static_exec);
		PredTable.registerBuiltin("intersectv_list", 2, FILE_reducer::PRED_intersectv_list_2_static_exec);
		PredTable.registerBuiltin("intersectv_list", 3, FILE_reducer::PRED_intersectv_list_3_static_exec);
		PredTable.registerBuiltin("diffv", 3, FILE_reducer::PRED_diffv_3_static_exec);
		PredTable.registerBuiltin("diffv_2", 4, FILE_reducer::PRED_diffv_2_4_static_exec);
		PredTable.registerBuiltin("diffv_3", 6, FILE_reducer::PRED_diffv_3_6_static_exec);
		PredTable.registerBuiltin("unionv", 3, FILE_reducer::PRED_unionv_3_static_exec);
		PredTable.registerBuiltin("unionv_2", 4, FILE_reducer::PRED_unionv_2_4_static_exec);
		PredTable.registerBuiltin("unionv_3", 6, FILE_reducer::PRED_unionv_3_6_static_exec);
		PredTable.registerBuiltin("subsetv", 2, FILE_reducer::PRED_subsetv_2_static_exec);
		PredTable.registerBuiltin("subsetv_2", 4, FILE_reducer::PRED_subsetv_2_4_static_exec);
		PredTable.registerBuiltin("small_subsetv", 2, FILE_reducer::PRED_small_subsetv_2_static_exec);
		PredTable.registerBuiltin("inv", 2, FILE_reducer::PRED_inv_2_static_exec);
		PredTable.registerBuiltin("inv_2", 3, FILE_reducer::PRED_inv_2_3_static_exec);
		PredTable.registerBuiltin("notinv", 2, FILE_reducer::PRED_notinv_2_static_exec);
		PredTable.registerBuiltin("notinv_2", 2, FILE_reducer::PRED_notinv_2_2_static_exec);
		PredTable.registerBuiltin("notinv_3", 3, FILE_reducer::PRED_notinv_3_3_static_exec);
	}
}
