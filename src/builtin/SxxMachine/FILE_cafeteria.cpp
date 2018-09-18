using namespace std;

#include "FILE_cafeteria.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "FILE_builtins.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine
{
//	import static SxxMachine.FILE_builtins.PRED_$call_internal_5_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$clause_internal_5_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$greater_than_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$inequality_of_term_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$meta_call_5_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$new_internal_database_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$term_to_predicateindicator_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_abort_0_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_clause_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_consult_stream_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_current_prolog_flag_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_illarg_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_numbervars_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_on_exception_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_read_line_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_read_with_variables_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_repeat_0_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_retract_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_retractall_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_set_prolog_flag_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_statistics_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_sub_atom_5_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_write_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_write_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_writeq_1_static_exec;
//	import static SxxMachine.FILE_io.PRED_close_1_static_exec;
//	import static SxxMachine.FILE_io.PRED_flush_output_0_static_exec;
//	import static SxxMachine.FILE_io.PRED_nl_1_static_exec;
//	import static SxxMachine.FILE_io.PRED_open_3_static_exec;
//	import static SxxMachine.FILE_io.PRED_stream_property_2_static_exec;
//	import static SxxMachine.FILE_io.PRED_tab_1_static_exec;
//	import static SxxMachine.FILE_swi_supp.PRED_context_module_1_static_exec;
//	import static SxxMachine.FILE_swi_supp.PRED_typein_module_1_static_exec;
//	import static SxxMachine.Failure.fail_0;
//	import static SxxMachine.bootpreds.PRED_$builtin_member_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_$fast_write_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_$fast_write_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_$get_current_B_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_$print_stack_trace_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_$write_toString_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_atom_concat_3_static_exec;
//	import static SxxMachine.bootpreds.PRED_flush_output_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
//	import static SxxMachine.bootpreds.PRED_hash_keys_2_static_exec;
SymbolTerm *const FILE_cafeteria::PRED_cafeteria_0_s1 = SYM("error");
SymbolTerm *const FILE_cafeteria::ATOM_end_of_file = SYM("end_of_file");
SymbolTerm *const FILE_cafeteria::ATOM_bye = SYM("bye");

	Operation FILE_cafeteria::PRED_cafeteria_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// cafeteria:-'$cafeteria_init',repeat,'$toplvel_loop',on_exception(A,'$cafeteria'(B),print_message(error,A)),B==end_of_file,!,nl,'$fast_write'(bye),nl
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3, p4, p5, p6, p7, p8;
	// cafeteria:-['$get_level'(A),'$cafeteria_init',repeat,'$toplvel_loop',on_exception(B,'SxxMachine':'$cafeteria'(C),'SxxMachine':print_message(error,B)),'$equality_of_term'(C,end_of_file),'$cut'(A),nl,'$fast_write'(bye),nl]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a2 = V(m);
		a3 = V(m);
		a4 = Closure(Op([&] (Prolog *e)
		{
		PRED_$cafeteria_1_static_exec(e);
		}, VA({a3}), nullptr));
		a5 = Closure(Op([&] (Prolog *e)
		{
		PRED_print_message_2_static_exec(e);
		}, VA({PRED_cafeteria_0_s1, a2}), nullptr));
		return Op([&] (Prolog *e)
		{
		PRED_$cafeteria_init_0_static_exec(e);
		}, VA(), Op([&] (Prolog *e)
		{
		PRED_repeat_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$toplvel_loop_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_on_exception_3_static_exec(e);
	}, VA({a2, a4, a5}), Op([&] (Prolog *e)
	{
		PRED_$equality_of_term_2_static_exec(e);
	}, VA({a3, ATOM_end_of_file}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_bye}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont)))))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s1 = SYM("SxxMachine");
SymbolTerm *const FILE_cafeteria::ATOM_$0024leap_flag = SYM("$leap_flag");
IntegerTerm *const FILE_cafeteria::int_1 = optional<int>(1);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s6 = S("/", ATOM_$0024leap_flag, int_1);
SymbolTerm *const FILE_cafeteria::ATOM_$0024current_spypoint = SYM("$current_spypoint");
IntegerTerm *const FILE_cafeteria::int_3 = optional<int>(3);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s10 = S("/", ATOM_$0024current_spypoint, int_3);
SymbolTerm *const FILE_cafeteria::ATOM_$0024current_leash = SYM("$current_leash");
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s13 = S("/", ATOM_$0024current_leash, int_1);
SymbolTerm *const FILE_cafeteria::ATOM_no = SYM("no");
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s23 = S("$leap_flag", ATOM_no);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s25 = S(":", PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s23);
SymbolTerm *const FILE_cafeteria::ATOM_call = SYM("call");
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s28 = S("$current_leash", ATOM_call);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s30 = S(":", PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s28);
SymbolTerm *const FILE_cafeteria::ATOM_exit = SYM("exit");
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s33 = S("$current_leash", ATOM_exit);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s35 = S(":", PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s33);
SymbolTerm *const FILE_cafeteria::ATOM_redo = SYM("redo");
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s38 = S("$current_leash", ATOM_redo);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s40 = S(":", PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s38);
SymbolTerm *const FILE_cafeteria::ATOM_fail = SYM("fail");
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s43 = S("$current_leash", ATOM_fail);
StructureTerm *const FILE_cafeteria::PRED_$cafeteria_init_0_s45 = S(":", PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s43);

	Operation FILE_cafeteria::PRED_$cafeteria_init_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$cafeteria_init':-'$new_indexing_hash'('SxxMachine','$leap_flag'/1,A),'$new_indexing_hash'('SxxMachine','$current_spypoint'/3,B),'$new_indexing_hash'('SxxMachine','$current_leash'/1,C),retractall('$leap_flag'(D)),retractall('$current_leash'(E)),retractall('$current_spypoint'(F,G,H)),retractall('$consulted_file'(I)),retractall('$consulted_package'(J)),retractall('$consulted_predicate'(K,L,M)),assertz('$leap_flag'(no)),assertz('$current_leash'(call)),assertz('$current_leash'(exit)),assertz('$current_leash'(redo)),assertz('$current_leash'(fail)),!
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14;
	// '$cafeteria_init':-['$get_level'(A),'$new_indexing_hash'('SxxMachine','$leap_flag'/1,B),'$new_indexing_hash'('SxxMachine','$current_spypoint'/3,C),'$new_indexing_hash'('SxxMachine','$current_leash'/1,D),retractall('SxxMachine':'$leap_flag'(E)),retractall('SxxMachine':'$current_leash'(F)),retractall('SxxMachine':'$current_spypoint'(G,H,I)),retractall('SxxMachine':'$consulted_file'(J)),retractall('SxxMachine':'$consulted_package'(K)),retractall('SxxMachine':'$consulted_predicate'(L,M,N)),assertz('SxxMachine':'$leap_flag'(no)),assertz('SxxMachine':'$current_leash'(call)),assertz('SxxMachine':'$current_leash'(exit)),assertz('SxxMachine':'$current_leash'(redo)),assertz('SxxMachine':'$current_leash'(fail)),'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({V(m)});
		a2 = S("$leap_flag", y1);
		std::vector<Term*> y2 = VA({PRED_$cafeteria_init_0_s1, a2});
		a3 = S(":", y2);
		std::vector<Term*> y3 = VA({V(m)});
		a4 = S("$current_leash", y3);
		std::vector<Term*> y4 = VA({PRED_$cafeteria_init_0_s1, a4});
		a5 = S(":", y4);
		std::vector<Term*> y5 = VA({V(m), V(m), V(m)});
		a6 = S("$current_spypoint", y5);
		std::vector<Term*> y6 = VA({PRED_$cafeteria_init_0_s1, a6});
		a7 = S(":", y6);
		std::vector<Term*> y7 = VA({V(m)});
		a8 = S("$consulted_file", y7);
		std::vector<Term*> y8 = VA({PRED_$cafeteria_init_0_s1, a8});
		a9 = S(":", y8);
		std::vector<Term*> y9 = VA({V(m)});
		a10 = S("$consulted_package", y9);
		std::vector<Term*> y10 = VA({PRED_$cafeteria_init_0_s1, a10});
		a11 = S(":", y10);
		std::vector<Term*> y11 = VA({V(m), V(m), V(m)});
		a12 = S("$consulted_predicate", y11);
		std::vector<Term*> y12 = VA({PRED_$cafeteria_init_0_s1, a12});
		a13 = S(":", y12);
		return Op([&] (Prolog *e)
		{
		PRED_$new_indexing_hash_3_static_exec(e);
		}, VA({PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s6, V(m)}), Op([&] (Prolog *e)
		{
		PRED_$new_indexing_hash_3_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s10, V(m)}), Op([&] (Prolog *e)
	{
		PRED_$new_indexing_hash_3_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s1, PRED_$cafeteria_init_0_s13, V(m)}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a5}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a7}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a9}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a11}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a13}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s25}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s30}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s35}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s40}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$cafeteria_init_0_s45}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), cont)))))))))))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s1 = SYM("off");
SymbolTerm *const FILE_cafeteria::ATOM_info = SYM("info");
SymbolTerm *const FILE_cafeteria::ATOM_debug = SYM("debug");
ListTerm *const FILE_cafeteria::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s5 = CONS(ATOM_debug, Prolog::Nil);

	Operation FILE_cafeteria::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_cafeteria::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_1(m);
	}

	Operation FILE_cafeteria::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_2(m);
	}

	Operation FILE_cafeteria::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_1(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-A==off,!,true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-['$get_level'(B),'$equality_of_term'(A,off),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1->dref();
		if (!a1->equalsTerm(PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_2(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-print_message(info,[debug])
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-[print_message(info,[debug])]
		return Op([&] (Prolog *e)
		{
		PRED_print_message_2_static_exec(e);
		}, VA({ATOM_info, PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s5}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s1 = SYM("user");

	Operation FILE_cafeteria::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_cafeteria::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_1(m);
	}

	Operation FILE_cafeteria::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_2(m);
	}

	Operation FILE_cafeteria::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_1(Prolog *m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-A==user,!,'$fast_write'(A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-['$get_level'(B),'$equality_of_term'(A,user),'$cut'(B),'$fast_write'(A)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1->dref();
		if (!a1->equalsTerm(PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
		}, VA({a1}), cont);
	}

	Operation FILE_cafeteria::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_2(Prolog *m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-'$fast_write'(A)
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A):-['$fast_write'(A)]
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
		}, VA({a1}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$toplvel_loop_0_s1 = SYM("debug");
SymbolTerm *const FILE_cafeteria::ATOM_$007C$0020$003F$002D$0020 = SYM("| ?- ");

	Operation FILE_cafeteria::PRED_$toplvel_loop_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$toplvel_loop':-current_prolog_flag(debug,A),typein_module(B),!,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(B),'$fast_write'('| ?- '),flush_output
		m->setB0();
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3, p4, p5, p6;
	// '$toplvel_loop':-['$get_level'(A),current_prolog_flag(debug,B),typein_module(C),'$cut'(A),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(B),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(C),'$fast_write'('| ?- '),flush_output]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a2 = V(m);
		a3 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_current_prolog_flag_2_static_exec(e);
		}, VA({PRED_$toplvel_loop_0_s1, a2}), Op([&] (Prolog *e)
		{
		PRED_typein_module_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), Op([&] (Prolog *e)
	{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$007C$0020$003F$002D$0020}), Op([&] (Prolog *e)
	{
		PRED_flush_output_0_static_exec(e);
	}, VA(), cont)))))));
	}

	Operation FILE_cafeteria::PRED_$cafeteria_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$cafeteria'(A):-read_with_variables(A,B),'$process_order'(A,B)
		m->setB0();
		 Term *a1, *a2;
		Operation p1;
		a1 = LARG[0];
	// '$cafeteria'(A):-[read_with_variables(A,B),'$process_order'(A,B)]
		a2 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_read_with_variables_2_static_exec(e);
		}, VA({a1, a2}), Op([&] (Prolog *e)
		{
		PRED_$process_order_2_static_exec(e);
	}, VA({a1, a2}), cont));
	}

SymbolTerm *const FILE_cafeteria::PRED_$process_order_2_s1 = SYM("var");
SymbolTerm *const FILE_cafeteria::ATOM_yes = SYM("yes");

	Operation FILE_cafeteria::PRED_$process_order_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$process_order_2_var, FILE_cafeteria::$process_order_2_int, FILE_cafeteria::$process_order_2_int, FILE_cafeteria::$process_order_2_con, FILE_cafeteria::$process_order_2_int, FILE_cafeteria::$process_order_2_lis);
	}

	Operation FILE_cafeteria::$process_order_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$process_order_2_var_1);
		return $process_order_2_1(m);
	}

	Operation FILE_cafeteria::$process_order_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_var_2);
		return $process_order_2_2(m);
	}

	Operation FILE_cafeteria::$process_order_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_var_3);
		return $process_order_2_3(m);
	}

	Operation FILE_cafeteria::$process_order_2_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_var_4);
		return $process_order_2_4(m);
	}

	Operation FILE_cafeteria::$process_order_2_var_4(Prolog *m)
	{
		m->trust(nullptr);
		return $process_order_2_5(m);
	}

	Operation FILE_cafeteria::$process_order_2_int(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$process_order_2_int_1);
		return $process_order_2_1(m);
	}

	Operation FILE_cafeteria::$process_order_2_int_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_int_2);
		return $process_order_2_4(m);
	}

	Operation FILE_cafeteria::$process_order_2_int_2(Prolog *m)
	{
		m->trust(nullptr);
		return $process_order_2_5(m);
	}

	Operation FILE_cafeteria::$process_order_2_con(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$process_order_2_con_1);
		return $process_order_2_1(m);
	}

	Operation FILE_cafeteria::$process_order_2_con_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_con_2);
		return $process_order_2_2(m);
	}

	Operation FILE_cafeteria::$process_order_2_con_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_con_3);
		return $process_order_2_4(m);
	}

	Operation FILE_cafeteria::$process_order_2_con_3(Prolog *m)
	{
		m->trust(nullptr);
		return $process_order_2_5(m);
	}

	Operation FILE_cafeteria::$process_order_2_lis(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$process_order_2_lis_1);
		return $process_order_2_1(m);
	}

	Operation FILE_cafeteria::$process_order_2_lis_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_lis_2);
		return $process_order_2_3(m);
	}

	Operation FILE_cafeteria::$process_order_2_lis_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$process_order_2_lis_3);
		return $process_order_2_4(m);
	}

	Operation FILE_cafeteria::$process_order_2_lis_3(Prolog *m)
	{
		m->trust(nullptr);
		return $process_order_2_5(m);
	}

	Operation FILE_cafeteria::$process_order_2_1(Prolog *m)
	{
	// '$process_order'(A,B):-var(A),!,illarg(var,(?-A),1)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$process_order'(A,B):-['$get_level'(C),var(A),'$cut'(C),illarg(var,(?-A),1)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if (!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({a1});
		a4 = S("?-", y1);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_$process_order_2_s1, a4, int_1}), cont);
	}

	Operation FILE_cafeteria::$process_order_2_2(Prolog *m)
	{
	// '$process_order'(end_of_file,A):-!
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$process_order'(end_of_file,A):-['$neck_cut']
		if (!ATOM_end_of_file->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$process_order_2_3(Prolog *m)
	{
	// '$process_order'([A|B],C):-!,consult([A|B])
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$process_order'([A|B],C):-['$neck_cut',consult([A|B])]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[0];
			a4 = argz[1];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		}
		else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a5 = CONS(a3, a4);
		return Op([&] (Prolog *e)
		{
		PRED_consult_1_static_exec(e);
		}, VA({a5}), cont);
	}

	Operation FILE_cafeteria::$process_order_2_4(Prolog *m)
	{
	// '$process_order'(A,B):-context_module(C),current_prolog_flag(debug,D),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,C,D),nl,'$rm_redundant_vars'(B,E),'$give_answers_with_prompt'(E),!,'$fast_write'(yes),nl
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2, p3, p4, p5, p6, p7, p8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$process_order'(A,B):-['$get_level'(C),context_module(D),current_prolog_flag(debug,E),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,D,E),nl,'$rm_redundant_vars'(B,F),'$give_answers_with_prompt'(F),'$cut'(C),'$fast_write'(yes),nl]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_context_module_1_static_exec(e);
		}, VA({a4}), Op([&] (Prolog *e)
		{
		PRED_current_prolog_flag_2_static_exec(e);
	}, VA({ATOM_debug, a5}), Op([&] (Prolog *e)
	{
		PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec(e);
	}, VA({a1, a4, a5}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$rm_redundant_vars_2_static_exec(e);
	}, VA({a2, a6}), Op([&] (Prolog *e)
	{
		PRED_$give_answers_with_prompt_1_static_exec(e);
	}, VA({a6}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_yes}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont)))))))));
	}

	Operation FILE_cafeteria::$process_order_2_5(Prolog *m)
	{
	// '$process_order'(A,B):-nl,'$fast_write'(no),nl
		 Term *a1, *a2;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$process_order'(A,B):-[nl,'$fast_write'(no),nl]
		return Op([&] (Prolog *e)
		{
		PRED_nl_0_static_exec(e);
		}, VA(), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_no}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont)));
	}

