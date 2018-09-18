using namespace std;

#include "FILE_io.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/IntegerTerm.h"
#include "../../machine/SxxMachine/Arithmetic.h"
#include "../../machine/SxxMachine/PredTable.h"

namespace SxxMachine
{
//	import static SxxMachine.FILE_builtins.PRED_hash_map_2_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_illarg_3_static_exec;
//	import static SxxMachine.FILE_builtins.PRED_java_1_static_exec;
//	import static SxxMachine.Failure.fail_0;
//	import static SxxMachine.bootpreds.PRED_$builtin_member_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_$cut_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_$get_stream_manager_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_close_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_current_input_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_current_output_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_flush_output_1_static_exec;
//	import static SxxMachine.bootpreds.PRED_get_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_get_byte_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_get_char_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_get_code_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_hash_get_3_static_exec;
//	import static SxxMachine.bootpreds.PRED_open_4_static_exec;
//	import static SxxMachine.bootpreds.PRED_peek_byte_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_peek_char_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_peek_code_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_put_byte_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_put_char_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_put_code_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_skip_2_static_exec;
//	import static SxxMachine.bootpreds.PRED_tab_2_static_exec;
SymbolTerm* const  FILE_io::PRED_open_3_s1 = SYM("[]");

	Operation FILE_io::PRED_open_3_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// open(A,B,C):-open(A,B,C,[])
		m->setB0();
		Term* a1,* a2,* a3;
		a1 = LARG[0];
		a2 = LARG[1];
		a3 = LARG[2];
		// open(A,B,C):-[open(A,B,C,[])]
		return Op([&] (Prolog* e)
		{
		PRED_open_4_static_exec(e);
		}, VA({ a1, a2, a3, PRED_open_3_s1 }), cont);
	}

SymbolTerm* const  FILE_io::PRED_close_1_s1 = SYM("[]");

	Operation FILE_io::PRED_close_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// close(A):-close(A,[])
		m->setB0();
		Term* a1;
		a1 = LARG[0];
		// close(A):-[close(A,[])]
		return Op([&] (Prolog* e)
		{
		PRED_close_2_static_exec(e);
		}, VA({ a1, PRED_close_1_s1 }), cont);
	}

	Operation FILE_io::PRED_flush_output_0_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		// flush_output:-current_output(A),flush_output(A)
		m->setB0();
		Term* a1;
		// flush_output:-[current_output(A),flush_output(A)]
		a1 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_output_1_static_exec(e);
		}, VA({ a1 }), Op([&] (Prolog* e)
		{
		PRED_flush_output_1_static_exec(e);
	}, VA({ a1 }), cont));
	}

