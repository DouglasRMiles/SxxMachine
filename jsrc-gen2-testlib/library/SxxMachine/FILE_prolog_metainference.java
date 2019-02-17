package SxxMachine;

import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_$inequality_of_term_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_callable_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_clause_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_compound_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_findall_3_static_exec;
import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_var_1_static_exec;
import static SxxMachine.FILE_swi_supp.PRED_append_3_static_exec;
import static SxxMachine.FILE_swi_supp.PRED_maplist_4_static_exec;
import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
import static SxxMachine.bootpreds.PRED_$univ_2_static_exec;
import static SxxMachine.bootpreds.PRED_arg_3_static_exec;
import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
import static SxxMachine.missing_preds.PRED_predicate_property_2_static_exec;
import static SxxMachine.sxxtensions.PRED_get_attr_3_static_exec;
import static SxxMachine.sxxtensions.PRED_put_attr_3_static_exec;

import SxxMachine.pterm.IntegerTerm;
import SxxMachine.pterm.TermData;

public class FILE_prolog_metainference extends TermData {
	/**
	 * PREDICATE: inferred_meta_predicate/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	final static Functor ATOM_prolog_metainference = SYM("prolog_metainference");

	public static Operation PRED_inferred_meta_predicate_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_metainference::inferred_meta_predicate_2_var, fail_0, fail_0, fail_0,
				FILE_prolog_metainference::inferred_meta_predicate_2_var, fail_0);
	}

	private final static Operation inferred_meta_predicate_2_var(Prolog m) {
		m.jtry2(null, FILE_prolog_metainference::inferred_meta_predicate_2_var_1);
		return inferred_meta_predicate_2_1(m);
	}

	private final static Operation inferred_meta_predicate_2_var_1(Prolog m) {
		m.trust(null);
		return inferred_meta_predicate_2_2(m);
	}

	private final static Operation inferred_meta_predicate_2_1(Prolog m) {
		// inferred_meta_predicate(A:B,C):-inferred_meta_pred(B,A,C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// inferred_meta_predicate(A:B,C):-[call(prolog_metainference:inferred_meta_pred(B,A,C))]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(":", a3, a4), m.trail)) {
			return m.fail();
		}
		Term[] y1 = VA(a4, a3, a2);
		a5 = S("inferred_meta_pred", y1);
		Term[] y2 = VA(ATOM_prolog_metainference, a5);
		a6 = S(":", y2);
		return //
		Op((Prolog e) -> PRED_call_1_static_exec(e), VA(a6), cont);
	}

	private final static Operation inferred_meta_predicate_2_2(Prolog m) {
		// inferred_meta_predicate(A:B,C):-predicate_property(A:B,imported_from(D)),inferred_meta_pred(B,D,C)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// inferred_meta_predicate(A:B,C):-[predicate_property(A:B,imported_from(D)),call(prolog_metainference:inferred_meta_pred(B,D,C))]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(":", a3, a4), m.trail)) {
			return m.fail();
		}
		Term[] y1 = VA(a3, a4);
		a5 = S(":", y1);
		a6 = V(m);
		Term[] y2 = VA(a6);
		a7 = S("imported_from", y2);
		Term[] y3 = VA(a4, a6, a2);
		a8 = S("inferred_meta_pred", y3);
		Term[] y4 = VA(ATOM_prolog_metainference, a8);
		a9 = S(":", y4);
		return //
		Op((Prolog e) -> PRED_predicate_property_2_static_exec(e), VA(a5, a7), //
				Op((Prolog e) -> PRED_call_1_static_exec(e), VA(a9), cont));
	}

	/**
	 * PREDICATE: infer_meta_predicate/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_infer_meta_predicate_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_metainference::infer_meta_predicate_2_var,
				FILE_prolog_metainference::infer_meta_predicate_2_1,
				FILE_prolog_metainference::infer_meta_predicate_2_1,
				FILE_prolog_metainference::infer_meta_predicate_2_1,
				FILE_prolog_metainference::infer_meta_predicate_2_var,
				FILE_prolog_metainference::infer_meta_predicate_2_1);
	}

	private final static Operation infer_meta_predicate_2_var(Prolog m) {
		m.jtry2(null, FILE_prolog_metainference::infer_meta_predicate_2_var_1);
		return infer_meta_predicate_2_1(m);
	}

	private final static Operation infer_meta_predicate_2_var_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::infer_meta_predicate_2_var_2);
		return infer_meta_predicate_2_2(m);
	}

	private final static Operation infer_meta_predicate_2_var_2(Prolog m) {
		m.trust(null);
		return infer_meta_predicate_2_3(m);
	}

	private final static Operation infer_meta_predicate_2_1(Prolog m) {
		// infer_meta_predicate(A,B):-inferred_meta_predicate(A,B),!
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// infer_meta_predicate(A,B):-['$get_level'(C),inferred_meta_predicate(prolog_metainference:A,B),'$cut'(C)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		Term[] y1 = VA(ATOM_prolog_metainference, a1);
		a4 = S(":", y1);
		return //
		Op((Prolog e) -> PRED_inferred_meta_predicate_2_static_exec(e), VA(a4, a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont));
	}

	private final static Operation infer_meta_predicate_2_2(Prolog m) {
		// infer_meta_predicate(A:B,C):-predicate_property(A:B,imported_from(D)),!,do_infer_meta_predicate(D:B,C),assertz(inferred_meta_pred(B,D,C))
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// infer_meta_predicate(A:B,C):-['$get_level'(D),predicate_property(A:B,imported_from(E)),'$cut'(D),do_infer_meta_predicate(E:B,C),assertz(prolog_metainference:inferred_meta_pred(B,E,C))]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(":", a3, a4), m.trail)) {
			return m.fail();
		}
		a5 = V(m);
		// START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		Term[] y1 = VA(a3, a4);
		a6 = S(":", y1);
		a7 = V(m);
		Term[] y2 = VA(a7);
		a8 = S("imported_from", y2);
		Term[] y3 = VA(a7, a4);
		a9 = S(":", y3);
		Term[] y4 = VA(a4, a7, a2);
		a10 = S("inferred_meta_pred", y4);
		Term[] y5 = VA(ATOM_prolog_metainference, a10);
		a11 = S(":", y5);
		return //
		Op((Prolog e) -> PRED_predicate_property_2_static_exec(e), VA(a6, a8), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a5), //
						Op((Prolog e) -> PRED_do_infer_meta_predicate_2_static_exec(e), VA(a9, a2), //
								Op((Prolog e) -> PRED_assertz_1_static_exec(e), VA(a11), cont))));
	}

	private final static Operation infer_meta_predicate_2_3(Prolog m) {
		// infer_meta_predicate(A:B,C):-do_infer_meta_predicate(A:B,C),assertz(inferred_meta_pred(B,A,C))
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// infer_meta_predicate(A:B,C):-[do_infer_meta_predicate(A:B,C),assertz(prolog_metainference:inferred_meta_pred(B,A,C))]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(":", a3, a4), m.trail)) {
			return m.fail();
		}
		Term[] y1 = VA(a3, a4);
		a5 = S(":", y1);
		Term[] y2 = VA(a4, a3, a2);
		a6 = S("inferred_meta_pred", y2);
		Term[] y3 = VA(ATOM_prolog_metainference, a6);
		a7 = S(":", y3);
		return //
		Op((Prolog e) -> PRED_do_infer_meta_predicate_2_static_exec(e), VA(a5, a2), //
				Op((Prolog e) -> PRED_assertz_1_static_exec(e), VA(a7), cont));
	}

	/**
	 * PREDICATE: do_infer_meta_predicate/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_do_infer_meta_predicate_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// do_infer_meta_predicate(A:B,C):-functor(B,D,E),functor(F,D,E),findall(C,meta_pred_args_in_clause(A,F,C),G),G\==[],combine_meta_args(G,C)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		a1 = LARG[0];
		a2 = LARG[1];
		// do_infer_meta_predicate(A:B,C):-[functor(B,D,E),functor(F,D,E),findall(C,prolog_metainference:meta_pred_args_in_clause(A,F,C),G),'$inequality_of_term'(G,[]),combine_meta_args(G,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(":", a3, a4), m.trail)) {
			return m.fail();
		}
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = Closure( //
				Op((Prolog e) -> PRED_meta_pred_args_in_clause_3_static_exec(e), VA(a3, a7, a2), null));
		a9 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a4, a5, a6), //
				Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a7, a5, a6), //
						Op((Prolog e) -> PRED_findall_3_static_exec(e), VA(a2, a8, a9), //
								Op((Prolog e) -> PRED_$inequality_of_term_2_static_exec(e), VA(a9, Prolog.Nil), //
										Op((Prolog e) -> PRED_combine_meta_args_2_static_exec(e), VA(a9, a2), cont)))));
	}

	/**
	 * PREDICATE: meta_pred_args_in_clause/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_meta_pred_args_in_clause_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// meta_pred_args_in_clause(A,B,C):-clause(A:B,D),annotate_meta_vars_in_body(D,A),meta_annotation(B,C)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// meta_pred_args_in_clause(A,B,C):-[clause(A:B,D),annotate_meta_vars_in_body(D,A),meta_annotation(B,C)]
		Term[] y1 = VA(a1, a2);
		a4 = S(":", y1);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_clause_2_static_exec(e), VA(a4, a5), //
				Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a5, a1), //
						Op((Prolog e) -> PRED_meta_annotation_2_static_exec(e), VA(a2, a3), cont)));
	}

	/**
	 * PREDICATE: annotate_meta_vars_in_body/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final /**/ IntegerTerm PRED_annotate_meta_vars_in_body_2_s1 = Integer(0);
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_annotate_meta_vars_in_body_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return annotate_meta_vars_in_body_2_top(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_prolog_metainference::annotate_meta_vars_in_body_2_var,
				FILE_prolog_metainference::annotate_meta_vars_in_body_2_int,
				FILE_prolog_metainference::annotate_meta_vars_in_body_2_int,
				FILE_prolog_metainference::annotate_meta_vars_in_body_2_int,
				FILE_prolog_metainference::annotate_meta_vars_in_body_2_var,
				FILE_prolog_metainference::annotate_meta_vars_in_body_2_int);
	}

	private final static Operation annotate_meta_vars_in_body_2_var(Prolog m) {
		m.jtry2(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_1);
		return annotate_meta_vars_in_body_2_1(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_2);
		return annotate_meta_vars_in_body_2_2(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_3);
		return annotate_meta_vars_in_body_2_3(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_3(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_4);
		return annotate_meta_vars_in_body_2_4(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_4(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_5);
		return annotate_meta_vars_in_body_2_5(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_5(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_6);
		return annotate_meta_vars_in_body_2_6(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_6(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_7);
		return annotate_meta_vars_in_body_2_7(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_7(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_8);
		return annotate_meta_vars_in_body_2_8(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_8(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_9);
		return annotate_meta_vars_in_body_2_9(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_9(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_var_10);
		return annotate_meta_vars_in_body_2_10(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_var_10(Prolog m) {
		m.trust(null);
		return annotate_meta_vars_in_body_2_11(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_int(Prolog m) {
		m.jtry2(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_int_1);
		return annotate_meta_vars_in_body_2_1(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_int_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_int_2);
		return annotate_meta_vars_in_body_2_2(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_int_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_int_3);
		return annotate_meta_vars_in_body_2_9(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_int_3(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_vars_in_body_2_int_4);
		return annotate_meta_vars_in_body_2_10(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_int_4(Prolog m) {
		m.trust(null);
		return annotate_meta_vars_in_body_2_11(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_1(Prolog m) {
		// annotate_meta_vars_in_body(A,B):-atomic(A),!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// annotate_meta_vars_in_body(A,B):-['$get_level'(C),atomic(A),'$cut'(C)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of atomic(a(1))
		a1 = a1.dref();
		if (!a1.isAtomicValue()) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		// END inline expansion
		return cont;
	}

	private final static Operation annotate_meta_vars_in_body_2_2(Prolog m) {
		// annotate_meta_vars_in_body(A,B):-var(A),!,annotate(A,0)
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// annotate_meta_vars_in_body(A,B):-['$get_level'(C),var(A),'$cut'(C),annotate(A,0)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_annotate_2_static_exec(e), VA(a1, PRED_annotate_meta_vars_in_body_2_s1), cont);
	}

	private final static Operation annotate_meta_vars_in_body_2_3(Prolog m) {
		// annotate_meta_vars_in_body(A:B,C):-!,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B)
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// annotate_meta_vars_in_body(A:B,C):-['$neck_cut','$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(":", a3, a4), m.trail)) {
			return m.fail();
		}
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec(
				e), VA(a3, a4), cont);
	}

	private final static Operation annotate_meta_vars_in_body_2_4(Prolog m) {
		// annotate_meta_vars_in_body((A,B),C):-!,annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)
		Term a1, a2, a3, a4;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_vars_in_body((A,B),C):-['$neck_cut',annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(",", a3, a4), m.trail)) {
			return m.fail();
		}
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a3, a2), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.cont = p1;
		return annotate_meta_vars_in_body_2_top(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_5(Prolog m) {
		// annotate_meta_vars_in_body((A;B),C):-!,annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)
		Term a1, a2, a3, a4;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_vars_in_body((A;B),C):-['$neck_cut',annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C(";", a3, a4), m.trail)) {
			return m.fail();
		}
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a3, a2), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.cont = p1;
		return annotate_meta_vars_in_body_2_top(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_6(Prolog m) {
		// annotate_meta_vars_in_body((A->B),C):-!,annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)
		Term a1, a2, a3, a4;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_vars_in_body((A->B),C):-['$neck_cut',annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("->", a3, a4), m.trail)) {
			return m.fail();
		}
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a3, a2), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.cont = p1;
		return annotate_meta_vars_in_body_2_top(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_7(Prolog m) {
		// annotate_meta_vars_in_body((A*->B),C):-!,annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)
		Term a1, a2, a3, a4;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_vars_in_body((A*->B),C):-['$neck_cut',annotate_meta_vars_in_body(B,C),annotate_meta_vars_in_body(A,C)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("*->", a3, a4), m.trail)) {
			return m.fail();
		}
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		p1 = //
				Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a3, a2), cont);
		m.AREGS[0] = a4;
		m.AREGS[1] = a2;
		m.cont = p1;
		return annotate_meta_vars_in_body_2_top(m);
	}

	private final static Operation annotate_meta_vars_in_body_2_8(Prolog m) {
		// annotate_meta_vars_in_body(A=B,C):-var(A),var(B),!,A=B
		Term a1, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// annotate_meta_vars_in_body(A=B,C):-['$get_level'(D),var(A),var(B),'$cut'(D),'$unify'(A,B)]
		a1 = a1.dref();
		a3 = V(m);
		a4 = V(m);
		if (!a1.unify(C("=", a3, a4), m.trail)) {
			return m.fail();
		}
		a5 = V(m);
		// START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of var(a(3))
		a3 = a3.dref();
		if (!(a3.isVariable())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of var(a(4))
		a4 = a4.dref();
		if (!(a4.isVariable())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(5))
		a5 = a5.dref();
		m.cut(a5.intValue());
		// END inline expansion
		// START inline expansion of $unify(a(3),a(4))
		if (!a3.unify(a4, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	private final static Operation annotate_meta_vars_in_body_2_9(Prolog m) {
		// annotate_meta_vars_in_body(A,B):-predicate_property(B:A,(meta_predicate
		// C)),!,functor(A,D,E),annotate_meta_args(1,E,A,C,B)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_vars_in_body(A,B):-['$get_level'(C),predicate_property(B:A,(meta_predicate
		// D)),'$cut'(C),functor(A,E,F),annotate_meta_args(1,F,A,D,B)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		Term[] y1 = VA(a2, a1);
		a4 = S(":", y1);
		a5 = V(m);
		Term[] y2 = VA(a5);
		a6 = S("meta_predicate", y2);
		a7 = V(m);
		return //
		Op((Prolog e) -> PRED_predicate_property_2_static_exec(e), VA(a4, a6), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, V(m), a7), //
								Op((Prolog e) -> PRED_annotate_meta_args_5_static_exec(e), VA(int_1, a7, a1, a5, a2),
										cont))));
	}

	private final static Operation annotate_meta_vars_in_body_2_10(Prolog m) {
		// annotate_meta_vars_in_body(A,B):-inferred_meta_predicate(B:A,C),!,functor(A,D,E),annotate_meta_args(1,E,A,C,B)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_vars_in_body(A,B):-['$get_level'(C),inferred_meta_predicate(B:A,D),'$cut'(C),functor(A,E,F),annotate_meta_args(1,F,A,D,B)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		Term[] y1 = VA(a2, a1);
		a4 = S(":", y1);
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_inferred_meta_predicate_2_static_exec(e), VA(a4, a5), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, V(m), a6), //
								Op((Prolog e) -> PRED_annotate_meta_args_5_static_exec(e), VA(int_1, a6, a1, a5, a2),
										cont))));
	}

	private final static Operation annotate_meta_vars_in_body_2_11(Prolog m) {
		Operation cont;
		cont = m.cont;
		// annotate_meta_vars_in_body(A,B):-[]
		return cont;
	}

	/**
	 * PREDICATE:
	 * $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/2
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null,
				FILE_prolog_metainference::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_1(
				m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_1(
			Prolog m) {
		m.retry(null,
				FILE_prolog_metainference::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_2);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_2(
				m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_2(
			Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_3(
				m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_1(
			Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-atom(A),!,annotate_meta_vars_in_body(B,A)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-['$get_level'(C),atom(A),'$cut'(C),annotate_meta_vars_in_body(B,A)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of atom(a(1))
		a1 = a1.dref();
		if (!(a1.isAtomString())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a2, a1), cont);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_2(
			Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A)
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-['$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A)]
		return //
		Op((Prolog e) -> PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(
				e), VA(a1), cont);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_3(
			Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-[]
		return cont;
	}

	/**
	 * PREDICATE:
	 * $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/1
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_s1 = SYM(
			"m");

	public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null,
				FILE_prolog_metainference::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(
				m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(
				m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(
			Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-var(A),!,annotate(A,m)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-['$get_level'(B),var(A),'$cut'(B),annotate(A,m)]
		a2 = V(m);
		// START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of var(a(1))
		a1 = a1.dref();
		if (!(a1.isVariable())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(2))
		a2 = a2.dref();
		m.cut(a2.intValue());
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_annotate_2_static_exec(e), VA(a1,
				PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_s1),
				cont);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(
			Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-[fail]
		// START inline expansion of fail
		return m.fail();
		// END inline expansion
	}

	/**
	 * PREDICATE: annotate_meta_args/5 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	// private final Term arg5;

	public static Operation PRED_annotate_meta_args_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_prolog_metainference::annotate_meta_args_5_sub_1);
		return annotate_meta_args_5_1(m);
	}

	private final static Operation annotate_meta_args_5_sub_1(Prolog m) {
		m.trust(null);
		return annotate_meta_args_5_2(m);
	}

	private final static Operation annotate_meta_args_5_1(Prolog m) {
		// annotate_meta_args(A,B,C,D,E):-A=<B,!,arg(A,D,F),arg(A,C,G),annotate_meta_arg(F,G,E),H
		// is A+1,annotate_meta_args(H,B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// annotate_meta_args(A,B,C,D,E):-['$get_level'(F),'$less_or_equal'(A,B),'$cut'(F),arg(A,D,G),arg(A,C,H),annotate_meta_arg(G,H,E),I
		// is A+1,annotate_meta_args(I,B,C,D,E)]
		a6 = V(m);
		// START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		// END inline expansion
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		Term[] y1 = VA(a1, int_1);
		a10 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a4, a7), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a3, a8), //
						Op((Prolog e) -> PRED_annotate_meta_arg_3_static_exec(e), VA(a7, a8, a5), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a9, a10), //
										Op((Prolog e) -> PRED_annotate_meta_args_5_static_exec(e),
												VA(a9, a2, a3, a4, a5), cont)))));
	}

	private final static Operation annotate_meta_args_5_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// annotate_meta_args(A,B,C,D,E):-[]
		return cont;
	}

	/**
	 * PREDICATE: annotate_meta_arg/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final /**/ IntegerTerm PRED_annotate_meta_arg_3_s1 = Integer(0);
	final static Functor ATOM_m = SYM("m");

	public static Operation PRED_annotate_meta_arg_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_metainference::annotate_meta_arg_3_var,
				FILE_prolog_metainference::annotate_meta_arg_3_var, FILE_prolog_metainference::annotate_meta_arg_3_flo,
				FILE_prolog_metainference::annotate_meta_arg_3_flo, FILE_prolog_metainference::annotate_meta_arg_3_flo,
				FILE_prolog_metainference::annotate_meta_arg_3_flo);
	}

	private final static Operation annotate_meta_arg_3_var(Prolog m) {
		m.jtry3(null, FILE_prolog_metainference::annotate_meta_arg_3_var_1);
		return annotate_meta_arg_3_1(m);
	}

	private final static Operation annotate_meta_arg_3_var_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_arg_3_var_2);
		return annotate_meta_arg_3_2(m);
	}

	private final static Operation annotate_meta_arg_3_var_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_arg_3_var_3);
		return annotate_meta_arg_3_3(m);
	}

	private final static Operation annotate_meta_arg_3_var_3(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_arg_3_var_4);
		return annotate_meta_arg_3_4(m);
	}

	private final static Operation annotate_meta_arg_3_var_4(Prolog m) {
		m.trust(null);
		return annotate_meta_arg_3_5(m);
	}

	private final static Operation annotate_meta_arg_3_flo(Prolog m) {
		m.jtry3(null, FILE_prolog_metainference::annotate_meta_arg_3_flo_1);
		return annotate_meta_arg_3_1(m);
	}

	private final static Operation annotate_meta_arg_3_flo_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_arg_3_flo_2);
		return annotate_meta_arg_3_3(m);
	}

	private final static Operation annotate_meta_arg_3_flo_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::annotate_meta_arg_3_flo_3);
		return annotate_meta_arg_3_4(m);
	}

	private final static Operation annotate_meta_arg_3_flo_3(Prolog m) {
		m.trust(null);
		return annotate_meta_arg_3_5(m);
	}

	private final static Operation annotate_meta_arg_3_1(Prolog m) {
		// annotate_meta_arg(A,B,C):-var(B),!,annotate(B,A)
		Term a1, a2, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_arg(A,B,C):-['$get_level'(D),var(B),'$cut'(D),annotate(B,A)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of var(a(2))
		a2 = a2.dref();
		if (!(a2.isVariable())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_annotate_2_static_exec(e), VA(a2, a1), cont);
	}

	private final static Operation annotate_meta_arg_3_2(Prolog m) {
		// annotate_meta_arg(0,A,B):-!,annotate_meta_vars_in_body(A,B)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// annotate_meta_arg(0,A,B):-['$neck_cut',annotate_meta_vars_in_body(A,B)]
		if (!PRED_annotate_meta_arg_3_s1.unify(a1, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(e), VA(a2, a3), cont);
	}

	private final static Operation annotate_meta_arg_3_3(Prolog m) {
		// annotate_meta_arg(A,B,C):-integer(A),callable(B),!,B=..D,length(E,A),append(D,E,F),G=..F,annotate_meta_vars_in_body(G,C)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// annotate_meta_arg(A,B,C):-['$get_level'(D),integer(A),callable(B),'$cut'(D),'$univ'(B,E),length(F,A),append(E,F,G),'$univ'(H,G),annotate_meta_vars_in_body(H,C)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of integer(a(1))
		a1 = a1.dref();
		if (!(a1.isInteger())) {
			return m.fail();
		}
		// END inline expansion
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		return //
		Op((Prolog e) -> PRED_callable_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
						Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a2, a5), //
								Op((Prolog e) -> PRED_length_2_static_exec(e), VA(a6, a1), //
										Op((Prolog e) -> PRED_append_3_static_exec(e), VA(a5, a6, a7), //
												Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a8, a7), //
														Op((Prolog e) -> PRED_annotate_meta_vars_in_body_2_static_exec(
																e), VA(a8, a3), cont)))))));
	}

	private final static Operation annotate_meta_arg_3_4(Prolog m) {
		// annotate_meta_arg(A,B,C):-is_meta(A),compound(B),B=D:E,var(D),!,annotate(D,m)
		Term a1, a2, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate_meta_arg(A,B,C):-['$get_level'(D),is_meta(A),compound(B),'$unify'(B,E:F),var(E),'$cut'(D),annotate(E,m)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		a5 = V(m);
		Term[] y1 = VA(a5, V(m));
		a6 = S(":", y1);
		return //
		Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_compound_1_static_exec(e), VA(a2), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, a6), //
								Op((Prolog e) -> PRED_var_1_static_exec(e), VA(a5), //
										Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
												Op((Prolog e) -> PRED_annotate_2_static_exec(e), VA(a5, ATOM_m),
														cont))))));
	}

	private final static Operation annotate_meta_arg_3_5(Prolog m) {
		Operation cont;
		cont = m.cont;
		// annotate_meta_arg(A,B,C):-[]
		return cont;
	}

	/**
	 * PREDICATE: annotate/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_annotate_2_s1 = SYM("prolog_metainference");

	public static Operation PRED_annotate_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_prolog_metainference::annotate_2_sub_1);
		return annotate_2_1(m);
	}

	private final static Operation annotate_2_sub_1(Prolog m) {
		m.trust(null);
		return annotate_2_2(m);
	}

	private final static Operation annotate_2_1(Prolog m) {
		// annotate(A,B):-get_attr(A,prolog_metainference,C),!,join_annotation(C,B,D),put_attr(A,prolog_metainference,D)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate(A,B):-['$get_level'(C),get_attr(A,prolog_metainference,D),'$cut'(C),join_annotation(D,B,E),put_attr(A,prolog_metainference,E)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_get_attr_3_static_exec(e), VA(a1, PRED_annotate_2_s1, a4), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_join_annotation_3_static_exec(e), VA(a4, a2, a5), //
								Op((Prolog e) -> PRED_put_attr_3_static_exec(e), VA(a1, PRED_annotate_2_s1, a5),
										cont))));
	}

	private final static Operation annotate_2_2(Prolog m) {
		// annotate(A,B):-put_attr(A,prolog_metainference,B)
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// annotate(A,B):-[put_attr(A,prolog_metainference,B)]
		return //
		Op((Prolog e) -> PRED_put_attr_3_static_exec(e), VA(a1, PRED_annotate_2_s1, a2), cont);
	}

	/**
	 * PREDICATE: join_annotation/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_join_annotation_3_s1 = SYM("*");

	public static Operation PRED_join_annotation_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null, FILE_prolog_metainference::join_annotation_3_sub_1);
		return join_annotation_3_1(m);
	}

	private final static Operation join_annotation_3_sub_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::join_annotation_3_sub_2);
		return join_annotation_3_2(m);
	}

	private final static Operation join_annotation_3_sub_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::join_annotation_3_sub_3);
		return join_annotation_3_3(m);
	}

	private final static Operation join_annotation_3_sub_3(Prolog m) {
		m.retry(null, FILE_prolog_metainference::join_annotation_3_sub_4);
		return join_annotation_3_4(m);
	}

	private final static Operation join_annotation_3_sub_4(Prolog m) {
		m.trust(null);
		return join_annotation_3_5(m);
	}

	private final static Operation join_annotation_3_1(Prolog m) {
		// join_annotation(A,A,A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// join_annotation(A,A,A):-['$neck_cut']
		if (!a1.unify(a2, m.trail))
			return m.fail();
		if (!a1.unify(a3, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation join_annotation_3_2(Prolog m) {
		// join_annotation(A,B,C):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// join_annotation(A,B,C):-['$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C)]
		return //
		Op((Prolog e) -> PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(
				e), VA(a1, a2, a3), cont);
	}

	private final static Operation join_annotation_3_3(Prolog m) {
		// join_annotation(A,B,C):-'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// join_annotation(A,B,C):-['$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C)]
		return //
		Op((Prolog e) -> PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(
				e), VA(a1, a2, a3), cont);
	}

	private final static Operation join_annotation_3_4(Prolog m) {
		// join_annotation(A,B,C):-'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// join_annotation(A,B,C):-['$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C)]
		return //
		Op((Prolog e) -> PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(
				e), VA(a1, a2, a3), cont);
	}

	private final static Operation join_annotation_3_5(Prolog m) {
		// join_annotation(A,B,C):-C=(*)
		Term a3;
		Operation cont;
		a3 = m.AREGS[2];
		cont = m.cont;
		// join_annotation(A,B,C):-['$unify'(C,*)]
		// START inline expansion of $unify(a(3),s(1))
		if (!a3.unify(PRED_join_annotation_3_s1, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	/**
	 * PREDICATE:
	 * $dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/1
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null,
				FILE_prolog_metainference::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(
				m);
	}

	private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(
				m);
	}

	private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(
			Prolog m) {
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-is_meta(A),!,fail
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-['$get_level'(B),is_meta(A),'$cut'(B),fail]
		a2 = V(m);
		// START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a2), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(
			Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-[]
		return cont;
	}

	/**
	 * PREDICATE:
	 * $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/3
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null,
				FILE_prolog_metainference::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(
				m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(
				m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(
			Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-(is_meta(A),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(B)),!,C=A
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-['$get_level'(D),is_meta(A),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(B),'$cut'(D),'$unify'(C,A)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(
						e), VA(a2), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
								Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a1), cont))));
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(
			Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-[fail]
		// START inline expansion of fail
		return m.fail();
		// END inline expansion
	}

	/**
	 * PREDICATE:
	 * $dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/1
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null,
				FILE_prolog_metainference::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(
				m);
	}

	private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(
				m);
	}

	private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_1(
			Prolog m) {
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-is_meta(A),!,fail
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-['$get_level'(B),is_meta(A),'$cut'(B),fail]
		a2 = V(m);
		// START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a2), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_2(
			Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A):-[]
		return cont;
	}

	/**
	 * PREDICATE:
	 * $dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/3
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	public static Operation PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null,
				FILE_prolog_metainference::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(
				m);
	}

	private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(
				m);
	}

	private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(
			Prolog m) {
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-('$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A),is_meta(B)),!,C=B
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-['$get_level'(D),'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A),is_meta(B),'$cut'(D),'$unify'(C,B)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec(
				e), VA(a1), //
				Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a2), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
								Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a2), cont))));
	}

	private final static Operation $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(
			Prolog m) {
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-[fail]
		// START inline expansion of fail
		return m.fail();
		// END inline expansion
	}

	/**
	 * PREDICATE:
	 * $dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/3
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_s1 = SYM(
			":");

	public static Operation PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null,
				FILE_prolog_metainference::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(
				m);
	}

	private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(
				m);
	}

	private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_1(
			Prolog m) {
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-(is_meta(A),is_meta(B)),!,C=(:)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-['$get_level'(D),is_meta(A),is_meta(B),'$cut'(D),'$unify'(C,:)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a2), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a4), //
								Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3,
										PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_s1),
										cont))));
	}

	private final static Operation $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_2(
			Prolog m) {
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B,C):-[fail]
		// START inline expansion of fail
		return m.fail();
		// END inline expansion
	}

	/**
	 * PREDICATE: attr_unify_hook/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_attr_unify_hook_2_s1 = SYM("prolog_metainference");

	public static Operation PRED_attr_unify_hook_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// attr_unify_hook(A,B):-get_attr(B,prolog_metainference,C),!,join_annotation(A,C,D),put_attr(B,prolog_metainference,D)
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		// attr_unify_hook(A,B):-['$get_level'(C),get_attr(B,prolog_metainference,D),'$cut'(C),join_annotation(A,D,E),put_attr(B,prolog_metainference,E)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_get_attr_3_static_exec(e), VA(a2, PRED_attr_unify_hook_2_s1, a4), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_join_annotation_3_static_exec(e), VA(a1, a4, a5), //
								Op((Prolog e) -> PRED_put_attr_3_static_exec(e), VA(a2, PRED_attr_unify_hook_2_s1, a5),
										cont))));
	}

	/**
	 * PREDICATE: meta_annotation/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final /**/ IntegerTerm PRED_meta_annotation_2_s1 = Integer(1);

	public static Operation PRED_meta_annotation_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// meta_annotation(A,B):-functor(A,C,D),functor(B,C,D),meta_args(1,D,A,B,E),E==true
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		// meta_annotation(A,B):-[functor(A,C,D),functor(B,C,D),meta_args(1,D,A,B,E),'$equality_of_term'(E,true)]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a1, a3, a4), //
				Op((Prolog e) -> PRED_functor_3_static_exec(e), VA(a2, a3, a4), //
						Op((Prolog e) -> PRED_meta_args_5_static_exec(e), VA(PRED_meta_annotation_2_s1, a4, a1, a2, a5), //
								Op((Prolog e) -> PRED_$equality_of_term_2_static_exec(e), VA(a5, Prolog.True), cont))));
	}

	/**
	 * PREDICATE:
	 * $dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl/2
	 * from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_s1 = SYM(
			"true");

	public static Operation PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null,
				FILE_prolog_metainference::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_1);
		return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_1(
				m);
	}

	private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_2(
				m);
	}

	private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_1(
			Prolog m) {
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-is_meta(B),!,A=true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-['$get_level'(C),is_meta(B),'$cut'(C),'$unify'(A,true)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_is_meta_1_static_exec(e), VA(a2), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a1,
								PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_s1),
								cont)));
	}

	private final static Operation $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_2(
			Prolog m) {
		Operation cont;
		cont = m.cont;
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(A,B):-[]
		return cont;
	}

	/**
	 * PREDICATE: meta_args/5 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */

	// private final Term arg5;

	public static Operation PRED_meta_args_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_prolog_metainference::meta_args_5_sub_1);
		return meta_args_5_1(m);
	}

	private final static Operation meta_args_5_sub_1(Prolog m) {
		m.trust(null);
		return meta_args_5_2(m);
	}

	private final static Operation meta_args_5_1(Prolog m) {
		// meta_args(A,B,C,D,E):-A=<B,!,arg(A,C,F),arg(A,D,G),meta_arg(F,G),'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(E,G),H
		// is A+1,meta_args(H,B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// meta_args(A,B,C,D,E):-['$get_level'(F),'$less_or_equal'(A,B),'$cut'(F),arg(A,C,G),arg(A,D,H),meta_arg(G,H),'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl'(E,H),I
		// is A+1,meta_args(I,B,C,D,E)]
		a6 = V(m);
		// START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $less_or_equal(a(1),a(2))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a2)) > 0) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		// END inline expansion
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		Term[] y1 = VA(a1, int_1);
		a10 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a3, a7), //
				Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a4, a8), //
						Op((Prolog e) -> PRED_meta_arg_2_static_exec(e), VA(a7, a8), //
								Op((Prolog e) -> PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec(
										e), VA(a5, a8), //
										Op(FILE_builtins::PRED_is_2_static_exec, VA(a9, a10), //
												Op((Prolog e) -> PRED_meta_args_5_static_exec(e),
														VA(a9, a2, a3, a4, a5), cont))))));
	}

	private final static Operation meta_args_5_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// meta_args(A,B,C,D,E):-[]
		return cont;
	}

	/**
	 * PREDICATE: is_meta/1 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_is_meta_1_s1 = SYM(":");
	final static Functor ATOM_$005E = SYM("^");
	final static Functor ATOM_$002F$002F = SYM("//");

	public static Operation PRED_is_meta_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_metainference::is_meta_1_var, FILE_prolog_metainference::is_meta_1_1,
				FILE_prolog_metainference::is_meta_1_1, FILE_prolog_metainference::is_meta_1_var,
				FILE_prolog_metainference::is_meta_1_1, FILE_prolog_metainference::is_meta_1_1);
	}

	private final static Operation is_meta_1_var(Prolog m) {
		m.jtry1(null, FILE_prolog_metainference::is_meta_1_var_1);
		return is_meta_1_1(m);
	}

	private final static Operation is_meta_1_var_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::is_meta_1_var_2);
		return is_meta_1_2(m);
	}

	private final static Operation is_meta_1_var_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::is_meta_1_var_3);
		return is_meta_1_3(m);
	}

	private final static Operation is_meta_1_var_3(Prolog m) {
		m.trust(null);
		return is_meta_1_4(m);
	}

	private final static Operation is_meta_1_1(Prolog m) {
		// is_meta(A):-integer(A),!
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// is_meta(A):-['$get_level'(B),integer(A),'$cut'(B)]
		a2 = V(m);
		// START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of integer(a(1))
		a1 = a1.dref();
		if (!(a1.isInteger())) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(2))
		a2 = a2.dref();
		m.cut(a2.intValue());
		// END inline expansion
		return cont;
	}

	private final static Operation is_meta_1_2(Prolog m) {
		// is_meta(:):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// is_meta(:):-[]
		if (!PRED_is_meta_1_s1.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation is_meta_1_3(Prolog m) {
		// is_meta(^):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// is_meta(^):-[]
		if (!ATOM_$005E.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation is_meta_1_4(Prolog m) {
		// is_meta(//):-true
		Term a1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// is_meta(//):-[]
		if (!ATOM_$002F$002F.unify(a1, m.trail))
			return m.fail();
		return cont;
	}

	/**
	 * PREDICATE: meta_arg/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_meta_arg_2_s1 = SYM("prolog_metainference");
	final static Functor ATOM_module_colon = SYM(":");
	final static Functor ATOM_$002A = SYM("*");

	public static Operation PRED_meta_arg_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_prolog_metainference::meta_arg_2_sub_1);
		return meta_arg_2_1(m);
	}

	private final static Operation meta_arg_2_sub_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::meta_arg_2_sub_2);
		return meta_arg_2_2(m);
	}

	private final static Operation meta_arg_2_sub_2(Prolog m) {
		m.trust(null);
		return meta_arg_2_3(m);
	}

	private final static Operation meta_arg_2_1(Prolog m) {
		// meta_arg(A,B):-get_attr(A,prolog_metainference,B),B\==m,!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// meta_arg(A,B):-['$get_level'(C),get_attr(A,prolog_metainference,B),'$inequality_of_term'(B,m),'$cut'(C)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return //
		Op((Prolog e) -> PRED_get_attr_3_static_exec(e), VA(a1, PRED_meta_arg_2_s1, a2), //
				Op((Prolog e) -> PRED_$inequality_of_term_2_static_exec(e), VA(a2, ATOM_m), //
						Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont)));
	}

	private final static Operation meta_arg_2_2(Prolog m) {
		// meta_arg(A,:):-compound(A),A=B:C,get_attr(B,prolog_metainference,m),!
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// meta_arg(A,:):-['$get_level'(B),compound(A),'$unify'(A,C:D),get_attr(C,prolog_metainference,m),'$cut'(B)]
		if (!ATOM_module_colon.unify(a2, m.trail))
			return m.fail();
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		a4 = V(m);
		Term[] y1 = VA(a4, V(m));
		a5 = S(":", y1);
		return //
		Op((Prolog e) -> PRED_compound_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a1, a5), //
						Op((Prolog e) -> PRED_get_attr_3_static_exec(e), VA(a4, PRED_meta_arg_2_s1, ATOM_m), //
								Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), cont))));
	}

	private final static Operation meta_arg_2_3(Prolog m) {
		// meta_arg(A,*):-true
		Term a2;
		Operation cont;
		a2 = m.AREGS[1];
		cont = m.cont;
		// meta_arg(A,*):-[]
		if (!ATOM_$002A.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	/**
	 * PREDICATE: combine_meta_args/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_combine_meta_args_2_s1 = SYM("[]");
	final static Functor ATOM_join_annotation = SYM("join_annotation");

	public static Operation PRED_combine_meta_args_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return combine_meta_args_2_top(m);
	}

	private final static Operation combine_meta_args_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_prolog_metainference::combine_meta_args_2_var, fail_0, fail_0,
				FILE_prolog_metainference::combine_meta_args_2_1, fail_0,
				FILE_prolog_metainference::combine_meta_args_2_lis);
	}

	private final static Operation combine_meta_args_2_var(Prolog m) {
		m.jtry2(null, FILE_prolog_metainference::combine_meta_args_2_var_1);
		return combine_meta_args_2_1(m);
	}

	private final static Operation combine_meta_args_2_var_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::combine_meta_args_2_var_2);
		return combine_meta_args_2_2(m);
	}

	private final static Operation combine_meta_args_2_var_2(Prolog m) {
		m.retry(null, FILE_prolog_metainference::combine_meta_args_2_var_3);
		return combine_meta_args_2_3(m);
	}

	private final static Operation combine_meta_args_2_var_3(Prolog m) {
		m.trust(null);
		return combine_meta_args_2_4(m);
	}

	private final static Operation combine_meta_args_2_lis(Prolog m) {
		m.jtry2(null, FILE_prolog_metainference::combine_meta_args_2_lis_1);
		return combine_meta_args_2_2(m);
	}

	private final static Operation combine_meta_args_2_lis_1(Prolog m) {
		m.retry(null, FILE_prolog_metainference::combine_meta_args_2_lis_2);
		return combine_meta_args_2_3(m);
	}

	private final static Operation combine_meta_args_2_lis_2(Prolog m) {
		m.trust(null);
		return combine_meta_args_2_4(m);
	}

	private final static Operation combine_meta_args_2_1(Prolog m) {
		// combine_meta_args([],[]):-!
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// combine_meta_args([],[]):-['$neck_cut']
		if (!PRED_combine_meta_args_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_combine_meta_args_2_s1.unify(a2, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation combine_meta_args_2_2(Prolog m) {
		// combine_meta_args([A],A):-!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// combine_meta_args([A],A):-['$neck_cut']
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a3 = argz[0];
			if (!PRED_combine_meta_args_2_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a3 = V(m);
			a1.bind(CONS(a3, PRED_combine_meta_args_2_s1), m.trail);
		} else {
			return m.fail();
		}
		if (!a3.unify(a2, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation combine_meta_args_2_3(Prolog m) {
		// combine_meta_args([A,A|B],C):-!,combine_meta_args([A|B],C)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// combine_meta_args([A,A|B],C):-['$neck_cut',combine_meta_args([A|B],C)]
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
			if (!a3.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a4.isVar()) {
			a5 = V(m);
			a4.bind(CONS(a3, a5), m.trail);
		} else {
			return m.fail();
		}
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		a6 = CONS(a3, a5);
		m.AREGS[0] = a6;
		m.AREGS[1] = a2;
		m.cont = cont;
		return combine_meta_args_2_top(m);
	}

	private final static Operation combine_meta_args_2_4(Prolog m) {
		// combine_meta_args([A,B|C],D):-A=..[E|F],B=..[E|G],maplist(join_annotation,F,G,H),I=..[E|H],combine_meta_args([I|C],D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// combine_meta_args([A,B|C],D):-['$univ'(A,[E|F]),'$univ'(B,[E|G]),maplist(join_annotation,F,G,H),'$univ'(I,[E|H]),combine_meta_args([I|C],D)]
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
		a9 = CONS(a7, a8);
		a10 = V(m);
		a11 = CONS(a7, a10);
		a12 = V(m);
		a13 = V(m);
		a14 = CONS(a7, a12);
		a15 = CONS(a13, a6);
		return //
		Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a3, a9), //
				Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a5, a11), //
						Op((Prolog e) -> PRED_maplist_4_static_exec(e), VA(ATOM_join_annotation, a8, a10, a12), //
								Op((Prolog e) -> PRED_$univ_2_static_exec(e), VA(a13, a14), //
										Op((Prolog e) -> PRED_combine_meta_args_2_static_exec(e), VA(a15, a2),
												cont)))));
	}

	/**
	 * PREDICATE: $init/0 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl
	 */
	private static final Functor PRED_$init_0_s1 = SYM("prolog_metainference");
	final static Functor ATOM_inferred_meta_pred = SYM("inferred_meta_pred");
	final static IntegerTerm int_3 = Integer(3);
	private static final Term PRED_$init_0_s6 = S("/", ATOM_inferred_meta_pred, int_3);

	public static Operation PRED_$init_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// '$init':-'$new_indexing_hash'(prolog_metainference,inferred_meta_pred/3,A)
		m.setB0();
		// '$init':-['$new_indexing_hash'(prolog_metainference,inferred_meta_pred/3,A)]
		return //
		Op((Prolog e) -> PRED_$new_indexing_hash_3_static_exec(e), VA(PRED_$init_0_s1, PRED_$init_0_s6, V(m)), cont);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("inferred_meta_predicate", 2,
				FILE_prolog_metainference::PRED_inferred_meta_predicate_2_static_exec);
		PredTable.registerBuiltin("infer_meta_predicate", 2,
				FILE_prolog_metainference::PRED_infer_meta_predicate_2_static_exec);
		PredTable.registerBuiltin("do_infer_meta_predicate", 2,
				FILE_prolog_metainference::PRED_do_infer_meta_predicate_2_static_exec);
		PredTable.registerBuiltin("meta_pred_args_in_clause", 3,
				FILE_prolog_metainference::PRED_meta_pred_args_in_clause_3_static_exec);
		PredTable.registerBuiltin("annotate_meta_vars_in_body", 2,
				FILE_prolog_metainference::PRED_annotate_meta_vars_in_body_2_static_exec);
		PredTable.registerBuiltin(
				"$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				2,
				FILE_prolog_metainference::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec);
		PredTable.registerBuiltin(
				"$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				1,
				FILE_prolog_metainference::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec);
		PredTable.registerBuiltin("annotate_meta_args", 5,
				FILE_prolog_metainference::PRED_annotate_meta_args_5_static_exec);
		PredTable.registerBuiltin("annotate_meta_arg", 3,
				FILE_prolog_metainference::PRED_annotate_meta_arg_3_static_exec);
		PredTable.registerBuiltin("annotate", 2, FILE_prolog_metainference::PRED_annotate_2_static_exec);
		PredTable.registerBuiltin("join_annotation", 3, FILE_prolog_metainference::PRED_join_annotation_3_static_exec);
		PredTable.registerBuiltin(
				"$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				1,
				FILE_prolog_metainference::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec);
		PredTable.registerBuiltin(
				"$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				3,
				FILE_prolog_metainference::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec);
		PredTable.registerBuiltin(
				"$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				1,
				FILE_prolog_metainference::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_1_static_exec);
		PredTable.registerBuiltin(
				"$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				3,
				FILE_prolog_metainference::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec);
		PredTable.registerBuiltin(
				"$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				3,
				FILE_prolog_metainference::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_3_static_exec);
		PredTable.registerBuiltin("attr_unify_hook", 2, FILE_prolog_metainference::PRED_attr_unify_hook_2_static_exec);
		PredTable.registerBuiltin("meta_annotation", 2, FILE_prolog_metainference::PRED_meta_annotation_2_static_exec);
		PredTable.registerBuiltin(
				"$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_metainference.pl",
				"$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl",
				2,
				FILE_prolog_metainference::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_metainference$002Epl_2_static_exec);
		PredTable.registerBuiltin("meta_args", 5, FILE_prolog_metainference::PRED_meta_args_5_static_exec);
		PredTable.registerBuiltin("is_meta", 1, FILE_prolog_metainference::PRED_is_meta_1_static_exec);
		PredTable.registerBuiltin("meta_arg", 2, FILE_prolog_metainference::PRED_meta_arg_2_static_exec);
		PredTable.registerBuiltin("combine_meta_args", 2,
				FILE_prolog_metainference::PRED_combine_meta_args_2_static_exec);
		PredTable.registerBuiltin("$init", 0, FILE_prolog_metainference::PRED_$init_0_static_exec);
	}
}
