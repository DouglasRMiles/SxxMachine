using namespace std;

#include "FILE_lists.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine::library
{
//	import static SxxMachine.FILE_builtins.PRED_$equality_of_term_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$less_or_equal_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$unify_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_length_2_static_exec;
//	import static SxxMachine.Failure.fail_0;
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_sort_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_$skip_list_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_memberchk_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_pairs_keys_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_sort_4_static_exec;
//	import static SxxMachine.sxxtensions.PRED_succ_2_static_exec;
	using Arithmetic = SxxMachine::Arithmetic;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using PredTable = SxxMachine::PredTable;
	using Prolog = SxxMachine::Prolog;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;

	Operation FILE_lists::PRED_member_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// member(A,[B|C]):-member_(C,A,B)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// member(A,[B|C]):-[member_(C,A,B)]
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
		return Op([&] (Prolog* e)
		{
		PRED_member__3_static_exec(e);
		}, VA({ a4, a1, a3 }), cont);
	}

	Operation FILE_lists::PRED_member__3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return member__3_top(m);
	}

	Operation FILE_lists::member__3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::member__3_var, FILE_lists::member__3_1, FILE_lists::member__3_1, FILE_lists::member__3_1, FILE_lists::member__3_1, FILE_lists::member__3_var);
	}

	Operation FILE_lists::member__3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::member__3_var_1);
		return member__3_1(m);
	}

	Operation FILE_lists::member__3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return member__3_2(m);
	}

	Operation FILE_lists::member__3_1(Prolog* m)
	{
		// member_(A,B,B):-true
		Term* a2,* a3;
		Operation cont;
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// member_(A,B,B):-[]
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::member__3_2(Prolog* m)
	{
		// member_([A|B],C,D):-member_(B,C,A)
		Term* a1,* a2,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// member_([A|B],C,D):-[member_(B,C,A)]
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
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a4;
		m->cont = cont;
		return member__3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_append_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_append_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return append_3_top(m);
	}

	Operation FILE_lists::append_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::append_3_var, fail_0, fail_0, FILE_lists::append_3_1, fail_0, FILE_lists::append_3_2);
	}

	Operation FILE_lists::append_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::append_3_var_1);
		return append_3_1(m);
	}

	Operation FILE_lists::append_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return append_3_2(m);
	}

	Operation FILE_lists::append_3_1(Prolog* m)
	{
		// append([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// append([],A,A):-[]
		if(!PRED_append_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::append_3_2(Prolog* m)
	{
		// append([A|B],C,[A|D]):-append(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// append([A|B],C,[A|D]):-[append(B,C,D)]
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
		return append_3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_append_2_s1 = SYM("list");

	Operation FILE_lists::PRED_append_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// append(A,B):-must_be(list,A),append_(A,B)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// append(A,B):-[must_be(list,A),append_(A,B)]
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ PRED_append_2_s1, a1 }), Op([&] (Prolog* e)
		{
		PRED_append__2_static_exec(e);
	}, VA({ a1, a2 }), cont));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_append__2_s1 = SYM("[]");

	Operation FILE_lists::PRED_append__2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_lists::append__2_var, fail_0, fail_0, FILE_lists::append__2_1, fail_0, FILE_lists::append__2_2);
	}

	Operation FILE_lists::append__2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_lists::append__2_var_1);
		return append__2_1(m);
	}

	Operation FILE_lists::append__2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return append__2_2(m);
	}

	Operation FILE_lists::append__2_1(Prolog* m)
	{
		// append_([],[]):-true
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// append_([],[]):-[]
		if(!PRED_append__2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_append__2_s1->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::append__2_2(Prolog* m)
	{
		// append_([A|B],C):-append(A,D,C),append_(B,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// append_([A|B],C):-[append(A,D,C),append_(B,D)]
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
		return Op([&] (Prolog* e)
		{
		PRED_append_3_static_exec(e);
		}, VA({ a3, a5, a2 }), Op([&] (Prolog* e)
		{
		PRED_append__2_static_exec(e);
	}, VA({ a4, a5 }), cont));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_prefix_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_prefix_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return prefix_2_top(m);
	}

	Operation FILE_lists::prefix_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::prefix_2_var, fail_0, fail_0, FILE_lists::prefix_2_1, fail_0, FILE_lists::prefix_2_2);
	}

	Operation FILE_lists::prefix_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_lists::prefix_2_var_1);
		return prefix_2_1(m);
	}

	Operation FILE_lists::prefix_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return prefix_2_2(m);
	}

	Operation FILE_lists::prefix_2_1(Prolog* m)
	{
		// prefix([],A):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// prefix([],A):-[]
		if(!PRED_prefix_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::prefix_2_2(Prolog* m)
	{
		// prefix([A|B],[A|C]):-prefix(B,C)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// prefix([A|B],[A|C]):-[prefix(B,C)]
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
			if(!a3->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a5 = V(m);
			a2->bind(CONS(a3, a5), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a4;
		m->AREGS[1] = a5;
		m->cont = cont;
		return prefix_2_top(m);
	}

	Operation FILE_lists::PRED_select_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return select_3_top(m);
	}

	Operation FILE_lists::select_3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_lists::select_3_sub_1);
		return select_3_1(m);
	}

	Operation FILE_lists::select_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return select_3_2(m);
	}

	Operation FILE_lists::select_3_1(Prolog* m)
	{
		// select(A,[A|B],B):-true
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// select(A,[A|B],B):-[]
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a4 = argz[1];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a2->bind(CONS(a1, a4), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a4->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::select_3_2(Prolog* m)
	{
		// select(A,[B|C],[B|D]):-select(A,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// select(A,[B|C],[B|D]):-[select(A,C,D)]
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
		m->AREGS[0] = a1;
		m->AREGS[1] = a5;
		m->AREGS[2] = a6;
		m->cont = cont;
		return select_3_top(m);
	}

	Operation FILE_lists::PRED_selectchk_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// selectchk(A,B,C):-select(A,B,D),!,C=D
		m->setB0();
		Term* a1,* a2,* a3,* a4,* a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// selectchk(A,B,C):-['$get_level'(D),select(A,B,E),'$cut'(D),'$unify'(C,E)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a5 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_select_3_static_exec(e);
		}, VA({ a1, a2, a5 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a4 }), Op([&] (Prolog* e)
	{
		PRED_$unify_2_static_exec(e);
	}, VA({ a3, a5 }), cont)));
	}

	Operation FILE_lists::PRED_select_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// select(A,B,C,D):-select_(B,A,C,D)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// select(A,B,C,D):-[select_(B,A,C,D)]
		return Op([&] (Prolog* e)
		{
		PRED_select__4_static_exec(e);
		}, VA({ a2, a1, a3, a4 }), cont);
	}

	Operation FILE_lists::PRED_select__4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return select__4_top(m);
	}

	Operation FILE_lists::select__4_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::select__4_var, fail_0, fail_0, fail_0, fail_0, FILE_lists::select__4_var);
	}

	Operation FILE_lists::select__4_var(Prolog* m)
	{
		m->jtry4(nullptr, FILE_lists::select__4_var_1);
		return select__4_1(m);
	}

	Operation FILE_lists::select__4_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return select__4_2(m);
	}

	Operation FILE_lists::select__4_1(Prolog* m)
	{
		// select_([A|B],A,C,[C|B]):-true
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// select_([A|B],A,C,[C|B]):-[]
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
		if(!a5->unify(a2, m->trail))
		{
			return m->fail();
		}
		a4 = a4->dref();
		if(a4->isCons())
		{
			std::vector<Term*> argz = VA({ a4->car(), a4->cdr() });
			if(!a3->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!a6->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a4->isVar())
		{
			a4->bind(CONS(a3, a6), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::select__4_2(Prolog* m)
	{
		// select_([A|B],C,D,[A|E]):-select_(B,C,D,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// select_([A|B],C,D,[A|E]):-[select_(B,C,D,E)]
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
		return select__4_top(m);
	}

	Operation FILE_lists::PRED_selectchk_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// selectchk(A,B,C,D):-select(A,B,C,D),!
		m->setB0();
		Term* a1,* a2,* a3,* a4,* a5;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		a4 = LARG[3];
		// selectchk(A,B,C,D):-['$get_level'(E),select(A,B,C,D),'$cut'(E)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_select_4_static_exec(e);
		}, VA({ a1, a2, a3, a4 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a5 }), cont));
	}

	Operation FILE_lists::PRED_nextto_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return nextto_3_top(m);
	}

	Operation FILE_lists::nextto_3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_lists::nextto_3_sub_1);
		return nextto_3_1(m);
	}

	Operation FILE_lists::nextto_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return nextto_3_2(m);
	}

	Operation FILE_lists::nextto_3_1(Prolog* m)
	{
		// nextto(A,B,[A,B|C]):-true
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nextto(A,B,[A,B|C]):-[]
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

	Operation FILE_lists::nextto_3_2(Prolog* m)
	{
		// nextto(A,B,[C|D]):-nextto(A,B,D)
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nextto(A,B,[C|D]):-[nextto(A,B,D)]
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
		return nextto_3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_delete_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_delete_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return delete_3_top(m);
	}

	Operation FILE_lists::delete_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::delete_3_var, fail_0, fail_0, FILE_lists::delete_3_1, fail_0, FILE_lists::delete_3_lis);
	}

	Operation FILE_lists::delete_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::delete_3_var_1);
		return delete_3_1(m);
	}

	Operation FILE_lists::delete_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::delete_3_var_2);
		return delete_3_2(m);
	}

	Operation FILE_lists::delete_3_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return delete_3_3(m);
	}

	Operation FILE_lists::delete_3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::delete_3_lis_1);
		return delete_3_2(m);
	}

	Operation FILE_lists::delete_3_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return delete_3_3(m);
	}

	Operation FILE_lists::delete_3_1(Prolog* m)
	{
		// delete([],A,[]):-true
		Term* a1,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// delete([],A,[]):-[]
		if(!PRED_delete_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_delete_3_s1->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::delete_3_2(Prolog* m)
	{
		// delete([A|B],C,D):-'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// delete([A|B],C,D):-['$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)]
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
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(e);
		}, VA({ a4, a5, a2, a3 }), cont);
	}

	Operation FILE_lists::delete_3_3(Prolog* m)
	{
		// delete([A|B],C,D):-D=[A|E],delete(B,C,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// delete([A|B],C,D):-['$unify'(D,[A|E]),delete(B,C,E)]
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
		a7 = CONS(a4, a6);
		//START inline expansion of $unify(a(3),a(7))
		if(!a3->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a6;
		m->cont = cont;
		return delete_3_top(m);
	}

	Operation FILE_lists::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_lists::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_1(m);
	}

	Operation FILE_lists::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_2(m);
	}

	Operation FILE_lists::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_1(Prolog* m)
	{
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B):-A\=B,!,fail
		Term* a1,* a2,* a3;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B):-['$get_level'(C),'$not_unifiable'(A,B),'$cut'(C),fail]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $not_unifiable(a(1),a(2))
		if(a1->unify(a2, m->trail))
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

	Operation FILE_lists::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_2(Prolog* m)
	{
		Operation cont;
		cont = m->cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B):-[]
		return cont;
	}

	Operation FILE_lists::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(m);
	}

	Operation FILE_lists::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(m);
	}

	Operation FILE_lists::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog* m)
	{
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,C),!,delete(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-['$get_level'(E),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,C),'$cut'(E),delete(B,C,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_static_exec(e);
		}, VA({ a1, a3 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a5 }), Op([&] (Prolog* e)
	{
		PRED_delete_3_static_exec(e);
	}, VA({ a2, a3, a4 }), cont)));
	}

	Operation FILE_lists::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog* m)
	{
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_lists::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_lists::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_sub_1);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_1(m);
	}

	Operation FILE_lists::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_2(m);
	}

	Operation FILE_lists::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_1(Prolog* m)
	{
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C):-integer(A),!,nth0_det(A,B,C)
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C):-['$get_level'(D),integer(A),'$cut'(D),nth0_det(A,B,C)]
		a4 = V(m);
		//START inline expansion of $get_level(a(4))
		if(!a4->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of integer(a(1))
		a1 = a1->dref();
		if(!(a1->isInteger()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(4))
		a4 = a4->dref();
		m->cut(a4->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_nth0_det_3_static_exec(e);
		}, VA({ a1, a2, a3 }), cont);
	}

	Operation FILE_lists::$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_2(Prolog* m)
	{
		// '$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_nth0_3_s1 = SYM("integer");

	Operation FILE_lists::PRED_nth0_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_lists::nth0_3_sub_1);
		return nth0_3_1(m);
	}

	Operation FILE_lists::nth0_3_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth0_3_sub_2);
		return nth0_3_2(m);
	}

	Operation FILE_lists::nth0_3_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return nth0_3_3(m);
	}

	Operation FILE_lists::nth0_3_1(Prolog* m)
	{
		// nth0(A,B,C):-'$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0(A,B,C):-['$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_static_exec(e);
		}, VA({ a1, a2, a3 }), cont);
	}

	Operation FILE_lists::nth0_3_2(Prolog* m)
	{
		// nth0(A,B,C):-'$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0(A,B,C):-['$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(e);
		}, VA({ a1, a2, a3, V(m), V(m) }), cont);
	}

	Operation FILE_lists::nth0_3_3(Prolog* m)
	{
		// nth0(A,B,C):-must_be(integer,A)
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// nth0(A,B,C):-[must_be(integer,A)]
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ PRED_nth0_3_s1, a1 }), cont);
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_s1 = optional<int>(0);

	Operation FILE_lists::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry5(nullptr, FILE_lists::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(m);
	}

	Operation FILE_lists::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(m);
	}

	Operation FILE_lists::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(Prolog* m)
	{
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-var(A),!,B=[D|E],nth_gen(E,C,D,0,A)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),'$unify'(B,[D|E]),nth_gen(E,C,D,0,A)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if(!a6->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(6))
		a6 = a6->dref();
		m->cut(a6->intValue());
		//END inline expansion
		a7 = CONS(a4, a5);
		//START inline expansion of $unify(a(2),a(7))
		if(!a2->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_nth_gen_5_static_exec(e);
		}, VA({ a5, a3, a4, PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_s1, a1 }), cont);
	}

	Operation FILE_lists::$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(Prolog* m)
	{
		// '$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_nth0_det_3_s1 = optional<int>(0);
SxxMachine::IntegerTerm* const  FILE_lists::int_1 = optional<int>(1);
SxxMachine::IntegerTerm* const  FILE_lists::int_2 = optional<int>(2);
SxxMachine::IntegerTerm* const  FILE_lists::int_3 = optional<int>(3);
SxxMachine::IntegerTerm* const  FILE_lists::int_4 = optional<int>(4);
SxxMachine::IntegerTerm* const  FILE_lists::int_5 = optional<int>(5);
SxxMachine::IntegerTerm* const  FILE_lists::int_6 = optional<int>(6);

	Operation FILE_lists::PRED_nth0_det_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return nth0_det_3_top(m);
	}

	Operation FILE_lists::nth0_det_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::nth0_det_3_var, FILE_lists::nth0_det_3_var, FILE_lists::nth0_det_3_7, FILE_lists::nth0_det_3_7, FILE_lists::nth0_det_3_7, FILE_lists::nth0_det_3_7);
	}

	Operation FILE_lists::nth0_det_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::nth0_det_3_var_1);
		return nth0_det_3_1(m);
	}

	Operation FILE_lists::nth0_det_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth0_det_3_var_2);
		return nth0_det_3_2(m);
	}

	Operation FILE_lists::nth0_det_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth0_det_3_var_3);
		return nth0_det_3_3(m);
	}

	Operation FILE_lists::nth0_det_3_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth0_det_3_var_4);
		return nth0_det_3_4(m);
	}

	Operation FILE_lists::nth0_det_3_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth0_det_3_var_5);
		return nth0_det_3_5(m);
	}

	Operation FILE_lists::nth0_det_3_var_5(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth0_det_3_var_6);
		return nth0_det_3_6(m);
	}

	Operation FILE_lists::nth0_det_3_var_6(Prolog* m)
	{
		m->trust(nullptr);
		return nth0_det_3_7(m);
	}

	Operation FILE_lists::nth0_det_3_1(Prolog* m)
	{
		// nth0_det(0,[A|B],A):-!
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(0,[A|B],A):-['$neck_cut']
		if(!PRED_nth0_det_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		if(a2->isCons())
		{
			std::vector<Term*> argz = VA({ a2->car(), a2->cdr() });
			a4 = argz[0];
		} else if(a2->isVar())
		{
			a4 = V(m);
			a2->bind(CONS(a4, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a4->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::nth0_det_3_2(Prolog* m)
	{
		// nth0_det(1,[A,B|C],B):-!
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(1,[A,B|C],B):-['$neck_cut']
		if(!int_1->unify(a1, m->trail))
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
		} else if(a4->isVar())
		{
			a5 = V(m);
			a4->bind(CONS(a5, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a5->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::nth0_det_3_3(Prolog* m)
	{
		// nth0_det(2,[A,B,C|D],C):-!
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(2,[A,B,C|D],C):-['$neck_cut']
		if(!int_2->unify(a1, m->trail))
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
			a5 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a4->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[0];
		} else if(a5->isVar())
		{
			a6 = V(m);
			a5->bind(CONS(a6, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a6->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::nth0_det_3_4(Prolog* m)
	{
		// nth0_det(3,[A,B,C,D|E],D):-!
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(3,[A,B,C,D|E],D):-['$neck_cut']
		if(!int_3->unify(a1, m->trail))
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
			a5 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a4->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[1];
		} else if(a5->isVar())
		{
			a6 = V(m);
			a5->bind(CONS(V(m), a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[0];
		} else if(a6->isVar())
		{
			a7 = V(m);
			a6->bind(CONS(a7, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a7->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::nth0_det_3_5(Prolog* m)
	{
		// nth0_det(4,[A,B,C,D,E|F],E):-!
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(4,[A,B,C,D,E|F],E):-['$neck_cut']
		if(!int_4->unify(a1, m->trail))
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
			a5 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a4->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[1];
		} else if(a5->isVar())
		{
			a6 = V(m);
			a5->bind(CONS(V(m), a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[1];
		} else if(a6->isVar())
		{
			a7 = V(m);
			a6->bind(CONS(V(m), a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			a8 = argz[0];
		} else if(a7->isVar())
		{
			a8 = V(m);
			a7->bind(CONS(a8, V(m)), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a8->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::nth0_det_3_6(Prolog* m)
	{
		// nth0_det(5,[A,B,C,D,E,F|G],F):-!
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(5,[A,B,C,D,E,F|G],F):-['$neck_cut']
		if(!int_5->unify(a1, m->trail))
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
			a5 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a4->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[1];
		} else if(a5->isVar())
		{
			a6 = V(m);
			a5->bind(CONS(V(m), a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[1];
		} else if(a6->isVar())
		{
			a7 = V(m);
			a6->bind(CONS(V(m), a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			a8 = argz[1];
		} else if(a7->isVar())
		{
			a8 = V(m);
			a7->bind(CONS(V(m), a8), m->trail);
		} else
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
		if(!a9->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::nth0_det_3_7(Prolog* m)
	{
		// nth0_det(A,[B,C,D,E,F,G|H],I):-J is A-6,J>=0,nth0_det(J,H,I)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth0_det(A,[B,C,D,E,F,G|H],I):-[J is A-6,K is 0,'$greater_or_equal'(J,K),nth0_det(J,H,I)]
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
			a5 = argz[1];
		} else if(a4->isVar())
		{
			a5 = V(m);
			a4->bind(CONS(V(m), a5), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			a6 = argz[1];
		} else if(a5->isVar())
		{
			a6 = V(m);
			a5->bind(CONS(V(m), a6), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(a6->isCons())
		{
			std::vector<Term*> argz = VA({ a6->car(), a6->cdr() });
			a7 = argz[1];
		} else if(a6->isVar())
		{
			a7 = V(m);
			a6->bind(CONS(V(m), a7), m->trail);
		} else
		{
			return m->fail();
		}
		a7 = a7->dref();
		if(a7->isCons())
		{
			std::vector<Term*> argz = VA({ a7->car(), a7->cdr() });
			a8 = argz[1];
		} else if(a7->isVar())
		{
			a8 = V(m);
			a7->bind(CONS(V(m), a8), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = a8->dref();
		if(a8->isCons())
		{
			std::vector<Term*> argz = VA({ a8->car(), a8->cdr() });
			a9 = argz[1];
		} else if(a8->isVar())
		{
			a9 = V(m);
			a8->bind(CONS(V(m), a9), m->trail);
		} else
		{
			return m->fail();
		}
		a10 = V(m);
		std::vector<Term*> y1 = VA({ a1, int_6 });
		a11 = S("-", y1);
		//START inline expansion of a(10)is a(11)
		if(!a10->unify(Arithmetic::evaluate(a11), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a12 = V(m);
		//START inline expansion of a(12)is si(1)
		if(!a12->unify(PRED_nth0_det_3_s1, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_or_equal(a(10),a(12))
		if(Arithmetic::evaluate(a10)->arithCompareTo(Arithmetic::evaluate(a12)) < 0)
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a10;
		m->AREGS[1] = a9;
		m->AREGS[2] = a3;
		m->cont = cont;
		return nth0_det_3_top(m);
	}

	Operation FILE_lists::PRED_nth_gen_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_lists::nth_gen_5_var, FILE_lists::nth_gen_5_1, FILE_lists::nth_gen_5_1, FILE_lists::nth_gen_5_1, FILE_lists::nth_gen_5_1, FILE_lists::nth_gen_5_var);
	}

	Operation FILE_lists::nth_gen_5_var(Prolog* m)
	{
		m->jtry5(nullptr, FILE_lists::nth_gen_5_var_1);
		return nth_gen_5_1(m);
	}

	Operation FILE_lists::nth_gen_5_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return nth_gen_5_2(m);
	}

	Operation FILE_lists::nth_gen_5_1(Prolog* m)
	{
		// nth_gen(A,B,B,C,C):-true
		Term* a2,* a3,* a4,* a5;
		Operation cont;
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// nth_gen(A,B,B,C,C):-[]
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		if(!a4->unify(a5, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::nth_gen_5_2(Prolog* m)
	{
		// nth_gen([A|B],C,D,E,F):-succ(E,G),nth_gen(B,C,A,G,F)
		Term* a1,* a2,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// nth_gen([A|B],C,D,E,F):-[succ(E,G),nth_gen(B,C,A,G,F)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a6 = argz[0];
			a7 = argz[1];
		} else if(a1->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			a1->bind(CONS(a6, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_succ_2_static_exec(e);
		}, VA({ a4, a8 }), Op([&] (Prolog* e)
		{
		PRED_nth_gen_5_static_exec(e);
	}, VA({ a7, a2, a6, a8, a5 }), cont));
	}

	Operation FILE_lists::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(m);
	}

	Operation FILE_lists::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(m);
	}

	Operation FILE_lists::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog* m)
	{
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-integer(A),!,D is A-1,nth0_det(D,B,C)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-['$get_level'(E),integer(A),'$cut'(E),D is A-1,nth0_det(D,B,C)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of integer(a(1))
		a1 = a1->dref();
		if(!(a1->isInteger()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({ a1, int_1 });
		a6 = S("-", y1);
		//START inline expansion of a(4)is a(6)
		if(!a4->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_nth0_det_3_static_exec(e);
		}, VA({ a4, a2, a3 }), cont);
	}

	Operation FILE_lists::$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog* m)
	{
		// '$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_nth1_3_s1 = SYM("integer");

	Operation FILE_lists::PRED_nth1_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_lists::nth1_3_sub_1);
		return nth1_3_1(m);
	}

	Operation FILE_lists::nth1_3_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::nth1_3_sub_2);
		return nth1_3_2(m);
	}

	Operation FILE_lists::nth1_3_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return nth1_3_3(m);
	}

	Operation FILE_lists::nth1_3_1(Prolog* m)
	{
		// nth1(A,B,C):-'$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth1(A,B,C):-['$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(e);
		}, VA({ a1, a2, a3, V(m) }), cont);
	}

	Operation FILE_lists::nth1_3_2(Prolog* m)
	{
		// nth1(A,B,C):-'$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// nth1(A,B,C):-['$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(e);
		}, VA({ a1, a2, a3, V(m), V(m) }), cont);
	}

	Operation FILE_lists::nth1_3_3(Prolog* m)
	{
		// nth1(A,B,C):-must_be(integer,A)
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// nth1(A,B,C):-[must_be(integer,A)]
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ PRED_nth1_3_s1, a1 }), cont);
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_s1 = optional<int>(1);

	Operation FILE_lists::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry5(nullptr, FILE_lists::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(m);
	}

	Operation FILE_lists::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(m);
	}

	Operation FILE_lists::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(Prolog* m)
	{
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-var(A),!,B=[D|E],nth_gen(E,C,D,1,A)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-['$get_level'(F),var(A),'$cut'(F),'$unify'(B,[D|E]),nth_gen(E,C,D,1,A)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if(!a6->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(6))
		a6 = a6->dref();
		m->cut(a6->intValue());
		//END inline expansion
		a7 = CONS(a4, a5);
		//START inline expansion of $unify(a(2),a(7))
		if(!a2->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_nth_gen_5_static_exec(e);
		}, VA({ a5, a3, a4, PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_s1, a1 }), cont);
	}

	Operation FILE_lists::$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(Prolog* m)
	{
		// '$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_nth0_4_s1 = optional<int>(0);
SxxMachine::SymbolTerm* const  FILE_lists::ATOM_nonneg = SYM("nonneg");

	Operation FILE_lists::PRED_nth0_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::nth0_4_sub_1);
		return nth0_4_1(m);
	}

	Operation FILE_lists::nth0_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return nth0_4_2(m);
	}

	Operation FILE_lists::nth0_4_1(Prolog* m)
	{
		// nth0(A,B,C,D):-var(A),!,generate_nth(0,A,B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// nth0(A,B,C,D):-['$get_level'(E),var(A),'$cut'(E),generate_nth(0,A,B,C,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_generate_nth_5_static_exec(e);
		}, VA({ PRED_nth0_4_s1, a1, a2, a3, a4 }), cont);
	}

	Operation FILE_lists::nth0_4_2(Prolog* m)
	{
		// nth0(A,B,C,D):-must_be(nonneg,A),find_nth0(A,B,C,D)
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// nth0(A,B,C,D):-[must_be(nonneg,A),find_nth0(A,B,C,D)]
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ ATOM_nonneg, a1 }), Op([&] (Prolog* e)
		{
		PRED_find_nth0_4_static_exec(e);
	}, VA({ a1, a2, a3, a4 }), cont));
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_nth1_4_s1 = optional<int>(1);
SxxMachine::SymbolTerm* const  FILE_lists::ATOM_positive_integer = SYM("positive_integer");

	Operation FILE_lists::PRED_nth1_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::nth1_4_sub_1);
		return nth1_4_1(m);
	}

	Operation FILE_lists::nth1_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return nth1_4_2(m);
	}

	Operation FILE_lists::nth1_4_1(Prolog* m)
	{
		// nth1(A,B,C,D):-var(A),!,generate_nth(1,A,B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// nth1(A,B,C,D):-['$get_level'(E),var(A),'$cut'(E),generate_nth(1,A,B,C,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_generate_nth_5_static_exec(e);
		}, VA({ PRED_nth1_4_s1, a1, a2, a3, a4 }), cont);
	}

	Operation FILE_lists::nth1_4_2(Prolog* m)
	{
		// nth1(A,B,C,D):-must_be(positive_integer,A),succ(E,A),find_nth0(E,B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// nth1(A,B,C,D):-[must_be(positive_integer,A),succ(E,A),find_nth0(E,B,C,D)]
		a5 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ ATOM_positive_integer, a1 }), Op([&] (Prolog* e)
		{
		PRED_succ_2_static_exec(e);
	}, VA({ a5, a1 }), Op([&] (Prolog* e)
	{
		PRED_find_nth0_4_static_exec(e);
	}, VA({ a5, a2, a3, a4 }), cont)));
	}

	Operation FILE_lists::PRED_generate_nth_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return generate_nth_5_top(m);
	}

	Operation FILE_lists::generate_nth_5_top(Prolog* m)
	{
		m->setB0();
		m->jtry5(nullptr, FILE_lists::generate_nth_5_sub_1);
		return generate_nth_5_1(m);
	}

	Operation FILE_lists::generate_nth_5_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return generate_nth_5_2(m);
	}

	Operation FILE_lists::generate_nth_5_1(Prolog* m)
	{
		// generate_nth(A,A,[B|C],B,C):-true
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// generate_nth(A,A,[B|C],B,C):-[]
		if(!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a6 = argz[0];
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			a3->bind(CONS(a6, a7), m->trail);
		} else
		{
			return m->fail();
		}
		if(!a6->unify(a4, m->trail))
		{
			return m->fail();
		}
		if(!a7->unify(a5, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::generate_nth_5_2(Prolog* m)
	{
		// generate_nth(A,B,[C|D],E,[C|F]):-G is A+1,generate_nth(G,B,D,E,F)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// generate_nth(A,B,[C|D],E,[C|F]):-[G is A+1,generate_nth(G,B,D,E,F)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			a6 = argz[0];
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			a3->bind(CONS(a6, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a5 = a5->dref();
		if(a5->isCons())
		{
			std::vector<Term*> argz = VA({ a5->car(), a5->cdr() });
			if(!a6->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a8 = argz[1];
		} else if(a5->isVar())
		{
			a8 = V(m);
			a5->bind(CONS(a6, a8), m->trail);
		} else
		{
			return m->fail();
		}
		a9 = V(m);
		std::vector<Term*> y1 = VA({ a1, int_1 });
		a10 = S("+", y1);
		//START inline expansion of a(9)is a(10)
		if(!a9->unify(Arithmetic::evaluate(a10), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a9;
		m->AREGS[1] = a2;
		m->AREGS[2] = a7;
		m->AREGS[3] = a4;
		m->AREGS[4] = a8;
		m->cont = cont;
		return generate_nth_5_top(m);
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_find_nth0_4_s1 = optional<int>(0);

	Operation FILE_lists::PRED_find_nth0_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return find_nth0_4_top(m);
	}

	Operation FILE_lists::find_nth0_4_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::find_nth0_4_var, FILE_lists::find_nth0_4_var, FILE_lists::find_nth0_4_2, FILE_lists::find_nth0_4_2, FILE_lists::find_nth0_4_2, FILE_lists::find_nth0_4_2);
	}

	Operation FILE_lists::find_nth0_4_var(Prolog* m)
	{
		m->jtry4(nullptr, FILE_lists::find_nth0_4_var_1);
		return find_nth0_4_1(m);
	}

	Operation FILE_lists::find_nth0_4_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return find_nth0_4_2(m);
	}

	Operation FILE_lists::find_nth0_4_1(Prolog* m)
	{
		// find_nth0(0,[A|B],A,B):-!
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// find_nth0(0,[A|B],A,B):-['$neck_cut']
		if(!PRED_find_nth0_4_s1->unify(a1, m->trail))
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
		if(!a5->unify(a3, m->trail))
		{
			return m->fail();
		}
		if(!a6->unify(a4, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::find_nth0_4_2(Prolog* m)
	{
		// find_nth0(A,[B|C],D,[B|E]):-F is A-1,find_nth0(F,C,D,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// find_nth0(A,[B|C],D,[B|E]):-[F is A-1,find_nth0(F,C,D,E)]
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
		a8 = V(m);
		std::vector<Term*> y1 = VA({ a1, int_1 });
		a9 = S("-", y1);
		//START inline expansion of a(8)is a(9)
		if(!a8->unify(Arithmetic::evaluate(a9), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a8;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->AREGS[3] = a7;
		m->cont = cont;
		return find_nth0_4_top(m);
	}

	Operation FILE_lists::PRED_last_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// last([A|B],C):-last_(B,A,C)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// last([A|B],C):-[last_(B,A,C)]
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
		return Op([&] (Prolog* e)
		{
		PRED_last__3_static_exec(e);
		}, VA({ a4, a3, a2 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_last__3_s1 = SYM("[]");

	Operation FILE_lists::PRED_last__3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return last__3_top(m);
	}

	Operation FILE_lists::last__3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::last__3_var, fail_0, fail_0, FILE_lists::last__3_1, fail_0, FILE_lists::last__3_2);
	}

	Operation FILE_lists::last__3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::last__3_var_1);
		return last__3_1(m);
	}

	Operation FILE_lists::last__3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return last__3_2(m);
	}

	Operation FILE_lists::last__3_1(Prolog* m)
	{
		// last_([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// last_([],A,A):-[]
		if(!PRED_last__3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::last__3_2(Prolog* m)
	{
		// last_([A|B],C,D):-last_(B,A,D)
		Term* a1,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// last_([A|B],C,D):-[last_(B,A,D)]
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
		m->AREGS[0] = a5;
		m->AREGS[1] = a4;
		m->AREGS[2] = a3;
		m->cont = cont;
		return last__3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_proper_length_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_proper_length_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// proper_length(A,B):-'$skip_list'(C,A,D),D==[],B=C
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// proper_length(A,B):-['$skip_list'(C,A,D),'$equality_of_term'(D,[]),'$unify'(B,C)]
		a3 = V(m);
		a4 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_$skip_list_3_static_exec(e);
		}, VA({ a3, a1, a4 }), Op([&] (Prolog* e)
		{
		PRED_$equality_of_term_2_static_exec(e);
	}, VA({ a4, PRED_proper_length_2_s1 }), Op([&] (Prolog* e)
	{
		PRED_$unify_2_static_exec(e);
	}, VA({ a2, a3 }), cont)));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_same_length_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_same_length_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return same_length_2_top(m);
	}

	Operation FILE_lists::same_length_2_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::same_length_2_var, fail_0, fail_0, FILE_lists::same_length_2_1, fail_0, FILE_lists::same_length_2_2);
	}

	Operation FILE_lists::same_length_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_lists::same_length_2_var_1);
		return same_length_2_1(m);
	}

	Operation FILE_lists::same_length_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return same_length_2_2(m);
	}

	Operation FILE_lists::same_length_2_1(Prolog* m)
	{
		// same_length([],[]):-true
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// same_length([],[]):-[]
		if(!PRED_same_length_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_same_length_2_s1->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::same_length_2_2(Prolog* m)
	{
		// same_length([A|B],[C|D]):-same_length(B,D)
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// same_length([A|B],[C|D]):-[same_length(B,D)]
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
		m->AREGS[0] = a3;
		m->AREGS[1] = a4;
		m->cont = cont;
		return same_length_2_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_reverse_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_reverse_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// reverse(A,B):-reverse(A,[],B,B)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// reverse(A,B):-[reverse(A,[],B,B)]
		return Op([&] (Prolog* e)
		{
		PRED_reverse_4_static_exec(e);
		}, VA({ a1, PRED_reverse_2_s1, a2, a2 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_reverse_4_s1 = SYM("[]");

	Operation FILE_lists::PRED_reverse_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return reverse_4_top(m);
	}

	Operation FILE_lists::reverse_4_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::reverse_4_var, fail_0, fail_0, FILE_lists::reverse_4_1, fail_0, FILE_lists::reverse_4_2);
	}

	Operation FILE_lists::reverse_4_var(Prolog* m)
	{
		m->jtry4(nullptr, FILE_lists::reverse_4_var_1);
		return reverse_4_1(m);
	}

	Operation FILE_lists::reverse_4_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return reverse_4_2(m);
	}

	Operation FILE_lists::reverse_4_1(Prolog* m)
	{
		// reverse([],A,A,[]):-true
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// reverse([],A,A,[]):-[]
		if(!PRED_reverse_4_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		if(!PRED_reverse_4_s1->unify(a4, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::reverse_4_2(Prolog* m)
	{
		// reverse([A|B],C,D,[E|F]):-reverse(B,[A|C],D,F)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// reverse([A|B],C,D,[E|F]):-[reverse(B,[A|C],D,F)]
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
			a7 = argz[1];
		} else if(a4->isVar())
		{
			a7 = V(m);
			a4->bind(CONS(V(m), a7), m->trail);
		} else
		{
			return m->fail();
		}
		a8 = CONS(a5, a2);
		m->AREGS[0] = a6;
		m->AREGS[1] = a8;
		m->AREGS[2] = a3;
		m->AREGS[3] = a7;
		m->cont = cont;
		return reverse_4_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_s1 = SYM("[]");
SxxMachine::SymbolTerm* const  FILE_lists::ATOM_list = SYM("list");

	Operation FILE_lists::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry7(nullptr, FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_1);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_1(m);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_2);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_2(m);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_2(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_3);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_3(m);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_3(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_4);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_4(m);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_sub_4(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_5(m);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_1(Prolog* m)
	{
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-(D==[],F==[]),!,C==E
		Term* a3,* a4,* a5,* a6,* a8;
		Operation cont;
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-['$get_level'(H),'$equality_of_term'(D,[]),'$equality_of_term'(F,[]),'$cut'(H),'$equality_of_term'(C,E)]
		a8 = V(m);
		//START inline expansion of $get_level(a(8))
		if(!a8->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(4),s(1))
		a4 = a4->dref();
		if(!a4->equalsTerm(PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(6),s(1))
		a6 = a6->dref();
		if(!a6->equalsTerm(PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(8))
		a8 = a8->dref();
		m->cut(a8->intValue());
		//END inline expansion
		//START inline expansion of $equality_of_term(a(3),a(5))
		a3 = a3->dref();
		a5 = a5->dref();
		if(!a3->equalsTerm(a5))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_2(Prolog* m)
	{
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-'$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,D,E,F)
		Term* a1,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-['$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,D,E,F)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(e);
		}, VA({ a1, a4, a5, a6 }), cont);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_3(Prolog* m)
	{
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-'$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(B,C,D,F)
		Term* a2,* a3,* a4,* a6;
		Operation cont;
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a6 = m->AREGS[5];
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-['$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(B,C,D,F)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(e);
		}, VA({ a2, a3, a4, a6 }), cont);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_4(Prolog* m)
	{
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-'$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,D,F,G)
		Term* a1,* a2,* a4,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a4 = m->AREGS[3];
		a6 = m->AREGS[5];
		a7 = m->AREGS[6];
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-['$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,D,F,G)]
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(e);
		}, VA({ a1, a2, a4, a6, a7 }), cont);
	}

	Operation FILE_lists::$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_5(Prolog* m)
	{
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-must_be(list,A),must_be(list,B)
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G):-[must_be(list,A),must_be(list,B)]
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ ATOM_list, a1 }), Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
	}, VA({ ATOM_list, a2 }), cont));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_s1 = SYM("[]");

	Operation FILE_lists::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1);
		return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(m);
	}

	Operation FILE_lists::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(m);
	}

	Operation FILE_lists::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog* m)
	{
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-(var(B),D==[]),!,length(A,C)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-['$get_level'(E),var(B),'$equality_of_term'(D,[]),'$cut'(E),length(A,C)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $equality_of_term(a(4),s(1))
		a4 = a4->dref();
		if(!a4->equalsTerm(PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_s1))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_length_2_static_exec(e);
		}, VA({ a1, a3 }), cont);
	}

	Operation FILE_lists::$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog* m)
	{
		// '$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_s1 = SYM("[]");

	Operation FILE_lists::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1);
		return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(m);
	}

	Operation FILE_lists::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(m);
	}

	Operation FILE_lists::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog* m)
	{
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-(C==[],var(D)),!,length(A,B)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-['$get_level'(E),'$equality_of_term'(C,[]),var(D),'$cut'(E),length(A,B)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $equality_of_term(a(3),s(1))
		a3 = a3->dref();
		if(!a3->equalsTerm(PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_s1))
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
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_length_2_static_exec(e);
		}, VA({ a1, a2 }), cont);
	}

	Operation FILE_lists::$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog* m)
	{
		// '$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_lists::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry5(nullptr, FILE_lists::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1);
		return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(m);
	}

	Operation FILE_lists::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(m);
	}

	Operation FILE_lists::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_1(Prolog* m)
	{
		// '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-(var(C),var(D)),!,length(A,E),length(B,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		cont = m->cont;
		// '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-['$get_level'(F),var(C),var(D),'$cut'(F),length(A,E),length(B,E)]
		a6 = V(m);
		//START inline expansion of $get_level(a(6))
		if(!a6->unifyInt(m->B0, m->trail))
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
		//START inline expansion of var(a(4))
		a4 = a4->dref();
		if(!(a4->isVariable()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(6))
		a6 = a6->dref();
		m->cut(a6->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_length_2_static_exec(e);
		}, VA({ a1, a5 }), Op([&] (Prolog* e)
		{
		PRED_length_2_static_exec(e);
	}, VA({ a2, a5 }), cont));
	}

	Operation FILE_lists::$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_2(Prolog* m)
	{
		// '$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_lists::PRED_permutation_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// permutation(A,B):-'$skip_list'(C,A,D),'$skip_list'(E,B,F),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G),perm(A,B)
		m->setB0();
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		a1 = LARG[0];
		a2 = LARG[1];
		// permutation(A,B):-['$skip_list'(C,A,D),'$skip_list'(E,B,F),'$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D,E,F,G),perm(A,B)]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_$skip_list_3_static_exec(e);
		}, VA({ a3, a1, a4 }), Op([&] (Prolog* e)
		{
		PRED_$skip_list_3_static_exec(e);
	}, VA({ a5, a2, a6 }), Op([&] (Prolog* e)
	{
		PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_static_exec(e);
	}, VA({ a1, a2, a3, a4, a5, a6, V(m) }), Op([&] (Prolog* e)
	{
		PRED_perm_2_static_exec(e);
	}, VA({ a1, a2 }), cont))));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_perm_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_perm_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_lists::perm_2_var, FILE_lists::perm_2_2, FILE_lists::perm_2_2, FILE_lists::perm_2_var, FILE_lists::perm_2_2, FILE_lists::perm_2_2);
	}

	Operation FILE_lists::perm_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_lists::perm_2_var_1);
		return perm_2_1(m);
	}

	Operation FILE_lists::perm_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return perm_2_2(m);
	}

	Operation FILE_lists::perm_2_1(Prolog* m)
	{
		// perm([],[]):-true
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// perm([],[]):-[]
		if(!PRED_perm_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_perm_2_s1->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::perm_2_2(Prolog* m)
	{
		// perm(A,[B|C]):-select(B,A,D),perm(D,C)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// perm(A,[B|C]):-[select(B,A,D),perm(D,C)]
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
		a5 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_select_3_static_exec(e);
		}, VA({ a3, a1, a5 }), Op([&] (Prolog* e)
		{
		PRED_perm_2_static_exec(e);
	}, VA({ a5, a4 }), cont));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_flatten_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_flatten_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// flatten(A,B):-flatten(A,[],C),!,B=C
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// flatten(A,B):-['$get_level'(C),flatten(A,[],D),'$cut'(C),'$unify'(B,D)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a4 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_flatten_3_static_exec(e);
		}, VA({ a1, PRED_flatten_2_s1, a4 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a3 }), Op([&] (Prolog* e)
	{
		PRED_$unify_2_static_exec(e);
	}, VA({ a2, a4 }), cont)));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_flatten_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_flatten_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return flatten_3_top(m);
	}

	Operation FILE_lists::flatten_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::flatten_3_var, FILE_lists::flatten_3_int, FILE_lists::flatten_3_int, FILE_lists::flatten_3_con, FILE_lists::flatten_3_int, FILE_lists::flatten_3_lis);
	}

	Operation FILE_lists::flatten_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::flatten_3_var_1);
		return flatten_3_1(m);
	}

	Operation FILE_lists::flatten_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::flatten_3_var_2);
		return flatten_3_2(m);
	}

	Operation FILE_lists::flatten_3_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::flatten_3_var_3);
		return flatten_3_3(m);
	}

	Operation FILE_lists::flatten_3_var_3(Prolog* m)
	{
		m->trust(nullptr);
		return flatten_3_4(m);
	}

	Operation FILE_lists::flatten_3_int(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::flatten_3_int_1);
		return flatten_3_1(m);
	}

	Operation FILE_lists::flatten_3_int_1(Prolog* m)
	{
		m->trust(nullptr);
		return flatten_3_4(m);
	}

	Operation FILE_lists::flatten_3_con(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::flatten_3_con_1);
		return flatten_3_1(m);
	}

	Operation FILE_lists::flatten_3_con_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::flatten_3_con_2);
		return flatten_3_2(m);
	}

	Operation FILE_lists::flatten_3_con_2(Prolog* m)
	{
		m->trust(nullptr);
		return flatten_3_4(m);
	}

	Operation FILE_lists::flatten_3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::flatten_3_lis_1);
		return flatten_3_1(m);
	}

	Operation FILE_lists::flatten_3_lis_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::flatten_3_lis_2);
		return flatten_3_3(m);
	}

	Operation FILE_lists::flatten_3_lis_2(Prolog* m)
	{
		m->trust(nullptr);
		return flatten_3_4(m);
	}

	Operation FILE_lists::flatten_3_1(Prolog* m)
	{
		// flatten(A,B,[A|B]):-var(A),!
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// flatten(A,B,[A|B]):-['$get_level'(C),var(A),'$cut'(C)]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!a2->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a3->isVar())
		{
			a3->bind(CONS(a1, a2), m->trail);
		} else
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
		return cont;
	}

	Operation FILE_lists::flatten_3_2(Prolog* m)
	{
		// flatten([],A,A):-!
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// flatten([],A,A):-['$neck_cut']
		if(!PRED_flatten_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::flatten_3_3(Prolog* m)
	{
		// flatten([A|B],C,D):-!,flatten(A,E,D),flatten(B,C,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation p1;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// flatten([A|B],C,D):-['$neck_cut',flatten(A,E,D),flatten(B,C,E)]
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
		p1 = Op([&] (Prolog* e)
		{
		PRED_flatten_3_static_exec(e);
		}, VA({ a5, a2, a6 }), cont);
		m->AREGS[0] = a4;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->cont = p1;
		return flatten_3_top(m);
	}

	Operation FILE_lists::flatten_3_4(Prolog* m)
	{
		// flatten(A,B,[A|B]):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// flatten(A,B,[A|B]):-[]
		a3 = a3->dref();
		if(a3->isCons())
		{
			std::vector<Term*> argz = VA({ a3->car(), a3->cdr() });
			if(!a1->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			if(!a2->unify(argz[1], m->trail))
			{
				return m->fail();
			}
		} else if(a3->isVar())
		{
			a3->bind(CONS(a1, a2), m->trail);
		} else
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::PRED_max_member_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// max_member(A,[B|C]):-max_member_(C,B,A)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// max_member(A,[B|C]):-[max_member_(C,B,A)]
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
		return Op([&] (Prolog* e)
		{
		PRED_max_member__3_static_exec(e);
		}, VA({ a4, a3, a1 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_max_member__3_s1 = SYM("[]");

	Operation FILE_lists::PRED_max_member__3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return max_member__3_top(m);
	}

	Operation FILE_lists::max_member__3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::max_member__3_var, fail_0, fail_0, FILE_lists::max_member__3_1, fail_0, FILE_lists::max_member__3_lis);
	}

	Operation FILE_lists::max_member__3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::max_member__3_var_1);
		return max_member__3_1(m);
	}

	Operation FILE_lists::max_member__3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::max_member__3_var_2);
		return max_member__3_2(m);
	}

	Operation FILE_lists::max_member__3_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return max_member__3_3(m);
	}

	Operation FILE_lists::max_member__3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::max_member__3_lis_1);
		return max_member__3_2(m);
	}

	Operation FILE_lists::max_member__3_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return max_member__3_3(m);
	}

	Operation FILE_lists::max_member__3_1(Prolog* m)
	{
		// max_member_([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// max_member_([],A,A):-[]
		if(!PRED_max_member__3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::max_member__3_2(Prolog* m)
	{
		// max_member_([A|B],C,D):-'$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// max_member_([A|B],C,D):-['$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)]
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
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(e);
		}, VA({ a4, a5, a2, a3 }), cont);
	}

	Operation FILE_lists::max_member__3_3(Prolog* m)
	{
		// max_member_([A|B],C,D):-max_member_(B,A,D)
		Term* a1,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// max_member_([A|B],C,D):-[max_member_(B,A,D)]
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
		m->AREGS[0] = a5;
		m->AREGS[1] = a4;
		m->AREGS[2] = a3;
		m->cont = cont;
		return max_member__3_top(m);
	}

	Operation FILE_lists::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1);
		return $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(m);
	}

	Operation FILE_lists::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(m);
	}

	Operation FILE_lists::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog* m)
	{
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-A@=<C,!,max_member_(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-['$get_level'(E),'$not_after'(A,C),'$cut'(E),max_member_(B,C,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $not_after(a(1),a(3))
		a1 = a1->dref();
		a3 = a3->dref();
		if(a1->compareTo(a3) > 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_max_member__3_static_exec(e);
		}, VA({ a2, a3, a4 }), cont);
	}

	Operation FILE_lists::$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog* m)
	{
		// '$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

	Operation FILE_lists::PRED_min_member_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// min_member(A,[B|C]):-min_member_(C,B,A)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// min_member(A,[B|C]):-[min_member_(C,B,A)]
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
		return Op([&] (Prolog* e)
		{
		PRED_min_member__3_static_exec(e);
		}, VA({ a4, a3, a1 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_min_member__3_s1 = SYM("[]");

	Operation FILE_lists::PRED_min_member__3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return min_member__3_top(m);
	}

	Operation FILE_lists::min_member__3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::min_member__3_var, fail_0, fail_0, FILE_lists::min_member__3_1, fail_0, FILE_lists::min_member__3_lis);
	}

	Operation FILE_lists::min_member__3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::min_member__3_var_1);
		return min_member__3_1(m);
	}

	Operation FILE_lists::min_member__3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::min_member__3_var_2);
		return min_member__3_2(m);
	}

	Operation FILE_lists::min_member__3_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return min_member__3_3(m);
	}

	Operation FILE_lists::min_member__3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::min_member__3_lis_1);
		return min_member__3_2(m);
	}

	Operation FILE_lists::min_member__3_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return min_member__3_3(m);
	}

	Operation FILE_lists::min_member__3_1(Prolog* m)
	{
		// min_member_([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// min_member_([],A,A):-[]
		if(!PRED_min_member__3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::min_member__3_2(Prolog* m)
	{
		// min_member_([A|B],C,D):-'$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// min_member_([A|B],C,D):-['$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D)]
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
		return Op([&] (Prolog* e)
		{
		PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(e);
		}, VA({ a4, a5, a2, a3 }), cont);
	}

	Operation FILE_lists::min_member__3_3(Prolog* m)
	{
		// min_member_([A|B],C,D):-min_member_(B,A,D)
		Term* a1,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// min_member_([A|B],C,D):-[min_member_(B,A,D)]
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
		m->AREGS[0] = a5;
		m->AREGS[1] = a4;
		m->AREGS[2] = a3;
		m->cont = cont;
		return min_member__3_top(m);
	}

	Operation FILE_lists::PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry4(nullptr, FILE_lists::$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1);
		return $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(m);
	}

	Operation FILE_lists::$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(m);
	}

	Operation FILE_lists::$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_1(Prolog* m)
	{
		// '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-A@>=C,!,min_member_(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		cont = m->cont;
		// '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-['$get_level'(E),'$not_before'(A,C),'$cut'(E),min_member_(B,C,D)]
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $not_before(a(1),a(3))
		a1 = a1->dref();
		a3 = a3->dref();
		if(a1->compareTo(a3) < 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_min_member__3_static_exec(e);
		}, VA({ a2, a3, a4 }), cont);
	}

	Operation FILE_lists::$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_2(Prolog* m)
	{
		// '$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl'(A,B,C,D):-[fail]
		//START inline expansion of fail
		return m->fail();
		//END inline expansion
	}

