using namespace std;

#include "FILE_qsort.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
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

	Operation FILE_qsort::PRED_top_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-qsort
		m->setB0();
	// top:-[qsort]
		return Op([&] (e)
		{
		PRED_qsort_0_static_exec(e);
		}, VA(), cont);
	}

IntegerTerm* const  FILE_qsort::int_27 = optional<int>(27);
IntegerTerm* const  FILE_qsort::int_74 = optional<int>(74);
IntegerTerm* const  FILE_qsort::int_33 = optional<int>(33);
IntegerTerm* const  FILE_qsort::int_94 = optional<int>(94);
IntegerTerm* const  FILE_qsort::int_46 = optional<int>(46);
IntegerTerm* const  FILE_qsort::int_83 = optional<int>(83);
IntegerTerm* const  FILE_qsort::int_65 = optional<int>(65);
IntegerTerm* const  FILE_qsort::int_32 = optional<int>(32);
IntegerTerm* const  FILE_qsort::int_53 = optional<int>(53);
IntegerTerm* const  FILE_qsort::int_28 = optional<int>(28);
IntegerTerm* const  FILE_qsort::int_85 = optional<int>(85);
IntegerTerm* const  FILE_qsort::int_99 = optional<int>(99);
IntegerTerm* const  FILE_qsort::int_47 = optional<int>(47);
IntegerTerm* const  FILE_qsort::int_82 = optional<int>(82);
IntegerTerm* const  FILE_qsort::int_55 = optional<int>(55);
IntegerTerm* const  FILE_qsort::int_29 = optional<int>(29);
IntegerTerm* const  FILE_qsort::int_39 = optional<int>(39);
IntegerTerm* const  FILE_qsort::int_81 = optional<int>(81);
IntegerTerm* const  FILE_qsort::int_90 = optional<int>(90);
IntegerTerm* const  FILE_qsort::int_37 = optional<int>(37);
IntegerTerm* const  FILE_qsort::int_66 = optional<int>(66);
IntegerTerm* const  FILE_qsort::int_51 = optional<int>(51);
IntegerTerm* const  FILE_qsort::int_31 = optional<int>(31);
IntegerTerm* const  FILE_qsort::int_63 = optional<int>(63);
IntegerTerm* const  FILE_qsort::int_75 = optional<int>(75);
IntegerTerm* const  FILE_qsort::int_95 = optional<int>(95);
IntegerTerm* const  FILE_qsort::int_61 = optional<int>(61);
IntegerTerm* const  FILE_qsort::int_92 = optional<int>(92);
IntegerTerm* const  FILE_qsort::int_40 = optional<int>(40);
IntegerTerm* const  FILE_qsort::int_59 = optional<int>(59);
ListTerm* const  FILE_qsort::L_qsort_0_s43 = CONS(int_8, Prolog::Nil);
ListTerm* const  FILE_qsort::L_qsort_0_s44 = CONS(int_59, L_qsort_0_s43);
ListTerm* const  FILE_qsort::L_qsort_0_s45 = CONS(int_53, L_qsort_0_s44);
ListTerm* const  FILE_qsort::L_qsort_0_s46 = CONS(int_40, L_qsort_0_s45);
ListTerm* const  FILE_qsort::L_qsort_0_s47 = CONS(int_92, L_qsort_0_s46);
ListTerm* const  FILE_qsort::L_qsort_0_s48 = CONS(int_18, L_qsort_0_s47);
ListTerm* const  FILE_qsort::L_qsort_0_s49 = CONS(int_74, L_qsort_0_s48);
ListTerm* const  FILE_qsort::L_qsort_0_s50 = CONS(int_61, L_qsort_0_s49);
ListTerm* const  FILE_qsort::L_qsort_0_s51 = CONS(int_28, L_qsort_0_s50);
ListTerm* const  FILE_qsort::L_qsort_0_s52 = CONS(int_11, L_qsort_0_s51);
ListTerm* const  FILE_qsort::L_qsort_0_s53 = CONS(int_99, L_qsort_0_s52);
ListTerm* const  FILE_qsort::L_qsort_0_s54 = CONS(int_95, L_qsort_0_s53);
ListTerm* const  FILE_qsort::L_qsort_0_s55 = CONS(int_4, L_qsort_0_s54);
ListTerm* const  FILE_qsort::L_qsort_0_s56 = CONS(int_75, L_qsort_0_s55);
ListTerm* const  FILE_qsort::L_qsort_0_s57 = CONS(int_63, L_qsort_0_s56);
ListTerm* const  FILE_qsort::L_qsort_0_s58 = CONS(int_31, L_qsort_0_s57);
ListTerm* const  FILE_qsort::L_qsort_0_s59 = CONS(int_27, L_qsort_0_s58);
ListTerm* const  FILE_qsort::L_qsort_0_s60 = CONS(int_85, L_qsort_0_s59);
ListTerm* const  FILE_qsort::L_qsort_0_s61 = CONS(int_21, L_qsort_0_s60);
ListTerm* const  FILE_qsort::L_qsort_0_s62 = CONS(int_7, L_qsort_0_s61);
ListTerm* const  FILE_qsort::L_qsort_0_s63 = CONS(int_51, L_qsort_0_s62);
ListTerm* const  FILE_qsort::L_qsort_0_s64 = CONS(int_66, L_qsort_0_s63);
ListTerm* const  FILE_qsort::L_qsort_0_s65 = CONS(int_0, L_qsort_0_s64);
ListTerm* const  FILE_qsort::L_qsort_0_s66 = CONS(int_10, L_qsort_0_s65);
ListTerm* const  FILE_qsort::L_qsort_0_s67 = CONS(int_37, L_qsort_0_s66);
ListTerm* const  FILE_qsort::L_qsort_0_s68 = CONS(int_90, L_qsort_0_s67);
ListTerm* const  FILE_qsort::L_qsort_0_s69 = CONS(int_81, L_qsort_0_s68);
ListTerm* const  FILE_qsort::L_qsort_0_s70 = CONS(int_39, L_qsort_0_s69);
ListTerm* const  FILE_qsort::L_qsort_0_s71 = CONS(int_29, L_qsort_0_s70);
ListTerm* const  FILE_qsort::L_qsort_0_s72 = CONS(int_55, L_qsort_0_s71);
ListTerm* const  FILE_qsort::L_qsort_0_s73 = CONS(int_11, L_qsort_0_s72);
ListTerm* const  FILE_qsort::L_qsort_0_s74 = CONS(int_6, L_qsort_0_s73);
ListTerm* const  FILE_qsort::L_qsort_0_s75 = CONS(int_82, L_qsort_0_s74);
ListTerm* const  FILE_qsort::L_qsort_0_s76 = CONS(int_28, L_qsort_0_s75);
ListTerm* const  FILE_qsort::L_qsort_0_s77 = CONS(int_47, L_qsort_0_s76);
ListTerm* const  FILE_qsort::L_qsort_0_s78 = CONS(int_99, L_qsort_0_s77);
ListTerm* const  FILE_qsort::L_qsort_0_s79 = CONS(int_85, L_qsort_0_s78);
ListTerm* const  FILE_qsort::L_qsort_0_s80 = CONS(int_28, L_qsort_0_s79);
ListTerm* const  FILE_qsort::L_qsort_0_s81 = CONS(int_53, L_qsort_0_s80);
ListTerm* const  FILE_qsort::L_qsort_0_s82 = CONS(int_32, L_qsort_0_s81);
ListTerm* const  FILE_qsort::L_qsort_0_s83 = CONS(int_2, L_qsort_0_s82);
ListTerm* const  FILE_qsort::L_qsort_0_s84 = CONS(int_65, L_qsort_0_s83);
ListTerm* const  FILE_qsort::L_qsort_0_s85 = CONS(int_83, L_qsort_0_s84);
ListTerm* const  FILE_qsort::L_qsort_0_s86 = CONS(int_46, L_qsort_0_s85);
ListTerm* const  FILE_qsort::L_qsort_0_s87 = CONS(int_18, L_qsort_0_s86);
ListTerm* const  FILE_qsort::L_qsort_0_s88 = CONS(int_94, L_qsort_0_s87);
ListTerm* const  FILE_qsort::L_qsort_0_s89 = CONS(int_33, L_qsort_0_s88);
ListTerm* const  FILE_qsort::L_qsort_0_s90 = CONS(int_17, L_qsort_0_s89);
ListTerm* const  FILE_qsort::L_qsort_0_s91 = CONS(int_74, L_qsort_0_s90);
ListTerm* const  FILE_qsort::L_qsort_0_s92 = CONS(int_27, L_qsort_0_s91);

	Operation FILE_qsort::PRED_qsort_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// qsort:-qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])
		m->setB0();
	// qsort:-[qsort([27,74,17,33,94,18,46,83,65,2,32,53,28,85,99,47,28,82,6,11,55,29,39,81,90,37,10,0,66,51,7,21,85,27,31,63,75,4,95,99,11,28,61,74,18,92,40,53,59,8],A,[])]
		return Op([&] (e)
		{
		PRED_qsort_3_static_exec(e);
		}, VA({ L_qsort_0_s92, V(m), Prolog::Nil }), cont);
	}

	Operation FILE_qsort::PRED_qsort_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_qsort::qsort_3_var, Failure::fail_0, Failure::fail_0, FILE_qsort::qsort_3_2, Failure::fail_0, FILE_qsort::qsort_3_1);
	}

	Operation FILE_qsort::qsort_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_qsort::qsort_3_var_1);
		return qsort_3_1(m);
	}

	Operation FILE_qsort::qsort_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return qsort_3_2(m);
	}

	Operation FILE_qsort::qsort_3_1(Prolog* m)
	{
	// qsort([A|B],C,D):-partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G])
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// qsort([A|B],C,D):-[partition(B,A,E,F),qsort(F,G,D),qsort(E,C,[A|G])]
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
		a7 = V(m);
		a8 = V(m);
		a9 = CONS(a4, a8);
		return Op([&] (e)
		{
		PRED_partition_4_static_exec(e);
		}, VA({ a5, a4, a6, a7 }), Op([&] (e)
		{
		PRED_qsort_3_static_exec(e);
	}, VA({ a7, a8, a3 }), Op([&] (e)
	{
		PRED_qsort_3_static_exec(e);
	}, VA({ a6, a2, a9 }), cont)));
	}

	Operation FILE_qsort::qsort_3_2(Prolog* m)
	{
	// qsort([],A,A):-true
		 Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// qsort([],A,A):-[]
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

	Operation FILE_qsort::PRED_partition_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return partition_4_top(m);
	}

	Operation FILE_qsort::partition_4_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_qsort::partition_4_var, Failure::fail_0, Failure::fail_0, FILE_qsort::partition_4_3, Failure::fail_0, FILE_qsort::partition_4_lis);
	}

	Operation FILE_qsort::partition_4_var(Prolog* m)
	{
		m->jtry4(nullptr, FILE_qsort::partition_4_var_1);
		return partition_4_1(m);
	}

	Operation FILE_qsort::partition_4_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_qsort::partition_4_var_2);
		return partition_4_2(m);
	}

	Operation FILE_qsort::partition_4_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return partition_4_3(m);
	}

	Operation FILE_qsort::partition_4_lis(Prolog* m)
	{
		m->jtry4(nullptr, FILE_qsort::partition_4_lis_1);
		return partition_4_1(m);
	}

	Operation FILE_qsort::partition_4_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return partition_4_2(m);
	}

	Operation FILE_qsort::partition_4_1(Prolog* m)
	{
	// partition([A|B],C,[A|D],E):-A=<C,!,partition(B,C,D,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// partition([A|B],C,[A|D],E):-['$get_level'(F),'$less_or_equal'(A,C),'$cut'(F),partition(B,C,D,E)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a5 = argz[0];
			a6 = argz[1];
		} else if(a1->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			 a1->bind(CONS(a5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a7 = V(m);
			 a3->bind(CONS(a5, a7), m->trail);
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
		//START inline expansion of $less_or_equal(a(5),a(2))
		if(Arithmetic::evaluate(a5)->arithCompareTo(Arithmetic::evaluate(a2)) > 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8->dref();
				  m->cut(a8->intValue());
		//END inline expansion
		m->AREGS[0] = a6;
		m->AREGS[1] = a2;
		m->AREGS[2] = a7;
		m->AREGS[3] = a4;
		m->cont = cont;
		return partition_4_top(m);
	}

	Operation FILE_qsort::partition_4_2(Prolog* m)
	{
	// partition([A|B],C,D,[A|E]):-partition(B,C,D,E)
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// partition([A|B],C,D,[A|E]):-[partition(B,C,D,E)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a5 = argz[0];
			a6 = argz[1];
		} else if(a1->isVar())
		{
			a5 = V(m);
			a6 = V(m);
			 a1->bind(CONS(a5, a6), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!a5->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a7 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			 a4->bind(CONS(a5, a7), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a6;
		m->AREGS[1] = a2;
		m->AREGS[2] = a3;
		m->AREGS[3] = a7;
		m->cont = cont;
		return partition_4_top(m);
	}

	Operation FILE_qsort::partition_4_3(Prolog* m)
	{
	// partition([],A,[],[]):-true
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
	// partition([],A,[],[]):-[]
		if(!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a3, m->trail))
		{
			return m->fail();
		}
		if(!Prolog::Nil->unify(a4, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	FILE_qsort::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_qsort::StaticConstructor FILE_qsort::staticConstructor;

	void FILE_qsort::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_qsort::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("qsort",0,FILE_qsort::PRED_qsort_0_static_exec);
	   PredTable::registerBuiltin("qsort",3,FILE_qsort::PRED_qsort_3_static_exec);
	   PredTable::registerBuiltin("partition",4,FILE_qsort::PRED_partition_4_static_exec);
	}
}
