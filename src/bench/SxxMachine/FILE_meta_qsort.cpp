using namespace std;

#include "FILE_meta_qsort.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
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

	Operation FILE_meta_qsort::PRED_top_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-meta_qsort
		m->setB0();
	// top:-[meta_qsort]
		return Op([&] (e)
		{
		PRED_meta_qsort_0_static_exec(e);
		}, VA(), cont);
	}

SymbolTerm *const FILE_meta_qsort::ATOM_qsort = SYM("qsort");

	Operation FILE_meta_qsort::PRED_meta_qsort_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// meta_qsort:-interpret(qsort)
		m->setB0();
	// meta_qsort:-[interpret(qsort)]
		return Op([&] (e)
		{
		PRED_interpret_1_static_exec(e);
		}, VA({ATOM_qsort}), cont);
	}

	Operation FILE_meta_qsort::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_meta_qsort::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_1(m);
	}

	Operation FILE_meta_qsort::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_2(m);
	}

	Operation FILE_meta_qsort::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_1(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-nonvar(A),!,interpret(A)
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-['$get_level'(B),nonvar(A),'$cut'(B),interpret(A)]
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
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
				  m->cut(a2->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		PRED_interpret_1_static_exec(e);
		}, VA({a1}), cont);
	}

	Operation FILE_meta_qsort::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_2(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A):-[]
		return cont;
	}

	Operation FILE_meta_qsort::PRED_interpret_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// interpret(A):-interpret(A,B),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B)
		m->setB0();
		 Term *a1, *a2;
		Operation p1;
		a1 = LARG[0];
	// interpret(A):-[interpret(A,B),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B)]
		a2 = V(m);
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a1, a2}), Op([&] (e)
		{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec(e);
	}, VA({a2}), cont));
	}