SymbolTerm* const  FILE_io::ATOM_term = SYM("term");
SymbolTerm* const  FILE_io::ATOM_stream_property = SYM("stream_property");
StructureTerm* const  FILE_io::PRED_stream_property_2_s5 = S("domain", ATOM_term, ATOM_stream_property);
IntegerTerm* const  FILE_io::int_2 = optional<int>(2);

	Operation FILE_io::PRED_stream_property_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_io::stream_property_2_sub_1);
		return stream_property_2_1(m);
	}

	Operation FILE_io::stream_property_2_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_io::stream_property_2_sub_2);
		return stream_property_2_2(m);
	}

	Operation FILE_io::stream_property_2_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return stream_property_2_3(m);
	}

	Operation FILE_io::stream_property_2_1(Prolog* m)
	{
		// stream_property(A,B):-var(B),!,'$stream_property'(A,B)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// stream_property(A,B):-['$get_level'(C),var(B),'$cut'(C),'$stream_property'(A,B)]
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
		return Op([&] (Prolog* e)
		{
		PRED_$stream_property_2_static_exec(e);
		}, VA({ a1, a2 }), cont);
	}

	Operation FILE_io::stream_property_2_2(Prolog* m)
	{
		// stream_property(A,B):-'$stream_property_specifier'(B),!,'$stream_property'(A,B)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// stream_property(A,B):-['$get_level'(C),'$stream_property_specifier'(B),'$cut'(C),'$stream_property'(A,B)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_$stream_property_specifier_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_$cut_1_static_exec(e);
	}, VA({ a3 }), Op([&] (Prolog* e)
	{
		PRED_$stream_property_2_static_exec(e);
	}, VA({ a1, a2 }), cont)));
	}

	Operation FILE_io::stream_property_2_3(Prolog* m)
	{
		// stream_property(A,B):-illarg(domain(term,stream_property),stream_property(A,B),2)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// stream_property(A,B):-[illarg(domain(term,stream_property),stream_property(A,B),2)]
		std::vector<Term*> y1 = VA({ a1, a2 });
		a3 = S("stream_property", y1);
		return Op([&] (Prolog* e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({ PRED_stream_property_2_s5, a3, int_2 }), cont);
	}

SymbolTerm* const  FILE_io::ATOM_stream = SYM("stream");
StructureTerm* const  FILE_io::PRED_$stream_property_2_s5 = S("domain", ATOM_stream, ATOM_stream);
IntegerTerm* const  FILE_io::int_1 = optional<int>(1);

	Operation FILE_io::PRED_$stream_property_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		m->jtry2(nullptr, FILE_io::$stream_property_2_sub_1);
		return $stream_property_2_1(m);
	}

	Operation FILE_io::$stream_property_2_sub_1(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_2_sub_2);
		return $stream_property_2_2(m);
	}

	Operation FILE_io::$stream_property_2_sub_2(Prolog* m)
	{
		m->trust(nullptr);
		return $stream_property_2_3(m);
	}

	Operation FILE_io::$stream_property_2_1(Prolog* m)
	{
		// '$stream_property'(A,B):-var(A),!,'$get_stream_manager'(C),hash_map(C,D),'$builtin_member'((A,E),D),java(A),'$builtin_member'(B,E)
		Term* a1,* a2,* a3,* a4,* a5,* a6,* a7;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$stream_property'(A,B):-['$get_level'(C),var(A),'$cut'(C),'$get_stream_manager'(D),hash_map(D,E),'$builtin_member'((A,F),E),java(A),'$builtin_member'(B,F)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
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
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
		m->cut(a3->intValue());
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		a6 = V(m);
		std::vector<Term*> y1 = VA({ a1, a6 });
		a7 = S(",", y1);
		return Op([&] (Prolog* e)
		{
		PRED_$get_stream_manager_1_static_exec(e);
		}, VA({ a4 }), Op([&] (Prolog* e)
		{
		PRED_hash_map_2_static_exec(e);
	}, VA({ a4, a5 }), Op([&] (Prolog* e)
	{
		PRED_$builtin_member_2_static_exec(e);
	}, VA({ a7, a5 }), Op([&] (Prolog* e)
	{
		PRED_java_1_static_exec(e);
	}, VA({ a1 }), Op([&] (Prolog* e)
	{
		PRED_$builtin_member_2_static_exec(e);
	}, VA({ a2, a6 }), cont)))));
	}

	Operation FILE_io::$stream_property_2_2(Prolog* m)
	{
		// '$stream_property'(A,B):-java(A),!,'$get_stream_manager'(C),hash_get(C,A,D),'$builtin_member'(B,D)
		Term* a1,* a2,* a3,* a4,* a5;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$stream_property'(A,B):-['$get_level'(C),java(A),'$cut'(C),'$get_stream_manager'(D),hash_get(D,A,E),'$builtin_member'(B,E)]
		a3 = V(m);
		//START inline expansion of $get_level(a(3))
		if(!a3->unifyInt(m->B0, m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of java(a(1))
		a1 = a1->dref();
		if(!(a1->isFFIObject()))
		{
			return m->fail();
		}
		//END inline expansion
		//START inline expansion of $cut(a(3))
		a3 = a3->dref();
		m->cut(a3->intValue());
		//END inline expansion
		a4 = V(m);
		a5 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_$get_stream_manager_1_static_exec(e);
		}, VA({ a4 }), Op([&] (Prolog* e)
		{
		PRED_hash_get_3_static_exec(e);
	}, VA({ a4, a1, a5 }), Op([&] (Prolog* e)
	{
		PRED_$builtin_member_2_static_exec(e);
	}, VA({ a2, a5 }), cont)));
	}

	Operation FILE_io::$stream_property_2_3(Prolog* m)
	{
		// '$stream_property'(A,B):-illarg(domain(stream,stream),stream_property(A,B),1)
		Term* a1,* a2,* a3;
		Operation cont;
		a1 = m->AREGS[0];
		a2 = m->AREGS[1];
		cont = m->cont;
		// '$stream_property'(A,B):-[illarg(domain(stream,stream),stream_property(A,B),1)]
		std::vector<Term*> y1 = VA({ a1, a2 });
		a3 = S("stream_property", y1);
		return Op([&] (Prolog* e)
		{
		PRED_illarg_3_static_exec(e);
		}, VA({ PRED_$stream_property_2_s5, a3, int_1 }), cont);
	}

