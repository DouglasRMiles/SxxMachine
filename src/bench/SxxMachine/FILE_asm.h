#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class SymbolTerm;
	class StructureTerm;
	class ListTerm;
}

namespace SxxMachine
{

	using namespace SxxMachine;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.bootpreds.LEVELS;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_builtins.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_cafeteria.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_io.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_swi_supp.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.FILE_system.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.sxxtensions.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Failure.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Predicate.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Prolog.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.Success.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.SymbolTerm.*;
//JAVA TO C++ CONVERTER TODO TASK: The Java 'import static' statement cannot be converted to C++:
//	import static SxxMachine.TermData.*;
	class FILE_asm : public bootpreds
	{
	/** PREDICATE: determinate/1
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/asm.pl
	*/
		// main(determinate/1,public)




	public:
		static Operation PRED_determinate_1_static_exec(Prolog *m);
	/** PREDICATE: setup_determinates/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/asm.pl
	*/
		// main(setup_determinates/0,public)
			static SymbolTerm *const FUNCTOR_$002F_2;
			static SymbolTerm *const ATOM_cmp_error;
	private:
		static StructureTerm *const L_setup_determinates_0_s5;
		public:
			static SymbolTerm *const ATOM_name;
	private:
		static StructureTerm *const L_setup_determinates_0_s9;
		public:
			static SymbolTerm *const ATOM_length;
	private:
		static StructureTerm *const L_setup_determinates_0_s12;
		public:
			static SymbolTerm *const ATOM_asm_hash_value;
	private:
		static StructureTerm *const L_setup_determinates_0_s15;
		static ListTerm *const L_setup_determinates_0_s17;
		static ListTerm *const L_setup_determinates_0_s18;
		static ListTerm *const L_setup_determinates_0_s19;
		static ListTerm *const L_setup_determinates_0_s20;




	public:
		static Operation PRED_setup_determinates_0_static_exec(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_asm::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
