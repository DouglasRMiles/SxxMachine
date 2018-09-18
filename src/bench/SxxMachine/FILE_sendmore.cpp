using namespace std;

#include "FILE_sendmore.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/Failure.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
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

	Operation FILE_sendmore::PRED_top_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry0(nullptr, FILE_sendmore::top_0_sub_1);
		return top_0_1(m);
	}

	Operation FILE_sendmore::top_0_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return top_0_2(m);
	}

	Operation FILE_sendmore::top_0_1(Prolog* m)
	{
	// top:-digit(A),digit(B),A=\=B,sumdigit(0,A,B,C,D),digit(E),E=\=C,E=\=B,E=\=A,digit(F),F=\=E,F=\=C,F=\=B,F=\=A,sumdigit(D,E,F,B,G),digit(H),H=\=F,H=\=E,H=\=C,H=\=B,H=\=A,sumdigit(G,B,H,E,I),leftdigit(J),J=\=H,J=\=F,J=\=E,J=\=C,J=\=B,J=\=A,leftdigit(K),K=\=J,K=\=H,K=\=F,K=\=E,K=\=C,K=\=B,K=\=A,sumdigit(I,J,K,H,K),fail
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37;
		Operation cont;
		cont = m->cont;
	// top:-[digit(A),digit(B),'$arith_not_equal'(A,B),sumdigit(0,A,B,C,D),digit(E),'$arith_not_equal'(E,C),'$arith_not_equal'(E,B),'$arith_not_equal'(E,A),digit(F),'$arith_not_equal'(F,E),'$arith_not_equal'(F,C),'$arith_not_equal'(F,B),'$arith_not_equal'(F,A),sumdigit(D,E,F,B,G),digit(H),'$arith_not_equal'(H,F),'$arith_not_equal'(H,E),'$arith_not_equal'(H,C),'$arith_not_equal'(H,B),'$arith_not_equal'(H,A),sumdigit(G,B,H,E,I),leftdigit(J),'$arith_not_equal'(J,H),'$arith_not_equal'(J,F),'$arith_not_equal'(J,E),'$arith_not_equal'(J,C),'$arith_not_equal'(J,B),'$arith_not_equal'(J,A),leftdigit(K),'$arith_not_equal'(K,J),'$arith_not_equal'(K,H),'$arith_not_equal'(K,F),'$arith_not_equal'(K,E),'$arith_not_equal'(K,C),'$arith_not_equal'(K,B),'$arith_not_equal'(K,A),sumdigit(I,J,K,H,K),fail]
		a1 = V(m);
		a2 = V(m);
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		a7 = V(m);
		a8 = V(m);
		a9 = V(m);
		a10 = V(m);
		a11 = V(m);
		return Op([&] (e)
		{
		PRED_digit_1_static_exec(e);
		}, VA({ a1 }), Op([&] (e)
		{
		PRED_digit_1_static_exec(e);
	}, VA({ a2 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a1, a2 }), Op([&] (e)
	{
		PRED_sumdigit_5_static_exec(e);
	}, VA({ int_0, a1, a2, a3, a4 }), Op([&] (e)
	{
		PRED_digit_1_static_exec(e);
	}, VA({ a5 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a5, a3 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a5, a2 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a5, a1 }), Op([&] (e)
	{
		PRED_digit_1_static_exec(e);
	}, VA({ a6 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a6, a5 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a6, a3 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a6, a2 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a6, a1 }), Op([&] (e)
	{
		PRED_sumdigit_5_static_exec(e);
	}, VA({ a4, a5, a6, a2, a7 }), Op([&] (e)
	{
		PRED_digit_1_static_exec(e);
	}, VA({ a8 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a8, a6 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a8, a5 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a8, a3 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a8, a2 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a8, a1 }), Op([&] (e)
	{
		PRED_sumdigit_5_static_exec(e);
	}, VA({ a7, a2, a8, a5, a9 }), Op([&] (e)
	{
		PRED_leftdigit_1_static_exec(e);
	}, VA({ a10 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a10, a8 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a10, a6 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a10, a5 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a10, a3 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a10, a2 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a10, a1 }), Op([&] (e)
	{
		PRED_leftdigit_1_static_exec(e);
	}, VA({ a11 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a10 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a8 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a6 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a5 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a3 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a2 }), Op([&] (e)
	{
		FILE_builtins::PRED_$arith_not_equal_2_static_exec(e);
	}, VA({ a11, a1 }), Op([&] (e)
	{
		PRED_sumdigit_5_static_exec(e);
	}, VA({ a9, a10, a11, a8, a11 }), Failure::fail_0)))))))))))))))))))))))))))))))))))));
	}

	Operation FILE_sendmore::top_0_2(Prolog* m)
	{
	// top:-true
		Operation cont;
		cont = m->cont;
	// top:-[]
		return cont;
	}

