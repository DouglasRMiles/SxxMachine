using namespace std;

#include "FILE_query.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
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

	Operation FILE_query::PRED_top_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-query
		m->setB0();
	// top:-[query]
		return Op([&] (e)
		{
		PRED_query_0_static_exec(e);
		}, VA(), cont);
	}

	Operation FILE_query::PRED_query_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry0(nullptr, FILE_query::query_0_sub_1);
		return query_0_1(m);
	}

	Operation FILE_query::query_0_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return query_0_2(m);
	}

	Operation FILE_query::query_0_1(Prolog *m)
	{
	// query:-query(A),fail
		Operation p1;
		Operation cont;
		cont = m->cont;
	// query:-[query(A),fail]
		return Op([&] (e)
		{
		PRED_query_1_static_exec(e);
		}, VA({V(m)}), Failure::fail_0);
	}

	Operation FILE_query::query_0_2(Prolog *m)
	{
	// query:-true
		Operation cont;
		cont = m->cont;
	// query:-[]
		return cont;
	}

SymbolTerm *const FILE_query::FUNCTOR_$002A_2 = F("*",2);

	Operation FILE_query::PRED_query_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// query([A,B,C,D]):-density(A,B),density(C,D),B>D,E is 20*B,F is 21*D,E<F
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11, *a12;
		Operation p1, p2, p3, p4, p5;
		a1 = LARG[0];
	// query([A,B,C,D]):-[density(A,B),density(C,D),'$greater_than'(B,D),E is 20*B,F is 21*D,'$less_than'(E,F)]
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
		a9 = V(m);
	// put_str_args([@(int_20),a(4)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(10))
		a10 = S(FUNCTOR_$002A_2, int_20, a4);
		 ;
		a11 = V(m);
	// put_str_args([@(int_21),a(8)],y(2)),put_str(@('FUNCTOR_$002A_2'),y(2),a(12))
		a12 = S(FUNCTOR_$002A_2, int_21, a8);
		 ;
		return Op([&] (e)
		{
		PRED_density_2_static_exec(e);
		}, VA({a2, a4}), Op([&] (e)
		{
		PRED_density_2_static_exec(e);
	}, VA({a6, a8}), Op([&] (e)
	{
		FILE_builtins::PRED_$greater_than_2_static_exec(e);
	}, VA({a4, a8}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a9, a10}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a11, a12}), Op([&] (e)
	{
		FILE_builtins::PRED_$less_than_2_static_exec(e);
	}, VA({a9, a11}), cont))))));
	}

SymbolTerm *const FILE_query::FUNCTOR_$002F$002F_2 = F("//",2);
IntegerTerm *const FILE_query::int_100 = optional<int>(100);

	Operation FILE_query::PRED_density_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// density(A,B):-pop(A,C),area(A,D),B is C*100//D
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2;
		a1 = LARG[0];
		a2 = LARG[1];
	// density(A,B):-[pop(A,C),area(A,D),B is C*100//D]
		a3 = V(m);
		a4 = V(m);
	// put_str_args([a(3),@(int_100)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002A_2, {a3, int_100});
		 ;
	// put_str_args([a(5),a(4)],y(2)),put_str(@('FUNCTOR_$002F$002F_2'),y(2),a(6))
		a6 = S(FUNCTOR_$002F$002F_2, {a5, a4});
		 ;
		return Op([&] (e)
		{
		PRED_pop_2_static_exec(e);
		}, VA({a1, a3}), Op([&] (e)
		{
		PRED_area_2_static_exec(e);
	}, VA({a1, a4}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a2, a6}), cont)));
	}

