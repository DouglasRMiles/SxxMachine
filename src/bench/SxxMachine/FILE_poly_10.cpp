using namespace std;

#include "FILE_poly_10.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/Arithmetic.h"
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

	Operation FILE_poly_10::PRED_top_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-poly_10
		m->setB0();
	// top:-[poly_10]
		return Op([&] (e)
		{
		PRED_poly_10_0_static_exec(e);
		}, VA(), cont);
	}

	Operation FILE_poly_10::PRED_poly_10_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// poly_10:-test_poly(A),poly_exp(10,A,B)
		m->setB0();
		 Term *a1;
		Operation p1;
	// poly_10:-[test_poly(A),poly_exp(10,A,B)]
		a1 = V(m);
		return Op([&] (e)
		{
		PRED_test_poly_1_static_exec(e);
		}, VA({a1}), Op([&] (e)
		{
		PRED_poly_exp_3_static_exec(e);
	}, VA({int_10, a1, V(m)}), cont));
	}

SymbolTerm *const FILE_poly_10::FUNCTOR_poly_2 = F("poly",2);
SymbolTerm *const FILE_poly_10::ATOM_x = SYM("x");
SymbolTerm *const FILE_poly_10::FUNCTOR_term_2 = F("term",2);
StructureTerm *const FILE_poly_10::L_test_poly_1_s7 = S(FUNCTOR_term_2, int_0, int_1);
StructureTerm *const FILE_poly_10::L_test_poly_1_s9 = S(FUNCTOR_term_2, int_1, int_1);
ListTerm *const FILE_poly_10::L_test_poly_1_s11 = CONS(L_test_poly_1_s9, Prolog::Nil);
ListTerm *const FILE_poly_10::L_test_poly_1_s12 = CONS(L_test_poly_1_s7, L_test_poly_1_s11);
StructureTerm *const FILE_poly_10::L_test_poly_1_s14 = S(FUNCTOR_poly_2, ATOM_x, L_test_poly_1_s12);
SymbolTerm *const FILE_poly_10::ATOM_y = SYM("y");
StructureTerm *const FILE_poly_10::L_test_poly_1_s17 = S(FUNCTOR_poly_2, ATOM_y, L_test_poly_1_s11);
SymbolTerm *const FILE_poly_10::ATOM_z = SYM("z");
StructureTerm *const FILE_poly_10::L_test_poly_1_s20 = S(FUNCTOR_poly_2, ATOM_z, L_test_poly_1_s11);

	Operation FILE_poly_10::PRED_test_poly_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// test_poly(A):-poly_add(poly(x,[term(0,1),term(1,1)]),poly(y,[term(1,1)]),B),poly_add(poly(z,[term(1,1)]),B,A)
		m->setB0();
		 Term *a1, *a2;
		Operation p1;
		a1 = LARG[0];
	// test_poly(A):-[poly_add(poly(x,[term(0,1),term(1,1)]),poly(y,[term(1,1)]),B),poly_add(poly(z,[term(1,1)]),B,A)]
		a2 = V(m);
		return Op([&] (e)
		{
		PRED_poly_add_3_static_exec(e);
		}, VA({L_test_poly_1_s14, L_test_poly_1_s17, a2}), Op([&] (e)
		{
		PRED_poly_add_3_static_exec(e);
	}, VA({L_test_poly_1_s20, a2, a1}), cont));
	}

	Operation FILE_poly_10::PRED_less_than_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::less_than_2_var, Failure::fail_0, Failure::fail_0, FILE_poly_10::less_than_2_var, Failure::fail_0, Failure::fail_0);
	}

	Operation FILE_poly_10::less_than_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_poly_10::less_than_2_var_1);
		return less_than_2_1(m);
	}

	Operation FILE_poly_10::less_than_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::less_than_2_var_2);
		return less_than_2_2(m);
	}

	Operation FILE_poly_10::less_than_2_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return less_than_2_3(m);
	}

	Operation FILE_poly_10::less_than_2_1(Prolog *m)
	{
	// x less_than y:-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// x less_than y:-[]
		if (!ATOM_x->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!ATOM_y->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_poly_10::less_than_2_2(Prolog *m)
	{
	// y less_than z:-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// y less_than z:-[]
		if (!ATOM_y->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!ATOM_z->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_poly_10::less_than_2_3(Prolog *m)
	{
	// x less_than z:-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// x less_than z:-[]
		if (!ATOM_x->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!ATOM_z->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SymbolTerm *const FILE_poly_10::FUNCTOR_$002B_2 = F("+",2);

	Operation FILE_poly_10::PRED_poly_add_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::poly_add_3_var, FILE_poly_10::poly_add_3_int, FILE_poly_10::poly_add_3_int, FILE_poly_10::poly_add_3_int, FILE_poly_10::poly_add_3_var, FILE_poly_10::poly_add_3_int);
	}

	Operation FILE_poly_10::poly_add_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::poly_add_3_var_1);
		return poly_add_3_1(m);
	}

	Operation FILE_poly_10::poly_add_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_add_3_var_2);
		return poly_add_3_2(m);
	}

	Operation FILE_poly_10::poly_add_3_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_add_3_var_3);
		return poly_add_3_3(m);
	}

	Operation FILE_poly_10::poly_add_3_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_add_3_var_4);
		return poly_add_3_4(m);
	}

	Operation FILE_poly_10::poly_add_3_var_4(Prolog *m)
	{
		m->trust(nullptr);
		return poly_add_3_5(m);
	}

	Operation FILE_poly_10::poly_add_3_int(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::poly_add_3_int_1);
		return poly_add_3_3(m);
	}

	Operation FILE_poly_10::poly_add_3_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return poly_add_3_5(m);
	}

	Operation FILE_poly_10::poly_add_3_1(Prolog *m)
	{
	// poly_add(poly(A,B),poly(A,C),poly(A,D)):-!,term_add(B,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_add(poly(A,B),poly(A,C),poly(A,D)):-['$neck_cut',term_add(B,C,D)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			if (!a2->unify(C(FUNCTOR_poly_2, {a4, a6}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a7}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_term_add_3_static_exec(e);
		}, VA({a5, a6, a7}), cont);
	}

	Operation FILE_poly_10::poly_add_3_2(Prolog *m)
	{
	// poly_add(poly(A,B),poly(C,D),poly(A,E)):-A less_than C,!,add_to_order_zero_term(B,poly(C,D),E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_add(poly(A,B),poly(C,D),poly(A,E)):-['$get_level'(F),A less_than C,'$cut'(F),add_to_order_zero_term(B,poly(C,D),E)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a2->unify(C(FUNCTOR_poly_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a8 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a8}), m->trail))
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
	// put_str_args([a(6),a(7)],y(1)),put_str(@('FUNCTOR_poly_2'),y(1),a(10))
		a10 = S(FUNCTOR_poly_2, {a6, a7});
		 ;
		return Op([&] (e)
		{
		PRED_less_than_2_static_exec(e);
		}, VA({a4, a6}), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a9}), Op([&] (e)
	{
		PRED_add_to_order_zero_term_3_static_exec(e);
	}, VA({a5, a10, a8}), cont)));
	}

	Operation FILE_poly_10::poly_add_3_3(Prolog *m)
	{
	// poly_add(A,poly(B,C),poly(B,D)):-!,add_to_order_zero_term(C,A,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_add(A,poly(B,C),poly(B,D)):-['$neck_cut',add_to_order_zero_term(C,A,D)]
		a2 = a2->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a2->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a6}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_add_to_order_zero_term_3_static_exec(e);
		}, VA({a5, a1, a6}), cont);
	}

	Operation FILE_poly_10::poly_add_3_4(Prolog *m)
	{
	// poly_add(poly(A,B),C,poly(A,D)):-!,add_to_order_zero_term(B,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_add(poly(A,B),C,poly(A,D)):-['$neck_cut',add_to_order_zero_term(B,C,D)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a6}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_add_to_order_zero_term_3_static_exec(e);
		}, VA({a5, a2, a6}), cont);
	}

	Operation FILE_poly_10::poly_add_3_5(Prolog *m)
	{
	// poly_add(A,B,C):-C is A+B
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_add(A,B,C):-[C is A+B]
	// put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002B_2, {a1, a2});
		 ;
		//START inline expansion of a(3)is a(4)
		if (!a3->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_poly_10::PRED_term_add_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return term_add_3_top(m);
	}

	Operation FILE_poly_10::term_add_3_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_poly_10::term_add_3_var, FILE_poly_10::term_add_3_int, FILE_poly_10::term_add_3_int, FILE_poly_10::term_add_3_con, FILE_poly_10::term_add_3_int, FILE_poly_10::term_add_3_lis);
	}

	Operation FILE_poly_10::term_add_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_add_3_var_1);
		return term_add_3_1(m);
	}

	Operation FILE_poly_10::term_add_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_add_3_var_2);
		return term_add_3_2(m);
	}

	Operation FILE_poly_10::term_add_3_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_add_3_var_3);
		return term_add_3_3(m);
	}

	Operation FILE_poly_10::term_add_3_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_add_3_var_4);
		return term_add_3_4(m);
	}

	Operation FILE_poly_10::term_add_3_var_4(Prolog *m)
	{
		m->trust(nullptr);
		return term_add_3_5(m);
	}

	Operation FILE_poly_10::term_add_3_int(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_add_3_int_1);
		return term_add_3_2(m);
	}

	Operation FILE_poly_10::term_add_3_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return term_add_3_5(m);
	}

	Operation FILE_poly_10::term_add_3_con(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_add_3_con_1);
		return term_add_3_1(m);
	}

	Operation FILE_poly_10::term_add_3_con_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_add_3_con_2);
		return term_add_3_2(m);
	}

	Operation FILE_poly_10::term_add_3_con_2(Prolog *m)
	{
		m->trust(nullptr);
		return term_add_3_5(m);
	}

	Operation FILE_poly_10::term_add_3_lis(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_add_3_lis_1);
		return term_add_3_2(m);
	}

	Operation FILE_poly_10::term_add_3_lis_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_add_3_lis_2);
		return term_add_3_3(m);
	}

	Operation FILE_poly_10::term_add_3_lis_2(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_add_3_lis_3);
		return term_add_3_4(m);
	}

	Operation FILE_poly_10::term_add_3_lis_3(Prolog *m)
	{
		m->trust(nullptr);
		return term_add_3_5(m);
	}

	Operation FILE_poly_10::term_add_3_1(Prolog *m)
	{
	// term_add([],A,A):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_add([],A,A):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
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

	Operation FILE_poly_10::term_add_3_2(Prolog *m)
	{
	// term_add(A,[],A):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_add(A,[],A):-['$neck_cut']
		if (!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		if (!a1->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_poly_10::term_add_3_3(Prolog *m)
	{
	// term_add([term(A,B)|C],[term(A,D)|E],[term(A,F)|G]):-!,poly_add(B,D,F),term_add(C,E,G)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_add([term(A,B)|C],[term(A,D)|E],[term(A,F)|G]):-['$neck_cut',poly_add(B,D,F),term_add(C,E,G)]
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
		a4 = a4->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a4->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			a8 = argz[0];
			a9 = argz[1];
		}
		else if (a2->isVar())
		{
			a8 = V(m);
			a9 = V(m);
			 a2->bind(CONS(a8, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = a8->dref();
			a10 = V(m);
			if (!a8->unify(C(FUNCTOR_term_2, {a6, a10}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a11 = argz[0];
			a12 = argz[1];
		}
		else if (a3->isVar())
		{
			a11 = V(m);
			a12 = V(m);
			 a3->bind(CONS(a11, a12), m->trail);
		}
		else
		{
			return m->fail();
		}
		a11 = a11->dref();
			a13 = V(m);
			if (!a11->unify(C(FUNCTOR_term_2, {a6, a13}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_poly_add_3_static_exec(e);
		}, VA({a7, a10, a13}), Op([&] (e)
		{
		PRED_term_add_3_static_exec(e);
	}, VA({a5, a9, a12}), cont));
	}

	Operation FILE_poly_10::term_add_3_4(Prolog *m)
	{
	// term_add([term(A,B)|C],[term(D,E)|F],[term(A,B)|G]):-A<D,!,term_add(C,[term(D,E)|F],G)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15, *a16;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_add([term(A,B)|C],[term(D,E)|F],[term(A,B)|G]):-['$get_level'(H),'$less_than'(A,D),'$cut'(H),term_add(C,[term(D,E)|F],G)]
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
		a4 = a4->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a4->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
		if (a2->isCons())
		{
			std::vector<Term*> argz = VA({a2->car(), a2->cdr()});
			a8 = argz[0];
			a9 = argz[1];
		}
		else if (a2->isVar())
		{
			a8 = V(m);
			a9 = V(m);
			 a2->bind(CONS(a8, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = a8->dref();
			a10 = V(m);
			a11 = V(m);
			if (!a8->unify(C(FUNCTOR_term_2, {a10, a11}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a12 = argz[0];
			a13 = argz[1];
		}
		else if (a3->isVar())
		{
			a12 = V(m);
			a13 = V(m);
			 a3->bind(CONS(a12, a13), m->trail);
		}
		else
		{
			return m->fail();
		}
		a12 = a12->dref();
			if (!a12->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a14 = V(m);
		//START inline expansion of $get_level(a(14))
		if (!a14->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $less_than(a(6),a(10))
		if (Arithmetic::evaluate(a6)->arithCompareTo(Arithmetic::evaluate(a10)) >= 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(14))
		a14 = a14->dref();
				  m->cut(a14->intValue());
		//END inline expansion
	// put_str_args([a(10),a(11)],y(1)),put_str(@('FUNCTOR_term_2'),y(1),a(15))
		a15 = S(FUNCTOR_term_2, {a10, a11});
		 ;
		a16 = CONS(a15, a9);
		m->AREGS[0] = a5;
		m->AREGS[1] = a16;
		m->AREGS[2] = a13;
		m->cont = cont;
		return term_add_3_top(m);
	}

	Operation FILE_poly_10::term_add_3_5(Prolog *m)
	{
	// term_add(A,[term(B,C)|D],[term(B,C)|E]):-term_add(A,D,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_add(A,[term(B,C)|D],[term(B,C)|E]):-[term_add(A,D,E)]
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
		a4 = a4->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a4->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a8 = argz[0];
			a9 = argz[1];
		}
		else if (a3->isVar())
		{
			a8 = V(m);
			a9 = V(m);
			 a3->bind(CONS(a8, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = a8->dref();
			if (!a8->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		m->AREGS[0] = a1;
		m->AREGS[1] = a5;
		m->AREGS[2] = a9;
		m->cont = cont;
		return term_add_3_top(m);
	}

	Operation FILE_poly_10::PRED_add_to_order_zero_term_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::add_to_order_zero_term_3_var, FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_2, FILE_poly_10::add_to_order_zero_term_3_var);
	}

	Operation FILE_poly_10::add_to_order_zero_term_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::add_to_order_zero_term_3_var_1);
		return add_to_order_zero_term_3_1(m);
	}

	Operation FILE_poly_10::add_to_order_zero_term_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return add_to_order_zero_term_3_2(m);
	}

	Operation FILE_poly_10::add_to_order_zero_term_3_1(Prolog *m)
	{
	// add_to_order_zero_term([term(0,A)|B],C,[term(0,D)|B]):-!,poly_add(A,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// add_to_order_zero_term([term(0,A)|B],C,[term(0,D)|B]):-['$neck_cut',poly_add(A,C,D)]
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
		a4 = a4->dref();
			a6 = V(m);
			if (!a4->unify(C(FUNCTOR_term_2, int_0, a6), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a7 = argz[0];
			if (!a5->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a7, a5), m->trail);
		}
		else
		{
			return m->fail();
		}
		a7 = a7->dref();
			a8 = V(m);
			if (!a7->unify(C(FUNCTOR_term_2, int_0, a8), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_poly_add_3_static_exec(e);
		}, VA({a6, a2, a8}), cont);
	}

	Operation FILE_poly_10::add_to_order_zero_term_3_2(Prolog *m)
	{
	// add_to_order_zero_term(A,B,[term(0,B)|A]):-true
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// add_to_order_zero_term(A,B,[term(0,B)|A]):-[]
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a4 = argz[0];
			if (!a1->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		}
		else if (a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(a4, a1), m->trail);
		}
		else
		{
			return m->fail();
		}
		a4 = a4->dref();
			if (!a4->unify(C(FUNCTOR_term_2, int_0, a2), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

SymbolTerm *const FILE_poly_10::FUNCTOR_$003E$003E_2 = F(">>",2);
SymbolTerm *const FILE_poly_10::FUNCTOR_$003C$003C_2 = F("<<",2);
SymbolTerm *const FILE_poly_10::FUNCTOR_$002D_2 = F("-",2);

	Operation FILE_poly_10::PRED_poly_exp_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return poly_exp_3_top(m);
	}

	Operation FILE_poly_10::poly_exp_3_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_poly_10::poly_exp_3_var, FILE_poly_10::poly_exp_3_var, FILE_poly_10::poly_exp_3_flo, FILE_poly_10::poly_exp_3_flo, FILE_poly_10::poly_exp_3_flo, FILE_poly_10::poly_exp_3_flo);
	}

	Operation FILE_poly_10::poly_exp_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::poly_exp_3_var_1);
		return poly_exp_3_1(m);
	}

	Operation FILE_poly_10::poly_exp_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_exp_3_var_2);
		return poly_exp_3_2(m);
	}

	Operation FILE_poly_10::poly_exp_3_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return poly_exp_3_3(m);
	}

	Operation FILE_poly_10::poly_exp_3_flo(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::poly_exp_3_flo_1);
		return poly_exp_3_2(m);
	}

	Operation FILE_poly_10::poly_exp_3_flo_1(Prolog *m)
	{
		m->trust(nullptr);
		return poly_exp_3_3(m);
	}

	Operation FILE_poly_10::poly_exp_3_1(Prolog *m)
	{
	// poly_exp(0,A,1):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_exp(0,A,1):-['$neck_cut']
		if (!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_1->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_poly_10::poly_exp_3_2(Prolog *m)
	{
	// poly_exp(A,B,C):-D is A>>1,A is D<<1,!,poly_exp(D,B,E),poly_mul(E,E,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_exp(A,B,C):-['$get_level'(D),E is A>>1,A is E<<1,'$cut'(D),poly_exp(E,B,F),poly_mul(F,F,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if (!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$003E$003E_2'),y(1),a(6))
		a6 = S(FUNCTOR_$003E$003E_2, {a1, int_1});
		 ;
		//START inline expansion of a(5)is a(6)
		if (!a5->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
	// put_str_args([a(5),@(int_1)],y(2)),put_str(@('FUNCTOR_$003C$003C_2'),y(2),a(7))
		a7 = S(FUNCTOR_$003C$003C_2, {a5, int_1});
		 ;
		//START inline expansion of a(1)is a(7)
		if (!a1->unify(Arithmetic::evaluate(a7), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		a8 = V(m);
		p1 = Op([&] (e)
		{
		PRED_poly_mul_3_static_exec(e);
		}, VA({a8, a8, a3}), cont);
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a8;
		m->cont = p1;
		return poly_exp_3_top(m);
	}

	Operation FILE_poly_10::poly_exp_3_3(Prolog *m)
	{
	// poly_exp(A,B,C):-D is A-1,poly_exp(D,B,E),poly_mul(B,E,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_exp(A,B,C):-[D is A-1,poly_exp(D,B,E),poly_mul(B,E,C)]
		a4 = V(m);
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		//START inline expansion of a(4)is a(5)
		if (!a4->unify(Arithmetic::evaluate(a5), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a6 = V(m);
		p1 = Op([&] (e)
		{
		PRED_poly_mul_3_static_exec(e);
		}, VA({a2, a6, a3}), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = p1;
		return poly_exp_3_top(m);
	}

SymbolTerm *const FILE_poly_10::FUNCTOR_$002A_2 = F("*",2);

	Operation FILE_poly_10::PRED_poly_mul_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::poly_mul_3_var, FILE_poly_10::poly_mul_3_int, FILE_poly_10::poly_mul_3_int, FILE_poly_10::poly_mul_3_int, FILE_poly_10::poly_mul_3_var, FILE_poly_10::poly_mul_3_int);
	}

	Operation FILE_poly_10::poly_mul_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::poly_mul_3_var_1);
		return poly_mul_3_1(m);
	}

	Operation FILE_poly_10::poly_mul_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_mul_3_var_2);
		return poly_mul_3_2(m);
	}

	Operation FILE_poly_10::poly_mul_3_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_mul_3_var_3);
		return poly_mul_3_3(m);
	}

	Operation FILE_poly_10::poly_mul_3_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::poly_mul_3_var_4);
		return poly_mul_3_4(m);
	}

	Operation FILE_poly_10::poly_mul_3_var_4(Prolog *m)
	{
		m->trust(nullptr);
		return poly_mul_3_5(m);
	}

	Operation FILE_poly_10::poly_mul_3_int(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::poly_mul_3_int_1);
		return poly_mul_3_3(m);
	}

	Operation FILE_poly_10::poly_mul_3_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return poly_mul_3_5(m);
	}

	Operation FILE_poly_10::poly_mul_3_1(Prolog *m)
	{
	// poly_mul(poly(A,B),poly(A,C),poly(A,D)):-!,term_mul(B,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_mul(poly(A,B),poly(A,C),poly(A,D)):-['$neck_cut',term_mul(B,C,D)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			if (!a2->unify(C(FUNCTOR_poly_2, {a4, a6}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a7}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_term_mul_3_static_exec(e);
		}, VA({a5, a6, a7}), cont);
	}

	Operation FILE_poly_10::poly_mul_3_2(Prolog *m)
	{
	// poly_mul(poly(A,B),poly(C,D),poly(A,E)):-A less_than C,!,mul_through(B,poly(C,D),E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_mul(poly(A,B),poly(C,D),poly(A,E)):-['$get_level'(F),A less_than C,'$cut'(F),mul_through(B,poly(C,D),E)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a2->unify(C(FUNCTOR_poly_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a8 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a8}), m->trail))
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
	// put_str_args([a(6),a(7)],y(1)),put_str(@('FUNCTOR_poly_2'),y(1),a(10))
		a10 = S(FUNCTOR_poly_2, {a6, a7});
		 ;
		return Op([&] (e)
		{
		PRED_less_than_2_static_exec(e);
		}, VA({a4, a6}), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a9}), Op([&] (e)
	{
		PRED_mul_through_3_static_exec(e);
	}, VA({a5, a10, a8}), cont)));
	}

	Operation FILE_poly_10::poly_mul_3_3(Prolog *m)
	{
	// poly_mul(A,poly(B,C),poly(B,D)):-!,mul_through(C,A,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_mul(A,poly(B,C),poly(B,D)):-['$neck_cut',mul_through(C,A,D)]
		a2 = a2->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a2->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a6}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_mul_through_3_static_exec(e);
		}, VA({a5, a1, a6}), cont);
	}

	Operation FILE_poly_10::poly_mul_3_4(Prolog *m)
	{
	// poly_mul(poly(A,B),C,poly(A,D)):-!,mul_through(B,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_mul(poly(A,B),C,poly(A,D)):-['$neck_cut',mul_through(B,C,D)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_poly_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			if (!a3->unify(C(FUNCTOR_poly_2, {a4, a6}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		PRED_mul_through_3_static_exec(e);
		}, VA({a5, a2, a6}), cont);
	}

	Operation FILE_poly_10::poly_mul_3_5(Prolog *m)
	{
	// poly_mul(A,B,C):-C is A*B
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// poly_mul(A,B,C):-[C is A*B]
	// put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002A_2, {a1, a2});
		 ;
		//START inline expansion of a(3)is a(4)
		if (!a3->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_poly_10::PRED_term_mul_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::term_mul_3_var, FILE_poly_10::term_mul_3_2, FILE_poly_10::term_mul_3_2, FILE_poly_10::term_mul_3_con, FILE_poly_10::term_mul_3_2, FILE_poly_10::term_mul_3_lis);
	}

	Operation FILE_poly_10::term_mul_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_mul_3_var_1);
		return term_mul_3_1(m);
	}

	Operation FILE_poly_10::term_mul_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_poly_10::term_mul_3_var_2);
		return term_mul_3_2(m);
	}

	Operation FILE_poly_10::term_mul_3_var_2(Prolog *m)
	{
		m->trust(nullptr);
		return term_mul_3_3(m);
	}

	Operation FILE_poly_10::term_mul_3_con(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_mul_3_con_1);
		return term_mul_3_1(m);
	}

	Operation FILE_poly_10::term_mul_3_con_1(Prolog *m)
	{
		m->trust(nullptr);
		return term_mul_3_2(m);
	}

	Operation FILE_poly_10::term_mul_3_lis(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::term_mul_3_lis_1);
		return term_mul_3_2(m);
	}

	Operation FILE_poly_10::term_mul_3_lis_1(Prolog *m)
	{
		m->trust(nullptr);
		return term_mul_3_3(m);
	}

	Operation FILE_poly_10::term_mul_3_1(Prolog *m)
	{
	// term_mul([],A,[]):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_mul([],A,[]):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
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

	Operation FILE_poly_10::term_mul_3_2(Prolog *m)
	{
	// term_mul(A,[],[]):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_mul(A,[],[]):-['$neck_cut']
		if (!Prolog::Nil->unify(a2, m->trail))
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

	Operation FILE_poly_10::term_mul_3_3(Prolog *m)
	{
	// term_mul([A|B],C,D):-single_term_mul(C,A,E),term_mul(B,C,F),term_add(E,F,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// term_mul([A|B],C,D):-[single_term_mul(C,A,E),term_mul(B,C,F),term_add(E,F,D)]
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
		a6 = V(m);
		a7 = V(m);
		return Op([&] (e)
		{
		PRED_single_term_mul_3_static_exec(e);
		}, VA({a2, a4, a6}), Op([&] (e)
		{
		PRED_term_mul_3_static_exec(e);
	}, VA({a5, a2, a7}), Op([&] (e)
	{
		PRED_term_add_3_static_exec(e);
	}, VA({a6, a7, a3}), cont)));
	}

	Operation FILE_poly_10::PRED_single_term_mul_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::single_term_mul_3_var, Failure::fail_0, Failure::fail_0, FILE_poly_10::single_term_mul_3_1, Failure::fail_0, FILE_poly_10::single_term_mul_3_2);
	}

	Operation FILE_poly_10::single_term_mul_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::single_term_mul_3_var_1);
		return single_term_mul_3_1(m);
	}

	Operation FILE_poly_10::single_term_mul_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return single_term_mul_3_2(m);
	}

	Operation FILE_poly_10::single_term_mul_3_1(Prolog *m)
	{
	// single_term_mul([],A,[]):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// single_term_mul([],A,[]):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
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

	Operation FILE_poly_10::single_term_mul_3_2(Prolog *m)
	{
	// single_term_mul([term(A,B)|C],term(D,E),[term(F,G)|H]):-F is A+D,poly_mul(B,E,G),single_term_mul(C,term(D,E),H)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12, *a13, *a14, *a15;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// single_term_mul([term(A,B)|C],term(D,E),[term(F,G)|H]):-[F is A+D,poly_mul(B,E,G),single_term_mul(C,term(D,E),H)]
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
		a4 = a4->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a4->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a8 = V(m);
			a9 = V(m);
			if (!a2->unify(C(FUNCTOR_term_2, {a8, a9}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a10 = argz[0];
			a11 = argz[1];
		}
		else if (a3->isVar())
		{
			a10 = V(m);
			a11 = V(m);
			 a3->bind(CONS(a10, a11), m->trail);
		}
		else
		{
			return m->fail();
		}
		a10 = a10->dref();
			a12 = V(m);
			a13 = V(m);
			if (!a10->unify(C(FUNCTOR_term_2, {a12, a13}), m->trail))
			{
				return m->fail();
			}
	// put_str_args([a(6),a(8)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(14))
		a14 = S(FUNCTOR_$002B_2, {a6, a8});
		 ;
		//START inline expansion of a(12)is a(14)
		if (!a12->unify(Arithmetic::evaluate(a14), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
	// put_str_args([a(8),a(9)],y(2)),put_str(@('FUNCTOR_term_2'),y(2),a(15))
		a15 = S(FUNCTOR_term_2, {a8, a9});
		 ;
		return Op([&] (e)
		{
		PRED_poly_mul_3_static_exec(e);
		}, VA({a7, a9, a13}), Op([&] (e)
		{
		PRED_single_term_mul_3_static_exec(e);
	}, VA({a5, a15, a11}), cont));
	}

	Operation FILE_poly_10::PRED_mul_through_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_poly_10::mul_through_3_var, Failure::fail_0, Failure::fail_0, FILE_poly_10::mul_through_3_1, Failure::fail_0, FILE_poly_10::mul_through_3_2);
	}

	Operation FILE_poly_10::mul_through_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_poly_10::mul_through_3_var_1);
		return mul_through_3_1(m);
	}

	Operation FILE_poly_10::mul_through_3_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return mul_through_3_2(m);
	}

	Operation FILE_poly_10::mul_through_3_1(Prolog *m)
	{
	// mul_through([],A,[]):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// mul_through([],A,[]):-['$neck_cut']
		if (!Prolog::Nil->unify(a1, m->trail))
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

	Operation FILE_poly_10::mul_through_3_2(Prolog *m)
	{
	// mul_through([term(A,B)|C],D,[term(A,E)|F]):-poly_mul(B,D,E),mul_through(C,D,F)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// mul_through([term(A,B)|C],D,[term(A,E)|F]):-[poly_mul(B,D,E),mul_through(C,D,F)]
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
		a4 = a4->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a4->unify(C(FUNCTOR_term_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if (a3->isCons())
		{
			std::vector<Term*> argz = VA({a3->car(), a3->cdr()});
			a8 = argz[0];
			a9 = argz[1];
		}
		else if (a3->isVar())
		{
			a8 = V(m);
			a9 = V(m);
			 a3->bind(CONS(a8, a9), m->trail);
		}
		else
		{
			return m->fail();
		}
		a8 = a8->dref();
			a10 = V(m);
			if (!a8->unify(C(FUNCTOR_term_2, {a6, a10}), m->trail))
			{
				return m->fail();
			}
		return Op([&] (e)
		{
		PRED_poly_mul_3_static_exec(e);
		}, VA({a7, a2, a10}), Op([&] (e)
		{
		PRED_mul_through_3_static_exec(e);
	}, VA({a5, a2, a9}), cont));
	}

	FILE_poly_10::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_poly_10::StaticConstructor FILE_poly_10::staticConstructor;

	void FILE_poly_10::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_poly_10::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("poly_10",0,FILE_poly_10::PRED_poly_10_0_static_exec);
	   PredTable::registerBuiltin("test_poly",1,FILE_poly_10::PRED_test_poly_1_static_exec);
	   PredTable::registerBuiltin("less_than",2,FILE_poly_10::PRED_less_than_2_static_exec);
	   PredTable::registerBuiltin("poly_add",3,FILE_poly_10::PRED_poly_add_3_static_exec);
	   PredTable::registerBuiltin("term_add",3,FILE_poly_10::PRED_term_add_3_static_exec);
	   PredTable::registerBuiltin("add_to_order_zero_term",3,FILE_poly_10::PRED_add_to_order_zero_term_3_static_exec);
	   PredTable::registerBuiltin("poly_exp",3,FILE_poly_10::PRED_poly_exp_3_static_exec);
	   PredTable::registerBuiltin("poly_mul",3,FILE_poly_10::PRED_poly_mul_3_static_exec);
	   PredTable::registerBuiltin("term_mul",3,FILE_poly_10::PRED_term_mul_3_static_exec);
	   PredTable::registerBuiltin("single_term_mul",3,FILE_poly_10::PRED_single_term_mul_3_static_exec);
	   PredTable::registerBuiltin("mul_through",3,FILE_poly_10::PRED_mul_through_3_static_exec);
	}
}
