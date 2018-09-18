using namespace std;

#include "FILE_prover.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/StructureTerm.h"
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

	Operation FILE_prover::PRED_top_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-prover
		m->setB0();
	// top:-[prover]
		return Op([&] (e)
		{
		PRED_prover_0_static_exec(e);
		}, VA(), cont);
	}

	Operation FILE_prover::PRED_prover_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry0(nullptr, FILE_prover::prover_0_sub_1);
		return prover_0_1(m);
	}

	Operation FILE_prover::prover_0_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return prover_0_2(m);
	}

	Operation FILE_prover::prover_0_1(Prolog* m)
	{
	// prover:-problem(A,B,C),implies(B,C),fail
		 Term* a1,* a2;
		Operation p1, p2;
		Operation cont;
		cont = m->cont;
	// prover:-[problem(A,B,C),implies(B,C),fail]
		a1 = V(m);
		a2 = V(m);
		return Op([&] (e)
		{
		PRED_problem_3_static_exec(e);
		}, VA({ V(m), a1, a2 }), Op([&] (e)
		{
		PRED_implies_2_static_exec(e);
	}, VA({ a1, a2 }), Failure::fail_0));
	}

	Operation FILE_prover::prover_0_2(Prolog* m)
	{
	// prover:-true
		Operation cont;
		cont = m->cont;
	// prover:-[]
		return cont;
	}

