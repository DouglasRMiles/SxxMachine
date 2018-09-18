#pragma once

#include "../../handcoded/SxxMachine/bootpreds.h"
#include <vector>

//JAVA TO C++ CONVERTER NOTE: Forward class declarations:
namespace SxxMachine
{
	class Operation;
	class Prolog;
	class IntegerTerm;
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
	class FILE_nreverse : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: nreverse/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
		// main(nreverse/0,public)
			static IntegerTerm *const int_26;
			static IntegerTerm *const int_27;
			static IntegerTerm *const int_28;
			static IntegerTerm *const int_29;
			static IntegerTerm *const int_30;
	private:
		static ListTerm *const L_nreverse_0_s32;
		static ListTerm *const L_nreverse_0_s33;
		static ListTerm *const L_nreverse_0_s34;
		static ListTerm *const L_nreverse_0_s35;
		static ListTerm *const L_nreverse_0_s36;
		static ListTerm *const L_nreverse_0_s37;
		static ListTerm *const L_nreverse_0_s38;
		static ListTerm *const L_nreverse_0_s39;
		static ListTerm *const L_nreverse_0_s40;
		static ListTerm *const L_nreverse_0_s41;
		static ListTerm *const L_nreverse_0_s42;
		static ListTerm *const L_nreverse_0_s43;
		static ListTerm *const L_nreverse_0_s44;
		static ListTerm *const L_nreverse_0_s45;
		static ListTerm *const L_nreverse_0_s46;
		static ListTerm *const L_nreverse_0_s47;
		static ListTerm *const L_nreverse_0_s48;
		static ListTerm *const L_nreverse_0_s49;
		static ListTerm *const L_nreverse_0_s50;
		static ListTerm *const L_nreverse_0_s51;
		static ListTerm *const L_nreverse_0_s52;
		static ListTerm *const L_nreverse_0_s53;
		static ListTerm *const L_nreverse_0_s54;
		static ListTerm *const L_nreverse_0_s55;
		static ListTerm *const L_nreverse_0_s56;
		static ListTerm *const L_nreverse_0_s57;
		static ListTerm *const L_nreverse_0_s58;
		static ListTerm *const L_nreverse_0_s59;
		static ListTerm *const L_nreverse_0_s60;
		static ListTerm *const L_nreverse_0_s61;




	public:
		static Operation PRED_nreverse_0_static_exec(Prolog *m);
	/** PREDICATE: nreverse/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
		// main(nreverse/2,public)




		static Operation PRED_nreverse_2_static_exec(Prolog *m);

	private:
		static Operation nreverse_2_top(Prolog *m);

		static Operation nreverse_2_var(Prolog *m);

		static Operation nreverse_2_var_1(Prolog *m);

		static Operation nreverse_2_1(Prolog *m);

		static Operation nreverse_2_2(Prolog *m);
	/** PREDICATE: concatenate/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/nreverse.pl
	*/
		// main(concatenate/3,public)




	public:
		static Operation PRED_concatenate_3_static_exec(Prolog *m);

	private:
		static Operation concatenate_3_top(Prolog *m);

		static Operation concatenate_3_var(Prolog *m);

		static Operation concatenate_3_var_1(Prolog *m);

		static Operation concatenate_3_1(Prolog *m);

		static Operation concatenate_3_2(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_nreverse::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
