using namespace std;

#include "FILE_perfect.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/LongTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Arithmetic.h"
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
IntegerTerm *const FILE_perfect::int_100 = optional<int>(100);

	Operation FILE_perfect::PRED_top_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-findall(A,perfect(100,A),B),ok(B)
		m->setB0();
		 Term *a1, *a2, *a3;
		Operation p1;
	// top:-[findall(A,user:perfect(100,A),B),ok(B)]
		a1 = V(m);
		a2 = Closure(Op([&] (e)
		{
		PRED_perfect_2_static_exec(e);
		}, VA({int_100, a1}), nullptr));
		a3 = V(m);
		return Op([&] (e)
		{
		FILE_builtins::PRED_findall_3_static_exec(e);
		}, VA({a1, a2, a3}), Op([&] (e)
		{
		PRED_ok_1_static_exec(e);
	}, VA({a3}), cont));
	}

LongTerm *const FILE_perfect::int_3213876088517980551083924184681057554444177758164088967397376 = optional<long long>("3213876088517980551083924184681057554444177758164088967397376");
LongTerm *const FILE_perfect::int_12554203470773361527671578846336104669690446551334525075456 = optional<long long>("12554203470773361527671578846336104669690446551334525075456");
LongTerm *const FILE_perfect::int_191561942608236107294793378084303638130997321548169216 = optional<long long>("191561942608236107294793378084303638130997321548169216");
LongTerm *const FILE_perfect::int_46768052394588893382517909811217778170473142550528 = optional<long long>("46768052394588893382517909811217778170473142550528");
LongTerm *const FILE_perfect::int_182687704666362864775460301858080473799697891328 = optional<long long>("182687704666362864775460301858080473799697891328");
LongTerm *const FILE_perfect::int_44601490397061246283066714178813853366747136 = optional<long long>("44601490397061246283066714178813853366747136");
LongTerm *const FILE_perfect::int_2787593149816327892690784192460327776944128 = optional<long long>("2787593149816327892690784192460327776944128");
LongTerm *const FILE_perfect::int_10889035741470030830754200461521744560128 = optional<long long>("10889035741470030830754200461521744560128");
LongTerm *const FILE_perfect::int_2658455991569831744654692615953842176 = optional<long long>("2658455991569831744654692615953842176");
LongTerm *const FILE_perfect::int_166153499473114483824745506383331328 = optional<long long>("166153499473114483824745506383331328");
LongTerm *const FILE_perfect::int_40564819207303336344294875201536 = optional<long long>("40564819207303336344294875201536");
LongTerm *const FILE_perfect::int_9903520314282971830448816128 = optional<long long>("9903520314282971830448816128");
LongTerm *const FILE_perfect::int_38685626227663735544086528 = optional<long long>("38685626227663735544086528");
LongTerm *const FILE_perfect::int_2417851639228158837784576 = optional<long long>("2417851639228158837784576");
LongTerm *const FILE_perfect::int_9444732965670570950656 = optional<long long>("9444732965670570950656");
LongTerm *const FILE_perfect::int_2305843008139952128 = optional<long long>(2305843008139952128LL);
LongTerm *const FILE_perfect::int_144115187807420416 = optional<long long>(144115187807420416LL);
LongTerm *const FILE_perfect::int_35184367894528 = optional<long long>(35184367894528LL);
LongTerm *const FILE_perfect::int_137438691328 = optional<long long>(137438691328LL);
LongTerm *const FILE_perfect::int_8589869056 = optional<long long>(8589869056LL);
IntegerTerm *const FILE_perfect::int_33550336 = optional<int>(33550336);
IntegerTerm *const FILE_perfect::int_2096128 = optional<int>(2096128);
IntegerTerm *const FILE_perfect::int_8128 = optional<int>(8128);
IntegerTerm *const FILE_perfect::int_496 = optional<int>(496);
IntegerTerm *const FILE_perfect::int_28 = optional<int>(28);
ListTerm *const FILE_perfect::L_ok_1_s28 = CONS(int_6, Prolog::Nil);
ListTerm *const FILE_perfect::L_ok_1_s29 = CONS(int_28, L_ok_1_s28);
ListTerm *const FILE_perfect::L_ok_1_s30 = CONS(int_496, L_ok_1_s29);
ListTerm *const FILE_perfect::L_ok_1_s31 = CONS(int_8128, L_ok_1_s30);
ListTerm *const FILE_perfect::L_ok_1_s32 = CONS(int_2096128, L_ok_1_s31);
ListTerm *const FILE_perfect::L_ok_1_s33 = CONS(int_33550336, L_ok_1_s32);
ListTerm *const FILE_perfect::L_ok_1_s34 = CONS(int_8589869056, L_ok_1_s33);
ListTerm *const FILE_perfect::L_ok_1_s35 = CONS(int_137438691328, L_ok_1_s34);
ListTerm *const FILE_perfect::L_ok_1_s36 = CONS(int_35184367894528, L_ok_1_s35);
ListTerm *const FILE_perfect::L_ok_1_s37 = CONS(int_144115187807420416, L_ok_1_s36);
ListTerm *const FILE_perfect::L_ok_1_s38 = CONS(int_2305843008139952128, L_ok_1_s37);
ListTerm *const FILE_perfect::L_ok_1_s39 = CONS(int_9444732965670570950656, L_ok_1_s38);
ListTerm *const FILE_perfect::L_ok_1_s40 = CONS(int_2417851639228158837784576, L_ok_1_s39);
ListTerm *const FILE_perfect::L_ok_1_s41 = CONS(int_38685626227663735544086528, L_ok_1_s40);
ListTerm *const FILE_perfect::L_ok_1_s42 = CONS(int_9903520314282971830448816128, L_ok_1_s41);
ListTerm *const FILE_perfect::L_ok_1_s43 = CONS(int_40564819207303336344294875201536, L_ok_1_s42);
ListTerm *const FILE_perfect::L_ok_1_s44 = CONS(int_166153499473114483824745506383331328, L_ok_1_s43);
ListTerm *const FILE_perfect::L_ok_1_s45 = CONS(int_2658455991569831744654692615953842176, L_ok_1_s44);
ListTerm *const FILE_perfect::L_ok_1_s46 = CONS(int_10889035741470030830754200461521744560128, L_ok_1_s45);
ListTerm *const FILE_perfect::L_ok_1_s47 = CONS(int_2787593149816327892690784192460327776944128, L_ok_1_s46);
ListTerm *const FILE_perfect::L_ok_1_s48 = CONS(int_44601490397061246283066714178813853366747136, L_ok_1_s47);
ListTerm *const FILE_perfect::L_ok_1_s49 = CONS(int_182687704666362864775460301858080473799697891328, L_ok_1_s48);
ListTerm *const FILE_perfect::L_ok_1_s50 = CONS(int_46768052394588893382517909811217778170473142550528, L_ok_1_s49);
ListTerm *const FILE_perfect::L_ok_1_s51 = CONS(int_191561942608236107294793378084303638130997321548169216, L_ok_1_s50);
ListTerm *const FILE_perfect::L_ok_1_s52 = CONS(int_12554203470773361527671578846336104669690446551334525075456, L_ok_1_s51);
ListTerm *const FILE_perfect::L_ok_1_s53 = CONS(int_3213876088517980551083924184681057554444177758164088967397376, L_ok_1_s52);

	Operation FILE_perfect::PRED_ok_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// ok([3213876088517980551083924184681057554444177758164088967397376,12554203470773361527671578846336104669690446551334525075456,191561942608236107294793378084303638130997321548169216,46768052394588893382517909811217778170473142550528,182687704666362864775460301858080473799697891328,44601490397061246283066714178813853366747136,2787593149816327892690784192460327776944128,10889035741470030830754200461521744560128,2658455991569831744654692615953842176,166153499473114483824745506383331328,40564819207303336344294875201536,9903520314282971830448816128,38685626227663735544086528,2417851639228158837784576,9444732965670570950656,2305843008139952128,144115187807420416,35184367894528,137438691328,8589869056,33550336,2096128,8128,496,28,6]):-true
		m->setB0();
		 Term *a1;
		a1 = LARG[0];
	// ok([3213876088517980551083924184681057554444177758164088967397376,12554203470773361527671578846336104669690446551334525075456,191561942608236107294793378084303638130997321548169216,46768052394588893382517909811217778170473142550528,182687704666362864775460301858080473799697891328,44601490397061246283066714178813853366747136,2787593149816327892690784192460327776944128,10889035741470030830754200461521744560128,2658455991569831744654692615953842176,166153499473114483824745506383331328,40564819207303336344294875201536,9903520314282971830448816128,38685626227663735544086528,2417851639228158837784576,9444732965670570950656,2305843008139952128,144115187807420416,35184367894528,137438691328,8589869056,33550336,2096128,8128,496,28,6]):-[]
		if (!L_ok_1_s53->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SymbolTerm *const FILE_perfect::FUNCTOR_$002A_2 = F("*",2);
SymbolTerm *const FILE_perfect::FUNCTOR_mod_2 = F("mod",2);
SymbolTerm *const FILE_perfect::FUNCTOR_$002B_2 = F("+",2);

	Operation FILE_perfect::PRED_divisible_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return divisible_2_top(m);
	}

	Operation FILE_perfect::divisible_2_top(Prolog *m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_perfect::divisible_2_sub_1);
		return divisible_2_1(m);
	}

	Operation FILE_perfect::divisible_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return divisible_2_2(m);
	}

	Operation FILE_perfect::divisible_2_1(Prolog *m)
	{
	// divisible(A,B):-C is B*B,C=<A,A mod B=:=0
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// divisible(A,B):-[C is B*B,'$less_or_equal'(C,A),D is A mod B,E is 0,'$arith_equal'(D,E)]
		a3 = V(m);
	// put_str_args([a(2),a(2)],y(1)),put_str(@('FUNCTOR_$002A_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002A_2, {a2, a2});
		 ;
		//START inline expansion of a(3)is a(4)
		if (!a3->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $less_or_equal(a(3),a(1))
		if (Arithmetic::evaluate(a3)->arithCompareTo(Arithmetic::evaluate(a1)) > 0)
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
	// put_str_args([a(1),a(2)],y(2)),put_str(@('FUNCTOR_mod_2'),y(2),a(6))
		a6 = S(FUNCTOR_mod_2, {a1, a2});
		 ;
		//START inline expansion of a(5)is a(6)
		if (!a5->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a7 = V(m);
		//START inline expansion of a(7)is@(int_0)
		if (!a7->unify(Arithmetic::evaluate(int_0), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $arith_equal(a(5),a(7))
		if (Arithmetic::evaluate(a5)->arithCompareTo(Arithmetic::evaluate(a7)) != 0)
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_perfect::divisible_2_2(Prolog *m)
	{
	// divisible(A,B):-B<A,C is B+1,divisible(A,C)
		 Term *a1, *a2, *a3, *a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// divisible(A,B):-['$less_than'(B,A),C is B+1,divisible(A,C)]
		//START inline expansion of $less_than(a(2),a(1))
		if (Arithmetic::evaluate(a2)->arithCompareTo(Arithmetic::evaluate(a1)) >= 0)
		{
			return m->fail();
		}
		//END inline expansion
		a3 = V(m);
	// put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002B_2, {a2, int_1});
		 ;
		//START inline expansion of a(3)is a(4)
		if (!a3->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a1;
		m->AREGS[1] = a3;
		m->cont = cont;
		return divisible_2_top(m);
	}

	Operation FILE_perfect::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_perfect::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_1(m);
	}

	Operation FILE_perfect::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_2(m);
	}

	Operation FILE_perfect::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_1(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'(A,B):-divisible(A,B),!,fail
		 Term *a1, *a2, *a3;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'(A,B):-['$get_level'(C),divisible(A,B),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if (!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_divisible_2_static_exec(e);
		}, VA({a1, a2}), Op([&] (e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({a3}), Failure::fail_0));
	}

	Operation FILE_perfect::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_2(Prolog *m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'(A,B):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'(A,B):-[]
		return cont;
	}

	Operation FILE_perfect::PRED_isprime_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return isprime_2_top(m);
	}

	Operation FILE_perfect::isprime_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_perfect::isprime_2_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, Failure::fail_0, FILE_perfect::isprime_2_var);
	}

	Operation FILE_perfect::isprime_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_perfect::isprime_2_var_1);
		return isprime_2_1(m);
	}

	Operation FILE_perfect::isprime_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return isprime_2_2(m);
	}

	Operation FILE_perfect::isprime_2_1(Prolog *m)
	{
	// isprime([A|B],A):-C is 2,A>1,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'(A,C)
		 Term *a1, *a2, *a3, *a4, *a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// isprime([A|B],A):-[C is 2,D is 1,'$greater_than'(A,D),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl'(A,C)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[0];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			 a1->bind(CONS(a3, V(m)), m->trail);
		}
		else
		{
			return m->fail();
		}
		if (!a3->unify(a2, m->trail))
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
		a5 = V(m);
		//START inline expansion of a(5)is@(int_1)
		if (!a5->unify(Arithmetic::evaluate(int_1), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(3),a(5))
		if (Arithmetic::evaluate(a3)->arithCompareTo(Arithmetic::evaluate(a5)) <= 0)
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_static_exec(e);
		}, VA({a3, a4}), cont);
	}

	Operation FILE_perfect::isprime_2_2(Prolog *m)
	{
	// isprime([A|B],C):-isprime(B,C)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// isprime([A|B],C):-[isprime(B,C)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[1];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			 a1->bind(CONS(V(m), a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		m->AREGS[0] = a3;
		m->AREGS[1] = a2;
		m->cont = cont;
		return isprime_2_top(m);
	}

