using namespace std;

#include "FILE_nreverse.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../machine/SxxMachine/Failure.h"
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

	Operation FILE_nreverse::PRED_top_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-nreverse
		m->setB0();
	// top:-[nreverse]
		return Op([&] (e)
		{
		PRED_nreverse_0_static_exec(e);
		}, VA(), cont);
	}

IntegerTerm* const  FILE_nreverse::int_26 = optional<int>(26);
IntegerTerm* const  FILE_nreverse::int_27 = optional<int>(27);
IntegerTerm* const  FILE_nreverse::int_28 = optional<int>(28);
IntegerTerm* const  FILE_nreverse::int_29 = optional<int>(29);
IntegerTerm* const  FILE_nreverse::int_30 = optional<int>(30);
ListTerm* const  FILE_nreverse::L_nreverse_0_s32 = CONS(int_30, Prolog::Nil);
ListTerm* const  FILE_nreverse::L_nreverse_0_s33 = CONS(int_29, L_nreverse_0_s32);
ListTerm* const  FILE_nreverse::L_nreverse_0_s34 = CONS(int_28, L_nreverse_0_s33);
ListTerm* const  FILE_nreverse::L_nreverse_0_s35 = CONS(int_27, L_nreverse_0_s34);
ListTerm* const  FILE_nreverse::L_nreverse_0_s36 = CONS(int_26, L_nreverse_0_s35);
ListTerm* const  FILE_nreverse::L_nreverse_0_s37 = CONS(int_25, L_nreverse_0_s36);
ListTerm* const  FILE_nreverse::L_nreverse_0_s38 = CONS(int_24, L_nreverse_0_s37);
ListTerm* const  FILE_nreverse::L_nreverse_0_s39 = CONS(int_23, L_nreverse_0_s38);
ListTerm* const  FILE_nreverse::L_nreverse_0_s40 = CONS(int_22, L_nreverse_0_s39);
ListTerm* const  FILE_nreverse::L_nreverse_0_s41 = CONS(int_21, L_nreverse_0_s40);
ListTerm* const  FILE_nreverse::L_nreverse_0_s42 = CONS(int_20, L_nreverse_0_s41);
ListTerm* const  FILE_nreverse::L_nreverse_0_s43 = CONS(int_19, L_nreverse_0_s42);
ListTerm* const  FILE_nreverse::L_nreverse_0_s44 = CONS(int_18, L_nreverse_0_s43);
ListTerm* const  FILE_nreverse::L_nreverse_0_s45 = CONS(int_17, L_nreverse_0_s44);
ListTerm* const  FILE_nreverse::L_nreverse_0_s46 = CONS(int_16, L_nreverse_0_s45);
ListTerm* const  FILE_nreverse::L_nreverse_0_s47 = CONS(int_15, L_nreverse_0_s46);
ListTerm* const  FILE_nreverse::L_nreverse_0_s48 = CONS(int_14, L_nreverse_0_s47);
ListTerm* const  FILE_nreverse::L_nreverse_0_s49 = CONS(int_13, L_nreverse_0_s48);
ListTerm* const  FILE_nreverse::L_nreverse_0_s50 = CONS(int_12, L_nreverse_0_s49);
ListTerm* const  FILE_nreverse::L_nreverse_0_s51 = CONS(int_11, L_nreverse_0_s50);
ListTerm* const  FILE_nreverse::L_nreverse_0_s52 = CONS(int_10, L_nreverse_0_s51);
ListTerm* const  FILE_nreverse::L_nreverse_0_s53 = CONS(int_9, L_nreverse_0_s52);
ListTerm* const  FILE_nreverse::L_nreverse_0_s54 = CONS(int_8, L_nreverse_0_s53);
ListTerm* const  FILE_nreverse::L_nreverse_0_s55 = CONS(int_7, L_nreverse_0_s54);
ListTerm* const  FILE_nreverse::L_nreverse_0_s56 = CONS(int_6, L_nreverse_0_s55);
ListTerm* const  FILE_nreverse::L_nreverse_0_s57 = CONS(int_5, L_nreverse_0_s56);
ListTerm* const  FILE_nreverse::L_nreverse_0_s58 = CONS(int_4, L_nreverse_0_s57);
ListTerm* const  FILE_nreverse::L_nreverse_0_s59 = CONS(int_3, L_nreverse_0_s58);
ListTerm* const  FILE_nreverse::L_nreverse_0_s60 = CONS(int_2, L_nreverse_0_s59);
ListTerm* const  FILE_nreverse::L_nreverse_0_s61 = CONS(int_1, L_nreverse_0_s60);

	Operation FILE_nreverse::PRED_nreverse_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// nreverse:-nreverse([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],A)
		m->setB0();
	// nreverse:-[nreverse([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30],A)]
		return Op([&] (e)
		{
		PRED_nreverse_2_static_exec(e);
		}, VA({ L_nreverse_0_s61, V(m) }), cont);
	}

	Operation FILE_nreverse::PRED_nreverse_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return nreverse_2_top(m);
	}

	Operation FILE_nreverse::nreverse_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_nreverse::nreverse_2_var, Failure::fail_0, Failure::fail_0, FILE_nreverse::nreverse_2_2, Failure::fail_0, FILE_nreverse::nreverse_2_1);
	}

	Operation FILE_nreverse::nreverse_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_nreverse::nreverse_2_var_1);
		return nreverse_2_1(m);
	}

	Operation FILE_nreverse::nreverse_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return nreverse_2_2(m);
	}

	Operation FILE_nreverse::nreverse_2_1(Prolog* m)
	{
	// nreverse([A|B],C):-nreverse(B,D),concatenate(D,[A],C)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// nreverse([A|B],C):-[nreverse(B,D),concatenate(D,[A],C)]
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
		a5 = V(m);
		a6 = CONS(a3, Prolog::Nil);
		p1 = Op([&] (e)
		{
		PRED_concatenate_3_static_exec(e);
		}, VA({ a5, a6, a2 }), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a5;
		m->cont = p1;
		return nreverse_2_top(m);
	}

	Operation FILE_nreverse::nreverse_2_2(Prolog* m)
	{
	// nreverse([],[]):-true
		 Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// nreverse([],[]):-[]
		if(!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_nreverse::PRED_concatenate_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return concatenate_3_top(m);
	}

	Operation FILE_nreverse::concatenate_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_nreverse::concatenate_3_var, Failure::fail_0, Failure::fail_0, FILE_nreverse::concatenate_3_2, Failure::fail_0, FILE_nreverse::concatenate_3_1);
	}

	Operation FILE_nreverse::concatenate_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_nreverse::concatenate_3_var_1);
		return concatenate_3_1(m);
	}

	Operation FILE_nreverse::concatenate_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return concatenate_3_2(m);
	}

	Operation FILE_nreverse::concatenate_3_1(Prolog* m)
	{
	// concatenate([A|B],C,[A|D]):-concatenate(B,C,D)
		 Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// concatenate([A|B],C,[A|D]):-[concatenate(B,C,D)]
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
		return concatenate_3_top(m);
	}

	Operation FILE_nreverse::concatenate_3_2(Prolog* m)
	{
	// concatenate([],A,A):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// concatenate([],A,A):-[]
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

	FILE_nreverse::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_nreverse::StaticConstructor FILE_nreverse::staticConstructor;

	void FILE_nreverse::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_nreverse::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("nreverse",0,FILE_nreverse::PRED_nreverse_0_static_exec);
	   PredTable::registerBuiltin("nreverse",2,FILE_nreverse::PRED_nreverse_2_static_exec);
	   PredTable::registerBuiltin("concatenate",3,FILE_nreverse::PRED_concatenate_3_static_exec);
	}
}