SymbolTerm *const FILE_cafeteria::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_s1 = SYM("off");

	Operation FILE_cafeteria::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_cafeteria::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_1(m);
	}

	Operation FILE_cafeteria::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_2(m);
	}

	Operation FILE_cafeteria::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_1(Prolog *m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-C==off,!,call(B:A)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-['$get_level'(D),'$equality_of_term'(C,off),'$cut'(D),call(B:A)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(3),s(1))
		a3 = a3->dref();
		if (!a3->equalsTerm(PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({a2, a1});
		a5 = S(":", y1);
		return Op([&] (Prolog *e)
		{
		PRED_call_1_static_exec(e);
		}, VA({a5}), cont);
	}

	Operation FILE_cafeteria::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_2(Prolog *m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-'$trace_goal'(B:A)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-['$trace_goal'(B:A)]
		std::vector<Term*> y1 = VA({a2, a1});
		a4 = S(":", y1);
		return Op([&] (Prolog *e)
		{
		PRED_$trace_goal_1_static_exec(e);
		}, VA({a4}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$rm_redundant_vars_2_s1 = SYM("[]");
SymbolTerm *const FILE_cafeteria::ATOM__ = SYM("_");

	Operation FILE_cafeteria::PRED_$rm_redundant_vars_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return $rm_redundant_vars_2_top(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$rm_redundant_vars_2_var, fail_0, fail_0, FILE_cafeteria::$rm_redundant_vars_2_1, fail_0, FILE_cafeteria::$rm_redundant_vars_2_lis);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$rm_redundant_vars_2_var_1);
		return $rm_redundant_vars_2_1(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$rm_redundant_vars_2_var_2);
		return $rm_redundant_vars_2_2(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return $rm_redundant_vars_2_3(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_lis(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$rm_redundant_vars_2_lis_1);
		return $rm_redundant_vars_2_2(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_lis_1(Prolog *m)
	{
		m->trust(nullptr);
		return $rm_redundant_vars_2_3(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_1(Prolog *m)
	{
	// '$rm_redundant_vars'([],[]):-!
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$rm_redundant_vars'([],[]):-['$neck_cut']
		if (!PRED_$rm_redundant_vars_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!PRED_$rm_redundant_vars_2_s1->unify(a2, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_2(Prolog *m)
	{
	// '$rm_redundant_vars'(['_'=A|B],C):-!,'$rm_redundant_vars'(B,C)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$rm_redundant_vars'(['_'=A|B],C):-['$neck_cut','$rm_redundant_vars'(B,C)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[0];
			a4 = argz[1];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		}
		else
		{
			return m->fail();
		}
		a3 = a3->dref();
			if (!a3->unify(C("=", ATOM__, V(m)), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->cont = cont;
		return $rm_redundant_vars_2_top(m);
	}

	Operation FILE_cafeteria::$rm_redundant_vars_2_3(Prolog *m)
	{
	// '$rm_redundant_vars'([A|B],[A|C]):-'$rm_redundant_vars'(B,C)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$rm_redundant_vars'([A|B],[A|C]):-['$rm_redundant_vars'(B,C)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[0];
			a4 = argz[1];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		}
		else
		{
			return m->fail();
		}
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			if (!a3->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a5 = argz[1];
		}
		else if (a2->isVar())
		{
			a5 = V(m);
			 a2->bind(CONS(a3, a5), m->trail);
		}
		else
		{
			return m->fail();
		}
		m->AREGS[0] = a4;
		m->AREGS[1] = a5;
		m->cont = cont;
		return $rm_redundant_vars_2_top(m);
	}

SymbolTerm *const FILE_cafeteria::PRED_$give_answers_with_prompt_1_s1 = SYM("[]");
SymbolTerm *const FILE_cafeteria::ATOM_$0020$003F$0020 = SYM(" ? ");
IntegerTerm *const FILE_cafeteria::int_59 = optional<int>(59);
ListTerm *const FILE_cafeteria::PRED_$give_answers_with_prompt_1_s4 = CONS(int_59, PRED_$give_answers_with_prompt_1_s1);

	Operation FILE_cafeteria::PRED_$give_answers_with_prompt_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$give_answers_with_prompt_1_var, FILE_cafeteria::$give_answers_with_prompt_1_2, FILE_cafeteria::$give_answers_with_prompt_1_2, FILE_cafeteria::$give_answers_with_prompt_1_var, FILE_cafeteria::$give_answers_with_prompt_1_2, FILE_cafeteria::$give_answers_with_prompt_1_2);
	}

	Operation FILE_cafeteria::$give_answers_with_prompt_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$give_answers_with_prompt_1_var_1);
		return $give_answers_with_prompt_1_1(m);
	}

	Operation FILE_cafeteria::$give_answers_with_prompt_1_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return $give_answers_with_prompt_1_2(m);
	}

	Operation FILE_cafeteria::$give_answers_with_prompt_1_1(Prolog *m)
	{
	// '$give_answers_with_prompt'([]):-!
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$give_answers_with_prompt'([]):-['$neck_cut']
		if (!PRED_$give_answers_with_prompt_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$give_answers_with_prompt_1_2(Prolog *m)
	{
	// '$give_answers_with_prompt'(A):-'$give_an_answer'(A),'$fast_write'(' ? '),flush_output,read_line(B),B\==[59],nl
		 Term *a1, *a2;
		Operation p1, p2, p3, p4, p5;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$give_answers_with_prompt'(A):-['$give_an_answer'(A),'$fast_write'(' ? '),flush_output,read_line(B),'$inequality_of_term'(B,[59]),nl]
		a2 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_$give_an_answer_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$0020$003F$0020}), Op([&] (Prolog *e)
	{
		PRED_flush_output_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_read_line_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_$inequality_of_term_2_static_exec(e);
	}, VA({a2, PRED_$give_answers_with_prompt_1_s4}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$give_an_answer_1_s1 = SYM("[]");
SymbolTerm *const FILE_cafeteria::ATOM_$002C = SYM(",");

	Operation FILE_cafeteria::PRED_$give_an_answer_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$give_an_answer_1_var, fail_0, fail_0, FILE_cafeteria::$give_an_answer_1_1, fail_0, FILE_cafeteria::$give_an_answer_1_lis);
	}

	Operation FILE_cafeteria::$give_an_answer_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$give_an_answer_1_var_1);
		return $give_an_answer_1_1(m);
	}

	Operation FILE_cafeteria::$give_an_answer_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$give_an_answer_1_var_2);
		return $give_an_answer_1_2(m);
	}

	Operation FILE_cafeteria::$give_an_answer_1_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return $give_an_answer_1_3(m);
	}

	Operation FILE_cafeteria::$give_an_answer_1_lis(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$give_an_answer_1_lis_1);
		return $give_an_answer_1_2(m);
	}

	Operation FILE_cafeteria::$give_an_answer_1_lis_1(Prolog *m)
	{
		m->trust(nullptr);
		return $give_an_answer_1_3(m);
	}

	Operation FILE_cafeteria::$give_an_answer_1_1(Prolog *m)
	{
	// '$give_an_answer'([]):-!,'$fast_write'(true)
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$give_an_answer'([]):-['$neck_cut','$fast_write'(true)]
		if (!PRED_$give_an_answer_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
		}, VA({Prolog::True}), cont);
	}

	Operation FILE_cafeteria::$give_an_answer_1_2(Prolog *m)
	{
	// '$give_an_answer'([A]):-!,'$print_an answer'(A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$give_an_answer'([A]):-['$neck_cut','$print_an answer'(A)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a2 = argz[0];
			if (!PRED_$give_an_answer_1_s1->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a1->isVar())
		{
			a2 = V(m);
			 a1->bind(CONS(a2, PRED_$give_an_answer_1_s1), m->trail);
		}
		else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$print_an$0020answer_1_static_exec(e);
		}, VA({a2}), cont);
	}

	Operation FILE_cafeteria::$give_an_answer_1_3(Prolog *m)
	{
	// '$give_an_answer'([A|B]):-'$print_an answer'(A),'$fast_write'(','),nl,'$give_an_answer'(B)
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$give_an_answer'([A|B]):-['$print_an answer'(A),'$fast_write'(','),nl,'$give_an_answer'(B)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a2 = argz[0];
			a3 = argz[1];
		}
		else if (a1->isVar())
		{
			a2 = V(m);
			a3 = V(m);
			 a1->bind(CONS(a2, a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		return Op([&] (Prolog *e)
		{
		PRED_$print_an$0020answer_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$002C}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$give_an_answer_1_static_exec(e);
	}, VA({a3}), cont))));
	}

SymbolTerm *const FILE_cafeteria::ATOM_$0020$003D$0020 = SYM(" = ");

	Operation FILE_cafeteria::PRED_$print_an$0020answer_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$print_an answer'(A=B):-write(A),'$fast_write'(' = '),writeq(B)
		m->setB0();
		 Term *a1, *a2, *a3;
		Operation p1, p2;
		a1 = LARG[0];
	// '$print_an answer'(A=B):-[write(A),'$fast_write'(' = '),writeq(B)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C("=", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		return Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$0020$003D$0020}), Op([&] (Prolog *e)
	{
		PRED_writeq_1_static_exec(e);
	}, VA({a3}), cont)));
	}

SymbolTerm *const FILE_cafeteria::PRED_consult_1_s1 = SYM("var");

	Operation FILE_cafeteria::PRED_consult_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return consult_1_top(m);
	}

	Operation FILE_cafeteria::consult_1_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::consult_1_var, FILE_cafeteria::consult_1_int, FILE_cafeteria::consult_1_int, FILE_cafeteria::consult_1_con, FILE_cafeteria::consult_1_int, FILE_cafeteria::consult_1_lis);
	}

	Operation FILE_cafeteria::consult_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::consult_1_var_1);
		return consult_1_1(m);
	}

	Operation FILE_cafeteria::consult_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::consult_1_var_2);
		return consult_1_2(m);
	}

	Operation FILE_cafeteria::consult_1_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::consult_1_var_3);
		return consult_1_3(m);
	}

	Operation FILE_cafeteria::consult_1_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return consult_1_4(m);
	}

	Operation FILE_cafeteria::consult_1_int(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::consult_1_int_1);
		return consult_1_1(m);
	}

	Operation FILE_cafeteria::consult_1_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return consult_1_4(m);
	}

	Operation FILE_cafeteria::consult_1_con(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::consult_1_con_1);
		return consult_1_1(m);
	}

	Operation FILE_cafeteria::consult_1_con_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::consult_1_con_2);
		return consult_1_2(m);
	}

	Operation FILE_cafeteria::consult_1_con_2(Prolog *m)
	{
		m->trust(nullptr);
		return consult_1_4(m);
	}

	Operation FILE_cafeteria::consult_1_lis(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::consult_1_lis_1);
		return consult_1_1(m);
	}

	Operation FILE_cafeteria::consult_1_lis_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::consult_1_lis_2);
		return consult_1_3(m);
	}

	Operation FILE_cafeteria::consult_1_lis_2(Prolog *m)
	{
		m->trust(nullptr);
		return consult_1_4(m);
	}

	Operation FILE_cafeteria::consult_1_1(Prolog *m)
	{
	// consult(A):-var(A),!,illarg(var,consult(A),1)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// consult(A):-['$get_level'(B),var(A),'$cut'(B),illarg(var,consult(A),1)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if (!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({a1});
		a3 = S("consult", y1);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_consult_1_s1, a3, int_1}), cont);
	}

	Operation FILE_cafeteria::consult_1_2(Prolog *m)
	{
	// consult([]):-!
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// consult([]):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::consult_1_3(Prolog *m)
	{
	// consult([A|B]):-!,consult(A),consult(B)
		 Term *a1, *a2, *a3;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// consult([A|B]):-['$neck_cut',consult(A),consult(B)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a2 = argz[0];
			a3 = argz[1];
		}
		else if (a1->isVar())
		{
			a2 = V(m);
			a3 = V(m);
			 a1->bind(CONS(a2, a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (Prolog *e)
		{
		PRED_consult_1_static_exec(e);
		}, VA({a3}), cont);
		m->AREGS[0] = a2;
		m->cont = p1;
		return consult_1_top(m);
	}

	Operation FILE_cafeteria::consult_1_4(Prolog *m)
	{
	// consult(A):-atom(A),!,'$consult'(A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// consult(A):-['$get_level'(B),atom(A),'$cut'(B),'$consult'(A)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(1))
		a1 = a1->dref();
		if (!(a1->isSymbol()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$consult_1_static_exec(e);
		}, VA({a1}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$consult_1_s1 = SYM("read");
SymbolTerm *const FILE_cafeteria::ATOM_consulting = SYM("consulting");
SymbolTerm *const FILE_cafeteria::ATOM_$002E$002E$002E = SYM("...");
ListTerm *const FILE_cafeteria::PRED_$consult_1_s7 = CONS(ATOM_$002E$002E$002E, Prolog::Nil);
SymbolTerm *const FILE_cafeteria::ATOM_runtime = SYM("runtime");
SymbolTerm *const FILE_cafeteria::ATOM_consulted = SYM("consulted");
SymbolTerm *const FILE_cafeteria::ATOM_msec = SYM("msec");
ListTerm *const FILE_cafeteria::PRED_$consult_1_s11 = CONS(ATOM_msec, Prolog::Nil);

	Operation FILE_cafeteria::PRED_$consult_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$consult'(A):-'$prolog_file_name'(A,B),open(B,read,C),stream_property(C,file_name(D)),print_message(info,[consulting,D,...]),statistics(runtime,E),consult_stream(D,C),statistics(runtime,[F,G]),print_message(info,[D,consulted,G,msec]),close(C)
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13;
		Operation p1, p2, p3, p4, p5, p6, p7, p8;
		a1 = LARG[0];
	// '$consult'(A):-['$prolog_file_name'(A,B),open(B,read,C),stream_property(C,file_name(D)),print_message(info,[consulting,D,...]),statistics(runtime,E),consult_stream(D,C),statistics(runtime,[F,G]),print_message(info,[D,consulted,G,msec]),close(C)]
		a2 = V(m);
		a3 = V(m);
		a4 = V(m);
		std::vector<Term*> y1 = VA({a4});
		a5 = S("file_name", y1);
		a6 = CONS(a4, PRED_$consult_1_s7);
		a7 = CONS(ATOM_consulting, a6);
		a8 = V(m);
		a9 = CONS(a8, Prolog::Nil);
		a10 = CONS(V(m), a9);
		a11 = CONS(a8, PRED_$consult_1_s11);
		a12 = CONS(ATOM_consulted, a11);
		a13 = CONS(a4, a12);
		return Op([&] (Prolog *e)
		{
		PRED_$prolog_file_name_2_static_exec(e);
		}, VA({a1, a2}), Op([&] (Prolog *e)
		{
		PRED_open_3_static_exec(e);
	}, VA({a2, PRED_$consult_1_s1, a3}), Op([&] (Prolog *e)
	{
		PRED_stream_property_2_static_exec(e);
	}, VA({a3, a5}), Op([&] (Prolog *e)
	{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, a7}), Op([&] (Prolog *e)
	{
		PRED_statistics_2_static_exec(e);
	}, VA({ATOM_runtime, V(m)}), Op([&] (Prolog *e)
	{
		PRED_consult_stream_2_static_exec(e);
	}, VA({a4, a3}), Op([&] (Prolog *e)
	{
		PRED_statistics_2_static_exec(e);
	}, VA({ATOM_runtime, a10}), Op([&] (Prolog *e)
	{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, a13}), Op([&] (Prolog *e)
	{
		PRED_close_1_static_exec(e);
	}, VA({a3}), cont)))))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$prolog_file_name_2_s1 = SYM(".");
IntegerTerm *const FILE_cafeteria::int_0 = optional<int>(0);
SymbolTerm *const FILE_cafeteria::ATOM_$002Epl = SYM(".pl");

	Operation FILE_cafeteria::PRED_$prolog_file_name_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_cafeteria::$prolog_file_name_2_sub_1);
		return $prolog_file_name_2_1(m);
	}

	Operation FILE_cafeteria::$prolog_file_name_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $prolog_file_name_2_2(m);
	}

	Operation FILE_cafeteria::$prolog_file_name_2_1(Prolog *m)
	{
	// '$prolog_file_name'(A,A):-sub_atom(A,B,C,D,'.'),D>0,!
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$prolog_file_name'(A,A):-['$get_level'(B),sub_atom(A,C,D,E,'.'),F is 0,'$greater_than'(E,F),'$cut'(B)]
		if (!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_sub_atom_5_static_exec(e);
		}, VA({a1, V(m), V(m), a4, PRED_$prolog_file_name_2_s1}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a5, int_0}), Op([&] (Prolog *e)
		{
		PRED_$greater_than_2_static_exec(e);
	}, VA({a4, a5}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), cont))));
	}

	Operation FILE_cafeteria::$prolog_file_name_2_2(Prolog *m)
	{
	// '$prolog_file_name'(A,B):-atom_concat(A,'.pl',B)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$prolog_file_name'(A,B):-[atom_concat(A,'.pl',B)]
		return Op([&] (Prolog *e)
		{
		PRED_atom_concat_3_static_exec(e);
		}, VA({a1, ATOM_$002Epl, a2}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_trace_0_s1 = SYM("debug");
SymbolTerm *const FILE_cafeteria::ATOM_on = SYM("on");
SymbolTerm *const FILE_cafeteria::ATOM_$007BSmall$0020debugger$0020is$0020switch$0020on$007D = SYM("{Small debugger is switch on}");

	Operation FILE_cafeteria::PRED_trace_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry0(nullptr, FILE_cafeteria::trace_0_sub_1);
		return trace_0_1(m);
	}

	Operation FILE_cafeteria::trace_0_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return trace_0_2(m);
	}

	Operation FILE_cafeteria::trace_0_1(Prolog *m)
	{
	// trace:-current_prolog_flag(debug,on),!
		 Term *a1;
		Operation p1;
		Operation cont;
		cont = m->cont;
	// trace:-['$get_level'(A),current_prolog_flag(debug,on),'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_current_prolog_flag_2_static_exec(e);
		}, VA({PRED_trace_0_s1, ATOM_on}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), cont));
	}

	Operation FILE_cafeteria::trace_0_2(Prolog *m)
	{
	// trace:-set_prolog_flag(debug,on),'$trace_init','$fast_write'('{Small debugger is switch on}'),nl,!
		 Term *a1;
		Operation p1, p2, p3, p4;
		Operation cont;
		cont = m->cont;
	// trace:-['$get_level'(A),set_prolog_flag(debug,on),'$trace_init','$fast_write'('{Small debugger is switch on}'),nl,'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_set_prolog_flag_2_static_exec(e);
		}, VA({PRED_trace_0_s1, ATOM_on}), Op([&] (Prolog *e)
		{
		PRED_$trace_init_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$007BSmall$0020debugger$0020is$0020switch$0020on$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), cont)))));
	}

