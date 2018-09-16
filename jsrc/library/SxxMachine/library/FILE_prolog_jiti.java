package SxxMachine.library;

import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.locks.*;
import java.util.logging.*;
import static SxxMachine.builtin.bootpreds.*;
import static SxxMachine.builtin.bootpreds.LEVELS;
import static SxxMachine.builtin.FILE_builtins.*;
import static SxxMachine.builtin.FILE_cafeteria.*;
import static SxxMachine.builtin.FILE_io.*;
import static SxxMachine.builtin.FILE_swi_supp.*;
import static SxxMachine.builtin.FILE_system.*;
import static SxxMachine.builtin.sxxtensions.*;
import static SxxMachine.Failure.*;
import static SxxMachine.Predicate.*;
import static SxxMachine.Prolog.*;
import static SxxMachine.Success.*;
import static SxxMachine.SymbolTerm.*;
import static SxxMachine.TermData.*;
import SxxMachine.*;
import SxxMachine.builtin.*;
import SxxMachine.exceptions.*;
import SxxMachine.builtin.bootpreds.*;
import SxxMachine.builtin.bootpreds.PRED_$begin_exception_1;
import SxxMachine.builtin.bootpreds.PRED_$begin_sync_2;
import SxxMachine.builtin.bootpreds.PRED_$builtin_member_2;
import SxxMachine.builtin.FILE_builtins.*;
import SxxMachine.builtin.sxxtensions.*;