SxxMachine::IntegerTerm* const  FILE_lists::PRED_sum_list_2_s1 = optional<int>(0);

	Operation FILE_lists::PRED_sum_list_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// sum_list(A,B):-sum_list(A,0,B)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// sum_list(A,B):-[sum_list(A,0,B)]
		return Op([&] (Prolog* e)
		{
		PRED_sum_list_3_static_exec(e);
		}, VA({ a1, PRED_sum_list_2_s1, a2 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_sum_list_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_sum_list_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return sum_list_3_top(m);
	}

	Operation FILE_lists::sum_list_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::sum_list_3_var, fail_0, fail_0, FILE_lists::sum_list_3_1, fail_0, FILE_lists::sum_list_3_2);
	}

	Operation FILE_lists::sum_list_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::sum_list_3_var_1);
		return sum_list_3_1(m);
	}

	Operation FILE_lists::sum_list_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return sum_list_3_2(m);
	}

	Operation FILE_lists::sum_list_3_1(Prolog* m)
	{
		// sum_list([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// sum_list([],A,A):-[]
		if(!PRED_sum_list_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::sum_list_3_2(Prolog* m)
	{
		// sum_list([A|B],C,D):-E is C+A,sum_list(B,E,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// sum_list([A|B],C,D):-[E is C+A,sum_list(B,E,D)]
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
		std::vector<Term*> y1 = VA({ a2, a4 });
		a7 = S("+", y1);
		//START inline expansion of a(6)is a(7)
		if(!a6->unify(Arithmetic::evaluate(a7), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->cont = cont;
		return sum_list_3_top(m);
	}

	Operation FILE_lists::PRED_max_list_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// max_list([A|B],C):-max_list(B,A,C)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// max_list([A|B],C):-[max_list(B,A,C)]
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
		return Op([&] (Prolog* e)
		{
		PRED_max_list_3_static_exec(e);
		}, VA({ a4, a3, a2 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_max_list_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_max_list_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return max_list_3_top(m);
	}

	Operation FILE_lists::max_list_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::max_list_3_var, fail_0, fail_0, FILE_lists::max_list_3_1, fail_0, FILE_lists::max_list_3_2);
	}

	Operation FILE_lists::max_list_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::max_list_3_var_1);
		return max_list_3_1(m);
	}

	Operation FILE_lists::max_list_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return max_list_3_2(m);
	}

	Operation FILE_lists::max_list_3_1(Prolog* m)
	{
		// max_list([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// max_list([],A,A):-[]
		if(!PRED_max_list_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::max_list_3_2(Prolog* m)
	{
		// max_list([A|B],C,D):-E is max(A,C),max_list(B,E,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// max_list([A|B],C,D):-[E is max(A,C),max_list(B,E,D)]
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
		std::vector<Term*> y1 = VA({ a4, a2 });
		a7 = S("max", y1);
		//START inline expansion of a(6)is a(7)
		if(!a6->unify(Arithmetic::evaluate(a7), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->cont = cont;
		return max_list_3_top(m);
	}

	Operation FILE_lists::PRED_min_list_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// min_list([A|B],C):-min_list(B,A,C)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		a2 = LARG[1];
		// min_list([A|B],C):-[min_list(B,A,C)]
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
		return Op([&] (Prolog* e)
		{
		PRED_min_list_3_static_exec(e);
		}, VA({ a4, a3, a2 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_min_list_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_min_list_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return min_list_3_top(m);
	}

	Operation FILE_lists::min_list_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::min_list_3_var, fail_0, fail_0, FILE_lists::min_list_3_1, fail_0, FILE_lists::min_list_3_2);
	}

	Operation FILE_lists::min_list_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::min_list_3_var_1);
		return min_list_3_1(m);
	}

	Operation FILE_lists::min_list_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return min_list_3_2(m);
	}

	Operation FILE_lists::min_list_3_1(Prolog* m)
	{
		// min_list([],A,A):-true
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// min_list([],A,A):-[]
		if(!PRED_min_list_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::min_list_3_2(Prolog* m)
	{
		// min_list([A|B],C,D):-E is min(A,C),min_list(B,E,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// min_list([A|B],C,D):-[E is min(A,C),min_list(B,E,D)]
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
		std::vector<Term*> y1 = VA({ a4, a2 });
		a7 = S("min", y1);
		//START inline expansion of a(6)is a(7)
		if(!a6->unify(Arithmetic::evaluate(a7), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a6;
		m->AREGS[2] = a3;
		m->cont = cont;
		return min_list_3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_numlist_3_s1 = SYM("integer");

	Operation FILE_lists::PRED_numlist_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// numlist(A,B,C):-must_be(integer,A),must_be(integer,B),A=<B,numlist_(A,B,C)
		m->setB0();
		Term* a1,* a2,* a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// numlist(A,B,C):-[must_be(integer,A),must_be(integer,B),'$less_or_equal'(A,B),numlist_(A,B,C)]
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ PRED_numlist_3_s1, a1 }), Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
	}, VA({ PRED_numlist_3_s1, a2 }), Op([&] (Prolog* e)
	{
		PRED_$less_or_equal_2_static_exec(e);
	}, VA({ a1, a2 }), Op([&] (Prolog* e)
	{
		PRED_numlist__3_static_exec(e);
	}, VA({ a1, a2, a3 }), cont))));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_numlist__3_s1 = SYM("[]");

	Operation FILE_lists::PRED_numlist__3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return numlist__3_top(m);
	}

	Operation FILE_lists::numlist__3_top(Prolog* m)
	{
		m->setB0();
		m->jtry3(nullptr, FILE_lists::numlist__3_sub_1);
		return numlist__3_1(m);
	}

	Operation FILE_lists::numlist__3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return numlist__3_2(m);
	}

	Operation FILE_lists::numlist__3_1(Prolog* m)
	{
		// numlist_(A,A,B):-!,B=[A]
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// numlist_(A,A,B):-['$neck_cut','$unify'(B,[A])]
		if(!a1->unify(a2, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		a4 = CONS(a1, PRED_numlist__3_s1);
		//START inline expansion of $unify(a(3),a(4))
		if(!a3->unify(a4, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::numlist__3_2(Prolog* m)
	{
		// numlist_(A,B,[A|C]):-D is A+1,numlist_(D,B,C)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// numlist_(A,B,[A|C]):-[D is A+1,numlist_(D,B,C)]
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
		a5 = V(m);
		std::vector<Term*> y1 = VA({ a1, int_1 });
		a6 = S("+", y1);
		//START inline expansion of a(5)is a(6)
		if(!a5->unify(Arithmetic::evaluate(a6), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a4;
		m->cont = cont;
		return numlist__3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_is_set_1_s1 = SYM("[]");

	Operation FILE_lists::PRED_is_set_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// is_set(A):-'$skip_list'(B,A,C),C==[],sort(A,D),length(D,B)
		m->setB0();
		Term* a1,* a2,* a3,* a4;
		a1 = LARG[0];
		// is_set(A):-['$skip_list'(B,A,C),'$equality_of_term'(C,[]),sort(A,D),length(D,B)]
		a2 = V(m);
		a3 = V(m);
		a4 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_$skip_list_3_static_exec(e);
		}, VA({ a2, a1, a3 }), Op([&] (Prolog* e)
		{
		PRED_$equality_of_term_2_static_exec(e);
	}, VA({ a3, PRED_is_set_1_s1 }), Op([&] (Prolog* e)
	{
		PRED_sort_2_static_exec(e);
	}, VA({ a1, a4 }), Op([&] (Prolog* e)
	{
		PRED_length_2_static_exec(e);
	}, VA({ a4, a2 }), cont))));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_list_to_set_2_s1 = SYM("list");
SxxMachine::SymbolTerm* const  FILE_lists::ATOM_termsmallerequal = SYM("@=<");

	Operation FILE_lists::PRED_list_to_set_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// list_to_set(A,B):-must_be(list,A),number_list(A,1,C),sort(1,@=<,C,D),remove_dup_keys(D,E),sort(2,@=<,E,F),pairs_keys(F,B)
		m->setB0();
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		a1 = LARG[0];
		a2 = LARG[1];
		// list_to_set(A,B):-[must_be(list,A),number_list(A,1,C),sort(1,@=<,C,D),remove_dup_keys(D,E),sort(2,@=<,E,F),pairs_keys(F,B)]
		a3 = V(m);
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ PRED_list_to_set_2_s1, a1 }), Op([&] (Prolog* e)
		{
		PRED_number_list_3_static_exec(e);
	}, VA({ a1, int_1, a3 }), Op([&] (Prolog* e)
	{
		PRED_sort_4_static_exec(e);
	}, VA({ int_1, ATOM_termsmallerequal, a3, a4 }), Op([&] (Prolog* e)
	{
		PRED_remove_dup_keys_2_static_exec(e);
	}, VA({ a4, a5 }), Op([&] (Prolog* e)
	{
		PRED_sort_4_static_exec(e);
	}, VA({ int_2, ATOM_termsmallerequal, a5, a6 }), Op([&] (Prolog* e)
	{
		PRED_pairs_keys_2_static_exec(e);
	}, VA({ a6, a2 }), cont))))));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_number_list_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_number_list_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return number_list_3_top(m);
	}

	Operation FILE_lists::number_list_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::number_list_3_var, fail_0, fail_0, FILE_lists::number_list_3_1, fail_0, FILE_lists::number_list_3_2);
	}

	Operation FILE_lists::number_list_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::number_list_3_var_1);
		return number_list_3_1(m);
	}

	Operation FILE_lists::number_list_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return number_list_3_2(m);
	}

	Operation FILE_lists::number_list_3_1(Prolog* m)
	{
		// number_list([],A,[]):-true
		Term* a1,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// number_list([],A,[]):-[]
		if(!PRED_number_list_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_number_list_3_s1->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::number_list_3_2(Prolog* m)
	{
		// number_list([A|B],C,[A-C|D]):-E is C+1,number_list(B,E,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// number_list([A|B],C,[A-C|D]):-[E is C+1,number_list(B,E,D)]
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
			a6 = argz[0];
			a7 = argz[1];
		} else if(a3->isVar())
		{
			a6 = V(m);
			a7 = V(m);
			a3->bind(CONS(a6, a7), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = a6->dref();
		if(!a6->unify(C("-", { a4, a2 }), m->trail))
		{
			return m->fail();
		}
		a8 = V(m);
		std::vector<Term*> y1 = VA({ a2, int_1 });
		a9 = S("+", y1);
		//START inline expansion of a(8)is a(9)
		if(!a8->unify(Arithmetic::evaluate(a9), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a8;
		m->AREGS[2] = a7;
		m->cont = cont;
		return number_list_3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_remove_dup_keys_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_remove_dup_keys_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_lists::remove_dup_keys_2_var, fail_0, fail_0, FILE_lists::remove_dup_keys_2_1, fail_0, FILE_lists::remove_dup_keys_2_2);
	}

	Operation FILE_lists::remove_dup_keys_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_lists::remove_dup_keys_2_var_1);
		return remove_dup_keys_2_1(m);
	}

	Operation FILE_lists::remove_dup_keys_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return remove_dup_keys_2_2(m);
	}

	Operation FILE_lists::remove_dup_keys_2_1(Prolog* m)
	{
		// remove_dup_keys([],[]):-true
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// remove_dup_keys([],[]):-[]
		if(!PRED_remove_dup_keys_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_remove_dup_keys_2_s1->unify(a2, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_lists::remove_dup_keys_2_2(Prolog* m)
	{
		// remove_dup_keys([A|B],[A|C]):-A=D-E,remove_same_key(B,D,F),remove_dup_keys(F,C)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// remove_dup_keys([A|B],[A|C]):-['$unify'(A,D-E),remove_same_key(B,D,F),remove_dup_keys(F,C)]
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
			if(!a3->unify(argz[0], m->trail))
			{
				return m->fail();
			}
			a5 = argz[1];
		} else if(a2->isVar())
		{
			a5 = V(m);
			a2->bind(CONS(a3, a5), m->trail);
		} else
		{
			return m->fail();
		}
		a6 = V(m);
		std::vector<Term*> y1 = VA({ a6, V(m) });
		a7 = S("-", y1);
		//START inline expansion of $unify(a(3),a(7))
		if(!a3->unify(a7, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a8 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_remove_same_key_3_static_exec(e);
		}, VA({ a4, a6, a8 }), Op([&] (Prolog* e)
		{
		PRED_remove_dup_keys_2_static_exec(e);
	}, VA({ a8, a5 }), cont));
	}

	Operation FILE_lists::PRED_remove_same_key_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return remove_same_key_3_top(m);
	}

	Operation FILE_lists::remove_same_key_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::remove_same_key_3_var, FILE_lists::remove_same_key_3_2, FILE_lists::remove_same_key_3_2, FILE_lists::remove_same_key_3_2, FILE_lists::remove_same_key_3_2, FILE_lists::remove_same_key_3_var);
	}

	Operation FILE_lists::remove_same_key_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::remove_same_key_3_var_1);
		return remove_same_key_3_1(m);
	}

	Operation FILE_lists::remove_same_key_3_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return remove_same_key_3_2(m);
	}

	Operation FILE_lists::remove_same_key_3_1(Prolog* m)
	{
		// remove_same_key([A-B|C],D,E):-A==D,!,remove_same_key(C,D,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// remove_same_key([A-B|C],D,E):-['$get_level'(F),'$equality_of_term'(A,D),'$cut'(F),remove_same_key(C,D,E)]
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
		a6 = V(m);
		if(!a4->unify(C("-", { a6, V(m) }), m->trail))
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
		//START inline expansion of $equality_of_term(a(6),a(2))
		a6 = a6->dref();
		a2 = a2->dref();
		if(!a6->equalsTerm(a2))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7->dref();
		m->cut(a7->intValue());
		//END inline expansion
		m->AREGS[0] = a5;
		m->AREGS[1] = a2;
		m->AREGS[2] = a3;
		m->cont = cont;
		return remove_same_key_3_top(m);
	}

	Operation FILE_lists::remove_same_key_3_2(Prolog* m)
	{
		// remove_same_key(A,B,A):-true
		Term* a1,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// remove_same_key(A,B,A):-[]
		if(!a1->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_intersection_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_intersection_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return intersection_3_top(m);
	}

	Operation FILE_lists::intersection_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::intersection_3_var, fail_0, fail_0, FILE_lists::intersection_3_1, fail_0, FILE_lists::intersection_3_lis);
	}

	Operation FILE_lists::intersection_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::intersection_3_var_1);
		return intersection_3_1(m);
	}

	Operation FILE_lists::intersection_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::intersection_3_var_2);
		return intersection_3_2(m);
	}

	Operation FILE_lists::intersection_3_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return intersection_3_3(m);
	}

	Operation FILE_lists::intersection_3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::intersection_3_lis_1);
		return intersection_3_2(m);
	}

	Operation FILE_lists::intersection_3_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return intersection_3_3(m);
	}

	Operation FILE_lists::intersection_3_1(Prolog* m)
	{
		// intersection([],A,[]):-!
		Term* a1,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// intersection([],A,[]):-['$neck_cut']
		if(!PRED_intersection_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_intersection_3_s1->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::intersection_3_2(Prolog* m)
	{
		// intersection([A|B],C,D):-memberchk(A,C),!,D=[A|E],intersection(B,C,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// intersection([A|B],C,D):-['$get_level'(E),memberchk(A,C),'$cut'(E),'$unify'(D,[A|F]),intersection(B,C,F)]
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
		//START inline expansion of $get_level(a(6))
		if(!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a7 = V(m);
		a8 = CONS(a4, a7);
		return Op([&] (Prolog* e)
		{
		PRED_memberchk_2_static_exec(e);
		}, VA({ a4, a2 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a6 }), Op([&] (Prolog* e)
	{
		PRED_$unify_2_static_exec(e);
	}, VA({ a3, a8 }), Op([&] (Prolog* e)
	{
		PRED_intersection_3_static_exec(e);
	}, VA({ a5, a2, a7 }), cont))));
	}

	Operation FILE_lists::intersection_3_3(Prolog* m)
	{
		// intersection([A|B],C,D):-intersection(B,C,D)
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// intersection([A|B],C,D):-[intersection(B,C,D)]
		a1 = a1->dref();
		if(a1->isCons())
		{
			std::vector<Term*> argz = VA({ a1->car(), a1->cdr() });
			a4 = argz[1];
		} else if(a1->isVar())
		{
			a4 = V(m);
			a1->bind(CONS(V(m), a4), m->trail);
		} else
		{
			return m->fail();
		}
		m->AREGS[0] = a4;
		m->AREGS[1] = a2;
		m->AREGS[2] = a3;
		m->cont = cont;
		return intersection_3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_union_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_union_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return union_3_top(m);
	}

	Operation FILE_lists::union_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::union_3_var, fail_0, fail_0, FILE_lists::union_3_1, fail_0, FILE_lists::union_3_lis);
	}

	Operation FILE_lists::union_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::union_3_var_1);
		return union_3_1(m);
	}

	Operation FILE_lists::union_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::union_3_var_2);
		return union_3_2(m);
	}

	Operation FILE_lists::union_3_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return union_3_3(m);
	}

	Operation FILE_lists::union_3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::union_3_lis_1);
		return union_3_2(m);
	}

	Operation FILE_lists::union_3_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return union_3_3(m);
	}

	Operation FILE_lists::union_3_1(Prolog* m)
	{
		// union([],A,A):-!
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// union([],A,A):-['$neck_cut']
		if(!PRED_union_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::union_3_2(Prolog* m)
	{
		// union([A|B],C,D):-memberchk(A,C),!,union(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// union([A|B],C,D):-['$get_level'(E),memberchk(A,C),'$cut'(E),union(B,C,D)]
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
		//START inline expansion of $get_level(a(6))
		if(!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_memberchk_2_static_exec(e);
		}, VA({ a4, a2 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a6 }), Op([&] (Prolog* e)
	{
		PRED_union_3_static_exec(e);
	}, VA({ a5, a2, a3 }), cont)));
	}

	Operation FILE_lists::union_3_3(Prolog* m)
	{
		// union([A|B],C,[A|D]):-union(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// union([A|B],C,[A|D]):-[union(B,C,D)]
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
		return union_3_top(m);
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_subset_2_s1 = SYM("[]");

	Operation FILE_lists::PRED_subset_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_lists::subset_2_var, fail_0, fail_0, FILE_lists::subset_2_1, fail_0, FILE_lists::subset_2_2);
	}

	Operation FILE_lists::subset_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_lists::subset_2_var_1);
		return subset_2_1(m);
	}

	Operation FILE_lists::subset_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return subset_2_2(m);
	}

	Operation FILE_lists::subset_2_1(Prolog* m)
	{
		// subset([],A):-!
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// subset([],A):-['$neck_cut']
		if(!PRED_subset_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::subset_2_2(Prolog* m)
	{
		// subset([A|B],C):-memberchk(A,C),subset(B,C)
		Term* a1,* a2,* a3,* a4;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// subset([A|B],C):-[memberchk(A,C),subset(B,C)]
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
		return Op([&] (Prolog* e)
		{
		PRED_memberchk_2_static_exec(e);
		}, VA({ a3, a2 }), Op([&] (Prolog* e)
		{
		PRED_subset_2_static_exec(e);
	}, VA({ a4, a2 }), cont));
	}

SxxMachine::SymbolTerm* const  FILE_lists::PRED_subtract_3_s1 = SYM("[]");

	Operation FILE_lists::PRED_subtract_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		return subtract_3_top(m);
	}

	Operation FILE_lists::subtract_3_top(Prolog* m)
	{
		m->setB0();
		return m->switch_on_term(FILE_lists::subtract_3_var, fail_0, fail_0, FILE_lists::subtract_3_1, fail_0, FILE_lists::subtract_3_lis);
	}

	Operation FILE_lists::subtract_3_var(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::subtract_3_var_1);
		return subtract_3_1(m);
	}

	Operation FILE_lists::subtract_3_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_lists::subtract_3_var_2);
		return subtract_3_2(m);
	}

	Operation FILE_lists::subtract_3_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return subtract_3_3(m);
	}

	Operation FILE_lists::subtract_3_lis(Prolog* m)
	{
		m->jtry3(nullptr, FILE_lists::subtract_3_lis_1);
		return subtract_3_2(m);
	}

	Operation FILE_lists::subtract_3_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return subtract_3_3(m);
	}

	Operation FILE_lists::subtract_3_1(Prolog* m)
	{
		// subtract([],A,[]):-!
		Term* a1,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a3 = m->AREGS[2];
		cont = m->cont;
		// subtract([],A,[]):-['$neck_cut']
		if(!PRED_subtract_3_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		if(!PRED_subtract_3_s1->unify(a3, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return cont;
	}

	Operation FILE_lists::subtract_3_2(Prolog* m)
	{
		// subtract([A|B],C,D):-memberchk(A,C),!,subtract(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// subtract([A|B],C,D):-['$get_level'(E),memberchk(A,C),'$cut'(E),subtract(B,C,D)]
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
		//START inline expansion of $get_level(a(6))
		if(!a6->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_memberchk_2_static_exec(e);
		}, VA({ a4, a2 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a6 }), Op([&] (Prolog* e)
	{
		PRED_subtract_3_static_exec(e);
	}, VA({ a5, a2, a3 }), cont)));
	}

	Operation FILE_lists::subtract_3_3(Prolog* m)
	{
		// subtract([A|B],C,[A|D]):-subtract(B,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// subtract([A|B],C,[A|D]):-[subtract(B,C,D)]
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
		return subtract_3_top(m);
	}

	FILE_lists::StaticConstructor::StaticConstructor()
	{
	loadPreds();
	}

FILE_lists::StaticConstructor FILE_lists::staticConstructor;

	void FILE_lists::loadPreds()
	{
		PredTable::registerBuiltin("member", 2, FILE_lists::PRED_member_2_static_exec);
		PredTable::registerBuiltin("member_", 3, FILE_lists::PRED_member__3_static_exec);
		PredTable::registerBuiltin("append", 3, FILE_lists::PRED_append_3_static_exec);
		PredTable::registerBuiltin("append", 2, FILE_lists::PRED_append_2_static_exec);
		PredTable::registerBuiltin("append_", 2, FILE_lists::PRED_append__2_static_exec);
		PredTable::registerBuiltin("prefix", 2, FILE_lists::PRED_prefix_2_static_exec);
		PredTable::registerBuiltin("select", 3, FILE_lists::PRED_select_3_static_exec);
		PredTable::registerBuiltin("selectchk", 3, FILE_lists::PRED_selectchk_3_static_exec);
		PredTable::registerBuiltin("select", 4, FILE_lists::PRED_select_4_static_exec);
		PredTable::registerBuiltin("select_", 4, FILE_lists::PRED_select__4_static_exec);
		PredTable::registerBuiltin("selectchk", 4, FILE_lists::PRED_selectchk_4_static_exec);
		PredTable::registerBuiltin("nextto", 3, FILE_lists::PRED_nextto_3_static_exec);
		PredTable::registerBuiltin("delete", 3, FILE_lists::PRED_delete_3_static_exec);
		PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 2, FILE_lists::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_2_static_exec);
		PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 4, FILE_lists::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec);
		PredTable::registerBuiltin("$dummy_2_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 3, FILE_lists::PRED_$dummy_2_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_3_static_exec);
		PredTable::registerBuiltin("nth0", 3, FILE_lists::PRED_nth0_3_static_exec);
		PredTable::registerBuiltin("$dummy_3_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 5, FILE_lists::PRED_$dummy_3_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec);
		PredTable::registerBuiltin("nth0_det", 3, FILE_lists::PRED_nth0_det_3_static_exec);
		PredTable::registerBuiltin("nth_gen", 5, FILE_lists::PRED_nth_gen_5_static_exec);
		PredTable::registerBuiltin("$dummy_4_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 4, FILE_lists::PRED_$dummy_4_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec);
		PredTable::registerBuiltin("nth1", 3, FILE_lists::PRED_nth1_3_static_exec);
		PredTable::registerBuiltin("$dummy_5_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 5, FILE_lists::PRED_$dummy_5_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec);
		PredTable::registerBuiltin("nth0", 4, FILE_lists::PRED_nth0_4_static_exec);
		PredTable::registerBuiltin("nth1", 4, FILE_lists::PRED_nth1_4_static_exec);
		PredTable::registerBuiltin("generate_nth", 5, FILE_lists::PRED_generate_nth_5_static_exec);
		PredTable::registerBuiltin("find_nth0", 4, FILE_lists::PRED_find_nth0_4_static_exec);
		PredTable::registerBuiltin("last", 2, FILE_lists::PRED_last_2_static_exec);
		PredTable::registerBuiltin("last_", 3, FILE_lists::PRED_last__3_static_exec);
		PredTable::registerBuiltin("proper_length", 2, FILE_lists::PRED_proper_length_2_static_exec);
		PredTable::registerBuiltin("same_length", 2, FILE_lists::PRED_same_length_2_static_exec);
		PredTable::registerBuiltin("reverse", 2, FILE_lists::PRED_reverse_2_static_exec);
		PredTable::registerBuiltin("reverse", 4, FILE_lists::PRED_reverse_4_static_exec);
		PredTable::registerBuiltin("$dummy_6_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 7, FILE_lists::PRED_$dummy_6_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_7_static_exec);
		PredTable::registerBuiltin("$dummy_7_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 4, FILE_lists::PRED_$dummy_7_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec);
		PredTable::registerBuiltin("$dummy_8_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 4, FILE_lists::PRED_$dummy_8_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec);
		PredTable::registerBuiltin("$dummy_9_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 5, FILE_lists::PRED_$dummy_9_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_5_static_exec);
		PredTable::registerBuiltin("permutation", 2, FILE_lists::PRED_permutation_2_static_exec);
		PredTable::registerBuiltin("perm", 2, FILE_lists::PRED_perm_2_static_exec);
		PredTable::registerBuiltin("flatten", 2, FILE_lists::PRED_flatten_2_static_exec);
		PredTable::registerBuiltin("flatten", 3, FILE_lists::PRED_flatten_3_static_exec);
		PredTable::registerBuiltin("max_member", 2, FILE_lists::PRED_max_member_2_static_exec);
		PredTable::registerBuiltin("max_member_", 3, FILE_lists::PRED_max_member__3_static_exec);
		PredTable::registerBuiltin("$dummy_10_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 4, FILE_lists::PRED_$dummy_10_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec);
		PredTable::registerBuiltin("min_member", 2, FILE_lists::PRED_min_member_2_static_exec);
		PredTable::registerBuiltin("min_member_", 3, FILE_lists::PRED_min_member__3_static_exec);
		PredTable::registerBuiltin("$dummy_11_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/lists.pl", "$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl", 4, FILE_lists::PRED_$dummy_11_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Flists$002Epl_4_static_exec);
		PredTable::registerBuiltin("sum_list", 2, FILE_lists::PRED_sum_list_2_static_exec);
		PredTable::registerBuiltin("sum_list", 3, FILE_lists::PRED_sum_list_3_static_exec);
		PredTable::registerBuiltin("max_list", 2, FILE_lists::PRED_max_list_2_static_exec);
		PredTable::registerBuiltin("max_list", 3, FILE_lists::PRED_max_list_3_static_exec);
		PredTable::registerBuiltin("min_list", 2, FILE_lists::PRED_min_list_2_static_exec);
		PredTable::registerBuiltin("min_list", 3, FILE_lists::PRED_min_list_3_static_exec);
		PredTable::registerBuiltin("numlist", 3, FILE_lists::PRED_numlist_3_static_exec);
		PredTable::registerBuiltin("numlist_", 3, FILE_lists::PRED_numlist__3_static_exec);
		PredTable::registerBuiltin("is_set", 1, FILE_lists::PRED_is_set_1_static_exec);
		PredTable::registerBuiltin("list_to_set", 2, FILE_lists::PRED_list_to_set_2_static_exec);
		PredTable::registerBuiltin("number_list", 3, FILE_lists::PRED_number_list_3_static_exec);
		PredTable::registerBuiltin("remove_dup_keys", 2, FILE_lists::PRED_remove_dup_keys_2_static_exec);
		PredTable::registerBuiltin("remove_same_key", 3, FILE_lists::PRED_remove_same_key_3_static_exec);
		PredTable::registerBuiltin("intersection", 3, FILE_lists::PRED_intersection_3_static_exec);
		PredTable::registerBuiltin("union", 3, FILE_lists::PRED_union_3_static_exec);
		PredTable::registerBuiltin("subset", 2, FILE_lists::PRED_subset_2_static_exec);
		PredTable::registerBuiltin("subtract", 3, FILE_lists::PRED_subtract_3_static_exec);
	}
}