SymbolTerm *const FILE_query::ATOM_china = SYM("china");
IntegerTerm *const FILE_query::int_8250 = optional<int>(8250);
SymbolTerm *const FILE_query::ATOM_india = SYM("india");
IntegerTerm *const FILE_query::int_5863 = optional<int>(5863);
SymbolTerm *const FILE_query::ATOM_ussr = SYM("ussr");
IntegerTerm *const FILE_query::int_2521 = optional<int>(2521);
SymbolTerm *const FILE_query::ATOM_usa = SYM("usa");
IntegerTerm *const FILE_query::int_2119 = optional<int>(2119);
SymbolTerm *const FILE_query::ATOM_indonesia = SYM("indonesia");
IntegerTerm *const FILE_query::int_1276 = optional<int>(1276);
SymbolTerm *const FILE_query::ATOM_japan = SYM("japan");
IntegerTerm *const FILE_query::int_1097 = optional<int>(1097);
SymbolTerm *const FILE_query::ATOM_brazil = SYM("brazil");
IntegerTerm *const FILE_query::int_1042 = optional<int>(1042);
SymbolTerm *const FILE_query::ATOM_bangladesh = SYM("bangladesh");
IntegerTerm *const FILE_query::int_750 = optional<int>(750);
SymbolTerm *const FILE_query::ATOM_pakistan = SYM("pakistan");
IntegerTerm *const FILE_query::int_682 = optional<int>(682);
SymbolTerm *const FILE_query::ATOM_w_germany = SYM("w_germany");
IntegerTerm *const FILE_query::int_620 = optional<int>(620);
SymbolTerm *const FILE_query::ATOM_nigeria = SYM("nigeria");
IntegerTerm *const FILE_query::int_613 = optional<int>(613);
SymbolTerm *const FILE_query::ATOM_mexico = SYM("mexico");
IntegerTerm *const FILE_query::int_581 = optional<int>(581);
SymbolTerm *const FILE_query::ATOM_uk = SYM("uk");
IntegerTerm *const FILE_query::int_559 = optional<int>(559);
SymbolTerm *const FILE_query::ATOM_italy = SYM("italy");
IntegerTerm *const FILE_query::int_554 = optional<int>(554);
SymbolTerm *const FILE_query::ATOM_france = SYM("france");
IntegerTerm *const FILE_query::int_525 = optional<int>(525);
SymbolTerm *const FILE_query::ATOM_philippines = SYM("philippines");
IntegerTerm *const FILE_query::int_415 = optional<int>(415);
SymbolTerm *const FILE_query::ATOM_thailand = SYM("thailand");
IntegerTerm *const FILE_query::int_410 = optional<int>(410);
SymbolTerm *const FILE_query::ATOM_turkey = SYM("turkey");
IntegerTerm *const FILE_query::int_383 = optional<int>(383);
SymbolTerm *const FILE_query::ATOM_egypt = SYM("egypt");
IntegerTerm *const FILE_query::int_364 = optional<int>(364);
SymbolTerm *const FILE_query::ATOM_spain = SYM("spain");
IntegerTerm *const FILE_query::int_352 = optional<int>(352);
SymbolTerm *const FILE_query::ATOM_poland = SYM("poland");
IntegerTerm *const FILE_query::int_337 = optional<int>(337);
SymbolTerm *const FILE_query::ATOM_s_korea = SYM("s_korea");
IntegerTerm *const FILE_query::int_335 = optional<int>(335);
SymbolTerm *const FILE_query::ATOM_iran = SYM("iran");
IntegerTerm *const FILE_query::int_320 = optional<int>(320);
SymbolTerm *const FILE_query::ATOM_ethiopia = SYM("ethiopia");
IntegerTerm *const FILE_query::int_272 = optional<int>(272);
SymbolTerm *const FILE_query::ATOM_argentina = SYM("argentina");
IntegerTerm *const FILE_query::int_251 = optional<int>(251);

	Operation FILE_query::PRED_pop_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_query::pop_2_var, Failure::fail_0, Failure::fail_0, FILE_query::pop_2_var, Failure::fail_0, Failure::fail_0);
	}

	Operation FILE_query::pop_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_query::pop_2_var_1);
		return pop_2_1(m);
	}

	Operation FILE_query::pop_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_2);
		return pop_2_2(m);
	}

	Operation FILE_query::pop_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_3);
		return pop_2_3(m);
	}

	Operation FILE_query::pop_2_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_4);
		return pop_2_4(m);
	}

	Operation FILE_query::pop_2_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_5);
		return pop_2_5(m);
	}

	Operation FILE_query::pop_2_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_6);
		return pop_2_6(m);
	}

	Operation FILE_query::pop_2_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_7);
		return pop_2_7(m);
	}

	Operation FILE_query::pop_2_var_7(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_8);
		return pop_2_8(m);
	}

	Operation FILE_query::pop_2_var_8(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_9);
		return pop_2_9(m);
	}

	Operation FILE_query::pop_2_var_9(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_10);
		return pop_2_10(m);
	}

	Operation FILE_query::pop_2_var_10(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_11);
		return pop_2_11(m);
	}

	Operation FILE_query::pop_2_var_11(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_12);
		return pop_2_12(m);
	}

	Operation FILE_query::pop_2_var_12(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_13);
		return pop_2_13(m);
	}

	Operation FILE_query::pop_2_var_13(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_14);
		return pop_2_14(m);
	}

	Operation FILE_query::pop_2_var_14(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_15);
		return pop_2_15(m);
	}

	Operation FILE_query::pop_2_var_15(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_16);
		return pop_2_16(m);
	}

	Operation FILE_query::pop_2_var_16(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_17);
		return pop_2_17(m);
	}

	Operation FILE_query::pop_2_var_17(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_18);
		return pop_2_18(m);
	}

	Operation FILE_query::pop_2_var_18(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_19);
		return pop_2_19(m);
	}

	Operation FILE_query::pop_2_var_19(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_20);
		return pop_2_20(m);
	}

	Operation FILE_query::pop_2_var_20(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_21);
		return pop_2_21(m);
	}

	Operation FILE_query::pop_2_var_21(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_22);
		return pop_2_22(m);
	}

	Operation FILE_query::pop_2_var_22(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_23);
		return pop_2_23(m);
	}

	Operation FILE_query::pop_2_var_23(Prolog *m)
	{
		m->retry(nullptr, FILE_query::pop_2_var_24);
		return pop_2_24(m);
	}

	Operation FILE_query::pop_2_var_24(Prolog *m)
	{
		m->trust(nullptr);
		return pop_2_25(m);
	}

	Operation FILE_query::pop_2_1(Prolog *m)
	{
	// pop(china,8250):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(china,8250):-[]
		if (!ATOM_china->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_8250->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_2(Prolog *m)
	{
	// pop(india,5863):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(india,5863):-[]
		if (!ATOM_india->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_5863->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_3(Prolog *m)
	{
	// pop(ussr,2521):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(ussr,2521):-[]
		if (!ATOM_ussr->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_2521->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_4(Prolog *m)
	{
	// pop(usa,2119):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(usa,2119):-[]
		if (!ATOM_usa->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_2119->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_5(Prolog *m)
	{
	// pop(indonesia,1276):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(indonesia,1276):-[]
		if (!ATOM_indonesia->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_1276->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_6(Prolog *m)
	{
	// pop(japan,1097):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(japan,1097):-[]
		if (!ATOM_japan->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_1097->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_7(Prolog *m)
	{
	// pop(brazil,1042):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(brazil,1042):-[]
		if (!ATOM_brazil->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_1042->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_8(Prolog *m)
	{
	// pop(bangladesh,750):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(bangladesh,750):-[]
		if (!ATOM_bangladesh->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_750->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_9(Prolog *m)
	{
	// pop(pakistan,682):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(pakistan,682):-[]
		if (!ATOM_pakistan->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_682->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_10(Prolog *m)
	{
	// pop(w_germany,620):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(w_germany,620):-[]
		if (!ATOM_w_germany->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_620->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_11(Prolog *m)
	{
	// pop(nigeria,613):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(nigeria,613):-[]
		if (!ATOM_nigeria->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_613->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_12(Prolog *m)
	{
	// pop(mexico,581):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(mexico,581):-[]
		if (!ATOM_mexico->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_581->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_13(Prolog *m)
	{
	// pop(uk,559):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(uk,559):-[]
		if (!ATOM_uk->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_559->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_14(Prolog *m)
	{
	// pop(italy,554):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(italy,554):-[]
		if (!ATOM_italy->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_554->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_15(Prolog *m)
	{
	// pop(france,525):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(france,525):-[]
		if (!ATOM_france->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_525->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_16(Prolog *m)
	{
	// pop(philippines,415):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(philippines,415):-[]
		if (!ATOM_philippines->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_415->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_17(Prolog *m)
	{
	// pop(thailand,410):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(thailand,410):-[]
		if (!ATOM_thailand->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_410->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_18(Prolog *m)
	{
	// pop(turkey,383):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(turkey,383):-[]
		if (!ATOM_turkey->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_383->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_19(Prolog *m)
	{
	// pop(egypt,364):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(egypt,364):-[]
		if (!ATOM_egypt->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_364->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_20(Prolog *m)
	{
	// pop(spain,352):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(spain,352):-[]
		if (!ATOM_spain->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_352->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_21(Prolog *m)
	{
	// pop(poland,337):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(poland,337):-[]
		if (!ATOM_poland->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_337->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_22(Prolog *m)
	{
	// pop(s_korea,335):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(s_korea,335):-[]
		if (!ATOM_s_korea->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_335->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_23(Prolog *m)
	{
	// pop(iran,320):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(iran,320):-[]
		if (!ATOM_iran->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_320->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_24(Prolog *m)
	{
	// pop(ethiopia,272):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(ethiopia,272):-[]
		if (!ATOM_ethiopia->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_272->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::pop_2_25(Prolog *m)
	{
	// pop(argentina,251):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// pop(argentina,251):-[]
		if (!ATOM_argentina->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_251->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

IntegerTerm *const FILE_query::int_3380 = optional<int>(3380);
IntegerTerm *const FILE_query::int_1139 = optional<int>(1139);
IntegerTerm *const FILE_query::int_8708 = optional<int>(8708);
IntegerTerm *const FILE_query::int_3609 = optional<int>(3609);
IntegerTerm *const FILE_query::int_570 = optional<int>(570);
IntegerTerm *const FILE_query::int_148 = optional<int>(148);
IntegerTerm *const FILE_query::int_3288 = optional<int>(3288);
IntegerTerm *const FILE_query::int_55 = optional<int>(55);
IntegerTerm *const FILE_query::int_311 = optional<int>(311);
IntegerTerm *const FILE_query::int_96 = optional<int>(96);
IntegerTerm *const FILE_query::int_373 = optional<int>(373);
IntegerTerm *const FILE_query::int_764 = optional<int>(764);
IntegerTerm *const FILE_query::int_86 = optional<int>(86);
IntegerTerm *const FILE_query::int_116 = optional<int>(116);
IntegerTerm *const FILE_query::int_213 = optional<int>(213);
IntegerTerm *const FILE_query::int_90 = optional<int>(90);
IntegerTerm *const FILE_query::int_200 = optional<int>(200);
IntegerTerm *const FILE_query::int_296 = optional<int>(296);
IntegerTerm *const FILE_query::int_386 = optional<int>(386);
IntegerTerm *const FILE_query::int_190 = optional<int>(190);
IntegerTerm *const FILE_query::int_121 = optional<int>(121);
IntegerTerm *const FILE_query::int_37 = optional<int>(37);
IntegerTerm *const FILE_query::int_628 = optional<int>(628);
IntegerTerm *const FILE_query::int_350 = optional<int>(350);
IntegerTerm *const FILE_query::int_1080 = optional<int>(1080);

	Operation FILE_query::PRED_area_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_query::area_2_var, Failure::fail_0, Failure::fail_0, FILE_query::area_2_var, Failure::fail_0, Failure::fail_0);
	}

	Operation FILE_query::area_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_query::area_2_var_1);
		return area_2_1(m);
	}

	Operation FILE_query::area_2_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_2);
		return area_2_2(m);
	}

	Operation FILE_query::area_2_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_3);
		return area_2_3(m);
	}

	Operation FILE_query::area_2_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_4);
		return area_2_4(m);
	}

	Operation FILE_query::area_2_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_5);
		return area_2_5(m);
	}

	Operation FILE_query::area_2_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_6);
		return area_2_6(m);
	}

	Operation FILE_query::area_2_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_7);
		return area_2_7(m);
	}

	Operation FILE_query::area_2_var_7(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_8);
		return area_2_8(m);
	}

	Operation FILE_query::area_2_var_8(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_9);
		return area_2_9(m);
	}

	Operation FILE_query::area_2_var_9(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_10);
		return area_2_10(m);
	}

	Operation FILE_query::area_2_var_10(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_11);
		return area_2_11(m);
	}

	Operation FILE_query::area_2_var_11(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_12);
		return area_2_12(m);
	}

	Operation FILE_query::area_2_var_12(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_13);
		return area_2_13(m);
	}

	Operation FILE_query::area_2_var_13(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_14);
		return area_2_14(m);
	}

	Operation FILE_query::area_2_var_14(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_15);
		return area_2_15(m);
	}

	Operation FILE_query::area_2_var_15(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_16);
		return area_2_16(m);
	}

	Operation FILE_query::area_2_var_16(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_17);
		return area_2_17(m);
	}

	Operation FILE_query::area_2_var_17(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_18);
		return area_2_18(m);
	}

	Operation FILE_query::area_2_var_18(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_19);
		return area_2_19(m);
	}

	Operation FILE_query::area_2_var_19(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_20);
		return area_2_20(m);
	}

	Operation FILE_query::area_2_var_20(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_21);
		return area_2_21(m);
	}

	Operation FILE_query::area_2_var_21(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_22);
		return area_2_22(m);
	}

	Operation FILE_query::area_2_var_22(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_23);
		return area_2_23(m);
	}

	Operation FILE_query::area_2_var_23(Prolog *m)
	{
		m->retry(nullptr, FILE_query::area_2_var_24);
		return area_2_24(m);
	}

	Operation FILE_query::area_2_var_24(Prolog *m)
	{
		m->trust(nullptr);
		return area_2_25(m);
	}

	Operation FILE_query::area_2_1(Prolog *m)
	{
	// area(china,3380):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(china,3380):-[]
		if (!ATOM_china->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_3380->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_2(Prolog *m)
	{
	// area(india,1139):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(india,1139):-[]
		if (!ATOM_india->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_1139->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_3(Prolog *m)
	{
	// area(ussr,8708):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(ussr,8708):-[]
		if (!ATOM_ussr->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_8708->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_4(Prolog *m)
	{
	// area(usa,3609):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(usa,3609):-[]
		if (!ATOM_usa->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_3609->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_5(Prolog *m)
	{
	// area(indonesia,570):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(indonesia,570):-[]
		if (!ATOM_indonesia->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_570->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_6(Prolog *m)
	{
	// area(japan,148):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(japan,148):-[]
		if (!ATOM_japan->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_148->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_7(Prolog *m)
	{
	// area(brazil,3288):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(brazil,3288):-[]
		if (!ATOM_brazil->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_3288->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_8(Prolog *m)
	{
	// area(bangladesh,55):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(bangladesh,55):-[]
		if (!ATOM_bangladesh->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_55->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_9(Prolog *m)
	{
	// area(pakistan,311):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(pakistan,311):-[]
		if (!ATOM_pakistan->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_311->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_10(Prolog *m)
	{
	// area(w_germany,96):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(w_germany,96):-[]
		if (!ATOM_w_germany->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_96->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_11(Prolog *m)
	{
	// area(nigeria,373):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(nigeria,373):-[]
		if (!ATOM_nigeria->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_373->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_12(Prolog *m)
	{
	// area(mexico,764):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(mexico,764):-[]
		if (!ATOM_mexico->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_764->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_13(Prolog *m)
	{
	// area(uk,86):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(uk,86):-[]
		if (!ATOM_uk->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_86->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_14(Prolog *m)
	{
	// area(italy,116):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(italy,116):-[]
		if (!ATOM_italy->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_116->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_15(Prolog *m)
	{
	// area(france,213):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(france,213):-[]
		if (!ATOM_france->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_213->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_16(Prolog *m)
	{
	// area(philippines,90):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(philippines,90):-[]
		if (!ATOM_philippines->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_90->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_17(Prolog *m)
	{
	// area(thailand,200):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(thailand,200):-[]
		if (!ATOM_thailand->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_200->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_18(Prolog *m)
	{
	// area(turkey,296):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(turkey,296):-[]
		if (!ATOM_turkey->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_296->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_19(Prolog *m)
	{
	// area(egypt,386):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(egypt,386):-[]
		if (!ATOM_egypt->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_386->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_20(Prolog *m)
	{
	// area(spain,190):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(spain,190):-[]
		if (!ATOM_spain->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_190->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_21(Prolog *m)
	{
	// area(poland,121):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(poland,121):-[]
		if (!ATOM_poland->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_121->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_22(Prolog *m)
	{
	// area(s_korea,37):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(s_korea,37):-[]
		if (!ATOM_s_korea->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_37->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_23(Prolog *m)
	{
	// area(iran,628):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(iran,628):-[]
		if (!ATOM_iran->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_628->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_24(Prolog *m)
	{
	// area(ethiopia,350):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(ethiopia,350):-[]
		if (!ATOM_ethiopia->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_350->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_query::area_2_25(Prolog *m)
	{
	// area(argentina,1080):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// area(argentina,1080):-[]
		if (!ATOM_argentina->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!int_1080->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	FILE_query::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_query::StaticConstructor FILE_query::staticConstructor;

	void FILE_query::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_query::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("query",0,FILE_query::PRED_query_0_static_exec);
	   PredTable::registerBuiltin("query",1,FILE_query::PRED_query_1_static_exec);
	   PredTable::registerBuiltin("density",2,FILE_query::PRED_density_2_static_exec);
	   PredTable::registerBuiltin("pop",2,FILE_query::PRED_pop_2_static_exec);
	   PredTable::registerBuiltin("area",2,FILE_query::PRED_area_2_static_exec);
	}
}