public class FILE_prolog_jiti extends FILE_builtins {
	/** PREDICATE: jiti_list/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/

	public static Operation PRED_jiti_list_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		// jiti_list:-jiti_list(A:B)
		m.setB0();
		Term a1;
		// jiti_list:-[jiti_list(A:B)]
		Term[] y1 = VA(V(m), V(m));
		a1 = S(":", y1);
		return //
		Op((e) -> PRED_jiti_list_1_static_exec(e), VA(a1), cont);
	}

	/** PREDICATE: jiti_list/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/
	final static SymbolTerm ATOM_Predicate$007E46$007C$007Ew$0020$007Et$007E8$002B$0020$007Et$007Ew$007E6$002B$0020$007Et$007Ew$007E6$002B$0020$007Et$007Ew$007E5$002B$007En = SYM(
			"Predicate~46|~w ~t~8+ ~t~w~6+ ~t~w~6+ ~t~w~5+~n");
	final static SymbolTerm ATOM_Indexed = SYM("Indexed");
	final static SymbolTerm ATOM_Buckets = SYM("Buckets");
	final static SymbolTerm ATOM_Speedup = SYM("Speedup");
	final static SymbolTerm ATOM_Flags = SYM("Flags");
	private static final ListTerm PRED_jiti_list_1_s14 = CONS(ATOM_Flags, Prolog.Nil);
	private static final ListTerm PRED_jiti_list_1_s15 = CONS(ATOM_Speedup, PRED_jiti_list_1_s14);
	private static final ListTerm PRED_jiti_list_1_s16 = CONS(ATOM_Buckets, PRED_jiti_list_1_s15);
	private static final ListTerm PRED_jiti_list_1_s17 = CONS(ATOM_Indexed, PRED_jiti_list_1_s16);
	final static SymbolTerm ATOM_$007E$0060$003Dt$007E76$007C$007En = SYM("~`=t~76|~n");
	final static SymbolTerm ATOM_print_indexed = SYM("print_indexed");

	public static Operation PRED_jiti_list_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_jiti::jiti_list_1_var, FILE_prolog_jiti::jiti_list_1_4, FILE_prolog_jiti::jiti_list_1_4, FILE_prolog_jiti::jiti_list_1_4, FILE_prolog_jiti::jiti_list_1_var,
				FILE_prolog_jiti::jiti_list_1_4);
	}

	private final static Operation jiti_list_1_var(Prolog m) {
		m.jtry1(null, FILE_prolog_jiti::jiti_list_1_var_1);
		return jiti_list_1_1(m);
	}

	private final static Operation jiti_list_1_var_1(Prolog m) {
		m.retry(null, FILE_prolog_jiti::jiti_list_1_var_2);
		return jiti_list_1_2(m);
	}

	private final static Operation jiti_list_1_var_2(Prolog m) {
		m.retry(null, FILE_prolog_jiti::jiti_list_1_var_3);
		return jiti_list_1_3(m);
	}

	private final static Operation jiti_list_1_var_3(Prolog m) {
		m.trust(null);
		return jiti_list_1_4(m);
	}

	private final static Operation jiti_list_1_1(Prolog m) {
		// jiti_list(A:B/C):-atom(B),integer(C),!,functor(D,B,C),jiti_list(A:D)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// jiti_list(A:B/C):-['$get_level'(D),atom(B),integer(C),'$cut'(D),functor(E,B,C),jiti_list(A:E)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C(":", a2, a3), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a3.unify(C("/", a4, a5), m.trail)) {
			return m.fail();
		}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(4))
		a4 = a4.dref();
		if (!(a4.isSymbol())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of integer(a(5))
		a5 = a5.dref();
		if (!(a5.isInteger())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		a7 = V(m);
		Term[] y1 = VA(a2, a7);
		a8 = S(":", y1);
		return //
		Op((e) -> PRED_functor_3_static_exec(e), VA(a7, a4, a5), //
				Op((e) -> PRED_jiti_list_1_static_exec(e), VA(a8), cont));
	}

	private final static Operation jiti_list_1_2(Prolog m) {
		// jiti_list(A:B/C):-atom(B),var(C),!,freeze(D,functor(D,B,E)),jiti_list(A:D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// jiti_list(A:B/C):-['$get_level'(D),atom(B),var(C),'$cut'(D),freeze(E,prolog_jiti:functor(E,B,F)),jiti_list(A:E)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C(":", a2, a3), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a3.unify(C("/", a4, a5), m.trail)) {
			return m.fail();
		}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(4))
		a4 = a4.dref();
		if (!(a4.isSymbol())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of var(a(5))
		a5 = a5.dref();
		if (!(a5.isVariable())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		a7 = V(m);
		a8 = Closure( //
				Op((e) -> PRED_functor_3_static_exec(e), VA(a7, a4, V(m)), null));
		Term[] y1 = VA(a2, a7);
		a9 = S(":", y1);
		return //
		Op(sxxtensions::PRED_freeze_2_static_exec, VA(a7, a8), //
				Op((e) -> PRED_jiti_list_1_static_exec(e), VA(a9), cont));
	}

	private final static Operation jiti_list_1_3(Prolog m) {
		// jiti_list(A:B):-atom(B),!,freeze(C,functor(C,B,D)),jiti_list(A:C)
		Term a1, a2, a3, a4, a5, a6, a7;
		Operation p1;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// jiti_list(A:B):-['$get_level'(C),atom(B),'$cut'(C),freeze(D,prolog_jiti:functor(D,B,E)),jiti_list(A:D)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C(":", a2, a3), m.trail)) {
			return m.fail();
		}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(3))
		a3 = a3.dref();
		if (!(a3.isSymbol())) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4.dref();
		m.cut(a4.intValue());
		//END inline expansion
		a5 = V(m);
		a6 = Closure( //
				Op((e) -> PRED_functor_3_static_exec(e), VA(a5, a3, V(m)), null));
		Term[] y1 = VA(a2, a5);
		a7 = S(":", y1);
		return //
		Op(sxxtensions::PRED_freeze_2_static_exec, VA(a5, a6), //
				Op((e) -> PRED_jiti_list_1_static_exec(e), VA(a7), cont));
	}

	private final static Operation jiti_list_1_4(Prolog m) {
		// jiti_list(A):-findall(A-B,(predicate_property(A,indexed(B)),\+predicate_property(A,imported_from(C))),D),format('Predicate~46|~w ~t~8+ ~t~w~6+ ~t~w~6+ ~t~w~5+~n',['Indexed','Buckets','Speedup','Flags']),format('~`=t~76|~n'),maplist(print_indexed,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// jiti_list(A):-[findall(A-B,prolog_jiti:(predicate_property(A,indexed(B)),\+predicate_property(A,imported_from(C))),D),format('Predicate~46|~w ~t~8+ ~t~w~6+ ~t~w~6+ ~t~w~5+~n',['Indexed','Buckets','Speedup','Flags']),format('~`=t~76|~n'),maplist(print_indexed,D)]
		a2 = V(m);
		Term[] y1 = VA(a1, a2);
		a3 = S("-", y1);
		Term[] y2 = VA(a2);
		a4 = S("indexed", y2);
		Term[] y3 = VA(a1, a4);
		a5 = S("predicate_property", y3);
		Term[] y4 = VA(V(m));
		a6 = S("imported_from", y4);
		Term[] y5 = VA(a1, a6);
		a7 = S("predicate_property", y5);
		Term[] y6 = VA(a7);
		a8 = S("\\+", y6);
		a9 = Closure( //
				Op((e) -> PRED_$002C_2_static_exec(e), VA(a5, a8), null));
		a10 = V(m);
		return //
		Op((e) -> PRED_findall_3_static_exec(e), VA(a3, a9, a10), //
				Op((e) -> PRED_format_2_static_exec(e),
						VA(ATOM_Predicate$007E46$007C$007Ew$0020$007Et$007E8$002B$0020$007Et$007Ew$007E6$002B$0020$007Et$007Ew$007E6$002B$0020$007Et$007Ew$007E5$002B$007En, PRED_jiti_list_1_s17), //
						Op((e) -> PRED_format_1_static_exec(e), VA(ATOM_$007E$0060$003Dt$007E76$007C$007En), //
								Op((e) -> PRED_maplist_2_static_exec(e), VA(ATOM_print_indexed, a10), cont))));
	}

	/** PREDICATE: print_indexed/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/
	final static SymbolTerm ATOM_$007Eq$0020$007Et$007E48$007C$007Es$0020$007Et$007E8$002B$0020$007Et$007ED$007E6$002B$0020$007Et$007E1f$007E8$002B$0020$007Et$007Es$007E3$002B$007En = SYM(
			"~q ~t~48|~s ~t~8+ ~t~D~6+ ~t~1f~8+ ~t~s~3+~n");
	final static SymbolTerm ATOM_print_secondary_index = SYM("print_secondary_index");
	final static SymbolTerm ATOM_Failed$003A$0020$007Ep$007En = SYM("Failed: ~p~n");

	public static Operation PRED_print_indexed_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_jiti::print_indexed_1_var, FILE_prolog_jiti::print_indexed_1_2, FILE_prolog_jiti::print_indexed_1_2, FILE_prolog_jiti::print_indexed_1_2, FILE_prolog_jiti::print_indexed_1_var,
				FILE_prolog_jiti::print_indexed_1_2);
	}

	private final static Operation print_indexed_1_var(Prolog m) {
		m.jtry1(null, FILE_prolog_jiti::print_indexed_1_var_1);
		return print_indexed_1_1(m);
	}

	private final static Operation print_indexed_1_var_1(Prolog m) {
		m.trust(null);
		return print_indexed_1_2(m);
	}

	private final static Operation print_indexed_1_1(Prolog m) {
		// print_indexed((A:B)-[C-hash(D,E,F,G)|H]):-functor(B,I,J),phrase(iarg_spec(C),K),phrase(iflags(G),L),format('~q ~t~48|~s ~t~8+ ~t~D~6+ ~t~1f~8+ ~t~s~3+~n',[A:I/J,K,D,E,L]),maplist(print_secondary_index,H),!
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26;
		Operation p1, p2, p3, p4, p5;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// print_indexed((A:B)-[C-hash(D,E,F,G)|H]):-['$get_level'(I),functor(B,J,K),phrase(iarg_spec(C),L),phrase(iflags(G),M),format('~q ~t~48|~s ~t~8+ ~t~D~6+ ~t~1f~8+ ~t~s~3+~n',[A:J/K,L,D,E,M]),maplist(print_secondary_index,H),'$cut'(I)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C("-", a2, a3), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		a4 = V(m);
		a5 = V(m);
		if (!a2.unify(C(":", a4, a5), m.trail)) {
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
		a6 = a6.dref();
		a8 = V(m);
		a9 = V(m);
		if (!a6.unify(C("-", a8, a9), m.trail)) {
			return m.fail();
		}
		a9 = a9.dref();
		a10 = V(m);
		a11 = V(m);
		a12 = V(m);
		if (!a9.unify(C("hash", a10, a11, V(m), a12), m.trail)) {
			return m.fail();
		}
		a13 = V(m);
		//START inline expansion of $get_level(a(13))
		if (!a13.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		a15 = V(m);
		Term[] y1 = VA(a8);
		a16 = S("iarg_spec", y1);
		a17 = V(m);
		Term[] y2 = VA(a12);
		a18 = S("iflags", y2);
		a19 = V(m);
		Term[] y3 = VA(a14, a15);
		a20 = S("/", y3);
		Term[] y4 = VA(a4, a20);
		a21 = S(":", y4);
		a22 = CONS(a19, Prolog.Nil);
		a23 = CONS(a11, a22);
		a24 = CONS(a10, a23);
		a25 = CONS(a17, a24);
		a26 = CONS(a21, a25);
		return //
		Op((e) -> PRED_functor_3_static_exec(e), VA(a5, a14, a15), //
				Op((e) -> PRED_phrase_2_static_exec(e), VA(a16, a17), //
						Op((e) -> PRED_phrase_2_static_exec(e), VA(a18, a19), //
								Op((e) -> PRED_format_2_static_exec(e),
										VA(ATOM_$007Eq$0020$007Et$007E48$007C$007Es$0020$007Et$007E8$002B$0020$007Et$007ED$007E6$002B$0020$007Et$007E1f$007E8$002B$0020$007Et$007Es$007E3$002B$007En, a26), //
										Op((e) -> PRED_maplist_2_static_exec(e), VA(ATOM_print_secondary_index, a7), //
												Op((e) -> PRED_$cut_1_static_exec(e), VA(a13), cont))))));
	}

	private final static Operation print_indexed_1_2(Prolog m) {
		// print_indexed(A):-format('Failed: ~p~n',[A])
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// print_indexed(A):-[format('Failed: ~p~n',[A])]
		a2 = CONS(a1, Prolog.Nil);
		return //
		Op((e) -> PRED_format_2_static_exec(e), VA(ATOM_Failed$003A$0020$007Ep$007En, a2), cont);
	}

	/** PREDICATE: print_secondary_index/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/
	final static SymbolTerm ATOM_$007Et$007E48$007C$007Es$0020$007Et$007E8$002B$0020$007Et$007ED$007E6$002B$0020$007Et$007E1f$007E8$002B$0020$007Et$007Es$007E3$002B$007En = SYM(
			"~t~48|~s ~t~8+ ~t~D~6+ ~t~1f~8+ ~t~s~3+~n");
	final static SymbolTerm ATOM_Secondary$0020failed$003A$0020$007Ep$007En = SYM("Secondary failed: ~p~n");

	public static Operation PRED_print_secondary_index_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_jiti::print_secondary_index_1_var, FILE_prolog_jiti::print_secondary_index_1_2, FILE_prolog_jiti::print_secondary_index_1_2, FILE_prolog_jiti::print_secondary_index_1_2,
				FILE_prolog_jiti::print_secondary_index_1_var, FILE_prolog_jiti::print_secondary_index_1_2);
	}

	private final static Operation print_secondary_index_1_var(Prolog m) {
		m.jtry1(null, FILE_prolog_jiti::print_secondary_index_1_var_1);
		return print_secondary_index_1_1(m);
	}

	private final static Operation print_secondary_index_1_var_1(Prolog m) {
		m.trust(null);
		return print_secondary_index_1_2(m);
	}

	private final static Operation print_secondary_index_1_1(Prolog m) {
		// print_secondary_index(A-hash(B,C,D,E)):-phrase(iarg_spec(A),F),phrase(iflags(E),G),format('~t~48|~s ~t~8+ ~t~D~6+ ~t~1f~8+ ~t~s~3+~n',[F,B,C,G]),!
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// print_secondary_index(A-hash(B,C,D,E)):-['$get_level'(F),phrase(iarg_spec(A),G),phrase(iflags(E),H),format('~t~48|~s ~t~8+ ~t~D~6+ ~t~1f~8+ ~t~s~3+~n',[G,B,C,H]),'$cut'(F)]
		a1 = a1.dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1.unify(C("-", a2, a3), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		if (!a3.unify(C("hash", a4, a5, V(m), a6), m.trail)) {
			return m.fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a2);
		a8 = S("iarg_spec", y1);
		a9 = V(m);
		Term[] y2 = VA(a6);
		a10 = S("iflags", y2);
		a11 = V(m);
		a12 = CONS(a11, Prolog.Nil);
		a13 = CONS(a5, a12);
		a14 = CONS(a4, a13);
		a15 = CONS(a9, a14);
		return //
		Op((e) -> PRED_phrase_2_static_exec(e), VA(a8, a9), //
				Op((e) -> PRED_phrase_2_static_exec(e), VA(a10, a11), //
						Op((e) -> PRED_format_2_static_exec(e), VA(ATOM_$007Et$007E48$007C$007Es$0020$007Et$007E8$002B$0020$007Et$007ED$007E6$002B$0020$007Et$007E1f$007E8$002B$0020$007Et$007Es$007E3$002B$007En, a15), //
								Op((e) -> PRED_$cut_1_static_exec(e), VA(a7), cont))));
	}

	private final static Operation print_secondary_index_1_2(Prolog m) {
		// print_secondary_index(A):-format('Secondary failed: ~p~n',[A])
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// print_secondary_index(A):-[format('Secondary failed: ~p~n',[A])]
		a2 = CONS(a1, Prolog.Nil);
		return //
		Op((e) -> PRED_format_2_static_exec(e), VA(ATOM_Secondary$0020failed$003A$0020$007Ep$007En, a2), cont);
	}

	/** PREDICATE: iarg_spec/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/

	public static Operation PRED_iarg_spec_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_jiti::iarg_spec_3_var, fail_0, fail_0, fail_0, FILE_prolog_jiti::iarg_spec_3_var, fail_0);
	}

	private final static Operation iarg_spec_3_var(Prolog m) {
		m.jtry3(null, FILE_prolog_jiti::iarg_spec_3_var_1);
		return iarg_spec_3_1(m);
	}

	private final static Operation iarg_spec_3_var_1(Prolog m) {
		m.retry(null, FILE_prolog_jiti::iarg_spec_3_var_2);
		return iarg_spec_3_2(m);
	}

	private final static Operation iarg_spec_3_var_2(Prolog m) {
		m.trust(null);
		return iarg_spec_3_3(m);
	}

	private final static Operation iarg_spec_3_1(Prolog m) {
		// iarg_spec(single(A),B,C):-number(A,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// iarg_spec(single(A),B,C):-[number(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("single", a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((e) -> PRED_number_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	private final static Operation iarg_spec_3_2(Prolog m) {
		// iarg_spec(multi(A),B,C):-plus_list(A,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// iarg_spec(multi(A),B,C):-[plus_list(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("multi", a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((e) -> PRED_plus_list_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	private final static Operation iarg_spec_3_3(Prolog m) {
		// iarg_spec(deep(A),B,C):-deep_list(A,B,C)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// iarg_spec(deep(A),B,C):-[deep_list(A,B,C)]
		a1 = a1.dref();
		a4 = V(m);
		if (!a1.unify(C("deep", a4), m.trail)) {
			return m.fail();
		}
		return //
		Op((e) -> PRED_deep_list_3_static_exec(e), VA(a4, a2, a3), cont);
	}

	/** PREDICATE: $dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl/5
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/
	private static final SymbolTerm PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_s1 = SYM("[]");
	final static IntegerTerm int_43 = Integer(43);

	// private final Term arg5;

	public static Operation PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		m.jtry5(null, FILE_prolog_jiti::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_1(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_sub_1(Prolog m) {
		m.trust(null);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_2(m);
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_1(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl'(A,B,C,D,E):-(A==[],D=C),!,D=B
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl'(A,B,C,D,E):-['$get_level'(F),'$equality_of_term'(A,[]),'$unify'(D,C),'$cut'(F),'$unify'(D,B)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1.dref();
		if (!a1.equalsTerm(PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_s1)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(4),a(3))
		if (!a4.unify(a3, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6.dref();
		m.cut(a6.intValue());
		//END inline expansion
		//START inline expansion of $unify(a(4),a(2))
		if (!a4.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return cont;
	}

	private final static Operation $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_2(Prolog m) {
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl'(A,B,C,D,E):-C=[43|E],plus_list(A,E,B)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		a5 = m.AREGS[4];
		cont = m.cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl'(A,B,C,D,E):-['$unify'(C,[43|E]),plus_list(A,E,B)]
		a6 = CONS(int_43, a5);
		//START inline expansion of $unify(a(3),a(6))
		if (!a3.unify(a6, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((e) -> PRED_plus_list_3_static_exec(e), VA(a1, a5, a2), cont);
	}

	/** PREDICATE: plus_list/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/

	public static Operation PRED_plus_list_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		// plus_list([A|B],C,D):-number(A,C,E),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl'(B,D,E,F,G)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6;
		Operation p1;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// plus_list([A|B],C,D):-[number(A,C,E),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl'(B,D,E,F,G)]
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
		Op((e) -> PRED_number_3_static_exec(e), VA(a4, a2, a6), //
				Op((e) -> PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_static_exec(e), VA(a5, a3, a6, V(m), V(m)), cont));
	}

	/** PREDICATE: deep_list/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/
	private static final SymbolTerm PRED_deep_list_3_s1 = SYM("[]");
	final static IntegerTerm int_47 = Integer(47);

	public static Operation PRED_deep_list_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_jiti::deep_list_3_var, fail_0, fail_0, fail_0, fail_0, FILE_prolog_jiti::deep_list_3_var);
	}

	private final static Operation deep_list_3_var(Prolog m) {
		m.jtry3(null, FILE_prolog_jiti::deep_list_3_var_1);
		return deep_list_3_1(m);
	}

	private final static Operation deep_list_3_var_1(Prolog m) {
		m.trust(null);
		return deep_list_3_2(m);
	}

	private final static Operation deep_list_3_1(Prolog m) {
		// deep_list([A],B,C):-(!,D=B),iarg_spec(A,D,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// deep_list([A],B,C):-['$neck_cut','$unify'(D,B),iarg_spec(A,D,C)]
		a1 = a1.dref();
		if (a1.isCons()) {
			Term[] argz = VA(a1.car(), a1.cdr());
			a4 = argz[0];
			if (!PRED_deep_list_3_s1.unify(argz[1], m.trail))
				return m.fail();
		} else if (a1.isVar()) {
			a4 = V(m);
			a1.bind(CONS(a4, PRED_deep_list_3_s1), m.trail);
		} else {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		a5 = V(m);
		//START inline expansion of $unify(a(5),a(2))
		if (!a5.unify(a2, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((e) -> PRED_iarg_spec_3_static_exec(e), VA(a4, a5, a3), cont);
	}

	private final static Operation deep_list_3_2(Prolog m) {
		// deep_list([A|B],C,D):-number(A,C,E),E=[47|F],deep_list(B,F,D)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation p1, p2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// deep_list([A|B],C,D):-[number(A,C,E),'$unify'(E,[47|F]),deep_list(B,F,D)]
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
		a8 = CONS(int_47, a7);
		return //
		Op((e) -> PRED_number_3_static_exec(e), VA(a4, a2, a6), //
				Op((e) -> PRED_$unify_2_static_exec(e), VA(a6, a8), //
						Op((e) -> PRED_deep_list_3_static_exec(e), VA(a5, a7, a3), cont)));
	}

	/** PREDICATE: iflags/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl
	*/
	private static final SymbolTerm PRED_iflags_3_s1 = SYM("true");
	final static IntegerTerm int_76 = Integer(76);
	final static SymbolTerm ATOM_false = SYM("false");

