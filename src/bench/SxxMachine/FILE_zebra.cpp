using namespace std;

#include "FILE_zebra.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
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
SymbolTerm* const  FILE_zebra::FUNCTOR_house_5 = F("house",5);
SymbolTerm* const  FILE_zebra::ATOM_red = SYM("red");
SymbolTerm* const  FILE_zebra::ATOM_english = SYM("english");
SymbolTerm* const  FILE_zebra::ATOM_spanish = SYM("spanish");
SymbolTerm* const  FILE_zebra::ATOM_dog = SYM("dog");
SymbolTerm* const  FILE_zebra::ATOM_green = SYM("green");
SymbolTerm* const  FILE_zebra::ATOM_coffee = SYM("coffee");
SymbolTerm* const  FILE_zebra::ATOM_ukrainian = SYM("ukrainian");
SymbolTerm* const  FILE_zebra::ATOM_tea = SYM("tea");
SymbolTerm* const  FILE_zebra::ATOM_ivory = SYM("ivory");
SymbolTerm* const  FILE_zebra::ATOM_snails = SYM("snails");
SymbolTerm* const  FILE_zebra::ATOM_winstons = SYM("winstons");
SymbolTerm* const  FILE_zebra::ATOM_yellow = SYM("yellow");
SymbolTerm* const  FILE_zebra::ATOM_kools = SYM("kools");
SymbolTerm* const  FILE_zebra::ATOM_milk = SYM("milk");
SymbolTerm* const  FILE_zebra::ATOM_norwegian = SYM("norwegian");
SymbolTerm* const  FILE_zebra::ATOM_chesterfields = SYM("chesterfields");
SymbolTerm* const  FILE_zebra::ATOM_fox = SYM("fox");
SymbolTerm* const  FILE_zebra::ATOM_horse = SYM("horse");
SymbolTerm* const  FILE_zebra::ATOM_orange_juice = SYM("orange_juice");
SymbolTerm* const  FILE_zebra::ATOM_lucky_strikes = SYM("lucky_strikes");
SymbolTerm* const  FILE_zebra::ATOM_japanese = SYM("japanese");
SymbolTerm* const  FILE_zebra::ATOM_parliaments = SYM("parliaments");
SymbolTerm* const  FILE_zebra::ATOM_blue = SYM("blue");
SymbolTerm* const  FILE_zebra::ATOM_zebra = SYM("zebra");
SymbolTerm* const  FILE_zebra::ATOM_water = SYM("water");

	Operation FILE_zebra::PRED_top_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// top:-houses(A),member(house(red,english,B,C,D),A),member(house(E,spanish,dog,F,G),A),member(house(green,H,I,coffee,J),A),member(house(K,ukrainian,L,tea,M),A),right_of(house(green,N,O,P,Q),house(ivory,R,S,T,U),A),member(house(V,W,snails,X,winstons),A),member(house(yellow,Y,Z,A1,kools),A),A=[B1,C1,house(D1,E1,F1,milk,G1),H1,I1],A=[house(J1,norwegian,K1,L1,M1)|N1],next_to(house(O1,P1,Q1,R1,chesterfields),house(S1,T1,fox,U1,V1),A),next_to(house(W1,X1,Y1,Z1,kools),house(A2,B2,horse,C2,D2),A),member(house(E2,F2,G2,orange_juice,lucky_strikes),A),member(house(H2,japanese,I2,J2,parliaments),A),next_to(house(K2,norwegian,L2,M2,N2),house(blue,O2,P2,Q2,R2),A),member(house(S2,T2,zebra,U2,V2),A),member(house(W2,X2,Y2,water,Z2),A)
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12,* a13,* a14,* a15,* a16,* a17,* a18,* a19,* a20,* a21,* a22,* a23,* a24,* a25,* a26,* a27;
		Operation p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
	// top:-[houses(A),member(house(red,english,B,C,D),A),member(house(E,spanish,dog,F,G),A),member(house(green,H,I,coffee,J),A),member(house(K,ukrainian,L,tea,M),A),right_of(house(green,N,O,P,Q),house(ivory,R,S,T,U),A),member(house(V,W,snails,X,winstons),A),member(house(yellow,Y,Z,A1,kools),A),'$unify'(A,[B1,C1,house(D1,E1,F1,milk,G1),H1,I1]),'$unify'(A,[house(J1,norwegian,K1,L1,M1)|N1]),next_to(house(O1,P1,Q1,R1,chesterfields),house(S1,T1,fox,U1,V1),A),next_to(house(W1,X1,Y1,Z1,kools),house(A2,B2,horse,C2,D2),A),member(house(E2,F2,G2,orange_juice,lucky_strikes),A),member(house(H2,japanese,I2,J2,parliaments),A),next_to(house(K2,norwegian,L2,M2,N2),house(blue,O2,P2,Q2,R2),A),member(house(S2,T2,zebra,U2,V2),A),member(house(W2,X2,Y2,water,Z2),A)]
		a1 = V(m);
	// put_str_args([@('ATOM_red'),@('ATOM_english'),void,void,void],y(1)),put_str(@('FUNCTOR_house_5'),y(1),a(2))
		a2 = S(FUNCTOR_house_5, ATOM_red, ATOM_english, V(m), V(m), V(m));
		 ;
	// put_str_args([void,@('ATOM_spanish'),@('ATOM_dog'),void,void],y(2)),put_str(@('FUNCTOR_house_5'),y(2),a(3))
		a3 = S(FUNCTOR_house_5, V(m), ATOM_spanish, ATOM_dog, V(m), V(m));
		 ;
	// put_str_args([@('ATOM_green'),void,void,@('ATOM_coffee'),void],y(3)),put_str(@('FUNCTOR_house_5'),y(3),a(4))
		a4 = S(FUNCTOR_house_5, ATOM_green, V(m), V(m), ATOM_coffee, V(m));
		 ;
	// put_str_args([void,@('ATOM_ukrainian'),void,@('ATOM_tea'),void],y(4)),put_str(@('FUNCTOR_house_5'),y(4),a(5))
		a5 = S(FUNCTOR_house_5, V(m), ATOM_ukrainian, V(m), ATOM_tea, V(m));
		 ;
	// put_str_args([@('ATOM_green'),void,void,void,void],y(5)),put_str(@('FUNCTOR_house_5'),y(5),a(6))
		a6 = S(FUNCTOR_house_5, ATOM_green, V(m), V(m), V(m), V(m));
		 ;
	// put_str_args([@('ATOM_ivory'),void,void,void,void],y(6)),put_str(@('FUNCTOR_house_5'),y(6),a(7))
		a7 = S(FUNCTOR_house_5, ATOM_ivory, V(m), V(m), V(m), V(m));
		 ;
	// put_str_args([void,void,@('ATOM_snails'),void,@('ATOM_winstons')],y(7)),put_str(@('FUNCTOR_house_5'),y(7),a(8))
		a8 = S(FUNCTOR_house_5, V(m), V(m), ATOM_snails, V(m), ATOM_winstons);
		 ;
	// put_str_args([@('ATOM_yellow'),void,void,void,@('ATOM_kools')],y(8)),put_str(@('FUNCTOR_house_5'),y(8),a(9))
		a9 = S(FUNCTOR_house_5, ATOM_yellow, V(m), V(m), V(m), ATOM_kools);
		 ;
	// put_str_args([void,void,void,@('ATOM_milk'),void],y(9)),put_str(@('FUNCTOR_house_5'),y(9),a(10))
		a10 = S(FUNCTOR_house_5, V(m), V(m), V(m), ATOM_milk, V(m));
		 ;
		a11 = CONS(V(m), Prolog::Nil);
		a12 = CONS(V(m), a11);
		a13 = CONS(a10, a12);
		a14 = CONS(V(m), a13);
		a15 = CONS(V(m), a14);
	// put_str_args([void,@('ATOM_norwegian'),void,void,void],y(10)),put_str(@('FUNCTOR_house_5'),y(10),a(16))
		a16 = S(FUNCTOR_house_5, V(m), ATOM_norwegian, V(m), V(m), V(m));
		 ;
		a17 = CONS(a16, V(m));
	// put_str_args([void,void,void,void,@('ATOM_chesterfields')],y(11)),put_str(@('FUNCTOR_house_5'),y(11),a(18))
		a18 = S(FUNCTOR_house_5, V(m), V(m), V(m), V(m), ATOM_chesterfields);
		 ;
	// put_str_args([void,void,@('ATOM_fox'),void,void],y(12)),put_str(@('FUNCTOR_house_5'),y(12),a(19))
		a19 = S(FUNCTOR_house_5, V(m), V(m), ATOM_fox, V(m), V(m));
		 ;
	// put_str_args([void,void,void,void,@('ATOM_kools')],y(13)),put_str(@('FUNCTOR_house_5'),y(13),a(20))
		a20 = S(FUNCTOR_house_5, V(m), V(m), V(m), V(m), ATOM_kools);
		 ;
	// put_str_args([void,void,@('ATOM_horse'),void,void],y(14)),put_str(@('FUNCTOR_house_5'),y(14),a(21))
		a21 = S(FUNCTOR_house_5, V(m), V(m), ATOM_horse, V(m), V(m));
		 ;
	// put_str_args([void,void,void,@('ATOM_orange_juice'),@('ATOM_lucky_strikes')],y(15)),put_str(@('FUNCTOR_house_5'),y(15),a(22))
		a22 = S(FUNCTOR_house_5, V(m), V(m), V(m), ATOM_orange_juice, ATOM_lucky_strikes);
		 ;
	// put_str_args([void,@('ATOM_japanese'),void,void,@('ATOM_parliaments')],y(16)),put_str(@('FUNCTOR_house_5'),y(16),a(23))
		a23 = S(FUNCTOR_house_5, V(m), ATOM_japanese, V(m), V(m), ATOM_parliaments);
		 ;
	// put_str_args([void,@('ATOM_norwegian'),void,void,void],y(17)),put_str(@('FUNCTOR_house_5'),y(17),a(24))
		a24 = S(FUNCTOR_house_5, V(m), ATOM_norwegian, V(m), V(m), V(m));
		 ;
	// put_str_args([@('ATOM_blue'),void,void,void,void],y(18)),put_str(@('FUNCTOR_house_5'),y(18),a(25))
		a25 = S(FUNCTOR_house_5, ATOM_blue, V(m), V(m), V(m), V(m));
		 ;
	// put_str_args([void,void,@('ATOM_zebra'),void,void],y(19)),put_str(@('FUNCTOR_house_5'),y(19),a(26))
		a26 = S(FUNCTOR_house_5, V(m), V(m), ATOM_zebra, V(m), V(m));
		 ;
	// put_str_args([void,void,void,@('ATOM_water'),void],y(20)),put_str(@('FUNCTOR_house_5'),y(20),a(27))
		a27 = S(FUNCTOR_house_5, V(m), V(m), V(m), ATOM_water, V(m));
		 ;
		return Op([&] (e)
		{
		PRED_houses_1_static_exec(e);
		}, VA({ a1 }), Op([&] (e)
		{
		PRED_member_2_static_exec(e);
	}, VA({ a2, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a3, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a4, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a5, a1 }), Op([&] (e)
	{
		PRED_right_of_3_static_exec(e);
	}, VA({ a6, a7, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a8, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a9, a1 }), Op([&] (e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({ a1, a15 }), Op([&] (e)
	{
		FILE_builtins::PRED_$unify_2_static_exec(e);
	}, VA({ a1, a17 }), Op([&] (e)
	{
		PRED_next_to_3_static_exec(e);
	}, VA({ a18, a19, a1 }), Op([&] (e)
	{
		PRED_next_to_3_static_exec(e);
	}, VA({ a20, a21, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a22, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a23, a1 }), Op([&] (e)
	{
		PRED_next_to_3_static_exec(e);
	}, VA({ a24, a25, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a26, a1 }), Op([&] (e)
	{
		PRED_member_2_static_exec(e);
	}, VA({ a27, a1 }), cont)))))))))))))))));
	}

	Operation FILE_zebra::PRED_houses_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// houses([house(A,B,C,D,E),house(F,G,H,I,J),house(K,L,M,N,O),house(P,Q,R,S,T),house(U,V,W,X,Y)]):-true
		m->setB0();
		 Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		a1 = LARG[0];
	// houses([house(A,B,C,D,E),house(F,G,H,I,J),house(K,L,M,N,O),house(P,Q,R,S,T),house(U,V,W,X,Y)]):-[]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a2 = argz[0];
			a3 = argz[1];
		} else if(a1->isVar())
		{
			a2 = V(m);
			a3 = V(m);
			 a1->bind(CONS(a2, a3), m->trail);
		} else
		{
			return m->fail();
		}
		a2 = a2->dref();
			if(!a2->unify(C(FUNCTOR_house_5, V(m), V(m), V(m), V(m), V(m)), m->trail))
			{
				return m->fail();
			}
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
		a4 = a4->dref();
			if(!a4->unify(C(FUNCTOR_house_5, V(m), V(m), V(m), V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
			a7 = argz[1];
		} else if(a5->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			 a5->bind(CONS(a6, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
			if(!a6->unify(C(FUNCTOR_house_5, V(m), V(m), V(m), V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			a8 = argz[0];
			a9 = argz[1];
		} else if(a7->isVar())
		{
			a8 = V(m);
			a9 = V(m);
			 a7->bind(CONS(a8, a9), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = a8->dref();
			if(!a8->unify(C(FUNCTOR_house_5, V(m), V(m), V(m), V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		a9 = a9->dref();
		if(a9->isCons())
		{
			std::vector<Term*> argz = VA({ a9->car(), a9->cdr() });
			a10 = argz[0];
			if(!Prolog::Nil->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a9->isVar())
		{
			a10 = V(m);
			 a9->bind(CONS(a10, Prolog::Nil), m->trail);
		} else
		{
			return m->fail();
		}
		a10 = a10->dref();
			if(!a10->unify(C(FUNCTOR_house_5, V(m), V(m), V(m), V(m), V(m)), m->trail))
			{
				return m->fail();
			}
		return cont;
	}

	Operation FILE_zebra::PRED_right_of_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return right_of_3_top(m);
	}

	Operation FILE_zebra::right_of_3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_zebra::right_of_3_sub_1);
		return right_of_3_1(m);
	}

	Operation FILE_zebra::right_of_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return right_of_3_2(m);
	}

	Operation FILE_zebra::right_of_3_1(Prolog* m)
	{
	// right_of(A,B,[B,A|C]):-true
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// right_of(A,B,[B,A|C]):-[]
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
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			 a4->bind(CONS(a1, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_zebra::right_of_3_2(Prolog* m)
	{
	// right_of(A,B,[C|D]):-right_of(A,B,D)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// right_of(A,B,[C|D]):-[right_of(A,B,D)]
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
		return right_of_3_top(m);
	}

	Operation FILE_zebra::PRED_next_to_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return next_to_3_top(m);
	}

	Operation FILE_zebra::next_to_3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_zebra::next_to_3_sub_1);
		return next_to_3_1(m);
	}

	Operation FILE_zebra::next_to_3_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_zebra::next_to_3_sub_2);
		return next_to_3_2(m);
	}

	Operation FILE_zebra::next_to_3_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return next_to_3_3(m);
	}

	Operation FILE_zebra::next_to_3_1(Prolog* m)
	{
	// next_to(A,B,[A,B|C]):-true
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// next_to(A,B,[A,B|C]):-[]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a4 = argz[1];
		} else if(a3->isVar())
		{
			a4 = V(m);
			 a3->bind(CONS(a1, a4), m->trail);
		} else
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!a2->unify(argz[0], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			 a4->bind(CONS(a2, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_zebra::next_to_3_2(Prolog* m)
	{
	// next_to(A,B,[B,A|C]):-true
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// next_to(A,B,[B,A|C]):-[]
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
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			 a4->bind(CONS(a1, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_zebra::next_to_3_3(Prolog* m)
	{
	// next_to(A,B,[C|D]):-next_to(A,B,D)
		 Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
	// next_to(A,B,[C|D]):-[next_to(A,B,D)]
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
		return next_to_3_top(m);
	}

	Operation FILE_zebra::PRED_member_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		return member_2_top(m);
	}

	Operation FILE_zebra::member_2_top(Prolog* m)
	{
		m->setB0();
		m->jtry2(nullptr, FILE_zebra::member_2_sub_1);
		return member_2_1(m);
	}

	Operation FILE_zebra::member_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return member_2_2(m);
	}

	Operation FILE_zebra::member_2_1(Prolog* m)
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

	Operation FILE_zebra::member_2_2(Prolog* m)
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

	Operation FILE_zebra::PRED_print_houses_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_zebra::print_houses_1_var, Failure::fail_0, Failure::fail_0, FILE_zebra::print_houses_1_2, Failure::fail_0, FILE_zebra::print_houses_1_1);
	}

	Operation FILE_zebra::print_houses_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_zebra::print_houses_1_var_1);
		return print_houses_1_1(m);
	}

	Operation FILE_zebra::print_houses_1_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return print_houses_1_2(m);
	}

	Operation FILE_zebra::print_houses_1_1(Prolog* m)
	{
	// print_houses([A|B]):-!,write(A),nl,print_houses(B)
		 Term* a1,* a2,* a3;
		Operation p1, p2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// print_houses([A|B]):-['$neck_cut',write(A),nl,print_houses(B)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a2 = argz[0];
			a3 = argz[1];
		} else if(a1->isVar())
		{
			a2 = V(m);
			a3 = V(m);
			 a1->bind(CONS(a2, a3), m->trail);
		} else
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (e)
		{
		FILE_builtins::PRED_write_1_static_exec(e);
		}, VA({ a2 }), Op([&] (e)
		{
		FILE_cafeteria::PRED_nl_0_static_exec(e);
	}, VA(), Op([&] (e)
	{
		PRED_print_houses_1_static_exec(e);
	}, VA({ a3 }), cont)));
	}

	Operation FILE_zebra::print_houses_1_2(Prolog* m)
	{
	// print_houses([]):-true
		 Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
	// print_houses([]):-[]
		if(!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	FILE_zebra::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_zebra::StaticConstructor FILE_zebra::staticConstructor;

	void FILE_zebra::loadPreds()
	{
	   PredTable::registerBuiltin("top",0,FILE_zebra::PRED_top_0_static_exec);
	   PredTable::registerBuiltin("houses",1,FILE_zebra::PRED_houses_1_static_exec);
	   PredTable::registerBuiltin("right_of",3,FILE_zebra::PRED_right_of_3_static_exec);
	   PredTable::registerBuiltin("next_to",3,FILE_zebra::PRED_next_to_3_static_exec);
	   PredTable::registerBuiltin("member",2,FILE_zebra::PRED_member_2_static_exec);
	   PredTable::registerBuiltin("print_houses",1,FILE_zebra::PRED_print_houses_1_static_exec);
	}
}
