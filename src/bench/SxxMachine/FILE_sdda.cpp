using namespace std;

#include "FILE_sdda.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/Arithmetic.h"
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
SymbolTerm* const  FILE_sdda::ATOM_test = SYM("test");

	Operation FILE_sdda::PRED_top_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-do_sdda(test,A,B,C)
		m->setB0();
	// top:-[do_sdda(test,A,B,C)]
		return Op([&] (e)
		{
		PRED_do_sdda_4_static_exec(e);
		}, VA({ ATOM_test, V(m), V(m), V(m) }), cont);
	}

	Operation FILE_sdda::PRED_do_sdda_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// do_sdda(A,B,C,D):-read_procedures(E,B,F),entry_exit_modes_list(E,B,F)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
	// do_sdda(A,B,C,D):-[read_procedures(E,B,F),entry_exit_modes_list(E,B,F)]
		a5 = V(m);
		a6 = V(m);
		return Op([&] (e)
		{
		PRED_read_procedures_3_static_exec(e);
		}, VA({ a5, a2, a6 }), Op([&] (e)
		{
		PRED_entry_exit_modes_list_3_static_exec(e);
	}, VA({ a5, a2, a6 }), cont));
	}

SymbolTerm* const  FILE_sdda::FUNCTOR_$002F_2 = F("/",2);
SymbolTerm* const  FILE_sdda::ATOM_a = SYM("a");
StructureTerm* const  FILE_sdda::L_read_procedures_3_s5 = S(FUNCTOR_$002F_2, ATOM_a, int_2);
SymbolTerm* const  FILE_sdda::FUNCTOR_a_2 = F("a",2);
SymbolTerm* const  FILE_sdda::ATOM_c = SYM("c");
StructureTerm* const  FILE_sdda::L_read_procedures_3_s10 = S(FUNCTOR_$002F_2, ATOM_c, int_3);
SymbolTerm* const  FILE_sdda::FUNCTOR_$003A$002D_2 = F(":-",2);
SymbolTerm* const  FILE_sdda::FUNCTOR_c_3 = F("c",3);

	Operation FILE_sdda::PRED_read_procedures_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// read_procedures([[a/2,a(A,B),a(C,C)|D],[c/3,(c(E,F,G):-a(E,F))|H]|I],J,[c(K,L,M)|N]):-!
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13,* a14,* a15,* a16,* a17,* a18;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
	// read_procedures([[a/2,a(A,B),a(C,C)|D],[c/3,(c(E,F,G):-a(E,F))|H]|I],J,[c(K,L,M)|N]):-['$neck_cut']
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!L_read_procedures_3_s5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a6 = argz[1];
		} else if(a4->isVar())
		{
			a6 = V(m);
			 a4->bind(CONS(L_read_procedures_3_s5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[0];
			a8 = argz[1];
		} else if(a6->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a6->bind(CONS(a7, a8), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
			if(!a7->unify(C(FUNCTOR_a_2, V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		a8 = a8->dref();
		if(a8->isCons())
		{
			std::vector<Term*> argz = VA({ a8->car(), a8->cdr() });
			a9 = argz[0];
		} else if(a8->isVar())
		{
			a9 = V(m);
			 a8->bind(CONS(a9, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a9 = a9->dref();
			a10 = V(m);
			if(!a9->unify(C(FUNCTOR_a_2, { a10, a10 }), m->trail))
			{
				return m->fail();
			}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a11 = argz[0];
		} else if(a5->isVar())
		{
			a11 = V(m);
			 a5->bind(CONS(a11, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a11 = a11->dref();
		if(a11->isCons())
		{
			std::vector<Term*> argz = VA({ a11->car(), a11->cdr() });
			if(!L_read_procedures_3_s10->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a12 = argz[1];
		} else if(a11->isVar())
		{
			a12 = V(m);
			 a11->bind(CONS(L_read_procedures_3_s10, a12), m->trail);
		} else
		{
			return m->fail();
		}
		a12 = a12->dref();
		if(a12->isCons())
		{
			std::vector<Term*> argz = VA({ a12->car(), a12->cdr() });
			a13 = argz[0];
		} else if(a12->isVar())
		{
			a13 = V(m);
			 a12->bind(CONS(a13, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a13 = a13->dref();
			a14 = V(m);
			a15 = V(m);
			if(!a13->unify(C(FUNCTOR_$003A$002D_2, { a14, a15 }), m->trail))
			{
				return m->fail();
			}
		a14 = a14->dref();
			a16 = V(m);
			a17 = V(m);
			if(!a14->unify(C(FUNCTOR_c_3, { a16, a17, V(m) }), m->trail))
			{
				return m->fail();
			}
		a15 = a15->dref();
			if(!a15->unify(C(FUNCTOR_a_2, { a16, a17 }), m->trail))
			{
				return m->fail();
			}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a18 = argz[0];
		} else if(a3->isVar())
		{
			a18 = V(m);
			 a3->bind(CONS(a18, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a18 = a18->dref();
			if(!a18->unify(C(FUNCTOR_c_3, V(m), V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::PRED_entry_exit_modes_list_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_sdda::entry_exit_modes_list_3_sub_1);
		return entry_exit_modes_list_3_1(m);
	}

	Operation FILE_sdda::entry_exit_modes_list_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return entry_exit_modes_list_3_2(m);
	}

	Operation FILE_sdda::entry_exit_modes_list_3_1(Prolog* m)
	{
	// entry_exit_modes_list(A,B,C):-var(C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// entry_exit_modes_list(A,B,C):-[var(C)]
		//START inline expansion of var(a(3))
		a3 = a3->dref();
		if(!(a3->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::entry_exit_modes_list_3_2(Prolog* m)
	{
	// entry_exit_modes_list(A,B,[C|D]):-C=..[E|F],length(F,G),proc_exit_mode(A,B,[],E/G,F,H),entry_exit_modes_list(A,B,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// entry_exit_modes_list(A,B,[C|D]):-['$univ'(C,[E|F]),length(F,G),proc_exit_mode(A,B,[],E/G,F,H),entry_exit_modes_list(A,B,D)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a3->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a3->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = V(m);
		a7 = V(m);
		a8 = CONS(a6, a7);
		a9 = V(m);
	// put_str_args([a(6),a(9)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(10))
		a10 = S(FUNCTOR_$002F_2, { a6, a9 });
		 ;
		return Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
		}, VA({ a4, a8 }), Op([&] (e)
		{
		FILE_builtins::PRED_length_2_static_exec(e);
	}, VA({ a7, a9 }), Op([&] (e)
	{
		PRED_proc_exit_mode_6_static_exec(e);
	}, VA({ a1, a2, Prolog::Nil, a10, a7, V(m) }), Op([&] (e)
	{
		PRED_entry_exit_modes_list_3_static_exec(e);
	}, VA({ a1, a2, a5 }), cont))));
	}

	Operation FILE_sdda::PRED_proc_exit_mode_6_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry6(nullptr, FILE_sdda::proc_exit_mode_6_sub_1);
		return proc_exit_mode_6_1(m);
	}

	Operation FILE_sdda::proc_exit_mode_6_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::proc_exit_mode_6_sub_2);
		return proc_exit_mode_6_2(m);
	}

	Operation FILE_sdda::proc_exit_mode_6_sub_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::proc_exit_mode_6_sub_3);
		return proc_exit_mode_6_3(m);
	}

	Operation FILE_sdda::proc_exit_mode_6_sub_3(Prolog* m)
	{
		m->trust(nullptr);
		return proc_exit_mode_6_4(m);
	}

	Operation FILE_sdda::proc_exit_mode_6_1(Prolog* m)
	{
	// proc_exit_mode(A,B,C,D/E,F,G):-built_in(D/E,F,G)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// proc_exit_mode(A,B,C,D/E,F,G):-[built_in(D/E,F,G)]
		a4 = a4->dref();
			a7 = V(m);
			a8 = V(m);
			if(!a4->unify(C(FUNCTOR_$002F_2, { a7, a8 }), m->trail))
			{
				return m->fail();
			}
	// put_str_args([a(7),a(8)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(9))
		a9 = S(FUNCTOR_$002F_2, { a7, a8 });
		 ;
		return Op([&] (e)
		{
		PRED_built_in_3_static_exec(e);
		}, VA({ a9, a5, a6 }), cont);
	}

	Operation FILE_sdda::proc_exit_mode_6_2(Prolog* m)
	{
	// proc_exit_mode(A,B,C,D/E,F,G):-look_up_act([D/E,F,G],B)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// proc_exit_mode(A,B,C,D/E,F,G):-[look_up_act([D/E,F,G],B)]
		a4 = a4->dref();
			a7 = V(m);
			a8 = V(m);
			if(!a4->unify(C(FUNCTOR_$002F_2, { a7, a8 }), m->trail))
			{
				return m->fail();
			}
	// put_str_args([a(7),a(8)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(9))
		a9 = S(FUNCTOR_$002F_2, { a7, a8 });
		 ;
		a10 = CONS(a6, Prolog::Nil);
		a11 = CONS(a5, a10);
		a12 = CONS(a9, a11);
		return Op([&] (e)
		{
		PRED_look_up_act_2_static_exec(e);
		}, VA({ a12, a2 }), cont);
	}

	Operation FILE_sdda::proc_exit_mode_6_3(Prolog* m)
	{
	// proc_exit_mode(A,B,C,D/E,F,G):-umember([D/E|H],A),dup(H,I),clause_exit_modes_list(A,B,C,I,F,J),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(J),worst_case(J,G),dup(F,K),add_to_list([D/E,K,G],B)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13,* a14,* a15,* a16,* a17,* a18;
		Operation p1, p2, p3, p4, p5, p6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// proc_exit_mode(A,B,C,D/E,F,G):-[umember([D/E|H],A),dup(H,I),clause_exit_modes_list(A,B,C,I,F,J),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(J),worst_case(J,G),dup(F,K),add_to_list([D/E,K,G],B)]
		a4 = a4->dref();
			a7 = V(m);
			a8 = V(m);
			if(!a4->unify(C(FUNCTOR_$002F_2, { a7, a8 }), m->trail))
			{
				return m->fail();
			}
	// put_str_args([a(7),a(8)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(9))
		a9 = S(FUNCTOR_$002F_2, { a7, a8 });
		 ;
		a10 = V(m);
		a11 = CONS(a9, a10);
		a12 = V(m);
		a13 = V(m);
		a14 = V(m);
	// put_str_args([a(7),a(8)],y(2)),put_str(@('FUNCTOR_$002F_2'),y(2),a(15))
		a15 = S(FUNCTOR_$002F_2, { a7, a8 });
		 ;
		a16 = CONS(a6, Prolog::Nil);
		a17 = CONS(a14, a16);
		a18 = CONS(a15, a17);
		return Op([&] (e)
		{
		PRED_umember_2_static_exec(e);
		}, VA({ a11, a1 }), Op([&] (e)
		{
		PRED_dup_2_static_exec(e);
	}, VA({ a10, a12 }), Op([&] (e)
	{
		PRED_clause_exit_modes_list_6_static_exec(e);
	}, VA({ a1, a2, a3, a12, a5, a13 }), Op([&] (e)
	{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(e);
	}, VA({ a13 }), Op([&] (e)
	{
		PRED_worst_case_2_static_exec(e);
	}, VA({ a13, a6 }), Op([&] (e)
	{
		PRED_dup_2_static_exec(e);
	}, VA({ a5, a14 }), Op([&] (e)
	{
		PRED_add_to_list_2_static_exec(e);
	}, VA({ a18, a2 }), cont)))))));
	}

	Operation FILE_sdda::proc_exit_mode_6_4(Prolog* m)
	{
	// proc_exit_mode(A,B,C,D/E,F,G):-H=..[D|F],all_shared(F,G),add_to_list([D/E,F,G],B)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// proc_exit_mode(A,B,C,D/E,F,G):-['$univ'(H,[D|F]),all_shared(F,G),add_to_list([D/E,F,G],B)]
		a4 = a4->dref();
			a7 = V(m);
			a8 = V(m);
			if(!a4->unify(C(FUNCTOR_$002F_2, { a7, a8 }), m->trail))
			{
				return m->fail();
			}
		a9 = CONS(a7, a5);
	// put_str_args([a(7),a(8)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(10))
		a10 = S(FUNCTOR_$002F_2, { a7, a8 });
		 ;
		a11 = CONS(a6, Prolog::Nil);
		a12 = CONS(a5, a11);
		a13 = CONS(a10, a12);
		return Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
		}, VA({ V(m), a9 }), Op([&] (e)
		{
		PRED_all_shared_2_static_exec(e);
	}, VA({ a5, a6 }), Op([&] (e)
	{
		PRED_add_to_list_2_static_exec(e);
	}, VA({ a13, a2 }), cont)));
	}

	Operation FILE_sdda::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_sdda::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(m);
	}

	Operation FILE_sdda::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(m);
	}

	Operation FILE_sdda::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-A=[],!,fail
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-['$get_level'(B),'$unify'(A,[]),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(1),@(Prolog.Nil))
		if(!a1->unify(Prolog::Nil, m->trail))
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

	Operation FILE_sdda::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-[]
		return cont;
	}

	Operation FILE_sdda::PRED_clause_exit_modes_list_6_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return clause_exit_modes_list_6_top(m);
	}

	Operation FILE_sdda::clause_exit_modes_list_6_top(Prolog* m)
	{
		m->setB0();
		m->jtry6(nullptr, FILE_sdda::clause_exit_modes_list_6_sub_1);
		return clause_exit_modes_list_6_1(m);
	}

	Operation FILE_sdda::clause_exit_modes_list_6_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::clause_exit_modes_list_6_sub_2);
		return clause_exit_modes_list_6_2(m);
	}

	Operation FILE_sdda::clause_exit_modes_list_6_sub_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::clause_exit_modes_list_6_sub_3);
		return clause_exit_modes_list_6_3(m);
	}

	Operation FILE_sdda::clause_exit_modes_list_6_sub_3(Prolog* m)
	{
		m->trust(nullptr);
		return clause_exit_modes_list_6_4(m);
	}

	Operation FILE_sdda::clause_exit_modes_list_6_1(Prolog* m)
	{
	// clause_exit_modes_list(A,B,C,D,E,[]):-var(D),!
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// clause_exit_modes_list(A,B,C,D,E,[]):-['$get_level'(F),var(D),'$cut'(F)]
		if(!Prolog::Nil->unify(a6, m->trail))
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
		//START inline expansion of var(a(4))
		a4 = a4->dref();
		if(!(a4->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7->dref();
				  m->cut(a7->intValue());
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::clause_exit_modes_list_6_2(Prolog* m)
	{
	// clause_exit_modes_list(A,B,C,[D|E],F,G):-eqmember([D,F],C),clause_exit_modes_list(A,B,C,E,F,G)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// clause_exit_modes_list(A,B,C,[D|E],F,G):-[eqmember([D,F],C),clause_exit_modes_list(A,B,C,E,F,G)]
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a7 = argz[0];
			a8 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a4->bind(CONS(a7, a8), m->trail);
		} else
		{
			return m->fail();
		}
		a9 = CONS(a5, Prolog::Nil);
		a10 = CONS(a7, a9);
		return Op([&] (e)
		{
		PRED_eqmember_2_static_exec(e);
		}, VA({ a10, a3 }), Op([&] (e)
		{
		PRED_clause_exit_modes_list_6_static_exec(e);
	}, VA({ a1, a2, a3, a8, a5, a6 }), cont));
	}

	Operation FILE_sdda::clause_exit_modes_list_6_3(Prolog* m)
	{
	// clause_exit_modes_list(A,B,C,[D|E],F,[G|H]):-dup(F,G),clause_exit_mode(A,B,[[D,F]|C],D,G),clause_exit_modes_list(A,B,C,E,F,H)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// clause_exit_modes_list(A,B,C,[D|E],F,[G|H]):-[dup(F,G),clause_exit_mode(A,B,[[D,F]|C],D,G),clause_exit_modes_list(A,B,C,E,F,H)]
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a7 = argz[0];
			a8 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a4->bind(CONS(a7, a8), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a9 = argz[0];
			a10 = argz[1];
		} else if(a6->isVar())
		{
			a9 = V(m);
			a10 = V(m);
			 a6->bind(CONS(a9, a10), m->trail);
		} else
		{
			return m->fail();
		}
		a11 = CONS(a5, Prolog::Nil);
		a12 = CONS(a7, a11);
		a13 = CONS(a12, a3);
		return Op([&] (e)
		{
		PRED_dup_2_static_exec(e);
		}, VA({ a5, a9 }), Op([&] (e)
		{
		PRED_clause_exit_mode_5_static_exec(e);
	}, VA({ a1, a2, a13, a7, a9 }), Op([&] (e)
	{
		PRED_clause_exit_modes_list_6_static_exec(e);
	}, VA({ a1, a2, a3, a8, a5, a10 }), cont)));
	}

	Operation FILE_sdda::clause_exit_modes_list_6_4(Prolog* m)
	{
	// clause_exit_modes_list(A,B,C,[D|E],F,G):-clause_exit_modes_list(A,B,C,E,F,G)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
	// clause_exit_modes_list(A,B,C,[D|E],F,G):-[clause_exit_modes_list(A,B,C,E,F,G)]
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a7 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			 a4->bind(CONS(V(m), a7), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a2;
		m->AREGS[2] = a3;
		m->AREGS[3] = a7;
		m->AREGS[4] = a5;
		m->AREGS[5] = a6;
		m->cont = cont;
		return clause_exit_modes_list_6_top(m);
	}

	Operation FILE_sdda::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_sdda::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_1(m);
	}

	Operation FILE_sdda::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_2(m);
	}

	Operation FILE_sdda::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_1(Prolog* m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-A=(B:-C)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-['$unify'(A,(B:-C))]
	// put_str_args([a(2),a(3)],y(1)),put_str(@('FUNCTOR_$003A$002D_2'),y(1),a(4))
		a4 = S(FUNCTOR_$003A$002D_2, { a2, a3 });
		 ;
		//START inline expansion of $unify(a(1),a(4))
		if(!a1->unify(a4, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_2(Prolog* m)
	{
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-A=B,C=true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-['$unify'(A,B),'$unify'(C,true)]
		//START inline expansion of $unify(a(1),a(2))
		if(!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(3),@(Prolog.True))
		if(!a3->unify(Prolog::True, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::PRED_clause_exit_mode_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// clause_exit_mode(A,B,C,D,E):-'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(D,F,G),F=..[H|I],unify(I,E),body_exit_mode(A,B,C,G)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation p1, p2, p3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		a5 = LARG[4];
	// clause_exit_mode(A,B,C,D,E):-['$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(D,F,G),'$univ'(F,[H|I]),unify(I,E),body_exit_mode(A,B,C,G)]
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = CONS(V(m), a8);
		return Op([&] (e)
		{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec(e);
		}, VA({ a4, a6, a7 }), Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
	}, VA({ a6, a9 }), Op([&] (e)
	{
		PRED_unify_2_static_exec(e);
	}, VA({ a8, a5 }), Op([&] (e)
	{
		PRED_body_exit_mode_4_static_exec(e);
	}, VA({ a1, a2, a3, a7 }), cont))));
	}

SymbolTerm* const  FILE_sdda::FUNCTOR_$002C_2 = F(",",2);

	Operation FILE_sdda::PRED_body_exit_mode_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return body_exit_mode_4_top(m);
	}

	Operation FILE_sdda::body_exit_mode_4_top(Prolog* m)
	{
		m->setB0();
		m->jtry4(nullptr, FILE_sdda::body_exit_mode_4_sub_1);
		return body_exit_mode_4_1(m);
	}

	Operation FILE_sdda::body_exit_mode_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return body_exit_mode_4_2(m);
	}

	Operation FILE_sdda::body_exit_mode_4_1(Prolog* m)
	{
	// body_exit_mode(A,B,C,(D,E)):-body_exit_mode(A,B,C,D),body_exit_mode(A,B,C,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// body_exit_mode(A,B,C,(D,E)):-[body_exit_mode(A,B,C,D),body_exit_mode(A,B,C,E)]
		a4 = a4->dref();
			a5 = V(m);
			a6 = V(m);
			if(!a4->unify(C(FUNCTOR_$002C_2, { a5, a6 }), m->trail))
			{
				return m->fail();
			}
		p1 = Op([&] (e)
		{
		PRED_body_exit_mode_4_static_exec(e);
		}, VA({ a1, a2, a3, a6 }), cont);
		m->AREGS[0] = a1;
		m->AREGS[1] = a2;
		m->AREGS[2] = a3;
		m->AREGS[3] = a5;
		m->cont = p1;
		return body_exit_mode_4_top(m);
	}

	Operation FILE_sdda::body_exit_mode_4_2(Prolog* m)
	{
	// body_exit_mode(A,B,C,D):-functor(D,E,F),D=..[E|G],proc_exit_mode(A,B,C,E/F,G,H),unify(G,H)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// body_exit_mode(A,B,C,D):-[functor(D,E,F),'$univ'(D,[E|G]),proc_exit_mode(A,B,C,E/F,G,H),unify(G,H)]
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = CONS(a5, a7);
	// put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(9))
		a9 = S(FUNCTOR_$002F_2, { a5, a6 });
		 ;
		a10 = V(m);
		return Op([&] (e)
		{
		PRED_functor_3_static_exec(e);
		}, VA({ a4, a5, a6 }), Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
	}, VA({ a4, a8 }), Op([&] (e)
	{
		PRED_proc_exit_mode_6_static_exec(e);
	}, VA({ a1, a2, a3, a9, a7, a10 }), Op([&] (e)
	{
		PRED_unify_2_static_exec(e);
	}, VA({ a7, a10 }), cont))));
	}

SymbolTerm* const  FILE_sdda::ATOM_g = SYM("g");

	Operation FILE_sdda::PRED_unify_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return unify_2_top(m);
	}

	Operation FILE_sdda::unify_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::unify_2_var, FILE_sdda::unify_2_int, FILE_sdda::unify_2_int, FILE_sdda::unify_2_con, FILE_sdda::unify_2_int, FILE_sdda::unify_2_lis);
	}

	Operation FILE_sdda::unify_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_sdda::unify_2_var_1);
		return unify_2_1(m);
	}

	Operation FILE_sdda::unify_2_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_var_2);
		return unify_2_2(m);
	}

	Operation FILE_sdda::unify_2_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_var_3);
		return unify_2_3(m);
	}

	Operation FILE_sdda::unify_2_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_var_4);
		return unify_2_4(m);
	}

	Operation FILE_sdda::unify_2_var_4(Prolog* m)
	{
		m->trust(nullptr);
		return unify_2_5(m);
	}

	Operation FILE_sdda::unify_2_int(Prolog* m)
	{
		m->jtry2(nullptr, FILE_sdda::unify_2_int_1);
		return unify_2_1(m);
	}

	Operation FILE_sdda::unify_2_int_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_int_2);
		return unify_2_2(m);
	}

	Operation FILE_sdda::unify_2_int_2(Prolog* m)
	{
		m->trust(nullptr);
		return unify_2_5(m);
	}

	Operation FILE_sdda::unify_2_con(Prolog* m)
	{
		m->jtry2(nullptr, FILE_sdda::unify_2_con_1);
		return unify_2_1(m);
	}

	Operation FILE_sdda::unify_2_con_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_con_2);
		return unify_2_2(m);
	}

	Operation FILE_sdda::unify_2_con_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_con_3);
		return unify_2_3(m);
	}

	Operation FILE_sdda::unify_2_con_3(Prolog* m)
	{
		m->trust(nullptr);
		return unify_2_5(m);
	}

	Operation FILE_sdda::unify_2_lis(Prolog* m)
	{
		m->jtry2(nullptr, FILE_sdda::unify_2_lis_1);
		return unify_2_1(m);
	}

	Operation FILE_sdda::unify_2_lis_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_lis_2);
		return unify_2_2(m);
	}

	Operation FILE_sdda::unify_2_lis_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::unify_2_lis_3);
		return unify_2_4(m);
	}

	Operation FILE_sdda::unify_2_lis_3(Prolog* m)
	{
		m->trust(nullptr);
		return unify_2_5(m);
	}

	Operation FILE_sdda::unify_2_1(Prolog* m)
	{
	// unify(A,A):-!
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// unify(A,A):-['$neck_cut']
		if(!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::unify_2_2(Prolog* m)
	{
	// unify(A,g):-atomic(A),!,'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// unify(A,g):-['$get_level'(B),atomic(A),'$cut'(B),'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)]
		if(!ATOM_g->unify(a2, m->trail))
		{
			return m->fail();
		}
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(1))
		a1 = a1->dref();
		if(!a1->isAtomicValue())
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(e);
		}, VA({ a1 }), cont);
	}

	Operation FILE_sdda::unify_2_3(Prolog* m)
	{
	// unify(g,A):-atomic(A),!,'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// unify(g,A):-['$get_level'(B),atomic(A),'$cut'(B),'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)]
		if(!ATOM_g->unify(a1, m->trail))
		{
			return m->fail();
		}
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(2))
		a2 = a2->dref();
		if(!a2->isAtomicValue())
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
				  m->cut(a3->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(e);
		}, VA({ a2 }), cont);
	}

	Operation FILE_sdda::unify_2_4(Prolog* m)
	{
	// unify([A|B],[C|D]):-!,unify(A,C),unify(B,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// unify([A|B],[C|D]):-['$neck_cut',unify(A,C),unify(B,D)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a3 = argz[0];
			a4 = argz[1];
		} else if(a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a5 = argz[0];
			a6 = argz[1];
		} else if(a2->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			 a2->bind(CONS(a5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_unify_2_static_exec(e);
		}, VA({ a4, a6 }), cont);
		m->AREGS[0] = a3;
		m->AREGS[1] = a5;
		m->cont = p1;
		return unify_2_top(m);
	}

	Operation FILE_sdda::unify_2_5(Prolog* m)
	{
	// unify(A,B):-A=..[C|D],B=..[C|E],unify(D,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// unify(A,B):-['$univ'(A,[C|D]),'$univ'(B,[C|E]),unify(D,E)]
		a3 = V(m);
		a4 = V(m);
		a5 = CONS(a3, a4);
		a6 = V(m);
		a7 = CONS(a3, a6);
		return Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
		}, VA({ a1, a5 }), Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
	}, VA({ a2, a7 }), Op([&] (e)
	{
		PRED_unify_2_static_exec(e);
	}, VA({ a4, a6 }), cont)));
	}

	Operation FILE_sdda::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_sdda::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(m);
	}

	Operation FILE_sdda::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(m);
	}

	Operation FILE_sdda::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-A=[],!,fail
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-['$get_level'(B),'$unify'(A,[]),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(1),@(Prolog.Nil))
		if(!a1->unify(Prolog::Nil, m->trail))
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

	Operation FILE_sdda::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m)
	{
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-[]
		return cont;
	}

	Operation FILE_sdda::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_sdda::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(m);
	}

	Operation FILE_sdda::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(m);
	}

	Operation FILE_sdda::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m)
	{
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-A=[],!,fail
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-['$get_level'(B),'$unify'(A,[]),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(1),@(Prolog.Nil))
		if(!a1->unify(Prolog::Nil, m->trail))
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

	Operation FILE_sdda::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m)
	{
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-[]
		return cont;
	}

	Operation FILE_sdda::PRED_equiv_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// equiv(A,B):-equiv(A,B,C)
		m->setB0();
		 Term* a1,* a2;
		a1 = LARG[0];
		a2 = LARG[1];
	// equiv(A,B):-[equiv(A,B,C)]
		return Op([&] (e)
		{
		PRED_equiv_3_static_exec(e);
		}, VA({ a1, a2, V(m) }), cont);
	}

	Operation FILE_sdda::PRED_equiv_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return equiv_3_top(m);
	}

	Operation FILE_sdda::equiv_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::equiv_3_var, FILE_sdda::equiv_3_int, FILE_sdda::equiv_3_int, FILE_sdda::equiv_3_con, FILE_sdda::equiv_3_int, FILE_sdda::equiv_3_lis);
	}

	Operation FILE_sdda::equiv_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::equiv_3_var_1);
		return equiv_3_1(m);
	}

	Operation FILE_sdda::equiv_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_var_2);
		return equiv_3_2(m);
	}

	Operation FILE_sdda::equiv_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_var_3);
		return equiv_3_3(m);
	}

	Operation FILE_sdda::equiv_3_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_var_4);
		return equiv_3_4(m);
	}

	Operation FILE_sdda::equiv_3_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_var_5);
		return equiv_3_5(m);
	}

	Operation FILE_sdda::equiv_3_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_var_6);
		return equiv_3_6(m);
	}

	Operation FILE_sdda::equiv_3_var_6(Prolog* m)
	{
		m->trust(nullptr);
		return equiv_3_7(m);
	}

	Operation FILE_sdda::equiv_3_int(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::equiv_3_int_1);
		return equiv_3_1(m);
	}

	Operation FILE_sdda::equiv_3_int_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_int_2);
		return equiv_3_3(m);
	}

	Operation FILE_sdda::equiv_3_int_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_int_3);
		return equiv_3_4(m);
	}

	Operation FILE_sdda::equiv_3_int_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_int_4);
		return equiv_3_5(m);
	}

	Operation FILE_sdda::equiv_3_int_4(Prolog* m)
	{
		m->trust(nullptr);
		return equiv_3_7(m);
	}

	Operation FILE_sdda::equiv_3_con(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::equiv_3_con_1);
		return equiv_3_1(m);
	}

	Operation FILE_sdda::equiv_3_con_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_con_2);
		return equiv_3_2(m);
	}

	Operation FILE_sdda::equiv_3_con_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_con_3);
		return equiv_3_3(m);
	}

	Operation FILE_sdda::equiv_3_con_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_con_4);
		return equiv_3_4(m);
	}

	Operation FILE_sdda::equiv_3_con_4(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_con_5);
		return equiv_3_5(m);
	}

	Operation FILE_sdda::equiv_3_con_5(Prolog* m)
	{
		m->trust(nullptr);
		return equiv_3_7(m);
	}

	Operation FILE_sdda::equiv_3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::equiv_3_lis_1);
		return equiv_3_1(m);
	}

	Operation FILE_sdda::equiv_3_lis_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_lis_2);
		return equiv_3_3(m);
	}

	Operation FILE_sdda::equiv_3_lis_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_lis_3);
		return equiv_3_4(m);
	}

	Operation FILE_sdda::equiv_3_lis_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_lis_4);
		return equiv_3_5(m);
	}

	Operation FILE_sdda::equiv_3_lis_4(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_3_lis_5);
		return equiv_3_6(m);
	}

	Operation FILE_sdda::equiv_3_lis_5(Prolog* m)
	{
		m->trust(nullptr);
		return equiv_3_7(m);
	}

	Operation FILE_sdda::equiv_3_1(Prolog* m)
	{
	// equiv(A,B,C):-A==B,!
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv(A,B,C):-['$get_level'(D),'$equality_of_term'(A,B),'$cut'(D)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(2))
		a1 = a1->dref();
		a2 = a2->dref();
		if(!a1->equalsTerm(a2))
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

	Operation FILE_sdda::equiv_3_2(Prolog* m)
	{
	// equiv(g,A,B):-atomic(A),!,'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv(g,A,B):-['$get_level'(C),atomic(A),'$cut'(C),'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)]
		if(!ATOM_g->unify(a1, m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(2))
		a2 = a2->dref();
		if(!a2->isAtomicValue())
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(e);
		}, VA({ a2 }), cont);
	}

	Operation FILE_sdda::equiv_3_3(Prolog* m)
	{
	// equiv(A,g,B):-atomic(A),!,'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv(A,g,B):-['$get_level'(C),atomic(A),'$cut'(C),'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A)]
		if(!ATOM_g->unify(a2, m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(1))
		a1 = a1->dref();
		if(!a1->isAtomicValue())
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(e);
		}, VA({ a1 }), cont);
	}

	Operation FILE_sdda::equiv_3_4(Prolog* m)
	{
	// equiv(A,B,C):-var(A),!,var(B),equiv_vars(A,B,C)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv(A,B,C):-['$get_level'(D),var(A),'$cut'(D),var(B),equiv_vars(A,B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if(!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_equiv_vars_3_static_exec(e);
		}, VA({ a1, a2, a3 }), cont);
	}

	Operation FILE_sdda::equiv_3_5(Prolog* m)
	{
	// equiv(A,B,C):-var(B),!,var(A),equiv_vars(A,B,C)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv(A,B,C):-['$get_level'(D),var(B),'$cut'(D),var(A),equiv_vars(A,B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if(!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_equiv_vars_3_static_exec(e);
		}, VA({ a1, a2, a3 }), cont);
	}

	Operation FILE_sdda::equiv_3_6(Prolog* m)
	{
	// equiv([A|B],[C|D],E):-!,equiv(A,C,E),equiv(B,D,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv([A|B],[C|D],E):-['$neck_cut',equiv(A,C,E),equiv(B,D,E)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		} else
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
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_equiv_3_static_exec(e);
		}, VA({ a5, a7, a3 }), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->cont = p1;
		return equiv_3_top(m);
	}

	Operation FILE_sdda::equiv_3_7(Prolog* m)
	{
	// equiv(A,B,C):-A=..[D|E],B=..[D|F],equiv(E,F,C)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv(A,B,C):-['$univ'(A,[D|E]),'$univ'(B,[D|F]),equiv(E,F,C)]
		a4 = V(m);
		a5 = V(m);
		a6 = CONS(a4, a5);
		a7 = V(m);
		a8 = CONS(a4, a7);
		return Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
		}, VA({ a1, a6 }), Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
	}, VA({ a2, a8 }), Op([&] (e)
	{
		PRED_equiv_3_static_exec(e);
	}, VA({ a5, a7, a3 }), cont)));
	}

	Operation FILE_sdda::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_sdda::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(m);
	}

	Operation FILE_sdda::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(m);
	}

	Operation FILE_sdda::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m)
	{
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-A=[],!,fail
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-['$get_level'(B),'$unify'(A,[]),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(1),@(Prolog.Nil))
		if(!a1->unify(Prolog::Nil, m->trail))
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

	Operation FILE_sdda::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m)
	{
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-[]
		return cont;
	}

	Operation FILE_sdda::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry1(nullptr, FILE_sdda::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(m);
	}

	Operation FILE_sdda::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(m);
	}

	Operation FILE_sdda::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_1(Prolog* m)
	{
	// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-A=[],!,fail
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-['$get_level'(B),'$unify'(A,[]),'$cut'(B),fail]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(1),@(Prolog.Nil))
		if(!a1->unify(Prolog::Nil, m->trail))
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

	Operation FILE_sdda::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_2(Prolog* m)
	{
	// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A):-[]
		return cont;
	}

	Operation FILE_sdda::PRED_equiv_vars_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return equiv_vars_3_top(m);
	}

	Operation FILE_sdda::equiv_vars_3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_sdda::equiv_vars_3_sub_1);
		return equiv_vars_3_1(m);
	}

	Operation FILE_sdda::equiv_vars_3_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_vars_3_sub_2);
		return equiv_vars_3_2(m);
	}

	Operation FILE_sdda::equiv_vars_3_sub_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::equiv_vars_3_sub_3);
		return equiv_vars_3_3(m);
	}

	Operation FILE_sdda::equiv_vars_3_sub_3(Prolog* m)
	{
		m->trust(nullptr);
		return equiv_vars_3_4(m);
	}

	Operation FILE_sdda::equiv_vars_3_1(Prolog* m)
	{
	// equiv_vars(A,B,C):-var(C),!,C=[[A,B]|D]
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv_vars(A,B,C):-['$get_level'(D),var(C),'$cut'(D),'$unify'(C,[[A,B]|E])]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(3))
		a3 = a3->dref();
		if(!(a3->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		a5 = CONS(a2, Prolog::Nil);
		a6 = CONS(a1, a5);
		a7 = CONS(a6, V(m));
		//START inline expansion of $unify(a(3),a(7))
		if(!a3->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::equiv_vars_3_2(Prolog* m)
	{
	// equiv_vars(A,B,[[C,D]|E]):-A==C,!,B==D
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv_vars(A,B,[[C,D]|E]):-['$get_level'(F),'$equality_of_term'(A,C),'$cut'(F),'$equality_of_term'(B,D)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a4 = argz[0];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(a4, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a5 = argz[0];
			a6 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			 a4->bind(CONS(a5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a6->isVar())
		{
			a7 = V(m);
			 a6->bind(CONS(a7, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if(!a8->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(5))
		a1 = a1->dref();
		a5 = a5->dref();
		if(!a1->equalsTerm(a5))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8->dref();
				  m->cut(a8->intValue());
		//END inline expansion
		//START inline expansion of $equality_of_term(a(2),a(7))
		a2 = a2->dref();
		a7 = a7->dref();
		if(!a2->equalsTerm(a7))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::equiv_vars_3_3(Prolog* m)
	{
	// equiv_vars(A,B,[[C,D]|E]):-B==D,!,A==C
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv_vars(A,B,[[C,D]|E]):-['$get_level'(F),'$equality_of_term'(B,D),'$cut'(F),'$equality_of_term'(A,C)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a4 = argz[0];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(a4, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a5 = argz[0];
			a6 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			 a4->bind(CONS(a5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a6->isVar())
		{
			a7 = V(m);
			 a6->bind(CONS(a7, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if(!a8->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(2),a(7))
		a2 = a2->dref();
		a7 = a7->dref();
		if(!a2->equalsTerm(a7))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8->dref();
				  m->cut(a8->intValue());
		//END inline expansion
		//START inline expansion of $equality_of_term(a(1),a(5))
		a1 = a1->dref();
		a5 = a5->dref();
		if(!a1->equalsTerm(a5))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::equiv_vars_3_4(Prolog* m)
	{
	// equiv_vars(A,B,[C|D]):-equiv_vars(A,B,D)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// equiv_vars(A,B,[C|D]):-[equiv_vars(A,B,D)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a4 = argz[1];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(V(m), a4), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a2;
		m->AREGS[2] = a4;
		m->cont = cont;
		return equiv_vars_3_top(m);
	}

	Operation FILE_sdda::PRED_dup_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// dup(A,B):-dup(A,B,C)
		m->setB0();
		 Term* a1,* a2;
		a1 = LARG[0];
		a2 = LARG[1];
	// dup(A,B):-[dup(A,B,C)]
		return Op([&] (e)
		{
		PRED_dup_3_static_exec(e);
		}, VA({ a1, a2, V(m) }), cont);
	}

	Operation FILE_sdda::PRED_dup_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return dup_3_top(m);
	}

	Operation FILE_sdda::dup_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::dup_3_var, FILE_sdda::dup_3_int, FILE_sdda::dup_3_int, FILE_sdda::dup_3_int, FILE_sdda::dup_3_int, FILE_sdda::dup_3_var);
	}

	Operation FILE_sdda::dup_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::dup_3_var_1);
		return dup_3_1(m);
	}

	Operation FILE_sdda::dup_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::dup_3_var_2);
		return dup_3_2(m);
	}

	Operation FILE_sdda::dup_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::dup_3_var_3);
		return dup_3_3(m);
	}

	Operation FILE_sdda::dup_3_var_3(Prolog* m)
	{
		m->trust(nullptr);
		return dup_3_4(m);
	}

	Operation FILE_sdda::dup_3_int(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::dup_3_int_1);
		return dup_3_1(m);
	}

	Operation FILE_sdda::dup_3_int_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::dup_3_int_2);
		return dup_3_2(m);
	}

	Operation FILE_sdda::dup_3_int_2(Prolog* m)
	{
		m->trust(nullptr);
		return dup_3_4(m);
	}

	Operation FILE_sdda::dup_3_1(Prolog* m)
	{
	// dup(A,B,C):-var(A),!,dup_var(A,B,C)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup(A,B,C):-['$get_level'(D),var(A),'$cut'(D),dup_var(A,B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if(!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		PRED_dup_var_3_static_exec(e);
		}, VA({ a1, a2, a3 }), cont);
	}

	Operation FILE_sdda::dup_3_2(Prolog* m)
	{
	// dup(A,A,B):-atomic(A),!
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup(A,A,B):-['$get_level'(C),atomic(A),'$cut'(C)]
		if(!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atomic(a(1))
		a1 = a1->dref();
		if(!a1->isAtomicValue())
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

	Operation FILE_sdda::dup_3_3(Prolog* m)
	{
	// dup([A|B],[C|D],E):-!,dup(A,C,E),dup(B,D,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup([A|B],[C|D],E):-['$neck_cut',dup(A,C,E),dup(B,D,E)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		} else
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
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		p1 = Op([&] (e)
		{
		PRED_dup_3_static_exec(e);
		}, VA({ a5, a7, a3 }), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->cont = p1;
		return dup_3_top(m);
	}

	Operation FILE_sdda::dup_3_4(Prolog* m)
	{
	// dup(A,B,C):-A=..[D|E],dup(E,F,C),B=..[D|F]
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup(A,B,C):-['$univ'(A,[D|E]),dup(E,F,C),'$univ'(B,[D|F])]
		a4 = V(m);
		a5 = V(m);
		a6 = CONS(a4, a5);
		a7 = V(m);
		a8 = CONS(a4, a7);
		return Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
		}, VA({ a1, a6 }), Op([&] (e)
		{
		PRED_dup_3_static_exec(e);
	}, VA({ a5, a7, a3 }), Op([&] (e)
	{
		PRED_$univ_2_static_exec(e);
	}, VA({ a2, a8 }), cont)));
	}

	Operation FILE_sdda::PRED_dup_var_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return dup_var_3_top(m);
	}

	Operation FILE_sdda::dup_var_3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_sdda::dup_var_3_sub_1);
		return dup_var_3_1(m);
	}

	Operation FILE_sdda::dup_var_3_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::dup_var_3_sub_2);
		return dup_var_3_2(m);
	}

	Operation FILE_sdda::dup_var_3_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return dup_var_3_3(m);
	}

	Operation FILE_sdda::dup_var_3_1(Prolog* m)
	{
	// dup_var(A,B,C):-var(C),!,C=[[A,B]|D]
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup_var(A,B,C):-['$get_level'(D),var(C),'$cut'(D),'$unify'(C,[[A,B]|E])]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(3))
		a3 = a3->dref();
		if(!(a3->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		a5 = CONS(a2, Prolog::Nil);
		a6 = CONS(a1, a5);
		a7 = CONS(a6, V(m));
		//START inline expansion of $unify(a(3),a(7))
		if(!a3->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::dup_var_3_2(Prolog* m)
	{
	// dup_var(A,B,[[C,B]|D]):-A==C,!
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup_var(A,B,[[C,B]|D]):-['$get_level'(E),'$equality_of_term'(A,C),'$cut'(E)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a4 = argz[0];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(a4, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a5 = argz[0];
			a6 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			 a4->bind(CONS(a5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			if(!a2->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a6->isVar())
		{
			 a6->bind(CONS(a2, Prolog::Nil), m->trail);
		} else
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
		//START inline expansion of $equality_of_term(a(1),a(5))
		a1 = a1->dref();
		a5 = a5->dref();
		if(!a1->equalsTerm(a5))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7->dref();
				  m->cut(a7->intValue());
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::dup_var_3_3(Prolog* m)
	{
	// dup_var(A,B,[C|D]):-dup_var(A,B,D)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// dup_var(A,B,[C|D]):-[dup_var(A,B,D)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a4 = argz[1];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(V(m), a4), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a2;
		m->AREGS[2] = a4;
		m->cont = cont;
		return dup_var_3_top(m);
	}

StructureTerm* const  FILE_sdda::L_built_in_3_s5 = S(FUNCTOR_$002F_2, Prolog::True, int_0);
SymbolTerm* const  FILE_sdda::ATOM_fail = SYM("fail");
StructureTerm* const  FILE_sdda::L_built_in_3_s9 = S(FUNCTOR_$002F_2, ATOM_fail, int_0);
SymbolTerm* const  FILE_sdda::ATOM_$003D = SYM("=");
StructureTerm* const  FILE_sdda::L_built_in_3_s13 = S(FUNCTOR_$002F_2, ATOM_$003D, int_2);
ListTerm* const  FILE_sdda::L_built_in_3_s15 = CONS(ATOM_g, Prolog::Nil);
ListTerm* const  FILE_sdda::L_built_in_3_s16 = CONS(ATOM_g, L_built_in_3_s15);
SymbolTerm* const  FILE_sdda::ATOM_$002B = SYM("+");
StructureTerm* const  FILE_sdda::L_built_in_3_s19 = S(FUNCTOR_$002F_2, ATOM_$002B, int_2);
SymbolTerm* const  FILE_sdda::ATOM_$002D = SYM("-");
StructureTerm* const  FILE_sdda::L_built_in_3_s22 = S(FUNCTOR_$002F_2, ATOM_$002D, int_2);
SymbolTerm* const  FILE_sdda::ATOM_$002A = SYM("*");
StructureTerm* const  FILE_sdda::L_built_in_3_s25 = S(FUNCTOR_$002F_2, ATOM_$002A, int_2);
SymbolTerm* const  FILE_sdda::ATOM_$002F = SYM("/");
StructureTerm* const  FILE_sdda::L_built_in_3_s28 = S(FUNCTOR_$002F_2, ATOM_$002F, int_2);
SymbolTerm* const  FILE_sdda::ATOM_$003E$003D = SYM(">=");
StructureTerm* const  FILE_sdda::L_built_in_3_s31 = S(FUNCTOR_$002F_2, ATOM_$003E$003D, int_2);
SymbolTerm* const  FILE_sdda::ATOM_$003C = SYM("<");
StructureTerm* const  FILE_sdda::L_built_in_3_s34 = S(FUNCTOR_$002F_2, ATOM_$003C, int_2);
SymbolTerm* const  FILE_sdda::ATOM_is = SYM("is");
StructureTerm* const  FILE_sdda::L_built_in_3_s37 = S(FUNCTOR_$002F_2, ATOM_is, int_2);

	Operation FILE_sdda::PRED_built_in_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_sdda::built_in_3_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, FILE_sdda::built_in_3_var, Failure::fail_0);
	}

	Operation FILE_sdda::built_in_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::built_in_3_var_1);
		return built_in_3_1(m);
	}

	Operation FILE_sdda::built_in_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_2);
		return built_in_3_2(m);
	}

	Operation FILE_sdda::built_in_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_3);
		return built_in_3_3(m);
	}

	Operation FILE_sdda::built_in_3_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_4);
		return built_in_3_4(m);
	}

	Operation FILE_sdda::built_in_3_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_5);
		return built_in_3_5(m);
	}

	Operation FILE_sdda::built_in_3_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_6);
		return built_in_3_6(m);
	}

	Operation FILE_sdda::built_in_3_var_6(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_7);
		return built_in_3_7(m);
	}

	Operation FILE_sdda::built_in_3_var_7(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_8);
		return built_in_3_8(m);
	}

	Operation FILE_sdda::built_in_3_var_8(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_9);
		return built_in_3_9(m);
	}

	Operation FILE_sdda::built_in_3_var_9(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_10);
		return built_in_3_10(m);
	}

	Operation FILE_sdda::built_in_3_var_10(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::built_in_3_var_11);
		return built_in_3_11(m);
	}

	Operation FILE_sdda::built_in_3_var_11(Prolog* m)
	{
		m->trust(nullptr);
		return built_in_3_12(m);
	}

	Operation FILE_sdda::built_in_3_1(Prolog* m)
	{
	// built_in(true/0,[],[]):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in(true/0,[],[]):-[]
		if(!L_built_in_3_s5->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_2(Prolog* m)
	{
	// built_in(fail/0,[],[]):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in(fail/0,[],[]):-[]
		if(!L_built_in_3_s9->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_3(Prolog* m)
	{
	// built_in((=)/2,[A,B],[g,g]):-atomic(A)
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((=)/2,[A,B],[g,g]):-[atomic(A)]
		if(!L_built_in_3_s13->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			 a5->bind(CONS(V(m), Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		if(!L_built_in_3_s16->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of atomic(a(4))
		a4 = a4->dref();
		if(!a4->isAtomicValue())
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::built_in_3_4(Prolog* m)
	{
	// built_in((=)/2,[A,B],[g,g]):-atomic(B)
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((=)/2,[A,B],[g,g]):-[atomic(B)]
		if(!L_built_in_3_s13->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			 a2->bind(CONS(V(m), a4), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a5 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			a5 = V(m);
			 a4->bind(CONS(a5, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		if(!L_built_in_3_s16->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of atomic(a(5))
		a5 = a5->dref();
		if(!a5->isAtomicValue())
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::built_in_3_5(Prolog* m)
	{
	// built_in((=)/2,[A,B],[A,A]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((=)/2,[A,B],[A,A]):-[]
		if(!L_built_in_3_s13->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			 a5->bind(CONS(V(m), Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a6 = argz[1];
		} else if(a3->isVar())
		{
			a6 = V(m);
			 a3->bind(CONS(a4, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a6->isVar())
		{
			 a6->bind(CONS(a4, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_6(Prolog* m)
	{
	// built_in((+)/2,[A,B],[A,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((+)/2,[A,B],[A,B]):-[]
		if(!L_built_in_3_s19->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			a6 = V(m);
			 a5->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a4, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a7->isVar())
		{
			 a7->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_7(Prolog* m)
	{
	// built_in((-)/2,[A,B],[A,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((-)/2,[A,B],[A,B]):-[]
		if(!L_built_in_3_s22->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			a6 = V(m);
			 a5->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a4, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a7->isVar())
		{
			 a7->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_8(Prolog* m)
	{
	// built_in((*)/2,[A,B],[A,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((*)/2,[A,B],[A,B]):-[]
		if(!L_built_in_3_s25->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			a6 = V(m);
			 a5->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a4, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a7->isVar())
		{
			 a7->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_9(Prolog* m)
	{
	// built_in((/)/2,[A,B],[A,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((/)/2,[A,B],[A,B]):-[]
		if(!L_built_in_3_s28->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			a6 = V(m);
			 a5->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a4, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a7->isVar())
		{
			 a7->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_10(Prolog* m)
	{
	// built_in((>=)/2,[A,B],[A,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((>=)/2,[A,B],[A,B]):-[]
		if(!L_built_in_3_s31->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			a6 = V(m);
			 a5->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a4, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a7->isVar())
		{
			 a7->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_11(Prolog* m)
	{
	// built_in((<)/2,[A,B],[A,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((<)/2,[A,B],[A,B]):-[]
		if(!L_built_in_3_s34->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a2->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			a6 = V(m);
			 a5->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a4, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a7->isVar())
		{
			 a7->bind(CONS(a6, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::built_in_3_12(Prolog* m)
	{
	// built_in((is)/2,[A,B],[g,B]):-true
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// built_in((is)/2,[A,B],[g,B]):-[]
		if(!L_built_in_3_s37->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			 a2->bind(CONS(V(m), a4), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a5 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			a5 = V(m);
			 a4->bind(CONS(a5, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!ATOM_g->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a6 = argz[1];
		} else if(a3->isVar())
		{
			a6 = V(m);
			 a3->bind(CONS(ATOM_g, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			if(!a5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a6->isVar())
		{
			 a6->bind(CONS(a5, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::PRED_worst_case_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_sdda::worst_case_2_var, Failure::fail_0, Failure::fail_0, FILE_sdda::worst_case_2_1, Failure::fail_0, FILE_sdda::worst_case_2_2);
	}

	Operation FILE_sdda::worst_case_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_sdda::worst_case_2_var_1);
		return worst_case_2_1(m);
	}

	Operation FILE_sdda::worst_case_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return worst_case_2_2(m);
	}

	Operation FILE_sdda::worst_case_2_1(Prolog* m)
	{
	// worst_case([],A):-true
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// worst_case([],A):-[]
		if(!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::worst_case_2_2(Prolog* m)
	{
	// worst_case([A|B],C):-unify(A,C),worst_case(B,C)
		 Term* a1,* a2,* a3,* a4;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// worst_case([A|B],C):-[unify(A,C),worst_case(B,C)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a3 = argz[0];
			a4 = argz[1];
		} else if(a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		} else
		{
			return m->fail();
		}
		return Op([&] (e)
		{
		PRED_unify_2_static_exec(e);
		}, VA({ a3, a2 }), Op([&] (e)
		{
		PRED_worst_case_2_static_exec(e);
	}, VA({ a4, a2 }), cont));
	}

	Operation FILE_sdda::PRED_look_up_act_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return look_up_act_2_top(m);
	}

	Operation FILE_sdda::look_up_act_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::look_up_act_2_var, FILE_sdda::look_up_act_2_1, FILE_sdda::look_up_act_2_1, FILE_sdda::look_up_act_2_1, FILE_sdda::look_up_act_2_1, FILE_sdda::look_up_act_2_var);
	}

	Operation FILE_sdda::look_up_act_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_sdda::look_up_act_2_var_1);
		return look_up_act_2_1(m);
	}

	Operation FILE_sdda::look_up_act_2_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::look_up_act_2_var_2);
		return look_up_act_2_2(m);
	}

	Operation FILE_sdda::look_up_act_2_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return look_up_act_2_3(m);
	}

	Operation FILE_sdda::look_up_act_2_1(Prolog* m)
	{
	// look_up_act(A,B):-var(B),!,fail
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// look_up_act(A,B):-['$get_level'(C),var(B),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
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

	Operation FILE_sdda::look_up_act_2_2(Prolog* m)
	{
	// look_up_act([A/B,C,D],[[A/B,E,D]|F]):-equiv(C,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13,* a14;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// look_up_act([A/B,C,D],[[A/B,E,D]|F]):-[equiv(C,E)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a3 = argz[0];
			a4 = argz[1];
		} else if(a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
			a5 = V(m);
			a6 = V(m);
			if(!a3->unify(C(FUNCTOR_$002F_2, { a5, a6 }), m->trail))
			{
				return m->fail();
			}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a7 = argz[0];
			a8 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a4->bind(CONS(a7, a8), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = a8->dref();
		if(a8->isCons())
		{
			std::vector<Term*> argz = VA({ a8->car(), a8->cdr() });
			a9 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a8->isVar())
		{
			a9 = V(m);
			 a8->bind(CONS(a9, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a10 = argz[0];
		} else if(a2->isVar())
		{
			a10 = V(m);
			 a2->bind(CONS(a10, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		a10 = a10->dref();
		if(a10->isCons())
		{
			std::vector<Term*> argz = VA({ a10->car(), a10->cdr() });
			a11 = argz[0];
			a12 = argz[1];
		} else if(a10->isVar())
		{
			a11 = V(m);
			a12 = V(m);
			 a10->bind(CONS(a11, a12), m->trail);
		} else
		{
			return m->fail();
		}
		a11 = a11->dref();
			if(!a11->unify(C(FUNCTOR_$002F_2, { a5, a6 }), m->trail))
			{
				return m->fail();
			}
		a12 = a12->dref();
		if(a12->isCons())
		{
			std::vector<Term*> argz = VA({ a12->car(), a12->cdr() });
			a13 = argz[0];
			a14 = argz[1];
		} else if(a12->isVar())
		{
			a13 = V(m);
			a14 = V(m);
			 a12->bind(CONS(a13, a14), m->trail);
		} else
		{
			return m->fail();
		}
		a14 = a14->dref();
		if(a14->isCons())
		{
			std::vector<Term*> argz = VA({ a14->car(), a14->cdr() });
			if(!a9->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a14->isVar())
		{
			 a14->bind(CONS(a9, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		return Op([&] (e)
		{
		PRED_equiv_2_static_exec(e);
		}, VA({ a7, a13 }), cont);
	}

	Operation FILE_sdda::look_up_act_2_3(Prolog* m)
	{
	// look_up_act([A/B,C,D],[E|F]):-look_up_act([A/B,C,D],F)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13,* a14;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// look_up_act([A/B,C,D],[E|F]):-[look_up_act([A/B,C,D],F)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a3 = argz[0];
			a4 = argz[1];
		} else if(a1->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a1->bind(CONS(a3, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
			a5 = V(m);
			a6 = V(m);
			if(!a3->unify(C(FUNCTOR_$002F_2, { a5, a6 }), m->trail))
			{
				return m->fail();
			}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			a7 = argz[0];
			a8 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			a8 = V(m);
			 a4->bind(CONS(a7, a8), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = a8->dref();
		if(a8->isCons())
		{
			std::vector<Term*> argz = VA({ a8->car(), a8->cdr() });
			a9 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a8->isVar())
		{
			a9 = V(m);
			 a8->bind(CONS(a9, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a10 = argz[1];
		} else if(a2->isVar())
		{
			a10 = V(m);
			 a2->bind(CONS(V(m), a10), m->trail);
		} else
		{
			return m->fail();
		}
	// put_str_args([a(5),a(6)],y(1)),put_str(@('FUNCTOR_$002F_2'),y(1),a(11))
		a11 = S(FUNCTOR_$002F_2, { a5, a6 });
		 ;
		a12 = CONS(a9, Prolog::Nil);
		a13 = CONS(a7, a12);
		a14 = CONS(a11, a13);
		m->AREGS[0] = a14;
		m->AREGS[1] = a10;
		m->cont = cont;
		return look_up_act_2_top(m);
	}

	Operation FILE_sdda::PRED_all_shared_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// all_shared(A,B):-unify(A,C,D),bind_all(E,D),unify(A,B,D)
		m->setB0();
		 Term* a1,* a2,* a3;
		Operation p1, p2;
		a1 = LARG[0];
		a2 = LARG[1];
	// all_shared(A,B):-[unify(A,C,D),bind_all(E,D),unify(A,B,D)]
		a3 = V(m);
		return Op([&] (e)
		{
		sxxtensions::PRED_unify_3_static_exec(e);
		}, VA({ a1, V(m), a3 }), Op([&] (e)
		{
		PRED_bind_all_2_static_exec(e);
	}, VA({ V(m), a3 }), Op([&] (e)
	{
		sxxtensions::PRED_unify_3_static_exec(e);
	}, VA({ a1, a2, a3 }), cont)));
	}

	Operation FILE_sdda::PRED_bind_all_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return bind_all_2_top(m);
	}

	Operation FILE_sdda::bind_all_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::bind_all_2_sub_1);
		return bind_all_2_1(m);
	}

	Operation FILE_sdda::bind_all_2_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::bind_all_2_sub_2);
		return bind_all_2_2(m);
	}

	Operation FILE_sdda::bind_all_2_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return bind_all_2_3(m);
	}

	Operation FILE_sdda::bind_all_2_1(Prolog* m)
	{
	// bind_all(A,B):-var(B)
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// bind_all(A,B):-[var(B)]
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::bind_all_2_2(Prolog* m)
	{
	// bind_all(A,[[B,A]|C]):-var(A),bind_all(A,C)
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// bind_all(A,[[B,A]|C]):-[var(A),bind_all(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[0];
			a4 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a2->bind(CONS(a3, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a5 = argz[1];
		} else if(a3->isVar())
		{
			a5 = V(m);
			 a3->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			 a5->bind(CONS(a1, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if(!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a1;
		m->AREGS[1] = a4;
		m->cont = cont;
		return bind_all_2_top(m);
	}

	Operation FILE_sdda::bind_all_2_3(Prolog* m)
	{
	// bind_all(A,[[B,C]|D]):-bind_all(A,D)
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// bind_all(A,[[B,C]|D]):-[bind_all(A,D)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[0];
			a4 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			a4 = V(m);
			 a2->bind(CONS(a3, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a5 = argz[1];
		} else if(a3->isVar())
		{
			a5 = V(m);
			 a3->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a5->isVar())
		{
			 a5->bind(CONS(V(m), Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a4;
		m->cont = cont;
		return bind_all_2_top(m);
	}

	Operation FILE_sdda::PRED_add_to_list_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return add_to_list_2_top(m);
	}

	Operation FILE_sdda::add_to_list_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::add_to_list_2_sub_1);
		return add_to_list_2_1(m);
	}

	Operation FILE_sdda::add_to_list_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return add_to_list_2_2(m);
	}

	Operation FILE_sdda::add_to_list_2_1(Prolog* m)
	{
	// add_to_list(A,B):-var(B),B=[A|C]
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// add_to_list(A,B):-[var(B),'$unify'(B,[A|C])]
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		a3 = CONS(a1, V(m));
		//START inline expansion of $unify(a(2),a(3))
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::add_to_list_2_2(Prolog* m)
	{
	// add_to_list(A,[B|C]):-add_to_list(A,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// add_to_list(A,[B|C]):-[add_to_list(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return add_to_list_2_top(m);
	}

	Operation FILE_sdda::PRED_umember_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return umember_2_top(m);
	}

	Operation FILE_sdda::umember_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::umember_2_sub_1);
		return umember_2_1(m);
	}

	Operation FILE_sdda::umember_2_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::umember_2_sub_2);
		return umember_2_2(m);
	}

	Operation FILE_sdda::umember_2_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return umember_2_3(m);
	}

	Operation FILE_sdda::umember_2_1(Prolog* m)
	{
	// umember(A,B):-var(B),!,fail
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// umember(A,B):-['$get_level'(C),var(B),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
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

	Operation FILE_sdda::umember_2_2(Prolog* m)
	{
	// umember(A,[A|B]):-true
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// umember(A,[A|B]):-[]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
		} else if(a2->isVar())
		{
			 a2->bind(CONS(a1, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::umember_2_3(Prolog* m)
	{
	// umember(A,[B|C]):-umember(A,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// umember(A,[B|C]):-[umember(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return umember_2_top(m);
	}

	Operation FILE_sdda::PRED_sumember_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return sumember_2_top(m);
	}

	Operation FILE_sdda::sumember_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::sumember_2_sub_1);
		return sumember_2_1(m);
	}

	Operation FILE_sdda::sumember_2_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::sumember_2_sub_2);
		return sumember_2_2(m);
	}

	Operation FILE_sdda::sumember_2_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return sumember_2_3(m);
	}

	Operation FILE_sdda::sumember_2_1(Prolog* m)
	{
	// sumember(A,B):-var(B),!,fail
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// sumember(A,B):-['$get_level'(C),var(B),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(2))
		a2 = a2->dref();
		if(!(a2->isVariable()))
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

	Operation FILE_sdda::sumember_2_2(Prolog* m)
	{
	// sumember(A,[B|C]):-A==B
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// sumember(A,[B|C]):-['$equality_of_term'(A,B)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[0];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(a3, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of $equality_of_term(a(1),a(3))
		a1 = a1->dref();
		a3 = a3->dref();
		if(!a1->equalsTerm(a3))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::sumember_2_3(Prolog* m)
	{
	// sumember(A,[B|C]):-sumember(A,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// sumember(A,[B|C]):-[sumember(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return sumember_2_top(m);
	}

	Operation FILE_sdda::PRED_member_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return member_2_top(m);
	}

	Operation FILE_sdda::member_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::member_2_sub_1);
		return member_2_1(m);
	}

	Operation FILE_sdda::member_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return member_2_2(m);
	}

	Operation FILE_sdda::member_2_1(Prolog* m)
	{
	// member(A,[A|B]):-true
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// member(A,[A|B]):-[]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
		} else if(a2->isVar())
		{
			 a2->bind(CONS(a1, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::member_2_2(Prolog* m)
	{
	// member(A,[B|C]):-member(A,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// member(A,[B|C]):-[member(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return member_2_top(m);
	}

	Operation FILE_sdda::PRED_smember_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return smember_2_top(m);
	}

	Operation FILE_sdda::smember_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::smember_2_sub_1);
		return smember_2_1(m);
	}

	Operation FILE_sdda::smember_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return smember_2_2(m);
	}

	Operation FILE_sdda::smember_2_1(Prolog* m)
	{
	// smember(A,[B|C]):-A==B
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// smember(A,[B|C]):-['$equality_of_term'(A,B)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[0];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(a3, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of $equality_of_term(a(1),a(3))
		a1 = a1->dref();
		a3 = a3->dref();
		if(!a1->equalsTerm(a3))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::smember_2_2(Prolog* m)
	{
	// smember(A,[B|C]):-smember(A,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// smember(A,[B|C]):-[smember(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return smember_2_top(m);
	}

	Operation FILE_sdda::PRED_eqmember_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return eqmember_2_top(m);
	}

	Operation FILE_sdda::eqmember_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_sdda::eqmember_2_sub_1);
		return eqmember_2_1(m);
	}

	Operation FILE_sdda::eqmember_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return eqmember_2_2(m);
	}

	Operation FILE_sdda::eqmember_2_1(Prolog* m)
	{
	// eqmember(A,[B|C]):-equiv(A,B)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// eqmember(A,[B|C]):-[equiv(A,B)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[0];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(a3, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		return Op([&] (e)
		{
		PRED_equiv_2_static_exec(e);
		}, VA({ a1, a3 }), cont);
	}

	Operation FILE_sdda::eqmember_2_2(Prolog* m)
	{
	// eqmember(A,[B|C]):-eqmember(A,C)
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// eqmember(A,[B|C]):-[eqmember(A,C)]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a3 = argz[1];
		} else if(a2->isVar())
		{
			a3 = V(m);
			 a2->bind(CONS(V(m), a3), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return eqmember_2_top(m);
	}

	Operation FILE_sdda::PRED_concat_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return concat_3_top(m);
	}

	Operation FILE_sdda::concat_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::concat_3_var, Failure::fail_0, Failure::fail_0, FILE_sdda::concat_3_1, Failure::fail_0, FILE_sdda::concat_3_2);
	}

	Operation FILE_sdda::concat_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::concat_3_var_1);
		return concat_3_1(m);
	}

	Operation FILE_sdda::concat_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return concat_3_2(m);
	}

	Operation FILE_sdda::concat_3_1(Prolog* m)
	{
	// concat([],A,A):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// concat([],A,A):-[]
		if(!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sdda::concat_3_2(Prolog* m)
	{
	// concat([A|B],C,[A|D]):-concat(B,C,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// concat([A|B],C,[A|D]):-[concat(B,C,D)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a4->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a6 = argz[1];
		} else if(a3->isVar())
		{
			a6 = V(m);
			 a3->bind(CONS(a4, a6), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = cont;
		return concat_3_top(m);
	}

	Operation FILE_sdda::PRED_nl_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// nl:-true
		m->setB0();
	// nl:-[]
		return cont;
	}

SymbolTerm* const  FILE_sdda::ATOM_$002C = SYM(",");
SymbolTerm* const  FILE_sdda::ATOM_$0020 = SYM(" ");

	Operation FILE_sdda::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_sdda::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_sub_1);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_1(m);
	}

	Operation FILE_sdda::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_2(m);
	}

	Operation FILE_sdda::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_1(Prolog* m)
	{
	// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-nonvar(A),!,write(','),nl,write(' '),write_list2(A,C,B)
		 Term* a1,* a2,* a3,* a4;
		Operation p1, p2, p3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-['$get_level'(D),nonvar(A),'$cut'(D),write(','),nl,write(' '),write_list2(A,C,B)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of nonvar(a(1))
		a1 = a1->dref();
		if((a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		return Op([&] (e)
		{
		FILE_builtins::PRED_write_1_static_exec(e);
		}, VA({ ATOM_$002C }), Op([&] (e)
		{
		PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (e)
	{
		FILE_builtins::PRED_write_1_static_exec(e);
	}, VA({ ATOM_$0020 }), Op([&] (e)
	{
		PRED_write_list2_3_static_exec(e);
	}, VA({ a1, a3, a2 }), cont))));
	}

	Operation FILE_sdda::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_2(Prolog* m)
	{
	// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-B=C
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(A,B,C):-['$unify'(B,C)]
		//START inline expansion of $unify(a(2),a(3))
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::PRED_write_list2_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// write_list2([A|B],C,D):-name_vars(A,C,E),write(A),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(B,D,E)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1, p2;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
	// write_list2([A|B],C,D):-[name_vars(A,C,E),write(A),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl'(B,D,E)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = V(m);
		return Op([&] (e)
		{
		PRED_name_vars_3_static_exec(e);
		}, VA({ a4, a2, a6 }), Op([&] (e)
		{
		FILE_builtins::PRED_write_1_static_exec(e);
	}, VA({ a4 }), Op([&] (e)
	{
		PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec(e);
	}, VA({ a5, a3, a6 }), cont)));
	}

SymbolTerm* const  FILE_sdda::FUNCTOR_$002B_2 = F("+",2);

	Operation FILE_sdda::PRED_name_vars_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return name_vars_3_top(m);
	}

	Operation FILE_sdda::name_vars_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::name_vars_3_var, FILE_sdda::name_vars_3_int, FILE_sdda::name_vars_3_int, FILE_sdda::name_vars_3_int, FILE_sdda::name_vars_3_int, FILE_sdda::name_vars_3_var);
	}

	Operation FILE_sdda::name_vars_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::name_vars_3_var_1);
		return name_vars_3_1(m);
	}

	Operation FILE_sdda::name_vars_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::name_vars_3_var_2);
		return name_vars_3_2(m);
	}

	Operation FILE_sdda::name_vars_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::name_vars_3_var_3);
		return name_vars_3_3(m);
	}

	Operation FILE_sdda::name_vars_3_var_3(Prolog* m)
	{
		m->trust(nullptr);
		return name_vars_3_4(m);
	}

	Operation FILE_sdda::name_vars_3_int(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::name_vars_3_int_1);
		return name_vars_3_1(m);
	}

	Operation FILE_sdda::name_vars_3_int_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sdda::name_vars_3_int_2);
		return name_vars_3_2(m);
	}

	Operation FILE_sdda::name_vars_3_int_2(Prolog* m)
	{
		m->trust(nullptr);
		return name_vars_3_4(m);
	}

	Operation FILE_sdda::name_vars_3_1(Prolog* m)
	{
	// name_vars(A,B,C):-var(A),!,make_name(B,A),C is B+1
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// name_vars(A,B,C):-['$get_level'(D),var(A),'$cut'(D),make_name(B,A),C is B+1]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of var(a(1))
		a1 = a1->dref();
		if(!(a1->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
	// put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002B_2, { a2, int_1 });
		 ;
		return Op([&] (e)
		{
		PRED_make_name_2_static_exec(e);
		}, VA({ a2, a1 }), Op(FILE_builtins::PRED_is_2_static_exec, VA({ a3, a5 }), cont));
	}

	Operation FILE_sdda::name_vars_3_2(Prolog* m)
	{
	// name_vars(A,B,B):-atom(A),!
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// name_vars(A,B,B):-['$get_level'(C),atom(A),'$cut'(C)]
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of atom(a(1))
		a1 = a1->dref();
		if(!(a1->isSymbol()))
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

	Operation FILE_sdda::name_vars_3_3(Prolog* m)
	{
	// name_vars([A|B],C,D):-!,name_vars(A,C,E),name_vars(B,E,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// name_vars([A|B],C,D):-['$neck_cut',name_vars(A,C,E),name_vars(B,E,D)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[0];
			a5 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a5 = V(m);
			 a1->bind(CONS(a4, a5), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a6 = V(m);
		p1 = Op([&] (e)
		{
		PRED_name_vars_3_static_exec(e);
		}, VA({ a5, a6, a3 }), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = p1;
		return name_vars_3_top(m);
	}

	Operation FILE_sdda::name_vars_3_4(Prolog* m)
	{
	// name_vars(A,B,C):-A=..[D|E],name_vars(E,B,C)
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// name_vars(A,B,C):-['$univ'(A,[D|E]),name_vars(E,B,C)]
		a4 = V(m);
		a5 = CONS(V(m), a4);
		return Op([&] (e)
		{
		PRED_$univ_2_static_exec(e);
		}, VA({ a1, a5 }), Op([&] (e)
		{
		PRED_name_vars_3_static_exec(e);
	}, VA({ a4, a2, a3 }), cont));
	}

SymbolTerm* const  FILE_sdda::FUNCTOR_$002F$002F_2 = F("//",2);
IntegerTerm* const  FILE_sdda::int_26 = optional<int>(26);
SymbolTerm* const  FILE_sdda::FUNCTOR_mod_2 = F("mod",2);
IntegerTerm* const  FILE_sdda::int_65 = optional<int>(65);
ListTerm* const  FILE_sdda::L_make_name_2_s7 = CONS(int_65, Prolog::Nil);

	Operation FILE_sdda::PRED_make_name_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// make_name(A,B):-C is A//26,D is A mod 26+[65],build_name(C,D,E),name(B,E)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation p1;
		a1 = LARG[0];
		a2 = LARG[1];
	// make_name(A,B):-[C is A//26,D is A mod 26+[65],build_name(C,D,E),name(B,E)]
		a3 = V(m);
	// put_str_args([a(1),@(int_26)],y(1)),put_str(@('FUNCTOR_$002F$002F_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002F$002F_2, { a1, int_26 });
		 ;
		//START inline expansion of a(3)is a(4)
		if(!a3->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
	// put_str_args([a(1),@(int_26)],y(2)),put_str(@('FUNCTOR_mod_2'),y(2),a(6))
		a6 = S(FUNCTOR_mod_2, { a1, int_26 });
		 ;
	// put_str_args([a(6),s(7)],y(3)),put_str(@('FUNCTOR_$002B_2'),y(3),a(7))
		a7 = S(FUNCTOR_$002B_2, { a6, L_make_name_2_s7 });
		 ;
		//START inline expansion of a(5)is a(7)
		if(!a5->unify(Arithmetic::evaluate(a7), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a8 = V(m);
		return Op([&] (e)
		{
		PRED_build_name_3_static_exec(e);
		}, VA({ a3, a5, a8 }), Op([&] (e)
		{
		FILE_builtins::PRED_name_2_static_exec(e);
	}, VA({ a2, a8 }), cont));
	}

SymbolTerm* const  FILE_sdda::FUNCTOR_$002D_2 = F("-",2);

	Operation FILE_sdda::PRED_build_name_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return build_name_3_top(m);
	}

	Operation FILE_sdda::build_name_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_sdda::build_name_3_var, FILE_sdda::build_name_3_var, FILE_sdda::build_name_3_2, FILE_sdda::build_name_3_2, FILE_sdda::build_name_3_2, FILE_sdda::build_name_3_2);
	}

	Operation FILE_sdda::build_name_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_sdda::build_name_3_var_1);
		return build_name_3_1(m);
	}

	Operation FILE_sdda::build_name_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return build_name_3_2(m);
	}

	Operation FILE_sdda::build_name_3_1(Prolog* m)
	{
	// build_name(0,A,[A]):-!
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// build_name(0,A,[A]):-['$neck_cut']
		if(!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a2->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a3->isVar())
		{
			 a3->bind(CONS(a2, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_sdda::build_name_3_2(Prolog* m)
	{
	// build_name(A,B,[B|C]):-A>0,D is A-1,build_name(D,B,C)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// build_name(A,B,[B|C]):-[D is 0,'$greater_than'(A,D),E is A-1,build_name(E,B,C)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a2->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a4 = argz[1];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(a2, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = V(m);
		//START inline expansion of a(5)is@(int_0)
		if(!a5->unify(Arithmetic::evaluate(int_0), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(5))
		if(Arithmetic::evaluate(a1)->arithCompareTo(Arithmetic::evaluate(a5)) <= 0)
		{
			return m->fail();
		}
		//END inline expansion
		a6 = V(m);
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(7))
		a7 = S(FUNCTOR_$002D_2, { a1, int_1 });
		 ;
		//START inline expansion of a(6)is a(7)
		if(!a6->unify(Arithmetic::evaluate(a7), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a6;
		m->AREGS[1] = a2;
		m->AREGS[2] = a4;
		m->cont = cont;
		return build_name_3_top(m);
	}

	FILE_sdda::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_sdda::StaticConstructor FILE_sdda::staticConstructor;

	void FILE_sdda::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_sdda::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("do_sdda",4,FILE_sdda::PRED_do_sdda_4_static_exec);
	   PredTable::registerBuiltin("read_procedures",3,FILE_sdda::PRED_read_procedures_3_static_exec);
	   PredTable::registerBuiltin("entry_exit_modes_list",3,FILE_sdda::PRED_entry_exit_modes_list_3_static_exec);
	   PredTable::registerBuiltin("proc_exit_mode",6,FILE_sdda::PRED_proc_exit_mode_6_static_exec);
	   PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",1,FILE_sdda::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec);
	   PredTable::registerBuiltin("clause_exit_modes_list",6,FILE_sdda::PRED_clause_exit_modes_list_6_static_exec);
	   PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",3,FILE_sdda::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec);
	   PredTable::registerBuiltin("clause_exit_mode",5,FILE_sdda::PRED_clause_exit_mode_5_static_exec);
	   PredTable::registerBuiltin("body_exit_mode",4,FILE_sdda::PRED_body_exit_mode_4_static_exec);
	   PredTable::registerBuiltin("unify",2,FILE_sdda::PRED_unify_2_static_exec);
	   PredTable::registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",1,FILE_sdda::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec);
	   PredTable::registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",1,FILE_sdda::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec);
	   PredTable::registerBuiltin("equiv",2,FILE_sdda::PRED_equiv_2_static_exec);
	   PredTable::registerBuiltin("equiv",3,FILE_sdda::PRED_equiv_3_static_exec);
	   PredTable::registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",1,FILE_sdda::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec);
	   PredTable::registerBuiltin("$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",1,FILE_sdda::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_1_static_exec);
	   PredTable::registerBuiltin("equiv_vars",3,FILE_sdda::PRED_equiv_vars_3_static_exec);
	   PredTable::registerBuiltin("dup",2,FILE_sdda::PRED_dup_2_static_exec);
	   PredTable::registerBuiltin("dup",3,FILE_sdda::PRED_dup_3_static_exec);
	   PredTable::registerBuiltin("dup_var",3,FILE_sdda::PRED_dup_var_3_static_exec);
	   PredTable::registerBuiltin("built_in",3,FILE_sdda::PRED_built_in_3_static_exec);
	   PredTable::registerBuiltin("worst_case",2,FILE_sdda::PRED_worst_case_2_static_exec);
	   PredTable::registerBuiltin("look_up_act",2,FILE_sdda::PRED_look_up_act_2_static_exec);
	   PredTable::registerBuiltin("all_shared",2,FILE_sdda::PRED_all_shared_2_static_exec);
	   PredTable::registerBuiltin("bind_all",2,FILE_sdda::PRED_bind_all_2_static_exec);
	   PredTable::registerBuiltin("add_to_list",2,FILE_sdda::PRED_add_to_list_2_static_exec);
	   PredTable::registerBuiltin("umember",2,FILE_sdda::PRED_umember_2_static_exec);
	   PredTable::registerBuiltin("sumember",2,FILE_sdda::PRED_sumember_2_static_exec);
	   PredTable::registerBuiltin("member",2,FILE_sdda::PRED_member_2_static_exec);
	   PredTable::registerBuiltin("smember",2,FILE_sdda::PRED_smember_2_static_exec);
	   PredTable::registerBuiltin("eqmember",2,FILE_sdda::PRED_eqmember_2_static_exec);
	   PredTable::registerBuiltin("concat",3,FILE_sdda::PRED_concat_3_static_exec);
	   PredTable::registerBuiltin("nl",0,FILE_sdda::PRED_nl_0_static_exec);
	   PredTable::registerBuiltin("$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sdda.pl","$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl",3,FILE_sdda::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsdda$002Epl_3_static_exec);
	   PredTable::registerBuiltin("write_list2",3,FILE_sdda::PRED_write_list2_3_static_exec);
	   PredTable::registerBuiltin("name_vars",3,FILE_sdda::PRED_name_vars_3_static_exec);
	   PredTable::registerBuiltin("make_name",2,FILE_sdda::PRED_make_name_2_static_exec);
	   PredTable::registerBuiltin("build_name",3,FILE_sdda::PRED_build_name_3_static_exec);
	}
}
