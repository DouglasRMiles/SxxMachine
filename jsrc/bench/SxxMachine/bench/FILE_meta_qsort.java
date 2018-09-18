package SxxMachine.bench;

import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.Failure.*;
import SxxMachine.*;
import SxxMachine.builtin.*;

public class FILE_meta_qsort  extends TermData {
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/

	public static Operation PRED_top_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// top:-meta_qsort
		m.setB0();
		// top:-[meta_qsort]
		return //
		Op((Prolog e) -> PRED_meta_qsort_0_static_exec(e), VA(), cont);
	}

	/** PREDICATE: meta_qsort/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
	private static final SymbolTerm PRED_meta_qsort_0_s1 = SYM("qsort");

	public static Operation PRED_meta_qsort_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// meta_qsort:-interpret(qsort)
		m.setB0();
		// meta_qsort:-[interpret(qsort)]
		return //
		Op((Prolog e) -> PRED_interpret_1_static_exec(e), VA(PRED_meta_qsort_0_s1), cont);
	}

	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_meta_qsort::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-nonvar(A),!,interpret(A)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-['$get_level'(B),nonvar(A),'$cut'(B),interpret(A)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(1))
		a1 = a1.dref();
		if ((a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2.dref();
		m.cut(a2.intValue());
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_interpret_1_static_exec(e), VA(a1), cont);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-[]
		return cont;
	}

	/** PREDICATE: interpret/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/

	public static Operation PRED_interpret_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// interpret(A):-interpret(A,B),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		// interpret(A):-[interpret(A,B),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B)]
		a2 = V(m);
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a1, a2), //
				Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec(e), VA(a2), cont));
	}

	/** PREDICATE: interpret/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
	final static SymbolTerm ATOM_fail = SYM("fail");
	final static SymbolTerm ATOM_$0021 = SYM("!");

	public static Operation PRED_interpret_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return interpret_2_top(m);
	}

	private final static Operation interpret_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_meta_qsort::interpret_2_var, FILE_meta_qsort::interpret_2_int, FILE_meta_qsort::interpret_2_int, FILE_meta_qsort::interpret_2_con, FILE_meta_qsort::interpret_2_str,
				FILE_meta_qsort::interpret_2_int);
	}

	private final static Operation interpret_2_var(Prolog m) {
		m.jtry2(null, FILE_meta_qsort::interpret_2_var_1);
		return interpret_2_1(m);
	}

	private final static Operation interpret_2_var_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_2);
		return interpret_2_2(m);
	}

	private final static Operation interpret_2_var_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_3);
		return interpret_2_3(m);
	}

	private final static Operation interpret_2_var_3(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_4);
		return interpret_2_4(m);
	}

	private final static Operation interpret_2_var_4(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_5);
		return interpret_2_5(m);
	}

	private final static Operation interpret_2_var_5(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_6);
		return interpret_2_6(m);
	}

	private final static Operation interpret_2_var_6(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_7);
		return interpret_2_7(m);
	}

	private final static Operation interpret_2_var_7(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_var_8);
		return interpret_2_8(m);
	}

	private final static Operation interpret_2_var_8(Prolog m) {
		m.trust(null);
		return interpret_2_9(m);
	}

	private final static Operation interpret_2_int(Prolog m) {
		m.jtry2(null, FILE_meta_qsort::interpret_2_int_1);
		return interpret_2_1(m);
	}

	private final static Operation interpret_2_int_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_int_2);
		return interpret_2_7(m);
	}

	private final static Operation interpret_2_int_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_int_3);
		return interpret_2_8(m);
	}

	private final static Operation interpret_2_int_3(Prolog m) {
		m.trust(null);
		return interpret_2_9(m);
	}

	private final static Operation interpret_2_con(Prolog m) {
		m.jtry2(null, FILE_meta_qsort::interpret_2_con_1);
		return interpret_2_1(m);
	}

	private final static Operation interpret_2_con_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_con_2);
		return interpret_2_6(m);
	}

	private final static Operation interpret_2_con_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_con_3);
		return interpret_2_7(m);
	}

	private final static Operation interpret_2_con_3(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_con_4);
		return interpret_2_8(m);
	}

	private final static Operation interpret_2_con_4(Prolog m) {
		m.trust(null);
		return interpret_2_9(m);
	}

	private final static Operation interpret_2_str(Prolog m) {
		m.jtry2(null, FILE_meta_qsort::interpret_2_str_1);
		return interpret_2_1(m);
	}

	private final static Operation interpret_2_str_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_str_2);
		return interpret_2_2(m);
	}

	private final static Operation interpret_2_str_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_str_3);
		return interpret_2_3(m);
	}

	private final static Operation interpret_2_str_3(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_str_4);
		return interpret_2_4(m);
	}

	private final static Operation interpret_2_str_4(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_str_5);
		return interpret_2_5(m);
	}

	private final static Operation interpret_2_str_5(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_str_6);
		return interpret_2_7(m);
	}

	private final static Operation interpret_2_str_6(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_2_str_7);
		return interpret_2_8(m);
	}

	private final static Operation interpret_2_str_7(Prolog m) {
		m.trust(null);
		return interpret_2_9(m);
	}

	private final static Operation interpret_2_1(Prolog m) {
		// interpret(A,B):-var(A),!,fail
		Term a1, a3;
		a1 = m.AREGS[0];
		// interpret(A,B):-['$get_level'(C),var(A),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		//START inline expansion of fail
		return m.fail();
		//END inline expansion
	}

	private final static Operation interpret_2_2(Prolog m) {
		// interpret((A,B),C):-!,interpret(A,D),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,C,D)
		Term a1, a2, a3, a4, a5;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// interpret((A,B),C):-['$neck_cut',interpret(A,D),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,C,D)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(",", a3, a4), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		a5 = V(m);
		p1 = //
				Op((Prolog e) -> PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(e), VA(a4, a2, a5), cont);
		m.AREGS[0] = a3;
		m.AREGS[1] = a5;
		m.cont = p1;
		return interpret_2_top(m);
	}

	private final static Operation interpret_2_3(Prolog m) {
		// interpret((A;B),C):-!,interpret_disjunction(A,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// interpret((A;B),C):-['$neck_cut',interpret_disjunction(A,B,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(";", a3, a4), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_interpret_disjunction_3_static_exec(e), VA(a3, a4, a2), cont);
	}

	private final static Operation interpret_2_4(Prolog m) {
		// interpret((A->B),C):-!,interpret_disjunction((A->B),fail,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// interpret((A->B),C):-['$neck_cut',interpret_disjunction((A->B),fail,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("->", a3, a4), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		Term[] y1 = VA(a3, a4);
		a5 = S("->", y1);
		return //
		Op((Prolog e) -> PRED_interpret_disjunction_3_static_exec(e), VA(a5, ATOM_fail, a2), cont);
	}

	private final static Operation interpret_2_5(Prolog m) {
		// interpret(\+A,B):-!,interpret_disjunction((A->fail),true,B)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// interpret(\+A,B):-['$neck_cut',interpret_disjunction((A->fail),true,B)]
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("\\+", a3), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		Term[] y1 = VA(a3, ATOM_fail);
		a4 = S("->", y1);
		return //
		Op((Prolog e) -> PRED_interpret_disjunction_3_static_exec(e), VA(a4, Prolog.True, a2), cont);
	}

	private final static Operation interpret_2_6(Prolog m) {
		// interpret(!,true):-!
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// interpret(!,true):-['$neck_cut']
		if (!ATOM_$0021.unify(a1, m.trail))
			return m.fail();
		if (!Prolog.True.unify(a2, m.trail))
			return m.fail();
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return cont;
	}

	private final static Operation interpret_2_7(Prolog m) {
		// interpret(A,B):-number(A),!,fail
		Term a1, a3;
		a1 = m.AREGS[0];
		// interpret(A,B):-['$get_level'(C),number(A),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of number(a(1))
		a1 = a1.dref();
		if (!a1.isNumber()) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		//START inline expansion of fail
		return m.fail();
		//END inline expansion
	}

	private final static Operation interpret_2_8(Prolog m) {
		// interpret(A,B):-is_built_in(A),!,interpret_built_in(A)
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// interpret(A,B):-['$get_level'(C),is_built_in(A),'$cut'(C),interpret_built_in(A)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_is_built_in_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_interpret_built_in_1_static_exec(e), VA(a1), cont)));
	}

	private final static Operation interpret_2_9(Prolog m) {
		// interpret(A,B):-define(A,C),interpret(C)
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// interpret(A,B):-[define(A,C),interpret(C)]
		a3 = V(m);
		return //
		Op((Prolog e) -> PRED_define_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_interpret_1_static_exec(e), VA(a3), cont));
	}

	/** PREDICATE: $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/

	public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_meta_qsort::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-nonvar(C),!,B=(C,A)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-['$get_level'(D),nonvar(C),'$cut'(D),'$unify'(B,(C,A))]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(3))
		a3 = a3.dref();
		if ((a3.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		Term[] y1 = VA(a3, a1);
		a5 = S(",", y1);
		//START inline expansion of $unify(a(2),a(5))
		if (!a2.unify(a5, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-interpret(A,B)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-[interpret(A,B)]
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a1, a2), cont);
	}

	/** PREDICATE: $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/

	public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_meta_qsort::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-nonvar(C),!,B=(C->A)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-['$get_level'(D),nonvar(C),'$cut'(D),'$unify'(B,(C->A))]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(3))
		a3 = a3.dref();
		if ((a3.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		Term[] y1 = VA(a3, a1);
		a5 = S("->", y1);
		//START inline expansion of $unify(a(2),a(5))
		if (!a2.unify(a5, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-interpret(A,B)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-[interpret(A,B)]
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a1, a2), cont);
	}

	/** PREDICATE: interpret_disjunction/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/

	public static Operation PRED_interpret_disjunction_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_meta_qsort::interpret_disjunction_3_var, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_int,
				FILE_meta_qsort::interpret_disjunction_3_var, FILE_meta_qsort::interpret_disjunction_3_int);
	}

	private final static Operation interpret_disjunction_3_var(Prolog m) {
		m.jtry3(null, FILE_meta_qsort::interpret_disjunction_3_var_1);
		return interpret_disjunction_3_1(m);
	}

	private final static Operation interpret_disjunction_3_var_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_disjunction_3_var_2);
		return interpret_disjunction_3_2(m);
	}

	private final static Operation interpret_disjunction_3_var_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::interpret_disjunction_3_var_3);
		return interpret_disjunction_3_3(m);
	}

	private final static Operation interpret_disjunction_3_var_3(Prolog m) {
		m.trust(null);
		return interpret_disjunction_3_4(m);
	}

	private final static Operation interpret_disjunction_3_int(Prolog m) {
		m.jtry3(null, FILE_meta_qsort::interpret_disjunction_3_int_1);
		return interpret_disjunction_3_3(m);
	}

	private final static Operation interpret_disjunction_3_int_1(Prolog m) {
		m.trust(null);
		return interpret_disjunction_3_4(m);
	}

	private final static Operation interpret_disjunction_3_1(Prolog m) {
		// interpret_disjunction((A->B),C,D):-interpret(A,E),!,'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,D,E)
		Term a1, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// interpret_disjunction((A->B),C,D):-['$get_level'(E),interpret(A,F),'$cut'(E),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,D,F)]
		a1 = a1.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("->", a4, a5), m.trail)) {
			return m.fail();
		}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a7 = V(m);
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a4, a7), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a6), //
						Op((Prolog e) -> PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(e), VA(a5, a3, a7), cont)));
	}

	private final static Operation interpret_disjunction_3_2(Prolog m) {
		// interpret_disjunction((A->B),C,D):-!,interpret(C,D)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// interpret_disjunction((A->B),C,D):-['$neck_cut',interpret(C,D)]
		a1 = a1.dref();
		if (!a1.unify(C("->", V(m), V(m)), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a2, a3), cont);
	}

	private final static Operation interpret_disjunction_3_3(Prolog m) {
		// interpret_disjunction(A,B,C):-interpret(A,C)
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// interpret_disjunction(A,B,C):-[interpret(A,C)]
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a1, a3), cont);
	}

	private final static Operation interpret_disjunction_3_4(Prolog m) {
		// interpret_disjunction(A,B,C):-interpret(B,C)
		Term a2, a3;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// interpret_disjunction(A,B,C):-[interpret(B,C)]
		return //
		Op((Prolog e) -> PRED_interpret_2_static_exec(e), VA(a2, a3), cont);
	}

	/** PREDICATE: is_built_in/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
	private static final SymbolTerm PRED_is_built_in_1_s1 = SYM("true");

	public static Operation PRED_is_built_in_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_meta_qsort::is_built_in_1_var, fail_0, fail_0, FILE_meta_qsort::is_built_in_1_1, FILE_meta_qsort::is_built_in_1_2, fail_0);
	}

	private final static Operation is_built_in_1_var(Prolog m) {
		m.jtry1(null, FILE_meta_qsort::is_built_in_1_var_1);
		return is_built_in_1_1(m);
	}

	private final static Operation is_built_in_1_var_1(Prolog m) {
		m.trust(null);
		return is_built_in_1_2(m);
	}

	private final static Operation is_built_in_1_1(Prolog m) {
		// is_built_in(true):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// is_built_in(true):-[]
		if (!PRED_is_built_in_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation is_built_in_1_2(Prolog m) {
		// is_built_in(A=<B):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// is_built_in(A=<B):-[]
		a1 = a1.dref();
		if (!a1.unify(C("=<", V(m), V(m)), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	/** PREDICATE: interpret_built_in/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
	private static final SymbolTerm PRED_interpret_built_in_1_s1 = SYM("true");

	public static Operation PRED_interpret_built_in_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_meta_qsort::interpret_built_in_1_var, fail_0, fail_0, FILE_meta_qsort::interpret_built_in_1_1, FILE_meta_qsort::interpret_built_in_1_2, fail_0);
	}

	private final static Operation interpret_built_in_1_var(Prolog m) {
		m.jtry1(null, FILE_meta_qsort::interpret_built_in_1_var_1);
		return interpret_built_in_1_1(m);
	}

	private final static Operation interpret_built_in_1_var_1(Prolog m) {
		m.trust(null);
		return interpret_built_in_1_2(m);
	}

	private final static Operation interpret_built_in_1_1(Prolog m) {
		// interpret_built_in(true):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// interpret_built_in(true):-[]
		if (!PRED_interpret_built_in_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation interpret_built_in_1_2(Prolog m) {
		// interpret_built_in(A=<B):-A=<B
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// interpret_built_in(A=<B):-['$less_or_equal'(A,B)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C("=<", a2, a3), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $less_or_equal(a(2),a(3))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a3)) > 0) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	/** PREDICATE: define/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl
	*/
	private static final SymbolTerm PRED_define_2_s1 = SYM("qsort");
	final static IntegerTerm int_27 = Integer(27);
	final static IntegerTerm int_74 = Integer(74);
	final static IntegerTerm int_17 = Integer(17);
	final static IntegerTerm int_33 = Integer(33);
	final static IntegerTerm int_94 = Integer(94);
	final static IntegerTerm int_18 = Integer(18);
	final static IntegerTerm int_46 = Integer(46);
	final static IntegerTerm int_83 = Integer(83);
	final static IntegerTerm int_65 = Integer(65);
	final static IntegerTerm int_2 = Integer(2);
	final static IntegerTerm int_32 = Integer(32);
	final static IntegerTerm int_53 = Integer(53);
	final static IntegerTerm int_28 = Integer(28);
	final static IntegerTerm int_85 = Integer(85);
	final static IntegerTerm int_99 = Integer(99);
	final static IntegerTerm int_47 = Integer(47);
	final static IntegerTerm int_82 = Integer(82);
	final static IntegerTerm int_6 = Integer(6);
	final static IntegerTerm int_11 = Integer(11);
	final static IntegerTerm int_55 = Integer(55);
	final static IntegerTerm int_29 = Integer(29);
	final static IntegerTerm int_39 = Integer(39);
	final static IntegerTerm int_81 = Integer(81);
	final static IntegerTerm int_90 = Integer(90);
	final static IntegerTerm int_37 = Integer(37);
	final static IntegerTerm int_10 = Integer(10);
	final static IntegerTerm int_0 = Integer(0);
	final static IntegerTerm int_66 = Integer(66);
	final static IntegerTerm int_51 = Integer(51);
	final static IntegerTerm int_7 = Integer(7);
	final static IntegerTerm int_21 = Integer(21);
	final static IntegerTerm int_31 = Integer(31);
	final static IntegerTerm int_63 = Integer(63);
	final static IntegerTerm int_75 = Integer(75);
	final static IntegerTerm int_4 = Integer(4);
	final static IntegerTerm int_95 = Integer(95);
	final static IntegerTerm int_61 = Integer(61);
	final static IntegerTerm int_92 = Integer(92);
	final static IntegerTerm int_40 = Integer(40);
	final static IntegerTerm int_59 = Integer(59);
	final static IntegerTerm int_8 = Integer(8);
	private static final ListTerm PRED_define_2_s45 = CONS(int_8, Prolog.Nil);
	private static final ListTerm PRED_define_2_s46 = CONS(int_59, PRED_define_2_s45);
	private static final ListTerm PRED_define_2_s47 = CONS(int_53, PRED_define_2_s46);
	private static final ListTerm PRED_define_2_s48 = CONS(int_40, PRED_define_2_s47);
	private static final ListTerm PRED_define_2_s49 = CONS(int_92, PRED_define_2_s48);
	private static final ListTerm PRED_define_2_s50 = CONS(int_18, PRED_define_2_s49);
	private static final ListTerm PRED_define_2_s51 = CONS(int_74, PRED_define_2_s50);
	private static final ListTerm PRED_define_2_s52 = CONS(int_61, PRED_define_2_s51);
	private static final ListTerm PRED_define_2_s53 = CONS(int_28, PRED_define_2_s52);
	private static final ListTerm PRED_define_2_s54 = CONS(int_11, PRED_define_2_s53);
	private static final ListTerm PRED_define_2_s55 = CONS(int_99, PRED_define_2_s54);
	private static final ListTerm PRED_define_2_s56 = CONS(int_95, PRED_define_2_s55);
	private static final ListTerm PRED_define_2_s57 = CONS(int_4, PRED_define_2_s56);
	private static final ListTerm PRED_define_2_s58 = CONS(int_75, PRED_define_2_s57);
	private static final ListTerm PRED_define_2_s59 = CONS(int_63, PRED_define_2_s58);
	private static final ListTerm PRED_define_2_s60 = CONS(int_31, PRED_define_2_s59);
	private static final ListTerm PRED_define_2_s61 = CONS(int_27, PRED_define_2_s60);
	private static final ListTerm PRED_define_2_s62 = CONS(int_85, PRED_define_2_s61);
	private static final ListTerm PRED_define_2_s63 = CONS(int_21, PRED_define_2_s62);
	private static final ListTerm PRED_define_2_s64 = CONS(int_7, PRED_define_2_s63);
	private static final ListTerm PRED_define_2_s65 = CONS(int_51, PRED_define_2_s64);
	private static final ListTerm PRED_define_2_s66 = CONS(int_66, PRED_define_2_s65);
	private static final ListTerm PRED_define_2_s67 = CONS(int_0, PRED_define_2_s66);
	private static final ListTerm PRED_define_2_s68 = CONS(int_10, PRED_define_2_s67);
	private static final ListTerm PRED_define_2_s69 = CONS(int_37, PRED_define_2_s68);
	private static final ListTerm PRED_define_2_s70 = CONS(int_90, PRED_define_2_s69);
	private static final ListTerm PRED_define_2_s71 = CONS(int_81, PRED_define_2_s70);
	private static final ListTerm PRED_define_2_s72 = CONS(int_39, PRED_define_2_s71);
	private static final ListTerm PRED_define_2_s73 = CONS(int_29, PRED_define_2_s72);
	private static final ListTerm PRED_define_2_s74 = CONS(int_55, PRED_define_2_s73);
	private static final ListTerm PRED_define_2_s75 = CONS(int_11, PRED_define_2_s74);
	private static final ListTerm PRED_define_2_s76 = CONS(int_6, PRED_define_2_s75);
	private static final ListTerm PRED_define_2_s77 = CONS(int_82, PRED_define_2_s76);
	private static final ListTerm PRED_define_2_s78 = CONS(int_28, PRED_define_2_s77);
	private static final ListTerm PRED_define_2_s79 = CONS(int_47, PRED_define_2_s78);
	private static final ListTerm PRED_define_2_s80 = CONS(int_99, PRED_define_2_s79);
	private static final ListTerm PRED_define_2_s81 = CONS(int_85, PRED_define_2_s80);
	private static final ListTerm PRED_define_2_s82 = CONS(int_28, PRED_define_2_s81);
	private static final ListTerm PRED_define_2_s83 = CONS(int_53, PRED_define_2_s82);
	private static final ListTerm PRED_define_2_s84 = CONS(int_32, PRED_define_2_s83);
	private static final ListTerm PRED_define_2_s85 = CONS(int_2, PRED_define_2_s84);
	private static final ListTerm PRED_define_2_s86 = CONS(int_65, PRED_define_2_s85);
	private static final ListTerm PRED_define_2_s87 = CONS(int_83, PRED_define_2_s86);
	private static final ListTerm PRED_define_2_s88 = CONS(int_46, PRED_define_2_s87);
	private static final ListTerm PRED_define_2_s89 = CONS(int_18, PRED_define_2_s88);
	private static final ListTerm PRED_define_2_s90 = CONS(int_94, PRED_define_2_s89);
	private static final ListTerm PRED_define_2_s91 = CONS(int_33, PRED_define_2_s90);
	private static final ListTerm PRED_define_2_s92 = CONS(int_17, PRED_define_2_s91);
	private static final ListTerm PRED_define_2_s93 = CONS(int_74, PRED_define_2_s92);
	private static final ListTerm PRED_define_2_s94 = CONS(int_27, PRED_define_2_s93);

	public static Operation PRED_define_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_meta_qsort::define_2_var, fail_0, fail_0, FILE_meta_qsort::define_2_1, FILE_meta_qsort::define_2_str, fail_0);
	}

	private final static Operation define_2_var(Prolog m) {
		m.jtry2(null, FILE_meta_qsort::define_2_var_1);
		return define_2_1(m);
	}

	private final static Operation define_2_var_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_var_2);
		return define_2_2(m);
	}

	private final static Operation define_2_var_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_var_3);
		return define_2_3(m);
	}

	private final static Operation define_2_var_3(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_var_4);
		return define_2_4(m);
	}

	private final static Operation define_2_var_4(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_var_5);
		return define_2_5(m);
	}

	private final static Operation define_2_var_5(Prolog m) {
		m.trust(null);
		return define_2_6(m);
	}

	private final static Operation define_2_str(Prolog m) {
		m.jtry2(null, FILE_meta_qsort::define_2_str_1);
		return define_2_2(m);
	}

	private final static Operation define_2_str_1(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_str_2);
		return define_2_3(m);
	}

	private final static Operation define_2_str_2(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_str_3);
		return define_2_4(m);
	}

	private final static Operation define_2_str_3(Prolog m) {
		m.retry(null, FILE_meta_qsort::define_2_str_4);
		return define_2_5(m);
	}

	private final static Operation define_2_str_4(Prolog m) {
		m.trust(null);
		return define_2_6(m);
	}

	private final static Operation define_2_1(Prolog m) {
		// define(qsort,qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// define(qsort,qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])):-[]
		if (!PRED_define_2_s1.unify(a1, m.trail))
			return m.fail();
		a2 = a2.dref();
		if (!a2.unify(C("qsort", PRED_define_2_s94, V(m), Prolog.Nil), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation define_2_2(Prolog m) {
		// define(qsort([A|B],C,D),(partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G]))):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// define(qsort([A|B],C,D),(partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G]))):-[]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		if (!a1.unify(C("qsort", a3, a4, a5), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			a6 = argz[0];
			a7 = argz[1];
		} else if (a3.isVar()) {
			a6 = V(m);
			a7 = V(m);
			a3.bind(CONS(a6, a7), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		a8 = V(m);
		a9 = V(m);
		if (!a2.unify(C(",", a8, a9), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		a10 = V(m);
		a11 = V(m);
		if (!a8.unify(C("partition", a7, a6, a10, a11), m.trail)) {
			return m.fail();
		}
		a9 = a9.dref();
		a12 = V(m);
		a13 = V(m);
		if (!a9.unify(C(",", a12, a13), m.trail)) {
			return m.fail();
		}
		a12 = a12.dref();
		a14 = V(m);
		if (!a12.unify(C("qsort", a11, a14, a5), m.trail)) {
			return m.fail();
		}
		a13 = a13.dref();
		a15 = V(m);
		if (!a13.unify(C("qsort", a10, a4, a15), m.trail)) {
			return m.fail();
		}
		a15 = a15.dref();
		if (a15.isCons()) {
			Term[] argz = VA(a15.car(), a15.cdr());
			if (!a6.unify(argz[0], m.trail))
				return m.fail();
			if (!a14.unify(argz[1], m.trail))
				return m.fail();
		} else if (a15.isVar()) {
			a15.bind(CONS(a6, a14), m.trail);
		} else {
			return m.fail();
		}
		return cont;
	}

	private final static Operation define_2_3(Prolog m) {
		// define(qsort([],A,A),true):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// define(qsort([],A,A),true):-[]
		a1 = a1.dref();
		a3 = V(m);
		if (!a1.unify(C("qsort", Prolog.Nil, a3, a3), m.trail)) {
			return m.fail();
		}
		if (!Prolog.True.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation define_2_4(Prolog m) {
		// define(partition([A|B],C,[A|D],E),(A=<C,!,partition(B,C,D,E))):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// define(partition([A|B],C,[A|D],E),(A=<C,!,partition(B,C,D,E))):-[]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		if (!a1.unify(C("partition", a3, a4, a5, a6), m.trail)) {
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
		a5 = a5.dref();
		if (a5.isCons()) {
			Term[] argz = VA(a5.car(), a5.cdr());
			if (!a7.unify(argz[0], m.trail))
				return m.fail();
			a9 = argz[1];
		} else if (a5.isVar()) {
			a9 = V(m);
			a5.bind(CONS(a7, a9), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		a10 = V(m);
		a11 = V(m);
		if (!a2.unify(C(",", a10, a11), m.trail)) {
			return m.fail();
		}
		a10 = a10.dref();
		if (!a10.unify(C("=<", a7, a4), m.trail)) {
			return m.fail();
		}
		a11 = a11.dref();
		a12 = V(m);
		if (!a11.unify(C(",", ATOM_$0021, a12), m.trail)) {
			return m.fail();
		}
		a12 = a12.dref();
		if (!a12.unify(C("partition", a8, a4, a9, a6), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation define_2_5(Prolog m) {
		// define(partition([A|B],C,D,[A|E]),partition(B,C,D,E)):-true
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// define(partition([A|B],C,D,[A|E]),partition(B,C,D,E)):-[]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		if (!a1.unify(C("partition", a3, a4, a5, a6), m.trail)) {
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
		a6 = a6.dref();
		if (a6.isCons()) {
			Term[] argz = VA(a6.car(), a6.cdr());
			if (!a7.unify(argz[0], m.trail))
				return m.fail();
			a9 = argz[1];
		} else if (a6.isVar()) {
			a9 = V(m);
			a6.bind(CONS(a7, a9), m.trail);
		} else {
			return m.fail();
		}
		a2 = a2.dref();
		if (!a2.unify(C("partition", a8, a4, a5, a9), m.trail)) {
			return m.fail();
		}
		return cont;
	}

	private final static Operation define_2_6(Prolog m) {
		// define(partition([],A,[],[]),true):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// define(partition([],A,[],[]),true):-[]
		a1 = a1.dref();
		if (!a1.unify(C("partition", Prolog.Nil, V(m), Prolog.Nil, Prolog.Nil), m.trail)) {
			return m.fail();
		}
		if (!Prolog.True.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("top", 0, FILE_meta_qsort::PRED_top_0_static_exec);
		PredTable.registerBuiltin("meta_qsort", 0, FILE_meta_qsort::PRED_meta_qsort_0_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl",
				"$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl", 1,
				FILE_meta_qsort::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec);
		PredTable.registerBuiltin("interpret", 1, FILE_meta_qsort::PRED_interpret_1_static_exec);
		PredTable.registerBuiltin("interpret", 2, FILE_meta_qsort::PRED_interpret_2_static_exec);
		PredTable.registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl",
				"$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl", 3,
				FILE_meta_qsort::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec);
		PredTable.registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl",
				"$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl", 3,
				FILE_meta_qsort::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec);
		PredTable.registerBuiltin("interpret_disjunction", 3, FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec);
		PredTable.registerBuiltin("is_built_in", 1, FILE_meta_qsort::PRED_is_built_in_1_static_exec);
		PredTable.registerBuiltin("interpret_built_in", 1, FILE_meta_qsort::PRED_interpret_built_in_1_static_exec);
		PredTable.registerBuiltin("define", 2, FILE_meta_qsort::PRED_define_2_static_exec);
	}
}
