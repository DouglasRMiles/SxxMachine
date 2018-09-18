using namespace std;

#include "FILE_browse.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine
{
	using namespace SxxMachine;
//	import static SxxMachine.bootpreds.*;
//	import static SxxMachine.bootpreds.LEVELS;
//	import static SxxMachine.FILE_builtins.*;
//	import static SxxMachine.FILE_cafeteria.*;
//	import static SxxMachine.FILE_io.*;
//	import static SxxMachine.FILE_swi_supp.*;
//	import static SxxMachine.FILE_system.*;
//	import static SxxMachine.sxxtensions.*;
//	import static SxxMachine.Failure.*;
//	import static SxxMachine.Predicate.*;
//	import static SxxMachine.Prolog.*;
//	import static SxxMachine.Success.*;
//	import static SxxMachine.SymbolTerm.*;
//	import static SxxMachine.TermData.*;
	using PRED_$begin_exception_1 = SxxMachine::bootpreds::PRED_$begin_exception_1;
	using PRED_$begin_sync_2 = SxxMachine::bootpreds::PRED_$begin_sync_2;
	using PRED_$builtin_member_2 = SxxMachine::bootpreds::PRED_$builtin_member_2;
IntegerTerm *const FILE_browse::int_100 = optional<int>(100);
SymbolTerm *const FILE_browse::ATOM_a = SYM("a");
SymbolTerm *const FILE_browse::ATOM_b = SYM("b");
ListTerm *const FILE_browse::L_top_0_s7 = CONS(ATOM_a, Prolog::Nil);
ListTerm *const FILE_browse::L_top_0_s8 = CONS(ATOM_a, L_top_0_s7);
ListTerm *const FILE_browse::L_top_0_s9 = CONS(ATOM_a, L_top_0_s8);
ListTerm *const FILE_browse::L_top_0_s10 = CONS(ATOM_b, L_top_0_s9);
ListTerm *const FILE_browse::L_top_0_s11 = CONS(ATOM_b, L_top_0_s10);
ListTerm *const FILE_browse::L_top_0_s12 = CONS(ATOM_a, L_top_0_s11);
ListTerm *const FILE_browse::L_top_0_s13 = CONS(ATOM_a, L_top_0_s12);
ListTerm *const FILE_browse::L_top_0_s14 = CONS(ATOM_a, L_top_0_s13);
ListTerm *const FILE_browse::L_top_0_s15 = CONS(ATOM_a, L_top_0_s14);
ListTerm *const FILE_browse::L_top_0_s16 = CONS(ATOM_a, L_top_0_s15);
ListTerm *const FILE_browse::L_top_0_s17 = CONS(ATOM_b, L_top_0_s16);
ListTerm *const FILE_browse::L_top_0_s18 = CONS(ATOM_b, L_top_0_s17);
ListTerm *const FILE_browse::L_top_0_s19 = CONS(ATOM_b, L_top_0_s18);
ListTerm *const FILE_browse::L_top_0_s20 = CONS(ATOM_b, L_top_0_s19);
ListTerm *const FILE_browse::L_top_0_s21 = CONS(ATOM_a, L_top_0_s20);
ListTerm *const FILE_browse::L_top_0_s22 = CONS(ATOM_a, L_top_0_s21);
ListTerm *const FILE_browse::L_top_0_s23 = CONS(ATOM_a, L_top_0_s22);
ListTerm *const FILE_browse::L_top_0_s24 = CONS(ATOM_b, Prolog::Nil);
ListTerm *const FILE_browse::L_top_0_s25 = CONS(ATOM_b, L_top_0_s24);
ListTerm *const FILE_browse::L_top_0_s26 = CONS(L_top_0_s25, Prolog::Nil);
ListTerm *const FILE_browse::L_top_0_s27 = CONS(L_top_0_s8, L_top_0_s26);
ListTerm *const FILE_browse::L_top_0_s28 = CONS(ATOM_a, L_top_0_s27);
ListTerm *const FILE_browse::L_top_0_s29 = CONS(ATOM_a, L_top_0_s28);
ListTerm *const FILE_browse::L_top_0_s30 = CONS(ATOM_b, L_top_0_s29);
ListTerm *const FILE_browse::L_top_0_s31 = CONS(ATOM_b, L_top_0_s30);
ListTerm *const FILE_browse::L_top_0_s32 = CONS(ATOM_b, L_top_0_s31);
ListTerm *const FILE_browse::L_top_0_s33 = CONS(ATOM_b, L_top_0_s32);
ListTerm *const FILE_browse::L_top_0_s34 = CONS(ATOM_a, L_top_0_s33);
ListTerm *const FILE_browse::L_top_0_s35 = CONS(ATOM_a, L_top_0_s34);
ListTerm *const FILE_browse::L_top_0_s36 = CONS(ATOM_b, L_top_0_s7);
ListTerm *const FILE_browse::L_top_0_s37 = CONS(ATOM_a, L_top_0_s36);
ListTerm *const FILE_browse::L_top_0_s38 = CONS(ATOM_b, L_top_0_s37);
ListTerm *const FILE_browse::L_top_0_s39 = CONS(L_top_0_s36, L_top_0_s38);
ListTerm *const FILE_browse::L_top_0_s40 = CONS(ATOM_b, L_top_0_s39);
ListTerm *const FILE_browse::L_top_0_s41 = CONS(ATOM_a, L_top_0_s40);
ListTerm *const FILE_browse::L_top_0_s42 = CONS(ATOM_a, L_top_0_s41);
ListTerm *const FILE_browse::L_top_0_s43 = CONS(ATOM_a, L_top_0_s42);
ListTerm *const FILE_browse::L_top_0_s44 = CONS(L_top_0_s43, Prolog::Nil);
ListTerm *const FILE_browse::L_top_0_s45 = CONS(L_top_0_s35, L_top_0_s44);
ListTerm *const FILE_browse::L_top_0_s46 = CONS(L_top_0_s23, L_top_0_s45);
SymbolTerm *const FILE_browse::FUNCTOR_star_1 = F("star",1);

	Operation FILE_browse::PRED_top_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-init(100,10,4,[[a,a,a,b,b,b,b,a,a,a,a,a,b,b,a,a,a],[a,a,b,b,b,b,a,a,[a,a],[b,b]],[a,a,a,b,[b,a],b,a,b,a]],A),randomize(A,B,21),!,investigate(B,[[star(C),D,star(E),D,a,star(C),a,star(E),star(C)],[star(C),star(E),star(E),star(C),[star(C)],[star(E)]],[F,G,star(H),[b,a],star(I),J,K]])
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17, *a18, *a19, *a20, *a21, *a22, *a23, *a24, *a25, *a26, *a27, *a28, *a29, *a30, *a31, *a32, *a33, *a34, *a35, *a36, *a37, *a38, *a39, *a40, *a41, *a42, *a43, *a44, *a45, *a46;
		Operation p1, p2, p3;
	// top:-['$get_level'(A),init(100,10,4,[[a,a,a,b,b,b,b,a,a,a,a,a,b,b,a,a,a],[a,a,b,b,b,b,a,a,[a,a],[b,b]],[a,a,a,b,[b,a],b,a,b,a]],B),randomize(B,C,21),'$cut'(A),investigate(C,[[star(D),E,star(F),E,a,star(D),a,star(F),star(D)],[star(D),star(F),star(F),star(D),[star(D)],[star(F)]],[G,H,star(I),[b,a],star(J),K,L]])]
		a1 = V(m);
		//START inline expansion of $get_level(a(1))
		if (!a1->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a2 = V(m);
		a3 = V(m);
		a4 = V(m);
	// put_str_args([a(4)],y(1)),put_str(@('FUNCTOR_star_1'),y(1),a(5))
		a5 = S(FUNCTOR_star_1, {a4});
		 ;
		a6 = V(m);
		a7 = V(m);
	// put_str_args([a(7)],y(2)),put_str(@('FUNCTOR_star_1'),y(2),a(8))
		a8 = S(FUNCTOR_star_1, {a7});
		 ;
	// put_str_args([a(4)],y(3)),put_str(@('FUNCTOR_star_1'),y(3),a(9))
		a9 = S(FUNCTOR_star_1, {a4});
		 ;
	// put_str_args([a(7)],y(4)),put_str(@('FUNCTOR_star_1'),y(4),a(10))
		a10 = S(FUNCTOR_star_1, {a7});
		 ;
	// put_str_args([a(4)],y(5)),put_str(@('FUNCTOR_star_1'),y(5),a(11))
		a11 = S(FUNCTOR_star_1, {a4});
		 ;
		a12 = CONS(a11, Prolog::Nil);
		a13 = CONS(a10, a12);
		a14 = CONS(ATOM_a, a13);
		a15 = CONS(a9, a14);
		a16 = CONS(ATOM_a, a15);
		a17 = CONS(a6, a16);
		a18 = CONS(a8, a17);
		a19 = CONS(a6, a18);
		a20 = CONS(a5, a19);
	// put_str_args([a(4)],y(6)),put_str(@('FUNCTOR_star_1'),y(6),a(21))
		a21 = S(FUNCTOR_star_1, {a4});
		 ;
	// put_str_args([a(7)],y(7)),put_str(@('FUNCTOR_star_1'),y(7),a(22))
		a22 = S(FUNCTOR_star_1, {a7});
		 ;
	// put_str_args([a(7)],y(8)),put_str(@('FUNCTOR_star_1'),y(8),a(23))
		a23 = S(FUNCTOR_star_1, {a7});
		 ;
	// put_str_args([a(4)],y(9)),put_str(@('FUNCTOR_star_1'),y(9),a(24))
		a24 = S(FUNCTOR_star_1, {a4});
		 ;
	// put_str_args([a(4)],y(10)),put_str(@('FUNCTOR_star_1'),y(10),a(25))
		a25 = S(FUNCTOR_star_1, {a4});
		 ;
		a26 = CONS(a25, Prolog::Nil);
	// put_str_args([a(7)],y(11)),put_str(@('FUNCTOR_star_1'),y(11),a(27))
		a27 = S(FUNCTOR_star_1, {a7});
		 ;
		a28 = CONS(a27, Prolog::Nil);
		a29 = CONS(a28, Prolog::Nil);
		a30 = CONS(a26, a29);
		a31 = CONS(a24, a30);
		a32 = CONS(a23, a31);
		a33 = CONS(a22, a32);
		a34 = CONS(a21, a33);
	// put_str_args([void],y(12)),put_str(@('FUNCTOR_star_1'),y(12),a(35))
		a35 = S(FUNCTOR_star_1, V(m));
		 ;
	// put_str_args([void],y(13)),put_str(@('FUNCTOR_star_1'),y(13),a(36))
		a36 = S(FUNCTOR_star_1, V(m));
		 ;
		a37 = CONS(V(m), Prolog::Nil);
		a38 = CONS(V(m), a37);
		a39 = CONS(a36, a38);
		a40 = CONS(L_top_0_s36, a39);
		a41 = CONS(a35, a40);
		a42 = CONS(V(m), a41);
		a43 = CONS(V(m), a42);
		a44 = CONS(a43, Prolog::Nil);
		a45 = CONS(a34, a44);
		a46 = CONS(a20, a45);
		return Op([&] (e)
		{
		PRED_init_5_static_exec(e);
		}, VA({int_100, int_10, int_4, L_top_0_s46, a2}), Op([&] (e)
		{
		PRED_randomize_3_static_exec(e);
	}, VA({a2, a3, int_21}), Op([&] (e)
	{
		PRED_$cut_1_static_exec(e);
	}, VA({a1}), Op([&] (e)
	{
		PRED_investigate_2_static_exec(e);
	}, VA({a3, a46}), cont))));
	}

	Operation FILE_browse::PRED_init_5_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// init(A,B,C,D,E):-init(A,B,B,C,D,E)
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		a5 = LARG[4];
	// init(A,B,C,D,E):-[init(A,B,B,C,D,E)]
		return Op([&] (e)
		{
		PRED_init_6_static_exec(e);
		}, VA({a1, a2, a2, a3, a4, a5}), cont);
	}