SymbolTerm *const FILE_cafeteria::ATOM_SxxMachine$002Ebuiltin = SYM("SxxMachine");
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s8 = S("$leap_flag", ATOM_no);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s10 = S(":", ATOM_SxxMachine$002Ebuiltin, PRED_$trace_init_0_s8);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s13 = S("$current_leash", ATOM_call);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s15 = S(":", ATOM_SxxMachine$002Ebuiltin, PRED_$trace_init_0_s13);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s18 = S("$current_leash", ATOM_exit);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s20 = S(":", ATOM_SxxMachine$002Ebuiltin, PRED_$trace_init_0_s18);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s23 = S("$current_leash", ATOM_redo);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s25 = S(":", ATOM_SxxMachine$002Ebuiltin, PRED_$trace_init_0_s23);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s28 = S("$current_leash", ATOM_fail);
StructureTerm *const FILE_cafeteria::PRED_$trace_init_0_s30 = S(":", ATOM_SxxMachine$002Ebuiltin, PRED_$trace_init_0_s28);

	Operation FILE_cafeteria::PRED_$trace_init_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$trace_init':-retractall('$leap_flag'(A)),retractall('$current_leash'(B)),retractall('$current_spypoint'(C,D,E)),assertz('$leap_flag'(no)),assertz('$current_leash'(call)),assertz('$current_leash'(exit)),assertz('$current_leash'(redo)),assertz('$current_leash'(fail)),!
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1, p2, p3, p4, p5, p6, p7, p8;
	// '$trace_init':-['$get_level'(A),retractall('SxxMachine':'$leap_flag'(B)),retractall('SxxMachine':'$current_leash'(C)),retractall('SxxMachine':'$current_spypoint'(D,E,F)),assertz('SxxMachine':'$leap_flag'(no)),assertz('SxxMachine':'$current_leash'(call)),assertz('SxxMachine':'$current_leash'(exit)),assertz('SxxMachine':'$current_leash'(redo)),assertz('SxxMachine':'$current_leash'(fail)),'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({V(m)});
		a2 = S("$leap_flag", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a2});
		a3 = S(":", y2);
		std::vector<Term*> y3 = VA({V(m)});
		a4 = S("$current_leash", y3);
		std::vector<Term*> y4 = VA({ATOM_SxxMachine$002Ebuiltin, a4});
		a5 = S(":", y4);
		std::vector<Term*> y5 = VA({V(m), V(m), V(m)});
		a6 = S("$current_spypoint", y5);
		std::vector<Term*> y6 = VA({ATOM_SxxMachine$002Ebuiltin, a6});
		a7 = S(":", y6);
		return Op([&] (Prolog *e)
		{
		PRED_retractall_1_static_exec(e);
		}, VA({a3}), Op([&] (Prolog *e)
		{
		PRED_retractall_1_static_exec(e);
	}, VA({a5}), Op([&] (Prolog *e)
	{
		PRED_retractall_1_static_exec(e);
	}, VA({a7}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$trace_init_0_s10}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$trace_init_0_s15}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$trace_init_0_s20}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$trace_init_0_s25}), Op([&] (Prolog *e)
	{
		PRED_assertz_1_static_exec(e);
	}, VA({PRED_$trace_init_0_s30}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), cont)))))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_notrace_0_s1 = SYM("debug");
SymbolTerm *const FILE_cafeteria::ATOM_off = SYM("off");
SymbolTerm *const FILE_cafeteria::ATOM_$007BSmall$0020debugger$0020is$0020switch$0020off$007D = SYM("{Small debugger is switch off}");

	Operation FILE_cafeteria::PRED_notrace_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry0(nullptr, FILE_cafeteria::notrace_0_sub_1);
		return notrace_0_1(m);
	}

	Operation FILE_cafeteria::notrace_0_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return notrace_0_2(m);
	}

	Operation FILE_cafeteria::notrace_0_1(Prolog *m)
	{
	// notrace:-current_prolog_flag(debug,off),!
		 Term *a1;
		Operation p1;
		Operation cont;
		cont = m->cont;
	// notrace:-['$get_level'(A),current_prolog_flag(debug,off),'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_current_prolog_flag_2_static_exec(e);
		}, VA({PRED_notrace_0_s1, ATOM_off}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), cont));
	}

	Operation FILE_cafeteria::notrace_0_2(Prolog *m)
	{
	// notrace:-set_prolog_flag(debug,off),'$fast_write'('{Small debugger is switch off}'),nl,!
		 Term *a1;
		Operation p1, p2, p3;
		Operation cont;
		cont = m->cont;
	// notrace:-['$get_level'(A),set_prolog_flag(debug,off),'$fast_write'('{Small debugger is switch off}'),nl,'$cut'(A)]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_set_prolog_flag_2_static_exec(e);
		}, VA({PRED_notrace_0_s1, ATOM_off}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$007BSmall$0020debugger$0020is$0020switch$0020off$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), cont))));
	}

	Operation FILE_cafeteria::PRED_debug_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// debug:-trace
		m->setB0();
	// debug:-[trace]
		return Op([&] (Prolog *e)
		{
		PRED_trace_0_static_exec(e);
		}, VA(), cont);
	}

	Operation FILE_cafeteria::PRED_nodebug_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// nodebug:-notrace
		m->setB0();
	// nodebug:-[notrace]
		return Op([&] (Prolog *e)
		{
		PRED_notrace_0_static_exec(e);
		}, VA(), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$trace_goal_1_s1 = SYM("leap");
SymbolTerm *const FILE_cafeteria::ATOM_trace = SYM("trace");

	Operation FILE_cafeteria::PRED_$trace_goal_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$trace_goal'(A):-'$set_debug_flag'(leap,no),'$get_current_B'(B),context_module(C),'$meta_call'(A,C,B,0,trace)
		m->setB0();
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3;
		a1 = LARG[0];
	// '$trace_goal'(A):-['$set_debug_flag'(leap,no),'$get_current_B'(B),context_module(C),'$meta_call'(A,C,B,0,trace)]
		a2 = V(m);
		a3 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_$set_debug_flag_2_static_exec(e);
		}, VA({PRED_$trace_goal_1_s1, ATOM_no}), Op([&] (Prolog *e)
		{
		PRED_$get_current_B_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_context_module_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_$meta_call_5_static_exec(e);
	}, VA({a1, a3, a2, int_0, ATOM_trace}), cont))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$trace_goal_4_s1 = SYM("call");

	Operation FILE_cafeteria::PRED_$trace_goal_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_cafeteria::$trace_goal_4_sub_1);
		return $trace_goal_4_1(m);
	}

	Operation FILE_cafeteria::$trace_goal_4_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $trace_goal_4_2(m);
	}

	Operation FILE_cafeteria::$trace_goal_4_1(Prolog *m)
	{
	// '$trace_goal'(A,B,C,D):-print_procedure_box(call,A,B,C,D),'$call_internal'(A,B,C,D,trace),print_procedure_box(exit,A,B,C,D),redo_procedure_box(A,B,C,D)
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// '$trace_goal'(A,B,C,D):-[print_procedure_box(call,A,B,C,D),'$call_internal'(A,B,C,D,trace),print_procedure_box(exit,A,B,C,D),redo_procedure_box(A,B,C,D)]
		return Op([&] (Prolog *e)
		{
		PRED_print_procedure_box_5_static_exec(e);
		}, VA({PRED_$trace_goal_4_s1, a1, a2, a3, a4}), Op([&] (Prolog *e)
		{
		PRED_$call_internal_5_static_exec(e);
	}, VA({a1, a2, a3, a4, ATOM_trace}), Op([&] (Prolog *e)
	{
		PRED_print_procedure_box_5_static_exec(e);
	}, VA({ATOM_exit, a1, a2, a3, a4}), Op([&] (Prolog *e)
	{
		PRED_redo_procedure_box_4_static_exec(e);
	}, VA({a1, a2, a3, a4}), cont))));
	}

	Operation FILE_cafeteria::$trace_goal_4_2(Prolog *m)
	{
	// '$trace_goal'(A,B,C,D):-print_procedure_box(fail,A,B,C,D),fail
		 Term *a1, *a2, *a3, *a4;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// '$trace_goal'(A,B,C,D):-[print_procedure_box(fail,A,B,C,D),fail]
		return Op([&] (Prolog *e)
		{
		PRED_print_procedure_box_5_static_exec(e);
		}, VA({ATOM_fail, a1, a2, a3, a4}), Op(fail_0, VA(), cont));
	}

