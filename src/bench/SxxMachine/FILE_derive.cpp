using namespace std;

#include "FILE_derive.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/StructureTerm.h"
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

	Operation FILE_derive::PRED_top_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-ops8,log10,divide10
		m->setB0();
		Operation p1, p2;
	// top:-[ops8,log10,divide10]
		return Op([&] (e)
		{
		PRED_ops8_0_static_exec(e);
		}, VA(), Op([&] (e)
		{
		PRED_log10_0_static_exec(e);
	}, VA(), Op([&] (e)
	{
		PRED_divide10_0_static_exec(e);
	}, VA(), cont)));
	}

SymbolTerm *const FILE_derive::FUNCTOR_$002A_2 = F("*",2);
SymbolTerm *const FILE_derive::FUNCTOR_$002B_2 = F("+",2);
SymbolTerm *const FILE_derive::ATOM_x = SYM("x");
StructureTerm *const FILE_derive::L_ops8_0_s6 = S(FUNCTOR_$002B_2, ATOM_x, int_1);
SymbolTerm *const FILE_derive::FUNCTOR_$005E_2 = F("^",2);
StructureTerm *const FILE_derive::L_ops8_0_s10 = S(FUNCTOR_$005E_2, ATOM_x, int_2);
StructureTerm *const FILE_derive::L_ops8_0_s12 = S(FUNCTOR_$002B_2, L_ops8_0_s10, int_2);
StructureTerm *const FILE_derive::L_ops8_0_s15 = S(FUNCTOR_$005E_2, ATOM_x, int_3);
StructureTerm *const FILE_derive::L_ops8_0_s17 = S(FUNCTOR_$002B_2, L_ops8_0_s15, int_3);
StructureTerm *const FILE_derive::L_ops8_0_s19 = S(FUNCTOR_$002A_2, L_ops8_0_s12, L_ops8_0_s17);
StructureTerm *const FILE_derive::L_ops8_0_s21 = S(FUNCTOR_$002A_2, L_ops8_0_s6, L_ops8_0_s19);

	Operation FILE_derive::PRED_ops8_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// ops8:-d((x+1)*((x^2+2)*(x^3+3)),x,A)
		m->setB0();
	// ops8:-[d((x+1)*((x^2+2)*(x^3+3)),x,A)]
		return Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({L_ops8_0_s21, ATOM_x, V(m)}), cont);
	}

SymbolTerm *const FILE_derive::FUNCTOR_log_1 = F("log",1);
StructureTerm *const FILE_derive::L_log10_0_s4 = S(FUNCTOR_log_1, ATOM_x);
StructureTerm *const FILE_derive::L_log10_0_s6 = S(FUNCTOR_log_1, L_log10_0_s4);
StructureTerm *const FILE_derive::L_log10_0_s8 = S(FUNCTOR_log_1, L_log10_0_s6);
StructureTerm *const FILE_derive::L_log10_0_s10 = S(FUNCTOR_log_1, L_log10_0_s8);
StructureTerm *const FILE_derive::L_log10_0_s12 = S(FUNCTOR_log_1, L_log10_0_s10);
StructureTerm *const FILE_derive::L_log10_0_s14 = S(FUNCTOR_log_1, L_log10_0_s12);
StructureTerm *const FILE_derive::L_log10_0_s16 = S(FUNCTOR_log_1, L_log10_0_s14);
StructureTerm *const FILE_derive::L_log10_0_s18 = S(FUNCTOR_log_1, L_log10_0_s16);
StructureTerm *const FILE_derive::L_log10_0_s20 = S(FUNCTOR_log_1, L_log10_0_s18);
StructureTerm *const FILE_derive::L_log10_0_s22 = S(FUNCTOR_log_1, L_log10_0_s20);

	Operation FILE_derive::PRED_log10_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// log10:-d(log(log(log(log(log(log(log(log(log(log(x)))))))))),x,A)
		m->setB0();
	// log10:-[d(log(log(log(log(log(log(log(log(log(log(x)))))))))),x,A)]
		return Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({L_log10_0_s22, ATOM_x, V(m)}), cont);
	}

