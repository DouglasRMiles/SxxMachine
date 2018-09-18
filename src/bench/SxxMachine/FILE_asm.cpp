using namespace std;

#include "FILE_asm.h"
#include "../../machine/SxxMachine/Operation.h"
#include "../../machine/SxxMachine/Prolog.h"
#include "../../machine/SxxMachine/Term.h"
#include "../../machine/SxxMachine/SymbolTerm.h"
#include "../../machine/SxxMachine/StructureTerm.h"
#include "../../machine/SxxMachine/ListTerm.h"
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

	Operation FILE_asm::PRED_determinate_1_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// determinate(A):-true
		m->setB0();
		 Term *a1;
		a1 = LARG[0];
	// determinate(A):-[]
		return cont;
	}

SymbolTerm *const FILE_asm::FUNCTOR_$002F_2 = F("/",2);
SymbolTerm *const FILE_asm::ATOM_cmp_error = SYM("cmp_error");
StructureTerm *const FILE_asm::L_setup_determinates_0_s5 = S(FUNCTOR_$002F_2, ATOM_cmp_error, int_1);
SymbolTerm *const FILE_asm::ATOM_name = SYM("name");
StructureTerm *const FILE_asm::L_setup_determinates_0_s9 = S(FUNCTOR_$002F_2, ATOM_name, int_2);
SymbolTerm *const FILE_asm::ATOM_length = SYM("length");
StructureTerm *const FILE_asm::L_setup_determinates_0_s12 = S(FUNCTOR_$002F_2, ATOM_length, int_2);
SymbolTerm *const FILE_asm::ATOM_asm_hash_value = SYM("asm_hash_value");
StructureTerm *const FILE_asm::L_setup_determinates_0_s15 = S(FUNCTOR_$002F_2, ATOM_asm_hash_value, int_2);
ListTerm *const FILE_asm::L_setup_determinates_0_s17 = CONS(L_setup_determinates_0_s15, Prolog::Nil);
ListTerm *const FILE_asm::L_setup_determinates_0_s18 = CONS(L_setup_determinates_0_s12, L_setup_determinates_0_s17);
ListTerm *const FILE_asm::L_setup_determinates_0_s19 = CONS(L_setup_determinates_0_s9, L_setup_determinates_0_s18);
ListTerm *const FILE_asm::L_setup_determinates_0_s20 = CONS(L_setup_determinates_0_s5, L_setup_determinates_0_s19);

	Operation FILE_asm::PRED_setup_determinates_0_static_exec(Prolog *m)
	{
		Operation cont = m->cont;
		std::vector<Term*> LARG = m->AREGS;
		Operation thiz = m->pred;
	// setup_determinates:-determinate([cmp_error/1,name/2,length/2,asm_hash_value/2])
		m->setB0();
	// setup_determinates:-[determinate([cmp_error/1,name/2,length/2,asm_hash_value/2])]
		return Op([&] (e)
		{
		PRED_determinate_1_static_exec(e);
		}, VA({L_setup_determinates_0_s20}), cont);
	}

	FILE_asm::StaticConstructor::StaticConstructor()
	{
	FILE_builtins::loadPreds();
	}

FILE_asm::StaticConstructor FILE_asm::staticConstructor;

	void FILE_asm::loadPreds()
	{
	   PredTable::registerBuiltin("determinate",1,FILE_asm::PRED_determinate_1_static_exec);
	   PredTable::registerBuiltin("setup_determinates",0,FILE_asm::PRED_setup_determinates_0_static_exec);
	}
}