SymbolTerm *const FILE_cafeteria::ATOM_$002B = SYM("+");
SymbolTerm *const FILE_cafeteria::ATOM_module_colon = SYM(":");
StructureTerm *const FILE_cafeteria::PRED_print_procedure_box_5_s12 = S("$leap_flag", ATOM_no);
StructureTerm *const FILE_cafeteria::PRED_print_procedure_box_5_s14 = S(":", ATOM_SxxMachine$002Ebuiltin, PRED_print_procedure_box_5_s12);
SymbolTerm *const FILE_cafeteria::ATOM_$0020 = SYM(" ");

	Operation FILE_cafeteria::PRED_print_procedure_box_5_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry5(nullptr, FILE_cafeteria::print_procedure_box_5_sub_1);
		return print_procedure_box_5_1(m);
	}

	Operation FILE_cafeteria::print_procedure_box_5_sub_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::print_procedure_box_5_sub_2);
		return print_procedure_box_5_2(m);
	}

	Operation FILE_cafeteria::print_procedure_box_5_sub_2(Prolog *m)
	{
		m->trust(nullptr);
		return print_procedure_box_5_3(m);
	}

	Operation FILE_cafeteria::print_procedure_box_5_1(Prolog *m)
	{
	// print_procedure_box(A,B,C,D/E,F):-clause('$current_spypoint'(C,D,E),G),!,'$builtin_message'([+,F,A,:,C:B]),'$read_blocked'(print_procedure_box(A,B,C,D/E,F))
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17, *a18;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
	// print_procedure_box(A,B,C,D/E,F):-['$get_level'(G),clause('SxxMachine':'$current_spypoint'(C,D,E),H),'$cut'(G),'$builtin_message'([+,F,A,:,C:B]),'$read_blocked'(print_procedure_box(A,B,C,D/E,F))]
		a4 = a4->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a4->unify(C("/", {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if (!a8->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a3, a6, a7});
		a9 = S("$current_spypoint", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a9});
		a10 = S(":", y2);
		std::vector<Term*> y3 = VA({a3, a2});
		a11 = S(":", y3);
		a12 = CONS(a11, Prolog::Nil);
		a13 = CONS(ATOM_module_colon, a12);
		a14 = CONS(a1, a13);
		a15 = CONS(a5, a14);
		a16 = CONS(ATOM_$002B, a15);
		std::vector<Term*> y4 = VA({a6, a7});
		a17 = S("/", y4);
		std::vector<Term*> y5 = VA({a1, a2, a3, a17, a5});
		a18 = S("print_procedure_box", y5);
		return Op([&] (Prolog *e)
		{
		PRED_clause_2_static_exec(e);
		}, VA({a10, V(m)}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a8}), Op([&] (Prolog *e)
	{
		PRED_$builtin_message_1_static_exec(e);
	}, VA({a16}), Op([&] (Prolog *e)
	{
		PRED_$read_blocked_1_static_exec(e);
	}, VA({a18}), cont))));
	}

	Operation FILE_cafeteria::print_procedure_box_5_2(Prolog *m)
	{
	// print_procedure_box(A,B,C,D,E):-clause('$leap_flag'(no),F),!,'$builtin_message'([' ',E,A,:,C:B]),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C,D,E,G)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
	// print_procedure_box(A,B,C,D,E):-['$get_level'(F),clause('SxxMachine':'$leap_flag'(no),G),'$cut'(F),'$builtin_message'([' ',E,A,:,C:B]),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C,D,E,H)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a3, a2});
		a7 = S(":", y1);
		a8 = CONS(a7, Prolog::Nil);
		a9 = CONS(ATOM_module_colon, a8);
		a10 = CONS(a1, a9);
		a11 = CONS(a5, a10);
		a12 = CONS(ATOM_$0020, a11);
		return Op([&] (Prolog *e)
		{
		PRED_clause_2_static_exec(e);
		}, VA({PRED_print_procedure_box_5_s14, V(m)}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a6}), Op([&] (Prolog *e)
	{
		PRED_$builtin_message_1_static_exec(e);
	}, VA({a12}), Op([&] (Prolog *e)
	{
		PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_static_exec(e);
	}, VA({a1, a2, a3, a4, a5, V(m)}), cont))));
	}

	Operation FILE_cafeteria::print_procedure_box_5_3(Prolog *m)
	{
	// print_procedure_box(A,B,C,D,E):-true
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
	// print_procedure_box(A,B,C,D,E):-[]
		return cont;
	}

	Operation FILE_cafeteria::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry6(nullptr, FILE_cafeteria::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_sub_1);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_1(m);
	}

	Operation FILE_cafeteria::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_2(m);
	}

	Operation FILE_cafeteria::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_1(Prolog *m)
	{
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C,D,E,F):-clause('$current_leash'(A),F),!,'$read_blocked'(print_procedure_box(A,B,C,D,E))
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C,D,E,F):-['$get_level'(G),clause('SxxMachine':'$current_leash'(A),F),'$cut'(G),'$read_blocked'(print_procedure_box(A,B,C,D,E))]
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a1});
		a8 = S("$current_leash", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a8});
		a9 = S(":", y2);
		std::vector<Term*> y3 = VA({a1, a2, a3, a4, a5});
		a10 = S("print_procedure_box", y3);
		return Op([&] (Prolog *e)
		{
		PRED_clause_2_static_exec(e);
		}, VA({a9, a6}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a7}), Op([&] (Prolog *e)
	{
		PRED_$read_blocked_1_static_exec(e);
	}, VA({a10}), cont)));
	}

	Operation FILE_cafeteria::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_2(Prolog *m)
	{
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C,D,E,F):-nl
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C,D,E,F):-[nl]
		return Op([&] (Prolog *e)
		{
		PRED_nl_0_static_exec(e);
		}, VA(), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_redo_procedure_box_4_s1 = SYM("redo");

	Operation FILE_cafeteria::PRED_redo_procedure_box_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_cafeteria::redo_procedure_box_4_sub_1);
		return redo_procedure_box_4_1(m);
	}

	Operation FILE_cafeteria::redo_procedure_box_4_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return redo_procedure_box_4_2(m);
	}

	Operation FILE_cafeteria::redo_procedure_box_4_1(Prolog *m)
	{
	// redo_procedure_box(A,B,C,D):-true
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// redo_procedure_box(A,B,C,D):-[]
		return cont;
	}

	Operation FILE_cafeteria::redo_procedure_box_4_2(Prolog *m)
	{
	// redo_procedure_box(A,B,C,D):-print_procedure_box(redo,A,B,C,D),fail
		 Term *a1, *a2, *a3, *a4;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// redo_procedure_box(A,B,C,D):-[print_procedure_box(redo,A,B,C,D),fail]
		return Op([&] (Prolog *e)
		{
		PRED_print_procedure_box_5_static_exec(e);
		}, VA({PRED_redo_procedure_box_4_s1, a1, a2, a3, a4}), Op(fail_0, VA(), cont));
	}

SymbolTerm *const FILE_cafeteria::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_s1 = SYM("[]");
IntegerTerm *const FILE_cafeteria::int_99 = optional<int>(99);

	Operation FILE_cafeteria::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_cafeteria::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_sub_1);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_1(m);
	}

	Operation FILE_cafeteria::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_2(m);
	}

	Operation FILE_cafeteria::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_1(Prolog *m)
	{
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-A==[],!,B=99
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-['$get_level'(D),'$equality_of_term'(A,[]),'$cut'(D),'$unify'(B,99)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1->dref();
		if (!a1->equalsTerm(PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		//START inline expansion of $unify(a(2),@(int_99))
		if (!a2->unify(int_99, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_2(Prolog *m)
	{
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-A=[B|C]
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(A,B,C):-['$unify'(A,[B|C])]
		a4 = CONS(a2, a3);
		//START inline expansion of $unify(a(1),a(4))
		if (!a1->unify(a4, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

SymbolTerm *const FILE_cafeteria::PRED_$read_blocked_1_s1 = SYM(" ? ");

	Operation FILE_cafeteria::PRED_$read_blocked_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$read_blocked'(A):-'$fast_write'(' ? '),flush_output,read_line(B),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(B,C,D),'$debug_option'(C,A)
		m->setB0();
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3, p4;
		a1 = LARG[0];
	// '$read_blocked'(A):-['$fast_write'(' ? '),flush_output,read_line(B),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl'(B,C,D),'$debug_option'(C,A)]
		a2 = V(m);
		a3 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
		}, VA({PRED_$read_blocked_1_s1}), Op([&] (Prolog *e)
		{
		PRED_flush_output_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_read_line_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec(e);
	}, VA({a2, a3, V(m)}), Op([&] (Prolog *e)
	{
		PRED_$debug_option_2_static_exec(e);
	}, VA({a3, a1}), cont)))));
	}

IntegerTerm *const FILE_cafeteria::PRED_$debug_option_2_s1 = optional<int>(97);
SymbolTerm *const FILE_cafeteria::ATOM_leap = SYM("leap");
IntegerTerm *const FILE_cafeteria::int_108 = optional<int>(108);
IntegerTerm *const FILE_cafeteria::int_43 = optional<int>(43);
IntegerTerm *const FILE_cafeteria::int_45 = optional<int>(45);
IntegerTerm *const FILE_cafeteria::int_63 = optional<int>(63);
IntegerTerm *const FILE_cafeteria::int_104 = optional<int>(104);

	Operation FILE_cafeteria::PRED_$debug_option_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$debug_option_2_var, FILE_cafeteria::$debug_option_2_var, FILE_cafeteria::$debug_option_2_8, FILE_cafeteria::$debug_option_2_8, FILE_cafeteria::$debug_option_2_8, FILE_cafeteria::$debug_option_2_8);
	}

	Operation FILE_cafeteria::$debug_option_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$debug_option_2_var_1);
		return $debug_option_2_1(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$debug_option_2_var_2);
		return $debug_option_2_2(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$debug_option_2_var_3);
		return $debug_option_2_3(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$debug_option_2_var_4);
		return $debug_option_2_4(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$debug_option_2_var_5);
		return $debug_option_2_5(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$debug_option_2_var_6);
		return $debug_option_2_6(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$debug_option_2_var_7);
		return $debug_option_2_7(m);
	}

	Operation FILE_cafeteria::$debug_option_2_var_7(Prolog *m)
	{
		m->trust(nullptr);
		return $debug_option_2_8(m);
	}

	Operation FILE_cafeteria::$debug_option_2_1(Prolog *m)
	{
	// '$debug_option'(97,A):-!,notrace,abort
		 Term *a1, *a2;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(97,A):-['$neck_cut',notrace,abort]
		if (!PRED_$debug_option_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_notrace_0_static_exec(e);
		}, VA(), Op([&] (Prolog *e)
		{
		PRED_abort_0_static_exec(e);
	}, VA(), cont));
	}

	Operation FILE_cafeteria::$debug_option_2_2(Prolog *m)
	{
	// '$debug_option'(99,A):-!,'$set_debug_flag'(leap,no)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(99,A):-['$neck_cut','$set_debug_flag'(leap,no)]
		if (!int_99->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$set_debug_flag_2_static_exec(e);
		}, VA({ATOM_leap, ATOM_no}), cont);
	}

	Operation FILE_cafeteria::$debug_option_2_3(Prolog *m)
	{
	// '$debug_option'(108,A):-!,'$set_debug_flag'(leap,yes)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(108,A):-['$neck_cut','$set_debug_flag'(leap,yes)]
		if (!int_108->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$set_debug_flag_2_static_exec(e);
		}, VA({ATOM_leap, ATOM_yes}), cont);
	}

	Operation FILE_cafeteria::$debug_option_2_4(Prolog *m)
	{
	// '$debug_option'(43,print_procedure_box(A,B,C,D,E)):-!,spy(C:D),call(print_procedure_box(A,B,C,D,E))
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(43,print_procedure_box(A,B,C,D,E)):-['$neck_cut',spy(C:D),call('SxxMachine':print_procedure_box(A,B,C,D,E))]
		if (!int_43->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			a6 = V(m);
			a7 = V(m);
			if (!a2->unify(C("print_procedure_box", {a3, a4, a5, a6, a7}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		std::vector<Term*> y1 = VA({a5, a6});
		a8 = S(":", y1);
		a9 = Closure(Op([&] (Prolog *e)
		{
		PRED_print_procedure_box_5_static_exec(e);
		}, VA({a3, a4, a5, a6, a7}), nullptr));
		return Op([&] (Prolog *e)
		{
		PRED_spy_1_static_exec(e);
		}, VA({a8}), Op([&] (Prolog *e)
		{
		PRED_call_1_static_exec(e);
	}, VA({a9}), cont));
	}

	Operation FILE_cafeteria::$debug_option_2_5(Prolog *m)
	{
	// '$debug_option'(45,print_procedure_box(A,B,C,D,E)):-!,nospy(C:D),call(print_procedure_box(A,B,C,D,E))
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(45,print_procedure_box(A,B,C,D,E)):-['$neck_cut',nospy(C:D),call('SxxMachine':print_procedure_box(A,B,C,D,E))]
		if (!int_45->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			a6 = V(m);
			a7 = V(m);
			if (!a2->unify(C("print_procedure_box", {a3, a4, a5, a6, a7}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		std::vector<Term*> y1 = VA({a5, a6});
		a8 = S(":", y1);
		a9 = Closure(Op([&] (Prolog *e)
		{
		PRED_print_procedure_box_5_static_exec(e);
		}, VA({a3, a4, a5, a6, a7}), nullptr));
		return Op([&] (Prolog *e)
		{
		PRED_nospy_1_static_exec(e);
		}, VA({a8}), Op([&] (Prolog *e)
		{
		PRED_call_1_static_exec(e);
	}, VA({a9}), cont));
	}

	Operation FILE_cafeteria::$debug_option_2_6(Prolog *m)
	{
	// '$debug_option'(63,A):-!,'$show_debug_option',call(A)
		 Term *a1, *a2, *a3;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(63,A):-['$neck_cut','$show_debug_option',call('SxxMachine':A)]
		if (!int_63->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		std::vector<Term*> y1 = VA({ATOM_SxxMachine$002Ebuiltin, a2});
		a3 = S(":", y1);
		return Op([&] (Prolog *e)
		{
		PRED_$show_debug_option_0_static_exec(e);
		}, VA(), Op([&] (Prolog *e)
		{
		PRED_call_1_static_exec(e);
	}, VA({a3}), cont));
	}

	Operation FILE_cafeteria::$debug_option_2_7(Prolog *m)
	{
	// '$debug_option'(104,A):-!,'$show_debug_option',call(A)
		 Term *a1, *a2, *a3;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(104,A):-['$neck_cut','$show_debug_option',call('SxxMachine':A)]
		if (!int_104->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		std::vector<Term*> y1 = VA({ATOM_SxxMachine$002Ebuiltin, a2});
		a3 = S(":", y1);
		return Op([&] (Prolog *e)
		{
		PRED_$show_debug_option_0_static_exec(e);
		}, VA(), Op([&] (Prolog *e)
		{
		PRED_call_1_static_exec(e);
	}, VA({a3}), cont));
	}

	Operation FILE_cafeteria::$debug_option_2_8(Prolog *m)
	{
	// '$debug_option'(A,B):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$debug_option'(A,B):-[]
		return cont;
	}

IntegerTerm *const FILE_cafeteria::PRED_$show_debug_option_0_s1 = optional<int>(4);
SymbolTerm *const FILE_cafeteria::ATOM_Debugging$0020options$003A = SYM("Debugging options:");
SymbolTerm *const FILE_cafeteria::ATOM_a$0020$0020$0020$0020$0020$0020abort = SYM("a      abort");
SymbolTerm *const FILE_cafeteria::ATOM_RET$0020$0020$0020$0020creep = SYM("RET    creep");
SymbolTerm *const FILE_cafeteria::ATOM_c$0020$0020$0020$0020$0020$0020creep = SYM("c      creep");
SymbolTerm *const FILE_cafeteria::ATOM_l$0020$0020$0020$0020$0020$0020leap = SYM("l      leap");
SymbolTerm *const FILE_cafeteria::ATOM_$002B$0020$0020$0020$0020$0020$0020spy$0020this = SYM("+      spy this");
SymbolTerm *const FILE_cafeteria::ATOM_$002D$0020$0020$0020$0020$0020$0020nospy$0020this = SYM("-      nospy this");
SymbolTerm *const FILE_cafeteria::ATOM_$003F$0020$0020$0020$0020$0020$0020help = SYM("?      help");
SymbolTerm *const FILE_cafeteria::ATOM_h$0020$0020$0020$0020$0020$0020help = SYM("h      help");

	Operation FILE_cafeteria::PRED_$show_debug_option_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// '$show_debug_option':-tab(4),'$fast_write'('Debugging options:'),nl,tab(4),'$fast_write'('a      abort'),nl,tab(4),'$fast_write'('RET    creep'),nl,tab(4),'$fast_write'('c      creep'),nl,tab(4),'$fast_write'('l      leap'),nl,tab(4),'$fast_write'('+      spy this'),nl,tab(4),'$fast_write'('-      nospy this'),nl,tab(4),'$fast_write'('?      help'),nl,tab(4),'$fast_write'('h      help'),nl
		m->setB0();
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26;
	// '$show_debug_option':-[tab(4),'$fast_write'('Debugging options:'),nl,tab(4),'$fast_write'('a      abort'),nl,tab(4),'$fast_write'('RET    creep'),nl,tab(4),'$fast_write'('c      creep'),nl,tab(4),'$fast_write'('l      leap'),nl,tab(4),'$fast_write'('+      spy this'),nl,tab(4),'$fast_write'('-      nospy this'),nl,tab(4),'$fast_write'('?      help'),nl,tab(4),'$fast_write'('h      help'),nl]
		return Op([&] (Prolog *e)
		{
		PRED_tab_1_static_exec(e);
		}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_Debugging$0020options$003A}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_a$0020$0020$0020$0020$0020$0020abort}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_RET$0020$0020$0020$0020creep}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_c$0020$0020$0020$0020$0020$0020creep}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_l$0020$0020$0020$0020$0020$0020leap}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$002B$0020$0020$0020$0020$0020$0020spy$0020this}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$002D$0020$0020$0020$0020$0020$0020nospy$0020this}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$003F$0020$0020$0020$0020$0020$0020help}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({PRED_$show_debug_option_0_s1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_h$0020$0020$0020$0020$0020$0020help}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont)))))))))))))))))))))))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$set_debug_flag_2_s1 = SYM("leap");

	Operation FILE_cafeteria::PRED_$set_debug_flag_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$set_debug_flag_2_var, fail_0, fail_0, FILE_cafeteria::$set_debug_flag_2_var, fail_0, fail_0);
	}

	Operation FILE_cafeteria::$set_debug_flag_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$set_debug_flag_2_var_1);
		return $set_debug_flag_2_1(m);
	}

	Operation FILE_cafeteria::$set_debug_flag_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return $set_debug_flag_2_2(m);
	}

	Operation FILE_cafeteria::$set_debug_flag_2_1(Prolog *m)
	{
	// '$set_debug_flag'(leap,A):-clause('$leap_flag'(A),B),!
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$set_debug_flag'(leap,A):-['$get_level'(B),clause('SxxMachine':'$leap_flag'(A),C),'$cut'(B)]
		if (!PRED_$set_debug_flag_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a2});
		a4 = S("$leap_flag", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a4});
		a5 = S(":", y2);
		return Op([&] (Prolog *e)
		{
		PRED_clause_2_static_exec(e);
		}, VA({a5, V(m)}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), cont));
	}

	Operation FILE_cafeteria::$set_debug_flag_2_2(Prolog *m)
	{
	// '$set_debug_flag'(leap,A):-retractall('$leap_flag'(B)),assertz('$leap_flag'(A))
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$set_debug_flag'(leap,A):-[retractall('SxxMachine':'$leap_flag'(B)),assertz('SxxMachine':'$leap_flag'(A))]
		if (!PRED_$set_debug_flag_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({V(m)});
		a3 = S("$leap_flag", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a3});
		a4 = S(":", y2);
		std::vector<Term*> y3 = VA({a2});
		a5 = S("$leap_flag", y3);
		std::vector<Term*> y4 = VA({ATOM_SxxMachine$002Ebuiltin, a5});
		a6 = S(":", y4);
		return Op([&] (Prolog *e)
		{
		PRED_retractall_1_static_exec(e);
		}, VA({a4}), Op([&] (Prolog *e)
		{
		PRED_assertz_1_static_exec(e);
	}, VA({a6}), cont));
	}

	Operation FILE_cafeteria::PRED_spy_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// spy(A):-'$term_to_predicateindicator'(A,B,spy(A)),trace,'$assert_spypoint'(B),'$set_debug_flag'(leap,yes),!
		m->setB0();
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3, p4;
		a1 = LARG[0];
	// spy(A):-['$get_level'(B),'$term_to_predicateindicator'(A,C,spy(A)),trace,'$assert_spypoint'(C),'$set_debug_flag'(leap,yes),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a3 = V(m);
		std::vector<Term*> y1 = VA({a1});
		a4 = S("spy", y1);
		return Op([&] (Prolog *e)
		{
		PRED_$term_to_predicateindicator_3_static_exec(e);
		}, VA({a1, a3, a4}), Op([&] (Prolog *e)
		{
		PRED_trace_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$assert_spypoint_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_$set_debug_flag_2_static_exec(e);
	}, VA({ATOM_leap, ATOM_yes}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a2}), cont)))));
	}

