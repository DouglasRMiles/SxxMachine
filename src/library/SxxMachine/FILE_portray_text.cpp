using namespace std;

#include "FILE_portray_text.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../builtin/SxxMachine/FILE_builtins.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine::library
{
//	import static SxxMachine.FILE_builtins.PRED_$greater_or_equal_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_$new_indexing_hash_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_assert_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_assertz_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_call_1_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_retractall_1_static_exec;
//	import static SxxMachine.FILE_io.PRED_put_char_1_static_exec;
//	import static SxxMachine.FILE_io.PRED_put_code_1_static_exec;
//	import static SxxMachine.Failure.fail_0;
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_between_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_$skip_list_3_static_exec;
//	import static SxxMachine.sxxtensions.PRED_format_1_static_exec;
//	import static SxxMachine.sxxtensions.PRED_format_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_must_be_2_static_exec;
//	import static SxxMachine.sxxtensions.PRED_succ_2_static_exec;
	using Arithmetic = SxxMachine::Arithmetic;
	using FILE_builtins = SxxMachine::FILE_builtins;
	using IntegerTerm = SxxMachine::IntegerTerm;
	using Operation = SxxMachine::Operation;
	using PredTable = SxxMachine::PredTable;
	using Prolog = SxxMachine::Prolog;
	using StructureTerm = SxxMachine::StructureTerm;
	using SymbolTerm = SxxMachine::SymbolTerm;
	using Term = SxxMachine::Term;
	using TermData = SxxMachine::TermData;
SxxMachine::SymbolTerm* const  FILE_portray_text::PRED_portray_text_1_s1 = SYM("boolean");
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_portray_text = SYM("portray_text");

	Operation FILE_portray_text::PRED_portray_text_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// portray_text(A):-must_be(boolean,A),retractall(do_portray_text(B)),assert(do_portray_text(A))
		m->setB0();
		Term* a1,* a2,* a3,* a4,* a5;
		a1 = LARG[0];
		// portray_text(A):-[must_be(boolean,A),retractall(portray_text:do_portray_text(B)),assert(portray_text:do_portray_text(A))]
		std::vector<Term*> y1 = VA({ V(m) });
		a2 = S("do_portray_text", y1);
		std::vector<Term*> y2 = VA({ ATOM_portray_text, a2 });
		a3 = S(":", y2);
		std::vector<Term*> y3 = VA({ a1 });
		a4 = S("do_portray_text", y3);
		std::vector<Term*> y4 = VA({ ATOM_portray_text, a4 });
		a5 = S(":", y4);
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ PRED_portray_text_1_s1, a1 }), Op([&] (Prolog* e)
		{
		FILE_builtins::PRED_retractall_1_static_exec(e);
	}, VA({ a3 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_assert_1_static_exec(e);
	}, VA({ a5 }), cont)));
	}