SymbolTerm *const FILE_browse::FUNCTOR_$002D_2 = F("-",2);
SymbolTerm *const FILE_browse::FUNCTOR_pattern_1 = F("pattern",1);

	Operation FILE_browse::PRED_init_6_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_browse::init_6_var, FILE_browse::init_6_var, FILE_browse::init_6_2, FILE_browse::init_6_2, FILE_browse::init_6_2, FILE_browse::init_6_2);
	}

	Operation FILE_browse::init_6_var(Prolog *m)
	{
		m->jtry6(nullptr, FILE_browse::init_6_var_1);
		return init_6_1(m);
	}

	Operation FILE_browse::init_6_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return init_6_2(m);
	}

	Operation FILE_browse::init_6_1(Prolog *m)
	{
	// init(0,A,B,C,D,E):-!
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// init(0,A,B,C,D,E):-['$neck_cut']
		if (!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::init_6_2(Prolog *m)
	{
	// init(A,B,C,D,E,[F|G]):-fill(B,[],H),get_pats(D,E,I),J is C-B,fill(J,[pattern(I)|H],F),K is A-1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(B,C,L),init(K,L,C,D,E,G)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16, *a17;
		Operation p1, p2, p3, p4, p5, p6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// init(A,B,C,D,E,[F|G]):-[fill(B,[],H),get_pats(D,E,I),J is C-B,fill(J,[pattern(I)|H],F),K is A-1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(B,C,L),init(K,L,C,D,E,G)]
		a6 = a6->dref();
		if (a6->isCons())
		{
			std::vector<Term*> argz = VA({a6->car(), a6->cdr()});
			a7 = argz[0];
			a8 = argz[1];
		}
		else if (a6->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a6->bind(CONS(a7, a8), m->trail);
		}
		else
		{
			return m->fail();
		}
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
	// put_str_args([a(3),a(2)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(12))
		a12 = S(FUNCTOR_$002D_2, {a3, a2});
		 ;
	// put_str_args([a(10)],y(2)),put_str(@('FUNCTOR_pattern_1'),y(2),a(13))
		a13 = S(FUNCTOR_pattern_1, {a10});
		 ;
		a14 = CONS(a13, a9);
		a15 = V(m);
	// put_str_args([a(1),@(int_1)],y(3)),put_str(@('FUNCTOR_$002D_2'),y(3),a(16))
		a16 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		a17 = V(m);
		return Op([&] (e)
		{
		PRED_fill_3_static_exec(e);
		}, VA({a2, Prolog::Nil, a9}), Op([&] (e)
		{
		PRED_get_pats_3_static_exec(e);
	}, VA({a4, a5, a10}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a11, a12}), Op([&] (e)
	{
		PRED_fill_3_static_exec(e);
	}, VA({a11, a14, a7}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a15, a16}), Op([&] (e)
	{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_static_exec(e);
	}, VA({a2, a3, a17}), Op([&] (e)
	{
		PRED_init_6_static_exec(e);
	}, VA({a15, a17, a3, a4, a5, a8}), cont)))))));
	}

	Operation FILE_browse::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_browse::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_1(m);
	}

	Operation FILE_browse::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_2(m);
	}

	Operation FILE_browse::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_1(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-A=:=0,!,C is B
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-['$get_level'(D),E is 0,'$arith_equal'(A,E),'$cut'(D),C is B]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
		//START inline expansion of a(5)is@(int_0)
		if (!a5->unify(Arithmetic::evaluate(int_0), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $arith_equal(a(1),a(5))
		if (Arithmetic::evaluate(a1)->arithCompareTo(Arithmetic::evaluate(a5)) != 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		//START inline expansion of a(3)is a(2)
		if (!a3->unify(Arithmetic::evaluate(a2), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_2(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-C is A-1
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B,C):-[C is A-1]
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		//START inline expansion of a(3)is a(4)
		if (!a3->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

SymbolTerm *const FILE_browse::FUNCTOR_dummy_1 = F("dummy",1);
StructureTerm *const FILE_browse::L_fill_3_s5 = S(FUNCTOR_dummy_1, Prolog::Nil);

	Operation FILE_browse::PRED_fill_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return fill_3_top(m);
	}

	Operation FILE_browse::fill_3_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_browse::fill_3_var, FILE_browse::fill_3_var, FILE_browse::fill_3_2, FILE_browse::fill_3_2, FILE_browse::fill_3_2, FILE_browse::fill_3_2);
	}

	Operation FILE_browse::fill_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_browse::fill_3_var_1);
		return fill_3_1(m);
	}

	Operation FILE_browse::fill_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return fill_3_2(m);
	}

	Operation FILE_browse::fill_3_1(Prolog *m)
	{
	// fill(0,A,A):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// fill(0,A,A):-['$neck_cut']
		if (!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::fill_3_2(Prolog *m)
	{
	// fill(A,B,[dummy([])|C]):-D is A-1,fill(D,B,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// fill(A,B,[dummy([])|C]):-[D is A-1,fill(D,B,C)]
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			if (!L_fill_3_s5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a4 = argz[1];
		}
		else if (a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(L_fill_3_s5, a4), m->trail);
		}
		else
		{
			return m->fail();
		}
		a5 = V(m);
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(6))
		a6 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		//START inline expansion of a(5)is a(6)
		if (!a5->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a4;
		m->cont = cont;
		return fill_3_top(m);
	}

SymbolTerm *const FILE_browse::FUNCTOR_mod_2 = F("mod",2);
SymbolTerm *const FILE_browse::FUNCTOR_$002A_2 = F("*",2);
IntegerTerm *const FILE_browse::int_251 = optional<int>(251);

	Operation FILE_browse::PRED_randomize_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_browse::randomize_3_var, FILE_browse::randomize_3_2, FILE_browse::randomize_3_2, FILE_browse::randomize_3_var, FILE_browse::randomize_3_2, FILE_browse::randomize_3_2);
	}

	Operation FILE_browse::randomize_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_browse::randomize_3_var_1);
		return randomize_3_1(m);
	}

	Operation FILE_browse::randomize_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return randomize_3_2(m);
	}

	Operation FILE_browse::randomize_3_1(Prolog *m)
	{
	// randomize([],[],A):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// randomize([],[],A):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
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

	Operation FILE_browse::randomize_3_2(Prolog *m)
	{
	// randomize(A,[B|C],D):-length(A,E),F is D*17 mod 251,G is F mod E,split(G,A,B,H),randomize(H,C,F)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation p1, p2, p3, p4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// randomize(A,[B|C],D):-[length(A,E),F is D*17 mod 251,G is F mod E,split(G,A,B,H),randomize(H,C,F)]
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			a4 = argz[0];
			a5 = argz[1];
		}
		else if (a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		}
		else
		{
			return m->fail();
		}
		a6 = V(m);
		a7 = V(m);
	// put_str_args([a(3),@(int_17)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(8))
		a8 = S(FUNCTOR_$002A_2, {a3, int_17});
		 ;
	// put_str_args([a(8),@(int_251)],y(2)),put_str(@('FUNCTOR_mod_2'),y(2),a(9))
		a9 = S(FUNCTOR_mod_2, {a8, int_251});
		 ;
		a10 = V(m);
	// put_str_args([a(7),a(6)],y(3)),put_str(@('FUNCTOR_mod_2'),y(3),a(11))
		a11 = S(FUNCTOR_mod_2, {a7, a6});
		 ;
		a12 = V(m);
		return Op([&] (e)
		{
		FILE_builtins::PRED_length_2_static_exec(e);
		}, VA({a1, a6}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a7, a9}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a10, a11}), Op([&] (e)
		{
		PRED_split_4_static_exec(e);
	}, VA({a10, a1, a4, a12}), Op([&] (e)
	{
		PRED_randomize_3_static_exec(e);
	}, VA({a12, a5, a7}), cont)))));
	}

	Operation FILE_browse::PRED_split_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return split_4_top(m);
	}

	Operation FILE_browse::split_4_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_browse::split_4_var, FILE_browse::split_4_var, FILE_browse::split_4_2, FILE_browse::split_4_2, FILE_browse::split_4_2, FILE_browse::split_4_2);
	}

	Operation FILE_browse::split_4_var(Prolog *m)
	{
		m->jtry4(nullptr, FILE_browse::split_4_var_1);
		return split_4_1(m);
	}

	Operation FILE_browse::split_4_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return split_4_2(m);
	}

	Operation FILE_browse::split_4_1(Prolog *m)
	{
	// split(0,[A|B],A,B):-!
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// split(0,[A|B],A,B):-['$neck_cut']
		if (!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
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
		if (!a5->unify(a3, m->trail))
		{
			return m->fail();
		}
		if (!a6->unify(a4, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::split_4_2(Prolog *m)
	{
	// split(A,[B|C],D,[B|E]):-F is A-1,split(F,C,D,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// split(A,[B|C],D,[B|E]):-[F is A-1,split(F,C,D,E)]
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
		a4 = a4->dref();
		if (a4->isCons())
		{
			std::vector<Term*> argz = VA({a4->car(), a4->cdr()});
			if (!a5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		}
		else if (a4->isVar())
		{
			a7 = V(m);
			 a4->bind(CONS(a5, a7), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = V(m);
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(9))
		a9 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		//START inline expansion of a(8)is a(9)
		if (!a8->unify(Arithmetic::evaluate(a9), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a8;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->AREGS[3] = a7;
		m->cont = cont;
		return split_4_top(m);
	}

SymbolTerm *const FILE_browse::ATOM_pattern = SYM("pattern");

	Operation FILE_browse::PRED_investigate_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_browse::investigate_2_var, Failure::fail_0, Failure::fail_0, FILE_browse::investigate_2_1, Failure::fail_0, FILE_browse::investigate_2_2);
	}

	Operation FILE_browse::investigate_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_browse::investigate_2_var_1);
		return investigate_2_1(m);
	}

	Operation FILE_browse::investigate_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return investigate_2_2(m);
	}

	Operation FILE_browse::investigate_2_1(Prolog *m)
	{
	// investigate([],A):-!
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// investigate([],A):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::investigate_2_2(Prolog *m)
	{
	// investigate([A|B],C):-property(A,pattern,D),p_investigate(D,C),investigate(B,C)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// investigate([A|B],C):-[property(A,pattern,D),p_investigate(D,C),investigate(B,C)]
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
		a5 = V(m);
		return Op([&] (e)
		{
		PRED_property_3_static_exec(e);
		}, VA({a3, ATOM_pattern, a5}), Op([&] (e)
		{
		PRED_p_investigate_2_static_exec(e);
	}, VA({a5, a2}), Op([&] (e)
	{
		PRED_investigate_2_static_exec(e);
	}, VA({a4, a2}), cont)));
	}

	Operation FILE_browse::PRED_get_pats_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// get_pats(A,B,C):-get_pats(A,B,C,B)
		m->setB0();
		 Term *a1, *a2, *a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
	// get_pats(A,B,C):-[get_pats(A,B,C,B)]
		return Op([&] (e)
		{
		PRED_get_pats_4_static_exec(e);
		}, VA({a1, a2, a3, a2}), cont);
	}

	Operation FILE_browse::PRED_get_pats_4_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return get_pats_4_top(m);
	}

	Operation FILE_browse::get_pats_4_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_browse::get_pats_4_var, FILE_browse::get_pats_4_var, FILE_browse::get_pats_4_flo, FILE_browse::get_pats_4_flo, FILE_browse::get_pats_4_flo, FILE_browse::get_pats_4_flo);
	}

	Operation FILE_browse::get_pats_4_var(Prolog *m)
	{
		m->jtry4(nullptr, FILE_browse::get_pats_4_var_1);
		return get_pats_4_1(m);
	}

	Operation FILE_browse::get_pats_4_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_browse::get_pats_4_var_2);
		return get_pats_4_2(m);
	}

	Operation FILE_browse::get_pats_4_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return get_pats_4_3(m);
	}

	Operation FILE_browse::get_pats_4_flo(Prolog *m)
	{
		m->jtry4(nullptr, FILE_browse::get_pats_4_flo_1);
		return get_pats_4_2(m);
	}

	Operation FILE_browse::get_pats_4_flo_1(Prolog *m)
	{
		m->trust(nullptr);
		return get_pats_4_3(m);
	}

	Operation FILE_browse::get_pats_4_1(Prolog *m)
	{
	// get_pats(0,A,[],B):-!
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// get_pats(0,A,[],B):-['$neck_cut']
		if (!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::Nil->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::get_pats_4_2(Prolog *m)
	{
	// get_pats(A,[B|C],[B|D],E):-F is A-1,get_pats(F,C,D,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// get_pats(A,[B|C],[B|D],E):-[F is A-1,get_pats(F,C,D,E)]
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
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			if (!a5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		}
		else if (a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a5, a7), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = V(m);
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(9))
		a9 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		//START inline expansion of a(8)is a(9)
		if (!a8->unify(Arithmetic::evaluate(a9), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a8;
		m->AREGS[1] = a6;
		m->AREGS[2] = a7;
		m->AREGS[3] = a4;
		m->cont = cont;
		return get_pats_4_top(m);
	}

	Operation FILE_browse::get_pats_4_3(Prolog *m)
	{
	// get_pats(A,[],B,C):-get_pats(A,C,B,C)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// get_pats(A,[],B,C):-[get_pats(A,C,B,C)]
		if (!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a4;
		m->AREGS[2] = a3;
		m->AREGS[3] = a4;
		m->cont = cont;
		return get_pats_4_top(m);
	}

	Operation FILE_browse::PRED_property_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return property_3_top(m);
	}

	Operation FILE_browse::property_3_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_browse::property_3_var, Failure::fail_0, Failure::fail_0, FILE_browse::property_3_1, Failure::fail_0, FILE_browse::property_3_lis);
	}

	Operation FILE_browse::property_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_browse::property_3_var_1);
		return property_3_1(m);
	}

	Operation FILE_browse::property_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_browse::property_3_var_2);
		return property_3_2(m);
	}

	Operation FILE_browse::property_3_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return property_3_3(m);
	}

	Operation FILE_browse::property_3_lis(Prolog *m)
	{
		m->jtry3(nullptr, FILE_browse::property_3_lis_1);
		return property_3_2(m);
	}

	Operation FILE_browse::property_3_lis_1(Prolog *m)
	{
		m->trust(nullptr);
		return property_3_3(m);
	}

	Operation FILE_browse::property_3_1(Prolog *m)
	{
	// property([],A,B):-fail
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// property([],A,B):-[fail]
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_browse::property_3_2(Prolog *m)
	{
	// property([A|B],C,D):-functor(A,C,E),!,arg(1,A,D)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// property([A|B],C,D):-['$get_level'(E),functor(A,C,F),'$cut'(E),arg(1,A,D)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a4 = argz[0];
		}
		else if (a1->isVar())
		{
			a4 = V(m);
			 a1->bind(CONS(a4, V(m)), m->trail);
		}
		else
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
		return Op([&] (e)
		{
		PRED_functor_3_static_exec(e);
		}, VA({a4, a2, V(m)}), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a5}), Op([&] (e)
	{
		PRED_arg_3_static_exec(e);
	}, VA({int_1, a4, a3}), cont)));
	}

	Operation FILE_browse::property_3_3(Prolog *m)
	{
	// property([A|B],C,D):-property(B,C,D)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// property([A|B],C,D):-[property(B,C,D)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a4 = argz[1];
		}
		else if (a1->isVar())
		{
			a4 = V(m);
			 a1->bind(CONS(V(m), a4), m->trail);
		}
		else
		{
			return m->fail();
		}
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a3;
		m->cont = cont;
		return property_3_top(m);
	}

	Operation FILE_browse::PRED_p_investigate_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_browse::p_investigate_2_var, Failure::fail_0, Failure::fail_0, FILE_browse::p_investigate_2_1, Failure::fail_0, FILE_browse::p_investigate_2_2);
	}

	Operation FILE_browse::p_investigate_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_browse::p_investigate_2_var_1);
		return p_investigate_2_1(m);
	}

	Operation FILE_browse::p_investigate_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return p_investigate_2_2(m);
	}

	Operation FILE_browse::p_investigate_2_1(Prolog *m)
	{
	// p_investigate([],A):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// p_investigate([],A):-[]
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_browse::p_investigate_2_2(Prolog *m)
	{
	// p_investigate([A|B],C):-p_match(C,A),p_investigate(B,C)
		 Term *a1, *a2, *a3, *a4;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// p_investigate([A|B],C):-[p_match(C,A),p_investigate(B,C)]
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
		return Op([&] (e)
		{
		PRED_p_match_2_static_exec(e);
		}, VA({a2, a3}), Op([&] (e)
		{
		PRED_p_investigate_2_static_exec(e);
	}, VA({a4, a2}), cont));
	}

	Operation FILE_browse::PRED_p_match_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_browse::p_match_2_var, Failure::fail_0, Failure::fail_0, FILE_browse::p_match_2_1, Failure::fail_0, FILE_browse::p_match_2_2);
	}

	Operation FILE_browse::p_match_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_browse::p_match_2_var_1);
		return p_match_2_1(m);
	}

	Operation FILE_browse::p_match_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return p_match_2_2(m);
	}

	Operation FILE_browse::p_match_2_1(Prolog *m)
	{
	// p_match([],A):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// p_match([],A):-[]
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_browse::p_match_2_2(Prolog *m)
	{
	// p_match([A|B],C):-'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),p_match(B,C)
		 Term *a1, *a2, *a3, *a4;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// p_match([A|B],C):-['$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),p_match(B,C)]
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
		return Op([&] (e)
		{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(e);
		}, VA({a3, a2}), Op([&] (e)
		{
		PRED_p_match_2_static_exec(e);
	}, VA({a4, a2}), cont));
	}

	Operation FILE_browse::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_browse::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(m);
	}

	Operation FILE_browse::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(m);
	}

	Operation FILE_browse::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(Prolog *m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-match(B,A),fail
		 Term *a1, *a2;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-[match(B,A),fail]
		return Op([&] (e)
		{
		PRED_match_2_static_exec(e);
		}, VA({a2, a1}), Failure::fail_0);
	}

	Operation FILE_browse::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(Prolog *m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-[]
		return cont;
	}

	Operation FILE_browse::PRED_match_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return match_2_top(m);
	}

	Operation FILE_browse::match_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_browse::match_2_var, FILE_browse::match_2_3, FILE_browse::match_2_3, FILE_browse::match_2_con, FILE_browse::match_2_3, FILE_browse::match_2_lis);
	}

	Operation FILE_browse::match_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_browse::match_2_var_1);
		return match_2_1(m);
	}

	Operation FILE_browse::match_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_browse::match_2_var_2);
		return match_2_2(m);
	}

	Operation FILE_browse::match_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_browse::match_2_var_3);
		return match_2_3(m);
	}

	Operation FILE_browse::match_2_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return match_2_4(m);
	}

	Operation FILE_browse::match_2_con(Prolog *m)
	{
		m->jtry2(nullptr, FILE_browse::match_2_con_1);
		return match_2_1(m);
	}

	Operation FILE_browse::match_2_con_1(Prolog *m)
	{
		m->trust(nullptr);
		return match_2_3(m);
	}

	Operation FILE_browse::match_2_lis(Prolog *m)
	{
		m->jtry2(nullptr, FILE_browse::match_2_lis_1);
		return match_2_2(m);
	}

	Operation FILE_browse::match_2_lis_1(Prolog *m)
	{
		m->retry(nullptr, FILE_browse::match_2_lis_2);
		return match_2_3(m);
	}

	Operation FILE_browse::match_2_lis_2(Prolog *m)
	{
		m->trust(nullptr);
		return match_2_4(m);
	}

	Operation FILE_browse::match_2_1(Prolog *m)
	{
	// match([],[]):-!
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// match([],[]):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
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

	Operation FILE_browse::match_2_2(Prolog *m)
	{
	// match([A|B],[C|D]):-var(C),!,A=C,match(B,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// match([A|B],[C|D]):-['$get_level'(E),var(C),'$cut'(E),'$unify'(A,C),match(B,D)]
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
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if (!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(5))
		a5 = a5->dref();
		if (!(a5->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7->dref();
				  m->cut(a7->intValue());
		//END inline expansion
		//START inline expansion of $unify(a(3),a(5))
		if (!a3->unify(a5, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a6;
		m->cont = cont;
		return match_2_top(m);
	}

	Operation FILE_browse::match_2_3(Prolog *m)
	{
	// match(A,[B|C]):-nonvar(B),B=star(D),!,'$concat'(D,E,A),match(E,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// match(A,[B|C]):-['$get_level'(D),nonvar(B),'$unify'(B,star(E)),'$cut'(D),'$concat'(E,F,A),match(F,C)]
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			a3 = argz[0];
			a4 = argz[1];
		}
		else if (a2->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a2->bind(CONS(a3, a4), m->trail);
		}
		else
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
		//START inline expansion of nonvar(a(3))
		a3 = a3->dref();
		if ((a3->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		a6 = V(m);
	// put_str_args([a(6)],y(1)),put_str(@('FUNCTOR_star_1'),y(1),a(7))
		a7 = S(FUNCTOR_star_1, {a6});
		 ;
		//START inline expansion of $unify(a(3),a(7))
		if (!a3->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
				  m->cut(a5->intValue());
		//END inline expansion
		a8 = V(m);
		return Op([&] (e)
		{
		PRED_$concat_3_static_exec(e);
		}, VA({a6, a8, a1}), Op([&] (e)
		{
		PRED_match_2_static_exec(e);
	}, VA({a8, a4}), cont));
	}

	Operation FILE_browse::match_2_4(Prolog *m)
	{
	// match([A|B],[C|D]):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),match(B,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// match([A|B],[C|D]):-['$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,C),match(B,D)]
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
		return Op([&] (e)
		{
		PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(e);
		}, VA({a3, a5}), Op([&] (e)
		{
		PRED_match_2_static_exec(e);
	}, VA({a4, a6}), cont));
	}

	Operation FILE_browse::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_browse::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(m);
	}

	Operation FILE_browse::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(m);
	}

	Operation FILE_browse::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_1(Prolog *m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-atom(A),!,A=B
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-['$get_level'(C),atom(A),'$cut'(C),'$unify'(A,B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		//START inline expansion of $unify(a(1),a(2))
		if (!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_browse::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_2(Prolog *m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-match(A,B)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl'(A,B):-[match(A,B)]
		return Op([&] (e)
		{
		PRED_match_2_static_exec(e);
		}, VA({a1, a2}), cont);
	}

	Operation FILE_browse::PRED_$concat_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return $concat_3_top(m);
	}

	Operation FILE_browse::$concat_3_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_browse::$concat_3_var, Failure::fail_0, Failure::fail_0, FILE_browse::$concat_3_1, Failure::fail_0, FILE_browse::$concat_3_2);
	}

	Operation FILE_browse::$concat_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_browse::$concat_3_var_1);
		return $concat_3_1(m);
	}

	Operation FILE_browse::$concat_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return $concat_3_2(m);
	}

	Operation FILE_browse::$concat_3_1(Prolog *m)
	{
	// '$concat'([],A,A):-true
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$concat'([],A,A):-[]
		if (!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_browse::$concat_3_2(Prolog *m)
	{
	// '$concat'([A|B],C,[A|D]):-'$concat'(B,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$concat'([A|B],C,[A|D]):-['$concat'(B,C,D)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a4 = argz[0];
			a5 = argz[1];
		}
		else if (a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		}
		else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			if (!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a6 = argz[1];
		}
		else if (a3->isVar())
		{
			a6 = V(m);
			 a3->bind(CONS(a4, a6), m->trail);
		}
		else
		{
			return m->fail();
		}
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = cont;
		return $concat_3_top(m);
	}

	FILE_browse::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_browse::StaticConstructor FILE_browse::staticConstructor;

	void FILE_browse::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_browse::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("init",5,FILE_browse::PRED_init_5_static_exec);
	   PredTable::registerBuiltin("init",6,FILE_browse::PRED_init_6_static_exec);
	   PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl",3,FILE_browse::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_3_static_exec);
	   PredTable::registerBuiltin("fill",3,FILE_browse::PRED_fill_3_static_exec);
	   PredTable::registerBuiltin("randomize",3,FILE_browse::PRED_randomize_3_static_exec);
	   PredTable::registerBuiltin("split",4,FILE_browse::PRED_split_4_static_exec);
	   PredTable::registerBuiltin("investigate",2,FILE_browse::PRED_investigate_2_static_exec);
	   PredTable::registerBuiltin("get_pats",3,FILE_browse::PRED_get_pats_3_static_exec);
	   PredTable::registerBuiltin("get_pats",4,FILE_browse::PRED_get_pats_4_static_exec);
	   PredTable::registerBuiltin("property",3,FILE_browse::PRED_property_3_static_exec);
	   PredTable::registerBuiltin("p_investigate",2,FILE_browse::PRED_p_investigate_2_static_exec);
	   PredTable::registerBuiltin("p_match",2,FILE_browse::PRED_p_match_2_static_exec);
	   PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl","$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl",2,FILE_browse::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec);
	   PredTable::registerBuiltin("match",2,FILE_browse::PRED_match_2_static_exec);
	   PredTable::registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/browse.pl","$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl",2,FILE_browse::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fbrowse$002Epl_2_static_exec);
	   PredTable::registerBuiltin("$concat",3,FILE_browse::PRED_$concat_3_static_exec);
	}
}