SymbolTerm *const FILE_perfect::FUNCTOR_$002D_2 = F("-",2);

	Operation FILE_perfect::PRED_power_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return power_3_top(m);
	}

	Operation FILE_perfect::power_3_top(Prolog *m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_perfect::power_3_sub_1);
		return power_3_1(m);
	}

	Operation FILE_perfect::power_3_sub_1(Prolog *m)
	{
		m->trust(nullptr);
		return power_3_2(m);
	}

	Operation FILE_perfect::power_3_1(Prolog *m)
	{
	// power(A,0,1):-!
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// power(A,0,1):-['$neck_cut']
		if (!int_0->unify(a2, m->trail))
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

	Operation FILE_perfect::power_3_2(Prolog *m)
	{
	// power(A,B,C):-D is B-1,power(A,D,E),C is E*A
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// power(A,B,C):-[D is B-1,power(A,D,E),C is E*A]
		a4 = V(m);
	// put_str_args([a(2),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(5))
		a5 = S(FUNCTOR_$002D_2, {a2, int_1});
		 ;
		//START inline expansion of a(4)is a(5)
		if (!a4->unify(Arithmetic::evaluate(a5), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a6 = V(m);
	// put_str_args([a(6),a(1)],y(2)),put_str(@('FUNCTOR_$002A_2'),y(2),a(7))
		a7 = S(FUNCTOR_$002A_2, {a6, a1});
		 ;
		p1 = Op(FILE_builtins::PRED_is_2_static_exec, VA({a3, a7}), cont);
		m->AREGS[0] = a1;
		m->AREGS[1] = a4;
		m->AREGS[2] = a6;
		m->cont = p1;
		return power_3_top(m);
	}

	Operation FILE_perfect::PRED_calc_3_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// calc(2,A,B):-power(2,A,C),D is C-1,power(2,A-1,E),B is D*E
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8, *a9;
		Operation p1, p2, p3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
	// calc(2,A,B):-[power(2,A,C),D is C-1,power(2,A-1,E),B is D*E]
		if (!int_2->unify(a1, m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		a5 = V(m);
	// put_str_args([a(4),@(int_1)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(6))
		a6 = S(FUNCTOR_$002D_2, {a4, int_1});
		 ;
	// put_str_args([a(2),@(int_1)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(7))
		a7 = S(FUNCTOR_$002D_2, {a2, int_1});
		 ;
		a8 = V(m);
	// put_str_args([a(5),a(8)],y(3)),put_str(@('FUNCTOR_$002A_2'),y(3),a(9))
		a9 = S(FUNCTOR_$002A_2, {a5, a8});
		 ;
		return Op([&] (e)
		{
		PRED_power_3_static_exec(e);
		}, VA({int_2, a2, a4}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a5, a6}), Op([&] (e)
		{
		PRED_power_3_static_exec(e);
	}, VA({int_2, a7, a8}), Op(FILE_builtins::PRED_is_2_static_exec, VA({a3, a9}), cont))));
	}

	Operation FILE_perfect::PRED_listperf_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return listperf_2_top(m);
	}

	Operation FILE_perfect::listperf_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_perfect::listperf_2_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, Failure::fail_0, FILE_perfect::listperf_2_var);
	}

	Operation FILE_perfect::listperf_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_perfect::listperf_2_var_1);
		return listperf_2_1(m);
	}

	Operation FILE_perfect::listperf_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return listperf_2_2(m);
	}

	Operation FILE_perfect::listperf_2_1(Prolog *m)
	{
	// listperf([A|B],C):-calc(2,A,C)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// listperf([A|B],C):-[calc(2,A,C)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[0];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			 a1->bind(CONS(a3, V(m)), m->trail);
		}
		else
		{
			return m->fail();
		}
		return Op([&] (e)
		{
		PRED_calc_3_static_exec(e);
		}, VA({int_2, a3, a2}), cont);
	}

	Operation FILE_perfect::listperf_2_2(Prolog *m)
	{
	// listperf([A|B],C):-listperf(B,C)
		 Term *a1, *a2, *a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// listperf([A|B],C):-[listperf(B,C)]
		a1 = a1->dref();
		if (a1->isCons())
		{
			std::vector<Term*> argz = VA({a1->car(), a1->cdr()});
			a3 = argz[1];
		}
		else if (a1->isVar())
		{
			a3 = V(m);
			 a1->bind(CONS(V(m), a3), m->trail);
		}
		else
		{
			return m->fail();
		}
		m->AREGS[0] = a3;
		m->AREGS[1] = a2;
		m->cont = cont;
		return listperf_2_top(m);
	}

	Operation FILE_perfect::PRED_generateList_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return generateList_2_top(m);
	}

	Operation FILE_perfect::generateList_2_top(Prolog *m)
	{
		m->setB0();
		return m->switch_on_term(FILE_perfect::generateList_2_var, FILE_perfect::generateList_2_var, FILE_perfect::generateList_2_2, FILE_perfect::generateList_2_2, FILE_perfect::generateList_2_2, FILE_perfect::generateList_2_2);
	}

	Operation FILE_perfect::generateList_2_var(Prolog *m)
	{
		m->jtry2(nullptr, FILE_perfect::generateList_2_var_1);
		return generateList_2_1(m);
	}

	Operation FILE_perfect::generateList_2_var_1(Prolog *m)
	{
		m->trust(nullptr);
		return generateList_2_2(m);
	}

	Operation FILE_perfect::generateList_2_1(Prolog *m)
	{
	// generateList(0,[]):-true
		 Term *a1, *a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// generateList(0,[]):-[]
		if (!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		if (!Prolog::Nil->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_perfect::generateList_2_2(Prolog *m)
	{
	// generateList(A,[B|C]):-A>0,B is A+1,D is A-1,generateList(D,C)
		 Term *a1, *a2, *a3, *a4, *a5, *a6, *a7, *a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
	// generateList(A,[B|C]):-[D is 0,'$greater_than'(A,D),B is A+1,E is A-1,generateList(E,C)]
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
		//START inline expansion of a(5)is@(int_0)
		if (!a5->unify(Arithmetic::evaluate(int_0), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(5))
		if (Arithmetic::evaluate(a1)->arithCompareTo(Arithmetic::evaluate(a5)) <= 0)
		{
			return m->fail();
		}
		//END inline expansion
	// put_str_args([a(1),@(int_1)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(6))
		a6 = S(FUNCTOR_$002B_2, {a1, int_1});
		 ;
		//START inline expansion of a(3)is a(6)
		if (!a3->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a7 = V(m);
	// put_str_args([a(1),@(int_1)],y(2)),put_str(@('FUNCTOR_$002D_2'),y(2),a(8))
		a8 = S(FUNCTOR_$002D_2, {a1, int_1});
		 ;
		//START inline expansion of a(7)is a(8)
		if (!a7->unify(Arithmetic::evaluate(a8), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a7;
		m->AREGS[1] = a4;
		m->cont = cont;
		return generateList_2_top(m);
	}

	Operation FILE_perfect::PRED_perfect_2_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// perfect(A,B):-generateList(A,C),findall(D,isprime(C,D),E),listperf(E,B)
		m->setB0();
		 Term *a1, *a2, *a3, *a4, *a5, *a6;
		Operation p1, p2;
		a1 = LARG[0];
		a2 = LARG[1];
	// perfect(A,B):-[generateList(A,C),findall(D,user:isprime(C,D),E),listperf(E,B)]
		a3 = V(m);
		a4 = V(m);
		a5 = Closure(Op([&] (e)
		{
		PRED_isprime_2_static_exec(e);
		}, VA({a3, a4}), nullptr));
		a6 = V(m);
		return Op([&] (e)
		{
		PRED_generateList_2_static_exec(e);
		}, VA({a1, a3}), Op([&] (e)
		{
		FILE_builtins::PRED_findall_3_static_exec(e);
	}, VA({a4, a5, a6}), Op([&] (e)
	{
		PRED_listperf_2_static_exec(e);
	}, VA({a6, a2}), cont)));
	}

	FILE_perfect::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_perfect::StaticConstructor FILE_perfect::staticConstructor;

	void FILE_perfect::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_perfect::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("ok",1,FILE_perfect::PRED_ok_1_static_exec);
	   PredTable::registerBuiltin("divisible",2,FILE_perfect::PRED_divisible_2_static_exec);
	   PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/perfect.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl",2,FILE_perfect::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fperfect$002Epl_2_static_exec);
	   PredTable::registerBuiltin("isprime",2,FILE_perfect::PRED_isprime_2_static_exec);
	   PredTable::registerBuiltin("power",3,FILE_perfect::PRED_power_3_static_exec);
	   PredTable::registerBuiltin("calc",3,FILE_perfect::PRED_calc_3_static_exec);
	   PredTable::registerBuiltin("listperf",2,FILE_perfect::PRED_listperf_2_static_exec);
	   PredTable::registerBuiltin("generateList",2,FILE_perfect::PRED_generateList_2_static_exec);
	   PredTable::registerBuiltin("perfect",2,FILE_perfect::PRED_perfect_2_static_exec);
	}
}