SxxMachine::SymbolTerm* const  FILE_portray_text::PRED_set_portray_text_2_s1 = SYM("min_length");
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_nonneg = SYM("nonneg");
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_ellipsis = SYM("ellipsis");

	Operation FILE_portray_text::PRED_set_portray_text_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_portray_text::set_portray_text_2_var, fail_0, fail_0, FILE_portray_text::set_portray_text_2_var, fail_0, fail_0);
	}

	Operation FILE_portray_text::set_portray_text_2_var(Prolog* m)
	{
		m->jtry2(nullptr, FILE_portray_text::set_portray_text_2_var_1);
		return set_portray_text_2_1(m);
	}

	Operation FILE_portray_text::set_portray_text_2_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return set_portray_text_2_2(m);
	}

	Operation FILE_portray_text::set_portray_text_2_1(Prolog* m)
	{
		// set_portray_text(min_length,A):-must_be(nonneg,A),retractall(portray_text_option(min_length,B)),assert(portray_text_option(min_length,A))
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// set_portray_text(min_length,A):-[must_be(nonneg,A),retractall(portray_text:portray_text_option(min_length,B)),assert(portray_text:portray_text_option(min_length,A))]
		if(!PRED_set_portray_text_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({ PRED_set_portray_text_2_s1, V(m) });
		a3 = S("portray_text_option", y1);
		std::vector<Term*> y2 = VA({ ATOM_portray_text, a3 });
		a4 = S(":", y2);
		std::vector<Term*> y3 = VA({ PRED_set_portray_text_2_s1, a2 });
		a5 = S("portray_text_option", y3);
		std::vector<Term*> y4 = VA({ ATOM_portray_text, a5 });
		a6 = S(":", y4);
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ ATOM_nonneg, a2 }), Op([&] (Prolog* e)
		{
		FILE_builtins::PRED_retractall_1_static_exec(e);
	}, VA({ a4 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_assert_1_static_exec(e);
	}, VA({ a6 }), cont)));
	}

	Operation FILE_portray_text::set_portray_text_2_2(Prolog* m)
	{
		// set_portray_text(ellipsis,A):-must_be(nonneg,A),retractall(portray_text_option(ellipsis,B)),assert(portray_text_option(ellipsis,A))
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// set_portray_text(ellipsis,A):-[must_be(nonneg,A),retractall(portray_text:portray_text_option(ellipsis,B)),assert(portray_text:portray_text_option(ellipsis,A))]
		if(!ATOM_ellipsis->unify(a1, m->trail))
		{
			return m->fail();
		}
		std::vector<Term*> y1 = VA({ ATOM_ellipsis, V(m) });
		a3 = S("portray_text_option", y1);
		std::vector<Term*> y2 = VA({ ATOM_portray_text, a3 });
		a4 = S(":", y2);
		std::vector<Term*> y3 = VA({ ATOM_ellipsis, a2 });
		a5 = S("portray_text_option", y3);
		std::vector<Term*> y4 = VA({ ATOM_portray_text, a5 });
		a6 = S(":", y4);
		return Op([&] (Prolog* e)
		{
		PRED_must_be_2_static_exec(e);
		}, VA({ ATOM_nonneg, a2 }), Op([&] (Prolog* e)
		{
		FILE_builtins::PRED_retractall_1_static_exec(e);
	}, VA({ a4 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_assert_1_static_exec(e);
	}, VA({ a6 }), cont)));
	}

