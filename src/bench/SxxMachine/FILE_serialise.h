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
	class SymbolTerm;
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
	class FILE_serialise : public bootpreds
	{
	/** PREDICATE: top/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(top/0,public)




	public:
		static Operation PRED_top_0_static_exec(Prolog *m);
	/** PREDICATE: serialise/0
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(serialise/0,public)
			static IntegerTerm *const int_65;
			static IntegerTerm *const int_66;
			static IntegerTerm *const int_76;
			static IntegerTerm *const int_69;
			static IntegerTerm *const int_32;
			static IntegerTerm *const int_87;
			static IntegerTerm *const int_83;
			static IntegerTerm *const int_73;
			static IntegerTerm *const int_82;
	private:
		static ListTerm *const L_serialise_0_s11;
		static ListTerm *const L_serialise_0_s12;
		static ListTerm *const L_serialise_0_s13;
		static ListTerm *const L_serialise_0_s14;
		static ListTerm *const L_serialise_0_s15;
		static ListTerm *const L_serialise_0_s16;
		static ListTerm *const L_serialise_0_s17;
		static ListTerm *const L_serialise_0_s18;
		static ListTerm *const L_serialise_0_s19;
		static ListTerm *const L_serialise_0_s20;
		static ListTerm *const L_serialise_0_s21;
		static ListTerm *const L_serialise_0_s22;
		static ListTerm *const L_serialise_0_s23;
		static ListTerm *const L_serialise_0_s24;
		static ListTerm *const L_serialise_0_s25;
		static ListTerm *const L_serialise_0_s26;
		static ListTerm *const L_serialise_0_s27;
		static ListTerm *const L_serialise_0_s28;
		static ListTerm *const L_serialise_0_s29;
		static ListTerm *const L_serialise_0_s30;
		static ListTerm *const L_serialise_0_s31;
		static ListTerm *const L_serialise_0_s32;
		static ListTerm *const L_serialise_0_s33;
		static ListTerm *const L_serialise_0_s34;
		static ListTerm *const L_serialise_0_s35;




	public:
		static Operation PRED_serialise_0_static_exec(Prolog *m);
	/** PREDICATE: serialise/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(serialise/2,public)




		static Operation PRED_serialise_2_static_exec(Prolog *m);
	/** PREDICATE: pairlists/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(pairlists/3,public)
			static SymbolTerm *const FUNCTOR_pair_2;




		static Operation PRED_pairlists_3_static_exec(Prolog *m);

	private:
		static Operation pairlists_3_top(Prolog *m);

		static Operation pairlists_3_var(Prolog *m);

		static Operation pairlists_3_var_1(Prolog *m);

		static Operation pairlists_3_1(Prolog *m);

		static Operation pairlists_3_2(Prolog *m);
	/** PREDICATE: arrange/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(arrange/2,public)
		public:
			static SymbolTerm *const FUNCTOR_tree_3;
			static SymbolTerm *const ATOM_void;




		static Operation PRED_arrange_2_static_exec(Prolog *m);

	private:
		static Operation arrange_2_var(Prolog *m);

		static Operation arrange_2_var_1(Prolog *m);

		static Operation arrange_2_1(Prolog *m);

		static Operation arrange_2_2(Prolog *m);
	/** PREDICATE: split/4
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(split/4,public)




	public:
		static Operation PRED_split_4_static_exec(Prolog *m);

	private:
		static Operation split_4_top(Prolog *m);

		static Operation split_4_var(Prolog *m);

		static Operation split_4_var_1(Prolog *m);

		static Operation split_4_var_2(Prolog *m);

		static Operation split_4_var_3(Prolog *m);

		static Operation split_4_lis(Prolog *m);

		static Operation split_4_lis_1(Prolog *m);

		static Operation split_4_lis_2(Prolog *m);

		static Operation split_4_1(Prolog *m);

		static Operation split_4_2(Prolog *m);

		static Operation split_4_3(Prolog *m);

		static Operation split_4_4(Prolog *m);
	/** PREDICATE: before/2
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(before/2,public)




	public:
		static Operation PRED_before_2_static_exec(Prolog *m);
	/** PREDICATE: numbered/3
	from: /opt/logicmoo_workspace/taupl/SxxMachine/prolog/bench/serialise.pl
	*/
		// main(numbered/3,public)
			static SymbolTerm *const FUNCTOR_$002B_2;




		static Operation PRED_numbered_3_static_exec(Prolog *m);

	private:
		static Operation numbered_3_top(Prolog *m);

		static Operation numbered_3_var(Prolog *m);

		static Operation numbered_3_var_1(Prolog *m);

		static Operation numbered_3_1(Prolog *m);

		static Operation numbered_3_2(Prolog *m);
	private:
		class StaticConstructor
		{
		public:
			StaticConstructor();
		};

	private:
		static FILE_serialise::StaticConstructor staticConstructor;

public:
	static void loadPreds();
	};

}