SymbolTerm* const  FILE_io::PRED_$stream_property_specifier_1_s1 = SYM("input");
SymbolTerm* const  FILE_io::ATOM_output = SYM("output");

	Operation FILE_io::PRED_$stream_property_specifier_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		m->cont = cont;
		m->setB0();
		return m->switch_on_term(FILE_io::$stream_property_specifier_1_var, fail_0, fail_0, FILE_io::$stream_property_specifier_1_con, FILE_io::$stream_property_specifier_1_str, fail_0);
	}

	Operation FILE_io::$stream_property_specifier_1_var(Prolog* m)
	{
		m->jtry1(nullptr, FILE_io::$stream_property_specifier_1_var_1);
		return $stream_property_specifier_1_1(m);
	}

	Operation FILE_io::$stream_property_specifier_1_var_1(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_specifier_1_var_2);
		return $stream_property_specifier_1_2(m);
	}

	Operation FILE_io::$stream_property_specifier_1_var_2(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_specifier_1_var_3);
		return $stream_property_specifier_1_3(m);
	}

	Operation FILE_io::$stream_property_specifier_1_var_3(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_specifier_1_var_4);
		return $stream_property_specifier_1_4(m);
	}

	Operation FILE_io::$stream_property_specifier_1_var_4(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_specifier_1_var_5);
		return $stream_property_specifier_1_5(m);
	}

	Operation FILE_io::$stream_property_specifier_1_var_5(Prolog* m)
	{
		m->trust(nullptr);
		return $stream_property_specifier_1_6(m);
	}

	Operation FILE_io::$stream_property_specifier_1_con(Prolog* m)
	{
		m->jtry1(nullptr, FILE_io::$stream_property_specifier_1_con_1);
		return $stream_property_specifier_1_1(m);
	}

	Operation FILE_io::$stream_property_specifier_1_con_1(Prolog* m)
	{
		m->trust(nullptr);
		return $stream_property_specifier_1_2(m);
	}

	Operation FILE_io::$stream_property_specifier_1_str(Prolog* m)
	{
		m->jtry1(nullptr, FILE_io::$stream_property_specifier_1_str_1);
		return $stream_property_specifier_1_3(m);
	}

	Operation FILE_io::$stream_property_specifier_1_str_1(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_specifier_1_str_2);
		return $stream_property_specifier_1_4(m);
	}

	Operation FILE_io::$stream_property_specifier_1_str_2(Prolog* m)
	{
		m->retry(nullptr, FILE_io::$stream_property_specifier_1_str_3);
		return $stream_property_specifier_1_5(m);
	}

	Operation FILE_io::$stream_property_specifier_1_str_3(Prolog* m)
	{
		m->trust(nullptr);
		return $stream_property_specifier_1_6(m);
	}

	Operation FILE_io::$stream_property_specifier_1_1(Prolog* m)
	{
		// '$stream_property_specifier'(input):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$stream_property_specifier'(input):-[]
		if(!PRED_$stream_property_specifier_1_s1->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_io::$stream_property_specifier_1_2(Prolog* m)
	{
		// '$stream_property_specifier'(output):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$stream_property_specifier'(output):-[]
		if(!ATOM_output->unify(a1, m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_io::$stream_property_specifier_1_3(Prolog* m)
	{
		// '$stream_property_specifier'(alias(A)):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$stream_property_specifier'(alias(A)):-[]
		a1 = a1->dref();
		if(!a1->unify(C("alias", V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_io::$stream_property_specifier_1_4(Prolog* m)
	{
		// '$stream_property_specifier'((mode A)):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$stream_property_specifier'((mode A)):-[]
		a1 = a1->dref();
		if(!a1->unify(C("mode", V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_io::$stream_property_specifier_1_5(Prolog* m)
	{
		// '$stream_property_specifier'(type(A)):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$stream_property_specifier'(type(A)):-[]
		a1 = a1->dref();
		if(!a1->unify(C("type", V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_io::$stream_property_specifier_1_6(Prolog* m)
	{
		// '$stream_property_specifier'(file_name(A)):-true
		Term* a1;
		Operation cont;
		a1 = m->AREGS[0];
		cont = m->cont;
		// '$stream_property_specifier'(file_name(A)):-[]
		a1 = a1->dref();
		if(!a1->unify(C("file_name", V(m)), m->trail))
		{
			return m->fail();
		}
		return cont;
	}

	Operation FILE_io::PRED_get_char_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// get_char(A):-current_input(B),get_char(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// get_char(A):-[current_input(B),get_char(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_get_char_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_get_code_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// get_code(A):-current_input(B),get_code(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// get_code(A):-[current_input(B),get_code(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_get_code_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_peek_char_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// peek_char(A):-current_input(B),peek_char(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// peek_char(A):-[current_input(B),peek_char(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_peek_char_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_peek_code_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// peek_code(A):-current_input(B),peek_code(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// peek_code(A):-[current_input(B),peek_code(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_peek_code_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_put_char_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// put_char(A):-current_output(B),put_char(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// put_char(A):-[current_output(B),put_char(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_output_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_put_char_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_put_code_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// put_code(A):-current_output(B),put_code(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// put_code(A):-[current_output(B),put_code(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_output_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_put_code_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

SymbolTerm* const  FILE_io::PRED_nl_1_s1 = SYM("\n");

	Operation FILE_io::PRED_nl_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// nl(A):-put_char(A,'\n')
		m->setB0();
		Term* a1;
		a1 = LARG[0];
		// nl(A):-[put_char(A,'\n')]
		return Op([&] (Prolog* e)
		{
		PRED_put_char_2_static_exec(e);
		}, VA({ a1, PRED_nl_1_s1 }), cont);
	}

	Operation FILE_io::PRED_get0_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// get0(A):-current_input(B),get_code(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// get0(A):-[current_input(B),get_code(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_get_code_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_get0_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// get0(A,B):-get_code(A,B)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		a2 = LARG[1];
		// get0(A,B):-[get_code(A,B)]
		return Op([&] (Prolog* e)
		{
		PRED_get_code_2_static_exec(e);
		}, VA({ a1, a2 }), cont);
	}

	Operation FILE_io::PRED_get_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// get(A):-current_input(B),get(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// get(A):-[current_input(B),get(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_get_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_put_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// put(A):-current_output(B),put(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// put(A):-[current_output(B),put(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_output_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_put_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_put_2_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// put(A,B):-C is B,put_code(A,C)
		m->setB0();
		Term* a1,* a2,* a3;
		a1 = LARG[0];
		a2 = LARG[1];
		// put(A,B):-[C is B,put_code(A,C)]
		a3 = V(m);
		//START inline expansion of a(3)is a(2)
		if(!a3->unify(Arithmetic::evaluate(a2), m->trail))
		{
			return m->fail();
		}
		//END inline expansion
		return Op([&] (Prolog* e)
		{
		PRED_put_code_2_static_exec(e);
		}, VA({ a1, a3 }), cont);
	}

	Operation FILE_io::PRED_tab_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// tab(A):-current_output(B),tab(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// tab(A):-[current_output(B),tab(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_output_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_tab_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_skip_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// skip(A):-current_input(B),skip(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// skip(A):-[current_input(B),skip(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_skip_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_get_byte_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// get_byte(A):-current_input(B),get_byte(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// get_byte(A):-[current_input(B),get_byte(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_get_byte_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_peek_byte_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// peek_byte(A):-current_input(B),peek_byte(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// peek_byte(A):-[current_input(B),peek_byte(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_input_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_peek_byte_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	Operation FILE_io::PRED_put_byte_1_static_exec(Prolog* m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		// put_byte(A):-current_output(B),put_byte(B,A)
		m->setB0();
		Term* a1,* a2;
		a1 = LARG[0];
		// put_byte(A):-[current_output(B),put_byte(B,A)]
		a2 = V(m);
		return Op([&] (Prolog* e)
		{
		PRED_current_output_1_static_exec(e);
		}, VA({ a2 }), Op([&] (Prolog* e)
		{
		PRED_put_byte_2_static_exec(e);
	}, VA({ a2, a1 }), cont));
	}

	FILE_io::StaticConstructor::StaticConstructor()
	{
	loadPreds();
	}

FILE_io::StaticConstructor FILE_io::staticConstructor;

	void FILE_io::loadPreds()
	{
		PredTable::registerBuiltin("open", 3, FILE_io::PRED_open_3_static_exec);
		PredTable::registerBuiltin("close", 1, FILE_io::PRED_close_1_static_exec);
		PredTable::registerBuiltin("flush_output", 0, FILE_io::PRED_flush_output_0_static_exec);
		PredTable::registerBuiltin("stream_property", 2, FILE_io::PRED_stream_property_2_static_exec);
		PredTable::registerBuiltin("$stream_property", 2, FILE_io::PRED_$stream_property_2_static_exec);
		PredTable::registerBuiltin("$stream_property_specifier", 1, FILE_io::PRED_$stream_property_specifier_1_static_exec);
		PredTable::registerBuiltin("get_char", 1, FILE_io::PRED_get_char_1_static_exec);
		PredTable::registerBuiltin("get_code", 1, FILE_io::PRED_get_code_1_static_exec);
		PredTable::registerBuiltin("peek_char", 1, FILE_io::PRED_peek_char_1_static_exec);
		PredTable::registerBuiltin("peek_code", 1, FILE_io::PRED_peek_code_1_static_exec);
		PredTable::registerBuiltin("put_char", 1, FILE_io::PRED_put_char_1_static_exec);
		PredTable::registerBuiltin("put_code", 1, FILE_io::PRED_put_code_1_static_exec);
		PredTable::registerBuiltin("nl", 1, FILE_io::PRED_nl_1_static_exec);
		PredTable::registerBuiltin("get0", 1, FILE_io::PRED_get0_1_static_exec);
		PredTable::registerBuiltin("get0", 2, FILE_io::PRED_get0_2_static_exec);
		PredTable::registerBuiltin("get", 1, FILE_io::PRED_get_1_static_exec);
		PredTable::registerBuiltin("put", 1, FILE_io::PRED_put_1_static_exec);
		PredTable::registerBuiltin("put", 2, FILE_io::PRED_put_2_static_exec);
		PredTable::registerBuiltin("tab", 1, FILE_io::PRED_tab_1_static_exec);
		PredTable::registerBuiltin("skip", 1, FILE_io::PRED_skip_1_static_exec);
		PredTable::registerBuiltin("get_byte", 1, FILE_io::PRED_get_byte_1_static_exec);
		PredTable::registerBuiltin("peek_byte", 1, FILE_io::PRED_peek_byte_1_static_exec);
		PredTable::registerBuiltin("put_byte", 1, FILE_io::PRED_put_byte_1_static_exec);
	}
}
