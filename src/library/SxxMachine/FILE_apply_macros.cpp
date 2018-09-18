using namespace std;

#include "FILE_apply_macros.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine
{
//	import static SxxMachine.FILE_builtins.PRED_$greater_or_equal_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_callable_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_compound_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_current_prolog_flag_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_nonvar_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_sub_atom_5_static_exec;
//	import static SxxMachine.FILE_swi_supp.PRED_append_3_static_exec;
//	import static SxxMachine.FILE_swi_supp.PRED_strip_module_3_static_exec;
//	import static SxxMachine.Failure.fail_0;
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_$univ_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_arg_3_static_exec;
//	import static SxxMachine.bootpreds.PRED_functor_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_$expand_closure_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_$skip_list_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_compile_aux_clauses_1_static_exec;
//	import static SxxMachine.sxxtensions.PRED_compound_name_arguments_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_compound_name_arity_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_f2_pos_6_static_exec;
//	import static SxxMachine.sxxtensions.PRED_format_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_predicate_property_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_prolog_load_context_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_string_1_static_exec;
//	import static SxxMachine.sxxtensions.PRED_string_codes_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_type_error_2_static_exec;
	using Arithmetic = SxxMachine::Arithmetic;
	using FILE_builtins = SxxMachine::FILE_builtins;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using PredTable = SxxMachine::PredTable;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;

	Operation FILE_apply_macros::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry(9, nullptr, FILE_apply_macros::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(m);
	}

	Operation FILE_apply_macros::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(m);
	}

	Operation FILE_apply_macros::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(Prolog *m)
	{
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-A=B:C,!,strip_module(A,D,E),F=D:G,H=D:I
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		a8 = m->AREGS[7];
		a9 = m->AREGS[8];
		cont = m->cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),'$unify'(A,B:C),'$cut'(J),strip_module(A,D,E),'$unify'(F,D:G),'$unify'(H,D:I)]
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a2, a3});
		a11 = S(":", y1);
		//START inline expansion of $unify(a(1),a(11))
		if (!a1->unify(a11, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(10))
		a10 = a10->dref();
		m->cut(a10->intValue());
		//END inline expansion
		std::vector<Term*> y2 = VA({a4, a7});
		a12 = S(":", y2);
		std::vector<Term*> y3 = VA({a4, a9});
		a13 = S(":", y3);
		return Op([&] (Prolog *e)
		{
		PRED_strip_module_3_static_exec(e);
		}, VA({a1, a4, a5}), Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a6, a12}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a8, a13}), cont)));
	}

	Operation FILE_apply_macros::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(Prolog *m)
	{
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-E=A,F=G,H=I
		Term *a1, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		a8 = m->AREGS[7];
		a9 = m->AREGS[8];
		cont = m->cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-['$unify'(E,A),'$unify'(F,G),'$unify'(H,I)]
		//START inline expansion of $unify(a(5),a(1))
		if (!a5->unify(a1, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(6),a(7))
		if (!a6->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(8),a(9))
		if (!a8->unify(a9, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_transparent = SYM("transparent");

	Operation FILE_apply_macros::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_apply_macros::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_1(m);
	}

	Operation FILE_apply_macros::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_2(m);
	}

	Operation FILE_apply_macros::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_1(Prolog *m)
	{
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B):-predicate_property(B:A,transparent),!,fail
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B):-['$get_level'(C),predicate_property(B:A,transparent),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a2, a1});
		a4 = S(":", y1);
		return Op([&] (Prolog *e)
		{
		PRED_predicate_property_2_static_exec(e);
		}, VA({a4, ATOM_transparent}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), Op(fail_0, VA(), cont)));
	}

	Operation FILE_apply_macros::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B):-[]
		return cont;
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_defined = SYM("defined");

	Operation FILE_apply_macros::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry(22, nullptr, FILE_apply_macros::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_1(m);
	}

	Operation FILE_apply_macros::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_2(m);
	}

	Operation FILE_apply_macros::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_1(Prolog *m)
	{
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V):-predicate_property(J:A,defined),!,true
		Term *a1, *a10, *a23, *a24;
		Operation cont;
		a1 = m->AREGS[0];
		a10 = m->AREGS[9];
		cont = m->cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V):-['$get_level'(W),predicate_property(J:A,defined),'$cut'(W)]
		a23 = V(m);
		//START inline expansion of $get_level(a(23))
		if (!a23->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y1 = VA({a10, a1});
		a24 = S(":", y1);
		return Op([&] (Prolog *e)
		{
		PRED_predicate_property_2_static_exec(e);
		}, VA({a24, ATOM_defined}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a23}), cont));
	}

	Operation FILE_apply_macros::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_2(Prolog *m)
	{
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V):-empty_lists(B,K),length(L,F),append(K,L,M),N=..[I|M],heads_and_tails(B,O,H,P),append(O,G,Q),R=..[I|Q],append(G,H,S),D=..[E|S],append(P,G,T),U=..[I|T],V=(R:-C,U),compile_aux_clauses([N,V])
		Term *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a11, *a12, *a13, *a14, *a15, *a16, *a17, *a18, *a19, *a20, *a21, *a22, *a23, *a24, *a25, *a26, *a27, *a28, *a29, *a30;
		Operation cont;
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		a8 = m->AREGS[7];
		a9 = m->AREGS[8];
		a11 = m->AREGS[10];
		a12 = m->AREGS[11];
		a13 = m->AREGS[12];
		a14 = m->AREGS[13];
		a15 = m->AREGS[14];
		a16 = m->AREGS[15];
		a17 = m->AREGS[16];
		a18 = m->AREGS[17];
		a19 = m->AREGS[18];
		a20 = m->AREGS[19];
		a21 = m->AREGS[20];
		a22 = m->AREGS[21];
		cont = m->cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V):-[empty_lists(B,K),length(L,F),append(K,L,M),'$univ'(N,[I|M]),heads_and_tails(B,O,H,P),append(O,G,Q),'$univ'(R,[I|Q]),append(G,H,S),'$univ'(D,[E|S]),append(P,G,T),'$univ'(U,[I|T]),'$unify'(V,(R:-C,U)),compile_aux_clauses([N,V])]
		a23 = CONS(a9, a13);
		a24 = CONS(a9, a17);
		a25 = CONS(a5, a19);
		a26 = CONS(a9, a20);
		std::vector<Term*> y1 = VA({a3, a21});
		a27 = S(",", y1);
		std::vector<Term*> y2 = VA({a18, a27});
		a28 = S(":-", y2);
		a29 = CONS(a22, Prolog::Nil);
		a30 = CONS(a14, a29);
		return Op([&] (Prolog *e)
		{
		PRED_empty_lists_2_static_exec(e);
		}, VA({a2, a11}), Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_length_2_static_exec(e);
	}, VA({a12, a6}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a11, a12, a13}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a14, a23}), Op([&] (Prolog *e)
	{
		PRED_heads_and_tails_4_static_exec(e);
	}, VA({a2, a15, a8, a16}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a15, a7, a17}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a18, a24}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a7, a8, a19}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a4, a25}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a16, a7, a20}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a21, a26}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a22, a28}), Op([&] (Prolog *e)
	{
		PRED_compile_aux_clauses_1_static_exec(e);
	}, VA({a30}), cont)))))))))))));
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::int_1 = optional<int>(1);
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM___aux_maplist$002F$007Ed_$007Ew$002B$007Ed = SYM("__aux_maplist/~d_~w+~d");
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_module = SYM("module");

	Operation FILE_apply_macros::PRED_expand_maplist_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// expand_maplist(A,B,C):-length(B,D),expand_closure_no_fail(A,D,E),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(E,F,G,H,I,J,K,L,M),I=..[M|N],length(N,O),length(P,O),length(Q,D),R is D+1,format(atom(S),'__aux_maplist/~d_~w+~d',[R,L,O]),append(B,N,T),C=..[S|T],U is D+O,prolog_load_context(module,V),functor(K,M,U),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(J,V),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(C,D,J,K,M,O,P,Q,S,V,W,X,Y,Z,A1,B1,C1,D1,E1,F1,G1,H1)
		m->setB0();
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17, *a18, *a19, *a20, *a21, *a22, *a23, *a24, *a25, *a26, *a27;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// expand_maplist(A,B,C):-[length(B,D),expand_closure_no_fail(A,D,E),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(E,F,G,H,I,J,K,L,M),'$univ'(I,[M|N]),length(N,O),length(P,O),length(Q,D),R is D+1,format(atom(S),'__aux_maplist/~d_~w+~d',[R,L,O]),append(B,N,T),'$univ'(C,[S|T]),U is D+O,prolog_load_context(module,V),functor(K,M,U),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(J,V),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(C,D,J,K,M,O,P,Q,S,V,W,X,Y,Z,A1,B1,C1,D1,E1,F1,G1,H1)]
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		a12 = CONS(a10, a11);
		a13 = V(m);
		a14 = V(m);
		a15 = V(m);
		a16 = V(m);
		std::vector<Term*> y1 = VA({a4, int_1});
		a17 = S("+", y1);
		a18 = V(m);
		std::vector<Term*> y2 = VA({a18});
		a19 = S("atom", y2);
		a20 = CONS(a13, Prolog::Nil);
		a21 = CONS(a9, a20);
		a22 = CONS(a16, a21);
		a23 = V(m);
		a24 = CONS(a18, a23);
		a25 = V(m);
		std::vector<Term*> y3 = VA({a4, a13});
		a26 = S("+", y3);
		a27 = V(m);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_length_2_static_exec(e);
		}, VA({a2, a4}), Op([&] (Prolog *e)
		{
		PRED_expand_closure_no_fail_3_static_exec(e);
	}, VA({a1, a4, a5}), Op([&] (Prolog *e)
	{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(e);
	}, VA({a5, V(m), V(m), V(m), a6, a7, a8, a9, a10}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a6, a12}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_length_2_static_exec(e);
	}, VA({a11, a13}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_length_2_static_exec(e);
	}, VA({a14, a13}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_length_2_static_exec(e);
	}, VA({a15, a4}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a16, a17}), Op([&] (Prolog *e)
	{
		PRED_format_3_static_exec(e);
	}, VA({a19, ATOM___aux_maplist$002F$007Ed_$007Ew$002B$007Ed, a22}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a2, a11, a23}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a3, a24}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a25, a26}), Op([&] (Prolog *e)
	{
		PRED_prolog_load_context_2_static_exec(e);
	}, VA({ATOM_module, a27}), Op([&] (Prolog *e)
	{
		PRED_functor_3_static_exec(e);
	}, VA({a8, a10, a25}), Op([&] (Prolog *e)
	{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_static_exec(e);
	}, VA({a7, a27}), Op([&] (Prolog *e)
	{
		PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_static_exec(e);
	}, VA({a3, a4, a7, a8, a10, a13, a14, a15, a18, a27, V(m), V(m), V(m), V(m), V(m), V(m), V(m), V(m), V(m), V(m), V(m), V(m)}), cont))))))))))))))));
	}

	Operation FILE_apply_macros::PRED_expand_closure_no_fail_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_apply_macros::expand_closure_no_fail_3_sub_1);
		return expand_closure_no_fail_3_1(m);
	}

	Operation FILE_apply_macros::expand_closure_no_fail_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return expand_closure_no_fail_3_2(m);
	}

	Operation FILE_apply_macros::expand_closure_no_fail_3_1(Prolog *m)
	{
		// expand_closure_no_fail(A,B,C):-'$expand_closure'(A,B,C),!
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// expand_closure_no_fail(A,B,C):-['$get_level'(D),'$expand_closure'(A,B,C),'$cut'(D)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$expand_closure_3_static_exec(e);
		}, VA({a1, a2, a3}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a4}), cont));
	}

	Operation FILE_apply_macros::expand_closure_no_fail_3_2(Prolog *m)
	{
		// expand_closure_no_fail(A,B,A):-true
		Term *a1, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// expand_closure_no_fail(A,B,A):-[]
		if (!a1->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::PRED_empty_lists_2_s1 = optional<int>(0);

	Operation FILE_apply_macros::PRED_empty_lists_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return empty_lists_2_top(m);
	}

	Operation FILE_apply_macros::empty_lists_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::empty_lists_2_var, FILE_apply_macros::empty_lists_2_var, FILE_apply_macros::empty_lists_2_2, FILE_apply_macros::empty_lists_2_2, FILE_apply_macros::empty_lists_2_2, FILE_apply_macros::empty_lists_2_2);
	}

	Operation FILE_apply_macros::empty_lists_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_apply_macros::empty_lists_2_var_1);
		return empty_lists_2_1(m);
	}

	Operation FILE_apply_macros::empty_lists_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return empty_lists_2_2(m);
	}

	Operation FILE_apply_macros::empty_lists_2_1(Prolog *m)
	{
		// empty_lists(0,[]):-!
		Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// empty_lists(0,[]):-['$neck_cut']
		if (!PRED_empty_lists_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_apply_macros::empty_lists_2_2(Prolog *m)
	{
		// empty_lists(A,[[]|B]):-C is A-1,empty_lists(C,B)
		Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// empty_lists(A,[[]|B]):-[C is A-1,empty_lists(C,B)]
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			if (!Prolog::Nil->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a3 = argz[1];
		}
		else if (a2->isVar())
		{
			a3 = V(m);
			a2->bind(CONS(Prolog::Nil, a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		a4 = V(m);
		std::vector<Term*> y1 = VA({a1, int_1});
		a5 = S("-", y1);
		//START inline expansion of a(4)is a(5)
		if (!a4->unify(Arithmetic::evaluate(a5), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a3;
		m->cont = cont;
		return empty_lists_2_top(m);
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::PRED_heads_and_tails_4_s1 = optional<int>(0);

	Operation FILE_apply_macros::PRED_heads_and_tails_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return heads_and_tails_4_top(m);
	}

	Operation FILE_apply_macros::heads_and_tails_4_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::heads_and_tails_4_var, FILE_apply_macros::heads_and_tails_4_var, FILE_apply_macros::heads_and_tails_4_2, FILE_apply_macros::heads_and_tails_4_2, FILE_apply_macros::heads_and_tails_4_2, FILE_apply_macros::heads_and_tails_4_2);
	}

	Operation FILE_apply_macros::heads_and_tails_4_var(Prolog *m)
	{
		m->jtry4(nullptr, FILE_apply_macros::heads_and_tails_4_var_1);
		return heads_and_tails_4_1(m);
	}

	Operation FILE_apply_macros::heads_and_tails_4_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return heads_and_tails_4_2(m);
	}

	Operation FILE_apply_macros::heads_and_tails_4_1(Prolog *m)
	{
		// heads_and_tails(0,[],[],[]):-true
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// heads_and_tails(0,[],[],[]):-[]
		if (!PRED_heads_and_tails_4_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::Nil->unify(a3, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::Nil->unify(a4, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::heads_and_tails_4_2(Prolog *m)
	{
		// heads_and_tails(A,[[B|C]|D],[B|E],[C|F]):-G is A-1,heads_and_tails(G,D,E,F)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// heads_and_tails(A,[[B|C]|D],[B|E],[C|F]):-[G is A-1,heads_and_tails(G,D,E,F)]
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			a5 = argz[0];
			a6 = argz[1];
		}
		else if (a2->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			a2->bind(CONS(a5, a6), m->trail);
		}
		else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if (a5->isCons())
		{
			std::vector<Term*> argz = VA({a5->car(), a5->cdr()});
			a7 = argz[0];
			a8 = argz[1];
		}
		else if (a5->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			a5->bind(CONS(a7, a8), m->trail);
		}
		else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			if (!a7->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a9 = argz[1];
		}
		else if (a3->isVar())
		{
			a9 = V(m);
			a3->bind(CONS(a7, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if (a4->isCons())
		{
			std::vector<Term*> argz = VA({a4->car(), a4->cdr()});
			if (!a8->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a10 = argz[1];
		}
		else if (a4->isVar())
		{
			a10 = V(m);
			a4->bind(CONS(a8, a10), m->trail);
		}
		else
		{
			return m->fail();
		}
		a11 = V(m);
		std::vector<Term*> y1 = VA({a1, int_1});
		a12 = S("-", y1);
		//START inline expansion of a(11)is a(12)
		if (!a11->unify(Arithmetic::evaluate(a12), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a11;
		m->AREGS[1] = a6;
		m->AREGS[2] = a9;
		m->AREGS[3] = a10;
		m->cont = cont;
		return heads_and_tails_4_top(m);
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_expand_apply_2_s1 = SYM("maplist");
SxxMachine::IntegerTerm *const FILE_apply_macros::int_2 = optional<int>(2);

	Operation FILE_apply_macros::PRED_expand_apply_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// expand_apply(A,B):-compound(A),compound_name_arity(A,maplist,C),C>=2,A=..[maplist,D|E],qcall_instantiated(D),!,expand_maplist(D,E,B)
		m->setB0();
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		a1 = LARG[0];
		a2 = LARG[1];
		// expand_apply(A,B):-['$get_level'(C),compound(A),compound_name_arity(A,maplist,D),E is 2,'$greater_or_equal'(D,E),'$univ'(A,[maplist,F|G]),qcall_instantiated(F),'$cut'(C),expand_maplist(F,G,B)]
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
		a7 = V(m);
		a8 = CONS(a6, a7);
		a9 = CONS(PRED_expand_apply_2_s1, a8);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_compound_name_arity_3_static_exec(e);
	}, VA({a1, PRED_expand_apply_2_s1, a4}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a5, int_2}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$greater_or_equal_2_static_exec(e);
	}, VA({a4, a5}), Op([&] (Prolog *e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({a1, a9}), Op([&] (Prolog *e)
	{
		PRED_qcall_instantiated_1_static_exec(e);
	}, VA({a6}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), Op([&] (Prolog *e)
	{
		PRED_expand_maplist_3_static_exec(e);
	}, VA({a6, a7, a2}), cont))))))));
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::int_0 = optional<int>(0);

	Operation FILE_apply_macros::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry8(nullptr, FILE_apply_macros::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_sub_1);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_1(m);
	}

	Operation FILE_apply_macros::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_2(m);
	}

	Operation FILE_apply_macros::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_1(Prolog *m)
	{
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H):-(nonvar(A),A=term_position(C,D,E,F,[G,H])),!,B=term_position(0,0,0,0,[term_position(0,0,0,0,[G,term_position(0,0,0,0,[H])])])
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17, *a18, *a19;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		a8 = m->AREGS[7];
		cont = m->cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H):-['$get_level'(I),nonvar(A),'$unify'(A,term_position(C,D,E,F,[G,H])),'$cut'(I),'$unify'(B,term_position(0,0,0,0,[term_position(0,0,0,0,[G,term_position(0,0,0,0,[H])])]))]
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9->unifyInt(m->B0, m->trail))
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
		a10 = CONS(a8, Prolog::Nil);
		a11 = CONS(a7, a10);
		std::vector<Term*> y1 = VA({a3, a4, a5, a6, a11});
		a12 = S("term_position", y1);
		//START inline expansion of $unify(a(1),a(12))
		if (!a1->unify(a12, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(9))
		a9 = a9->dref();
		m->cut(a9->intValue());
		//END inline expansion
		a13 = CONS(a8, Prolog::Nil);
		std::vector<Term*> y2 = VA({int_0, int_0, int_0, int_0, a13});
		a14 = S("term_position", y2);
		a15 = CONS(a14, Prolog::Nil);
		a16 = CONS(a7, a15);
		std::vector<Term*> y3 = VA({int_0, int_0, int_0, int_0, a16});
		a17 = S("term_position", y3);
		a18 = CONS(a17, Prolog::Nil);
		std::vector<Term*> y4 = VA({int_0, int_0, int_0, int_0, a18});
		a19 = S("term_position", y4);
		//START inline expansion of $unify(a(2),a(19))
		if (!a2->unify(a19, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_apply_macros::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H):-[]
		return cont;
	}

	Operation FILE_apply_macros::PRED_expand_apply_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::expand_apply_4_var, FILE_apply_macros::expand_apply_4_4, FILE_apply_macros::expand_apply_4_4, FILE_apply_macros::expand_apply_4_4, FILE_apply_macros::expand_apply_4_var, FILE_apply_macros::expand_apply_4_4);
	}

	Operation FILE_apply_macros::expand_apply_4_var(Prolog *m)
	{
		m->jtry4(nullptr, FILE_apply_macros::expand_apply_4_var_1);
		return expand_apply_4_1(m);
	}

	Operation FILE_apply_macros::expand_apply_4_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::expand_apply_4_var_2);
		return expand_apply_4_2(m);
	}

	Operation FILE_apply_macros::expand_apply_4_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::expand_apply_4_var_3);
		return expand_apply_4_3(m);
	}

	Operation FILE_apply_macros::expand_apply_4_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return expand_apply_4_4(m);
	}

	Operation FILE_apply_macros::expand_apply_4_1(Prolog *m)
	{
		// expand_apply(forall(A,B),C,D,E):-D=(\+ (A,\+B)),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(C,E,F,G,H,I,J,K)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// expand_apply(forall(A,B),C,D,E):-['$unify'(D,\+ (A,\+B)),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(C,E,F,G,H,I,J,K)]
		a1 = a1->dref();
		a5 = V(m);
		a6 = V(m);
		if (!a1->unify(C("forall", {a5, a6}), m->trail))
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({a6});
		a7 = S("\\+", y1);
		std::vector<Term*> y2 = VA({a5, a7});
		a8 = S(",", y2);
		std::vector<Term*> y3 = VA({a8});
		a9 = S("\\+", y3);
		//START inline expansion of $unify(a(3),a(9))
		if (!a3->unify(a9, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_static_exec(e);
		}, VA({a2, a4, V(m), V(m), V(m), V(m), V(m), V(m)}), cont);
	}

	Operation FILE_apply_macros::expand_apply_4_2(Prolog *m)
	{
		// expand_apply(once(A),B,C,D):-C=(A->true),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(B,D,E,F,G,H,I,J,K)
		Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// expand_apply(once(A),B,C,D):-['$unify'(C,(A->true)),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(B,D,E,F,G,H,I,J,K)]
		a1 = a1->dref();
		a5 = V(m);
		if (!a1->unify(C("once", {a5}), m->trail))
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({a5, Prolog::True});
		a6 = S("->", y1);
		//START inline expansion of $unify(a(3),a(6))
		if (!a3->unify(a6, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(e);
		}, VA({a2, a4, V(m), V(m), V(m), V(m), V(m), V(m), V(m)}), cont);
	}

	Operation FILE_apply_macros::expand_apply_4_3(Prolog *m)
	{
		// expand_apply(ignore(A),B,C,D):-C=(A->true;true),'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(B,D,E,F,G,H,I,J,K)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// expand_apply(ignore(A),B,C,D):-['$unify'(C,(A->true;true)),'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(B,D,E,F,G,H,I,J,K)]
		a1 = a1->dref();
		a5 = V(m);
		if (!a1->unify(C("ignore", {a5}), m->trail))
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({a5, Prolog::True});
		a6 = S("->", y1);
		std::vector<Term*> y2 = VA({a6, Prolog::True});
		a7 = S(";", y2);
		//START inline expansion of $unify(a(3),a(7))
		if (!a3->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(e);
		}, VA({a2, a4, V(m), V(m), V(m), V(m), V(m), V(m), V(m)}), cont);
	}

	Operation FILE_apply_macros::expand_apply_4_4(Prolog *m)
	{
		// expand_apply(A,B,C,D):-expand_phrase(A,B,C,D),!
		Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// expand_apply(A,B,C,D):-['$get_level'(E),expand_phrase(A,B,C,D),'$cut'(E)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_expand_phrase_4_static_exec(e);
		}, VA({a1, a2, a3, a4}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a5}), cont));
	}

	Operation FILE_apply_macros::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry(9, nullptr, FILE_apply_macros::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(m);
	}

	Operation FILE_apply_macros::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(m);
	}

	Operation FILE_apply_macros::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(Prolog *m)
	{
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-(nonvar(A),A=term_position(C,D,E,F,[G]),compound(G)),!,B=term_position(0,0,0,0,[G,H-I]),arg(2,G,H),I is H+1
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		a8 = m->AREGS[7];
		a9 = m->AREGS[8];
		cont = m->cont;
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),nonvar(A),'$unify'(A,term_position(C,D,E,F,[G])),compound(G),'$cut'(J),'$unify'(B,term_position(0,0,0,0,[G,H-I])),arg(2,G,H),I is H+1]
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10->unifyInt(m->B0, m->trail))
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
		a11 = CONS(a7, Prolog::Nil);
		std::vector<Term*> y1 = VA({a3, a4, a5, a6, a11});
		a12 = S("term_position", y1);
		//START inline expansion of $unify(a(1),a(12))
		if (!a1->unify(a12, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y2 = VA({a8, a9});
		a13 = S("-", y2);
		a14 = CONS(a13, Prolog::Nil);
		a15 = CONS(a7, a14);
		std::vector<Term*> y3 = VA({int_0, int_0, int_0, int_0, a15});
		a16 = S("term_position", y3);
		std::vector<Term*> y4 = VA({a8, int_1});
		a17 = S("+", y4);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a7}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a10}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a2, a16}), Op([&] (Prolog *e)
	{
		PRED_arg_3_static_exec(e);
	}, VA({int_2, a7, a8}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a9, a17}), cont)))));
	}

	Operation FILE_apply_macros::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-[]
		return cont;
	}

	Operation FILE_apply_macros::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry(9, nullptr, FILE_apply_macros::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(m);
	}

	Operation FILE_apply_macros::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(m);
	}

	Operation FILE_apply_macros::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_1(Prolog *m)
	{
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-(nonvar(A),A=term_position(C,D,E,F,[G]),compound(G)),!,B=term_position(0,0,0,0,[term_position(0,0,0,0,[G,H-I]),H-I]),arg(2,G,H),I is H+1
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17, *a18, *a19, *a20, *a21;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		a8 = m->AREGS[7];
		a9 = m->AREGS[8];
		cont = m->cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-['$get_level'(J),nonvar(A),'$unify'(A,term_position(C,D,E,F,[G])),compound(G),'$cut'(J),'$unify'(B,term_position(0,0,0,0,[term_position(0,0,0,0,[G,H-I]),H-I])),arg(2,G,H),I is H+1]
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if (!a10->unifyInt(m->B0, m->trail))
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
		a11 = CONS(a7, Prolog::Nil);
		std::vector<Term*> y1 = VA({a3, a4, a5, a6, a11});
		a12 = S("term_position", y1);
		//START inline expansion of $unify(a(1),a(12))
		if (!a1->unify(a12, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y2 = VA({a8, a9});
		a13 = S("-", y2);
		a14 = CONS(a13, Prolog::Nil);
		a15 = CONS(a7, a14);
		std::vector<Term*> y3 = VA({int_0, int_0, int_0, int_0, a15});
		a16 = S("term_position", y3);
		std::vector<Term*> y4 = VA({a8, a9});
		a17 = S("-", y4);
		a18 = CONS(a17, Prolog::Nil);
		a19 = CONS(a16, a18);
		std::vector<Term*> y5 = VA({int_0, int_0, int_0, int_0, a19});
		a20 = S("term_position", y5);
		std::vector<Term*> y6 = VA({a8, int_1});
		a21 = S("+", y6);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a7}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a10}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a2, a20}), Op([&] (Prolog *e)
	{
		PRED_arg_3_static_exec(e);
	}, VA({int_2, a7, a8}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a9, a21}), cont)))));
	}

	Operation FILE_apply_macros::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D,E,F,G,H,I):-[]
		return cont;
	}

	Operation FILE_apply_macros::PRED_expand_phrase_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// expand_phrase(A,B):-expand_phrase(A,C,B,D)
		m->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// expand_phrase(A,B):-[expand_phrase(A,C,B,D)]
		return Op([&] (Prolog *e)
		{
		PRED_expand_phrase_4_static_exec(e);
		}, VA({a1, V(m), a2, V(m)}), cont);
	}

	Operation FILE_apply_macros::PRED_expand_phrase_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::expand_phrase_4_var, FILE_apply_macros::expand_phrase_4_2, FILE_apply_macros::expand_phrase_4_2, FILE_apply_macros::expand_phrase_4_2, FILE_apply_macros::expand_phrase_4_var, FILE_apply_macros::expand_phrase_4_2);
	}

	Operation FILE_apply_macros::expand_phrase_4_var(Prolog *m)
	{
		m->jtry4(nullptr, FILE_apply_macros::expand_phrase_4_var_1);
		return expand_phrase_4_1(m);
	}

	Operation FILE_apply_macros::expand_phrase_4_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return expand_phrase_4_2(m);
	}

	Operation FILE_apply_macros::expand_phrase_4_1(Prolog *m)
	{
		// expand_phrase(phrase(A,B),C,D,E):-!,extend_pos(C,1,F),expand_phrase(phrase(A,B,[]),F,D,E)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// expand_phrase(phrase(A,B),C,D,E):-['$neck_cut',extend_pos(C,1,F),expand_phrase(phrase(A,B,[]),F,D,E)]
		a1 = a1->dref();
		a5 = V(m);
		a6 = V(m);
		if (!a1->unify(C("phrase", {a5, a6}), m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a7 = V(m);
		std::vector<Term*> y1 = VA({a5, a6, Prolog::Nil});
		a8 = S("phrase", y1);
		return Op([&] (Prolog *e)
		{
		PRED_extend_pos_3_static_exec(e);
		}, VA({a2, int_1, a7}), Op([&] (Prolog *e)
		{
		PRED_expand_phrase_4_static_exec(e);
	}, VA({a8, a7, a3, a4}), cont));
	}

	Operation FILE_apply_macros::expand_phrase_4_2(Prolog *m)
	{
		// expand_phrase(A,B,C,D):-dcg_goal(A,E,F,G),nonvar(E),nt_pos(B,H),dcg_extend(E,H,C,D,F,G)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// expand_phrase(A,B,C,D):-[dcg_goal(A,E,F,G),nonvar(E),nt_pos(B,H),dcg_extend(E,H,C,D,F,G)]
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_dcg_goal_4_static_exec(e);
		}, VA({a1, a5, a6, a7}), Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_nonvar_1_static_exec(e);
	}, VA({a5}), Op([&] (Prolog *e)
	{
		PRED_nt_pos_2_static_exec(e);
	}, VA({a2, a8}), Op([&] (Prolog *e)
	{
		PRED_dcg_extend_6_static_exec(e);
	}, VA({a5, a8, a3, a4, a6, a7}), cont))));
	}

	Operation FILE_apply_macros::PRED_dcg_goal_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::dcg_goal_4_var, fail_0, fail_0, fail_0, FILE_apply_macros::dcg_goal_4_var, fail_0);
	}

	Operation FILE_apply_macros::dcg_goal_4_var(Prolog *m)
	{
		m->jtry4(nullptr, FILE_apply_macros::dcg_goal_4_var_1);
		return dcg_goal_4_1(m);
	}

	Operation FILE_apply_macros::dcg_goal_4_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return dcg_goal_4_2(m);
	}

	Operation FILE_apply_macros::dcg_goal_4_1(Prolog *m)
	{
		// dcg_goal(phrase(A,B,C),A,B,C):-true
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// dcg_goal(phrase(A,B,C),A,B,C):-[]
		a1 = a1->dref();
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		if (!a1->unify(C("phrase", {a5, a6, a7}), m->trail))
		{
			return m->fail();
		}
		if (!a5->unify(a2, m->trail))
		{
			return m->fail();
		}
		if (!a6->unify(a3, m->trail))
		{
			return m->fail();
		}
		if (!a7->unify(a4, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_goal_4_2(Prolog *m)
	{
		// dcg_goal(call_dcg(A,B,C),A,B,C):-true
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// dcg_goal(call_dcg(A,B,C),A,B,C):-[]
		a1 = a1->dref();
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		if (!a1->unify(C("call_dcg", {a5, a6, a7}), m->trail))
		{
			return m->fail();
		}
		if (!a5->unify(a2, m->trail))
		{
			return m->fail();
		}
		if (!a6->unify(a3, m->trail))
		{
			return m->fail();
		}
		if (!a7->unify(a4, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_apply_macros::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_sub_1);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_1(m);
	}

	Operation FILE_apply_macros::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_2(m);
	}

	Operation FILE_apply_macros::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_1(Prolog *m)
	{
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A):-dcg_control(A),!,fail
		Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A):-['$get_level'(B),dcg_control(A),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_dcg_control_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a2}), Op(fail_0, VA(), cont)));
	}

	Operation FILE_apply_macros::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A):-[]
		return cont;
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::PRED_dcg_extend_6_s1 = optional<int>(2);

	Operation FILE_apply_macros::PRED_dcg_extend_6_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry6(nullptr, FILE_apply_macros::dcg_extend_6_sub_1);
		return dcg_extend_6_1(m);
	}

	Operation FILE_apply_macros::dcg_extend_6_sub_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_extend_6_sub_2);
		return dcg_extend_6_2(m);
	}

	Operation FILE_apply_macros::dcg_extend_6_sub_2(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_extend_6_sub_3);
		return dcg_extend_6_3(m);
	}

	Operation FILE_apply_macros::dcg_extend_6_sub_3(Prolog *m)
	{
		m->trust(nullptr);
		return dcg_extend_6_4(m);
	}

	Operation FILE_apply_macros::dcg_extend_6_1(Prolog *m)
	{
		// dcg_extend(A,B,C,D,E,F):-compound(A),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A),!,extend_pos(B,2,D),compound_name_arguments(A,G,H),append(H,[E,F],I),compound_name_arguments(C,G,I)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// dcg_extend(A,B,C,D,E,F):-['$get_level'(G),compound(A),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A),'$cut'(G),extend_pos(B,2,D),compound_name_arguments(A,H,I),append(I,[E,F],J),compound_name_arguments(C,H,J)]
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a8 = V(m);
		a9 = V(m);
		a10 = CONS(a6, Prolog::Nil);
		a11 = CONS(a5, a10);
		a12 = V(m);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec(e);
	}, VA({a1}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a7}), Op([&] (Prolog *e)
	{
		PRED_extend_pos_3_static_exec(e);
	}, VA({a2, PRED_dcg_extend_6_s1, a4}), Op([&] (Prolog *e)
	{
		PRED_compound_name_arguments_3_static_exec(e);
	}, VA({a1, a8, a9}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a9, a11, a12}), Op([&] (Prolog *e)
	{
		PRED_compound_name_arguments_3_static_exec(e);
	}, VA({a3, a8, a12}), cont)))))));
	}

	Operation FILE_apply_macros::dcg_extend_6_2(Prolog *m)
	{
		// dcg_extend(A,B,C,D,E,F):-atom(A),'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A),!,extend_pos(B,2,D),compound_name_arguments(C,A,[E,F])
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// dcg_extend(A,B,C,D,E,F):-['$get_level'(G),atom(A),'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A),'$cut'(G),extend_pos(B,2,D),compound_name_arguments(C,A,[E,F])]
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7->unifyInt(m->B0, m->trail))
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
		a8 = CONS(a6, Prolog::Nil);
		a9 = CONS(a5, a8);
		return Op([&] (Prolog *e)
		{
		PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a7}), Op([&] (Prolog *e)
	{
		PRED_extend_pos_3_static_exec(e);
	}, VA({a2, PRED_dcg_extend_6_s1, a4}), Op([&] (Prolog *e)
	{
		PRED_compound_name_arguments_3_static_exec(e);
	}, VA({a3, a1, a9}), cont))));
	}

	Operation FILE_apply_macros::dcg_extend_6_3(Prolog *m)
	{
		// dcg_extend(A,B,C:D,E,F,G):-compound(A),A=C:H,'$expand':f2_pos(B,I,J,E,I,K),dcg_extend(H,J,D,K,F,G)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// dcg_extend(A,B,C:D,E,F,G):-[compound(A),'$unify'(A,C:H),'$expand':f2_pos(B,I,J,E,I,K),dcg_extend(H,J,D,K,F,G)]
		a3 = a3->dref();
		a7 = V(m);
		a8 = V(m);
		if (!a3->unify(C(":", {a7, a8}), m->trail))
		{
			return m->fail();
		}
		a9 = V(m);
		std::vector<Term*> y1 = VA({a7, a9});
		a10 = S(":", y1);
		a11 = V(m);
		a12 = V(m);
		a13 = V(m);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a1, a10}), Op([&] (Prolog *e)
	{
		PRED_f2_pos_6_static_exec(e);
	}, VA({a2, a11, a12, a4, a11, a13}), Op([&] (Prolog *e)
	{
		PRED_dcg_extend_6_static_exec(e);
	}, VA({a9, a12, a8, a13, a5, a6}), cont))));
	}

	Operation FILE_apply_macros::dcg_extend_6_4(Prolog *m)
	{
		// dcg_extend(A,B,C=D,E,C,F):-terminal(A,D,F),!,t_pos(B,E)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// dcg_extend(A,B,C=D,E,C,F):-['$get_level'(G),terminal(A,D,F),'$cut'(G),t_pos(B,E)]
		a3 = a3->dref();
		a7 = V(m);
		a8 = V(m);
		if (!a3->unify(C("=", {a7, a8}), m->trail))
		{
			return m->fail();
		}
		if (!a7->unify(a5, m->trail))
		{
			return m->fail();
		}
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_terminal_3_static_exec(e);
		}, VA({a1, a8, a6}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a9}), Op([&] (Prolog *e)
	{
		PRED_t_pos_2_static_exec(e);
	}, VA({a2, a4}), cont)));
	}

	Operation FILE_apply_macros::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_apply_macros::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_sub_1);
		return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_1(m);
	}

	Operation FILE_apply_macros::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_2(m);
	}

	Operation FILE_apply_macros::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_1(Prolog *m)
	{
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A):-dcg_control(A),!,fail
		Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A):-['$get_level'(B),dcg_control(A),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if (!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_dcg_control_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a2}), Op(fail_0, VA(), cont)));
	}

	Operation FILE_apply_macros::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A):-[]
		return cont;
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_dcg_control_1_s1 = SYM("!");

	Operation FILE_apply_macros::PRED_dcg_control_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::dcg_control_1_var, fail_0, fail_0, FILE_apply_macros::dcg_control_1_con, FILE_apply_macros::dcg_control_1_str, FILE_apply_macros::dcg_control_1_3);
	}

	Operation FILE_apply_macros::dcg_control_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_apply_macros::dcg_control_1_var_1);
		return dcg_control_1_1(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_2);
		return dcg_control_1_2(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_3);
		return dcg_control_1_3(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_4);
		return dcg_control_1_4(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_5);
		return dcg_control_1_5(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_6);
		return dcg_control_1_6(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_7);
		return dcg_control_1_7(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_7(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_var_8);
		return dcg_control_1_8(m);
	}

	Operation FILE_apply_macros::dcg_control_1_var_8(Prolog *m)
	{
		m->trust(nullptr);
		return dcg_control_1_9(m);
	}

	Operation FILE_apply_macros::dcg_control_1_con(Prolog *m)
	{
		m->jtry1(nullptr, FILE_apply_macros::dcg_control_1_con_1);
		return dcg_control_1_1(m);
	}

	Operation FILE_apply_macros::dcg_control_1_con_1(Prolog *m)
	{
		m->trust(nullptr);
		return dcg_control_1_2(m);
	}

	Operation FILE_apply_macros::dcg_control_1_str(Prolog *m)
	{
		m->jtry1(nullptr, FILE_apply_macros::dcg_control_1_str_1);
		return dcg_control_1_4(m);
	}

	Operation FILE_apply_macros::dcg_control_1_str_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_str_2);
		return dcg_control_1_5(m);
	}

	Operation FILE_apply_macros::dcg_control_1_str_2(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_str_3);
		return dcg_control_1_6(m);
	}

	Operation FILE_apply_macros::dcg_control_1_str_3(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_str_4);
		return dcg_control_1_7(m);
	}

	Operation FILE_apply_macros::dcg_control_1_str_4(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::dcg_control_1_str_5);
		return dcg_control_1_8(m);
	}

	Operation FILE_apply_macros::dcg_control_1_str_5(Prolog *m)
	{
		m->trust(nullptr);
		return dcg_control_1_9(m);
	}

	Operation FILE_apply_macros::dcg_control_1_1(Prolog *m)
	{
		// dcg_control(!):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control(!):-[]
		if (!PRED_dcg_control_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_2(Prolog *m)
	{
		// dcg_control([]):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control([]):-[]
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_3(Prolog *m)
	{
		// dcg_control([A|B]):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control([A|B]):-[]
		a1 = a1->dref();
		if (a1->isCons())
		{
			VA({a1->car(), a1->cdr()});
		}
		else if (a1->isVar())
		{
			a1->bind(CONS(V(m), V(m)), m->trail);
		}
		else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_4(Prolog *m)
	{
		// dcg_control({A}):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control({A}):-[]
		a1 = a1->dref();
		if (!a1->unify(C("{}", V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_5(Prolog *m)
	{
		// dcg_control((A,B)):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control((A,B)):-[]
		a1 = a1->dref();
		if (!a1->unify(C(",", V(m), V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_6(Prolog *m)
	{
		// dcg_control((A;B)):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control((A;B)):-[]
		a1 = a1->dref();
		if (!a1->unify(C(";", V(m), V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_7(Prolog *m)
	{
		// dcg_control((A->B)):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control((A->B)):-[]
		a1 = a1->dref();
		if (!a1->unify(C("->", V(m), V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_8(Prolog *m)
	{
		// dcg_control((A*->B)):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control((A*->B)):-[]
		a1 = a1->dref();
		if (!a1->unify(C("*->", V(m), V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::dcg_control_1_9(Prolog *m)
	{
		// dcg_control(A:B):-true
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// dcg_control(A:B):-[]
		a1 = a1->dref();
		if (!a1->unify(C(":", V(m), V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_s1 = SYM("list");

	Operation FILE_apply_macros::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_1);
		return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_1(m);
	}

	Operation FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_2);
		return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_2(m);
	}

	Operation FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_2(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_3(m);
	}

	Operation FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_1(Prolog *m)
	{
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-var(D),!,B=A,C=D
		Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-['$get_level'(E),var(D),'$cut'(E),'$unify'(B,A),'$unify'(C,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(4))
		a4 = a4->dref();
		if (!(a4->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		//START inline expansion of $unify(a(2),a(1))
		if (!a2->unify(a1, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(3),a(4))
		if (!a3->unify(a4, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_2(Prolog *m)
	{
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-'$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D)
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-['$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D)]
		return Op([&] (Prolog *e)
		{
		PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec(e);
		}, VA({a1, a2, a3, a4}), cont);
	}

	Operation FILE_apply_macros::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_3(Prolog *m)
	{
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-type_error(list,A)
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-[type_error(list,A)]
		return Op([&] (Prolog *e)
		{
		PRED_type_error_2_static_exec(e);
		}, VA({PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_s1, a1}), cont);
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_s1 = SYM("[]");

	Operation FILE_apply_macros::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_apply_macros::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_1);
		return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_1(m);
	}

	Operation FILE_apply_macros::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_2(m);
	}

	Operation FILE_apply_macros::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_1(Prolog *m)
	{
		// '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-D==[],!,append(A,C,B)
		Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-['$get_level'(E),'$equality_of_term'(D,[]),'$cut'(E),append(A,C,B)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if (!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(4),s(1))
		a4 = a4->dref();
		if (!a4->equalsTerm(PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_append_3_static_exec(e);
		}, VA({a1, a3, a2}), cont);
	}

	Operation FILE_apply_macros::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_2(Prolog *m)
	{
		// '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_terminal_3_s1 = SYM("[]");

	Operation FILE_apply_macros::PRED_terminal_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_apply_macros::terminal_3_sub_1);
		return terminal_3_1(m);
	}

	Operation FILE_apply_macros::terminal_3_sub_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::terminal_3_sub_2);
		return terminal_3_2(m);
	}

	Operation FILE_apply_macros::terminal_3_sub_2(Prolog *m)
	{
		m->trust(nullptr);
		return terminal_3_3(m);
	}

	Operation FILE_apply_macros::terminal_3_1(Prolog *m)
	{
		// terminal(A,B,C):-compound(A),A=[D|E],!,'$skip_list'(F,A,G),'$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,G)
		Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// terminal(A,B,C):-['$get_level'(D),compound(A),'$unify'(A,[E|F]),'$cut'(D),'$skip_list'(G,A,H),'$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl'(A,B,C,H)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = CONS(V(m), V(m));
		a6 = V(m);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a1, a5}), Op([&] (Prolog *e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a4}), Op([&] (Prolog *e)
	{
		PRED_$skip_list_3_static_exec(e);
	}, VA({V(m), a1, a6}), Op([&] (Prolog *e)
	{
		PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec(e);
	}, VA({a1, a2, a3, a6}), cont)))));
	}

	Operation FILE_apply_macros::terminal_3_2(Prolog *m)
	{
		// terminal(A,B,C):-A==[],!,B=C
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// terminal(A,B,C):-['$get_level'(D),'$equality_of_term'(A,[]),'$cut'(D),'$unify'(B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),s(1))
		a1 = a1->dref();
		if (!a1->equalsTerm(PRED_terminal_3_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
		m->cut(a4->intValue());
		//END inline expansion
		//START inline expansion of $unify(a(2),a(3))
		if (!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_apply_macros::terminal_3_3(Prolog *m)
	{
		// terminal(A,B,C):-string(A),string_codes(A,D),append(D,C,B)
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// terminal(A,B,C):-[string(A),string_codes(A,D),append(D,C,B)]
		a4 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_string_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_string_codes_2_static_exec(e);
	}, VA({a1, a4}), Op([&] (Prolog *e)
	{
		PRED_append_3_static_exec(e);
	}, VA({a4, a3, a2}), cont)));
	}

	Operation FILE_apply_macros::PRED_extend_pos_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::extend_pos_3_var, FILE_apply_macros::extend_pos_3_1, FILE_apply_macros::extend_pos_3_1, FILE_apply_macros::extend_pos_3_1, FILE_apply_macros::extend_pos_3_var, FILE_apply_macros::extend_pos_3_1);
	}

	Operation FILE_apply_macros::extend_pos_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_apply_macros::extend_pos_3_var_1);
		return extend_pos_3_1(m);
	}

	Operation FILE_apply_macros::extend_pos_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::extend_pos_3_var_2);
		return extend_pos_3_2(m);
	}

	Operation FILE_apply_macros::extend_pos_3_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return extend_pos_3_3(m);
	}

	Operation FILE_apply_macros::extend_pos_3_1(Prolog *m)
	{
		// extend_pos(A,B,A):-var(A),!
		Term *a1, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// extend_pos(A,B,A):-['$get_level'(C),var(A),'$cut'(C)]
		if (!a1->unify(a3, m->trail))
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
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if (!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
		m->cut(a4->intValue());
		//END inline expansion
		return cont;
	}

	Operation FILE_apply_macros::extend_pos_3_2(Prolog *m)
	{
		// extend_pos(term_position(A,B,C,D,E),F,term_position(A,B,C,D,G)):-!,extra_pos(F,B,H),append(E,H,G)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// extend_pos(term_position(A,B,C,D,E),F,term_position(A,B,C,D,G)):-['$neck_cut',extra_pos(F,B,H),append(E,H,G)]
		a1 = a1->dref();
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		if (!a1->unify(C("term_position", {a4, a5, a6, a7, a8}), m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		a9 = V(m);
		if (!a3->unify(C("term_position", {a4, a5, a6, a7, a9}), m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a10 = V(m);
		return Op([&] (Prolog *e)
		{
		PRED_extra_pos_3_static_exec(e);
		}, VA({a2, a5, a10}), Op([&] (Prolog *e)
		{
		PRED_append_3_static_exec(e);
	}, VA({a8, a10, a9}), cont));
	}

	Operation FILE_apply_macros::extend_pos_3_3(Prolog *m)
	{
		// extend_pos(A-B,C,term_position(A,B,A,B,D)):-!,extra_pos(C,B,D)
		Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// extend_pos(A-B,C,term_position(A,B,A,B,D)):-['$neck_cut',extra_pos(C,B,D)]
		a1 = a1->dref();
		a4 = V(m);
		a5 = V(m);
		if (!a1->unify(C("-", {a4, a5}), m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		a6 = V(m);
		if (!a3->unify(C("term_position", {a4, a5, a4, a5, a6}), m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		PRED_extra_pos_3_static_exec(e);
		}, VA({a2, a5, a6}), cont);
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::PRED_extra_pos_3_s1 = optional<int>(1);

	Operation FILE_apply_macros::PRED_extra_pos_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::extra_pos_3_var, FILE_apply_macros::extra_pos_3_var, fail_0, fail_0, fail_0, fail_0);
	}

	Operation FILE_apply_macros::extra_pos_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_apply_macros::extra_pos_3_var_1);
		return extra_pos_3_1(m);
	}

	Operation FILE_apply_macros::extra_pos_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return extra_pos_3_2(m);
	}

	Operation FILE_apply_macros::extra_pos_3_1(Prolog *m)
	{
		// extra_pos(1,A,[A-A]):-true
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// extra_pos(1,A,[A-A]):-[]
		if (!PRED_extra_pos_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a4 = argz[0];
			if (!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a3->isVar())
		{
			a4 = V(m);
			a3->bind(CONS(a4, Prolog::Nil), m->trail);
		}
		else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if (!a4->unify(C("-", {a2, a2}), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::extra_pos_3_2(Prolog *m)
	{
		// extra_pos(2,A,[A-A,A-A]):-true
		Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// extra_pos(2,A,[A-A,A-A]):-[]
		if (!int_2->unify(a1, m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a4 = argz[0];
			a5 = argz[1];
		}
		else if (a3->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			a3->bind(CONS(a4, a5), m->trail);
		}
		else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if (!a4->unify(C("-", {a2, a2}), m->trail))
		{
			return m->fail();
		}
		a5 = a5->dref();
		if (a5->isCons())
		{
			std::vector<Term*> argz = VA({a5->car(), a5->cdr()});
			a6 = argz[0];
			if (!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a5->isVar())
		{
			a6 = V(m);
			a5->bind(CONS(a6, Prolog::Nil), m->trail);
		}
		else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if (!a6->unify(C("-", {a2, a2}), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::PRED_nt_pos_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::nt_pos_2_var, FILE_apply_macros::nt_pos_2_1, FILE_apply_macros::nt_pos_2_1, FILE_apply_macros::nt_pos_2_1, FILE_apply_macros::nt_pos_2_var, FILE_apply_macros::nt_pos_2_1);
	}

	Operation FILE_apply_macros::nt_pos_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_apply_macros::nt_pos_2_var_1);
		return nt_pos_2_1(m);
	}

	Operation FILE_apply_macros::nt_pos_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return nt_pos_2_2(m);
	}

	Operation FILE_apply_macros::nt_pos_2_1(Prolog *m)
	{
		// nt_pos(A,B):-var(A),!
		Term *a1, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// nt_pos(A,B):-['$get_level'(C),var(A),'$cut'(C)]
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
		return cont;
	}

	Operation FILE_apply_macros::nt_pos_2_2(Prolog *m)
	{
		// nt_pos(term_position(A,B,C,D,[E|F]),E):-true
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// nt_pos(term_position(A,B,C,D,[E|F]),E):-[]
		a1 = a1->dref();
		a3 = V(m);
		if (!a1->unify(C("term_position", V(m), V(m), V(m), V(m), a3), m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a4 = argz[0];
		}
		else if (a3->isVar())
		{
			a4 = V(m);
			a3->bind(CONS(a4, V(m)), m->trail);
		}
		else
		{
			return m->fail();
		}
		if (!a4->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_apply_macros::PRED_t_pos_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_apply_macros::t_pos_2_sub_1);
		return t_pos_2_1(m);
	}

	Operation FILE_apply_macros::t_pos_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return t_pos_2_2(m);
	}

	Operation FILE_apply_macros::t_pos_2_1(Prolog *m)
	{
		// t_pos(A,term_position(B,C,B,C,[B-C,B-C])):-compound(A),!,arg(1,A,B),arg(2,A,C)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// t_pos(A,term_position(B,C,B,C,[B-C,B-C])):-['$get_level'(D),compound(A),'$cut'(D),arg(1,A,B),arg(2,A,C)]
		a2 = a2->dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		if (!a2->unify(C("term_position", {a3, a4, a3, a4, a5}), m->trail))
		{
			return m->fail();
		}
		a5 = a5->dref();
		if (a5->isCons())
		{
			std::vector<Term*> argz = VA({a5->car(), a5->cdr()});
			a6 = argz[0];
			a7 = argz[1];
		}
		else if (a5->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			a5->bind(CONS(a6, a7), m->trail);
		}
		else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if (!a6->unify(C("-", {a3, a4}), m->trail))
		{
			return m->fail();
		}
		a7 = a7->dref();
		if (a7->isCons())
		{
			std::vector<Term*> argz = VA({a7->car(), a7->cdr()});
			a8 = argz[0];
			if (!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a7->isVar())
		{
			a8 = V(m);
			a7->bind(CONS(a8, Prolog::Nil), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = a8->dref();
		if (!a8->unify(C("-", {a3, a4}), m->trail))
		{
			return m->fail();
		}
		a9 = V(m);
		//START inline expansion of $get_level(a(9))
		if (!a9->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a9}), Op([&] (Prolog *e)
	{
		PRED_arg_3_static_exec(e);
	}, VA({int_1, a1, a3}), Op([&] (Prolog *e)
	{
		PRED_arg_3_static_exec(e);
	}, VA({int_2, a1, a4}), cont))));
	}

	Operation FILE_apply_macros::t_pos_2_2(Prolog *m)
	{
		Operation cont;
		cont = m->cont;
		// t_pos(A,B):-[]
		return cont;
	}

	Operation FILE_apply_macros::PRED_qcall_instantiated_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::qcall_instantiated_1_var, FILE_apply_macros::qcall_instantiated_1_int, FILE_apply_macros::qcall_instantiated_1_int, FILE_apply_macros::qcall_instantiated_1_int, FILE_apply_macros::qcall_instantiated_1_var, FILE_apply_macros::qcall_instantiated_1_int);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_apply_macros::qcall_instantiated_1_var_1);
		return qcall_instantiated_1_1(m);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::qcall_instantiated_1_var_2);
		return qcall_instantiated_1_2(m);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return qcall_instantiated_1_3(m);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_int(Prolog *m)
	{
		m->jtry1(nullptr, FILE_apply_macros::qcall_instantiated_1_int_1);
		return qcall_instantiated_1_1(m);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return qcall_instantiated_1_3(m);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_1(Prolog *m)
	{
		// qcall_instantiated(A):-var(A),!,fail
		Term *a1, *a2;
		a1 = m->AREGS[0];
		// qcall_instantiated(A):-['$get_level'(B),var(A),'$cut'(B),fail]
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
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_apply_macros::qcall_instantiated_1_2(Prolog *m)
	{
		// qcall_instantiated(A:B):-!,atom(A),callable(B)
		Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// qcall_instantiated(A:B):-['$neck_cut',atom(A),callable(B)]
		a1 = a1->dref();
		a2 = V(m);
		a3 = V(m);
		if (!a1->unify(C(":", {a2, a3}), m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		//START inline expansion of atom(a(2))
		a2 = a2->dref();
		if (!(a2->isSymbol()))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_callable_1_static_exec(e);
		}, VA({a3}), cont);
	}

	Operation FILE_apply_macros::qcall_instantiated_1_3(Prolog *m)
	{
		// qcall_instantiated(A):-callable(A)
		Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// qcall_instantiated(A):-[callable(A)]
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_callable_1_static_exec(e);
		}, VA({a1}), cont);
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_$003A_2_s1 = SYM("prolog_clause");
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_prolog_colour = SYM("prolog_colour");
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_maplist = SYM("maplist");
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_expanded = SYM("expanded");
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_system = SYM("system");

	Operation FILE_apply_macros::PRED_$003A_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_apply_macros::$003A_2_var, fail_0, fail_0, FILE_apply_macros::$003A_2_var, fail_0, fail_0);
	}

	Operation FILE_apply_macros::$003A_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_apply_macros::$003A_2_var_1);
		return $003A_2_1(m);
	}

	Operation FILE_apply_macros::$003A_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::$003A_2_var_2);
		return $003A_2_2(m);
	}

	Operation FILE_apply_macros::$003A_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_apply_macros::$003A_2_var_3);
		return $003A_2_3(m);
	}

	Operation FILE_apply_macros::$003A_2_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return $003A_2_4(m);
	}

	Operation FILE_apply_macros::$003A_2_1(Prolog *m)
	{
		// prolog_clause:unify_goal(A,B,C,D,E):-is_maplist(A),maplist_expansion(B),D=term_position(F,G,H,I,[J|K]),E=term_position(F,G,H,I,K)
		Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// prolog_clause:unify_goal(A,B,C,D,E):-[is_maplist(A),maplist_expansion(B),'$unify'(D,term_position(F,G,H,I,[J|K])),'$unify'(E,term_position(F,G,H,I,K))]
		if (!PRED_$003A_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		if (!a2->unify(C("unify_goal", {a3, a4, V(m), a5, a6}), m->trail))
		{
			return m->fail();
		}
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		a12 = CONS(V(m), a11);
		std::vector<Term*> y1 = VA({a7, a8, a9, a10, a12});
		a13 = S("term_position", y1);
		std::vector<Term*> y2 = VA({a7, a8, a9, a10, a11});
		a14 = S("term_position", y2);
		return Op([&] (Prolog *e)
		{
		PRED_is_maplist_1_static_exec(e);
		}, VA({a3}), Op([&] (Prolog *e)
		{
		PRED_maplist_expansion_1_static_exec(e);
	}, VA({a4}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a5, a13}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({a6, a14}), cont))));
	}

	Operation FILE_apply_macros::$003A_2_2(Prolog *m)
	{
		// prolog_colour:vararg_goal_classification(maplist,A,expanded):-A>=2
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// prolog_colour:vararg_goal_classification(maplist,A,expanded):-[B is 2,'$greater_or_equal'(A,B)]
		if (!ATOM_prolog_colour->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		a3 = V(m);
		if (!a2->unify(C("vararg_goal_classification", ATOM_maplist, a3, ATOM_expanded), m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		//START inline expansion of a(4)is@(int_2)
		if (!a4->unify(Arithmetic::evaluate(int_2), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_or_equal(a(3),a(4))
		if (Arithmetic::evaluate(a3)->arithCompareTo(Arithmetic::evaluate(a4)) < 0)
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_apply_macros::$003A_2_3(Prolog *m)
	{
		// system:goal_expansion(A,B):-'$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl',expand_apply(A,B)
		Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// system:goal_expansion(A,B):-['$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl',expand_apply(A,B)]
		if (!ATOM_system->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		a3 = V(m);
		a4 = V(m);
		if (!a2->unify(C("goal_expansion", {a3, a4}), m->trail))
		{
			return m->fail();
		}
		return Op([&] (Prolog *e)
		{
		PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_static_exec(e);
		}, VA(), Op([&] (Prolog *e)
		{
		PRED_expand_apply_2_static_exec(e);
	}, VA({a3, a4}), cont));
	}

	Operation FILE_apply_macros::$003A_2_4(Prolog *m)
	{
		// system:goal_expansion(A,B,C,D):-expand_apply(A,B,C,D)
		Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// system:goal_expansion(A,B,C,D):-[expand_apply(A,B,C,D)]
		if (!ATOM_system->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		if (!a2->unify(C("goal_expansion", {a3, a4, a5, a6}), m->trail))
		{
			return m->fail();
		}
		return Op([&] (Prolog *e)
		{
		PRED_expand_apply_4_static_exec(e);
		}, VA({a3, a4, a5, a6}), cont);
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_is_maplist_1_s1 = SYM("maplist");

	Operation FILE_apply_macros::PRED_is_maplist_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// is_maplist(A):-compound(A),compound_name_arity(A,maplist,B),B>=2
		m->setB0();
		Term *a1, *a2, *a3;
		a1 = LARG[0];
		// is_maplist(A):-[compound(A),compound_name_arity(A,maplist,B),C is 2,'$greater_or_equal'(B,C)]
		a2 = V(m);
		a3 = V(m);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_compound_name_arity_3_static_exec(e);
	}, VA({a1, PRED_is_maplist_1_s1, a2}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a3, int_2}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_$greater_or_equal_2_static_exec(e);
	}, VA({a2, a3}), cont))));
	}

SxxMachine::IntegerTerm *const FILE_apply_macros::PRED_maplist_expansion_1_s1 = optional<int>(0);
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM___aux_maplist$002F = SYM("__aux_maplist/");

	Operation FILE_apply_macros::PRED_maplist_expansion_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// maplist_expansion(A):-compound(A),compound_name_arity(A,B,C),sub_atom(B,0,D,E,'__aux_maplist/')
		m->setB0();
		Term *a1, *a2;
		a1 = LARG[0];
		// maplist_expansion(A):-[compound(A),compound_name_arity(A,B,C),sub_atom(B,0,D,E,'__aux_maplist/')]
		a2 = V(m);
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_compound_1_static_exec(e);
		}, VA({a1}), Op([&] (Prolog *e)
		{
		PRED_compound_name_arity_3_static_exec(e);
	}, VA({a1, a2, V(m)}), Op([&] (Prolog *e)
	{
		FILE_builtins::PRED_sub_atom_5_static_exec(e);
	}, VA({a2, PRED_maplist_expansion_1_s1, V(m), V(m), ATOM___aux_maplist$002F}), cont)));
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_s1 = SYM("xref");

	Operation FILE_apply_macros::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry0(nullptr, FILE_apply_macros::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_sub_1);
		return $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_1(m);
	}

	Operation FILE_apply_macros::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_2(m);
	}

	Operation FILE_apply_macros::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_1(Prolog *m)
	{
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl':-current_prolog_flag(xref,true),!,fail
		Term *a1;
		Operation cont;
		cont = m->cont;
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl':-['$get_level'(A),current_prolog_flag(xref,true),'$cut'(A),fail]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_current_prolog_flag_2_static_exec(e);
		}, VA({PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_s1, Prolog::True}), Op([&] (Prolog *e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), Op(fail_0, VA(), cont)));
	}

	Operation FILE_apply_macros::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_2(Prolog *m)
	{
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl':-true
		Operation cont;
		cont = m->cont;
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl':-[]
		return cont;
	}

SxxMachine::SymbolTerm *const FILE_apply_macros::PRED_$init_0_s1 = SYM("apply_macros");
SxxMachine::SymbolTerm *const FILE_apply_macros::ATOM_goal_expansion = SYM("goal_expansion");
SxxMachine::StructureTerm *const FILE_apply_macros::PRED_$init_0_s6 = S("/", ATOM_goal_expansion, int_2);

	Operation FILE_apply_macros::PRED_$init_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		// '$init':-'$new_indexing_hash'(apply_macros,goal_expansion/2,A)
		m->setB0();
		// '$init':-['$new_indexing_hash'(apply_macros,goal_expansion/2,A)]
		return Op([&] (Prolog *e)
		{
		FILE_builtins::PRED_$new_indexing_hash_3_static_exec(e);
		}, VA({PRED_$init_0_s1, PRED_$init_0_s6, V(m)}), cont);
	}

	FILE_apply_macros::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_apply_macros::StaticConstructor FILE_apply_macros::staticConstructor;

	void FILE_apply_macros::loadPreds()
	{
		PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 9, FILE_apply_macros::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec);
		PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 2, FILE_apply_macros::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_2_static_exec);
		PredTable::registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 22, FILE_apply_macros::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_22_static_exec);
		PredTable::registerBuiltin("expand_maplist", 3, FILE_apply_macros::PRED_expand_maplist_3_static_exec);
		PredTable::registerBuiltin("expand_closure_no_fail", 3, FILE_apply_macros::PRED_expand_closure_no_fail_3_static_exec);
		PredTable::registerBuiltin("empty_lists", 2, FILE_apply_macros::PRED_empty_lists_2_static_exec);
		PredTable::registerBuiltin("heads_and_tails", 4, FILE_apply_macros::PRED_heads_and_tails_4_static_exec);
		PredTable::registerBuiltin("expand_apply", 2, FILE_apply_macros::PRED_expand_apply_2_static_exec);
		PredTable::registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 8, FILE_apply_macros::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_8_static_exec);
		PredTable::registerBuiltin("expand_apply", 4, FILE_apply_macros::PRED_expand_apply_4_static_exec);
		PredTable::registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 9, FILE_apply_macros::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec);
		PredTable::registerBuiltin("$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 9, FILE_apply_macros::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_9_static_exec);
		PredTable::registerBuiltin("expand_phrase", 2, FILE_apply_macros::PRED_expand_phrase_2_static_exec);
		PredTable::registerBuiltin("expand_phrase", 4, FILE_apply_macros::PRED_expand_phrase_4_static_exec);
		PredTable::registerBuiltin("dcg_goal", 4, FILE_apply_macros::PRED_dcg_goal_4_static_exec);
		PredTable::registerBuiltin("$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 1, FILE_apply_macros::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec);
		PredTable::registerBuiltin("dcg_extend", 6, FILE_apply_macros::PRED_dcg_extend_6_static_exec);
		PredTable::registerBuiltin("$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 1, FILE_apply_macros::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_1_static_exec);
		PredTable::registerBuiltin("dcg_control", 1, FILE_apply_macros::PRED_dcg_control_1_static_exec);
		PredTable::registerBuiltin("$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 4, FILE_apply_macros::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec);
		PredTable::registerBuiltin("$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 4, FILE_apply_macros::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_4_static_exec);
		PredTable::registerBuiltin("terminal", 3, FILE_apply_macros::PRED_terminal_3_static_exec);
		PredTable::registerBuiltin("extend_pos", 3, FILE_apply_macros::PRED_extend_pos_3_static_exec);
		PredTable::registerBuiltin("extra_pos", 3, FILE_apply_macros::PRED_extra_pos_3_static_exec);
		PredTable::registerBuiltin("nt_pos", 2, FILE_apply_macros::PRED_nt_pos_2_static_exec);
		PredTable::registerBuiltin("t_pos", 2, FILE_apply_macros::PRED_t_pos_2_static_exec);
		PredTable::registerBuiltin("qcall_instantiated", 1, FILE_apply_macros::PRED_qcall_instantiated_1_static_exec);
		PredTable::registerBuiltin(":", "$003A", 2, FILE_apply_macros::PRED_$003A_2_static_exec);
		PredTable::registerBuiltin("is_maplist", 1, FILE_apply_macros::PRED_is_maplist_1_static_exec);
		PredTable::registerBuiltin("maplist_expansion", 1, FILE_apply_macros::PRED_maplist_expansion_1_static_exec);
		PredTable::registerBuiltin("$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/apply_macros.pl", "$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl", 0, FILE_apply_macros::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fapply_macros$002Epl_0_static_exec);
		PredTable::registerBuiltin("$init", 0, FILE_apply_macros::PRED_$init_0_static_exec);
	}
}