SymbolTerm *const FILE_cafeteria::ATOM_spypoint = SYM("spypoint");
SymbolTerm *const FILE_cafeteria::ATOM_is = SYM("is");
SymbolTerm *const FILE_cafeteria::ATOM_already = SYM("already");
SymbolTerm *const FILE_cafeteria::ATOM_added = SYM("added");
ListTerm *const FILE_cafeteria::PRED_$assert_spypoint_1_s11 = CONS(ATOM_added, Prolog::Nil);
ListTerm *const FILE_cafeteria::PRED_$assert_spypoint_1_s12 = CONS(ATOM_already, PRED_$assert_spypoint_1_s11);
ListTerm *const FILE_cafeteria::PRED_$assert_spypoint_1_s13 = CONS(ATOM_is, PRED_$assert_spypoint_1_s12);
ListTerm *const FILE_cafeteria::PRED_$assert_spypoint_1_s15 = CONS(ATOM_is, PRED_$assert_spypoint_1_s11);
SymbolTerm *const FILE_cafeteria::ATOM_warning = SYM("warning");
SymbolTerm *const FILE_cafeteria::ATOM_matching = SYM("matching");
SymbolTerm *const FILE_cafeteria::ATOM_predicate = SYM("predicate");
SymbolTerm *const FILE_cafeteria::ATOM_for = SYM("for");
SymbolTerm *const FILE_cafeteria::ATOM_spy = SYM("spy");

	Operation FILE_cafeteria::PRED_$assert_spypoint_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$assert_spypoint_1_var, fail_0, fail_0, fail_0, FILE_cafeteria::$assert_spypoint_1_var, fail_0);
	}

	Operation FILE_cafeteria::$assert_spypoint_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$assert_spypoint_1_var_1);
		return $assert_spypoint_1_1(m);
	}

	Operation FILE_cafeteria::$assert_spypoint_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$assert_spypoint_1_var_2);
		return $assert_spypoint_1_2(m);
	}

	Operation FILE_cafeteria::$assert_spypoint_1_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return $assert_spypoint_1_3(m);
	}

	Operation FILE_cafeteria::$assert_spypoint_1_1(Prolog *m)
	{
	// '$assert_spypoint'(A:B/C):-clause('$current_spypoint'(A,B,C),D),print_message(info,[spypoint,A:B/C,is,already,added]),!
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$assert_spypoint'(A:B/C):-['$get_level'(D),clause('SxxMachine':'$current_spypoint'(A,B,C),E),print_message(info,[spypoint,A:B/C,is,already,added]),'$cut'(D)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C(":", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a3->unify(C("/", {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a2, a4, a5});
		a7 = S("$current_spypoint", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a7});
		a8 = S(":", y2);
		std::vector<Term*> y3 = VA({a4, a5});
		a9 = S("/", y3);
		std::vector<Term*> y4 = VA({a2, a9});
		a10 = S(":", y4);
		a11 = CONS(a10, PRED_$assert_spypoint_1_s13);
		a12 = CONS(ATOM_spypoint, a11);
		return Op([&] (Prolog *e)
		{
		PRED_clause_2_static_exec(e);
		}, VA({a8, V(m)}), Op([&] (Prolog *e)
		{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, a12}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a6}), cont)));
	}

	Operation FILE_cafeteria::$assert_spypoint_1_2(Prolog *m)
	{
	// '$assert_spypoint'(A:B/C):-clause('$consulted_predicate'(A,B/C,D),E),assertz('$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,added]),!
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$assert_spypoint'(A:B/C):-['$get_level'(D),clause('SxxMachine':'$consulted_predicate'(A,B/C,E),F),assertz('SxxMachine':'$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,added]),'$cut'(D)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C(":", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a3->unify(C("/", {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a4, a5});
		a7 = S("/", y1);
		std::vector<Term*> y2 = VA({a2, a7, V(m)});
		a8 = S("$consulted_predicate", y2);
		std::vector<Term*> y3 = VA({ATOM_SxxMachine$002Ebuiltin, a8});
		a9 = S(":", y3);
		std::vector<Term*> y4 = VA({a2, a4, a5});
		a10 = S("$current_spypoint", y4);
		std::vector<Term*> y5 = VA({ATOM_SxxMachine$002Ebuiltin, a10});
		a11 = S(":", y5);
		std::vector<Term*> y6 = VA({a4, a5});
		a12 = S("/", y6);
		std::vector<Term*> y7 = VA({a2, a12});
		a13 = S(":", y7);
		a14 = CONS(a13, PRED_$assert_spypoint_1_s15);
		a15 = CONS(ATOM_spypoint, a14);
		return Op([&] (Prolog *e)
		{
		PRED_clause_2_static_exec(e);
		}, VA({a9, V(m)}), Op([&] (Prolog *e)
		{
		PRED_assertz_1_static_exec(e);
	}, VA({a11}), Op([&] (Prolog *e)
	{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, a15}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a6}), cont))));
	}

	Operation FILE_cafeteria::$assert_spypoint_1_3(Prolog *m)
	{
	// '$assert_spypoint'(A:B/C):-print_message(warning,[no,matching,predicate,for,spy,A:B/C])
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$assert_spypoint'(A:B/C):-[print_message(warning,[no,matching,predicate,for,spy,A:B/C])]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C(":", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a3->unify(C("/", {a4, a5}), m->trail))
			{
				return m->fail();
			}
		std::vector<Term*> y1 = VA({a4, a5});
		a6 = S("/", y1);
		std::vector<Term*> y2 = VA({a2, a6});
		a7 = S(":", y2);
		a8 = CONS(a7, Prolog::Nil);
		a9 = CONS(ATOM_spy, a8);
		a10 = CONS(ATOM_for, a9);
		a11 = CONS(ATOM_predicate, a10);
		a12 = CONS(ATOM_matching, a11);
		a13 = CONS(ATOM_no, a12);
		return Op([&] (Prolog *e)
		{
		PRED_print_message_2_static_exec(e);
		}, VA({ATOM_warning, a13}), cont);
	}

	Operation FILE_cafeteria::PRED_nospy_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// nospy(A):-'$term_to_predicateindicator'(A,B,nospy(A)),'$retract_spypoint'(B),'$set_debug_flag'(leap,no),!
		m->setB0();
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3;
		a1 = LARG[0];
	// nospy(A):-['$get_level'(B),'$term_to_predicateindicator'(A,C,nospy(A)),'$retract_spypoint'(C),'$set_debug_flag'(leap,no),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a3 = V(m);
		std::vector<Term*> y1 = VA({a1});
		a4 = S("nospy", y1);
		return Op([&] (Prolog *e)
		{
		PRED_$term_to_predicateindicator_3_static_exec(e);
		}, VA({a1, a3, a4}), Op([&] (Prolog *e)
		{
		PRED_$retract_spypoint_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_$set_debug_flag_2_static_exec(e);
	}, VA({ATOM_leap, ATOM_no}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a2}), cont))));
	}

SymbolTerm *const FILE_cafeteria::ATOM_removed = SYM("removed");
ListTerm *const FILE_cafeteria::PRED_$retract_spypoint_1_s10 = CONS(ATOM_removed, Prolog::Nil);
ListTerm *const FILE_cafeteria::PRED_$retract_spypoint_1_s11 = CONS(ATOM_is, PRED_$retract_spypoint_1_s10);

	Operation FILE_cafeteria::PRED_$retract_spypoint_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$retract_spypoint_1_var, FILE_cafeteria::$retract_spypoint_1_2, FILE_cafeteria::$retract_spypoint_1_2, FILE_cafeteria::$retract_spypoint_1_2, FILE_cafeteria::$retract_spypoint_1_var, FILE_cafeteria::$retract_spypoint_1_2);
	}

	Operation FILE_cafeteria::$retract_spypoint_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$retract_spypoint_1_var_1);
		return $retract_spypoint_1_1(m);
	}

	Operation FILE_cafeteria::$retract_spypoint_1_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return $retract_spypoint_1_2(m);
	}

	Operation FILE_cafeteria::$retract_spypoint_1_1(Prolog *m)
	{
	// '$retract_spypoint'(A:B/C):-retract('$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,removed]),!
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$retract_spypoint'(A:B/C):-['$get_level'(D),retract('SxxMachine':'$current_spypoint'(A,B,C)),print_message(info,[spypoint,A:B/C,is,removed]),'$cut'(D)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C(":", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a3->unify(C("/", {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if (!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a2, a4, a5});
		a7 = S("$current_spypoint", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a7});
		a8 = S(":", y2);
		std::vector<Term*> y3 = VA({a4, a5});
		a9 = S("/", y3);
		std::vector<Term*> y4 = VA({a2, a9});
		a10 = S(":", y4);
		a11 = CONS(a10, PRED_$retract_spypoint_1_s11);
		a12 = CONS(ATOM_spypoint, a11);
		return Op([&] (Prolog *e)
		{
		PRED_retract_1_static_exec(e);
		}, VA({a8}), Op([&] (Prolog *e)
		{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, a12}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a6}), cont)));
	}

	Operation FILE_cafeteria::$retract_spypoint_1_2(Prolog *m)
	{
	// '$retract_spypoint'(A):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$retract_spypoint'(A):-[]
		return cont;
	}

	Operation FILE_cafeteria::PRED_nospyall_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// nospyall:-retractall('$current_spypoint'(A,B,C)),'$set_debug_flag'(leap,no)
		m->setB0();
		 Term *a1, *a2;
		Operation p1;
	// nospyall:-[retractall('SxxMachine':'$current_spypoint'(A,B,C)),'$set_debug_flag'(leap,no)]
		std::vector<Term*> y1 = VA({V(m), V(m), V(m)});
		a1 = S("$current_spypoint", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a1});
		a2 = S(":", y2);
		return Op([&] (Prolog *e)
		{
		PRED_retractall_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_$set_debug_flag_2_static_exec(e);
	}, VA({ATOM_leap, ATOM_no}), cont));
	}

SymbolTerm *const FILE_cafeteria::ATOM_leash_specifier = SYM("leash_specifier");
StructureTerm *const FILE_cafeteria::PRED_leash_1_s4 = S("type", ATOM_leash_specifier);

	Operation FILE_cafeteria::PRED_leash_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_cafeteria::leash_1_sub_1);
		return leash_1_1(m);
	}

	Operation FILE_cafeteria::leash_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return leash_1_2(m);
	}

	Operation FILE_cafeteria::leash_1_1(Prolog *m)
	{
	// leash(A):-nonvar(A),'$leash'(A),!
		 Term *a1, *a2;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leash(A):-['$get_level'(B),nonvar(A),'$leash'(A),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(1))
		a1 = a1->dref();
		if ((a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$leash_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a2}), cont));
	}

	Operation FILE_cafeteria::leash_1_2(Prolog *m)
	{
	// leash(A):-illarg(type(leash_specifier),leash(A),1)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leash(A):-[illarg(type(leash_specifier),leash(A),1)]
		std::vector<Term*> y1 = VA({a1});
		a2 = S("leash", y1);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_leash_1_s4, a2, int_1}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$leash_1_s1 = SYM("[]");
SymbolTerm *const FILE_cafeteria::ATOM_leashing = SYM("leashing");
ListTerm *const FILE_cafeteria::PRED_$leash_1_s8 = CONS(ATOM_leashing, PRED_$leash_1_s1);
ListTerm *const FILE_cafeteria::PRED_$leash_1_s9 = CONS(ATOM_no, PRED_$leash_1_s8);
SymbolTerm *const FILE_cafeteria::ATOM_stopping = SYM("stopping");

	Operation FILE_cafeteria::PRED_$leash_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$leash_1_var, FILE_cafeteria::$leash_1_2, FILE_cafeteria::$leash_1_2, FILE_cafeteria::$leash_1_var, FILE_cafeteria::$leash_1_2, FILE_cafeteria::$leash_1_2);
	}

	Operation FILE_cafeteria::$leash_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$leash_1_var_1);
		return $leash_1_1(m);
	}

	Operation FILE_cafeteria::$leash_1_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return $leash_1_2(m);
	}

	Operation FILE_cafeteria::$leash_1_1(Prolog *m)
	{
	// '$leash'([]):-!,retractall('$current_leash'(A)),print_message(info,[no,leashing])
		 Term *a1, *a2, *a3;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$leash'([]):-['$neck_cut',retractall('SxxMachine':'$current_leash'(A)),print_message(info,[no,leashing])]
		if (!PRED_$leash_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		std::vector<Term*> y1 = VA({V(m)});
		a2 = S("$current_leash", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a2});
		a3 = S(":", y2);
		return Op([&] (Prolog *e)
		{
		PRED_retractall_1_static_exec(e);
		}, VA({a3}), Op([&] (Prolog *e)
		{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, PRED_$leash_1_s9}), cont));
	}

	Operation FILE_cafeteria::$leash_1_2(Prolog *m)
	{
	// '$leash'(A):-retractall('$current_leash'(B)),'$assert_leash'(A),print_message(info,[leashing,stopping,on,A])
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$leash'(A):-[retractall('SxxMachine':'$current_leash'(B)),'$assert_leash'(A),print_message(info,[leashing,stopping,on,A])]
		std::vector<Term*> y1 = VA({V(m)});
		a2 = S("$current_leash", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a2});
		a3 = S(":", y2);
		a4 = CONS(a1, PRED_$leash_1_s1);
		a5 = CONS(ATOM_on, a4);
		a6 = CONS(ATOM_stopping, a5);
		a7 = CONS(ATOM_leashing, a6);
		return Op([&] (Prolog *e)
		{
		PRED_retractall_1_static_exec(e);
		}, VA({a3}), Op([&] (Prolog *e)
		{
		PRED_$assert_leash_1_static_exec(e);
	}, VA({a1}), Op([&] (Prolog *e)
	{
		PRED_print_message_2_static_exec(e);
	}, VA({ATOM_info, a7}), cont)));
	}