SymbolTerm* const  FILE_sendmore::FUNCTOR_$002D_2 = F("-",2);

	Operation FILE_sendmore::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_sendmore::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_1(m);
	}

	Operation FILE_sendmore::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_2(m);
	}

	Operation FILE_sendmore::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_1(Prolog* m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl'(A,B,C):-C<10,!,A=C,B=0
		 Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl'(A,B,C):-['$get_level'(D),E is 10,'$less_than'(C,E),'$cut'(D),'$unify'(A,C),'$unify'(B,0)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
		//START inline expansion of a(5)is@(int_10)
		if(!a5->unify(Arithmetic::evaluate(int_10), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $less_than(a(3),a(5))
		if(Arithmetic::evaluate(a3)->arithCompareTo(Arithmetic::evaluate(a5)) >= 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
				  m->cut(a4->intValue());
		//END inline expansion
		//START inline expansion of $unify(a(1),a(3))
		if(!a1->unify(a3, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(2),@(int_0))
		if(!a2->unify(int_0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_sendmore::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_2(Prolog* m)
	{
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl'(A,B,C):-A is C-10,B=1
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl'(A,B,C):-[A is C-10,'$unify'(B,1)]
	// put_str_args([a(3),@(int_10)],y(1)),put_str(@('FUNCTOR_$002D_2'),y(1),a(4))
		a4 = S(FUNCTOR_$002D_2, { a3, int_10 });
		 ;
		//START inline expansion of a(1)is a(4)
		if(!a1->unify(Arithmetic::evaluate(a4), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $unify(a(2),@(int_1))
		if(!a2->unify(int_1, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

SymbolTerm* const  FILE_sendmore::FUNCTOR_$002B_2 = F("+",2);

	Operation FILE_sendmore::PRED_sumdigit_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// sumdigit(A,B,C,D,E):-F is A+B+C,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl'(D,E,F)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		a5 = LARG[4];
	// sumdigit(A,B,C,D,E):-[F is A+B+C,'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl'(D,E,F)]
		a6 = V(m);
	// put_str_args([a(1),a(2)],y(1)),put_str(@('FUNCTOR_$002B_2'),y(1),a(7))
		a7 = S(FUNCTOR_$002B_2, { a1, a2 });
		 ;
	// put_str_args([a(7),a(3)],y(2)),put_str(@('FUNCTOR_$002B_2'),y(2),a(8))
		a8 = S(FUNCTOR_$002B_2, { a7, a3 });
		 ;
		//START inline expansion of a(6)is a(8)
		if(!a6->unify(Arithmetic::evaluate(a8), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (e)
		{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_static_exec(e);
		}, VA({ a4, a5, a6 }), cont);
	}

	Operation FILE_sendmore::PRED_digit_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_sendmore::digit_1_var, FILE_sendmore::digit_1_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, Failure::fail_0);
	}

	Operation FILE_sendmore::digit_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_sendmore::digit_1_var_1);
		return digit_1_1(m);
	}

	Operation FILE_sendmore::digit_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_2);
		return digit_1_2(m);
	}

	Operation FILE_sendmore::digit_1_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_3);
		return digit_1_3(m);
	}

	Operation FILE_sendmore::digit_1_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_4);
		return digit_1_4(m);
	}

	Operation FILE_sendmore::digit_1_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_5);
		return digit_1_5(m);
	}

	Operation FILE_sendmore::digit_1_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_6);
		return digit_1_6(m);
	}

	Operation FILE_sendmore::digit_1_var_6(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_7);
		return digit_1_7(m);
	}

	Operation FILE_sendmore::digit_1_var_7(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_8);
		return digit_1_8(m);
	}

	Operation FILE_sendmore::digit_1_var_8(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::digit_1_var_9);
		return digit_1_9(m);
	}

	Operation FILE_sendmore::digit_1_var_9(Prolog* m)
	{
		m->trust(nullptr);
		return digit_1_10(m);
	}

	Operation FILE_sendmore::digit_1_1(Prolog* m)
	{
	// digit(0):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(0):-[]
		if(!int_0->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_2(Prolog* m)
	{
	// digit(1):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(1):-[]
		if(!int_1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_3(Prolog* m)
	{
	// digit(2):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(2):-[]
		if(!int_2->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_4(Prolog* m)
	{
	// digit(3):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(3):-[]
		if(!int_3->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_5(Prolog* m)
	{
	// digit(4):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(4):-[]
		if(!int_4->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_6(Prolog* m)
	{
	// digit(5):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(5):-[]
		if(!int_5->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_7(Prolog* m)
	{
	// digit(6):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(6):-[]
		if(!int_6->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_8(Prolog* m)
	{
	// digit(7):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(7):-[]
		if(!int_7->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_9(Prolog* m)
	{
	// digit(8):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(8):-[]
		if(!int_8->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::digit_1_10(Prolog* m)
	{
	// digit(9):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// digit(9):-[]
		if(!int_9->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::PRED_leftdigit_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_sendmore::leftdigit_1_var, FILE_sendmore::leftdigit_1_var, Failure::fail_0, Failure::fail_0, Failure::fail_0, Failure::fail_0);
	}

	Operation FILE_sendmore::leftdigit_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_sendmore::leftdigit_1_var_1);
		return leftdigit_1_1(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_2);
		return leftdigit_1_2(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_3);
		return leftdigit_1_3(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_4);
		return leftdigit_1_4(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_5);
		return leftdigit_1_5(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_6);
		return leftdigit_1_6(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_6(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_7);
		return leftdigit_1_7(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_7(Prolog* m)
	{
		m->retry(nullptr, FILE_sendmore::leftdigit_1_var_8);
		return leftdigit_1_8(m);
	}

	Operation FILE_sendmore::leftdigit_1_var_8(Prolog* m)
	{
		m->trust(nullptr);
		return leftdigit_1_9(m);
	}

	Operation FILE_sendmore::leftdigit_1_1(Prolog* m)
	{
	// leftdigit(1):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(1):-[]
		if(!int_1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_2(Prolog* m)
	{
	// leftdigit(2):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(2):-[]
		if(!int_2->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_3(Prolog* m)
	{
	// leftdigit(3):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(3):-[]
		if(!int_3->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_4(Prolog* m)
	{
	// leftdigit(4):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(4):-[]
		if(!int_4->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_5(Prolog* m)
	{
	// leftdigit(5):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(5):-[]
		if(!int_5->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_6(Prolog* m)
	{
	// leftdigit(6):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(6):-[]
		if(!int_6->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_7(Prolog* m)
	{
	// leftdigit(7):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(7):-[]
		if(!int_7->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_8(Prolog* m)
	{
	// leftdigit(8):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(8):-[]
		if(!int_8->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_sendmore::leftdigit_1_9(Prolog* m)
	{
	// leftdigit(9):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// leftdigit(9):-[]
		if(!int_9->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	FILE_sendmore::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_sendmore::StaticConstructor FILE_sendmore::staticConstructor;

	void FILE_sendmore::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_sendmore::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/sendmore.pl","$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl",3,FILE_sendmore::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Fbench$002Fsendmore$002Epl_3_static_exec);
	   PredTable::registerBuiltin("sumdigit",5,FILE_sendmore::PRED_sumdigit_5_static_exec);
	   PredTable::registerBuiltin("digit",1,FILE_sendmore::PRED_digit_1_static_exec);
	   PredTable::registerBuiltin("leftdigit",1,FILE_sendmore::PRED_leftdigit_1_static_exec);
	}
}
