package SxxMachine.bench;

import static SxxMachine.FILE_builtins.PRED_$greater_than_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_findall_3_static_exec;
import static SxxMachine.FILE_builtins.PRED_retractall_1_static_exec;
import static SxxMachine.FILE_builtins.PRED_statistics_2_static_exec;
import static SxxMachine.Failure.fail_0;
import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
import static SxxMachine.bootpreds.PRED_arg_3_static_exec;
import static SxxMachine.bootpreds.PRED_between_3_static_exec;
import static SxxMachine.sxxtensions.PRED_assert_2_static_exec;
import static SxxMachine.sxxtensions.PRED_erase_1_static_exec;
import static SxxMachine.sxxtensions.PRED_forall_2_static_exec;
import static SxxMachine.sxxtensions.PRED_format_3_static_exec;
import static SxxMachine.sxxtensions.PRED_garbage_collect_0_static_exec;
import static SxxMachine.sxxtensions.PRED_phrase_2_static_exec;
import static SxxMachine.sxxtensions.PRED_style_check_1_static_exec;
import static SxxMachine.sxxtensions.PRED_time_1_static_exec;

import SxxMachine.Arithmetic;
import SxxMachine.DoubleTerm;
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
import SxxMachine.sxxtensions;

public class FILE_run  extends TermData {
	/** PREDICATE: run/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_run_1_s1 = SYM("current_output");

	public static Operation PRED_run_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// run(A):-run(current_output,A)
		m.setB0();
		Term a1;
		a1 = LARG[0];
		// run(A):-[run(current_output,A)]
		return //
		Op((Prolog e) -> PRED_run_2_static_exec(e), VA(PRED_run_1_s1, a1), cont);
	}

	/** PREDICATE: run/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_run_2_s1 = SYM("~p~t~18| ~t~w~25| ~t~w~32|~n");
	final static SymbolTerm ATOM_Program = SYM("Program");
	final static SymbolTerm ATOM_Time = SYM("Time");
	final static SymbolTerm ATOM_GC = SYM("GC");
	private static final ListTerm PRED_run_2_s6 = CONS(ATOM_GC, Prolog.Nil);
	private static final ListTerm PRED_run_2_s7 = CONS(ATOM_Time, PRED_run_2_s6);
	private static final ListTerm PRED_run_2_s8 = CONS(ATOM_Program, PRED_run_2_s7);
	final static SymbolTerm ATOM_$007E$0060$003Dt$007E32$007C$007En = SYM("~`=t~32|~n");
	final static IntegerTerm int_0 = Integer(0);
	private static final StructureTerm PRED_run_2_s13 = S("total", int_0, int_0, int_0);
	final static SymbolTerm ATOM_$007Et$007Ew$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En = SYM("~t~w~18| ~t~3f~25| ~t~3f~32|~n");
	final static SymbolTerm ATOM_average = SYM("average");

	public static Operation PRED_run_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// run(A,B):-compile_programs,format(A,'~p~t~18| ~t~w~25| ~t~w~32|~n',['Program','Time','GC']),format(A,'~`=t~32|~n',[]),C=total(0,0,0),forall(program(D,E,B),run_program(D,E,A,C)),C=total(F,G,H),I is G/F,J is H/F,format(A,'~t~w~18| ~t~3f~25| ~t~3f~32|~n',[average,I,J])
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18;
		a1 = LARG[0];
		a2 = LARG[1];
		// run(A,B):-[compile_programs,format(A,'~p~t~18| ~t~w~25| ~t~w~32|~n',['Program','Time','GC']),format(A,'~`=t~32|~n',[]),'$unify'(C,total(0,0,0)),forall(program(D,E,B),run_program(D,E,A,C)),'$unify'(C,total(F,G,H)),I is G/F,J is H/F,format(A,'~t~w~18| ~t~3f~25| ~t~3f~32|~n',[average,I,J])]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		Term[] y1 = VA(a4, a5, a2);
		a6 = S("program", y1);
		Term[] y2 = VA(a4, a5, a1, a3);
		a7 = S("run_program", y2);
		a8 = V(m);
		a9 = V(m);
		a10 = V(m);
		Term[] y3 = VA(a8, a9, a10);
		a11 = S("total", y3);
		a12 = V(m);
		Term[] y4 = VA(a9, a8);
		a13 = S("/", y4);
		a14 = V(m);
		Term[] y5 = VA(a10, a8);
		a15 = S("/", y5);
		a16 = CONS(a14, Prolog.Nil);
		a17 = CONS(a12, a16);
		a18 = CONS(ATOM_average, a17);
		return //
		Op((Prolog e) -> PRED_compile_programs_0_static_exec(e), VA(), //
				Op((Prolog e) -> PRED_format_3_static_exec(e), VA(a1, PRED_run_2_s1, PRED_run_2_s8), //
						Op((Prolog e) -> PRED_format_3_static_exec(e), VA(a1, ATOM_$007E$0060$003Dt$007E32$007C$007En, Prolog.Nil), //
								Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, PRED_run_2_s13), //
										Op((Prolog e) -> PRED_forall_2_static_exec(e), VA(a6, a7), //
												Op((Prolog e) -> PRED_$unify_2_static_exec(e), VA(a3, a11), //
														Op(FILE_builtins::PRED_is_2_static_exec, VA(a12, a13), //
																Op(FILE_builtins::PRED_is_2_static_exec, VA(a14, a15), //
																		Op((Prolog e) -> PRED_format_3_static_exec(e),
																				VA(a1, ATOM_$007Et$007Ew$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En, a18), cont)))))))));
	}

	/** PREDICATE: compile_programs/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	final static SymbolTerm ATOM_singleton = SYM("singleton");
	private static final StructureTerm PRED_compile_programs_0_s4 = S("-", ATOM_singleton);
	private static final StructureTerm PRED_compile_programs_0_s12 = S("silent", Prolog.True);
	final static SymbolTerm ATOM_changed = SYM("changed");
	private static final StructureTerm PRED_compile_programs_0_s16 = S("if", ATOM_changed);
	private static final ListTerm PRED_compile_programs_0_s18 = CONS(PRED_compile_programs_0_s16, Prolog.Nil);
	private static final ListTerm PRED_compile_programs_0_s19 = CONS(PRED_compile_programs_0_s12, PRED_compile_programs_0_s18);

	public static Operation PRED_compile_programs_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// compile_programs:-style_check(-singleton),forall(program(A,B),load_files(A:bench(A),[silent(true),if(changed)]))
		m.setB0();
		Term a1, a2, a3, a4, a5;
		// compile_programs:-[style_check(-singleton),forall(program(A,B),load_files(A:bench(A),[silent(true),if(changed)]))]
		a1 = V(m);
		Term[] y1 = VA(a1, V(m));
		a2 = S("program", y1);
		Term[] y2 = VA(a1);
		a3 = S("bench", y2);
		Term[] y3 = VA(a1, a3);
		a4 = S(":", y3);
		Term[] y4 = VA(a4, PRED_compile_programs_0_s19);
		a5 = S("load_files", y4);
		return //
		Op((Prolog e) -> PRED_style_check_1_static_exec(e), VA(PRED_compile_programs_0_s4), //
				Op((Prolog e) -> PRED_forall_2_static_exec(e), VA(a2, a5), cont));
	}

	/** PREDICATE: run_program/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final /**/ IntegerTerm PRED_run_program_4_s1 = Integer(1);
	final static IntegerTerm int_2 = Integer(2);
	final static IntegerTerm int_3 = Integer(3);
	final static SymbolTerm ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En = SYM("~p~t~18| ~t~3f~25| ~t~3f~32|~n");