SymbolTerm *const FILE_cafeteria::PRED_$assert_leash_1_s1 = SYM("[]");

	Operation FILE_cafeteria::PRED_$assert_leash_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$assert_leash_1_var, fail_0, fail_0, FILE_cafeteria::$assert_leash_1_1, fail_0, FILE_cafeteria::$assert_leash_1_2);
	}

	Operation FILE_cafeteria::$assert_leash_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$assert_leash_1_var_1);
		return $assert_leash_1_1(m);
	}

	Operation FILE_cafeteria::$assert_leash_1_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return $assert_leash_1_2(m);
	}

	Operation FILE_cafeteria::$assert_leash_1_1(Prolog *m)
	{
	// '$assert_leash'([]):-!
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$assert_leash'([]):-['$neck_cut']
		if (!PRED_$assert_leash_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$assert_leash_1_2(Prolog *m)
	{
	// '$assert_leash'([A|B]):-'$leash_specifier'(A),assertz('$current_leash'(A)),'$assert_leash'(B)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$assert_leash'([A|B]):-['$leash_specifier'(A),assertz('SxxMachine':'$current_leash'(A)),'$assert_leash'(B)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a2 = argz[0];
			a3 = argz[1];
		}
		else if (a1->isVar())
		{
			a2 = V(m);
			a3 = V(m);
			 a1->bind(CONS(a2, a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({a2});
		a4 = S("$current_leash", y1);
		std::vector<Term*> y2 = VA({ATOM_SxxMachine$002Ebuiltin, a4});
		a5 = S(":", y2);
		return Op([&] (Prolog *e)
		{
		PRED_$leash_specifier_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_assertz_1_static_exec(e);
	}, VA({a5}), Op([&] (Prolog *e)
	{
		PRED_$assert_leash_1_static_exec(e);
	}, VA({a3}), cont)));
	}

SymbolTerm *const FILE_cafeteria::PRED_$leash_specifier_1_s1 = SYM("call");

	Operation FILE_cafeteria::PRED_$leash_specifier_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$leash_specifier_1_var, fail_0, fail_0, FILE_cafeteria::$leash_specifier_1_var, fail_0, fail_0);
	}

	Operation FILE_cafeteria::$leash_specifier_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$leash_specifier_1_var_1);
		return $leash_specifier_1_1(m);
	}

	Operation FILE_cafeteria::$leash_specifier_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$leash_specifier_1_var_2);
		return $leash_specifier_1_2(m);
	}

	Operation FILE_cafeteria::$leash_specifier_1_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$leash_specifier_1_var_3);
		return $leash_specifier_1_3(m);
	}

	Operation FILE_cafeteria::$leash_specifier_1_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return $leash_specifier_1_4(m);
	}

	Operation FILE_cafeteria::$leash_specifier_1_1(Prolog *m)
	{
	// '$leash_specifier'(call):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$leash_specifier'(call):-[]
		if (!PRED_$leash_specifier_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_cafeteria::$leash_specifier_1_2(Prolog *m)
	{
	// '$leash_specifier'(exit):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$leash_specifier'(exit):-[]
		if (!ATOM_exit->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_cafeteria::$leash_specifier_1_3(Prolog *m)
	{
	// '$leash_specifier'(redo):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$leash_specifier'(redo):-[]
		if (!ATOM_redo->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_cafeteria::$leash_specifier_1_4(Prolog *m)
	{
	// '$leash_specifier'(fail):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$leash_specifier'(fail):-[]
		if (!ATOM_fail->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_cafeteria::PRED_listing_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// listing:-context_module(A),'$listing'(B,A)
		m->setB0();
		 Term *a1;
		Operation p1;
	// listing:-[context_module(A),'$listing'(B,A)]
		a1 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_context_module_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$listing_2_static_exec(e);
	}, VA({V(m), a1}), cont));
	}

SymbolTerm *const FILE_cafeteria::PRED_listing_1_s1 = SYM("var");
SymbolTerm *const FILE_cafeteria::ATOM_predicate_indicator = SYM("predicate_indicator");
StructureTerm *const FILE_cafeteria::PRED_listing_1_s9 = S("type", ATOM_predicate_indicator);

	Operation FILE_cafeteria::PRED_listing_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::listing_1_var, FILE_cafeteria::listing_1_int, FILE_cafeteria::listing_1_int, FILE_cafeteria::listing_1_int, FILE_cafeteria::listing_1_var, FILE_cafeteria::listing_1_int);
	}

	Operation FILE_cafeteria::listing_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::listing_1_var_1);
		return listing_1_1(m);
	}

	Operation FILE_cafeteria::listing_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::listing_1_var_2);
		return listing_1_2(m);
	}

	Operation FILE_cafeteria::listing_1_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::listing_1_var_3);
		return listing_1_3(m);
	}

	Operation FILE_cafeteria::listing_1_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::listing_1_var_4);
		return listing_1_4(m);
	}

	Operation FILE_cafeteria::listing_1_var_4(Prolog *m)
	{
		m->trust(nullptr);
		return listing_1_5(m);
	}

	Operation FILE_cafeteria::listing_1_int(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::listing_1_int_1);
		return listing_1_1(m);
	}

	Operation FILE_cafeteria::listing_1_int_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::listing_1_int_2);
		return listing_1_2(m);
	}

	Operation FILE_cafeteria::listing_1_int_2(Prolog *m)
	{
		m->trust(nullptr);
		return listing_1_5(m);
	}

	Operation FILE_cafeteria::listing_1_1(Prolog *m)
	{
	// listing(A):-var(A),!,illarg(var,listing(A),1)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// listing(A):-['$get_level'(B),var(A),'$cut'(B),illarg(var,listing(A),1)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if (!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({a1});
		a3 = S("listing", y1);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_listing_1_s1, a3, int_1}), cont);
	}

	Operation FILE_cafeteria::listing_1_2(Prolog *m)
	{
	// listing(A):-atom(A),!,'$listing'(B,A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// listing(A):-['$get_level'(B),atom(A),'$cut'(B),'$listing'(C,A)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(1))
		a1 = a1->dref();
		if (!(a1->isSymbol()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$listing_2_static_exec(e);
		}, VA({V(m), a1}), cont);
	}

	Operation FILE_cafeteria::listing_1_3(Prolog *m)
	{
	// listing(A/B):-context_module(C),!,'$listing'(A/B,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// listing(A/B):-['$get_level'(C),context_module(D),'$cut'(C),'$listing'(A/B,D)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C("/", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
		std::vector<Term*> y1 = VA({a2, a3});
		a6 = S("/", y1);
		return Op([&] (Prolog *e)
		{
		PRED_context_module_1_static_exec(e);
		}, VA({a5}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a4}), Op([&] (Prolog *e)
	{
		PRED_$listing_2_static_exec(e);
	}, VA({a6, a5}), cont)));
	}

	Operation FILE_cafeteria::listing_1_4(Prolog *m)
	{
	// listing(A:B):-atom(A),!,'$listing'(B,A)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// listing(A:B):-['$get_level'(C),atom(A),'$cut'(C),'$listing'(B,A)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C(":", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(2))
		a2 = a2->dref();
		if (!(a2->isSymbol()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$listing_2_static_exec(e);
		}, VA({a3, a2}), cont);
	}

	Operation FILE_cafeteria::listing_1_5(Prolog *m)
	{
	// listing(A):-illarg(type(predicate_indicator),listing(A),1)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// listing(A):-[illarg(type(predicate_indicator),listing(A),1)]
		std::vector<Term*> y1 = VA({a1});
		a2 = S("listing", y1);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_listing_1_s9, a2, int_1}), cont);
	}

StructureTerm *const FILE_cafeteria::PRED_$listing_2_s5 = S("type", ATOM_predicate_indicator);

	Operation FILE_cafeteria::PRED_$listing_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$listing_2_var, FILE_cafeteria::$listing_2_int, FILE_cafeteria::$listing_2_int, FILE_cafeteria::$listing_2_int, FILE_cafeteria::$listing_2_var, FILE_cafeteria::$listing_2_int);
	}

	Operation FILE_cafeteria::$listing_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$listing_2_var_1);
		return $listing_2_1(m);
	}

	Operation FILE_cafeteria::$listing_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$listing_2_var_2);
		return $listing_2_2(m);
	}

	Operation FILE_cafeteria::$listing_2_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return $listing_2_3(m);
	}

	Operation FILE_cafeteria::$listing_2_int(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$listing_2_int_1);
		return $listing_2_1(m);
	}

	Operation FILE_cafeteria::$listing_2_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return $listing_2_3(m);
	}

	Operation FILE_cafeteria::$listing_2_1(Prolog *m)
	{
	// '$listing'(A,B):-var(A),!,'$listing_dynamic_clause'(B,C)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$listing'(A,B):-['$get_level'(C),var(A),'$cut'(C),'$listing_dynamic_clause'(B,D)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if (!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$listing_dynamic_clause_2_static_exec(e);
		}, VA({a2, V(m)}), cont);
	}

	Operation FILE_cafeteria::$listing_2_2(Prolog *m)
	{
	// '$listing'(A/B,C):-atom(A),integer(B),!,'$listing_dynamic_clause'(C,A/B)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$listing'(A/B,C):-['$get_level'(D),atom(A),integer(B),'$cut'(D),'$listing_dynamic_clause'(C,A/B)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C("/", {a3, a4}), m->trail))
			{
				return m->fail();
			}
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(3))
		a3 = a3->dref();
		if (!(a3->isSymbol()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of integer(a(4))
		a4 = a4->dref();
		if (!(a4->isInteger()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
				  m->cut(a5->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({a3, a4});
		a6 = S("/", y1);
		return Op([&] (Prolog *e)
		{
		PRED_$listing_dynamic_clause_2_static_exec(e);
		}, VA({a2, a6}), cont);
	}

	Operation FILE_cafeteria::$listing_2_3(Prolog *m)
	{
	// '$listing'(A,B):-illarg(type(predicate_indicator),listing(B:A),1)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$listing'(A,B):-[illarg(type(predicate_indicator),listing(B:A),1)]
		std::vector<Term*> y1 = VA({a2, a1});
		a3 = S(":", y1);
		std::vector<Term*> y2 = VA({a3});
		a4 = S("listing", y2);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_$listing_2_s5, a4, int_1}), cont);
	}

	Operation FILE_cafeteria::PRED_$listing_dynamic_clause_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_cafeteria::$listing_dynamic_clause_2_sub_1);
		return $listing_dynamic_clause_2_1(m);
	}

	Operation FILE_cafeteria::$listing_dynamic_clause_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $listing_dynamic_clause_2_2(m);
	}

	Operation FILE_cafeteria::$listing_dynamic_clause_2_1(Prolog *m)
	{
	// '$listing_dynamic_clause'(A,B):-'$new_internal_database'(A),hash_keys(A,C),'$builtin_member'(B,C),B=D/E,functor(F,D,E),'$clause_internal'(A,B,F,G,H),'$write_dynamic_clause'(A,G),fail
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation p1, p2, p3, p4, p5, p6, p7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$listing_dynamic_clause'(A,B):-['$new_internal_database'(A),hash_keys(A,C),'$builtin_member'(B,C),'$unify'(B,D/E),functor(F,D,E),'$clause_internal'(A,B,F,G,H),'$write_dynamic_clause'(A,G),fail]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		std::vector<Term*> y1 = VA({a4, a5});
		a6 = S("/", y1);
		a7 = V(m);
		a8 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_$new_internal_database_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_hash_keys_2_static_exec(e);
	}, VA({a1, a3}), Op([&] (Prolog *e)
	{
		PRED_$builtin_member_2_static_exec(e);
	}, VA({a2, a3}), Op([&] (Prolog *e)
	{
		PRED_$unify_2_static_exec(e);
	}, VA({a2, a6}), Op([&] (Prolog *e)
	{
		PRED_functor_3_static_exec(e);
	}, VA({a7, a4, a5}), Op([&] (Prolog *e)
	{
		PRED_$clause_internal_5_static_exec(e);
	}, VA({a1, a2, a7, a8, V(m)}), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_clause_2_static_exec(e);
	}, VA({a1, a8}), Op(fail_0, VA(), cont))))))));
	}

	Operation FILE_cafeteria::$listing_dynamic_clause_2_2(Prolog *m)
	{
	// '$listing_dynamic_clause'(A,B):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$listing_dynamic_clause'(A,B):-[]
		return cont;
	}

SymbolTerm *const FILE_cafeteria::ATOM_$002E = SYM(".");
SymbolTerm *const FILE_cafeteria::ATOM_$0020$003A$002D = SYM(" :-");
IntegerTerm *const FILE_cafeteria::int_8 = optional<int>(8);

	Operation FILE_cafeteria::PRED_$write_dynamic_clause_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_cafeteria::$write_dynamic_clause_2_sub_1);
		return $write_dynamic_clause_2_1(m);
	}

	Operation FILE_cafeteria::$write_dynamic_clause_2_sub_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$write_dynamic_clause_2_sub_2);
		return $write_dynamic_clause_2_2(m);
	}

	Operation FILE_cafeteria::$write_dynamic_clause_2_sub_2(Prolog *m)
	{
		m->trust(nullptr);
		return $write_dynamic_clause_2_3(m);
	}

	Operation FILE_cafeteria::$write_dynamic_clause_2_1(Prolog *m)
	{
	// '$write_dynamic_clause'(A,B):-var(B),!,fail
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_clause'(A,B):-['$get_level'(C),var(B),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if (!(a2->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_cafeteria::$write_dynamic_clause_2_2(Prolog *m)
	{
	// '$write_dynamic_clause'(A,(B:-true)):-!,numbervars(B,0,C),'$write_dynamic_head'(A,B),write('.'),nl
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_clause'(A,(B:-true)):-['$neck_cut',numbervars(B,0,C),'$write_dynamic_head'(A,B),write('.'),nl]
		a2 = a2->dref();
			a3 = V(m);
			if (!a2->unify(C(":-", {a3, Prolog::True}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_numbervars_3_static_exec(e);
		}, VA({a3, int_0, V(m)}), Op([&] (Prolog *e)
		{
		PRED_$write_dynamic_head_2_static_exec(e);
	}, VA({a1, a3}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$002E}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont))));
	}

	Operation FILE_cafeteria::$write_dynamic_clause_2_3(Prolog *m)
	{
	// '$write_dynamic_clause'(A,(B:-C)):-!,numbervars((B:-C),0,D),'$write_dynamic_head'(A,B),write(' :-'),nl,'$write_dynamic_body'(C,8),write('.'),nl
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3, p4, p5, p6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_clause'(A,(B:-C)):-['$neck_cut',numbervars((B:-C),0,D),'$write_dynamic_head'(A,B),write(' :-'),nl,'$write_dynamic_body'(C,8),write('.'),nl]
		a2 = a2->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a2->unify(C(":-", {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		std::vector<Term*> y1 = VA({a3, a4});
		a5 = S(":-", y1);
		return Op([&] (Prolog *e)
		{
		PRED_numbervars_3_static_exec(e);
		}, VA({a5, int_0, V(m)}), Op([&] (Prolog *e)
		{
		PRED_$write_dynamic_head_2_static_exec(e);
	}, VA({a1, a3}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$0020$003A$002D}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_body_2_static_exec(e);
	}, VA({a4, int_8}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$002E}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont)))))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$write_dynamic_head_2_s1 = SYM(":");

	Operation FILE_cafeteria::PRED_$write_dynamic_head_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_cafeteria::$write_dynamic_head_2_sub_1);
		return $write_dynamic_head_2_1(m);
	}

	Operation FILE_cafeteria::$write_dynamic_head_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $write_dynamic_head_2_2(m);
	}

	Operation FILE_cafeteria::$write_dynamic_head_2_1(Prolog *m)
	{
	// '$write_dynamic_head'(A,B):-context_module(A),!,writeq(B)
		 Term *a1, *a2, *a3;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_head'(A,B):-['$get_level'(C),context_module(A),'$cut'(C),writeq(B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_context_module_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_writeq_1_static_exec(e);
	}, VA({a2}), cont)));
	}

	Operation FILE_cafeteria::$write_dynamic_head_2_2(Prolog *m)
	{
	// '$write_dynamic_head'(A,B):-write(A),write(:),writeq(B)
		 Term *a1, *a2;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_head'(A,B):-[write(A),write(:),writeq(B)]
		return Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
	}, VA({PRED_$write_dynamic_head_2_s1}), Op([&] (Prolog *e)
	{
		PRED_writeq_1_static_exec(e);
	}, VA({a2}), cont)));
	}