SxxMachine::IntegerTerm* const  FILE_portray_text::int_5 = optional<int>(5);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_$002E$002E$002E = SYM("...");

	Operation FILE_portray_text::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry6(nullptr, FILE_portray_text::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_sub_1);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_1(m);
	}

	Operation FILE_portray_text::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_2(m);
	}

	Operation FILE_portray_text::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_1(Prolog* m)
	{
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B,C,D,E,F):-B>C,!,D is C-5,E is B-5,skip_first(E,A,F),put_n_codes(D,A),format(...,[])
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		a4 = m->AREGS[3];
		a5 = m->AREGS[4];
		a6 = m->AREGS[5];
		cont = m->cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B,C,D,E,F):-['$get_level'(G),'$greater_than'(B,C),'$cut'(G),D is C-5,E is B-5,skip_first(E,A,F),put_n_codes(D,A),format(...,[])]
		a7 = V(m);
		//START inline expansion of $get_level(a(7))
		if(!a7->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(2),a(3))
		if(Arithmetic::evaluate(a2)->arithCompareTo(Arithmetic::evaluate(a3)) <= 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(7))
		a7 = a7->dref();
		m->cut(a7->intValue());
		//END inline expansion
		std::vector<Term*> y1 = VA({ a3, int_5 });
		a8 = S("-", y1);
		//START inline expansion of a(4)is a(8)
		if(!a4->unify(Arithmetic::evaluate(a8), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		std::vector<Term*> y2 = VA({ a2, int_5 });
		a9 = S("-", y2);
		//START inline expansion of a(5)is a(9)
		if(!a5->unify(Arithmetic::evaluate(a9), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_skip_first_3_static_exec(e);
		}, VA({ a5, a1, a6 }), Op([&] (Prolog* e)
		{
		PRED_put_n_codes_2_static_exec(e);
	}, VA({ a4, a1 }), Op([&] (Prolog* e)
	{
		PRED_format_2_static_exec(e);
	}, VA({ ATOM_$002E$002E$002E, Prolog::Nil }), cont)));
	}

	Operation FILE_portray_text::$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_2(Prolog* m)
	{
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B,C,D,E,F):-F=A
		Term* a1,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a6 = m->AREGS[5];
		cont = m->cont;
		// '$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B,C,D,E,F):-['$unify'(F,A)]
		//START inline expansion of $unify(a(6),a(1))
		if(!a6->unify(a1, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return cont;
	}

SxxMachine::SymbolTerm* const  FILE_portray_text::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_s1 = SYM("~s");

	Operation FILE_portray_text::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_portray_text::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_sub_1);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_1(m);
	}

	Operation FILE_portray_text::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return $dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_2(m);
	}

	Operation FILE_portray_text::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_1(Prolog* m)
	{
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B):-var_or_numbered(A),!,put_var_codes(B)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B):-['$get_level'(C),var_or_numbered(A),'$cut'(C),put_var_codes(B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_var_or_numbered_1_static_exec(e);
		}, VA({ a1 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a3 }), Op([&] (Prolog* e)
	{
		PRED_put_var_codes_1_static_exec(e);
	}, VA({ a2 }), cont)));
	}

	Operation FILE_portray_text::$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_2(Prolog* m)
	{
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B):-format('~s',[B])
		Term* a2,* a3;
		Operation cont;
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B):-[format('~s',[B])]
		a3 = CONS(a2, Prolog::Nil);
		return Op([&] (Prolog* e)
		{
		PRED_format_2_static_exec(e);
		}, VA({ PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_s1, a3 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_portray_text::PRED_$003A_2_s1 = SYM("user");
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$003A_2_s8 = S("do_portray_text", SxxMachine::Prolog::True);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$003A_2_s10 = S(":", ATOM_portray_text, PRED_$003A_2_s8);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_min_length = SYM("min_length");
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_$0022 = SYM("\"");

	Operation FILE_portray_text::PRED_$003A_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// user:portray(A):-do_portray_text(true),'$skip_list'(B,A,C),portray_text_option(min_length,D),B>=D,all_ascii(A),portray_text_option(ellipsis,E),put_char('"'),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B,E,F,G,H),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(C,H),put_char('"')
		m->setB0();
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8,* a9,* a10,* a11,* a12;
		a1 = LARG[0];
		a2 = LARG[1];
		// user:portray(A):-[call(portray_text:do_portray_text(true)),'$skip_list'(B,A,C),call(portray_text:portray_text_option(min_length,D)),'$greater_or_equal'(B,D),all_ascii(A),call(portray_text:portray_text_option(ellipsis,E)),put_char('"'),'$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(A,B,E,F,G,H),'$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl'(C,H),put_char('"')]
		if(!PRED_$003A_2_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		a2 = a2->dref();
		a3 = V(m);
		if(!a2->unify(C("portray", { a3 }), m->trail))
		{
			return m->fail();
		}
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		std::vector<Term*> y1 = VA({ ATOM_min_length, a6 });
		a7 = S("portray_text_option", y1);
		std::vector<Term*> y2 = VA({ ATOM_portray_text, a7 });
		a8 = S(":", y2);
		a9 = V(m);
		std::vector<Term*> y3 = VA({ ATOM_ellipsis, a9 });
		a10 = S("portray_text_option", y3);
		std::vector<Term*> y4 = VA({ ATOM_portray_text, a10 });
		a11 = S(":", y4);
		a12 = V(m);
		return Op([&] (Prolog* e)
		{
		FILE_builtins::PRED_call_1_static_exec(e);
		}, VA({ PRED_$003A_2_s10 }), Op([&] (Prolog* e)
		{
		PRED_$skip_list_3_static_exec(e);
	}, VA({ a4, a3, a5 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_call_1_static_exec(e);
	}, VA({ a8 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_$greater_or_equal_2_static_exec(e);
	}, VA({ a4, a6 }), Op([&] (Prolog* e)
	{
		PRED_all_ascii_1_static_exec(e);
	}, VA({ a3 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_call_1_static_exec(e);
	}, VA({ a11 }), Op([&] (Prolog* e)
	{
		PRED_put_char_1_static_exec(e);
	}, VA({ ATOM_$0022 }), Op([&] (Prolog* e)
	{
		PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_static_exec(e);
	}, VA({ a3, a4, a9, V(m), V(m), a12 }), Op([&] (Prolog* e)
	{
		PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_static_exec(e);
	}, VA({ a5, a12 }), Op([&] (Prolog* e)
	{
		PRED_put_char_1_static_exec(e);
	}, VA({ ATOM_$0022 }), cont))))))))));
	}

SxxMachine::IntegerTerm* const  FILE_portray_text::PRED_put_n_codes_2_s1 = optional<int>(0);
SxxMachine::IntegerTerm* const  FILE_portray_text::int_1 = optional<int>(1);

	Operation FILE_portray_text::PRED_put_n_codes_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_portray_text::put_n_codes_2_sub_1);
		return put_n_codes_2_1(m);
	}

	Operation FILE_portray_text::put_n_codes_2_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return put_n_codes_2_2(m);
	}

	Operation FILE_portray_text::put_n_codes_2_1(Prolog* m)
	{
		// put_n_codes(A,[B|C]):-A>0,!,emit_code(B),D is A-1,put_n_codes(D,C)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7,* a8;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// put_n_codes(A,[B|C]):-['$get_level'(D),E is 0,'$greater_than'(A,E),'$cut'(D),emit_code(B),F is A-1,put_n_codes(F,C)]
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
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a6 = V(m);
		//START inline expansion of a(6)is si(1)
		if(!a6->unify(PRED_put_n_codes_2_s1, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $greater_than(a(1),a(6))
		if(Arithmetic::evaluate(a1)->arithCompareTo(Arithmetic::evaluate(a6)) <= 0)
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(5))
		a5 = a5->dref();
		m->cut(a5->intValue());
		//END inline expansion
		a7 = V(m);
		std::vector<Term*> y1 = VA({ a1, int_1 });
		a8 = S("-", y1);
		return Op([&] (Prolog* e)
		{
		PRED_emit_code_1_static_exec(e);
		}, VA({ a3 }), Op(FILE_builtins::PRED_is_2_static_exec, VA({ a7, a8 }), Op([&] (Prolog* e)
		{
		PRED_put_n_codes_2_static_exec(e);
	}, VA({ a7, a4 }), cont)));
	}

	Operation FILE_portray_text::put_n_codes_2_2(Prolog* m)
	{
		Operation cont;
		cont = m->cont;
		// put_n_codes(A,B):-[]
		return cont;
	}

	Operation FILE_portray_text::PRED_skip_first_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry3(nullptr, FILE_portray_text::skip_first_3_sub_1);
		return skip_first_3_1(m);
	}

	Operation FILE_portray_text::skip_first_3_sub_1(Prolog* m)
	{
		m->trust(nullptr);
		return skip_first_3_2(m);
	}

	Operation FILE_portray_text::skip_first_3_1(Prolog* m)
	{
		// skip_first(A,[B|C],D):-succ(E,A),!,skip_first(E,C,D)
		Term* a1,* a2,* a3,* a4,* a5,* a6;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// skip_first(A,[B|C],D):-['$get_level'(E),succ(F,A),'$cut'(E),skip_first(F,C,D)]
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
		a5 = V(m);
		//START inline expansion of $get_level(a(5))
		if(!a5->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a6 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_succ_2_static_exec(e);
		}, VA({ a6, a1 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a5 }), Op([&] (Prolog* e)
	{
		PRED_skip_first_3_static_exec(e);
	}, VA({ a6, a4, a3 }), cont)));
	}

	Operation FILE_portray_text::skip_first_3_2(Prolog* m)
	{
		// skip_first(A,B,B):-true
		Term* a2,* a3;
		Operation cont;
		a2 = m->AREGS[1];
		a3 = m->AREGS[2];
		cont = m->cont;
		// skip_first(A,B,B):-[]
		if(!a2->unify(a3, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SxxMachine::SymbolTerm* const  FILE_portray_text::PRED_put_var_codes_1_s1 = SYM("|~p");

	Operation FILE_portray_text::PRED_put_var_codes_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_portray_text::put_var_codes_1_var, FILE_portray_text::put_var_codes_1_1, FILE_portray_text::put_var_codes_1_1, FILE_portray_text::put_var_codes_1_con, FILE_portray_text::put_var_codes_1_1, FILE_portray_text::put_var_codes_1_lis);
	}

	Operation FILE_portray_text::put_var_codes_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::put_var_codes_1_var_1);
		return put_var_codes_1_1(m);
	}

	Operation FILE_portray_text::put_var_codes_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::put_var_codes_1_var_2);
		return put_var_codes_1_2(m);
	}

	Operation FILE_portray_text::put_var_codes_1_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return put_var_codes_1_3(m);
	}

	Operation FILE_portray_text::put_var_codes_1_con(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::put_var_codes_1_con_1);
		return put_var_codes_1_1(m);
	}

	Operation FILE_portray_text::put_var_codes_1_con_1(Prolog* m)
	{
		m->trust(nullptr);
		return put_var_codes_1_2(m);
	}

	Operation FILE_portray_text::put_var_codes_1_lis(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::put_var_codes_1_lis_1);
		return put_var_codes_1_1(m);
	}

	Operation FILE_portray_text::put_var_codes_1_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return put_var_codes_1_3(m);
	}

	Operation FILE_portray_text::put_var_codes_1_1(Prolog* m)
	{
		// put_var_codes(A):-var_or_numbered(A),!,format('|~p',[A])
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// put_var_codes(A):-['$get_level'(B),var_or_numbered(A),'$cut'(B),format('|~p',[A])]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		a3 = CONS(a1, Prolog::Nil);
		return Op([&] (Prolog* e)
		{
		PRED_var_or_numbered_1_static_exec(e);
		}, VA({ a1 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a2 }), Op([&] (Prolog* e)
	{
		PRED_format_2_static_exec(e);
	}, VA({ PRED_put_var_codes_1_s1, a3 }), cont)));
	}

	Operation FILE_portray_text::put_var_codes_1_2(Prolog* m)
	{
		// put_var_codes([]):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// put_var_codes([]):-[]
		if(!Prolog::Nil->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_portray_text::put_var_codes_1_3(Prolog* m)
	{
		// put_var_codes([A|B]):-emit_code(A),put_var_codes(B)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// put_var_codes([A|B]):-[emit_code(A),put_var_codes(B)]
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
		return Op([&] (Prolog* e)
		{
		PRED_emit_code_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_put_var_codes_1_static_exec(e);
	}, VA({ a3 }), cont));
	}

SxxMachine::IntegerTerm* const  FILE_portray_text::PRED_emit_code_1_s1 = optional<int>(8);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_$005Cb = SYM("\\b");
SxxMachine::IntegerTerm* const  FILE_portray_text::int_13 = optional<int>(13);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_$005Cr = SYM("\\r");
SxxMachine::IntegerTerm* const  FILE_portray_text::int_10 = optional<int>(10);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_$005Cn = SYM("\\n");
SxxMachine::IntegerTerm* const  FILE_portray_text::int_9 = optional<int>(9);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_$005Ct = SYM("\\t");

	Operation FILE_portray_text::PRED_emit_code_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_portray_text::emit_code_1_var, FILE_portray_text::emit_code_1_var, FILE_portray_text::emit_code_1_5, FILE_portray_text::emit_code_1_5, FILE_portray_text::emit_code_1_5, FILE_portray_text::emit_code_1_5);
	}

	Operation FILE_portray_text::emit_code_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::emit_code_1_var_1);
		return emit_code_1_1(m);
	}

	Operation FILE_portray_text::emit_code_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::emit_code_1_var_2);
		return emit_code_1_2(m);
	}

	Operation FILE_portray_text::emit_code_1_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::emit_code_1_var_3);
		return emit_code_1_3(m);
	}

	Operation FILE_portray_text::emit_code_1_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::emit_code_1_var_4);
		return emit_code_1_4(m);
	}

	Operation FILE_portray_text::emit_code_1_var_4(Prolog* m)
	{
		m->trust(nullptr);
		return emit_code_1_5(m);
	}

	Operation FILE_portray_text::emit_code_1_1(Prolog* m)
	{
		// emit_code(8):-!,format('\\b')
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// emit_code(8):-['$neck_cut',format('\\b')]
		if(!PRED_emit_code_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_format_1_static_exec(e);
		}, VA({ ATOM_$005Cb }), cont);
	}

	Operation FILE_portray_text::emit_code_1_2(Prolog* m)
	{
		// emit_code(13):-!,format('\\r')
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// emit_code(13):-['$neck_cut',format('\\r')]
		if(!int_13->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_format_1_static_exec(e);
		}, VA({ ATOM_$005Cr }), cont);
	}

	Operation FILE_portray_text::emit_code_1_3(Prolog* m)
	{
		// emit_code(10):-!,format('\\n')
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// emit_code(10):-['$neck_cut',format('\\n')]
		if(!int_10->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_format_1_static_exec(e);
		}, VA({ ATOM_$005Cn }), cont);
	}

	Operation FILE_portray_text::emit_code_1_4(Prolog* m)
	{
		// emit_code(9):-!,format('\\t')
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// emit_code(9):-['$neck_cut',format('\\t')]
		if(!int_9->unify(a1, m->trail))
		{
			return m->fail();
		}
		//START inline expansion of $neck_cut
		m->neckCut();
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_format_1_static_exec(e);
		}, VA({ ATOM_$005Ct }), cont);
	}

	Operation FILE_portray_text::emit_code_1_5(Prolog* m)
	{
		// emit_code(A):-put_code(A)
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// emit_code(A):-[put_code(A)]
		return Op([&] (Prolog* e)
		{
		PRED_put_code_1_static_exec(e);
		}, VA({ a1 }), cont);
	}