SymbolTerm* const  FILE_prover::FUNCTOR_$002D_1 = F("-",1);
SymbolTerm* const  FILE_prover::ATOM_a = SYM("a");
StructureTerm* const  FILE_prover::L_problem_3_s5 = S(FUNCTOR_$002D_1, ATOM_a);
SymbolTerm* const  FILE_prover::FUNCTOR_$002B_1 = F("+",1);
StructureTerm* const  FILE_prover::L_problem_3_s7 = S(FUNCTOR_$002B_1, ATOM_a);
SymbolTerm* const  FILE_prover::FUNCTOR_$0026_2 = F("&",2);
StructureTerm* const  FILE_prover::L_problem_3_s11 = S(FUNCTOR_$0026_2, L_problem_3_s5, L_problem_3_s5);
SymbolTerm* const  FILE_prover::FUNCTOR_$0023_2 = F("#",2);
SymbolTerm* const  FILE_prover::ATOM_to_be = SYM("to_be");
StructureTerm* const  FILE_prover::L_problem_3_s16 = S(FUNCTOR_$002B_1, ATOM_to_be);
StructureTerm* const  FILE_prover::L_problem_3_s17 = S(FUNCTOR_$002D_1, ATOM_to_be);
StructureTerm* const  FILE_prover::L_problem_3_s19 = S(FUNCTOR_$0023_2, L_problem_3_s16, L_problem_3_s17);
SymbolTerm* const  FILE_prover::ATOM_b = SYM("b");
StructureTerm* const  FILE_prover::L_problem_3_s24 = S(FUNCTOR_$002B_1, ATOM_b);
StructureTerm* const  FILE_prover::L_problem_3_s26 = S(FUNCTOR_$0023_2, L_problem_3_s24, L_problem_3_s5);
StructureTerm* const  FILE_prover::L_problem_3_s28 = S(FUNCTOR_$002D_1, ATOM_b);
StructureTerm* const  FILE_prover::L_problem_3_s30 = S(FUNCTOR_$0026_2, L_problem_3_s5, L_problem_3_s28);
StructureTerm* const  FILE_prover::L_problem_3_s32 = S(FUNCTOR_$0026_2, L_problem_3_s28, L_problem_3_s5);
StructureTerm* const  FILE_prover::L_problem_3_s34 = S(FUNCTOR_$0026_2, L_problem_3_s24, L_problem_3_s5);
StructureTerm* const  FILE_prover::L_problem_3_s36 = S(FUNCTOR_$0023_2, L_problem_3_s28, L_problem_3_s34);
SymbolTerm* const  FILE_prover::ATOM_c = SYM("c");
StructureTerm* const  FILE_prover::L_problem_3_s40 = S(FUNCTOR_$002B_1, ATOM_c);
StructureTerm* const  FILE_prover::L_problem_3_s42 = S(FUNCTOR_$0023_2, L_problem_3_s28, L_problem_3_s40);
StructureTerm* const  FILE_prover::L_problem_3_s44 = S(FUNCTOR_$0023_2, L_problem_3_s5, L_problem_3_s42);
StructureTerm* const  FILE_prover::L_problem_3_s46 = S(FUNCTOR_$0023_2, L_problem_3_s5, L_problem_3_s40);
StructureTerm* const  FILE_prover::L_problem_3_s48 = S(FUNCTOR_$0023_2, L_problem_3_s28, L_problem_3_s46);
StructureTerm* const  FILE_prover::L_problem_3_s51 = S(FUNCTOR_$0023_2, L_problem_3_s5, L_problem_3_s24);
StructureTerm* const  FILE_prover::L_problem_3_s52 = S(FUNCTOR_$002D_1, ATOM_c);
StructureTerm* const  FILE_prover::L_problem_3_s54 = S(FUNCTOR_$0026_2, L_problem_3_s24, L_problem_3_s52);
StructureTerm* const  FILE_prover::L_problem_3_s56 = S(FUNCTOR_$0023_2, L_problem_3_s54, L_problem_3_s46);
StructureTerm* const  FILE_prover::L_problem_3_s59 = S(FUNCTOR_$0026_2, L_problem_3_s46, L_problem_3_s42);
StructureTerm* const  FILE_prover::L_problem_3_s61 = S(FUNCTOR_$0023_2, L_problem_3_s30, L_problem_3_s40);

	Operation FILE_prover::PRED_problem_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_prover::problem_3_var, FILE_prover::problem_3_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, Failure::fail_0);
	}

	Operation FILE_prover::problem_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_prover::problem_3_var_1);
		return problem_3_1(m);
	}

	Operation FILE_prover::problem_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_2);
		return problem_3_2(m);
	}

	Operation FILE_prover::problem_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_3);
		return problem_3_3(m);
	}

	Operation FILE_prover::problem_3_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_4);
		return problem_3_4(m);
	}

	Operation FILE_prover::problem_3_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_5);
		return problem_3_5(m);
	}

	Operation FILE_prover::problem_3_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_6);
		return problem_3_6(m);
	}

	Operation FILE_prover::problem_3_var_6(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_7);
		return problem_3_7(m);
	}

	Operation FILE_prover::problem_3_var_7(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_8);
		return problem_3_8(m);
	}

	Operation FILE_prover::problem_3_var_8(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::problem_3_var_9);
		return problem_3_9(m);
	}

	Operation FILE_prover::problem_3_var_9(Prolog* m)
	{
		m->trust(nullptr);
		return problem_3_10(m);
	}

	Operation FILE_prover::problem_3_1(Prolog* m)
	{
	// problem(1,-a,+a):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(1,-a,+a):-[]
		if(!int_1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s5->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s7->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_2(Prolog* m)
	{
	// problem(2,+a,-a& -a):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(2,+a,-a& -a):-[]
		if(!int_2->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s7->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s11->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_3(Prolog* m)
	{
	// problem(3,-a,+to_be# -to_be):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(3,-a,+to_be# -to_be):-[]
		if(!int_3->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s5->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s19->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_4(Prolog* m)
	{
	// problem(4,-a& -a,-a):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(4,-a& -a,-a):-[]
		if(!int_4->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s11->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s5->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_5(Prolog* m)
	{
	// problem(5,-a,+b# -a):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(5,-a,+b# -a):-[]
		if(!int_5->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s5->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s26->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_6(Prolog* m)
	{
	// problem(6,-a& -b,-b& -a):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(6,-a& -b,-b& -a):-[]
		if(!int_6->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s30->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s32->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_7(Prolog* m)
	{
	// problem(7,-a,-b# +b& -a):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(7,-a,-b# +b& -a):-[]
		if(!int_7->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s5->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s36->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_8(Prolog* m)
	{
	// problem(8,-a# -b# +c,-b# -a# +c):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(8,-a# -b# +c,-b# -a# +c):-[]
		if(!int_8->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s44->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s48->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_9(Prolog* m)
	{
	// problem(9,-a# +b,+b& -c# -a# +c):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(9,-a# +b,+b& -c# -a# +c):-[]
		if(!int_9->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s51->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s56->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::problem_3_10(Prolog* m)
	{
	// problem(10,(-a# +c)&(-b# +c),-a& -b# +c):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// problem(10,(-a# +c)&(-b# +c),-a& -b# +c):-[]
		if(!int_10->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s59->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!L_problem_3_s61->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SymbolTerm* const  FILE_prover::FUNCTOR_fs_4 = F("fs",4);
StructureTerm* const  FILE_prover::L_implies_2_s4 = S(FUNCTOR_fs_4, Prolog::Nil, Prolog::Nil, Prolog::Nil, Prolog::Nil);

	Operation FILE_prover::PRED_implies_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// implies(A,B):-opposite(B,C),add_conjunction(A,C,fs([],[],[],[]))
		m->setB0();
		 Term* a1,* a2,* a3;
		Operation p1;
		a1 = LARG[0];
		a2 = LARG[1];
	// implies(A,B):-[opposite(B,C),add_conjunction(A,C,fs([],[],[],[]))]
		a3 = V(m);
		return Op([&] (e)
		{
		PRED_opposite_2_static_exec(e);
		}, VA({ a2, a3 }), Op([&] (e)
		{
		PRED_add_conjunction_3_static_exec(e);
	}, VA({ a1, a3, L_implies_2_s4 }), cont));
	}

	Operation FILE_prover::PRED_opposite_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return opposite_2_top(m);
	}

	Operation FILE_prover::opposite_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_prover::opposite_2_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, FILE_prover::opposite_2_var, Failure::fail_0);
	}

	Operation FILE_prover::opposite_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_prover::opposite_2_var_1);
		return opposite_2_1(m);
	}

	Operation FILE_prover::opposite_2_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::opposite_2_var_2);
		return opposite_2_2(m);
	}

	Operation FILE_prover::opposite_2_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::opposite_2_var_3);
		return opposite_2_3(m);
	}

	Operation FILE_prover::opposite_2_var_3(Prolog* m)
	{
		m->trust(nullptr);
		return opposite_2_4(m);
	}

	Operation FILE_prover::opposite_2_1(Prolog* m)
	{
	// opposite(A&B,C#D):-!,opposite(A,C),opposite(B,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// opposite(A&B,C#D):-['$neck_cut',opposite(A,C),opposite(B,D)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if(!a1->unify(C(FUNCTOR_$0026_2, { a3, a4 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a5 = V(m);
			a6 = V(m);
			if(!a2->unify(C(FUNCTOR_$0023_2, { a5, a6 }), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_opposite_2_static_exec(e);
		}, VA({ a4, a6 }), cont);
		m->AREGS[0] = a3;
		m->AREGS[1] = a5;
		m->cont = p1;
		return opposite_2_top(m);
	}

	Operation FILE_prover::opposite_2_2(Prolog* m)
	{
	// opposite(A#B,C&D):-!,opposite(A,C),opposite(B,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// opposite(A#B,C&D):-['$neck_cut',opposite(A,C),opposite(B,D)]
		a1 = a1->dref();
			a3 = V(m);
			a4 = V(m);
			if(!a1->unify(C(FUNCTOR_$0023_2, { a3, a4 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a5 = V(m);
			a6 = V(m);
			if(!a2->unify(C(FUNCTOR_$0026_2, { a5, a6 }), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_opposite_2_static_exec(e);
		}, VA({ a4, a6 }), cont);
		m->AREGS[0] = a3;
		m->AREGS[1] = a5;
		m->cont = p1;
		return opposite_2_top(m);
	}

	Operation FILE_prover::opposite_2_3(Prolog* m)
	{
	// opposite(+A,-A):-!
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// opposite(+A,-A):-['$neck_cut']
		a1 = a1->dref();
			a3 = V(m);
			if(!a1->unify(C(FUNCTOR_$002B_1, { a3 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			if(!a2->unify(C(FUNCTOR_$002D_1, { a3 }), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_prover::opposite_2_4(Prolog* m)
	{
	// opposite(-A,+A):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// opposite(-A,+A):-[]
		a1 = a1->dref();
			a3 = V(m);
			if(!a1->unify(C(FUNCTOR_$002D_1, { a3 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			if(!a2->unify(C(FUNCTOR_$002B_1, { a3 }), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

	Operation FILE_prover::PRED_add_conjunction_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// add_conjunction(A,B,C):-expand(A,C,D),expand(B,D,E),refute(E)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation p1, p2;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
	// add_conjunction(A,B,C):-[expand(A,C,D),expand(B,D,E),refute(E)]
		a4 = V(m);
		a5 = V(m);
		return Op([&] (e)
		{
		PRED_expand_3_static_exec(e);
		}, VA({ a1, a3, a4 }), Op([&] (e)
		{
		PRED_expand_3_static_exec(e);
	}, VA({ a2, a4, a5 }), Op([&] (e)
	{
		PRED_refute_1_static_exec(e);
	}, VA({ a5 }), cont)));
	}

SymbolTerm* const  FILE_prover::ATOM_refuted = SYM("refuted");

	Operation FILE_prover::PRED_expand_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return expand_3_top(m);
	}

	Operation FILE_prover::expand_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_prover::expand_3_var, FILE_prover::expand_3_1, FILE_prover::expand_3_1, FILE_prover::expand_3_1, FILE_prover::expand_3_var, FILE_prover::expand_3_1);
	}

	Operation FILE_prover::expand_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_prover::expand_3_var_1);
		return expand_3_1(m);
	}

	Operation FILE_prover::expand_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::expand_3_var_2);
		return expand_3_2(m);
	}

	Operation FILE_prover::expand_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::expand_3_var_3);
		return expand_3_3(m);
	}

	Operation FILE_prover::expand_3_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::expand_3_var_4);
		return expand_3_4(m);
	}

	Operation FILE_prover::expand_3_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::expand_3_var_5);
		return expand_3_5(m);
	}

	Operation FILE_prover::expand_3_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::expand_3_var_6);
		return expand_3_6(m);
	}

	Operation FILE_prover::expand_3_var_6(Prolog* m)
	{
		m->trust(nullptr);
		return expand_3_7(m);
	}

	Operation FILE_prover::expand_3_1(Prolog* m)
	{
	// expand(A,refuted,refuted):-!
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(A,refuted,refuted):-['$neck_cut']
		if(!ATOM_refuted->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!ATOM_refuted->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_prover::expand_3_2(Prolog* m)
	{
	// expand(A&B,fs(C,D,E,F),refuted):-includes(C,A&B),!
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(A&B,fs(C,D,E,F),refuted):-['$get_level'(G),includes(C,A&B),'$cut'(G)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if(!a1->unify(C(FUNCTOR_$0026_2, { a4, a5 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			if(!a2->unify(C(FUNCTOR_fs_4, { a6, V(m), V(m), V(m) }), m->trail))
			{
				return m->fail();
			}
		if(!ATOM_refuted->unify(a3, m->trail))
		{
			return m->fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if(!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
	// put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0026_2'),y(1),a(8))
		a8 = S(FUNCTOR_$0026_2, { a4, a5 });
		 ;
		return Op([&] (e)
		{
		PRED_includes_2_static_exec(e);
		}, VA({ a6, a8 }), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a7 }), cont));
	}

	Operation FILE_prover::expand_3_3(Prolog* m)
	{
	// expand(A&B,fs(C,D,E,F),fs(C,D,E,F)):-includes(D,A&B),!
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(A&B,fs(C,D,E,F),fs(C,D,E,F)):-['$get_level'(G),includes(D,A&B),'$cut'(G)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if(!a1->unify(C(FUNCTOR_$0026_2, { a4, a5 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			a7 = V(m);
			a8 = V(m);
			a9 = V(m);
			if(!a2->unify(C(FUNCTOR_fs_4, { a6, a7, a8, a9 }), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
			if(!a3->unify(C(FUNCTOR_fs_4, { a6, a7, a8, a9 }), m->trail))
			{
				return m->fail();
			}
		a10 = V(m);
		//START inline expansion of $get_level(a(10))
		if(!a10->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
	// put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0026_2'),y(1),a(11))
		a11 = S(FUNCTOR_$0026_2, { a4, a5 });
		 ;
		return Op([&] (e)
		{
		PRED_includes_2_static_exec(e);
		}, VA({ a7, a11 }), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a10 }), cont));
	}

	Operation FILE_prover::expand_3_4(Prolog* m)
	{
	// expand(A&B,fs(C,D,E,F),G):-!,expand(A,fs(C,[A&B|D],E,F),H),expand(B,H,G)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(A&B,fs(C,D,E,F),G):-['$neck_cut',expand(A,fs(C,[A&B|D],E,F),H),expand(B,H,G)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if(!a1->unify(C(FUNCTOR_$0026_2, { a4, a5 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			a7 = V(m);
			a8 = V(m);
			a9 = V(m);
			if(!a2->unify(C(FUNCTOR_fs_4, { a6, a7, a8, a9 }), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
	// put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0026_2'),y(1),a(10))
		a10 = S(FUNCTOR_$0026_2, { a4, a5 });
		 ;
		a11 = CONS(a10, a7);
	// put_str_args([a(6),a(11),a(8),a(9)],y(2)),put_str(@('FUNCTOR_fs_4'),y(2),a(12))
		a12 = S(FUNCTOR_fs_4, { a6, a11, a8, a9 });
		 ;
		a13 = V(m);
		p1 = Op([&] (e)
		{
		PRED_expand_3_static_exec(e);
		}, VA({ a5, a13, a3 }), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a12;
		m->AREGS[2] = a13;
		m->cont = p1;
		return expand_3_top(m);
	}

	Operation FILE_prover::expand_3_5(Prolog* m)
	{
	// expand(A#B,fs(C,D,E,F),G):-!,opposite(A#B,H),extend(H,C,D,I,fs(I,D,E,F),G)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(A#B,fs(C,D,E,F),G):-['$neck_cut',opposite(A#B,H),extend(H,C,D,I,fs(I,D,E,F),G)]
		a1 = a1->dref();
			a4 = V(m);
			a5 = V(m);
			if(!a1->unify(C(FUNCTOR_$0023_2, { a4, a5 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a6 = V(m);
			a7 = V(m);
			a8 = V(m);
			a9 = V(m);
			if(!a2->unify(C(FUNCTOR_fs_4, { a6, a7, a8, a9 }), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
	// put_str_args([a(4),a(5)],y(1)),put_str(@('FUNCTOR_$0023_2'),y(1),a(10))
		a10 = S(FUNCTOR_$0023_2, { a4, a5 });
		 ;
		a11 = V(m);
		a12 = V(m);
	// put_str_args([a(12),a(7),a(8),a(9)],y(2)),put_str(@('FUNCTOR_fs_4'),y(2),a(13))
		a13 = S(FUNCTOR_fs_4, { a12, a7, a8, a9 });
		 ;
		return Op([&] (e)
		{
		PRED_opposite_2_static_exec(e);
		}, VA({ a10, a11 }), Op([&] (e)
		{
		PRED_extend_6_static_exec(e);
	}, VA({ a11, a6, a7, a12, a13, a3 }), cont));
	}

	Operation FILE_prover::expand_3_6(Prolog* m)
	{
	// expand(+A,fs(B,C,D,E),F):-!,extend(A,D,E,G,fs(B,C,G,E),F)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(+A,fs(B,C,D,E),F):-['$neck_cut',extend(A,D,E,G,fs(B,C,G,E),F)]
		a1 = a1->dref();
			a4 = V(m);
			if(!a1->unify(C(FUNCTOR_$002B_1, { a4 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a5 = V(m);
			a6 = V(m);
			a7 = V(m);
			a8 = V(m);
			if(!a2->unify(C(FUNCTOR_fs_4, { a5, a6, a7, a8 }), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a9 = V(m);
	// put_str_args([a(5),a(6),a(9),a(8)],y(1)),put_str(@('FUNCTOR_fs_4'),y(1),a(10))
		a10 = S(FUNCTOR_fs_4, { a5, a6, a9, a8 });
		 ;
		return Op([&] (e)
		{
		PRED_extend_6_static_exec(e);
		}, VA({ a4, a7, a8, a9, a10, a3 }), cont);
	}

	Operation FILE_prover::expand_3_7(Prolog* m)
	{
	// expand(-A,fs(B,C,D,E),F):-extend(A,E,D,G,fs(B,C,D,G),F)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// expand(-A,fs(B,C,D,E),F):-[extend(A,E,D,G,fs(B,C,D,G),F)]
		a1 = a1->dref();
			a4 = V(m);
			if(!a1->unify(C(FUNCTOR_$002D_1, { a4 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
			a5 = V(m);
			a6 = V(m);
			a7 = V(m);
			a8 = V(m);
			if(!a2->unify(C(FUNCTOR_fs_4, { a5, a6, a7, a8 }), m->trail))
			{
				return m->fail();
			}
		a9 = V(m);
	// put_str_args([a(5),a(6),a(7),a(9)],y(1)),put_str(@('FUNCTOR_fs_4'),y(1),a(10))
		a10 = S(FUNCTOR_fs_4, { a5, a6, a7, a9 });
		 ;
		return Op([&] (e)
		{
		PRED_extend_6_static_exec(e);
		}, VA({ a4, a8, a7, a9, a10, a3 }), cont);
	}

	Operation FILE_prover::PRED_includes_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return includes_2_top(m);
	}

	Operation FILE_prover::includes_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_prover::includes_2_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, Failure::fail_0, FILE_prover::includes_2_var);
	}

	Operation FILE_prover::includes_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_prover::includes_2_var_1);
		return includes_2_1(m);
	}

	Operation FILE_prover::includes_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return includes_2_2(m);
	}

	Operation FILE_prover::includes_2_1(Prolog* m)
	{
	// includes([A|B],A):-!
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// includes([A|B],A):-['$neck_cut']
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a3 = argz[0];
		} else if(a1->isVar())
		{
			a3 = V(m);
			 a1->bind(CONS(a3, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a3->unify(a2, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_prover::includes_2_2(Prolog* m)
	{
	// includes([A|B],C):-includes(B,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// includes([A|B],C):-[includes(B,C)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a3 = argz[1];
		} else if(a1->isVar())
		{
			a3 = V(m);
			 a1->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a3;
		m->AREGS[1] = a2;
		m->cont = cont;
		return includes_2_top(m);
	}

	Operation FILE_prover::PRED_extend_6_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry6(nullptr, FILE_prover::extend_6_sub_1);
		return extend_6_1(m);
	}

	Operation FILE_prover::extend_6_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_prover::extend_6_sub_2);
		return extend_6_2(m);
	}

	Operation FILE_prover::extend_6_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return extend_6_3(m);
	}

	Operation FILE_prover::extend_6_1(Prolog* m)
	{
	// extend(A,B,C,D,E,refuted):-includes(C,A),!
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// extend(A,B,C,D,E,refuted):-['$get_level'(F),includes(C,A),'$cut'(F)]
		if(!ATOM_refuted->unify(a6, m->trail))
		{
			return m->fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if(!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_includes_2_static_exec(e);
		}, VA({ a3, a1 }), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a7 }), cont));
	}

	Operation FILE_prover::extend_6_2(Prolog* m)
	{
	// extend(A,B,C,B,D,D):-includes(B,A),!
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// extend(A,B,C,B,D,D):-['$get_level'(E),includes(B,A),'$cut'(E)]
		if(!a2->unify(a4, m->trail))
		{
			return m->fail();
		}
		if(!a5->unify(a6, m->trail))
		{
			return m->fail();
		}
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if(!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_includes_2_static_exec(e);
		}, VA({ a2, a1 }), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a7 }), cont));
	}

	Operation FILE_prover::extend_6_3(Prolog* m)
	{
	// extend(A,B,C,[A|B],D,D):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// extend(A,B,C,[A|B],D,D):-[]
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!a2->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			 a4->bind(CONS(a1, a2), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a5->unify(a6, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_prover::PRED_refute_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_prover::refute_1_var, Failure::fail_0, Failure::fail_0, FILE_prover::refute_1_1, FILE_prover::refute_1_2, Failure::fail_0);
	}

	Operation FILE_prover::refute_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_prover::refute_1_var_1);
		return refute_1_1(m);
	}

	Operation FILE_prover::refute_1_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return refute_1_2(m);
	}

	Operation FILE_prover::refute_1_1(Prolog* m)
	{
	// refute(refuted):-!
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// refute(refuted):-['$neck_cut']
		if(!ATOM_refuted->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_prover::refute_1_2(Prolog* m)
	{
	// refute(fs([A&B|C],D,E,F)):-opposite(A,G),opposite(B,H),I=fs(C,D,E,F),add_conjunction(G,B,I),add_conjunction(G,H,I),add_conjunction(A,H,I)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13;
		Operation p1, p2, p3, p4, p5;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// refute(fs([A&B|C],D,E,F)):-[opposite(A,G),opposite(B,H),'$unify'(I,fs(C,D,E,F)),add_conjunction(G,B,I),add_conjunction(G,H,I),add_conjunction(A,H,I)]
		a1 = a1->dref();
			a2 = V(m);
			a3 = V(m);
			a4 = V(m);
			a5 = V(m);
			if(!a1->unify(C(FUNCTOR_fs_4, { a2, a3, a4, a5 }), m->trail))
			{
				return m->fail();
			}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a6 = argz[0];
			a7 = argz[1];
		} else if(a2->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			 a2->bind(CONS(a6, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
			a8 = V(m);
			a9 = V(m);
			if(!a6->unify(C(FUNCTOR_$0026_2, { a8, a9 }), m->trail))
			{
				return m->fail();
			}
		a10 = V(m);
		a11 = V(m);
		a12 = V(m);
	// put_str_args([a(7),a(3),a(4),a(5)],y(1)),put_str(@('FUNCTOR_fs_4'),y(1),a(13))
		a13 = S(FUNCTOR_fs_4, { a7, a3, a4, a5 });
		 ;
		return Op([&] (e)
		{
		PRED_opposite_2_static_exec(e);
		}, VA({ a8, a10 }), Op([&] (e)
		{
		PRED_opposite_2_static_exec(e);
	}, VA({ a9, a11 }), Op([&] (e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({ a12, a13 }), Op([&] (e)
	{
		PRED_add_conjunction_3_static_exec(e);
	}, VA({ a10, a9, a12 }), Op([&] (e)
	{
		PRED_add_conjunction_3_static_exec(e);
	}, VA({ a10, a11, a12 }), Op([&] (e)
	{
		PRED_add_conjunction_3_static_exec(e);
	}, VA({ a8, a11, a12 }), cont))))));
	}

	FILE_prover::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_prover::StaticConstructor FILE_prover::staticConstructor;

	void FILE_prover::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_prover::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("prover",0,FILE_prover::PRED_prover_0_static_exec);
	   PredTable::registerBuiltin("problem",3,FILE_prover::PRED_problem_3_static_exec);
	   PredTable::registerBuiltin("implies",2,FILE_prover::PRED_implies_2_static_exec);
	   PredTable::registerBuiltin("opposite",2,FILE_prover::PRED_opposite_2_static_exec);
	   PredTable::registerBuiltin("add_conjunction",3,FILE_prover::PRED_add_conjunction_3_static_exec);
	   PredTable::registerBuiltin("expand",3,FILE_prover::PRED_expand_3_static_exec);
	   PredTable::registerBuiltin("includes",2,FILE_prover::PRED_includes_2_static_exec);
	   PredTable::registerBuiltin("extend",6,FILE_prover::PRED_extend_6_static_exec);
	   PredTable::registerBuiltin("refute",1,FILE_prover::PRED_refute_1_static_exec);
	}
}