IntegerTerm *const FILE_cafeteria::int_4 = optional<int>(4);
SymbolTerm *const FILE_cafeteria::ATOM_$0028 = SYM("(");
SymbolTerm *const FILE_cafeteria::ATOM_or = SYM(";");
SymbolTerm *const FILE_cafeteria::ATOM_$0029 = SYM(")");
SymbolTerm *const FILE_cafeteria::ATOM_$002D$003E = SYM("->");

	Operation FILE_cafeteria::PRED_$write_dynamic_body_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return $write_dynamic_body_2_top(m);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$write_dynamic_body_2_var, FILE_cafeteria::$write_dynamic_body_2_4, FILE_cafeteria::$write_dynamic_body_2_4, FILE_cafeteria::$write_dynamic_body_2_4, FILE_cafeteria::$write_dynamic_body_2_var, FILE_cafeteria::$write_dynamic_body_2_4);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::$write_dynamic_body_2_var_1);
		return $write_dynamic_body_2_1(m);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$write_dynamic_body_2_var_2);
		return $write_dynamic_body_2_2(m);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$write_dynamic_body_2_var_3);
		return $write_dynamic_body_2_3(m);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return $write_dynamic_body_2_4(m);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_1(Prolog *m)
	{
	// '$write_dynamic_body'((A,B),C):-!,'$write_dynamic_body'(A,C),write(','),nl,'$write_dynamic_body'(B,C)
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_body'((A,B),C):-['$neck_cut','$write_dynamic_body'(A,C),write(','),nl,'$write_dynamic_body'(B,C)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C(",", {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p3 = Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
		}, VA({ATOM_$002C}), Op([&] (Prolog *e)
		{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_body_2_static_exec(e);
	}, VA({a4, a2}), cont)));
		m->AREGS[0] = a3;
		m->AREGS[1] = a2;
		m->cont = p3;
		return $write_dynamic_body_2_top(m);
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_2(Prolog *m)
	{
	// '$write_dynamic_body'((A;B),C):-!,D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(;),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_body'((A;B),C):-['$neck_cut',D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(;),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C(";", {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a5 = V(m);
		std::vector<Term*> y1 = VA({a2, int_4});
		a6 = S("+", y1);
		//START inline expansion of a(5)is a(6)
		if (!a5->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_tab_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$0028}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_body_2_static_exec(e);
	}, VA({a3, a5}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_or}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_body_2_static_exec(e);
	}, VA({a4, a5}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$0029}), cont))))))))))));
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_3(Prolog *m)
	{
	// '$write_dynamic_body'((A->B),C):-!,D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(->),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_body'((A->B),C):-['$neck_cut',D is C+4,tab(C),write('('),nl,'$write_dynamic_body'(A,D),nl,tab(C),write(->),nl,'$write_dynamic_body'(B,D),nl,tab(C),write(')')]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C("->", {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a5 = V(m);
		std::vector<Term*> y1 = VA({a2, int_4});
		a6 = S("+", y1);
		//START inline expansion of a(5)is a(6)
		if (!a5->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_tab_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$0028}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_body_2_static_exec(e);
	}, VA({a3, a5}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$002D$003E}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_$write_dynamic_body_2_static_exec(e);
	}, VA({a4, a5}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (Prolog *e)
	{
		PRED_tab_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_write_1_static_exec(e);
	}, VA({ATOM_$0029}), cont))))))))))));
	}

	Operation FILE_cafeteria::$write_dynamic_body_2_4(Prolog *m)
	{
	// '$write_dynamic_body'(A,B):-tab(B),writeq(A)
		 Term *a1, *a2;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_dynamic_body'(A,B):-[tab(B),writeq(A)]
		return Op([&] (Prolog *e)
		{
		PRED_tab_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_writeq_1_static_exec(e);
	}, VA({a1}), cont));
	}

SymbolTerm *const FILE_cafeteria::PRED_print_message_2_s1 = SYM("var");
SymbolTerm *const FILE_cafeteria::ATOM_error = SYM("error");
SymbolTerm *const FILE_cafeteria::ATOM_$007B = SYM("{");
SymbolTerm *const FILE_cafeteria::ATOM_$007D = SYM("}");
SymbolTerm *const FILE_cafeteria::ATOM_$007BWARNING$003A$0020 = SYM("{WARNING: ");

	Operation FILE_cafeteria::PRED_print_message_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::print_message_2_var, FILE_cafeteria::print_message_2_1, FILE_cafeteria::print_message_2_1, FILE_cafeteria::print_message_2_var, FILE_cafeteria::print_message_2_1, FILE_cafeteria::print_message_2_1);
	}

	Operation FILE_cafeteria::print_message_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_cafeteria::print_message_2_var_1);
		return print_message_2_1(m);
	}

	Operation FILE_cafeteria::print_message_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::print_message_2_var_2);
		return print_message_2_2(m);
	}

	Operation FILE_cafeteria::print_message_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::print_message_2_var_3);
		return print_message_2_3(m);
	}

	Operation FILE_cafeteria::print_message_2_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return print_message_2_4(m);
	}

	Operation FILE_cafeteria::print_message_2_1(Prolog *m)
	{
	// print_message(A,B):-var(A),!,illarg(var,print_message(A,B),1)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// print_message(A,B):-['$get_level'(C),var(A),'$cut'(C),illarg(var,print_message(A,B),1)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if (!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({a1, a2});
		a4 = S("print_message", y1);
		return Op([&] (Prolog *e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({PRED_print_message_2_s1, a4, int_1}), cont);
	}

	Operation FILE_cafeteria::print_message_2_2(Prolog *m)
	{
	// print_message(error,A):-!,'$error_message'(A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// print_message(error,A):-['$neck_cut','$error_message'(A)]
		if (!ATOM_error->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$error_message_1_static_exec(e);
		}, VA({a2}), cont);
	}

	Operation FILE_cafeteria::print_message_2_3(Prolog *m)
	{
	// print_message(info,A):-!,'$fast_write'('{'),'$builtin_message'(A),'$fast_write'('}'),nl
		 Term *a1, *a2;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// print_message(info,A):-['$neck_cut','$fast_write'('{'),'$builtin_message'(A),'$fast_write'('}'),nl]
		if (!ATOM_info->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
		}, VA({ATOM_$007B}), Op([&] (Prolog *e)
		{
		PRED_$builtin_message_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont))));
	}

	Operation FILE_cafeteria::print_message_2_4(Prolog *m)
	{
	// print_message(warning,A):-!,'$fast_write'('{WARNING: '),'$builtin_message'(A),'$fast_write'('}'),nl
		 Term *a1, *a2;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// print_message(warning,A):-['$neck_cut','$fast_write'('{WARNING: '),'$builtin_message'(A),'$fast_write'('}'),nl]
		if (!ATOM_warning->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
		}, VA({ATOM_$007BWARNING$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$builtin_message_1_static_exec(e);
	}, VA({a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_0_static_exec(e);
	}, VA(), cont))));
	}

SymbolTerm *const FILE_cafeteria::PRED_nl_0_s1 = SYM("user_output");

	Operation FILE_cafeteria::PRED_nl_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// nl:-nl(user_output)
		m->setB0();
	// nl:-[nl(user_output)]
		return Op([&] (Prolog *e)
		{
		PRED_nl_1_static_exec(e);
		}, VA({PRED_nl_0_s1}), cont);
	}

SymbolTerm *const FILE_cafeteria::PRED_$builtin_message_1_s1 = SYM("[]");

	Operation FILE_cafeteria::PRED_$builtin_message_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$builtin_message_1_var, fail_0, fail_0, FILE_cafeteria::$builtin_message_1_1, fail_0, FILE_cafeteria::$builtin_message_1_lis);
	}

	Operation FILE_cafeteria::$builtin_message_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$builtin_message_1_var_1);
		return $builtin_message_1_1(m);
	}

	Operation FILE_cafeteria::$builtin_message_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$builtin_message_1_var_2);
		return $builtin_message_1_2(m);
	}

	Operation FILE_cafeteria::$builtin_message_1_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return $builtin_message_1_3(m);
	}

	Operation FILE_cafeteria::$builtin_message_1_lis(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$builtin_message_1_lis_1);
		return $builtin_message_1_2(m);
	}

	Operation FILE_cafeteria::$builtin_message_1_lis_1(Prolog *m)
	{
		m->trust(nullptr);
		return $builtin_message_1_3(m);
	}

	Operation FILE_cafeteria::$builtin_message_1_1(Prolog *m)
	{
	// '$builtin_message'([]):-!
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$builtin_message'([]):-['$neck_cut']
		if (!PRED_$builtin_message_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_cafeteria::$builtin_message_1_2(Prolog *m)
	{
	// '$builtin_message'([A]):-!,write(A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$builtin_message'([A]):-['$neck_cut',write(A)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a2 = argz[0];
			if (!PRED_$builtin_message_1_s1->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a1->isVar())
		{
			a2 = V(m);
			 a1->bind(CONS(a2, PRED_$builtin_message_1_s1), m->trail);
		}
		else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
		}, VA({a2}), cont);
	}

	Operation FILE_cafeteria::$builtin_message_1_3(Prolog *m)
	{
	// '$builtin_message'([A|B]):-write(A),'$fast_write'(' '),'$builtin_message'(B)
		 Term *a1, *a2, *a3;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$builtin_message'([A|B]):-[write(A),'$fast_write'(' '),'$builtin_message'(B)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a2 = argz[0];
			a3 = argz[1];
		}
		else if (a1->isVar())
		{
			a2 = V(m);
			a3 = V(m);
			 a1->bind(CONS(a2, a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		return Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
		}, VA({a2}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_1_static_exec(e);
	}, VA({ATOM_$0020}), Op([&] (Prolog *e)
	{
		PRED_$builtin_message_1_static_exec(e);
	}, VA({a3}), cont)));
	}