SxxMachine::SymbolTerm* const  FILE_portray_text::PRED_all_ascii_1_s1 = SYM("[]");

	Operation FILE_portray_text::PRED_all_ascii_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_portray_text::all_ascii_1_var, FILE_portray_text::all_ascii_1_1, FILE_portray_text::all_ascii_1_1, FILE_portray_text::all_ascii_1_con, FILE_portray_text::all_ascii_1_1, FILE_portray_text::all_ascii_1_lis);
	}

	Operation FILE_portray_text::all_ascii_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::all_ascii_1_var_1);
		return all_ascii_1_1(m);
	}

	Operation FILE_portray_text::all_ascii_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::all_ascii_1_var_2);
		return all_ascii_1_2(m);
	}

	Operation FILE_portray_text::all_ascii_1_var_2(Prolog* m)
	{
		m->trust(nullptr);
		return all_ascii_1_3(m);
	}

	Operation FILE_portray_text::all_ascii_1_con(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::all_ascii_1_con_1);
		return all_ascii_1_1(m);
	}

	Operation FILE_portray_text::all_ascii_1_con_1(Prolog* m)
	{
		m->trust(nullptr);
		return all_ascii_1_2(m);
	}

	Operation FILE_portray_text::all_ascii_1_lis(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::all_ascii_1_lis_1);
		return all_ascii_1_1(m);
	}

	Operation FILE_portray_text::all_ascii_1_lis_1(Prolog* m)
	{
		m->trust(nullptr);
		return all_ascii_1_3(m);
	}

	Operation FILE_portray_text::all_ascii_1_1(Prolog* m)
	{
		// all_ascii(A):-var_or_numbered(A),!
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// all_ascii(A):-['$get_level'(B),var_or_numbered(A),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_var_or_numbered_1_static_exec(e);
		}, VA({ a1 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a2 }), cont));
	}

	Operation FILE_portray_text::all_ascii_1_2(Prolog* m)
	{
		// all_ascii([]):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// all_ascii([]):-[]
		if(!PRED_all_ascii_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_portray_text::all_ascii_1_3(Prolog* m)
	{
		// all_ascii([A|B]):-isascii(A),all_ascii(B)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// all_ascii([A|B]):-[isascii(A),all_ascii(B)]
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
		return Op([&] (Prolog* e)
		{
		PRED_isascii_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_all_ascii_1_static_exec(e);
	}, VA({ a3 }), cont));
	}

	Operation FILE_portray_text::PRED_isascii_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// isascii(A):-integer(A),ascii_code(A),!
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// isascii(A):-['$get_level'(B),integer(A),ascii_code(A),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
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
		return Op([&] (Prolog* e)
		{
		PRED_ascii_code_1_static_exec(e);
		}, VA({ a1 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a2 }), cont));
	}

