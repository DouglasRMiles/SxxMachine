package SxxMachine;

import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
import static SxxMachine.bootpreds.PRED_get_code_2_static_exec;
import static SxxMachine.missing_preds.PRED_absolute_file_name_3_static_exec;
import static SxxMachine.missing_preds.PRED_compile_predicates_1_static_exec;
import static SxxMachine.missing_preds.PRED_load_foreign_library_1_static_exec;
import static SxxMachine.missing_preds.PRED_must_be_2_static_exec;
import static SxxMachine.missing_preds.PRED_option_3_static_exec;
import static SxxMachine.missing_preds.PRED_read_string_5_static_exec;
import static SxxMachine.missing_preds.PRED_read_term_3_static_exec;
import static SxxMachine.missing_preds.PRED_setup_call_cleanup_3_static_exec;

public class FILE_readutil extends TermData {
	/**
	 * PREDICATE: link_foreign/0 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	final static SymbolTerm ATOM_readutil = SYM("readutil");
	private static final StructureTerm PRED_link_foreign_0_s4 = S("foreign", ATOM_readutil);
	final static SymbolTerm ATOM_read_util = SYM("read_util");
	final static SymbolTerm ATOM_read_line_to_codes = SYM("read_line_to_codes");
	final static IntegerTerm int_2 = Integer(2);
	private static final StructureTerm PRED_link_foreign_0_s20 = S("/", ATOM_read_line_to_codes, int_2);
	final static IntegerTerm int_3 = Integer(3);
	private static final StructureTerm PRED_link_foreign_0_s23 = S("/", ATOM_read_line_to_codes, int_3);
	final static SymbolTerm ATOM_read_stream_to_codes = SYM("read_stream_to_codes");
	private static final StructureTerm PRED_link_foreign_0_s26 = S("/", ATOM_read_stream_to_codes, int_2);
	private static final StructureTerm PRED_link_foreign_0_s28 = S("/", ATOM_read_stream_to_codes, int_3);
	private static final ListTerm PRED_link_foreign_0_s30 = CONS(PRED_link_foreign_0_s28, Prolog.Nil);
	private static final ListTerm PRED_link_foreign_0_s31 = CONS(PRED_link_foreign_0_s26, PRED_link_foreign_0_s30);
	private static final ListTerm PRED_link_foreign_0_s32 = CONS(PRED_link_foreign_0_s23, PRED_link_foreign_0_s31);
	private static final ListTerm PRED_link_foreign_0_s33 = CONS(PRED_link_foreign_0_s20, PRED_link_foreign_0_s32);

	public static Operation PRED_link_foreign_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry0(null, FILE_readutil::link_foreign_0_sub_1);
		return link_foreign_0_1(m);
	}

	private final static Operation link_foreign_0_sub_1(Prolog m) {
		m.trust(null);
		return link_foreign_0_2(m);
	}

	private final static Operation link_foreign_0_1(Prolog m) {
		// link_foreign:-catch(load_foreign_library(foreign(readutil)),A,fail),!
		Term a1, a2, a3;
		Operation cont;
		cont = m.cont;
		// link_foreign:-['$get_level'(A),catch(read_util:load_foreign_library(foreign(readutil)),B,read_util:fail),'$cut'(A)]
		a1 = V(m);
		// START inline expansion of $get_level(a(1))
		if (!a1.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		a2 = Closure( //
				Op((Prolog e) -> PRED_load_foreign_library_1_static_exec(e), VA(PRED_link_foreign_0_s4), null));
		a3 = Closure( //
				Op(fail_0, VA(), null));
		return //
		Op(FILE_builtins::PRED_catch_3_static_exec, VA(a2, V(m), a3), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a1), cont));
	}

	private final static Operation link_foreign_0_2(Prolog m) {
		// link_foreign:-assertz((read_line_to_codes(A,B):-pl_read_line_to_codes(A,B))),assertz((read_line_to_codes(A,B,C):-pl_read_line_to_codes(A,B,C))),assertz((read_stream_to_codes(A,D):-pl_read_stream_to_codes(A,D))),assertz((read_stream_to_codes(A,D,C):-pl_read_stream_to_codes(A,D,C))),compile_predicates([read_line_to_codes/2,read_line_to_codes/3,read_stream_to_codes/2,read_stream_to_codes/3])
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;
		Operation cont;
		cont = m.cont;
		// link_foreign:-[assertz(read_util:(read_line_to_codes(A,B):-pl_read_line_to_codes(A,B))),assertz(read_util:(read_line_to_codes(A,B,C):-pl_read_line_to_codes(A,B,C))),assertz(read_util:(read_stream_to_codes(A,D):-pl_read_stream_to_codes(A,D))),assertz(read_util:(read_stream_to_codes(A,D,C):-pl_read_stream_to_codes(A,D,C))),compile_predicates([read_line_to_codes/2,read_line_to_codes/3,read_stream_to_codes/2,read_stream_to_codes/3])]
		a1 = V(m);
		a2 = V(m);
		Term[] y1 = VA(a1, a2);
		a3 = S("read_line_to_codes", y1);
		Term[] y2 = VA(a1, a2);
		a4 = S("pl_read_line_to_codes", y2);
		Term[] y3 = VA(a3, a4);
		a5 = S(":-", y3);
		Term[] y4 = VA(ATOM_read_util, a5);
		a6 = S(":", y4);
		a7 = V(m);
		Term[] y5 = VA(a1, a2, a7);
		a8 = S("read_line_to_codes", y5);
		Term[] y6 = VA(a1, a2, a7);
		a9 = S("pl_read_line_to_codes", y6);
		Term[] y7 = VA(a8, a9);
		a10 = S(":-", y7);
		Term[] y8 = VA(ATOM_read_util, a10);
		a11 = S(":", y8);
		a12 = V(m);
		Term[] y9 = VA(a1, a12);
		a13 = S("read_stream_to_codes", y9);
		Term[] y10 = VA(a1, a12);
		a14 = S("pl_read_stream_to_codes", y10);
		Term[] y11 = VA(a13, a14);
		a15 = S(":-", y11);
		Term[] y12 = VA(ATOM_read_util, a15);
		a16 = S(":", y12);
		Term[] y13 = VA(a1, a12, a7);
		a17 = S("read_stream_to_codes", y13);
		Term[] y14 = VA(a1, a12, a7);
		a18 = S("pl_read_stream_to_codes", y14);
		Term[] y15 = VA(a17, a18);
		a19 = S(":-", y15);
		Term[] y16 = VA(ATOM_read_util, a19);
		a20 = S(":", y16);
		return //
		Op((Prolog e) -> PRED_assertz_1_static_exec(e), VA(a6), //
				Op((Prolog e) -> PRED_assertz_1_static_exec(e), VA(a11), //
						Op((Prolog e) -> PRED_assertz_1_static_exec(e), VA(a16), //
								Op((Prolog e) -> PRED_assertz_1_static_exec(e), VA(a20), //
										Op((Prolog e) -> PRED_compile_predicates_1_static_exec(e),
												VA(PRED_link_foreign_0_s33), cont)))));
	}

	/**
	 * PREDICATE:
	 * $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl/3
	 * from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final /**/ IntegerTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_s1 = Integer(
			-1);
	final static SymbolTerm ATOM_end_of_file = SYM("end_of_file");

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null,
				FILE_readutil::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_1(
				m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_2(
				m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_1(
			Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-B==
		// -1,!,C=end_of_file
		Term a2, a3, a4;
		Operation cont;
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-['$get_level'(D),'$equality_of_term'(B,-1),'$cut'(D),'$unify'(C,end_of_file)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $equality_of_term(a(2),si(1))
		a2 = a2.dref();
		if (!a2.equalsTerm(
				PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_s1)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		// END inline expansion
		// START inline expansion of $unify(a(3),@(ATOM_end_of_file))
		if (!a3.unify(ATOM_end_of_file, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_2(
			Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-read_1line_to_codes(B,A,C)
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-[read_1line_to_codes(B,A,C)]
		return //
		Op((Prolog e) -> PRED_read_1line_to_codes_3_static_exec(e), VA(a2, a1, a3), cont);
	}

	/**
	 * PREDICATE: pl_read_line_to_codes/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */

	public static Operation PRED_pl_read_line_to_codes_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// pl_read_line_to_codes(A,B):-get_code(A,C),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,C,D),B=D
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// pl_read_line_to_codes(A,B):-[get_code(A,C),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,C,D),'$unify'(B,D)]
		a3 = V(m);
		a4 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a1, a3), //
				Op((Prolog e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec(
						e), VA(a1, a3, a4), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, a4), cont)));
	}

	/**
	 * PREDICATE: read_1line_to_codes/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final /**/ IntegerTerm PRED_read_1line_to_codes_3_s1 = Integer(-1);
	final static IntegerTerm int_10 = Integer(10);
	final static IntegerTerm int_13 = Integer(13);

	public static Operation PRED_read_1line_to_codes_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_readutil::read_1line_to_codes_3_var, FILE_readutil::read_1line_to_codes_3_var,
				FILE_readutil::read_1line_to_codes_3_4, FILE_readutil::read_1line_to_codes_3_4,
				FILE_readutil::read_1line_to_codes_3_4, FILE_readutil::read_1line_to_codes_3_4);
	}

	private final static Operation read_1line_to_codes_3_var(Prolog m) {
		m.jtry3(null, FILE_readutil::read_1line_to_codes_3_var_1);
		return read_1line_to_codes_3_1(m);
	}

	private final static Operation read_1line_to_codes_3_var_1(Prolog m) {
		m.retry(null, FILE_readutil::read_1line_to_codes_3_var_2);
		return read_1line_to_codes_3_2(m);
	}

	private final static Operation read_1line_to_codes_3_var_2(Prolog m) {
		m.retry(null, FILE_readutil::read_1line_to_codes_3_var_3);
		return read_1line_to_codes_3_3(m);
	}

	private final static Operation read_1line_to_codes_3_var_3(Prolog m) {
		m.trust(null);
		return read_1line_to_codes_3_4(m);
	}

	private final static Operation read_1line_to_codes_3_1(Prolog m) {
		// read_1line_to_codes(-1,A,[]):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// read_1line_to_codes(-1,A,[]):-['$neck_cut']
		if (!PRED_read_1line_to_codes_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!Prolog.Nil.unify(a3, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation read_1line_to_codes_3_2(Prolog m) {
		// read_1line_to_codes(10,A,[]):-!
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// read_1line_to_codes(10,A,[]):-['$neck_cut']
		if (!int_10.unify(a1, m.trail))
			return m.fail();
		if (!Prolog.Nil.unify(a3, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation read_1line_to_codes_3_3(Prolog m) {
		// read_1line_to_codes(13,A,B):-!,get_code(A,C),read_1line_to_codes(C,A,B)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// read_1line_to_codes(13,A,B):-['$neck_cut',get_code(A,C),read_1line_to_codes(C,A,B)]
		if (!int_13.unify(a1, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		a4 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a2, a4), //
				Op((Prolog e) -> PRED_read_1line_to_codes_3_static_exec(e), VA(a4, a2, a3), cont));
	}

	private final static Operation read_1line_to_codes_3_4(Prolog m) {
		// read_1line_to_codes(A,B,[A|C]):-get_code(B,D),read_1line_to_codes(D,B,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// read_1line_to_codes(A,B,[A|C]):-[get_code(B,D),read_1line_to_codes(D,B,C)]
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
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a2, a5), //
				Op((Prolog e) -> PRED_read_1line_to_codes_3_static_exec(e), VA(a5, a2, a4), cont));
	}

	/**
	 * PREDICATE: pl_read_line_to_codes/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */

	public static Operation PRED_pl_read_line_to_codes_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// pl_read_line_to_codes(A,B,C):-get_code(A,D),read_line_to_codes(D,A,E,C),B=E
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// pl_read_line_to_codes(A,B,C):-[get_code(A,D),read_line_to_codes(D,A,E,C),'$unify'(B,E)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a1, a4), //
				Op((Prolog e) -> PRED_read_line_to_codes_4_static_exec(e), VA(a4, a1, a5, a3), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, a5), cont)));
	}

	/**
	 * PREDICATE: read_line_to_codes/4 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final /**/ IntegerTerm PRED_read_line_to_codes_4_s1 = Integer(-1);

	public static Operation PRED_read_line_to_codes_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_readutil::read_line_to_codes_4_var, FILE_readutil::read_line_to_codes_4_var,
				FILE_readutil::read_line_to_codes_4_3, FILE_readutil::read_line_to_codes_4_3,
				FILE_readutil::read_line_to_codes_4_3, FILE_readutil::read_line_to_codes_4_3);
	}

	private final static Operation read_line_to_codes_4_var(Prolog m) {
		m.jtry4(null, FILE_readutil::read_line_to_codes_4_var_1);
		return read_line_to_codes_4_1(m);
	}

	private final static Operation read_line_to_codes_4_var_1(Prolog m) {
		m.retry(null, FILE_readutil::read_line_to_codes_4_var_2);
		return read_line_to_codes_4_2(m);
	}

	private final static Operation read_line_to_codes_4_var_2(Prolog m) {
		m.trust(null);
		return read_line_to_codes_4_3(m);
	}

	private final static Operation read_line_to_codes_4_1(Prolog m) {
		// read_line_to_codes(-1,A,B,B):-!,B=[]
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// read_line_to_codes(-1,A,B,B):-['$neck_cut','$unify'(B,[])]
		if (!PRED_read_line_to_codes_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		// START inline expansion of $unify(a(3),@(Prolog.Nil))
		if (!a3.unify(Prolog.Nil, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	private final static Operation read_line_to_codes_4_2(Prolog m) {
		// read_line_to_codes(10,A,[10|B],B):-!
		Term a1, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// read_line_to_codes(10,A,[10|B],B):-['$neck_cut']
		if (!int_10.unify(a1, m.trail))
			return m.fail();
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!int_10.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a3.isVar()) {
			a5 = V(m);
			a3.bind(CONS(int_10, a5), m.trail);
		} else {
			return m.fail();
		}
		if (!a5.unify(a4, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation read_line_to_codes_4_3(Prolog m) {
		// read_line_to_codes(A,B,[A|C],D):-get_code(B,E),read_line_to_codes(E,B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// read_line_to_codes(A,B,[A|C],D):-[get_code(B,E),read_line_to_codes(E,B,C,D)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a3.isVar()) {
			a5 = V(m);
			a3.bind(CONS(a1, a5), m.trail);
		} else {
			return m.fail();
		}
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a2, a6), //
				Op((Prolog e) -> PRED_read_line_to_codes_4_static_exec(e), VA(a6, a2, a5, a4), cont));
	}

	/**
	 * PREDICATE:
	 * $dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl/3
	 * from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final /**/ IntegerTerm PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_s1 = Integer(
			-1);

	public static Operation PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry3(null,
				FILE_readutil::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_1(
				m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_1(
			Prolog m) {
		m.retry(null,
				FILE_readutil::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_2);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_2(
				m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_sub_2(
			Prolog m) {
		m.trust(null);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_3(
				m);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_1(
			Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-B\==
		// -1,!,A=C
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-['$get_level'(D),'$inequality_of_term'(B,-1),'$cut'(D),'$unify'(A,C)]
		a4 = V(m);
		// START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $inequality_of_term(a(2),si(1))
		a2 = a2.dref();
		if (a2.equalsTerm(
				PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_s1)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		// END inline expansion
		// START inline expansion of $unify(a(1),a(3))
		if (!a1.unify(a3, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_2(
			Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,C)
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-['$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,C)]
		return //
		Op((Prolog e) -> PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_static_exec(
				e), VA(a1, a3), cont);
	}

	private final static Operation $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_3(
			Prolog m) {
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-A=C
		Term a1, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		cont = m.cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B,C):-['$unify'(A,C)]
		// START inline expansion of $unify(a(1),a(3))
		if (!a1.unify(a3, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	/**
	 * PREDICATE:
	 * $dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl/2
	 * from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_s1 = SYM(
			"[]");

	public static Operation PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_static_exec(
			Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null,
				FILE_readutil::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_1(
				m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_sub_1(
			Prolog m) {
		m.trust(null);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_2(
				m);
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_1(
			Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B):-B==[],!,A=end_of_file
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B):-['$get_level'(C),'$equality_of_term'(B,[]),'$cut'(C),'$unify'(A,end_of_file)]
		a3 = V(m);
		// START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $equality_of_term(a(2),s(1))
		a2 = a2.dref();
		if (!a2.equalsTerm(
				PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_s1)) {
			return m.fail();
		}
		// END inline expansion
		// START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		// END inline expansion
		// START inline expansion of $unify(a(1),@(ATOM_end_of_file))
		if (!a1.unify(ATOM_end_of_file, m.trail)) {
			return m.fail();
		}
		// END inline expansion
		return cont;
	}

	private final static Operation $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_2(
			Prolog m) {
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(A,B):-[fail]
		// START inline expansion of fail
		return m.fail();
		// END inline expansion
	}

	/**
	 * PREDICATE: read_line_to_string/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_read_line_to_string_2_s1 = SYM("\n");
	final static SymbolTerm ATOM_$000D = SYM("\r");

	public static Operation PRED_read_line_to_string_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// read_line_to_string(A,B):-read_string(A,'\n','\r',C,D),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(B,C,D)
		m.setB0();
		Term a1, a2, a3, a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// read_line_to_string(A,B):-[read_string(A,'\n','\r',C,D),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl'(B,C,D)]
		a3 = V(m);
		a4 = V(m);
		return //
		Op((Prolog e) -> PRED_read_string_5_static_exec(e), VA(a1, PRED_read_line_to_string_2_s1, ATOM_$000D, a3, a4), //
				Op((Prolog e) -> PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec(
						e), VA(a2, a3, a4), cont));
	}

	/**
	 * PREDICATE: pl_read_stream_to_codes/2 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_pl_read_stream_to_codes_2_s1 = SYM("[]");

	public static Operation PRED_pl_read_stream_to_codes_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// pl_read_stream_to_codes(A,B):-pl_read_stream_to_codes(A,B,[])
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// pl_read_stream_to_codes(A,B):-[pl_read_stream_to_codes(A,B,[])]
		return //
		Op((Prolog e) -> PRED_pl_read_stream_to_codes_3_static_exec(e), VA(a1, a2, PRED_pl_read_stream_to_codes_2_s1),
				cont);
	}

	/**
	 * PREDICATE: pl_read_stream_to_codes/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */

	public static Operation PRED_pl_read_stream_to_codes_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// pl_read_stream_to_codes(A,B,C):-get_code(A,D),read_stream_to_codes(D,A,E,C),B=E
		m.setB0();
		Term a1, a2, a3, a4, a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// pl_read_stream_to_codes(A,B,C):-[get_code(A,D),read_stream_to_codes(D,A,E,C),'$unify'(B,E)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a1, a4), //
				Op((Prolog e) -> PRED_read_stream_to_codes_4_static_exec(e), VA(a4, a1, a5, a3), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, a5), cont)));
	}

	/**
	 * PREDICATE: read_stream_to_codes/4 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final /**/ IntegerTerm PRED_read_stream_to_codes_4_s1 = Integer(-1);

	public static Operation PRED_read_stream_to_codes_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_readutil::read_stream_to_codes_4_var, FILE_readutil::read_stream_to_codes_4_var,
				FILE_readutil::read_stream_to_codes_4_2, FILE_readutil::read_stream_to_codes_4_2,
				FILE_readutil::read_stream_to_codes_4_2, FILE_readutil::read_stream_to_codes_4_2);
	}

	private final static Operation read_stream_to_codes_4_var(Prolog m) {
		m.jtry4(null, FILE_readutil::read_stream_to_codes_4_var_1);
		return read_stream_to_codes_4_1(m);
	}

	private final static Operation read_stream_to_codes_4_var_1(Prolog m) {
		m.trust(null);
		return read_stream_to_codes_4_2(m);
	}

	private final static Operation read_stream_to_codes_4_1(Prolog m) {
		// read_stream_to_codes(-1,A,B,B):-!
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// read_stream_to_codes(-1,A,B,B):-['$neck_cut']
		if (!PRED_read_stream_to_codes_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation read_stream_to_codes_4_2(Prolog m) {
		// read_stream_to_codes(A,B,[A|C],D):-get_code(B,E),read_stream_to_codes(E,B,C,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// read_stream_to_codes(A,B,[A|C],D):-[get_code(B,E),read_stream_to_codes(E,B,C,D)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a5 = argz[1];
		} else if (a3.isVar()) {
			a5 = V(m);
			a3.bind(CONS(a1, a5), m.trail);
		} else {
			return m.fail();
		}
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_get_code_2_static_exec(e), VA(a2, a6), //
				Op((Prolog e) -> PRED_read_stream_to_codes_4_static_exec(e), VA(a6, a2, a5, a4), cont));
	}

	/**
	 * PREDICATE: read_stream_to_terms/4 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */

	public static Operation PRED_read_stream_to_terms_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// read_stream_to_terms(A,B,C,D):-read_term(A,E,D),read_stream_to_terms(E,A,F,C,D),B=F
		m.setB0();
		Term a1, a2, a3, a4, a5, a6;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// read_stream_to_terms(A,B,C,D):-[read_term(A,E,D),read_stream_to_terms(E,A,F,C,D),'$unify'(B,F)]
		a5 = V(m);
		a6 = V(m);
		return //
		Op((Prolog e) -> PRED_read_term_3_static_exec(e), VA(a1, a5, a4), //
				Op((Prolog e) -> PRED_read_stream_to_terms_5_static_exec(e), VA(a5, a1, a6, a3, a4), //
						Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a2, a6), cont)));
	}

	/**
	 * PREDICATE: read_stream_to_terms/5 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_read_stream_to_terms_5_s1 = SYM("end_of_file");

	// private final Term arg5;

	public static Operation PRED_read_stream_to_terms_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_readutil::read_stream_to_terms_5_var, FILE_readutil::read_stream_to_terms_5_2,
				FILE_readutil::read_stream_to_terms_5_2, FILE_readutil::read_stream_to_terms_5_var,
				FILE_readutil::read_stream_to_terms_5_2, FILE_readutil::read_stream_to_terms_5_2);
	}

	private final static Operation read_stream_to_terms_5_var(Prolog m) {
		m.jtry5(null, FILE_readutil::read_stream_to_terms_5_var_1);
		return read_stream_to_terms_5_1(m);
	}

	private final static Operation read_stream_to_terms_5_var_1(Prolog m) {
		m.trust(null);
		return read_stream_to_terms_5_2(m);
	}

	private final static Operation read_stream_to_terms_5_1(Prolog m) {
		// read_stream_to_terms(end_of_file,A,B,B,C):-!
		Term a1, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// read_stream_to_terms(end_of_file,A,B,B,C):-['$neck_cut']
		if (!PRED_read_stream_to_terms_5_s1.unify(a1, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		// START inline expansion of $neck_cut
		m.neckCut();
		// END inline expansion
		return cont;
	}

	private final static Operation read_stream_to_terms_5_2(Prolog m) {
		// read_stream_to_terms(A,B,[A|C],D,E):-read_term(B,F,E),read_stream_to_terms(F,B,C,D,E)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// read_stream_to_terms(A,B,[A|C],D,E):-[read_term(B,F,E),read_stream_to_terms(F,B,C,D,E)]
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a1.unify(argz[0], m.trail))
				return m.fail();
			a6 = argz[1];
		} else if (a3.isVar()) {
			a6 = V(m);
			a3.bind(CONS(a1, a6), m.trail);
		} else {
			return m.fail();
		}
		a7 = V(m);
		return //
		Op((Prolog e) -> PRED_read_term_3_static_exec(e), VA(a2, a7, a5), //
				Op((Prolog e) -> PRED_read_stream_to_terms_5_static_exec(e), VA(a7, a2, a6, a4, a5), cont));
	}

	/**
	 * PREDICATE: read_file_to_codes/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_read_file_to_codes_3_s1 = SYM("list");
	final static SymbolTerm ATOM_read = SYM("read");
	private static final StructureTerm PRED_read_file_to_codes_3_s7 = S("access", ATOM_read);

	public static Operation PRED_read_file_to_codes_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// read_file_to_codes(A,B,C):-must_be(list,C),option(tail(D),C,[]),absolute_file_name(A,[access(read)|C],E),setup_call_cleanup(open(E,read,F,C),read_stream_to_codes(F,B,D),close(F))
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// read_file_to_codes(A,B,C):-[must_be(list,C),option(tail(D),C,[]),absolute_file_name(A,[access(read)|C],E),setup_call_cleanup(open(E,read,F,C),read_stream_to_codes(F,B,D),close(F))]
		a4 = V(m);
		Term[] y1 = VA(a4);
		a5 = S("tail", y1);
		a6 = CONS(PRED_read_file_to_codes_3_s7, a3);
		a7 = V(m);
		a8 = V(m);
		Term[] y2 = VA(a7, ATOM_read, a8, a3);
		a9 = S("open", y2);
		Term[] y3 = VA(a8, a2, a4);
		a10 = S("read_stream_to_codes", y3);
		Term[] y4 = VA(a8);
		a11 = S("close", y4);
		return //
		Op((Prolog e) -> PRED_must_be_2_static_exec(e), VA(PRED_read_file_to_codes_3_s1, a3), //
				Op((Prolog e) -> PRED_option_3_static_exec(e), VA(a5, a3, Prolog.Nil), //
						Op((Prolog e) -> PRED_absolute_file_name_3_static_exec(e), VA(a1, a6, a7), //
								Op((Prolog e) -> PRED_setup_call_cleanup_3_static_exec(e), VA(a9, a10, a11), cont))));
	}

	/**
	 * PREDICATE: read_file_to_string/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_read_file_to_string_3_s1 = SYM("list");
	private static final StructureTerm PRED_read_file_to_string_3_s5 = S("access", ATOM_read);

	public static Operation PRED_read_file_to_string_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// read_file_to_string(A,B,C):-must_be(list,C),absolute_file_name(A,[access(read)|C],D),setup_call_cleanup(open(D,read,E,C),read_string(E,F,B),close(E))
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// read_file_to_string(A,B,C):-[must_be(list,C),absolute_file_name(A,[access(read)|C],D),setup_call_cleanup(open(D,read,E,C),read_string(E,F,B),close(E))]
		a4 = CONS(PRED_read_file_to_string_3_s5, a3);
		a5 = V(m);
		a6 = V(m);
		Term[] y1 = VA(a5, ATOM_read, a6, a3);
		a7 = S("open", y1);
		Term[] y2 = VA(a6, V(m), a2);
		a8 = S("read_string", y2);
		Term[] y3 = VA(a6);
		a9 = S("close", y3);
		return //
		Op((Prolog e) -> PRED_must_be_2_static_exec(e), VA(PRED_read_file_to_string_3_s1, a3), //
				Op((Prolog e) -> PRED_absolute_file_name_3_static_exec(e), VA(a1, a4, a5), //
						Op((Prolog e) -> PRED_setup_call_cleanup_3_static_exec(e), VA(a7, a8, a9), cont)));
	}

	/**
	 * PREDICATE: read_file_to_terms/3 from:
	 * /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl
	 */
	private static final SymbolTerm PRED_read_file_to_terms_3_s1 = SYM("list");
	private static final StructureTerm PRED_read_file_to_terms_3_s7 = S("access", ATOM_read);

	public static Operation PRED_read_file_to_terms_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// read_file_to_terms(A,B,C):-must_be(list,C),option(tail(D),C,[]),absolute_file_name(A,[access(read)|C],E),setup_call_cleanup(open(E,read,F,C),read_stream_to_terms(F,B,D,C),close(F))
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// read_file_to_terms(A,B,C):-[must_be(list,C),option(tail(D),C,[]),absolute_file_name(A,[access(read)|C],E),setup_call_cleanup(open(E,read,F,C),read_stream_to_terms(F,B,D,C),close(F))]
		a4 = V(m);
		Term[] y1 = VA(a4);
		a5 = S("tail", y1);
		a6 = CONS(PRED_read_file_to_terms_3_s7, a3);
		a7 = V(m);
		a8 = V(m);
		Term[] y2 = VA(a7, ATOM_read, a8, a3);
		a9 = S("open", y2);
		Term[] y3 = VA(a8, a2, a4, a3);
		a10 = S("read_stream_to_terms", y3);
		Term[] y4 = VA(a8);
		a11 = S("close", y4);
		return //
		Op((Prolog e) -> PRED_must_be_2_static_exec(e), VA(PRED_read_file_to_terms_3_s1, a3), //
				Op((Prolog e) -> PRED_option_3_static_exec(e), VA(a5, a3, Prolog.Nil), //
						Op((Prolog e) -> PRED_absolute_file_name_3_static_exec(e), VA(a1, a6, a7), //
								Op((Prolog e) -> PRED_setup_call_cleanup_3_static_exec(e), VA(a9, a10, a11), cont))));
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("link_foreign", 0, FILE_readutil::PRED_link_foreign_0_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl",
				"$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl",
				3,
				FILE_readutil::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec);
		PredTable.registerBuiltin("pl_read_line_to_codes", 2, FILE_readutil::PRED_pl_read_line_to_codes_2_static_exec);
		PredTable.registerBuiltin("read_1line_to_codes", 3, FILE_readutil::PRED_read_1line_to_codes_3_static_exec);
		PredTable.registerBuiltin("pl_read_line_to_codes", 3, FILE_readutil::PRED_pl_read_line_to_codes_3_static_exec);
		PredTable.registerBuiltin("read_line_to_codes", 4, FILE_readutil::PRED_read_line_to_codes_4_static_exec);
		PredTable.registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl",
				"$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl",
				3,
				FILE_readutil::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_3_static_exec);
		PredTable.registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/readutil.pl",
				"$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl",
				2,
				FILE_readutil::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Freadutil$002Epl_2_static_exec);
		PredTable.registerBuiltin("read_line_to_string", 2, FILE_readutil::PRED_read_line_to_string_2_static_exec);
		PredTable.registerBuiltin("pl_read_stream_to_codes", 2,
				FILE_readutil::PRED_pl_read_stream_to_codes_2_static_exec);
		PredTable.registerBuiltin("pl_read_stream_to_codes", 3,
				FILE_readutil::PRED_pl_read_stream_to_codes_3_static_exec);
		PredTable.registerBuiltin("read_stream_to_codes", 4, FILE_readutil::PRED_read_stream_to_codes_4_static_exec);
		PredTable.registerBuiltin("read_stream_to_terms", 4, FILE_readutil::PRED_read_stream_to_terms_4_static_exec);
		PredTable.registerBuiltin("read_stream_to_terms", 5, FILE_readutil::PRED_read_stream_to_terms_5_static_exec);
		PredTable.registerBuiltin("read_file_to_codes", 3, FILE_readutil::PRED_read_file_to_codes_3_static_exec);
		PredTable.registerBuiltin("read_file_to_string", 3, FILE_readutil::PRED_read_file_to_string_3_static_exec);
		PredTable.registerBuiltin("read_file_to_terms", 3, FILE_readutil::PRED_read_file_to_terms_3_static_exec);
	}
}