SymbolTerm *const FILE_cafeteria::ATOM_user_error = SYM("user_error");
SymbolTerm *const FILE_cafeteria::ATOM_$007BINSTANTIATION$0020ERROR$003A$0020 = SYM("{INSTANTIATION ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$0020$002D$0020arg$0020 = SYM(" - arg ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BTYPE$0020ERROR$003A$0020 = SYM("{TYPE ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$003A$0020expected$0020 = SYM(": expected ");
SymbolTerm *const FILE_cafeteria::ATOM_$002C$0020found$0020 = SYM(", found ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BDOMAIN$0020ERROR$003A$0020 = SYM("{DOMAIN ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BEXISTENCE$0020ERROR$003A$0020 = SYM("{EXISTENCE ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$0020does$0020not$0020exist = SYM(" does not exist");
SymbolTerm *const FILE_cafeteria::ATOM_$003A$0020 = SYM(": ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BPERMISSION$0020ERROR$003A$0020 = SYM("{PERMISSION ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$0020$002D$0020can$0020not$0020 = SYM(" - can not ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BREPRESENTATION$0020ERROR$003A$0020 = SYM("{REPRESENTATION ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$003A$0020limit$0020of$0020 = SYM(": limit of ");
SymbolTerm *const FILE_cafeteria::ATOM_$0020is$0020breached = SYM(" is breached");
SymbolTerm *const FILE_cafeteria::ATOM_$007BEVALUATION$0020ERROR$003A$0020 = SYM("{EVALUATION ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BSYNTAX$0020ERROR$003A$0020 = SYM("{SYNTAX ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BSYSTEM$0020ERROR$003A$0020 = SYM("{SYSTEM ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BINTERNAL$0020ERROR$003A$0020 = SYM("{INTERNAL ERROR: ");
SymbolTerm *const FILE_cafeteria::ATOM_$007BJAVA$0020ERROR$003A$0020 = SYM("{JAVA ERROR: ");

	Operation FILE_cafeteria::PRED_$error_message_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_cafeteria::$error_message_1_var, FILE_cafeteria::$error_message_1_14, FILE_cafeteria::$error_message_1_14, FILE_cafeteria::$error_message_1_14, FILE_cafeteria::$error_message_1_var, FILE_cafeteria::$error_message_1_14);
	}

	Operation FILE_cafeteria::$error_message_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_cafeteria::$error_message_1_var_1);
		return $error_message_1_1(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_2);
		return $error_message_1_2(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_3);
		return $error_message_1_3(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_4);
		return $error_message_1_4(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_5);
		return $error_message_1_5(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_6);
		return $error_message_1_6(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_7);
		return $error_message_1_7(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_7(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_8);
		return $error_message_1_8(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_8(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_9);
		return $error_message_1_9(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_9(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_10);
		return $error_message_1_10(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_10(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_11);
		return $error_message_1_11(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_11(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_12);
		return $error_message_1_12(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_12(Prolog *m)
	{
		m->retry(nullptr, FILE_cafeteria::$error_message_1_var_13);
		return $error_message_1_13(m);
	}

	Operation FILE_cafeteria::$error_message_1_var_13(Prolog *m)
	{
		m->trust(nullptr);
		return $error_message_1_14(m);
	}

	Operation FILE_cafeteria::$error_message_1_1(Prolog *m)
	{
	// '$error_message'(instantiation_error(A,0)):-!,'$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2;
		Operation p1, p2, p3, p4;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(instantiation_error(A,0)):-['$neck_cut','$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			if (!a1->unify(C("instantiation_error", {a2, int_0}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BINSTANTIATION$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))));
	}

	Operation FILE_cafeteria::$error_message_1_2(Prolog *m)
	{
	// '$error_message'(instantiation_error(A,B)):-!,'$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3, p4, p5, p6;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(instantiation_error(A,B)):-['$neck_cut','$fast_write'(user_error,'{INSTANTIATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C("instantiation_error", {a2, a3}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BINSTANTIATION$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))))));
	}

	Operation FILE_cafeteria::$error_message_1_3(Prolog *m)
	{
	// '$error_message'(type_error(A,B,C,D)):-!,'$fast_write'(user_error,'{TYPE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(type_error(A,B,C,D)):-['$neck_cut','$fast_write'(user_error,'{TYPE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C("type_error", {a2, a3, a4, a5}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BTYPE$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$003A$0020expected$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$002C$0020found$0020}), Op([&] (Prolog *e)
	{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a5}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_4(Prolog *m)
	{
	// '$error_message'(domain_error(A,B,C,D)):-!,'$fast_write'(user_error,'{DOMAIN ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(domain_error(A,B,C,D)):-['$neck_cut','$fast_write'(user_error,'{DOMAIN ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C("domain_error", {a2, a3, a4, a5}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BDOMAIN$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$003A$0020expected$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$002C$0020found$0020}), Op([&] (Prolog *e)
	{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a5}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_5(Prolog *m)
	{
	// '$error_message'(existence_error(A,0,B,C,D)):-!,'$fast_write'(user_error,'{EXISTENCE ERROR: '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),write(user_error,C),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3;
		Operation p1, p2, p3, p4, p5, p6, p7;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(existence_error(A,0,B,C,D)):-['$neck_cut','$fast_write'(user_error,'{EXISTENCE ERROR: '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),write(user_error,C),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C("existence_error", V(m), int_0, a2, a3, V(m)), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BEXISTENCE$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020}), Op([&] (Prolog *e)
	{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020does$0020not$0020exist}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont))))))));
	}

	Operation FILE_cafeteria::$error_message_1_6(Prolog *m)
	{
	// '$error_message'(existence_error(A,B,C,D,E)):-!,'$fast_write'(user_error,'{EXISTENCE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(existence_error(A,B,C,D,E)):-['$neck_cut','$fast_write'(user_error,'{EXISTENCE ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,' does not exist'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C("existence_error", {a2, a3, a4, a5, V(m)}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BEXISTENCE$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$003A$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020}), Op([&] (Prolog *e)
	{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a5}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020does$0020not$0020exist}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont))))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_7(Prolog *m)
	{
	// '$error_message'(permission_error(A,B,C,D,E)):-!,'$fast_write'(user_error,'{PERMISSION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - can not '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,': '),'$fast_write'(user_error,E),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(permission_error(A,B,C,D,E)):-['$neck_cut','$fast_write'(user_error,'{PERMISSION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - can not '),'$fast_write'(user_error,B),'$fast_write'(user_error,' '),'$fast_write'(user_error,C),'$fast_write'(user_error,' '),write(user_error,D),'$fast_write'(user_error,': '),'$fast_write'(user_error,E),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			a6 = V(m);
			if (!a1->unify(C("permission_error", {a2, a3, a4, a5, a6}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BPERMISSION$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020can$0020not$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020}), Op([&] (Prolog *e)
	{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a5}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$003A$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a6}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_8(Prolog *m)
	{
	// '$error_message'(representation_error(A,B,C)):-!,'$fast_write'(user_error,'{REPRESENTATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': limit of '),'$fast_write'(user_error,C),'$fast_write'(user_error,' is breached'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(representation_error(A,B,C)):-['$neck_cut','$fast_write'(user_error,'{REPRESENTATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': limit of '),'$fast_write'(user_error,C),'$fast_write'(user_error,' is breached'),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C("representation_error", {a2, a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BREPRESENTATION$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$003A$0020limit$0020of$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020is$0020breached}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_9(Prolog *m)
	{
	// '$error_message'(evaluation_error(A,B,C)):-!,'$fast_write'(user_error,'{EVALUATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$fast_write'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3, p4, p5, p6, p7, p8;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(evaluation_error(A,B,C)):-['$neck_cut','$fast_write'(user_error,'{EVALUATION ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$fast_write'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C("evaluation_error", {a2, a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BEVALUATION$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$002C$0020found$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))))))));
	}

	Operation FILE_cafeteria::$error_message_1_10(Prolog *m)
	{
	// '$error_message'(syntax_error(A,B,C,D,E)):-!,'$fast_write'(user_error,'{SYNTAX ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(syntax_error(A,B,C,D,E)):-['$neck_cut','$fast_write'(user_error,'{SYNTAX ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,': expected '),'$fast_write'(user_error,C),'$fast_write'(user_error,', found '),write(user_error,D),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C("syntax_error", {a2, a3, a4, a5, V(m)}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BSYNTAX$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$003A$0020expected$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$002C$0020found$0020}), Op([&] (Prolog *e)
	{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a5}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_11(Prolog *m)
	{
	// '$error_message'(system_error(A)):-!,'$fast_write'(user_error,'{SYSTEM ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2;
		Operation p1, p2, p3, p4;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(system_error(A)):-['$neck_cut','$fast_write'(user_error,'{SYSTEM ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			if (!a1->unify(C("system_error", {a2}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BSYSTEM$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))));
	}

	Operation FILE_cafeteria::$error_message_1_12(Prolog *m)
	{
	// '$error_message'(internal_error(A)):-!,'$fast_write'(user_error,'{INTERNAL ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1, *a2;
		Operation p1, p2, p3, p4;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(internal_error(A)):-['$neck_cut','$fast_write'(user_error,'{INTERNAL ERROR: '),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			if (!a1->unify(C("internal_error", {a2}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BINTERNAL$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))));
	}

	Operation FILE_cafeteria::$error_message_1_13(Prolog *m)
	{
	// '$error_message'(java_error(A,B,C)):-!,'$fast_write'(user_error,'{JAVA ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$write_goal'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),'$print_stack_trace'(C),flush_output(user_error)
		 Term *a1, *a2, *a3, *a4;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(java_error(A,B,C)):-['$neck_cut','$fast_write'(user_error,'{JAVA ERROR: '),'$write_goal'(user_error,A),'$fast_write'(user_error,' - arg '),'$fast_write'(user_error,B),'$fast_write'(user_error,', found '),'$write_goal'(user_error,C),'$fast_write'(user_error,'}'),nl(user_error),'$print_stack_trace'(C),flush_output(user_error)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C("java_error", {a2, a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007BJAVA$0020ERROR$003A$0020}), Op([&] (Prolog *e)
		{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a2}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$0020$002D$0020arg$0020}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, a3}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$002C$0020found$0020}), Op([&] (Prolog *e)
	{
		PRED_$write_goal_2_static_exec(e);
	}, VA({ATOM_user_error, a4}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_$print_stack_trace_1_static_exec(e);
	}, VA({a4}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont))))))))));
	}

	Operation FILE_cafeteria::$error_message_1_14(Prolog *m)
	{
	// '$error_message'(A):-'$fast_write'(user_error,'{'),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)
		 Term *a1;
		Operation p1, p2, p3, p4;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$error_message'(A):-['$fast_write'(user_error,'{'),write(user_error,A),'$fast_write'(user_error,'}'),nl(user_error),flush_output(user_error)]
		return Op([&] (Prolog *e)
		{
		PRED_$fast_write_2_static_exec(e);
		}, VA({ATOM_user_error, ATOM_$007B}), Op([&] (Prolog *e)
		{
		PRED_write_2_static_exec(e);
	}, VA({ATOM_user_error, a1}), Op([&] (Prolog *e)
	{
		PRED_$fast_write_2_static_exec(e);
	}, VA({ATOM_user_error, ATOM_$007D}), Op([&] (Prolog *e)
	{
		PRED_nl_1_static_exec(e);
	}, VA({ATOM_user_error}), Op([&] (Prolog *e)
	{
		PRED_flush_output_1_static_exec(e);
	}, VA({ATOM_user_error}), cont)))));
	}

SymbolTerm *const FILE_cafeteria::PRED_$write_goal_1_s1 = SYM("user_error");

	Operation FILE_cafeteria::PRED_$write_goal_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_cafeteria::$write_goal_1_sub_1);
		return $write_goal_1_1(m);
	}

	Operation FILE_cafeteria::$write_goal_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $write_goal_1_2(m);
	}

	Operation FILE_cafeteria::$write_goal_1_1(Prolog *m)
	{
	// '$write_goal'(A):-java(A),!,'$write_toString'(user_error,A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$write_goal'(A):-['$get_level'(B),java(A),'$cut'(B),'$write_toString'(user_error,A)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of java(a(1))
		a1 = a1->dref();
		if (!(a1->isFFIObject()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$write_toString_2_static_exec(e);
		}, VA({PRED_$write_goal_1_s1, a1}), cont);
	}

	Operation FILE_cafeteria::$write_goal_1_2(Prolog *m)
	{
	// '$write_goal'(A):-write(A)
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$write_goal'(A):-[write(A)]
		return Op([&] (Prolog *e)
		{
		PRED_write_1_static_exec(e);
		}, VA({a1}), cont);
	}

	Operation FILE_cafeteria::PRED_$write_goal_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_cafeteria::$write_goal_2_sub_1);
		return $write_goal_2_1(m);
	}

	Operation FILE_cafeteria::$write_goal_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $write_goal_2_2(m);
	}

	Operation FILE_cafeteria::$write_goal_2_1(Prolog *m)
	{
	// '$write_goal'(A,B):-java(B),!,'$write_toString'(A,B)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_goal'(A,B):-['$get_level'(C),java(B),'$cut'(C),'$write_toString'(A,B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of java(a(2))
		a2 = a2->dref();
		if (!(a2->isFFIObject()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$write_toString_2_static_exec(e);
		}, VA({a1, a2}), cont);
	}

	Operation FILE_cafeteria::$write_goal_2_2(Prolog *m)
	{
	// '$write_goal'(A,B):-write(A,B)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$write_goal'(A,B):-[write(A,B)]
		return Op([&] (Prolog *e)
		{
		PRED_write_2_static_exec(e);
		}, VA({a1, a2}), cont);
	}

	FILE_cafeteria::StaticConstructor::StaticConstructor()
	{
	loadPreds();
	}

FILE_cafeteria::StaticConstructor FILE_cafeteria::staticConstructor;

	void FILE_cafeteria::loadPreds()
	{
	   PredTable::registerBuiltin("cafeteria",0,FILE_cafeteria::PRED_cafeteria_0_static_exec);
	   PredTable::registerBuiltin("$cafeteria_init",0,FILE_cafeteria::PRED_$cafeteria_init_0_static_exec);
	   PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl",1,FILE_cafeteria::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec);
	   PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl","$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl",1,FILE_cafeteria::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_1_static_exec);
	   PredTable::registerBuiltin("$toplvel_loop",0,FILE_cafeteria::PRED_$toplvel_loop_0_static_exec);
	   PredTable::registerBuiltin("$cafeteria",1,FILE_cafeteria::PRED_$cafeteria_1_static_exec);
	   PredTable::registerBuiltin("$process_order",2,FILE_cafeteria::PRED_$process_order_2_static_exec);
	   PredTable::registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl","$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl",3,FILE_cafeteria::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec);
	   PredTable::registerBuiltin("$rm_redundant_vars",2,FILE_cafeteria::PRED_$rm_redundant_vars_2_static_exec);
	   PredTable::registerBuiltin("$give_answers_with_prompt",1,FILE_cafeteria::PRED_$give_answers_with_prompt_1_static_exec);
	   PredTable::registerBuiltin("$give_an_answer",1,FILE_cafeteria::PRED_$give_an_answer_1_static_exec);
	   PredTable::registerBuiltin("$print_an answer","$print_an$0020answer",1,FILE_cafeteria::PRED_$print_an$0020answer_1_static_exec);
	   PredTable::registerBuiltin("consult",1,FILE_cafeteria::PRED_consult_1_static_exec);
	   PredTable::registerBuiltin("$consult",1,FILE_cafeteria::PRED_$consult_1_static_exec);
	   PredTable::registerBuiltin("$prolog_file_name",2,FILE_cafeteria::PRED_$prolog_file_name_2_static_exec);
	   PredTable::registerBuiltin("trace",0,FILE_cafeteria::PRED_trace_0_static_exec);
	   PredTable::registerBuiltin("$trace_init",0,FILE_cafeteria::PRED_$trace_init_0_static_exec);
	   PredTable::registerBuiltin("notrace",0,FILE_cafeteria::PRED_notrace_0_static_exec);
	   PredTable::registerBuiltin("debug",0,FILE_cafeteria::PRED_debug_0_static_exec);
	   PredTable::registerBuiltin("nodebug",0,FILE_cafeteria::PRED_nodebug_0_static_exec);
	   PredTable::registerBuiltin("$trace_goal",1,FILE_cafeteria::PRED_$trace_goal_1_static_exec);
	   PredTable::registerBuiltin("$trace_goal",4,FILE_cafeteria::PRED_$trace_goal_4_static_exec);
	   PredTable::registerBuiltin("print_procedure_box",5,FILE_cafeteria::PRED_print_procedure_box_5_static_exec);
	   PredTable::registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl","$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl",6,FILE_cafeteria::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_6_static_exec);
	   PredTable::registerBuiltin("redo_procedure_box",4,FILE_cafeteria::PRED_redo_procedure_box_4_static_exec);
	   PredTable::registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/builtin/cafeteria.pl","$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl",3,FILE_cafeteria::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbuiltin$002Fcafeteria$002Epl_3_static_exec);
	   PredTable::registerBuiltin("$read_blocked",1,FILE_cafeteria::PRED_$read_blocked_1_static_exec);
	   PredTable::registerBuiltin("$debug_option",2,FILE_cafeteria::PRED_$debug_option_2_static_exec);
	   PredTable::registerBuiltin("$show_debug_option",0,FILE_cafeteria::PRED_$show_debug_option_0_static_exec);
	   PredTable::registerBuiltin("$set_debug_flag",2,FILE_cafeteria::PRED_$set_debug_flag_2_static_exec);
	   PredTable::registerBuiltin("spy",1,FILE_cafeteria::PRED_spy_1_static_exec);
	   PredTable::registerBuiltin("$assert_spypoint",1,FILE_cafeteria::PRED_$assert_spypoint_1_static_exec);
	   PredTable::registerBuiltin("nospy",1,FILE_cafeteria::PRED_nospy_1_static_exec);
	   PredTable::registerBuiltin("$retract_spypoint",1,FILE_cafeteria::PRED_$retract_spypoint_1_static_exec);
	   PredTable::registerBuiltin("nospyall",0,FILE_cafeteria::PRED_nospyall_0_static_exec);
	   PredTable::registerBuiltin("leash",1,FILE_cafeteria::PRED_leash_1_static_exec);
	   PredTable::registerBuiltin("$leash",1,FILE_cafeteria::PRED_$leash_1_static_exec);
	   PredTable::registerBuiltin("$assert_leash",1,FILE_cafeteria::PRED_$assert_leash_1_static_exec);
	   PredTable::registerBuiltin("$leash_specifier",1,FILE_cafeteria::PRED_$leash_specifier_1_static_exec);
	   PredTable::registerBuiltin("listing",0,FILE_cafeteria::PRED_listing_0_static_exec);
	   PredTable::registerBuiltin("listing",1,FILE_cafeteria::PRED_listing_1_static_exec);
	   PredTable::registerBuiltin("$listing",2,FILE_cafeteria::PRED_$listing_2_static_exec);
	   PredTable::registerBuiltin("$listing_dynamic_clause",2,FILE_cafeteria::PRED_$listing_dynamic_clause_2_static_exec);
	   PredTable::registerBuiltin("$write_dynamic_clause",2,FILE_cafeteria::PRED_$write_dynamic_clause_2_static_exec);
	   PredTable::registerBuiltin("$write_dynamic_head",2,FILE_cafeteria::PRED_$write_dynamic_head_2_static_exec);
	   PredTable::registerBuiltin("$write_dynamic_body",2,FILE_cafeteria::PRED_$write_dynamic_body_2_static_exec);
	   PredTable::registerBuiltin("print_message",2,FILE_cafeteria::PRED_print_message_2_static_exec);
	   PredTable::registerBuiltin("nl",0,FILE_cafeteria::PRED_nl_0_static_exec);
	   PredTable::registerBuiltin("$builtin_message",1,FILE_cafeteria::PRED_$builtin_message_1_static_exec);
	   PredTable::registerBuiltin("$error_message",1,FILE_cafeteria::PRED_$error_message_1_static_exec);
	   PredTable::registerBuiltin("$write_goal",1,FILE_cafeteria::PRED_$write_goal_1_static_exec);
	   PredTable::registerBuiltin("$write_goal",2,FILE_cafeteria::PRED_$write_goal_2_static_exec);
	}
}