SymbolTerm *const FILE_meta_qsort::FUNCTOR_$002C_2 = F(",",2);
SymbolTerm *const FILE_meta_qsort::FUNCTOR_or_2 = F(";",2);
SymbolTerm *const FILE_meta_qsort::FUNCTOR_$002D$003E_2 = F("->",2);
SymbolTerm *const FILE_meta_qsort::ATOM_fail = SYM("fail");
SymbolTerm *const FILE_meta_qsort::FUNCTOR_$005C$002B_1 = F("\\+",1);
SymbolTerm *const FILE_meta_qsort::ATOM_$0021 = SYM("!");

	Operation FILE_meta_qsort::PRED_interpret_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return interpret_2_top(m);
	}

	Operation FILE_meta_qsort::interpret_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_meta_qsort::interpret_2_var, FILE_meta_qsort::interpret_2_int, FILE_meta_qsort::interpret_2_int, FILE_meta_qsort::interpret_2_con, FILE_meta_qsort::interpret_2_str, FILE_meta_qsort::interpret_2_int);
	}

	Operation FILE_meta_qsort::interpret_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_meta_qsort::interpret_2_var_1);
		return interpret_2_1(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_2);
		return interpret_2_2(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_3);
		return interpret_2_3(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_4);
		return interpret_2_4(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_5);
		return interpret_2_5(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_6);
		return interpret_2_6(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_7);
		return interpret_2_7(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_7(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_var_8);
		return interpret_2_8(m);
	}

	Operation FILE_meta_qsort::interpret_2_var_8(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_2_9(m);
	}

	Operation FILE_meta_qsort::interpret_2_int(Prolog *m)
	{
		m->jtry2(nullptr, FILE_meta_qsort::interpret_2_int_1);
		return interpret_2_1(m);
	}

	Operation FILE_meta_qsort::interpret_2_int_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_int_2);
		return interpret_2_7(m);
	}

	Operation FILE_meta_qsort::interpret_2_int_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_int_3);
		return interpret_2_8(m);
	}

	Operation FILE_meta_qsort::interpret_2_int_3(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_2_9(m);
	}

	Operation FILE_meta_qsort::interpret_2_con(Prolog *m)
	{
		m->jtry2(nullptr, FILE_meta_qsort::interpret_2_con_1);
		return interpret_2_1(m);
	}

	Operation FILE_meta_qsort::interpret_2_con_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_con_2);
		return interpret_2_6(m);
	}

	Operation FILE_meta_qsort::interpret_2_con_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_con_3);
		return interpret_2_7(m);
	}

	Operation FILE_meta_qsort::interpret_2_con_3(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_con_4);
		return interpret_2_8(m);
	}

	Operation FILE_meta_qsort::interpret_2_con_4(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_2_9(m);
	}

	Operation FILE_meta_qsort::interpret_2_str(Prolog *m)
	{
		m->jtry2(nullptr, FILE_meta_qsort::interpret_2_str_1);
		return interpret_2_1(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_str_2);
		return interpret_2_2(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_str_3);
		return interpret_2_3(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_3(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_str_4);
		return interpret_2_4(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_4(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_str_5);
		return interpret_2_5(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_5(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_str_6);
		return interpret_2_7(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_6(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_2_str_7);
		return interpret_2_8(m);
	}

	Operation FILE_meta_qsort::interpret_2_str_7(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_2_9(m);
	}

	Operation FILE_meta_qsort::interpret_2_1(Prolog *m)
	{
	// interpret(A,B):-var(A),!,fail
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret(A,B):-['$get_level'(C),var(A),'$cut'(C),fail]
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
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_meta_qsort::interpret_2_2(Prolog *m)
	{
	// interpret((A,B),C):-!,interpret(A,D),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,C,D)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret((A,B),C):-['$neck_cut',interpret(A,D),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,C,D)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C(FUNCTOR_$002C_2, {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a5 = V(m);
		p1 = Op([&] (e)
		{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(e);
		}, VA({a4, a2, a5}), cont);
		m->AREGS[0] = a3;
		m->AREGS[1] = a5;
		m->cont = p1;
		return interpret_2_top(m);
	}

	Operation FILE_meta_qsort::interpret_2_3(Prolog *m)
	{
	// interpret((A;B),C):-!,interpret_disjunction(A,B,C)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret((A;B),C):-['$neck_cut',interpret_disjunction(A,B,C)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C(FUNCTOR_or_2, {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_interpret_disjunction_3_static_exec(e);
		}, VA({a3, a4, a2}), cont);
	}

	Operation FILE_meta_qsort::interpret_2_4(Prolog *m)
	{
	// interpret((A->B),C):-!,interpret_disjunction((A->B),fail,C)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret((A->B),C):-['$neck_cut',interpret_disjunction((A->B),fail,C)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if (!a1->unify(C(FUNCTOR_$002D$003E_2, {a3, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
	// put_str_args([a(3),a(4)],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002D$003E_2, {a3, a4});
		 ;
		return Op([&] (e)
		{
		PRED_interpret_disjunction_3_static_exec(e);
		}, VA({a5, ATOM_fail, a2}), cont);
	}

	Operation FILE_meta_qsort::interpret_2_5(Prolog *m)
	{
	// interpret(\+A,B):-!,interpret_disjunction((A->fail),true,B)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret(\+A,B):-['$neck_cut',interpret_disjunction((A->fail),true,B)]
		a1 = a1->dref();
			a3 = V(m);
			if (!a1->unify(C(FUNCTOR_$005C$002B_1, {a3}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
	// put_str_args([a(3),@('ATOM_fail')],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002D$003E_2, {a3, ATOM_fail});
		 ;
		return Op([&] (e)
		{
		PRED_interpret_disjunction_3_static_exec(e);
		}, VA({a4, Prolog::True, a2}), cont);
	}

	Operation FILE_meta_qsort::interpret_2_6(Prolog *m)
	{
	// interpret(!,true):-!
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret(!,true):-['$neck_cut']
		if (!ATOM_$0021->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::True->unify(a2, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_meta_qsort::interpret_2_7(Prolog *m)
	{
	// interpret(A,B):-number(A),!,fail
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret(A,B):-['$get_level'(C),number(A),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of number(a(1))
		a1 = a1->dref();
		if (!a1->isNumber())
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

	Operation FILE_meta_qsort::interpret_2_8(Prolog *m)
	{
	// interpret(A,B):-is_built_in(A),!,interpret_built_in(A)
		 Term *a1, *a2, *a3;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret(A,B):-['$get_level'(C),is_built_in(A),'$cut'(C),interpret_built_in(A)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_is_built_in_1_static_exec(e);
		}, VA({a1}), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), Op([&] (e)
	{
		PRED_interpret_built_in_1_static_exec(e);
	}, VA({a1}), cont)));
	}

	Operation FILE_meta_qsort::interpret_2_9(Prolog *m)
	{
	// interpret(A,B):-define(A,C),interpret(C)
		 Term *a1, *a2, *a3;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// interpret(A,B):-[define(A,C),interpret(C)]
		a3 = V(m);
		return Op([&] (e)
		{
		PRED_define_2_static_exec(e);
		}, VA({a1, a3}), Op([&] (e)
		{
		PRED_interpret_1_static_exec(e);
	}, VA({a3}), cont));
	}

	Operation FILE_meta_qsort::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_meta_qsort::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(m);
	}

	Operation FILE_meta_qsort::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(m);
	}

	Operation FILE_meta_qsort::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog *m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-nonvar(C),!,B=(C,A)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-['$get_level'(D),nonvar(C),'$cut'(D),'$unify'(B,(C,A))]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
	// put_str_args([a(3),a(1)],y(1)),put_str(@('FUNCTOR_$002C_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002C_2, {a3, a1});
		 ;
		//START inline expansion of $unify(a(2),a(5))
		if (!a2->unify(a5, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_meta_qsort::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog *m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-interpret(A,B)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-[interpret(A,B)]
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a1, a2}), cont);
	}

	Operation FILE_meta_qsort::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_meta_qsort::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(m);
	}

	Operation FILE_meta_qsort::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(m);
	}

	Operation FILE_meta_qsort::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_1(Prolog *m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-nonvar(C),!,B=(C->A)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-['$get_level'(D),nonvar(C),'$cut'(D),'$unify'(B,(C->A))]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
	// put_str_args([a(3),a(1)],y(1)),put_str(@('FUNCTOR_$002D$003E_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002D$003E_2, {a3, a1});
		 ;
		//START inline expansion of $unify(a(2),a(5))
		if (!a2->unify(a5, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_meta_qsort::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_2(Prolog *m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-interpret(A,B)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(A,B,C):-[interpret(A,B)]
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a1, a2}), cont);
	}

	Operation FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_meta_qsort::interpret_disjunction_3_var, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_int, FILE_meta_qsort::interpret_disjunction_3_var, FILE_meta_qsort::interpret_disjunction_3_int);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_meta_qsort::interpret_disjunction_3_var_1);
		return interpret_disjunction_3_1(m);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_disjunction_3_var_2);
		return interpret_disjunction_3_2(m);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::interpret_disjunction_3_var_3);
		return interpret_disjunction_3_3(m);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_var_3(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_disjunction_3_4(m);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_int(Prolog *m)
	{
		m->jtry3(nullptr, FILE_meta_qsort::interpret_disjunction_3_int_1);
		return interpret_disjunction_3_3(m);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_disjunction_3_4(m);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_1(Prolog *m)
	{
	// interpret_disjunction((A->B),C,D):-interpret(A,E),!,'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,D,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// interpret_disjunction((A->B),C,D):-['$get_level'(E),interpret(A,F),'$cut'(E),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl'(B,D,F)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_$002D$003E_2, {a4, a5}), m->trail))
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
		a7 = V(m);
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a4, a7}), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a6}), Op([&] (e)
	{
		PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec(e);
	}, VA({a5, a3, a7}), cont)));
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_2(Prolog *m)
	{
	// interpret_disjunction((A->B),C,D):-!,interpret(C,D)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// interpret_disjunction((A->B),C,D):-['$neck_cut',interpret(C,D)]
		a1 = a1->dref();
			if (!a1->unify(C(FUNCTOR_$002D$003E_2, V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a2, a3}), cont);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_3(Prolog *m)
	{
	// interpret_disjunction(A,B,C):-interpret(A,C)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// interpret_disjunction(A,B,C):-[interpret(A,C)]
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a1, a3}), cont);
	}

	Operation FILE_meta_qsort::interpret_disjunction_3_4(Prolog *m)
	{
	// interpret_disjunction(A,B,C):-interpret(B,C)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// interpret_disjunction(A,B,C):-[interpret(B,C)]
		return Op([&] (e)
		{
		PRED_interpret_2_static_exec(e);
		}, VA({a2, a3}), cont);
	}