SxxMachine::IntegerTerm* const  FILE_portray_text::PRED_ascii_code_1_s1 = optional<int>(9);
SxxMachine::IntegerTerm* const  FILE_portray_text::int_32 = optional<int>(32);
SxxMachine::IntegerTerm* const  FILE_portray_text::int_126 = optional<int>(126);

	Operation FILE_portray_text::PRED_ascii_code_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_portray_text::ascii_code_1_var, FILE_portray_text::ascii_code_1_var, FILE_portray_text::ascii_code_1_4, FILE_portray_text::ascii_code_1_4, FILE_portray_text::ascii_code_1_4, FILE_portray_text::ascii_code_1_4);
	}

	Operation FILE_portray_text::ascii_code_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::ascii_code_1_var_1);
		return ascii_code_1_1(m);
	}

	Operation FILE_portray_text::ascii_code_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::ascii_code_1_var_2);
		return ascii_code_1_2(m);
	}

	Operation FILE_portray_text::ascii_code_1_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_portray_text::ascii_code_1_var_3);
		return ascii_code_1_3(m);
	}

	Operation FILE_portray_text::ascii_code_1_var_3(Prolog* m)
	{
		m->trust(nullptr);
		return ascii_code_1_4(m);
	}

	Operation FILE_portray_text::ascii_code_1_1(Prolog* m)
	{
		// ascii_code(9):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// ascii_code(9):-[]
		if(!PRED_ascii_code_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_portray_text::ascii_code_1_2(Prolog* m)
	{
		// ascii_code(10):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// ascii_code(10):-[]
		if(!int_10->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_portray_text::ascii_code_1_3(Prolog* m)
	{
		// ascii_code(13):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// ascii_code(13):-[]
		if(!int_13->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_portray_text::ascii_code_1_4(Prolog* m)
	{
		// ascii_code(A):-between(32,126,A)
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// ascii_code(A):-[between(32,126,A)]
		return Op([&] (Prolog* e)
		{
		PRED_between_3_static_exec(e);
		}, VA({ int_32, int_126, a1 }), cont);
	}

	Operation FILE_portray_text::PRED_var_or_numbered_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_portray_text::var_or_numbered_1_var, FILE_portray_text::var_or_numbered_1_1, FILE_portray_text::var_or_numbered_1_1, FILE_portray_text::var_or_numbered_1_1, FILE_portray_text::var_or_numbered_1_var, FILE_portray_text::var_or_numbered_1_1);
	}

	Operation FILE_portray_text::var_or_numbered_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_portray_text::var_or_numbered_1_var_1);
		return var_or_numbered_1_1(m);
	}

	Operation FILE_portray_text::var_or_numbered_1_var_1(Prolog* m)
	{
		m->trust(nullptr);
		return var_or_numbered_1_2(m);
	}

	Operation FILE_portray_text::var_or_numbered_1_1(Prolog* m)
	{
		// var_or_numbered(A):-var(A),!
		Term* a1,* a2;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// var_or_numbered(A):-['$get_level'(B),var(A),'$cut'(B)]
		a2 = V(m);
		//START inline expansion of $get_level(a(2))
		if(!a2->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(2))
		a2 = a2->dref();
		m->cut(a2->intValue());
		//END inline expansion
		return cont;
	}

	Operation FILE_portray_text::var_or_numbered_1_2(Prolog* m)
	{
		// var_or_numbered('$VAR'(A)):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// var_or_numbered('$VAR'(A)):-[]
		a1 = a1->dref();
		if(!a1->unify(C("$VAR", V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s7 = S("do_portray_text", SxxMachine::Prolog::True);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s9 = S(":-", PRED_$init_0_s7, SxxMachine::Prolog::True);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s11 = S(":", ATOM_portray_text, PRED_$init_0_s9);
SxxMachine::IntegerTerm* const  FILE_portray_text::int_3 = optional<int>(3);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s16 = S("portray_text_option", ATOM_min_length, int_3);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s18 = S(":-", PRED_$init_0_s16, SxxMachine::Prolog::True);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s20 = S(":", ATOM_portray_text, PRED_$init_0_s18);
SxxMachine::IntegerTerm* const  FILE_portray_text::int_30 = optional<int>(30);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s24 = S("portray_text_option", ATOM_ellipsis, int_30);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s26 = S(":-", PRED_$init_0_s24, SxxMachine::Prolog::True);
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s28 = S(":", ATOM_portray_text, PRED_$init_0_s26);
SxxMachine::SymbolTerm* const  FILE_portray_text::ATOM_portray = SYM("portray");
SxxMachine::StructureTerm* const  FILE_portray_text::PRED_$init_0_s33 = S("/", ATOM_portray, int_1);

	Operation FILE_portray_text::PRED_$init_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		// '$init':-assertz((do_portray_text(true):-true)),assertz((portray_text_option(min_length,3):-true)),assertz((portray_text_option(ellipsis,30):-true)),'$new_indexing_hash'(portray_text,portray/1,A)
		m->setB0();
		// '$init':-[assertz(portray_text:(do_portray_text(true):-true)),assertz(portray_text:(portray_text_option(min_length,3):-true)),assertz(portray_text:(portray_text_option(ellipsis,30):-true)),'$new_indexing_hash'(portray_text,portray/1,A)]
		return Op([&] (Prolog* e)
		{
		FILE_builtins::PRED_assertz_1_static_exec(e);
		}, VA({ PRED_$init_0_s11 }), Op([&] (Prolog* e)
		{
		FILE_builtins::PRED_assertz_1_static_exec(e);
	}, VA({ PRED_$init_0_s20 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_assertz_1_static_exec(e);
	}, VA({ PRED_$init_0_s28 }), Op([&] (Prolog* e)
	{
		FILE_builtins::PRED_$new_indexing_hash_3_static_exec(e);
	}, VA({ ATOM_portray_text, PRED_$init_0_s33, V(m) }), cont))));
	}

	FILE_portray_text::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_portray_text::StaticConstructor FILE_portray_text::staticConstructor;

	void FILE_portray_text::loadPreds()
	{
		PredTable::registerBuiltin("portray_text", 1, FILE_portray_text::PRED_portray_text_1_static_exec);
		PredTable::registerBuiltin("set_portray_text", 2, FILE_portray_text::PRED_set_portray_text_2_static_exec);
		PredTable::registerBuiltin("$dummy_0_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl", "$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl", 6, FILE_portray_text::PRED_$dummy_0_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_6_static_exec);
		PredTable::registerBuiltin("$dummy_1_/opt/logicmoo_workspace/taupl/SxxMachine/prolog/library/portray_text.pl", "$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl", 2, FILE_portray_text::PRED_$dummy_1_$002Fopt$002Flogicmoo_workspace$002Ftaupl$002FSxxMachine$002Fprolog$002Flibrary$002Fportray_text$002Epl_2_static_exec);
		PredTable::registerBuiltin(":", "$003A", 2, FILE_portray_text::PRED_$003A_2_static_exec);
		PredTable::registerBuiltin("put_n_codes", 2, FILE_portray_text::PRED_put_n_codes_2_static_exec);
		PredTable::registerBuiltin("skip_first", 3, FILE_portray_text::PRED_skip_first_3_static_exec);
		PredTable::registerBuiltin("put_var_codes", 1, FILE_portray_text::PRED_put_var_codes_1_static_exec);
		PredTable::registerBuiltin("emit_code", 1, FILE_portray_text::PRED_emit_code_1_static_exec);
		PredTable::registerBuiltin("all_ascii", 1, FILE_portray_text::PRED_all_ascii_1_static_exec);
		PredTable::registerBuiltin("isascii", 1, FILE_portray_text::PRED_isascii_1_static_exec);
		PredTable::registerBuiltin("ascii_code", 1, FILE_portray_text::PRED_ascii_code_1_static_exec);
		PredTable::registerBuiltin("var_or_numbered", 1, FILE_portray_text::PRED_var_or_numbered_1_static_exec);
		PredTable::registerBuiltin("$init", 0, FILE_portray_text::PRED_$init_0_static_exec);
	}
}