	public static Operation PRED_run_program_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// run_program(A,B,C,D):-ntimes(A,B,E,F),!,add(1,D,1),add(2,D,E),add(3,D,F),format(C,'~p~t~18| ~t~3f~25| ~t~3f~32|~n',[A,E,F])
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// run_program(A,B,C,D):-['$get_level'(E),ntimes(A,B,F,G),'$cut'(E),add(1,D,1),add(2,D,F),add(3,D,G),format(C,'~p~t~18| ~t~3f~25| ~t~3f~32|~n',[A,F,G])]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a6 = V(m);
		a7 = V(m);
		a8 = CONS(a7, Prolog.Nil);
		a9 = CONS(a6, a8);
		a10 = CONS(a1, a9);
		return //
		Op((Prolog e) -> PRED_ntimes_4_static_exec(e), VA(a1, a2, a6, a7), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a5), //
						Op((Prolog e) -> PRED_add_3_static_exec(e), VA(PRED_run_program_4_s1, a4, PRED_run_program_4_s1), //
								Op((Prolog e) -> PRED_add_3_static_exec(e), VA(int_2, a4, a6), //
										Op((Prolog e) -> PRED_add_3_static_exec(e), VA(int_3, a4, a7), //
												Op((Prolog e) -> PRED_format_3_static_exec(e), VA(a3, ATOM_$007Ep$007Et$007E18$007C$0020$007Et$007E3f$007E25$007C$0020$007Et$007E3f$007E32$007C$007En, a10), cont))))));
	}

	/** PREDICATE: add/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_add_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// add(A,B,C):-arg(A,B,D),E is D+C,nb_setarg(A,B,E)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// add(A,B,C):-[arg(A,B,D),E is D+C,nb_setarg(A,B,E)]
		a4 = V(m);
		a5 = V(m);
		Term[] y1 = VA(a4, a3);
		a6 = S("+", y1);
		return //
		Op((Prolog e) -> PRED_arg_3_static_exec(e), VA(a1, a2, a4), //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a5, a6), //
						Op(sxxtensions::PRED_nb_setarg_3_static_exec, VA(a1, a2, a5), cont)));
	}

	/** PREDICATE: get_performance_stats/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_get_performance_stats_2_s1 = SYM("gctime");
	final static SymbolTerm ATOM_cputime = SYM("cputime");

	public static Operation PRED_get_performance_stats_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// get_performance_stats(A,B):-statistics(gctime,A),statistics(cputime,B)
		m.setB0();
		Term a1, a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// get_performance_stats(A,B):-[statistics(gctime,A),statistics(cputime,B)]
		return //
		Op((Prolog e) -> PRED_statistics_2_static_exec(e), VA(PRED_get_performance_stats_2_s1, a1), //
				Op((Prolog e) -> PRED_statistics_2_static_exec(e), VA(ATOM_cputime, a2), cont));
	}

	/** PREDICATE: ntimes/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_ntimes_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// ntimes(A,B,C,D):-get_performance_stats(E,F),ntimes(A,B),get_performance_stats(G,H),ntimes_dummy(B),get_performance_stats(I,J),C is H-F-(J-H),D is G-E-(I-G)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// ntimes(A,B,C,D):-[get_performance_stats(E,F),ntimes(A,B),get_performance_stats(G,H),ntimes_dummy(B),get_performance_stats(I,J),C is H-F-(J-H),D is G-E-(I-G)]
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		a10 = V(m);
		Term[] y1 = VA(a8, a6);
		a11 = S("-", y1);
		Term[] y2 = VA(a10, a8);
		a12 = S("-", y2);
		Term[] y3 = VA(a11, a12);
		a13 = S("-", y3);
		Term[] y4 = VA(a7, a5);
		a14 = S("-", y4);
		Term[] y5 = VA(a9, a7);
		a15 = S("-", y5);
		Term[] y6 = VA(a14, a15);
		a16 = S("-", y6);
		return //
		Op((Prolog e) -> PRED_get_performance_stats_2_static_exec(e), VA(a5, a6), //
				Op((Prolog e) -> PRED_ntimes_2_static_exec(e), VA(a1, a2), //
						Op((Prolog e) -> PRED_get_performance_stats_2_static_exec(e), VA(a7, a8), //
								Op((Prolog e) -> PRED_ntimes_dummy_1_static_exec(e), VA(a2), //
										Op((Prolog e) -> PRED_get_performance_stats_2_static_exec(e), VA(a9, a10), //
												Op(FILE_builtins::PRED_is_2_static_exec, VA(a3, a13), //
														Op(FILE_builtins::PRED_is_2_static_exec, VA(a4, a16), cont)))))));
	}

	/** PREDICATE: ntimes/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final /**/ IntegerTerm PRED_ntimes_2_s1 = Integer(0);
	final static IntegerTerm int_1 = Integer(1);

	public static Operation PRED_ntimes_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry2(null, FILE_run::ntimes_2_sub_1);
		return ntimes_2_1(m);
	}

	private final static Operation ntimes_2_sub_1(Prolog m) {
		m.trust(null);
		return ntimes_2_2(m);
	}

	private final static Operation ntimes_2_1(Prolog m) {
		// ntimes(A,B):-B=:=0,!
		Term a2, a3, a4;
		Operation cont;
		a2 = m.AREGS[1];
		cont = m.cont;
		// ntimes(A,B):-['$get_level'(C),D is 0,'$arith_equal'(B,D),'$cut'(C)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a4 = V(m);
		//START inline expansion of a(4)is si(1)
		if (!a4.unify(PRED_ntimes_2_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $arith_equal(a(2),a(4))
		if (Arithmetic.evaluate(a2).arithCompareTo(Arithmetic.evaluate(a4)) != 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3.dref();
		m.cut(a3.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation ntimes_2_2(Prolog m) {
		// ntimes(A,B):-not_not_top(A),!,C is B-1,ntimes(A,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// ntimes(A,B):-['$get_level'(C),not_not_top(A),'$cut'(C),D is B-1,ntimes(A,D)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a4 = V(m);
		Term[] y1 = VA(a2, int_1);
		a5 = S("-", y1);
		return //
		Op((Prolog e) -> PRED_not_not_top_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a4, a5), //
								Op((Prolog e) -> PRED_ntimes_2_static_exec(e), VA(a1, a4), cont))));
	}

	/** PREDICATE: ntimes_dummy/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final /**/ IntegerTerm PRED_ntimes_dummy_1_s1 = Integer(0);

	public static Operation PRED_ntimes_dummy_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_run::ntimes_dummy_1_sub_1);
		return ntimes_dummy_1_1(m);
	}

	private final static Operation ntimes_dummy_1_sub_1(Prolog m) {
		m.trust(null);
		return ntimes_dummy_1_2(m);
	}

	private final static Operation ntimes_dummy_1_1(Prolog m) {
		// ntimes_dummy(A):-A=:=0,!
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// ntimes_dummy(A):-['$get_level'(B),C is 0,'$arith_equal'(A,C),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a3 = V(m);
		//START inline expansion of a(3)is si(1)
		if (!a3.unify(PRED_ntimes_dummy_1_s1, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $arith_equal(a(1),a(3))
		if (Arithmetic.evaluate(a1).arithCompareTo(Arithmetic.evaluate(a3)) != 0) {
			return m.fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2.dref();
		m.cut(a2.intValue());
		//END inline expansion
		return cont;
	}

	private final static Operation ntimes_dummy_1_2(Prolog m) {
		// ntimes_dummy(A):-not_not_dummy,!,B is A-1,ntimes_dummy(B)
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// ntimes_dummy(A):-['$get_level'(B),not_not_dummy,'$cut'(B),C is A-1,ntimes_dummy(C)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a3 = V(m);
		Term[] y1 = VA(a1, int_1);
		a4 = S("-", y1);
		return //
		Op((Prolog e) -> PRED_not_not_dummy_0_static_exec(e), VA(), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a2), //
						Op(FILE_builtins::PRED_is_2_static_exec, VA(a3, a4), //
								Op((Prolog e) -> PRED_ntimes_dummy_1_static_exec(e), VA(a3), cont))));
	}

	/** PREDICATE: not_not_top/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_not_not_top_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_run::not_not_top_1_sub_1);
		return not_not_top_1_1(m);
	}

	private final static Operation not_not_top_1_sub_1(Prolog m) {
		m.trust(null);
		return not_not_top_1_2(m);
	}

	private final static Operation not_not_top_1_1(Prolog m) {
		// not_not_top(A):-not_top(A),!,fail
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// not_not_top(A):-['$get_level'(B),not_top(A),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_not_top_1_static_exec(e), VA(a1), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a2), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation not_not_top_1_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// not_not_top(A):-[]
		return cont;
	}

	/** PREDICATE: not_top/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	final static SymbolTerm ATOM_top = SYM("top");

	public static Operation PRED_not_top_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry1(null, FILE_run::not_top_1_sub_1);
		return not_top_1_1(m);
	}

	private final static Operation not_top_1_sub_1(Prolog m) {
		m.trust(null);
		return not_top_1_2(m);
	}

	private final static Operation not_top_1_1(Prolog m) {
		// not_top(A):-A:top,!,fail
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		cont = m.cont;
		// not_top(A):-['$get_level'(B),call(A:top),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		Term[] y1 = VA(a1, ATOM_top);
		a3 = S(":", y1);
		return //
		Op((Prolog e) -> PRED_call_1_static_exec(e), VA(a3), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a2), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation not_top_1_2(Prolog m) {
		Operation cont;
		cont = m.cont;
		// not_top(A):-[]
		return cont;
	}

	/** PREDICATE: not_not_dummy/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_not_not_dummy_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry0(null, FILE_run::not_not_dummy_0_sub_1);
		return not_not_dummy_0_1(m);
	}

	private final static Operation not_not_dummy_0_sub_1(Prolog m) {
		m.trust(null);
		return not_not_dummy_0_2(m);
	}

	private final static Operation not_not_dummy_0_1(Prolog m) {
		// not_not_dummy:-not_dummy,!,fail
		Term a1;
		Operation cont;
		cont = m.cont;
		// not_not_dummy:-['$get_level'(A),not_dummy,'$cut'(A),fail]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_not_dummy_0_static_exec(e), VA(), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a1), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation not_not_dummy_0_2(Prolog m) {
		// not_not_dummy:-true
		Operation cont;
		cont = m.cont;
		// not_not_dummy:-[]
		return cont;
	}

	/** PREDICATE: not_dummy/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_not_dummy_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		m.jtry0(null, FILE_run::not_dummy_0_sub_1);
		return not_dummy_0_1(m);
	}

	private final static Operation not_dummy_0_sub_1(Prolog m) {
		m.trust(null);
		return not_dummy_0_2(m);
	}

	private final static Operation not_dummy_0_1(Prolog m) {
		// not_dummy:-dummy,!,fail
		Term a1;
		Operation cont;
		cont = m.cont;
		// not_dummy:-['$get_level'(A),dummy,'$cut'(A),fail]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		return //
		Op((Prolog e) -> PRED_dummy_0_static_exec(e), VA(), //
				Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a1), //
						Op(fail_0, VA(), cont)));
	}

	private final static Operation not_dummy_0_2(Prolog m) {
		// not_dummy:-true
		Operation cont;
		cont = m.cont;
		// not_dummy:-[]
		return cont;
	}

	/** PREDICATE: dummy/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_dummy_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// dummy:-true
		m.setB0();
		// dummy:-[]
		return cont;
	}

	/** PREDICATE: tune_counts/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	final static SymbolTerm ATOM_$007Eq$002E$007En = SYM("~q.~n");

	public static Operation PRED_tune_counts_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// tune_counts:-forall(program(A,B),(tune_count(A,C),format('~q.~n',[program(A,C)])))
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		// tune_counts:-[forall(program(A,B),(tune_count(A,C),format('~q.~n',[program(A,C)])))]
		a1 = V(m);
		Term[] y1 = VA(a1, V(m));
		a2 = S("program", y1);
		a3 = V(m);
		Term[] y2 = VA(a1, a3);
		a4 = S("tune_count", y2);
		Term[] y3 = VA(a1, a3);
		a5 = S("program", y3);
		a6 = CONS(a5, Prolog.Nil);
		Term[] y4 = VA(ATOM_$007Eq$002E$007En, a6);
		a7 = S("format", y4);
		Term[] y5 = VA(a4, a7);
		a8 = S(",", y5);
		return //
		Op((Prolog e) -> PRED_forall_2_static_exec(e), VA(a2, a8), cont);
	}

	/** PREDICATE: tune_count/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final /**/ IntegerTerm PRED_tune_count_2_s1 = Integer(1);
	final static IntegerTerm int_100 = Integer(100);
	private static final DoubleTerm sf4 = Float(0.5);

	public static Operation PRED_tune_count_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// tune_count(A,B):-between(1,100,C),D is 1<<C,ntimes(A,D,E,F),E>0.5,!,B is round(D*(1/E))
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
		a1 = LARG[0];
		a2 = LARG[1];
		// tune_count(A,B):-['$get_level'(C),between(1,100,D),E is 1<<D,ntimes(A,E,F,G),H is 0.5,'$greater_than'(F,H),'$cut'(C),B is round(E*(1/F))]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3.unifyInt(m.B0, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		Term[] y1 = VA(PRED_tune_count_2_s1, a4);
		a6 = S("<<", y1);
		a7 = V(m);
		a8 = V(m);
		Term[] y2 = VA(PRED_tune_count_2_s1, a7);
		a9 = S("/", y2);
		Term[] y3 = VA(a5, a9);
		a10 = S("*", y3);
		Term[] y4 = VA(a10);
		a11 = S("round", y4);
		return //
		Op((Prolog e) -> PRED_between_3_static_exec(e), VA(PRED_tune_count_2_s1, int_100, a4), //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a5, a6), //
						Op((Prolog e) -> PRED_ntimes_4_static_exec(e), VA(a1, a5, a7, V(m)), //
								Op(FILE_builtins::PRED_is_2_static_exec, VA(a8, sf4), //
										Op((Prolog e) -> PRED_$greater_than_2_static_exec(e), VA(a7, a8), //
												Op((Prolog e) -> PRED_$cut_1_static_exec(e), VA(a3), //
														Op(FILE_builtins::PRED_is_2_static_exec, VA(a2, a11), cont)))))));
	}

	/** PREDICATE: program/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_program_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// program(A,B,C):-program(A,D),B is max(1,round(D*C))
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// program(A,B,C):-[program(A,D),B is max(1,round(D*C))]
		a4 = V(m);
		Term[] y1 = VA(a4, a3);
		a5 = S("*", y1);
		Term[] y2 = VA(a5);
		a6 = S("round", y2);
		Term[] y3 = VA(int_1, a6);
		a7 = S("max", y3);
		return //
		Op((Prolog e) -> PRED_program_2_static_exec(e), VA(a1, a4), //
				Op(FILE_builtins::PRED_is_2_static_exec, VA(a2, a7), cont));
	}

	/** PREDICATE: program/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_program_2_s1 = SYM("boyer");
	final static IntegerTerm int_8 = Integer(8);
	final static SymbolTerm ATOM_browse = SYM("browse");
	final static IntegerTerm int_7 = Integer(7);
	final static SymbolTerm ATOM_chat_parser = SYM("chat_parser");
	final static IntegerTerm int_46 = Integer(46);
	final static SymbolTerm ATOM_crypt = SYM("crypt");
	final static IntegerTerm int_868 = Integer(868);
	final static SymbolTerm ATOM_fast_mu = SYM("fast_mu");
	final static IntegerTerm int_4819 = Integer(4819);
	final static SymbolTerm ATOM_flatten = SYM("flatten");
	final static IntegerTerm int_8275 = Integer(8275);
	final static SymbolTerm ATOM_meta_qsort = SYM("meta_qsort");
	final static IntegerTerm int_966 = Integer(966);
	final static SymbolTerm ATOM_mu = SYM("mu");
	final static IntegerTerm int_6827 = Integer(6827);
	final static SymbolTerm ATOM_nreverse = SYM("nreverse");
	final static IntegerTerm int_11378 = Integer(11378);
	final static SymbolTerm ATOM_poly_10 = SYM("poly_10");
	final static IntegerTerm int_105 = Integer(105);
	final static SymbolTerm ATOM_prover = SYM("prover");
	final static IntegerTerm int_6400 = Integer(6400);
	final static SymbolTerm ATOM_qsort = SYM("qsort");
	final static IntegerTerm int_8445 = Integer(8445);
	final static SymbolTerm ATOM_queens_8 = SYM("queens_8");
	final static IntegerTerm int_63 = Integer(63);
	final static SymbolTerm ATOM_query = SYM("query");
	final static IntegerTerm int_1219 = Integer(1219);
	final static SymbolTerm ATOM_reducer = SYM("reducer");
	final static IntegerTerm int_164 = Integer(164);
	final static SymbolTerm ATOM_sendmore = SYM("sendmore");
	final static IntegerTerm int_44 = Integer(44);
	final static SymbolTerm ATOM_simple_analyzer = SYM("simple_analyzer");
	final static IntegerTerm int_320 = Integer(320);
	final static SymbolTerm ATOM_tak = SYM("tak");
	final static IntegerTerm int_35 = Integer(35);
	final static SymbolTerm ATOM_zebra = SYM("zebra");
	final static IntegerTerm int_166 = Integer(166);

	public static Operation PRED_program_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_run::program_2_var, fail_0, fail_0, FILE_run::program_2_var, fail_0, fail_0);
	}

	private final static Operation program_2_var(Prolog m) {
		m.jtry2(null, FILE_run::program_2_var_1);
		return program_2_1(m);
	}

	private final static Operation program_2_var_1(Prolog m) {
		m.retry(null, FILE_run::program_2_var_2);
		return program_2_2(m);
	}

	private final static Operation program_2_var_2(Prolog m) {
		m.retry(null, FILE_run::program_2_var_3);
		return program_2_3(m);
	}

	private final static Operation program_2_var_3(Prolog m) {
		m.retry(null, FILE_run::program_2_var_4);
		return program_2_4(m);
	}

	private final static Operation program_2_var_4(Prolog m) {
		m.retry(null, FILE_run::program_2_var_5);
		return program_2_5(m);
	}

	private final static Operation program_2_var_5(Prolog m) {
		m.retry(null, FILE_run::program_2_var_6);
		return program_2_6(m);
	}

	private final static Operation program_2_var_6(Prolog m) {
		m.retry(null, FILE_run::program_2_var_7);
		return program_2_7(m);
	}

	private final static Operation program_2_var_7(Prolog m) {
		m.retry(null, FILE_run::program_2_var_8);
		return program_2_8(m);
	}

	private final static Operation program_2_var_8(Prolog m) {
		m.retry(null, FILE_run::program_2_var_9);
		return program_2_9(m);
	}

	private final static Operation program_2_var_9(Prolog m) {
		m.retry(null, FILE_run::program_2_var_10);
		return program_2_10(m);
	}

	private final static Operation program_2_var_10(Prolog m) {
		m.retry(null, FILE_run::program_2_var_11);
		return program_2_11(m);
	}

	private final static Operation program_2_var_11(Prolog m) {
		m.retry(null, FILE_run::program_2_var_12);
		return program_2_12(m);
	}

	private final static Operation program_2_var_12(Prolog m) {
		m.retry(null, FILE_run::program_2_var_13);
		return program_2_13(m);
	}

	private final static Operation program_2_var_13(Prolog m) {
		m.retry(null, FILE_run::program_2_var_14);
		return program_2_14(m);
	}

	private final static Operation program_2_var_14(Prolog m) {
		m.retry(null, FILE_run::program_2_var_15);
		return program_2_15(m);
	}

	private final static Operation program_2_var_15(Prolog m) {
		m.retry(null, FILE_run::program_2_var_16);
		return program_2_16(m);
	}

	private final static Operation program_2_var_16(Prolog m) {
		m.retry(null, FILE_run::program_2_var_17);
		return program_2_17(m);
	}

	private final static Operation program_2_var_17(Prolog m) {
		m.retry(null, FILE_run::program_2_var_18);
		return program_2_18(m);
	}

	private final static Operation program_2_var_18(Prolog m) {
		m.trust(null);
		return program_2_19(m);
	}

	private final static Operation program_2_1(Prolog m) {
		// program(boyer,8):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(boyer,8):-[]
		if (!PRED_program_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!int_8.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_2(Prolog m) {
		// program(browse,7):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(browse,7):-[]
		if (!ATOM_browse.unify(a1, m.trail))
			return m.fail();
		if (!int_7.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_3(Prolog m) {
		// program(chat_parser,46):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(chat_parser,46):-[]
		if (!ATOM_chat_parser.unify(a1, m.trail))
			return m.fail();
		if (!int_46.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_4(Prolog m) {
		// program(crypt,868):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(crypt,868):-[]
		if (!ATOM_crypt.unify(a1, m.trail))
			return m.fail();
		if (!int_868.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_5(Prolog m) {
		// program(fast_mu,4819):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(fast_mu,4819):-[]
		if (!ATOM_fast_mu.unify(a1, m.trail))
			return m.fail();
		if (!int_4819.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_6(Prolog m) {
		// program(flatten,8275):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(flatten,8275):-[]
		if (!ATOM_flatten.unify(a1, m.trail))
			return m.fail();
		if (!int_8275.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_7(Prolog m) {
		// program(meta_qsort,966):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(meta_qsort,966):-[]
		if (!ATOM_meta_qsort.unify(a1, m.trail))
			return m.fail();
		if (!int_966.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_8(Prolog m) {
		// program(mu,6827):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(mu,6827):-[]
		if (!ATOM_mu.unify(a1, m.trail))
			return m.fail();
		if (!int_6827.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_9(Prolog m) {
		// program(nreverse,11378):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(nreverse,11378):-[]
		if (!ATOM_nreverse.unify(a1, m.trail))
			return m.fail();
		if (!int_11378.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_10(Prolog m) {
		// program(poly_10,105):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(poly_10,105):-[]
		if (!ATOM_poly_10.unify(a1, m.trail))
			return m.fail();
		if (!int_105.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_11(Prolog m) {
		// program(prover,6400):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(prover,6400):-[]
		if (!ATOM_prover.unify(a1, m.trail))
			return m.fail();
		if (!int_6400.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_12(Prolog m) {
		// program(qsort,8445):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(qsort,8445):-[]
		if (!ATOM_qsort.unify(a1, m.trail))
			return m.fail();
		if (!int_8445.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_13(Prolog m) {
		// program(queens_8,63):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(queens_8,63):-[]
		if (!ATOM_queens_8.unify(a1, m.trail))
			return m.fail();
		if (!int_63.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_14(Prolog m) {
		// program(query,1219):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(query,1219):-[]
		if (!ATOM_query.unify(a1, m.trail))
			return m.fail();
		if (!int_1219.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_15(Prolog m) {
		// program(reducer,164):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(reducer,164):-[]
		if (!ATOM_reducer.unify(a1, m.trail))
			return m.fail();
		if (!int_164.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_16(Prolog m) {
		// program(sendmore,44):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(sendmore,44):-[]
		if (!ATOM_sendmore.unify(a1, m.trail))
			return m.fail();
		if (!int_44.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_17(Prolog m) {
		// program(simple_analyzer,320):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(simple_analyzer,320):-[]
		if (!ATOM_simple_analyzer.unify(a1, m.trail))
			return m.fail();
		if (!int_320.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_18(Prolog m) {
		// program(tak,35):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(tak,35):-[]
		if (!ATOM_tak.unify(a1, m.trail))
			return m.fail();
		if (!int_35.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation program_2_19(Prolog m) {
		// program(zebra,166):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// program(zebra,166):-[]
		if (!ATOM_zebra.unify(a1, m.trail))
			return m.fail();
		if (!int_166.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	/** PREDICATE: run_interleaved/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	final static SymbolTerm ATOM_user = SYM("user");
	final static SymbolTerm ATOM_rni = SYM("rni");
	private static final StructureTerm PRED_run_interleaved_1_s7 = S(":", ATOM_user, ATOM_rni);

	public static Operation PRED_run_interleaved_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// run_interleaved(A):-compile_programs,findall(B-C,program(C,B,A),D),phrase(seq_interleaved(D),E),seq_clause(E,F),retractall(rni),assert((rni:-F),G),garbage_collect,time(rni),erase(G)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		a1 = LARG[0];
		// run_interleaved(A):-[compile_programs,findall(B-C,user:program(C,B,A),D),phrase(seq_interleaved(D),E),seq_clause(E,F),retractall(user:rni),assert(user:(rni:-F),G),garbage_collect,time(rni),erase(G)]
		a2 = V(m);
		a3 = V(m);
		Term[] y1 = VA(a2, a3);
		a4 = S("-", y1);
		a5 = Closure( //
				Op((Prolog e) -> PRED_program_3_static_exec(e), VA(a3, a2, a1), null));
		a6 = V(m);
		Term[] y2 = VA(a6);
		a7 = S("seq_interleaved", y2);
		a8 = V(m);
		a9 = V(m);
		Term[] y3 = VA(ATOM_rni, a9);
		a10 = S(":-", y3);
		Term[] y4 = VA(ATOM_user, a10);
		a11 = S(":", y4);
		a12 = V(m);
		return //
		Op((Prolog e) -> PRED_compile_programs_0_static_exec(e), VA(), //
				Op((Prolog e) -> PRED_findall_3_static_exec(e), VA(a4, a5, a6), //
						Op((Prolog e) -> PRED_phrase_2_static_exec(e), VA(a7, a8), //
								Op((Prolog e) -> PRED_seq_clause_2_static_exec(e), VA(a8, a9), //
										Op((Prolog e) -> PRED_retractall_1_static_exec(e), VA(PRED_run_interleaved_1_s7), //
												Op((Prolog e) -> PRED_assert_2_static_exec(e), VA(a11, a12), //
														Op((Prolog e) -> PRED_garbage_collect_0_static_exec(e), VA(), //
																Op((Prolog e) -> PRED_time_1_static_exec(e), VA(ATOM_rni), //
																		Op((Prolog e) -> PRED_erase_1_static_exec(e), VA(a12), cont)))))))));
	}

	/** PREDICATE: seq_interleaved/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_seq_interleaved_3_s1 = SYM("[]");

	public static Operation PRED_seq_interleaved_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		m.setB0();
		return m.switch_on_term(FILE_run::seq_interleaved_3_var, FILE_run::seq_interleaved_3_2, FILE_run::seq_interleaved_3_2, FILE_run::seq_interleaved_3_var, FILE_run::seq_interleaved_3_2,
				FILE_run::seq_interleaved_3_2);
	}

	private final static Operation seq_interleaved_3_var(Prolog m) {
		m.jtry3(null, FILE_run::seq_interleaved_3_var_1);
		return seq_interleaved_3_1(m);
	}

	private final static Operation seq_interleaved_3_var_1(Prolog m) {
		m.trust(null);
		return seq_interleaved_3_2(m);
	}

	private final static Operation seq_interleaved_3_1(Prolog m) {
		// seq_interleaved([],A,B):-!,B=A
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// seq_interleaved([],A,B):-['$neck_cut','$unify'(B,A)]
		if (!PRED_seq_interleaved_3_s1.unify(a1, m.trail))
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

	private final static Operation seq_interleaved_3_2(Prolog m) {
		// seq_interleaved(A,B,C):-seq_interleaved(A,D,B,E),seq_interleaved(D,E,C)
		Term a1, a2, a3, a4, a5;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// seq_interleaved(A,B,C):-[seq_interleaved(A,D,B,E),seq_interleaved(D,E,C)]
		a4 = V(m);
		a5 = V(m);
		return //
		Op((Prolog e) -> PRED_seq_interleaved_4_static_exec(e), VA(a1, a4, a2, a5), //
				Op((Prolog e) -> PRED_seq_interleaved_3_static_exec(e), VA(a4, a5, a3), cont));
	}

	/** PREDICATE: seq_interleaved/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_seq_interleaved_4_s1 = SYM("[]");

	public static Operation PRED_seq_interleaved_4_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return seq_interleaved_4_top(m);
	}

	private final static Operation seq_interleaved_4_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_run::seq_interleaved_4_var, fail_0, fail_0, FILE_run::seq_interleaved_4_1, fail_0, FILE_run::seq_interleaved_4_lis);
	}

	private final static Operation seq_interleaved_4_var(Prolog m) {
		m.jtry4(null, FILE_run::seq_interleaved_4_var_1);
		return seq_interleaved_4_1(m);
	}

	private final static Operation seq_interleaved_4_var_1(Prolog m) {
		m.retry(null, FILE_run::seq_interleaved_4_var_2);
		return seq_interleaved_4_2(m);
	}

	private final static Operation seq_interleaved_4_var_2(Prolog m) {
		m.trust(null);
		return seq_interleaved_4_3(m);
	}

	private final static Operation seq_interleaved_4_lis(Prolog m) {
		m.jtry4(null, FILE_run::seq_interleaved_4_lis_1);
		return seq_interleaved_4_2(m);
	}

	private final static Operation seq_interleaved_4_lis_1(Prolog m) {
		m.trust(null);
		return seq_interleaved_4_3(m);
	}

	private final static Operation seq_interleaved_4_1(Prolog m) {
		// seq_interleaved([],[],A,A):-true
		Term a1, a2, a3, a4;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// seq_interleaved([],[],A,A):-[]
		if (!PRED_seq_interleaved_4_s1.unify(a1, m.trail))
			return m.fail();
		if (!PRED_seq_interleaved_4_s1.unify(a2, m.trail))
			return m.fail();
		if (!a3.unify(a4, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation seq_interleaved_4_2(Prolog m) {
		// seq_interleaved([1-A|B],C,D,E):-(!,F=D),F=[A|G],seq_interleaved(B,C,G,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// seq_interleaved([1-A|B],C,D,E):-['$neck_cut','$unify'(F,D),'$unify'(F,[A|G]),seq_interleaved(B,C,G,E)]
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
		a5 = a5.dref();
		a7 = V(m);
		if (!a5.unify(C("-", int_1, a7), m.trail)) {
			return m.fail();
		}
		//START inline expansion of $neck_cut
		m.neckCut();
		//END inline expansion
		a8 = V(m);
		//START inline expansion of $unify(a(8),a(3))
		if (!a8.unify(a3, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a9 = V(m);
		a10 = CONS(a7, a9);
		//START inline expansion of $unify(a(8),a(10))
		if (!a8.unify(a10, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a6;
		m.AREGS[1] = a2;
		m.AREGS[2] = a9;
		m.AREGS[3] = a4;
		m.cont = cont;
		return seq_interleaved_4_top(m);
	}

	private final static Operation seq_interleaved_4_3(Prolog m) {
		// seq_interleaved([A-B|C],[D-B|E],[B|F],G):-(D is A-1,H=F),seq_interleaved(C,E,H,G)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		a4 = m.AREGS[3];
		cont = m.cont;
		// seq_interleaved([A-B|C],[D-B|E],[B|F],G):-[D is A-1,'$unify'(H,F),seq_interleaved(C,E,H,G)]
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
		a5 = a5.dref();
		a7 = V(m);
		a8 = V(m);
		if (!a5.unify(C("-", a7, a8), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			a9 = argz[0];
			a10 = argz[1];
		} else if (a2.isVar()) {
			a9 = V(m);
			a10 = V(m);
			a2.bind(CONS(a9, a10), m.trail);
		} else {
			return m.fail();
		}
		a9 = a9.dref();
		a11 = V(m);
		if (!a9.unify(C("-", a11, a8), m.trail)) {
			return m.fail();
		}
		a3 = a3.dref();
		if (a3.isCons()) {
			Term[] argz = VA(a3.car(), a3.cdr());
			if (!a8.unify(argz[0], m.trail))
				return m.fail();
			a12 = argz[1];
		} else if (a3.isVar()) {
			a12 = V(m);
			a3.bind(CONS(a8, a12), m.trail);
		} else {
			return m.fail();
		}
		Term[] y1 = VA(a7, int_1);
		a13 = S("-", y1);
		//START inline expansion of a(11)is a(13)
		if (!a11.unify(Arithmetic.evaluate(a13), m.trail)) {
			return m.fail();
		}
		//END inline expansion
		a14 = V(m);
		//START inline expansion of $unify(a(14),a(12))
		if (!a14.unify(a12, m.trail)) {
			return m.fail();
		}
		//END inline expansion
		m.AREGS[0] = a6;
		m.AREGS[1] = a10;
		m.AREGS[2] = a14;
		m.AREGS[3] = a4;
		m.cont = cont;
		return seq_interleaved_4_top(m);
	}

	/** PREDICATE: seq_clause/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_seq_clause_2_s1 = SYM("[]");

	public static Operation PRED_seq_clause_2_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return seq_clause_2_top(m);
	}

	private final static Operation seq_clause_2_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_run::seq_clause_2_var, fail_0, fail_0, FILE_run::seq_clause_2_1, fail_0, FILE_run::seq_clause_2_2);
	}

	private final static Operation seq_clause_2_var(Prolog m) {
		m.jtry2(null, FILE_run::seq_clause_2_var_1);
		return seq_clause_2_1(m);
	}

	private final static Operation seq_clause_2_var_1(Prolog m) {
		m.trust(null);
		return seq_clause_2_2(m);
	}

	private final static Operation seq_clause_2_1(Prolog m) {
		// seq_clause([],true):-true
		Term a1, a2;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// seq_clause([],true):-[]
		if (!PRED_seq_clause_2_s1.unify(a1, m.trail))
			return m.fail();
		if (!Prolog.True.unify(a2, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation seq_clause_2_2(Prolog m) {
		// seq_clause([A|B],(\+ \+A:top,C)):-seq_clause(B,C)
		Term a1, a2, a3, a4, a5, a6, a7, a8;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		cont = m.cont;
		// seq_clause([A|B],(\+ \+A:top,C)):-[seq_clause(B,C)]
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
		if (!a2.unify(C(",", a5, a6), m.trail)) {
			return m.fail();
		}
		a5 = a5.dref();
		a7 = V(m);
		if (!a5.unify(C("\\+", a7), m.trail)) {
			return m.fail();
		}
		a7 = a7.dref();
		a8 = V(m);
		if (!a7.unify(C("\\+", a8), m.trail)) {
			return m.fail();
		}
		a8 = a8.dref();
		if (!a8.unify(C(":", a3, ATOM_top), m.trail)) {
			return m.fail();
		}
		m.AREGS[0] = a4;
		m.AREGS[1] = a6;
		m.cont = cont;
		return seq_clause_2_top(m);
	}

	/** PREDICATE: run_non_interleaved/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/

	public static Operation PRED_run_non_interleaved_1_static_exec(Prolog m) {
		Operation cont = m.cont;
		Term[] LARG = m.AREGS;
		// run_non_interleaved(A):-compile_programs,findall(B-C,program(C,B,A),D),phrase(seq_non_interleaved(D),E),seq_clause(E,F),assert((rni:-F),G),garbage_collect,time(rni),erase(G)
		m.setB0();
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
		a1 = LARG[0];
		// run_non_interleaved(A):-[compile_programs,findall(B-C,user:program(C,B,A),D),phrase(seq_non_interleaved(D),E),seq_clause(E,F),assert(user:(rni:-F),G),garbage_collect,time(rni),erase(G)]
		a2 = V(m);
		a3 = V(m);
		Term[] y1 = VA(a2, a3);
		a4 = S("-", y1);
		a5 = Closure( //
				Op((Prolog e) -> PRED_program_3_static_exec(e), VA(a3, a2, a1), null));
		a6 = V(m);
		Term[] y2 = VA(a6);
		a7 = S("seq_non_interleaved", y2);
		a8 = V(m);
		a9 = V(m);
		Term[] y3 = VA(ATOM_rni, a9);
		a10 = S(":-", y3);
		Term[] y4 = VA(ATOM_user, a10);
		a11 = S(":", y4);
		a12 = V(m);
		return //
		Op((Prolog e) -> PRED_compile_programs_0_static_exec(e), VA(), //
				Op((Prolog e) -> PRED_findall_3_static_exec(e), VA(a4, a5, a6), //
						Op((Prolog e) -> PRED_phrase_2_static_exec(e), VA(a7, a8), //
								Op((Prolog e) -> PRED_seq_clause_2_static_exec(e), VA(a8, a9), //
										Op((Prolog e) -> PRED_assert_2_static_exec(e), VA(a11, a12), //
												Op((Prolog e) -> PRED_garbage_collect_0_static_exec(e), VA(), //
														Op((Prolog e) -> PRED_time_1_static_exec(e), VA(ATOM_rni), //
																Op((Prolog e) -> PRED_erase_1_static_exec(e), VA(a12), cont))))))));
	}

	/** PREDICATE: seq_non_interleaved/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_seq_non_interleaved_3_s1 = SYM("[]");

	public static Operation PRED_seq_non_interleaved_3_static_exec(Prolog m) {
		Operation cont = m.cont;
		m.cont = cont;
		return seq_non_interleaved_3_top(m);
	}

	private final static Operation seq_non_interleaved_3_top(Prolog m) {
		m.setB0();
		return m.switch_on_term(FILE_run::seq_non_interleaved_3_var, fail_0, fail_0, FILE_run::seq_non_interleaved_3_1, fail_0, FILE_run::seq_non_interleaved_3_lis);
	}

	private final static Operation seq_non_interleaved_3_var(Prolog m) {
		m.jtry3(null, FILE_run::seq_non_interleaved_3_var_1);
		return seq_non_interleaved_3_1(m);
	}

	private final static Operation seq_non_interleaved_3_var_1(Prolog m) {
		m.retry(null, FILE_run::seq_non_interleaved_3_var_2);
		return seq_non_interleaved_3_2(m);
	}

	private final static Operation seq_non_interleaved_3_var_2(Prolog m) {
		m.trust(null);
		return seq_non_interleaved_3_3(m);
	}

	private final static Operation seq_non_interleaved_3_lis(Prolog m) {
		m.jtry3(null, FILE_run::seq_non_interleaved_3_lis_1);
		return seq_non_interleaved_3_2(m);
	}

	private final static Operation seq_non_interleaved_3_lis_1(Prolog m) {
		m.trust(null);
		return seq_non_interleaved_3_3(m);
	}

	private final static Operation seq_non_interleaved_3_1(Prolog m) {
		// seq_non_interleaved([],A,A):-true
		Term a1, a2, a3;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// seq_non_interleaved([],A,A):-[]
		if (!PRED_seq_non_interleaved_3_s1.unify(a1, m.trail))
			return m.fail();
		if (!a2.unify(a3, m.trail))
			return m.fail();
		return cont;
	}

	private final static Operation seq_non_interleaved_3_2(Prolog m) {
		// seq_non_interleaved([0-A|B],C,D):-(!,E=C),seq_non_interleaved(B,E,D)
		Term a1, a2, a3, a4, a5, a6;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// seq_non_interleaved([0-A|B],C,D):-['$neck_cut','$unify'(E,C),seq_non_interleaved(B,E,D)]
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
		if (!a4.unify(C("-", int_0, V(m)), m.trail)) {
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
		return seq_non_interleaved_3_top(m);
	}

	private final static Operation seq_non_interleaved_3_3(Prolog m) {
		// seq_non_interleaved([A-B|C],[B|D],E):-(F is A-1,G=D),seq_non_interleaved([F-B|C],G,E)
		Term a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
		Operation cont;
		a1 = m.AREGS[0];
		a2 = m.AREGS[1];
		a3 = m.AREGS[2];
		cont = m.cont;
		// seq_non_interleaved([A-B|C],[B|D],E):-[F is A-1,'$unify'(G,D),seq_non_interleaved([F-B|C],G,E)]
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
		a7 = V(m);
		if (!a4.unify(C("-", a6, a7), m.trail)) {
			return m.fail();
		}
		a2 = a2.dref();
		if (a2.isCons()) {
			Term[] argz = VA(a2.car(), a2.cdr());
			if (!a7.unify(argz[0], m.trail))
				return m.fail();
			a8 = argz[1];
		} else if (a2.isVar()) {
			a8 = V(m);
			a2.bind(CONS(a7, a8), m.trail);
		} else {
			return m.fail();
		}
		a9 = V(m);
		Term[] y1 = VA(a6, int_1);
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
		Term[] y2 = VA(a9, a7);
		a12 = S("-", y2);
		a13 = CONS(a12, a5);
		m.AREGS[0] = a13;
		m.AREGS[1] = a11;
		m.AREGS[2] = a3;
		m.cont = cont;
		return seq_non_interleaved_3_top(m);
	}

	/** PREDICATE: $init/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/run.pl
	*/
	private static final SymbolTerm PRED_$init_0_s1 = SYM("user");
	private static final StructureTerm PRED_$init_0_s6 = S("/", ATOM_rni, int_0);

	public static Operation PRED_$init_0_static_exec(Prolog m) {
		Operation cont = m.cont;
		// '$init':-'$new_indexing_hash'(user,rni/0,A)
		m.setB0();
		// '$init':-['$new_indexing_hash'(user,rni/0,A)]
		return //
		Op((Prolog e) -> PRED_$new_indexing_hash_3_static_exec(e), VA(PRED_$init_0_s1, PRED_$init_0_s6, V(m)), cont);
	}

	static {
		loadPreds();
	}

	static public void loadPreds() {
		PredTable.registerBuiltin("run", 1, FILE_run::PRED_run_1_static_exec);
		PredTable.registerBuiltin("run", 2, FILE_run::PRED_run_2_static_exec);
		PredTable.registerBuiltin("compile_programs", 0, FILE_run::PRED_compile_programs_0_static_exec);
		PredTable.registerBuiltin("run_program", 4, FILE_run::PRED_run_program_4_static_exec);
		PredTable.registerBuiltin("add", 3, FILE_run::PRED_add_3_static_exec);
		PredTable.registerBuiltin("get_performance_stats", 2, FILE_run::PRED_get_performance_stats_2_static_exec);
		PredTable.registerBuiltin("ntimes", 4, FILE_run::PRED_ntimes_4_static_exec);
		PredTable.registerBuiltin("ntimes", 2, FILE_run::PRED_ntimes_2_static_exec);
		PredTable.registerBuiltin("ntimes_dummy", 1, FILE_run::PRED_ntimes_dummy_1_static_exec);
		PredTable.registerBuiltin("not_not_top", 1, FILE_run::PRED_not_not_top_1_static_exec);
		PredTable.registerBuiltin("not_top", 1, FILE_run::PRED_not_top_1_static_exec);
		PredTable.registerBuiltin("not_not_dummy", 0, FILE_run::PRED_not_not_dummy_0_static_exec);
		PredTable.registerBuiltin("not_dummy", 0, FILE_run::PRED_not_dummy_0_static_exec);
		PredTable.registerBuiltin("dummy", 0, FILE_run::PRED_dummy_0_static_exec);
		PredTable.registerBuiltin("tune_counts", 0, FILE_run::PRED_tune_counts_0_static_exec);
		PredTable.registerBuiltin("tune_count", 2, FILE_run::PRED_tune_count_2_static_exec);
		PredTable.registerBuiltin("program", 3, FILE_run::PRED_program_3_static_exec);
		PredTable.registerBuiltin("program", 2, FILE_run::PRED_program_2_static_exec);
		PredTable.registerBuiltin("run_interleaved", 1, FILE_run::PRED_run_interleaved_1_static_exec);
		PredTable.registerBuiltin("seq_interleaved", 3, FILE_run::PRED_seq_interleaved_3_static_exec);
		PredTable.registerBuiltin("seq_interleaved", 4, FILE_run::PRED_seq_interleaved_4_static_exec);
		PredTable.registerBuiltin("seq_clause", 2, FILE_run::PRED_seq_clause_2_static_exec);
		PredTable.registerBuiltin("run_non_interleaved", 1, FILE_run::PRED_run_non_interleaved_1_static_exec);
		PredTable.registerBuiltin("seq_non_interleaved", 3, FILE_run::PRED_seq_non_interleaved_3_static_exec);
		PredTable.registerBuiltin("$init", 0, FILE_run::PRED_$init_0_static_exec);
	}
}
