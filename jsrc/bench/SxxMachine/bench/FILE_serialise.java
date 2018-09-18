package SxxMachine.bench;

import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;

import SxxMachine.Arithmetic;
import SxxMachine.FILE_builtins;
import SxxMachine.IntegerTerm;
import SxxMachine.ListTerm;
import SxxMachine.Operation;
import SxxMachine.PredTable;
import SxxMachine.Prolog;
import SxxMachine.SymbolTerm;
import SxxMachine.Term;
import SxxMachine.TermData;

public class FILE_serialise  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-serialise
		m.setB0();
		// top:-[serialise]
		return //
		Op((Prolog e) -> PRED_serialise_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: serialise/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
	private static final /**/ IntegerTerm PRED_serialise_0_s1 = Integer(65);
	final static IntegerTerm int_66 = Integer(66);
	final static IntegerTerm int_76 = Integer(76);
	final static IntegerTerm int_69 = Integer(69);
	final static IntegerTerm int_32 = Integer(32);
	final static IntegerTerm int_87 = Integer(87);
	final static IntegerTerm int_83 = Integer(83);
	final static IntegerTerm int_73 = Integer(73);
	final static IntegerTerm int_82 = Integer(82);
	private static final ListTerm PRED_serialise_0_s11 = CONS(PRED_serialise_0_s1, Prolog.Nil);
	private static final ListTerm PRED_serialise_0_s12 = CONS(int_66, PRED_serialise_0_s11);
	private static final ListTerm PRED_serialise_0_s13 = CONS(int_76, PRED_serialise_0_s12);
	private static final ListTerm PRED_serialise_0_s14 = CONS(int_69, PRED_serialise_0_s13);
	private static final ListTerm PRED_serialise_0_s15 = CONS(int_32, PRED_serialise_0_s14);
	private static final ListTerm PRED_serialise_0_s16 = CONS(int_87, PRED_serialise_0_s15);
	private static final ListTerm PRED_serialise_0_s17 = CONS(PRED_serialise_0_s1, PRED_serialise_0_s16);
	private static final ListTerm PRED_serialise_0_s18 = CONS(int_83, PRED_serialise_0_s17);
	private static final ListTerm PRED_serialise_0_s19 = CONS(int_32, PRED_serialise_0_s18);
	private static final ListTerm PRED_serialise_0_s20 = CONS(int_73, PRED_serialise_0_s19);
	private static final ListTerm PRED_serialise_0_s21 = CONS(int_32, PRED_serialise_0_s20);
	private static final ListTerm PRED_serialise_0_s22 = CONS(int_69, PRED_serialise_0_s21);
	private static final ListTerm PRED_serialise_0_s23 = CONS(int_82, PRED_serialise_0_s22);
	private static final ListTerm PRED_serialise_0_s24 = CONS(int_69, PRED_serialise_0_s23);
	private static final ListTerm PRED_serialise_0_s25 = CONS(int_32, PRED_serialise_0_s24);
	private static final ListTerm PRED_serialise_0_s26 = CONS(int_73, PRED_serialise_0_s25);
	private static final ListTerm PRED_serialise_0_s27 = CONS(int_32, PRED_serialise_0_s26);
	private static final ListTerm PRED_serialise_0_s28 = CONS(int_83, PRED_serialise_0_s27);
	private static final ListTerm PRED_serialise_0_s29 = CONS(PRED_serialise_0_s1, PRED_serialise_0_s28);
	private static final ListTerm PRED_serialise_0_s30 = CONS(int_87, PRED_serialise_0_s29);
	private static final ListTerm PRED_serialise_0_s31 = CONS(int_32, PRED_serialise_0_s30);
	private static final ListTerm PRED_serialise_0_s32 = CONS(int_69, PRED_serialise_0_s31);
	private static final ListTerm PRED_serialise_0_s33 = CONS(int_76, PRED_serialise_0_s32);
	private static final ListTerm PRED_serialise_0_s34 = CONS(int_66, PRED_serialise_0_s33);
	private static final ListTerm PRED_serialise_0_s35 = CONS(PRED_serialise_0_s1, PRED_serialise_0_s34);

	public static Operation PRED_serialise_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// serialise:-serialise([65,66,76,69,32,87,65,83,32,73,32,69,82,69,32,73,32,83,65,87,32,69,76,66,65],A)
		m.setB0();
		// serialise:-[serialise([65,66,76,69,32,87,65,83,32,73,32,69,82,69,32,73,32,83,65,87,32,69,76,66,65],A)]
		return //
		Op((Prolog e) -> PRED_serialise_2_static_exec(e), VA(PRED_serialise_0_s35, V(m)), cont);
	}

	/** PREDICATE: serialise/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
	private static final /**/ IntegerTerm PRED_serialise_2_s1 = Integer(1);

	public static Operation PRED_serialise_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// serialise(A,B):-pairlists(A,B,C),arrange(C,D),numbered(D,1,E)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// serialise(A,B):-[pairlists(A,B,C),arrange(C,D),numbered(D,1,E)]
		a3 = V(m);
		a4 = V(m);
		return //
		Op((Prolog e) -> PRED_pairlists_3_static_exec(e), VA(a1, a2, a3), //
				Op((Prolog e) -> PRED_arrange_2_static_exec(e), VA(a3, a4), //
						Op((Prolog e) -> PRED_numbered_3_static_exec(e), VA(a4, PRED_serialise_2_s1, V(m)), cont)));
	}

	/** PREDICATE: pairlists/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/

	public static Operation PRED_pairlists_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return pairlists_3_top(m);
	}

	private final static Operation pairlists_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_serialise::pairlists_3_var, fail_0, fail_0, FILE_serialise::pairlists_3_2, fail_0, FILE_serialise::pairlists_3_1);
	}

	private final static Operation pairlists_3_var(Prolog m) {
		m.jtry3(null, FILE_serialise::pairlists_3_var_1);
		return pairlists_3_1(m);
	}

	private final static Operation pairlists_3_var_1(Prolog m) {
		m.trust(null);
		return pairlists_3_2(m);
	}

	private final static Operation pairlists_3_1(Prolog m) {
		// pairlists([A|B],[C|D],[pair(A,C)|E]):-pairlists(B,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// pairlists([A|B],[C|D],[pair(A,C)|E]):-[pairlists(B,D,E)]
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
		if (!a8.unify(C("pair", a4, a6), m.trail)) {
			return m.fail();
		}
		m.AREGS[0] = a5;
		m.AREGS[1] = a7;
		m.AREGS[2] = a9;
		m.cont = cont;
		return pairlists_3_top(m);
	}

	private final static Operation pairlists_3_2(Prolog m) {
		// pairlists([],[],[]):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// pairlists([],[],[]):-[]
		if (!Prolog.Nil.unify(a1, m.trail))
			return m.fail();
		if (!Prolog.Nil.unify(a2, m.trail))
			return m.fail();
		if (!Prolog.Nil.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: arrange/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
	final static SymbolTerm ATOM_void = SYM("void");

	public static Operation PRED_arrange_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_serialise::arrange_2_var, fail_0, fail_0, FILE_serialise::arrange_2_2, fail_0, FILE_serialise::arrange_2_1);
	}

	private final static Operation arrange_2_var(Prolog m) {
		m.jtry2(null, FILE_serialise::arrange_2_var_1);
		return arrange_2_1(m);
	}

	private final static Operation arrange_2_var_1(Prolog m) {
		m.trust(null);
		return arrange_2_2(m);
	}

	private final static Operation arrange_2_1(Prolog m) {
		// arrange([A|B],tree(C,A,D)):-split(B,A,E,F),arrange(E,C),arrange(F,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// arrange([A|B],tree(C,A,D)):-[split(B,A,E,F),arrange(E,C),arrange(F,D)]
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
		a5 = V(m);
		a6 = V(m);
		if (!a2.unify(C("tree", a5, a3, a6), m.trail)) {
			return m.fail();
		}
		a7 = V(m);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_split_4_static_exec(e), VA(a4, a3, a7, a8), //
				Op((Prolog e) -> PRED_arrange_2_static_exec(e), VA(a7, a5), //
						Op((Prolog e) -> PRED_arrange_2_static_exec(e), VA(a8, a6), cont)));
	}

	private final static Operation arrange_2_2(Prolog m) {
		// arrange([],void):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// arrange([],void):-[]
		if (!Prolog.Nil.unify(a1, m.trail))
			return m.fail();
		if (!ATOM_void.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: split/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
	private static final SymbolTerm PRED_split_4_s1 = SYM("[]");

	public static Operation PRED_split_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return split_4_top(m);
	}

	private final static Operation split_4_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_serialise::split_4_var, fail_0, fail_0, FILE_serialise::split_4_4, fail_0, FILE_serialise::split_4_lis);
	}

	private final static Operation split_4_var(Prolog m) {
		m.jtry4(null, FILE_serialise::split_4_var_1);
		return split_4_1(m);
	}

	private final static Operation split_4_var_1(Prolog m) {
		m.retry(null, FILE_serialise::split_4_var_2);
		return split_4_2(m);
	}

	private final static Operation split_4_var_2(Prolog m) {
		m.retry(null, FILE_serialise::split_4_var_3);
		return split_4_3(m);
	}

	private final static Operation split_4_var_3(Prolog m) {
		m.trust(null);
		return split_4_4(m);
	}

	private final static Operation split_4_lis(Prolog m) {
		m.jtry4(null, FILE_serialise::split_4_lis_1);
		return split_4_1(m);
	}

	private final static Operation split_4_lis_1(Prolog m) {
		m.retry(null, FILE_serialise::split_4_lis_2);
		return split_4_2(m);
	}

	private final static Operation split_4_lis_2(Prolog m) {
		m.trust(null);
		return split_4_3(m);
	}

	private final static Operation split_4_1(Prolog m) {
		// split([A|B],A,C,D):-!,split(B,A,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split([A|B],A,C,D):-['$neck_cut',split(B,A,C,D)]
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
		if (!a5.unify(a2, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		m.AREGS[0] = a6;
		m.AREGS[1] = a5;
		m.AREGS[2] = a3;
		m.AREGS[3] = a4;
		m.cont = cont;
		return split_4_top(m);
	}

	private final static Operation split_4_2(Prolog m) {
		// split([A|B],C,[A|D],E):-before(A,C),!,split(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split([A|B],C,[A|D],E):-['$get_level'(F),before(A,C),'$cut'(F),split(B,C,D,E)]
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
		return //
		Op((Prolog e) -> PRED_before_2_static_exec(e), VA(a5, a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a8), //
						Op((Prolog e) -> PRED_split_4_static_exec(e), VA(a6, a2, a7, a4), cont)));
	}

	private final static Operation split_4_3(Prolog m) {
		// split([A|B],C,D,[A|E]):-before(C,A),!,split(B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split([A|B],C,D,[A|E]):-['$get_level'(F),before(C,A),'$cut'(F),split(B,C,D,E)]
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
		return //
		Op((Prolog e) -> PRED_before_2_static_exec(e), VA(a2, a5), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a8), //
						Op((Prolog e) -> PRED_split_4_static_exec(e), VA(a6, a2, a3, a7), cont)));
	}

	private final static Operation split_4_4(Prolog m) {
		// split([],A,[],[]):-true
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// split([],A,[],[]):-[]
		if (!PRED_split_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_split_4_s1.unify(a3, m.trail))
			return m.fail();
		if (!PRED_split_4_s1.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: before/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/

	public static Operation PRED_before_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// before(pair(A,B),pair(C,D)):-A<C
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// before(pair(A,B),pair(C,D)):-['$less_than'(A,C)]
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("pair", a3, V(m)), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a4 = V(m);
		if (!a2.unify(C("pair", a4, V(m)), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $less_than(a(3),a(4))
		if (Arithmetic.evaluate(a3).arithCompareTo(Arithmetic.evaluate(a4)) >= 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: numbered/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_numbered_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return numbered_3_top(m);
	}

	private final static Operation numbered_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_serialise::numbered_3_var, fail_0, fail_0, FILE_serialise::numbered_3_2, FILE_serialise::numbered_3_1, fail_0);
	}

	private final static Operation numbered_3_var(Prolog m) {
		m.jtry3(null, FILE_serialise::numbered_3_var_1);
		return numbered_3_1(m);
	}

	private final static Operation numbered_3_var_1(Prolog m) {
		m.trust(null);
		return numbered_3_2(m);
	}

	private final static Operation numbered_3_1(Prolog m) {
		// numbered(tree(A,pair(B,C),D),E,F):-numbered(A,E,C),G is C+1,numbered(D,G,F)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation p2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// numbered(tree(A,pair(B,C),D),E,F):-[numbered(A,E,C),G is C+1,numbered(D,G,F)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		if (!a1.unify(C("tree", a4, a5, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		a7 = V(m);
		if (!a5.unify(C("pair", V(m), a7), m.trail)) {
			return m.fail();
		}
		a8 = V(m);
		Term[] y1 = VA(a7, int_1);
		a9 = S("+", y1);
		p2 = //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a8, a9), //
						Op((Prolog e) -> PRED_numbered_3_static_exec(e), VA(a6, a8, a3), cont));
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.AREGS[2] = a7;
		m.cont = p2;
		return numbered_3_top(m);
	}

	private final static Operation numbered_3_2(Prolog m) {
		// numbered(void,A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// numbered(void,A,A):-[]
		if (!ATOM_void.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_serialise::PRED_top_0_static_exec);
		PredTable.registerBuiltin("serialise", 0, FILE_serialise::PRED_serialise_0_static_exec);
		PredTable.registerBuiltin("serialise", 2, FILE_serialise::PRED_serialise_2_static_exec);
		PredTable.registerBuiltin("pairlists", 3, FILE_serialise::PRED_pairlists_3_static_exec);
		PredTable.registerBuiltin("arrange", 2, FILE_serialise::PRED_arrange_2_static_exec);
		PredTable.registerBuiltin("split", 4, FILE_serialise::PRED_split_4_static_exec);
		PredTable.registerBuiltin("before", 2, FILE_serialise::PRED_before_2_static_exec);
		PredTable.registerBuiltin("numbered", 3, FILE_serialise::PRED_numbered_3_static_exec);
	}
}