	public static Operation PRED_iflags_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		Operation thiz = m.pred;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_prolog_jiti::iflags_3_var, fail_0, fail_0, FILE_prolog_jiti::iflags_3_var, fail_0, fail_0);
	}

	private final static Operation iflags_3_var(Prolog m) {
		m.jtry3(null, FILE_prolog_jiti::iflags_3_var_1);
		return iflags_3_1(m);
	}

	private final static Operation iflags_3_var_1(Prolog m) {
		m.trust(null);
		return iflags_3_2(m);
	}

	private final static Operation iflags_3_1(Prolog m) {
		// iflags(true,[76|A],A):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// iflags(true,[76|A],A):-[]
		if (!PRED_iflags_3_s1.unify(a1, m.trail))
			return m.fail();
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!int_76.unify(argz[0], m.trail))
				return m.fail();
			a4 = argz[1];
		} else if (a2.isVar()) {
			a4 = V(m);
			a2.bind(CONS(int_76, a4), m.trail);
		} else {
			return m.fail();
		}
		if (!a4.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation iflags_3_2(Prolog m) {
		// iflags(false,A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// iflags(false,A,A):-[]
		if (!ATOM_false.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("jiti_list", 0, FILE_prolog_jiti::PRED_jiti_list_0_static_exec);
		PredTable.registerBuiltin("jiti_list", 1, FILE_prolog_jiti::PRED_jiti_list_1_static_exec);
		PredTable.registerBuiltin("print_indexed", 1, FILE_prolog_jiti::PRED_print_indexed_1_static_exec);
		PredTable.registerBuiltin("print_secondary_index", 1, FILE_prolog_jiti::PRED_print_secondary_index_1_static_exec);
		PredTable.registerBuiltin("iarg_spec", 3, FILE_prolog_jiti::PRED_iarg_spec_3_static_exec);
		PredTable.registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/prolog_jiti.pl",
				"$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl", 5,
				FILE_prolog_jiti::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fprolog_jiti$002Epl_5_static_exec);
		PredTable.registerBuiltin("plus_list", 3, FILE_prolog_jiti::PRED_plus_list_3_static_exec);
		PredTable.registerBuiltin("deep_list", 3, FILE_prolog_jiti::PRED_deep_list_3_static_exec);
		PredTable.registerBuiltin("iflags", 3, FILE_prolog_jiti::PRED_iflags_3_static_exec);
	}
}