SymbolTerm *const FILE_meta_qsort::FUNCTOR_$003D$003C_2 = F("=<",2);

	Operation FILE_meta_qsort::PRED_is_built_in_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_meta_qsort::is_built_in_1_var, Failure::fail_0, Failure::fail_0, FILE_meta_qsort::is_built_in_1_1, FILE_meta_qsort::is_built_in_1_2, Failure::fail_0);
	}

	Operation FILE_meta_qsort::is_built_in_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_meta_qsort::is_built_in_1_var_1);
		return is_built_in_1_1(m);
	}

	Operation FILE_meta_qsort::is_built_in_1_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return is_built_in_1_2(m);
	}

	Operation FILE_meta_qsort::is_built_in_1_1(Prolog *m)
	{
	// is_built_in(true):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// is_built_in(true):-[]
		if (!Prolog::True->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_meta_qsort::is_built_in_1_2(Prolog *m)
	{
	// is_built_in(A=<B):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// is_built_in(A=<B):-[]
		a1 = a1->dref();
			if (!a1->unify(C(FUNCTOR_$003D$003C_2, V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

	Operation FILE_meta_qsort::PRED_interpret_built_in_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_meta_qsort::interpret_built_in_1_var, Failure::fail_0, Failure::fail_0, FILE_meta_qsort::interpret_built_in_1_1, FILE_meta_qsort::interpret_built_in_1_2, Failure::fail_0);
	}

	Operation FILE_meta_qsort::interpret_built_in_1_var(Prolog *m)
	{
		m->jtry1(nullptr, FILE_meta_qsort::interpret_built_in_1_var_1);
		return interpret_built_in_1_1(m);
	}

	Operation FILE_meta_qsort::interpret_built_in_1_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return interpret_built_in_1_2(m);
	}

	Operation FILE_meta_qsort::interpret_built_in_1_1(Prolog *m)
	{
	// interpret_built_in(true):-true
		 Term *a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// interpret_built_in(true):-[]
		if (!Prolog::True->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_meta_qsort::interpret_built_in_1_2(Prolog *m)
	{
	// interpret_built_in(A=<B):-A=<B
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// interpret_built_in(A=<B):-['$less_or_equal'(A,B)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			if (!a1->unify(C(FUNCTOR_$003D$003C_2, {a2, a3}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $less_or_equal(a(2),a(3))
		if (Arithmetic::evaluate(a2)->arithCompareTo(Arithmetic::evaluate(a3)) > 0)
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

SymbolTerm *const FILE_meta_qsort::FUNCTOR_qsort_3 = F("qsort",3);
IntegerTerm *const FILE_meta_qsort::int_27 = optional<int>(27);
IntegerTerm *const FILE_meta_qsort::int_74 = optional<int>(74);
IntegerTerm *const FILE_meta_qsort::int_33 = optional<int>(33);
IntegerTerm *const FILE_meta_qsort::int_94 = optional<int>(94);
IntegerTerm *const FILE_meta_qsort::int_46 = optional<int>(46);
IntegerTerm *const FILE_meta_qsort::int_83 = optional<int>(83);
IntegerTerm *const FILE_meta_qsort::int_65 = optional<int>(65);
IntegerTerm *const FILE_meta_qsort::int_32 = optional<int>(32);
IntegerTerm *const FILE_meta_qsort::int_53 = optional<int>(53);
IntegerTerm *const FILE_meta_qsort::int_28 = optional<int>(28);
IntegerTerm *const FILE_meta_qsort::int_85 = optional<int>(85);
IntegerTerm *const FILE_meta_qsort::int_99 = optional<int>(99);
IntegerTerm *const FILE_meta_qsort::int_47 = optional<int>(47);
IntegerTerm *const FILE_meta_qsort::int_82 = optional<int>(82);
IntegerTerm *const FILE_meta_qsort::int_55 = optional<int>(55);
IntegerTerm *const FILE_meta_qsort::int_29 = optional<int>(29);
IntegerTerm *const FILE_meta_qsort::int_39 = optional<int>(39);
IntegerTerm *const FILE_meta_qsort::int_81 = optional<int>(81);
IntegerTerm *const FILE_meta_qsort::int_90 = optional<int>(90);
IntegerTerm *const FILE_meta_qsort::int_37 = optional<int>(37);
IntegerTerm *const FILE_meta_qsort::int_66 = optional<int>(66);
IntegerTerm *const FILE_meta_qsort::int_51 = optional<int>(51);
IntegerTerm *const FILE_meta_qsort::int_31 = optional<int>(31);
IntegerTerm *const FILE_meta_qsort::int_63 = optional<int>(63);
IntegerTerm *const FILE_meta_qsort::int_75 = optional<int>(75);
IntegerTerm *const FILE_meta_qsort::int_95 = optional<int>(95);
IntegerTerm *const FILE_meta_qsort::int_61 = optional<int>(61);
IntegerTerm *const FILE_meta_qsort::int_92 = optional<int>(92);
IntegerTerm *const FILE_meta_qsort::int_40 = optional<int>(40);
IntegerTerm *const FILE_meta_qsort::int_59 = optional<int>(59);
ListTerm *const FILE_meta_qsort::L_define_2_s45 = CONS(int_8, Prolog::Nil);
ListTerm *const FILE_meta_qsort::L_define_2_s46 = CONS(int_59, L_define_2_s45);
ListTerm *const FILE_meta_qsort::L_define_2_s47 = CONS(int_53, L_define_2_s46);
ListTerm *const FILE_meta_qsort::L_define_2_s48 = CONS(int_40, L_define_2_s47);
ListTerm *const FILE_meta_qsort::L_define_2_s49 = CONS(int_92, L_define_2_s48);
ListTerm *const FILE_meta_qsort::L_define_2_s50 = CONS(int_18, L_define_2_s49);
ListTerm *const FILE_meta_qsort::L_define_2_s51 = CONS(int_74, L_define_2_s50);
ListTerm *const FILE_meta_qsort::L_define_2_s52 = CONS(int_61, L_define_2_s51);
ListTerm *const FILE_meta_qsort::L_define_2_s53 = CONS(int_28, L_define_2_s52);
ListTerm *const FILE_meta_qsort::L_define_2_s54 = CONS(int_11, L_define_2_s53);
ListTerm *const FILE_meta_qsort::L_define_2_s55 = CONS(int_99, L_define_2_s54);
ListTerm *const FILE_meta_qsort::L_define_2_s56 = CONS(int_95, L_define_2_s55);
ListTerm *const FILE_meta_qsort::L_define_2_s57 = CONS(int_4, L_define_2_s56);
ListTerm *const FILE_meta_qsort::L_define_2_s58 = CONS(int_75, L_define_2_s57);
ListTerm *const FILE_meta_qsort::L_define_2_s59 = CONS(int_63, L_define_2_s58);
ListTerm *const FILE_meta_qsort::L_define_2_s60 = CONS(int_31, L_define_2_s59);
ListTerm *const FILE_meta_qsort::L_define_2_s61 = CONS(int_27, L_define_2_s60);
ListTerm *const FILE_meta_qsort::L_define_2_s62 = CONS(int_85, L_define_2_s61);
ListTerm *const FILE_meta_qsort::L_define_2_s63 = CONS(int_21, L_define_2_s62);
ListTerm *const FILE_meta_qsort::L_define_2_s64 = CONS(int_7, L_define_2_s63);
ListTerm *const FILE_meta_qsort::L_define_2_s65 = CONS(int_51, L_define_2_s64);
ListTerm *const FILE_meta_qsort::L_define_2_s66 = CONS(int_66, L_define_2_s65);
ListTerm *const FILE_meta_qsort::L_define_2_s67 = CONS(int_0, L_define_2_s66);
ListTerm *const FILE_meta_qsort::L_define_2_s68 = CONS(int_10, L_define_2_s67);
ListTerm *const FILE_meta_qsort::L_define_2_s69 = CONS(int_37, L_define_2_s68);
ListTerm *const FILE_meta_qsort::L_define_2_s70 = CONS(int_90, L_define_2_s69);
ListTerm *const FILE_meta_qsort::L_define_2_s71 = CONS(int_81, L_define_2_s70);
ListTerm *const FILE_meta_qsort::L_define_2_s72 = CONS(int_39, L_define_2_s71);
ListTerm *const FILE_meta_qsort::L_define_2_s73 = CONS(int_29, L_define_2_s72);
ListTerm *const FILE_meta_qsort::L_define_2_s74 = CONS(int_55, L_define_2_s73);
ListTerm *const FILE_meta_qsort::L_define_2_s75 = CONS(int_11, L_define_2_s74);
ListTerm *const FILE_meta_qsort::L_define_2_s76 = CONS(int_6, L_define_2_s75);
ListTerm *const FILE_meta_qsort::L_define_2_s77 = CONS(int_82, L_define_2_s76);
ListTerm *const FILE_meta_qsort::L_define_2_s78 = CONS(int_28, L_define_2_s77);
ListTerm *const FILE_meta_qsort::L_define_2_s79 = CONS(int_47, L_define_2_s78);
ListTerm *const FILE_meta_qsort::L_define_2_s80 = CONS(int_99, L_define_2_s79);
ListTerm *const FILE_meta_qsort::L_define_2_s81 = CONS(int_85, L_define_2_s80);
ListTerm *const FILE_meta_qsort::L_define_2_s82 = CONS(int_28, L_define_2_s81);
ListTerm *const FILE_meta_qsort::L_define_2_s83 = CONS(int_53, L_define_2_s82);
ListTerm *const FILE_meta_qsort::L_define_2_s84 = CONS(int_32, L_define_2_s83);
ListTerm *const FILE_meta_qsort::L_define_2_s85 = CONS(int_2, L_define_2_s84);
ListTerm *const FILE_meta_qsort::L_define_2_s86 = CONS(int_65, L_define_2_s85);
ListTerm *const FILE_meta_qsort::L_define_2_s87 = CONS(int_83, L_define_2_s86);
ListTerm *const FILE_meta_qsort::L_define_2_s88 = CONS(int_46, L_define_2_s87);
ListTerm *const FILE_meta_qsort::L_define_2_s89 = CONS(int_18, L_define_2_s88);
ListTerm *const FILE_meta_qsort::L_define_2_s90 = CONS(int_94, L_define_2_s89);
ListTerm *const FILE_meta_qsort::L_define_2_s91 = CONS(int_33, L_define_2_s90);
ListTerm *const FILE_meta_qsort::L_define_2_s92 = CONS(int_17, L_define_2_s91);
ListTerm *const FILE_meta_qsort::L_define_2_s93 = CONS(int_74, L_define_2_s92);
ListTerm *const FILE_meta_qsort::L_define_2_s94 = CONS(int_27, L_define_2_s93);
SymbolTerm *const FILE_meta_qsort::FUNCTOR_partition_4 = F("partition",4);

	Operation FILE_meta_qsort::PRED_define_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_meta_qsort::define_2_var, Failure::fail_0, Failure::fail_0, FILE_meta_qsort::define_2_1, FILE_meta_qsort::define_2_str, Failure::fail_0);
	}

	Operation FILE_meta_qsort::define_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_meta_qsort::define_2_var_1);
		return define_2_1(m);
	}

	Operation FILE_meta_qsort::define_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_var_2);
		return define_2_2(m);
	}

	Operation FILE_meta_qsort::define_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_var_3);
		return define_2_3(m);
	}

	Operation FILE_meta_qsort::define_2_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_var_4);
		return define_2_4(m);
	}

	Operation FILE_meta_qsort::define_2_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_var_5);
		return define_2_5(m);
	}

	Operation FILE_meta_qsort::define_2_var_5(Prolog *m)
	{
		m->trust(nullptr);
		return define_2_6(m);
	}

	Operation FILE_meta_qsort::define_2_str(Prolog *m)
	{
		m->jtry2(nullptr, FILE_meta_qsort::define_2_str_1);
		return define_2_2(m);
	}

	Operation FILE_meta_qsort::define_2_str_1(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_str_2);
		return define_2_3(m);
	}

	Operation FILE_meta_qsort::define_2_str_2(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_str_3);
		return define_2_4(m);
	}

	Operation FILE_meta_qsort::define_2_str_3(Prolog *m)
	{
		m->retry(nullptr, FILE_meta_qsort::define_2_str_4);
		return define_2_5(m);
	}

	Operation FILE_meta_qsort::define_2_str_4(Prolog *m)
	{
		m->trust(nullptr);
		return define_2_6(m);
	}

	Operation FILE_meta_qsort::define_2_1(Prolog *m)
	{
	// define(qsort,qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// define(qsort,qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])):-[]
		if (!ATOM_qsort->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
			if (!a2->unify(C(FUNCTOR_qsort_3, L_define_2_s94, V(m), Prolog::Nil), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

	Operation FILE_meta_qsort::define_2_2(Prolog *m)
	{
	// define(qsort([A|B],C,D),(partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G]))):-true
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// define(qsort([A|B],C,D),(partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G]))):-[]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_qsort_3, {a3, a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a6 = argz[0];
			a7 = argz[1];
		}
		else if (a3->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			 a3->bind(CONS(a6, a7), m->trail);
		}
		else
		{
			return m->fail();
		}
		a2 = a2->dref();
			a8 = V(m);
			a9 = V(m);
			if (!a2->unify(C(FUNCTOR_$002C_2, {a8, a9}), m->trail))
			{
				return m->fail();
			}
		a8 = a8->dref();
			a10 = V(m);
			a11 = V(m);
			if (!a8->unify(C(FUNCTOR_partition_4, {a7, a6, a10, a11}), m->trail))
			{
				return m->fail();
			}
		a9 = a9->dref();
			a12 = V(m);
			a13 = V(m);
			if (!a9->unify(C(FUNCTOR_$002C_2, {a12, a13}), m->trail))
			{
				return m->fail();
			}
		a12 = a12->dref();
			a14 = V(m);
			if (!a12->unify(C(FUNCTOR_qsort_3, {a11, a14, a5}), m->trail))
			{
				return m->fail();
			}
		a13 = a13->dref();
			a15 = V(m);
			if (!a13->unify(C(FUNCTOR_qsort_3, {a10, a4, a15}), m->trail))
			{
				return m->fail();
			}
		a15 = a15->dref();
		if (a15->isCons())
		{
			std::vector<Term*> argz = VA({a15->car(), a15->cdr()});
			if (!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if (!a14->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a15->isVar())
		{
			 a15->bind(CONS(a6, a14), m->trail);
		}
		else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_meta_qsort::define_2_3(Prolog *m)
	{
	// define(qsort([],A,A),true):-true
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// define(qsort([],A,A),true):-[]
		a1 = a1->dref();
			a3 = V(m);
			if (!a1->unify(C(FUNCTOR_qsort_3, Prolog::Nil, a3, a3), m->trail))
			{
				return m->fail();
			}
		if (!Prolog::True->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_meta_qsort::define_2_4(Prolog *m)
	{
	// define(partition([A|B],C,[A|D],E),(A=<C,!,partition(B,C,D,E))):-true
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// define(partition([A|B],C,[A|D],E),(A=<C,!,partition(B,C,D,E))):-[]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			a6 = V(m);
			if (!a1->unify(C(FUNCTOR_partition_4, {a3, a4, a5, a6}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a7 = argz[0];
			a8 = argz[1];
		}
		else if (a3->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a3->bind(CONS(a7, a8), m->trail);
		}
		else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if (a5->isCons())
		{
			std::vector<Term*> argz = VA({a5->car(), a5->cdr()});
			if (!a7->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a9 = argz[1];
		}
		else if (a5->isVar())
		{
			a9 = V(m);
			 a5->bind(CONS(a7, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a2 = a2->dref();
			a10 = V(m);
			a11 = V(m);
			if (!a2->unify(C(FUNCTOR_$002C_2, {a10, a11}), m->trail))
			{
				return m->fail();
			}
		a10 = a10->dref();
			if (!a10->unify(C(FUNCTOR_$003D$003C_2, {a7, a4}), m->trail))
			{
				return m->fail();
			}
		a11 = a11->dref();
			a12 = V(m);
			if (!a11->unify(C(FUNCTOR_$002C_2, ATOM_$0021, a12), m->trail))
			{
				return m->fail();
			}
		a12 = a12->dref();
			if (!a12->unify(C(FUNCTOR_partition_4, {a8, a4, a9, a6}), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

	Operation FILE_meta_qsort::define_2_5(Prolog *m)
	{
	// define(partition([A|B],C,D,[A|E]),partition(B,C,D,E)):-true
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// define(partition([A|B],C,D,[A|E]),partition(B,C,D,E)):-[]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			a6 = V(m);
			if (!a1->unify(C(FUNCTOR_partition_4, {a3, a4, a5, a6}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a7 = argz[0];
			a8 = argz[1];
		}
		else if (a3->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a3->bind(CONS(a7, a8), m->trail);
		}
		else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if (a6->isCons())
		{
			std::vector<Term*> argz = VA({a6->car(), a6->cdr()});
			if (!a7->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a9 = argz[1];
		}
		else if (a6->isVar())
		{
			a9 = V(m);
			 a6->bind(CONS(a7, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a2 = a2->dref();
			if (!a2->unify(C(FUNCTOR_partition_4, {a8, a4, a5, a9}), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

	Operation FILE_meta_qsort::define_2_6(Prolog *m)
	{
	// define(partition([],A,[],[]),true):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// define(partition([],A,[],[]),true):-[]
		a1 = a1->dref();
			if (!a1->unify(C(FUNCTOR_partition_4, Prolog::Nil, V(m), Prolog::Nil, Prolog::Nil), m->trail))
			{
				return m->fail();
			}
		if (!Prolog::True->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	FILE_meta_qsort::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_meta_qsort::StaticConstructor FILE_meta_qsort::staticConstructor;

	void FILE_meta_qsort::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_meta_qsort::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("meta_qsort",0,FILE_meta_qsort::PRED_meta_qsort_0_static_exec);
	   PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl",1,FILE_meta_qsort::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_1_static_exec);
	   PredTable::registerBuiltin("interpret",1,FILE_meta_qsort::PRED_interpret_1_static_exec);
	   PredTable::registerBuiltin("interpret",2,FILE_meta_qsort::PRED_interpret_2_static_exec);
	   PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl","$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl",3,FILE_meta_qsort::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec);
	   PredTable::registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/meta_qsort.pl","$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl",3,FILE_meta_qsort::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fmeta_qsort$002Epl_3_static_exec);
	   PredTable::registerBuiltin("interpret_disjunction",3,FILE_meta_qsort::PRED_interpret_disjunction_3_static_exec);
	   PredTable::registerBuiltin("is_built_in",1,FILE_meta_qsort::PRED_is_built_in_1_static_exec);
	   PredTable::registerBuiltin("interpret_built_in",1,FILE_meta_qsort::PRED_interpret_built_in_1_static_exec);
	   PredTable::registerBuiltin("define",2,FILE_meta_qsort::PRED_define_2_static_exec);
	}
}