SymbolTerm *const FILE_derive::FUNCTOR_$002F_2 = F("/",2);
StructureTerm *const FILE_derive::L_divide10_0_s4 = S(FUNCTOR_$002F_2, ATOM_x, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s6 = S(FUNCTOR_$002F_2, L_divide10_0_s4, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s8 = S(FUNCTOR_$002F_2, L_divide10_0_s6, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s10 = S(FUNCTOR_$002F_2, L_divide10_0_s8, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s12 = S(FUNCTOR_$002F_2, L_divide10_0_s10, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s14 = S(FUNCTOR_$002F_2, L_divide10_0_s12, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s16 = S(FUNCTOR_$002F_2, L_divide10_0_s14, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s18 = S(FUNCTOR_$002F_2, L_divide10_0_s16, ATOM_x);
StructureTerm *const FILE_derive::L_divide10_0_s20 = S(FUNCTOR_$002F_2, L_divide10_0_s18, ATOM_x);

	Operation FILE_derive::PRED_divide10_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// divide10:-d(x/x/x/x/x/x/x/x/x/x,x,A)
		m->setB0();
	// divide10:-[d(x/x/x/x/x/x/x/x/x/x,x,A)]
		return Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({L_divide10_0_s20, ATOM_x, V(m)}), cont);
	}

SymbolTerm *const FILE_derive::FUNCTOR_$002D_2 = F("-",2);
SymbolTerm *const FILE_derive::FUNCTOR_$002D_1 = F("-",1);
SymbolTerm *const FILE_derive::FUNCTOR_exp_1 = F("exp",1);

	Operation FILE_derive::PRED_d_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_derive::d_3_var, FILE_derive::d_3_int, FILE_derive::d_3_int, FILE_derive::d_3_int, FILE_derive::d_3_var, FILE_derive::d_3_int);
	}

	Operation FILE_derive::d_3_var(Prolog *m)
	{
		m->jtry3(nullptr, FILE_derive::d_3_var_1);
		return d_3_1(m);
	}

	Operation FILE_derive::d_3_var_1(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_2);
		return d_3_2(m);
	}

	Operation FILE_derive::d_3_var_2(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_3);
		return d_3_3(m);
	}

	Operation FILE_derive::d_3_var_3(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_4);
		return d_3_4(m);
	}

	Operation FILE_derive::d_3_var_4(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_5);
		return d_3_5(m);
	}

	Operation FILE_derive::d_3_var_5(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_6);
		return d_3_6(m);
	}

	Operation FILE_derive::d_3_var_6(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_7);
		return d_3_7(m);
	}

	Operation FILE_derive::d_3_var_7(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_8);
		return d_3_8(m);
	}

	Operation FILE_derive::d_3_var_8(Prolog *m)
	{
		m->retry(nullptr, FILE_derive::d_3_var_9);
		return d_3_9(m);
	}

	Operation FILE_derive::d_3_var_9(Prolog *m)
	{
		m->trust(nullptr);
		return d_3_10(m);
	}

	Operation FILE_derive::d_3_int(Prolog *m)
	{
		m->jtry3(nullptr, FILE_derive::d_3_int_1);
		return d_3_9(m);
	}

	Operation FILE_derive::d_3_int_1(Prolog *m)
	{
		m->trust(nullptr);
		return d_3_10(m);
	}

	Operation FILE_derive::d_3_1(Prolog *m)
	{
	// d(A+B,C,D+E):-!,d(A,C,D),d(B,C,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A+B,C,D+E):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_$002B_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_$002B_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({a5, a2, a7}), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = p1;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_2(Prolog *m)
	{
	// d(A-B,C,D-E):-!,d(A,C,D),d(B,C,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A-B,C,D-E):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_$002D_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_$002D_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({a5, a2, a7}), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = p1;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_3(Prolog *m)
	{
	// d(A*B,C,D*B+A*E):-!,d(A,C,D),d(B,C,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A*B,C,D*B+A*E):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_$002A_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_$002B_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a6 = a6->dref();
			a8 = V(m);
			if (!a6->unify(C(FUNCTOR_$002A_2, {a8, a5}), m->trail))
			{
				return m->fail();
			}
		a7 = a7->dref();
			a9 = V(m);
			if (!a7->unify(C(FUNCTOR_$002A_2, {a4, a9}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({a5, a2, a9}), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a8;
		m->cont = p1;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_4(Prolog *m)
	{
	// d(A/B,C,(D*B-A*E)/B^2):-!,d(A,C,D),d(B,C,E)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10, *a11;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A/B,C,(D*B-A*E)/B^2):-['$neck_cut',d(A,C,D),d(B,C,E)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_$002F_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_$002F_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a6 = a6->dref();
			a8 = V(m);
			a9 = V(m);
			if (!a6->unify(C(FUNCTOR_$002D_2, {a8, a9}), m->trail))
			{
				return m->fail();
			}
		a8 = a8->dref();
			a10 = V(m);
			if (!a8->unify(C(FUNCTOR_$002A_2, {a10, a5}), m->trail))
			{
				return m->fail();
			}
		a9 = a9->dref();
			a11 = V(m);
			if (!a9->unify(C(FUNCTOR_$002A_2, {a4, a11}), m->trail))
			{
				return m->fail();
			}
		a7 = a7->dref();
			if (!a7->unify(C(FUNCTOR_$005E_2, {a5, int_2}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_d_3_static_exec(e);
		}, VA({a5, a2, a11}), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a10;
		m->cont = p1;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_5(Prolog *m)
	{
	// d(A^B,C,D*B*A^E):-!,integer(B),E is B-1,d(A,C,D)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9, *a10;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A^B,C,D*B*A^E):-['$neck_cut',integer(B),E is B-1,d(A,C,D)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if (!a1->unify(C(FUNCTOR_$005E_2, {a4, a5}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a6 = V(m);
			a7 = V(m);
			if (!a3->unify(C(FUNCTOR_$002A_2, {a6, a7}), m->trail))
			{
				return m->fail();
			}
		a6 = a6->dref();
			a8 = V(m);
			if (!a6->unify(C(FUNCTOR_$002A_2, {a8, a5}), m->trail))
			{
				return m->fail();
			}
		a7 = a7->dref();
			a9 = V(m);
			if (!a7->unify(C(FUNCTOR_$005E_2, {a4, a9}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		//START inline expansion of integer(a(5))
		a5 = a5->dref();
		if (!(a5->isInteger()))
		{
			return m->fail();
		}
		//END inline expansion
	// put_str_args([a(5),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(10))
		a10 = S(FUNCTOR_$002D_2, {a5, int_1});
		 ;
		//START inline expansion of a(9)is a(10)
		if (!a9->unify(Arithmetic::evaluate(a10), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a8;
		m->cont = cont;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_6(Prolog *m)
	{
	// d(-A,B,-C):-!,d(A,B,C)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(-A,B,-C):-['$neck_cut',d(A,B,C)]
		a1 = a1->dref();
			a4 = V(m);
			if (!a1->unify(C(FUNCTOR_$002D_1, {a4}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a5 = V(m);
			if (!a3->unify(C(FUNCTOR_$002D_1, {a5}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a5;
		m->cont = cont;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_7(Prolog *m)
	{
	// d(exp(A),B,exp(A)*C):-!,d(A,B,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(exp(A),B,exp(A)*C):-['$neck_cut',d(A,B,C)]
		a1 = a1->dref();
			a4 = V(m);
			if (!a1->unify(C(FUNCTOR_exp_1, {a4}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a5 = V(m);
			a6 = V(m);
			if (!a3->unify(C(FUNCTOR_$002A_2, {a5, a6}), m->trail))
			{
				return m->fail();
			}
		a5 = a5->dref();
			if (!a5->unify(C(FUNCTOR_exp_1, {a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = cont;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_8(Prolog *m)
	{
	// d(log(A),B,C/A):-!,d(A,B,C)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(log(A),B,C/A):-['$neck_cut',d(A,B,C)]
		a1 = a1->dref();
			a4 = V(m);
			if (!a1->unify(C(FUNCTOR_log_1, {a4}), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			a5 = V(m);
			if (!a3->unify(C(FUNCTOR_$002F_2, {a5, a4}), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a5;
		m->cont = cont;
		return d_3_top(m);
	}

	Operation FILE_derive::d_3_9(Prolog *m)
	{
	// d(A,A,1):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A,A,1):-['$neck_cut']
		if (!a1->unify(a2, m->trail))
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

	Operation FILE_derive::d_3_10(Prolog *m)
	{
	// d(A,B,0):-true
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// d(A,B,0):-[]
		if (!int_0->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	FILE_derive::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_derive::StaticConstructor FILE_derive::staticConstructor;

	void FILE_derive::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_derive::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("ops8",0,FILE_derive::PRED_ops8_0_static_exec);
	   PredTable::registerBuiltin("log10",0,FILE_derive::PRED_log10_0_static_exec);
	   PredTable::registerBuiltin("divide10",0,FILE_derive::PRED_divide10_0_static_exec);
	   PredTable::registerBuiltin("d",3,FILE_derive::PRED_d_3_static_exec);
	}
}
